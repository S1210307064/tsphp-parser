package ch.tutteli.tsphp.parser.test.lexer;

import ch.tutteli.tsphp.parser.test.testutils.ALexerStateFailedTest;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IntStateFailedTest extends ALexerStateFailedTest
{

    public IntStateFailedTest(String methodName,String testString) {
        //# is not valid for any token as first letter;
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception {
        super.checkForStateFailed();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return IntErrorTest.testStrings();
    }
}
