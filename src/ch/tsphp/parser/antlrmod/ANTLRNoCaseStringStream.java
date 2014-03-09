package ch.tsphp.parser.antlrmod;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

//CHECKSTYLE:OFF:AbstractClassNameCheck
public class ANTLRNoCaseStringStream extends ANTLRStringStream
{ //CHECKSTYLE:ON:AbstractClassNameCheck

    public ANTLRNoCaseStringStream(final String input) {
        super(input);
    }

    public ANTLRNoCaseStringStream(final char[] data, final int numberOfActualCharsInArray) {
        super(data, numberOfActualCharsInArray);
    }

    @Override
    @SuppressWarnings({"PMD.MethodNamingConventions","PMD.ShortMethodName"})
    //CHECKSTYLE:OFF:MethodNameCheck
    public int LA(final int lookAhead) { //CHECKSTYLE:ON:MethodNameCheck
        int token = super.LA(lookAhead);
        if (token != 0 && token != CharStream.EOF) {
            token = Character.toLowerCase(token);
        }
        return token;
    }
}
