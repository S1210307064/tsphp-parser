/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserBacktrackingTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassDefinitionBacktrackingTest extends AParserBacktrackingTest
{


    public ClassDefinitionBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString, theStartTokenType, theStopTokenType);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsOnlyBacktracking();
    }

    protected void run() throws RecognitionException {
        result = parser.classDefinition();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"abstract class A{}", TSPHPParser.Abstract, TSPHPParser.RightCurlyBrace},
                {"class A extends B{}", TSPHPParser.Class, TSPHPParser.RightCurlyBrace},
                {"class A implements B{}", TSPHPParser.Class, TSPHPParser.RightCurlyBrace},
                {"class A implements B{ public int $i;}", TSPHPParser.Class, TSPHPParser.RightCurlyBrace},
        });
    }
}


