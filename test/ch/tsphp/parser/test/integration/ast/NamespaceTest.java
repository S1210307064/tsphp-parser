/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NamespaceTest extends AAstTest
{

    public NamespaceTest(String testString, String expectedResult) {
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
                    {"namespace a; \n $a=1; $b=1;", "(namespace \\a\\ (nBody (expr (= $a 1)) (expr (= $b 1))))"},
                    {"namespace a { \n $a=1; $b=1;}", "(namespace \\a\\ (nBody (expr (= $a 1)) (expr (= $b 1))))"},
                    {
                        "namespace a; $a=1; namespace b; $b=1;",
                        "(namespace \\a\\ (nBody (expr (= $a 1)))) "
                        + "(namespace \\b\\ (nBody (expr (= $b 1))))"
                    },
                    {
                        "namespace a { $a=1;} namespace b{ $b=1;}",
                        "(namespace \\a\\ (nBody (expr (= $a 1)))) "
                        + "(namespace \\b\\ (nBody (expr (= $b 1))))"
                    },
                    {
                        "namespace a\\b; \n $a=1; $b=1;",
                        "(namespace \\a\\b\\ (nBody (expr (= $a 1)) (expr (= $b 1))))"
                    },
                    {
                        "namespace a\\b\\c { \n $a=1; $b=1;}",
                        "(namespace \\a\\b\\c\\ (nBody (expr (= $a 1)) (expr (= $b 1))))"
                    },
                    {
                        "namespace a\\b\\c; $a=1; namespace d\\e; $b=1;",
                        "(namespace \\a\\b\\c\\ (nBody (expr (= $a 1)))) "
                        + "(namespace \\d\\e\\ (nBody (expr (= $b 1))))"
                    },
                    {
                        "namespace a\\b { $a=1;} namespace c\\d\\e{ $b=1;}",
                        "(namespace \\a\\b\\ (nBody (expr (= $a 1)))) "
                        + "(namespace \\c\\d\\e\\ (nBody (expr (= $b 1))))"
                    },
                    //default
                    {"namespace{$a=1;}", "(namespace \\ (nBody (expr (= $a 1))))"},
                    //without namespace
                    {"$a=1;", "(namespace \\ (nBody (expr (= $a 1))))"},
                    {"B $a;", "(namespace \\ (nBody (vars (type tMod B) $a)))"}
                });
    }
}
