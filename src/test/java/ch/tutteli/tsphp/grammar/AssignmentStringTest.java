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

import ch.tutteli.tsphp.grammar.utils.ATest;
import ch.tutteli.tsphp.grammar.utils.IdentifierHelper;
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
public class AssignmentStringTest extends ATest
{

    public AssignmentStringTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //testStringSingleQuotedAssignment
                    {"string $a = 'test';"},
                    {"string $a = '"
                        + IdentifierHelper.getCharacterFromStartToEndAsString(0, 35)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(37, 38)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(40, 10055)
                        + "';"},
                    {"string $a = '\\\\ \\\' \\\\\\\' \\\'\\\\ ';"},
                    {"string $a = '\\n \\r \\t \\e \\f \\\" \\$';"},
                    {"string $a = '\\'& \\'[ \\'] ';"},
                    {"string $a = ' \\& \\[  \\] ';"},
                    {"string $a = ' & [  ] \\ ';"},
                    //testStringDoubleQuotedAssignment
                    {"string $a = \"123\";"},
                    {"string $a = \""
                        + IdentifierHelper.getCharacterFromStartToEndAsString(0, 33)
                        + IdentifierHelper.asciiToString(35)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(37, 12255)
                        + "\";"},
                    {"string $a = \" \\\\ \\\" \\\\\\\" \\\"\\\\ \";"},
                    {"string $a = \"\\n \\r \\t \\e \\f \\\" \\$ \\' \";"},
                    {"string $a = \"\\\"! \\\"# \\\"[ \\\"] \";"},
                    {"string $a = \"\\$! \\$# \\$[ \\$] \";"},
                    {"string $a = \"\\! \\# \\[ \\] \\ \";"},
                    {"string $a = \"! # [ ] \";"},
                    {"string $a = \" \\n \";"},
                    {"string $a = \" \\r \";"},
                    {"string $a = \" \\t  \";"},
                    {"string $a = \" \\v \";"},
                    {"string $a = \" \\e \";"},
                    {"string $a = \" \\f \";"},
                    {"string $a = \" \\\" \";"},
                    {"string $a = \" \\$ \";"},
                    {"string $a = \" \\00 \\01 \\02 \\03 \\04 \\05 \\06 \\07 \\01234567 \";"},
                    {"string $a = \" \\x0 \\x1 \\x2 \\x3 \\x4 \\x5 \\x6 \\x7 \\x8 \\x9 \\XA \\XB \\XC \\XD \\xE \\xF \\Xa \\Xb \\xc \\xd \\xe \\xf \";"},
                    {"string $a = \" a \\\\ b \\\\n c \\\\r d \\\\t e \\\\v f \\\\e g \\\\f h \\\"\";"},});
    }
}
