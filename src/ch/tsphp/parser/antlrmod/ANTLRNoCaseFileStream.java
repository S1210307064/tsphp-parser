/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.antlrmod;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;

import java.io.IOException;

//CHECKSTYLE:OFF:AbstractClassNameCheck
public class ANTLRNoCaseFileStream extends ANTLRFileStream
{ //CHECKSTYLE:ON:AbstractClassNameCheck

    public ANTLRNoCaseFileStream(final String fileName) throws IOException {
        super(fileName);
    }

    public ANTLRNoCaseFileStream(final String fileName, final String encoding) throws IOException {
        super(fileName, encoding);
    }

    @Override
    @SuppressWarnings({"PMD.MethodNamingConventions", "PMD.ShortMethodName"})
    //CHECKSTYLE:OFF:MethodNameCheck
    public int LA(final int lookAhead) { //CHECKSTYLE:ON:MethodNameCheck
        int token = super.LA(lookAhead);
        if (token != 0 && token != CharStream.EOF) {
            token = Character.toLowerCase(token);
        }
        return token;
    }
}
