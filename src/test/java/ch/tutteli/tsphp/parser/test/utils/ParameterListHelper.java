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
                prefixExpect, "(type typeModifier int) $a", appendixExpect));
        //cast 
        collection.addAll(getVariations(
                prefix, "cast int $a", appendix,
                prefixExpect, "(type (typeModifier cast) int) $a", appendixExpect));
        //?
        collection.addAll(getVariations(
                prefix, "int? $a", appendix,
                prefixExpect, "(type (typeModifier ?) int) $a", appendixExpect));
        //cast and ? mixed
        collection.addAll(getVariations(
                prefix, "cast int? $a", appendix,
                prefixExpect, "(type (typeModifier cast ?) int) $a", appendixExpect));

         List<String[]> types = TypeHelper.getAllTypesWithoutResourceAndObject();
         for(String[] type:types){
             //Test cast for all types excluding resource and object
             collection.add(new Object[]{
                        prefix +"cast "+type[0]+" $a"+appendix,
                        prefixExpect
                        + "(parameters (parameterDeclaration (type (typeModifier cast) "+type[1]+") $a))"
                        + appendixExpect
                    });
              //Test ? for all scalar types?
              collection.add(new Object[]{
                        prefix +type[0]+"? $a"+appendix,
                        prefixExpect
                        + "(parameters (parameterDeclaration (type (typeModifier ?) "+type[1]+") $a))"
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
                        prefixExpect + "(parameters (parameterDeclaration " + paramExpect + "))" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", int $b, int $c" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration (type typeModifier int) $b) "
                        + "(parameterDeclaration (type typeModifier int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + ", int $c" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration (type typeModifier int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", int $b," + param + "" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration (type typeModifier int) $b) "
                        + "(parameterDeclaration " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", int $c" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration (type typeModifier int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", " + param + "" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + ", " + param + "" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ")"
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
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type typeModifier int) ($b 'hallo'))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int? $i, int $b=+1" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type (typeModifier ?) int) $i) "
                        + "(parameterDeclaration (type typeModifier int) ($b 1))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a,cast int? $i, int $b=-10, int $d=2.0" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type (typeModifier cast ?) int) $i) "
                        + "(parameterDeclaration (type typeModifier int) ($b (unaryMinus 10))) "
                        + "(parameterDeclaration (type typeModifier int) ($d 2.0))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int? $a=null,int $b=true, int $c=E_ALL" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type (typeModifier ?) int) ($a null)) "
                        + "(parameterDeclaration (type typeModifier int) ($b true)) "
                        + "(parameterDeclaration (type typeModifier int) ($c E_ALL))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b=false, int $d=null" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type typeModifier int) ($b false)) "
                        + "(parameterDeclaration (type typeModifier int) ($d null))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b, int $d=true" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type typeModifier int) $a) "
                        + "(parameterDeclaration (type typeModifier int) $b) "
                        + "(parameterDeclaration (type typeModifier int) ($d true))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a, int $b, cast int $d" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type (typeModifier cast) int) $a) "
                        + "(parameterDeclaration (type typeModifier int) $b) "
                        + "(parameterDeclaration (type (typeModifier cast) int) $d)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a=1, int? $b=2, cast int $d=3" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration (type (typeModifier cast) int) ($a 1)) "
                        + "(parameterDeclaration (type (typeModifier ?) int) ($b 2)) "
                        + "(parameterDeclaration (type (typeModifier cast) int) ($d 3))"
                        + ")" + appendixExpect
                    }
                }));


        String[][] types = TypeHelper.getClassInterfaceTypes();

        for (String[] type : types) {
            collection.add(new Object[]{
                        prefix + "int $a=" + type[0] + "::a" + appendix,
                        prefixExpect
                        + "(parameters (parameterDeclaration (type typeModifier int) ($a (staticMemberAccess " + type[1] + " a))))"
                        + appendixExpect
                    });
        }
        return collection;
    }
}