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
package ch.tutteli.tsphp.grammar.test.ast;

import ch.tutteli.tsphp.grammar.test.utils.AAstTest;
import ch.tutteli.tsphp.grammar.test.utils.TypeHelper;
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
public class FunctionTest extends AAstTest
{

    public FunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        List<String[]> types = TypeHelper.getAllTypes();
        for(String[] type:types){
            collection.add(new Object[]{
                                    "function "+type[0]+" get(){}",  
                                    "(functionDeclaration "+type[1]+" get parameters block)"
                                });
            collection.add(new Object[]{
                                    "function void set("+type[0]+" $a){}",
                                    "(functionDeclaration void set (parameters "
                                        + "(parameterDeclaration (parameterType "+type[1]+") $a)"
                                    + ") block)"
                                });
        }
        //normal
        collection.addAll(getTuples("int $a","(parameterType int) $a"));
        //cast 
        collection.addAll(getTuples("cast int $a","(parameterType int cast) $a"));
        //null
        collection.addAll(getTuples("int $a=null","(parameterType int) $a null"));
         //cast and null
        collection.addAll(getTuples("cast int $a=null","(parameterType int cast) $a null"));
       
        collection.addAll(Arrays.asList(new Object[][]{   
                     //optional parameter
                    {
                        "function void foo(int $a, int $b='hallo'){}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration (parameterType int) $b 'hallo')"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a, int $i, int $b=+1){}",
                       "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration (parameterType int) $i) "
                            + "(parameterDeclaration (parameterType int) $b (unaryPlus 1))"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a, int $i, int $b=-10, int $d=2.0){}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration (parameterType int) $i) "
                            + "(parameterDeclaration (parameterType int) $b (unaryMinus 10)) "
                            + "(parameterDeclaration (parameterType int) $d 2.0)"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a=null,int $b=true, int $c=E_ALL){}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a null) "
                            + "(parameterDeclaration (parameterType int) $b true) "
                            + "(parameterDeclaration (parameterType int) $c E_ALL)"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a, int $b=false, int $d=null){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration (parameterType int) $b false) "
                            + "(parameterDeclaration (parameterType int) $d null)"
                        + ") block)"
                    } ,
                    {
                        "function void foo(int $a=null, int $b, int $d=true){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int) $a null) "
                            + "(parameterDeclaration (parameterType int) $b) "
                            + "(parameterDeclaration (parameterType int) $d true)"
                        + ") block)"
                    }, 
                    {
                        "function void foo(cast int $a, int $b, cast int $d){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int cast) $a) "
                            + "(parameterDeclaration (parameterType int) $b) "
                            + "(parameterDeclaration (parameterType int cast) $d)"
                        + ") block)"
                    } ,
                    {
                    "function void foo(cast int $a=1, int $b=2, cast int $d=3){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration (parameterType int cast) $a 1) "
                            + "(parameterDeclaration (parameterType int) $b 2) "
                            + "(parameterDeclaration (parameterType int cast) $d 3)"
                        + ") block)"
                    },
                }));
        return collection;
    }
    
    private static Collection<Object[]> getTuples(String param, String paramExpect){
        return  Arrays.asList(new Object[][]{   
                    {
                        "function void set("+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
                    {
                        "function void set("+param+", "+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
                    {
                        "function void set("+param+", int $b, int $c){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration (parameterType int) $b) "
                            + "(parameterDeclaration (parameterType int) $c)"
                        + ") block)"
                    },
                     {
                        "function void set("+param+", "+param+", int $c){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration (parameterType int) $c)"
                        + ") block)"
                    },
                    {
                        "function void set("+param+", int $b,"+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration (parameterType int) $b) "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
                    {
                        "function void set(int $a, "+param+", int $c){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration (parameterType int) $c)"
                        + ") block)"
                    },
                    {
                        "function void set(int $a, "+param+", "+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration (parameterType int) $a) "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
                     {
                        "function void set("+param+", "+param+", "+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
        });
    }
}
