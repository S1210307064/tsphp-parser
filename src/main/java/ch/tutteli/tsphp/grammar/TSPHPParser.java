// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-27 16:07:13

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Colon", "Comma", "Comment", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Else", "Equal", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Int", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "NotEqual", "NotEqualAlternative", "NotIdentical", "OCTAL", "Plus", "PlusEqual", "PlusPlus", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "String", "Switch", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "VariableId", "Void", "While", "Whitespace"
	};

	public static final int EOF=-1;
	public static final int Arrow=4;
	public static final int As=5;
	public static final int Assign=6;
	public static final int At=7;
	public static final int BINARY=8;
	public static final int Backslash=9;
	public static final int BitwiseAnd=10;
	public static final int BitwiseAndEqual=11;
	public static final int BitwiseNot=12;
	public static final int BitwiseOr=13;
	public static final int BitwiseOrEqual=14;
	public static final int BitwiseXor=15;
	public static final int BitwiseXorEqual=16;
	public static final int Bool=17;
	public static final int Break=18;
	public static final int Case=19;
	public static final int Colon=20;
	public static final int Comma=21;
	public static final int Comment=22;
	public static final int Continue=23;
	public static final int DECIMAL=24;
	public static final int Default=25;
	public static final int Divide=26;
	public static final int DivideEqual=27;
	public static final int Do=28;
	public static final int Dolar=29;
	public static final int Dot=30;
	public static final int DotEqual=31;
	public static final int EXPONENT=32;
	public static final int Else=33;
	public static final int Equal=34;
	public static final int Float=35;
	public static final int For=36;
	public static final int Foreach=37;
	public static final int Function=38;
	public static final int GreaterEqualThan=39;
	public static final int GreaterThan=40;
	public static final int HEXADECIMAL=41;
	public static final int Identical=42;
	public static final int Identifier=43;
	public static final int If=44;
	public static final int Int=45;
	public static final int LeftCurlyBrace=46;
	public static final int LeftParanthesis=47;
	public static final int LeftSquareBrace=48;
	public static final int LessEqualThan=49;
	public static final int LessThan=50;
	public static final int LogicAnd=51;
	public static final int LogicAndWeak=52;
	public static final int LogicNot=53;
	public static final int LogicOr=54;
	public static final int LogicOrWeak=55;
	public static final int LogicXorWeak=56;
	public static final int Minus=57;
	public static final int MinusEqual=58;
	public static final int MinusMinus=59;
	public static final int Modulo=60;
	public static final int ModuloEqual=61;
	public static final int Multiply=62;
	public static final int MultiplyEqual=63;
	public static final int Namespace=64;
	public static final int NotEqual=65;
	public static final int NotEqualAlternative=66;
	public static final int NotIdentical=67;
	public static final int OCTAL=68;
	public static final int Plus=69;
	public static final int PlusEqual=70;
	public static final int PlusPlus=71;
	public static final int QuestionMark=72;
	public static final int Return=73;
	public static final int RightCurlyBrace=74;
	public static final int RightParanthesis=75;
	public static final int RightSquareBrace=76;
	public static final int STRING_DOUBLE_QUOTED=77;
	public static final int STRING_SINGLE_QUOTED=78;
	public static final int Semicolon=79;
	public static final int ShiftLeft=80;
	public static final int ShiftLeftEqual=81;
	public static final int ShiftRight=82;
	public static final int ShiftRightEqual=83;
	public static final int String=84;
	public static final int Switch=85;
	public static final int TypeArray=86;
	public static final int TypeBool=87;
	public static final int TypeBoolean=88;
	public static final int TypeFloat=89;
	public static final int TypeInt=90;
	public static final int TypeObject=91;
	public static final int TypeResource=92;
	public static final int TypeString=93;
	public static final int UMINUS=94;
	public static final int UPLUS=95;
	public static final int VariableId=96;
	public static final int Void=97;
	public static final int While=98;
	public static final int Whitespace=99;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:148:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog689);
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

					match(input,EOF,FOLLOW_EOF_in_prog692); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:149:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog697);
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

					match(input,EOF,FOLLOW_EOF_in_prog700); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:150:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog705);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog707); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:153:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon720); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon722);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon724); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Do||(LA4_0 >= For && LA4_0 <= Function)||LA4_0==If||LA4_0==LeftCurlyBrace||LA4_0==MinusMinus||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= Switch && LA4_0 <= TypeString)||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:154:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon726);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:156:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket739); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket741);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket744); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Do||(LA6_0 >= For && LA6_0 <= Function)||LA6_0==If||LA6_0==LeftCurlyBrace||LA6_0==MinusMinus||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= Switch && LA6_0 <= TypeString)||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:157:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket746);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket749); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId815); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId818); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId820); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Do||(LA8_0 >= For && LA8_0 <= Function)||LA8_0==If||LA8_0==LeftCurlyBrace||LA8_0==MinusMinus||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= Switch && LA8_0 <= TypeString)||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace833);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:1: statement : ( definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:2: ( definition | instructionWithoutBreakContinue )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Function) ) {
				alt9=1;
			}
			else if ( (LA9_0==Do||(LA9_0 >= For && LA9_0 <= Foreach)||LA9_0==If||LA9_0==LeftCurlyBrace||LA9_0==MinusMinus||LA9_0==PlusPlus||LA9_0==Return||(LA9_0 >= Switch && LA9_0 <= TypeString)||LA9_0==VariableId||LA9_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement844);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement849);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:1: definition : functionDeclaration ;
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:2: ( functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: functionDeclaration
			{
			pushFollow(FOLLOW_functionDeclaration_in_definition860);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:1: functionDeclaration : 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:2: ( 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:4: 'function' returnType Identifier '(' ( paramList )? ')' '{' ( instructionWithoutBreakContinue )* '}'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration874); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclaration876);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration878); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclaration880); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:41: ( paramList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= TypeArray && LA10_0 <= TypeString)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclaration882);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclaration885); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration887); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:60: ( instructionWithoutBreakContinue )*
			loop11:
			do {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==Do||(LA11_0 >= For && LA11_0 <= Foreach)||LA11_0==If||LA11_0==LeftCurlyBrace||LA11_0==MinusMinus||LA11_0==PlusPlus||LA11_0==Return||(LA11_0 >= Switch && LA11_0 <= TypeString)||LA11_0==VariableId||LA11_0==While) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:60: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration889);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop11;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration892); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:1: returnType : ( primitiveTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:2: ( primitiveTypes | 'void' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= TypeArray && LA12_0 <= TypeString)) ) {
				alt12=1;
			}
			else if ( (LA12_0==Void) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_returnType902);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:21: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType906); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:1: primitiveTypesWithoutResource : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeObject );
	public final void primitiveTypesWithoutResource() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString | TypeArray | TypeObject )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:1: primitiveTypes : ( primitiveTypesWithoutResource | TypeResource );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:2: ( primitiveTypesWithoutResource | TypeResource )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= TypeArray && LA13_0 <= TypeObject)||LA13_0==TypeString) ) {
				alt13=1;
			}
			else if ( (LA13_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: primitiveTypesWithoutResource
					{
					pushFollow(FOLLOW_primitiveTypesWithoutResource_in_primitiveTypes957);
					primitiveTypesWithoutResource();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes962); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:1: paramList : paramDeclaration ( ',' paramDeclaration )* ;
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:2: ( paramDeclaration ( ',' paramDeclaration )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:5: paramDeclaration ( ',' paramDeclaration )*
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramList975);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:22: ( ',' paramDeclaration )*
			loop14:
			do {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Comma) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:23: ',' paramDeclaration
					{
					match(input,Comma,FOLLOW_Comma_in_paramList978); if (state.failed) return ;
					pushFollow(FOLLOW_paramDeclaration_in_paramList980);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop14;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:1: paramDeclaration : primitiveTypes VariableId ( '=' expression )? ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:2: ( primitiveTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:4: primitiveTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_primitiveTypes_in_paramDeclaration992);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration994); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:30: ( '=' expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Assign) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:31: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_paramDeclaration997); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_paramDeclaration999);
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
	// $ANTLR end "paramDeclaration"



	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LeftCurlyBrace) ) {
				alt17=1;
			}
			else if ( (LA17_0==Do||(LA17_0 >= For && LA17_0 <= Foreach)||LA17_0==If||LA17_0==MinusMinus||LA17_0==PlusPlus||LA17_0==Return||(LA17_0 >= Switch && LA17_0 <= TypeString)||LA17_0==VariableId||LA17_0==While) ) {
				alt17=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1023); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:8: ( instructionWithoutBreakContinue )+
					int cnt16=0;
					loop16:
					do {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==Do||(LA16_0 >= For && LA16_0 <= Foreach)||LA16_0==If||LA16_0==LeftCurlyBrace||LA16_0==MinusMinus||LA16_0==PlusPlus||LA16_0==Return||(LA16_0 >= Switch && LA16_0 <= TypeString)||LA16_0==VariableId||LA16_0==While) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1025);
							instructionWithoutBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1029); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1034);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt20=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt20=1;
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
				{
				alt20=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt20=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1045); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:8: ( instructionInclBreakContinue )+
					int cnt18=0;
					loop18:
					do {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==Break||LA18_0==Continue||LA18_0==Do||(LA18_0 >= For && LA18_0 <= Foreach)||LA18_0==If||LA18_0==LeftCurlyBrace||LA18_0==MinusMinus||LA18_0==PlusPlus||LA18_0==Return||(LA18_0 >= Switch && LA18_0 <= TypeString)||LA18_0==VariableId||LA18_0==While) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1047);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(18, input);
								throw eee;
						}
						cnt18++;
					} while (true);

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1051); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1056);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:25: ( Int )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==Int) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1067); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1070); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:1: instruction : ( variableAssignment | variableDeclaration | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:2: ( variableAssignment | variableDeclaration | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' )
			int alt22=9;
			switch ( input.LA(1) ) {
			case MinusMinus:
			case PlusPlus:
			case VariableId:
				{
				alt22=1;
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
				alt22=2;
				}
				break;
			case If:
				{
				alt22=3;
				}
				break;
			case Switch:
				{
				alt22=4;
				}
				break;
			case For:
				{
				alt22=5;
				}
				break;
			case Foreach:
				{
				alt22=6;
				}
				break;
			case While:
				{
				alt22=7;
				}
				break;
			case Do:
				{
				alt22=8;
				}
				break;
			case Return:
				{
				alt22=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:4: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1082);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1087);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1092);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1097);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1102);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1107);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1112);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1117);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1122); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:13: ( expression )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==At||LA21_0==BitwiseNot||LA21_0==Bool||LA21_0==Float||LA21_0==Int||(LA21_0 >= LeftParanthesis && LA21_0 <= LeftSquareBrace)||LA21_0==LogicNot||LA21_0==Minus||LA21_0==MinusMinus||LA21_0==Plus||LA21_0==PlusPlus||LA21_0==String||LA21_0==TypeArray||LA21_0==VariableId) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1124);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1127); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:1: variableAssignment : variableAssignmentWithoutSemicolon ';' ;
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:2: ( variableAssignmentWithoutSemicolon ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: variableAssignmentWithoutSemicolon ';'
			{
			pushFollow(FOLLOW_variableAssignmentWithoutSemicolon_in_variableAssignment1138);
			variableAssignmentWithoutSemicolon();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_variableAssignment1140); if (state.failed) return ;
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



	// $ANTLR start "variableAssignmentWithoutSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:1: variableAssignmentWithoutSemicolon : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignmentWithoutSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==VariableId) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==MinusMinus||LA23_1==PlusPlus) ) {
					alt23=2;
				}
				else if ( (LA23_1==Assign||LA23_1==BitwiseAndEqual||LA23_1==BitwiseOrEqual||LA23_1==BitwiseXorEqual||LA23_1==DivideEqual||LA23_1==DotEqual||LA23_1==MinusEqual||LA23_1==ModuloEqual||LA23_1==MultiplyEqual||LA23_1==PlusEqual||LA23_1==ShiftLeftEqual||LA23_1==ShiftRightEqual) ) {
					alt23=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA23_0==MinusMinus||LA23_0==PlusPlus) ) {
				alt23=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignmentWithoutSemicolon1151); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignmentWithoutSemicolon1153);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignmentWithoutSemicolon1155);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignmentWithoutSemicolon1160);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignmentWithoutSemicolon1165);
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
	// $ANTLR end "variableAssignmentWithoutSemicolon"



	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement1243); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement1265); if (state.failed) return ;
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



	// $ANTLR start "variableDeclarationWithoutSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:1: variableDeclarationWithoutSemicolon : primitiveTypes VariableId ( '=' expression )? ;
	public final void variableDeclarationWithoutSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:2: ( primitiveTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:4: primitiveTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_primitiveTypes_in_variableDeclarationWithoutSemicolon1277);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationWithoutSemicolon1279); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:30: ( '=' expression )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Assign) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:31: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclarationWithoutSemicolon1282); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclarationWithoutSemicolon1284);
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
	// $ANTLR end "variableDeclarationWithoutSemicolon"



	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:1: variableDeclaration : variableDeclarationWithoutSemicolon ';' ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:2: ( variableDeclarationWithoutSemicolon ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:4: variableDeclarationWithoutSemicolon ';'
			{
			pushFollow(FOLLOW_variableDeclarationWithoutSemicolon_in_variableDeclaration1298);
			variableDeclarationWithoutSemicolon();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_variableDeclaration1300); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression1310);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1319);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:17: ( 'or' logicXorWeak )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==LogicOrWeak) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak1322); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1324);
					logicXorWeak();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop25;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1337);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:17: ( 'xor' logicAndWeak )*
			loop26:
			do {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==LogicXorWeak) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak1340); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1342);
					logicAndWeak();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop26;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak1355);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:15: ( 'and' assignment )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LogicAndWeak) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak1358); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak1360);
					assignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop27;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment1371);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:12: ( assignmentOperator ternary )*
			loop28:
			do {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==Assign||LA28_0==BitwiseAndEqual||LA28_0==BitwiseOrEqual||LA28_0==BitwiseXorEqual||LA28_0==DivideEqual||LA28_0==DotEqual||LA28_0==MinusEqual||LA28_0==ModuloEqual||LA28_0==MultiplyEqual||LA28_0==PlusEqual||LA28_0==ShiftLeftEqual||LA28_0==ShiftRightEqual) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment1374);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment1376);
					ternary();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop28;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary1386);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:19: ( '?' expression ':' logicOr )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==QuestionMark) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary1389); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary1391);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary1393); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary1395);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr1405);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:20: ( '||' logicAnd )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==LogicOr) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr1408); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr1410);
					logicAnd();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop30;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd1419);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:21: ( '&&' bitwiseOr )*
			loop31:
			do {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==LogicAnd) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd1422); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd1424);
					bitwiseOr();
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
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1435);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:15: ( '|' bitwiseXor )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==BitwiseOr) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr1438); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1440);
					bitwiseXor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop32;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1451);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:15: ( '^' bitwiseAnd )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==BitwiseXor) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor1454); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1456);
					bitwiseAnd();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop33;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd1467);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:13: ( '&' equality )*
			loop34:
			do {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==BitwiseAnd) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd1470); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd1472);
					equality();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop34;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality1481);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:22: ( equalityOperator comparison )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Equal||LA35_0==Identical||(LA35_0 >= NotEqual && LA35_0 <= NotIdentical)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality1484);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality1486);
					comparison();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop35;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison1528);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:17: ( comparisonOperator bitwiseShift )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= GreaterEqualThan && LA36_0 <= GreaterThan)||(LA36_0 >= LessEqualThan && LA36_0 <= LessThan)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison1531);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison1533);
					bitwiseShift();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop36;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift1569);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop37:
			do {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ShiftLeft||LA37_0==ShiftRight) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift1578);
					termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop37;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation1588);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:36: ( ( '+' | '-' | '.' ) factor )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Dot||LA38_0==Minus||LA38_0==Plus) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation1599);
					factor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop38;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor1609);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Divide||LA39_0==Modulo||LA39_0==Multiply) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor1620);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop39;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:9: ( '!' logicNot | castOrBitwiseNotOrAt )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LogicNot) ) {
				alt40=1;
			}
			else if ( (LA40_0==At||LA40_0==BitwiseNot||LA40_0==Bool||LA40_0==Float||LA40_0==Int||(LA40_0 >= LeftParanthesis && LA40_0 <= LeftSquareBrace)||LA40_0==Minus||LA40_0==MinusMinus||LA40_0==Plus||LA40_0==PlusPlus||LA40_0==String||LA40_0==TypeArray||LA40_0==VariableId) ) {
				alt40=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot1629); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot1631);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot1636);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:2: ( ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt41=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				switch ( input.LA(2) ) {
				case TypeArray:
					{
					int LA41_5 = input.LA(3);
					if ( (LA41_5==LeftParanthesis) ) {
						alt41=4;
					}
					else if ( (LA41_5==RightParanthesis) ) {
						alt41=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 41, 5, input);
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
					alt41=4;
					}
					break;
				case TypeBool:
				case TypeBoolean:
				case TypeFloat:
				case TypeInt:
				case TypeObject:
				case TypeString:
					{
					alt41=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt41=2;
				}
				break;
			case At:
				{
				alt41=3;
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
				alt41=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: ( '(' primitiveTypesWithoutResource ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: ( '(' primitiveTypesWithoutResource ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:5: '(' primitiveTypesWithoutResource ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt1650); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesWithoutResource_in_castOrBitwiseNotOrAt1652);
					primitiveTypesWithoutResource();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt1654); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1657);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt1662); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1664);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt1669); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1671);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt1676);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | unaryAtom );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:2: ( postIncrementDecrement | preIncrementDecrement | unaryAtom )
			int alt42=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA42_1 = input.LA(2);
				if ( (LA42_1==MinusMinus||LA42_1==PlusPlus) ) {
					alt42=1;
				}
				else if ( (LA42_1==EOF||LA42_1==Arrow||LA42_1==Assign||(LA42_1 >= BitwiseAnd && LA42_1 <= BitwiseAndEqual)||(LA42_1 >= BitwiseOr && LA42_1 <= BitwiseXorEqual)||(LA42_1 >= Colon && LA42_1 <= Comma)||(LA42_1 >= Divide && LA42_1 <= DivideEqual)||(LA42_1 >= Dot && LA42_1 <= DotEqual)||LA42_1==Equal||(LA42_1 >= GreaterEqualThan && LA42_1 <= GreaterThan)||LA42_1==Identical||(LA42_1 >= LessEqualThan && LA42_1 <= LogicAndWeak)||(LA42_1 >= LogicOr && LA42_1 <= MinusEqual)||(LA42_1 >= Modulo && LA42_1 <= MultiplyEqual)||(LA42_1 >= NotEqual && LA42_1 <= NotIdentical)||(LA42_1 >= Plus && LA42_1 <= PlusEqual)||LA42_1==QuestionMark||(LA42_1 >= RightParanthesis && LA42_1 <= RightSquareBrace)||(LA42_1 >= Semicolon && LA42_1 <= ShiftRightEqual)) ) {
					alt42=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
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
				alt42=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement1688);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement1693);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_incrementDecrement1698);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:1: unaryAtom : ( '+' atom | '-' atom | atom );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:2: ( '+' atom | '-' atom | atom )
			int alt43=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt43=1;
				}
				break;
			case Minus:
				{
				alt43=2;
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
				alt43=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:4: '+' atom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom1709); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom1711);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:4: '-' atom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom1716); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom1718);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: atom
					{
					pushFollow(FOLLOW_atom_in_unaryAtom1723);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: atom : ( '(' expression ')' | Bool | Int | Float | String | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:6: ( '(' expression ')' | Bool | Int | Float | String | array | VariableId )
			int alt44=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt44=1;
				}
				break;
			case Bool:
				{
				alt44=2;
				}
				break;
			case Int:
				{
				alt44=3;
				}
				break;
			case Float:
				{
				alt44=4;
				}
				break;
			case String:
				{
				alt44=5;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt44=6;
				}
				break;
			case VariableId:
				{
				alt44=7;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom1735); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom1737);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom1739); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: Bool
					{
					match(input,Bool,FOLLOW_Bool_in_atom1744); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: Int
					{
					match(input,Int,FOLLOW_Int_in_atom1749); if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: Float
					{
					match(input,Float,FOLLOW_Float_in_atom1754); if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: String
					{
					match(input,String,FOLLOW_String_in_atom1759); if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: array
					{
					pushFollow(FOLLOW_array_in_atom1764);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom1769); if (state.failed) return ;
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



	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LeftSquareBrace) ) {
				alt47=1;
			}
			else if ( (LA47_0==TypeArray) ) {
				alt47=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array2231); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:13: ( array_content )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==At||LA45_0==BitwiseNot||LA45_0==Bool||LA45_0==Float||LA45_0==Int||(LA45_0 >= LeftParanthesis && LA45_0 <= LeftSquareBrace)||LA45_0==LogicNot||LA45_0==Minus||LA45_0==MinusMinus||LA45_0==Plus||LA45_0==PlusPlus||LA45_0==String||LA45_0==TypeArray||LA45_0==VariableId) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2233);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array2236); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array2242); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array2244); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:18: ( array_content )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==At||LA46_0==BitwiseNot||LA46_0==Bool||LA46_0==Float||LA46_0==Int||(LA46_0 >= LeftParanthesis && LA46_0 <= LeftSquareBrace)||LA46_0==LogicNot||LA46_0==Minus||LA46_0==MinusMinus||LA46_0==Plus||LA46_0==PlusPlus||LA46_0==String||LA46_0==TypeArray||LA46_0==VariableId) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2246);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array2249); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:4: ( expression '=>' )?
			int alt48=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA48_1 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA48_2 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA48_3 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case At:
					{
					int LA48_4 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case VariableId:
					{
					int LA48_5 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA48_6 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case Plus:
					{
					int LA48_7 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case Minus:
					{
					int LA48_8 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case Bool:
					{
					int LA48_9 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case Int:
					{
					int LA48_10 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case Float:
					{
					int LA48_11 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case String:
					{
					int LA48_12 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA48_13 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA48_14 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt48=1;
					}
					}
					break;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content2262);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content2264); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content2268);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:35: ( ',' ( expression '=>' )? expression )*
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==Comma) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content2272); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:40: ( expression '=>' )?
					int alt49=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA49_1 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA49_2 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA49_3 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case At:
							{
							int LA49_4 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case VariableId:
							{
							int LA49_5 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA49_6 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case Plus:
							{
							int LA49_7 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case Minus:
							{
							int LA49_8 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case Bool:
							{
							int LA49_9 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case Int:
							{
							int LA49_10 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case Float:
							{
							int LA49_11 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case String:
							{
							int LA49_12 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA49_13 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA49_14 = input.LA(2);
							if ( (synpred100_TSPHP()) ) {
								alt49=1;
							}
							}
							break;
					}
					switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content2275);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content2277); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content2281);
					expression();
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
	// $ANTLR end "array_content"



	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:1: ifCondition : 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:2: ( 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition2293); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition2295); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition2297);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition2299); if (state.failed) return ;
			pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2301);
			instructionWithoutBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:3: ( 'else' instructionWithoutBreakContinue )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==Else) ) {
				int LA51_1 = input.LA(2);
				if ( (synpred102_TSPHP()) ) {
					alt51=1;
				}
			}
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:5: 'else' instructionWithoutBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition2308); if (state.failed) return ;
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2310);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:1: forLoop : 'for' '(' ( variableDeclarationWithoutSemicolon | variableAssignmentWithoutSemicolon )? ';' ( expression )? ';' ( variableAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:9: ( 'for' '(' ( variableDeclarationWithoutSemicolon | variableAssignmentWithoutSemicolon )? ';' ( expression )? ';' ( variableAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:11: 'for' '(' ( variableDeclarationWithoutSemicolon | variableAssignmentWithoutSemicolon )? ';' ( expression )? ';' ( variableAssignmentWithoutSemicolon )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop2325); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop2327); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:21: ( variableDeclarationWithoutSemicolon | variableAssignmentWithoutSemicolon )?
			int alt52=3;
			int LA52_0 = input.LA(1);
			if ( ((LA52_0 >= TypeArray && LA52_0 <= TypeString)) ) {
				alt52=1;
			}
			else if ( (LA52_0==MinusMinus||LA52_0==PlusPlus||LA52_0==VariableId) ) {
				alt52=2;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:22: variableDeclarationWithoutSemicolon
					{
					pushFollow(FOLLOW_variableDeclarationWithoutSemicolon_in_forLoop2330);
					variableDeclarationWithoutSemicolon();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:58: variableAssignmentWithoutSemicolon
					{
					pushFollow(FOLLOW_variableAssignmentWithoutSemicolon_in_forLoop2332);
					variableAssignmentWithoutSemicolon();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2336); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:100: ( expression )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==At||LA53_0==BitwiseNot||LA53_0==Bool||LA53_0==Float||LA53_0==Int||(LA53_0 >= LeftParanthesis && LA53_0 <= LeftSquareBrace)||LA53_0==LogicNot||LA53_0==Minus||LA53_0==MinusMinus||LA53_0==Plus||LA53_0==PlusPlus||LA53_0==String||LA53_0==TypeArray||LA53_0==VariableId) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:100: expression
					{
					pushFollow(FOLLOW_expression_in_forLoop2339);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2342); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:116: ( variableAssignmentWithoutSemicolon )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==MinusMinus||LA54_0==PlusPlus||LA54_0==VariableId) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:116: variableAssignmentWithoutSemicolon
					{
					pushFollow(FOLLOW_variableAssignmentWithoutSemicolon_in_forLoop2344);
					variableAssignmentWithoutSemicolon();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop2347); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop2349);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop2358); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop2360); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:18: ( VariableId | array )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==VariableId) ) {
				alt55=1;
			}
			else if ( (LA55_0==LeftSquareBrace||LA55_0==TypeArray) ) {
				alt55=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2363); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop2365);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop2368); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2370); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:53: ( '=>' VariableId )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==Arrow) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop2373); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2375); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop2379); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop2381);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop2390); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop2392); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop2394);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop2396); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop2398);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop2408); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop2410);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop2412); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop2414); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop2416);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop2418); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop2420); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2430); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition2432); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition2434); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition2436); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition2438); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Case) ) {
				int LA69_1 = input.LA(2);
				if ( (synpred116_TSPHP()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt59=0;
					loop59:
					do {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==Case) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2449);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:16: ( instructionInclBreakContinue )+
							int cnt58=0;
							loop58:
							do {
								int alt58=2;
								int LA58_0 = input.LA(1);
								if ( (LA58_0==Break||LA58_0==Continue||LA58_0==Do||(LA58_0 >= For && LA58_0 <= Foreach)||LA58_0==If||LA58_0==LeftCurlyBrace||LA58_0==MinusMinus||LA58_0==PlusPlus||LA58_0==Return||(LA58_0 >= Switch && LA58_0 <= TypeString)||LA58_0==VariableId||LA58_0==While) ) {
									alt58=1;
								}

								switch (alt58) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2452);
									instructionInclBreakContinue();
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition2457);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:61: ( instructionInclBreakContinue )+
					int cnt60=0;
					loop60:
					do {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==Break||LA60_0==Continue||LA60_0==Do||(LA60_0 >= For && LA60_0 <= Foreach)||LA60_0==If||LA60_0==LeftCurlyBrace||LA60_0==MinusMinus||LA60_0==PlusPlus||LA60_0==Return||(LA60_0 >= Switch && LA60_0 <= TypeString)||LA60_0==VariableId||LA60_0==While) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2459);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt63=0;
					loop63:
					do {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==Case) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: ( caseLabel )+
							int cnt61=0;
							loop61:
							do {
								int alt61=2;
								int LA61_0 = input.LA(1);
								if ( (LA61_0==Case) ) {
									alt61=1;
								}

								switch (alt61) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2463);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:103: ( instructionInclBreakContinue )+
							int cnt62=0;
							loop62:
							do {
								int alt62=2;
								int LA62_0 = input.LA(1);
								if ( (LA62_0==Break||LA62_0==Continue||LA62_0==Do||(LA62_0 >= For && LA62_0 <= Foreach)||LA62_0==If||LA62_0==LeftCurlyBrace||LA62_0==MinusMinus||LA62_0==PlusPlus||LA62_0==Return||(LA62_0 >= Switch && LA62_0 <= TypeString)||LA62_0==VariableId||LA62_0==While) ) {
									alt62=1;
								}

								switch (alt62) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2466);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt62 >= 1 ) break loop62;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(62, input);
										throw eee;
								}
								cnt62++;
							} while (true);

							}
							break;

						default :
							if ( cnt63 >= 1 ) break loop63;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(63, input);
								throw eee;
						}
						cnt63++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt66=0;
					loop66:
					do {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==Case) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:6: ( caseLabel )+
							int cnt64=0;
							loop64:
							do {
								int alt64=2;
								int LA64_0 = input.LA(1);
								if ( (LA64_0==Case) ) {
									alt64=1;
								}

								switch (alt64) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2476);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt64 >= 1 ) break loop64;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(64, input);
										throw eee;
								}
								cnt64++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:17: ( instructionInclBreakContinue )+
							int cnt65=0;
							loop65:
							do {
								int alt65=2;
								int LA65_0 = input.LA(1);
								if ( (LA65_0==Break||LA65_0==Continue||LA65_0==Do||(LA65_0 >= For && LA65_0 <= Foreach)||LA65_0==If||LA65_0==LeftCurlyBrace||LA65_0==MinusMinus||LA65_0==PlusPlus||LA65_0==Return||(LA65_0 >= Switch && LA65_0 <= TypeString)||LA65_0==VariableId||LA65_0==While) ) {
									alt65=1;
								}

								switch (alt65) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2479);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt65 >= 1 ) break loop65;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(65, input);
										throw eee;
								}
								cnt65++;
							} while (true);

							}
							break;

						default :
							if ( cnt66 >= 1 ) break loop66;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(66, input);
								throw eee;
						}
						cnt66++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==Default) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition2485);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:63: ( instructionInclBreakContinue )+
							int cnt67=0;
							loop67:
							do {
								int alt67=2;
								int LA67_0 = input.LA(1);
								if ( (LA67_0==Break||LA67_0==Continue||LA67_0==Do||(LA67_0 >= For && LA67_0 <= Foreach)||LA67_0==If||LA67_0==LeftCurlyBrace||LA67_0==MinusMinus||LA67_0==PlusPlus||LA67_0==Return||(LA67_0 >= Switch && LA67_0 <= TypeString)||LA67_0==VariableId||LA67_0==While) ) {
									alt67=1;
								}

								switch (alt67) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2487);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt67 >= 1 ) break loop67;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(67, input);
										throw eee;
								}
								cnt67++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition2498); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel2510); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel2512);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel2514); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel2523); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel2525); if (state.failed) return ;
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

	// $ANTLR start synpred99_TSPHP
	public final void synpred99_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred99_TSPHP2262);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred99_TSPHP2264); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred99_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred100_TSPHP2275);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred100_TSPHP2277); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:5: ( 'else' instructionWithoutBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:5: 'else' instructionWithoutBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred102_TSPHP2308); if (state.failed) return ;
		pushFollow(FOLLOW_instructionWithoutBreakContinue_in_synpred102_TSPHP2310);
		instructionWithoutBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred116_TSPHP
	public final void synpred116_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt82=0;
		loop82:
		do {
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Case) ) {
				alt82=1;
			}

			switch (alt82) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: ( caseLabel )+
				int cnt80=0;
				loop80:
				do {
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==Case) ) {
						alt80=1;
					}

					switch (alt80) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred116_TSPHP2449);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt80 >= 1 ) break loop80;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(80, input);
							throw eee;
					}
					cnt80++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:16: ( instructionInclBreakContinue )+
				int cnt81=0;
				loop81:
				do {
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==Break||LA81_0==Continue||LA81_0==Do||(LA81_0 >= For && LA81_0 <= Foreach)||LA81_0==If||LA81_0==LeftCurlyBrace||LA81_0==MinusMinus||LA81_0==PlusPlus||LA81_0==Return||(LA81_0 >= Switch && LA81_0 <= TypeString)||LA81_0==VariableId||LA81_0==While) ) {
						alt81=1;
					}

					switch (alt81) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2452);
						instructionInclBreakContinue();
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

		pushFollow(FOLLOW_defaultLabel_in_synpred116_TSPHP2457);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:61: ( instructionInclBreakContinue )+
		int cnt83=0;
		loop83:
		do {
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==Break||LA83_0==Continue||LA83_0==Do||(LA83_0 >= For && LA83_0 <= Foreach)||LA83_0==If||LA83_0==LeftCurlyBrace||LA83_0==MinusMinus||LA83_0==PlusPlus||LA83_0==Return||(LA83_0 >= Switch && LA83_0 <= TypeString)||LA83_0==VariableId||LA83_0==While) ) {
				alt83=1;
			}

			switch (alt83) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2459);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt86=0;
		loop86:
		do {
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==Case) ) {
				alt86=1;
			}

			switch (alt86) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: ( caseLabel )+
				int cnt84=0;
				loop84:
				do {
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==Case) ) {
						alt84=1;
					}

					switch (alt84) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred116_TSPHP2463);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:103: ( instructionInclBreakContinue )+
				int cnt85=0;
				loop85:
				do {
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==Break||LA85_0==Continue||LA85_0==Do||(LA85_0 >= For && LA85_0 <= Foreach)||LA85_0==If||LA85_0==LeftCurlyBrace||LA85_0==MinusMinus||LA85_0==PlusPlus||LA85_0==Return||(LA85_0 >= Switch && LA85_0 <= TypeString)||LA85_0==VariableId||LA85_0==While) ) {
						alt85=1;
					}

					switch (alt85) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2466);
						instructionInclBreakContinue();
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

	}
	// $ANTLR end synpred116_TSPHP

	// Delegated rules

	public final boolean synpred99_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred100_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_TSPHP_fragment(); // can never throw exception
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
		"\1\34\1\53\1\uffff\1\11\1\uffff\1\53\1\uffff\1\11";
	static final String DFA3_maxS =
		"\1\142\1\56\1\uffff\1\117\1\uffff\1\53\1\uffff\1\117";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\7\uffff\3\2\5\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff\1\1\6\uffff"+
			"\1\2\1\uffff\1\2\13\uffff\11\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\2\uffff\1\4",
			"",
			"\1\5\44\uffff\1\4\40\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\44\uffff\1\4\40\uffff\1\6"
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
			return "148:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_EOF_in_prog692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_EOF_in_prog700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog705 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon720 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon724 = new BitSet(new long[]{0x0800507010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon726 = new BitSet(new long[]{0x0800507010000002L,0x000000053FE00280L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket739 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket741 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket744 = new BitSet(new long[]{0x0800507010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket746 = new BitSet(new long[]{0x0800507010000000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId815 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId818 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId820 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace833 = new BitSet(new long[]{0x0800507010000002L,0x000000053FE00280L});
	public static final BitSet FOLLOW_definition_in_statement844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration874 = new BitSet(new long[]{0x0000000000000000L,0x000000023FC00000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration876 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration878 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclaration880 = new BitSet(new long[]{0x0000000000000000L,0x000000003FC00800L});
	public static final BitSet FOLLOW_paramList_in_functionDeclaration882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclaration885 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration887 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration889 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_returnType902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesWithoutResource_in_primitiveTypes957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList975 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_paramList978 = new BitSet(new long[]{0x0000000000000000L,0x000000003FC00000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList980 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_primitiveTypes_in_paramDeclaration992 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration994 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Assign_in_paramDeclaration997 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_paramDeclaration999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1023 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1025 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1045 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1047 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1061 = new BitSet(new long[]{0x0000200000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1122 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005080A0L});
	public static final BitSet FOLLOW_expression_in_instruction1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignmentWithoutSemicolon_in_variableAssignment1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_variableAssignment1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignmentWithoutSemicolon1151 = new BitSet(new long[]{0xA400000088014840L,0x00000000000A0040L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignmentWithoutSemicolon1153 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_variableAssignmentWithoutSemicolon1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignmentWithoutSemicolon1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignmentWithoutSemicolon1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement1243 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_variableDeclarationWithoutSemicolon1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationWithoutSemicolon1279 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Assign_in_variableDeclarationWithoutSemicolon1282 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_variableDeclarationWithoutSemicolon1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarationWithoutSemicolon_in_variableDeclaration1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_variableDeclaration1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1319 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak1322 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1324 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1337 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak1340 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1342 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1355 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak1358 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1360 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment1371 = new BitSet(new long[]{0xA400000088014842L,0x00000000000A0040L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment1374 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_ternary_in_assignment1376 = new BitSet(new long[]{0xA400000088014842L,0x00000000000A0040L});
	public static final BitSet FOLLOW_logicOr_in_ternary1386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary1389 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_ternary1391 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Colon_in_ternary1393 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicOr_in_ternary1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1405 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr1408 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1410 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1419 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd1422 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1424 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1435 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr1438 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1440 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1451 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor1454 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1456 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1467 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd1470 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1472 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_comparison_in_equality1481 = new BitSet(new long[]{0x0000040400000002L,0x000000000000000EL});
	public static final BitSet FOLLOW_equalityOperator_in_equality1484 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_comparison_in_equality1486 = new BitSet(new long[]{0x0000040400000002L,0x000000000000000EL});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison1528 = new BitSet(new long[]{0x0006018000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison1531 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison1533 = new BitSet(new long[]{0x0006018000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000050000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift1572 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift1578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000050000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation1588 = new BitSet(new long[]{0x0200000040000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation1591 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation1599 = new BitSet(new long[]{0x0200000040000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_logicNot_in_factor1609 = new BitSet(new long[]{0x5000000004000002L});
	public static final BitSet FOLLOW_set_in_factor1612 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicNot_in_factor1620 = new BitSet(new long[]{0x5000000004000002L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot1629 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_logicNot_in_logicNot1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt1650 = new BitSet(new long[]{0x0000000000000000L,0x000000002FC00000L});
	public static final BitSet FOLLOW_primitiveTypesWithoutResource_in_castOrBitwiseNotOrAt1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt1654 = new BitSet(new long[]{0x0A01A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt1662 = new BitSet(new long[]{0x0A01A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt1669 = new BitSet(new long[]{0x0A01A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt1676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_incrementDecrement1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom1709 = new BitSet(new long[]{0x0001A00800020000L,0x0000000100500000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom1716 = new BitSet(new long[]{0x0001A00800020000L,0x0000000100500000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryAtom1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom1735 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_atom1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_atom1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Float_in_atom1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_atom1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array2231 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005010A0L});
	public static final BitSet FOLLOW_array_content_in_array2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array2236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array2242 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array2244 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005008A0L});
	public static final BitSet FOLLOW_array_content_in_array2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_array2249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content2262 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arrow_in_array_content2264 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_array_content2268 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_Comma_in_array_content2272 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_array_content2275 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arrow_in_array_content2277 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_array_content2281 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_If_in_ifCondition2293 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition2295 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_ifCondition2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition2299 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2301 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition2308 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop2325 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop2327 = new BitSet(new long[]{0x0800000000000000L,0x000000013FC08080L});
	public static final BitSet FOLLOW_variableDeclarationWithoutSemicolon_in_forLoop2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_variableAssignmentWithoutSemicolon_in_forLoop2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2336 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005080A0L});
	public static final BitSet FOLLOW_expression_in_forLoop2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2342 = new BitSet(new long[]{0x0800000000000000L,0x0000000100000880L});
	public static final BitSet FOLLOW_variableAssignmentWithoutSemicolon_in_forLoop2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop2347 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop2358 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop2360 = new BitSet(new long[]{0x0001000000000000L,0x0000000100400000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2363 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_array_in_foreachLoop2365 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_As_in_foreachLoop2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2370 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000800L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop2379 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop2390 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop2392 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_whileLoop2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop2396 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop2408 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop2412 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop2414 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop2420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2430 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition2434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition2436 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition2438 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2449 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2452 = new BitSet(new long[]{0x08005030128C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition2457 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2459 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2463 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2466 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2476 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2479 = new BitSet(new long[]{0x08005030128C0000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition2485 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2487 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00680L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition2498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel2510 = new BitSet(new long[]{0x0A21A00800021080L,0x00000001005000A0L});
	public static final BitSet FOLLOW_expression_in_caseLabel2512 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel2523 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred99_TSPHP2262 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arrow_in_synpred99_TSPHP2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred100_TSPHP2275 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arrow_in_synpred100_TSPHP2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred102_TSPHP2308 = new BitSet(new long[]{0x0800503010000000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_synpred102_TSPHP2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred116_TSPHP2449 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2452 = new BitSet(new long[]{0x08005030128C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred116_TSPHP2457 = new BitSet(new long[]{0x0800503010840000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2459 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_caseLabel_in_synpred116_TSPHP2463 = new BitSet(new long[]{0x08005030108C0000L,0x000000053FE00280L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred116_TSPHP2466 = new BitSet(new long[]{0x08005030108C0002L,0x000000053FE00280L});
}
