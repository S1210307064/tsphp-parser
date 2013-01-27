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
                                        + "(parameterDeclaration "+type[1]+" $a)"
                                    + ") block)"
                                });
        }
        //normal
        collection.addAll(getTuples("int $a","int $a"));
        //cast 
        collection.addAll(getTuples("cast int $a","int $a cast"));
        //null
        collection.addAll(getTuples("int $a=null","int ($a null)"));
         //cast and null
        collection.addAll(getTuples("cast int $a=null","int ($a null) cast"));
       
        collection.addAll(Arrays.asList(new Object[][]{   
                     //optional parameter
                    {
                        "function void foo(int $a, int $b='hallo'){$a=1;}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int $a) "
                            + "(parameterDeclaration int ($b 'hallo'))"
                        + ") (block (= $a 1)))"
                    },
                    {
                        "function void foo(int $a, int $i, int $b=+1){}",
                       "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int $a) "
                            + "(parameterDeclaration int $i) "
                            + "(parameterDeclaration int ($b (unaryPlus 1)))"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a, int $i, int $b=-10, int $d=2.0){}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int $a) "
                            + "(parameterDeclaration int $i) "
                            + "(parameterDeclaration int ($b (unaryMinus 10))) "
                            + "(parameterDeclaration int ($d 2.0))"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a=null,int $b=true, int $c=E_ALL){}",
                        "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int ($a null)) "
                            + "(parameterDeclaration int ($b true)) "
                            + "(parameterDeclaration int ($c E_ALL))"
                        + ") block)"
                    },
                    {
                        "function void foo(int $a, int $b=false, int $d=null){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int $a) "
                            + "(parameterDeclaration int ($b false)) "
                            + "(parameterDeclaration int ($d null))"
                        + ") block)"
                    } ,
                    {
                        "function void foo(int $a=null, int $b, int $d=true){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int ($a null)) "
                            + "(parameterDeclaration int $b) "
                            + "(parameterDeclaration int ($d true))"
                        + ") block)"
                    }, 
                    {
                        "function void foo(cast int $a, int $b, cast int $d){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int $a cast) "
                            + "(parameterDeclaration int $b) "
                            + "(parameterDeclaration int $d cast)"
                        + ") block)"
                    } ,
                    {
                    "function void foo(cast int $a=1, int $b=2, cast int $d=3){}",
                         "(functionDeclaration void foo (parameters "
                            + "(parameterDeclaration int ($a 1) cast) "
                            + "(parameterDeclaration int ($b 2)) "
                            + "(parameterDeclaration int ($d 3) cast)"
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
                            + "(parameterDeclaration int $b) "
                            + "(parameterDeclaration int $c)"
                        + ") block)"
                    },
                     {
                        "function void set("+param+", "+param+", int $c){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration int $c)"
                        + ") block)"
                    },
                    {
                        "function void set("+param+", int $b,"+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration int $b) "
                            + "(parameterDeclaration "+paramExpect+")"
                        + ") block)"
                    },
                    {
                        "function void set(int $a, "+param+", int $c){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration int $a) "
                            + "(parameterDeclaration "+paramExpect+") "
                            + "(parameterDeclaration int $c)"
                        + ") block)"
                    },
                    {
                        "function void set(int $a, "+param+", "+param+"){}",
                        "(functionDeclaration void set (parameters "
                            + "(parameterDeclaration int $a) "
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
