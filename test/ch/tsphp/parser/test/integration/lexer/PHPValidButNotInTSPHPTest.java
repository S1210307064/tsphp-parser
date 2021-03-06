/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
                    {"mComment","# comment"},
                });
    }
}
