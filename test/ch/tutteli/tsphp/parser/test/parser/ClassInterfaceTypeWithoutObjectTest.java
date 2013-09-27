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
public class ClassInterfaceTypeWithoutObjectTest extends AParserTest
{

    public ClassInterfaceTypeWithoutObjectTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

     protected void run() throws RecognitionException {
        result = parser.classInterfaceTypeWithoutObject();
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Collection<Object[]> idTestStrings = TokenTest.getIDTestStrings();
        for (Object[] obj : idTestStrings) {
            collection.add(new String[]{obj[1] + ""});
            collection.add(new String[]{obj[1] + "\\" + obj[1]});
            collection.add(new String[]{obj[1] + "\\" + obj[1] + "\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1] + "\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1] + "\\" + obj[1] + "\\" + obj[1]});
        }
        return collection;
    }
}
