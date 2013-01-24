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
public class FunctionTest extends AParserTest
{

    public FunctionTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"function void setName(string $name){}"},
                    {"function void setName(string $name){int $a=1;}"},
                    {"function void setName(string $firstname,string $lastname){int $a=1;}"},
                    {"function string getName(){return \"Robert\";}"},
                    {"function void foo(string $a, string $b='hallo'){$a=$b;}"},
                    {"function void foo(string $a, int $i, int $b=+1){$a=$b;}"},
                    {"function void foo(string $a, int $i, int $b=-10, float $d=2.0){$a=$b;}"},
                    {"function void foo(string $a, int $b=E_ALL){$a=$b;}"},
                    {"function void foo(string $a, bool $a=true, object $d=null){$a=$b;}"},
                    {"function void foo(string $a=null, bool $b, object $d=true){$a=$b;}"} 
                });
    }
}
