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
public class ParameterListHelper
{

    private ParameterListHelper() {
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
                        + "(parameterDeclaration int $b) "
                        + "(parameterDeclaration int $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", " + param + ", int $c" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration int $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + param + ", int $b," + param + "" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration int $b) "
                        + "(parameterDeclaration " + paramExpect + ")"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", int $c" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration " + paramExpect + ") "
                        + "(parameterDeclaration int $c)"
                        + ")" + appendixExpect
                    },
                    {
                        "function void set(int $a, " + param + ", " + param + "" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
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
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration int ($b 'hallo'))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $i, int $b=+1" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration int $i) "
                        + "(parameterDeclaration int ($b (unaryPlus 1)))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $i, int $b=-10, int $d=2.0" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration int $i) "
                        + "(parameterDeclaration int ($b (unaryMinus 10))) "
                        + "(parameterDeclaration int ($d 2.0))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a=null,int $b=true, int $c=E_ALL" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int ($a null)) "
                        + "(parameterDeclaration int ($b true)) "
                        + "(parameterDeclaration int ($c E_ALL))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b=false, int $d=null" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration int ($b false)) "
                        + "(parameterDeclaration int ($d null))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b, int $d=true" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a) "
                        + "(parameterDeclaration int $b) "
                        + "(parameterDeclaration int ($d true))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a, int $b, cast int $d" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int $a cast) "
                        + "(parameterDeclaration int $b) "
                        + "(parameterDeclaration int $d cast)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a=1, int $b=2, cast int $d=3" + appendix,
                        prefixExpect + "(parameters "
                        + "(parameterDeclaration int ($a 1) cast) "
                        + "(parameterDeclaration int ($b 2)) "
                        + "(parameterDeclaration int ($d 3) cast)"
                        + ")" + appendixExpect
                    }
                }));


        String[][] types = TypeHelper.getClassInterfaceTypes();

        for (String[] type : types) {
            collection.add(new Object[]{
                        prefix + "int $a=" + type[0] + "::a" + appendix,
                        prefixExpect + 
                            "(parameters (parameterDeclaration int ($a (staticMemberAccess " + type[1] + " a))))"
                        + appendixExpect
                    });
        }
        return collection;
    }
}