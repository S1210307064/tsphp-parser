/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.ParameterListHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class InterfaceConstructTest extends AAstTest
{

    public InterfaceConstructTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
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
