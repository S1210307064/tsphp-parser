// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-12 21:46:39

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
    public static final int BINARY=4;
    public static final int DECIMAL=5;
    public static final int EXPONENT=6;
    public static final int Equal=7;
    public static final int FALSE=8;
    public static final int FLOAT=9;
    public static final int HEXADECIMAL=10;
    public static final int ID=11;
    public static final int INT=12;
    public static final int OCTAL=13;
    public static final int STRING_DOUBLE_QUOTED=14;
    public static final int STRING_SINGLE_QUOTED=15;
    public static final int Semicolon=16;
    public static final int TRUE=17;
    public static final int T_ARRAY=18;
    public static final int T_BOOL=19;
    public static final int T_BOOLEAN=20;
    public static final int T_FLOAT=21;
    public static final int T_INT=22;
    public static final int T_RESOURCE=23;
    public static final int T_STRING=24;
    public static final int VARID=25;
    public static final int WS=26;

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

    // $ANTLR start "Equal"
    public final void mEqual() throws RecognitionException {
        try {
            int _type = Equal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:7: ( '=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:9: '='
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

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:7: ( 'false' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:9: 'false'
            {
            match("false"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:13: ';'
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

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:6: ( 'true' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:8: 'true'
            {
            match("true"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "T_ARRAY"
    public final void mT_ARRAY() throws RecognitionException {
        try {
            int _type = T_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:9: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:11: 'array'
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
    // $ANTLR end "T_ARRAY"

    // $ANTLR start "T_BOOL"
    public final void mT_BOOL() throws RecognitionException {
        try {
            int _type = T_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:8: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:10: 'bool'
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
    // $ANTLR end "T_BOOL"

    // $ANTLR start "T_BOOLEAN"
    public final void mT_BOOLEAN() throws RecognitionException {
        try {
            int _type = T_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:11: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:13: 'boolean'
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
    // $ANTLR end "T_BOOLEAN"

    // $ANTLR start "T_FLOAT"
    public final void mT_FLOAT() throws RecognitionException {
        try {
            int _type = T_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:9: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:11: 'float'
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
    // $ANTLR end "T_FLOAT"

    // $ANTLR start "T_INT"
    public final void mT_INT() throws RecognitionException {
        try {
            int _type = T_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:7: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:9: 'int'
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
    // $ANTLR end "T_INT"

    // $ANTLR start "T_RESOURCE"
    public final void mT_RESOURCE() throws RecognitionException {
        try {
            int _type = T_RESOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:12: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:14: 'resource'
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
    // $ANTLR end "T_RESOURCE"

    // $ANTLR start "T_STRING"
    public final void mT_STRING() throws RecognitionException {
        try {
            int _type = T_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:10: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:12: 'string'
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
    // $ANTLR end "T_STRING"

    // $ANTLR start "VARID"
    public final void mVARID() throws RecognitionException {
        try {
            int _type = VARID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:94:7: ( '$' ID )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:94:9: '$' ID
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
    // $ANTLR end "VARID"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:49: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')||(LA1_0 >= '\u007F' && LA1_0 <= '\u00FF')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:9: ( ( '+' | '-' )? DECIMAL | ( '+' | '-' )? HEXADECIMAL | ( '+' | '-' )? OCTAL | ( '+' | '-' )? BINARY )
            int alt6=4;
            switch ( input.LA(1) ) {
            case '+':
            case '-':
                {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1 >= '1' && LA6_1 <= '9')) ) {
                    alt6=1;
                }
                else if ( (LA6_1=='0') ) {
                    switch ( input.LA(3) ) {
                    case 'X':
                    case 'x':
                        {
                        alt6=2;
                        }
                        break;
                    case 'b':
                        {
                        alt6=4;
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
                        alt6=3;
                        }
                        break;
                    default:
                        alt6=1;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

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
                alt6=1;
                }
                break;
            case '0':
                {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt6=2;
                    }
                    break;
                case 'b':
                    {
                    alt6=4;
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
                    alt6=3;
                    }
                    break;
                default:
                    alt6=1;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:12: ( '+' | '-' )? DECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:12: ( '+' | '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='+'||LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:12: ( '+' | '-' )? HEXADECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:12: ( '+' | '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='+'||LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:12: ( '+' | '-' )? OCTAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:12: ( '+' | '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:12: ( '+' | '-' )? BINARY
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:12: ( '+' | '-' )?
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
    // $ANTLR end "INT"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:4: ( '1' .. '9' ) ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:15: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:12: '0'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:7: ( '0' ( '0' .. '7' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:9: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:13: ( '0' .. '7' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '7')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:8: ( '0b' ( '0' | '1' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:10: '0b' ( '0' | '1' )+
            {
            match("0b"); if (state.failed) return ;



            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:14: ( '0' | '1' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '1')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:6: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:8: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:8: ( '+' | '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='+'||LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:19: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
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
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    match('.'); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:35: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
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
                    	    break loop14;
                        }
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:47: ( EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:47: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:8: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:8: ( '+' | '-' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='+'||LA16_0=='-') ) {
                        alt16=1;
                    }
                    switch (alt16) {
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

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:23: ( '0' .. '9' )+
                    int cnt17=0;
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
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:35: ( EXPONENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:35: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:8: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:8: ( '+' | '-' )?
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:19: ( '0' .. '9' )+
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
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:22: ( '+' | '-' )?
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:33: ( '0' .. '9' )+
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


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_SINGLE_QUOTED"
    public final void mSTRING_SINGLE_QUOTED() throws RecognitionException {
        try {
            int _type = STRING_SINGLE_QUOTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:2: ( '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:4: '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:9: ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )*
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2=='\\') ) {
                        int LA24_4 = input.LA(3);

                        if ( (synpred1_TSPHP()) ) {
                            alt24=1;
                        }
                        else if ( (true) ) {
                            alt24=3;
                        }


                    }
                    else if ( (LA24_2=='\'') ) {
                        int LA24_5 = input.LA(3);

                        if ( (LA24_5=='\'') && (synpred2_TSPHP())) {
                            alt24=2;
                        }
                        else if ( (LA24_5=='\\') && (synpred2_TSPHP())) {
                            alt24=2;
                        }
                        else if ( ((LA24_5 >= '\u0000' && LA24_5 <= '&')||(LA24_5 >= '(' && LA24_5 <= '[')||(LA24_5 >= ']' && LA24_5 <= '\uFFFF')) && (synpred2_TSPHP())) {
                            alt24=2;
                        }

                        else {
                            alt24=3;
                        }


                    }
                    else if ( ((LA24_2 >= '\u0000' && LA24_2 <= '&')||(LA24_2 >= '(' && LA24_2 <= '[')||(LA24_2 >= ']' && LA24_2 <= '\uFFFF')) ) {
                        alt24=3;
                    }


                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')||(LA24_0 >= '(' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:6: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:7: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:6: ~ ( '\\'' )
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
            	    break loop24;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_SINGLE_QUOTED"

    // $ANTLR start "STRING_DOUBLE_QUOTED"
    public final void mSTRING_DOUBLE_QUOTED() throws RecognitionException {
        try {
            int _type = STRING_DOUBLE_QUOTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:6: ( '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:8: '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:12: ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )*
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2=='\\') ) {
                        int LA25_4 = input.LA(3);

                        if ( (synpred3_TSPHP()) ) {
                            alt25=1;
                        }
                        else if ( (true) ) {
                            alt25=4;
                        }


                    }
                    else if ( (LA25_2=='\"') ) {
                        int LA25_5 = input.LA(3);

                        if ( (LA25_5=='\"') && (synpred4_TSPHP())) {
                            alt25=2;
                        }
                        else if ( (LA25_5=='\\') && (synpred4_TSPHP())) {
                            alt25=2;
                        }
                        else if ( ((LA25_5 >= '\u0000' && LA25_5 <= '!')||LA25_5=='#'||(LA25_5 >= '%' && LA25_5 <= '[')||(LA25_5 >= ']' && LA25_5 <= '\uFFFF')) && (synpred4_TSPHP())) {
                            alt25=2;
                        }

                        else {
                            alt25=4;
                        }


                    }
                    else if ( (LA25_2=='$') && (synpred5_TSPHP())) {
                        alt25=3;
                    }
                    else if ( ((LA25_2 >= '\u0000' && LA25_2 <= '!')||LA25_2=='#'||(LA25_2 >= '%' && LA25_2 <= '[')||(LA25_2 >= ']' && LA25_2 <= '\uFFFF')) ) {
                        alt25=4;
                    }


                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '!')||LA25_0=='#'||(LA25_0 >= '%' && LA25_0 <= '[')||(LA25_0 >= ']' && LA25_0 <= '\uFFFF')) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:6: ( '\\\\' '\\\\' )=> '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;



            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:7: ( '\\\\' '\"' )=> '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;



            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:6: ( '\\\\' '$' )=> '\\\\$'
            	    {
            	    match("\\$"); if (state.failed) return ;



            	    }
            	    break;
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:6: ~ ( '\"' | '$' )
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
            	    break loop25;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_DOUBLE_QUOTED"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:6: ( ' ' | '\\t' | '\\r' | '\\n' )
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( Equal | FALSE | Semicolon | TRUE | T_ARRAY | T_BOOL | T_BOOLEAN | T_FLOAT | T_INT | T_RESOURCE | T_STRING | VARID | INT | FLOAT | STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED | WS )
        int alt26=17;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:10: Equal
                {
                mEqual(); if (state.failed) return ;


                }
                break;
            case 2 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:16: FALSE
                {
                mFALSE(); if (state.failed) return ;


                }
                break;
            case 3 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:22: Semicolon
                {
                mSemicolon(); if (state.failed) return ;


                }
                break;
            case 4 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:32: TRUE
                {
                mTRUE(); if (state.failed) return ;


                }
                break;
            case 5 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:37: T_ARRAY
                {
                mT_ARRAY(); if (state.failed) return ;


                }
                break;
            case 6 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:45: T_BOOL
                {
                mT_BOOL(); if (state.failed) return ;


                }
                break;
            case 7 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:52: T_BOOLEAN
                {
                mT_BOOLEAN(); if (state.failed) return ;


                }
                break;
            case 8 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:62: T_FLOAT
                {
                mT_FLOAT(); if (state.failed) return ;


                }
                break;
            case 9 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:70: T_INT
                {
                mT_INT(); if (state.failed) return ;


                }
                break;
            case 10 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:76: T_RESOURCE
                {
                mT_RESOURCE(); if (state.failed) return ;


                }
                break;
            case 11 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:87: T_STRING
                {
                mT_STRING(); if (state.failed) return ;


                }
                break;
            case 12 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:96: VARID
                {
                mVARID(); if (state.failed) return ;


                }
                break;
            case 13 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:102: INT
                {
                mINT(); if (state.failed) return ;


                }
                break;
            case 14 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:106: FLOAT
                {
                mFLOAT(); if (state.failed) return ;


                }
                break;
            case 15 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:112: STRING_SINGLE_QUOTED
                {
                mSTRING_SINGLE_QUOTED(); if (state.failed) return ;


                }
                break;
            case 16 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:133: STRING_DOUBLE_QUOTED
                {
                mSTRING_DOUBLE_QUOTED(); if (state.failed) return ;


                }
                break;
            case 17 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:154: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_TSPHP
    public final void synpred1_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_TSPHP

    // $ANTLR start synpred2_TSPHP
    public final void synpred2_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:7: ( '\\\\' '\\'' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:8: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;

        match('\''); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_TSPHP

    // $ANTLR start synpred3_TSPHP
    public final void synpred3_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TSPHP

    // $ANTLR start synpred4_TSPHP
    public final void synpred4_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:7: ( '\\\\' '\"' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:8: '\\\\' '\"'
        {
        match('\\'); if (state.failed) return ;

        match('\"'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_TSPHP

    // $ANTLR start synpred5_TSPHP
    public final void synpred5_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:6: ( '\\\\' '$' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:7: '\\\\' '$'
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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA21_eotS =
        "\6\uffff";
    static final String DFA21_eofS =
        "\6\uffff";
    static final String DFA21_minS =
        "\1\53\2\56\3\uffff";
    static final String DFA21_maxS =
        "\2\71\1\145\3\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\2\1\1\1\3";
    static final String DFA21_specialS =
        "\6\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "147:1: FLOAT : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA26_eotS =
        "\14\uffff\2\26\7\uffff\1\26\1\uffff\1\26\1\uffff\1\33\2\uffff";
    static final String DFA26_eofS =
        "\34\uffff";
    static final String DFA26_minS =
        "\1\11\1\uffff\1\141\3\uffff\1\157\4\uffff\3\56\6\uffff\1\157\1\56"+
        "\1\uffff\1\56\1\154\1\145\2\uffff";
    static final String DFA26_maxS =
        "\1\164\1\uffff\1\154\3\uffff\1\157\4\uffff\1\71\2\145\6\uffff\1"+
        "\157\1\145\1\uffff\1\145\1\154\1\145\2\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\uffff\1\11\1\12\1\13\1\14\3\uffff"+
        "\1\16\1\17\1\20\1\21\1\2\1\10\2\uffff\1\15\3\uffff\1\7\1\6";
    static final String DFA26_specialS =
        "\34\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\20\1\uffff\1\12\2"+
            "\uffff\1\17\3\uffff\1\13\1\uffff\1\13\1\16\1\uffff\1\15\11\14"+
            "\1\uffff\1\3\1\uffff\1\1\43\uffff\1\5\1\6\3\uffff\1\2\2\uffff"+
            "\1\7\10\uffff\1\10\1\11\1\4",
            "",
            "\1\22\12\uffff\1\23",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\15\11\14",
            "\1\16\1\uffff\12\25\13\uffff\1\16\37\uffff\1\16",
            "\1\16\1\uffff\10\27\2\16\13\uffff\1\16\37\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\16\1\uffff\12\25\13\uffff\1\16\37\uffff\1\16",
            "",
            "\1\16\1\uffff\10\27\2\16\13\uffff\1\16\37\uffff\1\16",
            "\1\31",
            "\1\32",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Equal | FALSE | Semicolon | TRUE | T_ARRAY | T_BOOL | T_BOOLEAN | T_FLOAT | T_INT | T_RESOURCE | T_STRING | VARID | INT | FLOAT | STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED | WS );";
        }
    }
 

}