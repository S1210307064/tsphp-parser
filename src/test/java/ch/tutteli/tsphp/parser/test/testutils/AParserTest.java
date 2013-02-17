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
package ch.tutteli.tsphp.parser.test.testutils;

import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPAstAdaptor;
import ch.tutteli.tsphp.parser.antlr.ANTLRNoCaseStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 *
 */
@Ignore
public abstract class AParserTest extends ATest
{

    protected TestTSPHPParser parser;
    protected TestTSPHPLexer lexer;
    protected ParserRuleReturnScope result;

    public AParserTest(String testString) {
        super(testString);
        AstHelperRegistry.set(new ch.tutteli.tsphp.common.AstHelper());
    }

    public void parseAndCheckForException() throws RecognitionException {
        parse();
        Assert.assertFalse(testString + " failed, lexer threw exception(s) - see output", lexer.hasFoundError());
        Assert.assertFalse(testString + " failed, parser threw exception(s) - see output", parser.hasFoundError());
    }

    protected void parse() throws RecognitionException {
        CharStream stream = new ANTLRNoCaseStringStream(testString);
        lexer = new TestTSPHPLexer(stream);
        lexer.setErrorReporting(isErrorReportingOn);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        parser = new TestTSPHPParser(tokens);
        parser.setTreeAdaptor(new TSPHPAstAdaptor());
        parser.setErrorReporting(isErrorReportingOn);
        run();
    }

    protected void run() throws RecognitionException {
        result = parser.compilationUnit();
    }
}
