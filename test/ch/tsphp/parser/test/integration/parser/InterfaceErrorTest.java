/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InterfaceErrorTest extends AParserParserExceptionTest
{

    public InterfaceErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                //fields in interfaces
                {"interface A{ public int $a;}", TSPHPParser.TypeInt, 20},
                //static fields in interfaces
                {"interface A{ public static int $a;}", TSPHPParser.Static, 20},
                //wrong modifier for method
                {"interface A{ private function void a);}", TSPHPParser.Private, 13},
                {"interface A{ protected function void a);}", TSPHPParser.Protected, 13},
                //method body
                {"interface A{function void a(){}}", TSPHPParser.LeftCurlyBrace, 29},
                //interface methods are already abstract
                {"interface A{ abstract function void a();}", TSPHPParser.Abstract, 13},
                //Destruct in interface
                {"interface A{ function __destruct();}", TSPHPParser.Destruct, 22},
        });
    }
}
