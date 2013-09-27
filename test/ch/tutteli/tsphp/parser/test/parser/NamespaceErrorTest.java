package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.testutils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NamespaceErrorTest extends AParserParserExceptionTest
{

    public NamespaceErrorTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
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
