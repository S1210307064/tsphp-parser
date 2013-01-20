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

import ch.tutteli.tsphp.grammar.TSPHPParser;
import ch.tutteli.tsphp.grammar.test.utils.AParserParserExceptionTest;
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
public class IncrementDecrementErrorTest extends AParserParserExceptionTest
{

    public IncrementDecrementErrorTest(String testString, int character, int position) {
        super(testString, RecognitionException.class, character, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Override
    protected void run() throws RecognitionException {
        parser.instruction();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {

        return Arrays.asList(new Object[][]{
                    //increment or decrement from call
                    {"++foo();", TSPHPParser.LeftParanthesis, 5},
                    {"--foo();", TSPHPParser.LeftParanthesis, 5},
                    {"++$a->foo();", TSPHPParser.LeftParanthesis, 9},
                    {"--$a->foo();", TSPHPParser.LeftParanthesis, 9},
                    {"++$this->foo();", TSPHPParser.LeftParanthesis, 12},
                    {"--$this->foo();", TSPHPParser.LeftParanthesis, 12},
                    {"++self::$a->foo();", TSPHPParser.LeftParanthesis, 15},
                    {"--self::$a->foo();", TSPHPParser.LeftParanthesis, 15},
                    {"++parent::$a->foo();", TSPHPParser.LeftParanthesis, 17},
                    {"--parent::$a->foo();", TSPHPParser.LeftParanthesis, 17},
                    {"++Asdf::$a->foo();", TSPHPParser.LeftParanthesis, 15},
                    {"--Asdf::$a->foo();", TSPHPParser.LeftParanthesis, 15}
                });
    }
}