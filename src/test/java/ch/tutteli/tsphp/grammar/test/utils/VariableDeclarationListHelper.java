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

    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[][] types = TypeHelper.getClassInterfaceTypes();
        for (String[] type : types) {
            collection.add(new Object[]{"" + type[0] + " $a=1;", type[1] + " ($a 1)"});
        }
        collection.addAll(getVariations("int", "=", "1"));
        collection.addAll(getVariations("object", "=", "1"));
        collection.addAll(getVariations("int", "=()", "(cast int 1)"));
        collection.addAll(Arrays.asList(new Object[][]{
                    {"int $a;", "int $a"},
                    {"int $a, $b;", "int $a $b"},
                    {"int $a, $b,$c;", "int $a $b $c"},
                    {"int $a=()1, $b=1,   $c;    ", "int ($a (cast int 1)) ($b 1) $c"},
                    {"int $a=()1, $b,     $c=1;  ", "int ($a (cast int 1)) $b ($c 1)"},
                    {"int $a=()1, $b=1,   $c=1;  ", "int ($a (cast int 1)) ($b 1) ($c 1)"},
                    {"int $a=()1, $b=()1, $c;    ", "int ($a (cast int 1)) ($b (cast int 1)) $c"},
                    {"int $a=()1, $b=()1, $c=1;  ", "int ($a (cast int 1)) ($b (cast int 1)) ($c 1)"},
                    {"int $a=()1, $b,     $c=()1;", "int ($a (cast int 1)) $b ($c (cast int 1))"},
                    {"int $a=()1, $b=1,   $c=()1;", "int ($a (cast int 1)) ($b 1) ($c (cast int 1))"},
                    {"int $a=()1, $b=()1, $c=()1;", "int ($a (cast int 1)) ($b (cast int 1)) ($c (cast int 1))"},
                    {"int $a,     $b=()1, $c;    ", "int $a ($b (cast int 1)) $c"},
                    {"int $a,     $b=()1, $c=1;  ", "int $a ($b (cast int 1)) ($c 1)"},
                    {"int $a,     $b=()1, $c=()1;", "int $a ($b (cast int 1)) ($c (cast int 1))"},
                    {"int $a,     $b=1,   $c=()1;", "int $a ($b 1) ($c (cast int 1))"},
                    {"int $a=1,   $b=()1, $c;    ", "int ($a 1) ($b (cast int 1)) $c"},
                    {"int $a=1,   $b=()1, $c=1;  ", "int ($a 1) ($b (cast int 1)) ($c 1)"},
                    {"int $a=1,   $b=()1, $c=()1;", "int ($a 1) ($b (cast int 1)) ($c (cast int 1))"},
                    {"int $a=1,   $b=1,   $c=()1;", "int ($a 1) ($b 1) ($c (cast int 1))"}
                }));
        return collection;
    }

    static Collection<Object[]> getVariations(String type, String sign, String expectedExpression) {
        return Arrays.asList(new Object[][]{
                    {type + " $a, $b, $c;", type + " $a $b $c"},
                    {
                        type + " $a" + sign + "1, $b, $c;",
                        type + " ($a " + expectedExpression + ") $b $c"
                    },
                    {
                        type + " $a" + sign + "1, $b" + sign + "1, $c;",
                        type + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") $c"
                    },
                    {
                        type + " $a" + sign + "1, $b, $c" + sign + "1;",
                        type + " ($a " + expectedExpression + ") $b ($c " + expectedExpression + ")"
                    },
                    {
                        type + " $a" + sign + "1, $b" + sign + "1, $c" + sign + "1;",
                        type + " ($a " + expectedExpression + ") ($b " + expectedExpression + ") "
                        + "($c " + expectedExpression + ")"
                    },
                    {
                        type + " $a, $b" + sign + "1, $c;",
                        type + " $a ($b " + expectedExpression + ") $c"
                    },
                    {
                        type + " $a, $b" + sign + "1, $c" + sign + "1;",
                        type + " $a ($b " + expectedExpression + ") ($c " + expectedExpression + ")"
                    },
                    {
                        type + " $a, $b, $c" + sign + "1;",
                        type + " $a $b ($c " + expectedExpression + ")"
                    }
                });
    }
}
