/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.ExpressionHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NotSoNiceButValidTest extends AParserTest
{

    public NotSoNiceButValidTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws Exception {
        parseAndCheckForExceptions();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                //empty statement
                {";"},
                {"; ;;"},
                //empty block
                {"{}"},
                {"{{}}"},
                {"{;;}"},
                //clone without assignment
                {"clone $foo;"},
                //clone new instance
                {"clone new Foo();"},
                //multiple clones new instance
                {"clone clone clone new Foo();"},
                //empty if or else blocks
                {"if($a){}"},
                {"if($a);"},
                {"if($a)$a=1; else;"},
                {"if($a)$a=1; else{}"},
                {"if($a){$a=1;} else;"},
                {"if($a){$a=1;} else{}"},
                {"if($a){$a=1;} else if($a);"},
                {"if($a){$a=1;} else if($a){}"},
                {"if($a){$a=1;} else if($a){$a=1;} else;"},
                {"if($a){$a=1;} else if($a){$a=1;} else{}"},
                //empty for block
                {"for(;;){}"},
                {"for(;;);"},
                //empty foreach block
                {"foreach($a as int $k);"},
                {"foreach($a as int $k){}"},
                {"foreach($a as int $k => int $v);"},
                {"foreach($a as int $k => int $v){}"},
                //empty while block
                {"while(true){}"},
                {"while(true);"},
                //empty do while block
                {"do ; while(true);"},
                {"do{}while(true);"},
                //empty switch block
                {"switch($a){}"},
                //empty try block
                {"try{}catch(\\Exception $e){}"},
                //empty namespace
                {"namespace a;"},
                {"namespace a{}"},
                {"namespace {}"},
                //empty switch
                {"switch($a){}"},
                //switch with case labels but without any instruction
                {"switch($a){case 1:}"},
                {"switch($a){case 1: case 2:}"},
                {"switch($a){default: case 2:}"},
                {"switch($a){case 1: default:}"},
                {"switch($a){case 1: default: case 2:}"},
                {"switch($a){case 1: case 2: default:}"},
                //some case labels without instruction
                {"switch($a){case 1: $a=1; case 2:}"},
                {"switch($a){case 1: $a=1; case 2: case 3:}"},
                //switch default label without instruction
                {"switch($a){case 1: $a=1; default:}"},
                //switch only with default block
                {"switch($a){default: $a=1;}"},
        }));

        String[] expressions = ExpressionHelper.getParserExpressions();
        for (String expression : expressions) {
            collection.add(new Object[]{expression + ";"});
        }

        return collection;
    }
}
