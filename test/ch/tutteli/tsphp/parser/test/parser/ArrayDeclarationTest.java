package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.test.testutils.AParserTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArrayDeclarationTest extends AParserTest
{

    public ArrayDeclarationTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] strings = getArrayTestStrings();
        for (String string : strings) {
            collection.add(new Object[]{"array $a = " + string + ";"});
        }
        
        //Expressions are covered in ch.tutteli.tsphp.grammar.test.ast.ArrayDeclarationTest
        
        return collection;
    }

    public static String[] getArrayTestStrings() {
        return new String[]{
                    "[]",
                    "array()",
                    "[1,2.0,'single quoted string', \"double quoted string\",true,false]",
                    "array(1,2.0,'single quoted string', \"double quoted string\",true,false)",
                    "[[],array()]",
                    "array([],array())",
                    "[1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo']",
                    "array(1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo')",
                    "[1=>[],2.0=>array()]",
                    "array(1=>[],2.0=>array())",
                    "[1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo',1 => array(), 2=>[],1,2.0,'single quoted string', \"double quoted string\",true,false,[],array()]",
                    "array(1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo',1 => array(), 2=>[],1,2.0,'single quoted string', \"double quoted string\",true,false,[],array())"
                };
    }
}
