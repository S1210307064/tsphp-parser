/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class CastAssignTest extends AAstTest
{

    public CastAssignTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        List<String> allTypesWithoutObject = TypeHelper.getAllTypesWithoutObject();
        for (String type : allTypesWithoutObject) {
            collection.add(new Object[]{
                    "$a = () 1;",
                    "(expr (cAssign $a 1))"
            });
            collection.add(new Object[]{
                    type + " $a =() 1;",
                    "(vars (type tMod " + type + ") ($a (casting (type tMod " + type + ") 1)))"
            });
        }
        return collection;
    }
}
