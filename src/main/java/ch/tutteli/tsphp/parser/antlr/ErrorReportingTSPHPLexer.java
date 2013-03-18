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
package ch.tutteli.tsphp.parser.antlr;

import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.IErrorReporter;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import java.util.ArrayDeque;
import java.util.Collection;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ErrorReportingTSPHPLexer extends TSPHPLexer implements IErrorReporter
{

    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError = false;

    public ErrorReportingTSPHPLexer() {
    }

    public ErrorReportingTSPHPLexer(CharStream input) {
        super(input);
    }

    public ErrorReportingTSPHPLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    @Override
    public void reportError(RecognitionException exception) {
        hasFoundError = true;
        String tokenText = exception.token != null
                ? "Unexpected token: " + exception.token.getText()
                : "Unknown token";
        for (IErrorLogger logger : errorLoggers) {
            logger.log(new TSPHPException("Line " + exception.line + "|" + exception.charPositionInLine
                    + " lexer exception occured. " + tokenText, exception));
        }
    }

    @Override
    public void addErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void reset() {
        hasFoundError = false;
    }
}
