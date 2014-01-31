package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import ch.tsphp.parser.test.integration.testutils.AParserTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NewTest extends AParserTest
{

    public NewTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] types = TypeHelper.getClassInterfaceTypes();
        for(String type: types){
            collection.add(new Object[]{"$a = new "+type+"();"});
        }
        return collection;
    }
}
