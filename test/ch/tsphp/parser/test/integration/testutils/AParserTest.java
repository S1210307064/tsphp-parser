package ch.tsphp.parser.test.integration.testutils;

import ch.tsphp.common.AstHelperRegistry;
import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.TSPHPAstAdaptor;
import ch.tsphp.parser.antlrmod.ANTLRNoCaseStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;




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
        AstHelperRegistry.set(new ch.tsphp.common.AstHelper(adaptor));
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
