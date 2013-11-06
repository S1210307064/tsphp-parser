package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ForErrorTest extends AParserParserExceptionTest
{

    public ForErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                     //for init - vars and expressions mixed
                    {"for(int $a,1+1;;);", TSPHPParser.Int, 11},
                    {"for($a=1,1+1,int $b;;);", TSPHPParser.TypeInt, 13},
                });
    }
}
