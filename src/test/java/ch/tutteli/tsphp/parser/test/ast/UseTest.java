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

import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.TSPHPAst;
import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.testutils.TypeHelper;
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
        List<Object[]> collection = new ArrayList<>();
        String[] types = TypeHelper.getClassInterfaceTypes();
        boolean isFirstEntry = true;
        for (String type : types) {
            if (!isFirstEntry) {
                String alias = type.substring(type.lastIndexOf("\\")+1);
                collection.add(new Object[]{"use " + type + ";", "(use (uDecl " + type + " " + alias + "))"});

            }
            collection.add(new Object[]{"use " + type + " as MyClass;", "(use (uDecl " + type + " MyClass))"});
            isFirstEntry = false;
        }

        collection.addAll(Arrays.asList(new Object[][]{
                    //comma initialisation
                    {
                        "use \\Exception, a\\a;",
                        "(use "
                        + "(uDecl \\Exception Exception) "
                        + "(uDecl a\\a a)"
                        + ")"
                    },
                    {
                        "use \\a\\a, \\Exception;",
                        "(use "
                        + "(uDecl \\a\\a a) "
                        + "(uDecl \\Exception Exception)"
                        + ")"
                    },
                    {
                        "use a\\a, \\Exception as b;",
                        "(use "
                        + "(uDecl a\\a a) "
                        + "(uDecl \\Exception b)"
                        + ")"
                    },
                    {
                        "use a\\a\\b, \\a\\b\\c as d;",
                        "(use "
                        + "(uDecl a\\a\\b b) "
                        + "(uDecl \\a\\b\\c d)"
                        + ")"
                    },
                    {
                        "use \\Exception as MyException, \\a\\b;",
                        "(use "
                        + "(uDecl \\Exception MyException) "
                        + "(uDecl \\a\\b b)"
                        + ")"
                    },
                    {
                        "use a\\a as b, a\\b;",
                        "(use "
                        + "(uDecl a\\a b) "
                        + "(uDecl a\\b b)"
                        + ")"
                    },
                    {
                        "use a\\a\\b as c, a\\a, \\Exception;",
                        "(use "
                        + "(uDecl a\\a\\b c) "
                        + "(uDecl a\\a a) "
                        + "(uDecl \\Exception Exception)"
                        + ")"
                    },
                    {
                        "use a\\a\\b as c, a\\a, \\Exception as d;",
                        "(use "
                        + "(uDecl a\\a\\b c) "
                        + "(uDecl a\\a a) "
                        + "(uDecl \\Exception d)"
                        + ")"
                    }
                }));
        return collection;
    }
}
