package ch.tutteli.tsphp.parser.test.integration.ast;

import ch.tutteli.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.integration.testutils.ParameterListHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InterfaceConstructTest extends AAstTest
{

    public InterfaceConstructTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.interfaceBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "function __construct(", ");",
                "(__construct() (mMod public abstract) (type tMod void) ", " block)"));
        collection.addAll(ParameterListHelper.getTestStrings(
                "public function __construct(", ");",
                "(__construct() (mMod public abstract) (type tMod void) ", " block)"));

        collection.add(new Object[]{
                "function __construct(int $a,bool $b);",
                "(__construct() (mMod public abstract) (type tMod void) (params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod bool) $b)"
                        + ") block)"
        });
        return collection;

    }
}
