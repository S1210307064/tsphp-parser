/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.AstHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class BlockTest extends AAstTest
{

    public BlockTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
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
