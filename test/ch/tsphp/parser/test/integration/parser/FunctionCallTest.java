package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FunctionCallTest extends AParserTest
{

    public FunctionCallTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
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
