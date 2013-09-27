package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.lexer.TokenTest;
import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FloatDeclarationTest extends AParserTest
{

    public FloatDeclarationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] floatStrings = TokenTest.getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"float $a = " + floatString + ";"});
            collection.add(new Object[]{"float $a = +" + floatString + ";"});
            collection.add(new Object[]{"float $a = -" + floatString + ";"});
        }
        return collection;
    }
}
