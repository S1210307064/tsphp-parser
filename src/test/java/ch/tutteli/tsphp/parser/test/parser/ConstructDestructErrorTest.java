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

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.testutils.AParserParserExceptionTest;
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
public class ConstructDestructErrorTest extends AParserParserExceptionTest
{

    public ConstructDestructErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //return type
                    {"class A{function void __construct(){}}", TSPHPParser.Construct, 22},
                    {"class A{function void __destruct(){}}", TSPHPParser.Destruct, 22},
                    //Destruct does not support arguments
                    {"class A{function __destruct(int $a=1){}}", TSPHPParser.TypeInt, 28},
                    //static is not allowed for construct/destruct
                    {"class A{static function __construct(){}}", TSPHPParser.Construct, 24},
                    {"class A{static function __destruct(){}}", TSPHPParser.Destruct, 24},
                    {"class A{static final function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{static final function __destruct(){}}", TSPHPParser.Destruct, 30},
                    {"class A{final static function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{final static function __destruct(){}}", TSPHPParser.Destruct, 30},
                    //abstract construct/destruct cannot be static or final
                    {"class A{static abstract function __construct(){}}", TSPHPParser.Abstract, 15},
                    {"class A{static abstract function __destruct(){}}", TSPHPParser.Abstract, 15},
                    {"class A{abstract static function __construct(){}}", TSPHPParser.Static, 17},
                    {"class A{abstract static function __destruct(){}}", TSPHPParser.Static,17},
                    {"class A{final abstract function __construct(){}}", TSPHPParser.Abstract, 14},
                    {"class A{final abstract function __destruct(){}}", TSPHPParser.Abstract, 14},
                    {"class A{abstract final  function __construct(){}}", TSPHPParser.Final, 17},
                    {"class A{abstract final  function __destruct(){}}", TSPHPParser.Final, 17},
                    //abstract construct/destruct cannot be private
                    {"class A{abstract private  function __construct(){}}", TSPHPParser.Private, 17},
                    {"class A{private abstract function __destruct(){}}", TSPHPParser.Abstract, 16},
                });
    }
}
