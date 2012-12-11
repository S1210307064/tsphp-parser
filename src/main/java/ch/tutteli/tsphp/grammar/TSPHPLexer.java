// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-11 21:48:26

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
    public static final int ESC_SEQ_STRING_DOUBLE_QUOTED=6;
    public static final int ESC_SEQ_STRING_SINGLE_QUOTED=7;
    public static final int EXPONENT=8;
    public static final int Equal=9;
    public static final int FALSE=10;
    public static final int FLOAT=11;
    public static final int HEXADECIMAL=12;
    public static final int HEX_BEGIN=13;
    public static final int HEX_DIGIT=14;
    public static final int ID=15;
    public static final int INT=16;
    public static final int OCTAL=17;
    public static final int OCTAL_DIGIT=18;
    public static final int PLUSMINUS=19;
    public static final int STRING_DOUBLE_QUOTED=20;
    public static final int STRING_SINGLE_QUOTED=21;
    public static final int Semicolon=22;
    public static final int TRUE=23;
    public static final int T_ARRAY=24;
    public static final int T_BOOL=25;
    public static final int T_BOOLEAN=26;
    public static final int T_FLOAT=27;
    public static final int T_INT=28;
    public static final int T_RESOURCE=29;
    public static final int T_STRING=30;
    public static final int VARID=31;
    public static final int WS=32;

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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:6:7: ( '=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:6:9: '='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:7:7: ( 'false' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:7:9: 'false'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:8:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:8:13: ';'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:9:6: ( 'true' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:9:8: 'true'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:10:9: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:10:11: 'array'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:11:8: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:11:10: 'bool'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:12:11: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:12:13: 'boolean'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:13:9: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:13:11: 'float'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:14:7: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:14:9: 'int'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:15:12: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:15:14: 'resource'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:16:10: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:16:12: 'string'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:7: ( '$' ID )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:9: '$' ID
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:49: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:86:9: ( ( PLUSMINUS )? DECIMAL | ( PLUSMINUS )? HEXADECIMAL | ( PLUSMINUS )? OCTAL | ( PLUSMINUS )? BINARY )
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
                    case 'b':
                        {
                        alt6=4;
                        }
                        break;
                    case 'X':
                    case 'x':
                        {
                        alt6=2;
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
                case 'b':
                    {
                    alt6=4;
                    }
                    break;
                case 'X':
                case 'x':
                    {
                    alt6=2;
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:86:12: ( PLUSMINUS )? DECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:86:12: ( PLUSMINUS )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:87:12: ( PLUSMINUS )? HEXADECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:87:12: ( PLUSMINUS )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:88:12: ( PLUSMINUS )? OCTAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:88:12: ( PLUSMINUS )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:12: ( PLUSMINUS )? BINARY
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:12: ( PLUSMINUS )?
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

    // $ANTLR start "PLUSMINUS"
    public final void mPLUSMINUS() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:2: ( ( '+' | '-' ) )
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSMINUS"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:99:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:99:4: ( '1' .. '9' ) ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:99:15: ( '0' .. '9' )*
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:100:12: '0'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:2: ( '0' HEX_BEGIN ( HEX_DIGIT )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:4: '0' HEX_BEGIN ( HEX_DIGIT )+
            {
            match('0'); if (state.failed) return ;

            mHEX_BEGIN(); if (state.failed) return ;


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:18: ( HEX_DIGIT )+
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

    // $ANTLR start "HEX_BEGIN"
    public final void mHEX_BEGIN() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:2: ( ( 'x' | 'X' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
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


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_BEGIN"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:112:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "OCTAL"
    public final void mOCTAL() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:7: ( '0' ( OCTAL_DIGIT )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:9: '0' ( OCTAL_DIGIT )+
            {
            match('0'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:13: ( OCTAL_DIGIT )+
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

    // $ANTLR start "OCTAL_DIGIT"
    public final void mOCTAL_DIGIT() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:2: ( ( '0' .. '7' ) )
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_DIGIT"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:8: ( '0b' ( '0' | '1' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:10: '0b' ( '0' | '1' )+
            {
            match("0b"); if (state.failed) return ;



            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:14: ( '0' | '1' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:6: ( ( PLUSMINUS )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( PLUSMINUS )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( PLUSMINUS )? ( '0' .. '9' )+ EXPONENT )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:8: ( PLUSMINUS )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:8: ( PLUSMINUS )?
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:19: ( '0' .. '9' )+
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

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:35: ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:47: ( EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:47: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:8: ( PLUSMINUS )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:8: ( PLUSMINUS )?
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

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:23: ( '0' .. '9' )+
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:35: ( EXPONENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:35: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:130:8: ( PLUSMINUS )? ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:130:8: ( PLUSMINUS )?
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:130:19: ( '0' .. '9' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:10: ( ( 'e' | 'E' ) ( PLUSMINUS )? ( '0' .. '9' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:12: ( 'e' | 'E' ) ( PLUSMINUS )? ( '0' .. '9' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:22: ( PLUSMINUS )?
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:33: ( '0' .. '9' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:2: ( '\\'' ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0026' ) | ( '\\u0028' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )* '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:4: '\\'' ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0026' ) | ( '\\u0028' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:141:9: ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0026' ) | ( '\\u0028' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )*
            loop24:
            do {
                int alt24=5;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') && (synpred1_TSPHP())) {
                    alt24=1;
                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')) ) {
                    alt24=2;
                }
                else if ( ((LA24_0 >= '(' && LA24_0 <= '[')) ) {
                    alt24=3;
                }
                else if ( ((LA24_0 >= ']' && LA24_0 <= '\u00FF')) ) {
                    alt24=4;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:4: ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mESC_SEQ_STRING_SINGLE_QUOTED(); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:6: ( '\\u0000' .. '\\u0026' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&') ) {
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
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:144:6: ( '\\u0028' .. '\\u005B' )
            	    {
            	    if ( (input.LA(1) >= '(' && input.LA(1) <= '[') ) {
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
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:145:6: ( '\\u005D' .. '\\u00FF' )
            	    {
            	    if ( (input.LA(1) >= ']' && input.LA(1) <= '\u00FF') ) {
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

    // $ANTLR start "ESC_SEQ_STRING_SINGLE_QUOTED"
    public final void mESC_SEQ_STRING_SINGLE_QUOTED() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:2: ( '\\\\' | '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ_STRING_SINGLE_QUOTED"

    // $ANTLR start "STRING_DOUBLE_QUOTED"
    public final void mSTRING_DOUBLE_QUOTED() throws RecognitionException {
        try {
            int _type = STRING_DOUBLE_QUOTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:153:6: ( '\"' ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0021' ) | ( '\\u0023' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )* '\"' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:153:8: '\"' ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0021' ) | ( '\\u0023' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:153:12: ( ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED | ( '\\u0000' .. '\\u0021' ) | ( '\\u0023' .. '\\u005B' ) | ( '\\u005D' .. '\\u00FF' ) )*
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') && (synpred2_TSPHP())) {
                    alt25=1;
                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '!')) ) {
                    alt25=2;
                }
                else if ( ((LA25_0 >= '#' && LA25_0 <= '[')) ) {
                    alt25=3;
                }
                else if ( ((LA25_0 >= ']' && LA25_0 <= '\u00FF')) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:4: ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )=> '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mESC_SEQ_STRING_SINGLE_QUOTED(); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:11: ( '\\u0000' .. '\\u0021' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!') ) {
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
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:11: ( '\\u0023' .. '\\u005B' )
            	    {
            	    if ( (input.LA(1) >= '#' && input.LA(1) <= '[') ) {
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
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:11: ( '\\u005D' .. '\\u00FF' )
            	    {
            	    if ( (input.LA(1) >= ']' && input.LA(1) <= '\u00FF') ) {
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

    // $ANTLR start "ESC_SEQ_STRING_DOUBLE_QUOTED"
    public final void mESC_SEQ_STRING_DOUBLE_QUOTED() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:2: ( 'n' | 'r' | 't' | 'v' | 'e' | 'f' | '\\\\' | '\"' | ( HEX_BEGIN HEX_DIGIT ( HEX_DIGIT )? ) | ( OCTAL_DIGIT ( OCTAL_DIGIT ( OCTAL_DIGIT )? )? ) )
            int alt29=10;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt29=1;
                }
                break;
            case 'r':
                {
                alt29=2;
                }
                break;
            case 't':
                {
                alt29=3;
                }
                break;
            case 'v':
                {
                alt29=4;
                }
                break;
            case 'e':
                {
                alt29=5;
                }
                break;
            case 'f':
                {
                alt29=6;
                }
                break;
            case '\\':
                {
                alt29=7;
                }
                break;
            case '\"':
                {
                alt29=8;
                }
                break;
            case 'X':
            case 'x':
                {
                alt29=9;
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
                alt29=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:4: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:10: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:16: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:22: 'v'
                    {
                    match('v'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:28: 'e'
                    {
                    match('e'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:34: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:40: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:47: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:9: ( HEX_BEGIN HEX_DIGIT ( HEX_DIGIT )? )
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:9: ( HEX_BEGIN HEX_DIGIT ( HEX_DIGIT )? )
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:10: HEX_BEGIN HEX_DIGIT ( HEX_DIGIT )?
                    {
                    mHEX_BEGIN(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:30: ( HEX_DIGIT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'F')||(LA26_0 >= 'a' && LA26_0 <= 'f')) ) {
                        alt26=1;
                    }
                    switch (alt26) {
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

                    }


                    }


                    }
                    break;
                case 10 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:9: ( OCTAL_DIGIT ( OCTAL_DIGIT ( OCTAL_DIGIT )? )? )
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:9: ( OCTAL_DIGIT ( OCTAL_DIGIT ( OCTAL_DIGIT )? )? )
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:10: OCTAL_DIGIT ( OCTAL_DIGIT ( OCTAL_DIGIT )? )?
                    {
                    mOCTAL_DIGIT(); if (state.failed) return ;


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:22: ( OCTAL_DIGIT ( OCTAL_DIGIT )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0 >= '0' && LA28_0 <= '7')) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:23: OCTAL_DIGIT ( OCTAL_DIGIT )?
                            {
                            mOCTAL_DIGIT(); if (state.failed) return ;


                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:35: ( OCTAL_DIGIT )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( ((LA27_0 >= '0' && LA27_0 <= '7')) ) {
                                alt27=1;
                            }
                            switch (alt27) {
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

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ_STRING_DOUBLE_QUOTED"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:6: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        int alt30=17;
        alt30 = dfa30.predict(input);
        switch (alt30) {
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
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:4: ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:5: '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED
        {
        match('\\'); if (state.failed) return ;

        mESC_SEQ_STRING_SINGLE_QUOTED(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred1_TSPHP

    // $ANTLR start synpred2_TSPHP
    public final void synpred2_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:4: ( '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:6: '\\\\' ESC_SEQ_STRING_SINGLE_QUOTED
        {
        match('\\'); if (state.failed) return ;

        mESC_SEQ_STRING_SINGLE_QUOTED(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_TSPHP

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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA30 dfa30 = new DFA30(this);
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
            return "127:1: FLOAT : ( ( PLUSMINUS )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( PLUSMINUS )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( PLUSMINUS )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA30_eotS =
        "\14\uffff\2\26\7\uffff\1\26\1\uffff\1\26\1\uffff\1\33\2\uffff";
    static final String DFA30_eofS =
        "\34\uffff";
    static final String DFA30_minS =
        "\1\11\1\uffff\1\141\3\uffff\1\157\4\uffff\3\56\6\uffff\1\157\1\56"+
        "\1\uffff\1\56\1\154\1\145\2\uffff";
    static final String DFA30_maxS =
        "\1\164\1\uffff\1\154\3\uffff\1\157\4\uffff\1\71\2\145\6\uffff\1"+
        "\157\1\145\1\uffff\1\145\1\154\1\145\2\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\uffff\1\11\1\12\1\13\1\14\3\uffff"+
        "\1\16\1\17\1\20\1\21\1\2\1\10\2\uffff\1\15\3\uffff\1\7\1\6";
    static final String DFA30_specialS =
        "\34\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Equal | FALSE | Semicolon | TRUE | T_ARRAY | T_BOOL | T_BOOLEAN | T_FLOAT | T_INT | T_RESOURCE | T_STRING | VARID | INT | FLOAT | STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED | WS );";
        }
    }
 

}