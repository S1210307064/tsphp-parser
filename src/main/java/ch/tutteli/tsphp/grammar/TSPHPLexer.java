// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-24 16:27:54

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
package ch.tutteli.tsphp.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSPHPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Arrow=4;
    public static final int BINARY=5;
    public static final int Bool=6;
    public static final int Comma=7;
    public static final int Comment=8;
    public static final int DECIMAL=9;
    public static final int Dolar=10;
    public static final int EXPONENT=11;
    public static final int Else=12;
    public static final int Equal=13;
    public static final int Float=14;
    public static final int Function=15;
    public static final int HEXADECIMAL=16;
    public static final int ID=17;
    public static final int If=18;
    public static final int Int=19;
    public static final int LeftCurlyBrace=20;
    public static final int LeftParanthesis=21;
    public static final int LeftSquareBrace=22;
    public static final int Namespace=23;
    public static final int NamespaceId=24;
    public static final int OCTAL=25;
    public static final int PRIMITIVE_TYPES=26;
    public static final int RightCurlyBrace=27;
    public static final int RightParanthesis=28;
    public static final int RightSquareBrace=29;
    public static final int STRING_DOUBLE_QUOTED=30;
    public static final int STRING_SINGLE_QUOTED=31;
    public static final int Semicolon=32;
    public static final int String=33;
    public static final int TypeArray=34;
    public static final int TypeBool=35;
    public static final int TypeBoolean=36;
    public static final int TypeFloat=37;
    public static final int TypeInt=38;
    public static final int TypeResource=39;
    public static final int TypeString=40;
    public static final int VariableId=41;
    public static final int Whitespace=42;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TSPHPLexer() {} 
    public TSPHPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TSPHPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }

    // $ANTLR start "Arrow"
    public final void mArrow() throws RecognitionException {
        try {
            int _type = Arrow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:7: ( '=>' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:9: '=>'
            {
            match("=>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Arrow"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:7: ( ',' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Dolar"
    public final void mDolar() throws RecognitionException {
        try {
            int _type = Dolar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:7: ( '$' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:9: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dolar"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:6: ( 'else' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:8: 'else'
            {
            match("else"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Equal"
    public final void mEqual() throws RecognitionException {
        try {
            int _type = Equal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:7: ( '=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Equal"

    // $ANTLR start "Function"
    public final void mFunction() throws RecognitionException {
        try {
            int _type = Function;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:10: ( 'function' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:12: 'function'
            {
            match("function"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Function"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:4: ( 'if' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:6: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "LeftCurlyBrace"
    public final void mLeftCurlyBrace() throws RecognitionException {
        try {
            int _type = LeftCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:16: ( '{' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:18: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftCurlyBrace"

    // $ANTLR start "LeftParanthesis"
    public final void mLeftParanthesis() throws RecognitionException {
        try {
            int _type = LeftParanthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:17: ( '(' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:19: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftParanthesis"

    // $ANTLR start "LeftSquareBrace"
    public final void mLeftSquareBrace() throws RecognitionException {
        try {
            int _type = LeftSquareBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:17: ( '[' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:19: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftSquareBrace"

    // $ANTLR start "Namespace"
    public final void mNamespace() throws RecognitionException {
        try {
            int _type = Namespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:11: ( 'namespace' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:13: 'namespace'
            {
            match("namespace"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Namespace"

    // $ANTLR start "RightCurlyBrace"
    public final void mRightCurlyBrace() throws RecognitionException {
        try {
            int _type = RightCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:17: ( '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:19: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightCurlyBrace"

    // $ANTLR start "RightParanthesis"
    public final void mRightParanthesis() throws RecognitionException {
        try {
            int _type = RightParanthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:18: ( ')' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:20: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightParanthesis"

    // $ANTLR start "RightSquareBrace"
    public final void mRightSquareBrace() throws RecognitionException {
        try {
            int _type = RightSquareBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:18: ( ']' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:20: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightSquareBrace"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:13: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "TypeArray"
    public final void mTypeArray() throws RecognitionException {
        try {
            int _type = TypeArray;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:11: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:13: 'array'
            {
            match("array"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeArray"

    // $ANTLR start "TypeBool"
    public final void mTypeBool() throws RecognitionException {
        try {
            int _type = TypeBool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:10: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:12: 'bool'
            {
            match("bool"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeBool"

    // $ANTLR start "TypeBoolean"
    public final void mTypeBoolean() throws RecognitionException {
        try {
            int _type = TypeBoolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:13: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:15: 'boolean'
            {
            match("boolean"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeBoolean"

    // $ANTLR start "TypeFloat"
    public final void mTypeFloat() throws RecognitionException {
        try {
            int _type = TypeFloat;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:11: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:13: 'float'
            {
            match("float"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeFloat"

    // $ANTLR start "TypeInt"
    public final void mTypeInt() throws RecognitionException {
        try {
            int _type = TypeInt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:9: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:11: 'int'
            {
            match("int"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeInt"

    // $ANTLR start "TypeResource"
    public final void mTypeResource() throws RecognitionException {
        try {
            int _type = TypeResource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:14: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:16: 'resource'
            {
            match("resource"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeResource"

    // $ANTLR start "TypeString"
    public final void mTypeString() throws RecognitionException {
        try {
            int _type = TypeString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:12: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:14: 'string'
            {
            match("string"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeString"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:6: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:8: 'true'
                    {
                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:15: 'false'
                    {
                    match("false"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "NamespaceId"
    public final void mNamespaceId() throws RecognitionException {
        try {
            int _type = NamespaceId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:2: ( ID ( '\\\\' ID )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:4: ID ( '\\\\' ID )*
            {
            mID(); if (state.failed) return ;


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:7: ( '\\\\' ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:8: '\\\\' ID
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mID(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NamespaceId"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u00FF') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:49: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')||(LA3_0 >= '\u007F' && LA3_0 <= '\u00FF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u00FF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "PRIMITIVE_TYPES"
    public final void mPRIMITIVE_TYPES() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeResource | TypeArray )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='o') ) {
                    int LA4_7 = input.LA(3);

                    if ( (LA4_7=='o') ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8=='l') ) {
                            int LA4_9 = input.LA(5);

                            if ( (LA4_9=='e') ) {
                                alt4=2;
                            }
                            else {
                                alt4=1;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 7, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'i':
                {
                alt4=3;
                }
                break;
            case 'f':
                {
                alt4=4;
                }
                break;
            case 's':
                {
                alt4=5;
                }
                break;
            case 'r':
                {
                alt4=6;
                }
                break;
            case 'a':
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:4: TypeBool
                    {
                    mTypeBool(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:13: TypeBoolean
                    {
                    mTypeBoolean(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:4: TypeInt
                    {
                    mTypeInt(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: TypeFloat
                    {
                    mTypeFloat(); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: TypeString
                    {
                    mTypeString(); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:4: TypeResource
                    {
                    mTypeResource(); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:4: TypeArray
                    {
                    mTypeArray(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIMITIVE_TYPES"

    // $ANTLR start "VariableId"
    public final void mVariableId() throws RecognitionException {
        try {
            int _type = VariableId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:12: ( '$' ID )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:14: '$' ID
            {
            match('$'); if (state.failed) return ;

            mID(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VariableId"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:9: ( ( '+' | '-' )? DECIMAL | ( '+' | '-' )? HEXADECIMAL | ( '+' | '-' )? OCTAL | ( '+' | '-' )? BINARY )
            int alt9=4;
            switch ( input.LA(1) ) {
            case '+':
            case '-':
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1 >= '1' && LA9_1 <= '9')) ) {
                    alt9=1;
                }
                else if ( (LA9_1=='0') ) {
                    switch ( input.LA(3) ) {
                    case 'X':
                    case 'x':
                        {
                        alt9=2;
                        }
                        break;
                    case 'b':
                        {
                        alt9=4;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        alt9=1;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=1;
                }
                break;
            case '0':
                {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt9=2;
                    }
                    break;
                case 'b':
                    {
                    alt9=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    alt9=1;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:12: ( '+' | '-' )? DECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:12: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mDECIMAL(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:12: ( '+' | '-' )? HEXADECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:12: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mHEXADECIMAL(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:12: ( '+' | '-' )? OCTAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:12: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mOCTAL(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:12: ( '+' | '-' )? BINARY
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:12: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mBINARY(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= '1' && LA11_0 <= '9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='0') ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:15: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:12: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "HEXADECIMAL"
    public final void mHEXADECIMAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); if (state.failed) return ;

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'F')||(LA12_0 >= 'a' && LA12_0 <= 'f')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXADECIMAL"

    // $ANTLR start "OCTAL"
    public final void mOCTAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:7: ( '0' ( '0' .. '7' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:9: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:13: ( '0' .. '7' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '7')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:8: ( '0b' ( '0' | '1' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:10: '0b' ( '0' | '1' )+
            {
            match("0b"); if (state.failed) return ;



            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:14: ( '0' | '1' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '0' && LA14_0 <= '1')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "Float"
    public final void mFloat() throws RecognitionException {
        try {
            int _type = Float;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:6: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:8: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:8: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:19: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    match('.'); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:35: ( '0' .. '9' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:47: ( EXPONENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:47: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:8: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:8: ( '+' | '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='+'||LA19_0=='-') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    match('.'); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:23: ( '0' .. '9' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:35: ( EXPONENT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:35: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:8: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:8: ( '+' | '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='+'||LA22_0=='-') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:19: ( '0' .. '9' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Float"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:22: ( '+' | '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:33: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:8: ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\'') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\"') ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:10: STRING_SINGLE_QUOTED
                    {
                    mSTRING_SINGLE_QUOTED(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:33: STRING_DOUBLE_QUOTED
                    {
                    mSTRING_DOUBLE_QUOTED(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "STRING_SINGLE_QUOTED"
    public final void mSTRING_SINGLE_QUOTED() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:2: ( '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:9: ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )*
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\\') ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2=='\\') ) {
                        int LA28_4 = input.LA(3);

                        if ( (synpred1_TSPHP()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=3;
                        }


                    }
                    else if ( (LA28_2=='\'') ) {
                        int LA28_5 = input.LA(3);

                        if ( (LA28_5=='\'') && (synpred2_TSPHP())) {
                            alt28=2;
                        }
                        else if ( (LA28_5=='\\') && (synpred2_TSPHP())) {
                            alt28=2;
                        }
                        else if ( ((LA28_5 >= '\u0000' && LA28_5 <= '&')||(LA28_5 >= '(' && LA28_5 <= '[')||(LA28_5 >= ']' && LA28_5 <= '\uFFFF')) && (synpred2_TSPHP())) {
                            alt28=2;
                        }

                        else {
                            alt28=3;
                        }


                    }
                    else if ( ((LA28_2 >= '\u0000' && LA28_2 <= '&')||(LA28_2 >= '(' && LA28_2 <= '[')||(LA28_2 >= ']' && LA28_2 <= '\uFFFF')) ) {
                        alt28=3;
                    }


                }
                else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '&')||(LA28_0 >= '(' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:6: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:7: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:6: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_SINGLE_QUOTED"

    // $ANTLR start "STRING_DOUBLE_QUOTED"
    public final void mSTRING_DOUBLE_QUOTED() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:6: ( '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:8: '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:12: ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )*
            loop29:
            do {
                int alt29=5;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\\') ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2=='\\') ) {
                        int LA29_4 = input.LA(3);

                        if ( (synpred3_TSPHP()) ) {
                            alt29=1;
                        }
                        else if ( (true) ) {
                            alt29=4;
                        }


                    }
                    else if ( (LA29_2=='\"') ) {
                        int LA29_5 = input.LA(3);

                        if ( (LA29_5=='\"') && (synpred4_TSPHP())) {
                            alt29=2;
                        }
                        else if ( (LA29_5=='\\') && (synpred4_TSPHP())) {
                            alt29=2;
                        }
                        else if ( ((LA29_5 >= '\u0000' && LA29_5 <= '!')||LA29_5=='#'||(LA29_5 >= '%' && LA29_5 <= '[')||(LA29_5 >= ']' && LA29_5 <= '\uFFFF')) && (synpred4_TSPHP())) {
                            alt29=2;
                        }

                        else {
                            alt29=4;
                        }


                    }
                    else if ( (LA29_2=='$') && (synpred5_TSPHP())) {
                        alt29=3;
                    }
                    else if ( ((LA29_2 >= '\u0000' && LA29_2 <= '!')||LA29_2=='#'||(LA29_2 >= '%' && LA29_2 <= '[')||(LA29_2 >= ']' && LA29_2 <= '\uFFFF')) ) {
                        alt29=4;
                    }


                }
                else if ( ((LA29_0 >= '\u0000' && LA29_0 <= '!')||LA29_0=='#'||(LA29_0 >= '%' && LA29_0 <= '[')||(LA29_0 >= ']' && LA29_0 <= '\uFFFF')) ) {
                    alt29=4;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:6: ( '\\\\' '\\\\' )=> '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;



            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:7: ( '\\\\' '\"' )=> '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;



            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:6: ( '\\\\' '$' )=> '\\\\$'
            	    {
            	    match("\\$"); if (state.failed) return ;



            	    }
            	    break;
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:6: ~ ( '\"' | '$' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||input.LA(1)=='#'||(input.LA(1) >= '%' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_DOUBLE_QUOTED"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:9: (~ ( '\\n' | '\\r' ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||(LA30_0 >= '\u000E' && LA30_0 <= '\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:23: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:23: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }


                    match('\n'); if (state.failed) return ;

                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:6: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:11: (~ ( '\\n' | '\\r' ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\t')||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||(LA32_0 >= '\u000E' && LA32_0 <= '\uFFFF')) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:13: ( options {greedy=false; } : . )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='*') ) {
                            int LA33_1 = input.LA(2);

                            if ( (LA33_1=='/') ) {
                                alt33=2;
                            }
                            else if ( ((LA33_1 >= '\u0000' && LA33_1 <= '.')||(LA33_1 >= '0' && LA33_1 <= '\uFFFF')) ) {
                                alt33=1;
                            }


                        }
                        else if ( ((LA33_0 >= '\u0000' && LA33_0 <= ')')||(LA33_0 >= '+' && LA33_0 <= '\uFFFF')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:41: .
                    	    {
                    	    matchAny(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    match("*/"); if (state.failed) return ;



                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "Whitespace"
    public final void mWhitespace() throws RecognitionException {
        try {
            int _type = Whitespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:12: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:14: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( state.backtracking==0 ) {_channel=HIDDEN;}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Whitespace"

    public void mTokens() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( Arrow | Comma | Dolar | Else | Equal | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | Namespace | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | Bool | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace )
        int alt35=30;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:10: Arrow
                {
                mArrow(); if (state.failed) return ;


                }
                break;
            case 2 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:16: Comma
                {
                mComma(); if (state.failed) return ;


                }
                break;
            case 3 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:22: Dolar
                {
                mDolar(); if (state.failed) return ;


                }
                break;
            case 4 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:28: Else
                {
                mElse(); if (state.failed) return ;


                }
                break;
            case 5 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:33: Equal
                {
                mEqual(); if (state.failed) return ;


                }
                break;
            case 6 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:39: Function
                {
                mFunction(); if (state.failed) return ;


                }
                break;
            case 7 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:48: If
                {
                mIf(); if (state.failed) return ;


                }
                break;
            case 8 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:51: LeftCurlyBrace
                {
                mLeftCurlyBrace(); if (state.failed) return ;


                }
                break;
            case 9 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:66: LeftParanthesis
                {
                mLeftParanthesis(); if (state.failed) return ;


                }
                break;
            case 10 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:82: LeftSquareBrace
                {
                mLeftSquareBrace(); if (state.failed) return ;


                }
                break;
            case 11 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:98: Namespace
                {
                mNamespace(); if (state.failed) return ;


                }
                break;
            case 12 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:108: RightCurlyBrace
                {
                mRightCurlyBrace(); if (state.failed) return ;


                }
                break;
            case 13 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:124: RightParanthesis
                {
                mRightParanthesis(); if (state.failed) return ;


                }
                break;
            case 14 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:141: RightSquareBrace
                {
                mRightSquareBrace(); if (state.failed) return ;


                }
                break;
            case 15 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:158: Semicolon
                {
                mSemicolon(); if (state.failed) return ;


                }
                break;
            case 16 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:168: TypeArray
                {
                mTypeArray(); if (state.failed) return ;


                }
                break;
            case 17 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:178: TypeBool
                {
                mTypeBool(); if (state.failed) return ;


                }
                break;
            case 18 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:187: TypeBoolean
                {
                mTypeBoolean(); if (state.failed) return ;


                }
                break;
            case 19 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:199: TypeFloat
                {
                mTypeFloat(); if (state.failed) return ;


                }
                break;
            case 20 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:209: TypeInt
                {
                mTypeInt(); if (state.failed) return ;


                }
                break;
            case 21 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:217: TypeResource
                {
                mTypeResource(); if (state.failed) return ;


                }
                break;
            case 22 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:230: TypeString
                {
                mTypeString(); if (state.failed) return ;


                }
                break;
            case 23 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:241: Bool
                {
                mBool(); if (state.failed) return ;


                }
                break;
            case 24 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:246: NamespaceId
                {
                mNamespaceId(); if (state.failed) return ;


                }
                break;
            case 25 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:258: VariableId
                {
                mVariableId(); if (state.failed) return ;


                }
                break;
            case 26 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:269: Int
                {
                mInt(); if (state.failed) return ;


                }
                break;
            case 27 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:273: Float
                {
                mFloat(); if (state.failed) return ;


                }
                break;
            case 28 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:279: String
                {
                mString(); if (state.failed) return ;


                }
                break;
            case 29 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:286: Comment
                {
                mComment(); if (state.failed) return ;


                }
                break;
            case 30 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:294: Whitespace
                {
                mWhitespace(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_TSPHP
    public final void synpred1_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_TSPHP

    // $ANTLR start synpred2_TSPHP
    public final void synpred2_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:7: ( '\\\\' '\\'' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:8: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;

        match('\''); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_TSPHP

    // $ANTLR start synpred3_TSPHP
    public final void synpred3_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TSPHP

    // $ANTLR start synpred4_TSPHP
    public final void synpred4_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:7: ( '\\\\' '\"' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:8: '\\\\' '\"'
        {
        match('\\'); if (state.failed) return ;

        match('\"'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_TSPHP

    // $ANTLR start synpred5_TSPHP
    public final void synpred5_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:6: ( '\\\\' '$' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:7: '\\\\' '$'
        {
        match('\\'); if (state.failed) return ;

        match('$'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_TSPHP

    public final boolean synpred1_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA24_eotS =
        "\6\uffff";
    static final String DFA24_eofS =
        "\6\uffff";
    static final String DFA24_minS =
        "\1\53\2\56\3\uffff";
    static final String DFA24_maxS =
        "\2\71\1\145\3\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\1\1\1\3";
    static final String DFA24_specialS =
        "\6\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "231:1: Float : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA34_eotS =
        "\2\uffff\1\6\1\uffff\1\6\2\uffff";
    static final String DFA34_eofS =
        "\7\uffff";
    static final String DFA34_minS =
        "\1\57\1\52\1\0\1\uffff\1\0\2\uffff";
    static final String DFA34_maxS =
        "\2\57\1\uffff\1\uffff\1\uffff\2\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA34_specialS =
        "\2\uffff\1\0\1\uffff\1\1\2\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\2",
            "\12\4\1\5\2\4\1\5\ufff2\4",
            "",
            "\12\4\1\5\2\4\1\5\ufff2\4",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "295:1: Comment : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_2 = input.LA(1);

                        s = -1;
                        if ( ((LA34_2 >= '\u0000' && LA34_2 <= '\t')||(LA34_2 >= '\u000B' && LA34_2 <= '\f')||(LA34_2 >= '\u000E' && LA34_2 <= '\uFFFF')) ) {s = 4;}

                        else if ( (LA34_2=='\n'||LA34_2=='\r') ) {s = 5;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA34_4 = input.LA(1);

                        s = -1;
                        if ( (LA34_4=='\n'||LA34_4=='\r') ) {s = 5;}

                        else if ( ((LA34_4 >= '\u0000' && LA34_4 <= '\t')||(LA34_4 >= '\u000B' && LA34_4 <= '\f')||(LA34_4 >= '\u000E' && LA34_4 <= '\uFFFF')) ) {s = 4;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA35_eotS =
        "\1\uffff\1\35\1\uffff\1\36\3\24\3\uffff\1\24\4\uffff\5\24\2\uffff"+
        "\2\55\10\uffff\4\24\1\63\7\24\1\55\1\uffff\1\55\4\24\1\uffff\1\77"+
        "\6\24\1\106\3\24\1\uffff\2\24\1\115\2\24\1\120\1\uffff\1\24\1\122"+
        "\1\120\1\24\1\124\1\24\1\uffff\2\24\1\uffff\1\24\1\uffff\1\24\1"+
        "\uffff\2\24\1\134\2\24\1\137\1\24\1\uffff\1\141\1\24\1\uffff\1\143"+
        "\1\uffff\1\144\2\uffff";
    static final String DFA35_eofS =
        "\145\uffff";
    static final String DFA35_minS =
        "\1\11\1\76\1\uffff\1\101\1\154\1\141\1\146\3\uffff\1\141\4\uffff"+
        "\1\162\1\157\1\145\1\164\1\162\1\uffff\3\56\10\uffff\1\163\1\156"+
        "\1\157\1\154\1\60\1\164\1\155\1\162\1\157\1\163\1\162\1\165\1\56"+
        "\1\uffff\1\56\1\145\1\143\1\141\1\163\1\uffff\1\60\1\145\1\141\1"+
        "\154\1\157\1\151\1\145\1\60\2\164\1\145\1\uffff\1\163\1\171\1\60"+
        "\1\165\1\156\1\60\1\uffff\1\151\2\60\1\160\1\60\1\141\1\uffff\1"+
        "\162\1\147\1\uffff\1\157\1\uffff\1\141\1\uffff\1\156\1\143\1\60"+
        "\1\156\1\143\1\60\1\145\1\uffff\1\60\1\145\1\uffff\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA35_maxS =
        "\1\u00ff\1\76\1\uffff\1\u00ff\1\154\1\165\1\156\3\uffff\1\141\4"+
        "\uffff\1\162\1\157\1\145\1\164\1\162\1\uffff\1\71\2\145\10\uffff"+
        "\1\163\1\156\1\157\1\154\1\u00ff\1\164\1\155\1\162\1\157\1\163\1"+
        "\162\1\165\1\145\1\uffff\2\145\1\143\1\141\1\163\1\uffff\1\u00ff"+
        "\1\145\1\141\1\154\1\157\1\151\1\145\1\u00ff\2\164\1\145\1\uffff"+
        "\1\163\1\171\1\u00ff\1\165\1\156\1\u00ff\1\uffff\1\151\2\u00ff\1"+
        "\160\1\u00ff\1\141\1\uffff\1\162\1\147\1\uffff\1\157\1\uffff\1\141"+
        "\1\uffff\1\156\1\143\1\u00ff\1\156\1\143\1\u00ff\1\145\1\uffff\1"+
        "\u00ff\1\145\1\uffff\1\u00ff\1\uffff\1\u00ff\2\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\4\uffff\1\10\1\11\1\12\1\uffff\1\14\1\15\1\16\1\17"+
        "\5\uffff\1\30\3\uffff\1\33\1\34\1\35\1\36\1\1\1\5\1\3\1\31\15\uffff"+
        "\1\32\5\uffff\1\7\13\uffff\1\24\6\uffff\1\4\6\uffff\1\21\2\uffff"+
        "\1\27\1\uffff\1\23\1\uffff\1\20\7\uffff\1\26\2\uffff\1\22\1\uffff"+
        "\1\6\1\uffff\1\25\1\13";
    static final String DFA35_specialS =
        "\145\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\uffff\1\31\1\uffff\1\3\2"+
            "\uffff\1\31\1\10\1\14\1\uffff\1\25\1\2\1\25\1\30\1\32\1\27\11"+
            "\26\1\uffff\1\16\1\uffff\1\1\3\uffff\32\24\1\11\1\uffff\1\15"+
            "\1\uffff\1\24\1\uffff\1\17\1\20\2\24\1\4\1\5\2\24\1\6\4\24\1"+
            "\12\3\24\1\21\1\22\1\23\6\24\1\7\1\uffff\1\13\1\uffff\u0081"+
            "\24",
            "\1\34",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37\4\uffff\u0081\37",
            "\1\40",
            "\1\43\12\uffff\1\42\10\uffff\1\41",
            "\1\44\7\uffff\1\45",
            "",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\1\30\1\uffff\1\27\11\26",
            "\1\30\1\uffff\12\54\13\uffff\1\30\37\uffff\1\30",
            "\1\30\1\uffff\10\56\2\30\13\uffff\1\30\37\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\30\1\uffff\12\54\13\uffff\1\30\37\uffff\1\30",
            "",
            "\1\30\1\uffff\10\56\2\30\13\uffff\1\30\37\uffff\1\30",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\4\24"+
            "\1\114\25\24\4\uffff\u0081\24",
            "\1\116",
            "\1\117",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "",
            "\1\121",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\123",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\135",
            "\1\136",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\140",
            "",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "\1\142",
            "",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "",
            "\12\24\7\uffff\32\24\1\uffff\1\24\2\uffff\1\24\1\uffff\32\24"+
            "\4\uffff\u0081\24",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Arrow | Comma | Dolar | Else | Equal | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | Namespace | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | Bool | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace );";
        }
    }
 

}