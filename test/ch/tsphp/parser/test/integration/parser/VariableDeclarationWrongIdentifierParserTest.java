/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class VariableDeclarationWrongIdentifierParserTest extends AParserParserExceptionTest
{

    public VariableDeclarationWrongIdentifierParserTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> vars() {
        return Arrays.asList(new Object[][]{
                    {"int $1;", TSPHPParser.Dollar, 4},
                    {"bool $2a;", TSPHPParser.Dollar, 5},
                    {"bool $3_;", TSPHPParser.Dollar, 5},
                    {"float $4£;", TSPHPParser.Dollar, 6},
                    {"string $5ééé;", TSPHPParser.Dollar, 7},
                    {"resource $6AAAA;", TSPHPParser.Dollar, 9},
                    {"array $7aA;", TSPHPParser.Dollar, 6},
                    {"int $8_A;", TSPHPParser.Dollar, 4},
                    {"bool $9££;", TSPHPParser.Dollar, 5},
                    {"bool $0a;", TSPHPParser.Dollar, 5},
                    {"string $(;", TSPHPParser.Dollar, 7},
                    {"int $);", TSPHPParser.Dollar, 4}
                });
    }
}
