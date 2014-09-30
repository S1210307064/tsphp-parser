/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This class is based on the class FunctionIdentifierTest from the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class FunctionIdentifierTest extends AParserTest
{

    public FunctionIdentifierTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.functionIdentifier();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return ClassInterfaceTypeWithoutMixedTest.testStrings();
    }
}
