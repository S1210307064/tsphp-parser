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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ExpressionErrorTest extends AParserParserExceptionTest
{

    public ExpressionErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Override
    protected void run() throws RecognitionException {
        parser.expressionForTest();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"$a ! instanceof $b;", TSPHPParser.LogicNot, 3},
                    //not yet possible in PHP
                    {"new Foo()[0];", TSPHPParser.LeftSquareBrace, 9},
                    
                    //expressions with only two operands
                    {"1 < 2 < 3;", TSPHPParser.LessThan, 6},
                    {"1 < 2 <= 3;", TSPHPParser.LessEqualThan, 6},
                    {"1 < 2 > 3;", TSPHPParser.GreaterThan, 6},
                    {"1 < 2 >= 3;", TSPHPParser.GreaterEqualThan, 6},
                    {"1 <= 2 < 3;", TSPHPParser.LessThan, 7},
                    {"1 <= 2 <= 3;", TSPHPParser.LessEqualThan, 7},
                    {"1 <= 2 > 3;", TSPHPParser.GreaterThan, 7},
                    {"1 <= 2 >= 3;", TSPHPParser.GreaterEqualThan, 7},
                    {"1 > 2 < 3;", TSPHPParser.LessThan, 6},
                    {"1 > 2 <= 3;", TSPHPParser.LessEqualThan, 6},
                    {"1 > 2 > 3;", TSPHPParser.GreaterThan, 6},
                    {"1 > 2 >= 3;", TSPHPParser.GreaterEqualThan, 6},
                    {"1 >= 2 < 3;", TSPHPParser.LessThan, 7},
                    {"1 >= 2 <= 3;", TSPHPParser.LessEqualThan, 7},
                    {"1 >= 2 > 3;", TSPHPParser.GreaterThan, 7},
                    {"1 >= 2 >= 3;", TSPHPParser.GreaterEqualThan, 7},
                    {"1 == 2 == 3;", TSPHPParser.Equal, 7},
                    {"1 == 2 === 3;", TSPHPParser.Identical, 7},
                    {"1 == 2 != 3;", TSPHPParser.NotEqual, 7},
                    {"1 == 2 !== 3;", TSPHPParser.NotIdentical, 7},
                    {"1 == 2 <> 3;", TSPHPParser.NotEqualAlternative, 7},
                    {"1 === 2 == 3;", TSPHPParser.Equal, 8},
                    {"1 === 2 === 3;", TSPHPParser.Identical, 8},
                    {"1 === 2 != 3;", TSPHPParser.NotEqual, 8},
                    {"1 === 2 !== 3;", TSPHPParser.NotIdentical, 8},
                    {"1 === 2 <> 3;", TSPHPParser.NotEqualAlternative, 8},
                    {"1 != 2 == 3;", TSPHPParser.Equal, 7},
                    {"1 != 2 === 3;", TSPHPParser.Identical, 7},
                    {"1 != 2 != 3;", TSPHPParser.NotEqual, 7},
                    {"1 != 2 !== 3;", TSPHPParser.NotIdentical, 7},
                    {"1 != 2 <> 3;", TSPHPParser.NotEqualAlternative, 7},
                    {"1 !== 2 == 3;", TSPHPParser.Equal, 8},
                    {"1 !== 2 === 3;", TSPHPParser.Identical, 8},
                    {"1 !== 2 != 3;", TSPHPParser.NotEqual, 8},
                    {"1 !== 2 !== 3;", TSPHPParser.NotIdentical, 8},
                    {"1 !== 2 <> 3;", TSPHPParser.NotEqualAlternative, 8},
                    {"1 <> 2 == 3;", TSPHPParser.Equal, 7},
                    {"1 <> 2 === 3;", TSPHPParser.Identical, 7},
                    {"1 <> 2 != 3;", TSPHPParser.NotEqual, 7},
                    {"1 <> 2 !== 3;", TSPHPParser.NotIdentical, 7},
                    {"1 <> 2 <> 3;", TSPHPParser.NotEqualAlternative, 7},
                    //increment/decrement a primitive type
                    {"++1;", TSPHPParser.Int, 2},
                    {"--1;", TSPHPParser.Int, 2},
                    {"1++;", TSPHPParser.PlusPlus, 1},
                    {"1--;", TSPHPParser.MinusMinus, 1},
                    {"++1.0;", TSPHPParser.Float, 2},
                    {"--1.0;", TSPHPParser.Float, 2},
                    {"1.1++;", TSPHPParser.PlusPlus, 3},
                    {"1.1--;", TSPHPParser.MinusMinus, 3},
                });
    }
}