package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.lexer.FragmentsTest;
import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class IntDeclarationTest extends AParserTest
{

    public IntDeclarationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Collection<Object[]> strings = FragmentsTest.getIntFragments();
        for (Object[] obj : strings) {
            collection.add(new Object[]{"int $a = " + obj[1] + ";"});
            collection.add(new Object[]{"int $a = +" + obj[1] + ";"});
            collection.add(new Object[]{"int $a = -" + obj[1] + ";"});
        }
                
        return collection;
    }
}
