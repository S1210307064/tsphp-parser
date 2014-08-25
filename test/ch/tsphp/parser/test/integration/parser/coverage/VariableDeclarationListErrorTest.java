/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class VariableDeclarationListErrorTest extends AParserParserExceptionTest
{

    public VariableDeclarationListErrorTest(String testString, int character, int position,
            Class<? extends RecognitionException> type) {
        super(testString, character, position, type);
    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    protected void run() throws RecognitionException {
        result = parser.variableDeclarationList();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"$notAType", TSPHPParser.VariableId, 0, NoViableAltException.class},
                {"array notAModifier", TSPHPParser.Identifier, 6, NoViableAltException.class},
                {"mixed notAModifier", TSPHPParser.Identifier, 6, MismatchedTokenException.class},
                {"mixed $a, notAModifier", TSPHPParser.Identifier, 10, MismatchedTokenException.class,}
        });
    }
}

