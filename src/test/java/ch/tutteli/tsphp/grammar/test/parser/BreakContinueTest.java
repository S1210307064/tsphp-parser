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
public class BreakContinueTest extends AParserTest
{

    public BreakContinueTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(testStrings("break"));
        collection.addAll(testStrings("continue"));
        collection.addAll(testStrings("break 3"));
        collection.addAll(testStrings("continue 2"));
        return collection;

    }

    public static Collection<Object[]> testStrings(String breakOrContinue) {
        return Arrays.asList(new Object[][]{
                    {"for(;;)" + breakOrContinue + ";"},
                    {"for(;;){" + breakOrContinue + ";}"},
                    {"foreach([] as $k)" + breakOrContinue + ";"},
                    {"foreach([] as $k){" + breakOrContinue + ";}"},
                    {"while(true)" + breakOrContinue + ";"},
                    {"while(true){" + breakOrContinue + ";}"},
                    {"do break; while(true);"},
                    {"do{ break;}while(true);"},
                    {"switch($a){case 1: " + breakOrContinue + ";}"},
                    {"switch($a){case 1: $a=1; " + breakOrContinue + "; default: $a=2; " + breakOrContinue + ";}"}
                });
    }
}
