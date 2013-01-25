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
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class FunctionTest extends AAstTest
{

    public FunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "function void setName(string $name){}",
                        "(functionDeclaration void setName (parameters (parameterDeclaration string $name)) block)"
                    },
                    {
                        "function void setName(string $name){int $a=1;}",
                        "(functionDeclaration void setName (parameters (parameterDeclaration string $name)) "
                            + "(block (variableDeclaration int $a 1)))"
                            
                    },
                    {
                        "function void setName(string $firstname,string $lastname){int $a=1;}",
                        "(functionDeclaration void setName (parameters "
                            + "(parameterDeclaration string $firstname) (parameterDeclaration string $lastname)"
                            + ") (block (variableDeclaration int $a 1)))"
                    },
                    {
                        "function string getName(){return \"Robert\";}",
                        "(functionDeclaration string getName parameters (block (return \"Robert\")))"
                    },
                    {
                        "function void foo(string $a, string $b='hallo'){$a=$b;}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a) (parameterDeclaration string $b 'hallo')"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, int $i, int $b=+1){$a=$b;}",
                       "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a) "
                            + "(parameterDeclaration int $i) "
                            + "(parameterDeclaration int $b (unaryPlus 1))"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, int $i, int $b=-10, float $d=2.0){$a=$b;}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a) "
                            + "(parameterDeclaration int $i) "
                            + "(parameterDeclaration int $b (unaryMinus 10)) "
                            + "(parameterDeclaration float $d 2.0)"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, string $b=E_ALL){$a=$b;}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a) (parameterDeclaration string $b E_ALL)"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, bool $a=true, object $d=null){$a=$b;}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a) "
                            + "(parameterDeclaration bool $a true) "
                            + "(parameterDeclaration object $d null)"
                        + ") (block (= $a $b)))"
                    } ,
                    {
                        "function void foo(string $a=null, bool $a, object $d=true){$a=$b;}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration string $a null) "
                            + "(parameterDeclaration bool $a) "
                            + "(parameterDeclaration object $d true)"
                        + ") (block (= $a $b)))"
                    }, 
                    {
                        "function void foo(cast int $a, bool $a, cast object $d){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (int cast) $a) "
                            + "(parameterDeclaration bool $a) "
                            + "(parameterDeclaration (object cast) $d)"
                        + ") block)"
                    } 
                });
    }
}
