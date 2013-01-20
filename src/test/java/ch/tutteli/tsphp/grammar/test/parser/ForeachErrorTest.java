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
public class ForeachErrorTest extends AParserParserExceptionTest
{

    public ForeachErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"foreach($a as $k=>$v)$a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) $a=1;", TSPHPParser.VariableId, 14},
                    {"foreach($a as $k=>$v){$a=1;}", TSPHPParser.VariableId, 14},
                    {"foreach($a as $v) {$a=1;}", TSPHPParser.VariableId, 14},
                    //
                    {"foreach($a as int $k=>$v)$a=1;", TSPHPParser.VariableId, 22},
                    {"foreach($a as int $k=>$v){$a=1;}", TSPHPParser.VariableId, 22}
                });
    }
}
