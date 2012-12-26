// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-26 09:23:20

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arrow", "As", "BINARY", "BREAK_CONTINUE_NUMBER", "Bool", "Break", "Case", "Colon", "Comma", "Comment", "Continue", "DECIMAL", "Default", "DivideEqual", "Do", "Dolar", "DotEqual", "EXPONENT", "Else", "Equal", "Float", "For", "Foreach", "Function", "HEXADECIMAL", "ID", "If", "Int", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LogicAndEqual", "LogicOrEqual", "LogicXorEqual", "MinusEqual", "MinusMinus", "ModuloEqual", "MultiplyEqual", "Namespace", "NamespaceId", "OCTAL", "PlusEqual", "PlusPlus", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeftEqual", "ShiftRightEqual", "String", "Switch", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeResource", "TypeString", "VariableId", "While", "Whitespace"
    };

    public static final int EOF=-1;
    public static final int Arrow=4;
    public static final int As=5;
    public static final int BINARY=6;
    public static final int BREAK_CONTINUE_NUMBER=7;
    public static final int Bool=8;
    public static final int Break=9;
    public static final int Case=10;
    public static final int Colon=11;
    public static final int Comma=12;
    public static final int Comment=13;
    public static final int Continue=14;
    public static final int DECIMAL=15;
    public static final int Default=16;
    public static final int DivideEqual=17;
    public static final int Do=18;
    public static final int Dolar=19;
    public static final int DotEqual=20;
    public static final int EXPONENT=21;
    public static final int Else=22;
    public static final int Equal=23;
    public static final int Float=24;
    public static final int For=25;
    public static final int Foreach=26;
    public static final int Function=27;
    public static final int HEXADECIMAL=28;
    public static final int ID=29;
    public static final int If=30;
    public static final int Int=31;
    public static final int LeftCurlyBrace=32;
    public static final int LeftParanthesis=33;
    public static final int LeftSquareBrace=34;
    public static final int LogicAndEqual=35;
    public static final int LogicOrEqual=36;
    public static final int LogicXorEqual=37;
    public static final int MinusEqual=38;
    public static final int MinusMinus=39;
    public static final int ModuloEqual=40;
    public static final int MultiplyEqual=41;
    public static final int Namespace=42;
    public static final int NamespaceId=43;
    public static final int OCTAL=44;
    public static final int PlusEqual=45;
    public static final int PlusPlus=46;
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
    public final void prog() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
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
            else if ( (LA3_0==Do||(LA3_0 >= For && LA3_0 <= Foreach)||LA3_0==If||LA3_0==LeftCurlyBrace||LA3_0==MinusMinus||LA3_0==PlusPlus||(LA3_0 >= Switch && LA3_0 <= While)) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:8: ( namespaceSemicolon )+ EOF
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:8: ( namespaceSemicolon )+
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
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:8: namespaceSemicolon
                    	    {
                    	    pushFollow(FOLLOW_namespaceSemicolon_in_prog417);
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


                    match(input,EOF,FOLLOW_EOF_in_prog420); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:4: ( namespaceBracket )+ EOF
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:4: ( namespaceBracket )+
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
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:4: namespaceBracket
                    	    {
                    	    pushFollow(FOLLOW_namespaceBracket_in_prog425);
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


                    match(input,EOF,FOLLOW_EOF_in_prog428); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:4: withoutNamespace EOF
                    {
                    pushFollow(FOLLOW_withoutNamespace_in_prog433);
                    withoutNamespace();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EOF,FOLLOW_EOF_in_prog435); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:1: namespaceSemicolon : ( 'namespace' NamespaceId ';' ( command )+ ) ;
    public final void namespaceSemicolon() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:2: ( ( 'namespace' NamespaceId ';' ( command )+ ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:4: ( 'namespace' NamespaceId ';' ( command )+ )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:4: ( 'namespace' NamespaceId ';' ( command )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:5: 'namespace' NamespaceId ';' ( command )+
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon448); if (state.failed) return ;

            match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceSemicolon450); if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon452); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:33: ( command )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Do||(LA4_0 >= For && LA4_0 <= Foreach)||LA4_0==If||LA4_0==LeftCurlyBrace||LA4_0==MinusMinus||LA4_0==PlusPlus||(LA4_0 >= Switch && LA4_0 <= While)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:33: command
            	    {
            	    pushFollow(FOLLOW_command_in_namespaceSemicolon454);
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:1: namespaceBracket : ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' ) ;
    public final void namespaceBracket() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:2: ( ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:4: ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' )
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:4: ( 'namespace' ( NamespaceId )? '{' ( command )+ '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:5: 'namespace' ( NamespaceId )? '{' ( command )+ '}'
            {
            match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket467); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:17: ( NamespaceId )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NamespaceId) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:17: NamespaceId
                    {
                    match(input,NamespaceId,FOLLOW_NamespaceId_in_namespaceBracket469); if (state.failed) return ;

                    }
                    break;

            }


            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket472); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:34: ( command )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Do||(LA6_0 >= For && LA6_0 <= Foreach)||LA6_0==If||LA6_0==LeftCurlyBrace||LA6_0==MinusMinus||LA6_0==PlusPlus||(LA6_0 >= Switch && LA6_0 <= While)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:34: command
            	    {
            	    pushFollow(FOLLOW_command_in_namespaceBracket474);
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


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket477); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:134:1: withoutNamespace : ( command )+ ;
    public final void withoutNamespace() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:2: ( ( command )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: ( command )+
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: ( command )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Do||(LA7_0 >= For && LA7_0 <= Foreach)||LA7_0==If||LA7_0==LeftCurlyBrace||LA7_0==MinusMinus||LA7_0==PlusPlus||(LA7_0 >= Switch && LA7_0 <= While)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:135:4: command
            	    {
            	    pushFollow(FOLLOW_command_in_withoutNamespace561);
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:1: command : ( block | instruction );
    public final void command() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:9: ( block | instruction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LeftCurlyBrace) ) {
                alt8=1;
            }
            else if ( (LA8_0==Do||(LA8_0 >= For && LA8_0 <= Foreach)||LA8_0==If||LA8_0==MinusMinus||LA8_0==PlusPlus||(LA8_0 >= Switch && LA8_0 <= While)) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:137:11: block
                    {
                    pushFollow(FOLLOW_block_in_command570);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:139:4: instruction
                    {
                    pushFollow(FOLLOW_instruction_in_command577);
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
    // $ANTLR end "command"



    // $ANTLR start "block"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:1: block : '{' ( command )+ '}' ;
    public final void block() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:7: ( '{' ( command )+ '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:9: '{' ( command )+ '}'
            {
            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_block589); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:13: ( command )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Do||(LA9_0 >= For && LA9_0 <= Foreach)||LA9_0==If||LA9_0==LeftCurlyBrace||LA9_0==MinusMinus||LA9_0==PlusPlus||(LA9_0 >= Switch && LA9_0 <= While)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:143:13: command
            	    {
            	    pushFollow(FOLLOW_command_in_block591);
            	    command();

            	    state._fsp--;
            	    if (state.failed) return ;

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


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_block595); if (state.failed) return ;

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
    // $ANTLR end "block"



    // $ANTLR start "instruction"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:158:1: instruction : ( varAssignment | varDeclaration | ifCondition | forLoop | foreachLoop | whileLoop | switchCondition | doWhileLoop );
    public final void instruction() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:2: ( varAssignment | varDeclaration | ifCondition | forLoop | foreachLoop | whileLoop | switchCondition | doWhileLoop )
            int alt10=8;
            switch ( input.LA(1) ) {
            case MinusMinus:
            case PlusPlus:
            case VariableId:
                {
                alt10=1;
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
                alt10=2;
                }
                break;
            case If:
                {
                alt10=3;
                }
                break;
            case For:
                {
                alt10=4;
                }
                break;
            case Foreach:
                {
                alt10=5;
                }
                break;
            case While:
                {
                alt10=6;
                }
                break;
            case Switch:
                {
                alt10=7;
                }
                break;
            case Do:
                {
                alt10=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:4: varAssignment
                    {
                    pushFollow(FOLLOW_varAssignment_in_instruction608);
                    varAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:160:4: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_instruction613);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:4: ifCondition
                    {
                    pushFollow(FOLLOW_ifCondition_in_instruction618);
                    ifCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:4: forLoop
                    {
                    pushFollow(FOLLOW_forLoop_in_instruction623);
                    forLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:4: foreachLoop
                    {
                    pushFollow(FOLLOW_foreachLoop_in_instruction628);
                    foreachLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:4: whileLoop
                    {
                    pushFollow(FOLLOW_whileLoop_in_instruction633);
                    whileLoop();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: switchCondition
                    {
                    pushFollow(FOLLOW_switchCondition_in_instruction638);
                    switchCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:4: doWhileLoop
                    {
                    pushFollow(FOLLOW_doWhileLoop_in_instruction643);
                    doWhileLoop();

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



    // $ANTLR start "varAssignment"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:1: varAssignment : varAssignmentWithoutSemicolon ';' ;
    public final void varAssignment() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:2: ( varAssignmentWithoutSemicolon ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: varAssignmentWithoutSemicolon ';'
            {
            pushFollow(FOLLOW_varAssignmentWithoutSemicolon_in_varAssignment655);
            varAssignmentWithoutSemicolon();

            state._fsp--;
            if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_varAssignment657); if (state.failed) return ;

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
    // $ANTLR end "varAssignment"



    // $ANTLR start "varAssignmentWithoutSemicolon"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:1: varAssignmentWithoutSemicolon : ( VariableId assignmentOperator ( expressionOrArray | VariableId ) | incrementDecrement VariableId | VariableId incrementDecrement );
    public final void varAssignmentWithoutSemicolon() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:2: ( VariableId assignmentOperator ( expressionOrArray | VariableId ) | incrementDecrement VariableId | VariableId incrementDecrement )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VariableId) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DivideEqual||LA12_1==DotEqual||LA12_1==Equal||(LA12_1 >= LogicAndEqual && LA12_1 <= MinusEqual)||(LA12_1 >= ModuloEqual && LA12_1 <= MultiplyEqual)||LA12_1==PlusEqual||(LA12_1 >= ShiftLeftEqual && LA12_1 <= ShiftRightEqual)) ) {
                    alt12=1;
                }
                else if ( (LA12_1==MinusMinus||LA12_1==PlusPlus) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA12_0==MinusMinus||LA12_0==PlusPlus) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: VariableId assignmentOperator ( expressionOrArray | VariableId )
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon668); if (state.failed) return ;

                    pushFollow(FOLLOW_assignmentOperator_in_varAssignmentWithoutSemicolon670);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:34: ( expressionOrArray | VariableId )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Bool||LA11_0==Float||LA11_0==Int||LA11_0==LeftSquareBrace||LA11_0==String||LA11_0==TypeArray) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==VariableId) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:35: expressionOrArray
                            {
                            pushFollow(FOLLOW_expressionOrArray_in_varAssignmentWithoutSemicolon673);
                            expressionOrArray();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:55: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon677); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: incrementDecrement VariableId
                    {
                    pushFollow(FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon684);
                    incrementDecrement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon686); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:4: VariableId incrementDecrement
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_varAssignmentWithoutSemicolon691); if (state.failed) return ;

                    pushFollow(FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon693);
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:179:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
    public final void assignmentOperator() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:1: incrementDecrement : ( '++' | '--' );
    public final void incrementDecrement() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:2: ( '++' | '--' )
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



    // $ANTLR start "expressionOrArray"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:1: expressionOrArray : ( expression | array );
    public final void expressionOrArray() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:2: ( expression | array )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Bool||LA13_0==Float||LA13_0==Int||LA13_0==String) ) {
                alt13=1;
            }
            else if ( (LA13_0==LeftSquareBrace||LA13_0==TypeArray) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionOrArray792);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:15: array
                    {
                    pushFollow(FOLLOW_array_in_expressionOrArray794);
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
    // $ANTLR end "expressionOrArray"



    // $ANTLR start "expression"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:1: expression : ( intExpression | stringExpression | boolExpression | floatExpression );
    public final void expression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:2: ( intExpression | stringExpression | boolExpression | floatExpression )
            int alt14=4;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt14=1;
                }
                break;
            case String:
                {
                alt14=2;
                }
                break;
            case Bool:
                {
                alt14=3;
                }
                break;
            case Float:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:4: intExpression
                    {
                    pushFollow(FOLLOW_intExpression_in_expression804);
                    intExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: stringExpression
                    {
                    pushFollow(FOLLOW_stringExpression_in_expression809);
                    stringExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:4: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_expression814);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: floatExpression
                    {
                    pushFollow(FOLLOW_floatExpression_in_expression819);
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
    // $ANTLR end "expression"



    // $ANTLR start "varDeclaration"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:1: varDeclaration : ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' );
    public final void varDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:2: ( arrayDeclaration | boolDeclaration | intDeclaration | floatDeclaration | stringDeclaration | TypeResource VariableId ';' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case TypeArray:
                {
                alt15=1;
                }
                break;
            case TypeBool:
            case TypeBoolean:
                {
                alt15=2;
                }
                break;
            case TypeInt:
                {
                alt15=3;
                }
                break;
            case TypeFloat:
                {
                alt15=4;
                }
                break;
            case TypeString:
                {
                alt15=5;
                }
                break;
            case TypeResource:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:4: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_varDeclaration833);
                    arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: boolDeclaration
                    {
                    pushFollow(FOLLOW_boolDeclaration_in_varDeclaration838);
                    boolDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: intDeclaration
                    {
                    pushFollow(FOLLOW_intDeclaration_in_varDeclaration844);
                    intDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: floatDeclaration
                    {
                    pushFollow(FOLLOW_floatDeclaration_in_varDeclaration850);
                    floatDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: stringDeclaration
                    {
                    pushFollow(FOLLOW_stringDeclaration_in_varDeclaration855);
                    stringDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: TypeResource VariableId ';'
                    {
                    match(input,TypeResource,FOLLOW_TypeResource_in_varDeclaration860); if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_varDeclaration862); if (state.failed) return ;

                    match(input,Semicolon,FOLLOW_Semicolon_in_varDeclaration864); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: boolDeclaration : ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' ;
    public final void boolDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: ( TypeBool | TypeBoolean ) VariableId ( '=' ( boolExpression | VariableId ) )? ';'
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


            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration883); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:38: ( '=' ( boolExpression | VariableId ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Equal) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:40: '=' ( boolExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_boolDeclaration887); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:44: ( boolExpression | VariableId )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Bool) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:45: boolExpression
                            {
                            pushFollow(FOLLOW_boolExpression_in_boolDeclaration890);
                            boolExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:60: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_boolDeclaration892); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_boolDeclaration898); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:1: boolExpression : Bool ;
    public final void boolExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:2: ( Bool )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:4: Bool
            {
            match(input,Bool,FOLLOW_Bool_in_boolExpression917); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:1: intDeclaration : TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' ;
    public final void intDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:2: ( TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: TypeInt VariableId ( '=' ( intExpression | VariableId ) )? ';'
            {
            match(input,TypeInt,FOLLOW_TypeInt_in_intDeclaration931); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration933); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:23: ( '=' ( intExpression | VariableId ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Equal) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:25: '=' ( intExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_intDeclaration937); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:29: ( intExpression | VariableId )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Int) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:30: intExpression
                            {
                            pushFollow(FOLLOW_intExpression_in_intDeclaration940);
                            intExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:44: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_intDeclaration942); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_intDeclaration948); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:1: intExpression : Int ;
    public final void intExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:2: ( Int )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: Int
            {
            match(input,Int,FOLLOW_Int_in_intExpression957); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:1: floatDeclaration : TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' ;
    public final void floatDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:2: ( TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:4: TypeFloat VariableId ( '=' ( floatExpression | VariableId ) )? ';'
            {
            match(input,TypeFloat,FOLLOW_TypeFloat_in_floatDeclaration1188); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration1190); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:25: ( '=' ( floatExpression | VariableId ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Equal) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:27: '=' ( floatExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_floatDeclaration1194); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:31: ( floatExpression | VariableId )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Float) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:32: floatExpression
                            {
                            pushFollow(FOLLOW_floatExpression_in_floatDeclaration1197);
                            floatExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:48: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_floatDeclaration1199); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_floatDeclaration1205); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:1: floatExpression : Float ;
    public final void floatExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:2: ( Float )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: Float
            {
            match(input,Float,FOLLOW_Float_in_floatExpression1214); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:1: stringDeclaration : TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' ;
    public final void stringDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:2: ( TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:4: TypeString VariableId ( '=' ( stringExpression | VariableId ) )? ';'
            {
            match(input,TypeString,FOLLOW_TypeString_in_stringDeclaration1350); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1352); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:26: ( '=' ( stringExpression | VariableId ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Equal) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:27: '=' ( stringExpression | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_stringDeclaration1355); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:31: ( stringExpression | VariableId )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==String) ) {
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
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:32: stringExpression
                            {
                            pushFollow(FOLLOW_stringExpression_in_stringDeclaration1358);
                            stringExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:51: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_stringDeclaration1362); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_stringDeclaration1368); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:1: stringExpression : String ;
    public final void stringExpression() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:2: ( String )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:4: String
            {
            match(input,String,FOLLOW_String_in_stringExpression1377); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:1: arrayDeclaration : TypeArray VariableId ( '=' ( array | VariableId ) )? ';' ;
    public final void arrayDeclaration() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:2: ( TypeArray VariableId ( '=' ( array | VariableId ) )? ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: TypeArray VariableId ( '=' ( array | VariableId ) )? ';'
            {
            match(input,TypeArray,FOLLOW_TypeArray_in_arrayDeclaration1557); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1559); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:25: ( '=' ( array | VariableId ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Equal) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:27: '=' ( array | VariableId )
                    {
                    match(input,Equal,FOLLOW_Equal_in_arrayDeclaration1563); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:31: ( array | VariableId )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==LeftSquareBrace||LA24_0==TypeArray) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==VariableId) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:32: array
                            {
                            pushFollow(FOLLOW_array_in_arrayDeclaration1566);
                            array();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:38: VariableId
                            {
                            match(input,VariableId,FOLLOW_VariableId_in_arrayDeclaration1568); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_arrayDeclaration1574); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
    public final void array() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftSquareBrace) ) {
                alt28=1;
            }
            else if ( (LA28_0==TypeArray) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:9: '[' ( array_content )? ']'
                    {
                    match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array1583); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:13: ( array_content )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Bool||LA26_0==Float||LA26_0==Int||LA26_0==LeftSquareBrace||LA26_0==String||LA26_0==TypeArray||LA26_0==VariableId) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:13: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1585);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array1588); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:4: TypeArray '(' ( array_content )? ')'
                    {
                    match(input,TypeArray,FOLLOW_TypeArray_in_array1594); if (state.failed) return ;

                    match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array1596); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:18: ( array_content )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==Bool||LA27_0==Float||LA27_0==Int||LA27_0==LeftSquareBrace||LA27_0==String||LA27_0==TypeArray||LA27_0==VariableId) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:18: array_content
                            {
                            pushFollow(FOLLOW_array_content_in_array1598);
                            array_content();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array1601); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:1: array_content : ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* ;
    public final void array_content() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:2: ( ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( array_key '=>' )? array_value ( ',' ( array_key '=>' )? array_value )*
            {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( array_key '=>' )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case Int:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==Arrow) ) {
                        alt29=1;
                    }
                    }
                    break;
                case String:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==Arrow) ) {
                        alt29=1;
                    }
                    }
                    break;
                case Bool:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==Arrow) ) {
                        alt29=1;
                    }
                    }
                    break;
                case Float:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (LA29_4==Arrow) ) {
                        alt29=1;
                    }
                    }
                    break;
                case VariableId:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:5: array_key '=>'
                    {
                    pushFollow(FOLLOW_array_key_in_array_content1614);
                    array_key();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,Arrow,FOLLOW_Arrow_in_array_content1616); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_array_value_in_array_content1620);
            array_value();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:35: ( ',' ( array_key '=>' )? array_value )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:36: ',' ( array_key '=>' )? array_value
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_array_content1624); if (state.failed) return ;

            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:40: ( array_key '=>' )?
            	    int alt30=2;
            	    switch ( input.LA(1) ) {
            	        case Int:
            	            {
            	            int LA30_1 = input.LA(2);

            	            if ( (LA30_1==Arrow) ) {
            	                alt30=1;
            	            }
            	            }
            	            break;
            	        case String:
            	            {
            	            int LA30_2 = input.LA(2);

            	            if ( (LA30_2==Arrow) ) {
            	                alt30=1;
            	            }
            	            }
            	            break;
            	        case Bool:
            	            {
            	            int LA30_3 = input.LA(2);

            	            if ( (LA30_3==Arrow) ) {
            	                alt30=1;
            	            }
            	            }
            	            break;
            	        case Float:
            	            {
            	            int LA30_4 = input.LA(2);

            	            if ( (LA30_4==Arrow) ) {
            	                alt30=1;
            	            }
            	            }
            	            break;
            	        case VariableId:
            	            {
            	            alt30=1;
            	            }
            	            break;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:41: array_key '=>'
            	            {
            	            pushFollow(FOLLOW_array_key_in_array_content1627);
            	            array_key();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            match(input,Arrow,FOLLOW_Arrow_in_array_content1629); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_array_value_in_array_content1633);
            	    array_value();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:321:1: array_key : ( expression | VariableId );
    public final void array_key() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:2: ( expression | VariableId )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Bool||LA32_0==Float||LA32_0==Int||LA32_0==String) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_array_key1644);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:15: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_array_key1646); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: array_value options {backtrack=true; } : expressionOrArray ;
    public final void array_value() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:2: ( expressionOrArray )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: expressionOrArray
            {
            pushFollow(FOLLOW_expressionOrArray_in_array_value1666);
            expressionOrArray();

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:1: ifCondition : 'if' '(' ( boolExpression | VariableId ) ')' blockOrSingleCommand ( 'else' blockOrSingleCommand )? ;
    public final void ifCondition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:2: ( 'if' '(' ( boolExpression | VariableId ) ')' blockOrSingleCommand ( 'else' blockOrSingleCommand )? )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: 'if' '(' ( boolExpression | VariableId ) ')' blockOrSingleCommand ( 'else' blockOrSingleCommand )?
            {
            match(input,If,FOLLOW_If_in_ifCondition1676); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition1678); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:13: ( boolExpression | VariableId )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Bool) ) {
                alt33=1;
            }
            else if ( (LA33_0==VariableId) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:14: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_ifCondition1681);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:31: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_ifCondition1685); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition1688); if (state.failed) return ;

            pushFollow(FOLLOW_blockOrSingleCommand_in_ifCondition1690);
            blockOrSingleCommand();

            state._fsp--;
            if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:3: ( 'else' blockOrSingleCommand )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Else) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred61_TSPHP()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:5: 'else' blockOrSingleCommand
                    {
                    match(input,Else,FOLLOW_Else_in_ifCondition1697); if (state.failed) return ;

                    pushFollow(FOLLOW_blockOrSingleCommand_in_ifCondition1699);
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
    // $ANTLR end "ifCondition"



    // $ANTLR start "blockOrSingleCommand"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:1: blockOrSingleCommand : ( block | command );
    public final void blockOrSingleCommand() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:2: ( block | command )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LeftCurlyBrace) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred62_TSPHP()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA35_0==Do||(LA35_0 >= For && LA35_0 <= Foreach)||LA35_0==If||LA35_0==MinusMinus||LA35_0==PlusPlus||(LA35_0 >= Switch && LA35_0 <= While)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: block
                    {
                    pushFollow(FOLLOW_block_in_blockOrSingleCommand1713);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:5: command
                    {
                    pushFollow(FOLLOW_command_in_blockOrSingleCommand1719);
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



    // $ANTLR start "forLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: forLoop : 'for' '(' ( ( varDeclaration | varAssignment )? | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' loopBlockOrSingleCommand ;
    public final void forLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:9: ( 'for' '(' ( ( varDeclaration | varAssignment )? | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' loopBlockOrSingleCommand )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:11: 'for' '(' ( ( varDeclaration | varAssignment )? | ';' ) ( boolExpression )? ';' ( varAssignmentWithoutSemicolon )? ')' loopBlockOrSingleCommand
            {
            match(input,For,FOLLOW_For_in_forLoop1730); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop1732); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:21: ( ( varDeclaration | varAssignment )? | ';' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Bool||LA37_0==MinusMinus||LA37_0==PlusPlus||(LA37_0 >= TypeArray && LA37_0 <= VariableId)) ) {
                alt37=1;
            }
            else if ( (LA37_0==Semicolon) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==MinusMinus||LA37_2==PlusPlus||LA37_2==RightParanthesis||LA37_2==VariableId) ) {
                    alt37=1;
                }
                else if ( (LA37_2==Bool||LA37_2==Semicolon) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:22: ( varDeclaration | varAssignment )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:22: ( varDeclaration | varAssignment )?
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==MinusMinus||LA36_0==PlusPlus||LA36_0==VariableId) ) {
                        alt36=2;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:23: varDeclaration
                            {
                            pushFollow(FOLLOW_varDeclaration_in_forLoop1736);
                            varDeclaration();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:38: varAssignment
                            {
                            pushFollow(FOLLOW_varAssignment_in_forLoop1738);
                            varAssignment();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:54: ';'
                    {
                    match(input,Semicolon,FOLLOW_Semicolon_in_forLoop1742); if (state.failed) return ;

                    }
                    break;

            }


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:60: ( boolExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Bool) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:60: boolExpression
                    {
                    pushFollow(FOLLOW_boolExpression_in_forLoop1746);
                    boolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,Semicolon,FOLLOW_Semicolon_in_forLoop1749); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:80: ( varAssignmentWithoutSemicolon )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==MinusMinus||LA39_0==PlusPlus||LA39_0==VariableId) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:80: varAssignmentWithoutSemicolon
                    {
                    pushFollow(FOLLOW_varAssignmentWithoutSemicolon_in_forLoop1751);
                    varAssignmentWithoutSemicolon();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop1754); if (state.failed) return ;

            pushFollow(FOLLOW_loopBlockOrSingleCommand_in_forLoop1756);
            loopBlockOrSingleCommand();

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



    // $ANTLR start "loopBlockOrSingleCommand"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:1: loopBlockOrSingleCommand : ( blockOrSingleCommand | 'break' ( BREAK_CONTINUE_NUMBER )? ';' | 'continue' ( BREAK_CONTINUE_NUMBER )? ';' );
    public final void loopBlockOrSingleCommand() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:2: ( blockOrSingleCommand | 'break' ( BREAK_CONTINUE_NUMBER )? ';' | 'continue' ( BREAK_CONTINUE_NUMBER )? ';' )
            int alt42=3;
            switch ( input.LA(1) ) {
            case Do:
            case For:
            case Foreach:
            case If:
            case LeftCurlyBrace:
            case MinusMinus:
            case PlusPlus:
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
                alt42=1;
                }
                break;
            case Break:
                {
                alt42=2;
                }
                break;
            case Continue:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: blockOrSingleCommand
                    {
                    pushFollow(FOLLOW_blockOrSingleCommand_in_loopBlockOrSingleCommand1765);
                    blockOrSingleCommand();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:4: 'break' ( BREAK_CONTINUE_NUMBER )? ';'
                    {
                    match(input,Break,FOLLOW_Break_in_loopBlockOrSingleCommand1770); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:12: ( BREAK_CONTINUE_NUMBER )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==BREAK_CONTINUE_NUMBER) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:12: BREAK_CONTINUE_NUMBER
                            {
                            match(input,BREAK_CONTINUE_NUMBER,FOLLOW_BREAK_CONTINUE_NUMBER_in_loopBlockOrSingleCommand1772); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_loopBlockOrSingleCommand1775); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: 'continue' ( BREAK_CONTINUE_NUMBER )? ';'
                    {
                    match(input,Continue,FOLLOW_Continue_in_loopBlockOrSingleCommand1780); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:15: ( BREAK_CONTINUE_NUMBER )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==BREAK_CONTINUE_NUMBER) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:15: BREAK_CONTINUE_NUMBER
                            {
                            match(input,BREAK_CONTINUE_NUMBER,FOLLOW_BREAK_CONTINUE_NUMBER_in_loopBlockOrSingleCommand1782); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_loopBlockOrSingleCommand1785); if (state.failed) return ;

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
    // $ANTLR end "loopBlockOrSingleCommand"



    // $ANTLR start "foreachLoop"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' loopBlockOrSingleCommand ;
    public final void foreachLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' loopBlockOrSingleCommand )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' loopBlockOrSingleCommand
            {
            match(input,Foreach,FOLLOW_Foreach_in_foreachLoop1812); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop1814); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:18: ( VariableId | array )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==VariableId) ) {
                alt43=1;
            }
            else if ( (LA43_0==LeftSquareBrace||LA43_0==TypeArray) ) {
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:19: VariableId
                    {
                    match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1817); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:30: array
                    {
                    pushFollow(FOLLOW_array_in_foreachLoop1819);
                    array();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,As,FOLLOW_As_in_foreachLoop1822); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1824); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:53: ( '=>' VariableId )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Arrow) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:54: '=>' VariableId
                    {
                    match(input,Arrow,FOLLOW_Arrow_in_foreachLoop1827); if (state.failed) return ;

                    match(input,VariableId,FOLLOW_VariableId_in_foreachLoop1829); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop1833); if (state.failed) return ;

            pushFollow(FOLLOW_loopBlockOrSingleCommand_in_foreachLoop1835);
            loopBlockOrSingleCommand();

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: whileLoop : 'while' '(' boolExpression ')' loopBlockOrSingleCommand ;
    public final void whileLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( 'while' '(' boolExpression ')' loopBlockOrSingleCommand )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: 'while' '(' boolExpression ')' loopBlockOrSingleCommand
            {
            match(input,While,FOLLOW_While_in_whileLoop1844); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop1846); if (state.failed) return ;

            pushFollow(FOLLOW_boolExpression_in_whileLoop1848);
            boolExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop1850); if (state.failed) return ;

            pushFollow(FOLLOW_loopBlockOrSingleCommand_in_whileLoop1852);
            loopBlockOrSingleCommand();

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:1: doWhileLoop : 'do' loopBlockOrSingleCommand 'while' '(' boolExpression ')' ';' ;
    public final void doWhileLoop() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:2: ( 'do' loopBlockOrSingleCommand 'while' '(' boolExpression ')' ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: 'do' loopBlockOrSingleCommand 'while' '(' boolExpression ')' ';'
            {
            match(input,Do,FOLLOW_Do_in_doWhileLoop1862); if (state.failed) return ;

            pushFollow(FOLLOW_loopBlockOrSingleCommand_in_doWhileLoop1864);
            loopBlockOrSingleCommand();

            state._fsp--;
            if (state.failed) return ;

            match(input,While,FOLLOW_While_in_doWhileLoop1866); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop1868); if (state.failed) return ;

            pushFollow(FOLLOW_boolExpression_in_doWhileLoop1870);
            boolExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop1872); if (state.failed) return ;

            match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop1874); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+ | ( ( caseLabel )+ switchCommand )+ ( defaultLabel switchCommand )? ) '}' ;
    public final void switchCondition() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+ | ( ( caseLabel )+ switchCommand )+ ( defaultLabel switchCommand )? ) '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+ | ( ( caseLabel )+ switchCommand )+ ( defaultLabel switchCommand )? ) '}'
            {
            match(input,Switch,FOLLOW_Switch_in_switchCondition1884); if (state.failed) return ;

            match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition1886); if (state.failed) return ;

            match(input,VariableId,FOLLOW_VariableId_in_switchCondition1888); if (state.failed) return ;

            match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition1890); if (state.failed) return ;

            match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition1892); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:3: ( ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+ | ( ( caseLabel )+ switchCommand )+ ( defaultLabel switchCommand )? )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Case) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred78_TSPHP()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: ( ( caseLabel )+ switchCommand )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==Case) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: ( caseLabel )+ switchCommand
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: ( caseLabel )+
                    	    int cnt45=0;
                    	    loop45:
                    	    do {
                    	        int alt45=2;
                    	        int LA45_0 = input.LA(1);

                    	        if ( (LA45_0==Case) ) {
                    	            alt45=1;
                    	        }


                    	        switch (alt45) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition1903);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt45 >= 1 ) break loop45;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(45, input);
                    	                throw eee;
                    	        }
                    	        cnt45++;
                    	    } while (true);


                    	    pushFollow(FOLLOW_switchCommand_in_switchCondition1906);
                    	    switchCommand();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    pushFollow(FOLLOW_defaultLabel_in_switchCondition1910);
                    defaultLabel();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_switchCommand_in_switchCondition1912);
                    switchCommand();

                    state._fsp--;
                    if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:59: ( ( caseLabel )+ switchCommand )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==Case) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: ( caseLabel )+ switchCommand
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: ( caseLabel )+
                    	    int cnt47=0;
                    	    loop47:
                    	    do {
                    	        int alt47=2;
                    	        int LA47_0 = input.LA(1);

                    	        if ( (LA47_0==Case) ) {
                    	            alt47=1;
                    	        }


                    	        switch (alt47) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition1915);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt47 >= 1 ) break loop47;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(47, input);
                    	                throw eee;
                    	        }
                    	        cnt47++;
                    	    } while (true);


                    	    pushFollow(FOLLOW_switchCommand_in_switchCondition1918);
                    	    switchCommand();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:5: ( ( caseLabel )+ switchCommand )+ ( defaultLabel switchCommand )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:5: ( ( caseLabel )+ switchCommand )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==Case) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:6: ( caseLabel )+ switchCommand
                    	    {
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:6: ( caseLabel )+
                    	    int cnt49=0;
                    	    loop49:
                    	    do {
                    	        int alt49=2;
                    	        int LA49_0 = input.LA(1);

                    	        if ( (LA49_0==Case) ) {
                    	            alt49=1;
                    	        }


                    	        switch (alt49) {
                    	    	case 1 :
                    	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:6: caseLabel
                    	    	    {
                    	    	    pushFollow(FOLLOW_caseLabel_in_switchCondition1927);
                    	    	    caseLabel();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt49 >= 1 ) break loop49;
                    	    	    if (state.backtracking>0) {state.failed=true; return ;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(49, input);
                    	                throw eee;
                    	        }
                    	        cnt49++;
                    	    } while (true);


                    	    pushFollow(FOLLOW_switchCommand_in_switchCondition1930);
                    	    switchCommand();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:33: ( defaultLabel switchCommand )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Default) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:34: defaultLabel switchCommand
                            {
                            pushFollow(FOLLOW_defaultLabel_in_switchCondition1935);
                            defaultLabel();

                            state._fsp--;
                            if (state.failed) return ;

                            pushFollow(FOLLOW_switchCommand_in_switchCondition1937);
                            switchCommand();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition1947); if (state.failed) return ;

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
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:1: caseLabel : 'case' expressionOrArray ':' ;
    public final void caseLabel() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:11: ( 'case' expressionOrArray ':' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:13: 'case' expressionOrArray ':'
            {
            match(input,Case,FOLLOW_Case_in_caseLabel1957); if (state.failed) return ;

            pushFollow(FOLLOW_expressionOrArray_in_caseLabel1959);
            expressionOrArray();

            state._fsp--;
            if (state.failed) return ;

            match(input,Colon,FOLLOW_Colon_in_caseLabel1961); if (state.failed) return ;

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



    // $ANTLR start "switchCommand"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:1: switchCommand : ( block | ( command )+ | 'break' ( BREAK_CONTINUE_NUMBER )? ';' | 'continue' ( BREAK_CONTINUE_NUMBER )? ';' );
    public final void switchCommand() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:2: ( block | ( command )+ | 'break' ( BREAK_CONTINUE_NUMBER )? ';' | 'continue' ( BREAK_CONTINUE_NUMBER )? ';' )
            int alt56=4;
            switch ( input.LA(1) ) {
            case LeftCurlyBrace:
                {
                int LA56_1 = input.LA(2);

                if ( (synpred82_TSPHP()) ) {
                    alt56=1;
                }
                else if ( (synpred84_TSPHP()) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }
                }
                break;
            case Do:
            case For:
            case Foreach:
            case If:
            case MinusMinus:
            case PlusPlus:
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
                alt56=2;
                }
                break;
            case Break:
                {
                alt56=3;
                }
                break;
            case Continue:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: block
                    {
                    pushFollow(FOLLOW_block_in_switchCommand1970);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ( command )+
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ( command )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Do||(LA53_0 >= For && LA53_0 <= Foreach)||LA53_0==If||LA53_0==LeftCurlyBrace||LA53_0==MinusMinus||LA53_0==PlusPlus||(LA53_0 >= Switch && LA53_0 <= While)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: command
                    	    {
                    	    pushFollow(FOLLOW_command_in_switchCommand1975);
                    	    command();

                    	    state._fsp--;
                    	    if (state.failed) return ;

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


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: 'break' ( BREAK_CONTINUE_NUMBER )? ';'
                    {
                    match(input,Break,FOLLOW_Break_in_switchCommand1981); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:12: ( BREAK_CONTINUE_NUMBER )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==BREAK_CONTINUE_NUMBER) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:12: BREAK_CONTINUE_NUMBER
                            {
                            match(input,BREAK_CONTINUE_NUMBER,FOLLOW_BREAK_CONTINUE_NUMBER_in_switchCommand1983); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_switchCommand1986); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: 'continue' ( BREAK_CONTINUE_NUMBER )? ';'
                    {
                    match(input,Continue,FOLLOW_Continue_in_switchCommand1991); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:15: ( BREAK_CONTINUE_NUMBER )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==BREAK_CONTINUE_NUMBER) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:15: BREAK_CONTINUE_NUMBER
                            {
                            match(input,BREAK_CONTINUE_NUMBER,FOLLOW_BREAK_CONTINUE_NUMBER_in_switchCommand1993); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,Semicolon,FOLLOW_Semicolon_in_switchCommand1996); if (state.failed) return ;

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
    // $ANTLR end "switchCommand"



    // $ANTLR start "defaultLabel"
    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:1: defaultLabel : 'default' ':' ;
    public final void defaultLabel() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:2: ( 'default' ':' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: 'default' ':'
            {
            match(input,Default,FOLLOW_Default_in_defaultLabel2006); if (state.failed) return ;

            match(input,Colon,FOLLOW_Colon_in_defaultLabel2008); if (state.failed) return ;

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

    // $ANTLR start synpred61_TSPHP
    public final void synpred61_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:5: ( 'else' blockOrSingleCommand )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:5: 'else' blockOrSingleCommand
        {
        match(input,Else,FOLLOW_Else_in_synpred61_TSPHP1697); if (state.failed) return ;

        pushFollow(FOLLOW_blockOrSingleCommand_in_synpred61_TSPHP1699);
        blockOrSingleCommand();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_TSPHP

    // $ANTLR start synpred62_TSPHP
    public final void synpred62_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: ( block )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: block
        {
        pushFollow(FOLLOW_block_in_synpred62_TSPHP1713);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_TSPHP

    // $ANTLR start synpred78_TSPHP
    public final void synpred78_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: ( ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+ )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: ( ( caseLabel )+ switchCommand )+ defaultLabel switchCommand ( ( caseLabel )+ switchCommand )+
        {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: ( ( caseLabel )+ switchCommand )+
        int cnt72=0;
        loop72:
        do {
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Case) ) {
                alt72=1;
            }


            switch (alt72) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: ( caseLabel )+ switchCommand
        	    {
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: ( caseLabel )+
        	    int cnt71=0;
        	    loop71:
        	    do {
        	        int alt71=2;
        	        int LA71_0 = input.LA(1);

        	        if ( (LA71_0==Case) ) {
        	            alt71=1;
        	        }


        	        switch (alt71) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:5: caseLabel
        	    	    {
        	    	    pushFollow(FOLLOW_caseLabel_in_synpred78_TSPHP1903);
        	    	    caseLabel();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt71 >= 1 ) break loop71;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(71, input);
        	                throw eee;
        	        }
        	        cnt71++;
        	    } while (true);


        	    pushFollow(FOLLOW_switchCommand_in_synpred78_TSPHP1906);
        	    switchCommand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt72 >= 1 ) break loop72;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(72, input);
                    throw eee;
            }
            cnt72++;
        } while (true);


        pushFollow(FOLLOW_defaultLabel_in_synpred78_TSPHP1910);
        defaultLabel();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_switchCommand_in_synpred78_TSPHP1912);
        switchCommand();

        state._fsp--;
        if (state.failed) return ;

        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:59: ( ( caseLabel )+ switchCommand )+
        int cnt74=0;
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Case) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: ( caseLabel )+ switchCommand
        	    {
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: ( caseLabel )+
        	    int cnt73=0;
        	    loop73:
        	    do {
        	        int alt73=2;
        	        int LA73_0 = input.LA(1);

        	        if ( (LA73_0==Case) ) {
        	            alt73=1;
        	        }


        	        switch (alt73) {
        	    	case 1 :
        	    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:60: caseLabel
        	    	    {
        	    	    pushFollow(FOLLOW_caseLabel_in_synpred78_TSPHP1915);
        	    	    caseLabel();

        	    	    state._fsp--;
        	    	    if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    if ( cnt73 >= 1 ) break loop73;
        	    	    if (state.backtracking>0) {state.failed=true; return ;}
        	                EarlyExitException eee =
        	                    new EarlyExitException(73, input);
        	                throw eee;
        	        }
        	        cnt73++;
        	    } while (true);


        	    pushFollow(FOLLOW_switchCommand_in_synpred78_TSPHP1918);
        	    switchCommand();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt74 >= 1 ) break loop74;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(74, input);
                    throw eee;
            }
            cnt74++;
        } while (true);


        }

    }
    // $ANTLR end synpred78_TSPHP

    // $ANTLR start synpred82_TSPHP
    public final void synpred82_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: ( block )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: block
        {
        pushFollow(FOLLOW_block_in_synpred82_TSPHP1970);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_TSPHP

    // $ANTLR start synpred84_TSPHP
    public final void synpred84_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ( ( command )+ )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ( command )+
        {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ( command )+
        int cnt76=0;
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Do||(LA76_0 >= For && LA76_0 <= Foreach)||LA76_0==If||LA76_0==LeftCurlyBrace||LA76_0==MinusMinus||LA76_0==PlusPlus||(LA76_0 >= Switch && LA76_0 <= While)) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: command
        	    {
        	    pushFollow(FOLLOW_command_in_synpred84_TSPHP1975);
        	    command();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt76 >= 1 ) break loop76;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(76, input);
                    throw eee;
            }
            cnt76++;
        } while (true);


        }

    }
    // $ANTLR end synpred84_TSPHP

    // Delegated rules

    public final boolean synpred84_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_TSPHP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_TSPHP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_namespaceSemicolon_in_prog417 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_EOF_in_prog420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceBracket_in_prog425 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_EOF_in_prog428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withoutNamespace_in_prog433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon448 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceSemicolon450 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon452 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_command_in_namespaceSemicolon454 = new BitSet(new long[]{0xFF00408146040002L,0x0000000000000003L});
    public static final BitSet FOLLOW_Namespace_in_namespaceBracket467 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_NamespaceId_in_namespaceBracket469 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket472 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_command_in_namespaceBracket474 = new BitSet(new long[]{0xFF00C08146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_withoutNamespace561 = new BitSet(new long[]{0xFF00408146040002L,0x0000000000000003L});
    public static final BitSet FOLLOW_block_in_command570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_command577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_block589 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_command_in_block591 = new BitSet(new long[]{0xFF00C08146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_block595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignment_in_instruction608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_instruction613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifCondition_in_instruction618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forLoop_in_instruction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreachLoop_in_instruction628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoop_in_instruction633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCondition_in_instruction638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileLoop_in_instruction643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignmentWithoutSemicolon_in_varAssignment655 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_varAssignment657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon668 = new BitSet(new long[]{0x0060237800920000L});
    public static final BitSet FOLLOW_assignmentOperator_in_varAssignmentWithoutSemicolon670 = new BitSet(new long[]{0x0280000481000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionOrArray_in_varAssignmentWithoutSemicolon673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_varAssignmentWithoutSemicolon691 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_incrementDecrement_in_varAssignmentWithoutSemicolon693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOrArray792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_expressionOrArray794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intExpression_in_expression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringExpression_in_expression809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpression_in_expression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatExpression_in_expression819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_varDeclaration833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolDeclaration_in_varDeclaration838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intDeclaration_in_varDeclaration844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatDeclaration_in_varDeclaration850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringDeclaration_in_varDeclaration855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeResource_in_varDeclaration860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_varDeclaration862 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_varDeclaration864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolDeclaration877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration883 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_Equal_in_boolDeclaration887 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolExpression_in_boolDeclaration890 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_boolDeclaration892 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_boolDeclaration898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_boolExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeInt_in_intDeclaration931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration933 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_Equal_in_intDeclaration937 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_intExpression_in_intDeclaration940 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_intDeclaration942 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_intDeclaration948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_intExpression957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeFloat_in_floatDeclaration1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration1190 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_Equal_in_floatDeclaration1194 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_floatExpression_in_floatDeclaration1197 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_floatDeclaration1199 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_floatDeclaration1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_floatExpression1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeString_in_stringDeclaration1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1352 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_Equal_in_stringDeclaration1355 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stringExpression_in_stringDeclaration1358 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_stringDeclaration1362 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_stringDeclaration1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_stringExpression1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_arrayDeclaration1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1559 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_Equal_in_arrayDeclaration1563 = new BitSet(new long[]{0x0200000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_in_arrayDeclaration1566 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VariableId_in_arrayDeclaration1568 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_arrayDeclaration1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBrace_in_array1583 = new BitSet(new long[]{0x0282000481000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_content_in_array1585 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightSquareBrace_in_array1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TypeArray_in_array1594 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_array1596 = new BitSet(new long[]{0x0281000481000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_content_in_array1598 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_array1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_key_in_array_content1614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1616 = new BitSet(new long[]{0x0280000481000100L});
    public static final BitSet FOLLOW_array_value_in_array_content1620 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Comma_in_array_content1624 = new BitSet(new long[]{0x0280000481000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_array_key_in_array_content1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Arrow_in_array_content1629 = new BitSet(new long[]{0x0280000481000100L});
    public static final BitSet FOLLOW_array_value_in_array_content1633 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expression_in_array_key1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableId_in_array_key1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionOrArray_in_array_value1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifCondition1676 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition1678 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolExpression_in_ifCondition1681 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_VariableId_in_ifCondition1685 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_ifCondition1688 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_ifCondition1690 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Else_in_ifCondition1697 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_ifCondition1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_blockOrSingleCommand1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_blockOrSingleCommand1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_forLoop1730 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_forLoop1732 = new BitSet(new long[]{0xFE10408000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_varDeclaration_in_forLoop1736 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_varAssignment_in_forLoop1738 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_Semicolon_in_forLoop1742 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_boolExpression_in_forLoop1746 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_forLoop1749 = new BitSet(new long[]{0x0001408000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varAssignmentWithoutSemicolon_in_forLoop1751 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_forLoop1754 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_loopBlockOrSingleCommand_in_forLoop1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_loopBlockOrSingleCommand1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_loopBlockOrSingleCommand1770 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_BREAK_CONTINUE_NUMBER_in_loopBlockOrSingleCommand1772 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_loopBlockOrSingleCommand1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_loopBlockOrSingleCommand1780 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_BREAK_CONTINUE_NUMBER_in_loopBlockOrSingleCommand1782 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_loopBlockOrSingleCommand1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_foreachLoop1812 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop1814 = new BitSet(new long[]{0x0200000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_array_in_foreachLoop1819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_As_in_foreachLoop1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1824 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_Arrow_in_foreachLoop1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_foreachLoop1829 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop1833 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_loopBlockOrSingleCommand_in_foreachLoop1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_whileLoop1844 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop1846 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_boolExpression_in_whileLoop1848 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_whileLoop1850 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_loopBlockOrSingleCommand_in_whileLoop1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_doWhileLoop1862 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_loopBlockOrSingleCommand_in_doWhileLoop1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_doWhileLoop1866 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop1868 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_boolExpression_in_doWhileLoop1870 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop1872 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_doWhileLoop1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_switchCondition1884 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VariableId_in_switchCondition1888 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RightParanthesis_in_switchCondition1890 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition1892 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition1903 = new BitSet(new long[]{0xFF00408146044600L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_switchCondition1906 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_defaultLabel_in_switchCondition1910 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_switchCondition1912 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition1915 = new BitSet(new long[]{0xFF00408146044600L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_switchCondition1918 = new BitSet(new long[]{0x0000800000000400L});
    public static final BitSet FOLLOW_caseLabel_in_switchCondition1927 = new BitSet(new long[]{0xFF00408146044600L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_switchCondition1930 = new BitSet(new long[]{0x0000800000010400L});
    public static final BitSet FOLLOW_defaultLabel_in_switchCondition1935 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_switchCondition1937 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_caseLabel1957 = new BitSet(new long[]{0x0280000481000100L});
    public static final BitSet FOLLOW_expressionOrArray_in_caseLabel1959 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_caseLabel1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_switchCommand1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_switchCommand1975 = new BitSet(new long[]{0xFF00408146040002L,0x0000000000000003L});
    public static final BitSet FOLLOW_Break_in_switchCommand1981 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_BREAK_CONTINUE_NUMBER_in_switchCommand1983 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_switchCommand1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_switchCommand1991 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_BREAK_CONTINUE_NUMBER_in_switchCommand1993 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_switchCommand1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_defaultLabel2006 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_defaultLabel2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_synpred61_TSPHP1697 = new BitSet(new long[]{0xFF00408146040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_blockOrSingleCommand_in_synpred61_TSPHP1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred62_TSPHP1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseLabel_in_synpred78_TSPHP1903 = new BitSet(new long[]{0xFF00408146044600L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_synpred78_TSPHP1906 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_defaultLabel_in_synpred78_TSPHP1910 = new BitSet(new long[]{0xFF00408146044200L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_synpred78_TSPHP1912 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_caseLabel_in_synpred78_TSPHP1915 = new BitSet(new long[]{0xFF00408146044600L,0x0000000000000003L});
    public static final BitSet FOLLOW_switchCommand_in_synpred78_TSPHP1918 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_block_in_synpred82_TSPHP1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_synpred84_TSPHP1975 = new BitSet(new long[]{0xFF00408146040002L,0x0000000000000003L});

}