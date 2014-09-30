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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class IncrementDecrementErrorTest extends AParserParserExceptionTest
{

    public IncrementDecrementErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Override
    protected void run() throws RecognitionException {
        parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Object[][] operators = new Object[][]{
                {"++", TSPHPParser.PlusPlus},
                {"--", TSPHPParser.MinusMinus}
        };
        for (Object[] op : operators) {
            collection.addAll(Arrays.asList(new Object[][]{
                    {op[0] + "foo();", TSPHPParser.LeftParenthesis, 5},
                    //semicolon is wrong since it expects a fieAccess after a mCall
                    {op[0] + "$a->foo();", TSPHPParser.Semicolon, 11},
                    {op[0] + "$a[0]->foo();", TSPHPParser.Semicolon, 14},
                    {op[0] + "$a->a->foo();", TSPHPParser.Semicolon, 14},
                    {op[0] + "$a->bar()->foo();", TSPHPParser.Semicolon, 18},
                    {op[0] + "$this->foo();", TSPHPParser.Semicolon, 14},
                    {op[0] + "$this[0]->foo();", TSPHPParser.Semicolon, 17},
                    {op[0] + "$this->a->foo();", TSPHPParser.Semicolon, 17},
                    {op[0] + "$this->bar()->foo();", TSPHPParser.Semicolon, 21},
                    {op[0] + "self::$a->foo();", TSPHPParser.Semicolon, 17},
                    {op[0] + "self::$a[0]->foo();", TSPHPParser.Semicolon, 20},
                    {op[0] + "self::$a->a->foo();", TSPHPParser.Semicolon, 20},
                    {op[0] + "self::$a->bar()->foo();", TSPHPParser.Semicolon, 24},
                    {op[0] + "parent::$a->foo();", TSPHPParser.Semicolon, 19},
                    {op[0] + "parent::$a[0]->foo();", TSPHPParser.Semicolon, 22},
                    {op[0] + "parent::$a->a->foo();", TSPHPParser.Semicolon, 22},
                    {op[0] + "parent::$a->bar()->foo();", TSPHPParser.Semicolon, 26},
                    {op[0] + "Asdf::$a->foo();", TSPHPParser.Semicolon, 17},
                    {op[0] + "Asdf::$a[0]->foo();", TSPHPParser.Semicolon, 20},
                    {op[0] + "Asdf::$a->a->foo();", TSPHPParser.Semicolon, 20},
                    {op[0] + "Asdf::$a->bar()->foo();", TSPHPParser.Semicolon, 24},

                    {"$a->foo()" + op[0] + ";", op[1], 9},
                    {"$a[0]->foo()" + op[0] + ";", op[1], 12},
                    {"$a->a->foo()" + op[0] + ";", op[1], 12},
                    {"$a->bar()->foo()" + op[0] + ";", op[1], 16},
                    {"$this->foo()" + op[0] + ";", op[1], 12},
                    {"$this[0]->foo()" + op[0] + ";", op[1], 15},
                    {"$this->a->foo()" + op[0] + ";", op[1], 15},
                    {"$this->bar()->foo()" + op[0] + ";", op[1], 19},
                    {"self::$a->foo()" + op[0] + ";", op[1], 15},
                    {"self::$a[0]->foo()" + op[0] + ";", op[1], 18},
                    {"self::$a->a->foo()" + op[0] + ";", op[1], 18},
                    {"self::$a->bar()->foo()" + op[0] + ";", op[1], 22},
                    {"parent::$a->foo()" + op[0] + ";", op[1], 17},
                    {"parent::$a[0]->foo()" + op[0] + ";", op[1], 20},
                    {"parent::$a->a->foo()" + op[0] + ";", op[1], 20},
                    {"parent::$a->bar()->foo()" + op[0] + ";", op[1], 24},
                    {"Asdf::$a->foo()" + op[0] + ";", op[1], 15},
                    {"Asdf::$a[0]->foo()" + op[0] + ";", op[1], 18},
                    {"Asdf::$a->a->foo()" + op[0] + ";", op[1], 18},
                    {"Asdf::$a->bar()->foo()" + op[0] + ";", op[1], 22},
            }));
        }
        return collection;
    }
}