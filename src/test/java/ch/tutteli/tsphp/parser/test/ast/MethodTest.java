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

import ch.tutteli.tsphp.parser.test.utils.AAstTest;
import ch.tutteli.tsphp.parser.test.utils.ParameterListHelper;
import ch.tutteli.tsphp.parser.test.utils.TypeHelper;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(TypeHelper.getAllTypesInclModifier(
                "function ", " get(){}",
                "(mDecl (mMod public) ", " get params block)"));

        //normal
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", "){}",
                "(mDecl (mMod public) (type tMod void) set ", " block)"));

        collection.add(new Object[]{
                    "function void set(){$a=1;}",
                    "(mDecl (mMod public) (type tMod void) set params (block (= $a 1)))"
                });

        //mMods
        collection.addAll(getVariations(""));
        collection.addAll(getVariations(" static"));
        collection.addAll(getVariations(" final"));
        collection.addAll(getVariations(" static final"));
        collection.addAll(getVariations(" final static"));
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "abstract function void foo();",
                        "(mDecl (mMod public abstract) (type tMod void) foo params)"
                    },
                    {
                        "abstract protected function void foo();",
                        "(mDecl (mMod protected abstract) (type tMod void) foo params)"
                    },
                    {
                        "abstract public function void foo();",
                        "(mDecl (mMod public abstract) (type tMod void) foo params)"
                    }
                }));

        return collection;
    }

    public static Collection<Object[]> getVariations(String modifier) {
        return Arrays.asList(new Object[][]{
                    {
                        modifier + " function void foo(){}",
                        "(mDecl (mMod public" + modifier + ") (type tMod void) foo params block)"
                    },
                    {
                        modifier + " private function void foo(){}",
                        "(mDecl (mMod private" + modifier + ") (type tMod void) foo params block)"
                    },
                    {
                        modifier + " protected function void foo(){}",
                        "(mDecl (mMod protected" + modifier + ") (type tMod void) foo params block)"
                    },
                    {
                        modifier + " public function void foo(){}",
                        "(mDecl (mMod public" + modifier + ") (type tMod void) foo params block)"
                    }
                });
    }
}
