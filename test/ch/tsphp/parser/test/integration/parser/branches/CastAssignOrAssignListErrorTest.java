/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.common.TSPHPAst;
import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CastAssignOrAssignListErrorTest extends AParserParserExceptionTest
{

    public CastAssignOrAssignListErrorTest(String testString, int character, int position) {
        super(testString, NoViableAltException.class, character, position);
    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    protected void run() throws RecognitionException {
        result = parser.castAssignOrAssignList(new TSPHPAst(new CommonToken(TSPHPParser.TypeInt)));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"$a $notEqual", TSPHPParser.VariableId, 3},
                {"$a =$", TSPHPParser.Dollar, 4},
                {"$a =($", TSPHPParser.Dollar, 5},
                {"$a =()$", TSPHPParser.Dollar, 6},
                {"$a,$a $notEqual", TSPHPParser.VariableId, 6},
                {"$a,$a =$", TSPHPParser.Dollar, 7},
                {"$a,$a =($", TSPHPParser.Dollar, 8},
                {"$a,$a =()$", TSPHPParser.Dollar, 9},
                {"$a:", TSPHPParser.Colon, 2},
                {"$a,$b:", TSPHPParser.Colon, 5},
        });
    }
}

