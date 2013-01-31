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
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class SwitchTest extends AAstTest
{

    public SwitchTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"switch($a){ case 1: $a=1; }", "(switch $a (cases 1) (cBlock (= $a 1)))"},
                    {
                        "switch($a){ case 1: case 2: $a=1; break; }",
                        "(switch $a (cases 1 2) (cBlock (= $a 1) break))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $c=1;}",
                        "(switch $a (cases 1) (cBlock (= $a 1)) (cases 2) (cBlock (= $c 1)))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=1; }",
                        "(switch $a (cases 1) (cBlock (= $a 1)) (cases 2 3) (cBlock (= $a 1)))"
                    },
                    {
                        "switch($a){ case 1: $a=1; $b=2; }",
                        "(switch $a (cases 1) (cBlock (= $a 1) (= $b 2)))"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=2; default: $c=2; }",
                        "(switch $a "
                            + "(cases 1) (cBlock (= $a 1)) "
                            + "(cases 2 3) (cBlock (= $a 2)) "
                            + "(cases default) (cBlock (= $c 2))"
                        + ")"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $a=1; default: $c=2; case 3: $a=2; }", 
                        "(switch $a "
                            + "(cases 1) (cBlock (= $a 1)) "
                            + "(cases 2) (cBlock (= $a 1)) "
                            + "(cases default) (cBlock (= $c 2)) "
                            + "(cases 3) (cBlock (= $a 2))"
                        + ")"
                    },
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } case 2: case 3: {$a=1;} }",
                        "(switch $a "
                            + "(cases 1) (cBlock (= $a 1) (= $b 2)) "
                            + "(cases 2 3) (cBlock (= $a 1))"
                        + ")"
                    },                    
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } {$a=1;} case 2: case 3: {$a=1;} }",
                        "(switch $a "
                            + "(cases 1) (cBlock (= $a 1) (= $b 2) (= $a 1)) "
                            + "(cases 2 3) (cBlock (= $a 1))"
                        + ")"
                    },
                    //due to the design decision that empty cases are allowed
                    {
                        "switch($a){ case 1: $a=1; case 1+1: default: case 2: $b=2; case 2: case 3: {$a=1;} }",
                        "(switch $a "
                            + "(cases 1) (cBlock (= $a 1)) "
                            + "(cases (+ 1 1) 2 default) (cBlock (= $b 2)) "
                            + "(cases 2 3) (cBlock (= $a 1))"
                        + ")"
                    },
        });
    }
}
