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
public class ConstructDestructTest extends AAstTest
{

    public ConstructDestructTest(String testString, String expectedResult) {
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
        collection.addAll(getVariations("__construct","","parameters "));
        collection.addAll(getVariations("__deconstruct","",""));
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "function __construct(int $a,bool $b){ $a=1;}",
                        "(__construct public (parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type typeModifier bool) $b)"
                        + ") (block (= $a 1)))"
                    },
                    {
                        "function __construct(cast int $a=1){}",
                        "(__construct public (parameters "
                        + "(parameterDeclaration (type (typeModifier cast) int) ($a 1))"
                        + ") block)"
                    },
                    {
                        "function __construct(int $a,bool? $b=2){}",
                        "(__construct public (parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type (typeModifier ?) bool) ($b 2))"
                        + ") block)"
                    }
                }));
        return collection;

    }

    private static Collection<Object[]> getVariations(String what, String parameters, String parametersExpected) {
        return Arrays.asList(new Object[][]{
                    {
                        "function " + what + "(" + parameters + "){}",
                        "(" + what + " public " + parametersExpected + "block)"
                    },
                    {
                        "private function " + what + "(" + parameters + "){}",
                        "(" + what + " private " + parametersExpected + "block)"
                    },
                    {
                        "protected function " + what + "(" + parameters + "){}",
                        "(" + what + " protected " + parametersExpected + "block)"
                    },
                    {
                        "public function " + what + "(" + parameters + "){}",
                        "(" + what + " public " + parametersExpected + "block)"
                    }
                });
    }
}
