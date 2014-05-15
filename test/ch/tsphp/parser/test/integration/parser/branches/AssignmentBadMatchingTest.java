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
public class AssignmentBadMatchingTest extends AParserBadMatchingTest
{

    public AssignmentBadMatchingTest(String testString, int theNumberOfMatchesBeforeFail) {
        super(testString, theNumberOfMatchesBeforeFail);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsEmpty();
    }

    protected void run() throws RecognitionException {
        result = parser.assignment();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                //variable itself provokes 4 calls to match thus 2 and not 0
                {"$a = 1", 5},
                {"$a =() 1", 5},
                {"$a =() 2", 6},
                {"$a =() 3", 7},
                {"$a += 1", 5},
                {"$a -= 1", 5},
                {"$a *= 1", 5},
                {"$a /= 1", 5},
                {"$a &= 1", 5},
                {"$a |= 1", 5},
                {"$a ^= 1", 5},
                {"$a %= 1", 5},
                {"$a .= 1", 5},
                {"$a <<= 1", 5},
                {"$a >>= 1", 5},
        });
    }
}


