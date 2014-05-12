/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@Ignore
public abstract class AParserBacktrackingTest extends AParserTest
{

    protected int startTokenType;
    protected int stopTokenType;

    public AParserBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString);
        startTokenType = theStartTokenType;
        stopTokenType = theStopTokenType;
    }

    @Override
    protected void modifyParser() {
        parser.setBacktracking(1);
    }

    public void parseAndCheckResultIsOnlyBacktracking() throws RecognitionException {
        parseAndCheckForException();
        assertNull(testString + " - tree was not null", result.getTree());
        assertEquals(testString + " - start token type was different ", startTokenType, result.start.getType());
        assertEquals(testString + " - stop token type was different ", stopTokenType, result.stop.getType());
        assertTrue(testString + " - memoize is empty ", parser.getState().ruleMemo.length > 0);
    }

}
