/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.parser.test.integration.testutils.AParserStateFailedTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InstructionStateFailedTest extends AParserStateFailedTest
{

    @SuppressWarnings("UnusedParameters")
    public InstructionStateFailedTest(String testString, int character, int position) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"int $", 0, 0},
                {"if(", 0, 0},
                {"switch(", 0, 0},
                {"for(", 0, 0},
                {"foreach(", 0, 0},
                {"while(", 0, 0},
                {"do{}while(", 0, 0},
                {"try{", 0, 0},
                {"$a +", 0, 0},
                {"$a +", 0, 0},
                {"return $a +", 0, 0},
                {"throw new", 0, 0},
                {"echo $a +", 0, 0},

        });
    }
}

