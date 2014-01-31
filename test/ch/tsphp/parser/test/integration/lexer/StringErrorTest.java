package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerTest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringErrorTest extends ALexerTest
{

    public StringErrorTest(String methodName, String testString) {
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception {
        super.checkForMismatch();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
            {"mSTRING_DOUBLE_QUOTED", "\"$a\""},
            {"mString", "\"$a\""}
        });
    }
}
