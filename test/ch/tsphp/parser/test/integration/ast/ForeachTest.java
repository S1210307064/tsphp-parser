/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
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
                    "foreach(" + expression[0] + " as mixed $v);",
                    "(foreach " + expression[1] + " (vars (type tMod mixed) $v) (cBlock expr))"
            });
        }

        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "foreach($a as ", " $v){}", "(foreach $a (vars ", " $v) (cBlock expr))", ""));
        String[] types = TypeHelper.getScalarTypes();
        for (String type : types) {
            collection.add(new Object[]{
                    "foreach($a as " + type + " $k => string $v){}",
                    "(foreach $a (vars (type tMod " + type + ") $k) (vars (type tMod string) $v) (cBlock expr))"
            });
        }

        return collection;
    }
}
