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
package ch.tutteli.tsphp.grammar.test.lexer;

import ch.tutteli.tsphp.grammar.test.utils.ALexerTest;
import ch.tutteli.tsphp.grammar.test.utils.IdentifierHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class LexerFragmentsTest extends ALexerTest
{

    public LexerFragmentsTest(String methodName, String testString) {
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception{
        super.analyseAndCheckForError();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mEXPONENT", "e0"},
                    {"mEXPONENT", "e1234075896"},
                    {"mEXPONENT", "e+0"},
                    {"mEXPONENT", "e+1234075896"},
                    {"mEXPONENT", "e-0"},
                    {"mEXPONENT", "e-1234075896"},}));
        collection.addAll(getIDTestStrings());
        collection.addAll(getIntFragments());
        collection.addAll(getStringFragments());

        return collection;
    }

    public static Collection<Object[]> getIDTestStrings() {
        List<Object[]> collection = new ArrayList<>();
        //first digit lower case a-z
        for (int i = 'a'; i < 'z'; ++i) {
            collection.add(new Object[]{"mID", IdentifierHelper.asciiToString(i)});
        }
        //first digit uper case a-z
        for (int i = 'A'; i < 'Z'; ++i) {
            collection.add(new Object[]{"mID", IdentifierHelper.asciiToString(i)});
        }
        //first digit special character
        for (int i = 127; i <= 255; ++i) {
            collection.add(new Object[]{"mID", IdentifierHelper.asciiToString(i)});
        }
        //first digit underscore
        collection.add(new Object[]{"mID", "_"});

        collection.addAll(Arrays.asList(new Object[][]{
                    {"mID", IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_"},
                    {"mID", IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_"},
                    {"mID", IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + "_"},
                    {"mID", "_" + IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits()},}));
        return collection;
    }

    public static Collection<Object[]> getIntFragments() {
        return Arrays.asList(new Object[][]{
                    {"mBINARY", "0b000001"},
                    {"mBINARY", "0b100001"},
                    {"mBINARY", "0b1"},
                    {"mBINARY", "0b0"},
                    {"mDECIMAL", "0"},
                    {"mDECIMAL", "1"},
                    {"mDECIMAL", "21023456789"},
                    {"mHEXADECIMAL", "0x0"},
                    {"mHEXADECIMAL", "0x1"},
                    {"mHEXADECIMAL", "0x1012456789"},
                    {"mHEXADECIMAL", "0xabcdef"},
                    {"mHEXADECIMAL", "0xABEDFC"},
                    {"mHEXADECIMAL", "0x1A2de45B7896E3DaFbCcf"},
                    {"mHEXADECIMAL", "0X0"},
                    {"mHEXADECIMAL", "0X1"},
                    {"mHEXADECIMAL", "0X1012456789"},
                    {"mHEXADECIMAL", "0Xabcdef"},
                    {"mHEXADECIMAL", "0XABEDFC"},
                    {"mHEXADECIMAL", "0X1A2de45B7896E3DaFbCcf"},
                    {"mOCTAL", "00"},
                    {"mOCTAL", "01"},
                    {"mOCTAL", "01234567"},
                    {"mOCTAL", "01247085963"}
                });
    }

    public static Collection<Object[]> getStringFragments() {

        return Arrays.asList(new Object[][]{
                    {"mSTRING_DOUBLE_QUOTED", "\"\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"123\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"1.3\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"1.3e10\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"true\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"false\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"" + IdentifierHelper.getAllDigits() + "\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"" + IdentifierHelper.getAllLowerCaseCharacters() + "\""},
                    {"mSTRING_DOUBLE_QUOTED", "\"" + IdentifierHelper.getAllUpperCaseCharacters() + "\""},
                    {"mSTRING_DOUBLE_QUOTED", "\""
                        + IdentifierHelper.getCharacterFromStartToEndAsString(0, 33)
                        + IdentifierHelper.asciiToString(35)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(37, 12255)
                        + "\""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\\\ \\\" \\\\\\\" \\\"\\\\ \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"\\n \\r \\t \\e \\f \\\" \\$ \\' \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"\\\"! \\\"# \\\"[ \\\"] \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"\\$! \\$# \\$[ \\$] \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"\\! \\# \\[ \\] \\ \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"! # [ ] \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\n \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\r \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\t  \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\v \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\e \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\f \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\\" \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\$ \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\00 \\01 \\02 \\03 \\04 \\05 \\06 \\07 \\01234567 \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\x0 \\x1 \\x2 \\x3 \\x4 \\x5 \\x6 \\x7 \\x8 \\x9 \\XA \\XB \\XC \\XD \\xE \\xF \\Xa \\Xb \\xc \\xd \\xe \\xf \""},
                    {"mSTRING_DOUBLE_QUOTED", "\"a \\\\ b \\\\n c \\\\r d \\\\t e \\\\v f \\\\e g \\\\f h \\\"\""},
                    {"mSTRING_SINGLE_QUOTED", "''"},
                    {"mSTRING_SINGLE_QUOTED", "'456'"},
                    {"mSTRING_SINGLE_QUOTED", "'58.0'"},
                    {"mSTRING_SINGLE_QUOTED", "'.456'"},
                    {"mSTRING_SINGLE_QUOTED", "'1578e10'"},
                    {"mSTRING_SINGLE_QUOTED", "'true'"},
                    {"mSTRING_SINGLE_QUOTED", "'false'"},
                    {"mSTRING_SINGLE_QUOTED", "'" + IdentifierHelper.getAllDigits() + "'"},
                    {"mSTRING_SINGLE_QUOTED", "'" + IdentifierHelper.getAllLowerCaseCharacters() + "'"},
                    {"mSTRING_SINGLE_QUOTED", "'" + IdentifierHelper.getAllUpperCaseCharacters() + "'"},
                    {"mSTRING_SINGLE_QUOTED", "'"
                        + IdentifierHelper.getCharacterFromStartToEndAsString(0, 35)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(37, 38)
                        + IdentifierHelper.getCharacterFromStartToEndAsString(40, 10055)
                        + "'"},
                    {"mSTRING_SINGLE_QUOTED", "'\\\\ \\\' \\\\\\\' \\\'\\\\ '"},
                    {"mSTRING_SINGLE_QUOTED", "'\\n \\r \\t \\e \\f \\\" \\$'"},
                    {"mSTRING_SINGLE_QUOTED", "'\\'& \\'[ \\'] '"},
                    {"mSTRING_SINGLE_QUOTED", "' \\& \\[  \\] '"},
                    {"mSTRING_SINGLE_QUOTED", "' & [  ] \\ '"},});
    }
}
