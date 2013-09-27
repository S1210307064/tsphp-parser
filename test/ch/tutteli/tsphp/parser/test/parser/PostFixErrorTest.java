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
public class PostFixErrorTest extends AParserParserExceptionTest
{

    public PostFixErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"self[0];", TSPHPParser.Self, 0},
                    {"parent[0]", TSPHPParser.Parent, 0},
                    {"Foo[0]", TSPHPParser.LeftSquareBrace, 3},
                    {"self::[0];", TSPHPParser.LeftSquareBrace, 6},
                    {"parent::[0]", TSPHPParser.LeftSquareBrace, 8},
                    {"Foo::[0]", TSPHPParser.DoubleColon, 3}
                });
    }
}
