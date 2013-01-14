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
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ClassTest extends AParserTest
{

    public ClassTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{ private int $a;}"},        
                    {"final class a{ private int $a;}"},        
                    {"abstract class a{ private int $a;}"},        
                    //extends
                    {"class a extends b{ private int $a;}"},        
                    {"final class a extends b{ private int $a;}"},        
                    {"abstract class a extends b{ private int $a;}"},  
                    {"class a extends b,c{ private int $a;}"},        
                    {"final class a extends b,c,d{ private int $a;}"},        
                    {"abstract class a extends b,c,d,e{ private int $a;}"},  
                    //implements
                    {"class a implements b{ private int $a;}"},        
                    {"final class a implements b{ private int $a;}"},        
                    {"abstract class a implements b{ private int $a;}"},   
                     {"class a implements b,c{ private int $a;}"},        
                    {"final class a implements b,c,d{ private int $a;}"},        
                    {"abstract class a implements b,c,d,e{ private int $a;}"},  
                    //extends implements
                    {"class a extends b implements c{ private int $a;}"},        
                    {"final class a extends b implements c{ private int $a;}"},        
                    {"abstract class a extends b implements c{ private int $a;}"},  
                    {"class a extends b,c implements f,g,h,i{ private int $a;}"},        
                    {"final class a extends b,c,d implements f,g,h{ private int $a;}"},        
                    {"abstract class a extends b,c,d,e implements f,g{ private int $a;}"},  
                    //
                    {"class a { private int $a; function void getName(){ $a=1; } private int $a;}  function void getName(){ $a=1; }"},
                });
    }
}
