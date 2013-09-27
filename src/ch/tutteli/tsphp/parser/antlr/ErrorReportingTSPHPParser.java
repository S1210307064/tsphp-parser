package ch.tutteli.tsphp.parser.antlr;

import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.IErrorReporter;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

import java.util.ArrayDeque;
import java.util.Collection;

public class ErrorReportingTSPHPParser extends TSPHPParser implements IErrorReporter
{

    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
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
        String tokenText = exception.token != null
                ? "Unexpected token: " + exception.token.getText()
                : "Unknown token";
        for (IErrorLogger logger : errorLoggers) {
            logger.log(new TSPHPException("Line " + exception.line + "|" + exception.charPositionInLine
                    + " parser exception occurred. " + tokenText, exception));
        }
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
