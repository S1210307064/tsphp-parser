package ch.tutteli.tsphp.parser.test.integration.ast;

import ch.tutteli.tsphp.parser.test.integration.testutils.ExpressionHelper;
import ch.tutteli.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ExpressionTest extends AAstTest
{

    public ExpressionTest(String testString, String expectedResult) {
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
             collection.add(new Object[]{expression[0]+";","(expr "+expression[1]+")"});
         }
         return collection;
    }
}
