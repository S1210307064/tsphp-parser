/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.lexer.TokenTest;
import ch.tsphp.parser.test.integration.testutils.AParserTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FloatDeclarationTest extends AParserTest
{

    public FloatDeclarationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] floatStrings = TokenTest.getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"float $a = " + floatString + ";"});
            collection.add(new Object[]{"float $a = +" + floatString + ";"});
            collection.add(new Object[]{"float $a = -" + floatString + ";"});
        }
        return collection;
    }
}
