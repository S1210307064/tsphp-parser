package ch.tutteli.tsphp.parser.test.integration.lexer;

import ch.tutteli.tsphp.parser.antlr.TSPHPLexer;
import ch.tutteli.tsphp.parser.test.integration.testutils.ALexerTest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SimpleTokenErrorTest extends ALexerTest
{
    
    public SimpleTokenErrorTest(String methodName) {
        //# is not valid for any token as first letter;
        super(methodName, "#", 0);
    }
    
    @Test
    public void testTokens() throws Exception {
        super.checkForMismatch();
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Method[] methods = TSPHPLexer.class.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (isTokenMethodOrSynpredFragment(methodName)) {
                collection.add(new Object[]{methodName});
            }
        }
        return collection;
    }

    private static boolean isTokenMethodOrSynpredFragment(String methodName) {
        return methodName.charAt(0) == 'm' && methodName.charAt(1) >= 'A' && methodName.charAt(1) <= 'Z'
                || (methodName.length() > 10 && methodName.substring(0, 7).equals("synpred") 
                && methodName.substring(methodName.length()-8, methodName.length()).equals("fragment"));
    }
}
