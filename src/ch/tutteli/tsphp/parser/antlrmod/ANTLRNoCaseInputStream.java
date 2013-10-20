package ch.tutteli.tsphp.parser.antlrmod;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

public class ANTLRNoCaseInputStream extends ANTLRInputStream
{

    public ANTLRNoCaseInputStream() {
    }

    public ANTLRNoCaseInputStream(InputStream input) throws IOException {
        super(input);
    }

    public ANTLRNoCaseInputStream(InputStream input, int size) throws IOException {
        super(input, size);
    }

    public ANTLRNoCaseInputStream(InputStream input, String encoding) throws IOException {
        super(input, encoding);
    }

    public ANTLRNoCaseInputStream(InputStream input, int size, String encoding) throws IOException {
        super(input, size, encoding);
    }

    public ANTLRNoCaseInputStream(InputStream input, int size, int readBufferSize, String encoding) throws IOException {
        super(input, size, readBufferSize, encoding);
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
