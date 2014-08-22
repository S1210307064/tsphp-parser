/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

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
    public InstructionStateFailedTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"int $"},
                {"if("},
                {"switch("},
                {"for("},
                {"foreach("},
                {"while("},
                {"do{}while("},
                {"try{"},
                {"$a +"},
                {"$a +"},
                {"return $a +"},
                {"throw new"},
                {"echo $a +"},

        });
    }
}

