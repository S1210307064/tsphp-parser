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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ParameterListHelper
{

    private ParameterListHelper() {
    }

    public static Collection<Object[]> getTestStrings(String prefix, String appendix,
            String prefixExpect, String appendixExpect) {
        List<Object[]> collection = new ArrayList<>();
        //normal
        collection.addAll(getVariations(
                prefix, "int $a", appendix,
                prefixExpect, "(type tMod int) $a", appendixExpect));
        //cast 
        collection.addAll(getVariations(
                prefix, "cast int $a", appendix,
                prefixExpect, "(type (tMod cast) int) $a", appendixExpect));
        //?
        collection.addAll(getVariations(
                prefix, "int? $a", appendix,
                prefixExpect, "(type (tMod ?) int) $a", appendixExpect));
        //cast and ? mixed
        collection.addAll(getVariations(
                prefix, "cast int? $a", appendix,
                prefixExpect, "(type (tMod cast ?) int) $a", appendixExpect));

         List<String[]> types = TypeHelper.getAllTypesWithoutResourceAndObject();
         for(String[] type:types){
             //Test cast for all types excluding resource and object
             collection.add(new Object[]{
                        prefix +"cast "+type[0]+" $a"+appendix,
                        prefixExpect
                        + "(params (pDecl (type (tMod cast) "+type[1]+") $a))"
                        + appendixExpect
                    });
              //Test ? for all scalar types?
              collection.add(new Object[]{
                        prefix +type[0]+"? $a"+appendix,
                        prefixExpect
                        + "(params (pDecl (type (tMod ?) "+type[1]+") $a))"
                        + appendixExpect
                    });
         }        
        return collection;
    }

    public static Collection<Object[]> getVariations(String prefix, String param, String appendix,
            String prefixExpect, String paramExpect, String appendixExpect) {
        return Arrays.asList(new Object[][]{
                    {
                        prefix + param + appendix,
                        prefixExpect + "(params (pDecl " + paramExpect + "))" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + appendix,
                        prefixExpect + "(params "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", int $b, int $c" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl (type tMod int) $b) "
                        + "(pDecl (type tMod int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + ", int $c" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl (type tMod int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", int $b," + param + "" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl (type tMod int) $b) "
                        + "(pDecl " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", int $c" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl (type tMod int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", " + param + "" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + ", " + param + "" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl " + paramExpect + ")"
                        + ")" + appendixExpect
                    }
                });
    }

    public static Collection<Object[]> getVariationsForOptional(String prefix, String appendix,
            String prefixExpect, String appendixExpect) {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    //optional parameter
                    {
                        prefix + "int $a, int $b='hallo'" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) ($b 'hallo'))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int? $i, int $b=+1" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type (tMod ?) int) $i) "
                        + "(pDecl (type tMod int) ($b 1))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a,cast int? $i, int $b=-10, int $d=2.0" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type (tMod cast ?) int) $i) "
                        + "(pDecl (type tMod int) ($b (uMinus 10))) "
                        + "(pDecl (type tMod int) ($d 2.0))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int? $a=null,int $b=true, int $c=E_ALL" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod ?) int) ($a null)) "
                        + "(pDecl (type tMod int) ($b true)) "
                        + "(pDecl (type tMod int) ($c E_ALL))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b=false, int $d=null" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) ($b false)) "
                        + "(pDecl (type tMod int) ($d null))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b, int $d=true" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) $b) "
                        + "(pDecl (type tMod int) ($d true))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a, int $b, cast int $d" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod cast) int) $a) "
                        + "(pDecl (type tMod int) $b) "
                        + "(pDecl (type (tMod cast) int) $d)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a=1, int? $b=2, cast int $d=3" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod cast) int) ($a 1)) "
                        + "(pDecl (type (tMod ?) int) ($b 2)) "
                        + "(pDecl (type (tMod cast) int) ($d 3))"
                        + ")" + appendixExpect
                    }
                }));


        String[][] types = TypeHelper.getClassInterfaceTypes();

        for (String[] type : types) {
            collection.add(new Object[]{
                        prefix + "int $a=" + type[0] + "::a" + appendix,
                        prefixExpect
                        + "(params (pDecl (type tMod int) ($a (sMemAccess " + type[1] + " a))))"
                        + appendixExpect
                    });
        }
        return collection;
    }
}