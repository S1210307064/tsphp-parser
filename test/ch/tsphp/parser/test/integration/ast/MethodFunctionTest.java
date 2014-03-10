/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MethodFunctionTest extends AAstTest
{

    public MethodFunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.compilationUnit();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "class a {  function void getName(){ $a=1; } }  function void getName(){ $a=1; }",
                        "(namespace \\ (nBody "
                            + "(class cMod a extends implements (cBody "
                                + "(mDecl (mMod public) (type tMod void) getName() params (block (expr (= $a 1))))"
                            + ")) "
                            + "(function fMod (type tMod void) getName() params (block (expr (= $a 1))))"
                        + "))"
                    },
                    {
                        "/** this is my lovely function */ \n function void foo(int $a=true,int $b=2,cast int $c=3){}",
                        "(namespace \\ (nBody (function fMod (type tMod void) foo() (params "
                            + "(pDecl (type tMod int) ($a true)) "
                            + "(pDecl (type tMod int) ($b 2)) "
                            + "(pDecl (type (tMod cast) int) ($c 3))"
                        + ") block)))"
                    }
                });
    }
}
