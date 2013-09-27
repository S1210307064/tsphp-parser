package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CompleteInterfaceTest extends AAstTest
{

    public CompleteInterfaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
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
