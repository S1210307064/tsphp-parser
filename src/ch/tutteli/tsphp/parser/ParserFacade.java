package ch.tutteli.tsphp.parser;

import ch.tutteli.tsphp.common.AstHelper;
import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.ParserUnitDto;
import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.IParser;
import ch.tutteli.tsphp.common.ITSPHPAst;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPErrorAst;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import ch.tutteli.tsphp.parser.antlrmod.ANTLRNoCaseFileStream;
import ch.tutteli.tsphp.parser.antlrmod.ANTLRNoCaseInputStream;
import ch.tutteli.tsphp.parser.antlrmod.ANTLRNoCaseStringStream;
import ch.tutteli.tsphp.parser.antlrmod.ErrorReportingTSPHPLexer;
import ch.tutteli.tsphp.parser.antlrmod.ErrorReportingTSPHPParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class ParserFacade implements IParser, IErrorLogger
{

    private final ITSPHPAstAdaptor astAdaptor;
    private final Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;

    public ParserFacade() {
        this(new TSPHPAstAdaptor());
    }

    public ParserFacade(ITSPHPAstAdaptor anAstAdaptor) {
        astAdaptor = anAstAdaptor;
        AstHelperRegistry.set(new AstHelper(astAdaptor));
    }

    @Override
    public ParserUnitDto parse(String inputStream) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(inputStream));
    }

    @Override
    public ParserUnitDto parse(char[] data, int numberOfActualCharsInArray) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(data, numberOfActualCharsInArray));
    }

    @Override
    public ParserUnitDto parseInputStream(InputStream inputStream) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream));
    }

    @Override
    public ParserUnitDto parseInputStream(InputStream inputStream, int size) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size));
    }

    @Override
    public ParserUnitDto parseInputStream(InputStream inputStream, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, encoding));
    }

    @Override
    public ParserUnitDto parseInputStream(InputStream inputStream, int size, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, encoding));
    }

    @Override
    public ParserUnitDto parseInputStream(InputStream inputStream, int size, int readBufferSize, String encoding)
            throws IOException {
        
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, readBufferSize, encoding));
    }

    @Override
    public ParserUnitDto parseFile(String fileName) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName));
    }

    @Override
    public ParserUnitDto parseFile(String fileName, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName, encoding));
    }

    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    private ParserUnitDto getAstOrErrorAst(CharStream input) {
        try {
            return getAst(input);
        } catch (RecognitionException ex) {
            // should never happen, ErrorReportingTSPHPLexer and ErrorReportingTSPHPParser should catch it already.
            // but just in case and to be complete
            informErrorLogger(ex);
            TokenStream tokenStream = new CommonTokenStream();
            return new ParserUnitDto("", new TSPHPErrorAst(tokenStream, ex.token, ex.token, ex), tokenStream);
        }
    }

    private ParserUnitDto getAst(CharStream input) throws RecognitionException {
        ErrorReportingTSPHPLexer lexer = new ErrorReportingTSPHPLexer(input);
        for (IErrorLogger logger : errorLoggers) {
            lexer.registerErrorLogger(logger);
        }
        lexer.registerErrorLogger(this);
        TokenStream tokenStream = new CommonTokenStream(lexer);

        ErrorReportingTSPHPParser parser = new ErrorReportingTSPHPParser(tokenStream);
        for (IErrorLogger logger : errorLoggers) {
            parser.registerErrorLogger(logger);
        }
        parser.registerErrorLogger(this);

        parser.setTreeAdaptor(astAdaptor);
        ITSPHPAst ast = parser.compilationUnit().getTree();

        return new ParserUnitDto("", ast, tokenStream);
    }

    @Override
    public void registerErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void reset() {
        hasFoundError = false;
    }

    @Override
    public void log(TSPHPException exception) {
        hasFoundError = true;
    }

    private void informErrorLogger(Exception exception) {
        hasFoundError = true;
        for (IErrorLogger logger : errorLoggers) {
            logger.log(new TSPHPException(exception));
        }
    }
}
