package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.lexer.FragmentsTest;
import ch.tutteli.tsphp.parser.test.integration.lexer.TokenTest;
import ch.tutteli.tsphp.parser.test.integration.testutils.VariationHelper;
import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
