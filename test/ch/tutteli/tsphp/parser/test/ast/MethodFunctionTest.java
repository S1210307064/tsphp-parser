package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
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
