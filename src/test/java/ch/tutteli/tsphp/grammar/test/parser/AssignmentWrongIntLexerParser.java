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

import ch.tutteli.tsphp.grammar.test.utils.AParserLexerExceptionTest;
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
public class AssignmentWrongIntLexerParser extends AParserLexerExceptionTest
{

    public AssignmentWrongIntLexerParser(String testString, int character, int position) {
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
                    {"int $a = 08;", ';', 11},
                    {"int $a = 0118;", (int) '8', 12},     
                    {"int $a = 0o1;", (int) 'o', 10},
                    {"int $a = 0O1;", (int) 'O', 10},
                    //wrong hex
                    {"int $a = 0xG;", (int) 'G', 11},
                    {"int $a = 0XH;", (int) 'H', 11},
                    //wrong binary
                    {"int $b = 0b2;", (int) '2', 11},
                });
    }
}
