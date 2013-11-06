package ch.tutteli.tsphp.parser.test.integration.ast;

import static ch.tutteli.tsphp.parser.antlr.TSPHPParser.*;
import ch.tutteli.tsphp.parser.test.integration.testutils.AAstTokenTest;
import static ch.tutteli.tsphp.parser.test.integration.testutils.AstHelper.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NamespaceTokenTest extends AAstTokenTest
{

    public NamespaceTokenTest(String testString, List<Integer> expectedTokens) {
        super(testString, expectedTokens);
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
                    {"namespace a; ", Arrays.asList(DOWN, Namespace, TYPE_NAME, NAMESPACE_BODY, UP)},
                    {"namespace a {}", Arrays.asList(DOWN, Namespace, TYPE_NAME, NAMESPACE_BODY, UP)},
                    //default
                    {
                        "namespace{}",
                        Arrays.asList(DOWN, Namespace, DEFAULT_NAMESPACE, NAMESPACE_BODY, UP)
                    },
                    //without namespace
                    {
                        "$a=1;",
                        Arrays.asList(DOWN, Namespace, DEFAULT_NAMESPACE, DOWN, NAMESPACE_BODY,
                                DOWN, EXPRESSION, DOWN, Assign, VariableId, Int, UP, UP,
                                UP, UP)
                    },});
    }
}
