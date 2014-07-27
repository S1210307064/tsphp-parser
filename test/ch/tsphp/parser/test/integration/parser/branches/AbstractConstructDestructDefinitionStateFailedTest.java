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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AbstractConstructDestructDefinitionStateFailedTest extends AParserStateFailedTest
{
    @SuppressWarnings("UnusedParameters")
    public AbstractConstructDestructDefinitionStateFailedTest(String testString, int character, int position) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.abstractConstructDestructDefinition();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(AbstractConstructDestructDefinitionErrorTest.testStrings());
        collection.addAll(Arrays.asList(new Object[][]{
                //wrong instruction, missing ;
                {"abstract function __construct(){int $a}", 0, 0},
                {"abstract function __destruct(){int $a}", 0, 0}
        }));
        return collection;
    }
}

