// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 00:04:02

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

@SuppressWarnings("all")
public class TSPHPParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Class", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Else", "Equal", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "NotEqual", "NotEqualAlternative", "NotIdentical", "OCTAL", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "VariableId", "Void", "While", "Whitespace", "'echo'"
	};

	public static final int EOF=-1;
	public static final int T__108=108;
	public static final int Abstract=4;
	public static final int Arrow=5;
	public static final int As=6;
	public static final int Assign=7;
	public static final int At=8;
	public static final int BINARY=9;
	public static final int Backslash=10;
	public static final int BitwiseAnd=11;
	public static final int BitwiseAndEqual=12;
	public static final int BitwiseNot=13;
	public static final int BitwiseOr=14;
	public static final int BitwiseOrEqual=15;
	public static final int BitwiseXor=16;
	public static final int BitwiseXorEqual=17;
	public static final int Bool=18;
	public static final int Break=19;
	public static final int Case=20;
	public static final int Class=21;
	public static final int Colon=22;
	public static final int Comma=23;
	public static final int Comment=24;
	public static final int Const=25;
	public static final int Continue=26;
	public static final int DECIMAL=27;
	public static final int Default=28;
	public static final int Divide=29;
	public static final int DivideEqual=30;
	public static final int Do=31;
	public static final int Dolar=32;
	public static final int Dot=33;
	public static final int DotEqual=34;
	public static final int EXPONENT=35;
	public static final int Else=36;
	public static final int Equal=37;
	public static final int Extends=38;
	public static final int Final=39;
	public static final int Float=40;
	public static final int For=41;
	public static final int Foreach=42;
	public static final int Function=43;
	public static final int GreaterEqualThan=44;
	public static final int GreaterThan=45;
	public static final int HEXADECIMAL=46;
	public static final int Identical=47;
	public static final int Identifier=48;
	public static final int If=49;
	public static final int Implements=50;
	public static final int Int=51;
	public static final int LeftCurlyBrace=52;
	public static final int LeftParanthesis=53;
	public static final int LeftSquareBrace=54;
	public static final int LessEqualThan=55;
	public static final int LessThan=56;
	public static final int LogicAnd=57;
	public static final int LogicAndWeak=58;
	public static final int LogicNot=59;
	public static final int LogicOr=60;
	public static final int LogicOrWeak=61;
	public static final int LogicXorWeak=62;
	public static final int Minus=63;
	public static final int MinusEqual=64;
	public static final int MinusMinus=65;
	public static final int Modulo=66;
	public static final int ModuloEqual=67;
	public static final int Multiply=68;
	public static final int MultiplyEqual=69;
	public static final int Namespace=70;
	public static final int NotEqual=71;
	public static final int NotEqualAlternative=72;
	public static final int NotIdentical=73;
	public static final int OCTAL=74;
	public static final int Plus=75;
	public static final int PlusEqual=76;
	public static final int PlusPlus=77;
	public static final int Private=78;
	public static final int Protected=79;
	public static final int Public=80;
	public static final int QuestionMark=81;
	public static final int Return=82;
	public static final int RightCurlyBrace=83;
	public static final int RightParanthesis=84;
	public static final int RightSquareBrace=85;
	public static final int STRING_DOUBLE_QUOTED=86;
	public static final int STRING_SINGLE_QUOTED=87;
	public static final int Semicolon=88;
	public static final int ShiftLeft=89;
	public static final int ShiftLeftEqual=90;
	public static final int ShiftRight=91;
	public static final int ShiftRightEqual=92;
	public static final int Static=93;
	public static final int String=94;
	public static final int Switch=95;
	public static final int TypeArray=96;
	public static final int TypeBool=97;
	public static final int TypeBoolean=98;
	public static final int TypeFloat=99;
	public static final int TypeInt=100;
	public static final int TypeObject=101;
	public static final int TypeResource=102;
	public static final int TypeString=103;
	public static final int VariableId=104;
	public static final int Void=105;
	public static final int While=106;
	public static final int Whitespace=107;

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

	@Override public String[] getTokenNames() { return TSPHPParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }



	// $ANTLR start "prog"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog761);
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

					match(input,EOF,FOLLOW_EOF_in_prog764); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog769);
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

					match(input,EOF,FOLLOW_EOF_in_prog772); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:158:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog777);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog779); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon792); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon794);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon796); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Class||LA4_0==Do||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||LA4_0==If||LA4_0==LeftCurlyBrace||LA4_0==MinusMinus||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While||LA4_0==108) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:162:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon798);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket811); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket813);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket816); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Class||LA6_0==Do||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||LA6_0==If||LA6_0==LeftCurlyBrace||LA6_0==MinusMinus||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While||LA6_0==108) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket818);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket821); if (state.failed) return ;
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



	// $ANTLR start "namespaceId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId887); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId890); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId892); if (state.failed) return ;
					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "namespaceId"



	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Class||LA8_0==Do||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||LA8_0==If||LA8_0==LeftCurlyBrace||LA8_0==MinusMinus||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While||LA8_0==108) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace905);
					statement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(8, input);
						throw eee;
				}
				cnt8++;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:1: statement : ( definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:2: ( definition | instructionWithoutBreakContinue )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Abstract||LA9_0==Class||LA9_0==Final||LA9_0==Function) ) {
				alt9=1;
			}
			else if ( (LA9_0==Do||(LA9_0 >= For && LA9_0 <= Foreach)||LA9_0==If||LA9_0==LeftCurlyBrace||LA9_0==MinusMinus||LA9_0==PlusPlus||LA9_0==Return||(LA9_0 >= Switch && LA9_0 <= VariableId)||LA9_0==While||LA9_0==108) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement916);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement921);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:1: definition : ( classDeclaration | functionDeclaration );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:2: ( classDeclaration | functionDeclaration )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Abstract||LA10_0==Class||LA10_0==Final) ) {
				alt10=1;
			}
			else if ( (LA10_0==Function) ) {
				alt10=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition932);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition937);
					functionDeclaration();
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
	// $ANTLR end "definition"



	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:4: ( 'abstract' | 'final' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Abstract||LA11_0==Final) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
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
					break;

			}

			match(input,Class,FOLLOW_Class_in_classDeclaration956); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration958); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:45: ( extendsDeclaration )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Extends) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration960);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:65: ( implementsDeclaration )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Implements) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration963);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration966); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:92: ( classBody )+
			int cnt14=0;
			loop14:
			do {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Abstract||LA14_0==Const||LA14_0==Final||LA14_0==Function||(LA14_0 >= Private && LA14_0 <= Public)||LA14_0==Static) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration968);
					classBody();
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration971); if (state.failed) return ;
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
	// $ANTLR end "classDeclaration"



	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration985); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration987);
			identifierList();
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
	// $ANTLR end "extendsDeclaration"



	// $ANTLR start "identifierList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList996); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:15: ( ',' Identifier )*
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList999); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1001); if (state.failed) return ;
					}
					break;

				default :
					break loop15;
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
	// $ANTLR end "identifierList"



	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1012); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1014);
			identifierList();
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
	// $ANTLR end "implementsDeclaration"



	// $ANTLR start "classBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:1: classBody : ( constantDeclaration | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:2: ( constantDeclaration | attributeDeclaration | methodDeclaration )
			int alt16=3;
			switch ( input.LA(1) ) {
			case Const:
				{
				alt16=1;
				}
				break;
			case Static:
				{
				switch ( input.LA(2) ) {
				case Protected:
				case Public:
					{
					int LA16_3 = input.LA(3);
					if ( ((LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
						alt16=2;
					}
					else if ( (LA16_3==Function) ) {
						alt16=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 16, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Private:
					{
					int LA16_4 = input.LA(3);
					if ( ((LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
						alt16=2;
					}
					else if ( (LA16_4==Function) ) {
						alt16=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 16, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Final:
				case Function:
					{
					alt16=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Protected:
			case Public:
				{
				int LA16_3 = input.LA(2);
				if ( ((LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
					alt16=2;
				}
				else if ( (LA16_3==Function) ) {
					alt16=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Private:
				{
				int LA16_4 = input.LA(2);
				if ( ((LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
					alt16=2;
				}
				else if ( (LA16_4==Function) ) {
					alt16=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Abstract:
			case Final:
			case Function:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_classBody1024);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1029);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1035);
					methodDeclaration();
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
	// $ANTLR end "classBody"



	// $ANTLR start "constantDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:1: constantDeclaration : 'const' primitiveTypes constDeclarationList ';' ;
	public final void constantDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:20: ( 'const' primitiveTypes constDeclarationList ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:22: 'const' primitiveTypes constDeclarationList ';'
			{
			match(input,Const,FOLLOW_Const_in_constantDeclaration1044); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constantDeclaration1046);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constDeclarationList_in_constantDeclaration1048);
			constDeclarationList();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_constantDeclaration1050); if (state.failed) return ;
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
	// $ANTLR end "constantDeclaration"



	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:1: constDeclarationList : constantAssignment ( ',' constantAssignment )* ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:2: ( constantAssignment ( ',' constantAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:5: constantAssignment ( ',' constantAssignment )*
			{
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1060);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:24: ( ',' constantAssignment )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Comma) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:25: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1063); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1065);
					constantAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "constDeclarationList"



	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:1: constantAssignment : Identifier '=' unaryAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:2: ( Identifier '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:4: Identifier '=' unaryAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1075); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1078); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_constantAssignment1080);
			unaryAtom();
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
	// $ANTLR end "constantAssignment"



	// $ANTLR start "variableDeclarationListWithoutVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1089);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:24: ( ',' variableAssignment )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1092); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1094);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "variableDeclarationListWithoutVariableId"



	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: ( 'static' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Static) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1106); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1109);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1111);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1113); if (state.failed) return ;
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
	// $ANTLR end "attributeDeclaration"



	// $ANTLR start "accessor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:9: ( accessorWithoutPrivate | 'private' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= Protected && LA20_0 <= Public)) ) {
				alt20=1;
			}
			else if ( (LA20_0==Private) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1121);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1126); if (state.failed) return ;
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
	// $ANTLR end "accessor"



	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:2: ( 'protected' | 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
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
	// $ANTLR end "accessorWithoutPrivate"



	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1149);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:24: ( ',' ( variableAssignment | VariableId ) )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1152); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:29: ( variableAssignment | VariableId )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==VariableId) ) {
						int LA21_1 = input.LA(2);
						if ( (LA21_1==Assign||LA21_1==BitwiseAndEqual||LA21_1==BitwiseOrEqual||LA21_1==BitwiseXorEqual||LA21_1==DivideEqual||LA21_1==DotEqual||(LA21_1 >= MinusEqual && LA21_1 <= MinusMinus)||LA21_1==ModuloEqual||LA21_1==MultiplyEqual||(LA21_1 >= PlusEqual && LA21_1 <= PlusPlus)||LA21_1==ShiftLeftEqual||LA21_1==ShiftRightEqual) ) {
							alt21=1;
						}
						else if ( (LA21_1==Comma||LA21_1==Semicolon) ) {
							alt21=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 21, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA21_0==MinusMinus||LA21_0==PlusPlus) ) {
						alt21=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1155);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1157); if (state.failed) return ;
							}
							break;

					}

					}
					break;

				default :
					break loop22;
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
	// $ANTLR end "variableDeclarationListInclVariableId"



	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Abstract) ) {
				alt28=1;
			}
			else if ( (LA28_0==Final||LA28_0==Function||(LA28_0 >= Private && LA28_0 <= Public)||LA28_0==Static) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1172); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:34: ( accessorWithoutPrivate )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1174);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
					int alt26=3;
					switch ( input.LA(1) ) {
					case Static:
						{
						alt26=1;
						}
						break;
					case Final:
						{
						alt26=2;
						}
						break;
					case Function:
					case Private:
					case Protected:
					case Public:
						{
						alt26=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1188); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:15: ( 'final' )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==Final) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1190); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1198); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:14: ( 'static' )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==Static) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1200); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:6: ( accessor )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= Private && LA27_0 <= Public)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1214);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1221);
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
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:1: functionDeclaration : 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:2: ( 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration1232); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclaration1234);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration1236); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclaration1238); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:41: ( paramList )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= TypeArray && LA29_0 <= TypeString)) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclaration1240);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclaration1243); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1245); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:60: ( instructionWithoutBreakContinue )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Do||(LA30_0 >= For && LA30_0 <= Foreach)||LA30_0==If||LA30_0==LeftCurlyBrace||LA30_0==MinusMinus||LA30_0==PlusPlus||LA30_0==Return||(LA30_0 >= Switch && LA30_0 <= VariableId)||LA30_0==While||LA30_0==108) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:60: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1247);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop30;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1250); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: returnType : ( primitiveTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( primitiveTypes | 'void' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( ((LA31_0 >= TypeArray && LA31_0 <= TypeString)) ) {
				alt31=1;
			}
			else if ( (LA31_0==Void) ) {
				alt31=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_returnType1260);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:21: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1264); if (state.failed) return ;
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



	// $ANTLR start "primitiveTypesWithoutResource"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:1: primitiveTypesWithoutResource : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeObject );
	public final void primitiveTypesWithoutResource() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeObject )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( (input.LA(1) >= TypeArray && input.LA(1) <= TypeObject)||input.LA(1)==TypeString ) {
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
	// $ANTLR end "primitiveTypesWithoutResource"



	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: primitiveTypes : ( primitiveTypesWithoutResource | TypeResource );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:2: ( primitiveTypesWithoutResource | TypeResource )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= TypeArray && LA32_0 <= TypeObject)||LA32_0==TypeString) ) {
				alt32=1;
			}
			else if ( (LA32_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:4: primitiveTypesWithoutResource
					{
					pushFollow(FOLLOW_primitiveTypesWithoutResource_in_primitiveTypes1315);
					primitiveTypesWithoutResource();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes1320); if (state.failed) return ;
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
	// $ANTLR end "primitiveTypes"



	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= TypeArray && LA37_0 <= TypeObject)||LA37_0==TypeString) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt37=1;
						}
						break;
					case Comma:
						{
						int LA37_5 = input.LA(4);
						if ( ((LA37_5 >= TypeArray && LA37_5 <= TypeObject)||LA37_5==TypeString) ) {
							int LA37_8 = input.LA(5);
							if ( (LA37_8==VariableId) ) {
								int LA37_10 = input.LA(6);
								if ( (LA37_10==EOF||LA37_10==Comma||LA37_10==RightParanthesis) ) {
									alt37=2;
								}
								else if ( (LA37_10==Assign) ) {
									alt37=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 37, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 37, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA37_5==TypeResource) ) {
							int LA37_9 = input.LA(5);
							if ( (LA37_9==VariableId) ) {
								int LA37_10 = input.LA(6);
								if ( (LA37_10==EOF||LA37_10==Comma||LA37_10==RightParanthesis) ) {
									alt37=2;
								}
								else if ( (LA37_10==Assign) ) {
									alt37=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 37, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 37, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 37, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case EOF:
					case RightParanthesis:
						{
						alt37=2;
						}
						break;
					case TypeArray:
					case TypeBool:
					case TypeBoolean:
					case TypeFloat:
					case TypeInt:
					case TypeObject:
					case TypeResource:
					case TypeString:
						{
						alt37=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 37, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA37_0==TypeResource) ) {
				int LA37_2 = input.LA(2);
				if ( (LA37_2==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt37=1;
						}
						break;
					case Comma:
						{
						int LA37_5 = input.LA(4);
						if ( ((LA37_5 >= TypeArray && LA37_5 <= TypeObject)||LA37_5==TypeString) ) {
							int LA37_8 = input.LA(5);
							if ( (LA37_8==VariableId) ) {
								int LA37_10 = input.LA(6);
								if ( (LA37_10==EOF||LA37_10==Comma||LA37_10==RightParanthesis) ) {
									alt37=2;
								}
								else if ( (LA37_10==Assign) ) {
									alt37=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 37, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 37, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA37_5==TypeResource) ) {
							int LA37_9 = input.LA(5);
							if ( (LA37_9==VariableId) ) {
								int LA37_10 = input.LA(6);
								if ( (LA37_10==EOF||LA37_10==Comma||LA37_10==RightParanthesis) ) {
									alt37=2;
								}
								else if ( (LA37_10==Assign) ) {
									alt37=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 37, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 37, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 37, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case EOF:
					case RightParanthesis:
						{
						alt37=2;
						}
						break;
					case TypeArray:
					case TypeBool:
					case TypeBoolean:
					case TypeFloat:
					case TypeInt:
					case TypeObject:
					case TypeResource:
					case TypeString:
						{
						alt37=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 37, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1332);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:29: ( ',' paramDeclarationOptional )*
					loop33:
					do {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==Comma) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1335); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1337);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop33;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1344);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:21: ( ',' paramDeclaration )*
					loop34:
					do {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==Comma) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1347); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1349);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop34;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1356);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:21: ( paramDeclaration ',' )*
					loop35:
					do {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( ((LA35_0 >= TypeArray && LA35_0 <= TypeString)) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1359);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1361); if (state.failed) return ;
							}
							break;

						default :
							break loop35;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:45: ( ',' paramDeclarationOptional )+
					int cnt36=0;
					loop36:
					do {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==Comma) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1366); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1368);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(36, input);
								throw eee;
						}
						cnt36++;
					} while (true);

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
	// $ANTLR end "paramList"



	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: paramDeclaration : primitiveTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( primitiveTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: primitiveTypes VariableId
			{
			pushFollow(FOLLOW_primitiveTypes_in_paramDeclaration1382);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1384); if (state.failed) return ;
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



	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1394);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1397); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1399);
			unaryAtom();
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
	// $ANTLR end "paramDeclarationOptional"



	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LeftCurlyBrace) ) {
				alt39=1;
			}
			else if ( (LA39_0==Do||(LA39_0 >= For && LA39_0 <= Foreach)||LA39_0==If||LA39_0==MinusMinus||LA39_0==PlusPlus||LA39_0==Return||(LA39_0 >= Switch && LA39_0 <= VariableId)||LA39_0==While||LA39_0==108) ) {
				alt39=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1421); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:8: ( instructionWithoutBreakContinue )+
					int cnt38=0;
					loop38:
					do {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==Do||(LA38_0 >= For && LA38_0 <= Foreach)||LA38_0==If||LA38_0==LeftCurlyBrace||LA38_0==MinusMinus||LA38_0==PlusPlus||LA38_0==Return||(LA38_0 >= Switch && LA38_0 <= VariableId)||LA38_0==While||LA38_0==108) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1423);
							instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt38 >= 1 ) break loop38;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(38, input);
								throw eee;
						}
						cnt38++;
					} while (true);

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1427); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1432);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt42=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt42=1;
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
			case TypeObject:
			case TypeResource:
			case TypeString:
			case VariableId:
			case While:
			case 108:
				{
				alt42=2;
				}
				break;
			case Break:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1443); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:8: ( instructionInclBreakContinue )+
					int cnt40=0;
					loop40:
					do {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==Break||LA40_0==Continue||LA40_0==Do||(LA40_0 >= For && LA40_0 <= Foreach)||LA40_0==If||LA40_0==LeftCurlyBrace||LA40_0==MinusMinus||LA40_0==PlusPlus||LA40_0==Return||(LA40_0 >= Switch && LA40_0 <= VariableId)||LA40_0==While||LA40_0==108) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1445);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(40, input);
								throw eee;
						}
						cnt40++;
					} while (true);

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1449); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1454);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:25: ( Int )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==Int) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1465); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1468); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' | 'echo' expressionList ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' | 'echo' expressionList ';' )
			int alt44=10;
			switch ( input.LA(1) ) {
			case MinusMinus:
			case PlusPlus:
			case VariableId:
				{
				alt44=1;
				}
				break;
			case TypeArray:
			case TypeBool:
			case TypeBoolean:
			case TypeFloat:
			case TypeInt:
			case TypeObject:
			case TypeResource:
			case TypeString:
				{
				alt44=2;
				}
				break;
			case If:
				{
				alt44=3;
				}
				break;
			case Switch:
				{
				alt44=4;
				}
				break;
			case For:
				{
				alt44=5;
				}
				break;
			case Foreach:
				{
				alt44=6;
				}
				break;
			case While:
				{
				alt44=7;
				}
				break;
			case Do:
				{
				alt44=8;
				}
				break;
			case Return:
				{
				alt44=9;
				}
				break;
			case 108:
				{
				alt44=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1480);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1482); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1487);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1489); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1494);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1499);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1504);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1509);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1514);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1519);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1524); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:13: ( expression )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==At||LA43_0==BitwiseNot||LA43_0==Bool||LA43_0==Float||LA43_0==Int||(LA43_0 >= LeftParanthesis && LA43_0 <= LeftSquareBrace)||LA43_0==LogicNot||LA43_0==Minus||LA43_0==MinusMinus||LA43_0==Plus||LA43_0==PlusPlus||LA43_0==String||LA43_0==TypeArray||LA43_0==VariableId) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1526);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1529); if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:4: 'echo' expressionList ';'
					{
					match(input,108,FOLLOW_108_in_instruction1534); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1536);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1538); if (state.failed) return ;
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



	// $ANTLR start "expressionList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:1: expressionList : expression ( ',' expression )? ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:2: ( expression ( ',' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: expression ( ',' expression )?
			{
			pushFollow(FOLLOW_expression_in_expressionList1550);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:15: ( ',' expression )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Comma) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1553); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1555);
					expression();
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
	// $ANTLR end "expressionList"



	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==VariableId) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==MinusMinus||LA46_1==PlusPlus) ) {
					alt46=2;
				}
				else if ( (LA46_1==Assign||LA46_1==BitwiseAndEqual||LA46_1==BitwiseOrEqual||LA46_1==BitwiseXorEqual||LA46_1==DivideEqual||LA46_1==DotEqual||LA46_1==MinusEqual||LA46_1==ModuloEqual||LA46_1==MultiplyEqual||LA46_1==PlusEqual||LA46_1==ShiftLeftEqual||LA46_1==ShiftRightEqual) ) {
					alt46=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA46_0==MinusMinus||LA46_0==PlusPlus) ) {
				alt46=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1566); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1568);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1570);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1575);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1580);
					preIncrementDecrement();
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
	// $ANTLR end "variableAssignment"



	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
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



	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement1658); if (state.failed) return ;
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
	// $ANTLR end "postIncrementDecrement"



	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement1680); if (state.failed) return ;
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
	// $ANTLR end "preIncrementDecrement"



	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:1: variableDeclaration : primitiveTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:2: ( primitiveTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: primitiveTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_primitiveTypes_in_variableDeclaration1692);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1694); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:30: ( '=' expression )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Assign) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:31: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration1697); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration1699);
					expression();
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
	// $ANTLR end "variableDeclaration"



	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression1711);
			logicOrWeak();
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
	// $ANTLR end "expression"



	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1720);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:17: ( 'or' logicXorWeak )*
			loop48:
			do {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==LogicOrWeak) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak1723); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1725);
					logicXorWeak();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop48;
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
	// $ANTLR end "logicOrWeak"



	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1738);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:17: ( 'xor' logicAndWeak )*
			loop49:
			do {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==LogicXorWeak) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak1741); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1743);
					logicAndWeak();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop49;
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
	// $ANTLR end "logicXorWeak"



	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak1756);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:15: ( 'and' assignment )*
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==LogicAndWeak) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak1759); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak1761);
					assignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop50;
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
	// $ANTLR end "logicAndWeak"



	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment1772);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:12: ( assignmentOperator ternary )*
			loop51:
			do {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Assign||LA51_0==BitwiseAndEqual||LA51_0==BitwiseOrEqual||LA51_0==BitwiseXorEqual||LA51_0==DivideEqual||LA51_0==DotEqual||LA51_0==MinusEqual||LA51_0==ModuloEqual||LA51_0==MultiplyEqual||LA51_0==PlusEqual||LA51_0==ShiftLeftEqual||LA51_0==ShiftRightEqual) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment1775);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment1777);
					ternary();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop51;
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
	// $ANTLR end "assignment"



	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary1787);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:19: ( '?' expression ':' logicOr )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==QuestionMark) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary1790); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary1792);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary1794); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary1796);
					logicOr();
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
	// $ANTLR end "ternary"



	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr1806);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:20: ( '||' logicAnd )*
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==LogicOr) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr1809); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr1811);
					logicAnd();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop53;
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
	// $ANTLR end "logicOr"



	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd1820);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:21: ( '&&' bitwiseOr )*
			loop54:
			do {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==LogicAnd) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd1823); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd1825);
					bitwiseOr();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop54;
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
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1836);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:15: ( '|' bitwiseXor )*
			loop55:
			do {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==BitwiseOr) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr1839); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1841);
					bitwiseXor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop55;
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
	// $ANTLR end "bitwiseOr"



	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1852);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:15: ( '^' bitwiseAnd )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==BitwiseXor) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor1855); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1857);
					bitwiseAnd();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop56;
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
	// $ANTLR end "bitwiseXor"



	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd1868);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:13: ( '&' equality )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==BitwiseAnd) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd1871); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd1873);
					equality();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop57;
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
	// $ANTLR end "bitwiseAnd"



	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality1882);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:22: ( equalityOperator comparison )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==Equal||LA58_0==Identical||(LA58_0 >= NotEqual && LA58_0 <= NotIdentical)) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality1885);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality1887);
					comparison();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop58;
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
	// $ANTLR end "equality"



	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
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
	// $ANTLR end "equalityOperator"



	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison1929);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:17: ( comparisonOperator bitwiseShift )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= GreaterEqualThan && LA59_0 <= GreaterThan)||(LA59_0 >= LessEqualThan && LA59_0 <= LessThan)) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison1932);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison1934);
					bitwiseShift();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop59;
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
	// $ANTLR end "comparison"



	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
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
	// $ANTLR end "comparisonOperator"



	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift1970);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==ShiftLeft||LA60_0==ShiftRight) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:43: ( '<<' | '>>' ) termOrStringConcatenation
					{
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift1979);
					termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop60;
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
	// $ANTLR end "bitwiseShift"



	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation1989);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:36: ( ( '+' | '-' | '.' ) factor )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==Dot||LA61_0==Minus||LA61_0==Plus) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:37: ( '+' | '-' | '.' ) factor
					{
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2000);
					factor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop61;
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
	// $ANTLR end "termOrStringConcatenation"



	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2010);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Divide||LA62_0==Modulo||LA62_0==Multiply) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:20: ( '*' | '/' | '%' ) logicNot
					{
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2021);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop62;
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
	// $ANTLR end "factor"



	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:9: ( '!' logicNot | castOrBitwiseNotOrAt )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==LogicNot) ) {
				alt63=1;
			}
			else if ( (LA63_0==At||LA63_0==BitwiseNot||LA63_0==Bool||LA63_0==Float||LA63_0==Int||(LA63_0 >= LeftParanthesis && LA63_0 <= LeftSquareBrace)||LA63_0==Minus||LA63_0==MinusMinus||LA63_0==Plus||LA63_0==PlusPlus||LA63_0==String||LA63_0==TypeArray||LA63_0==VariableId) ) {
				alt63=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2030); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2032);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot2037);
					castOrBitwiseNotOrAt();
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
	// $ANTLR end "logicNot"



	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:2: ( ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt64=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				switch ( input.LA(2) ) {
				case TypeArray:
					{
					int LA64_5 = input.LA(3);
					if ( (LA64_5==LeftParanthesis) ) {
						alt64=4;
					}
					else if ( (LA64_5==RightParanthesis) ) {
						alt64=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 64, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case At:
				case BitwiseNot:
				case Bool:
				case Float:
				case Int:
				case LeftParanthesis:
				case LeftSquareBrace:
				case LogicNot:
				case Minus:
				case MinusMinus:
				case Plus:
				case PlusPlus:
				case String:
				case VariableId:
					{
					alt64=4;
					}
					break;
				case TypeBool:
				case TypeBoolean:
				case TypeFloat:
				case TypeInt:
				case TypeObject:
				case TypeString:
					{
					alt64=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt64=2;
				}
				break;
			case At:
				{
				alt64=3;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftSquareBrace:
			case Minus:
			case MinusMinus:
			case Plus:
			case PlusPlus:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt64=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: ( '(' primitiveTypesWithoutResource ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:5: '(' primitiveTypesWithoutResource ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2051); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesWithoutResource_in_castOrBitwiseNotOrAt2053);
					primitiveTypesWithoutResource();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2055); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2058);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2063); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2065);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2070); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2072);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2077);
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
	// $ANTLR end "castOrBitwiseNotOrAt"



	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | unaryAtom );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( postIncrementDecrement | preIncrementDecrement | unaryAtom )
			int alt65=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA65_1 = input.LA(2);
				if ( (LA65_1==MinusMinus||LA65_1==PlusPlus) ) {
					alt65=1;
				}
				else if ( (LA65_1==EOF||LA65_1==Arrow||LA65_1==Assign||(LA65_1 >= BitwiseAnd && LA65_1 <= BitwiseAndEqual)||(LA65_1 >= BitwiseOr && LA65_1 <= BitwiseXorEqual)||(LA65_1 >= Colon && LA65_1 <= Comma)||(LA65_1 >= Divide && LA65_1 <= DivideEqual)||(LA65_1 >= Dot && LA65_1 <= DotEqual)||LA65_1==Equal||(LA65_1 >= GreaterEqualThan && LA65_1 <= GreaterThan)||LA65_1==Identical||(LA65_1 >= LessEqualThan && LA65_1 <= LogicAndWeak)||(LA65_1 >= LogicOr && LA65_1 <= MinusEqual)||(LA65_1 >= Modulo && LA65_1 <= MultiplyEqual)||(LA65_1 >= NotEqual && LA65_1 <= NotIdentical)||(LA65_1 >= Plus && LA65_1 <= PlusEqual)||LA65_1==QuestionMark||(LA65_1 >= RightParanthesis && LA65_1 <= RightSquareBrace)||(LA65_1 >= Semicolon && LA65_1 <= ShiftRightEqual)) ) {
					alt65=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case MinusMinus:
			case PlusPlus:
				{
				alt65=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case Plus:
			case String:
			case TypeArray:
				{
				alt65=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2089);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2094);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_incrementDecrement2099);
					unaryAtom();
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
	// $ANTLR end "incrementDecrement"



	// $ANTLR start "unaryAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:1: unaryAtom : ( '+' atom | '-' atom | atom );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:2: ( '+' atom | '-' atom | atom )
			int alt66=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt66=1;
				}
				break;
			case Minus:
				{
				alt66=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt66=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: '+' atom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2110); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2112);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: '-' atom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2117); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2119);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: atom
					{
					pushFollow(FOLLOW_atom_in_unaryAtom2124);
					atom();
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
	// $ANTLR end "unaryAtom"



	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:1: atom : ( '(' expression ')' | primitiveAtom | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:6: ( '(' expression ')' | primitiveAtom | VariableId )
			int alt67=3;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt67=1;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftSquareBrace:
			case String:
			case TypeArray:
				{
				alt67=2;
				}
				break;
			case VariableId:
				{
				alt67=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2136); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2138);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2140); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2145);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2150); if (state.failed) return ;
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
	// $ANTLR end "atom"



	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt68=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt68=1;
				}
				break;
			case Minus:
				{
				alt68=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftSquareBrace:
			case String:
			case TypeArray:
				{
				alt68=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2164); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2166);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2171); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2173);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2178);
					primitiveAtom();
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
	// $ANTLR end "unaryPrimitiveAtom"



	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: primitiveAtom : ( Bool | Int | Float | String | array );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:2: ( Bool | Int | Float | String | array )
			int alt69=5;
			switch ( input.LA(1) ) {
			case Bool:
				{
				alt69=1;
				}
				break;
			case Int:
				{
				alt69=2;
				}
				break;
			case Float:
				{
				alt69=3;
				}
				break;
			case String:
				{
				alt69=4;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt69=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:4: Bool
					{
					match(input,Bool,FOLLOW_Bool_in_primitiveAtom2189); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:4: Int
					{
					match(input,Int,FOLLOW_Int_in_primitiveAtom2194); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:4: Float
					{
					match(input,Float,FOLLOW_Float_in_primitiveAtom2199); if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:4: String
					{
					match(input,String,FOLLOW_String_in_primitiveAtom2204); if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:4: array
					{
					pushFollow(FOLLOW_array_in_primitiveAtom2209);
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
	// $ANTLR end "primitiveAtom"



	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==LeftSquareBrace) ) {
				alt72=1;
			}
			else if ( (LA72_0==TypeArray) ) {
				alt72=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array2671); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:13: ( array_content )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==At||LA70_0==BitwiseNot||LA70_0==Bool||LA70_0==Float||LA70_0==Int||(LA70_0 >= LeftParanthesis && LA70_0 <= LeftSquareBrace)||LA70_0==LogicNot||LA70_0==Minus||LA70_0==MinusMinus||LA70_0==Plus||LA70_0==PlusPlus||LA70_0==String||LA70_0==TypeArray||LA70_0==VariableId) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2673);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array2676); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array2682); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array2684); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:18: ( array_content )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==At||LA71_0==BitwiseNot||LA71_0==Bool||LA71_0==Float||LA71_0==Int||(LA71_0 >= LeftParanthesis && LA71_0 <= LeftSquareBrace)||LA71_0==LogicNot||LA71_0==Minus||LA71_0==MinusMinus||LA71_0==Plus||LA71_0==PlusPlus||LA71_0==String||LA71_0==TypeArray||LA71_0==VariableId) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2686);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array2689); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:4: ( expression '=>' )?
			int alt73=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA73_1 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA73_2 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA73_3 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case At:
					{
					int LA73_4 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case VariableId:
					{
					int LA73_5 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA73_6 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case Plus:
					{
					int LA73_7 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case Minus:
					{
					int LA73_8 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case Bool:
					{
					int LA73_9 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case Int:
					{
					int LA73_10 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case Float:
					{
					int LA73_11 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case String:
					{
					int LA73_12 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA73_13 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA73_14 = input.LA(2);
					if ( (synpred130_TSPHP()) ) {
						alt73=1;
					}
					}
					break;
			}
			switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content2702);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content2704); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content2708);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:35: ( ',' ( expression '=>' )? expression )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==Comma) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content2712); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:40: ( expression '=>' )?
					int alt74=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA74_1 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA74_2 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA74_3 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case At:
							{
							int LA74_4 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case VariableId:
							{
							int LA74_5 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA74_6 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case Plus:
							{
							int LA74_7 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case Minus:
							{
							int LA74_8 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case Bool:
							{
							int LA74_9 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case Int:
							{
							int LA74_10 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case Float:
							{
							int LA74_11 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case String:
							{
							int LA74_12 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA74_13 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA74_14 = input.LA(2);
							if ( (synpred131_TSPHP()) ) {
								alt74=1;
							}
							}
							break;
					}
					switch (alt74) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content2715);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content2717); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content2721);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop75;
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



	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:1: ifCondition : 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:2: ( 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition2733); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition2735); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition2737);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition2739); if (state.failed) return ;
			pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2741);
			instructionWithoutBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:3: ( 'else' instructionWithoutBreakContinue )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Else) ) {
				int LA76_1 = input.LA(2);
				if ( (synpred133_TSPHP()) ) {
					alt76=1;
				}
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:5: 'else' instructionWithoutBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition2748); if (state.failed) return ;
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2750);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop2765); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop2767); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:21: ( forInit )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==MinusMinus||LA77_0==PlusPlus||(LA77_0 >= TypeArray && LA77_0 <= VariableId)) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop2769);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2772); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:34: ( expressionList )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==At||LA78_0==BitwiseNot||LA78_0==Bool||LA78_0==Float||LA78_0==Int||(LA78_0 >= LeftParanthesis && LA78_0 <= LeftSquareBrace)||LA78_0==LogicNot||LA78_0==Minus||LA78_0==MinusMinus||LA78_0==Plus||LA78_0==PlusPlus||LA78_0==String||LA78_0==TypeArray||LA78_0==VariableId) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop2774);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2778); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:55: ( forUpdate )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==MinusMinus||LA79_0==PlusPlus||LA79_0==VariableId) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop2780);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop2783); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop2785);
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



	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:11: ( variableDeclaration | variableAssignment )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( ((LA80_0 >= TypeArray && LA80_0 <= TypeString)) ) {
				alt80=1;
			}
			else if ( (LA80_0==MinusMinus||LA80_0==PlusPlus||LA80_0==VariableId) ) {
				alt80=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit2794);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit2796);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:52: ( ',' variableAssignment )*
			loop81:
			do {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==Comma) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit2800); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit2802);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop81;
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
	// $ANTLR end "forInit"



	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:1: forUpdate : variableAssignment ( ',' variableAssignment )? ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:2: ( variableAssignment ( ',' variableAssignment )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:4: variableAssignment ( ',' variableAssignment )?
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate2812);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:23: ( ',' variableAssignment )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Comma) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate2815); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate2817);
					variableAssignment();
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
	// $ANTLR end "forUpdate"



	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop2828); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop2830); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:18: ( VariableId | array )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==VariableId) ) {
				alt83=1;
			}
			else if ( (LA83_0==LeftSquareBrace||LA83_0==TypeArray) ) {
				alt83=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2833); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop2835);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop2838); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2840); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:53: ( '=>' VariableId )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==Arrow) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop2843); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2845); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop2849); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop2851);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop2860); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop2862); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop2864);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop2866); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop2868);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop2878); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop2880);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop2882); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop2884); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop2886);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop2888); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop2890); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2900); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition2902); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition2904); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition2906); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition2908); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:524:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==Case) ) {
				int LA97_1 = input.LA(2);
				if ( (synpred149_TSPHP()) ) {
					alt97=1;
				}
				else if ( (true) ) {
					alt97=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 97, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2919);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:16: ( instructionInclBreakContinue )+
							int cnt86=0;
							loop86:
							do {
								int alt86=2;
								int LA86_0 = input.LA(1);
								if ( (LA86_0==Break||LA86_0==Continue||LA86_0==Do||(LA86_0 >= For && LA86_0 <= Foreach)||LA86_0==If||LA86_0==LeftCurlyBrace||LA86_0==MinusMinus||LA86_0==PlusPlus||LA86_0==Return||(LA86_0 >= Switch && LA86_0 <= VariableId)||LA86_0==While||LA86_0==108) ) {
									alt86=1;
								}

								switch (alt86) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2922);
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition2927);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:61: ( instructionInclBreakContinue )+
					int cnt88=0;
					loop88:
					do {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==Break||LA88_0==Continue||LA88_0==Do||(LA88_0 >= For && LA88_0 <= Foreach)||LA88_0==If||LA88_0==LeftCurlyBrace||LA88_0==MinusMinus||LA88_0==PlusPlus||LA88_0==Return||(LA88_0 >= Switch && LA88_0 <= VariableId)||LA88_0==While||LA88_0==108) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2929);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt88 >= 1 ) break loop88;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(88, input);
								throw eee;
						}
						cnt88++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt91=0;
					loop91:
					do {
						int alt91=2;
						int LA91_0 = input.LA(1);
						if ( (LA91_0==Case) ) {
							alt91=1;
						}

						switch (alt91) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: ( caseLabel )+
							int cnt89=0;
							loop89:
							do {
								int alt89=2;
								int LA89_0 = input.LA(1);
								if ( (LA89_0==Case) ) {
									alt89=1;
								}

								switch (alt89) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2933);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt89 >= 1 ) break loop89;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(89, input);
										throw eee;
								}
								cnt89++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:103: ( instructionInclBreakContinue )+
							int cnt90=0;
							loop90:
							do {
								int alt90=2;
								int LA90_0 = input.LA(1);
								if ( (LA90_0==Break||LA90_0==Continue||LA90_0==Do||(LA90_0 >= For && LA90_0 <= Foreach)||LA90_0==If||LA90_0==LeftCurlyBrace||LA90_0==MinusMinus||LA90_0==PlusPlus||LA90_0==Return||(LA90_0 >= Switch && LA90_0 <= VariableId)||LA90_0==While||LA90_0==108) ) {
									alt90=1;
								}

								switch (alt90) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2936);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt90 >= 1 ) break loop90;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(90, input);
										throw eee;
								}
								cnt90++;
							} while (true);

							}
							break;

						default :
							if ( cnt91 >= 1 ) break loop91;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(91, input);
								throw eee;
						}
						cnt91++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt94=0;
					loop94:
					do {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==Case) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:6: ( caseLabel )+
							int cnt92=0;
							loop92:
							do {
								int alt92=2;
								int LA92_0 = input.LA(1);
								if ( (LA92_0==Case) ) {
									alt92=1;
								}

								switch (alt92) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2946);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt92 >= 1 ) break loop92;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(92, input);
										throw eee;
								}
								cnt92++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:17: ( instructionInclBreakContinue )+
							int cnt93=0;
							loop93:
							do {
								int alt93=2;
								int LA93_0 = input.LA(1);
								if ( (LA93_0==Break||LA93_0==Continue||LA93_0==Do||(LA93_0 >= For && LA93_0 <= Foreach)||LA93_0==If||LA93_0==LeftCurlyBrace||LA93_0==MinusMinus||LA93_0==PlusPlus||LA93_0==Return||(LA93_0 >= Switch && LA93_0 <= VariableId)||LA93_0==While||LA93_0==108) ) {
									alt93=1;
								}

								switch (alt93) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2949);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt93 >= 1 ) break loop93;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(93, input);
										throw eee;
								}
								cnt93++;
							} while (true);

							}
							break;

						default :
							if ( cnt94 >= 1 ) break loop94;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(94, input);
								throw eee;
						}
						cnt94++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==Default) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition2955);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:63: ( instructionInclBreakContinue )+
							int cnt95=0;
							loop95:
							do {
								int alt95=2;
								int LA95_0 = input.LA(1);
								if ( (LA95_0==Break||LA95_0==Continue||LA95_0==Do||(LA95_0 >= For && LA95_0 <= Foreach)||LA95_0==If||LA95_0==LeftCurlyBrace||LA95_0==MinusMinus||LA95_0==PlusPlus||LA95_0==Return||(LA95_0 >= Switch && LA95_0 <= VariableId)||LA95_0==While||LA95_0==108) ) {
									alt95=1;
								}

								switch (alt95) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2957);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt95 >= 1 ) break loop95;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(95, input);
										throw eee;
								}
								cnt95++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition2968); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel2980); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel2982);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel2984); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel2993); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel2995); if (state.failed) return ;
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

	// $ANTLR start synpred130_TSPHP
	public final void synpred130_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred130_TSPHP2702);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred130_TSPHP2704); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred130_TSPHP

	// $ANTLR start synpred131_TSPHP
	public final void synpred131_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred131_TSPHP2715);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred131_TSPHP2717); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred131_TSPHP

	// $ANTLR start synpred133_TSPHP
	public final void synpred133_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:5: ( 'else' instructionWithoutBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:5: 'else' instructionWithoutBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred133_TSPHP2748); if (state.failed) return ;
		pushFollow(FOLLOW_instructionWithoutBreakContinue_in_synpred133_TSPHP2750);
		instructionWithoutBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred133_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt117=0;
		loop117:
		do {
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==Case) ) {
				alt117=1;
			}

			switch (alt117) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: ( caseLabel )+
				int cnt115=0;
				loop115:
				do {
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==Case) ) {
						alt115=1;
					}

					switch (alt115) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred149_TSPHP2919);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt115 >= 1 ) break loop115;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(115, input);
							throw eee;
					}
					cnt115++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:16: ( instructionInclBreakContinue )+
				int cnt116=0;
				loop116:
				do {
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==Break||LA116_0==Continue||LA116_0==Do||(LA116_0 >= For && LA116_0 <= Foreach)||LA116_0==If||LA116_0==LeftCurlyBrace||LA116_0==MinusMinus||LA116_0==PlusPlus||LA116_0==Return||(LA116_0 >= Switch && LA116_0 <= VariableId)||LA116_0==While||LA116_0==108) ) {
						alt116=1;
					}

					switch (alt116) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2922);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt116 >= 1 ) break loop116;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(116, input);
							throw eee;
					}
					cnt116++;
				} while (true);

				}
				break;

			default :
				if ( cnt117 >= 1 ) break loop117;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(117, input);
					throw eee;
			}
			cnt117++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred149_TSPHP2927);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:61: ( instructionInclBreakContinue )+
		int cnt118=0;
		loop118:
		do {
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==Break||LA118_0==Continue||LA118_0==Do||(LA118_0 >= For && LA118_0 <= Foreach)||LA118_0==If||LA118_0==LeftCurlyBrace||LA118_0==MinusMinus||LA118_0==PlusPlus||LA118_0==Return||(LA118_0 >= Switch && LA118_0 <= VariableId)||LA118_0==While||LA118_0==108) ) {
				alt118=1;
			}

			switch (alt118) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2929);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt118 >= 1 ) break loop118;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(118, input);
					throw eee;
			}
			cnt118++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt121=0;
		loop121:
		do {
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==Case) ) {
				alt121=1;
			}

			switch (alt121) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: ( caseLabel )+
				int cnt119=0;
				loop119:
				do {
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==Case) ) {
						alt119=1;
					}

					switch (alt119) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred149_TSPHP2933);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt119 >= 1 ) break loop119;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(119, input);
							throw eee;
					}
					cnt119++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:103: ( instructionInclBreakContinue )+
				int cnt120=0;
				loop120:
				do {
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==Break||LA120_0==Continue||LA120_0==Do||(LA120_0 >= For && LA120_0 <= Foreach)||LA120_0==If||LA120_0==LeftCurlyBrace||LA120_0==MinusMinus||LA120_0==PlusPlus||LA120_0==Return||(LA120_0 >= Switch && LA120_0 <= VariableId)||LA120_0==While||LA120_0==108) ) {
						alt120=1;
					}

					switch (alt120) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2936);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt120 >= 1 ) break loop120;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(120, input);
							throw eee;
					}
					cnt120++;
				} while (true);

				}
				break;

			default :
				if ( cnt121 >= 1 ) break loop121;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(121, input);
					throw eee;
			}
			cnt121++;
		} while (true);

		}

	}
	// $ANTLR end synpred149_TSPHP

	// Delegated rules

	public final boolean synpred149_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred149_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred131_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred131_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred133_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred133_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\60\1\uffff\1\12\1\uffff\1\60\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\154\1\64\1\uffff\1\130\1\uffff\1\60\1\uffff\1\130";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\20\uffff\1\2\11\uffff\1\2\7\uffff\1\2\1\uffff\3\2\5\uffff\1\2\2"+
			"\uffff\1\2\14\uffff\1\2\4\uffff\1\1\6\uffff\1\2\4\uffff\1\2\14\uffff"+
			"\12\2\1\uffff\1\2\1\uffff\1\2",
			"\1\3\3\uffff\1\4",
			"",
			"\1\5\51\uffff\1\4\43\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\51\uffff\1\4\43\uffff\1\6"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "156:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_EOF_in_prog764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_EOF_in_prog772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog777 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon792 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon794 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon796 = new BitSet(new long[]{0x00120E8080200010L,0x000015FF80042002L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon798 = new BitSet(new long[]{0x00120E8080200012L,0x000015FF80042002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket811 = new BitSet(new long[]{0x0011000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket813 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket816 = new BitSet(new long[]{0x00120E8080200010L,0x000015FF80042002L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket818 = new BitSet(new long[]{0x00120E8080200010L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId887 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId890 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId892 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace905 = new BitSet(new long[]{0x00120E8080200012L,0x000015FF80042002L});
	public static final BitSet FOLLOW_definition_in_statement916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration956 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration958 = new BitSet(new long[]{0x0014004000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration960 = new BitSet(new long[]{0x0014000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration963 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration966 = new BitSet(new long[]{0x0000088002000010L,0x000000002001C000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration968 = new BitSet(new long[]{0x0000088002000010L,0x000000002009C000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration985 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList996 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_identifierList999 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1001 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1012 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_classBody1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constantDeclaration1044 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constantDeclaration1046 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_constDeclarationList_in_constantDeclaration1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_constantDeclaration1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1060 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1063 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1065 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1075 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1078 = new BitSet(new long[]{0x8068010000040000L,0x0000010140000800L});
	public static final BitSet FOLLOW_unaryAtom_in_constantAssignment1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1089 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1092 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002002L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1094 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1106 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1109 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1149 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1152 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002002L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1155 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1157 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1172 = new BitSet(new long[]{0x0000080000000000L,0x0000000000018000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1174 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1188 = new BitSet(new long[]{0x0000088000000000L,0x000000000001C000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1190 = new BitSet(new long[]{0x0000080000000000L,0x000000000001C000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1198 = new BitSet(new long[]{0x0000080000000000L,0x000000002001C000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1200 = new BitSet(new long[]{0x0000080000000000L,0x000000000001C000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1214 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration1232 = new BitSet(new long[]{0x0000000000000000L,0x000002FF00000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration1234 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration1236 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclaration1238 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00100000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclaration1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclaration1243 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1245 = new BitSet(new long[]{0x0012060080000000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1247 = new BitSet(new long[]{0x0012060080000000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_returnType1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesWithoutResource_in_primitiveTypes1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1332 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_paramList1335 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1337 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1344 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_paramList1347 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1349 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1356 = new BitSet(new long[]{0x0000000000800000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1359 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Comma_in_paramList1361 = new BitSet(new long[]{0x0000000000800000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1366 = new BitSet(new long[]{0x0000000000000000L,0x000000FF00000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1368 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_primitiveTypes_in_paramDeclaration1382 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1394 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1397 = new BitSet(new long[]{0x8068010000040000L,0x0000010140000800L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1421 = new BitSet(new long[]{0x0012060080000000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1423 = new BitSet(new long[]{0x0012060080000000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1443 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1445 = new BitSet(new long[]{0x0012060084080000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1459 = new BitSet(new long[]{0x0008000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1524 = new BitSet(new long[]{0x8868010000042100L,0x0000010141002802L});
	public static final BitSet FOLLOW_expression_in_instruction1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_instruction1534 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expressionList_in_instruction1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1550 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1553 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_expressionList1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1566 = new BitSet(new long[]{0x0000000440029080L,0x0000000014001029L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1568 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement1658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002002L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement1674 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_variableDeclaration1692 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1694 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration1697 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1720 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak1723 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1725 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1738 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak1741 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1743 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1756 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak1759 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1761 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment1772 = new BitSet(new long[]{0x0000000440029082L,0x0000000014001029L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment1775 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_ternary_in_assignment1777 = new BitSet(new long[]{0x0000000440029082L,0x0000000014001029L});
	public static final BitSet FOLLOW_logicOr_in_ternary1787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary1790 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_ternary1792 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_ternary1794 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicOr_in_ternary1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1806 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr1809 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1811 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1820 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd1823 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1825 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1836 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr1839 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1841 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1852 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor1855 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1857 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1868 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd1871 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1873 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality1882 = new BitSet(new long[]{0x0000802000000002L,0x0000000000000380L});
	public static final BitSet FOLLOW_equalityOperator_in_equality1885 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_comparison_in_equality1887 = new BitSet(new long[]{0x0000802000000002L,0x0000000000000380L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison1929 = new BitSet(new long[]{0x0180300000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison1932 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison1934 = new BitSet(new long[]{0x0180300000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift1970 = new BitSet(new long[]{0x0000000000000002L,0x000000000A000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift1973 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift1979 = new BitSet(new long[]{0x0000000000000002L,0x000000000A000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation1989 = new BitSet(new long[]{0x8000000200000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation1992 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2000 = new BitSet(new long[]{0x8000000200000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_logicNot_in_factor2010 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000014L});
	public static final BitSet FOLLOW_set_in_factor2013 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicNot_in_factor2021 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000014L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2030 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2051 = new BitSet(new long[]{0x0000000000000000L,0x000000BF00000000L});
	public static final BitSet FOLLOW_primitiveTypesWithoutResource_in_castOrBitwiseNotOrAt2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2055 = new BitSet(new long[]{0x8068010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2063 = new BitSet(new long[]{0x8068010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2070 = new BitSet(new long[]{0x8068010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_incrementDecrement2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2110 = new BitSet(new long[]{0x0068010000040000L,0x0000010140000000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2117 = new BitSet(new long[]{0x0068010000040000L,0x0000010140000000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2136 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_atom2138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2164 = new BitSet(new long[]{0x0048010000040000L,0x0000000140000000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2171 = new BitSet(new long[]{0x0048010000040000L,0x0000000140000000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primitiveAtom2189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primitiveAtom2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Float_in_primitiveAtom2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_primitiveAtom2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_primitiveAtom2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array2671 = new BitSet(new long[]{0x8868010000042100L,0x0000010140202802L});
	public static final BitSet FOLLOW_array_content_in_array2673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array2682 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array2684 = new BitSet(new long[]{0x8868010000042100L,0x0000010140102802L});
	public static final BitSet FOLLOW_array_content_in_array2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array2689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content2702 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2704 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_array_content2708 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_array_content2712 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_array_content2715 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2717 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_array_content2721 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_If_in_ifCondition2733 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition2735 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_ifCondition2737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition2739 = new BitSet(new long[]{0x0012060080000000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2741 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition2748 = new BitSet(new long[]{0x0012060080000000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop2765 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop2767 = new BitSet(new long[]{0x0000000000000000L,0x000001FF01002002L});
	public static final BitSet FOLLOW_forInit_in_forLoop2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2772 = new BitSet(new long[]{0x8868010000042100L,0x0000010141002802L});
	public static final BitSet FOLLOW_expressionList_in_forLoop2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2778 = new BitSet(new long[]{0x0000000000000000L,0x0000010000102002L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop2783 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit2794 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit2796 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_forInit2800 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit2802 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate2812 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate2815 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate2817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop2828 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop2830 = new BitSet(new long[]{0x0040000000000000L,0x0000010100000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2833 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop2835 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop2838 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2840 = new BitSet(new long[]{0x0000000000000020L,0x0000000000100000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop2843 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop2849 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop2851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop2860 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop2862 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_whileLoop2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop2866 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop2868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop2878 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop2880 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop2882 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop2884 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop2888 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop2890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2900 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition2902 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition2904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition2906 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition2908 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2919 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2922 = new BitSet(new long[]{0x0012060094180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition2927 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2929 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2933 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2936 = new BitSet(new long[]{0x0012060084180000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2946 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2949 = new BitSet(new long[]{0x0012060094180000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition2955 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2957 = new BitSet(new long[]{0x0012060084080000L,0x000015FF800C2002L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel2980 = new BitSet(new long[]{0x8868010000042100L,0x0000010140002802L});
	public static final BitSet FOLLOW_expression_in_caseLabel2982 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel2984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel2993 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred130_TSPHP2702 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred130_TSPHP2704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred131_TSPHP2715 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred131_TSPHP2717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred133_TSPHP2748 = new BitSet(new long[]{0x0012060080000000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_synpred133_TSPHP2750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred149_TSPHP2919 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2922 = new BitSet(new long[]{0x0012060094180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred149_TSPHP2927 = new BitSet(new long[]{0x0012060084080000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2929 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred149_TSPHP2933 = new BitSet(new long[]{0x0012060084180000L,0x000015FF80042002L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred149_TSPHP2936 = new BitSet(new long[]{0x0012060084180002L,0x000015FF80042002L});
}
