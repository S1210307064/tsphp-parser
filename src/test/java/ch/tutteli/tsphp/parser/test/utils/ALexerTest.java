/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.parser.test.utils;

import ch.tutteli.tsphp.parser.ANTLRNoCaseStringStream;
import ch.tutteli.tsphp.parser.TSPHPLexer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import junit.framework.Assert;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@Ignore
public abstract class ALexerTest extends ATest
{

    protected TestTSPHPLexer lexer;
    protected String methodName;
    protected int type;
    protected int channel;

    //used for fragments
    public ALexerTest(String methodName, String testString) {
        this(methodName, testString, 0);
    }

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
            Assert.fail(methodName + " - " + testString + " failed, an exception occured - see output");
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
            Assert.fail(methodName + " - " + testString + " failed, no exception occured");
        } catch (RecognitionException ex) {
            //that's fine, we expect a RecognitionException
        } catch (InvocationTargetException ex) {
            //should contain a RecognitionException - the IncovatinoTargetException occurs due to the method call using 
            //reflection
            if (!(ex.getTargetException() instanceof RecognitionException)) {
                System.err.printf(methodName + " - " + testString + " failed");
                ex.printStackTrace();
                Assert.fail(methodName + " - " + testString + " failed, an unexpected exception occured - see output");
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
