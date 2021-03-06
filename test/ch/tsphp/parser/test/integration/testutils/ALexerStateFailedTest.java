/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import ch.tsphp.parser.antlr.TSPHPLexer;
import org.antlr.runtime.RecognizerSharedState;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class ALexerStateFailedTest extends ALexerTest
{

    public ALexerStateFailedTest(String methodName, String testString) {
        this(methodName, testString, 0);
    }

    public ALexerStateFailedTest(String methodName, String testString, int type) {
        this(methodName, testString, type, TSPHPLexer.DEFAULT_TOKEN_CHANNEL);
    }

    public ALexerStateFailedTest(String methodName, String testString, int type, int channel) {
        super(methodName, testString, type, channel);
    }

    public void checkForStateFailed() {

        try {
            super.analyseToken();
            RecognizerSharedState state = lexer.getState();
            Assert.assertTrue(methodName + " - " + testString + " failed, state.failed was not true and it should be true - see output", state.failed);
        } catch (Exception ex) {
            System.err.printf(methodName + " - " + testString + " failed");
            ex.printStackTrace();
            Assert.fail(methodName + " - " + testString + " failed, an unexpected exception occurred - see output");
        }
    }

    @Override
    protected void modifyLexer() {
        lexer.setBacktrackingLevel(1);
    }
}
