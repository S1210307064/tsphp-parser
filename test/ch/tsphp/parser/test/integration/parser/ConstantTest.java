/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.lexer.FragmentsTest;
import ch.tsphp.parser.test.integration.lexer.TokenTest;
import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.VariationHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ConstantTest extends AParserTest
{

    public ConstantTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
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
