package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.IdentifierHelper;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VariableDeclarationWithoutInitialisationTest extends AParserTest
{

    public VariableDeclarationWithoutInitialisationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameters
    public static Collection<Object[]> vars() {
        return Arrays.asList(new Object[][]{
                    {"bool $a;"},
                    {"bool $A;"},
                    {"int $_;"},
                    {"float $" + IdentifierHelper.asciiToString(165) + ";"},
                    {"string \n $" + IdentifierHelper.getAllLowerCaseCharacters() + ";"},
                    {"array \t $" + IdentifierHelper.getAllUpperCaseCharacters() + ";"},
                    {"resource                 $a" + IdentifierHelper.getAllDigits() + ";        "},
                    {"bool $" + IdentifierHelper.getAllSpecialCharacters() + ";"},
                    {"bool $_; bool \n $_; int \t $_____________________________;"},
                    {"int \n $" + IdentifierHelper.asciiToString(128) + IdentifierHelper.asciiToString(165) + ";"},
                    {"float $aA_; \n float $_a; float \t $_A;"},
                    {"string $a11238281102A;"},
                    {"int $a1123ääöä82£81102A;"},
                    {"array $bool;"},
                    {"resource $bool;"},
                    {"int $int;"},
                    {"int $float;"},
                    {"int $string;"},
                    {"int $array;"},
                    {"int $resource;"},
                    
                });
    }
}
