package ch.tutteli.tsphp.parser.test.integration.ast;

import ch.tutteli.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tutteli.tsphp.parser.test.integration.testutils.ConstantHelper;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InterfaceConstantTest extends AAstTest
{

    public InterfaceConstantTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return ConstantHelper.testStrings("interface B{","}","(interface (iMod abstract) B extends (iBody ","))");
    }
}
