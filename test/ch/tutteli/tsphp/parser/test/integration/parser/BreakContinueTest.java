package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ch.tutteli.tsphp.parser.test.integration.testutils.InstructionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BreakContinueTest extends AParserTest
{

    public BreakContinueTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(InstructionHelper.getTestStrings("break;"));
        collection.addAll(InstructionHelper.getTestStrings("continue;"));
        collection.addAll(InstructionHelper.getTestStrings("break 3;"));
        collection.addAll(InstructionHelper.getTestStrings("continue 2;"));
        return collection;
    }
}
