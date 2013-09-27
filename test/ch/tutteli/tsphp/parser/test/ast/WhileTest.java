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
public class WhileTest extends AAstTest
{

    public WhileTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"while( true  ) $a=1;", "(while true (cBlock (expr (= $a 1))))"},
                    {"while( true  ){$a=1;}", "(while true (cBlock (expr (= $a 1))))"},
                    {
                        "while( true  ){$a=1;int $b=2;}",
                        "(while true (cBlock (expr (= $a 1)) (vars (type tMod int) ($b 2))))"
                    },
                    {"do $a=1; while( true  );", "(do (block (expr (= $a 1))) true)"},
                    {"do {$a=1;} while( true  );", "(do (block (expr (= $a 1))) true)"},
                    {"do {$a=1;$b=2;}while( true  );", "(do (block (expr (= $a 1)) (expr (= $b 2))) true)"}
                }));
        List<String[]> expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "while(" + expression[0] + ") $a=1;",
                        "(while " + expression[1] + " (cBlock (expr (= $a 1))))"
                    });
            collection.add(new Object[]{
                        "do $a=1; while(" + expression[0] + ");",
                        "(do (block (expr (= $a 1))) " + expression[1] + ")"
                    });
        }
        return collection;
    }
}
