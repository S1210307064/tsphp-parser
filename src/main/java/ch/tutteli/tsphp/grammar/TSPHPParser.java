// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 22:08:31

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace", "'::'", "'instanceof'"
	};

	public static final int EOF=-1;
	public static final int T__126=126;
	public static final int T__127=127;
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
	public static final int Clone=23;
	public static final int Colon=24;
	public static final int Comma=25;
	public static final int Comment=26;
	public static final int Const=27;
	public static final int Continue=28;
	public static final int DECIMAL=29;
	public static final int Default=30;
	public static final int Divide=31;
	public static final int DivideEqual=32;
	public static final int Do=33;
	public static final int Dolar=34;
	public static final int Dot=35;
	public static final int DotEqual=36;
	public static final int EXPONENT=37;
	public static final int Echo=38;
	public static final int Else=39;
	public static final int Equal=40;
	public static final int Exit=41;
	public static final int Extends=42;
	public static final int Final=43;
	public static final int Float=44;
	public static final int For=45;
	public static final int Foreach=46;
	public static final int Function=47;
	public static final int GreaterEqualThan=48;
	public static final int GreaterThan=49;
	public static final int HEXADECIMAL=50;
	public static final int Identical=51;
	public static final int Identifier=52;
	public static final int If=53;
	public static final int Implements=54;
	public static final int Int=55;
	public static final int Interface=56;
	public static final int LeftCurlyBrace=57;
	public static final int LeftParanthesis=58;
	public static final int LeftSquareBrace=59;
	public static final int LessEqualThan=60;
	public static final int LessThan=61;
	public static final int LogicAnd=62;
	public static final int LogicAndWeak=63;
	public static final int LogicNot=64;
	public static final int LogicOr=65;
	public static final int LogicOrWeak=66;
	public static final int LogicXorWeak=67;
	public static final int Minus=68;
	public static final int MinusEqual=69;
	public static final int MinusMinus=70;
	public static final int Modulo=71;
	public static final int ModuloEqual=72;
	public static final int Multiply=73;
	public static final int MultiplyEqual=74;
	public static final int NULL=75;
	public static final int Namespace=76;
	public static final int New=77;
	public static final int NotEqual=78;
	public static final int NotEqualAlternative=79;
	public static final int NotIdentical=80;
	public static final int Null=81;
	public static final int OCTAL=82;
	public static final int ObjectOperator=83;
	public static final int Parent=84;
	public static final int Plus=85;
	public static final int PlusEqual=86;
	public static final int PlusPlus=87;
	public static final int Private=88;
	public static final int ProtectParent=89;
	public static final int ProtectSelf=90;
	public static final int ProtectThis=91;
	public static final int Protected=92;
	public static final int Public=93;
	public static final int QuestionMark=94;
	public static final int Return=95;
	public static final int RightCurlyBrace=96;
	public static final int RightParanthesis=97;
	public static final int RightSquareBrace=98;
	public static final int STRING_DOUBLE_QUOTED=99;
	public static final int STRING_SINGLE_QUOTED=100;
	public static final int Self=101;
	public static final int Semicolon=102;
	public static final int ShiftLeft=103;
	public static final int ShiftLeftEqual=104;
	public static final int ShiftRight=105;
	public static final int ShiftRightEqual=106;
	public static final int Static=107;
	public static final int String=108;
	public static final int Switch=109;
	public static final int This=110;
	public static final int Throw=111;
	public static final int Try=112;
	public static final int TypeArray=113;
	public static final int TypeBool=114;
	public static final int TypeBoolean=115;
	public static final int TypeFloat=116;
	public static final int TypeInt=117;
	public static final int TypeObject=118;
	public static final int TypeResource=119;
	public static final int TypeString=120;
	public static final int Use=121;
	public static final int VariableId=122;
	public static final int Void=123;
	public static final int While=124;
	public static final int Whitespace=125;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog905);
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

					match(input,EOF,FOLLOW_EOF_in_prog908); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog913);
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

					match(input,EOF,FOLLOW_EOF_in_prog916); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog921);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog923); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:179:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon936); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon938);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon940); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==Parent||LA4_0==PlusPlus||LA4_0==Return||LA4_0==Self||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon942);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket955); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket957);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket960); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==Parent||LA6_0==PlusPlus||LA6_0==Return||LA6_0==Self||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket962);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket965); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId1031); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId1034); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId1036); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==Parent||LA8_0==PlusPlus||LA8_0==Return||LA8_0==Self||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1049);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
			int alt9=3;
			switch ( input.LA(1) ) {
			case Use:
				{
				alt9=1;
				}
				break;
			case Abstract:
			case Class:
			case Const:
			case Final:
			case Function:
			case Interface:
				{
				alt9=2;
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
			case LeftCurlyBrace:
			case MinusMinus:
			case Parent:
			case PlusPlus:
			case Return:
			case Self:
			case Switch:
			case This:
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
				alt9=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement1060);
					useDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement1065);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1070);
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



	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final void useDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList1082); if (state.failed) return ;
			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1084);
			useDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:26: ',' useDeclaration
					{
					match(input,Comma,FOLLOW_Comma_in_useDeclarationList1087); if (state.failed) return ;
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1089);
					useDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop10;
				}
			} while (true);

			match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1093); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "useDeclarationList"



	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: useDeclaration : ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )? ;
	public final void useDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )?
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Identifier) ) {
				alt13=1;
			}
			else if ( (LA13_0==Backslash) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:6: ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:6: ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:7: Identifier '\\\\' Identifier ( '\\\\' Identifier )*
					{
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1106); if (state.failed) return ;
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1108); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1110); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:34: ( '\\\\' Identifier )*
					loop11:
					do {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==Backslash) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:35: '\\\\' Identifier
							{
							match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1113); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1115); if (state.failed) return ;
							}
							break;

						default :
							break loop11;
						}
					} while (true);

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:6: ( '\\\\' Identifier ( '\\\\' Identifier )* )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:6: ( '\\\\' Identifier ( '\\\\' Identifier )* )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:7: '\\\\' Identifier ( '\\\\' Identifier )*
					{
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1126); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1128); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:23: ( '\\\\' Identifier )*
					loop12:
					do {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==Backslash) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:24: '\\\\' Identifier
							{
							match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1131); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1133); if (state.failed) return ;
							}
							break;

						default :
							break loop12;
						}
					} while (true);

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:3: ( 'as' Identifier )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==As) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: 'as' Identifier
					{
					match(input,As,FOLLOW_As_in_useDeclaration1147); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1149); if (state.failed) return ;
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
	// $ANTLR end "useDeclaration"



	// $ANTLR start "definition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
			int alt15=4;
			switch ( input.LA(1) ) {
			case Abstract:
			case Class:
			case Final:
				{
				alt15=1;
				}
				break;
			case Interface:
				{
				alt15=2;
				}
				break;
			case Function:
				{
				alt15=3;
				}
				break;
			case Const:
				{
				alt15=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition1162);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition1167);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition1172);
					functionDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition1177);
					constDeclarationList();
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( 'abstract' | 'final' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Abstract||LA16_0==Final) ) {
				alt16=1;
			}
			switch (alt16) {
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

			match(input,Class,FOLLOW_Class_in_classDeclaration1199); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1201); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:45: ( extendsDeclaration )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Extends) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1203);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:65: ( implementsDeclaration )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Implements) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1206);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1209); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:92: ( classBody )+
			int cnt19=0;
			loop19:
			do {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Abstract||LA19_0==Const||LA19_0==Final||LA19_0==Function||LA19_0==Private||(LA19_0 >= Protected && LA19_0 <= Public)||LA19_0==Static) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1211);
					classBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(19, input);
						throw eee;
				}
				cnt19++;
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1214); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1228); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1230);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1239); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:15: ( ',' Identifier )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1242); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1244); if (state.failed) return ;
					}
					break;

				default :
					break loop20;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1255); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1257);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
			int alt21=3;
			switch ( input.LA(1) ) {
			case Const:
				{
				alt21=1;
				}
				break;
			case Static:
				{
				switch ( input.LA(2) ) {
				case Protected:
				case Public:
					{
					int LA21_3 = input.LA(3);
					if ( (LA21_3==Backslash||LA21_3==Identifier||(LA21_3 >= TypeArray && LA21_3 <= TypeString)) ) {
						alt21=2;
					}
					else if ( (LA21_3==Function) ) {
						alt21=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 21, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Private:
					{
					int LA21_4 = input.LA(3);
					if ( (LA21_4==Backslash||LA21_4==Identifier||(LA21_4 >= TypeArray && LA21_4 <= TypeString)) ) {
						alt21=2;
					}
					else if ( (LA21_4==Function) ) {
						alt21=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 21, 4, input);
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
					alt21=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
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
				int LA21_3 = input.LA(2);
				if ( (LA21_3==Backslash||LA21_3==Identifier||(LA21_3 >= TypeArray && LA21_3 <= TypeString)) ) {
					alt21=2;
				}
				else if ( (LA21_3==Function) ) {
					alt21=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Private:
				{
				int LA21_4 = input.LA(2);
				if ( (LA21_4==Backslash||LA21_4==Identifier||(LA21_4 >= TypeArray && LA21_4 <= TypeString)) ) {
					alt21=2;
				}
				else if ( (LA21_4==Function) ) {
					alt21=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 4, input);
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
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBody1267);
					constDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1272);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1278);
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



	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			match(input,Const,FOLLOW_Const_in_constDeclarationList1290); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1292);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1294);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:47: ( ',' constantAssignment )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:48: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1297); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1299);
					constantAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop22;
				}
			} while (true);

			match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1303); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1313); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1316); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1318);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1327);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:24: ( ',' variableAssignment )*
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Comma) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1330); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1332);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop23;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: ( 'static' )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Static) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1344); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1347);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1349);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1351); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:9: ( accessorWithoutPrivate | 'private' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
				alt25=1;
			}
			else if ( (LA25_0==Private) ) {
				alt25=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1358);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1363); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1386);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:24: ( ',' ( variableAssignment | VariableId ) )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Comma) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1389); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:29: ( variableAssignment | VariableId )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==VariableId) ) {
						int LA26_1 = input.LA(2);
						if ( (LA26_1==Assign||LA26_1==BitwiseAndEqual||LA26_1==BitwiseOrEqual||LA26_1==BitwiseXorEqual||LA26_1==DivideEqual||LA26_1==DotEqual||(LA26_1 >= MinusEqual && LA26_1 <= MinusMinus)||LA26_1==ModuloEqual||LA26_1==MultiplyEqual||(LA26_1 >= PlusEqual && LA26_1 <= PlusPlus)||LA26_1==ShiftLeftEqual||LA26_1==ShiftRightEqual) ) {
							alt26=1;
						}
						else if ( (LA26_1==Comma||LA26_1==Semicolon) ) {
							alt26=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 26, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA26_0==MinusMinus||LA26_0==PlusPlus) ) {
						alt26=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1392);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1394); if (state.failed) return ;
							}
							break;

					}

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
	// $ANTLR end "variableDeclarationListInclVariableId"



	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Abstract) ) {
				alt33=1;
			}
			else if ( (LA33_0==Final||LA33_0==Function||LA33_0==Private||(LA33_0 >= Protected && LA33_0 <= Public)||LA33_0==Static) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1409); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:34: ( accessorWithoutPrivate )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= Protected && LA28_0 <= Public)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1411);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
					int alt31=3;
					switch ( input.LA(1) ) {
					case Static:
						{
						alt31=1;
						}
						break;
					case Final:
						{
						alt31=2;
						}
						break;
					case Function:
					case Private:
					case Protected:
					case Public:
						{
						alt31=3;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1425); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:15: ( 'final' )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==Final) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1427); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1435); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:14: ( 'static' )?
							int alt30=2;
							int LA30_0 = input.LA(1);
							if ( (LA30_0==Static) ) {
								alt30=1;
							}
							switch (alt30) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1437); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:6: ( accessor )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==Private||(LA32_0 >= Protected && LA32_0 <= Public)) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1451);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1458);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1468); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1470); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:27: ( implementsDeclaration )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Implements) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1472);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1475); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:54: ( interfaceBody )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Const||LA35_0==Function||LA35_0==Public) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1477);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop35;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1480); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( constDeclarationList | interfaceMethodDeclaration )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Const) ) {
				alt36=1;
			}
			else if ( (LA36_0==Function||LA36_0==Public) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1489);
					constDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1494);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: ( 'public' )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Public) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1505); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1508);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1510); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1526);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1528); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:40: ( instructionWithoutBreakContinue )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Backslash||LA38_0==Do||LA38_0==Echo||LA38_0==Exit||(LA38_0 >= For && LA38_0 <= Foreach)||(LA38_0 >= Identifier && LA38_0 <= If)||LA38_0==LeftCurlyBrace||LA38_0==MinusMinus||LA38_0==Parent||LA38_0==PlusPlus||LA38_0==Return||LA38_0==Self||(LA38_0 >= Switch && LA38_0 <= TypeString)||LA38_0==VariableId||LA38_0==While) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1530);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop38;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1533); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1543); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1545);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1547); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1549); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:41: ( paramList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Backslash||LA39_0==Identifier||(LA39_0 >= TypeArray && LA39_0 <= TypeString)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1551);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1554); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:2: ( allTypes | 'void' )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Backslash||LA40_0==Identifier||(LA40_0 >= TypeArray && LA40_0 <= TypeString)) ) {
				alt40=1;
			}
			else if ( (LA40_0==Void) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1564);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1568); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final void allTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= TypeArray && LA41_0 <= TypeInt)||(LA41_0 >= TypeResource && LA41_0 <= TypeString)) ) {
				alt41=1;
			}
			else if ( (LA41_0==Backslash||LA41_0==Identifier||LA41_0==TypeObject) ) {
				alt41=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1575);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:36: classInterfaceTypeInclObject
					{
					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1579);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:2: ( primitiveTypes | TypeArray )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( ((LA42_0 >= TypeBool && LA42_0 <= TypeInt)||LA42_0==TypeString) ) {
				alt42=1;
			}
			else if ( (LA42_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1620);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1625); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:2: ( primitiveTypesInclArray | TypeResource )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( ((LA43_0 >= TypeArray && LA43_0 <= TypeInt)||LA43_0==TypeString) ) {
				alt43=1;
			}
			else if ( (LA43_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1637);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1642); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final void classInterfaceTypeWithoutObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( '\\\\' )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==Backslash) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: '\\\\'
					{
					match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1656); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1659);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final void classInterfaceTypeInclObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==TypeObject) ) {
				alt45=1;
			}
			else if ( (LA45_0==Backslash||LA45_0==Identifier) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1672); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: classInterfaceTypeWithoutObject
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1678);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt50=3;
			alt50 = dfa50.predict(input);
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1690);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:29: ( ',' paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1693); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1695);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop46;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1702);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:21: ( ',' paramDeclaration )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1705); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1707);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop47;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1714);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:21: ( paramDeclaration ',' )*
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Identifier||(LA48_0 >= TypeArray && LA48_0 <= TypeString)) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1717);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1719); if (state.failed) return ;
							}
							break;

						default :
							break loop48;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:45: ( ',' paramDeclarationOptional )+
					int cnt49=0;
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==Comma) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1724); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1726);
							paramDeclarationOptional();
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1740);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1742); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1752);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1755); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1757);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LeftCurlyBrace) ) {
				alt52=1;
			}
			else if ( (LA52_0==Backslash||LA52_0==Do||LA52_0==Echo||LA52_0==Exit||(LA52_0 >= For && LA52_0 <= Foreach)||(LA52_0 >= Identifier && LA52_0 <= If)||LA52_0==MinusMinus||LA52_0==Parent||LA52_0==PlusPlus||LA52_0==Return||LA52_0==Self||(LA52_0 >= Switch && LA52_0 <= TypeString)||LA52_0==VariableId||LA52_0==While) ) {
				alt52=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1779); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: ( instructionWithoutBreakContinue )+
					int cnt51=0;
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==Backslash||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==LeftCurlyBrace||LA51_0==MinusMinus||LA51_0==Parent||LA51_0==PlusPlus||LA51_0==Return||LA51_0==Self||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1781);
							instructionWithoutBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1785); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1790);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt55=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt55=1;
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
			case Parent:
			case PlusPlus:
			case Return:
			case Self:
			case Switch:
			case This:
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
				alt55=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt55=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1801); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:8: ( instructionInclBreakContinue )+
					int cnt53=0;
					loop53:
					do {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==Backslash||LA53_0==Break||LA53_0==Continue||LA53_0==Do||LA53_0==Echo||LA53_0==Exit||(LA53_0 >= For && LA53_0 <= Foreach)||(LA53_0 >= Identifier && LA53_0 <= If)||LA53_0==LeftCurlyBrace||LA53_0==MinusMinus||LA53_0==Parent||LA53_0==PlusPlus||LA53_0==Return||LA53_0==Self||(LA53_0 >= Switch && LA53_0 <= TypeString)||LA53_0==VariableId||LA53_0==While) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1803);
							instructionInclBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1807); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1812);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:25: ( Int )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==Int) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1823); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1826); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt57=15;
			alt57 = dfa57.predict(input);
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1838);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1840); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1845);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1847); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1852);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1857);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1862);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1867);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1872);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1877);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction1882);
					tryCatch();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: throwException
					{
					pushFollow(FOLLOW_throwException_in_instruction1887);
					throwException();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_instruction1892);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1894); if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: methodCall ';'
					{
					pushFollow(FOLLOW_methodCall_in_instruction1899);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1901); if (state.failed) return ;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1906); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:13: ( expression )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==At||LA56_0==Backslash||LA56_0==BitwiseNot||LA56_0==Bool||LA56_0==Clone||LA56_0==Float||LA56_0==Identifier||LA56_0==Int||(LA56_0 >= LeftParanthesis && LA56_0 <= LeftSquareBrace)||LA56_0==LogicNot||LA56_0==Minus||LA56_0==MinusMinus||LA56_0==NULL||LA56_0==New||LA56_0==Null||(LA56_0 >= Parent && LA56_0 <= Plus)||LA56_0==PlusPlus||LA56_0==Self||LA56_0==String||LA56_0==This||LA56_0==TypeArray||LA56_0==VariableId) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1908);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1911); if (state.failed) return ;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1916); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1918);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1920); if (state.failed) return ;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1925); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1927); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1939);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:15: ( ',' expression )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==Comma) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1942); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1944);
					expression();
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
	// $ANTLR end "expressionList"



	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt59=3;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==VariableId) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==MinusMinus||LA59_1==PlusPlus) ) {
					alt59=2;
				}
				else if ( (LA59_1==Assign||LA59_1==BitwiseAndEqual||LA59_1==BitwiseOrEqual||LA59_1==BitwiseXorEqual||LA59_1==DivideEqual||LA59_1==DotEqual||LA59_1==MinusEqual||LA59_1==ModuloEqual||LA59_1==MultiplyEqual||LA59_1==PlusEqual||LA59_1==ShiftLeftEqual||LA59_1==ShiftRightEqual) ) {
					alt59=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA59_0==MinusMinus||LA59_0==PlusPlus) ) {
				alt59=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1955); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1957);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1959);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1964);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1969);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement2047); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement2069); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2081);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2083); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:24: ( '=' expression )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Assign) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration2086); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration2088);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression2100);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2109);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:17: ( 'or' logicXorWeak )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicOrWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2112); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2114);
					logicXorWeak();
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
	// $ANTLR end "logicOrWeak"



	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2127);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:17: ( 'xor' logicAndWeak )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicXorWeak) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2130); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2132);
					logicAndWeak();
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
	// $ANTLR end "logicXorWeak"



	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak2145);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:15: ( 'and' assignment )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==LogicAndWeak) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred105_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2148); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak2150);
					assignment();
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
	// $ANTLR end "logicAndWeak"



	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment2161);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:12: ( assignmentOperator ternary )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==Assign||LA64_0==BitwiseAndEqual||LA64_0==BitwiseOrEqual||LA64_0==BitwiseXorEqual||LA64_0==DivideEqual||LA64_0==DotEqual||LA64_0==MinusEqual||LA64_0==ModuloEqual||LA64_0==MultiplyEqual||LA64_0==PlusEqual||LA64_0==ShiftLeftEqual||LA64_0==ShiftRightEqual) ) {
					int LA64_2 = input.LA(2);
					if ( (synpred106_TSPHP()) ) {
						alt64=1;
					}

				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2164);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment2166);
					ternary();
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
	// $ANTLR end "assignment"



	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:1: ternary : logicOr ( '?' expression ':' expression )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:9: ( logicOr ( '?' expression ':' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:11: logicOr ( '?' expression ':' expression )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary2176);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:19: ( '?' expression ':' expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==QuestionMark) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:20: '?' expression ':' expression
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2179); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2181);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary2183); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2185);
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
	// $ANTLR end "ternary"



	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr2195);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:20: ( '||' logicAnd )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2198); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr2200);
					logicAnd();
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
	// $ANTLR end "logicOr"



	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2209);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:21: ( '&&' bitwiseOr )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==LogicAnd) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2212); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2214);
					bitwiseOr();
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
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2225);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:15: ( '|' bitwiseXor )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseOr) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2228); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2230);
					bitwiseXor();
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
	// $ANTLR end "bitwiseOr"



	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2241);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:15: ( '^' bitwiseAnd )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseXor) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2244); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2246);
					bitwiseAnd();
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
	// $ANTLR end "bitwiseXor"



	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd2257);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:13: ( '&' equality )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==BitwiseAnd) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2260); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2262);
					equality();
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
	// $ANTLR end "bitwiseAnd"



	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2271);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:22: ( equalityOperator comparison )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==Equal||LA71_0==Identical||(LA71_0 >= NotEqual && LA71_0 <= NotIdentical)) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2274);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2276);
					comparison();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop71;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2318);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:17: ( comparisonOperator bitwiseShift )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( ((LA72_0 >= GreaterEqualThan && LA72_0 <= GreaterThan)||(LA72_0 >= LessEqualThan && LA72_0 <= LessThan)) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2321);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2323);
					bitwiseShift();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop72;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2359);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==ShiftLeft||LA73_0==ShiftRight) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2368);
					termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop73;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2378);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:36: ( ( '+' | '-' | '.' ) factor )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==Dot||LA74_0==Minus||LA74_0==Plus) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2389);
					factor();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop74;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2399);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==Divide||LA75_0==Modulo||LA75_0==Multiply) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2410);
					logicNot();
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
	// $ANTLR end "factor"



	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: logicNot : ( '!' logicNot | instanceOf );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:9: ( '!' logicNot | instanceOf )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LogicNot) ) {
				alt76=1;
			}
			else if ( (LA76_0==At||LA76_0==Backslash||LA76_0==BitwiseNot||LA76_0==Bool||LA76_0==Clone||LA76_0==Float||LA76_0==Identifier||LA76_0==Int||(LA76_0 >= LeftParanthesis && LA76_0 <= LeftSquareBrace)||LA76_0==Minus||LA76_0==MinusMinus||LA76_0==NULL||LA76_0==New||LA76_0==Null||(LA76_0 >= Parent && LA76_0 <= Plus)||LA76_0==PlusPlus||LA76_0==Self||LA76_0==String||LA76_0==This||LA76_0==TypeArray||LA76_0==VariableId) ) {
				alt76=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2419); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2421);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:4: instanceOf
					{
					pushFollow(FOLLOW_instanceOf_in_logicNot2426);
					instanceOf();
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



	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final void instanceOf() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:2: ( castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:4: castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2438);
			castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:25: ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==127) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:26: 'instanceof' ( classInterfaceTypeWithoutObject | VariableId )
					{
					match(input,127,FOLLOW_127_in_instanceOf2441); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:39: ( classInterfaceTypeWithoutObject | VariableId )
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==Backslash||LA77_0==Identifier) ) {
						alt77=1;
					}
					else if ( (LA77_0==VariableId) ) {
						alt77=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 77, 0, input);
						throw nvae;
					}
					switch (alt77) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:40: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2444);
							classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:72: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_instanceOf2446); if (state.failed) return ;
							}
							break;

					}

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
	// $ANTLR end "instanceOf"



	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:1: castOrBitwiseNotOrAt : ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:2: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt80=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA80_1 = input.LA(2);
				if ( (synpred134_TSPHP()) ) {
					alt80=1;
				}
				else if ( (true) ) {
					alt80=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt80=2;
				}
				break;
			case At:
				{
				alt80=3;
				}
				break;
			case Backslash:
			case Bool:
			case Clone:
			case Float:
			case Identifier:
			case Int:
			case LeftSquareBrace:
			case Minus:
			case MinusMinus:
			case NULL:
			case New:
			case Null:
			case Parent:
			case Plus:
			case PlusPlus:
			case Self:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt80=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2459); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( ((LA79_0 >= TypeArray && LA79_0 <= TypeInt)||LA79_0==TypeString) ) {
						alt79=1;
					}
					else if ( (LA79_0==Backslash||LA79_0==Identifier||LA79_0==TypeObject) ) {
						alt79=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 79, 0, input);
						throw nvae;
					}
					switch (alt79) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:10: primitiveTypesInclArray
							{
							pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2462);
							primitiveTypesInclArray();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:34: classInterfaceTypeInclObject
							{
							pushFollow(FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2464);
							classInterfaceTypeInclObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2467); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2470);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2475); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2477);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2482); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2484);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2489);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | arrayAccess );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:2: ( postIncrementDecrement | preIncrementDecrement | arrayAccess )
			int alt81=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA81_1 = input.LA(2);
				if ( (LA81_1==MinusMinus||LA81_1==PlusPlus) ) {
					alt81=1;
				}
				else if ( (LA81_1==EOF||LA81_1==Arrow||LA81_1==Assign||(LA81_1 >= BitwiseAnd && LA81_1 <= BitwiseAndEqual)||(LA81_1 >= BitwiseOr && LA81_1 <= BitwiseXorEqual)||(LA81_1 >= Colon && LA81_1 <= Comma)||(LA81_1 >= Divide && LA81_1 <= DivideEqual)||(LA81_1 >= Dot && LA81_1 <= DotEqual)||LA81_1==Equal||(LA81_1 >= GreaterEqualThan && LA81_1 <= GreaterThan)||LA81_1==Identical||(LA81_1 >= LeftSquareBrace && LA81_1 <= LogicAndWeak)||(LA81_1 >= LogicOr && LA81_1 <= MinusEqual)||(LA81_1 >= Modulo && LA81_1 <= MultiplyEqual)||(LA81_1 >= NotEqual && LA81_1 <= NotIdentical)||LA81_1==ObjectOperator||(LA81_1 >= Plus && LA81_1 <= PlusEqual)||LA81_1==QuestionMark||(LA81_1 >= RightParanthesis && LA81_1 <= RightSquareBrace)||(LA81_1 >= Semicolon && LA81_1 <= ShiftRightEqual)||LA81_1==127) ) {
					alt81=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 1, input);
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
				alt81=2;
				}
				break;
			case Backslash:
			case Bool:
			case Clone:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case NULL:
			case New:
			case Null:
			case Parent:
			case Plus:
			case Self:
			case String:
			case This:
			case TypeArray:
				{
				alt81=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2501);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2506);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: arrayAccess
					{
					pushFollow(FOLLOW_arrayAccess_in_incrementDecrement2511);
					arrayAccess();
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



	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:1: arrayAccess : ( fluentObject ( '[' expression ']' )+ | newOrClone );
	public final void arrayAccess() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:2: ( fluentObject ( '[' expression ']' )+ | newOrClone )
			int alt83=2;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA83_1 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA83_2 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Self:
				{
				int LA83_3 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA83_4 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA83_5 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA83_6 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt83=1;
				}
				else if ( (true) ) {
					alt83=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Bool:
			case Clone:
			case Float:
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
				{
				alt83=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: fluentObject ( '[' expression ']' )+
					{
					pushFollow(FOLLOW_fluentObject_in_arrayAccess2523);
					fluentObject();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:17: ( '[' expression ']' )+
					int cnt82=0;
					loop82:
					do {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==LeftSquareBrace) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:18: '[' expression ']'
							{
							match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2526); if (state.failed) return ;
							pushFollow(FOLLOW_expression_in_arrayAccess2528);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2530); if (state.failed) return ;
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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:4: newOrClone
					{
					pushFollow(FOLLOW_newOrClone_in_arrayAccess2537);
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
	// $ANTLR end "arrayAccess"



	// $ANTLR start "fluentObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:1: fluentObject : ( functionCall | methodCall | varAccess );
	public final void fluentObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:2: ( functionCall | methodCall | varAccess )
			int alt84=3;
			alt84 = dfa84.predict(input);
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_fluentObject2549);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_fluentObject2554);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: varAccess
					{
					pushFollow(FOLLOW_varAccess_in_fluentObject2559);
					varAccess();
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
	// $ANTLR end "fluentObject"



	// $ANTLR start "varAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:1: varAccess : ( '$this' ( '->' Identifier )* | staticAccess VariableId | VariableId );
	public final void varAccess() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:2: ( '$this' ( '->' Identifier )* | staticAccess VariableId | VariableId )
			int alt86=3;
			switch ( input.LA(1) ) {
			case This:
				{
				alt86=1;
				}
				break;
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt86=2;
				}
				break;
			case VariableId:
				{
				alt86=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: '$this' ( '->' Identifier )*
					{
					match(input,This,FOLLOW_This_in_varAccess2571); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:12: ( '->' Identifier )*
					loop85:
					do {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==ObjectOperator) ) {
							int LA85_2 = input.LA(2);
							if ( (LA85_2==Identifier) ) {
								int LA85_3 = input.LA(3);
								if ( (LA85_3==EOF||LA85_3==Arrow||LA85_3==Assign||(LA85_3 >= BitwiseAnd && LA85_3 <= BitwiseAndEqual)||(LA85_3 >= BitwiseOr && LA85_3 <= BitwiseXorEqual)||(LA85_3 >= Colon && LA85_3 <= Comma)||(LA85_3 >= Divide && LA85_3 <= DivideEqual)||(LA85_3 >= Dot && LA85_3 <= DotEqual)||LA85_3==Equal||(LA85_3 >= GreaterEqualThan && LA85_3 <= GreaterThan)||LA85_3==Identical||(LA85_3 >= LeftSquareBrace && LA85_3 <= LogicAndWeak)||(LA85_3 >= LogicOr && LA85_3 <= MinusEqual)||(LA85_3 >= Modulo && LA85_3 <= MultiplyEqual)||(LA85_3 >= NotEqual && LA85_3 <= NotIdentical)||LA85_3==ObjectOperator||(LA85_3 >= Plus && LA85_3 <= PlusEqual)||LA85_3==QuestionMark||(LA85_3 >= RightParanthesis && LA85_3 <= RightSquareBrace)||(LA85_3 >= Semicolon && LA85_3 <= ShiftRightEqual)||LA85_3==127) ) {
									alt85=1;
								}

							}

						}

						switch (alt85) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:13: '->' Identifier
							{
							match(input,ObjectOperator,FOLLOW_ObjectOperator_in_varAccess2574); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_varAccess2576); if (state.failed) return ;
							}
							break;

						default :
							break loop85;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: staticAccess VariableId
					{
					pushFollow(FOLLOW_staticAccess_in_varAccess2583);
					staticAccess();
					state._fsp--;
					if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_varAccess2585); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_varAccess2590); if (state.failed) return ;
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
	// $ANTLR end "varAccess"



	// $ANTLR start "staticAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:1: staticAccess : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final void staticAccess() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt87=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt87=1;
				}
				break;
			case Parent:
				{
				alt87=2;
				}
				break;
			case Backslash:
			case Identifier:
				{
				alt87=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: 'self::'
					{
					match(input,Self,FOLLOW_Self_in_staticAccess2602); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: 'parent::'
					{
					match(input,Parent,FOLLOW_Parent_in_staticAccess2607); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:4: classInterfaceTypeWithoutObject '::'
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccess2612);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,126,FOLLOW_126_in_staticAccess2613); if (state.failed) return ;
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
	// $ANTLR end "staticAccess"



	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:1: newOrClone : ( newObject | 'clone' VariableId | unaryAtom );
	public final void newOrClone() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:2: ( newObject | 'clone' VariableId | unaryAtom )
			int alt88=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt88=1;
				}
				break;
			case Clone:
				{
				alt88=2;
				}
				break;
			case Backslash:
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case NULL:
			case Null:
			case Parent:
			case Plus:
			case Self:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt88=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: newObject
					{
					pushFollow(FOLLOW_newObject_in_newOrClone2624);
					newObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:4: 'clone' VariableId
					{
					match(input,Clone,FOLLOW_Clone_in_newOrClone2629); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_newOrClone2631); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_newOrClone2636);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final void newObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt90=2;
			alt90 = dfa90.predict(input);
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:4: 'new' classInterfaceTypeWithoutObject
					{
					match(input,New,FOLLOW_New_in_newObject2647); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2649);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					match(input,New,FOLLOW_New_in_newObject2654); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2656);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2658); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:46: ( expressionList )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==At||LA89_0==Backslash||LA89_0==BitwiseNot||LA89_0==Bool||LA89_0==Clone||LA89_0==Float||LA89_0==Identifier||LA89_0==Int||(LA89_0 >= LeftParanthesis && LA89_0 <= LeftSquareBrace)||LA89_0==LogicNot||LA89_0==Minus||LA89_0==MinusMinus||LA89_0==NULL||LA89_0==New||LA89_0==Null||(LA89_0 >= Parent && LA89_0 <= Plus)||LA89_0==PlusPlus||LA89_0==Self||LA89_0==String||LA89_0==This||LA89_0==TypeArray||LA89_0==VariableId) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2660);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2663); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:1: unaryAtom : ( '+' atomOrCall | '-' atomOrCall | atomOrCall );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:2: ( '+' atomOrCall | '-' atomOrCall | atomOrCall )
			int alt91=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt91=1;
				}
				break;
			case Minus:
				{
				alt91=2;
				}
				break;
			case Backslash:
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case NULL:
			case Null:
			case Parent:
			case Self:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt91=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: '+' atomOrCall
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2672); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2674);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:4: '-' atomOrCall
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2679); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2681);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:4: atomOrCall
					{
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2686);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:1: atomOrCall : ( functionCall | methodCall | atom );
	public final void atomOrCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:2: ( functionCall | methodCall | atom )
			int alt92=3;
			alt92 = dfa92.predict(input);
			switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atomOrCall2696);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_atomOrCall2701);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:524:4: atom
					{
					pushFollow(FOLLOW_atom_in_atomOrCall2706);
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
	// $ANTLR end "atomOrCall"



	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:1: functionCall : namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? ;
	public final void functionCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:2: ( namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )?
			{
			pushFollow(FOLLOW_namespaceId_in_functionCall2718);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2720); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:20: ( expressionList )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==At||LA93_0==Backslash||LA93_0==BitwiseNot||LA93_0==Bool||LA93_0==Clone||LA93_0==Float||LA93_0==Identifier||LA93_0==Int||(LA93_0 >= LeftParanthesis && LA93_0 <= LeftSquareBrace)||LA93_0==LogicNot||LA93_0==Minus||LA93_0==MinusMinus||LA93_0==NULL||LA93_0==New||LA93_0==Null||(LA93_0 >= Parent && LA93_0 <= Plus)||LA93_0==PlusPlus||LA93_0==Self||LA93_0==String||LA93_0==This||LA93_0==TypeArray||LA93_0==VariableId) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:20: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2722);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2725); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:40: ( '->' Identifier '(' ( expressionList )? ')' )*
			loop95:
			do {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==ObjectOperator) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:41: '->' Identifier '(' ( expressionList )? ')'
					{
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_functionCall2728); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_functionCall2730); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2732); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:61: ( expressionList )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==At||LA94_0==Backslash||LA94_0==BitwiseNot||LA94_0==Bool||LA94_0==Clone||LA94_0==Float||LA94_0==Identifier||LA94_0==Int||(LA94_0 >= LeftParanthesis && LA94_0 <= LeftSquareBrace)||LA94_0==LogicNot||LA94_0==Minus||LA94_0==MinusMinus||LA94_0==NULL||LA94_0==New||LA94_0==Null||(LA94_0 >= Parent && LA94_0 <= Plus)||LA94_0==PlusPlus||LA94_0==Self||LA94_0==String||LA94_0==This||LA94_0==TypeArray||LA94_0==VariableId) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:61: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_functionCall2734);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2736); if (state.failed) return ;
					}
					break;

				default :
					break loop95;
				}
			} while (true);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:82: ( arrayAccessCall )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==LeftSquareBrace) ) {
				int LA96_1 = input.LA(2);
				if ( (synpred159_TSPHP()) ) {
					alt96=1;
				}
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:82: arrayAccessCall
					{
					pushFollow(FOLLOW_arrayAccessCall_in_functionCall2740);
					arrayAccessCall();
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
	// $ANTLR end "functionCall"



	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:1: methodCall : ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? ;
	public final void methodCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:2: ( ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )?
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: ( ( varAccess '->' ) | staticAccess )
			int alt97=2;
			alt97 = dfa97.predict(input);
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:6: ( varAccess '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:6: ( varAccess '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:7: varAccess '->'
					{
					pushFollow(FOLLOW_varAccess_in_methodCall2753);
					varAccess();
					state._fsp--;
					if (state.failed) return ;
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2755); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:25: staticAccess
					{
					pushFollow(FOLLOW_staticAccess_in_methodCall2760);
					staticAccess();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_methodCall2763); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2765); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:54: ( expressionList )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==At||LA98_0==Backslash||LA98_0==BitwiseNot||LA98_0==Bool||LA98_0==Clone||LA98_0==Float||LA98_0==Identifier||LA98_0==Int||(LA98_0 >= LeftParanthesis && LA98_0 <= LeftSquareBrace)||LA98_0==LogicNot||LA98_0==Minus||LA98_0==MinusMinus||LA98_0==NULL||LA98_0==New||LA98_0==Null||(LA98_0 >= Parent && LA98_0 <= Plus)||LA98_0==PlusPlus||LA98_0==Self||LA98_0==String||LA98_0==This||LA98_0==TypeArray||LA98_0==VariableId) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:54: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2767);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2769); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:73: ( '->' Identifier '(' ( expressionList )? ')' )*
			loop100:
			do {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==ObjectOperator) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:74: '->' Identifier '(' ( expressionList )? ')'
					{
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2772); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_methodCall2774); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2776); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:94: ( expressionList )?
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==At||LA99_0==Backslash||LA99_0==BitwiseNot||LA99_0==Bool||LA99_0==Clone||LA99_0==Float||LA99_0==Identifier||LA99_0==Int||(LA99_0 >= LeftParanthesis && LA99_0 <= LeftSquareBrace)||LA99_0==LogicNot||LA99_0==Minus||LA99_0==MinusMinus||LA99_0==NULL||LA99_0==New||LA99_0==Null||(LA99_0 >= Parent && LA99_0 <= Plus)||LA99_0==PlusPlus||LA99_0==Self||LA99_0==String||LA99_0==This||LA99_0==TypeArray||LA99_0==VariableId) ) {
						alt99=1;
					}
					switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:94: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_methodCall2778);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2780); if (state.failed) return ;
					}
					break;

				default :
					break loop100;
				}
			} while (true);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:115: ( arrayAccessCall )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LeftSquareBrace) ) {
				int LA101_1 = input.LA(2);
				if ( (synpred164_TSPHP()) ) {
					alt101=1;
				}
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:115: arrayAccessCall
					{
					pushFollow(FOLLOW_arrayAccessCall_in_methodCall2784);
					arrayAccessCall();
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
	// $ANTLR end "methodCall"



	// $ANTLR start "arrayAccessCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:1: arrayAccessCall : ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+ ;
	public final void arrayAccessCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:2: ( ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+
			int cnt104=0;
			loop104:
			do {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==LeftSquareBrace) ) {
					int LA104_2 = input.LA(2);
					if ( (synpred167_TSPHP()) ) {
						alt104=1;
					}

				}

				switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:6: ( '[' expression ']' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:7: '[' expression ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccessCall2799); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_arrayAccessCall2801);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccessCall2803); if (state.failed) return ;
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:27: ( '->' Identifier '(' ( expressionList )? ')' )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==ObjectOperator) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:28: '->' Identifier '(' ( expressionList )? ')'
							{
							match(input,ObjectOperator,FOLLOW_ObjectOperator_in_arrayAccessCall2807); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_arrayAccessCall2808); if (state.failed) return ;
							match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_arrayAccessCall2810); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:47: ( expressionList )?
							int alt102=2;
							int LA102_0 = input.LA(1);
							if ( (LA102_0==At||LA102_0==Backslash||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==NULL||LA102_0==New||LA102_0==Null||(LA102_0 >= Parent && LA102_0 <= Plus)||LA102_0==PlusPlus||LA102_0==Self||LA102_0==String||LA102_0==This||LA102_0==TypeArray||LA102_0==VariableId) ) {
								alt102=1;
							}
							switch (alt102) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:47: expressionList
									{
									pushFollow(FOLLOW_expressionList_in_arrayAccessCall2812);
									expressionList();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

							}

							match(input,RightParanthesis,FOLLOW_RightParanthesis_in_arrayAccessCall2814); if (state.failed) return ;
							}
							break;

					}

					}
					break;

				default :
					if ( cnt104 >= 1 ) break loop104;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(104, input);
						throw eee;
				}
				cnt104++;
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
	// $ANTLR end "arrayAccessCall"



	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:1: atom : ( '(' expression ')' | primitiveAtom | array | varAccess );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:6: ( '(' expression ')' | primitiveAtom | array | varAccess )
			int alt105=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt105=1;
				}
				break;
			case Identifier:
				{
				int LA105_2 = input.LA(2);
				if ( (LA105_2==EOF||LA105_2==Arrow||LA105_2==Assign||(LA105_2 >= BitwiseAnd && LA105_2 <= BitwiseAndEqual)||(LA105_2 >= BitwiseOr && LA105_2 <= BitwiseXorEqual)||(LA105_2 >= Colon && LA105_2 <= Comma)||(LA105_2 >= Divide && LA105_2 <= DivideEqual)||(LA105_2 >= Dot && LA105_2 <= DotEqual)||LA105_2==Equal||(LA105_2 >= GreaterEqualThan && LA105_2 <= GreaterThan)||LA105_2==Identical||(LA105_2 >= LessEqualThan && LA105_2 <= LogicAndWeak)||(LA105_2 >= LogicOr && LA105_2 <= MinusEqual)||(LA105_2 >= Modulo && LA105_2 <= MultiplyEqual)||(LA105_2 >= NotEqual && LA105_2 <= NotIdentical)||(LA105_2 >= Plus && LA105_2 <= PlusEqual)||LA105_2==QuestionMark||(LA105_2 >= RightParanthesis && LA105_2 <= RightSquareBrace)||(LA105_2 >= Semicolon && LA105_2 <= ShiftRightEqual)||LA105_2==127) ) {
					alt105=2;
				}
				else if ( (LA105_2==Backslash||LA105_2==126) ) {
					alt105=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt105=3;
				}
				break;
			case Backslash:
			case Parent:
			case Self:
			case This:
			case VariableId:
				{
				alt105=4;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt105=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2826); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2828);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2830); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2835);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: array
					{
					pushFollow(FOLLOW_array_in_atom2840);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: varAccess
					{
					pushFollow(FOLLOW_varAccess_in_atom2845);
					varAccess();
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
	// $ANTLR end "atom"



	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt106=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt106=1;
				}
				break;
			case Minus:
				{
				alt106=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt106=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2857); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2859);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2864); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2866);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2871);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL | Identifier );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:2: ( Bool | Int | Float | String | Null | NULL | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==NULL||input.LA(1)==Null||input.LA(1)==String ) {
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LeftSquareBrace) ) {
				alt109=1;
			}
			else if ( (LA109_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3374); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:13: ( array_content )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==At||LA107_0==Backslash||LA107_0==BitwiseNot||LA107_0==Bool||LA107_0==Clone||LA107_0==Float||LA107_0==Identifier||LA107_0==Int||(LA107_0 >= LeftParanthesis && LA107_0 <= LeftSquareBrace)||LA107_0==LogicNot||LA107_0==Minus||LA107_0==MinusMinus||LA107_0==NULL||LA107_0==New||LA107_0==Null||(LA107_0 >= Parent && LA107_0 <= Plus)||LA107_0==PlusPlus||LA107_0==Self||LA107_0==String||LA107_0==This||LA107_0==TypeArray||LA107_0==VariableId) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3376);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3379); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array3385); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3387); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:18: ( array_content )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==At||LA108_0==Backslash||LA108_0==BitwiseNot||LA108_0==Bool||LA108_0==Clone||LA108_0==Float||LA108_0==Identifier||LA108_0==Int||(LA108_0 >= LeftParanthesis && LA108_0 <= LeftSquareBrace)||LA108_0==LogicNot||LA108_0==Minus||LA108_0==MinusMinus||LA108_0==NULL||LA108_0==New||LA108_0==Null||(LA108_0 >= Parent && LA108_0 <= Plus)||LA108_0==PlusPlus||LA108_0==Self||LA108_0==String||LA108_0==This||LA108_0==TypeArray||LA108_0==VariableId) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3389);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3392); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: ( expression '=>' )?
			int alt110=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA110_1 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA110_2 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA110_3 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case At:
					{
					int LA110_4 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case VariableId:
					{
					int LA110_5 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA110_6 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Identifier:
					{
					int LA110_7 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case This:
					{
					int LA110_8 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Self:
					{
					int LA110_9 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Parent:
					{
					int LA110_10 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Backslash:
					{
					int LA110_11 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case New:
					{
					int LA110_12 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Clone:
					{
					int LA110_13 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Plus:
					{
					int LA110_14 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Minus:
					{
					int LA110_15 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
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
					int LA110_16 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA110_17 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA110_18 = input.LA(2);
					if ( (synpred182_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3405);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content3407); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3411);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:35: ( ',' ( expression '=>' )? expression )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Comma) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content3415); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:40: ( expression '=>' )?
					int alt111=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA111_1 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA111_2 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA111_3 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case At:
							{
							int LA111_4 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case VariableId:
							{
							int LA111_5 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA111_6 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Identifier:
							{
							int LA111_7 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case This:
							{
							int LA111_8 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Self:
							{
							int LA111_9 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Parent:
							{
							int LA111_10 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Backslash:
							{
							int LA111_11 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case New:
							{
							int LA111_12 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Clone:
							{
							int LA111_13 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Plus:
							{
							int LA111_14 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Minus:
							{
							int LA111_15 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
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
							int LA111_16 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA111_17 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA111_18 = input.LA(2);
							if ( (synpred183_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
					}
					switch (alt111) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3418);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content3420); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3424);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop112;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:621:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition3436); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3438); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition3440);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3442); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3444);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:3: ( 'else' instructionInclBreakContinue )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==Else) ) {
				int LA113_1 = input.LA(2);
				if ( (synpred185_TSPHP()) ) {
					alt113=1;
				}
			}
			switch (alt113) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition3451); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3453);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3469); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3471); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3473); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3475); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3477); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==Case) ) {
				int LA126_1 = input.LA(2);
				if ( (synpred193_TSPHP()) ) {
					alt126=1;
				}
				else if ( (true) ) {
					alt126=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt116=0;
					loop116:
					do {
						int alt116=2;
						int LA116_0 = input.LA(1);
						if ( (LA116_0==Case) ) {
							alt116=1;
						}

						switch (alt116) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: ( caseLabel )+
							int cnt114=0;
							loop114:
							do {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==Case) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3488);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt114 >= 1 ) break loop114;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(114, input);
										throw eee;
								}
								cnt114++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:16: ( instructionInclBreakContinue )+
							int cnt115=0;
							loop115:
							do {
								int alt115=2;
								int LA115_0 = input.LA(1);
								if ( (LA115_0==Backslash||LA115_0==Break||LA115_0==Continue||LA115_0==Do||LA115_0==Echo||LA115_0==Exit||(LA115_0 >= For && LA115_0 <= Foreach)||(LA115_0 >= Identifier && LA115_0 <= If)||LA115_0==LeftCurlyBrace||LA115_0==MinusMinus||LA115_0==Parent||LA115_0==PlusPlus||LA115_0==Return||LA115_0==Self||(LA115_0 >= Switch && LA115_0 <= TypeString)||LA115_0==VariableId||LA115_0==While) ) {
									alt115=1;
								}

								switch (alt115) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3491);
									instructionInclBreakContinue();
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3496);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:61: ( instructionInclBreakContinue )+
					int cnt117=0;
					loop117:
					do {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==Backslash||LA117_0==Break||LA117_0==Continue||LA117_0==Do||LA117_0==Echo||LA117_0==Exit||(LA117_0 >= For && LA117_0 <= Foreach)||(LA117_0 >= Identifier && LA117_0 <= If)||LA117_0==LeftCurlyBrace||LA117_0==MinusMinus||LA117_0==Parent||LA117_0==PlusPlus||LA117_0==Return||LA117_0==Self||(LA117_0 >= Switch && LA117_0 <= TypeString)||LA117_0==VariableId||LA117_0==While) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3498);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt120=0;
					loop120:
					do {
						int alt120=2;
						int LA120_0 = input.LA(1);
						if ( (LA120_0==Case) ) {
							alt120=1;
						}

						switch (alt120) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: ( caseLabel )+
							int cnt118=0;
							loop118:
							do {
								int alt118=2;
								int LA118_0 = input.LA(1);
								if ( (LA118_0==Case) ) {
									alt118=1;
								}

								switch (alt118) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3502);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:103: ( instructionInclBreakContinue )+
							int cnt119=0;
							loop119:
							do {
								int alt119=2;
								int LA119_0 = input.LA(1);
								if ( (LA119_0==Backslash||LA119_0==Break||LA119_0==Continue||LA119_0==Do||LA119_0==Echo||LA119_0==Exit||(LA119_0 >= For && LA119_0 <= Foreach)||(LA119_0 >= Identifier && LA119_0 <= If)||LA119_0==LeftCurlyBrace||LA119_0==MinusMinus||LA119_0==Parent||LA119_0==PlusPlus||LA119_0==Return||LA119_0==Self||(LA119_0 >= Switch && LA119_0 <= TypeString)||LA119_0==VariableId||LA119_0==While) ) {
									alt119=1;
								}

								switch (alt119) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3505);
									instructionInclBreakContinue();
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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt123=0;
					loop123:
					do {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==Case) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3515);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:17: ( instructionInclBreakContinue )+
							int cnt122=0;
							loop122:
							do {
								int alt122=2;
								int LA122_0 = input.LA(1);
								if ( (LA122_0==Backslash||LA122_0==Break||LA122_0==Continue||LA122_0==Do||LA122_0==Echo||LA122_0==Exit||(LA122_0 >= For && LA122_0 <= Foreach)||(LA122_0 >= Identifier && LA122_0 <= If)||LA122_0==LeftCurlyBrace||LA122_0==MinusMinus||LA122_0==Parent||LA122_0==PlusPlus||LA122_0==Return||LA122_0==Self||(LA122_0 >= Switch && LA122_0 <= TypeString)||LA122_0==VariableId||LA122_0==While) ) {
									alt122=1;
								}

								switch (alt122) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3518);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt122 >= 1 ) break loop122;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(122, input);
										throw eee;
								}
								cnt122++;
							} while (true);

							}
							break;

						default :
							if ( cnt123 >= 1 ) break loop123;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(123, input);
								throw eee;
						}
						cnt123++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==Default) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3524);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:63: ( instructionInclBreakContinue )+
							int cnt124=0;
							loop124:
							do {
								int alt124=2;
								int LA124_0 = input.LA(1);
								if ( (LA124_0==Backslash||LA124_0==Break||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= For && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==LeftCurlyBrace||LA124_0==MinusMinus||LA124_0==Parent||LA124_0==PlusPlus||LA124_0==Return||LA124_0==Self||(LA124_0 >= Switch && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
									alt124=1;
								}

								switch (alt124) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3526);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt124 >= 1 ) break loop124;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(124, input);
										throw eee;
								}
								cnt124++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3537); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3549); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3551);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3553); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3562); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3564); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3573); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3575); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:21: ( forInit )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Backslash||LA127_0==Identifier||LA127_0==MinusMinus||LA127_0==PlusPlus||(LA127_0 >= TypeArray && LA127_0 <= TypeString)||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3577);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3580); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:34: ( expressionList )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==At||LA128_0==Backslash||LA128_0==BitwiseNot||LA128_0==Bool||LA128_0==Clone||LA128_0==Float||LA128_0==Identifier||LA128_0==Int||(LA128_0 >= LeftParanthesis && LA128_0 <= LeftSquareBrace)||LA128_0==LogicNot||LA128_0==Minus||LA128_0==MinusMinus||LA128_0==NULL||LA128_0==New||LA128_0==Null||(LA128_0 >= Parent && LA128_0 <= Plus)||LA128_0==PlusPlus||LA128_0==Self||LA128_0==String||LA128_0==This||LA128_0==TypeArray||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3582);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3586); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:55: ( forUpdate )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==MinusMinus||LA129_0==PlusPlus||LA129_0==VariableId) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3588);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3591); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3593);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:11: ( variableDeclaration | variableAssignment )
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==Backslash||LA130_0==Identifier||(LA130_0 >= TypeArray && LA130_0 <= TypeString)) ) {
				alt130=1;
			}
			else if ( (LA130_0==MinusMinus||LA130_0==PlusPlus||LA130_0==VariableId) ) {
				alt130=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3602);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3604);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:52: ( ',' variableAssignment )*
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Comma) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3608); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3610);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop131;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3620);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:23: ( ',' variableAssignment )*
			loop132:
			do {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==Comma) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3623); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3625);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop132;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:648:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3636); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3638); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:18: ( VariableId | array )
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==VariableId) ) {
				alt133=1;
			}
			else if ( (LA133_0==LeftSquareBrace||LA133_0==TypeArray) ) {
				alt133=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}
			switch (alt133) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3641); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3643);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3646); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3648); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:53: ( '=>' VariableId )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==Arrow) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3651); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3653); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3657); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3659);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:651:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3668); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3670); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3672);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3674); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3676);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3686); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3688);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3690); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3692); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3694);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3696); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3698); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3705); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3707); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:21: ( instructionInclBreakContinue )+
			int cnt135=0;
			loop135:
			do {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==Backslash||LA135_0==Break||LA135_0==Continue||LA135_0==Do||LA135_0==Echo||LA135_0==Exit||(LA135_0 >= For && LA135_0 <= Foreach)||(LA135_0 >= Identifier && LA135_0 <= If)||LA135_0==LeftCurlyBrace||LA135_0==MinusMinus||LA135_0==Parent||LA135_0==PlusPlus||LA135_0==Return||LA135_0==Self||(LA135_0 >= Switch && LA135_0 <= TypeString)||LA135_0==VariableId||LA135_0==While) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3709);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3712); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3714); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3716); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3718);
			classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3720); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3722); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3723); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:114: ( instructionInclBreakContinue )*
			loop136:
			do {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==Backslash||LA136_0==Break||LA136_0==Continue||LA136_0==Do||LA136_0==Echo||LA136_0==Exit||(LA136_0 >= For && LA136_0 <= Foreach)||(LA136_0 >= Identifier && LA136_0 <= If)||LA136_0==LeftCurlyBrace||LA136_0==MinusMinus||LA136_0==Parent||LA136_0==PlusPlus||LA136_0==Return||LA136_0==Self||(LA136_0 >= Switch && LA136_0 <= TypeString)||LA136_0==VariableId||LA136_0==While) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3725);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop136;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3728); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:1: throwException : 'throw' newObject ';' ;
	public final void throwException() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:660:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:660:4: 'throw' newObject ';'
			{
			match(input,Throw,FOLLOW_Throw_in_throwException3737); if (state.failed) return ;
			pushFollow(FOLLOW_newObject_in_throwException3739);
			newObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_throwException3741); if (state.failed) return ;
			}

		}
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

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred103_TSPHP2112); if (state.failed) return ;
		pushFollow(FOLLOW_logicXorWeak_in_synpred103_TSPHP2114);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred104_TSPHP2130); if (state.failed) return ;
		pushFollow(FOLLOW_logicAndWeak_in_synpred104_TSPHP2132);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred105_TSPHP
	public final void synpred105_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred105_TSPHP2148); if (state.failed) return ;
		pushFollow(FOLLOW_assignment_in_synpred105_TSPHP2150);
		assignment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred105_TSPHP

	// $ANTLR start synpred106_TSPHP
	public final void synpred106_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred106_TSPHP2164);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;
		pushFollow(FOLLOW_ternary_in_synpred106_TSPHP2166);
		ternary();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred106_TSPHP

	// $ANTLR start synpred134_TSPHP
	public final void synpred134_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
		{
		match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred134_TSPHP2459); if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
		int alt150=2;
		int LA150_0 = input.LA(1);
		if ( ((LA150_0 >= TypeArray && LA150_0 <= TypeInt)||LA150_0==TypeString) ) {
			alt150=1;
		}
		else if ( (LA150_0==Backslash||LA150_0==Identifier||LA150_0==TypeObject) ) {
			alt150=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 150, 0, input);
			throw nvae;
		}
		switch (alt150) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:10: primitiveTypesInclArray
				{
				pushFollow(FOLLOW_primitiveTypesInclArray_in_synpred134_TSPHP2462);
				primitiveTypesInclArray();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:34: classInterfaceTypeInclObject
				{
				pushFollow(FOLLOW_classInterfaceTypeInclObject_in_synpred134_TSPHP2464);
				classInterfaceTypeInclObject();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

		}

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred134_TSPHP2467); if (state.failed) return ;
		}

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred134_TSPHP2470);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred134_TSPHP

	// $ANTLR start synpred140_TSPHP
	public final void synpred140_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: ( fluentObject ( '[' expression ']' )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: fluentObject ( '[' expression ']' )+
		{
		pushFollow(FOLLOW_fluentObject_in_synpred140_TSPHP2523);
		fluentObject();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:17: ( '[' expression ']' )+
		int cnt151=0;
		loop151:
		do {
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LeftSquareBrace) ) {
				alt151=1;
			}

			switch (alt151) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:18: '[' expression ']'
				{
				match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred140_TSPHP2526); if (state.failed) return ;
				pushFollow(FOLLOW_expression_in_synpred140_TSPHP2528);
				expression();
				state._fsp--;
				if (state.failed) return ;
				match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred140_TSPHP2530); if (state.failed) return ;
				}
				break;

			default :
				if ( cnt151 >= 1 ) break loop151;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(151, input);
					throw eee;
			}
			cnt151++;
		} while (true);

		}

	}
	// $ANTLR end synpred140_TSPHP

	// $ANTLR start synpred159_TSPHP
	public final void synpred159_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:82: ( arrayAccessCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:82: arrayAccessCall
		{
		pushFollow(FOLLOW_arrayAccessCall_in_synpred159_TSPHP2740);
		arrayAccessCall();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred159_TSPHP

	// $ANTLR start synpred164_TSPHP
	public final void synpred164_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:115: ( arrayAccessCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:115: arrayAccessCall
		{
		pushFollow(FOLLOW_arrayAccessCall_in_synpred164_TSPHP2784);
		arrayAccessCall();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred164_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:6: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:6: ( '[' expression ']' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:7: '[' expression ']'
		{
		match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred167_TSPHP2799); if (state.failed) return ;
		pushFollow(FOLLOW_expression_in_synpred167_TSPHP2801);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred167_TSPHP2803); if (state.failed) return ;
		}

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:27: ( '->' Identifier '(' ( expressionList )? ')' )?
		int alt157=2;
		int LA157_0 = input.LA(1);
		if ( (LA157_0==ObjectOperator) ) {
			alt157=1;
		}
		switch (alt157) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:28: '->' Identifier '(' ( expressionList )? ')'
				{
				match(input,ObjectOperator,FOLLOW_ObjectOperator_in_synpred167_TSPHP2807); if (state.failed) return ;
				match(input,Identifier,FOLLOW_Identifier_in_synpred167_TSPHP2808); if (state.failed) return ;
				match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred167_TSPHP2810); if (state.failed) return ;
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:47: ( expressionList )?
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==At||LA156_0==Backslash||LA156_0==BitwiseNot||LA156_0==Bool||LA156_0==Clone||LA156_0==Float||LA156_0==Identifier||LA156_0==Int||(LA156_0 >= LeftParanthesis && LA156_0 <= LeftSquareBrace)||LA156_0==LogicNot||LA156_0==Minus||LA156_0==MinusMinus||LA156_0==NULL||LA156_0==New||LA156_0==Null||(LA156_0 >= Parent && LA156_0 <= Plus)||LA156_0==PlusPlus||LA156_0==Self||LA156_0==String||LA156_0==This||LA156_0==TypeArray||LA156_0==VariableId) ) {
					alt156=1;
				}
				switch (alt156) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:47: expressionList
						{
						pushFollow(FOLLOW_expressionList_in_synpred167_TSPHP2812);
						expressionList();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred167_TSPHP2814); if (state.failed) return ;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred182_TSPHP3405);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred182_TSPHP3407); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred183_TSPHP
	public final void synpred183_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred183_TSPHP3418);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred183_TSPHP3420); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred183_TSPHP

	// $ANTLR start synpred185_TSPHP
	public final void synpred185_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred185_TSPHP3451); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred185_TSPHP3453);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred185_TSPHP

	// $ANTLR start synpred193_TSPHP
	public final void synpred193_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt166=0;
		loop166:
		do {
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==Case) ) {
				alt166=1;
			}

			switch (alt166) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: ( caseLabel )+
				int cnt164=0;
				loop164:
				do {
					int alt164=2;
					int LA164_0 = input.LA(1);
					if ( (LA164_0==Case) ) {
						alt164=1;
					}

					switch (alt164) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred193_TSPHP3488);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt164 >= 1 ) break loop164;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(164, input);
							throw eee;
					}
					cnt164++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:16: ( instructionInclBreakContinue )+
				int cnt165=0;
				loop165:
				do {
					int alt165=2;
					int LA165_0 = input.LA(1);
					if ( (LA165_0==Backslash||LA165_0==Break||LA165_0==Continue||LA165_0==Do||LA165_0==Echo||LA165_0==Exit||(LA165_0 >= For && LA165_0 <= Foreach)||(LA165_0 >= Identifier && LA165_0 <= If)||LA165_0==LeftCurlyBrace||LA165_0==MinusMinus||LA165_0==Parent||LA165_0==PlusPlus||LA165_0==Return||LA165_0==Self||(LA165_0 >= Switch && LA165_0 <= TypeString)||LA165_0==VariableId||LA165_0==While) ) {
						alt165=1;
					}

					switch (alt165) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3491);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt165 >= 1 ) break loop165;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(165, input);
							throw eee;
					}
					cnt165++;
				} while (true);

				}
				break;

			default :
				if ( cnt166 >= 1 ) break loop166;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(166, input);
					throw eee;
			}
			cnt166++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred193_TSPHP3496);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:61: ( instructionInclBreakContinue )+
		int cnt167=0;
		loop167:
		do {
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==Backslash||LA167_0==Break||LA167_0==Continue||LA167_0==Do||LA167_0==Echo||LA167_0==Exit||(LA167_0 >= For && LA167_0 <= Foreach)||(LA167_0 >= Identifier && LA167_0 <= If)||LA167_0==LeftCurlyBrace||LA167_0==MinusMinus||LA167_0==Parent||LA167_0==PlusPlus||LA167_0==Return||LA167_0==Self||(LA167_0 >= Switch && LA167_0 <= TypeString)||LA167_0==VariableId||LA167_0==While) ) {
				alt167=1;
			}

			switch (alt167) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3498);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt167 >= 1 ) break loop167;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(167, input);
					throw eee;
			}
			cnt167++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt170=0;
		loop170:
		do {
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==Case) ) {
				alt170=1;
			}

			switch (alt170) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: ( caseLabel )+
				int cnt168=0;
				loop168:
				do {
					int alt168=2;
					int LA168_0 = input.LA(1);
					if ( (LA168_0==Case) ) {
						alt168=1;
					}

					switch (alt168) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred193_TSPHP3502);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt168 >= 1 ) break loop168;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(168, input);
							throw eee;
					}
					cnt168++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:103: ( instructionInclBreakContinue )+
				int cnt169=0;
				loop169:
				do {
					int alt169=2;
					int LA169_0 = input.LA(1);
					if ( (LA169_0==Backslash||LA169_0==Break||LA169_0==Continue||LA169_0==Do||LA169_0==Echo||LA169_0==Exit||(LA169_0 >= For && LA169_0 <= Foreach)||(LA169_0 >= Identifier && LA169_0 <= If)||LA169_0==LeftCurlyBrace||LA169_0==MinusMinus||LA169_0==Parent||LA169_0==PlusPlus||LA169_0==Return||LA169_0==Self||(LA169_0 >= Switch && LA169_0 <= TypeString)||LA169_0==VariableId||LA169_0==While) ) {
						alt169=1;
					}

					switch (alt169) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3505);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt169 >= 1 ) break loop169;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(169, input);
							throw eee;
					}
					cnt169++;
				} while (true);

				}
				break;

			default :
				if ( cnt170 >= 1 ) break loop170;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(170, input);
					throw eee;
			}
			cnt170++;
		} while (true);

		}

	}
	// $ANTLR end synpred193_TSPHP

	// Delegated rules

	public final boolean synpred167_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred167_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred193_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred193_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred183_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred183_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred106_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred106_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred104_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred134_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred185_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred185_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred159_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred159_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred140_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred140_TSPHP_fragment(); // can never throw exception
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
	protected DFA50 dfa50 = new DFA50(this);
	protected DFA57 dfa57 = new DFA57(this);
	protected DFA84 dfa84 = new DFA84(this);
	protected DFA90 dfa90 = new DFA90(this);
	protected DFA92 dfa92 = new DFA92(this);
	protected DFA97 dfa97 = new DFA97(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\64\1\uffff\1\12\1\uffff\1\64\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\174\1\71\1\uffff\1\146\1\uffff\1\64\1\uffff\1\146";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\4\uffff\1\2\5\uffff\1\2\4\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\2\uffff\2\2\14\uffff\1\2\5\uffff"+
			"\1\1\7\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\16\2\1\uffff"+
			"\1\2",
			"\1\3\4\uffff\1\4",
			"",
			"\1\5\56\uffff\1\4\54\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\56\uffff\1\4\54\uffff\1\6"
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
			return "174:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA50_eotS =
		"\27\uffff";
	static final String DFA50_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA50_minS =
		"\1\12\4\172\1\64\1\12\1\7\1\64\1\uffff\1\12\2\uffff\1\12\4\172\1\64\1"+
		"\12\1\7\1\64\1\12";
	static final String DFA50_maxS =
		"\1\170\4\172\1\64\1\172\1\170\1\64\1\uffff\1\170\2\uffff\5\172\1\64\1"+
		"\172\1\141\1\64\1\172";
	static final String DFA50_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA50_specialS =
		"\27\uffff}>";
	static final String[] DFA50_transitionS = {
			"\1\5\51\uffff\1\6\74\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\157\uffff\1\7",
			"\1\11\2\uffff\1\14\16\uffff\1\12\32\uffff\1\14\54\uffff\1\13\17\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\51\uffff\1\23\74\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\157\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\157\uffff\1\24",
			"\1\14\21\uffff\1\13\107\uffff\1\13",
			"\1\26",
			"\1\25\157\uffff\1\24"
	};

	static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
	static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
	static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
	static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
	static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
	static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
	static final short[][] DFA50_transition;

	static {
		int numStates = DFA50_transitionS.length;
		DFA50_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
		}
	}

	class DFA50 extends DFA {

		public DFA50(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 50;
			this.eot = DFA50_eot;
			this.eof = DFA50_eof;
			this.min = DFA50_min;
			this.max = DFA50_max;
			this.accept = DFA50_accept;
			this.special = DFA50_special;
			this.transition = DFA50_transition;
		}
		@Override
		public String getDescription() {
			return "327:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA57_eotS =
		"\30\uffff";
	static final String DFA57_eofS =
		"\30\uffff";
	static final String DFA57_minS =
		"\1\12\1\7\2\uffff\1\64\1\12\14\uffff\1\12\1\64\1\uffff\1\64\2\12";
	static final String DFA57_maxS =
		"\1\174\1\152\2\uffff\1\64\1\176\14\uffff\1\176\1\64\1\uffff\1\64\2\176";
	static final String DFA57_acceptS =
		"\2\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\14\1\15"+
		"\1\16\1\17\2\uffff\1\13\3\uffff";
	static final String DFA57_specialS =
		"\30\uffff}>";
	static final String[] DFA57_transitionS = {
			"\1\4\26\uffff\1\13\4\uffff\1\20\2\uffff\1\21\3\uffff\1\10\1\11\5\uffff"+
			"\1\5\1\6\20\uffff\1\2\15\uffff\1\16\2\uffff\1\2\7\uffff\1\17\5\uffff"+
			"\1\16\7\uffff\1\7\1\16\1\15\1\14\10\3\1\uffff\1\1\1\uffff\1\12",
			"\1\2\4\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\1\2\3\uffff\1\2\40"+
			"\uffff\2\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\16\2\uffff\2\2\20\uffff"+
			"\1\2\1\uffff\1\2",
			"",
			"",
			"\1\22",
			"\1\23\57\uffff\1\24\77\uffff\1\3\3\uffff\1\16",
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
			"\1\25\157\uffff\1\3\3\uffff\1\16",
			"\1\26",
			"",
			"\1\27",
			"\1\23\57\uffff\1\24\77\uffff\1\3\3\uffff\1\16",
			"\1\25\157\uffff\1\3\3\uffff\1\16"
	};

	static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
	static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
	static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
	static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
	static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
	static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
	static final short[][] DFA57_transition;

	static {
		int numStates = DFA57_transitionS.length;
		DFA57_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
		}
	}

	class DFA57 extends DFA {

		public DFA57(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 57;
			this.eot = DFA57_eot;
			this.eof = DFA57_eof;
			this.min = DFA57_min;
			this.max = DFA57_max;
			this.accept = DFA57_accept;
			this.special = DFA57_special;
			this.transition = DFA57_transition;
		}
		@Override
		public String getDescription() {
			return "353:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );";
		}
	}

	static final String DFA84_eotS =
		"\23\uffff";
	static final String DFA84_eofS =
		"\23\uffff";
	static final String DFA84_minS =
		"\2\12\1\73\3\64\1\73\1\64\1\uffff\2\64\1\uffff\1\73\1\uffff\2\12\1\72"+
		"\1\64\1\12";
	static final String DFA84_maxS =
		"\1\172\1\176\1\123\2\172\1\64\1\123\1\64\1\uffff\1\172\1\64\1\uffff\1"+
		"\123\1\uffff\2\176\1\123\1\64\1\176";
	static final String DFA84_acceptS =
		"\10\uffff\1\1\2\uffff\1\3\1\uffff\1\2\5\uffff";
	static final String DFA84_specialS =
		"\23\uffff}>";
	static final String[] DFA84_transitionS = {
			"\1\5\51\uffff\1\1\37\uffff\1\4\20\uffff\1\3\10\uffff\1\2\13\uffff\1\6",
			"\1\7\57\uffff\1\10\103\uffff\1\11",
			"\1\13\27\uffff\1\12",
			"\1\15\105\uffff\1\14",
			"\1\15\105\uffff\1\14",
			"\1\16",
			"\1\13\27\uffff\1\15",
			"\1\17",
			"",
			"\1\15\105\uffff\1\14",
			"\1\20",
			"",
			"\1\13\27\uffff\1\15",
			"",
			"\1\21\163\uffff\1\11",
			"\1\7\57\uffff\1\10\103\uffff\1\11",
			"\1\15\1\13\27\uffff\1\12",
			"\1\22",
			"\1\21\163\uffff\1\11"
	};

	static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
	static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
	static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
	static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
	static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
	static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
	static final short[][] DFA84_transition;

	static {
		int numStates = DFA84_transitionS.length;
		DFA84_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
		}
	}

	class DFA84 extends DFA {

		public DFA84(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 84;
			this.eot = DFA84_eot;
			this.eof = DFA84_eof;
			this.min = DFA84_min;
			this.max = DFA84_max;
			this.accept = DFA84_accept;
			this.special = DFA84_special;
			this.transition = DFA84_transition;
		}
		@Override
		public String getDescription() {
			return "488:1: fluentObject : ( functionCall | methodCall | varAccess );";
		}
	}

	static final String DFA90_eotS =
		"\10\uffff";
	static final String DFA90_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA90_minS =
		"\1\115\1\12\1\64\1\5\1\64\2\uffff\1\5";
	static final String DFA90_maxS =
		"\1\115\2\64\1\177\1\64\2\uffff\1\177";
	static final String DFA90_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA90_specialS =
		"\10\uffff}>";
	static final String[] DFA90_transitionS = {
			"\1\1",
			"\1\2\51\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff\1\5\2\uffff"+
			"\2\5\3\uffff\5\5\24\uffff\1\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff\1\5\2\uffff"+
			"\2\5\3\uffff\5\5\24\uffff\1\5"
	};

	static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
	static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
	static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
	static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
	static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
	static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
	static final short[][] DFA90_transition;

	static {
		int numStates = DFA90_transitionS.length;
		DFA90_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
		}
	}

	class DFA90 extends DFA {

		public DFA90(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 90;
			this.eot = DFA90_eot;
			this.eof = DFA90_eof;
			this.min = DFA90_min;
			this.max = DFA90_max;
			this.accept = DFA90_accept;
			this.special = DFA90_special;
			this.transition = DFA90_transition;
		}
		@Override
		public String getDescription() {
			return "512:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	static final String DFA92_eotS =
		"\23\uffff";
	static final String DFA92_eofS =
		"\1\uffff\2\7\3\uffff\1\7\5\uffff\1\7\3\uffff\1\7\2\uffff";
	static final String DFA92_minS =
		"\1\12\2\5\3\64\1\5\1\uffff\1\64\1\uffff\2\64\1\5\1\uffff\2\12\1\5\1\64"+
		"\1\12";
	static final String DFA92_maxS =
		"\1\172\2\177\2\172\1\64\1\177\1\uffff\1\64\1\uffff\1\172\1\64\1\177\1"+
		"\uffff\2\176\1\177\1\64\1\176";
	static final String DFA92_acceptS =
		"\7\uffff\1\3\1\uffff\1\1\3\uffff\1\2\5\uffff";
	static final String DFA92_specialS =
		"\23\uffff}>";
	static final String[] DFA92_transitionS = {
			"\1\5\7\uffff\1\7\31\uffff\1\7\7\uffff\1\1\2\uffff\1\7\2\uffff\2\7\17"+
			"\uffff\1\7\5\uffff\1\7\2\uffff\1\4\20\uffff\1\3\6\uffff\1\7\1\uffff\1"+
			"\2\2\uffff\1\7\10\uffff\1\6",
			"\1\7\1\uffff\1\7\2\uffff\1\10\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2"+
			"\7\2\uffff\2\7\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\6\uffff\1\11\1\uffff"+
			"\4\7\1\uffff\5\7\1\uffff\4\7\3\uffff\3\7\4\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7\23\uffff\1\12\1\7",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\10\uffff\4\7\1\uffff\5\7\1\uffff"+
			"\4\7\3\uffff\3\7\2\uffff\1\13\1\uffff\2\7\7\uffff\1\7\2\uffff\2\7\3\uffff"+
			"\5\7\24\uffff\1\7",
			"\1\15\105\uffff\1\14",
			"\1\15\105\uffff\1\14",
			"\1\16",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\10\uffff\4\7\1\uffff\5\7\1\uffff"+
			"\4\7\3\uffff\3\7\2\uffff\1\15\1\uffff\2\7\7\uffff\1\7\2\uffff\2\7\3\uffff"+
			"\5\7\24\uffff\1\7",
			"",
			"\1\17",
			"",
			"\1\15\105\uffff\1\14",
			"\1\20",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\10\uffff\4\7\1\uffff\5\7\1\uffff"+
			"\4\7\3\uffff\3\7\2\uffff\1\15\1\uffff\2\7\7\uffff\1\7\2\uffff\2\7\3\uffff"+
			"\5\7\24\uffff\1\7",
			"",
			"\1\21\163\uffff\1\12",
			"\1\10\57\uffff\1\11\103\uffff\1\12",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\6\uffff\1\15\1\uffff\4\7\1\uffff"+
			"\5\7\1\uffff\4\7\3\uffff\3\7\2\uffff\1\13\1\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7\24\uffff\1\7",
			"\1\22",
			"\1\21\163\uffff\1\12"
	};

	static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
	static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
	static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
	static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
	static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
	static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
	static final short[][] DFA92_transition;

	static {
		int numStates = DFA92_transitionS.length;
		DFA92_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
		}
	}

	class DFA92 extends DFA {

		public DFA92(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 92;
			this.eot = DFA92_eot;
			this.eof = DFA92_eof;
			this.min = DFA92_min;
			this.max = DFA92_max;
			this.accept = DFA92_accept;
			this.special = DFA92_special;
			this.transition = DFA92_transition;
		}
		@Override
		public String getDescription() {
			return "521:1: atomOrCall : ( functionCall | methodCall | atom );";
		}
	}

	static final String DFA97_eotS =
		"\12\uffff";
	static final String DFA97_eofS =
		"\12\uffff";
	static final String DFA97_minS =
		"\1\12\1\uffff\3\64\1\12\1\uffff\2\64\1\12";
	static final String DFA97_maxS =
		"\1\172\1\uffff\2\172\1\64\1\176\1\uffff\1\64\1\172\1\176";
	static final String DFA97_acceptS =
		"\1\uffff\1\1\4\uffff\1\2\3\uffff";
	static final String DFA97_specialS =
		"\12\uffff}>";
	static final String[] DFA97_transitionS = {
			"\1\4\51\uffff\1\5\37\uffff\1\3\20\uffff\1\2\10\uffff\1\1\13\uffff\1\1",
			"",
			"\1\6\105\uffff\1\1",
			"\1\6\105\uffff\1\1",
			"\1\5",
			"\1\7\163\uffff\1\10",
			"",
			"\1\11",
			"\1\6\105\uffff\1\1",
			"\1\7\163\uffff\1\10"
	};

	static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
	static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
	static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
	static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
	static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
	static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
	static final short[][] DFA97_transition;

	static {
		int numStates = DFA97_transitionS.length;
		DFA97_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
		}
	}

	class DFA97 extends DFA {

		public DFA97(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 97;
			this.eot = DFA97_eot;
			this.eof = DFA97_eof;
			this.min = DFA97_min;
			this.max = DFA97_max;
			this.accept = DFA97_accept;
			this.special = DFA97_special;
			this.transition = DFA97_transition;
		}
		@Override
		public String getDescription() {
			return "531:4: ( ( varAccess '->' ) | staticAccess )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_prog908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_prog916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog921 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon936 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon938 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon940 = new BitSet(new long[]{0x0330EA4208400410L,0x17FFE02080900040L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon942 = new BitSet(new long[]{0x0330EA4208400412L,0x17FFE02080900040L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket955 = new BitSet(new long[]{0x0210000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket957 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket960 = new BitSet(new long[]{0x0330EA4208400410L,0x17FFE02080900040L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket962 = new BitSet(new long[]{0x0330EA4208400410L,0x17FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1031 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1034 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1036 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1049 = new BitSet(new long[]{0x0330EA4208400412L,0x17FFE02080900040L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1082 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1084 = new BitSet(new long[]{0x0000000002000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1087 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1089 = new BitSet(new long[]{0x0000000002000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1106 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1108 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1110 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1113 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1115 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1126 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1128 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1131 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1133 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_As_in_useDeclaration1147 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1199 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1201 = new BitSet(new long[]{0x0240040000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1203 = new BitSet(new long[]{0x0240000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1206 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1209 = new BitSet(new long[]{0x0000880008000010L,0x0000080031000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1211 = new BitSet(new long[]{0x0000880008000010L,0x0000080131000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1228 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1239 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1242 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1244 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1255 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1290 = new BitSet(new long[]{0x0000000000000000L,0x013C000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1292 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1294 = new BitSet(new long[]{0x0000000002000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1297 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1299 = new BitSet(new long[]{0x0000000002000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1313 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1316 = new BitSet(new long[]{0x0090100000040000L,0x0000100000220810L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1327 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1330 = new BitSet(new long[]{0x0000000000000000L,0x0400000000800040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1332 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000031000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1347 = new BitSet(new long[]{0x0010000000000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1349 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1386 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1389 = new BitSet(new long[]{0x0000000000000000L,0x0400000000800040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1392 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1394 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1409 = new BitSet(new long[]{0x0000800000000000L,0x0000000030000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1411 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1425 = new BitSet(new long[]{0x0000880000000000L,0x0000000031000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1427 = new BitSet(new long[]{0x0000800000000000L,0x0000000031000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1435 = new BitSet(new long[]{0x0000800000000000L,0x0000080031000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1437 = new BitSet(new long[]{0x0000800000000000L,0x0000000031000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1451 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1468 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1470 = new BitSet(new long[]{0x0240000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1472 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1475 = new BitSet(new long[]{0x0000800008000000L,0x0000000120000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1477 = new BitSet(new long[]{0x0000800008000000L,0x0000000120000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1505 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1508 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1526 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1528 = new BitSet(new long[]{0x0230624200000400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1530 = new BitSet(new long[]{0x0230624200000400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1543 = new BitSet(new long[]{0x0010000000000400L,0x09FE000000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1545 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1547 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1549 = new BitSet(new long[]{0x0010000000000400L,0x01FE000200000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1656 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1690 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1693 = new BitSet(new long[]{0x0010000000000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1695 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1702 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1705 = new BitSet(new long[]{0x0010000000000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1707 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1714 = new BitSet(new long[]{0x0010000002000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1717 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1719 = new BitSet(new long[]{0x0010000002000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1724 = new BitSet(new long[]{0x0010000000000400L,0x01FE000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1726 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1740 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1752 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1755 = new BitSet(new long[]{0x0C90100000040400L,0x0402502000320810L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1779 = new BitSet(new long[]{0x0230624200000400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1781 = new BitSet(new long[]{0x0230624200000400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1801 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1803 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1817 = new BitSet(new long[]{0x0080000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1823 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1838 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1845 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_instruction1892 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_instruction1899 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1906 = new BitSet(new long[]{0x0C90100000842500L,0x0402506000B22851L});
	public static final BitSet FOLLOW_expression_in_instruction1908 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1916 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expressionList_in_instruction1918 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1925 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1939 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1942 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_expressionList1944 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1955 = new BitSet(new long[]{0x0000001100029080L,0x0000050000400520L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1957 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800040L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2063 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2081 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2083 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2086 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2112 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2130 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2145 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2148 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2150 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2161 = new BitSet(new long[]{0x0000001100029082L,0x0000050000400520L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2164 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_ternary_in_assignment2166 = new BitSet(new long[]{0x0000001100029082L,0x0000050000400520L});
	public static final BitSet FOLLOW_logicOr_in_ternary2176 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2179 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_ternary2181 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2183 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_ternary2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2198 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2209 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2212 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2214 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2225 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2228 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2230 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2241 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2244 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2246 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2257 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2260 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2262 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2271 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2274 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_comparison_in_equality2276 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2318 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2321 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2323 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2359 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2362 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2368 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2378 = new BitSet(new long[]{0x0000000800000002L,0x0000000000200010L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2381 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2389 = new BitSet(new long[]{0x0000000800000002L,0x0000000000200010L});
	public static final BitSet FOLLOW_logicNot_in_factor2399 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_set_in_factor2402 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicNot_in_factor2410 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2419 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2438 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_instanceOf2441 = new BitSet(new long[]{0x0010000000000400L,0x0400000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2459 = new BitSet(new long[]{0x0010000000000400L,0x017E000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2467 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2475 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2482 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_incrementDecrement2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_arrayAccess2523 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2526 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2530 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_arrayAccess2537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_fluentObject2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_fluentObject2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_fluentObject2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_varAccess2571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_varAccess2574 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_varAccess2576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticAccess_in_varAccess2583 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_varAccess2585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_varAccess2590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess2607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccess2612 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_126_in_staticAccess2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2629 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_newOrClone2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_newOrClone2636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2647 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2654 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2656 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2658 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_newObject2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2672 = new BitSet(new long[]{0x0C90100000040400L,0x0402502000120800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2679 = new BitSet(new long[]{0x0C90100000040400L,0x0402502000120800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atomOrCall2696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_atomOrCall2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrCall2706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_functionCall2718 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2720 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2725 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_functionCall2728 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionCall2730 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2732 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2734 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2736 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_arrayAccessCall_in_functionCall2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_methodCall2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2755 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_staticAccess_in_methodCall2760 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2763 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2765 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2769 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2772 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2774 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2776 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2780 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_arrayAccessCall_in_methodCall2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccessCall2799 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_arrayAccessCall2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccessCall2803 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_arrayAccessCall2807 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_arrayAccessCall2808 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_arrayAccessCall2810 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_arrayAccessCall2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_arrayAccessCall2814 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2826 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_atom2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_atom2845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2857 = new BitSet(new long[]{0x0090100000040000L,0x0000100000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2864 = new BitSet(new long[]{0x0090100000040000L,0x0000100000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3374 = new BitSet(new long[]{0x0C90100000842500L,0x0402502400B22851L});
	public static final BitSet FOLLOW_array_content_in_array3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3385 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3387 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_array_content_in_array3389 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3405 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3407 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_array_content3411 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3415 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_array_content3418 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3420 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_array_content3424 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3436 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3438 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_ifCondition3440 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3442 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3444 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3451 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3469 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3471 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3473 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3475 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3477 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3488 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3491 = new BitSet(new long[]{0x0230624250180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3496 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3498 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3502 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3505 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3515 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3518 = new BitSet(new long[]{0x0230624250180400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3524 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3526 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3549 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_caseLabel3551 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3562 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3573 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3575 = new BitSet(new long[]{0x0010000000000400L,0x05FE004000800040L});
	public static final BitSet FOLLOW_forInit_in_forLoop3577 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3580 = new BitSet(new long[]{0x0C90100000842500L,0x0402506000B22851L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3582 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3586 = new BitSet(new long[]{0x0000000000000000L,0x0400000200800040L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3591 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3602 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3604 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3608 = new BitSet(new long[]{0x0000000000000000L,0x0400000000800040L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3610 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3620 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3623 = new BitSet(new long[]{0x0000000000000000L,0x0400000000800040L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3625 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3636 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3638 = new BitSet(new long[]{0x0800000000000000L,0x0402000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3641 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3643 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3646 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3648 = new BitSet(new long[]{0x0000000000000020L,0x0000000200000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3651 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3657 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3668 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3670 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_whileLoop3672 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3674 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3686 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3688 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3690 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3692 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3694 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3696 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3705 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3707 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3709 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3712 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3714 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3716 = new BitSet(new long[]{0x0010000000000400L,0x0040000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3718 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3722 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3723 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3725 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02180900040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_newObject_in_throwException3739 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred103_TSPHP2112 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred103_TSPHP2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred104_TSPHP2130 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred104_TSPHP2132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred105_TSPHP2148 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_assignment_in_synpred105_TSPHP2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred106_TSPHP2164 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_ternary_in_synpred106_TSPHP2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred134_TSPHP2459 = new BitSet(new long[]{0x0010000000000400L,0x017E000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_synpred134_TSPHP2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_synpred134_TSPHP2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred134_TSPHP2467 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred134_TSPHP2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_synpred140_TSPHP2523 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred140_TSPHP2526 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_synpred140_TSPHP2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred140_TSPHP2530 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_arrayAccessCall_in_synpred159_TSPHP2740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccessCall_in_synpred164_TSPHP2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred167_TSPHP2799 = new BitSet(new long[]{0x0C90100000842500L,0x0402502000B22851L});
	public static final BitSet FOLLOW_expression_in_synpred167_TSPHP2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred167_TSPHP2803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_synpred167_TSPHP2807 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_synpred167_TSPHP2808 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred167_TSPHP2810 = new BitSet(new long[]{0x0C90100000842500L,0x0402502200B22851L});
	public static final BitSet FOLLOW_expressionList_in_synpred167_TSPHP2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred167_TSPHP2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred182_TSPHP3405 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred182_TSPHP3407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred183_TSPHP3418 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred183_TSPHP3420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred185_TSPHP3451 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred185_TSPHP3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred193_TSPHP3488 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3491 = new BitSet(new long[]{0x0230624250180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred193_TSPHP3496 = new BitSet(new long[]{0x0230624210080400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3498 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_caseLabel_in_synpred193_TSPHP3502 = new BitSet(new long[]{0x0230624210180400L,0x15FFE02080900040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred193_TSPHP3505 = new BitSet(new long[]{0x0230624210180402L,0x15FFE02080900040L});
}
