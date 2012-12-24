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
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class VariantionHelper
{

    private VariantionHelper() {
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
                            TSPHPParser.NamespaceId,
                            prefixLenght
                        });
            }
        }
        return collection;
    }
}
