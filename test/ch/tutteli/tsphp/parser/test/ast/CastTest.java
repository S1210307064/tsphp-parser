package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.TypeHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CastTest extends AAstTest
{

    public CastTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(TypeHelper.getAllTypesWithoutObjectWithModifier(
                "(", ") $a;", "(expr (casting ", " $a))", ""));
        List<String> allTypesWithoutObject = TypeHelper.getAllTypesWithoutObject();
        for(String type : allTypesWithoutObject){
            collection.add(new Object[]{type+" $a =() 1;","(vars (type tMod "+type+") ($a (casting (type tMod "+type+") 1)))"});
        }
        return collection;
    }
}
