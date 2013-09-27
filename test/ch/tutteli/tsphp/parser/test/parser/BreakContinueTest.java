package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
        collection.addAll(ReturnTest.getControllStructuresWithInstruction("break"));
        collection.addAll(ReturnTest.getControllStructuresWithInstruction("continue"));
        collection.addAll(ReturnTest.getControllStructuresWithInstruction("break 3"));
        collection.addAll(ReturnTest.getControllStructuresWithInstruction("continue 2"));
        return collection;
    }
}
