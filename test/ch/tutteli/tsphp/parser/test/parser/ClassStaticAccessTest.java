package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import ch.tutteli.tsphp.parser.test.testutils.TypeHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClassStaticAccessTest extends AParserTest
{

    public ClassStaticAccessTest(String testString) {
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
        for(String type : types){
            collection.add(new Object[]{type+"::foo();"});
            collection.add(new Object[]{type+"::$a->foo();"});
            collection.add(new Object[]{"$a = "+type+"::$a;"});
            collection.add(new Object[]{"$a = "+type+"::constant;"});
        }
        return collection;
    }
}
