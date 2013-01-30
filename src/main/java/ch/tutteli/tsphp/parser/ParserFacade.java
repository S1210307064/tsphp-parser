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

import ch.tutteli.tsphp.common.IParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonErrorNode;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ParserFacade implements IParser
{

    protected TSPHPErrorReportingParser parser;
    protected TSPHPErrorReportingLexer lexer;
    private Exception parseException;

    @Override
    public Tree parse(String inputStream) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(inputStream));
    }

    @Override
    public Tree parse(char[] data, int numberOfActualCharsInArray) {
        return getAstOrErrorAst(new ANTLRNoCaseStringStream(data, numberOfActualCharsInArray));
    }

    @Override
    public Tree parseInputStream(InputStream inputStream) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream));
    }

    @Override
    public Tree parseInputStream(InputStream inputStream, int size) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size));
    }

    @Override
    public Tree parseInputStream(InputStream inputStream, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, encoding));
    }

    @Override
    public Tree parseInputStream(InputStream inputStream, int size, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, encoding));
    }

    @Override
    public Tree parseInputStream(InputStream inputStream, int size, int readBufferSize, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseInputStream(inputStream, size, readBufferSize, encoding));
    }

    @Override
    public Tree parseFile(String fileName) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName));
    }

    @Override
    public Tree parseFile(String fileName, String encoding) throws IOException {
        return getAstOrErrorAst(new ANTLRNoCaseFileStream(fileName, encoding));
    }

    @Override
    public boolean hasFoundError() {
        return lexer.hasFoundError() || parser.hasFoundError() || parseException != null;
    }

    @Override
    public List<Exception> getExceptions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Tree getAstOrErrorAst(CharStream input) {
        try {
            return getAst(input);
        } catch (RecognitionException ex) {
            //should never happen, TSPHPParser catches it already. But just in case

            parseException = ex;
            return getErrorAst(ex);
        }
    }

    private Tree getAst(CharStream input) throws RecognitionException {
        lexer = new TSPHPErrorReportingLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        parser = new TSPHPErrorReportingParser(tokens);
        return (Tree) parser.compilationUnit().getTree();
    }

    private Tree getErrorAst(RecognitionException ex) {
        Tree tree = new CommonTree();
        tree.addChild(new CommonErrorNode(new CommonTokenStream(lexer), ex.token, ex.token, ex));
        return tree;
    }
}