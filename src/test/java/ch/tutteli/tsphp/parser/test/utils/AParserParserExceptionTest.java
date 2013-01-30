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
package ch.tutteli.tsphp.parser.test.utils;

import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@Ignore
public abstract class AParserParserExceptionTest extends AParserExceptionTest
{

    public AParserParserExceptionTest() {
    }

    public AParserParserExceptionTest(String testString, Class<? extends RecognitionException> type, int character, int position) {
        super(testString, type, character, position);
    }

    public void parseExpectingException() throws RecognitionException {
        parse();

        Assert.assertTrue(testString + " - lexer.exceptions is not empty ", lexer.getExceptions().isEmpty());

        List<Exception> exceptions = parser.getExceptions();;
        Assert.assertFalse(testString + " - exceptions is empty ", exceptions.isEmpty());
        RecognitionException ex = (RecognitionException) exceptions.get(0);
        Assert.assertTrue(testString + " - wrong type", exceptionType.isInstance(ex));
        Assert.assertEquals(testString + " - token wrong", token, ex.c);
        Assert.assertEquals(testString + " - position wrong", position, ex.charPositionInLine);

    }
}
