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
public class UseTest extends AAstTest
{

    public UseTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"use \\Exception;","(use (use declaration (class/interface type \\ Exception)))"},
                    {"use \\a\\a;","(use (use declaration (class/interface type \\ a a)))"},
                    {"use a\\a;","(use (use declaration (class/interface type a a)))"},
                    {"use a\\a\\b;","(use (use declaration (class/interface type a a b)))"},
                    {
                        "use \\Exception as MyException;", 
                        "(use (use declaration (class/interface type \\ Exception) MyException))"
                    },
                    {"use \\a\\a as b;","(use (use declaration (class/interface type \\ a a) b))"},
                    {"use a\\a as b;","(use (use declaration (class/interface type a a) b))"},
                    {"use a\\a\\b as c;","(use (use declaration (class/interface type a a b) c))"},
                    //comma initialisation
                    {
                        "use \\Exception, a\\a;", 
                        "(use "
                            + "(use declaration (class/interface type \\ Exception)) "
                            + "(use declaration (class/interface type a a))"
                        + ")"
                    },
                    {
                        "use \\a\\a, \\Exception;", 
                        "(use "
                            + "(use declaration (class/interface type \\ a a)) "
                            + "(use declaration (class/interface type \\ Exception))"
                        + ")"
                    },
                    {
                        "use a\\a, \\Exception as b;",
                         "(use "
                            + "(use declaration (class/interface type a a)) "
                            + "(use declaration (class/interface type \\ Exception) b)"
                        + ")"
                    },
                    {
                        "use a\\a\\b, \\a\\b\\c as d;",
                         "(use "
                            + "(use declaration (class/interface type a a b)) "
                            + "(use declaration (class/interface type \\ a b c) d)"
                        + ")"
                    },
                    {
                        "use \\Exception as MyException, \\a\\b;",
                         "(use "
                            + "(use declaration (class/interface type \\ Exception) MyException) "
                            + "(use declaration (class/interface type \\ a b))"
                        + ")"
                    },
                    {
                        "use a\\a as b, a\\b;",
                          "(use "
                            + "(use declaration (class/interface type a a) b) "
                            + "(use declaration (class/interface type a b))"
                        + ")"
                    },
                    {
                        "use a\\a\\b as c, a\\a, \\Exception;",
                        "(use "
                            + "(use declaration (class/interface type a a b) c) "
                            + "(use declaration (class/interface type a a)) "
                            + "(use declaration (class/interface type \\ Exception))"
                        + ")"
                    },
                     {
                        "use a\\a\\b as c, a\\a, \\Exception as d;",
                        "(use "
                            + "(use declaration (class/interface type a a b) c) "
                            + "(use declaration (class/interface type a a)) "
                            + "(use declaration (class/interface type \\ Exception) d)"
                        + ")"
                    }
                });
    }
}
