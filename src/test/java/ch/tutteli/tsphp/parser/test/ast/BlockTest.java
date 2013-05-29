/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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
import ch.tutteli.tsphp.parser.test.testutils.AstHelper;
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
public class BlockTest extends AAstTest
{

    public BlockTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        addToCollection(collection, ArrayAccessTest.testStrings());
        addToCollection(collection, ArrayDeclarationTest.testStrings());
        addToCollection(collection, BreakContinueTest.testStrings());
        addToCollection(collection, CloneTest.testStrings());
        addToCollection(collection, ConstantAccessTest.testStrings());
        addToCollection(collection, EchoTest.testStrings());
        addToCollection(collection, ExitTest.testStrings());
        addToCollection(collection, ForTest.testStrings());
        addToCollection(collection, ForeachTest.testStrings());
        addToCollection(collection, FunctionCallTest.testStrings());
        addToCollection(collection, IfTest.testStrings());
        addToCollection(collection, MethodCallTest.testStrings());
        addToCollection(collection, NewClassTest.testStrings());
        addToCollection(collection, ReturnTest.testStrings());
        addToCollection(collection, SwitchTest.testStrings());
        addToCollection(collection, ThrowTest.testStrings());
        addToCollection(collection, TryCatchTest.testStrings());
        addToCollection(collection, VariableDeclarationTest.testStrings());
        addToCollection(collection, WhileTest.testStrings());
        return collection;
    }

    private static void addToCollection(List<Object[]> collection, Collection<Object[]> testStrings) {
        AstHelper.addToCollection(collection, testStrings, "{", "}", "", "", 5);
        AstHelper.addToCollection(collection, testStrings, "{{", "}}", "", "", 5);
    }
}
