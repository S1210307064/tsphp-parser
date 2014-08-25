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
public class FunctionErrorTest extends AParserParserExceptionTest
{

    public FunctionErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"function void a();",TSPHPParser.Semicolon,17});
        collection.add(new Object[]{"function void a(int $a=null, int $b){}", TSPHPParser.RightParenthesis, 35});
        //cast not allowed for mixed - see TSPHP-325
        collection.add(new Object[]{"function void a(cast mixed $a){}", TSPHPParser.TypeMixed, 21});

        String fixture = "function void a (int $a, int $b=";
        int fixtureLength = fixture.length();
        collection.addAll(Arrays.asList(new Object[][]{
                    {fixture + "true or false" + "){}", TSPHPParser.LogicOrWeak, fixtureLength + 5},
                    {fixture + "true || false" + "){}", TSPHPParser.LogicOr, fixtureLength + 5},
                    {fixture + "true ? 1:2" + "){}", TSPHPParser.QuestionMark, fixtureLength + 5},
                    {fixture + "1 & 1" + "){}", TSPHPParser.BitwiseAnd, fixtureLength + 2},
                    {fixture + "1 == 1" + "){}", TSPHPParser.Equal, fixtureLength + 2},
                    {fixture + "1 < 1" + "){}", TSPHPParser.LessThan, fixtureLength + 2},
                    {fixture + "1 >> 1" + "){}", TSPHPParser.ShiftRight, fixtureLength + 2},
                    {fixture + "1 + 1" + "){}", TSPHPParser.Plus, fixtureLength + 2},
                    {fixture + "1 * 1" + "){}", TSPHPParser.Multiply, fixtureLength + 2},
                    {fixture + "!true" + "){}", TSPHPParser.LogicNot, fixtureLength},
                    {fixture + "1 instanceof 2" + "){}", TSPHPParser.Instanceof, fixtureLength + 2},
                    {fixture + "~1" + "){}", TSPHPParser.BitwiseNot, fixtureLength},
                    {fixture + "(bool) 1" + "){}", TSPHPParser.LeftParenthesis, fixtureLength},
                    {fixture + "(int) 1" + "){}", TSPHPParser.LeftParenthesis, fixtureLength},
                    {fixture + "(string) 1" + "){}", TSPHPParser.LeftParenthesis, fixtureLength},
                    {fixture + "(array) 1" + "){}", TSPHPParser.LeftParenthesis, fixtureLength},
                    {fixture + "(Foo) 1" + "){}", TSPHPParser.LeftParenthesis, fixtureLength},
                    {fixture + "@1" + "){}", TSPHPParser.At, fixtureLength},
                    {fixture + "new Foo()" + "){}", TSPHPParser.New, fixtureLength},
                    {fixture + "clone $a" + "){}", TSPHPParser.Clone, fixtureLength},
                    {fixture + "$a" + "){}", TSPHPParser.VariableId, fixtureLength},
                    {fixture + "foo()" + "){}", TSPHPParser.LeftParenthesis, fixtureLength + 3},
                    {fixture + "$a[0]" + "){}", TSPHPParser.VariableId, fixtureLength},
                    {fixture + "$a->a" + "){}", TSPHPParser.VariableId, fixtureLength}
                }));

        return collection;
    }
}
