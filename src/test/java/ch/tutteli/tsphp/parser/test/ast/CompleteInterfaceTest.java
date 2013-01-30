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
public class CompleteInterfaceTest extends AAstTest
{

    public CompleteInterfaceTest(String testString, String expectedResult) {
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
                        "interface A extends B{\n"
                            +"const bool A=true,B=null,C=false;\n"
                            +"/*some comments \n"
                            + "*/\n"
                            +"public function __construct(int $number);\n"
                            +"// a comment\n"
                            + "function void set(int $b,cast float $c);\n"
                        + "}\n",
                        "(interface A (extends B) (interfaceBody "
                            +"(constants bool (A true) (B null) (C false)) "
                            +"(__construct (parameters (parameterDeclaration (type typeModifier int) $number))) "
                            +"(methodDeclaration void set (parameters "
                                    + "(parameterDeclaration (type typeModifier int) $b) "
                                    + "(parameterDeclaration (type (typeModifier cast) float) $c)"
                            + "))"
                        + "))"
                    },
                    
                });

    }
}
