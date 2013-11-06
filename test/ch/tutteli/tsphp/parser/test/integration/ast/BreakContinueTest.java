package ch.tutteli.tsphp.parser.test.integration.ast;

import ch.tutteli.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BreakContinueTest extends AAstTest
{

    public BreakContinueTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"while( true  ) break;", "(while true (cBlock break))"},
                    {"while( true  ) break 1;", "(while true (cBlock (break 1)))"},
                    {"while( true  ) continue;", "(while true (cBlock continue))"},
                    {"while( true  ) continue 1;", "(while true (cBlock (continue 1)))"}
                });
    }
}
