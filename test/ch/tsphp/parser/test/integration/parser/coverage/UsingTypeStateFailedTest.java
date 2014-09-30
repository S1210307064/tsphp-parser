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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UsingTypeStateFailedTest extends AParserStateFailedTest
{

    @SuppressWarnings("UnusedParameters")
    public UsingTypeStateFailedTest(String testString, int character, int position) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.usingType();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        Collection<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                {"Identifier $notABackslash", 0, 0},
                {"Identifier \\ $notANamespaceIdentifier", 0, 0},
                {"\\ $notAnIdentifier", 0, 0}
        }));
        return collection;
    }
}

