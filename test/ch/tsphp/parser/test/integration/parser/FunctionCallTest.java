/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class FunctionCallTest extends AParserTest
{

    public FunctionCallTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"foo();"});
        collection.add(new Object[]{"foo(1,1);"});
        collection.add(new Object[]{"foo(true || false,1+1,'hello'.'world');"});
        collection.add(new Object[]{"\\foo();"});
        collection.add(new Object[]{"a\\foo();"});
        collection.add(new Object[]{"a\\a\\foo();"});
        collection.add(new Object[]{"a\\a\\b\\foo();"});
        collection.add(new Object[]{"\\a\\foo();"});
        collection.add(new Object[]{"\\a\\b\\foo();"});
        collection.add(new Object[]{"\\a\\b\\c\\foo();"});
        collection.add(new Object[]{"foo()->bar();"});
        collection.add(new Object[]{"foo()->bar()->asdf();"});
        collection.add(new Object[]{"foo()->a->bar()[0]->asdf();"});
        collection.add(new Object[]{"foo()->bar()[0]->a->asdf();"});
        
        //Fluent
        collection.addAll(MethodCallTest.getCalls(""));
        
        String[] expressions = ExpressionHelper.getParserExpressions();
        for(String expression:expressions){
            collection.add(new Object[]{"foo("+expression+");"});
        }
        return collection;
    }
}
