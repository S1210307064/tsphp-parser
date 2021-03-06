/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ParameterListHelper
{

    private ParameterListHelper() {
    }

    public static Collection<Object[]> getTestStrings(String prefix, String appendix,
            String prefixExpect, String appendixExpect) {

        //check all types
        List<Object[]> collection = TypeHelper.getAllTypesWithModifier(
                prefix, " $a" + appendix,
                prefixExpect + "(params (pDecl ", " $a))" + appendixExpect,"");
        List<String> types = TypeHelper.getAllTypesWithoutScalar();

        //class / interfaceType can also have the ? modifier
        for (String type : types) {
            collection.add(new Object[]{
                        prefix + type + "? $a" + appendix,
                        prefixExpect + "(params (pDecl (type (tMod ?) " + type + ") $a))" + appendixExpect
                    });
        }

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

        collection.addAll(getVariationsForOptional(prefix, appendix, prefixExpect, appendixExpect));

        //empty params
        collection.add(new Object[]{prefix + appendix, prefixExpect + "params" + appendixExpect});
        return collection;
    }

    private static Collection<Object[]> getVariations(String prefix, String param, String appendix,
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
                        prefix + "int $a, " + param + ", int $c" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl " + paramExpect + ") "
                        + "(pDecl (type tMod int) $c)"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, " + param + ", " + param + "" + appendix,
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

    private static Collection<Object[]> getVariationsForOptional(String prefix, String appendix,
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
                        + "(pDecl (type tMod int) ($b (uPlus 1)))"
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
                        + "(pDecl (type tMod int) ($c E_ALL#))"
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
                        prefix + "cast int $a=1, int? $b=2, cast int $d=3" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod cast) int) ($a 1)) "
                        + "(pDecl (type (tMod ?) int) ($b 2)) "
                        + "(pDecl (type (tMod cast) int) ($d 3))"
                        + ")" + appendixExpect
                    },
                    //See TSPHP-418
                    {
                        prefix + "array $a= [2,2], array? $b=array(1,'a'=>2)" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod array) ($a (array 2 2))) "
                        + "(pDecl (type (tMod ?) array) ($b (array 1 (=> 'a' 2))))"
                        + ")" + appendixExpect
                    }
                }));


        String[] types = TypeHelper.getClassInterfaceTypes();

        for (String type : types) {
            collection.add(new Object[]{
                        prefix + "int $a=" + type + "::a" + appendix,
                        prefixExpect
                        + "(params (pDecl (type tMod int) ($a (sMemAccess " + type + " a#))))"
                        + appendixExpect
                    });
        }
        return collection;
    }
}