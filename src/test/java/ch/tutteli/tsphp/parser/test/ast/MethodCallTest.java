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

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.ExpressionHelper;
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
public class MethodCallTest extends AAstTest
{

    public MethodCallTest(String testString, String expectedResult) {
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
                    {
                        "$a->foo()->bar(2,2);", 
                        "(mCall (mCall $a foo args) bar (args 2 2))"
                    },
                    {
                        "$a->foo()->bar(2,2)->asdf(1);", 
                        "(mCall (mCall (mCall $a foo args) bar (args 2 2)) asdf (args 1))"
                    },
                }));
        List<String[]> expressions = ExpressionHelper.getAstExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "$a->foo("+expression[0]+");", 
                        "(mCall $a foo (args "+expression[1]+"))"
            });
            collection.add(new Object[]{
                        "$a->foo("+expression[0]+","+expression[0]+","+expression[0]+");",
                        "(mCall $a foo (args "+expression[1]+" "+expression[1]+" "+expression[1]+"))"
                    });
        }
        return collection;
    }   
}
