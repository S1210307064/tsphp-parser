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

import ch.tutteli.tsphp.grammar.utils.AParserTest;
import ch.tutteli.tsphp.grammar.utils.VariantionHelper;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.util.calendar.Era;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class VariableDeclarationWrongTypeTest extends AParserTest
{

    private int position;
    private char character;
    private Class<? extends RecognitionException> type;

    public VariableDeclarationWrongTypeTest(String testString, char aCharacter, int aPosition, Class<? extends RecognitionException> aType) {
        super(testString);
        noErrorsOnOutput();
        position = aPosition;
        character = aCharacter;
        type = aType;

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();

        List<RecognitionException> exceptions = lexer.getExceptions();;
        Assert.assertFalse(testString + " - ", exceptions.isEmpty());
        RecognitionException ex = exceptions.get(0);
        Assert.assertEquals(testString + " - wrong type", type, ex.getClass());
        Assert.assertEquals(testString + " - wrong character", character, ex.c);
        Assert.assertEquals(testString + " - wrong position", position, ex.charPositionInLine);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> variables() {
        Collection<Object[]> collection = VariantionHelper.getUpperCaseVariations(new String[]{
                    "int",
                    "float",
                    "string",
                    "array",
                    "resource"
                }, "", " $a;");
        collection.add(new Object[]{"Boolean",'B',0,NoViableAltException.class});
        collection.add(new Object[]{"bOolean",'b',0,NoViableAltException.class});
        collection.add(new Object[]{"boOlean",'b',0,NoViableAltException.class});
        collection.add(new Object[]{"booLean",'b',0,NoViableAltException.class});
        collection.add(new Object[]{"boolEan",'E',4,NoViableAltException.class});
        collection.add(new Object[]{"booleAn",'A',5,MismatchedTokenException.class});
        collection.add(new Object[]{"booleaN",'N',6,MismatchedTokenException.class});
        collection.add(new Object[]{"qwert",'q',0,NoViableAltException.class});
        collection.add(new Object[]{"1234",'1',0,NoViableAltException.class});
        return collection;
    }
}
