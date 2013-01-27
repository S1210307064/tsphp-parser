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
import ch.tutteli.tsphp.grammar.test.utils.VariableDeclarationListHelper;
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
public class ClassMemberTest extends AAstTest
{

    public ClassMemberTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Collection<Object[]> variableLists = VariableDeclarationListHelper.testStrings(
                "private ", ";",
                "(classMember modifier private (variables ", "))");
        collection.addAll(getVariations("", "modifier"));
        collection.addAll(getVariations("static", "(modifier static)"));

        return collection;
    }

    private static Collection<Object[]> getVariations(String modifier, String modifierExpected) {
        return Arrays.asList(new Object[][]{
                    {modifier + " private int $a;", "(classMember " + modifierExpected + " private (variables int $a))"},
                    {modifier + " protected int $a;", "(classMember " + modifierExpected + " protected (variables int $a))"},
                    {modifier + " public int $a;", "(classMember " + modifierExpected + " public (variables int $a))"}
                });
    }
}
