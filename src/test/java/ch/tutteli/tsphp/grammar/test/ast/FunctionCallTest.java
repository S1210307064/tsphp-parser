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
import ch.tutteli.tsphp.grammar.test.utils.ExpressionHelper;
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
public class FunctionCallTest extends AAstTest
{

    public FunctionCallTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"foo();", "(functionCall (type foo) expressions)"},
                    {"\\foo();", "(functionCall (type \\ foo) expressions)"},
                    {"a\\foo();", "(functionCall (type a foo) expressions)"},
                    {"a\\a\\foo();", "(functionCall (type a a foo) expressions)"},
                    {"a\\a\\b\\foo();", "(functionCall (type a a b foo) expressions)"},
                    {"\\a\\foo();", "(functionCall (type \\ a foo) expressions)"},
                    {"\\a\\b\\foo();", "(functionCall (type \\ a b foo) expressions)"},
                    {"\\a\\b\\c\\foo();", "(functionCall (type \\ a b c foo) expressions)"},
                    {
                        "foo()->bar(2,2);", 
                        "(methodCall "
                            + "(functionCall (type foo) expressions)"
                        + " bar (expressions 2 2))"
                    },
                    {
                        "foo()->bar(2,2)->asdf(1);", 
                        "(methodCall (methodCall "
                            + "(functionCall (type foo) expressions)"
                        + " bar (expressions 2 2)) asdf (expressions 1))"
                    },
                }));
        String[][] expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "foo("+expression[0]+");", 
                        "(functionCall (type foo) (expressions "+expression[1]+"))"
            });
            collection.add(new Object[]{
                        "foo("+expression[0]+","+expression[0]+","+expression[0]+");",
                        "(functionCall (type foo) (expressions "
                        + ""+expression[1]+" "+expression[1]+" "+expression[1]+""
                        + "))"
                    });
        }
        return collection;
    }   
}
