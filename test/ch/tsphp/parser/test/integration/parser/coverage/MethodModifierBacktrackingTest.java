/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserBacktrackingTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MethodModifierBacktrackingTest extends AParserBacktrackingTest
{


    public MethodModifierBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString, theStartTokenType, theStopTokenType);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsOnlyBacktracking();
    }

    protected void run() throws RecognitionException {
        result = parser.methodModifier();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String foo = " function foo(){}";
        return Arrays.asList(new Object[][]{
                {"static final protected" + foo, TSPHPParser.Static, TSPHPParser.Protected},
                {"static protected final" + foo, TSPHPParser.Static, TSPHPParser.Final},
                {"static protected" + foo, TSPHPParser.Static, TSPHPParser.Protected},
                {"static final" + foo, TSPHPParser.Static, TSPHPParser.Final},
                {"static" + foo, TSPHPParser.Static, TSPHPParser.Static},
                {"final static protected" + foo, TSPHPParser.Final, TSPHPParser.Protected},
                {"final protected static" + foo, TSPHPParser.Final, TSPHPParser.Static},
                {"final protected" + foo, TSPHPParser.Final, TSPHPParser.Protected},
                {"final static" + foo, TSPHPParser.Final, TSPHPParser.Static},
                {"final" + foo, TSPHPParser.Final, TSPHPParser.Final},
                {"protected final static" + foo, TSPHPParser.Protected, TSPHPParser.Static},
                {"protected static final" + foo, TSPHPParser.Protected, TSPHPParser.Final},
                {"protected static" + foo, TSPHPParser.Protected, TSPHPParser.Static},
                {"protected final" + foo, TSPHPParser.Protected, TSPHPParser.Final},
                {"protected" + foo, TSPHPParser.Protected, TSPHPParser.Protected},
        });

    }
}


