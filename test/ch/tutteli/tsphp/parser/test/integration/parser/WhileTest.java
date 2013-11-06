package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class WhileTest extends AParserTest
{

    public WhileTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"while( true  ) $a=1;"},
                    {"while( true  ){$a=1;}"},
                    {"while( true  ){$a=1;int $b=2;}"},
                    {"do $a=1; while( true  );"},
                    {"do {$a=1;} while( true  );"},
                    {"do {$a=1;$b=2;}while( true  );"}
                });
    }
}
