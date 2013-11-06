package ch.tutteli.tsphp.parser.test.integration.lexer;

import ch.tutteli.tsphp.parser.test.integration.testutils.ALexerTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IntErrorTest extends ALexerTest
{

    public IntErrorTest(String methodName,String testString) {
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception {
        super.checkForMismatch();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"mInt","0b2"},
                    {"mBINARY","0b2"},
                    {"mInt","0xG"},
                    {"mHEXADECIMAL","0xG"},
                    {"mOCTAL","09"},
                });
    }
}
