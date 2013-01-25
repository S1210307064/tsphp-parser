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
import ch.tutteli.tsphp.grammar.test.utils.VariationHelper;
import java.util.ArrayList;
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
public class KeywordErrorTest extends AParserParserExceptionTest
{

    public KeywordErrorTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> variables() {
        List<Object[]> collection = new ArrayList<>(6200);
        Object[][] keywords = getKeywords();
        for (Object[] keyword : keywords) {
            String[] keywordVariants = VariationHelper.getUppercaseCombinations((String) keyword[0]);
            for (String keywordVariant : keywordVariants) {
                collection.add(new Object[]{"class " + keywordVariant + "{private int $a=1;}", keyword[1], 6});
            }
        }
        return collection;

    }

    public static Object[][] getKeywords() {
        return new Object[][]{
                    {"abstract", TSPHPParser.Abstract},
                    {"array", TSPHPParser.TypeArray},
                    {"as", TSPHPParser.As},
                    {"bool", TSPHPParser.TypeBool},
                    {"boolean", TSPHPParser.TypeBoolean},
                    {"break", TSPHPParser.Break},
                    {"case", TSPHPParser.Case},
                    {"cast",TSPHPParser.Cast},
                    {"catch", TSPHPParser.Catch},
                    {"class", TSPHPParser.Class},
                    {"clone", TSPHPParser.Clone},
                    {"const", TSPHPParser.Const},
                    {"__construct",TSPHPParser.Construct},
                    {"continue", TSPHPParser.Continue},
                    {"__deconstruct",TSPHPParser.Deconstruct},
                    {"default", TSPHPParser.Default},
                    {"do", TSPHPParser.Do},
                    {"double", TSPHPParser.TypeDouble},
                    {"echo", TSPHPParser.Echo},
                    {"else", TSPHPParser.Else},
                    {"exit", TSPHPParser.Exit},
                    {"extends", TSPHPParser.Extends},
                    {"final", TSPHPParser.Final},
                    {"float", TSPHPParser.TypeFloat},
                    {"for", TSPHPParser.For},
                    {"foreach", TSPHPParser.Foreach},
                    {"function", TSPHPParser.Function},
                    {"if", TSPHPParser.If},
                    {"implements", TSPHPParser.Implements},
                    {"int", TSPHPParser.TypeInt},
                    {"integer", TSPHPParser.TypeInteger},
                    {"instanceof", TSPHPParser.Instanceof},
                    {"interface", TSPHPParser.Interface},
                    {"namespace", TSPHPParser.Namespace},
                    {"new", TSPHPParser.New},
                    {"object", TSPHPParser.TypeObject},
                    {"parent", TSPHPParser.Parent},
                    {"private", TSPHPParser.Private},
                    {"protected", TSPHPParser.Protected},
                    {"public", TSPHPParser.Public},
                    {"resource", TSPHPParser.TypeResource},
                    {"return", TSPHPParser.Return},
                    {"static", TSPHPParser.Static},
                    {"self", TSPHPParser.Self},
                    {"switch", TSPHPParser.Switch},
                    {"this", TSPHPParser.ProtectThis},
                    {"throw", TSPHPParser.Throw},
                    {"try", TSPHPParser.Try},
                    {"use", TSPHPParser.Use},
                    {"void", TSPHPParser.Void},
                    {"while", TSPHPParser.While}
                };
    }
}
