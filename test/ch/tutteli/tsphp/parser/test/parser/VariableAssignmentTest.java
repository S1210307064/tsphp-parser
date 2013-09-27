package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.lexer.FragmentsTest;
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
public class VariableAssignmentTest extends AParserTest
{

    public VariableAssignmentTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
        collection.add(new Object[]{"$bool = true;"});
        collection.add(new Object[]{"$bool = false;"});
        collection.add(new Object[]{"$object = null;"});
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"$array = " + string + ";"});
        }

        Collection<Object[]> intTestStrings = FragmentsTest.getIntFragments();
        for (Object[] obj : intTestStrings) {
            collection.add(new Object[]{"$int = " + obj[1] + ";"});
            collection.add(new Object[]{"$int = +" + obj[1] + ";"});
            collection.add(new Object[]{"$int = -" + obj[1] + ";"});
        }

        String[] floatStrings = TokenTest.getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"$float = " + floatString + ";"});
            collection.add(new Object[]{"$float = +" + floatString + ";"});
            collection.add(new Object[]{"$float = -" + floatString + ";"});
        }

        Collection<Object[]> stringTestStrings = FragmentsTest.getStringFragments();
        for(Object[] obj: stringTestStrings){
            collection.add(new Object[]{"$string = "+obj[1]+";"});
        }
               
        
        return collection;
    }
}
