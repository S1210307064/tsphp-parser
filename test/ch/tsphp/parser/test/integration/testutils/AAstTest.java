/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class AAstTest extends AParserTest
{

    protected final String expectedResult;

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
