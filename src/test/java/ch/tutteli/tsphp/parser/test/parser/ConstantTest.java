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

import ch.tutteli.tsphp.parser.test.lexer.FragmentsTest;
import ch.tutteli.tsphp.parser.test.lexer.TokenTest;
import ch.tutteli.tsphp.parser.test.utils.AParserTest;
import ch.tutteli.tsphp.parser.test.utils.VariationHelper;
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
public class ConstantTest extends AParserTest
{

    public ConstantTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"class a{ const string a='a';}"},
                    {"class a{ const string a='a',b=1;}"},
                    {"class a{ const string a='a',b=1,c='hallo';}"},
                    {"interface a{ const string a='a';}"},
                    {"interface a{ const string a='a',b=1;}"},
                    {"interface a{ const string a='a',b=1,c='hallo';}"}
                }));

        Collection<Object[]> intFragments = FragmentsTest.getIntFragments();
        for (Object[] obj : intFragments) {
            collection.add(new Object[]{"const int i=" + obj[1] + ";"});
            collection.add(new Object[]{"class a{const int i=" + obj[1] + ";}"});
            collection.add(new Object[]{"interface a{const int i=" + obj[1] + ";}"});
        }

        Collection<Object[]> stringFragments = FragmentsTest.getStringFragments();
        for (Object[] obj : stringFragments) {
            collection.add(new Object[]{"const string i=" + obj[1] + ";"});
            collection.add(new Object[]{"class a{const string i=" + obj[1] + ";}"});
            collection.add(new Object[]{"interface a{const string i=" + obj[1] + ";}"});
        }

        String[] floatTestStrings = TokenTest.getFloatTestStrings();
        for (String string : floatTestStrings) {
            collection.add(new Object[]{"const string i=" + string + ";"});
            collection.add(new Object[]{"class a{const string i=" + string + ";}"});
            collection.add(new Object[]{"interface a{const string i=" + string + ";}"});
        }
        
        String[] nullCombinations = VariationHelper.getUppercaseCombinations("null");
        for (String combination : nullCombinations) {
            collection.add(new Object[]{"const string i=" + combination + ";"});
            collection.add(new Object[]{"class a{const string i=" + combination + ";}"});
            collection.add(new Object[]{"interface a{const string i=" + combination + ";}"});
        }

        return collection;
    }
}
