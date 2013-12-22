package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tutteli.tsphp.parser.test.integration.testutils.InstructionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ThrowTest extends AParserTest
{

    public ThrowTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(InstructionHelper.getTestStrings("throw new \\Exception('bla');"));
        return collection;
    }
}
