/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ParameterListHelper;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MethodTest extends AAstTest
{

    private static List<Object[]> collection;

    public MethodTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();

        addModifiersInclReturnType();

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", "){}",
                "(mDecl (mMod public) (type tMod void) set() ", " block)"));
        collection.addAll(ParameterListHelper.getTestStrings(
                "abstract function void set(", ");",
                "(mDecl (mMod abstract public) (type tMod void) set() ", " block)"));

        //method block
        collection.add(new Object[]{
                "function void set(){$a=1;}",
                "(mDecl (mMod public) (type tMod void) set() params (block (expr (= $a 1))))"
        });


        return collection;
    }

    private static void addModifiersInclReturnType() {

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
                {"final static public", "final static public"}
        };

        for (String[] variation : variations) {
            collection.add(new Object[]{
                    variation[0] + " function void foo(){}",
                    "(mDecl (mMod " + variation[1] + ") (type tMod void) foo() params block)"
            });
            collection.addAll(TypeHelper.getAllTypesWithModifier(
                    variation[0] + " function ", " get(){}",
                    "(mDecl (mMod " + variation[1] + ") ", " get() params block)", ""));
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
                    "(mDecl (mMod " + variation[1] + ") (type tMod void) foo() params block)"
            });
            collection.addAll(TypeHelper.getAllTypesWithModifier(
                    variation[0] + " function ", " get();",
                    "(mDecl (mMod " + variation[1] + ") ", " get() params block)", ""));
        }
    }
}
