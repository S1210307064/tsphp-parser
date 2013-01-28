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
package ch.tutteli.tsphp.grammar.test.ast;

import ch.tutteli.tsphp.grammar.test.utils.AAstTest;
import ch.tutteli.tsphp.grammar.test.utils.ParameterListHelper;
import ch.tutteli.tsphp.grammar.test.utils.TypeHelper;
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
        List<String[]> types = TypeHelper.getAllTypes();
        for (String[] type : types) {
            collection.add(new Object[]{
                        "function " + type[0] + " get(){}",
                        "(method modifier public " + type[1] + " get parameters block)"
                    });
        }
        //normal
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", "){}",
                "(method modifier public void set ", " block)"));

        collection.addAll(ParameterListHelper.getVariationsForOptional(
                "function void foo(", "){$a=1;}", "(method modifier public void foo ", " (block (= $a 1)))"));

        //modifiers
        collection.addAll(getVariations("", "modifier"));
        collection.addAll(getVariations("static", "(modifier static)"));
        collection.addAll(getVariations("final", "(modifier final)"));
        collection.addAll(getVariations("static final", "(modifier static final)"));
        collection.addAll(getVariations("final static", "(modifier final static)"));
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "abstract function void foo();",
                        "(method (modifier abstract) public void foo parameters)"
                    },
                    {
                        "abstract protected function void foo();",
                        "(method (modifier abstract) protected void foo parameters)"
                    },
                    {
                        "abstract public function void foo();",
                        "(method (modifier abstract) public void foo parameters)"
                    }
                }));

        return collection;
    }

    public static Collection<Object[]> getVariations(String modifier, String modifierExpected) {
        return Arrays.asList(new Object[][]{
                    {
                        modifier + " function void foo(){}",
                        "(method " + modifierExpected + " public void foo parameters block)"
                    },
                    {
                        modifier + " private function void foo(){}",
                        "(method " + modifierExpected + " private void foo parameters block)"
                    },
                    {
                        modifier + " protected function void foo(){}",
                        "(method " + modifierExpected + " protected void foo parameters block)"
                    },
                    {
                        modifier + " public function void foo(){}",
                        "(method " + modifierExpected + " public void foo parameters block)"
                    }
                });
    }
}
