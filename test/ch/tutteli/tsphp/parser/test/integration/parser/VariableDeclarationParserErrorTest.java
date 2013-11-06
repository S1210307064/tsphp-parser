package ch.tutteli.tsphp.parser.test.integration.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class VariableDeclarationParserErrorTest extends AParserParserExceptionTest
{

    public VariableDeclarationParserErrorTest(String testString, int evilCharacter, int atPosition) {
        super(testString, RecognitionException.class, evilCharacter, atPosition);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"int $a int $b;", TSPHPParser.TypeInt, 7},
                    {"int $a 1", TSPHPParser.Int, 7},
                    {"int a;", TSPHPParser.Identifier, 4},
                    {"int $a", -1, 6},
                    //alias can not be used
                    {"boolean $a;",TSPHPParser.TypeAliasBool,0},
                    {"integer $a;",TSPHPParser.TypeAliasInt,0},
                    {"double $a;",TSPHPParser.TypeAliasFloat,0},
                
                });
    }
}