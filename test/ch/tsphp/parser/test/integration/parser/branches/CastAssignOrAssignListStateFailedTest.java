/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.common.TSPHPAst;
import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserStateFailedTest;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class CastAssignOrAssignListStateFailedTest extends AParserStateFailedTest
{
    @SuppressWarnings("UnusedParameters")
    public CastAssignOrAssignListStateFailedTest(String testString, int character, int position) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.castAssignOrAssignList(new TSPHPAst(new CommonToken(TSPHPParser.TypeInt)));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return CastAssignOrAssignListErrorTest.testStrings();
    }
}

