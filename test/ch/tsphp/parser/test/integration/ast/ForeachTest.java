/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ForeachTest extends AAstTest
{

    public ForeachTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        List<String[]> expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "foreach(" + expression[0] + " as object $v);",
                        "(foreach "+expression[1]+" (vars (type tMod object) $v) (cBlock expr))"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "foreach($a as int $k => MyClass $v)$a=1;",
                        "(foreach $a (vars (type tMod int) $k) (vars (type tMod MyClass) $v) (cBlock (expr (= $a 1))))"
                    },
                    {
                        "foreach($a as float $v) $a=1;",
                        "(foreach $a (vars (type tMod float) $v) (cBlock (expr (= $a 1))))"
                    },
                    {
                        "foreach($a as string $k => string $v){$a=1;}",
                        "(foreach $a (vars (type tMod string) $k) (vars (type tMod string) $v) (cBlock (expr (= $a 1))))"},
                    {
                        "foreach($a as bool $v) {$a=1;}",
                        "(foreach $a (vars (type tMod bool) $v) (cBlock (expr (= $a 1))))"
                    },
                    {
                        "foreach($a as bool $k=> array $v){$a=1; $b=2;}",
                        "(foreach $a (vars (type tMod bool) $k) (vars (type tMod array) $v) "
                        + "(cBlock (expr (= $a 1)) (expr (= $b 2))))"
                    },
                    {
                        "foreach($a as int $v) {$a=1; $b=3;}",
                        "(foreach $a (vars (type tMod int) $v) (cBlock (expr (= $a 1)) (expr (= $b 3))))"
                    }
                }));


        return collection;
    }
}
