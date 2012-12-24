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
import ch.tutteli.tsphp.grammar.test.utils.IdentifierHelper;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
        super.parseAndCheckForException();
    }

    @Parameters
    public static Collection<Object[]> variables() {
        return Arrays.asList(new Object[][]{
                    {"bool $a;"},
                    {"boolean $A;"},
                    {"int $_;"},
                    {"float $" + IdentifierHelper.asciiToString(165) + ";"},
                    {"string \n $" + IdentifierHelper.getAllLowerCaseCharacters() + ";"},
                    {"array \t $" + IdentifierHelper.getAllUpperCaseCharacters() + ";"},
                    {"resource                 $a" + IdentifierHelper.getAllDigits() + ";        "},
                    {"bool $" + IdentifierHelper.getAllSpecialCharacters() + ";"},
                    {"boolean $_; \n $_; \t $_____________________________;"},
                    {"int \n $" + IdentifierHelper.asciiToString(128) + IdentifierHelper.asciiToString(165) + ";"},
                    {"float $aA_; \n $_a; \t $_A;"},
                    {"string $a11238281102A;"},
                    {"int $a1123ääöä82£81102A;"},
                    {"array $bool;"},
                    {"resource $boolean;"},
                    {"int $int;"},
                    {"int $float;"},
                    {"int $string;"},
                    {"int $array;"},
                    {"int $resource;"},
                    
                });
    }
}
