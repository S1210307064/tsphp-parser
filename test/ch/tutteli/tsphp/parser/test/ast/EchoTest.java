package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.ExpressionHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EchoTest extends AAstTest
{

    public EchoTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
         List<Object[]> collection = new ArrayList<>();
         List<String[]> expressions = ExpressionHelper.getAstExpressions();
         
         for(Object[] expression:expressions){
             collection.add(new Object[]{"echo "+expression[0]+";","(echo "+expression[1]+")"});
             collection.add(new Object[]{"echo "+expression[0]+","+expression[0]+";","(echo "+expression[1]+" "+expression[1]+")"});
         }
         return collection;
    }
}
