/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.common.TSPHPAst;
import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserBacktrackingTest;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CastAssignOrAssignListBacktrackingTest extends AParserBacktrackingTest
{


    public CastAssignOrAssignListBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString, theStartTokenType, theStopTokenType);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsOnlyBacktracking();
    }

    protected void run() throws RecognitionException {
        result = parser.castAssignOrAssignList(new TSPHPAst(new CommonToken(TSPHPParser.TypeInt)));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"$a =() 1", TSPHPParser.VariableId, TSPHPParser.Int},
                {"$a =() 1, $b =() 2", TSPHPParser.VariableId, TSPHPParser.Int},
                {"$a = 1", TSPHPParser.VariableId, TSPHPParser.Int},
                {"$a = 1, $b = 2", TSPHPParser.VariableId, TSPHPParser.Int},
                {"$a = 1, $b =() 2", TSPHPParser.VariableId, TSPHPParser.Int},
                {"$a =() 1, $b =() 2", TSPHPParser.VariableId, TSPHPParser.Int},
        });
    }
}



