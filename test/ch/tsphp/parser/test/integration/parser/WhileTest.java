/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WhileTest extends AParserTest
{

    public WhileTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"while( true  ) $a=1;"},
                    {"while( true  ){$a=1;}"},
                    {"while( true  ){$a=1;int $b=2;}"},
                    {"do $a=1; while( true  );"},
                    {"do {$a=1;} while( true  );"},
                    {"do {$a=1;$b=2;}while( true  );"}
                });
    }
}
