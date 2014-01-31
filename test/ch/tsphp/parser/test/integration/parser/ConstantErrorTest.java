package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import ch.tsphp.parser.antlr.TSPHPParser;

import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ConstantErrorTest extends AParserParserExceptionTest
{

    public ConstantErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{ const float $a=1.0;}", TSPHPParser.VariableId, 21},
                    {"class a{ const float a;}", TSPHPParser.Semicolon, 22},
                    {"class a{ const float a=1.0+1.0;}", TSPHPParser.Plus, 26},
                    {"class a{ const array a=1;}", TSPHPParser.TypeArray, 15},
                    {"interface a{ const float $a=1.0;}", TSPHPParser.VariableId, 25},
                    {"interface a{ const float a;}", TSPHPParser.Semicolon, 26},
                    {"interface a{ const float a=1.0+1.0;}", TSPHPParser.Plus, 30},
                    {"interface a{ const array a=1;}", TSPHPParser.TypeArray,19},
                });
    }
}
