package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
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
public class ConstantAccessTest extends AAstTest
{

    public ConstantAccessTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] types = TypeHelper.getClassInterfaceTypes();
        for(String type: types){
            collection.add(new Object[]{
                "int $a = "+type+"::a;", 
                "(vars (type tMod int) ($a (sMemAccess "+type+" a#)))"
            });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {"int $a = a;","(vars (type tMod int) ($a a#))"},
                    {"int $a = self::a;", "(vars (type tMod int) ($a (sMemAccess self a#)))"},
                    {"int $a = parent::a;", "(vars (type tMod int) ($a (sMemAccess parent a#)))"},
                }));
        return collection;
    }
}
