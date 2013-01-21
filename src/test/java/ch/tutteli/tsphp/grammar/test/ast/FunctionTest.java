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
                        "(function declaration void setName (parameters (parameter declaration string $name)) block)"
                    },
                    {
                        "function void setName(string $name){int $a=1;}",
                        "(function declaration void setName (parameters (parameter declaration string $name)) "
                            + "(block (variable declaration int $a 1)))"
                            
                    },
                    {
                        "function void setName(string $firstname,string $lastname){int $a=1;}",
                        "(function declaration void setName (parameters "
                            + "(parameter declaration string $firstname) (parameter declaration string $lastname)"
                            + ") (block (variable declaration int $a 1)))"
                    },
                    {
                        "function string getName(){return \"Robert\";}",
                        "(function declaration string getName parameters (block (return \"Robert\")))"
                    },
                    {
                        "function void foo(string $a, string $b='hallo'){$a=$b;}",
                        "(function declaration void foo (parameters "
                            + "(parameter declaration string $a) (parameter declaration string $b 'hallo')"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, int $i, int $b=+1){$a=$b;}",
                       "(function declaration void foo (parameters "
                            + "(parameter declaration string $a) "
                            + "(parameter declaration int $i) "
                            + "(parameter declaration int $b (unary plus 1))"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, int $i, int $b=-10, float $d=2.0){$a=$b;}",
                        "(function declaration void foo (parameters "
                            + "(parameter declaration string $a) "
                            + "(parameter declaration int $i) "
                            + "(parameter declaration int $b (unary minus 10)) "
                            + "(parameter declaration float $d 2.0)"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, string $b=E_ALL){$a=$b;}",
                        "(function declaration void foo (parameters "
                            + "(parameter declaration string $a) (parameter declaration string $b E_ALL)"
                        + ") (block (= $a $b)))"
                    },
                    {
                        "function void foo(string $a, boolean $a=true, object $d=null){$a=$b;}",
                         "(function declaration void foo (parameters "
                            + "(parameter declaration string $a) "
                            + "(parameter declaration bool $a true) "
                            + "(parameter declaration object $d null)"
                        + ") (block (= $a $b)))"
                    } 
                });
    }
}
