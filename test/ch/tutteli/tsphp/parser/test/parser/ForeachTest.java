package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import ch.tutteli.tsphp.parser.test.testutils.TypeHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ForeachTest extends AParserTest
{

    public ForeachTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
        collection.addAll(Arrays.asList(new Object[][]{
                    {"foreach($a as int $k => MyClass $v)$a=1;"},
                    {"foreach($a as float $v) $a=1;"},
                    {"foreach($a as string $k => string $v){$a=1;}"},
                    {"foreach($a as bool $v) {$a=1;}"},
                    {"foreach($a as bool $k=> array $v){$a=1; $b=1;}"},
                    {"foreach($a as int $v) {$a=1; $b=3;}"},
        }));
        
        List<String> types = TypeHelper.getAllTypes();
        for(String type: types){
             collection.add(new Object[]{"foreach($a as "+type+" $v) $a=1;"});
        }
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"foreach(" + string + " as int $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as float $k => MyClass $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as bool $v) {$a=1;}"});
            collection.add(new Object[]{"foreach(" + string + " as string $k => string $v) {$a=1;}"});
            
        }
        
        return collection;
    }
}
