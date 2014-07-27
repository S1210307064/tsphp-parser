/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimaryErrorTest extends AParserParserExceptionTest
{

    public PrimaryErrorTest(String testString, int character, int position) {
        super(testString, NoViableAltException.class, character, position);
    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    protected void run() throws RecognitionException {
        result = parser.primary();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"\\$a", TSPHPParser.VariableId, 1},
                {"A$a ", TSPHPParser.VariableId, 1},
                //$this as such is valid for primary ->$a would cause a parser error in parent rule
                //{"$this->$a ", TSPHPParser.VariableId, 7},
                //$a as such is valid for primary ->$a would cause a parser error in parent rule
                //{"$a->$a", TSPHPParser.VariableId, 4},
                {"self::\\", TSPHPParser.Backslash, 6},
                {"parent::\\", TSPHPParser.Backslash, 8},
                {"return", TSPHPParser.Return, 0},
        });
    }
}

