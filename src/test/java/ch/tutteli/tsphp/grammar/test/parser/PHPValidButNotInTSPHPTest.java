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

import ch.tutteli.tsphp.grammar.TSPHPParser;
import ch.tutteli.tsphp.grammar.test.utils.AParserParserExceptionTest;
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
public class PHPValidButNotInTSPHPTest extends AParserParserExceptionTest
{

    public PHPValidButNotInTSPHPTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //switch with case label but without command => same as an empty block
                    {"switch($a){case 1:}", TSPHPParser.RightCurlyBrace, 18},
                    //switch with case labels but without command => same as an empty block
                    {"switch($a){case 1: case 2:}", TSPHPParser.RightCurlyBrace, 26},
                    //switch case label without command
                    {"switch($a){case 1: $a=1; case 2:}", TSPHPParser.RightCurlyBrace, 32},
                    //switch case label without command
                    {"switch($a){case 1: $a=1; case 2: case 3:}", TSPHPParser.RightCurlyBrace, 40},
                    //switch default label without command
                    {"switch($a){case 1: $a=1; default:}", TSPHPParser.RightCurlyBrace, 33},
                    //switch only with default block
                    {"switch($a){default: $a=1;}", TSPHPParser.Default, 11},
                    //switch with case label do nothing more than default
                    {"switch($a){ case 1: default: $a=1;}", TSPHPParser.Default, 20},
                    //switch with case labels do nothing more than default
                    {"switch($a){ case 1: case 2: default: $a=1;}", TSPHPParser.Default, 28},
                    //switch with case labels do nothing more than default
                    {"switch($a){ case 0: $a=1; case 1: case 2: default: $a=1;}", TSPHPParser.Default, 42},
                    //switch with multiple default blocks
                    {"switch($a){case 1: default: $a=1; break; case 2: default: $a=2; break;}", TSPHPParser.Default, 19},
                    //function with pseudo optional parameter
                    {"function a ($a,$b=1,$c){$a=1;}", TSPHPParser.LeftParanthesis, 11},
                    //use outside of semicolon namespace
                    {"use a\\a; namespace a;", TSPHPParser.Namespace, 9},
                    //clone a new instance directly
                    {"Foo $foo = clone new Foo();", TSPHPParser.VariableId, 4}
                });
    }
}
