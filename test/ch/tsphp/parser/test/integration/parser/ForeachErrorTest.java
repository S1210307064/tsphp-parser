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
public class ForeachErrorTest extends AParserParserExceptionTest
{

    public ForeachErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"foreach($a as $k=>$v)$a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) $a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $k=>$v){$a=1;}", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) {$a=1;}", TSPHPParser.VariableId, 14},
                    //
                    {"foreach($a as int $k=>$v)$a=1;", TSPHPParser.VariableId, 22},
                    {"foreach($a as int $k=>$v){$a=1;}", TSPHPParser.VariableId, 22}
                });
    }
}
