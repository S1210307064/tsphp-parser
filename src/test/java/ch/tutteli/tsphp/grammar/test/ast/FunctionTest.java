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
import ch.tutteli.tsphp.grammar.test.utils.ParameterListHelper;
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
        for (String[] type : types) {
            collection.add(new Object[]{
                        "function " + type[0] + " get(){}",
                        "(functionDeclaration " + type[1] + " get parameters block)"
                    });
            collection.add(new Object[]{
                        "function void set(" + type[0] + " $a){}",
                        "(functionDeclaration void set (parameters "
                        + "(parameterDeclaration " + type[1] + " $a)"
                        + ") block)"
                    });
        }
        //normal
        collection.addAll(getTuples("int $a", "int $a"));
        //cast 
        collection.addAll(getTuples("cast int $a", "int $a cast"));
        //null
        collection.addAll(getTuples("int $a=null", "int ($a null)"));
        //cast and null
        collection.addAll(getTuples("cast int $a=null", "int ($a null) cast"));

        collection.addAll(ParameterListHelper.getVariationsForOptional(
                "function void foo(", "){$a=1;}",
                "(functionDeclaration void foo ", " (block (= $a 1)))"));
        
        return collection;
    }

    public static Collection<Object[]> getTuples(String param, String paramExpect) {
        return ParameterListHelper.getVariations(
                "function void set(", param, "){}",
                "(functionDeclaration void set ", paramExpect, " block)");
    }
}
