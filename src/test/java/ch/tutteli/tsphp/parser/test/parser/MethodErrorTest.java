/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.TSPHPParser;
import ch.tutteli.tsphp.parser.test.utils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class MethodErrorTest extends AParserParserExceptionTest
{

    public MethodErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //forgot to add type
                    {"class A{function void a(int $a=null,$b){}}", TSPHPParser.VariableId, 36},
                    //forgot to add return type
                    {"class A{function a(){}}", TSPHPParser.LeftParanthesis, 18},
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
