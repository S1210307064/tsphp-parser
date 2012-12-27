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
import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ExpressionWithoutAssignmentTest extends AParserTest
{

    public ExpressionWithoutAssignmentTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        isErrorReportingOn=false;
        super.parse();
        
        Assert.assertTrue(testString + " failed, lexer threw exception(s) - see output", lexer.getExceptions().isEmpty());
        Assert.assertFalse(testString + " failed, parser threw exception(s) - see output", parser.getExceptions().isEmpty());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        String[] expressions = ExpressionTest.getExpressionsWithoutAssignment();
        for (String expression : expressions) {
            collection.add(new Object[]{expression + ";"});
        }
        
        return collection;
    }
}
