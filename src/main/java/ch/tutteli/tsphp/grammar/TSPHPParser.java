// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-26 13:29:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arrow", "As", "BINARY", "Bool", "Break", "Case", "Colon", "Comma", "Comment", "Continue", "DECIMAL", "Default", "DivideEqual", "Do", "Dolar", "DotEqual", "EXPONENT", "Else", "Equal", "Float", "For", "Foreach", "Function", "HEXADECIMAL", "Identifier", "If", "Int", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LogicAndEqual", "LogicOrEqual", "LogicXorEqual", "MinusEqual", "MinusMinus", "ModuloEqual", "MultiplyEqual", "Namespace", "NamespaceId", "OCTAL", "PlusEqual", "PlusPlus", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeftEqual", "ShiftRightEqual", "String", "Switch", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeResource", "TypeString", "VariableId", "While", "Whitespace", "'void'"
    };

    public static final int EOF=-1;
    public static final int T__67=67;
    public static final int Arrow=4;
    public static final int As=5;
    public static final int BINARY=6;
    public static final int Bool=7;
    public static final int Break=8;
    public static final int Case=9;
    public static final int Colon=10;
    public static final int Comma=11;
    public static final int Comment=12;
    public static final int Continue=13;
    public static final int DECIMAL=14;
    public static final int Default=15;
    public static final int DivideEqual=16;
    public static final int Do=17;
    public static final int Dolar=18;
    public static final int DotEqual=19;
    public static final int EXPONENT=20;
    public static final int Else=21;
    public static final int Equal=22;
    public static final int Float=23;
    public static final int For=24;
    public static final int Foreach=25;
    public static final int Function=26;
    public static final int HEXADECIMAL=27;
    public static final int Identifier=28;
    public static final int If=29;
    public static final int Int=30;
    public static final int LeftCurlyBrace=31;
    public static final int LeftParanthesis=32;
    public static final int LeftSquareBrace=33;
    public static final int LogicAndEqual=34;
    public static final int LogicOrEqual=35;
    public static final int LogicXorEqual=36;
    public static final int MinusEqual=37;
    public static final int MinusMinus=38;
    public static final int ModuloEqual=39;
    public static final int MultiplyEqual=40;
    public static final int Namespace=41;
    public static final int NamespaceId=42;
    public static final int OCTAL=43;
    public static final int PlusEqual=44;
    public static final int PlusPlus=45;
    public static final int Return=46;
    public static final int RightCurlyBrace=47;
    public static final int RightParanthesis=48;
    public static final int RightSquareBrace=49;
    public static final int STRING_DOUBLE_QUOTED=50;
    public static final int STRING_SINGLE_QUOTED=51;
    public static final int Semicolon=52;
    public static final int ShiftLeftEqual=53;
    public static final int ShiftRightEqual=54;
    public static final int String=55;
    public static final int Switch=56;
    public static final int TypeArray=57;
    public static final int TypeBool=58;
    public static final int TypeBoolean=59;
    public static final int TypeFloat=60;
    public static final int TypeInt=61;
    public static final int TypeResource=62;
    public static final int TypeString=63;
    public static final int VariableId=64;
    public static final int While=65;
    public static final int Whitespace=66;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
    public final void prog() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
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
            else if ( (LA3_0==Do||(LA3_0 >= For && LA3_0 <= Function)||LA3_0==If||LA3_0==LeftCurlyBrace||LA3_0==MinusMinus||(LA3_0 >= PlusPlus && LA3_0 <= Return)||(LA3_0 >= Switch && LA3_0 <= While)) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:8: ( namespaceSemicolon )+ EOF
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:8: ( namespaceSemicolon )+
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
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:8: namespaceSemicolon
                    	    {
                    	    pushFollow(FOLLOW_namespaceSemicolon_in_prog425);
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


                    match(input,EOF,FOLLOW_EOF_in_prog428); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:4: ( namespaceBracket )+ EOF
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:4: ( namespaceBracket )+
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
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:4: namespaceBracket
                    	    {
                    	    pushFollow(FOLLOW_namespaceBracket_in_prog433);
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


                    match(input,EOF,FOLLOW_EOF_in_prog436); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:116:4: withoutNamespace EOF
                    {
                    pushFollow(FOLLOW_withoutNamespace_in_prog441);
                    withoutNamespace();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EOF,FOLLOW_EOF_in_prog443); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:1: namespaceSemicolon : ( 'namespace' NamespaceId ';' ( statement )+ ) ;
    public final void namespaceSemicolon() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:2: ( ( 'namespace' NamespaceId ';' ( statement )+ ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:4: ( 'namespace' NamespaceId ';' ( statement )+ )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:4: ( 'namespace' NamespaceId ';' ( statement )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:5: 'namespace' NamespaceId ';' ( statement )+
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon456); if (state.failed) return ;

            match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceSemicolon458); if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon460); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:33: ( statement )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Do||(LA4_0 >= For && LA4_0 <= Function)||LA4_0==If||LA4_0==LeftCurlyBrace||LA4_0==MinusMinus||(LA4_0 >= PlusPlus && LA4_0 <= Return)||(LA4_0 >= Switch && LA4_0 <= While)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:33: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_namespaceSemicolon462);
            	    statement();

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:1: namespaceBracket : ( 'namespace' ( NamespaceId )? '{' ( statement )+ '}' ) ;
    public final void namespaceBracket() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:2: ( ( 'namespace' ( NamespaceId )? '{' ( statement )+ '}' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:4: ( 'namespace' ( NamespaceId )? '{' ( statement )+ '}' )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:4: ( 'namespace' ( NamespaceId )? '{' ( statement )+ '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:5: 'namespace' ( NamespaceId )? '{' ( statement )+ '}'
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket475); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:17: ( NamespaceId )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NamespaceId) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:17: NamespaceId
                    {
                    match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceBracket477); if (state.failed) return ;

                    }
                    break;

            }


            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket480); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:34: ( statement )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Do||(LA6_0 >= For && LA6_0 <= Function)||LA6_0==If||LA6_0==LeftCurlyBrace||LA6_0==MinusMinus||(LA6_0 >= PlusPlus && LA6_0 <= Return)||(LA6_0 >= Switch && LA6_0 <= While)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:34: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_namespaceBracket482);
            	    statement();

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


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket485); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:1: withoutNamespace : ( statement )+ ;
    public final void withoutNamespace() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:2: ( ( statement )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: ( statement )+
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: ( statement )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Do||(LA7_0 >= For && LA7_0 <= Function)||LA7_0==If||LA7_0==LeftCurlyBrace||LA7_0==MinusMinus||(LA7_0 >= PlusPlus && LA7_0 <= Return)||(LA7_0 >= Switch && LA7_0 <= While)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_withoutNamespace567);
            	    statement();

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



    // $ANTLR start "statement"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:1: statement : ( definition | instructionWithoutBreakContinue );
    public final void statement() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:2: ( definition | instructionWithoutBreakContinue )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Function) ) {
                alt8=1;
            }
            else if ( (LA8_0==Do||(LA8_0 >= For && LA8_0 <= Foreach)||LA8_0==If||LA8_0==LeftCurlyBrace||LA8_0==MinusMinus||(LA8_0 >= PlusPlus && LA8_0 <= Return)||(LA8_0 >= Switch && LA8_0 <= While)) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:138:4: definition
                    {
                    pushFollow(FOLLOW_definition_in_statement578);
                    definition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:139:4: instructionWithoutBreakContinue
                    {
                    pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement583);
                    instructionWithoutBreakContinue();

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
    // $ANTLR end "statement"



    // $ANTLR start "definition"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:142:1: definition : functionDeclaration ;
    public final void definition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:2: ( functionDeclaration )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:4: functionDeclaration
            {
            pushFollow(FOLLOW_functionDeclaration_in_definition594);
            functionDeclaration();

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
    // $ANTLR end "definition"



    // $ANTLR start "functionDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:146:1: functionDeclaration : 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' ;
    public final void functionDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:2: ( 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:4: 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}'
            {
            match(input,Function,FOLLOW_Function_in_functionDeclaration608); if (state.failed) return ;

            pushFollow(FOLLOW_returnType_in_functionDeclaration610);
            returnType();

            state._fsp--;
            if (state.failed) return ;

            match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration612); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclaration614); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:41: ( paramList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= TypeArray && LA9_0 <= TypeString)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:41: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDeclaration616);
                    paramList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclaration619); if (state.failed) return ;

            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration621); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:60: ( instructionWithoutBreakContinue )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Do||(LA10_0 >= For && LA10_0 <= Foreach)||LA10_0==If||LA10_0==LeftCurlyBrace||LA10_0==MinusMinus||(LA10_0 >= PlusPlus && LA10_0 <= Return)||(LA10_0 >= Switch && LA10_0 <= While)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:147:60: instructionWithoutBreakContinue
            	    {
            	    pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration623);
            	    instructionWithoutBreakContinue();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration626); if (state.failed) return ;

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
    // $ANTLR end "functionDeclaration"



    // $ANTLR start "returnType"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:1: returnType : ( primitiveTypes | 'void' );
    public final void returnType() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:2: ( primitiveTypes | 'void' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= TypeArray && LA11_0 <= TypeString)) ) {
                alt11=1;
            }
            else if ( (LA11_0==67) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:4: primitiveTypes
                    {
                    pushFollow(FOLLOW_primitiveTypes_in_returnType636);
                    primitiveTypes();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:21: 'void'
                    {
                    match(input,67,FOLLOW_67_in_returnType640); if (state.failed) return ;

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
    // $ANTLR end "returnType"



    // $ANTLR start "primitiveTypes"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:152:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeResource );
    public final void primitiveTypes() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:153:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeResource )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( (input.LA(1) >= TypeArray && input.LA(1) <= TypeString) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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



    // $ANTLR start "paramList"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:1: paramList : paramDeclaration ( ',' paramDeclaration )* ;
    public final void paramList() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:2: ( paramDeclaration ( ',' paramDeclaration )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:5: paramDeclaration ( ',' paramDeclaration )*
            {
            pushFollow(FOLLOW_paramDeclaration_in_paramList692);
            paramDeclaration();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:22: ( ',' paramDeclaration )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:23: ',' paramDeclaration
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_paramList695); if (state.failed) return ;

            	    pushFollow(FOLLOW_paramDeclaration_in_paramList697);
            	    paramDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "paramList"



    // $ANTLR start "paramDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:1: paramDeclaration : primitiveTypes VariableId ( '=' expressionInclArrayExpression )? ;
    public final void paramDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:2: ( primitiveTypes VariableId ( '=' expressionInclArrayExpression )? )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:4: primitiveTypes VariableId ( '=' expressionInclArrayExpression )?
            {
            pushFollow(FOLLOW_primitiveTypes_in_paramDeclaration709);
            primitiveTypes();

            state._fsp--;
            if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration711); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:30: ( '=' expressionInclArrayExpression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Equal) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:31: '=' expressionInclArrayExpression
                    {
                    match(input,Equal,FOLLOW_Equal_in_paramDeclaration714); if (state.failed) return ;

                    pushFollow(FOLLOW_expressionInclArrayExpression_in_paramDeclaration716);
                    expressionInclArrayExpression();

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
    // $ANTLR end "paramDeclaration"



    // $ANTLR start "instructionWithoutBreakContinue"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
    public final void instructionWithoutBreakContinue() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBrace) ) {
                alt15=1;
            }
            else if ( (LA15_0==Do||(LA15_0 >= For && LA15_0 <= Foreach)||LA15_0==If||LA15_0==MinusMinus||(LA15_0 >= PlusPlus && LA15_0 <= Return)||(LA15_0 >= Switch && LA15_0 <= While)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: '{' ( instructionWithoutBreakContinue )+ '}'
                    {
                    match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue729); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:8: ( instructionWithoutBreakContinue )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Do||(LA14_0 >= For && LA14_0 <= Foreach)||LA14_0==If||LA14_0==LeftCurlyBrace||LA14_0==MinusMinus||(LA14_0 >= PlusPlus && LA14_0 <= Return)||(LA14_0 >= Switch && LA14_0 <= While)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:8: instructionWithoutBreakContinue
                    	    {
                    	    pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue731);
                    	    instructionWithoutBreakContinue();

                    	    state._fsp--;
                    	    if (state.failed) return ;

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


                    match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue735); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:4: instruction
                    {
                    pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue740);
                    instruction();

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
    // $ANTLR end "instructionWithoutBreakContinue"



    // $ANTLR start "instructionInclBreakContinue"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
    public final void instructionInclBreakContinue() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case LeftCurlyBrace:
                {
                alt18=1;
                }
                break;
            case Do:
            case For:
            case Foreach:
            case If:
            case MinusMinus:
            case PlusPlus:
            case Return:
            case Switch:
            case TypeArray:
            case TypeBool:
            case TypeBoolean:
            case TypeFloat:
            case TypeInt:
            case TypeResource:
            case TypeString:
            case VariableId:
            case While:
                {
                alt18=2;
                }
                break;
            case Break:
            case Continue:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: '{' ( instructionInclBreakContinue )+ '}'
                    {
                    match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue751); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:8: ( instructionInclBreakContinue )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Break||LA16_0==Continue||LA16_0==Do||(LA16_0 >= For && LA16_0 <= Foreach)||LA16_0==If||LA16_0==LeftCurlyBrace||LA16_0==MinusMinus||(LA16_0 >= PlusPlus && LA16_0 <= Return)||(LA16_0 >= Switch && LA16_0 <= While)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:8: instructionInclBreakContinue
                    	    {
                    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue753);
                    	    instructionInclBreakContinue();

                    	    state._fsp--;
                    	    if (state.failed) return ;

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


                    match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue757); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:4: instruction
                    {
                    pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue762);
                    instruction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:4: ( 'break' | 'continue' ) ( Int )? ';'
                    {
                    if ( input.LA(1)==Break||input.LA(1)==Continue ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:25: ( Int )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Int) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:25: Int
                            {
                            match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue773); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue776); if (state.failed) return ;

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
    // $ANTLR end "instructionInclBreakContinue"



    // $ANTLR start "instruction"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:1: instruction : ( variableAssignment | variableDeclaration | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expressionInclArrayExpression )? ';' );
    public final void instruction() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:2: ( variableAssignment | variableDeclaration | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expressionInclArrayExpression )? ';' )
            int alt20=9;
            switch ( input.LA(1) ) {
            case MinusMinus:
            case PlusPlus:
            case VariableId:
                {
                alt20=1;
                }
                break;
            case TypeArray:
            case TypeBool:
            case TypeBoolean:
            case TypeFloat:
            case TypeInt:
            case TypeResource:
            case TypeString:
                {
                alt20=2;
                }
                break;
            case If:
                {
                alt20=3;
                }
                break;
            case Switch:
                {
                alt20=4;
                }
                break;
            case For:
                {
                alt20=5;
                }
                break;
            case Foreach:
                {
                alt20=6;
                }
                break;
            case While:
                {
                alt20=7;
                }
                break;
            case Do:
                {
                alt20=8;
                }
                break;
            case Return:
                {
                alt20=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction788);
                    variableAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:4: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_instruction793);
                    variableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ifCondition
                    {
                    pushFollow(FOLLOW_ifCondition_in_instruction798);
                    ifCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: switchCondition
                    {
                    pushFollow(FOLLOW_switchCondition_in_instruction803);
                    switchCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: forLoop
                    {
                    pushFollow(FOLLOW_forLoop_in_instruction808);
                    forLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: foreachLoop
                    {
                    pushFollow(FOLLOW_foreachLoop_in_instruction813);
                    foreachLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:4: whileLoop
                    {
                    pushFollow(FOLLOW_whileLoop_in_instruction818);
                    whileLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:4: doWhileLoop
                    {
                    pushFollow(FOLLOW_doWhileLoop_in_instruction823);
                    doWhileLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:4: 'return' ( expressionInclArrayExpression )? ';'
                    {
                    match(input,Return,FOLLOW_Return_in_instruction828); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:13: ( expressionInclArrayExpression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Bool||LA19_0==Float||LA19_0==Int||LA19_0==LeftSquareBrace||LA19_0==String||LA19_0==TypeArray) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:13: expressionInclArrayExpression
                            {
                            pushFollow(FOLLOW_expressionInclArrayExpression_in_instruction830);
                            expressionInclArrayExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_instruction833); if (state.failed) return ;

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



    // $ANTLR start "variableAssignment"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:1: variableAssignment : varAssignmentWithoutSemicolon ';' ;
    public final void variableAssignment() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:2: ( varAssignmentWithoutSemicolon ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: varAssignmentWithoutSemicolon ';'
            {
            pushFollow(FOLLOW_varAssignmentWithoutSemicolon_in_variableAssignment844);
            varAssignmentWithoutSemicolon();

            state._fsp--;
            if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_variableAssignment846); if (state.failed) return ;

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
    // $ANTLR end "variableAssignment"



    // $ANTLR start "varAssignmentWithoutSemicolon"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:1: varAssignmentWithoutSemicolon : ( VariableId assignmentOperator ( expressionInclArrayExpression | VariableId ) | incrementDecrement VariableId | VariableId incrementDecrement );
    public final void varAssignmentWithoutSemicolon() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:2: ( VariableId assignmentOperator ( expressionInclArrayExpression | VariableId ) | incrementDecrement VariableId | VariableId incrementDecrement )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VariableId) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DivideEqual||LA22_1==DotEqual||LA22_1==Equal||(LA22_1 >= LogicAndEqual && LA22_1 <= MinusEqual)||(LA22_1 >= ModuloEqual && LA22_1 <= MultiplyEqual)||LA22_1==PlusEqual||(LA22_1 >= ShiftLeftEqual && LA22_1 <= ShiftRightEqual)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==MinusMinus||LA22_1==PlusPlus) ) {
                    alt22=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA22_0==MinusMinus||LA22_0==PlusPlus) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:4: VariableId assignmentOperator ( expressionInclArrayExpression | VariableId )
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon857); if (state.failed) return ;

                    pushFollow(FOLLOW_assignmentOperator_in_varAssignmentWithoutSemicolon859);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:34: ( expressionInclArrayExpression | VariableId )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Bool||LA21_0==Float||LA21_0==Int||LA21_0==LeftSquareBrace||LA21_0==String||LA21_0==TypeArray) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==VariableId) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:35: expressionInclArrayExpression
                            {
                            pushFollow(FOLLOW_expressionInclArrayExpression_in_varAssignmentWithoutSemicolon862);
                            expressionInclArrayExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:67: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon866); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: incrementDecrement VariableId
                    {
                    pushFollow(FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon873);
                    incrementDecrement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon875); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: VariableId incrementDecrement
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon880); if (state.failed) return ;

                    pushFollow(FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon882);
                    incrementDecrement();

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
    // $ANTLR end "varAssignmentWithoutSemicolon"



    // $ANTLR start "assignmentOperator"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
    public final void assignmentOperator() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==Equal||(input.LA(1) >= LogicAndEqual && input.LA(1) <= MinusEqual)||(input.LA(1) >= ModuloEqual && input.LA(1) <= MultiplyEqual)||input.LA(1)==PlusEqual||(input.LA(1) >= ShiftLeftEqual && input.LA(1) <= ShiftRightEqual) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "incrementDecrement"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:1: incrementDecrement : ( '++' | '--' );
    public final void incrementDecrement() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:2: ( '++' | '--' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
            {
            if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // $ANTLR end "incrementDecrement"



    // $ANTLR start "expressionInclArrayExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:1: expressionInclArrayExpression : ( expressionWithoutArrayExpression | arrayExpression );
    public final void expressionInclArrayExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:2: ( expressionWithoutArrayExpression | arrayExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Bool||LA23_0==Float||LA23_0==Int||LA23_0==String) ) {
                alt23=1;
            }
            else if ( (LA23_0==LeftSquareBrace||LA23_0==TypeArray) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:4: expressionWithoutArrayExpression
                    {
                    pushFollow(FOLLOW_expressionWithoutArrayExpression_in_expressionInclArrayExpression976);
                    expressionWithoutArrayExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:37: arrayExpression
                    {
                    pushFollow(FOLLOW_arrayExpression_in_expressionInclArrayExpression978);
                    arrayExpression();

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
    // $ANTLR end "expressionInclArrayExpression"



    // $ANTLR start "expressionWithoutArrayExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:1: expressionWithoutArrayExpression : ( intExpression | stringExpression | boolExpression | floatExpression );
    public final void expressionWithoutArrayExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:2: ( intExpression | stringExpression | boolExpression | floatExpression )
            int alt24=4;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt24=1;
                }
                break;
            case String:
                {
                alt24=2;
                }
                break;
            case Bool:
                {
                alt24=3;
                }
                break;
            case Float:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: intExpression
                    {
                    pushFollow(FOLLOW_intExpression_in_expressionWithoutArrayExpression988);
                    intExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: stringExpression
                    {
                    pushFollow(FOLLOW_stringExpression_in_expressionWithoutArrayExpression993);
                    stringExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_expressionWithoutArrayExpression998);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:4: floatExpression
                    {
                    pushFollow(FOLLOW_floatExpression_in_expressionWithoutArrayExpression1003);
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
    // $ANTLR end "expressionWithoutArrayExpression"



    // $ANTLR start "variableDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: variableDeclaration : ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' );
    public final void variableDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case TypeArray:
                {
                alt25=1;
                }
                break;
            case TypeBool:
            case TypeBoolean:
                {
                alt25=2;
                }
                break;
            case TypeInt:
                {
                alt25=3;
                }
                break;
            case TypeFloat:
                {
                alt25=4;
                }
                break;
            case TypeString:
                {
                alt25=5;
                }
                break;
            case TypeResource:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_variableDeclaration1017);
                    arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: boolDeclaration
                    {
                    pushFollow(FOLLOW_boolDeclaration_in_variableDeclaration1022);
                    boolDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: intDeclaration
                    {
                    pushFollow(FOLLOW_intDeclaration_in_variableDeclaration1028);
                    intDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: floatDeclaration
                    {
                    pushFollow(FOLLOW_floatDeclaration_in_variableDeclaration1034);
                    floatDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:4: stringDeclaration
                    {
                    pushFollow(FOLLOW_stringDeclaration_in_variableDeclaration1039);
                    stringDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: TypeResource VariableId ';'
                    {
                    match(input,TypeResource,FOLLOW_TypeResource_in_variableDeclaration1044); if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1046); if (state.failed) return ;

                    match(input,Semicolon,FOLLOW_Semicolon_in_variableDeclaration1048); if (state.failed) return ;

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
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "boolDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:1: boolDeclaration : ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' ;
    public final void boolDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:2: ( ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';'
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


            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration1067); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:38: ( '=' ( boolExpression | VariableId ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Equal) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:40: '=' ( boolExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_boolDeclaration1071); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:44: ( boolExpression | VariableId )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Bool) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==VariableId) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:45: boolExpression
                            {
                            pushFollow(FOLLOW_boolExpression_in_boolDeclaration1074);
                            boolExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:60: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration1076); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_boolDeclaration1082); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: boolExpression : Bool ;
    public final void boolExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( Bool )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: Bool
            {
            match(input,Bool,FOLLOW_Bool_in_boolExpression1101); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:1: intDeclaration : TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' ;
    public final void intDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:2: ( TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';'
            {
            match(input,TypeInt,FOLLOW_TypeInt_in_intDeclaration1115); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration1117); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:23: ( '=' ( intExpression | VariableId ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Equal) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:25: '=' ( intExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_intDeclaration1121); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:29: ( intExpression | VariableId )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==Int) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==VariableId) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:30: intExpression
                            {
                            pushFollow(FOLLOW_intExpression_in_intDeclaration1124);
                            intExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:44: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration1126); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_intDeclaration1132); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: intExpression : Int ;
    public final void intExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:2: ( Int )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:4: Int
            {
            match(input,Int,FOLLOW_Int_in_intExpression1141); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:1: floatDeclaration : TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' ;
    public final void floatDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:2: ( TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';'
            {
            match(input,TypeFloat,FOLLOW_TypeFloat_in_floatDeclaration1373); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration1375); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:25: ( '=' ( floatExpression | VariableId ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Equal) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:27: '=' ( floatExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_floatDeclaration1379); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:31: ( floatExpression | VariableId )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==Float) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:32: floatExpression
                            {
                            pushFollow(FOLLOW_floatExpression_in_floatDeclaration1382);
                            floatExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:48: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration1384); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_floatDeclaration1390); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:1: floatExpression : Float ;
    public final void floatExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:2: ( Float )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: Float
            {
            match(input,Float,FOLLOW_Float_in_floatExpression1399); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:1: stringDeclaration : TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' ;
    public final void stringDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:2: ( TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:4: TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';'
            {
            match(input,TypeString,FOLLOW_TypeString_in_stringDeclaration1535); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1537); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:26: ( '=' ( stringExpression | VariableId ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Equal) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:27: '=' ( stringExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_stringDeclaration1540); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:31: ( stringExpression | VariableId )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==String) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==VariableId) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:32: stringExpression
                            {
                            pushFollow(FOLLOW_stringExpression_in_stringDeclaration1543);
                            stringExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:51: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1547); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_stringDeclaration1553); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:1: stringExpression : String ;
    public final void stringExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:2: ( String )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: String
            {
            match(input,String,FOLLOW_String_in_stringExpression1562); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: arrayDeclaration : TypeArray VariableId ( '=' ( arrayExpression | VariableId ) )? ';' ;
    public final void arrayDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:2: ( TypeArray VariableId ( '=' ( arrayExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: TypeArray VariableId ( '=' ( arrayExpression | VariableId ) )? ';'
            {
            match(input,TypeArray,FOLLOW_TypeArray_in_arrayDeclaration1728); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1730); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:25: ( '=' ( arrayExpression | VariableId ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Equal) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:27: '=' ( arrayExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_arrayDeclaration1734); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:31: ( arrayExpression | VariableId )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LeftSquareBrace||LA34_0==TypeArray) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==VariableId) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:32: arrayExpression
                            {
                            pushFollow(FOLLOW_arrayExpression_in_arrayDeclaration1737);
                            arrayExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:48: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1739); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_arrayDeclaration1745); if (state.failed) return ;

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



    // $ANTLR start "arrayExpression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:1: arrayExpression : array ;
    public final void arrayExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:2: ( array )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:4: array
            {
            pushFollow(FOLLOW_array_in_arrayExpression1755);
            array();

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
    // $ANTLR end "arrayExpression"



    // $ANTLR start "array"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
    public final void array() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LeftSquareBrace) ) {
                alt38=1;
            }
            else if ( (LA38_0==TypeArray) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:9: '[' ( array_content )? ']'
                    {
                    match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array1768); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:13: ( array_content )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==Bool||LA36_0==Float||LA36_0==Int||LA36_0==LeftSquareBrace||LA36_0==String||LA36_0==TypeArray||LA36_0==VariableId) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:13: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1770);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array1773); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:4: TypeArray '(' ( array_content )? ')'
                    {
                    match(input,TypeArray,FOLLOW_TypeArray_in_array1779); if (state.failed) return ;

                    match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array1781); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:18: ( array_content )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==Bool||LA37_0==Float||LA37_0==Int||LA37_0==LeftSquareBrace||LA37_0==String||LA37_0==TypeArray||LA37_0==VariableId) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:18: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1783);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array1786); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:1: array_content : ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* ;
    public final void array_content() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:2: ( ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )*
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: ( array_key '=>' )?
            int alt39=2;
            switch ( input.LA(1) ) {
                case Int:
                    {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==Arrow) ) {
                        alt39=1;
                    }
                    }
                    break;
                case String:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==Arrow) ) {
                        alt39=1;
                    }
                    }
                    break;
                case Bool:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3==Arrow) ) {
                        alt39=1;
                    }
                    }
                    break;
                case Float:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (LA39_4==Arrow) ) {
                        alt39=1;
                    }
                    }
                    break;
                case VariableId:
                    {
                    alt39=1;
                    }
                    break;
            }

            switch (alt39) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:5: array_key '=>'
                    {
                    pushFollow(FOLLOW_array_key_in_array_content1799);
                    array_key();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,Arrow,FOLLOW_Arrow_in_array_content1801); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_array_value_in_array_content1805);
            array_value();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:35: ( ',' ( array_key '=>' )? array_value )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:36: ',' ( array_key '=>' )? array_value
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_array_content1809); if (state.failed) return ;

            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:40: ( array_key '=>' )?
            	    int alt40=2;
            	    switch ( input.LA(1) ) {
            	        case Int:
            	            {
            	            int LA40_1 = input.LA(2);

            	            if ( (LA40_1==Arrow) ) {
            	                alt40=1;
            	            }
            	            }
            	            break;
            	        case String:
            	            {
            	            int LA40_2 = input.LA(2);

            	            if ( (LA40_2==Arrow) ) {
            	                alt40=1;
            	            }
            	            }
            	            break;
            	        case Bool:
            	            {
            	            int LA40_3 = input.LA(2);

            	            if ( (LA40_3==Arrow) ) {
            	                alt40=1;
            	            }
            	            }
            	            break;
            	        case Float:
            	            {
            	            int LA40_4 = input.LA(2);

            	            if ( (LA40_4==Arrow) ) {
            	                alt40=1;
            	            }
            	            }
            	            break;
            	        case VariableId:
            	            {
            	            alt40=1;
            	            }
            	            break;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:41: array_key '=>'
            	            {
            	            pushFollow(FOLLOW_array_key_in_array_content1812);
            	            array_key();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            match(input,Arrow,FOLLOW_Arrow_in_array_content1814); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_array_value_in_array_content1818);
            	    array_value();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:1: array_key : ( expressionWithoutArrayExpression | VariableId );
    public final void array_key() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:2: ( expressionWithoutArrayExpression | VariableId )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Bool||LA42_0==Float||LA42_0==Int||LA42_0==String) ) {
                alt42=1;
            }
            else if ( (LA42_0==VariableId) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: expressionWithoutArrayExpression
                    {
                    pushFollow(FOLLOW_expressionWithoutArrayExpression_in_array_key1829);
                    expressionWithoutArrayExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:37: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_array_key1831); if (state.failed) return ;

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



    // $ANTLR start "array_value"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:1: array_value options {backtrack=true; } : expressionInclArrayExpression ;
    public final void array_value() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:2: ( expressionInclArrayExpression )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: expressionInclArrayExpression
            {
            pushFollow(FOLLOW_expressionInclArrayExpression_in_array_value1851);
            expressionInclArrayExpression();

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
    // $ANTLR end "array_value"



    // $ANTLR start "ifCondition"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: ifCondition : 'if' '(' ( boolExpression | VariableId ) ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? ;
    public final void ifCondition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( 'if' '(' ( boolExpression | VariableId ) ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: 'if' '(' ( boolExpression | VariableId ) ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )?
            {
            match(input,If,FOLLOW_If_in_ifCondition1861); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition1863); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:13: ( boolExpression | VariableId )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Bool) ) {
                alt43=1;
            }
            else if ( (LA43_0==VariableId) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:14: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_ifCondition1866);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:31: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_ifCondition1870); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition1873); if (state.failed) return ;

            pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition1875);
            instructionWithoutBreakContinue();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:3: ( 'else' instructionWithoutBreakContinue )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Else) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred80_TSPHP()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:5: 'else' instructionWithoutBreakContinue
                    {
                    match(input,Else,FOLLOW_Else_in_ifCondition1882); if (state.failed) return ;

                    pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition1884);
                    instructionWithoutBreakContinue();

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
    // $ANTLR end "ifCondition"



    // $ANTLR start "forLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:1: forLoop : 'for' '(' ( ( variableDeclaration | variableAssignment ) | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue ;
    public final void forLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:9: ( 'for' '(' ( ( variableDeclaration | variableAssignment ) | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:11: 'for' '(' ( ( variableDeclaration | variableAssignment ) | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue
            {
            match(input,For,FOLLOW_For_in_forLoop1899); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop1901); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:21: ( ( variableDeclaration | variableAssignment ) | ';' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==MinusMinus||LA46_0==PlusPlus||(LA46_0 >= TypeArray && LA46_0 <= VariableId)) ) {
                alt46=1;
            }
            else if ( (LA46_0==Semicolon) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:22: ( variableDeclaration | variableAssignment )
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:22: ( variableDeclaration | variableAssignment )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0 >= TypeArray && LA45_0 <= TypeString)) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==MinusMinus||LA45_0==PlusPlus||LA45_0==VariableId) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:23: variableDeclaration
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_forLoop1905);
                            variableDeclaration();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:43: variableAssignment
                            {
                            pushFollow(FOLLOW_variableAssignment_in_forLoop1907);
                            variableAssignment();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:63: ';'
                    {
                    match(input,Semicolon,FOLLOW_Semicolon_in_forLoop1910); if (state.failed) return ;

                    }
                    break;

            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:69: ( boolExpression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Bool) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:69: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_forLoop1914);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_forLoop1917); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:89: ( varAssignmentWithoutSemicolon )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==MinusMinus||LA48_0==PlusPlus||LA48_0==VariableId) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:89: varAssignmentWithoutSemicolon
                    {
                    pushFollow(FOLLOW_varAssignmentWithoutSemicolon_in_forLoop1919);
                    varAssignmentWithoutSemicolon();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop1922); if (state.failed) return ;

            pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop1924);
            instructionInclBreakContinue();

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
    // $ANTLR end "forLoop"



    // $ANTLR start "foreachLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
    public final void foreachLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
            {
            match(input,Foreach,FOLLOW_Foreach_in_foreachLoop1933); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop1935); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:18: ( VariableId | array )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==VariableId) ) {
                alt49=1;
            }
            else if ( (LA49_0==LeftSquareBrace||LA49_0==TypeArray) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:19: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1938); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:30: array
                    {
                    pushFollow(FOLLOW_array_in_foreachLoop1940);
                    array();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,As,FOLLOW_As_in_foreachLoop1943); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1945); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:53: ( '=>' VariableId )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Arrow) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:54: '=>' VariableId
                    {
                    match(input,Arrow,FOLLOW_Arrow_in_foreachLoop1948); if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1950); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop1954); if (state.failed) return ;

            pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop1956);
            instructionInclBreakContinue();

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
    // $ANTLR end "foreachLoop"



    // $ANTLR start "whileLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:1: whileLoop : 'while' '(' boolExpression ')' instructionInclBreakContinue ;
    public final void whileLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:2: ( 'while' '(' boolExpression ')' instructionInclBreakContinue )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: 'while' '(' boolExpression ')' instructionInclBreakContinue
            {
            match(input,While,FOLLOW_While_in_whileLoop1965); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop1967); if (state.failed) return ;

            pushFollow(FOLLOW_boolExpression_in_whileLoop1969);
            boolExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop1971); if (state.failed) return ;

            pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop1973);
            instructionInclBreakContinue();

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
    // $ANTLR end "whileLoop"



    // $ANTLR start "doWhileLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' boolExpression ')' ';' ;
    public final void doWhileLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:2: ( 'do' instructionInclBreakContinue 'while' '(' boolExpression ')' ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: 'do' instructionInclBreakContinue 'while' '(' boolExpression ')' ';'
            {
            match(input,Do,FOLLOW_Do_in_doWhileLoop1983); if (state.failed) return ;

            pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop1985);
            instructionInclBreakContinue();

            state._fsp--;
            if (state.failed) return ;

            match(input,While,FOLLOW_While_in_doWhileLoop1987); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop1989); if (state.failed) return ;

            pushFollow(FOLLOW_boolExpression_in_doWhileLoop1991);
            boolExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop1993); if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop1995); if (state.failed) return ;

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
    // $ANTLR end "doWhileLoop"



    // $ANTLR start "switchCondition"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
    public final void switchCondition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
            {
            match(input,Switch,FOLLOW_Switch_in_switchCondition2005); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition2007); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_switchCondition2009); if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition2011); if (state.failed) return ;

            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition2013); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Case) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred94_TSPHP()) ) {
                    alt63=1;
                }
                else if ( (true) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Case) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: ( caseLabel )+ ( instructionInclBreakContinue )+
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: ( caseLabel )+
                    	    int cnt51=0;
                    	    loop51:
                    	    do {
                    	        int alt51=2;
                    	        int LA51_0 = input.LA(1);

                    	        if ( (LA51_0==Case) ) {
                    	            alt51=1;
                    	        }


                    	        switch (alt51) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition2024);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt51 >= 1 ) break loop51;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(51, input);
                    	                throw eee;
                    	        }
                    	        cnt51++;
                    	    } while (true);


                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: ( instructionInclBreakContinue )+
                    	    int cnt52=0;
                    	    loop52:
                    	    do {
                    	        int alt52=2;
                    	        int LA52_0 = input.LA(1);

                    	        if ( (LA52_0==Break||LA52_0==Continue||LA52_0==Do||(LA52_0 >= For && LA52_0 <= Foreach)||LA52_0==If||LA52_0==LeftCurlyBrace||LA52_0==MinusMinus||(LA52_0 >= PlusPlus && LA52_0 <= Return)||(LA52_0 >= Switch && LA52_0 <= While)) ) {
                    	            alt52=1;
                    	        }


                    	        switch (alt52) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: instructionInclBreakContinue
                    	    	    {
                    	    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2027);
                    	    	    instructionInclBreakContinue();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt52 >= 1 ) break loop52;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(52, input);
                    	                throw eee;
                    	        }
                    	        cnt52++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    pushFollow(FOLLOW_defaultLabel_in_switchCondition2032);
                    defaultLabel();

                    state._fsp--;
                    if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:61: ( instructionInclBreakContinue )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==Break||LA54_0==Continue||LA54_0==Do||(LA54_0 >= For && LA54_0 <= Foreach)||LA54_0==If||LA54_0==LeftCurlyBrace||LA54_0==MinusMinus||(LA54_0 >= PlusPlus && LA54_0 <= Return)||(LA54_0 >= Switch && LA54_0 <= While)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:61: instructionInclBreakContinue
                    	    {
                    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2034);
                    	    instructionInclBreakContinue();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==Case) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: ( caseLabel )+ ( instructionInclBreakContinue )+
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: ( caseLabel )+
                    	    int cnt55=0;
                    	    loop55:
                    	    do {
                    	        int alt55=2;
                    	        int LA55_0 = input.LA(1);

                    	        if ( (LA55_0==Case) ) {
                    	            alt55=1;
                    	        }


                    	        switch (alt55) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition2038);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt55 >= 1 ) break loop55;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(55, input);
                    	                throw eee;
                    	        }
                    	        cnt55++;
                    	    } while (true);


                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:103: ( instructionInclBreakContinue )+
                    	    int cnt56=0;
                    	    loop56:
                    	    do {
                    	        int alt56=2;
                    	        int LA56_0 = input.LA(1);

                    	        if ( (LA56_0==Break||LA56_0==Continue||LA56_0==Do||(LA56_0 >= For && LA56_0 <= Foreach)||LA56_0==If||LA56_0==LeftCurlyBrace||LA56_0==MinusMinus||(LA56_0 >= PlusPlus && LA56_0 <= Return)||(LA56_0 >= Switch && LA56_0 <= While)) ) {
                    	            alt56=1;
                    	        }


                    	        switch (alt56) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:103: instructionInclBreakContinue
                    	    	    {
                    	    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2041);
                    	    	    instructionInclBreakContinue();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt56 >= 1 ) break loop56;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(56, input);
                    	                throw eee;
                    	        }
                    	        cnt56++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==Case) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:6: ( caseLabel )+ ( instructionInclBreakContinue )+
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:6: ( caseLabel )+
                    	    int cnt58=0;
                    	    loop58:
                    	    do {
                    	        int alt58=2;
                    	        int LA58_0 = input.LA(1);

                    	        if ( (LA58_0==Case) ) {
                    	            alt58=1;
                    	        }


                    	        switch (alt58) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:6: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition2051);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt58 >= 1 ) break loop58;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(58, input);
                    	                throw eee;
                    	        }
                    	        cnt58++;
                    	    } while (true);


                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:17: ( instructionInclBreakContinue )+
                    	    int cnt59=0;
                    	    loop59:
                    	    do {
                    	        int alt59=2;
                    	        int LA59_0 = input.LA(1);

                    	        if ( (LA59_0==Break||LA59_0==Continue||LA59_0==Do||(LA59_0 >= For && LA59_0 <= Foreach)||LA59_0==If||LA59_0==LeftCurlyBrace||LA59_0==MinusMinus||(LA59_0 >= PlusPlus && LA59_0 <= Return)||(LA59_0 >= Switch && LA59_0 <= While)) ) {
                    	            alt59=1;
                    	        }


                    	        switch (alt59) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:17: instructionInclBreakContinue
                    	    	    {
                    	    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2054);
                    	    	    instructionInclBreakContinue();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt59 >= 1 ) break loop59;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(59, input);
                    	                throw eee;
                    	        }
                    	        cnt59++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==Default) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:50: defaultLabel ( instructionInclBreakContinue )+
                            {
                            pushFollow(FOLLOW_defaultLabel_in_switchCondition2060);
                            defaultLabel();

                            state._fsp--;
                            if (state.failed) return ;

                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:63: ( instructionInclBreakContinue )+
                            int cnt61=0;
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==Break||LA61_0==Continue||LA61_0==Do||(LA61_0 >= For && LA61_0 <= Foreach)||LA61_0==If||LA61_0==LeftCurlyBrace||LA61_0==MinusMinus||(LA61_0 >= PlusPlus && LA61_0 <= Return)||(LA61_0 >= Switch && LA61_0 <= While)) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:63: instructionInclBreakContinue
                            	    {
                            	    pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2062);
                            	    instructionInclBreakContinue();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt61 >= 1 ) break loop61;
                            	    if (state.backtracking>0) {state.failed=true; return ;}
                                        EarlyExitException eee =
                                            new EarlyExitException(61, input);
                                        throw eee;
                                }
                                cnt61++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition2073); if (state.failed) return ;

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
    // $ANTLR end "switchCondition"



    // $ANTLR start "caseLabel"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:1: caseLabel : 'case' expressionInclArrayExpression ':' ;
    public final void caseLabel() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:11: ( 'case' expressionInclArrayExpression ':' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:13: 'case' expressionInclArrayExpression ':'
            {
            match(input,Case,FOLLOW_Case_in_caseLabel2083); if (state.failed) return ;

            pushFollow(FOLLOW_expressionInclArrayExpression_in_caseLabel2085);
            expressionInclArrayExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,Colon,FOLLOW_Colon_in_caseLabel2087); if (state.failed) return ;

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
    // $ANTLR end "caseLabel"



    // $ANTLR start "defaultLabel"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:1: defaultLabel : 'default' ':' ;
    public final void defaultLabel() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:2: ( 'default' ':' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:4: 'default' ':'
            {
            match(input,Default,FOLLOW_Default_in_defaultLabel2096); if (state.failed) return ;

            match(input,Colon,FOLLOW_Colon_in_defaultLabel2098); if (state.failed) return ;

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
    // $ANTLR end "defaultLabel"

    // $ANTLR start synpred80_TSPHP
    public final void synpred80_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:5: ( 'else' instructionWithoutBreakContinue )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:5: 'else' instructionWithoutBreakContinue
        {
        match(input,Else,FOLLOW_Else_in_synpred80_TSPHP1882); if (state.failed) return ;

        pushFollow(FOLLOW_instructionWithoutBreakContinue_in_synpred80_TSPHP1884);
        instructionWithoutBreakContinue();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_TSPHP

    // $ANTLR start synpred94_TSPHP
    public final void synpred94_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
        {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
        int cnt83=0;
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Case) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: ( caseLabel )+ ( instructionInclBreakContinue )+
        	    {
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: ( caseLabel )+
        	    int cnt81=0;
        	    loop81:
        	    do {
        	        int alt81=2;
        	        int LA81_0 = input.LA(1);

        	        if ( (LA81_0==Case) ) {
        	            alt81=1;
        	        }


        	        switch (alt81) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:5: caseLabel
        	    	    {
        	    	    pushFollow(FOLLOW_caseLabel_in_synpred94_TSPHP2024);
        	    	    caseLabel();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt81 >= 1 ) break loop81;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(81, input);
        	                throw eee;
        	        }
        	        cnt81++;
        	    } while (true);


        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: ( instructionInclBreakContinue )+
        	    int cnt82=0;
        	    loop82:
        	    do {
        	        int alt82=2;
        	        int LA82_0 = input.LA(1);

        	        if ( (LA82_0==Break||LA82_0==Continue||LA82_0==Do||(LA82_0 >= For && LA82_0 <= Foreach)||LA82_0==If||LA82_0==LeftCurlyBrace||LA82_0==MinusMinus||(LA82_0 >= PlusPlus && LA82_0 <= Return)||(LA82_0 >= Switch && LA82_0 <= While)) ) {
        	            alt82=1;
        	        }


        	        switch (alt82) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: instructionInclBreakContinue
        	    	    {
        	    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2027);
        	    	    instructionInclBreakContinue();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt82 >= 1 ) break loop82;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(82, input);
        	                throw eee;
        	        }
        	        cnt82++;
        	    } while (true);


        	    }
        	    break;

        	default :
        	    if ( cnt83 >= 1 ) break loop83;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(83, input);
                    throw eee;
            }
            cnt83++;
        } while (true);


        pushFollow(FOLLOW_defaultLabel_in_synpred94_TSPHP2032);
        defaultLabel();

        state._fsp--;
        if (state.failed) return ;

        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:61: ( instructionInclBreakContinue )+
        int cnt84=0;
        loop84:
        do {
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==Break||LA84_0==Continue||LA84_0==Do||(LA84_0 >= For && LA84_0 <= Foreach)||LA84_0==If||LA84_0==LeftCurlyBrace||LA84_0==MinusMinus||(LA84_0 >= PlusPlus && LA84_0 <= Return)||(LA84_0 >= Switch && LA84_0 <= While)) ) {
                alt84=1;
            }


            switch (alt84) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:61: instructionInclBreakContinue
        	    {
        	    pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2034);
        	    instructionInclBreakContinue();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt84 >= 1 ) break loop84;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(84, input);
                    throw eee;
            }
            cnt84++;
        } while (true);


        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
        int cnt87=0;
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==Case) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: ( caseLabel )+ ( instructionInclBreakContinue )+
        	    {
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: ( caseLabel )+
        	    int cnt85=0;
        	    loop85:
        	    do {
        	        int alt85=2;
        	        int LA85_0 = input.LA(1);

        	        if ( (LA85_0==Case) ) {
        	            alt85=1;
        	        }


        	        switch (alt85) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:92: caseLabel
        	    	    {
        	    	    pushFollow(FOLLOW_caseLabel_in_synpred94_TSPHP2038);
        	    	    caseLabel();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt85 >= 1 ) break loop85;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(85, input);
        	                throw eee;
        	        }
        	        cnt85++;
        	    } while (true);


        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:103: ( instructionInclBreakContinue )+
        	    int cnt86=0;
        	    loop86:
        	    do {
        	        int alt86=2;
        	        int LA86_0 = input.LA(1);

        	        if ( (LA86_0==Break||LA86_0==Continue||LA86_0==Do||(LA86_0 >= For && LA86_0 <= Foreach)||LA86_0==If||LA86_0==LeftCurlyBrace||LA86_0==MinusMinus||(LA86_0 >= PlusPlus && LA86_0 <= Return)||(LA86_0 >= Switch && LA86_0 <= While)) ) {
        	            alt86=1;
        	        }


        	        switch (alt86) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:103: instructionInclBreakContinue
        	    	    {
        	    	    pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2041);
        	    	    instructionInclBreakContinue();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt86 >= 1 ) break loop86;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(86, input);
        	                throw eee;
        	        }
        	        cnt86++;
        	    } while (true);


        	    }
        	    break;

        	default :
        	    if ( cnt87 >= 1 ) break loop87;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(87, input);
                    throw eee;
            }
            cnt87++;
        } while (true);


        }

    }
    // $ANTLR end synpred94_TSPHP

    // Delegated rules

    public final boolean synpred94_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_namespaceSemicolon_in_prog425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EOF_in_prog428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceBracket_in_prog433 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EOF_in_prog436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withoutNamespace_in_prog441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon456 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceSemicolon458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon460 = new BitSet(new long[]{0xFF006040A7020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_in_namespaceSemicolon462 = new BitSet(new long[]{0xFF006040A7020002L,0x0000000000000003L});
    public static final BitSet FOLLOW_Namespace_in_namespaceBracket475 = new BitSet(new long[]{0x0000040080000000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceBracket477 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket480 = new BitSet(new long[]{0xFF006040A7020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_in_namespaceBracket482 = new BitSet(new long[]{0xFF00E040A7020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_withoutNamespace567 = new BitSet(new long[]{0xFF006040A7020002L,0x0000000000000003L});
    public static final BitSet FOLLOW_definition_in_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_definition594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Function_in_functionDeclaration608 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_returnType_in_functionDeclaration610 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration612 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclaration614 = new BitSet(new long[]{0xFE01000000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDeclaration616 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_functionDeclaration619 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration621 = new BitSet(new long[]{0xFF00E040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration623 = new BitSet(new long[]{0xFF00E040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypes_in_returnType636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_returnType640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramDeclaration_in_paramList692 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Comma_in_paramList695 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_paramDeclaration_in_paramList697 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_primitiveTypes_in_paramDeclaration709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_paramDeclaration711 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Equal_in_paramDeclaration714 = new BitSet(new long[]{0x0280000240800080L});
    public static final BitSet FOLLOW_expressionInclArrayExpression_in_paramDeclaration716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue729 = new BitSet(new long[]{0xFF006040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue731 = new BitSet(new long[]{0xFF00E040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue751 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue753 = new BitSet(new long[]{0xFF00E040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_instructionInclBreakContinue767 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue773 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableAssignment_in_instruction788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_instruction793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifCondition_in_instruction798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCondition_in_instruction803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forLoop_in_instruction808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreachLoop_in_instruction813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoop_in_instruction818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileLoop_in_instruction823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_instruction828 = new BitSet(new long[]{0x0290000240800080L});
    public static final BitSet FOLLOW_expressionInclArrayExpression_in_instruction830 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_instruction833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignmentWithoutSemicolon_in_variableAssignment844 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_variableAssignment846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon857 = new BitSet(new long[]{0x006011BC00490000L});
    public static final BitSet FOLLOW_assignmentOperator_in_varAssignmentWithoutSemicolon859 = new BitSet(new long[]{0x0280000240800080L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionInclArrayExpression_in_varAssignmentWithoutSemicolon862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon880 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionWithoutArrayExpression_in_expressionInclArrayExpression976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpression_in_expressionInclArrayExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intExpression_in_expressionWithoutArrayExpression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpression_in_expressionWithoutArrayExpression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpression_in_expressionWithoutArrayExpression998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatExpression_in_expressionWithoutArrayExpression1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_variableDeclaration1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolDeclaration_in_variableDeclaration1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intDeclaration_in_variableDeclaration1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatDeclaration_in_variableDeclaration1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringDeclaration_in_variableDeclaration1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeResource_in_variableDeclaration1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_variableDeclaration1046 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_variableDeclaration1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolDeclaration1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration1067 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_Equal_in_boolDeclaration1071 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolExpression_in_boolDeclaration1074 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration1076 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_boolDeclaration1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_boolExpression1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeInt_in_intDeclaration1115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration1117 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_Equal_in_intDeclaration1121 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_intExpression_in_intDeclaration1124 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration1126 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_intDeclaration1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_intExpression1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeFloat_in_floatDeclaration1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration1375 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_Equal_in_floatDeclaration1379 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_floatExpression_in_floatDeclaration1382 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration1384 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_floatDeclaration1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_floatExpression1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeString_in_stringDeclaration1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1537 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_Equal_in_stringDeclaration1540 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stringExpression_in_stringDeclaration1543 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1547 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_stringDeclaration1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_stringExpression1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_arrayDeclaration1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1730 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_Equal_in_arrayDeclaration1734 = new BitSet(new long[]{0x0200000200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayExpression_in_arrayDeclaration1737 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1739 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_arrayDeclaration1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_arrayExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBrace_in_array1768 = new BitSet(new long[]{0x0282000240800080L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_content_in_array1770 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightSquareBrace_in_array1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_array1779 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_array1781 = new BitSet(new long[]{0x0281000240800080L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_content_in_array1783 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_array1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_key_in_array_content1799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1801 = new BitSet(new long[]{0x0280000240800080L});
    public static final BitSet FOLLOW_array_value_in_array_content1805 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Comma_in_array_content1809 = new BitSet(new long[]{0x0280000240800080L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_key_in_array_content1812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1814 = new BitSet(new long[]{0x0280000240800080L});
    public static final BitSet FOLLOW_array_value_in_array_content1818 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_expressionWithoutArrayExpression_in_array_key1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_array_key1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionInclArrayExpression_in_array_value1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifCondition1861 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition1863 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolExpression_in_ifCondition1866 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_VariableId_in_ifCondition1870 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_ifCondition1873 = new BitSet(new long[]{0xFF006040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition1875 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_Else_in_ifCondition1882 = new BitSet(new long[]{0xFF006040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_forLoop1899 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_forLoop1901 = new BitSet(new long[]{0xFE10204000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_forLoop1905 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_variableAssignment_in_forLoop1907 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_Semicolon_in_forLoop1910 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_boolExpression_in_forLoop1914 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_forLoop1917 = new BitSet(new long[]{0x0001204000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varAssignmentWithoutSemicolon_in_forLoop1919 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_forLoop1922 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_foreachLoop1933 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop1935 = new BitSet(new long[]{0x0200000200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_array_in_foreachLoop1940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_As_in_foreachLoop1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1945 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_Arrow_in_foreachLoop1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1950 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop1954 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_whileLoop1965 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop1967 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_boolExpression_in_whileLoop1969 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_whileLoop1971 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_doWhileLoop1983 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_doWhileLoop1987 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop1989 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_boolExpression_in_doWhileLoop1991 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop1993 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_doWhileLoop1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_switchCondition2005 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_switchCondition2009 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_switchCondition2011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition2013 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition2024 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2027 = new BitSet(new long[]{0xFF006040A302A300L,0x0000000000000003L});
    public static final BitSet FOLLOW_defaultLabel_in_switchCondition2032 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2034 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition2038 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2041 = new BitSet(new long[]{0xFF00E040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition2051 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2054 = new BitSet(new long[]{0xFF00E040A302A300L,0x0000000000000003L});
    public static final BitSet FOLLOW_defaultLabel_in_switchCondition2060 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2062 = new BitSet(new long[]{0xFF00E040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_caseLabel2083 = new BitSet(new long[]{0x0280000240800080L});
    public static final BitSet FOLLOW_expressionInclArrayExpression_in_caseLabel2085 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Colon_in_caseLabel2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_defaultLabel2096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Colon_in_defaultLabel2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_synpred80_TSPHP1882 = new BitSet(new long[]{0xFF006040A3020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_synpred80_TSPHP1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseLabel_in_synpred94_TSPHP2024 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2027 = new BitSet(new long[]{0xFF006040A302A300L,0x0000000000000003L});
    public static final BitSet FOLLOW_defaultLabel_in_synpred94_TSPHP2032 = new BitSet(new long[]{0xFF006040A3022100L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2034 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_caseLabel_in_synpred94_TSPHP2038 = new BitSet(new long[]{0xFF006040A3022300L,0x0000000000000003L});
    public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred94_TSPHP2041 = new BitSet(new long[]{0xFF006040A3022302L,0x0000000000000003L});

}