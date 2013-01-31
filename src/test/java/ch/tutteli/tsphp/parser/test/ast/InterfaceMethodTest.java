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
import ch.tutteli.tsphp.parser.test.utils.ParameterListHelper;
import ch.tutteli.tsphp.parser.test.utils.TypeHelper;
import java.util.ArrayList;
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
public class InterfaceMethodTest extends AAstTest
{

    public InterfaceMethodTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

     @Override
    protected void run() throws RecognitionException {
        result = parser.interfaceBody();
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"public function void foo();","(mDecl (mMod abstract) public void foo params)"});
        collection.add(new Object[]{"function __construct();","(iCtor params)"});
        collection.add(new Object[]{"public function __construct();","(iCtor params)"});
        
        List<String[]> types = TypeHelper.getAllTypes();
        for (String[] type : types) {
            collection.add(new Object[]{
                        "function " + type[0] + " get();",
                        "(mDecl (mMod abstract) public " + type[1] + " get params)"
                    });
        }
        //normal
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", ");",
                "(mDecl (mMod abstract) public void set ", ")"));

        collection.addAll(ParameterListHelper.getVariationsForOptional(
                "function void foo(", ");", "(mDecl (mMod abstract) public void foo ", ")"));
        return collection;
    }
}
