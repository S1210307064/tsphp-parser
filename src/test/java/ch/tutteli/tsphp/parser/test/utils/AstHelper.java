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
package ch.tutteli.tsphp.parser.test.utils;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class AstHelper
{

    private AstHelper() {
    }

    public static void addToCollection(List<Object[]> collection, Collection<Object[]> testStrings,
            String prefixInput, String appendixInput, String prefixResult, String appendixResult, int max) {
        int count = 0;
        for (Object[] testString : testStrings) {
            collection.add(new Object[]{prefixInput + testString[0] + appendixInput, prefixResult + testString[1] + appendixResult});
            ++count;
            if (count >= max) {
                break;
            }
        }
    }
}
