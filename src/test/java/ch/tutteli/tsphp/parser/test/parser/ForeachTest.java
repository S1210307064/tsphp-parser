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
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.utils.AParserTest;
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
public class ForeachTest extends AParserTest
{

    public ForeachTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"foreach($a as int $k => MyClass $v)$a=1;"},
                    {"foreach($a as float $v) $a=1;"},
                    {"foreach($a as string $k => string $v){$a=1;}"},
                    {"foreach($a as bool $v) {$a=1;}"},
                    {"foreach($a as bool $k=> array $v){$a=1; $b=1;}"},
                    {"foreach($a as int $v) {$a=1; $b=3;}"},
                    
        }));
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"foreach(" + string + " as int $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as float $k => MyClass $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as bool $v) {$a=1;}"});
            collection.add(new Object[]{"foreach(" + string + " as string $k => string $v) {$a=1;}"});
            
        }
        
        return collection;
    }
}
