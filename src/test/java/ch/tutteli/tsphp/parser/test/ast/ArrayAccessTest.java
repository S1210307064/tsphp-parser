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
import ch.tutteli.tsphp.parser.test.utils.ExpressionHelper;
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
                        "(vars int ($d "
                            + "(arrAccess (arrAccess (mCall (mCall (arrAccess "
                                + "(mCall $a foo args)"
                            + " 0) foo (args 'hallo')) bar args) 2) 3)"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3];",
                        "(vars int ($d "
                            + "(arrAccess (arrAccess (mCall (mCall (arrAccess "
                                + "(fCall foo args)"
                            + " 0) foo (args 'hallo')) bar args) 2) 3)"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->foo('hallo')->bar()[2][3]->fo()[2][3+1];",
                        "(vars int ($d "
                            + "(arrAccess (arrAccess (mCall "
                                + "(arrAccess (arrAccess (mCall (mCall (arrAccess "
                                    + "(fCall foo args)"
                                + " 0) foo (args 'hallo')) bar args) 2) 3)"
                            + " fo args) 2) (+ 3 1))"
                        + "))"
                    },
                    {
                        "int $d = foo()[0]->a->foo('hallo')[0][$a]->bar()[2]->foo()[3][5]->foo();",
                        "(vars int ($d "
                            + "(mCall (arrAccess (arrAccess (mCall "
                                + "(arrAccess (mCall "
                                    + "(arrAccess (arrAccess (mCall (memAccess (arrAccess "
                                        + "(fCall foo args)"
                                + " 0) a) foo (args 'hallo')) 0) $a)"
                                + " bar args) 2)"
                            + " foo args) 3) 5) foo args)"
                        + "))"
                            
                    },
                    {
                        "int $d = $a->a[0]->b[0][1]->foo()->bar()[2]->foo()[3][5]->foo();",
                         "(vars int ($d "
                            +"(mCall (arrAccess (arrAccess (mCall "
                                + "(arrAccess (mCall (mCall (arrAccess (arrAccess (memAccess "
                                    + "(arrAccess (memAccess $a a) 0)"
                                + " b) 0) 1) foo args) bar args) 2)"
                            + " foo args) 3) 5) foo args)"
                        + "))"
                    }
                }));
        String[][] expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "];",
                        "(vars array ($d (arrAccess $a " + expression[1] + ")))"
                    });
            collection.add(new Object[]{
                        "array $d = $a[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess $a " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess "
                                + "(fCall foo args)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = $a->foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess "
                                + "(mCall $a foo args)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = self::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess "
                                + "(mCall self foo args)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                     });
            collection.add(new Object[]{
                        "array $d = parent::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess "
                                + "(mCall parent foo args)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });
            collection.add(new Object[]{
                        "array $d = Foo::foo()[" + expression[0] + "][" + expression[0] + "];",
                        "(vars array ($d "
                            + "(arrAccess (arrAccess "
                                + "(mCall Foo foo args)"
                            + " " + expression[1] + ") " + expression[1] + ")"
                        + "))"
                    });

        }
        return collection;
    }
}
