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

import ch.tutteli.tsphp.grammar.TSPHPLexer;
import ch.tutteli.tsphp.grammar.TSPHPParser;
import ch.tutteli.tsphp.grammar.test.utils.AParserParserExceptionTest;
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
public class NewErrorTest extends AParserParserExceptionTest
{

    public NewErrorTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> variables() {
        return Arrays.asList(new Object[][]{
                    {"$a = new bool();", TSPHPParser.TypeBool, 9},
                    {"$a = new boolean();", TSPHPParser.TypeBoolean, 9},
                    {"$a = new int();", TSPHPParser.TypeInt, 9},
                    {"$a = new float();", TSPHPParser.TypeFloat, 9},
                    {"$a = new array();", TSPHPParser.TypeArray, 9},
                    {"$a = new resource();", TSPHPParser.TypeResource, 9},
                    {"$a = new object();", TSPHPParser.TypeObject, 9},
                    {"$a = new if();", TSPHPParser.If, 9},
                    {"$a = new else();", TSPHPParser.Else, 9},
                    {"$a = new switch();", TSPHPParser.Switch, 9},
                    {"$a = new case();", TSPHPParser.Case, 9},
                    {"$a = new for();", TSPHPParser.For, 9},
                    {"$a = new foreach();", TSPHPParser.Foreach, 9},
                    {"$a = new while();", TSPHPParser.While, 9},
                    {"$a = new do();", TSPHPParser.Do, 9},
                    {"$a = new try();", TSPHPParser.Try, 9},
                    {"$a = new catch();", TSPHPParser.Catch, 9},
                });
    }
}
