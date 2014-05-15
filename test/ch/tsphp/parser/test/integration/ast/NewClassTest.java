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
public class NewClassTest extends AAstTest
{

    public NewClassTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"new Type;", "(expr (new Type args))"},
                    {"new Type();", "(expr (new Type args))"}
                }));
        List<String[]> expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                "new Type(" + expression[0] + ");",
                "(expr (new Type (args " + expression[1] + ")))"
            });
            collection.add(new Object[]{
                        "new Type(" + expression[0] + "," + expression[0] + ");",
                        "(expr (new Type (args " + expression[1] + " " + expression[1] + ")))"
                    });
            collection.add(new Object[]{
                        "new Type(" + expression[0] + "," + expression[0] + "," + expression[0] + ");",
                        "(expr (new Type (args " + expression[1] + " " + expression[1] + " " + expression[1] + ")))"
                    });
        }
        return collection;
    }
}
