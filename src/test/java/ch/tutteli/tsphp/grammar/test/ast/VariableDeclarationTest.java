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
public class VariableDeclarationTest extends AAstTest
{

    public VariableDeclarationTest(String testString, String expectedResult) {
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
                    {"Type $a;", "(variable declaration (class/interface type Type) $a)"},
                    {"\\Type $a;", "(variable declaration (class/interface type \\ Type) $a)"},
                    {"a\\Type $a;", "(variable declaration (class/interface type a Type) $a)"},
                    {"\\a\\Type $a;", "(variable declaration (class/interface type \\ a Type) $a)"},
                    {"bool $a;", "(variable declaration bool $a)"},
                    {"int $a;", "(variable declaration int $a)"},
                    {"float $a;", "(variable declaration float $a)"},
                    {"string $a;", "(variable declaration string $a)"},
                    {"array $a;", "(variable declaration array $a)"},
                    {"resource $a;", "(variable declaration resource $a)"},
                    {"object $a;", "(variable declaration object $a)"}
                }));
        String[][] expressions = ExpressionTest.getExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{"int $a = " + expression[0] + ";", "(variable declaration int $a " + expression[1] + ")"});
        }
        return collection;
    }
}
