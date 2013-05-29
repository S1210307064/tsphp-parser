/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
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
public class CloneTest extends AParserTest
{

    public CloneTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(MethodCallTest.getCalls("object $a = clone $this->"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone $a->"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone self::"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone parent::"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone Foo::"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone $this->a->"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone self::$a->"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone parent::$a->"));
        collection.addAll(MethodCallTest.getCalls("object $a = clone Bar::$a->"));
        collection.addAll(Arrays.asList(new Object[][]{
                    {"$a = clone $b;"},
                    {"$a = clone $b->a;"},
                    {"$a = clone $b->a[0];"},
                    {"$a = clone self::$a;"},
                    {"$a = clone self::$a[0];"},
                    {"$a = clone parent::$a;"},
                    {"$a = clone parent::$a[0];"},
                    {"$a = clone Foo::$a;"},
                    {"$a = clone Foo::$a[0];"},
                }));
        return collection;
    }
}
