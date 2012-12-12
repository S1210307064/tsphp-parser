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

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSPHPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINARY", "DECIMAL", "EXPONENT", "Equal", "FALSE", "FLOAT", "HEXADECIMAL", "ID", "INT", "OCTAL", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "TRUE", "T_ARRAY", "T_BOOL", "T_BOOLEAN", "T_FLOAT", "T_INT", "T_RESOURCE", "T_STRING", "VARID", "WS"
    };

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:6: ( ( stat )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:8: ( stat )+
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:8: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= T_ARRAY && LA1_0 <= T_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog118);
            	    stat();

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



    // $ANTLR start "stat"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:75:1: stat : ( varDecl | varAssign );
    public final void stat() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:75:6: ( varDecl | varAssign )
            int alt2=2;
            switch ( input.LA(1) ) {
            case T_BOOL:
            case T_BOOLEAN:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==VARID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==Equal) ) {
                        alt2=2;
                    }
                    else if ( (LA2_6==Semicolon) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case T_INT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==VARID) ) {
                    int LA2_7 = input.LA(3);

                    if ( (LA2_7==Equal) ) {
                        alt2=2;
                    }
                    else if ( (LA2_7==Semicolon) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

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
            case T_FLOAT:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==VARID) ) {
                    int LA2_8 = input.LA(3);

                    if ( (LA2_8==Equal) ) {
                        alt2=2;
                    }
                    else if ( (LA2_8==Semicolon) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case T_STRING:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==VARID) ) {
                    int LA2_9 = input.LA(3);

                    if ( (LA2_9==Equal) ) {
                        alt2=2;
                    }
                    else if ( (LA2_9==Semicolon) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case T_ARRAY:
            case T_RESOURCE:
                {
                alt2=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:75:8: varDecl
                    {
                    pushFollow(FOLLOW_varDecl_in_stat127);
                    varDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:76:4: varAssign
                    {
                    pushFollow(FOLLOW_varAssign_in_stat132);
                    varAssign();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "stat"



    // $ANTLR start "varDecl"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:79:1: varDecl : type VARID ';' ;
    public final void varDecl() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:79:9: ( type VARID ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:79:11: type VARID ';'
            {
            pushFollow(FOLLOW_type_in_varDecl141);
            type();

            state._fsp--;


            match(input,VARID,FOLLOW_VARID_in_varDecl143); 

            match(input,Semicolon,FOLLOW_Semicolon_in_varDecl146); 

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
    // $ANTLR end "varDecl"



    // $ANTLR start "type"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:81:1: type : primitiveTypes ;
    public final void type() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:81:7: ( primitiveTypes )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:81:9: primitiveTypes
            {
            pushFollow(FOLLOW_primitiveTypes_in_type155);
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:83:1: primitiveTypes : ( 'bool' | 'boolean' | 'int' | 'float' | 'string' | 'resource' | 'array' );
    public final void primitiveTypes() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:84:2: ( 'bool' | 'boolean' | 'int' | 'float' | 'string' | 'resource' | 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( (input.LA(1) >= T_ARRAY && input.LA(1) <= T_STRING) ) {
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



    // $ANTLR start "varAssign"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:1: varAssign : ( boolAssign | intAssign | floatAssign | stringAssign );
    public final void varAssign() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:102:2: ( boolAssign | intAssign | floatAssign | stringAssign )
            int alt3=4;
            switch ( input.LA(1) ) {
            case T_BOOL:
            case T_BOOLEAN:
                {
                alt3=1;
                }
                break;
            case T_INT:
                {
                alt3=2;
                }
                break;
            case T_FLOAT:
                {
                alt3=3;
                }
                break;
            case T_STRING:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:102:4: boolAssign
                    {
                    pushFollow(FOLLOW_boolAssign_in_varAssign262);
                    boolAssign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:103:4: intAssign
                    {
                    pushFollow(FOLLOW_intAssign_in_varAssign268);
                    intAssign();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:4: floatAssign
                    {
                    pushFollow(FOLLOW_floatAssign_in_varAssign274);
                    floatAssign();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:4: stringAssign
                    {
                    pushFollow(FOLLOW_stringAssign_in_varAssign279);
                    stringAssign();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "varAssign"



    // $ANTLR start "boolAssign"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:110:1: boolAssign : ( T_BOOL | T_BOOLEAN ) VARID '=' ( TRUE | FALSE ) ';' ;
    public final void boolAssign() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:2: ( ( T_BOOL | T_BOOLEAN ) VARID '=' ( TRUE | FALSE ) ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:4: ( T_BOOL | T_BOOLEAN ) VARID '=' ( TRUE | FALSE ) ';'
            {
            if ( (input.LA(1) >= T_BOOL && input.LA(1) <= T_BOOLEAN) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,VARID,FOLLOW_VARID_in_boolAssign299); 

            match(input,Equal,FOLLOW_Equal_in_boolAssign301); 

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,Semicolon,FOLLOW_Semicolon_in_boolAssign309); 

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
    // $ANTLR end "boolAssign"



    // $ANTLR start "intAssign"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:1: intAssign : T_INT VARID '=' INT ';' ;
    public final void intAssign() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:2: ( T_INT VARID '=' INT ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:4: T_INT VARID '=' INT ';'
            {
            match(input,T_INT,FOLLOW_T_INT_in_intAssign320); 

            match(input,VARID,FOLLOW_VARID_in_intAssign322); 

            match(input,Equal,FOLLOW_Equal_in_intAssign324); 

            match(input,INT,FOLLOW_INT_in_intAssign326); 

            match(input,Semicolon,FOLLOW_Semicolon_in_intAssign328); 

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
    // $ANTLR end "intAssign"



    // $ANTLR start "floatAssign"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:1: floatAssign : T_FLOAT VARID '=' FLOAT ';' ;
    public final void floatAssign() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:144:2: ( T_FLOAT VARID '=' FLOAT ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:144:4: T_FLOAT VARID '=' FLOAT ';'
            {
            match(input,T_FLOAT,FOLLOW_T_FLOAT_in_floatAssign563); 

            match(input,VARID,FOLLOW_VARID_in_floatAssign565); 

            match(input,Equal,FOLLOW_Equal_in_floatAssign567); 

            match(input,FLOAT,FOLLOW_FLOAT_in_floatAssign569); 

            match(input,Semicolon,FOLLOW_Semicolon_in_floatAssign571); 

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
    // $ANTLR end "floatAssign"



    // $ANTLR start "stringAssign"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:1: stringAssign : T_STRING VARID '=' ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED ) ';' ;
    public final void stringAssign() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:2: ( T_STRING VARID '=' ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED ) ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: T_STRING VARID '=' ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED ) ';'
            {
            match(input,T_STRING,FOLLOW_T_STRING_in_stringAssign706); 

            match(input,VARID,FOLLOW_VARID_in_stringAssign708); 

            match(input,Equal,FOLLOW_Equal_in_stringAssign710); 

            if ( (input.LA(1) >= STRING_DOUBLE_QUOTED && input.LA(1) <= STRING_SINGLE_QUOTED) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,Semicolon,FOLLOW_Semicolon_in_stringAssign720); 

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
    // $ANTLR end "stringAssign"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog118 = new BitSet(new long[]{0x0000000001FC0002L});
    public static final BitSet FOLLOW_varDecl_in_stat127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssign_in_stat132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDecl141 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARID_in_varDecl143 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Semicolon_in_varDecl146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypes_in_type155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolAssign_in_varAssign262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intAssign_in_varAssign268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatAssign_in_varAssign274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringAssign_in_varAssign279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolAssign293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARID_in_boolAssign299 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Equal_in_boolAssign301 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_set_in_boolAssign303 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Semicolon_in_boolAssign309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_intAssign320 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARID_in_intAssign322 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Equal_in_intAssign324 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_intAssign326 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Semicolon_in_intAssign328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_floatAssign563 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARID_in_floatAssign565 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Equal_in_floatAssign567 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FLOAT_in_floatAssign569 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Semicolon_in_floatAssign571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_stringAssign706 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARID_in_stringAssign708 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Equal_in_stringAssign710 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_set_in_stringAssign712 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Semicolon_in_stringAssign720 = new BitSet(new long[]{0x0000000000000002L});

}