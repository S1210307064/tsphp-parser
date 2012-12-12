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
package ch.tutteli.tsphp.grammar.utils;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 *
 */
@Ignore
public abstract class ATest
{

    protected TestTSPHPParser parser;
    protected TestTSPHPLexer lexer ;
    protected String testString;
    private boolean isErrorReportingOn = true;

    public ATest() {
    }

    public ATest(String aTestString) {
        testString = aTestString;
    }

    public void parseAndCheckForException() throws RecognitionException {
        parse(testString);
        Assert.assertTrue(testString + " failed, lexer threw exception(s) - see output", lexer.getExceptions().isEmpty());
        Assert.assertTrue(testString + " failed, parser threw exception(s) - see output", parser.getExceptions().isEmpty());
    }

    public void noErrorsOnOutput() {
        isErrorReportingOn = false;
    }

    public void showErrorsOnOutput() {
        isErrorReportingOn = true;
    }

    protected void parse(String testString) throws RecognitionException {
        CharStream stream = new ANTLRStringStream(testString);
        lexer = new TestTSPHPLexer(stream);
        lexer.setErrorReporting(isErrorReportingOn);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        parser = new TestTSPHPParser(tokens);
        parser.setErrorReporting(isErrorReportingOn);
        parser.prog();
    }
}
