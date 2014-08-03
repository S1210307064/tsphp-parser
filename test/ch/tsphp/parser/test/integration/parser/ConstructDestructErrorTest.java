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
public class ConstructDestructErrorTest extends AParserParserExceptionTest
{

    public ConstructDestructErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //return type
                    {"class A{function void __construct(){}}", TSPHPParser.Construct, 22},
                    {"class A{function void __destruct(){}}", TSPHPParser.Destruct, 22},
                    //Destruct does not support arguments
                    {"class A{function __destruct(int $a=1){}}", TSPHPParser.TypeInt, 28},
                    //static is not allowed for construct/destruct
                    {"class A{static function __construct(){}}", TSPHPParser.Construct, 24},
                    {"class A{static function __destruct(){}}", TSPHPParser.Destruct, 24},
                    {"class A{static final function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{static final function __destruct(){}}", TSPHPParser.Destruct, 30},
                    {"class A{final static function __construct(){}}", TSPHPParser.Construct, 30},
                    {"class A{final static function __destruct(){}}", TSPHPParser.Destruct, 30},
                    //abstract construct/destruct cannot be static or final
                    {"class A{static abstract function __construct(){}}", TSPHPParser.Abstract, 15},
                    {"class A{static abstract function __destruct(){}}", TSPHPParser.Abstract, 15},
                    {"class A{abstract static function __construct(){}}", TSPHPParser.Static, 17},
                    {"class A{abstract static function __destruct(){}}", TSPHPParser.Static,17},
                    {"class A{final abstract function __construct(){}}", TSPHPParser.Abstract, 14},
                    {"class A{final abstract function __destruct(){}}", TSPHPParser.Abstract, 14},
                    {"class A{abstract final  function __construct(){}}", TSPHPParser.Final, 17},
                    {"class A{abstract final  function __destruct(){}}", TSPHPParser.Final, 17},
                    //abstract construct/destruct cannot be private
                    {"class A{abstract private  function __construct(){}}", TSPHPParser.Private, 17},
                    {"class A{private abstract function __destruct(){}}", TSPHPParser.Abstract, 16},
                });
    }
}
