package ch.tutteli.tsphp.parser.antlrmod;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;

public class ANTLRNoCaseFileStream extends ANTLRFileStream
{

    public ANTLRNoCaseFileStream(String fileName) throws IOException {
        super(fileName);
    }

    public ANTLRNoCaseFileStream(String fileName, String encoding) throws IOException {
        super(fileName, encoding);
    }

    @Override
    public int LA(int i) {
        int token = super.LA(i);
        if (token != 0 && token != CharStream.EOF) {
            token = Character.toLowerCase(token);
        }
        return token;
    }
}
