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
public class InterfaceMethodTest extends AAstTest
{

    public InterfaceMethodTest(String testString, String expectedResult) {
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
        collection.add(new Object[]{
            "public function void foo();",
            "(mDecl (mMod public abstract) (type tMod void) foo() params block)"
        });

        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "function ", " get();",
                "(mDecl (mMod public abstract) ", " get() params block)", ""));

        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set(", ");",
                "(mDecl (mMod public abstract) (type tMod void) set() ", " block)"));

        return collection;
    }
}
