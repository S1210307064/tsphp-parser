package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InterfaceTest extends AAstTest
{

    public InterfaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"interface a{}","(interface (iMod abstract) a extends iBody)"});
        
        String[] types = TypeHelper.getClassInterfaceTypes();
        for(String type:types){
            
            collection.add(new Object[]{
                "interface a extends "+type+"{}",
                "(interface (iMod abstract) a (extends "+type+") iBody)"
            });
            collection.add(new Object[]{
                "interface a extends "+type+","+type+"{}",
                "(interface (iMod abstract) a (extends "+type+" "+type+") iBody)"
            });
            collection.add(new Object[]{
                "interface a extends "+type+","+type+", "+type+"{}",
                "(interface (iMod abstract) a (extends "+type+" "+type+" "+type+") iBody)"
            });
        }
        return collection;
    }
}
