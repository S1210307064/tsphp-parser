/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerStateFailedTest;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SimpleTokenStateFailedTest extends ALexerStateFailedTest
{

    public SimpleTokenStateFailedTest(String methodName) {
        //# is not valid for any token as first letter;
        super(methodName, "#");
    }

    @Test
    public void testTokens() throws Exception {
        super.checkForStateFailed();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return SimpleTokenErrorTest.testStrings();
    }
}
