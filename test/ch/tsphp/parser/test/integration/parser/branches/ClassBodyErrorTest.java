/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser.branches;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassBodyErrorTest extends AParserParserExceptionTest
{

    public ClassBodyErrorTest(String testString, int character, int position) {
        super(testString, character, position, NoViableAltException.class);
    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    protected void run() throws RecognitionException {
        result = parser.classBody();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"public static function $notReturnType", TSPHPParser.VariableId, 23},
                {"public static $notFunctionKeyword", TSPHPParser.VariableId, 14},
                {"public static function $notReturnType", TSPHPParser.VariableId, 23},
                {"public static $notFunctionKeyword", TSPHPParser.VariableId, 14},
                {"public abstract function $notReturnType", TSPHPParser.VariableId, 25},
                {"public abstract $notFunctionKeyword", TSPHPParser.VariableId, 16},
                {"public final $notFunctionKeyword", TSPHPParser.VariableId, 13},
                {"public final function $notReturnType", TSPHPParser.VariableId, 22},
                {"public function $notReturnType", TSPHPParser.VariableId, 16},
                {"public $notFunctionKeyword", TSPHPParser.VariableId, 7},

                {"protected static $notFunctionKeyword", TSPHPParser.VariableId, 17},
                {"protected abstract function $notReturnType", TSPHPParser.VariableId, 28},
                {"protected abstract $notFunctionKeyword", TSPHPParser.VariableId, 19},
                {"protected final $notFunctionKeyword", TSPHPParser.VariableId, 16},
                {"protected final function $notReturnType", TSPHPParser.VariableId, 25},
                {"protected function $notReturnType", TSPHPParser.VariableId, 19},
                {"protected $notFunctionKeyword", TSPHPParser.VariableId, 10},

                {"private static $notFunctionKeyword", TSPHPParser.VariableId, 15},
                {"private final $notFunctionKeyword", TSPHPParser.VariableId, 14},
                {"private final function $notReturnType", TSPHPParser.VariableId, 23},
                {"private function $notReturnType", TSPHPParser.VariableId, 17},
                {"private $notFunctionKeyword", TSPHPParser.VariableId, 8},


                {"static public function $notReturnType", TSPHPParser.VariableId, 23},
                {"static public $notFunctionKeyword", TSPHPParser.VariableId, 14},
                {"static protected function $notReturnType", TSPHPParser.VariableId, 26},
                {"static protected $notFunctionKeyword", TSPHPParser.VariableId, 17},
                {"static private function $notReturnType", TSPHPParser.VariableId, 24},
                {"static private $notFunctionKeyword", TSPHPParser.VariableId, 15},
                {"static function $notReturnType", TSPHPParser.VariableId, 16},
                {"static $notFunctionKeyword", TSPHPParser.VariableId, 7},


                {"abstract public function $notReturnType", TSPHPParser.VariableId, 25},
                {"abstract public $notFunctionKeyword", TSPHPParser.VariableId, 16},
                {"abstract protected function $notReturnType", TSPHPParser.VariableId, 28},
                {"abstract protected $notFunctionKeyword", TSPHPParser.VariableId, 19},
                {"abstract function $notReturnType", TSPHPParser.VariableId, 18},
                {"abstract $notFunctionKeyword", TSPHPParser.VariableId, 9},

                {"final public $notFunctionKeyword", TSPHPParser.VariableId, 13},
                {"final public function $notReturnType", TSPHPParser.VariableId, 22},
                {"final protected $notFunctionKeyword", TSPHPParser.VariableId, 16},
                {"final protected function $notReturnType", TSPHPParser.VariableId, 25},
                {"final private $notFunctionKeyword", TSPHPParser.VariableId, 14},
                {"final private function $notReturnType", TSPHPParser.VariableId, 23},
                {"final function $notReturnType", TSPHPParser.VariableId, 15},
                {"final $notFunctionKeyword", TSPHPParser.VariableId, 6},

                {"function $notAClassMember", TSPHPParser.VariableId, 9},
                {"$notAClassMember", TSPHPParser.VariableId, 0},
        });
    }
}

