/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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

import ch.tutteli.tsphp.parser.test.lexer.TokenTest;
import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
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
public class ClassInterfaceTypeWithoutObjectTest extends AParserTest
{

    public ClassInterfaceTypeWithoutObjectTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

     protected void run() throws RecognitionException {
        result = parser.classInterfaceTypeWithoutObject();
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Collection<Object[]> idTestStrings = TokenTest.getIDTestStrings();
        for (Object[] obj : idTestStrings) {
            collection.add(new String[]{obj[1] + ""});
            collection.add(new String[]{obj[1] + "\\" + obj[1]});
            collection.add(new String[]{obj[1] + "\\" + obj[1] + "\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1] + "\\" + obj[1]});
            collection.add(new String[]{"\\" + obj[1] + "\\" + obj[1] + "\\" + obj[1]});
        }
        return collection;
    }
}
