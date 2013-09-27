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
public class ReturnTest extends AAstTest
{

    public ReturnTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
         List<Object[]> collection = new ArrayList<>();
         collection.add(new Object[]{"return;","return"});
         List<String[]> expressions = ExpressionHelper.getAstExpressions();
         
         for(Object[] expression:expressions){
             collection.add(new Object[]{"return "+expression[0]+";","(return "+expression[1]+")"});
         }
         return collection;
    }
}
