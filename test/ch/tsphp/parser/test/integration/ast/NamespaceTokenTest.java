/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;


import ch.tsphp.parser.test.integration.testutils.AAstTokenTest;
import ch.tsphp.parser.test.integration.testutils.AstHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static ch.tsphp.parser.antlr.TSPHPParser.Assign;
import static ch.tsphp.parser.antlr.TSPHPParser.DEFAULT_NAMESPACE;
import static ch.tsphp.parser.antlr.TSPHPParser.EXPRESSION;
import static ch.tsphp.parser.antlr.TSPHPParser.Int;
import static ch.tsphp.parser.antlr.TSPHPParser.NAMESPACE_BODY;
import static ch.tsphp.parser.antlr.TSPHPParser.Namespace;
import static ch.tsphp.parser.antlr.TSPHPParser.TYPE_NAME;
import static ch.tsphp.parser.antlr.TSPHPParser.VariableId;

@RunWith(Parameterized.class)
public class NamespaceTokenTest extends AAstTokenTest
{

    public NamespaceTokenTest(String testString, List<Integer> expectedTokens) {
        super(testString, expectedTokens);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.compilationUnit();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"namespace a; ", Arrays.asList(AstHelper.DOWN, Namespace, TYPE_NAME, NAMESPACE_BODY, AstHelper.UP)},
                    {"namespace a {}", Arrays.asList(AstHelper.DOWN, Namespace, TYPE_NAME, NAMESPACE_BODY, AstHelper.UP)},
                    //default
                    {
                        "namespace{}",
                        Arrays.asList(AstHelper.DOWN, Namespace, DEFAULT_NAMESPACE, NAMESPACE_BODY, AstHelper.UP)
                    },
                    //without namespace
                    {
                        "$a=1;",
                        Arrays.asList(AstHelper.DOWN, Namespace, DEFAULT_NAMESPACE, AstHelper.DOWN, NAMESPACE_BODY,
                                AstHelper.DOWN, EXPRESSION, AstHelper.DOWN, Assign, VariableId, Int, AstHelper.UP,
                                AstHelper.UP,
                                AstHelper.UP, AstHelper.UP)
                    },});
    }
}
