package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IfTest extends AParserTest
{

    public IfTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"iF($a) int $b=1; else int $b=2;"},
                    {"if($a){ int $b=1;} else int $b=2;"},
                    {"if($a) int $b=1; else{ int $b=2;}"},
                    {"if($a){ int $b=1;} else{ int $b=2;}"},
                    {"if($a){ int $b=1; $b=1;} else{ int $b=2; $b=1;}"},
                    {"if($a){ $b=1; $b=2;} else{ int $b=2; $b=1;}"},
                    {"if($a){ $b=1; $b=2;} else if ($a) int $b=1;"},
                    {"if($a){ $b=1; $b=2;} else if ($a){int $b=1;}"},
                    {"if($a) $b=1; else if ($a){int $b=1;} else $b=2;"},
                    {"if($a){ if($b){ $b=2;}} else if ($a){int $b=1;} else $b=2;"},
                    {"if($a){ $c=2;} else { if($a) $c=3; else if($a){ $b=2;}else $d=0;}"},
                });
    }
}
