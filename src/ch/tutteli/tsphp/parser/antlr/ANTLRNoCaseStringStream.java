package ch.tutteli.tsphp.parser.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

public class ANTLRNoCaseStringStream extends ANTLRStringStream
{

    public ANTLRNoCaseStringStream() {
    }

    public ANTLRNoCaseStringStream(String input) {
        super(input);
    }

    public ANTLRNoCaseStringStream(char[] data, int numberOfActualCharsInArray) {
        super(data, numberOfActualCharsInArray);
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
