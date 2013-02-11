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
 * Idea by Jim Idle - see  http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782
 */
package ch.tutteli.tsphp.parser.antlr;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

/**
 * @author Robert Stoll
 */
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
