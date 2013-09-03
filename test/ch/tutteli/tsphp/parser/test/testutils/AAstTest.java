/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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
package ch.tutteli.tsphp.parser.test.testutils;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Assert;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@Ignore
public abstract class AAstTest extends AParserTest
{

    protected String expectedResult;

    public AAstTest(String testString, String theExpectedResult) {
        super(testString);
        expectedResult = theExpectedResult;
    }

    public void compareAst() throws RecognitionException {
        parseAndCheckForException();
        CommonTree tree = (CommonTree) result.getTree();
        if (tree != null) {
            Assert.assertEquals(testString + " failed.", expectedResult, tree.toStringTree());
        } else {
            Assert.assertNull(expectedResult);
        }
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.statement();
    }
}
