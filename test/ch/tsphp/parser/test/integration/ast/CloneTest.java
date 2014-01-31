package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CloneTest extends AAstTest
{

    public CloneTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
            {"$a = clone $b;", "(expr (= $a (clone $b)))"},
            {"$a = clone $b->a;", "(expr (= $a (clone (memAccess $b a))))"},
            {"$a = clone $b->a[0];", "(expr (= $a (clone (arrAccess (memAccess $b a) 0))))"},
            {"$a = clone self::$a;", "(expr (= $a (clone (sMemAccess self $a))))"},
            {
                "$a = clone self::$a[0];",
                "(expr (= $a (clone (arrAccess (sMemAccess self $a) 0))))"
            },
            {"$a = clone parent::$a;", "(expr (= $a (clone (sMemAccess parent $a))))"},
            {
                "$a = clone parent::$a[0];",
                "(expr (= $a (clone (arrAccess (sMemAccess parent $a) 0))))"
            },
            {
                "$a = clone Foo::$a;",
                "(expr (= $a (clone (sMemAccess Foo $a))))"
            },
            {
                "$a = clone a\\Foo::$a[0];",
                "(expr (= $a (clone (arrAccess (sMemAccess a\\Foo $a) 0))))"
            },
            {
                "$a = clone (Exception) $o;",
                "(expr (= $a (clone (casting (type tMod Exception) $o))))"
            },
            {
                "$a = clone @$o;",
                "(expr (= $a (clone (@ $o))))"
            },
            {
                "$a = clone ~$o;",
                "(expr (= $a (clone (~ $o))))"
            },
            {
                "$a = clone clone ~$o;",
                "(expr (= $a (clone (clone (~ $o)))))"
            },
            {
                "$a = clone @new A();",
                "(expr (= $a (clone (@ (new A args)))))"
            },
        });

    }
}
