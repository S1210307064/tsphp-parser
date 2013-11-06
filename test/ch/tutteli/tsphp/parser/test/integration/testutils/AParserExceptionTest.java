package ch.tutteli.tsphp.parser.test.integration.testutils;

import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;

@Ignore
public abstract class AParserExceptionTest extends AParserTest
{
    protected final int position;
    protected final int token;
    protected final Class<? extends RecognitionException> exceptionType;

    public AParserExceptionTest(String testString, Class<? extends RecognitionException> type, int aToken, int aPosition) {
        super(testString);
        noErrorsOnOutput();
        position = aPosition;
        token = aToken;
        exceptionType = type;
    }
}
