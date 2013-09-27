package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.testutils.AParserParserExceptionTest;
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
                    {"int $1;", TSPHPParser.Dolar, 4},
                    {"bool $2a;", TSPHPParser.Dolar, 5},
                    {"bool $3_;", TSPHPParser.Dolar, 5},
                    {"float $4£;", TSPHPParser.Dolar, 6},
                    {"string $5ééé;", TSPHPParser.Dolar, 7},
                    {"resource $6AAAA;", TSPHPParser.Dolar, 9},
                    {"array $7aA;", TSPHPParser.Dolar, 6},
                    {"int $8_A;", TSPHPParser.Dolar, 4},
                    {"bool $9££;", TSPHPParser.Dolar, 5},
                    {"bool $0a;", TSPHPParser.Dolar, 5},
                    {"string $(;", TSPHPParser.Dolar, 7},
                    {"int $);", TSPHPParser.Dolar, 4}
                });
    }
}
