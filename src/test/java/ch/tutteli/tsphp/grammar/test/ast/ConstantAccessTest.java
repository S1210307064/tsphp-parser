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
        return Arrays.asList(new Object[][]{
                    {"int $a = a;", "(variable declaration int $a a)"},
                    {"int $a = self::a;", "(variable declaration int $a (static member access self a))"},
                    {"int $a = parent::a;", "(variable declaration int $a (static member access parent a))"},
                    {
                        "int $a = Foo::a;",
                        "(variable declaration int $a (static member access (class/interface type Foo) a))"
                    },
                    {
                        "int $a = \\Foo::a;",
                        "(variable declaration int $a (static member access (class/interface type \\ Foo) a))"
                    },
                    {
                        "int $a = a\\Foo::a;",
                        "(variable declaration int $a (static member access (class/interface type a Foo) a))"
                    },
                    {
                        "int $a = \\a\\b\\Foo::a;",
                        "(variable declaration int $a (static member access (class/interface type \\ a b Foo) a))"
                    },
                });
    }
}
