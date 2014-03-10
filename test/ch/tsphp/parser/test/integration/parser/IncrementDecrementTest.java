/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
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
