package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;

import java.util.ArrayList;
import java.util.Collection;

import ch.tutteli.tsphp.parser.test.integration.testutils.InstructionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ReturnTest extends AParserTest
{

    public ReturnTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        Collection<Object[]> collection = new ArrayList<>();
        collection.addAll(InstructionHelper.getTestStrings("return;"));
        collection.addAll(InstructionHelper.getTestStrings("return 1;"));
        return collection;
    }

}
