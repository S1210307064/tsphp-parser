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

import ch.tutteli.tsphp.grammar.TSPHPParser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class VariationHelper
{
    private VariationHelper() {
    }

    public static List<Object[]> getUpperCaseVariations(String[] texts, String prefix, String appendix) {
        List<Object[]> collection = new ArrayList<>();
        int prefixLenght = prefix.length();
        for (String text : texts) {
            int length = text.length();
            String tmp = text.toLowerCase();
            for (int i = 0; i < length; ++i) {
                String before = i != 0 ? tmp.substring(0, i) : "";

                String upper = tmp.substring(i, i + 1).toUpperCase();

                String after = i + 1 != length ? tmp.substring(i + 1, length) : "";

                collection.add(new Object[]{
                            prefix + before + upper + after + appendix,
                            TSPHPParser.Identifier,
                            prefixLenght
                        });
            }
        }
        return collection;
    }

    public static String[] getUppercaseCombinations(String token) {
        int tokenLenght = token.length();
        String character = token.substring(0, 1);
        String characterUpperCase = character.toUpperCase();

        String[] combinations;
        if (tokenLenght > 1) {
            combinations = new String[(int) Math.pow(2, tokenLenght)];
            String[] subCombinations = getUppercaseCombinations(token.substring(1));
            for (int i = 0; i < subCombinations.length; ++i) {
                combinations[i * 2] = character + subCombinations[i];
                combinations[i * 2 + 1] = characterUpperCase + subCombinations[i];
            }

        } else {
            combinations = new String[]{character, characterUpperCase};
        }

        return combinations;
    }
}
