/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ForeachTest extends AParserTest
{

    public ForeachTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
        collection.addAll(Arrays.asList(new Object[][]{
                    {"foreach($a as int $k => MyClass $v)$a=1;"},
                    {"foreach($a as float $v) $a=1;"},
                    {"foreach($a as string $k => string $v){$a=1;}"},
                    {"foreach($a as bool $v) {$a=1;}"},
                    {"foreach($a as bool $k=> array $v){$a=1; $b=1;}"},
                    {"foreach($a as int $v) {$a=1; $b=3;}"},
        }));
        
        List<String> types = TypeHelper.getAllTypes();
        for(String type: types){
             collection.add(new Object[]{"foreach($a as "+type+" $v) $a=1;"});
        }
        
        String[] arrayTestStrings = ArrayDeclarationTest.getArrayTestStrings();
        for (String string : arrayTestStrings) {
            collection.add(new Object[]{"foreach(" + string + " as int $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as float $k => MyClass $v) $a=1;"});
            collection.add(new Object[]{"foreach(" + string + " as bool $v) {$a=1;}"});
            collection.add(new Object[]{"foreach(" + string + " as string $k => string $v) {$a=1;}"});
            
        }
        
        return collection;
    }
}
