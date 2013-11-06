package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tutteli.tsphp.parser.test.integration.testutils.TypeHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TryCatchTest extends AParserTest
{

    public TryCatchTest(String testString) {
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
        for (String type : types) {
            collection.add(new Object[]{"try{$a=1;}catch(" + type + " $e){}"});
        }
        collection.add(new Object[]{"try{$a=1;}catch(\\Exception $e){}catch(MyException $e){}"});
        collection.add(new Object[]{"try{$a=1;}catch(\\Exception $e){}catch(MyException $e){}catch(\\a\\MyException $e){}"});
        return collection;
    }
}
