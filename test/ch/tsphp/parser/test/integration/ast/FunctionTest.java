package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.ParameterListHelper;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import ch.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FunctionTest extends AAstTest
{

    public FunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "function ", " get(){}",
                "(function fMod ", " get() params block)", ""));

        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", "){}",
                "(function fMod (type tMod void) set() ", " block)"));

        collection.add(new Object[]{
                    "function void foo(){$a=1; int $b=2;}",
                    "(function fMod (type tMod void) foo() params (block (expr (= $a 1)) (vars (type tMod int) ($b 2))))"
                });

        return collection;
    }
}
