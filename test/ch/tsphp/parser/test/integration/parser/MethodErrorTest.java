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
public class MethodErrorTest extends AParserParserExceptionTest
{

    public MethodErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //forgot to add type
                    {"class A{function void a(int $a=null,$b){}}", TSPHPParser.VariableId, 36},
                    //forgot to add return type
                    {"class A{function a(){}}", TSPHPParser.LeftParenthesis, 18},
                    //forgot to add function
                    {"class A{public void a(){}}", TSPHPParser.Void, 15},
                    //Did not wrote the whole function - see TSPHP-322
                    {"class A{function void a(int $a=null,int $b}", TSPHPParser.RightCurlyBrace, 42},
                    //abstract method with body
                    {"class A{abstract function void foo(){}}", TSPHPParser.LeftCurlyBrace, 36},
                    //abstract wrong access modifier
                    {"class A{abstract private function void foo();}", TSPHPParser.Private, 17},
                    //abstract cannot be static or final
                    {"class A{abstract static function void foo();}", TSPHPParser.Static, 17},
                    {"class A{abstract final function void foo();}", TSPHPParser.Final, 17},
                    {"class A{abstract static final function void foo();}", TSPHPParser.Static, 17},
                    {"class A{abstract final static function void foo();}", TSPHPParser.Final, 17},
                    {"class A{static abstract function void foo();}", TSPHPParser.Abstract, 15},
                    {"class A{final abstract function void foo();}", TSPHPParser.Abstract, 14},
                    {"class A{static abstract final function void foo();}", TSPHPParser.Abstract, 15},
                    {"class A{static final abstract function void foo();}", TSPHPParser.Abstract, 21},
                    {"class A{final abstract static function void foo();}", TSPHPParser.Abstract, 14},
                    {"class A{final static abstract function void foo();}", TSPHPParser.Abstract, 21}
        });
        
    }
}
