/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserBacktrackingTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InstructionBacktrackingTest extends AParserBacktrackingTest
{


    public InstructionBacktrackingTest(String testString, int theStartTokenType, int theStopTokenType) {
        super(testString, theStartTokenType, theStopTokenType);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckResultIsOnlyBacktracking();
    }

    protected void run() throws RecognitionException {
        result = parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"int $a;", TSPHPParser.TypeInt, TSPHPParser.Semicolon},
                {"if(true){}", TSPHPParser.If, TSPHPParser.RightCurlyBrace},
                {"switch(true){}", TSPHPParser.Switch, TSPHPParser.RightCurlyBrace},
                {"for(int $i=0;$i<10;++$i){}", TSPHPParser.For, TSPHPParser.RightCurlyBrace},
                {"foreach([1] as object $v){}", TSPHPParser.Foreach, TSPHPParser.RightCurlyBrace},
                {"while(true){}", TSPHPParser.While, TSPHPParser.RightCurlyBrace},
                {"do{}while(true);", TSPHPParser.Do, TSPHPParser.Semicolon},
                {"try{}catch(Exception $e){}", TSPHPParser.Try, TSPHPParser.RightCurlyBrace},
                {"+1;", TSPHPParser.Plus, TSPHPParser.Semicolon},
                {";", TSPHPParser.Semicolon, TSPHPParser.Semicolon},
                {"return;", TSPHPParser.Return, TSPHPParser.Semicolon},
                {"return 1;", TSPHPParser.Return, TSPHPParser.Semicolon},
                {"throw new Exception();", TSPHPParser.Throw, TSPHPParser.Semicolon},
                {"echo 'hello';", TSPHPParser.Echo, TSPHPParser.Semicolon},
                {"break;", TSPHPParser.Break, TSPHPParser.Semicolon},
                {"break 1;", TSPHPParser.Break, TSPHPParser.Semicolon},
                {"continue;", TSPHPParser.Continue, TSPHPParser.Semicolon},
                {"continue 1;", TSPHPParser.Continue, TSPHPParser.Semicolon},
                {"{}", TSPHPParser.LeftCurlyBrace, TSPHPParser.RightCurlyBrace},
                {"{ int $a; }", TSPHPParser.LeftCurlyBrace, TSPHPParser.RightCurlyBrace},
        });

    }
}


