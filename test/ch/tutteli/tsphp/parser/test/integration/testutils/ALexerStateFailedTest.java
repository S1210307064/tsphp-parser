package ch.tutteli.tsphp.parser.test.integration.testutils;

import ch.tutteli.tsphp.parser.antlr.TSPHPLexer;
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