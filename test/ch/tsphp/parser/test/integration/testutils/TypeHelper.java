/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeHelper
{

    public static List<String> getAllTypes() {
        List<String> types = new ArrayList<>();
        types.addAll(getPrimitiveTypes());
        types.addAll(Arrays.asList(getClassInterfaceTypes()));
        return types;
    }

    public static String[] getClassInterfaceTypes() {
        return new String[]{
            "B",
            "a\\C",
            "a\\b\\A",
            "\\e",
            "\\f\\D",
            "\\g\\b\\A"
        };
    }

    public static List<String> getAllTypesWithoutObject() {
        List<String> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(getScalarTypes()));
        collection.add("array");
        collection.add("resource");
        collection.addAll(Arrays.asList(getClassInterfaceTypes()));
        return collection;
    }

    public static List<String> getAllTypesWithoutScalar() {
        List<String> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(getClassInterfaceTypes()));
        collection.add("array");
        collection.add("resource");
        collection.add("object");
        return collection;
    }

    public static List<String> getPrimitiveTypes() {
        List<String> collection = new ArrayList<>(7);
        collection.addAll(Arrays.asList(getScalarTypes()));
        collection.add("array");
        collection.add("resource");
        collection.add("object");
        return collection;
    }

    public static String[] getScalarTypes() {
        return new String[]{
            "bool",
            "int",
            "float",
            "string"
        };
    }

    public static List<Object[]> getAllTypesWithModifier(String prefix, String appendix,
            String prefixExpect, String appendixExpect, String cmMod) {
        return getAllTypesWithModifier(prefix, appendix, prefixExpect, appendixExpect, cmMod, true);
    }

    public static List<Object[]> getAllTypesWithoutObjectWithModifier(String prefix, String appendix,
            String prefixExpect, String appendixExpect, String cmMod) {
        return getAllTypesWithModifier(prefix, appendix, prefixExpect, appendixExpect, cmMod, false);
    }

    private static List<Object[]> getAllTypesWithModifier(String prefix, String appendix,
            String prefixExpect, String appendixExpect, String cmMod, boolean withObject) {
        String tMod = cmMod.isEmpty() ? "tMod" : "(tMod " + cmMod + ")";
        String tModInclCast = cmMod.isEmpty() ? "(tMod cast)" : "(tMod cast " + cmMod + ")";
        String tModInclNullable = cmMod.isEmpty() ? "(tMod ?)" : "(tMod ? " + cmMod + ")";
        String tModInclCastNullable = cmMod.isEmpty() ? "(tMod cast ?)" : "(tMod cast ? " + cmMod + ")";

        List<Object[]> collection = new ArrayList<>();
        String[] types = getScalarTypes();
        for (String type : types) {
            collection.add(new String[]{
                prefix + type + appendix, prefixExpect + "(type " + tMod + " " + type + ")" + appendixExpect
            });
            collection.add(new String[]{
                prefix + "cast " + type + appendix,
                prefixExpect + "(type " + tModInclCast + " " + type + ")" + appendixExpect
            });
            collection.add(new String[]{
                prefix + type + "?" + appendix,
                prefixExpect + "(type " + tModInclNullable + " " + type + ")" + appendixExpect
            });
            collection.add(new String[]{
                prefix + "cast " + type + "?" + appendix,
                prefixExpect + "(type " + tModInclCastNullable + " " + type + ")" + appendixExpect
            });
        }

        collection.add(new String[]{
            prefix + "array" + appendix,
            prefixExpect + "(type " + tMod + " array)" + appendixExpect
        });
        collection.add(new String[]{
            prefix + "cast array" + appendix,
            prefixExpect + "(type " + tModInclCast + " array)" + appendixExpect
        });

        types = getClassInterfaceTypes();
        for (String type : types) {
            collection.add(new String[]{
                prefix + type + appendix,
                prefixExpect + "(type " + tMod + " " + type + ")" + appendixExpect
            });
            collection.add(new String[]{
                prefix + "cast " + type + appendix,
                prefixExpect + "(type " + tModInclCast + " " + type + ")" + appendixExpect
            });
        }
        collection.add(new String[]{
            prefix + "resource" + appendix,
            prefixExpect + "(type " + tMod + " resource)" + appendixExpect
        });
          collection.add(new String[]{
            prefix + "cast resource" + appendix,
            prefixExpect + "(type " + tModInclCast + " resource)" + appendixExpect
        });
        if (withObject) {
            collection.add(new String[]{
                prefix + "object" + appendix,
                prefixExpect + "(type " + tMod + " object)" + appendixExpect
            });
        }
        return collection;
    }
}
