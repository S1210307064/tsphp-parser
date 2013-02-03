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
        List<Object[]> collection = TypeHelper.getAllTypesInclModifier(
                prefix, " $a=1" + appendix, prefixExpected, " ($a 1)" + appendixExpected);

        collection.addAll(getVariations(prefix + "int", "=", appendix, prefixExpected + "(type tMod int)", "1", appendixExpected));
        collection.addAll(getVariations(prefix + "object", "=", appendix, prefixExpected + "(type tMod object)", "1", appendixExpected));
        collection.addAll(getVariations(prefix + "float", "=()", appendix, prefixExpected + "(type tMod float)", "(casting (type tMod float) 1)", appendixExpected));
        collection.addAll(Arrays.asList(new Object[][]{
                    {prefix + "int $a                    " + appendix, prefixExpected + "(type tMod int) $a" + appendixExpected},
                    {prefix + "int $a,     $b            " + appendix, prefixExpected + "(type tMod int) $a $b" + appendixExpected},
                    {prefix + "int $a,     $b,     $c    " + appendix, prefixExpected + "(type tMod int) $a $b $c" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c    " + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b 1) $c" + appendixExpected},
                    {prefix + "int $a=()1, $b,     $c=1  " + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) $b ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c=1  " + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b 1) ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c    " + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b (casting (type tMod int) 1)) $c" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c=1  " + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b (casting (type tMod int) 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a=()1, $b,     $c=()1" + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) $b ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a=()1, $b=1,   $c=()1" + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b 1) ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a=()1, $b=()1, $c=()1" + appendix, prefixExpected + "(type tMod int) ($a (casting (type tMod int) 1)) ($b (casting (type tMod int) 1)) ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c    " + appendix, prefixExpected + "(type tMod int) $a ($b (casting (type tMod int) 1)) $c" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c=1  " + appendix, prefixExpected + "(type tMod int) $a ($b (casting (type tMod int) 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a,     $b=()1, $c=()1" + appendix, prefixExpected + "(type tMod int) $a ($b (casting (type tMod int) 1)) ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a,     $b=1,   $c=()1" + appendix, prefixExpected + "(type tMod int) $a ($b 1) ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c    " + appendix, prefixExpected + "(type tMod int) ($a 1) ($b (casting (type tMod int) 1)) $c" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c=1  " + appendix, prefixExpected + "(type tMod int) ($a 1) ($b (casting (type tMod int) 1)) ($c 1)" + appendixExpected},
                    {prefix + "int $a=1,   $b=()1, $c=()1" + appendix, prefixExpected + "(type tMod int) ($a 1) ($b (casting (type tMod int) 1)) ($c (casting (type tMod int) 1))" + appendixExpected},
                    {prefix + "int $a=1,   $b=1,   $c=()1" + appendix, prefixExpected + "(type tMod int) ($a 1) ($b 1) ($c (casting (type tMod int) 1))" + appendixExpected}
                }));
        return collection;
    }

    private static Collection<Object[]> getVariations(String prefix, String operator, String appendix,
            String prefixExpected, String expectedExpression, String appendixExpected) {
        return Arrays.asList(new Object[][]{
                    {
                        prefix + " $a, $b, $c" + appendix,
                        prefixExpected + " $a $b $c" + appendixExpected
                    },
                    {
                        prefix + " $a" + operator + "1, $b, $c" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") $b $c" + appendixExpected
                    },
                    {
                        prefix + " $a" + operator + "1, $b" + operator + "1, $c" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") $c"
                        + appendixExpected
                    },
                    {
                        prefix + " $a" + operator + "1, $b, $c" + operator + "1" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") $b ($c " + expectedExpression + ")"
                        + appendixExpected
                    },
                    {
                        prefix + " $a" + operator + "1, $b" + operator + "1, $c" + operator + "1" + appendix,
                        prefixExpected + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") "
                        + "($c " + expectedExpression + ")" + appendixExpected
                    },
                    {
                        prefix + " $a, $b" + operator + "1, $c" + appendix,
                        prefixExpected + " $a ($b " + expectedExpression + ") $c" + appendixExpected
                    },
                    {
                        prefix + " $a, $b" + operator + "1, $c" + operator + "1" + appendix,
                        prefixExpected + " $a ($b " + expectedExpression + ") ($c " + expectedExpression + ")"
                        + appendixExpected
                    },
                    {
                        prefix + " $a, $b, $c" + operator + "1" + appendix,
                        prefixExpected + " $a $b ($c " + expectedExpression + ")" + appendixExpected
                    }
                });
    }
}
