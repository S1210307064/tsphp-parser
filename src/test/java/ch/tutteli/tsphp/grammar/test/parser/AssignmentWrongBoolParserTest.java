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
import ch.tutteli.tsphp.grammar.test.utils.VariantionHelper;
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
public class AssignmentWrongBoolParserTest extends AParserParserExceptionTest
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
        Collection<Object[]>  variations = VariantionHelper.getUpperCaseVariations(new String[]{"true", "false"}, "bool $a =", ";");
        variations.addAll(Arrays.asList(new Object[][]{
                    {"bool $a = 1;", TSPHPParser.Int, 10},
                    {"bool $a = 0;", TSPHPParser.Int, 10},
                    {"bool $a = '';", TSPHPParser.String, 10},
                    {"bool $a = 'true';", TSPHPParser.String, 10},
                    {"bool $a = 'false';", TSPHPParser.String, 10},
                    {"bool $a = '1';", TSPHPParser.String, 10},
                    {"bool $a = '0';", TSPHPParser.String, 10},
                    {"bool $a = 1.0;", TSPHPParser.Float, 10},
                    {"bool $a = 0.0;", TSPHPParser.Float, 10},
                    {"boolean $a = \"\";", TSPHPParser.String, 13},
                    {"boolean $a = \"true\";", TSPHPParser.String, 13},
                    {"boolean $a = \"false\";", TSPHPParser.String, 13},
                    {"boolean $a = \"0\";", TSPHPParser.String, 13},
                    {"boolean $a = \"1\";", TSPHPParser.String, 13}
                }));
        return variations;
                        

    }
}
