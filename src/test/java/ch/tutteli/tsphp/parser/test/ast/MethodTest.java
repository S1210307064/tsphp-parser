/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.ParameterListHelper;
import ch.tutteli.tsphp.parser.test.testutils.TypeHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class MethodTest extends AAstTest
{

    private static List<Object[]> collection;

    public MethodTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();

        getModifiers();

        //return values
        collection.addAll(TypeHelper.getAllTypesInclModifier(
                "function ", " get(){}",
                "(mDecl (mMod public) ", " get params block)", ""));

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", "){}",
                "(mDecl (mMod public) (type tMod void) set ", " block)"));
        collection.addAll(ParameterListHelper.getTestStrings(
                "abstract function void set(", ");",
                "(mDecl (mMod abstract public) (type tMod void) set ", " block)"));

        //method block
        collection.add(new Object[]{
                    "function void set(){$a=1;}",
                    "(mDecl (mMod public) (type tMod void) set params (block (= $a 1)))"
                });


        return collection;
    }

    private static void getModifiers() {

        String[][] variations = new String[][]{
            {"", "public"},
            //
            {"private", "private"},
            {"private static", "private static"},
            {"private final", "private final"},
            {"private static final", "private static final"},
            {"private final static", "private final static"},
            //
            {"protected", "protected"},
            {"protected static", "protected static"},
            {"protected final", "protected final"},
            {"protected static final", "protected static final"},
            {"protected final static", "protected final static"},
            //
            {"public", "public"},
            {"public static", "public static"},
            {"public final", "public final"},
            {"public static final", "public static final"},
            {"public final static", "public final static"},
            //
            {"static", "static public"},
            {"static private", "static private"},
            {"static private final", "static private final"},
            {"static protected", "static protected"},
            {"static protected final", "static protected final"},
            {"static public", "static public"},
            {"static public final", "static public final"},
            {"static final", "static final public"},
            {"static final private", "static final private"},
            {"static final protected", "static final protected"},
            {"static final public", "static final public"},
            //
            {"final", "final public"},
            {"final static", "final static public"},
            {"final private", "final private"},
            {"final private static", "final private static"},
            {"final protected", "final protected"},
            {"final protected static", "final protected static"},
            {"final public", "final public"},
            {"final public static", "final public static"},
            {"final static private", "final static private"},
            {"final static protected", "final static protected"},
            {"final static public", "final static public"},};

        for (String[] variation : variations) {
            collection.add(new Object[]{
                        variation[0] + " function void foo(){}",
                        "(mDecl (mMod " + variation[1] + ") (type tMod void) foo params block)"
                    });
        }

        variations = new String[][]{
            {"abstract", "abstract public"},
            {"abstract protected", "abstract protected"},
            {"abstract public", "abstract public"},
            {"protected abstract", "protected abstract"},
            {"public abstract", "public abstract"}
        };
        for (String[] variation : variations) {
            collection.add(new Object[]{
                        variation[0] + " function void foo();",
                        "(mDecl (mMod " + variation[1] + ") (type tMod void) foo params block)"
                    });
        }
    }
}
