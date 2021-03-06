/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import ch.tsphp.parser.test.integration.testutils.VariableDeclarationListHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class VariableAssignmentTest extends AAstTest
{

    public VariableAssignmentTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        Collection<Object[]> collection = VariableDeclarationListHelper.testStrings("", ";", "", "","");

        List<String[]> expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "$a =(" + expression[0] + ");",
                        "(expr (= $a " + expression[1] + "))"
                    });
        }
        return collection;
    }
}
