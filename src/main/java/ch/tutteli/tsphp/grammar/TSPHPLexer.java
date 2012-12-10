// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-10 01:59:06

package ch.tutteli.tsphp.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSPHPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ARRAY=4;
    public static final int BOOL=5;
    public static final int BOOLEAN=6;
    public static final int FLOAT=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int RESOURCE=10;
    public static final int STRING=11;
    public static final int Semicolon=12;
    public static final int VARID=13;
    public static final int WS=14;

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

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:6:7: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:6:9: 'array'
            {
            match("array"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:7:6: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:7:8: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:8:9: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:8:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:9:7: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:9:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:10:5: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:10:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "RESOURCE"
    public final void mRESOURCE() throws RecognitionException {
        try {
            int _type = RESOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:11:10: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:11:12: 'resource'
            {
            match("resource"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESOURCE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:12:8: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:12:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:13:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:13:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "VARID"
    public final void mVARID() throws RecognitionException {
        try {
            int _type = VARID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:7: ( '$' ID )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:9: '$' ID
            {
            match('$'); 

            mID(); 


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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u00FF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:49: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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
            	    }
            	    else {
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:103:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:103:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

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
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( ARRAY | BOOL | BOOLEAN | FLOAT | INT | RESOURCE | STRING | Semicolon | VARID | WS )
        int alt2=10;
        switch ( input.LA(1) ) {
        case 'a':
            {
            alt2=1;
            }
            break;
        case 'b':
            {
            int LA2_2 = input.LA(2);

            if ( (LA2_2=='o') ) {
                int LA2_10 = input.LA(3);

                if ( (LA2_10=='o') ) {
                    int LA2_11 = input.LA(4);

                    if ( (LA2_11=='l') ) {
                        int LA2_12 = input.LA(5);

                        if ( (LA2_12=='e') ) {
                            alt2=3;
                        }
                        else {
                            alt2=2;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 2, input);

                throw nvae;

            }
            }
            break;
        case 'f':
            {
            alt2=4;
            }
            break;
        case 'i':
            {
            alt2=5;
            }
            break;
        case 'r':
            {
            alt2=6;
            }
            break;
        case 's':
            {
            alt2=7;
            }
            break;
        case ';':
            {
            alt2=8;
            }
            break;
        case '$':
            {
            alt2=9;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:10: ARRAY
                {
                mARRAY(); 


                }
                break;
            case 2 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:16: BOOL
                {
                mBOOL(); 


                }
                break;
            case 3 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:21: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 4 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:29: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 5 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:35: INT
                {
                mINT(); 


                }
                break;
            case 6 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:39: RESOURCE
                {
                mRESOURCE(); 


                }
                break;
            case 7 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:48: STRING
                {
                mSTRING(); 


                }
                break;
            case 8 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:55: Semicolon
                {
                mSemicolon(); 


                }
                break;
            case 9 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:65: VARID
                {
                mVARID(); 


                }
                break;
            case 10 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:71: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}