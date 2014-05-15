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
public class ClassBodyStateFailedTest extends AParserStateFailedTest
{

    @SuppressWarnings("UnusedParameters")
    public ClassBodyStateFailedTest(String testString, int character, int position) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckStateFailed();
    }

    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(ClassBodyErrorTest.testStrings());
        collection.addAll(Arrays.asList(new Object[][]{
                {"const $notAnIdentifier=1;", 0, 0},
                {"private int notAVariableId=1;", 0, 0},
                {"abstract function __construct($missingType);", 0, 0},
                {"function __construct($missingType){}", 0, 0},
                {"abstract function void foo($missingType);", 0, 0},
                {"function void foo($missingType){}", 0, 0},
        }));
        return collection;
    }
}

