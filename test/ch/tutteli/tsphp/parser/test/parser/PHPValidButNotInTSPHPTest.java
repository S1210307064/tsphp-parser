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
public class PHPValidButNotInTSPHPTest extends AParserParserExceptionTest
{

    public PHPValidButNotInTSPHPTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
            //switch with multiple default blocks
            {"switch($a){case 1: default: $a=1; break; case 2: default: $a=2; break;}", TSPHPParser.Default, 49},
            //function with pseudo optional parameter
            {"function a ($a,$b=1,$c){$a=1;}", TSPHPParser.LeftParanthesis, 11},
            //use outside of semicolon namespace
            {"use a\\a; namespace a;", TSPHPParser.Namespace, 9},
            {"$a <> $b", TSPHPParser.GreaterThan, 4}
        });
        //See TokenExceptionTest for misuse of keywords
    }
}
