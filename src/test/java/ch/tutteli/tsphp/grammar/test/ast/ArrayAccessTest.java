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
public class ArrayAccessTest extends AAstTest
{

    public ArrayAccessTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "int $d = $a->foo()[0]->foo('hallo')->bar()[2][3];",
                        "(variable declaration int $d "
                            + "(array access (array access (method call (method call (array access "
                                + "(method call $a foo EXPRESSION_LIST)"
                            + " 0) foo (EXPRESSION_LIST 'hallo')) bar EXPRESSION_LIST) 2) 3)"
                        + ")"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3];",
                        "(variable declaration int $d "
                            + "(array access (array access (method call (method call (array access "
                                + "(function call (class/interface type foo) EXPRESSION_LIST)"
                            + " 0) foo (EXPRESSION_LIST 'hallo')) bar EXPRESSION_LIST) 2) 3)"
                        + ")"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3]->fo()[2][3+1];",
                        "(variable declaration int $d "
                            + "(array access (array access (method call "
                                + "(array access (array access (method call (method call (array access "
                                    + "(function call (class/interface type foo) EXPRESSION_LIST)"
                                + " 0) foo (EXPRESSION_LIST 'hallo')) bar EXPRESSION_LIST) 2) 3)"
                            + " fo EXPRESSION_LIST) 2) (+ 3 1))"
                        + ")"
                    },
                    {
                        "int $d = foo()[0]->a->foo('hallo')[0][$a]->bar()[2]->foo()[3][5]->foo();",
                        "(variable declaration int $d "
                            + "(method call (array access (array access (method call "
                                + "(array access (method call "
                                    + "(array access (array access (method call (member access (array access "
                                        + "(function call (class/interface type foo) EXPRESSION_LIST)"
                                + " 0) a) foo (EXPRESSION_LIST 'hallo')) 0) $a)"
                                + " bar EXPRESSION_LIST) 2)"
                            + " foo EXPRESSION_LIST) 3) 5) foo EXPRESSION_LIST)"
                        + ")"
                            
                    },
                    {
                        "int $d = $a->a[0]->b[0][1]->foo()->bar()[2]->foo()[3][5]->foo();",
                         "(variable declaration int $d "
                            +"(method call (array access (array access (method call "
                                + "(array access (method call (method call (array access (array access (member access "
                                    + "(array access (member access $a a) 0)"
                                + " b) 0) 1) foo EXPRESSION_LIST) bar EXPRESSION_LIST) 2)"
                            + " foo EXPRESSION_LIST) 3) 5) foo EXPRESSION_LIST)"
                        + ")"
                    }
                }));
        String[][] expressions = ExpressionTest.getExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "];",
                        "(variable declaration array $d (array access $a " + expression[1] + "))"
                    });
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access $a " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                    });
            collection.add(new Object[]{
                        "array $d = foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access "
                                + "(function call (class/interface type foo) EXPRESSION_LIST)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                    });
            collection.add(new Object[]{
                        "array $d = $a->foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access "
                                + "(method call $a foo EXPRESSION_LIST)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                    });
            collection.add(new Object[]{
                        "array $d = self::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access "
                                + "(method call Self foo EXPRESSION_LIST)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                     });
            collection.add(new Object[]{
                        "array $d = parent::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access "
                                + "(method call Parent foo EXPRESSION_LIST)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                    });
            collection.add(new Object[]{
                        "array $d = Foo::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variable declaration array $d "
                            + "(array access (array access "
                                + "(method call (class/interface type Foo) foo EXPRESSION_LIST)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + ")"
                    });

        }
        return collection;
    }
}
