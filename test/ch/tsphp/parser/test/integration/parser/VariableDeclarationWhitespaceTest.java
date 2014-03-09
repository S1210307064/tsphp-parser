package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class VariableDeclarationWhitespaceTest extends AParserTest
{

    public VariableDeclarationWhitespaceTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"int$a;"}, //testNoWhitespace
                {"int$a=0;"}, //testNoWhiteSpaceAssignment
                {"int      $a;"}, //testWhitespaceAfterType
                {"float \t \t $a;"}, //testTabAfterType
                {"bool \n \r \n $a;"}, //testNewLineAfterType
                {"bool \n \r \t   \n \t \t\t  \r\n\n $a;"}, //testAllAfterType

                {"int $a    ;"}, //testWhitespaceAfterID
                {"float $a\t \t ;"}, //testTabAfterID
                {"bool$a \n \r \n ;"}, //testNewLineAfterID
                {"bool$a \n \r \t   \n \t \t\t  \r\n\n ;"}, //testAllAfterID

                {"int $a =      1;"}, //testWhitespaceAfterEqual
                {"float $a = \t \t 1.012;"}, //testTabAfterEqual
                {"bool $a =  \n \r \n true;"}, //testNewLineAfterEqual
                {"bool $a = \n \r \t   \n \t \t\t  \r\n\n false;"}, //testAllAfterEqual

                {" \n \r \t   \n \t  int  \n \r \t   \n \t \t\t  \r\n\n"
                        + " $a \n \r \t   \n \t \t\t  \r\n\n =   \n \r \t\t 1;"
                        + " string \n\n\r $b \n\n\r\t = 'test' \n \r\t; "} // testEverythingMultipleVars
        });
    }
}
