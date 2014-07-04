/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;

@Ignore
public abstract class AParserExceptionTest extends AParserTest
{
    protected final Class<? extends RecognitionException> exceptionType;
    protected final int token;
    protected final int position;

    public AParserExceptionTest(String testString, Class<? extends RecognitionException> type, int aToken, int aPosition) {
        super(testString);
        noErrorsOnOutput();
        exceptionType = type;
        token = aToken;
        position = aPosition;
    }
}
