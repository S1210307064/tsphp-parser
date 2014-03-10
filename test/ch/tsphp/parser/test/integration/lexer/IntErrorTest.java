/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerTest;

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
