package ch.tsphp.parser.test.integration.testutils;

import ch.tsphp.parser.antlrmod.ErrorReportingTSPHPParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 * Overwrite reportError methods in order that unit tests with parser errors fails at the end.
 */
public class TestTSPHPParser extends ErrorReportingTSPHPParser
{

    private boolean isErrorReportingOn = true;
    protected final List<Exception> exceptions = new ArrayList<>();

    public TestTSPHPParser(TokenStream input) {
        super(input);
    }

    public void setErrorReporting(boolean isOn) {
        isErrorReportingOn = isOn;
    }

    @Override
    public void reportError(RecognitionException e) {
        super.reportError(e);
        exceptions.add(e);
        if (isErrorReportingOn) {
            System.out.println(e.getMessage());
        }
    }

    public List<Exception> getExceptions() {
        return exceptions;
    }
}
