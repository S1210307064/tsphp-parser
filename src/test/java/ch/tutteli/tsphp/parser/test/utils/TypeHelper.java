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
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
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
                    "a",
                    "a\\A",
                    "a\\b\\A",
                    "\\a",
                    "\\a\\A",
                    "\\a\\b\\A"
                };
    }

    public static List<String> getAllTypesWithoutResourceAndObject() {
        List<String> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(getScalarTypes()));
        collection.add("array");
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

    public static List<Object[]> getAllTypesInclModifier(String prefix, String appendix,
            String prefixExpect, String appendixExpect) {
        List<Object[]> collection = new ArrayList<>();
        String[] types = getScalarTypes();
        for (String type : types) {
            collection.add(new String[]{
                        prefix + type + appendix, prefixExpect + "(type tMod " + type + ")" + appendixExpect
                    });
            collection.add(new String[]{
                        prefix + "cast " + type + appendix,
                        prefixExpect + "(type (tMod cast) " + type + ")" + appendixExpect
                    });
            collection.add(new String[]{
                        prefix + type + "?" + appendix,
                        prefixExpect + "(type (tMod ?) " + type + ")" + appendixExpect
                    });
            collection.add(new String[]{
                        prefix + "cast " + type + "?" + appendix,
                        prefixExpect + "(type (tMod cast ?) " + type + ")" + appendixExpect
                    });
        }

        collection.add(new String[]{
                    prefix + "array" + appendix,
                    prefixExpect + "(type tMod array)" + appendixExpect
                });
        collection.add(new String[]{
                    prefix + "cast array" + appendix,
                    prefixExpect + "(type (tMod cast) array)" + appendixExpect
                });

        types = getClassInterfaceTypes();
        for (String type : types) {
            collection.add(new String[]{
                        prefix + type + appendix,
                        prefixExpect + "(type tMod " + type + ")" + appendixExpect
                    });
            collection.add(new String[]{
                        prefix + "cast " + type + appendix,
                        prefixExpect + "(type (tMod cast) " + type + ")" + appendixExpect
                    });
        }

        collection.add(new String[]{
                    prefix + "resource" + appendix,
                    prefixExpect + "(type tMod resource)" + appendixExpect
                });
        collection.add(new String[]{
                    prefix + "object" + appendix,
                    prefixExpect + "(type tMod object)" + appendixExpect
                });

        return collection;
    }
}
