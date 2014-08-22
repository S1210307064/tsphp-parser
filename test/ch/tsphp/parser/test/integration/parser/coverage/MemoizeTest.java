/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.TestTSPHPParser;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class MemoizeTest extends AParserTest
{

    private String methodName;

    public MemoizeTest(String testString, String theMethodName) {
        super(testString);
        methodName = theMethodName;
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
        parser.input.rewind();
        run();
        checkForExceptions();
        assertTrue(testString + " - results where different ", ((DummyParser) parser).getResult());
    }

    @Override
    protected TestTSPHPParser createTestParser(CommonTokenStream tokens) {
        return new DummyParser(tokens);
    }

    @Override
    protected void modifyParser() {
        parser.setBacktracking(1);
    }

    @Override
    protected void run() throws Exception {
        Method method = parser.getClass().getMethod(methodName);
        result = (ParserRuleReturnScope) method.invoke(parser);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Method[] methods = TSPHPParser.class.getMethods();
        for (Method method : methods) {
            if (ParserRuleReturnScope.class.isAssignableFrom(method.getReturnType())
                    && method.getParameterTypes().length == 0) {
                String methodName = method.getName();
                if (!methodName.equals("classMemberModifier")) {
                    collection.add(new Object[]{methodName, methodName});
                } else {
                    collection.add(new Object[]{"public classMemberDefinition", methodName});
                }
            }
        }
        return collection;
    }

    class DummyParser extends TestTSPHPParser
    {
        Boolean result;

        public DummyParser(TokenStream input) {
            super(input);
        }

        @Override
        public boolean alreadyParsedRule(IntStream input, int ruleIndex) {
            result = super.alreadyParsedRule(input, ruleIndex);
            return result;
        }

        public Boolean getResult() {
            return result;
        }

    }
}
