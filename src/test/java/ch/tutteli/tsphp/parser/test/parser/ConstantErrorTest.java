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

import ch.tutteli.tsphp.parser.TSPHPParser;
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
public class ConstantErrorTest extends AParserParserExceptionTest
{

    public ConstantErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{ const float $a=1.0;}", TSPHPParser.VariableId, 21},
                    {"class a{ const float a;}", TSPHPParser.Semicolon, 22},
                    {"class a{ const float a=1.0+1.0;}", TSPHPParser.Plus, 26},
                    {"class a{ const float a=[1,2];}", TSPHPParser.LeftSquareBrace, 23},
                    {"class a{ const array a=1;}", TSPHPParser.TypeArray, 15},
                    {"interface a{ const float $a=1.0;}", TSPHPParser.VariableId, 25},
                    {"interface a{ const float a;}", TSPHPParser.Semicolon, 26},
                    {"interface a{ const float a=1.0+1.0;}", TSPHPParser.Plus, 30},
                    {"interface a{ const float a=[1,2];}", TSPHPParser.LeftSquareBrace, 27},
                    {"interface a{ const array a=1;}", TSPHPParser.TypeArray,19},
                });
    }
}
