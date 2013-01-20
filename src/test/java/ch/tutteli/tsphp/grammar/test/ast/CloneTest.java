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
public class CloneTest extends AAstTest
{

    public CloneTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.expressionForTest();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"$a = clone $b;","(= $a (clone $b))"},
                    {"$a = clone $b->a;","(= $a (clone (member access $b a)))"},
                    {"$a = clone $b->a[0];","(= $a (clone (array access (member access $b a) 0)))"},
                    {"$a = clone self::$a;","(= $a (clone (static member access Self $a)))"},
                    {
                        "$a = clone self::$a[0];",
                        "(= $a (clone (array access (static member access Self $a) 0)))"
                    },
                    {"$a = clone parent::$a;","(= $a (clone (static member access Parent $a)))"},
                    {
                        "$a = clone parent::$a[0];",
                        "(= $a (clone (array access (static member access Parent $a) 0)))"
                    },
                    {
                        "$a = clone Foo::$a;",
                        "(= $a (clone (static member access (class/interface type Foo) $a)))"
                    },
                    {
                        "$a = clone a\\Foo::$a[0];",
                         "(= $a (clone (array access (static member access (class/interface type a Foo) $a) 0)))"
                    }
                });

    }
}
