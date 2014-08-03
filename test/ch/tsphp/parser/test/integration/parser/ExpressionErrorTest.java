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
public class ExpressionErrorTest extends AParserParserExceptionTest
{

    public ExpressionErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
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
                    {"1 === 2 == 3;", TSPHPParser.Equal, 8},
                    {"1 === 2 === 3;", TSPHPParser.Identical, 8},
                    {"1 === 2 != 3;", TSPHPParser.NotEqual, 8},
                    {"1 === 2 !== 3;", TSPHPParser.NotIdentical, 8},
                    {"1 != 2 == 3;", TSPHPParser.Equal, 7},
                    {"1 != 2 === 3;", TSPHPParser.Identical, 7},
                    {"1 != 2 != 3;", TSPHPParser.NotEqual, 7},
                    {"1 != 2 !== 3;", TSPHPParser.NotIdentical, 7},
                    {"1 !== 2 == 3;", TSPHPParser.Equal, 8},
                    {"1 !== 2 === 3;", TSPHPParser.Identical, 8},
                    {"1 !== 2 != 3;", TSPHPParser.NotEqual, 8},
                    {"1 !== 2 !== 3;", TSPHPParser.NotIdentical, 8},
                    //increment/decrement a primitive type
                    {"++1;", TSPHPParser.Int, 2},
                    {"--1;", TSPHPParser.Int, 2},
                    {"1++;", TSPHPParser.PlusPlus, 1},
                    {"1--;", TSPHPParser.MinusMinus, 1},
                    {"++1.0;", TSPHPParser.Float, 2},
                    {"--1.0;", TSPHPParser.Float, 2},
                    {"1.1++;", TSPHPParser.PlusPlus, 3},
                    {"1.1--;", TSPHPParser.MinusMinus, 3},
                    {"++'a';", TSPHPParser.String, 2},
                    {"--'a';", TSPHPParser.String, 2},
                    {"'a'++;", TSPHPParser.PlusPlus, 3},
                    {"'a'--;", TSPHPParser.MinusMinus, 3},
                    //semicolon is expected because the parser thinks its a sMemAccess
                    {"++E_ALL;", TSPHPParser.Semicolon, 7},
                    {"--E_ALL;", TSPHPParser.Semicolon, 7},
                    {"E_ALL++;", TSPHPParser.PlusPlus, 5},
                    {"E_ALL--;", TSPHPParser.MinusMinus, 5},
                    //not allowed casts
                    {"(object) $a;", TSPHPParser.TypeObject, 1},
                    //misuse instanceof operator - does not work with primitive types
                    {"$a instanceof bool;", TSPHPParser.TypeBool, 14},
                    {"$a instanceof int;", TSPHPParser.TypeInt, 14},
                    {"$a instanceof float;", TSPHPParser.TypeFloat, 14},
                    {"$a instanceof string;", TSPHPParser.TypeString, 14},
                    {"$a instanceof array;", TSPHPParser.TypeArray, 14},
                    {"$a instanceof resource;", TSPHPParser.TypeResource, 14},
                    {"$a instanceof object;", TSPHPParser.TypeObject, 14}
                });
    }
}
