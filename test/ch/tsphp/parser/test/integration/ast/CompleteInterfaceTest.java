/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CompleteInterfaceTest extends AAstTest
{

    public CompleteInterfaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "interface A extends B{\n"
                            +"const bool A=true,B=null,C=false;\n"
                            +"/*some comments \n"
                            + "*/\n"
                            +"public function __construct(int $number);\n"
                            +"// a comment\n"
                            + "function void set(int $b,cast float $c);\n"
                        + "}\n",
                        "(interface (iMod abstract) A (extends B) (iBody "
                            +"(consts (type (tMod public static final) bool) (A# true) (B# null) (C# false)) "
                            +"(__construct() (mMod public abstract) (type tMod void) "
                                + "(params (pDecl (type tMod int) $number)) block"
                            + ") "
                            +"(mDecl (mMod public abstract) (type tMod void) set() (params "
                                    + "(pDecl (type tMod int) $b) "
                                    + "(pDecl (type (tMod cast) float) $c)"
                            + ") block)"
                        + "))"
                    },
                    
                });

    }
}
