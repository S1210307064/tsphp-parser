/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.common.TSPHPAst;
import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AlmostCastAssignTest extends AParserTest
{

    public AlmostCastAssignTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    protected void run() throws RecognitionException {
        result = parser.castAssignOrAssignList(new TSPHPAst(new CommonToken(TSPHPParser.TypeInt)));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] expressions = ExpressionHelper.getParserExpressions();
        for (String expression : expressions) {
            collection.add(new Object[]{"$a =" + expression + ""});
            collection.add(new Object[]{"$a =(" + expression + ")"});
            collection.add(new Object[]{"$a, $a =" + expression});
            collection.add(new Object[]{"$a, $a =(" + expression + ")"});
        }
        return collection;
    }
}
