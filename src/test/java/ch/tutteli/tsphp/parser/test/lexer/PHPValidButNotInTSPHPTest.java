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
package ch.tutteli.tsphp.parser.test.lexer;

import ch.tutteli.tsphp.parser.test.testutils.ALexerTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class PHPValidButNotInTSPHPTest extends ALexerTest
{

    public PHPValidButNotInTSPHPTest(String methodName, String testString) {
        super(methodName, testString, 0);
    }

    @Test
    public void testTokens() throws Exception {
        super.checkForMismatch();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    // vars in quoted strings are not allowed in TSPHP - use ".$a." instead
                    {"mSTRING_DOUBLE_QUOTED", "\"$a\""},
                    // single $ are allowed in PHP but not in TSPHP
                    {"mSTRING_DOUBLE_QUOTED", "\"10 $\""},
                    {"mSTRING_DOUBLE_QUOTED", "\" $ \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\$$ \""},
                    {"mSTRING_DOUBLE_QUOTED", "\" \\\\$$ \""},
                    // $0 cannot be a variable and is therefore allowed in PHP, but not in TSPHP
                    {"mSTRING_DOUBLE_QUOTED", "\" $0123456789 \""},
                    //Unix style comments #
                    {"mComment","# comment"}
                });
    }
}
