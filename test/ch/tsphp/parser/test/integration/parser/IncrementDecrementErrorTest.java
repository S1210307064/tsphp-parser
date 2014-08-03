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
public class IncrementDecrementErrorTest extends AParserParserExceptionTest
{

    public IncrementDecrementErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Override
    protected void run() throws RecognitionException {
        parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {

        return Arrays.asList(new Object[][]{
                    //increment or decrement from call
                    {"++foo();", TSPHPParser.LeftParenthesis, 5},
                    {"--foo();", TSPHPParser.LeftParenthesis, 5},
                    //semicolon is wrong since it expects a memAccess after a mCall
                    {"++$a->foo();", TSPHPParser.Semicolon, 11},
                    {"--$a->foo();", TSPHPParser.Semicolon, 11},
                    {"++$this->foo();", TSPHPParser.Semicolon, 14},
                    {"--$this->foo();", TSPHPParser.Semicolon, 14},
                    {"++self::$a->foo();", TSPHPParser.Semicolon, 17},
                    {"--self::$a->foo();", TSPHPParser.Semicolon, 17},
                    {"++parent::$a->foo();", TSPHPParser.Semicolon, 19},
                    {"--parent::$a->foo();", TSPHPParser.Semicolon, 19},
                    {"++Asdf::$a->foo();", TSPHPParser.Semicolon, 17},
                    {"--Asdf::$a->foo();", TSPHPParser.Semicolon, 17}
                });
    }
}