/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PostFixErrorTest extends AParserParserExceptionTest
{

    public PostFixErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"self[0];", TSPHPParser.Self, 0},
                    {"parent[0]", TSPHPParser.Parent, 0},
                    {"Foo[0]", TSPHPParser.LeftSquareBrace, 3},
                    {"self::[0];", TSPHPParser.LeftSquareBrace, 6},
                    {"parent::[0]", TSPHPParser.LeftSquareBrace, 8},
                    {"Foo::[0]", TSPHPParser.DoubleColon, 3},
                    {"$a->[0]", TSPHPParser.ObjectOperator, 2}
                });
    }
}
