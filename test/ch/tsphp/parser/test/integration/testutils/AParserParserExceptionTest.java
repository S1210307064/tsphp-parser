/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class AParserParserExceptionTest extends AParserExceptionTest
{

    public AParserParserExceptionTest(String testString, Class<? extends RecognitionException> type, int character, int position) {
        super(testString, type, character, position);
    }

    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
    public void parseExpectingException() throws RecognitionException {
        parse();

        Assert.assertFalse(testString + " - lexer.exceptions is not empty ", lexer.hasFoundError());

        Assert.assertTrue(testString + " - exceptions is empty ", parser.hasFoundError());
        List<Exception> exceptions = parser.getExceptions();
        RecognitionException ex = (RecognitionException) exceptions.get(0);
        Assert.assertTrue(testString + " - wrong type", exceptionType.isInstance(ex));
        Assert.assertEquals(testString + " - token wrong", token, ex.c);
        Assert.assertEquals(testString + " - position wrong", position, ex.charPositionInLine);

    }
}
