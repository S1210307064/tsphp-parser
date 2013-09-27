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
public class InterfaceErrorTest extends AParserParserExceptionTest
{

    public InterfaceErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //members in interfaces
                    {"interface A{ public int $a;}",TSPHPParser.TypeInt,20},
                    //wrong modifier for method
                    {"interface A{ private function void a);}",TSPHPParser.Private,13},
                    {"interface A{ protected function void a);}",TSPHPParser.Protected,13},
                     //method body
                    {"interface A{function void a(){}}",TSPHPParser.LeftCurlyBrace,29},
                    //interface methods are already abstract
                    {"interface A{ abstract function void a();}",TSPHPParser.Abstract,13},
                    //Destruct in interface
                    {"interface A{ function __destruct();}",TSPHPParser.Destruct,22},
                });
    }
}
