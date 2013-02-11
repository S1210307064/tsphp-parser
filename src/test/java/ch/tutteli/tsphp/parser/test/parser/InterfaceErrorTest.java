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
public class InterfaceErrorTest extends AParserParserExceptionTest
{

    public InterfaceErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //members in interfaces
                    {"interface A{ public int $a;}",TSPHPParser.TypeInt,20},
                    //wrong modifier for method
                    {"interface A{ private function void a);}",TSPHPParser.Private,13},
                    {"interface A{ protected function void a);}",TSPHPParser.Protected,13},
                     //method body
                    {"interface A{function void a(){}}",TSPHPParser.LeftCurlyBrace,29},
                    //interface methods are already abstract
                    {"interface A{ abstract function void a();}",TSPHPParser.Abstract,13},
                    //Destruct in interface
                    {"interface A{ function __destruct();}",TSPHPParser.Destruct,22},
                });
    }
}
