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
package ch.tutteli.tsphp.grammar.test.lexer;

import ch.tutteli.tsphp.grammar.TSPHPLexer;
import ch.tutteli.tsphp.grammar.test.utils.ALexerTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class LexerTokensTest extends ALexerTest
{

    public LexerTokensTest(String methodName, String testString, int type) {
        super(methodName, testString, type);
    }

    @Test
    public void testTokens() throws Exception {
        super.analyseAndCheckForError();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mArrow", "=>", TSPHPLexer.Arrow},
                    {"mBool", "true", TSPHPLexer.Bool},
                    {"mBool", "false", TSPHPLexer.Bool},
                    {"mComma", ",", TSPHPLexer.Comma},
                    {"mElse", "else", TSPHPLexer.Else},
                    {"mEqual", "=", TSPHPLexer.Equal},
                    {"mDolar", "$", TSPHPLexer.Dolar},
                    {"mFunction", "function", TSPHPLexer.Function},
                    {"mIf", "if", TSPHPLexer.If},
                    {"mLeftCurlyBrace", "{", TSPHPLexer.LeftCurlyBrace},
                    {"mLeftParanthesis", "(", TSPHPLexer.LeftParanthesis},
                    {"mLeftSquareBrace", "[", TSPHPLexer.LeftSquareBrace},
                    {"mNamespace", "namespace", TSPHPLexer.Namespace},
                    {"mRightCurlyBrace", "}", TSPHPLexer.RightCurlyBrace},
                    {"mRightParanthesis", ")", TSPHPLexer.RightParanthesis},
                    {"mRightSquareBrace", "]", TSPHPLexer.RightSquareBrace},
                    {"mTypeArray", "array", TSPHPLexer.TypeArray},
                    {"mTypeBool", "bool", TSPHPLexer.TypeBool},
                    {"mTypeBoolean", "boolean", TSPHPLexer.TypeBoolean},
                    {"mTypeFloat", "float", TSPHPLexer.TypeFloat},
                    {"mTypeInt", "int", TSPHPLexer.TypeInt},
                    {"mTypeResource", "resource", TSPHPLexer.TypeResource},
                    {"mTypeString", "string", TSPHPLexer.TypeString},
                    {"mSemicolon", ";", TSPHPLexer.Semicolon}
                }));

        String[] floatStrings = getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"mFloat", floatString, TSPHPLexer.Float});
        }
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"mFloat", "+" + floatString, TSPHPLexer.Float});
        }
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"mFloat", "-" + floatString, TSPHPLexer.Float});
        }

        Collection<Object[]> intCollection = LexerFragmentsTest.getIntFragments();
        for (Object[] obj : intCollection) {
            collection.add(new Object[]{"mInt", obj[1], TSPHPLexer.Int});
        }

        Collection<Object[]> idCollection = LexerFragmentsTest.getIDTestStrings();
        for (Object[] obj : idCollection) {
            collection.add(new Object[]{"mNamespaceId", obj[1], TSPHPLexer.NamespaceId});
        }

        Collection<Object[]> stringCollection = LexerFragmentsTest.getStringFragments();
        for (Object[] obj : stringCollection) {
            collection.add(new Object[]{"mString", obj[1], TSPHPLexer.String});
        }

        return collection;
    }

    private static String[] getFloatTestStrings() {
        return new String[]{"1234567890.19876543201",
                    "1234567890.19876543201e7845120963",
                    "1234567890.19876543201e+7538964120",
                    "1234567890.19876543201e-9510236478",
                    ".4567891203",
                    ".4567891203e7418520963",
                    ".4567891203e+0147258369",
                    ".4567891203e-1024578963",
                    ".0",
                    "0.0",
                    "0.0e0",
                    "0.0e+0",
                    "0.0e-0"};
    }
}
