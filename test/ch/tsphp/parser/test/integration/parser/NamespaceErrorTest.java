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
public class NamespaceErrorTest extends AParserParserExceptionTest
{

    public NamespaceErrorTest(String testString, int token, int position) {
        super(testString, token, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> vars() {
        return Arrays.asList(new Object[][]{
                    //namespace afterwards
                    {"int $a; namespace a;", TSPHPParser.Namespace, 8},
                    //namespace semicolon mixed with curly brace namespace
                    {"namespace a; $a=1; namespace b{$a=1;}", TSPHPParser.LeftCurlyBrace, 30},
                    {"namespace a{ $a=1;} namespace b; $a=1;", TSPHPParser.Semicolon, 31},
                    //statements outside of curly brace namespace
                    {"namespace a{ $a=1;} $a=1; namespace b{ $a=1;}", TSPHPParser.VariableId, 20},
                    
                });
    }
}
