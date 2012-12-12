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

import ch.tutteli.tsphp.grammar.utils.AParserExceptionTest;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class VariableDeclarationParserErrorTest extends AParserExceptionTest
{

    @Test
    public void testTypeMissing() throws RecognitionException {
        testString = "$a;";
        token = TSPHPParser.VARID;
        position = 0;
        exceptionType = EarlyExitException.class;
        super.parseExpectingException();
    }

    @Test
    public void testMissingSemicolon() throws RecognitionException {
        testString = "int $a int $b;";
        token = TSPHPParser.T_INT;
        position = 0;
        exceptionType = NoViableAltException.class;
        super.parseExpectingException();
    }

    @Test
    public void testWrongSemicolon() throws RecognitionException {
        testString = "int $a 1";
        token = TSPHPParser.T_INT;
        position = 0;
        exceptionType = NoViableAltException.class;
        super.parseExpectingException();
    }

    @Test
    public void testMissingSemicolonEndOfFile() throws RecognitionException {
        testString = "int $a";
        token = TSPHPParser.T_INT;
        position = 0;
        exceptionType = NoViableAltException.class;
        super.parseExpectingException();
    }
}
