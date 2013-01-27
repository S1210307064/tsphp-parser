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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class VariableDeclarationListHelper
{

    private VariableDeclarationListHelper() {
    }

    public static Collection<Object[]> testStrings(String prefix, String appendix,
            String prefixExpected, String appendixExpected) {
        List<Object[]> collection = new ArrayList<>();
        String[][] types = TypeHelper.getClassInterfaceTypes();
        for (String[] type : types) {
            collection.add(new Object[]{
                        prefix + type[0] + " $a=1" + appendix,
                        prefixExpected + type[1] + " ($a 1)" + appendixExpected
                    });
        }
        collection.addAll(getVariations(prefix + "int", "=", appendix, prefixExpected + "int", "1", appendixExpected));
        collection.addAll(getVariations(prefix + "object", "=", appendix, prefixExpected + "object", "1", appendixExpected));
        collection.addAll(getVariations(prefix + "float", "=()", appendix, prefixExpected + "float", "(cast float 1)", appendixExpected));
        collection.addAll(Arrays.asList(new Object[][]{
                    {prefix + "int $a                    " + appendix, prefixExpected + "int $a" + appendixExpected},
                    {prefix + "int $a,     $b            " + appendix, prefixExpected + "int $a $b" + appendixExpected},
                    {prefix + "int $a,     $b,     $c    " + appendix, prefixExpected + "int $a $b $c" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c    " + appendix, prefixExpected + "int ($a (cast int 1)) ($b 1) $c" + appendixExpected},
                    {prefix + "int $a=()1, $b,     $c=1  " + appendix, prefixExpected + "int ($a (cast int 1)) $b ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c=1  " + appendix, prefixExpected + "int ($a (cast int 1)) ($b 1) ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c    " + appendix, prefixExpected + "int ($a (cast int 1)) ($b (cast int 1)) $c" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c=1  " + appendix, prefixExpected + "int ($a (cast int 1)) ($b (cast int 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b,     $c=()1" + appendix, prefixExpected + "int ($a (cast int 1)) $b ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c=()1" + appendix, prefixExpected + "int ($a (cast int 1)) ($b 1) ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c=()1" + appendix, prefixExpected + "int ($a (cast int 1)) ($b (cast int 1)) ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c    " + appendix, prefixExpected + "int $a ($b (cast int 1)) $c" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c=1  " + appendix, prefixExpected + "int $a ($b (cast int 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c=()1" + appendix, prefixExpected + "int $a ($b (cast int 1)) ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a,     $b=1,   $c=()1" + appendix, prefixExpected + "int $a ($b 1) ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c    " + appendix, prefixExpected + "int ($a 1) ($b (cast int 1)) $c" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c=1  " + appendix, prefixExpected + "int ($a 1) ($b (cast int 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c=()1" + appendix, prefixExpected + "int ($a 1) ($b (cast int 1)) ($c (cast int 1))" + appendixExpected},
                    {prefix + "int $a=1,   $b=1,   $c=()1" + appendix, prefixExpected + "int ($a 1) ($b 1) ($c (cast int 1))" + appendixExpected}
                }));
        return collection;
    }

    static Collection<Object[]> getVariations(String prefix, String sign, String appendix,
            String prefixExpected, String expectedExpression, String appendixExpected) {
        return Arrays.asList(new Object[][]{
                    {
                        prefix + " $a, $b, $c" + appendix,
                        prefixExpected + " $a $b $c" + appendixExpected
                    },
                    {
                        prefix + " $a" + sign + "1, $b, $c" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") $b $c" + appendixExpected
                    },
                    {
                        prefix + " $a" + sign + "1, $b" + sign + "1, $c" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") $c"
                        + appendixExpected
                    },
                    {
                        prefix + " $a" + sign + "1, $b, $c" + sign + "1" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") $b ($c " + expectedExpression + ")"
                        + appendixExpected
                    },
                    {
                        prefix + " $a" + sign + "1, $b" + sign + "1, $c" + sign + "1" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") "
                        + "($c " + expectedExpression + ")" + appendixExpected
                    },
                    {
                        prefix + " $a, $b" + sign + "1, $c" + appendix,
                        prefixExpected + " $a ($b " + expectedExpression + ") $c" + appendixExpected
                    },
                    {
                        prefix + " $a, $b" + sign + "1, $c" + sign + "1" + appendix,
                        prefixExpected + " $a ($b " + expectedExpression + ") ($c " + expectedExpression + ")"
                        + appendixExpected
                    },
                    {
                        prefix + " $a, $b, $c" + sign + "1" + appendix,
                        prefixExpected + " $a $b ($c " + expectedExpression + ")" + appendixExpected
                    }
                });
    }
}
