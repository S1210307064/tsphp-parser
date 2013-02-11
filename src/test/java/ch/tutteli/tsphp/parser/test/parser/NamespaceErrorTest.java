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
package ch.tutteli.tsphp.parser.test.parser;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.parser.test.utils.AParserParserExceptionTest;
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
public class NamespaceErrorTest extends AParserParserExceptionTest
{

    public NamespaceErrorTest(String testString, int token, int position) {
        super(testString, RecognitionException.class, token, position);

    }

    @Test
    public void test() throws RecognitionException {
        super.parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> vars() {
        return Arrays.asList(new Object[][]{
                    //namespace afterwards
                    {"int $a; namespace a;", TSPHPParser.Namespace, 8},
                    //namespace semicolon mixed with curly brace namespace
                    {"namespace a; $a=1; namespace b{$a=1;}", TSPHPParser.LeftCurlyBrace, 30},
                    {"namespace a{ $a=1;} namespace b; $a=1;", TSPHPParser.Semicolon, 31},
                    //statements outside of curly brace namespace
                    {"namespace a{ $a=1;} $a=1; namespace b{ $a=1;}", TSPHPParser.VariableId, 20},
                    
                });
    }
}
