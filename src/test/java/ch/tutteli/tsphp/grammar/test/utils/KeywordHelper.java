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
package ch.tutteli.tsphp.grammar.test.utils;

import ch.tutteli.tsphp.grammar.TSPHPParser;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class KeywordHelper
{

    private KeywordHelper() {
    }

    public static List<Object[]> getKeywords(String prefix) {
        return getKeywords(prefix, "");
    }
    public static List<Object[]> getKeywords(String prefix, String appendix) {
        int prefixLength = prefix.length();
        return Arrays.asList(new Object[][]{
                    {prefix + "abstract" + appendix + ";", TSPHPParser.Abstract, prefixLength},
                    {prefix + "array" + appendix + ";", TSPHPParser.TypeArray, prefixLength},
                    {prefix + "as" + appendix + ";", TSPHPParser.As, prefixLength},
                    {prefix + "bool" + appendix + ";", TSPHPParser.TypeBool, prefixLength},
                    {prefix + "boolean" + appendix + ";", TSPHPParser.TypeBoolean, prefixLength},
                    {prefix + "break" + appendix + ";", TSPHPParser.Break, prefixLength},
                    {prefix + "case" + appendix + ";", TSPHPParser.Case, prefixLength},
                    {prefix + "catch" + appendix + ";", TSPHPParser.Catch, prefixLength},
                    {prefix + "class" + appendix + ";", TSPHPParser.Class, prefixLength},
                    {prefix + "clone" + appendix + ";", TSPHPParser.Clone, prefixLength},
                    {prefix + "const" + appendix + ";", TSPHPParser.Const, prefixLength},
                    {prefix + "continue" + appendix + ";", TSPHPParser.Continue, prefixLength},
                    {prefix + "default" + appendix + ";", TSPHPParser.Default, prefixLength},
                    {prefix + "do" + appendix + ";", TSPHPParser.Do, prefixLength},
                    {prefix + "echo" + appendix + ";", TSPHPParser.Echo, prefixLength},
                    {prefix + "else" + appendix + ";", TSPHPParser.Else, prefixLength},
                    {prefix + "exit" + appendix + ";", TSPHPParser.Exit, prefixLength},
                    {prefix + "extends" + appendix + ";", TSPHPParser.Extends, prefixLength},
                    {prefix + "final" + appendix + ";", TSPHPParser.Final, prefixLength},
                    {prefix + "float" + appendix + ";", TSPHPParser.TypeFloat, prefixLength},
                    {prefix + "for" + appendix + ";", TSPHPParser.For, prefixLength},
                    {prefix + "foreach" + appendix + ";", TSPHPParser.Foreach, prefixLength},
                    {prefix + "function" + appendix + ";", TSPHPParser.Function, prefixLength},
                    {prefix + "if" + appendix + ";", TSPHPParser.If, prefixLength},
                    {prefix + "implements" + appendix + ";", TSPHPParser.Implements, prefixLength},
                    {prefix + "int" + appendix + ";", TSPHPParser.TypeInt, prefixLength},
                    {prefix + "instanceof" + appendix + ";", TSPHPParser.Instanceof, prefixLength},
                    {prefix + "interface" + appendix + ";", TSPHPParser.Interface, prefixLength},
                    {prefix + "namespace" + appendix + ";", TSPHPParser.Namespace, prefixLength},
                    {prefix + "new" + appendix + ";", TSPHPParser.New, prefixLength},
                    {prefix + "object" + appendix + ";", TSPHPParser.TypeObject, prefixLength},
                    {prefix + "parent" + appendix + ";", TSPHPParser.Parent, prefixLength},
                    {prefix + "private" + appendix + ";", TSPHPParser.Private, prefixLength},
                    {prefix + "protected" + appendix + ";", TSPHPParser.Protected, prefixLength},
                    {prefix + "public" + appendix + ";", TSPHPParser.Public, prefixLength},
                    {prefix + "resource" + appendix + ";", TSPHPParser.TypeResource, prefixLength},
                    {prefix + "return" + appendix + ";", TSPHPParser.Return, prefixLength},
                    {prefix + "static" + appendix + ";", TSPHPParser.Static, prefixLength},
                    {prefix + "self" + appendix + ";", TSPHPParser.Self, prefixLength},
                    {prefix + "switch" + appendix + ";", TSPHPParser.Switch, prefixLength},
                    {prefix + "this" + appendix + ";", TSPHPParser.ProtectThis, prefixLength},
                    {prefix + "throw" + appendix + ";", TSPHPParser.Throw, prefixLength},
                    {prefix + "try" + appendix + ";", TSPHPParser.Try, prefixLength},
                    {prefix + "use" + appendix + ";", TSPHPParser.Use, prefixLength},
                    {prefix + "void" + appendix + ";", TSPHPParser.Void, prefixLength},
                    {prefix + "while" + appendix + ";", TSPHPParser.While, prefixLength}
                });
    }
}
