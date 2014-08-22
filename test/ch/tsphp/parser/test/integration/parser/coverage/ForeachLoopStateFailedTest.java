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
public class ForeachLoopStateFailedTest extends AParserStateFailedTest
{

    @SuppressWarnings("UnusedParameters")
    public ForeachLoopStateFailedTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.foreachLoop();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"foreach([1,2] as $notAType"},
                {"foreach([1,2] as string $k => $notAType"},
                {"foreach([1,2] as string $k => object $v){$missingSemicolon"},
                {"foreach([1,2] as string $k => object $v){$missingSemicolon"},
        });
    }
}

