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
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

/**
 * Overwrite reportError methods in order that unit tests with lexer errors fails at the end
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class TestTSPHPLexer extends TSPHPLexer
{

    private List<RecognitionException> exceptions = new ArrayList<>();
    private boolean isErrorReportingOn = true;

    public TestTSPHPLexer() {
    }

    public TestTSPHPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public TestTSPHPLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public List<RecognitionException> getExceptions() {
        return exceptions;
    }

    public void setErrorReporting(boolean isOn) {
        isErrorReportingOn = isOn;
    }

    @Override
    public void reportError(RecognitionException e) {
        if (isErrorReportingOn) {
            super.reportError(e);
        }
        exceptions.add(e);
    }
    
    public RecognizerSharedState getState(){
        return state;
    }
}
