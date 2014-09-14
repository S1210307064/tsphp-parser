/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.VariableDeclarationListHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class FieldTest extends AAstTest
{

    public FieldTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
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
            {"", "public"},
            {"private", "private"},
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
