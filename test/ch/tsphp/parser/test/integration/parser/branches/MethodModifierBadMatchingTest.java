/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.parser.test.integration.testutils.AParserBadMatchingTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MethodModifierBadMatchingTest extends AParserBadMatchingTest
{


    public MethodModifierBadMatchingTest(String testString, int theNumberOfMatchesBeforeFail) {
        super(testString, theNumberOfMatchesBeforeFail);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckResultIsEmpty();
    }

    protected void run() throws RecognitionException {
        result = parser.methodModifier();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String foo = " function foo(){}";
        return Arrays.asList(new Object[][]{
                {"static final protected" + foo, 0},
                {"static final protected" + foo, 1},
                {"static protected final" + foo, 0},
                {"static protected final" + foo, 1},
                {"static protected" + foo, 0},
                {"static final" + foo, 0},
                {"static final" + foo, 1},
                {"static" + foo, 0},
                {"final static protected" + foo, 0},
                {"final static protected" + foo, 1},
                {"final protected static" + foo, 0},
                {"final protected static" + foo, 1},
                {"final protected" + foo, 0},
                {"final static" + foo, 0},
                {"final static" + foo, 1},
                {"final" + foo, 0},
                {"protected final static" + foo, 0},
                {"protected final static" + foo, 1},
                {"protected static final" + foo, 0},
                {"protected static final" + foo, 1},
                {"protected static" + foo, 0},
                {"protected final" + foo, 0},
        });

    }
}


