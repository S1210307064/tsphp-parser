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
package ch.tutteli.tsphp.grammar;

import ch.tutteli.tsphp.grammar.utils.ALexerExceptionTest;
import ch.tutteli.tsphp.grammar.utils.VariantionHelper;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class VariableDeclarationWrongTypeLexerTest extends ALexerExceptionTest
{

    public VariableDeclarationWrongTypeLexerTest(String testString, char character, int position) {
        super(testString, RecognitionException.class,(int) character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> variables() {
        Collection<Object[]> collection = VariantionHelper.getUpperCaseVariations(new String[]{
                    "bool",
                    "boolean",
                    "int",
                    "float",
                    "string",
                    "array",
                    "resource"
                }, "", " $a;");
        collection.add(new Object[]{"qwert $a;", 'q', 0});
        return collection;
    }
}
