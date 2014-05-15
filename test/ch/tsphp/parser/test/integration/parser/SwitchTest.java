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
public class SwitchTest extends AParserTest
{

    public SwitchTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"switch($a){ case 1: int $a=1; }"},
                {"switch($a){ case 1: int $a=1; case 2: $c=1;}"},
                {"switch($a){ case 1: int $a=1; case 2: case 3: $a=1; }"},
                {"switch($a){ case 1: int $a=1; $b=2; }"},
                {"switch($a){ case 1: int $a=1; case 2: case 3: $a=2; default: $c=2; }"},
                {"switch($a){ case 1: int $a=1; case 2: $a=1; default: $c=2; case 3: $a=2; }"},
                {"switch($a){ case 1: {int $a=1; $b=2; } case 2: case 3: {$a=1;} }"},
                {"switch($a){ case 1: {int $a=1; $b=2; } {$a=1;} case 2: case 3: {$a=1;} }"},
                //case labels which do nothing more than the default label
                {"switch($a){ case 1: default: $a=1;}"},
                {"switch($a){ case 1: $a=1; case 1+1: default: case 2: $a=1;}"},
                {"switch($a){ case 1: case 2: default: $a=1;}"},
                {"switch($a){ case 0: $a=1; case 1: case 2: default: $a=1;}"}
        });
    }
}
