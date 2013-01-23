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
public class ArrayAccess extends AParserTest
{

    public ArrayAccess(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList();
        String[] expressions = ExpressionTest.getAllExpressions();

        for (String expression : expressions) {
            collection.add(new Object[]{"array $d = $a[" + expression + "];"});
            collection.add(new Object[]{"array $d = $a[" + expression + "][" + expression + "];"});
            collection.add(new Object[]{"array $d = foo()[" + expression + "][" + expression + "];"});
            collection.add(new Object[]{"array $d = $a->foo()[" + expression + "][" + expression + "];"});
            collection.add(new Object[]{"array $d = self::foo()[" + expression + "][" + expression + "];"});
            collection.add(new Object[]{"array $d = parent::foo()[" + expression + "][" + expression + "];"});
            collection.add(new Object[]{"array $d = Foo::foo()[" + expression + "][" + expression + "];"});
        }
        collection.add(new Object[]{"int $d = $a->foo()[0]->foo('hallo')->bar()[2][3];"});
        collection.add(new Object[]{"int $d = foo()[0]->foo('hallo')->bar()[2][3];"});
        collection.add(new Object[]{"int $d = foo()[0]->foo('hallo')->bar()[2][3]->fo()[2][3+1];"});
        collection.add(new Object[]{"int $d = foo()[0]->a->foo('hallo')[0][$a]->bar()[2]->foo()[3][5]->foo();"});
        collection.add(new Object[]{"int $d = $a->a[0]->b[0][1]->foo()->bar()[2]->foo()[3][5]->foo();"});
        return collection;
    }
}
