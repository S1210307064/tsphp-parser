// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 10:58:19

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "VariableId", "Void", "While", "Whitespace", "'clone'"
	};

	public static final int EOF=-1;
	public static final int T__118=118;
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
	public static final int Catch=21;
	public static final int Class=22;
	public static final int Colon=23;
	public static final int Comma=24;
	public static final int Comment=25;
	public static final int Const=26;
	public static final int Continue=27;
	public static final int DECIMAL=28;
	public static final int Default=29;
	public static final int Divide=30;
	public static final int DivideEqual=31;
	public static final int Do=32;
	public static final int Dolar=33;
	public static final int Dot=34;
	public static final int DotEqual=35;
	public static final int EXPONENT=36;
	public static final int Echo=37;
	public static final int Else=38;
	public static final int Equal=39;
	public static final int Exit=40;
	public static final int Extends=41;
	public static final int Final=42;
	public static final int Float=43;
	public static final int For=44;
	public static final int Foreach=45;
	public static final int Function=46;
	public static final int GreaterEqualThan=47;
	public static final int GreaterThan=48;
	public static final int HEXADECIMAL=49;
	public static final int Identical=50;
	public static final int Identifier=51;
	public static final int If=52;
	public static final int Implements=53;
	public static final int Int=54;
	public static final int Interface=55;
	public static final int LeftCurlyBrace=56;
	public static final int LeftParanthesis=57;
	public static final int LeftSquareBrace=58;
	public static final int LessEqualThan=59;
	public static final int LessThan=60;
	public static final int LogicAnd=61;
	public static final int LogicAndWeak=62;
	public static final int LogicNot=63;
	public static final int LogicOr=64;
	public static final int LogicOrWeak=65;
	public static final int LogicXorWeak=66;
	public static final int Minus=67;
	public static final int MinusEqual=68;
	public static final int MinusMinus=69;
	public static final int Modulo=70;
	public static final int ModuloEqual=71;
	public static final int Multiply=72;
	public static final int MultiplyEqual=73;
	public static final int NULL=74;
	public static final int Namespace=75;
	public static final int New=76;
	public static final int NotEqual=77;
	public static final int NotEqualAlternative=78;
	public static final int NotIdentical=79;
	public static final int Null=80;
	public static final int OCTAL=81;
	public static final int ObjectOperator=82;
	public static final int Plus=83;
	public static final int PlusEqual=84;
	public static final int PlusPlus=85;
	public static final int Private=86;
	public static final int Protected=87;
	public static final int Public=88;
	public static final int QuestionMark=89;
	public static final int Return=90;
	public static final int RightCurlyBrace=91;
	public static final int RightParanthesis=92;
	public static final int RightSquareBrace=93;
	public static final int STRING_DOUBLE_QUOTED=94;
	public static final int STRING_SINGLE_QUOTED=95;
	public static final int Semicolon=96;
	public static final int ShiftLeft=97;
	public static final int ShiftLeftEqual=98;
	public static final int ShiftRight=99;
	public static final int ShiftRightEqual=100;
	public static final int Static=101;
	public static final int String=102;
	public static final int Switch=103;
	public static final int Throw=104;
	public static final int Try=105;
	public static final int TypeArray=106;
	public static final int TypeBool=107;
	public static final int TypeBoolean=108;
	public static final int TypeFloat=109;
	public static final int TypeInt=110;
	public static final int TypeObject=111;
	public static final int TypeResource=112;
	public static final int TypeString=113;
	public static final int VariableId=114;
	public static final int Void=115;
	public static final int While=116;
	public static final int Whitespace=117;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:166:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog841);
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

					match(input,EOF,FOLLOW_EOF_in_prog844); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:167:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:167:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:167:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog849);
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

					match(input,EOF,FOLLOW_EOF_in_prog852); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog857);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog859); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon872); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon874);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon876); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon878);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket891); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket893);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket896); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket898);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket901); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId967); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId970); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId972); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace985);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:1: statement : ( definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:2: ( definition | instructionWithoutBreakContinue )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Abstract||LA9_0==Class||LA9_0==Const||LA9_0==Final||LA9_0==Function||LA9_0==Interface) ) {
				alt9=1;
			}
			else if ( (LA9_0==Backslash||LA9_0==Do||LA9_0==Echo||LA9_0==Exit||(LA9_0 >= For && LA9_0 <= Foreach)||(LA9_0 >= Identifier && LA9_0 <= If)||LA9_0==LeftCurlyBrace||LA9_0==MinusMinus||LA9_0==PlusPlus||LA9_0==Return||(LA9_0 >= Switch && LA9_0 <= VariableId)||LA9_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement996);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1001);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constantDeclaration );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constantDeclaration )
			int alt10=4;
			switch ( input.LA(1) ) {
			case Abstract:
			case Class:
			case Final:
				{
				alt10=1;
				}
				break;
			case Interface:
				{
				alt10=2;
				}
				break;
			case Function:
				{
				alt10=3;
				}
				break;
			case Const:
				{
				alt10=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition1012);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition1017);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition1022);
					functionDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_definition1027);
					constantDeclaration();
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:4: ( 'abstract' | 'final' )?
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

			match(input,Class,FOLLOW_Class_in_classDeclaration1049); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1051); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:45: ( extendsDeclaration )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Extends) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1053);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:65: ( implementsDeclaration )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Implements) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1056);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1059); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1061);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1064); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1078); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1080);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1089); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:15: ( ',' Identifier )*
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1092); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1094); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1105); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1107);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:1: classBody : ( constantDeclaration | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:2: ( constantDeclaration | attributeDeclaration | methodDeclaration )
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
					if ( (LA16_3==Backslash||LA16_3==Identifier||(LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
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
					if ( (LA16_4==Backslash||LA16_4==Identifier||(LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
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
				if ( (LA16_3==Backslash||LA16_3==Identifier||(LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
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
				if ( (LA16_4==Backslash||LA16_4==Identifier||(LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_classBody1117);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1122);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1128);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: constantDeclaration : 'const' primitiveTypes constDeclarationList ';' ;
	public final void constantDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:20: ( 'const' primitiveTypes constDeclarationList ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:22: 'const' primitiveTypes constDeclarationList ';'
			{
			match(input,Const,FOLLOW_Const_in_constantDeclaration1137); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constantDeclaration1139);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constDeclarationList_in_constantDeclaration1141);
			constDeclarationList();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_constantDeclaration1143); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: constDeclarationList : constantAssignment ( ',' constantAssignment )* ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:2: ( constantAssignment ( ',' constantAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:5: constantAssignment ( ',' constantAssignment )*
			{
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1153);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:24: ( ',' constantAssignment )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Comma) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:25: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1156); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1158);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1168); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1171); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1173);
			unaryPrimitiveAtom();
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1182);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:24: ( ',' variableAssignment )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1185); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1187);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'static' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Static) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1199); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1202);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1204);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1206); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1213);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1218); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1241);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:24: ( ',' ( variableAssignment | VariableId ) )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1244); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1247);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1249); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1264); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:34: ( accessorWithoutPrivate )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1266);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1280); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:15: ( 'final' )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==Final) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1282); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1290); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:14: ( 'static' )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==Static) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1292); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:6: ( accessor )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= Private && LA27_0 <= Public)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1306);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1313);
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



	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1323); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1325); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:27: ( implementsDeclaration )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Implements) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1327);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1330); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:54: ( interfaceBody )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Const||LA30_0==Function||LA30_0==Public) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1332);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop30;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1335); if (state.failed) return ;
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
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: interfaceBody : ( constantDeclaration | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( constantDeclaration | interfaceMethodDeclaration )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Const) ) {
				alt31=1;
			}
			else if ( (LA31_0==Function||LA31_0==Public) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_interfaceBody1344);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1349);
					interfaceMethodDeclaration();
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
	// $ANTLR end "interfaceBody"



	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: ( 'public' )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Public) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1360); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1363);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1365); if (state.failed) return ;
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
	// $ANTLR end "interfaceMethodDeclaration"



	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1381);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1383); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:40: ( instructionWithoutBreakContinue )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Backslash||LA33_0==Do||LA33_0==Echo||LA33_0==Exit||(LA33_0 >= For && LA33_0 <= Foreach)||(LA33_0 >= Identifier && LA33_0 <= If)||LA33_0==LeftCurlyBrace||LA33_0==MinusMinus||LA33_0==PlusPlus||LA33_0==Return||(LA33_0 >= Switch && LA33_0 <= VariableId)||LA33_0==While) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1385);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1388); if (state.failed) return ;
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



	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1398); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1400);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1402); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1404); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:41: ( paramList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Backslash||LA34_0==Identifier||(LA34_0 >= TypeArray && LA34_0 <= TypeString)) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1406);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1409); if (state.failed) return ;
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
	// $ANTLR end "functionDeclarationWithoutBody"



	// $ANTLR start "returnType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:2: ( allTypes | 'void' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Backslash||LA35_0==Identifier||(LA35_0 >= TypeArray && LA35_0 <= TypeString)) ) {
				alt35=1;
			}
			else if ( (LA35_0==Void) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1419);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1423); if (state.failed) return ;
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



	// $ANTLR start "allTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final void allTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( ((LA36_0 >= TypeArray && LA36_0 <= TypeInt)||(LA36_0 >= TypeResource && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			else if ( (LA36_0==Backslash||LA36_0==Identifier||LA36_0==TypeObject) ) {
				alt36=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1430);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:36: classInterfaceTypeInclObject
					{
					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1434);
					classInterfaceTypeInclObject();
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
	// $ANTLR end "allTypes"



	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
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



	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:2: ( primitiveTypes | TypeArray )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= TypeBool && LA37_0 <= TypeInt)||LA37_0==TypeString) ) {
				alt37=1;
			}
			else if ( (LA37_0==TypeArray) ) {
				alt37=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1475);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1480); if (state.failed) return ;
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
	// $ANTLR end "primitiveTypesInclArray"



	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:2: ( primitiveTypesInclArray | TypeResource )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= TypeArray && LA38_0 <= TypeInt)||LA38_0==TypeString) ) {
				alt38=1;
			}
			else if ( (LA38_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1492);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1497); if (state.failed) return ;
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
	// $ANTLR end "primitiveTypesExtended"



	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final void classInterfaceTypeWithoutObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: ( '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: ( '\\\\' )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Backslash) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: '\\\\'
					{
					match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1511); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1514);
			namespaceId();
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
	// $ANTLR end "classInterfaceTypeWithoutObject"



	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final void classInterfaceTypeInclObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==TypeObject) ) {
				alt40=1;
			}
			else if ( (LA40_0==Backslash||LA40_0==Identifier) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1527); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: classInterfaceTypeWithoutObject
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1533);
					classInterfaceTypeWithoutObject();
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
	// $ANTLR end "classInterfaceTypeInclObject"



	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt45=3;
			alt45 = dfa45.predict(input);
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1545);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:29: ( ',' paramDeclarationOptional )*
					loop41:
					do {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==Comma) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1548); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1550);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop41;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1557);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:21: ( ',' paramDeclaration )*
					loop42:
					do {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==Comma) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1560); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1562);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop42;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1569);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:21: ( paramDeclaration ',' )*
					loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==Backslash||LA43_0==Identifier||(LA43_0 >= TypeArray && LA43_0 <= TypeString)) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1572);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1574); if (state.failed) return ;
							}
							break;

						default :
							break loop43;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:45: ( ',' paramDeclarationOptional )+
					int cnt44=0;
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1579); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1581);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt44 >= 1 ) break loop44;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(44, input);
								throw eee;
						}
						cnt44++;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1595);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1597); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:320:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:320:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1607);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1610); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1612);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LeftCurlyBrace) ) {
				alt47=1;
			}
			else if ( (LA47_0==Backslash||LA47_0==Do||LA47_0==Echo||LA47_0==Exit||(LA47_0 >= For && LA47_0 <= Foreach)||(LA47_0 >= Identifier && LA47_0 <= If)||LA47_0==MinusMinus||LA47_0==PlusPlus||LA47_0==Return||(LA47_0 >= Switch && LA47_0 <= VariableId)||LA47_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1634); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:8: ( instructionWithoutBreakContinue )+
					int cnt46=0;
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Backslash||LA46_0==Do||LA46_0==Echo||LA46_0==Exit||(LA46_0 >= For && LA46_0 <= Foreach)||(LA46_0 >= Identifier && LA46_0 <= If)||LA46_0==LeftCurlyBrace||LA46_0==MinusMinus||LA46_0==PlusPlus||LA46_0==Return||(LA46_0 >= Switch && LA46_0 <= VariableId)||LA46_0==While) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1636);
							instructionWithoutBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1640); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1645);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt50=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt50=1;
				}
				break;
			case Backslash:
			case Do:
			case Echo:
			case Exit:
			case For:
			case Foreach:
			case Identifier:
			case If:
			case MinusMinus:
			case PlusPlus:
			case Return:
			case Switch:
			case Throw:
			case Try:
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
				alt50=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt50=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1656); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:8: ( instructionInclBreakContinue )+
					int cnt48=0;
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Break||LA48_0==Continue||LA48_0==Do||LA48_0==Echo||LA48_0==Exit||(LA48_0 >= For && LA48_0 <= Foreach)||(LA48_0 >= Identifier && LA48_0 <= If)||LA48_0==LeftCurlyBrace||LA48_0==MinusMinus||LA48_0==PlusPlus||LA48_0==Return||(LA48_0 >= Switch && LA48_0 <= VariableId)||LA48_0==While) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1658);
							instructionInclBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1662); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1667);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:25: ( Int )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==Int) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1678); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1681); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt52=15;
			alt52 = dfa52.predict(input);
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1693);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1695); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1700);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1702); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1707);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1712);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1717);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1722);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1727);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1732);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction1737);
					tryCatch();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:4: throwException
					{
					pushFollow(FOLLOW_throwException_in_instruction1742);
					throwException();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_instruction1747);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_instruction1752);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1757); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:13: ( expression )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==At||LA51_0==BitwiseNot||LA51_0==Bool||LA51_0==Float||LA51_0==Identifier||LA51_0==Int||(LA51_0 >= LeftParanthesis && LA51_0 <= LeftSquareBrace)||LA51_0==LogicNot||LA51_0==Minus||LA51_0==MinusMinus||LA51_0==NULL||LA51_0==New||LA51_0==Null||LA51_0==Plus||LA51_0==PlusPlus||LA51_0==String||LA51_0==TypeArray||LA51_0==VariableId||LA51_0==118) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1759);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1762); if (state.failed) return ;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1767); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1769);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1771); if (state.failed) return ;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1776); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1778); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1790);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:15: ( ',' expression )*
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==Comma) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1793); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1795);
					expression();
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
	// $ANTLR end "expressionList"



	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt54=3;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==VariableId) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==MinusMinus||LA54_1==PlusPlus) ) {
					alt54=2;
				}
				else if ( (LA54_1==Assign||LA54_1==BitwiseAndEqual||LA54_1==BitwiseOrEqual||LA54_1==BitwiseXorEqual||LA54_1==DivideEqual||LA54_1==DotEqual||LA54_1==MinusEqual||LA54_1==ModuloEqual||LA54_1==MultiplyEqual||LA54_1==PlusEqual||LA54_1==ShiftLeftEqual||LA54_1==ShiftRightEqual) ) {
					alt54=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA54_0==MinusMinus||LA54_0==PlusPlus) ) {
				alt54=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1806); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1808);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1810);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1815);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1820);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement1898); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement1920); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration1932);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1934); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:24: ( '=' expression )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==Assign) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration1937); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration1939);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression1951);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1960);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:17: ( 'or' logicXorWeak )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==LogicOrWeak) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak1963); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1965);
					logicXorWeak();
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
	// $ANTLR end "logicOrWeak"



	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1978);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:17: ( 'xor' logicAndWeak )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==LogicXorWeak) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak1981); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1983);
					logicAndWeak();
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
	// $ANTLR end "logicXorWeak"



	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak1996);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:15: ( 'and' assignment )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==LogicAndWeak) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak1999); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak2001);
					assignment();
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
	// $ANTLR end "logicAndWeak"



	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment2012);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:12: ( assignmentOperator ternary )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==Assign||LA59_0==BitwiseAndEqual||LA59_0==BitwiseOrEqual||LA59_0==BitwiseXorEqual||LA59_0==DivideEqual||LA59_0==DotEqual||LA59_0==MinusEqual||LA59_0==ModuloEqual||LA59_0==MultiplyEqual||LA59_0==PlusEqual||LA59_0==ShiftLeftEqual||LA59_0==ShiftRightEqual) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2015);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment2017);
					ternary();
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
	// $ANTLR end "assignment"



	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary2027);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:19: ( '?' expression ':' logicOr )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==QuestionMark) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2030); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2032);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary2034); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary2036);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr2046);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:20: ( '||' logicAnd )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicOr) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2049); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr2051);
					logicAnd();
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
	// $ANTLR end "logicOr"



	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2060);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:21: ( '&&' bitwiseOr )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicAnd) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2063); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2065);
					bitwiseOr();
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
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2076);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:15: ( '|' bitwiseXor )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==BitwiseOr) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2079); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2081);
					bitwiseXor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop63;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2092);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:15: ( '^' bitwiseAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==BitwiseXor) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2095); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2097);
					bitwiseAnd();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop64;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd2108);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:13: ( '&' equality )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==BitwiseAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2111); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2113);
					equality();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop65;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2122);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:22: ( equalityOperator comparison )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==Equal||LA66_0==Identical||(LA66_0 >= NotEqual && LA66_0 <= NotIdentical)) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2125);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2127);
					comparison();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop66;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2169);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:17: ( comparisonOperator bitwiseShift )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= GreaterEqualThan && LA67_0 <= GreaterThan)||(LA67_0 >= LessEqualThan && LA67_0 <= LessThan)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2172);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2174);
					bitwiseShift();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop67;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2210);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==ShiftLeft||LA68_0==ShiftRight) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2219);
					termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop68;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2229);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:36: ( ( '+' | '-' | '.' ) factor )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==Dot||LA69_0==Minus||LA69_0==Plus) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2240);
					factor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop69;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2250);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==Divide||LA70_0==Modulo||LA70_0==Multiply) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2261);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop70;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:9: ( '!' logicNot | castOrBitwiseNotOrAt )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==LogicNot) ) {
				alt71=1;
			}
			else if ( (LA71_0==At||LA71_0==BitwiseNot||LA71_0==Bool||LA71_0==Float||LA71_0==Identifier||LA71_0==Int||(LA71_0 >= LeftParanthesis && LA71_0 <= LeftSquareBrace)||LA71_0==Minus||LA71_0==MinusMinus||LA71_0==NULL||LA71_0==New||LA71_0==Null||LA71_0==Plus||LA71_0==PlusPlus||LA71_0==String||LA71_0==TypeArray||LA71_0==VariableId||LA71_0==118) ) {
				alt71=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2270); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2272);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot2277);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:2: ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt72=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				switch ( input.LA(2) ) {
				case TypeBool:
				case TypeBoolean:
				case TypeFloat:
				case TypeInt:
				case TypeString:
					{
					alt72=1;
					}
					break;
				case TypeArray:
					{
					int LA72_6 = input.LA(3);
					if ( (LA72_6==LeftParanthesis) ) {
						alt72=4;
					}
					else if ( (LA72_6==RightParanthesis) ) {
						alt72=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 72, 6, input);
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
				case Identifier:
				case Int:
				case LeftParanthesis:
				case LeftSquareBrace:
				case LogicNot:
				case Minus:
				case MinusMinus:
				case NULL:
				case New:
				case Null:
				case Plus:
				case PlusPlus:
				case String:
				case VariableId:
				case 118:
					{
					alt72=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt72=2;
				}
				break;
			case At:
				{
				alt72=3;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftSquareBrace:
			case Minus:
			case MinusMinus:
			case NULL:
			case New:
			case Null:
			case Plus:
			case PlusPlus:
			case String:
			case TypeArray:
			case VariableId:
			case 118:
				{
				alt72=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:4: ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:4: ( '(' primitiveTypesInclArray ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:5: '(' primitiveTypesInclArray ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2291); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2293);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2295); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2298);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2303); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2305);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2310); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2312);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2317);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | newOrClone );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:2: ( postIncrementDecrement | preIncrementDecrement | newOrClone )
			int alt73=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA73_1 = input.LA(2);
				if ( (LA73_1==MinusMinus||LA73_1==PlusPlus) ) {
					alt73=1;
				}
				else if ( (LA73_1==EOF||LA73_1==Arrow||LA73_1==Assign||(LA73_1 >= BitwiseAnd && LA73_1 <= BitwiseAndEqual)||(LA73_1 >= BitwiseOr && LA73_1 <= BitwiseXorEqual)||(LA73_1 >= Colon && LA73_1 <= Comma)||(LA73_1 >= Divide && LA73_1 <= DivideEqual)||(LA73_1 >= Dot && LA73_1 <= DotEqual)||LA73_1==Equal||(LA73_1 >= GreaterEqualThan && LA73_1 <= GreaterThan)||LA73_1==Identical||(LA73_1 >= LessEqualThan && LA73_1 <= LogicAndWeak)||(LA73_1 >= LogicOr && LA73_1 <= MinusEqual)||(LA73_1 >= Modulo && LA73_1 <= MultiplyEqual)||(LA73_1 >= NotEqual && LA73_1 <= NotIdentical)||(LA73_1 >= ObjectOperator && LA73_1 <= PlusEqual)||LA73_1==QuestionMark||(LA73_1 >= RightParanthesis && LA73_1 <= RightSquareBrace)||(LA73_1 >= Semicolon && LA73_1 <= ShiftRightEqual)) ) {
					alt73=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 1, input);
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
				alt73=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case NULL:
			case New:
			case Null:
			case Plus:
			case String:
			case TypeArray:
			case 118:
				{
				alt73=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2329);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2334);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:4: newOrClone
					{
					pushFollow(FOLLOW_newOrClone_in_incrementDecrement2339);
					newOrClone();
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



	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:1: newOrClone : ( newObject | 'clone' VariableId | unaryAtom );
	public final void newOrClone() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:2: ( newObject | 'clone' VariableId | unaryAtom )
			int alt74=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt74=1;
				}
				break;
			case 118:
				{
				alt74=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case NULL:
			case Null:
			case Plus:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt74=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:4: newObject
					{
					pushFollow(FOLLOW_newObject_in_newOrClone2350);
					newObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:4: 'clone' VariableId
					{
					match(input,118,FOLLOW_118_in_newOrClone2355); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_newOrClone2357); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_newOrClone2362);
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
	// $ANTLR end "newOrClone"



	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final void newObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt76=2;
			alt76 = dfa76.predict(input);
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:4: 'new' classInterfaceTypeWithoutObject
					{
					match(input,New,FOLLOW_New_in_newObject2373); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2375);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					match(input,New,FOLLOW_New_in_newObject2380); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2382);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2384); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:46: ( expressionList )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==At||LA75_0==BitwiseNot||LA75_0==Bool||LA75_0==Float||LA75_0==Identifier||LA75_0==Int||(LA75_0 >= LeftParanthesis && LA75_0 <= LeftSquareBrace)||LA75_0==LogicNot||LA75_0==Minus||LA75_0==MinusMinus||LA75_0==NULL||LA75_0==New||LA75_0==Null||LA75_0==Plus||LA75_0==PlusPlus||LA75_0==String||LA75_0==TypeArray||LA75_0==VariableId||LA75_0==118) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2386);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2389); if (state.failed) return ;
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
	// $ANTLR end "newObject"



	// $ANTLR start "unaryAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:475:1: unaryAtom : ( '+' atomOrCall | '-' atomOrCall | atomOrCall );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:2: ( '+' atomOrCall | '-' atomOrCall | atomOrCall )
			int alt77=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt77=1;
				}
				break;
			case Minus:
				{
				alt77=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case NULL:
			case Null:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt77=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:4: '+' atomOrCall
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2398); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2400);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: '-' atomOrCall
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2405); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2407);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: atomOrCall
					{
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2412);
					atomOrCall();
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



	// $ANTLR start "atomOrCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:1: atomOrCall : ( atom | methodCall | functionCall );
	public final void atomOrCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:2: ( atom | methodCall | functionCall )
			int alt78=3;
			switch ( input.LA(1) ) {
			case Bool:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case NULL:
			case Null:
			case String:
			case TypeArray:
				{
				alt78=1;
				}
				break;
			case VariableId:
				{
				int LA78_2 = input.LA(2);
				if ( (LA78_2==ObjectOperator) ) {
					alt78=2;
				}
				else if ( (LA78_2==EOF||LA78_2==Arrow||LA78_2==Assign||(LA78_2 >= BitwiseAnd && LA78_2 <= BitwiseAndEqual)||(LA78_2 >= BitwiseOr && LA78_2 <= BitwiseXorEqual)||(LA78_2 >= Colon && LA78_2 <= Comma)||(LA78_2 >= Divide && LA78_2 <= DivideEqual)||(LA78_2 >= Dot && LA78_2 <= DotEqual)||LA78_2==Equal||(LA78_2 >= GreaterEqualThan && LA78_2 <= GreaterThan)||LA78_2==Identical||(LA78_2 >= LessEqualThan && LA78_2 <= LogicAndWeak)||(LA78_2 >= LogicOr && LA78_2 <= MinusEqual)||(LA78_2 >= Modulo && LA78_2 <= MultiplyEqual)||(LA78_2 >= NotEqual && LA78_2 <= NotIdentical)||(LA78_2 >= Plus && LA78_2 <= PlusEqual)||LA78_2==QuestionMark||(LA78_2 >= RightParanthesis && LA78_2 <= RightSquareBrace)||(LA78_2 >= Semicolon && LA78_2 <= ShiftRightEqual)) ) {
					alt78=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				alt78=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: atom
					{
					pushFollow(FOLLOW_atom_in_atomOrCall2422);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_atomOrCall2427);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atomOrCall2432);
					functionCall();
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
	// $ANTLR end "atomOrCall"



	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:486:1: functionCall : namespaceId '(' ( expressionList )? ')' ';' ;
	public final void functionCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:2: ( namespaceId '(' ( expressionList )? ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:4: namespaceId '(' ( expressionList )? ')' ';'
			{
			pushFollow(FOLLOW_namespaceId_in_functionCall2444);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2446); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:20: ( expressionList )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==At||LA79_0==BitwiseNot||LA79_0==Bool||LA79_0==Float||LA79_0==Identifier||LA79_0==Int||(LA79_0 >= LeftParanthesis && LA79_0 <= LeftSquareBrace)||LA79_0==LogicNot||LA79_0==Minus||LA79_0==MinusMinus||LA79_0==NULL||LA79_0==New||LA79_0==Null||LA79_0==Plus||LA79_0==PlusPlus||LA79_0==String||LA79_0==TypeArray||LA79_0==VariableId||LA79_0==118) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:20: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2448);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2451); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_functionCall2453); if (state.failed) return ;
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
	// $ANTLR end "functionCall"



	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:1: methodCall : VariableId '->' Identifier '(' ( expressionList )? ')' ';' ;
	public final void methodCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:2: ( VariableId '->' Identifier '(' ( expressionList )? ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: VariableId '->' Identifier '(' ( expressionList )? ')' ';'
			{
			match(input,VariableId,FOLLOW_VariableId_in_methodCall2462); if (state.failed) return ;
			match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2463); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_methodCall2464); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2466); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:33: ( expressionList )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==At||LA80_0==BitwiseNot||LA80_0==Bool||LA80_0==Float||LA80_0==Identifier||LA80_0==Int||(LA80_0 >= LeftParanthesis && LA80_0 <= LeftSquareBrace)||LA80_0==LogicNot||LA80_0==Minus||LA80_0==MinusMinus||LA80_0==NULL||LA80_0==New||LA80_0==Null||LA80_0==Plus||LA80_0==PlusPlus||LA80_0==String||LA80_0==TypeArray||LA80_0==VariableId||LA80_0==118) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:33: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2468);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2470); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_methodCall2472); if (state.failed) return ;
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
	// $ANTLR end "methodCall"



	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:1: atom : ( '(' expression ')' | primitiveAtom | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:6: ( '(' expression ')' | primitiveAtom | array | VariableId )
			int alt81=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt81=1;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt81=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt81=3;
				}
				break;
			case VariableId:
				{
				alt81=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2482); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2484);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2486); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2491);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: array
					{
					pushFollow(FOLLOW_array_in_atom2496);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2501); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt82=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt82=1;
				}
				break;
			case Minus:
				{
				alt82=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt82=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2515); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2517);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2522); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2524);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2529);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:2: ( Bool | Int | Float | String | Null | NULL )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Int||input.LA(1)==NULL||input.LA(1)==Null||input.LA(1)==String ) {
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
	// $ANTLR end "primitiveAtom"



	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LeftSquareBrace) ) {
				alt85=1;
			}
			else if ( (LA85_0==TypeArray) ) {
				alt85=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3027); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:13: ( array_content )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==At||LA83_0==BitwiseNot||LA83_0==Bool||LA83_0==Float||LA83_0==Identifier||LA83_0==Int||(LA83_0 >= LeftParanthesis && LA83_0 <= LeftSquareBrace)||LA83_0==LogicNot||LA83_0==Minus||LA83_0==MinusMinus||LA83_0==NULL||LA83_0==New||LA83_0==Null||LA83_0==Plus||LA83_0==PlusPlus||LA83_0==String||LA83_0==TypeArray||LA83_0==VariableId||LA83_0==118) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3029);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3032); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array3038); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3040); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:18: ( array_content )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==At||LA84_0==BitwiseNot||LA84_0==Bool||LA84_0==Float||LA84_0==Identifier||LA84_0==Int||(LA84_0 >= LeftParanthesis && LA84_0 <= LeftSquareBrace)||LA84_0==LogicNot||LA84_0==Minus||LA84_0==MinusMinus||LA84_0==NULL||LA84_0==New||LA84_0==Null||LA84_0==Plus||LA84_0==PlusPlus||LA84_0==String||LA84_0==TypeArray||LA84_0==VariableId||LA84_0==118) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3042);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3045); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:4: ( expression '=>' )?
			int alt86=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA86_1 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA86_2 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA86_3 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case At:
					{
					int LA86_4 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case VariableId:
					{
					int LA86_5 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA86_6 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case New:
					{
					int LA86_7 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case 118:
					{
					int LA86_8 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case Plus:
					{
					int LA86_9 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case Minus:
					{
					int LA86_10 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case NULL:
				case Null:
				case String:
					{
					int LA86_11 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA86_12 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA86_13 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
				case Identifier:
					{
					int LA86_14 = input.LA(2);
					if ( (synpred153_TSPHP()) ) {
						alt86=1;
					}
					}
					break;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3058);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content3060); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3064);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:35: ( ',' ( expression '=>' )? expression )*
			loop88:
			do {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==Comma) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content3068); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:40: ( expression '=>' )?
					int alt87=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA87_1 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA87_2 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA87_3 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case At:
							{
							int LA87_4 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case VariableId:
							{
							int LA87_5 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA87_6 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case New:
							{
							int LA87_7 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case 118:
							{
							int LA87_8 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case Plus:
							{
							int LA87_9 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case Minus:
							{
							int LA87_10 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case NULL:
						case Null:
						case String:
							{
							int LA87_11 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA87_12 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA87_13 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
						case Identifier:
							{
							int LA87_14 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt87=1;
							}
							}
							break;
					}
					switch (alt87) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3071);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content3073); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3077);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop88;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition3089); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3091); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition3093);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3095); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3097);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:3: ( 'else' instructionInclBreakContinue )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==Else) ) {
				int LA89_1 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt89=1;
				}
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition3104); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3106);
					instructionInclBreakContinue();
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



	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3122); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3124); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3126); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3128); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3130); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==Case) ) {
				int LA102_1 = input.LA(2);
				if ( (synpred164_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: ( caseLabel )+
							int cnt90=0;
							loop90:
							do {
								int alt90=2;
								int LA90_0 = input.LA(1);
								if ( (LA90_0==Case) ) {
									alt90=1;
								}

								switch (alt90) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3141);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:16: ( instructionInclBreakContinue )+
							int cnt91=0;
							loop91:
							do {
								int alt91=2;
								int LA91_0 = input.LA(1);
								if ( (LA91_0==Backslash||LA91_0==Break||LA91_0==Continue||LA91_0==Do||LA91_0==Echo||LA91_0==Exit||(LA91_0 >= For && LA91_0 <= Foreach)||(LA91_0 >= Identifier && LA91_0 <= If)||LA91_0==LeftCurlyBrace||LA91_0==MinusMinus||LA91_0==PlusPlus||LA91_0==Return||(LA91_0 >= Switch && LA91_0 <= VariableId)||LA91_0==While) ) {
									alt91=1;
								}

								switch (alt91) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3144);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
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

						default :
							if ( cnt92 >= 1 ) break loop92;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(92, input);
								throw eee;
						}
						cnt92++;
					} while (true);

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3149);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:61: ( instructionInclBreakContinue )+
					int cnt93=0;
					loop93:
					do {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==Backslash||LA93_0==Break||LA93_0==Continue||LA93_0==Do||LA93_0==Echo||LA93_0==Exit||(LA93_0 >= For && LA93_0 <= Foreach)||(LA93_0 >= Identifier && LA93_0 <= If)||LA93_0==LeftCurlyBrace||LA93_0==MinusMinus||LA93_0==PlusPlus||LA93_0==Return||(LA93_0 >= Switch && LA93_0 <= VariableId)||LA93_0==While) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3151);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt96=0;
					loop96:
					do {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==Case) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3155);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:103: ( instructionInclBreakContinue )+
							int cnt95=0;
							loop95:
							do {
								int alt95=2;
								int LA95_0 = input.LA(1);
								if ( (LA95_0==Backslash||LA95_0==Break||LA95_0==Continue||LA95_0==Do||LA95_0==Echo||LA95_0==Exit||(LA95_0 >= For && LA95_0 <= Foreach)||(LA95_0 >= Identifier && LA95_0 <= If)||LA95_0==LeftCurlyBrace||LA95_0==MinusMinus||LA95_0==PlusPlus||LA95_0==Return||(LA95_0 >= Switch && LA95_0 <= VariableId)||LA95_0==While) ) {
									alt95=1;
								}

								switch (alt95) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3158);
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

						default :
							if ( cnt96 >= 1 ) break loop96;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(96, input);
								throw eee;
						}
						cnt96++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt99=0;
					loop99:
					do {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==Case) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:6: ( caseLabel )+
							int cnt97=0;
							loop97:
							do {
								int alt97=2;
								int LA97_0 = input.LA(1);
								if ( (LA97_0==Case) ) {
									alt97=1;
								}

								switch (alt97) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3168);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt97 >= 1 ) break loop97;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(97, input);
										throw eee;
								}
								cnt97++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:17: ( instructionInclBreakContinue )+
							int cnt98=0;
							loop98:
							do {
								int alt98=2;
								int LA98_0 = input.LA(1);
								if ( (LA98_0==Backslash||LA98_0==Break||LA98_0==Continue||LA98_0==Do||LA98_0==Echo||LA98_0==Exit||(LA98_0 >= For && LA98_0 <= Foreach)||(LA98_0 >= Identifier && LA98_0 <= If)||LA98_0==LeftCurlyBrace||LA98_0==MinusMinus||LA98_0==PlusPlus||LA98_0==Return||(LA98_0 >= Switch && LA98_0 <= VariableId)||LA98_0==While) ) {
									alt98=1;
								}

								switch (alt98) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3171);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt98 >= 1 ) break loop98;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(98, input);
										throw eee;
								}
								cnt98++;
							} while (true);

							}
							break;

						default :
							if ( cnt99 >= 1 ) break loop99;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(99, input);
								throw eee;
						}
						cnt99++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==Default) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3177);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:63: ( instructionInclBreakContinue )+
							int cnt100=0;
							loop100:
							do {
								int alt100=2;
								int LA100_0 = input.LA(1);
								if ( (LA100_0==Backslash||LA100_0==Break||LA100_0==Continue||LA100_0==Do||LA100_0==Echo||LA100_0==Exit||(LA100_0 >= For && LA100_0 <= Foreach)||(LA100_0 >= Identifier && LA100_0 <= If)||LA100_0==LeftCurlyBrace||LA100_0==MinusMinus||LA100_0==PlusPlus||LA100_0==Return||(LA100_0 >= Switch && LA100_0 <= VariableId)||LA100_0==While) ) {
									alt100=1;
								}

								switch (alt100) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3179);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt100 >= 1 ) break loop100;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(100, input);
										throw eee;
								}
								cnt100++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3190); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3202); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3204);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3206); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3215); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3217); if (state.failed) return ;
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



	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3226); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3228); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:21: ( forInit )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==Backslash||LA103_0==Identifier||LA103_0==MinusMinus||LA103_0==PlusPlus||(LA103_0 >= TypeArray && LA103_0 <= VariableId)) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3230);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3233); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:34: ( expressionList )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==At||LA104_0==BitwiseNot||LA104_0==Bool||LA104_0==Float||LA104_0==Identifier||LA104_0==Int||(LA104_0 >= LeftParanthesis && LA104_0 <= LeftSquareBrace)||LA104_0==LogicNot||LA104_0==Minus||LA104_0==MinusMinus||LA104_0==NULL||LA104_0==New||LA104_0==Null||LA104_0==Plus||LA104_0==PlusPlus||LA104_0==String||LA104_0==TypeArray||LA104_0==VariableId||LA104_0==118) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3235);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3239); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:55: ( forUpdate )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==MinusMinus||LA105_0==PlusPlus||LA105_0==VariableId) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3241);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3244); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3246);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:11: ( variableDeclaration | variableAssignment )
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==Backslash||LA106_0==Identifier||(LA106_0 >= TypeArray && LA106_0 <= TypeString)) ) {
				alt106=1;
			}
			else if ( (LA106_0==MinusMinus||LA106_0==PlusPlus||LA106_0==VariableId) ) {
				alt106=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3255);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3257);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:52: ( ',' variableAssignment )*
			loop107:
			do {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==Comma) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3261); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3263);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop107;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:601:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3273);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:23: ( ',' variableAssignment )*
			loop108:
			do {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==Comma) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3276); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3278);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop108;
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
	// $ANTLR end "forUpdate"



	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3289); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3291); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:18: ( VariableId | array )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==VariableId) ) {
				alt109=1;
			}
			else if ( (LA109_0==LeftSquareBrace||LA109_0==TypeArray) ) {
				alt109=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3294); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3296);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3299); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3301); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:53: ( '=>' VariableId )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==Arrow) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3304); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3306); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3310); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3312);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3321); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3323); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3325);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3327); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3329);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:611:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:611:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3339); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3341);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3343); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3345); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3347);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3349); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3351); if (state.failed) return ;
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



	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3358); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3360); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:21: ( instructionInclBreakContinue )+
			int cnt111=0;
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==Backslash||LA111_0==Break||LA111_0==Continue||LA111_0==Do||LA111_0==Echo||LA111_0==Exit||(LA111_0 >= For && LA111_0 <= Foreach)||(LA111_0 >= Identifier && LA111_0 <= If)||LA111_0==LeftCurlyBrace||LA111_0==MinusMinus||LA111_0==PlusPlus||LA111_0==Return||(LA111_0 >= Switch && LA111_0 <= VariableId)||LA111_0==While) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3362);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt111 >= 1 ) break loop111;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(111, input);
						throw eee;
				}
				cnt111++;
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3365); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3367); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3369); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3371);
			classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3373); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3375); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3376); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:114: ( instructionInclBreakContinue )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Backslash||LA112_0==Break||LA112_0==Continue||LA112_0==Do||LA112_0==Echo||LA112_0==Exit||(LA112_0 >= For && LA112_0 <= Foreach)||(LA112_0 >= Identifier && LA112_0 <= If)||LA112_0==LeftCurlyBrace||LA112_0==MinusMinus||LA112_0==PlusPlus||LA112_0==Return||(LA112_0 >= Switch && LA112_0 <= VariableId)||LA112_0==While) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3378);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop112;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3381); if (state.failed) return ;
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
	// $ANTLR end "tryCatch"



	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:1: throwException : 'throw' newObject ';' ;
	public final void throwException() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:4: 'throw' newObject ';'
			{
			match(input,Throw,FOLLOW_Throw_in_throwException3390); if (state.failed) return ;
			pushFollow(FOLLOW_newObject_in_throwException3392);
			newObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_throwException3394); if (state.failed) return ;
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
	// $ANTLR end "throwException"

	// $ANTLR start synpred153_TSPHP
	public final void synpred153_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred153_TSPHP3058);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred153_TSPHP3060); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred153_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred154_TSPHP3071);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred154_TSPHP3073); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred156_TSPHP
	public final void synpred156_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred156_TSPHP3104); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3106);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred156_TSPHP

	// $ANTLR start synpred164_TSPHP
	public final void synpred164_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt132=0;
		loop132:
		do {
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==Case) ) {
				alt132=1;
			}

			switch (alt132) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: ( caseLabel )+
				int cnt130=0;
				loop130:
				do {
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==Case) ) {
						alt130=1;
					}

					switch (alt130) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred164_TSPHP3141);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt130 >= 1 ) break loop130;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(130, input);
							throw eee;
					}
					cnt130++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:16: ( instructionInclBreakContinue )+
				int cnt131=0;
				loop131:
				do {
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==Backslash||LA131_0==Break||LA131_0==Continue||LA131_0==Do||LA131_0==Echo||LA131_0==Exit||(LA131_0 >= For && LA131_0 <= Foreach)||(LA131_0 >= Identifier && LA131_0 <= If)||LA131_0==LeftCurlyBrace||LA131_0==MinusMinus||LA131_0==PlusPlus||LA131_0==Return||(LA131_0 >= Switch && LA131_0 <= VariableId)||LA131_0==While) ) {
						alt131=1;
					}

					switch (alt131) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3144);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt131 >= 1 ) break loop131;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(131, input);
							throw eee;
					}
					cnt131++;
				} while (true);

				}
				break;

			default :
				if ( cnt132 >= 1 ) break loop132;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(132, input);
					throw eee;
			}
			cnt132++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred164_TSPHP3149);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:61: ( instructionInclBreakContinue )+
		int cnt133=0;
		loop133:
		do {
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==Backslash||LA133_0==Break||LA133_0==Continue||LA133_0==Do||LA133_0==Echo||LA133_0==Exit||(LA133_0 >= For && LA133_0 <= Foreach)||(LA133_0 >= Identifier && LA133_0 <= If)||LA133_0==LeftCurlyBrace||LA133_0==MinusMinus||LA133_0==PlusPlus||LA133_0==Return||(LA133_0 >= Switch && LA133_0 <= VariableId)||LA133_0==While) ) {
				alt133=1;
			}

			switch (alt133) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3151);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt133 >= 1 ) break loop133;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(133, input);
					throw eee;
			}
			cnt133++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt136=0;
		loop136:
		do {
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==Case) ) {
				alt136=1;
			}

			switch (alt136) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: ( caseLabel )+
				int cnt134=0;
				loop134:
				do {
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==Case) ) {
						alt134=1;
					}

					switch (alt134) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred164_TSPHP3155);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt134 >= 1 ) break loop134;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(134, input);
							throw eee;
					}
					cnt134++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:103: ( instructionInclBreakContinue )+
				int cnt135=0;
				loop135:
				do {
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==Backslash||LA135_0==Break||LA135_0==Continue||LA135_0==Do||LA135_0==Echo||LA135_0==Exit||(LA135_0 >= For && LA135_0 <= Foreach)||(LA135_0 >= Identifier && LA135_0 <= If)||LA135_0==LeftCurlyBrace||LA135_0==MinusMinus||LA135_0==PlusPlus||LA135_0==Return||(LA135_0 >= Switch && LA135_0 <= VariableId)||LA135_0==While) ) {
						alt135=1;
					}

					switch (alt135) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3158);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt135 >= 1 ) break loop135;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(135, input);
							throw eee;
					}
					cnt135++;
				} while (true);

				}
				break;

			default :
				if ( cnt136 >= 1 ) break loop136;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(136, input);
					throw eee;
			}
			cnt136++;
		} while (true);

		}

	}
	// $ANTLR end synpred164_TSPHP

	// Delegated rules

	public final boolean synpred154_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred153_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred153_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred156_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred164_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred164_TSPHP_fragment(); // can never throw exception
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
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA52 dfa52 = new DFA52(this);
	protected DFA76 dfa76 = new DFA76(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\63\1\uffff\1\12\1\uffff\1\63\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\164\1\70\1\uffff\1\140\1\uffff\1\63\1\uffff\1\140";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\3\uffff\1\2\5\uffff\1\2\4\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\2\uffff\2\2\14\uffff\1\2\5\uffff"+
			"\1\1\11\uffff\1\2\4\uffff\1\2\14\uffff\14\2\1\uffff\1\2",
			"\1\3\4\uffff\1\4",
			"",
			"\1\5\55\uffff\1\4\47\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\55\uffff\1\4\47\uffff\1\6"
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
			return "166:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA45_eotS =
		"\27\uffff";
	static final String DFA45_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA45_minS =
		"\1\12\4\162\1\63\1\12\1\7\1\63\1\uffff\1\12\2\uffff\1\12\4\162\1\63\1"+
		"\12\1\7\1\63\1\12";
	static final String DFA45_maxS =
		"\1\161\4\162\1\63\1\162\1\161\1\63\1\uffff\1\161\2\uffff\5\162\1\63\1"+
		"\162\1\134\1\63\1\162";
	static final String DFA45_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA45_specialS =
		"\27\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\5\50\uffff\1\6\66\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\147\uffff\1\7",
			"\1\11\2\uffff\1\14\15\uffff\1\12\32\uffff\1\14\50\uffff\1\13\15\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\50\uffff\1\23\66\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\147\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\147\uffff\1\24",
			"\1\14\20\uffff\1\13\103\uffff\1\13",
			"\1\26",
			"\1\25\147\uffff\1\24"
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "310:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA52_eotS =
		"\24\uffff";
	static final String DFA52_eofS =
		"\24\uffff";
	static final String DFA52_minS =
		"\1\12\1\7\2\uffff\1\12\14\uffff\1\63\1\uffff\1\12";
	static final String DFA52_maxS =
		"\1\164\1\144\2\uffff\1\162\14\uffff\1\63\1\uffff\1\162";
	static final String DFA52_acceptS =
		"\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\15\1\16"+
		"\1\17\1\14\1\uffff\1\13\1\uffff";
	static final String DFA52_specialS =
		"\24\uffff}>";
	static final String[] DFA52_transitionS = {
			"\1\3\25\uffff\1\12\4\uffff\1\16\2\uffff\1\17\3\uffff\1\7\1\10\5\uffff"+
			"\1\4\1\5\20\uffff\1\2\17\uffff\1\2\4\uffff\1\15\14\uffff\1\6\1\14\1\13"+
			"\10\3\1\1\1\uffff\1\11",
			"\1\2\4\uffff\1\2\2\uffff\1\2\1\uffff\1\2\15\uffff\1\2\3\uffff\1\2\40"+
			"\uffff\2\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\20\1\uffff\2\2\14\uffff"+
			"\1\2\1\uffff\1\2",
			"",
			"",
			"\1\21\56\uffff\1\22\70\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23",
			"",
			"\1\21\56\uffff\1\22\70\uffff\1\3"
	};

	static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
	static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
	static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
	static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
	static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
	static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
	static final short[][] DFA52_transition;

	static {
		int numStates = DFA52_transitionS.length;
		DFA52_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
		}
	}

	class DFA52 extends DFA {

		public DFA52(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 52;
			this.eot = DFA52_eot;
			this.eof = DFA52_eof;
			this.min = DFA52_min;
			this.max = DFA52_max;
			this.accept = DFA52_accept;
			this.special = DFA52_special;
			this.transition = DFA52_transition;
		}
		@Override
		public String getDescription() {
			return "336:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );";
		}
	}

	static final String DFA76_eotS =
		"\10\uffff";
	static final String DFA76_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA76_minS =
		"\1\114\1\12\1\63\1\5\1\63\2\uffff\1\5";
	static final String DFA76_maxS =
		"\1\114\2\63\1\144\1\63\2\uffff\1\144";
	static final String DFA76_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA76_specialS =
		"\10\uffff}>";
	static final String[] DFA76_transitionS = {
			"\1\1",
			"\1\2\50\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\5\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\5\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5"
	};

	static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
	static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
	static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
	static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
	static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
	static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
	static final short[][] DFA76_transition;

	static {
		int numStates = DFA76_transitionS.length;
		DFA76_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
		}
	}

	class DFA76 extends DFA {

		public DFA76(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 76;
			this.eot = DFA76_eot;
			this.eof = DFA76_eof;
			this.min = DFA76_min;
			this.max = DFA76_max;
			this.accept = DFA76_accept;
			this.special = DFA76_special;
			this.transition = DFA76_transition;
		}
		@Override
		public String getDescription() {
			return "471:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_EOF_in_prog844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_EOF_in_prog852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog857 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon872 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon874 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon876 = new BitSet(new long[]{0x0198752104400410L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon878 = new BitSet(new long[]{0x0198752104400412L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket891 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket893 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket896 = new BitSet(new long[]{0x0198752104400410L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket898 = new BitSet(new long[]{0x0198752104400410L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId967 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId970 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId972 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace985 = new BitSet(new long[]{0x0198752104400412L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_definition_in_statement996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_definition1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1049 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1051 = new BitSet(new long[]{0x0120020000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1053 = new BitSet(new long[]{0x0120000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1056 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1059 = new BitSet(new long[]{0x0000440004000010L,0x0000002001C00000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1061 = new BitSet(new long[]{0x0000440004000010L,0x0000002009C00000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1078 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1089 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1092 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1094 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1105 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_classBody1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constantDeclaration1137 = new BitSet(new long[]{0x0000000000000000L,0x0002780000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constantDeclaration1139 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_constDeclarationList_in_constantDeclaration1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_constantDeclaration1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1153 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1156 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1158 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1168 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1171 = new BitSet(new long[]{0x0040080000040000L,0x0000004000090408L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1182 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1185 = new BitSet(new long[]{0x0000000000000000L,0x0004000000200020L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1187 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1202 = new BitSet(new long[]{0x0008000000000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1241 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1244 = new BitSet(new long[]{0x0000000000000000L,0x0004000000200020L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1247 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1249 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1264 = new BitSet(new long[]{0x0000400000000000L,0x0000000001800000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1266 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1280 = new BitSet(new long[]{0x0000440000000000L,0x0000000001C00000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1282 = new BitSet(new long[]{0x0000400000000000L,0x0000000001C00000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1290 = new BitSet(new long[]{0x0000400000000000L,0x0000002001C00000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1292 = new BitSet(new long[]{0x0000400000000000L,0x0000000001C00000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1306 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1323 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1325 = new BitSet(new long[]{0x0120000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1327 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1330 = new BitSet(new long[]{0x0000400004000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1332 = new BitSet(new long[]{0x0000400004000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_interfaceBody1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1360 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1381 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1383 = new BitSet(new long[]{0x0118312100000400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1385 = new BitSet(new long[]{0x0118312100000400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1398 = new BitSet(new long[]{0x0008000000000400L,0x000BFC0000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1400 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1402 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1404 = new BitSet(new long[]{0x0008000000000400L,0x0003FC0010000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1511 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1545 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1548 = new BitSet(new long[]{0x0008000000000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1550 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1557 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1560 = new BitSet(new long[]{0x0008000000000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1562 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1569 = new BitSet(new long[]{0x0008000001000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1572 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1574 = new BitSet(new long[]{0x0008000001000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1579 = new BitSet(new long[]{0x0008000000000400L,0x0003FC0000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1581 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1595 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1607 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1610 = new BitSet(new long[]{0x0648080000040000L,0x0004044000090408L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1634 = new BitSet(new long[]{0x0118312100000400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1636 = new BitSet(new long[]{0x0118312100000400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1656 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1658 = new BitSet(new long[]{0x0118312108080400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1672 = new BitSet(new long[]{0x0040000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_instruction1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_instruction1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1757 = new BitSet(new long[]{0x8648080000042100L,0x0044044100291428L});
	public static final BitSet FOLLOW_expression_in_instruction1759 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1767 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expressionList_in_instruction1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1790 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1793 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_expressionList1795 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1806 = new BitSet(new long[]{0x0000000880029080L,0x0000001400100290L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1808 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200020L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement1914 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration1932 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1934 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration1937 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak1963 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak1981 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1996 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak1999 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2001 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2012 = new BitSet(new long[]{0x0000000880029082L,0x0000001400100290L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2015 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_ternary_in_assignment2017 = new BitSet(new long[]{0x0000000880029082L,0x0000001400100290L});
	public static final BitSet FOLLOW_logicOr_in_ternary2027 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2030 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_ternary2032 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_ternary2034 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicOr_in_ternary2036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2049 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2060 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2063 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2065 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2076 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2079 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2081 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2092 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2095 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2097 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2108 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2111 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2113 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2122 = new BitSet(new long[]{0x0004008000000002L,0x000000000000E000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2125 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_comparison_in_equality2127 = new BitSet(new long[]{0x0004008000000002L,0x000000000000E000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2169 = new BitSet(new long[]{0x1801800000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2172 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2174 = new BitSet(new long[]{0x1801800000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2210 = new BitSet(new long[]{0x0000000000000002L,0x0000000A00000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2213 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2219 = new BitSet(new long[]{0x0000000000000002L,0x0000000A00000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2229 = new BitSet(new long[]{0x0000000400000002L,0x0000000000080008L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2232 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2240 = new BitSet(new long[]{0x0000000400000002L,0x0000000000080008L});
	public static final BitSet FOLLOW_logicNot_in_factor2250 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000140L});
	public static final BitSet FOLLOW_set_in_factor2253 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicNot_in_factor2261 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000140L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2270 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2291 = new BitSet(new long[]{0x0000000000000000L,0x00027C0000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2295 = new BitSet(new long[]{0x0648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2303 = new BitSet(new long[]{0x0648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2310 = new BitSet(new long[]{0x0648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_incrementDecrement2339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_newOrClone2355 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_newOrClone2357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_newOrClone2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2373 = new BitSet(new long[]{0x0008000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2380 = new BitSet(new long[]{0x0008000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2382 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2384 = new BitSet(new long[]{0x8648080000042100L,0x0044044010291428L});
	public static final BitSet FOLLOW_expressionList_in_newObject2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2398 = new BitSet(new long[]{0x0648080000040000L,0x0004044000010400L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2405 = new BitSet(new long[]{0x0648080000040000L,0x0004044000010400L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrCall2422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_atomOrCall2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atomOrCall2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_functionCall2444 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2446 = new BitSet(new long[]{0x8648080000042100L,0x0044044010291428L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_functionCall2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_methodCall2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2463 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2464 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2466 = new BitSet(new long[]{0x8648080000042100L,0x0044044010291428L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_methodCall2472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2482 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_atom2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2515 = new BitSet(new long[]{0x0040080000040000L,0x0000004000010400L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2522 = new BitSet(new long[]{0x0040080000040000L,0x0000004000010400L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3027 = new BitSet(new long[]{0x8648080000042100L,0x0044044020291428L});
	public static final BitSet FOLLOW_array_content_in_array3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3038 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3040 = new BitSet(new long[]{0x8648080000042100L,0x0044044010291428L});
	public static final BitSet FOLLOW_array_content_in_array3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3058 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3060 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_array_content3064 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3068 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_array_content3071 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3073 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_array_content3077 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3089 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3091 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_ifCondition3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3095 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3097 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3104 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3122 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3124 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3128 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3130 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3141 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3144 = new BitSet(new long[]{0x0118312128180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3149 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3151 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3155 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3158 = new BitSet(new long[]{0x0118312108180400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3168 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3171 = new BitSet(new long[]{0x0118312128180400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3177 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3179 = new BitSet(new long[]{0x0118312108080400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3202 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_caseLabel3204 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3215 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3226 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3228 = new BitSet(new long[]{0x0008000000000400L,0x0007FC0100200020L});
	public static final BitSet FOLLOW_forInit_in_forLoop3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3233 = new BitSet(new long[]{0x8648080000042100L,0x0044044100291428L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3239 = new BitSet(new long[]{0x0000000000000000L,0x0004000010200020L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3241 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3244 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3255 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3257 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3261 = new BitSet(new long[]{0x0000000000000000L,0x0004000000200020L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3263 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3273 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3276 = new BitSet(new long[]{0x0000000000000000L,0x0004000000200020L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3278 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3289 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3291 = new BitSet(new long[]{0x0400000000000000L,0x0004040000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3294 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3296 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3299 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3301 = new BitSet(new long[]{0x0000000000000020L,0x0000000010000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3304 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3310 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3321 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3323 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_whileLoop3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3327 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3339 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3341 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3343 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3345 = new BitSet(new long[]{0x8648080000042100L,0x0044044000291428L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3358 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3360 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3362 = new BitSet(new long[]{0x0118312108080400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3365 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3367 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3369 = new BitSet(new long[]{0x0008000000000400L,0x0000800000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3371 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3375 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3376 = new BitSet(new long[]{0x0118312108080400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3378 = new BitSet(new long[]{0x0118312108080400L,0x0017FF800C200020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_newObject_in_throwException3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred153_TSPHP3058 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred153_TSPHP3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred154_TSPHP3071 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred154_TSPHP3073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred156_TSPHP3104 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred164_TSPHP3141 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3144 = new BitSet(new long[]{0x0118312128180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred164_TSPHP3149 = new BitSet(new long[]{0x0118312108080400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3151 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_caseLabel_in_synpred164_TSPHP3155 = new BitSet(new long[]{0x0118312108180400L,0x0017FF8004200020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred164_TSPHP3158 = new BitSet(new long[]{0x0118312108180402L,0x0017FF8004200020L});
}
