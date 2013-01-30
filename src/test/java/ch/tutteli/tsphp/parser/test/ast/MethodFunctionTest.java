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
public class MethodFunctionTest extends AAstTest
{

    public MethodFunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }
    
    @Override
    protected void run() throws RecognitionException {
        result = parser.compilationUnit();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "class a {  function void getName(){ $a=1; } }  function void getName(){ $a=1; }",
                        "(namespace default (namespaceBody "
                            + "(class classModifier a extends implements (classBody "
                                + "(methodDeclaration modifier public void getName parameters (block (= $a 1)))"
                            + ")) "
                            + "(function void getName parameters (block (= $a 1)))"
                        + "))"
                    },
                    {
                        "/** this is my lovely function */ \n function void foo(int $a=true,int $b=2,cast int $c=3){}",
                        "(namespace default (namespaceBody (function void foo (parameters "
                            + "(parameterDeclaration (type typeModifier int) ($a true)) "
                            + "(parameterDeclaration (type typeModifier int) ($b 2)) "
                            + "(parameterDeclaration (type (typeModifier cast) int) ($c 3))"
                        + ") block)))"
                     }
                });
    }
}
