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
public class InstructionBadMatchingTest extends AParserBadMatchingTest
{


    public InstructionBadMatchingTest(String testString, int theNumberOfMatchesBeforeFail) {
        super(testString, theNumberOfMatchesBeforeFail);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsEmpty();
    }

    protected void run() throws RecognitionException {
        result = parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"int $a;", 0},
                //4 calls are made in expression as well
                {"$a;", 5},
                {";", 0},
                {"return;", 0},
                {"return;", 1},
                {"throw new Exception();", 0},
                {"throw new ErrorException();", 1},
                {"echo 'hello';", 0},
                {"echo 'hi';", 1},
                {"break;", 0},
                {"break 1;", 1},
                {"continue;", 0},
                {"continue;", 1},
                {"continue 1;", 1},
                {"continue 2;", 2},
                {"{}", 0},
                {"{}", 1},
                {"{$a;}", 0},
                //4 calls are made in expression as well
                {"{$b;}", 6},
        });
    }
}


