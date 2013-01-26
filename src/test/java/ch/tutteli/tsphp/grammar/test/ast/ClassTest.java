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
public class ClassTest extends AAstTest
{

    public ClassTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[][] types = TypeHelper.getClassInterfaceTypes();
        
        for(String[] type:types){
            //extends
            collection.add(new Object[]{
                        "class a extends "+type[0]+"{}",
                        "(class classModifier a (extends "+type[1]+") implements classBody)"
                    });
            collection.add(new Object[]{
                        "final class a extends "+type[0]+","+type[0]+"{}",
                        "(class (classModifier final) a (extends "+type[1]+" "+type[1]+") implements classBody)"
                    });
            collection.add(new Object[]{
                        "abstract class a extends "+type[0]+","+type[0]+","+type[0]+"{}",
                        "(class (classModifier abstract) a "
                            + "(extends "+type[1]+" "+type[1]+" "+type[1]+") implements classBody)"
                    });
            //implements
            collection.add(new Object[]{
                        "class a implements "+type[0]+", "+type[0]+"{}",
                        "(class classModifier a extends (implements "+type[1]+" "+type[1]+") classBody)"
                    });
            collection.add(new Object[]{
                        "final class a implements "+type[0]+", "+type[0]+","+type[0]+"{}",
                        "(class (classModifier final) a extends "
                            + "(implements "+type[1]+" "+type[1]+" "+type[1]+") classBody)"
                    });
            collection.add(new Object[]{
                        "abstract class a implements "+type[0]+"{}",
                        "(class (classModifier abstract) a extends (implements "+type[1]+") classBody)"
                    });
        }
        
        collection.addAll(Arrays.asList(new Object[][]{
                    {"class a{}", "(class classModifier a extends implements classBody)"},
                    {"class a{ }", "(class classModifier a extends implements classBody)"},
                    {"final class a{}", "(class (classModifier final) a extends implements classBody)"},
                    {"abstract class a{}", "(class (classModifier abstract) a extends implements classBody)"},
                    //extends implements
                    {
                        "class a extends b implements c{}",
                        "(class classModifier a "
                            + "(extends (type b)) "
                            + "(implements (type c))"
                        + " classBody)"
                    },
                    {
                        "final class a extends b implements c{}",
                        "(class (classModifier final) a "
                            + "(extends (type b)) "
                            + "(implements (type c))"
                        + " classBody)"
                    },
                    {
                        "abstract class a extends b implements c{}",
                         "(class (classModifier abstract) a "
                            + "(extends (type b)) "
                            + "(implements (type c))"
                        + " classBody)"
                    },
                    {
                        "class a extends b,c implements f,g,h,i{}",
                        "(class classModifier a "
                            + "(extends (type b) (type c)) "
                            + "(implements "
                                    + "(type f) (type g) "
                                    + "(type h) (type i)"
                            + ")"
                        + " classBody)"
                    },
                    {
                        "final class a extends b,c,d implements f,g,h{}",
                        "(class (classModifier final) a "
                            + "(extends (type b) (type c) (type d)) "
                            + "(implements "
                                    + "(type f) (type g) (type h)"
                            + ")"
                        + " classBody)"
                            
                    },
                    {
                        "abstract class a extends b,c,d,e implements f,g{}",
                        "(class (classModifier abstract) a "
                            + "(extends "
                                + "(type b) (type c) "
                                + "(type d) (type e)"
                            + ") "
                            + "(implements "
                                    + "(type f) (type g)"
                            + ")"
                        + " classBody)"
                    },
                }));
        return collection;
    }
}
