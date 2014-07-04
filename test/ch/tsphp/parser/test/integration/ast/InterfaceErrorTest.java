/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AAstErrorTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InterfaceErrorTest extends AAstErrorTest
{

    public InterfaceErrorTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                // see TSPHP-652 Exception when type for extends/implements is missing
                {"interface A extends {}",
                        "(interface (iMod abstract) A (extends "
                                + getErrorNodeText(6, 20, 20, "{", TSPHPParser.LeftCurlyBrace, "{")
                                + ") iBody)"},
                //other ideas due to TSPHP-652
                {"interface A extends - {}",
                        "(interface (iMod abstract) A (extends "
                                + getErrorNodeText(6, 20, 20, "-", TSPHPParser.Minus, "-")
                                + ") iBody)"},
                {"interface A extends -B {}",
                        "(interface (iMod abstract) A (extends "
                                + getErrorNodeText(6, 20, 20, "-", TSPHPParser.Minus, "-B")
                                + ") iBody)"},
        });
    }
}
