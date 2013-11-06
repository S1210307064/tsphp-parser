package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.test.integration.testutils.ExpressionHelper;
import ch.tutteli.tsphp.parser.test.integration.testutils.AParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MethodCallTest extends AParserTest
{

    public MethodCallTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"$a->foo();"});
        collection.add(new Object[]{"$a->foo(1,1);"});
        collection.add(new Object[]{"$a->foo(true || false,1,1+1,'hello'.'world');"});

        String[] expressions = ExpressionHelper.getParserExpressions();
        for (String expression : expressions) {
            collection.add(new Object[]{"$a->foo(" + expression + ");"});
        }

        collection.addAll(getCalls("$this->"));
        collection.addAll(getCalls("$a->"));
        collection.addAll(getCalls("self::"));
        collection.addAll(getCalls("parent::"));
        collection.addAll(getCalls("Foo::"));
        collection.addAll(getCalls("$this->a->"));
        collection.addAll(getCalls("self::$a->"));
        collection.addAll(getCalls("parent::$a->"));
        collection.addAll(getCalls("Bar::$a->"));

        return collection;
    }

    public static Collection<Object[]> getCalls(String prefix) {
        return Arrays.asList(new Object[][]{
                    {prefix + "a();"},
                    {prefix + "b()->d();"},
                    {prefix + "c()->e()->f();"}
                });
    }
}
