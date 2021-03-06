/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.lexer.FragmentsTest;
import ch.tsphp.parser.test.integration.lexer.TokenTest;
import ch.tsphp.parser.test.integration.testutils.AParserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class VariableAssignmentTest extends AParserTest
{

    public VariableAssignmentTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
        collection.add(new Object[]{"$bool = true;"});
        collection.add(new Object[]{"$bool = false;"});
        collection.add(new Object[]{"$object = null;"});
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"$array = " + string + ";"});
        }

        Collection<Object[]> intTestStrings = FragmentsTest.getIntFragments();
        for (Object[] obj : intTestStrings) {
            collection.add(new Object[]{"$int = " + obj[1] + ";"});
            collection.add(new Object[]{"$int = +" + obj[1] + ";"});
            collection.add(new Object[]{"$int = -" + obj[1] + ";"});
        }

        String[] floatStrings = TokenTest.getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"$float = " + floatString + ";"});
            collection.add(new Object[]{"$float = +" + floatString + ";"});
            collection.add(new Object[]{"$float = -" + floatString + ";"});
        }

        Collection<Object[]> stringTestStrings = FragmentsTest.getStringFragments();
        for(Object[] obj: stringTestStrings){
            collection.add(new Object[]{"$string = "+obj[1]+";"});
        }
               
        
        return collection;
    }
}
