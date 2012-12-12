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

import ch.tutteli.tsphp.grammar.utils.AParserExceptionTest;
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
public class AssignmentWrongBoolParserTest extends AParserExceptionTest
{

    public AssignmentWrongBoolParserTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"bool $a = 1;", TSPHPParser.INT, 10},
                    {"bool $a = 0;", TSPHPParser.INT, 10},
                    {"bool $a = '';", TSPHPParser.STRING_SINGLE_QUOTED, 10},
                    {"bool $a = 'true';", TSPHPParser.STRING_SINGLE_QUOTED, 10},
                    {"bool $a = 'false';", TSPHPParser.STRING_SINGLE_QUOTED, 10},
                    {"bool $a = '1';", TSPHPParser.STRING_SINGLE_QUOTED, 10},
                    {"bool $a = '0';", TSPHPParser.STRING_SINGLE_QUOTED, 10},
                    {"bool $a = 1.0;", TSPHPParser.FLOAT, 10},
                    {"bool $a = 0.0;", TSPHPParser.FLOAT, 10},
                    {"boolean $a = \"\";", TSPHPParser.STRING_DOUBLE_QUOTED, 13},
                    {"boolean $a = \"true\";", TSPHPParser.STRING_DOUBLE_QUOTED, 13},
                    {"boolean $a = \"false\";", TSPHPParser.STRING_DOUBLE_QUOTED, 13},
                    {"boolean $a = \"0\";", TSPHPParser.STRING_DOUBLE_QUOTED, 13},
                    {"boolean $a = \"1\";", TSPHPParser.STRING_DOUBLE_QUOTED, 13},});
    }
}
