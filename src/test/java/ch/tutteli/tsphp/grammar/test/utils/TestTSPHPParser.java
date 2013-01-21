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

import ch.tutteli.tsphp.grammar.TSPHPParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

/**
 * Overwrite reportError methods in order that unit tests with parser errors fails at the end
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class TestTSPHPParser extends TSPHPParser
{

    List<RecognitionException> exceptions = new ArrayList<>();
    private boolean isErrorReportingOn = true;

    public TestTSPHPParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public TestTSPHPParser(TokenStream input, RecognizerSharedState state) {
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
}
