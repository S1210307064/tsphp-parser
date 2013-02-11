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
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.utils.AParserParserExceptionTest;
import java.util.Arrays;
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
public class ClassErrorTest extends AParserParserExceptionTest
{

    public ClassErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //abstract and final mixed
                    {"abstract final class A{function void a(int $a=null,$b){}}", TSPHPParser.Final, 9},
                    {"final abstract class A{function void a(int $a=null,$b){}}", TSPHPParser.Abstract, 6},
                    //classes have no access modifier - at least not yet.
                    {"private class A{function void a(int $a=null,$b){}}", TSPHPParser.Private, 0},
                    {"protected class A{function void a(int $a=null,$b){}}", TSPHPParser.Protected, 0},
                    {"public class A{function void a(int $a=null,$b){}}", TSPHPParser.Public, 0},
                    
        });
        
    }
}
