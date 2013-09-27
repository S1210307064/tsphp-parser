package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IncrementDecrementTest extends AParserTest
{

    public IncrementDecrementTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(testStrings("$a"));
        collection.addAll(testStrings("$this"));
        collection.addAll(testStrings("self::$a"));
        collection.addAll(testStrings("parent::$a"));
        return collection;
    }

    private static Collection<Object[]> testStrings(String variable) {
        return Arrays.asList(new Object[][]{
                    {"++" + variable + ";"},
                    {"--" + variable + ";"},
                    {"++" + variable + "->a;"},
                    {"--" + variable + "->a;"},
                    {"++" + variable + "[0];"},
                    {"--" + variable + "[0];"},
                    {variable + "++;"},
                    {variable + "--;"},
                    {variable + "->a" + "++;"},
                    {variable + "->a" + "--;"},
                    {variable + "[0]" + "++;"},
                    {variable + "[0]" + "--;"}
                });
    }
}
