package ch.tsphp.parser.test.integration.testutils;

import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class AAstTokenTest extends AParserTest
{

    protected final List<Integer> expectedTokens;

    public AAstTokenTest(String testString, List<Integer> theExpectedTokens) {
        super(testString);
        expectedTokens = theExpectedTokens;
    }

    public void compareAst() throws RecognitionException {
        parseAndCheckForException();
        Assert.assertEquals(testString + " failed.", expectedTokens,
                AstHelper.getTokenTypes((CommonTree) result.getTree()));
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.statement();
    }
}
