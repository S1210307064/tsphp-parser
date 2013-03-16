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
package ch.tutteli.tsphp.parser;

import ch.tutteli.tsphp.common.AstHelper;
import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.IParser;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPAst;
import ch.tutteli.tsphp.common.TSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPErrorNode;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import ch.tutteli.tsphp.common.exceptions.TypeCheckerException;
import ch.tutteli.tsphp.parser.antlr.ANTLRNoCaseFileStream;
import ch.tutteli.tsphp.parser.antlr.ANTLRNoCaseInputStream;
import ch.tutteli.tsphp.parser.antlr.ANTLRNoCaseStringStream;
import ch.tutteli.tsphp.parser.antlr.ErrorReportingTSPHPLexer;
import ch.tutteli.tsphp.parser.antlr.ErrorReportingTSPHPParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ParserFacade implements IParser
{

    protected ErrorReportingTSPHPParser parser;
    protected ErrorReportingTSPHPLexer lexer;
    protected TokenStream tokenStream;
    private Exception parseException;
    private ITSPHPAstAdaptor astAdaptor;
    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();

    public ParserFacade() {
        this(new TSPHPAstAdaptor());
    }

    public ParserFacade(ITSPHPAstAdaptor anAstAdaptor) {
        astAdaptor = anAstAdaptor;
        AstHelperRegistry.set(new AstHelper(astAdaptor));
    }

    @Override
    public TSPHPAst parse(String inputStream) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(inputStream));
    }

    @Override
    public TSPHPAst parse(char[] data, int numberOfActualCharsInArray) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(data, numberOfActualCharsInArray));
    }

    @Override
    public TSPHPAst parseInputStream(InputStream inputStream) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream));
    }

    @Override
    public TSPHPAst parseInputStream(InputStream inputStream, int size) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size));
    }

    @Override
    public TSPHPAst parseInputStream(InputStream inputStream, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, encoding));
    }

    @Override
    public TSPHPAst parseInputStream(InputStream inputStream, int size, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, encoding));
    }

    @Override
    public TSPHPAst parseInputStream(InputStream inputStream, int size, int readBufferSize, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, readBufferSize, encoding));
    }

    @Override
    public TSPHPAst parseFile(String fileName) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName));
    }

    @Override
    public TSPHPAst parseFile(String fileName, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName, encoding));
    }

    @Override
    public boolean hasFoundError() {
        return lexer.hasFoundError() || parser.hasFoundError() || parseException != null;
    }

    @Override
    public List<Exception> getExceptions() {
        List<Exception> exceptions = lexer.getExceptions();
        exceptions.addAll(parser.getExceptions());
        return exceptions;
    }

    private TSPHPAst getAstOrErrorAst(CharStream input) {
        try {
            return getAst(input);
        } catch (RecognitionException ex) {
            //should never happen, TSPHPParser catches it already. But just in case
            parseException = ex;
            return new TSPHPErrorNode(new CommonTokenStream(lexer), ex.token, ex.token, ex);
        }
    }

    private TSPHPAst getAst(CharStream input) throws RecognitionException {
        lexer = new ErrorReportingTSPHPLexer(input);
        tokenStream = new CommonTokenStream(lexer);

        parser = new ErrorReportingTSPHPParser(tokenStream);
        parser.setTreeAdaptor(astAdaptor);
        return (TSPHPAst) parser.compilationUnit().getTree();
    }

    @Override
    public TokenStream getTokenStream() {
        return tokenStream;
    }

    @Override
    public void addErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void log(TSPHPException exception) {
        for (IErrorLogger logger : errorLoggers) {
            logger.log(exception);
        }
    }
}
