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
public class ClassMethodTest extends AParserTest
{

    public ClassMethodTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //single modifier
                    {"class a{ function string getName(){ $a=1; }}"},
                    {"class a{ private function string getName(){ $a=1; }}"},
                    {"class a{ protected function string getName(){ $a=1; }}"},
                    {"class a{ public function string getName(){ $a=1; }}"},
                    {"class a{ abstract function string getName(){ $a=1; }}"},
                    {"class a{ abstract protected function string getName(){ $a=1; }}"},
                    {"class a{ abstract public function string getName(){ $a=1; }}"},
                    {"class a{ final function string getName(){ $a=1; }}"},
                    {"class a{ final private function string getName(){ $a=1; }}"},
                    {"class a{ final protected function string getName(){ $a=1; }}"},
                    {"class a{ final public function string getName(){ $a=1; }}"},
                    {"class a{ static function string getName(){ $a=1; }}"},
                    {"class a{ static private function string getName(){ $a=1; }}"},
                    {"class a{ static protected function string getName(){ $a=1; }}"},
                    {"class a{ static public function string getName(){ $a=1; }}"},
                    //multiple modifier
                    {"class a{ static final function string getName(){ $a=1; }}"},
                    {"class a{ static final private function string getName(){ $a=1; }}"},
                    {"class a{ static final protected function string getName(){ $a=1; }}"},
                    {"class a{ static final public function string getName(){ $a=1; }}"},
                    {"class a{ final static function string getName(){ $a=1; }}"},
                    {"class a{ final static private function string getName(){ $a=1; }}"},
                    {"class a{ final static protected function string getName(){ $a=1; }}"},
                    {"class a{ final static public function string getName(){ $a=1; }}"},
        });
    }
}
