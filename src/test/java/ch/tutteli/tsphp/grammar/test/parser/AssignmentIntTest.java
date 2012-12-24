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

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class AssignmentIntTest extends AParserTest
{

    public AssignmentIntTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //testIntDecAssignment
                    {"int $a = 1;"},
                    {"int $b = 1234567890;"},
                    {"int $c = +123;"},
                    {"int $d = -87495;"},
                    //testIntHexAssignment
                    {"int $a = 0x1; "},
                    {"int $b = 0xabcdefABCDEF1234567890;"},
                    {"int $c = -0xA12f;"},
                    {"int $d = +0x1abc;"},
                    //testIntOctAssignment
                    {"int $a = 01; "},
                    {"int $b = 01234567;"},
                    {"int $c = +074;"},
                    {"int $d = -01723;"},
                    //testIntBinAssignment
                    {"int $a = 0b1; "},
                    {"int $b = 0b0101010111100001;"},
                    {"int $c = +0b111;"},
                    {"int $d = -0b00000001;"},
                });

        //
    }
}
