// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-10 01:59:06

package ch.tutteli.tsphp.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSPHPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BOOL", "BOOLEAN", "FLOAT", "ID", "INT", "RESOURCE", "STRING", "Semicolon", "VARID", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TSPHPParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TSPHPParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TSPHPParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }



    // $ANTLR start "prog"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:1: prog : ( statement )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:6: ( ( statement )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:8: ( statement )+
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:8: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ARRAY && LA1_0 <= FLOAT)||(LA1_0 >= INT && LA1_0 <= STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog91);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "statement"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:1: statement : var ;
    public final void statement() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:11: ( var )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:13: var
            {
            pushFollow(FOLLOW_var_in_statement100);
            var();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "var"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:1: var : type VARID ';' ;
    public final void var() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:5: ( type VARID ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:7: type VARID ';'
            {
            pushFollow(FOLLOW_type_in_var109);
            type();

            state._fsp--;


            match(input,VARID,FOLLOW_VARID_in_var111); 

            match(input,Semicolon,FOLLOW_Semicolon_in_var114); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "var"



    // $ANTLR start "type"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:1: type : primitiveTypes ;
    public final void type() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:7: ( primitiveTypes )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:9: primitiveTypes
            {
            pushFollow(FOLLOW_primitiveTypes_in_type123);
            primitiveTypes();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "primitiveTypes"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:45:1: primitiveTypes : ( 'bool' | 'boolean' | 'int' | 'float' | 'string' | 'resource' | 'array' );
    public final void primitiveTypes() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:46:2: ( 'bool' | 'boolean' | 'int' | 'float' | 'string' | 'resource' | 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( (input.LA(1) >= ARRAY && input.LA(1) <= FLOAT)||(input.LA(1) >= INT && input.LA(1) <= STRING) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primitiveTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog91 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_var_in_statement100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var109 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARID_in_var111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Semicolon_in_var114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypes_in_type123 = new BitSet(new long[]{0x0000000000000002L});

}