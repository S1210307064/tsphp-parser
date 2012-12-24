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
public class TSPHPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arrow", "BINARY", "Bool", "Comma", "Comment", "DECIMAL", "Dolar", "EXPONENT", "Else", "Equal", "Float", "Function", "HEXADECIMAL", "ID", "If", "Int", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "Namespace", "NamespaceId", "OCTAL", "PRIMITIVE_TYPES", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "String", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeResource", "TypeString", "VariableId", "Whitespace"
    };

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:1: prog : ( ( namespaceSemicolon )+ | ( namespaceBracket )+ | withoutNamespace );
    public final void prog() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:6: ( ( namespaceSemicolon )+ | ( namespaceBracket )+ | withoutNamespace )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Namespace) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==NamespaceId) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==Semicolon) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==LeftCurlyBrace) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA3_1==LeftCurlyBrace) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==If||(LA3_0 >= TypeArray && LA3_0 <= TypeString)) ) {
                alt3=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:8: ( namespaceSemicolon )+
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:8: ( namespaceSemicolon )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Namespace) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:8: namespaceSemicolon
                    	    {
                    	    pushFollow(FOLLOW_namespaceSemicolon_in_prog221);
                    	    namespaceSemicolon();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:90:4: ( namespaceBracket )+
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:90:4: ( namespaceBracket )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Namespace) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:90:4: namespaceBracket
                    	    {
                    	    pushFollow(FOLLOW_namespaceBracket_in_prog227);
                    	    namespaceBracket();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:91:4: withoutNamespace
                    {
                    pushFollow(FOLLOW_withoutNamespace_in_prog233);
                    withoutNamespace();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "prog"



    // $ANTLR start "namespaceSemicolon"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:94:1: namespaceSemicolon : ( 'namespace' NamespaceId ';' ( command )+ ) ;
    public final void namespaceSemicolon() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:2: ( ( 'namespace' NamespaceId ';' ( command )+ ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:4: ( 'namespace' NamespaceId ';' ( command )+ )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:4: ( 'namespace' NamespaceId ';' ( command )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:5: 'namespace' NamespaceId ';' ( command )+
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon246); if (state.failed) return ;

            match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceSemicolon248); if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon250); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:33: ( command )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==If||(LA4_0 >= TypeArray && LA4_0 <= TypeString)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:33: command
            	    {
            	    pushFollow(FOLLOW_command_in_namespaceSemicolon252);
            	    command();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "namespaceSemicolon"



    // $ANTLR start "namespaceBracket"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:97:1: namespaceBracket : ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' ) ;
    public final void namespaceBracket() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:2: ( ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:4: ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:4: ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:5: 'namespace' ( NamespaceId )? '{' ( command )+ '}'
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket265); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:17: ( NamespaceId )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NamespaceId) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:17: NamespaceId
                    {
                    match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceBracket267); if (state.failed) return ;

                    }
                    break;

            }


            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket270); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:34: ( command )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==If||(LA6_0 >= TypeArray && LA6_0 <= TypeString)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:34: command
            	    {
            	    pushFollow(FOLLOW_command_in_namespaceBracket272);
            	    command();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket275); if (state.failed) return ;

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
    // $ANTLR end "namespaceBracket"



    // $ANTLR start "withoutNamespace"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:110:1: withoutNamespace : ( command )+ ;
    public final void withoutNamespace() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:2: ( ( command )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:4: ( command )+
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:4: ( command )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==If||(LA7_0 >= TypeArray && LA7_0 <= TypeString)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:4: command
            	    {
            	    pushFollow(FOLLOW_command_in_withoutNamespace359);
            	    command();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "withoutNamespace"



    // $ANTLR start "command"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:1: command : instruction ;
    public final void command() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:9: ( instruction )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:2: instruction
            {
            pushFollow(FOLLOW_instruction_in_command372);
            instruction();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "command"



    // $ANTLR start "instruction"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:131:1: instruction : ( condition | varDeclaration );
    public final void instruction() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:132:2: ( condition | varDeclaration )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==If) ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= TypeArray && LA8_0 <= TypeString)) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:132:4: condition
                    {
                    pushFollow(FOLLOW_condition_in_instruction387);
                    condition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:4: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_instruction394);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "instruction"



    // $ANTLR start "condition"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:1: condition : 'if' '(' ( boolExpression | VariableId ) ')' ( blockOrSingleCommand ) ( 'else' blockOrSingleCommand )? ;
    public final void condition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:2: ( 'if' '(' ( boolExpression | VariableId ) ')' ( blockOrSingleCommand ) ( 'else' blockOrSingleCommand )? )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:4: 'if' '(' ( boolExpression | VariableId ) ')' ( blockOrSingleCommand ) ( 'else' blockOrSingleCommand )?
            {
            match(input,If,FOLLOW_If_in_condition406); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_condition408); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:13: ( boolExpression | VariableId )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Bool) ) {
                alt9=1;
            }
            else if ( (LA9_0==VariableId) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:14: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_condition411);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:31: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_condition415); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_condition418); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:139:3: ( blockOrSingleCommand )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:140:4: blockOrSingleCommand
            {
            pushFollow(FOLLOW_blockOrSingleCommand_in_condition427);
            blockOrSingleCommand();

            state._fsp--;
            if (state.failed) return ;

            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:3: ( 'else' blockOrSingleCommand )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Else) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred11_TSPHP()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:5: 'else' blockOrSingleCommand
                    {
                    match(input,Else,FOLLOW_Else_in_condition438); if (state.failed) return ;

                    pushFollow(FOLLOW_blockOrSingleCommand_in_condition440);
                    blockOrSingleCommand();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "condition"



    // $ANTLR start "blockOrSingleCommand"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:155:1: blockOrSingleCommand : ( ( '{' ( command )* '}' ) | command );
    public final void blockOrSingleCommand() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:2: ( ( '{' ( command )* '}' ) | command )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftCurlyBrace) ) {
                alt12=1;
            }
            else if ( (LA12_0==If||(LA12_0 >= TypeArray && LA12_0 <= TypeString)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:4: ( '{' ( command )* '}' )
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:4: ( '{' ( command )* '}' )
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:5: '{' ( command )* '}'
                    {
                    match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_blockOrSingleCommand460); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:9: ( command )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==If||(LA11_0 >= TypeArray && LA11_0 <= TypeString)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:9: command
                    	    {
                    	    pushFollow(FOLLOW_command_in_blockOrSingleCommand462);
                    	    command();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_blockOrSingleCommand466); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:5: command
                    {
                    pushFollow(FOLLOW_command_in_blockOrSingleCommand473);
                    command();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "blockOrSingleCommand"



    // $ANTLR start "varDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:160:1: varDeclaration : ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' );
    public final void varDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:2: ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case TypeArray:
                {
                alt13=1;
                }
                break;
            case TypeBool:
            case TypeBoolean:
                {
                alt13=2;
                }
                break;
            case TypeInt:
                {
                alt13=3;
                }
                break;
            case TypeFloat:
                {
                alt13=4;
                }
                break;
            case TypeString:
                {
                alt13=5;
                }
                break;
            case TypeResource:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:4: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_varDeclaration485);
                    arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:4: boolDeclaration
                    {
                    pushFollow(FOLLOW_boolDeclaration_in_varDeclaration490);
                    boolDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:4: intDeclaration
                    {
                    pushFollow(FOLLOW_intDeclaration_in_varDeclaration496);
                    intDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:4: floatDeclaration
                    {
                    pushFollow(FOLLOW_floatDeclaration_in_varDeclaration502);
                    floatDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: stringDeclaration
                    {
                    pushFollow(FOLLOW_stringDeclaration_in_varDeclaration507);
                    stringDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:4: TypeResource VariableId ';'
                    {
                    match(input,TypeResource,FOLLOW_TypeResource_in_varDeclaration512); if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_varDeclaration514); if (state.failed) return ;

                    match(input,Semicolon,FOLLOW_Semicolon_in_varDeclaration516); if (state.failed) return ;

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
    // $ANTLR end "varDeclaration"



    // $ANTLR start "boolDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:1: boolDeclaration : ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' ;
    public final void boolDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:2: ( ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:4: ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';'
            {
            if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeBoolean) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration577); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:38: ( '=' ( boolExpression | VariableId ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Equal) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:40: '=' ( boolExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_boolDeclaration581); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:44: ( boolExpression | VariableId )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Bool) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==VariableId) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:45: boolExpression
                            {
                            pushFollow(FOLLOW_boolExpression_in_boolDeclaration584);
                            boolExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:60: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration586); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_boolDeclaration592); if (state.failed) return ;

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
    // $ANTLR end "boolDeclaration"



    // $ANTLR start "boolExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:1: boolExpression : Bool ;
    public final void boolExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:2: ( Bool )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:4: Bool
            {
            match(input,Bool,FOLLOW_Bool_in_boolExpression611); if (state.failed) return ;

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
    // $ANTLR end "boolExpression"



    // $ANTLR start "intDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:1: intDeclaration : TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' ;
    public final void intDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:2: ( TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';'
            {
            match(input,TypeInt,FOLLOW_TypeInt_in_intDeclaration625); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration627); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:23: ( '=' ( intExpression | VariableId ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Equal) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:25: '=' ( intExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_intDeclaration631); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:29: ( intExpression | VariableId )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Int) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==VariableId) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:30: intExpression
                            {
                            pushFollow(FOLLOW_intExpression_in_intDeclaration634);
                            intExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:44: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration636); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_intDeclaration642); if (state.failed) return ;

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
    // $ANTLR end "intDeclaration"



    // $ANTLR start "intExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:1: intExpression : Int ;
    public final void intExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:2: ( Int )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:4: Int
            {
            match(input,Int,FOLLOW_Int_in_intExpression651); if (state.failed) return ;

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
    // $ANTLR end "intExpression"



    // $ANTLR start "floatDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: floatDeclaration : TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' ;
    public final void floatDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';'
            {
            match(input,TypeFloat,FOLLOW_TypeFloat_in_floatDeclaration882); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration884); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:25: ( '=' ( floatExpression | VariableId ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Equal) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:27: '=' ( floatExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_floatDeclaration888); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:31: ( floatExpression | VariableId )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Float) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==VariableId) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:32: floatExpression
                            {
                            pushFollow(FOLLOW_floatExpression_in_floatDeclaration891);
                            floatExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:48: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration893); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_floatDeclaration899); if (state.failed) return ;

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
    // $ANTLR end "floatDeclaration"



    // $ANTLR start "floatExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:1: floatExpression : Float ;
    public final void floatExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:2: ( Float )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: Float
            {
            match(input,Float,FOLLOW_Float_in_floatExpression908); if (state.failed) return ;

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
    // $ANTLR end "floatExpression"



    // $ANTLR start "stringDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:1: stringDeclaration : TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' ;
    public final void stringDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:2: ( TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';'
            {
            match(input,TypeString,FOLLOW_TypeString_in_stringDeclaration1044); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1046); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:26: ( '=' ( stringExpression | VariableId ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Equal) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:27: '=' ( stringExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_stringDeclaration1049); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:31: ( stringExpression | VariableId )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==String) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==VariableId) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:32: stringExpression
                            {
                            pushFollow(FOLLOW_stringExpression_in_stringDeclaration1052);
                            stringExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:51: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1056); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_stringDeclaration1062); if (state.failed) return ;

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
    // $ANTLR end "stringDeclaration"



    // $ANTLR start "stringExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:1: stringExpression : String ;
    public final void stringExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:2: ( String )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: String
            {
            match(input,String,FOLLOW_String_in_stringExpression1071); if (state.failed) return ;

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
    // $ANTLR end "stringExpression"



    // $ANTLR start "arrayDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: arrayDeclaration : TypeArray VariableId ( '=' ( array | VariableId ) )? ';' ;
    public final void arrayDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( TypeArray VariableId ( '=' ( array | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: TypeArray VariableId ( '=' ( array | VariableId ) )? ';'
            {
            match(input,TypeArray,FOLLOW_TypeArray_in_arrayDeclaration1251); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1253); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:25: ( '=' ( array | VariableId ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Equal) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:27: '=' ( array | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_arrayDeclaration1257); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:31: ( array | VariableId )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==LeftSquareBrace||LA22_0==TypeArray) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==VariableId) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:32: array
                            {
                            pushFollow(FOLLOW_array_in_arrayDeclaration1260);
                            array();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:38: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1262); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_arrayDeclaration1268); if (state.failed) return ;

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
    // $ANTLR end "arrayDeclaration"



    // $ANTLR start "array"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
    public final void array() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftSquareBrace) ) {
                alt26=1;
            }
            else if ( (LA26_0==TypeArray) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:9: '[' ( array_content )? ']'
                    {
                    match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array1277); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:13: ( array_content )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==Bool||LA24_0==Float||LA24_0==Int||LA24_0==LeftSquareBrace||(LA24_0 >= String && LA24_0 <= TypeArray)||LA24_0==VariableId) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:13: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1279);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array1282); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: TypeArray '(' ( array_content )? ')'
                    {
                    match(input,TypeArray,FOLLOW_TypeArray_in_array1288); if (state.failed) return ;

                    match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array1290); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:18: ( array_content )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Bool||LA25_0==Float||LA25_0==Int||LA25_0==LeftSquareBrace||(LA25_0 >= String && LA25_0 <= TypeArray)||LA25_0==VariableId) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:18: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1292);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array1295); if (state.failed) return ;

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
    // $ANTLR end "array"



    // $ANTLR start "array_content"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:1: array_content : ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* ;
    public final void array_content() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:2: ( ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )*
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: ( array_key '=>' )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case Int:
                    {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==Arrow) ) {
                        alt27=1;
                    }
                    }
                    break;
                case String:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==Arrow) ) {
                        alt27=1;
                    }
                    }
                    break;
                case Bool:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==Arrow) ) {
                        alt27=1;
                    }
                    }
                    break;
                case Float:
                    {
                    int LA27_4 = input.LA(2);

                    if ( (LA27_4==Arrow) ) {
                        alt27=1;
                    }
                    }
                    break;
                case VariableId:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:5: array_key '=>'
                    {
                    pushFollow(FOLLOW_array_key_in_array_content1308);
                    array_key();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,Arrow,FOLLOW_Arrow_in_array_content1310); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_array_value_in_array_content1314);
            array_value();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:35: ( ',' ( array_key '=>' )? array_value )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:36: ',' ( array_key '=>' )? array_value
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_array_content1318); if (state.failed) return ;

            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:40: ( array_key '=>' )?
            	    int alt28=2;
            	    switch ( input.LA(1) ) {
            	        case Int:
            	            {
            	            int LA28_1 = input.LA(2);

            	            if ( (LA28_1==Arrow) ) {
            	                alt28=1;
            	            }
            	            }
            	            break;
            	        case String:
            	            {
            	            int LA28_2 = input.LA(2);

            	            if ( (LA28_2==Arrow) ) {
            	                alt28=1;
            	            }
            	            }
            	            break;
            	        case Bool:
            	            {
            	            int LA28_3 = input.LA(2);

            	            if ( (LA28_3==Arrow) ) {
            	                alt28=1;
            	            }
            	            }
            	            break;
            	        case Float:
            	            {
            	            int LA28_4 = input.LA(2);

            	            if ( (LA28_4==Arrow) ) {
            	                alt28=1;
            	            }
            	            }
            	            break;
            	        case VariableId:
            	            {
            	            alt28=1;
            	            }
            	            break;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:41: array_key '=>'
            	            {
            	            pushFollow(FOLLOW_array_key_in_array_content1321);
            	            array_key();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            match(input,Arrow,FOLLOW_Arrow_in_array_content1323); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_array_value_in_array_content1327);
            	    array_value();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
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
    // $ANTLR end "array_content"



    // $ANTLR start "array_key"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:1: array_key : ( expressions | VariableId );
    public final void array_key() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:2: ( expressions | VariableId )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Bool||LA30_0==Float||LA30_0==Int||LA30_0==String) ) {
                alt30=1;
            }
            else if ( (LA30_0==VariableId) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:4: expressions
                    {
                    pushFollow(FOLLOW_expressions_in_array_key1338);
                    expressions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:16: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_array_key1340); if (state.failed) return ;

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
    // $ANTLR end "array_key"



    // $ANTLR start "expressions"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:1: expressions : ( intExpression | stringExpression | boolExpression | floatExpression );
    public final void expressions() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:2: ( intExpression | stringExpression | boolExpression | floatExpression )
            int alt31=4;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt31=1;
                }
                break;
            case String:
                {
                alt31=2;
                }
                break;
            case Bool:
                {
                alt31=3;
                }
                break;
            case Float:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: intExpression
                    {
                    pushFollow(FOLLOW_intExpression_in_expressions1349);
                    intExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:4: stringExpression
                    {
                    pushFollow(FOLLOW_stringExpression_in_expressions1354);
                    stringExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:4: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_expressions1359);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:4: floatExpression
                    {
                    pushFollow(FOLLOW_floatExpression_in_expressions1364);
                    floatExpression();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "expressions"



    // $ANTLR start "array_value"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:1: array_value options {backtrack=true; } : ( expressions | array );
    public final void array_value() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( expressions | array )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Bool||LA32_0==Float||LA32_0==Int||LA32_0==String) ) {
                alt32=1;
            }
            else if ( (LA32_0==LeftSquareBrace||LA32_0==TypeArray) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: expressions
                    {
                    pushFollow(FOLLOW_expressions_in_array_value1384);
                    expressions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:16: array
                    {
                    pushFollow(FOLLOW_array_in_array_value1386);
                    array();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "array_value"

    // $ANTLR start synpred11_TSPHP
    public final void synpred11_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:5: ( 'else' blockOrSingleCommand )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:5: 'else' blockOrSingleCommand
        {
        match(input,Else,FOLLOW_Else_in_synpred11_TSPHP438); if (state.failed) return ;

        pushFollow(FOLLOW_blockOrSingleCommand_in_synpred11_TSPHP440);
        blockOrSingleCommand();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_TSPHP

    // Delegated rules

    public final boolean synpred11_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_namespaceSemicolon_in_prog221 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_namespaceBracket_in_prog227 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_withoutNamespace_in_prog233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon246 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceSemicolon248 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon250 = new BitSet(new long[]{0x000001FC00040000L});
    public static final BitSet FOLLOW_command_in_namespaceSemicolon252 = new BitSet(new long[]{0x000001FC00040002L});
    public static final BitSet FOLLOW_Namespace_in_namespaceBracket265 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceBracket267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket270 = new BitSet(new long[]{0x000001FC00040000L});
    public static final BitSet FOLLOW_command_in_namespaceBracket272 = new BitSet(new long[]{0x000001FC08040000L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_withoutNamespace359 = new BitSet(new long[]{0x000001FC00040002L});
    public static final BitSet FOLLOW_instruction_in_command372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_instruction387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_instruction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_condition406 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_condition408 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_boolExpression_in_condition411 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_VariableId_in_condition415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_condition418 = new BitSet(new long[]{0x000001FC00140000L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_condition427 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Else_in_condition438 = new BitSet(new long[]{0x000001FC00140000L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_condition440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_blockOrSingleCommand460 = new BitSet(new long[]{0x000001FC08040000L});
    public static final BitSet FOLLOW_command_in_blockOrSingleCommand462 = new BitSet(new long[]{0x000001FC08040000L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_blockOrSingleCommand466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_blockOrSingleCommand473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_varDeclaration485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolDeclaration_in_varDeclaration490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intDeclaration_in_varDeclaration496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatDeclaration_in_varDeclaration502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringDeclaration_in_varDeclaration507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeResource_in_varDeclaration512 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_varDeclaration514 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_varDeclaration516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolDeclaration571 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration577 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_Equal_in_boolDeclaration581 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_boolExpression_in_boolDeclaration584 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration586 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_boolDeclaration592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_boolExpression611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeInt_in_intDeclaration625 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration627 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_Equal_in_intDeclaration631 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_intExpression_in_intDeclaration634 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration636 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_intDeclaration642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_intExpression651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeFloat_in_floatDeclaration882 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration884 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_Equal_in_floatDeclaration888 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_floatExpression_in_floatDeclaration891 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration893 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_floatDeclaration899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_floatExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeString_in_stringDeclaration1044 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1046 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_Equal_in_stringDeclaration1049 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_stringExpression_in_stringDeclaration1052 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1056 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_stringDeclaration1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_stringExpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_arrayDeclaration1251 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1253 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_Equal_in_arrayDeclaration1257 = new BitSet(new long[]{0x0000020400400000L});
    public static final BitSet FOLLOW_array_in_arrayDeclaration1260 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1262 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Semicolon_in_arrayDeclaration1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBrace_in_array1277 = new BitSet(new long[]{0x0000020620484040L});
    public static final BitSet FOLLOW_array_content_in_array1279 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RightSquareBrace_in_array1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_array1288 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_array1290 = new BitSet(new long[]{0x0000020610484040L});
    public static final BitSet FOLLOW_array_content_in_array1292 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_array1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_key_in_array_content1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1310 = new BitSet(new long[]{0x0000000600484040L});
    public static final BitSet FOLLOW_array_value_in_array_content1314 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_Comma_in_array_content1318 = new BitSet(new long[]{0x0000020600484040L});
    public static final BitSet FOLLOW_array_key_in_array_content1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1323 = new BitSet(new long[]{0x0000000600484040L});
    public static final BitSet FOLLOW_array_value_in_array_content1327 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expressions_in_array_key1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_array_key1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intExpression_in_expressions1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpression_in_expressions1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpression_in_expressions1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatExpression_in_expressions1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressions_in_array_value1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_array_value1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_synpred11_TSPHP438 = new BitSet(new long[]{0x000001FC00140000L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_synpred11_TSPHP440 = new BitSet(new long[]{0x0000000000000002L});

}