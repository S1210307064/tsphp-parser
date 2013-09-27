package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.testutils.AAstTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PostFixTest extends AAstTest
{

    public PostFixTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        String[][] tmp1 = new String[][]{
            {"$a->foo()", "(mCall $a foo() args)"},
            {"$this->foo()", "(mCall $this foo() args)"},
            {"self::foo()", "(mCall self foo() args)"},
            {"parent::foo()", "(mCall parent foo() args)"},
            {"Foo::foo()", "(smCall Foo foo() args)"},
            //
            {"$a[0]", "(arrAccess $a 0)"},
            {"$this[0]", "(arrAccess $this 0)"},
            //
            {"self::$a", "(sMemAccess self $a)"},
            {"parent::$a", "(sMemAccess parent $a)"},
            {"Foo::$a", "(sMemAccess Foo $a)"},
            {"\\bar\\Foo::$a", "(sMemAccess \\bar\\Foo $a)"}
        };
        List<Object[]> tmp2 = new ArrayList<>();
        for (String[] expression : tmp1) {
            tmp2.add(expression);
            tmp2.add(new String[]{expression[0] + "[0]", "(arrAccess " + expression[1] + " 0)"});
            tmp2.add(new String[]{
                        expression[0] + "->foo('hello')",
                        "(mpCall " + expression[1] + " foo() (args 'hello'))"
                    });
        }

        List<Object[]> tmp3 = new ArrayList<>();
        for (Object[] expression : tmp2) {
            tmp3.add(expression);
            tmp3.add(new String[]{expression[0] + "[$i]", "(arrAccess " + expression[1] + " $i)"});
            tmp3.add(new String[]{
                        expression[0] + "->foo(1,2)",
                        "(mpCall " + expression[1] + " foo() (args 1 2))"
                    });
        }

        for (Object[] expression : tmp3) {
            collection.add(new Object[]{expression[0] + ";","(expr "+ expression[1]+")"});
            collection.add(new Object[]{
                expression[0] + "[$i+$j%2];", "(expr (arrAccess " + expression[1] + " (+ $i (% $j 2))))"
            });
            collection.add(new Object[]{
                        expression[0] + "->foo($a + $b);",
                        "(expr (mpCall " + expression[1] + " foo() (args (+ $a $b))))"
                    });
        }

        return collection;
    }
}
