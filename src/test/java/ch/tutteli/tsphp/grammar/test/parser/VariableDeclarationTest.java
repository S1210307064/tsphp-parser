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

import ch.tutteli.tsphp.grammar.test.lexer.TokenTest;
import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class VariableDeclarationTest extends AParserTest
{

    public VariableDeclarationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList();
        List<String> types = getAllTypes();
        for (String type : types) {
            collection.add(new Object[]{type + " $d = 1;"});
        }
        return collection;

    }

    public static List<String> getAllTypes() {
        List<String> types = new ArrayList<>();
        String[] primitiveTypes = getPrimitiveTypes();
        types.addAll(Arrays.asList(primitiveTypes));
        types.addAll(getClassInterfaceTypes());
        return types;
    }

    public static List<String> getClassInterfaceTypes() {
        List<String> types = new ArrayList<>();
        Collection<Object[]> idTestStrings = TokenTest.getIDTestStrings();
        for (Object[] obj : idTestStrings) {
            types.add(obj[1] + "");
            types.add(obj[1] + "\\" + obj[1]);
            types.add(obj[1] + "\\" + obj[1] + "\\" + obj[1]);
            types.add("\\" + obj[1]);
            types.add("\\" + obj[1] + "\\" + obj[1] );
            types.add("\\" + obj[1] + "\\" + obj[1] + "\\" + obj[1]);
        }
        return types;
    }

    public static String[] getPrimitiveTypes() {
        return new String[]{"bool", "boolean", "int", "float", "string", "array", "resource", "object"};
    }
}
