package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.ExpressionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IfTest extends AAstTest
{

    public IfTest(String testString, String expectedResult) {
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
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "if(" + expression[0] + ") $a=1; else $a+=1;",
                        "(if " + expression[1] + " (cBlock (expr (= $a 1))) (cBlock (expr (= $a (+ $a 1)))))"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "if(true) $a=1; else if(false) $b=1; else $c=2;",
                        "(if true (cBlock (expr (= $a 1))) "
                        + "(cBlock (if false (cBlock (expr (= $b 1))) (cBlock (expr (= $c 2))))))"
                    },
                    {
                        "if(true) $a=1; else if(false) $b=1; else if($a<1) $c=2; else $d*=1;",
                        "(if true (cBlock (expr (= $a 1))) (cBlock "
                        + "(if false (cBlock (expr (= $b 1))) (cBlock "
                        + "(if (< $a 1) (cBlock (expr (= $c 2))) (cBlock (expr (= $d (* $d 1)))))"
                        + "))"
                        + "))"
                    },}));

        return collection;
    }
}
