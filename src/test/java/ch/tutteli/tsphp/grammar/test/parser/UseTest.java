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
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
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
public class UseTest extends AParserTest
{

    public UseTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] declarations = getUseDeclarations();
        for(String declaration:declarations){
            collection.add(new Object[]{declaration});
            collection.add(new Object[]{"namespace a; "+declaration});
            collection.add(new Object[]{"namespace a{ "+declaration+"}"});
            collection.add(new Object[]{"namespace a; "+declaration+" namespace b;"+declaration});
            collection.add(new Object[]{"namespace a{ "+declaration+"} namespace{ "+declaration+"}"});
        }
        return collection;
    }

    public static String[] getUseDeclarations() {
        return new String[]{
                    "use \\Exception;",
                    "use \\a\\a;",
                    "use a\\a;",
                    "use a\\a\\b;",
                    "use \\Exception as MyException;",
                    "use \\a\\a as b;",
                    "use a\\a as b;",
                    "use a\\a\\b as c;",
                    //comma initialisation
                    "use \\Exception, a\\a;",
                    "use \\a\\a, \\Exception;",
                    "use a\\a, \\Exception as b;",
                    "use a\\a\\b, \\a\\b\\c as d;",
                    "use \\Exception as MyException, \\a\\b;",
                    "use a\\a as b, a\\b;",
                    "use a\\a\\b as c, a\\a, \\Exception;"
                };

    }
}
