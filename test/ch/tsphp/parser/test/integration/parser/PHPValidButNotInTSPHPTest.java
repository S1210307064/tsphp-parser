/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PHPValidButNotInTSPHPTest extends AParserParserExceptionTest
{

    public PHPValidButNotInTSPHPTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                //switch with multiple default blocks
                {"switch($a){case 1: default: $a=1; break; case 2: default: $a=2; break;}", TSPHPParser.Default, 49},
                //function with pseudo optional parameter
                {"function a ($a,$b=1,$c){$a=1;}", TSPHPParser.LeftParenthesis, 11},
                //use outside of semicolon namespace
                {"use a\\a; namespace a;", TSPHPParser.Namespace, 9},
                {"$a <> $b", TSPHPParser.NotEqualAlternative, 3},
                //casts with alternative type names
                {"(boolean) $a;", TSPHPParser.TypeAliasBool, 1},
                {"(integer) $a;", TSPHPParser.TypeAliasInt, 1},
                {"(double) $a;", TSPHPParser.TypeAliasFloat, 1},
                {"(real) $a;", TSPHPParser.TypeAliasFloat2, 1},
                //TODO TSPHP-612 alternative keywords
        });
        //See TokenExceptionTest for misuse of keywords
    }
}
