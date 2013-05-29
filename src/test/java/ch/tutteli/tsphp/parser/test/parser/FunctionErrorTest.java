/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class FunctionErrorTest extends AParserParserExceptionTest
{

    public FunctionErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"function void a();",TSPHPParser.Semicolon,17});
        collection.add(new Object[]{"function void a(int $a=null, int $b){}", TSPHPParser.RightParanthesis, 35});
        //cast not allowed for object - see TSPHP-325
        collection.add(new Object[]{"function void a(cast object $a){}", TSPHPParser.TypeObject, 21});

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
                    {fixture + "(bool) 1" + "){}", TSPHPParser.LeftParanthesis, fixtureLength},
                    {fixture + "(int) 1" + "){}", TSPHPParser.LeftParanthesis, fixtureLength},
                    {fixture + "(string) 1" + "){}", TSPHPParser.LeftParanthesis, fixtureLength},
                    {fixture + "(array) 1" + "){}", TSPHPParser.LeftParanthesis, fixtureLength},
                    {fixture + "(Foo) 1" + "){}", TSPHPParser.LeftParanthesis, fixtureLength},
                    {fixture + "@1" + "){}", TSPHPParser.At, fixtureLength},
                    {fixture + "new Foo()" + "){}", TSPHPParser.New, fixtureLength},
                    {fixture + "clone $a" + "){}", TSPHPParser.Clone, fixtureLength},
                    {fixture + "$a" + "){}", TSPHPParser.VariableId, fixtureLength},
                    {fixture + "foo()" + "){}", TSPHPParser.LeftParanthesis, fixtureLength + 3},
                    {fixture + "$a[0]" + "){}", TSPHPParser.VariableId, fixtureLength},
                    {fixture + "$a->a" + "){}", TSPHPParser.VariableId, fixtureLength}
                }));

        return collection;
    }
}
