/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import ch.tsphp.parser.test.integration.testutils.VariationHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class KeywordErrorTest extends AParserParserExceptionTest
{

    public KeywordErrorTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> vars() {
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
                    {"boolean", TSPHPParser.TypeAliasBool},
                    {"break", TSPHPParser.Break},
                    {"case", TSPHPParser.Case},
                    {"cast",TSPHPParser.Cast},
                    {"catch", TSPHPParser.Catch},
                    {"class", TSPHPParser.Class},
                    {"clone", TSPHPParser.Clone},
                    {"const", TSPHPParser.Const},
                    {"__construct",TSPHPParser.Construct},
                    {"continue", TSPHPParser.Continue},
                    {"__destruct",TSPHPParser.Destruct},
                    {"default", TSPHPParser.Default},
                    {"do", TSPHPParser.Do},
                    {"double", TSPHPParser.TypeAliasFloat},
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
                    {"integer", TSPHPParser.TypeAliasInt},
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
