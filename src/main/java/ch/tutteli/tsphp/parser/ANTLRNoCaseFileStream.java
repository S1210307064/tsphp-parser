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
package ch.tutteli.tsphp.parser;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;

/**
 * @author Robert Stoll
 */
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
