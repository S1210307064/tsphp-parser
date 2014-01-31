package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.VariableDeclarationListHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClassMemberTest extends AAstTest
{

    public ClassMemberTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        String[][] variations = new String[][]{
//            {"", "public"},
//            {"private", "private"},
            {"private static", "private static"},
            {"protected", "protected"},
            {"protected static", "protected static"},
            {"public", "public"},
            {"public static", "public static"},
            {"static", "static public"},
            {"static private", "static private"},
            {"static protected", "static protected"},
            {"static public", "static public"}
        };

        for (String[] variation : variations) {
            collection.addAll(VariableDeclarationListHelper.testStrings(
                    variation[0] + " ", ";",
                    "(cMem ", ")", variation[1]));
        }
        return collection;
    }
}
