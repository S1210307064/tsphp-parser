/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.antlrmod;

import ch.tsphp.common.ErrorReporterHelper;
import ch.tsphp.common.IErrorLogger;
import ch.tsphp.common.IErrorReporter;
import ch.tsphp.parser.antlr.TSPHPParser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

import java.util.ArrayDeque;
import java.util.Collection;

/**
 * Extends the generated TSPHPParser by implementing IErrorReporter.
 */
public class ErrorReportingTSPHPParser extends TSPHPParser implements IErrorReporter
{

    private final Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError = false;

    public ErrorReportingTSPHPParser(TokenStream input) {
        super(input);
    }

    public ErrorReportingTSPHPParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    @Override
    public void reportError(RecognitionException exception) {
        hasFoundError = true;
        ErrorReporterHelper.reportError(errorLoggers, exception, "parsing");
    }

    @Override
    public void registerErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void reset() {
        hasFoundError = false;
    }
}
