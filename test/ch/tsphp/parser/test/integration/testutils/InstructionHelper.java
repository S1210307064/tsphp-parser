/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstructionHelper
{
    private InstructionHelper() {
    }

    public static List<Object[]> getTestStrings(String instruction) {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(getVariations("", instruction, ""));
        collection.addAll(getVariations("function void foo(){", instruction, "}"));
        collection.addAll(getVariations("class a{function void foo(){", instruction, "}}"));
        return collection;
    }

    private static List<Object[]> getVariations(String prefix, String instruction, String appendix) {
        return Arrays.asList(new Object[][]{
                {prefix + instruction + appendix},
                {prefix + "{" + instruction + "}" + appendix},
                {prefix + "{ {" + instruction + "} }" + appendix},
                {prefix + "for(;;) " + instruction + appendix},
                {prefix + "for(;;){ " + instruction + "}" + appendix},
                {prefix + "foreach([] as int $k)" + instruction + appendix},
                {prefix + "foreach([] as int $k){" + instruction + "}" + appendix},
                {prefix + "while(true)" + instruction + appendix},
                {prefix + "while(true){" + instruction + "}" + appendix},
                {prefix + "do " + instruction + " while(true);" + appendix},
                {prefix + "do{ " + instruction + "}while(true);" + appendix},
                {prefix + "switch($a){case 1: " + instruction + "}" + appendix},
                {prefix + "switch($a){case 1: $a=1; " + instruction + " default: $a=2; " + instruction + "}" +
                        appendix},
                {prefix + "switch($a){case 1:{ $a=1; " + instruction + "} default: $a=2; { " + instruction + "} }" +
                        appendix},
                {prefix + "if($a)" + instruction + appendix},
                {prefix + "if($a) $a=1; else " + instruction + appendix},
                {prefix + "if($a){" + instruction + "}" + appendix},
                {prefix + "if($a){$a=1;}else{" + instruction + "}" + appendix},
                {prefix + "try{" + instruction + "}catch(\\Exception $e){}" + appendix},
                {prefix + "try{$a=1;}catch(\\Exception $e){" + instruction + "}" + appendix}
        });
    }
}
