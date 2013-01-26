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
import ch.tutteli.tsphp.grammar.test.utils.VariationHelper;
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
public class ConstantAccessTest extends AAstTest
{

    public ConstantAccessTest(String testString, String expectedResult) {
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
        for(String[] type: types){
            collection.add(new Object[]{
                "int $a = "+type[0]+"::a;", 
                "(variableDeclaration int ($a (static memberAccess "+type[1]+" a)))"
            });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {"int $a = a;","(variableDeclaration int ($a a))"},
                    {"int $a = self::a;", "(variableDeclaration int ($a (static memberAccess self a)))"},
                    {"int $a = parent::a;", "(variableDeclaration int ($a (static memberAccess parent a)))"},
                }));
        return collection;
    }
}
