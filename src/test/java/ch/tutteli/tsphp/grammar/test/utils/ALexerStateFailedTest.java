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
package ch.tutteli.tsphp.grammar.test.utils;

import ch.tutteli.tsphp.grammar.TSPHPLexer;
import junit.framework.Assert;
import org.antlr.runtime.RecognizerSharedState;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@Ignore
public abstract class ALexerStateFailedTest extends ALexerTest
{

    public ALexerStateFailedTest(String methodName, String testString) {
        this(methodName, testString, 0);
    }

    public ALexerStateFailedTest(String methodName, String testString, int type) {
        this(methodName, testString, type, TSPHPLexer.DEFAULT_TOKEN_CHANNEL);
    }

    public ALexerStateFailedTest(String methodName, String testString, int type, int channel) {
        super(methodName, testString, type, channel);
    }

    public void checkForStateFailed() throws Exception {
        try {
            super.analyseToken();
            RecognizerSharedState state = lexer.getState();
            Assert.assertTrue(methodName + " - " + testString + " failed, state.failed was not true and it should be true - see output", state.failed);
        } catch (Exception ex) {
            System.err.printf(methodName + " - " + testString + " failed");
            ex.printStackTrace();
            Assert.fail(methodName + " - " + testString + " failed, an unexpected exception occured - see output");
        }
    }

    @Override
    protected void modifyLexer() {
        lexer.setBacktrackingLevel(1);
    }
}
