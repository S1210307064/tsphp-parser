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
public class ForeachErrorTest extends AParserParserExceptionTest
{

    public ForeachErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"foreach($a as $k=>$v)$a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) $a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $k=>$v){$a=1;}", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) {$a=1;}", TSPHPParser.VariableId, 14},
                    //
                    {"foreach($a as int $k=>$v)$a=1;", TSPHPParser.VariableId, 22},
                    {"foreach($a as int $k=>$v){$a=1;}", TSPHPParser.VariableId, 22}
                });
    }
}
