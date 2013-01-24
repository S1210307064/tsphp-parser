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
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class VariableDeclarationWhitespaceTest extends AParserTest
{

    public VariableDeclarationWhitespaceTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"int$a;"}, //testNoWhitespace
                    {"int$a=0;"}, //testNoWhiteSpaceAssignment
                    {"int      $a;"}, //testWhitespaceAfterType
                    {"float \t \t $a;"}, //testTabAfterType
                    {"bool \n \r \n $a;"}, //testNewLineAfterType
                    {"bool \n \r \t   \n \t \t\t  \r\n\n $a;"}, //testAllAfterType

                    {"int $a    ;"}, //testWhitespaceAfterID
                    {"float $a\t \t ;"}, //testTabAfterID
                    {"bool$a \n \r \n ;"}, //testNewLineAfterID
                    {"bool$a \n \r \t   \n \t \t\t  \r\n\n ;"}, //testAllAfterID

                    {"int $a =      1;"}, //testWhitespaceAfterEqual
                    {"float $a = \t \t 1.012;"}, //testTabAfterEqual
                    {"bool $a =  \n \r \n true;"}, //testNewLineAfterEqual
                    {"bool $a = \n \r \t   \n \t \t\t  \r\n\n false;"}, //testAllAfterEqual

                    {" \n \r \t   \n \t  int  \n \r \t   \n \t \t\t  \r\n\n $a \n \r \t   \n \t \t\t  \r\n\n =   \n \r \t\t 1;"
                            + " string \n\n\r $b \n\n\r\t = 'test' \n \r\t; "} // testEverythingMultipleVars
                });
    }
}
