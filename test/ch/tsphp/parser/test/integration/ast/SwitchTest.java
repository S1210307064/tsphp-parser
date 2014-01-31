package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SwitchTest extends AAstTest
{

    public SwitchTest(String testString, String expectedResult) {
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
                        "switch(" + expression[0] + "){}",
                        "(switch " + expression[1] + ")"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "switch($a){ case 1: $a=1; }",
                        "(switch $a (cases 1) (cBlock (expr (= $a 1))))"
                    },
                    {
                        "switch($a){ case 1: case 2: $a=1; break; }",
                        "(switch $a (cases 1 2) (cBlock (expr (= $a 1)) break))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $c=1;}",
                        "(switch $a (cases 1) (cBlock (expr (= $a 1))) (cases 2) (cBlock (expr (= $c 1))))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=1; }",
                        "(switch $a (cases 1) (cBlock (expr (= $a 1))) (cases 2 3) (cBlock (expr (= $a 1))))"
                    },
                    {
                        "switch($a){ case 1: $a=1; $b=2; }",
                        "(switch $a (cases 1) (cBlock (expr (= $a 1)) (expr (= $b 2))))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=2; default: $c=2; }",
                        "(switch $a "
                        + "(cases 1) (cBlock (expr (= $a 1))) "
                        + "(cases 2 3) (cBlock (expr (= $a 2))) "
                        + "(cases default) (cBlock (expr (= $c 2)))"
                        + ")"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $a=1; default: $c=2; case 3: $a=2; }",
                        "(switch $a "
                        + "(cases 1) (cBlock (expr (= $a 1))) "
                        + "(cases 2) (cBlock (expr (= $a 1))) "
                        + "(cases default) (cBlock (expr (= $c 2))) "
                        + "(cases 3) (cBlock (expr (= $a 2)))"
                        + ")"
                    },
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } case 2: case 3: {$a=1;} }",
                        "(switch $a "
                        + "(cases 1) (cBlock (expr (= $a 1)) (expr (= $b 2))) "
                        + "(cases 2 3) (cBlock (expr (= $a 1)))"
                        + ")"
                    },
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } {$a=1;} case 2: case 3: {$a=1;} }",
                        "(switch $a "
                        + "(cases 1) (cBlock (expr (= $a 1)) (expr (= $b 2)) (expr (= $a 1))) "
                        + "(cases 2 3) (cBlock (expr (= $a 1)))"
                        + ")"
                    },
                    //due to the design decision that empty cases are allowed
                    {
                        "switch($a){ case 1: $a=1; case 1+1: default: case 2: $b=2; case 2: case 3: {$a=1;} }",
                        "(switch $a "
                        + "(cases 1) (cBlock (expr (= $a 1))) "
                        + "(cases (+ 1 1) 2 default) (cBlock (expr (= $b 2))) "
                        + "(cases 2 3) (cBlock (expr (= $a 1)))"
                        + ")"
                    }
                }));
        return collection;
    }
}
