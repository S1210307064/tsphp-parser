/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.testutils;

import org.junit.Ignore;

@Ignore
public abstract class ATest
{

    protected final String testString;
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
