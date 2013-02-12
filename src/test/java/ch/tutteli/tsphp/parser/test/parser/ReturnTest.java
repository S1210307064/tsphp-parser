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
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ReturnTest extends AParserTest
{

    public ReturnTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return getPossiblePlacesForInstructionsWithInstruction("return");
    }
    public static List<Object[]> getPossiblePlacesForInstructionsWithInstruction(String instruction){
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{instruction+";"});
        collection.add(new Object[]{"{"+instruction+";}"});
        collection.add(new Object[]{"function void setName(){"+instruction+";}"});
        collection.addAll( getControllStructuresWithInstruction(instruction));
        return collection;
    }
    public static List<Object[]> getControllStructuresWithInstruction(String instruction) {
        return Arrays.asList(new Object[][]{
                    {"for(;;) " + instruction + ";"},
                    {"for(;;){ " + instruction + ";}"},
                    {"foreach([] as int $k)" + instruction + ";"},
                    {"foreach([] as int $k){" + instruction + ";}"},
                    {"while(true)" + instruction + ";"},
                    {"while(true){" + instruction + ";}"},
                    {"do break; while(true);"},
                    {"do{ break;}while(true);"},
                    {"switch($a){case 1: " + instruction + ";}"},
                    {"switch($a){case 1: $a=1; " + instruction + "; default: $a=2; " + instruction + ";}"},
                    {"if($a)" + instruction + ";"},
                    {"if($a) $a=1; else " + instruction + ";"},
                    {"if($a){" + instruction + ";}"},
                    {"if($a){$a=1;}else{" + instruction + ";}"},
                    {"try{" + instruction + ";}catch(\\Exception $e){}"},
                    {"try{$a=1;}catch(\\Exception $e){" + instruction + ";}"}
                });
    }
}
