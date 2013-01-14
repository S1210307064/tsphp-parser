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
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class HiddenTokensTest extends ALexerTest
{

    public HiddenTokensTest(String methodName, String testString, int type) {
        super(methodName, testString, type,TSPHPLexer.HIDDEN);
    }

    @Test
    public void testTokens() throws Exception {
        analyseAndCheckForError();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"mComment", "//bla", TSPHPLexer.Comment},
                    {"mComment", "// bla \t !", TSPHPLexer.Comment},
                    {"mComment", "// bla \r\n", TSPHPLexer.Comment},
                    {"mComment", "// bla \n", TSPHPLexer.Comment},
                    {"mComment", "/* \n a \n bla bla */", TSPHPLexer.Comment},
                    {"mComment", "/** \n* a \n* bla bla \t **/", TSPHPLexer.Comment},
                    {"mWhitespace", " ", TSPHPLexer.Whitespace},
                    {"mWhitespace", "\n", TSPHPLexer.Whitespace},
                    {"mWhitespace", "\t", TSPHPLexer.Whitespace},
                    {"mWhitespace", "\r", TSPHPLexer.Whitespace},
                });
    }
}
