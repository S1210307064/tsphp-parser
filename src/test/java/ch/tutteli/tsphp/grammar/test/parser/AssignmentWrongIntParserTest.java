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

import ch.tutteli.tsphp.grammar.TSPHPParser;
import ch.tutteli.tsphp.grammar.test.utils.AParserParserExceptionTest;
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
public class AssignmentWrongIntParserTest extends AParserParserExceptionTest
{

    public AssignmentWrongIntParserTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //wrong octal
                    {"int $a = 0o1;", TSPHPParser.NamespaceId, 10},
                    {"int $a = 0O1;", TSPHPParser.NamespaceId, 10},
                    {"int $a = o1;", TSPHPParser.NamespaceId, 9},
                    {"int $a = O1;", TSPHPParser.NamespaceId, 9},
                    //wrong hex
                    {"int $a = xA;", TSPHPParser.NamespaceId, 9},
                    {"int $a = XF;", TSPHPParser.NamespaceId, 9},
                    //wrong binary
                    {"int $b = b1;", TSPHPParser.NamespaceId, 9},
                    {"int $b = b0;", TSPHPParser.NamespaceId, 9},
                    {"int $b = 0b012;", TSPHPParser.Int, 13},
                    {"int $b = 0b100014;", TSPHPParser.Int, 16},
                    //string
                    {"int $b = \"123\";", TSPHPParser.String, 9},
                    {"int $b = '789123';", TSPHPParser.String, 9},
                    //float
                    {"int $b = '0.43';", TSPHPParser.String,9},
                    {"int $b = \".78\";", TSPHPParser.String, 9},
                    {"int $b = \"1.43e8\";", TSPHPParser.String, 9},
                    {"int $b = \"2.43e-3\";", TSPHPParser.String, 9},
                    {"int $b = '.43e+5';", TSPHPParser.String, 9},
                });
    }
}
