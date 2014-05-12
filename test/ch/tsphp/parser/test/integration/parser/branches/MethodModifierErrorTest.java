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
public class MethodModifierErrorTest extends AParserParserExceptionTest
{

    public MethodModifierErrorTest(String testString, int character, int position) {
        super(testString, NoViableAltException.class, character, position);
    }

    @Test
    public void test() throws RecognitionException {
        parseExpectingException();
    }

    protected void run() throws RecognitionException {
        result = parser.methodModifier();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"static final $notAnAccessModifier", TSPHPParser.VariableId, 13},
                {"static public $notAnAccessModifier", TSPHPParser.VariableId, 14},
                {"static protected $notAnAccessModifier", TSPHPParser.VariableId, 17},
                {"static private $notAnAccessModifier", TSPHPParser.VariableId, 15},
                {"static $notAnAccessModifier", TSPHPParser.VariableId, 7},

                {"final static $notAnAccessModifier", TSPHPParser.VariableId, 13},
                {"final public $notAnAccessModifier", TSPHPParser.VariableId, 13},
                {"final protected $notAnAccessModifier", TSPHPParser.VariableId, 16},
                {"final private $notAnAccessModifier", TSPHPParser.VariableId, 14},
                {"final $notAnAccessModifier", TSPHPParser.VariableId, 6},

                {"public final $notAnAccessModifier", TSPHPParser.VariableId, 13},
                {"public static $notAnAccessModifier", TSPHPParser.VariableId, 14},
                {"public $notAnAccessModifier", TSPHPParser.VariableId, 7},

                {"private final $notAnAccessModifier", TSPHPParser.VariableId, 14},
                {"private static $notAnAccessModifier", TSPHPParser.VariableId, 15},
                {"private $notAnAccessModifier", TSPHPParser.VariableId, 8},

                {"$notAnAccessModifier", TSPHPParser.VariableId, 0},

        });
    }
}

