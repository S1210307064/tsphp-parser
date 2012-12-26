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

import ch.tutteli.tsphp.grammar.test.lexer.FragmentsTest;
import ch.tutteli.tsphp.grammar.test.lexer.TokenTest;
import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class VariableAssignmentTest extends AParserTest
{

    public VariableAssignmentTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
        collection.add(new Object[]{"$bool = true;"});
        collection.add(new Object[]{"$bool = false;"});
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"$array = " + string + ";"});
        }

        Collection<Object[]> intTestStrings = FragmentsTest.getIntFragments();
        for (Object[] obj : intTestStrings) {
            collection.add(new Object[]{"$int = " + obj[1] + ";"});
            collection.add(new Object[]{"$int = +" + obj[1] + ";"});
            collection.add(new Object[]{"$int = -" + obj[1] + ";"});
        }

        String[] floatStrings = TokenTest.getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"$float = " + floatString + ";"});
            collection.add(new Object[]{"$float = +" + floatString + ";"});
            collection.add(new Object[]{"$float = -" + floatString + ";"});
        }

        Collection<Object[]> stringTestStrings = FragmentsTest.getStringFragments();
        for(Object[] obj: stringTestStrings){
            collection.add(new Object[]{"$string = "+obj[1]+";"});
        }
               
        
        return collection;
    }
}
