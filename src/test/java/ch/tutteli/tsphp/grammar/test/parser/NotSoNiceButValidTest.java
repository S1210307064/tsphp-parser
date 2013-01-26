/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
import ch.tutteli.tsphp.grammar.test.utils.ExpressionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class NotSoNiceButValidTest extends AParserTest
{

    public NotSoNiceButValidTest(String testString) {
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
                    //switch with case label but without command => same as an empty block
                    {"switch($a){case 1:}"},
                    //switch with case labels but without command => same as an empty block
                    {"switch($a){case 1: case 2:}"},
                    //switch case label without command
                    {"switch($a){case 1: $a=1; case 2:}"},
                    //switch case label without command
                    {"switch($a){case 1: $a=1; case 2: case 3:}"},
                    //switch default label without command
                    {"switch($a){case 1: $a=1; default:}"},
                    //switch only with default block
                    {"switch($a){default: $a=1;}"},
                    //switch with case label do nothing more than default
                    {"switch($a){ case 1: default: $a=1;}"},
                    //switch with case label do nothing more than default
                    {"switch($a){ case 1: $a=1; case 1+1: default: case 2: $a=1;}"},
                    //switch with case labels do nothing more than default
                    {"switch($a){ case 1: case 2: default: $a=1;}"},
                    //switch with case labels do nothing more than default
                    {"switch($a){ case 0: $a=1; case 1: case 2: default: $a=1;}"}
                }));

        String[] expressions = ExpressionHelper.getParserExpressions();
        for (String expression : expressions) {
            collection.add(new Object[]{expression + ";"});
        }

        return collection;
    }
}
