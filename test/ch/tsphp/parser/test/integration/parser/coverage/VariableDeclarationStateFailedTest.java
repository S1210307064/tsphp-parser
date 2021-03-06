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

import java.util.Collection;

@RunWith(Parameterized.class)
public class VariableDeclarationStateFailedTest extends AParserStateFailedTest
{

    @SuppressWarnings("UnusedParameters")
    public VariableDeclarationStateFailedTest(String testString, int character, int position,
            Class<? extends RecognitionException> type) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.variableDeclarationList();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return VariableDeclarationListErrorTest.testStrings();
    }
}

