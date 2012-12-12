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
package ch.tutteli.tsphp.grammar;

import ch.tutteli.tsphp.grammar.utils.ALexerExceptionTest;
import ch.tutteli.tsphp.grammar.utils.AParserExceptionTest;
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
public class AssignmentWrongIntParserTest extends AParserExceptionTest
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
                    //wrong octal - FIXME - shouldn't raise an lexer error
                    //{"int $a = 0118;", ';', 12},     
                    //wrong binary
                    {"int $b = 0b012;", TSPHPParser.INT, 13},
                    {"int $b = 0b100014;", TSPHPParser.INT, 16},
                    //string
                    {"int $b = \"123\";", TSPHPParser.STRING_DOUBLE_QUOTED, 9},
                    {"int $b = '789123';", TSPHPParser.STRING_SINGLE_QUOTED, 9},
                    //float
                    {"int $b = '0.43';", TSPHPParser.STRING_SINGLE_QUOTED,9},
                    {"int $b = \".78\";", TSPHPParser.STRING_DOUBLE_QUOTED, 9},
                    {"int $b = \"1.43e8\";", TSPHPParser.STRING_DOUBLE_QUOTED, 9},
                    {"int $b = \"2.43e-3\";", TSPHPParser.STRING_DOUBLE_QUOTED, 9},
                    {"int $b = '.43e+5';", TSPHPParser.STRING_SINGLE_QUOTED, 9},
                });
    }
}
