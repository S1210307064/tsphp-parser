/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This class is based on the class NotCorrectStartTokenTest from the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import ch.tsphp.parser.test.integration.testutils.AParserStateFailedTest;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NotCorrectStartTokenStateFailedTest extends AParserStateFailedTest
{

    private String methodName;

    public NotCorrectStartTokenStateFailedTest(String theMethodName, String testString, int aToken, int aPosition,
            Class<? extends RecognitionException> type) {
        super(testString);
        methodName = theMethodName;
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException, NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Method method = TSPHPParser.class.getMethod(methodName);
        result = (org.antlr.runtime.ParserRuleReturnScope) method.invoke(parser);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return NotCorrectStartTokenTest.testStrings();
    }
}
