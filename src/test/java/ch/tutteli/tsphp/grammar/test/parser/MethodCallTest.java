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

import ch.tutteli.tsphp.grammar.test.lexer.TokenTest;
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
public class MethodCallTest extends AParserTest
{

    public MethodCallTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"$a->foo();"});
        collection.add(new Object[]{"$a->foo(1,1);"});
        collection.add(new Object[]{"$a->foo(true || false,1,1+1,'hello'.'world');"});

        String[] expressions = ExpressionTest.getExpressionsWithoutAssignment();
        for (String expression : expressions) {
            collection.add(new Object[]{"$a->foo(" + expression + ");"});
        }

        collection.addAll(getCalls("$this->"));
        collection.addAll(getCalls("$a->"));
        collection.addAll(getCalls("self::"));
        collection.addAll(getCalls("parent::"));
        collection.addAll(getCalls("Foo::"));
        collection.addAll(getCalls("$this->a->"));
        collection.addAll(getCalls("self::$a->"));
        collection.addAll(getCalls("parent::$a->"));
        collection.addAll(getCalls("Bar::$a->"));

        return collection;
    }

    public static Collection<Object[]> getCalls(String prefix) {
        List<Object[]> collection = new ArrayList<>();
        Collection<Object[]> ids = TokenTest.getIDTestStrings();
        for (Object[] obj : ids) {
            collection.addAll(Arrays.asList(new Object[][]{{prefix + obj[1] + "();"}, {prefix + obj[1] + "()->" + obj[1] + "();"}, {prefix + obj[1] + "()->" + obj[1] + "()->" + obj[1] + "();"}}));
        }
        return collection;
    }
}
