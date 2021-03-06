/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerTest;
import ch.tsphp.parser.test.integration.testutils.IdentifierHelper;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TokenExceptionTest extends ALexerTest
{

    public TokenExceptionTest(String methodName, String testString) {
        //# is not valid for any token as first letter;
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception {
        try {
            isErrorReportingOn = false;
            analyseToken();
            Assert.fail(methodName + " - " + testString + " failed, no exception occurred");
        } catch (InvocationTargetException ex) {
            if (!(ex.getTargetException() instanceof RecognitionException)) {
                System.err.printf(methodName + " - " + testString + " failed");
                ex.printStackTrace();
                Assert.fail(methodName + " - " + testString + " failed, an unexpected exception occurred - see output");
            }
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
            {"mBool","t#"},
            {"mBool","f#"},
            {"mIdentifier", IdentifierHelper.asciiToString('A' - 1)},
            {"mIdentifier",IdentifierHelper.asciiToString('Z'+1)},
            {"mIdentifier",IdentifierHelper.asciiToString('a'-1)},
            {"mIdentifier",IdentifierHelper.asciiToString('z'+1)},
            {"mIdentifier",IdentifierHelper.asciiToString('_'-1)},
            {"mIdentifier",IdentifierHelper.asciiToString('_'+1)},
            {"mIdentifier",IdentifierHelper.asciiToString(126)},
            {"mIdentifier",IdentifierHelper.asciiToString(256)},          
            {"mVariableId","$"+IdentifierHelper.asciiToString('A'-1)},
        });
    }
}
