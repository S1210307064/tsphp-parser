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
package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.utils.AAstTest;
import ch.tutteli.tsphp.parser.test.utils.TypeHelper;
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
        String[] types = TypeHelper.getClassInterfaceTypes();
        
        for(String type:types){
            //extends
            collection.add(new Object[]{
                        "class a extends "+type+"{}",
                        "(class cMod a (extends "+type+") implements cBody)"
                    });
            collection.add(new Object[]{
                        "final class a extends "+type+","+type+"{}",
                        "(class (cMod final) a (extends "+type+" "+type+") implements cBody)"
                    });
            collection.add(new Object[]{
                        "abstract class a extends "+type+","+type+","+type+"{}",
                        "(class (cMod abstract) a "
                            + "(extends "+type+" "+type+" "+type+") implements cBody)"
                    });
            //implements
            collection.add(new Object[]{
                        "class a implements "+type+", "+type+"{}",
                        "(class cMod a extends (implements "+type+" "+type+") cBody)"
                    });
            collection.add(new Object[]{
                        "final class a implements "+type+", "+type+","+type+"{}",
                        "(class (cMod final) a extends "
                            + "(implements "+type+" "+type+" "+type+") cBody)"
                    });
            collection.add(new Object[]{
                        "abstract class a implements "+type+"{}",
                        "(class (cMod abstract) a extends (implements "+type+") cBody)"
                    });
        }
        
        collection.addAll(Arrays.asList(new Object[][]{
                    {"class a{}", "(class cMod a extends implements cBody)"},
                    {"class a{ }", "(class cMod a extends implements cBody)"},
                    {"final class a{}", "(class (cMod final) a extends implements cBody)"},
                    {"abstract class a{}", "(class (cMod abstract) a extends implements cBody)"},
                    //extends implements
                    {
                        "class a extends b implements c{}",
                        "(class cMod a "
                            + "(extends b) "
                            + "(implements c)"
                        + " cBody)"
                    },
                    {
                        "final class a extends b implements c{}",
                        "(class (cMod final) a "
                            + "(extends b) "
                            + "(implements c)"
                        + " cBody)"
                    },
                    {
                        "abstract class a extends b implements c{}",
                         "(class (cMod abstract) a "
                            + "(extends b) "
                            + "(implements c)"
                        + " cBody)"
                    },
                    {
                        "class a extends b,c implements f,g,h,i{}",
                        "(class cMod a "
                            + "(extends b c) "
                            + "(implements f g h i)"
                        + " cBody)"
                    },
                    {
                        "final class a extends b,c,d implements f,g,h{}",
                        "(class (cMod final) a "
                            + "(extends b c d) "
                            + "(implements f g h)"
                        + " cBody)"
                            
                    },
                    {
                        "abstract class a extends b,c,d,e implements f,g{}",
                        "(class (cMod abstract) a "
                            + "(extends b c d e) "
                            + "(implements f g)"
                        + " cBody)"
                    },
                }));
        return collection;
    }
}
