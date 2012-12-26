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
package ch.tutteli.tsphp.grammar.test.lexer;

import ch.tutteli.tsphp.grammar.TSPHPLexer;
import ch.tutteli.tsphp.grammar.test.utils.ALexerTest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import junit.framework.Assert;
import org.antlr.runtime.RecognizerSharedState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class StateFailedTest extends ALexerTest
{

    public StateFailedTest(String methodName) {
        //# is not valid for any token as first letter;
        super(methodName, "#");
    }

    @Test
    public void testTokens() throws Exception {
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

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        Method[] methods = TSPHPLexer.class.getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.charAt(0) == 'm' && methodName.charAt(1) >= 'A' && methodName.charAt(1) <= 'Z') {
                collection.add(new Object[]{methodName});
            }
        }
        return collection;
    }
}
