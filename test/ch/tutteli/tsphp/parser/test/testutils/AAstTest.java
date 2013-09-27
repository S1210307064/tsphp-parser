package ch.tutteli.tsphp.parser.test.testutils;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class AAstTest extends AParserTest
{

    protected String expectedResult;

    public AAstTest(String testString, String theExpectedResult) {
        super(testString);
        expectedResult = theExpectedResult;
    }

    public void compareAst() throws RecognitionException {
        parseAndCheckForException();
        CommonTree tree = (CommonTree) result.getTree();
        if (tree != null) {
            Assert.assertEquals(testString + " failed.", expectedResult, tree.toStringTree());
        } else {
            Assert.assertNull(expectedResult);
        }
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.statement();
    }
}
