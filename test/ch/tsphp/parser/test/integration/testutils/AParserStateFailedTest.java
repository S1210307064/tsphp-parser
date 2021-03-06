/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.junit.Ignore;

import static org.junit.Assert.assertTrue;

@Ignore
public abstract class AParserStateFailedTest extends AParserTest
{


    public AParserStateFailedTest(String testString) {
        super(testString);
    }

    @Override
    public void modifyParser() {
        parser.setBacktracking(1);
    }

    public void parseAndCheckStateFailed() throws Exception {
        parseAndCheckForExceptions();
        assertTrue(testString + " - state.failed was false ", parser.getState().failed);
    }

}
