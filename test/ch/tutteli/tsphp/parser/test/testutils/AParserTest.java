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
    private final ITSPHPAstAdaptor adaptor;

    public AParserTest(String testString) {
        super(testString);
        adaptor = new TSPHPAstAdaptor();
        AstHelperRegistry.set(new ch.tutteli.tsphp.common.AstHelper(adaptor));
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
        parser.setTreeAdaptor(adaptor);
        parser.setErrorReporting(isErrorReportingOn);
        run();
    }

    protected void run() throws RecognitionException {
        result = parser.compilationUnit();
    }
}
