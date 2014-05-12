/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@Ignore
public abstract class AParserBadMatchingTest extends AParserTest
{

    protected int numberOfMatchesBeforeFail;

    public AParserBadMatchingTest(String testString, int theNumberOfMatchesBeforeFail) {
        super(testString);
        numberOfMatchesBeforeFail = theNumberOfMatchesBeforeFail;
    }

    @Override
    protected TestTSPHPParser createTestParser(CommonTokenStream tokens) {
        return new BadMatchingTSPHPParser(tokens, numberOfMatchesBeforeFail);
    }


    @Override
    protected void modifyParser() {
        parser.setBacktracking(1);
    }

    public void parseAndCheckResultIsEmpty() throws RecognitionException {
        parseAndCheckForException();
        assertNull(testString + " - tree was not null ", result.getTree());
        assertNull(testString + " - stop was not null ", result.stop);
        BadMatchingTSPHPParser badMatchingParser = (BadMatchingTSPHPParser) parser;
        assertEquals(testString + " - match was not called enough ",
                numberOfMatchesBeforeFail + 1, badMatchingParser.getCount());
    }

}
