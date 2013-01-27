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
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.TSPHPParser;
import ch.tutteli.tsphp.grammar.test.utils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ConstructDeconstructErrorTest extends AParserParserExceptionTest
{

    public ConstructDeconstructErrorTest(String testString, int character, int position) {
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
                    {"class A{function void __deconstruct(){}}", TSPHPParser.Deconstruct, 22},
                    //deconstruct does not support arguments
                    {"class A{function __deconstruct(int $a=1){}}", TSPHPParser.TypeInt, 31},
                    //wrong modifier for construct deconstruct
                    {"class A{abstract function __construct(){}}", TSPHPParser.Construct, 26},
                    {"class A{abstract function __deconstruct(){}}", TSPHPParser.Deconstruct, 26},
                    {"class A{static function __construct(){}}", TSPHPParser.Construct, 24},
                    {"class A{static function __deconstruct(){}}", TSPHPParser.Deconstruct, 24},
                    {"class A{final function __construct(){}}", TSPHPParser.Construct, 23},
                    {"class A{final function __deconstruct(){}}", TSPHPParser.Deconstruct, 23},
                    {"class A{static final function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{static final function __deconstruct(){}}", TSPHPParser.Deconstruct, 30},
                    {"class A{final static function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{final static function __deconstruct(){}}", TSPHPParser.Deconstruct, 30}
                });
    }
}
