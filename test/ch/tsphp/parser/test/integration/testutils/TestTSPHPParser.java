/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

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
