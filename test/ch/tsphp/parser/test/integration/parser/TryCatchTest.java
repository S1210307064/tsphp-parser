/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class TryCatchTest extends AParserTest
{

    public TryCatchTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        String[] types = TypeHelper.getClassInterfaceTypes();
        for (String type : types) {
            collection.add(new Object[]{"try{$a=1;}catch(" + type + " $e){}"});
        }
        collection.add(new Object[]{"try{$a=1;}catch(\\Exception $e){}catch(MyException $e){}"});
        collection.add(new Object[]{"try{$a=1;}catch(\\Exception $e){}catch(MyException $e){}catch(\\a\\MyException $e){}"});
        return collection;
    }
}
