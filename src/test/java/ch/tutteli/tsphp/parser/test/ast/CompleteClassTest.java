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
public class CompleteClassTest extends AAstTest
{

    public CompleteClassTest(String testString, String expectedResult) {
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
                        "class A extends B implements \\A{\n"
                            +"const bool A=true,B=null,C=false;\n"
                            +"private int $a,$b=1,$c=()'1';\n"
                            +"/*some comments \n"
                            + "*/\n"
                            +"public function __construct(int $number){\n"
                                +"$number!=null or exit('$number is null');\n"
                                +"$this->number = $number;\n"
                            + "}\n"
                            +"// a comment\n"
                            +"protected C $a=new C(),$b,$c=null;\n"
                            + "function void set(int $b,cast float $c){\n"
                                +"if($b==1 && $c <2){\n"
                                    +"while(true){\n"
                                        +"++$i;\n"
                                        + "if($i>=10) break;\n"
                                    + "}\n"
                                + "}\n"
                            + "}\n"
                        + "}\n",
                        "(class classModifier A (extends (typeName B)) (implements (typeName \\ A)) (classBody "
                            +"(constants bool (A true) (B null) (C false)) "
                            +"(classMember modifier private (variables int $a ($b 1) ($c (cast int '1')))) "
                            +"(__construct public (parameters (parameterDeclaration (type typeModifier int) $number))"
                                + " (block "
                                    +"(or (!= $number null) (exit '$number is null')) "
                                    +"(= (memberAccess $this number) $number)"
                                + ")"
                            + ") "
                            +"(classMember modifier protected "
                                + "(variables (typeName C) ($a (new (typeName C) parameters)) $b ($c null))) "
                            +"(method modifier public void set (parameters "
                                    + "(parameterDeclaration (type typeModifier int) $b) "
                                    + "(parameterDeclaration (type (typeModifier cast) float) $c)"
                                + ") (block "
                                    +"(if (&& (== $b 1) (< $c 2)) (block "
                                        +"(while true (block (preIncrementDecrement ++ $i) (if (>= $i 10) break)))"
                                    + "))"
                                + ")"
                            + ")"
                        + "))"
                    },
                    
                });

    }
}
