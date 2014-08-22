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
public class ConstructDestructModifierBacktrackingTest extends AParserBacktrackingTest
{


    public ConstructDestructModifierBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString, theStartTokenType, theStopTokenType);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsOnlyBacktracking();
    }

    protected void run() throws RecognitionException {
        result = parser.constructDestructModifier();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String foo = " function foo(){}";
        return Arrays.asList(new Object[][]{
                {"final protected" + foo, TSPHPParser.Final, TSPHPParser.Protected},
                {"final" + foo, TSPHPParser.Final, TSPHPParser.Final},
                {"protected final" + foo, TSPHPParser.Protected, TSPHPParser.Final},
                {"protected" + foo, TSPHPParser.Protected, TSPHPParser.Protected},
        });

    }
}


