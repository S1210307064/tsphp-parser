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
public class AssignmentArrayTest extends AParserTest
{

    public AssignmentArrayTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"array $a = [];"},
                    {"array $b = array();"},
                    {"array $a = [1,2.0,'single quoted string', \"double quoted string\",true,false];"},
                    {"array $a = array(1,2.0,'single quoted string', \"double quoted string\",true,false);"},
                    {"array $a = [[],array()];"},
                    {"array $a = array([],array());"},
                    {"array $a = [1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo'];"},
                    {"array $a = array(1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo');"},
                    {"array $a = [1=>[],2.0=>array()];"},
                    {"array $a = array(1=>[],2.0=>array());"},
                    
                    {"array $a = [1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo',1 => array(), 2=>[],1,2.0,'single quoted string', \"double quoted string\",true,false,[],array()];"},
                    {"array $a = array(1 => 1, 2.0=>1, 'single quoted key'=>\"hello\", \"double quoted key\"=> 'velo',1 => array(), 2=>[],1,2.0,'single quoted string', \"double quoted string\",true,false,[],array());"},
                });

        //
    }
}
