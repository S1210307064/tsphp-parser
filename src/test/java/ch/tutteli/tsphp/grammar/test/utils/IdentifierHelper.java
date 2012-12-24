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
package ch.tutteli.tsphp.grammar.test.utils;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class IdentifierHelper
{

    private IdentifierHelper() {
    }

    public static String getAllLowerCaseCharacters() {
        return getCharacterFromStartToEndAsString(97, 122);
    }

    public static String getAllUpperCaseCharacters() {
        return getCharacterFromStartToEndAsString(65, 90);
    }

    public static String getAllDigits() {
        return getCharacterFromStartToEndAsString(48, 57);
    }

    public static String getAllSpecialCharacters() {
        return getCharacterFromStartToEndAsString(127, 255);
    }

    public static String getCharacterFromStartToEndAsString(int start, int end) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 127; i <= 255; ++i) {
            buffer.append((char) i);
        }
        return buffer.toString();
    }

    public static String asciiToString(int asciiCode) {
        return String.valueOf((char) asciiCode);
    }
}
