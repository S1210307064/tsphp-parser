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
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class ClassAttributeTest extends AParserTest
{

    public ClassAttributeTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"class a{ private int $a=1;}"},
                    {"class a{ protected int $a=1;}"},
                    {"class a{ public int $a=1;}"},
                    {"class a{ static private int $a=1;}"},
                    {"class a{ static protected int $a=1;}"},
                    {"class a{ static public int $a=1;}"},
                    //comma declaration
                    {"class a{ private int $a=1,$b=2;}"},
                    {"class a{ protected int $a=1,$b=2;}"},
                    {"class a{ public int $a=1,$b=2;}"},
                    {"class a{ static private int $a=1,$b=2;}"},
                    {"class a{ static protected int $a=1,$b=2;}"},
                    {"class a{ static public int $a=1,$b=2;}"},
                    //comma declaration without assignment
                    {"class a{ private int $a=1,$b=2,$c;}"},
                    {"class a{ protected int $a=1,$b=2,$c;}"},
                    {"class a{ public int $a=1,$b=2,$c;}"},
                    {"class a{ static private int $a=1,$b=2,$c;}"},
                    {"class a{ static protected int $a=1,$b=2,$c;}"},
                    {"class a{ static public int $a=1,$b=2,$c;}"},
                }));
        List<String> types = VariableDeclarationTest.getAllTypes();
        for(String type : types){
            collection.add(new Object[]{"class a{ private "+type+" $a=1;}"});
        }
        
        return collection;
        
    }
}