/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class InterfaceTest extends AAstTest
{

    public InterfaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"interface a{}","(interface (iMod abstract) a extends iBody)"});
        
        String[] types = TypeHelper.getClassInterfaceTypes();
        for(String type:types){
            
            collection.add(new Object[]{
                "interface a extends "+type+"{}",
                "(interface (iMod abstract) a (extends "+type+") iBody)"
            });
            collection.add(new Object[]{
                "interface a extends "+type+","+type+"{}",
                "(interface (iMod abstract) a (extends "+type+" "+type+") iBody)"
            });
            collection.add(new Object[]{
                "interface a extends "+type+","+type+", "+type+"{}",
                "(interface (iMod abstract) a (extends "+type+" "+type+" "+type+") iBody)"
            });
        }
        return collection;
    }
}
