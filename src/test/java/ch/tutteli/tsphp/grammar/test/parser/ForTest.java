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
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ForTest extends AParserTest
{

    public ForTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"for(int $a=1 ; true ; ++$i  ) $a=1;"},
                    {"for(         ; true ; ++$i  ) $a=1;"},
                    {"for(         ;      ; $i+=1 ) $a=1;"},
                    {"for(         ; true ;       ) $a=1;"},
                    {"for(         ;      ;       ) $a=1;"},
                    {"for(int $a=1 ; true ;       ) $a=1;"},
                    {"for(int $a=1 ;      ; ++$i  ) $a=1;"},
                    {"for(int $a=1 ;      ;       ) $a=1;"},
                    
                    {"for(int $a=1 ; true ; ++$i  ) {$a=1;}"},
                    {"for(         ; true ; ++$i  ) {$a=1;}"},
                    {"for(         ;      ; $i+=1 ) {$a=1;}"},
                    {"for(         ; true ;       ) {$a=1;}"},
                    {"for(         ;      ;       ) {$a=1;}"},
                    {"for(int $a=1 ; true ;       ) {$a=1;}"},
                    {"for(int $a=1 ;      ; ++$i  ) {$a=1;}"},
                    {"for(int $a=1 ;      ;       ) {$a=1;}"},
                    
                    
        });
    }
}
