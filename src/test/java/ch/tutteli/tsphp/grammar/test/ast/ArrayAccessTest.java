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
import ch.tutteli.tsphp.grammar.test.utils.ExpressionHelper;
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
                        "(variableDeclaration int ($d "
                            + "(arrayAccess (arrayAccess (methodCall (methodCall (arrayAccess "
                                + "(methodCall $a foo parameters)"
                            + " 0) foo (parameters 'hallo')) bar parameters) 2) 3)"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3];",
                        "(variableDeclaration int ($d "
                            + "(arrayAccess (arrayAccess (methodCall (methodCall (arrayAccess "
                                + "(functionCall (type foo) parameters)"
                            + " 0) foo (parameters 'hallo')) bar parameters) 2) 3)"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3]->fo()[2][3+1];",
                        "(variableDeclaration int ($d "
                            + "(arrayAccess (arrayAccess (methodCall "
                                + "(arrayAccess (arrayAccess (methodCall (methodCall (arrayAccess "
                                    + "(functionCall (type foo) parameters)"
                                + " 0) foo (parameters 'hallo')) bar parameters) 2) 3)"
                            + " fo parameters) 2) (+ 3 1))"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->a->foo('hallo')[0][$a]->bar()[2]->foo()[3][5]->foo();",
                        "(variableDeclaration int ($d "
                            + "(methodCall (arrayAccess (arrayAccess (methodCall "
                                + "(arrayAccess (methodCall "
                                    + "(arrayAccess (arrayAccess (methodCall (memberAccess (arrayAccess "
                                        + "(functionCall (type foo) parameters)"
                                + " 0) a) foo (parameters 'hallo')) 0) $a)"
                                + " bar parameters) 2)"
                            + " foo parameters) 3) 5) foo parameters)"
                        + "))"
                            
                    },
                    {
                        "int $d = $a->a[0]->b[0][1]->foo()->bar()[2]->foo()[3][5]->foo();",
                         "(variableDeclaration int ($d "
                            +"(methodCall (arrayAccess (arrayAccess (methodCall "
                                + "(arrayAccess (methodCall (methodCall (arrayAccess (arrayAccess (memberAccess "
                                    + "(arrayAccess (memberAccess $a a) 0)"
                                + " b) 0) 1) foo parameters) bar parameters) 2)"
                            + " foo parameters) 3) 5) foo parameters)"
                        + "))"
                    }
                }));
        String[][] expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "];",
                        "(variableDeclaration array ($d (arrayAccess $a " + expression[1] + ")))"
                    });
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess $a " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess "
                                + "(functionCall (type foo) parameters)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = $a->foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess "
                                + "(methodCall $a foo parameters)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = self::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess "
                                + "(methodCall self foo parameters)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                     });
            collection.add(new Object[]{
                        "array $d = parent::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess "
                                + "(methodCall parent foo parameters)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = Foo::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(variableDeclaration array ($d "
                            + "(arrayAccess (arrayAccess "
                                + "(methodCall (type Foo) foo parameters)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });

        }
        return collection;
    }
}
