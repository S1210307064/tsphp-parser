package ch.tutteli.tsphp.parser.test.testutils;

import org.junit.Ignore;

@Ignore
public abstract class ATest
{

    protected String testString;
    protected boolean isErrorReportingOn = true;

    public ATest(String aTestString) {
        testString = aTestString;
    }

    public void noErrorsOnOutput() {
        isErrorReportingOn = false;
    }

    public void showErrorsOnOutput() {
        isErrorReportingOn = true;
    }
}
