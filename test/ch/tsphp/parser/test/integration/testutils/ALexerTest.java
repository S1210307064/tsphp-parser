/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import ch.tsphp.parser.antlr.TSPHPLexer;
import ch.tsphp.parser.common.ANTLRNoCaseStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.junit.Assert;
import org.junit.Ignore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Ignore
public abstract class ALexerTest extends ATest
{

    protected TestTSPHPLexer lexer;
    protected final String methodName;
    protected final int type;
    protected final int channel;

    public ALexerTest(String methodName, String testString, int type) {
        this(methodName, testString, type, TSPHPLexer.DEFAULT_TOKEN_CHANNEL);
    }

    public ALexerTest(String aMethodName, String testString, int aType, int aChannel) {
        super(testString);
        methodName = aMethodName;
        type = aType;
        channel = aChannel;
    }

    public void analyseAndCheckForError() {
        try {
            analyseToken();
        } catch (Exception ex) {
            System.err.printf(methodName + " - " + testString + " failed");
            ex.printStackTrace();
            Assert.fail(methodName + " - " + testString + " failed, an exception occurred - see output");
        }
        RecognizerSharedState state = lexer.getState();
        Assert.assertFalse(methodName + " - " + testString + " failed, state.failed was true - see output",
                state.failed);
        Assert.assertEquals(methodName + " - " + testString + " failed, state.type was wrong - see output",
                type, state.type);
        Assert.assertEquals(methodName + " - " + testString + " failed, state.channel was wrong - see output",
                channel, state.channel);
        Assert.assertEquals(methodName + " - " + testString + " failed, testString was more than one token",
                TSPHPLexer.EOF, lexer.nextToken().getType());
    }

    public void checkForMismatch() throws Exception {
        try {
            isErrorReportingOn = false;
            analyseToken();
            Assert.fail(methodName + " - " + testString + " failed, no exception occurred");
        } catch (RecognitionException ex) {
            //that's fine, we expect a RecognitionException
        } catch (InvocationTargetException ex) {
            //should contain a RecognitionException - the InvocationTargetException occurs due to the method call using
            //reflection
            if (!(ex.getTargetException() instanceof RecognitionException)) {
                System.err.printf(methodName + " - " + testString + " failed");
                ex.printStackTrace();
                Assert.fail(methodName + " - " + testString + " failed, an unexpected exception occurred - see output");
            }
        }
    }

    protected void modifyLexer() {
    }

    protected void analyseToken() throws Exception {
        CharStream stream = new ANTLRNoCaseStringStream(testString);
        lexer = new TestTSPHPLexer(stream);
        lexer.setErrorReporting(isErrorReportingOn);

        modifyLexer();

        Method method = lexer.getClass().getMethod(methodName);
        method.invoke(lexer);

    }
}
