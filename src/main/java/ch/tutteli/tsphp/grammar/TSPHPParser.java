// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 17:51:45

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace", "'instanceof'"
	};

	public static final int EOF=-1;
	public static final int T__120=120;
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
	public static final int Plus=84;
	public static final int PlusEqual=85;
	public static final int PlusPlus=86;
	public static final int Private=87;
	public static final int Protected=88;
	public static final int Public=89;
	public static final int QuestionMark=90;
	public static final int Return=91;
	public static final int RightCurlyBrace=92;
	public static final int RightParanthesis=93;
	public static final int RightSquareBrace=94;
	public static final int STRING_DOUBLE_QUOTED=95;
	public static final int STRING_SINGLE_QUOTED=96;
	public static final int Semicolon=97;
	public static final int ShiftLeft=98;
	public static final int ShiftLeftEqual=99;
	public static final int ShiftRight=100;
	public static final int ShiftRightEqual=101;
	public static final int Static=102;
	public static final int String=103;
	public static final int Switch=104;
	public static final int Throw=105;
	public static final int Try=106;
	public static final int TypeArray=107;
	public static final int TypeBool=108;
	public static final int TypeBoolean=109;
	public static final int TypeFloat=110;
	public static final int TypeInt=111;
	public static final int TypeObject=112;
	public static final int TypeResource=113;
	public static final int TypeString=114;
	public static final int Use=115;
	public static final int VariableId=116;
	public static final int Void=117;
	public static final int While=118;
	public static final int Whitespace=119;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog857);
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

					match(input,EOF,FOLLOW_EOF_in_prog860); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog865);
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

					match(input,EOF,FOLLOW_EOF_in_prog868); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:170:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog873);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog875); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:173:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon888); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon890);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon892); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:33: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon894);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket907); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket909);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket912); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:34: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket914);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket917); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId983); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId986); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId988); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1001);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement1012);
					useDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement1017);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1022);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final void useDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList1034); if (state.failed) return ;
			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1036);
			useDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:26: ',' useDeclaration
					{
					match(input,Comma,FOLLOW_Comma_in_useDeclarationList1039); if (state.failed) return ;
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1041);
					useDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop10;
				}
			} while (true);

			match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1045); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:1: useDeclaration : ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )? ;
	public final void useDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:2: ( ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) ) ( 'as' Identifier )?
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: ( ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* ) | ( '\\\\' Identifier ( '\\\\' Identifier )* ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:6: ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:6: ( Identifier '\\\\' Identifier ( '\\\\' Identifier )* )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:7: Identifier '\\\\' Identifier ( '\\\\' Identifier )*
					{
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1058); if (state.failed) return ;
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1060); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1062); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:34: ( '\\\\' Identifier )*
					loop11:
					do {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==Backslash) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:35: '\\\\' Identifier
							{
							match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1065); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1067); if (state.failed) return ;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:6: ( '\\\\' Identifier ( '\\\\' Identifier )* )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:6: ( '\\\\' Identifier ( '\\\\' Identifier )* )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:7: '\\\\' Identifier ( '\\\\' Identifier )*
					{
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1078); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1080); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:23: ( '\\\\' Identifier )*
					loop12:
					do {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==Backslash) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:24: '\\\\' Identifier
							{
							match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1083); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1085); if (state.failed) return ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:3: ( 'as' Identifier )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==As) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: 'as' Identifier
					{
					match(input,As,FOLLOW_As_in_useDeclaration1099); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1101); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constantDeclaration );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constantDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition1114);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition1119);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition1124);
					functionDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_definition1129);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: ( 'abstract' | 'final' )?
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

			match(input,Class,FOLLOW_Class_in_classDeclaration1151); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1153); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:45: ( extendsDeclaration )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Extends) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1155);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:65: ( implementsDeclaration )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Implements) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1158);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1161); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:92: ( classBody )+
			int cnt19=0;
			loop19:
			do {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Abstract||LA19_0==Const||LA19_0==Final||LA19_0==Function||(LA19_0 >= Private && LA19_0 <= Public)||LA19_0==Static) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1163);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1166); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1180); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1182);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1191); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:15: ( ',' Identifier )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1194); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1196); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1207); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1209);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: classBody : ( constantDeclaration | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( constantDeclaration | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_classBody1219);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1224);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1230);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:1: constantDeclaration : 'const' primitiveTypes constDeclarationList ';' ;
	public final void constantDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:20: ( 'const' primitiveTypes constDeclarationList ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:22: 'const' primitiveTypes constDeclarationList ';'
			{
			match(input,Const,FOLLOW_Const_in_constantDeclaration1239); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constantDeclaration1241);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constDeclarationList_in_constantDeclaration1243);
			constDeclarationList();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_constantDeclaration1245); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:1: constDeclarationList : constantAssignment ( ',' constantAssignment )* ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:2: ( constantAssignment ( ',' constantAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:5: constantAssignment ( ',' constantAssignment )*
			{
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1255);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:24: ( ',' constantAssignment )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:25: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1258); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1260);
					constantAssignment();
					state._fsp--;
					if (state.failed) return ;
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
	// $ANTLR end "constDeclarationList"



	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1270); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1273); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1275);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1284);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:24: ( ',' variableAssignment )*
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Comma) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1287); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1289);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:4: ( 'static' )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Static) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1301); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1304);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1306);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1308); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1315);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1320); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1343);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:24: ( ',' ( variableAssignment | VariableId ) )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Comma) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1346); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1349);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1351); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Abstract) ) {
				alt33=1;
			}
			else if ( (LA33_0==Final||LA33_0==Function||(LA33_0 >= Private && LA33_0 <= Public)||LA33_0==Static) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1366); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:34: ( accessorWithoutPrivate )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= Protected && LA28_0 <= Public)) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1368);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1382); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:15: ( 'final' )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==Final) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1384); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1392); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:14: ( 'static' )?
							int alt30=2;
							int LA30_0 = input.LA(1);
							if ( (LA30_0==Static) ) {
								alt30=1;
							}
							switch (alt30) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1394); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:6: ( accessor )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( ((LA32_0 >= Private && LA32_0 <= Public)) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1408);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1415);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1425); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1427); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:27: ( implementsDeclaration )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Implements) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1429);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1432); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:54: ( interfaceBody )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Const||LA35_0==Function||LA35_0==Public) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1434);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop35;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1437); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:1: interfaceBody : ( constantDeclaration | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:2: ( constantDeclaration | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_interfaceBody1446);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1451);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: ( 'public' )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Public) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1462); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1465);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1467); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1483);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1485); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:40: ( instructionWithoutBreakContinue )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Backslash||LA38_0==Do||LA38_0==Echo||LA38_0==Exit||(LA38_0 >= For && LA38_0 <= Foreach)||(LA38_0 >= Identifier && LA38_0 <= If)||LA38_0==LeftCurlyBrace||LA38_0==MinusMinus||LA38_0==PlusPlus||LA38_0==Return||(LA38_0 >= Switch && LA38_0 <= TypeString)||LA38_0==VariableId||LA38_0==While) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1487);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop38;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1490); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1500); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1502);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1504); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1506); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:41: ( paramList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Backslash||LA39_0==Identifier||(LA39_0 >= TypeArray && LA39_0 <= TypeString)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1508);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1511); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1521);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1525); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final void allTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1532);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:36: classInterfaceTypeInclObject
					{
					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1536);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1577);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1582); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1594);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1599); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final void classInterfaceTypeWithoutObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: ( '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: ( '\\\\' )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==Backslash) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: '\\\\'
					{
					match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1613); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1616);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final void classInterfaceTypeInclObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1629); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: classInterfaceTypeWithoutObject
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1635);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt50=3;
			alt50 = dfa50.predict(input);
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1647);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:29: ( ',' paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1650); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1652);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1659);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:21: ( ',' paramDeclaration )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1662); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1664);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1671);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:21: ( paramDeclaration ',' )*
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Identifier||(LA48_0 >= TypeArray && LA48_0 <= TypeString)) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1674);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1676); if (state.failed) return ;
							}
							break;

						default :
							break loop48;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:45: ( ',' paramDeclarationOptional )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1681); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1683);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1697);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1699); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1709);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1712); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1714);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LeftCurlyBrace) ) {
				alt52=1;
			}
			else if ( (LA52_0==Backslash||LA52_0==Do||LA52_0==Echo||LA52_0==Exit||(LA52_0 >= For && LA52_0 <= Foreach)||(LA52_0 >= Identifier && LA52_0 <= If)||LA52_0==MinusMinus||LA52_0==PlusPlus||LA52_0==Return||(LA52_0 >= Switch && LA52_0 <= TypeString)||LA52_0==VariableId||LA52_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1736); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:8: ( instructionWithoutBreakContinue )+
					int cnt51=0;
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==Backslash||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==LeftCurlyBrace||LA51_0==MinusMinus||LA51_0==PlusPlus||LA51_0==Return||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1738);
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1742); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1747);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1758); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: ( instructionInclBreakContinue )+
					int cnt53=0;
					loop53:
					do {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==Backslash||LA53_0==Break||LA53_0==Continue||LA53_0==Do||LA53_0==Echo||LA53_0==Exit||(LA53_0 >= For && LA53_0 <= Foreach)||(LA53_0 >= Identifier && LA53_0 <= If)||LA53_0==LeftCurlyBrace||LA53_0==MinusMinus||LA53_0==PlusPlus||LA53_0==Return||(LA53_0 >= Switch && LA53_0 <= TypeString)||LA53_0==VariableId||LA53_0==While) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1760);
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1764); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1769);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:25: ( Int )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==Int) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1780); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1783); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt57=15;
			alt57 = dfa57.predict(input);
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1795);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1797); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1802);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1804); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1809);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1814);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1819);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1824);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1829);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1834);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction1839);
					tryCatch();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: throwException
					{
					pushFollow(FOLLOW_throwException_in_instruction1844);
					throwException();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_instruction1849);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1851); if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: methodCall ';'
					{
					pushFollow(FOLLOW_methodCall_in_instruction1856);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1858); if (state.failed) return ;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1863); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:13: ( expression )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==At||LA56_0==BitwiseNot||LA56_0==Bool||LA56_0==Clone||LA56_0==Float||LA56_0==Identifier||LA56_0==Int||(LA56_0 >= LeftParanthesis && LA56_0 <= LeftSquareBrace)||LA56_0==LogicNot||LA56_0==Minus||LA56_0==MinusMinus||LA56_0==NULL||LA56_0==New||LA56_0==Null||LA56_0==Plus||LA56_0==PlusPlus||LA56_0==String||LA56_0==TypeArray||LA56_0==VariableId) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1865);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1868); if (state.failed) return ;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1873); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1875);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1877); if (state.failed) return ;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1882); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1884); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1896);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:15: ( ',' expression )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==Comma) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1899); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1901);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1912); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1914);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1916);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1921);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1926);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement2004); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement2026); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2038);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2040); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:24: ( '=' expression )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Assign) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration2043); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration2045);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression2057);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2066);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:17: ( 'or' logicXorWeak )*
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2069); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2071);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2084);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:17: ( 'xor' logicAndWeak )*
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2087); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2089);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak2102);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:15: ( 'and' assignment )*
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2105); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak2107);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment2118);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:12: ( assignmentOperator ternary )*
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2121);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment2123);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: ternary : logicOr ( '?' expression ':' expression )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:9: ( logicOr ( '?' expression ':' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:11: logicOr ( '?' expression ':' expression )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary2133);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:19: ( '?' expression ':' expression )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==QuestionMark) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:20: '?' expression ':' expression
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2136); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2138);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary2140); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2142);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr2152);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:20: ( '||' logicAnd )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2155); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr2157);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2166);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:21: ( '&&' bitwiseOr )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==LogicAnd) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2169); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2171);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2182);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:15: ( '|' bitwiseXor )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseOr) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2185); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2187);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2198);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:15: ( '^' bitwiseAnd )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseXor) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2201); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2203);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd2214);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:13: ( '&' equality )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==BitwiseAnd) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2217); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2219);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2228);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:22: ( equalityOperator comparison )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==Equal||LA71_0==Identical||(LA71_0 >= NotEqual && LA71_0 <= NotIdentical)) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2231);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2233);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2275);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:17: ( comparisonOperator bitwiseShift )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( ((LA72_0 >= GreaterEqualThan && LA72_0 <= GreaterThan)||(LA72_0 >= LessEqualThan && LA72_0 <= LessThan)) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2278);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2280);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2316);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==ShiftLeft||LA73_0==ShiftRight) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2325);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2335);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:36: ( ( '+' | '-' | '.' ) factor )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==Dot||LA74_0==Minus||LA74_0==Plus) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2346);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2356);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==Divide||LA75_0==Modulo||LA75_0==Multiply) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2367);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:1: logicNot : ( '!' logicNot | instanceOf );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:9: ( '!' logicNot | instanceOf )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LogicNot) ) {
				alt76=1;
			}
			else if ( (LA76_0==At||LA76_0==BitwiseNot||LA76_0==Bool||LA76_0==Clone||LA76_0==Float||LA76_0==Identifier||LA76_0==Int||(LA76_0 >= LeftParanthesis && LA76_0 <= LeftSquareBrace)||LA76_0==Minus||LA76_0==MinusMinus||LA76_0==NULL||LA76_0==New||LA76_0==Null||LA76_0==Plus||LA76_0==PlusPlus||LA76_0==String||LA76_0==TypeArray||LA76_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2376); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2378);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: instanceOf
					{
					pushFollow(FOLLOW_instanceOf_in_logicNot2383);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final void instanceOf() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:2: ( castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:4: castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2395);
			castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:25: ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==120) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:26: 'instanceof' ( classInterfaceTypeWithoutObject | VariableId )
					{
					match(input,120,FOLLOW_120_in_instanceOf2398); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:39: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:40: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2401);
							classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:72: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_instanceOf2403); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:1: castOrBitwiseNotOrAt : ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:2: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
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
			case Plus:
			case PlusPlus:
			case String:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2416); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:10: primitiveTypesInclArray
							{
							pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2419);
							primitiveTypesInclArray();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:34: classInterfaceTypeInclObject
							{
							pushFollow(FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2421);
							classInterfaceTypeInclObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2424); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2427);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2432); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2434);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2439); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2441);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2446);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | arrayAccess );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:2: ( postIncrementDecrement | preIncrementDecrement | arrayAccess )
			int alt81=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA81_1 = input.LA(2);
				if ( (LA81_1==MinusMinus||LA81_1==PlusPlus) ) {
					alt81=1;
				}
				else if ( (LA81_1==EOF||LA81_1==Arrow||LA81_1==Assign||(LA81_1 >= BitwiseAnd && LA81_1 <= BitwiseAndEqual)||(LA81_1 >= BitwiseOr && LA81_1 <= BitwiseXorEqual)||(LA81_1 >= Colon && LA81_1 <= Comma)||(LA81_1 >= Divide && LA81_1 <= DivideEqual)||(LA81_1 >= Dot && LA81_1 <= DotEqual)||LA81_1==Equal||(LA81_1 >= GreaterEqualThan && LA81_1 <= GreaterThan)||LA81_1==Identical||(LA81_1 >= LeftSquareBrace && LA81_1 <= LogicAndWeak)||(LA81_1 >= LogicOr && LA81_1 <= MinusEqual)||(LA81_1 >= Modulo && LA81_1 <= MultiplyEqual)||(LA81_1 >= NotEqual && LA81_1 <= NotIdentical)||(LA81_1 >= ObjectOperator && LA81_1 <= PlusEqual)||LA81_1==QuestionMark||(LA81_1 >= RightParanthesis && LA81_1 <= RightSquareBrace)||(LA81_1 >= Semicolon && LA81_1 <= ShiftRightEqual)||LA81_1==120) ) {
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
			case Plus:
			case String:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2458);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2463);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: arrayAccess
					{
					pushFollow(FOLLOW_arrayAccess_in_incrementDecrement2468);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:1: arrayAccess : ( fluentObject ( '[' expression ']' )+ | newOrClone );
	public final void arrayAccess() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:2: ( fluentObject ( '[' expression ']' )+ | newOrClone )
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
			case VariableId:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: fluentObject ( '[' expression ']' )+
					{
					pushFollow(FOLLOW_fluentObject_in_arrayAccess2480);
					fluentObject();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:17: ( '[' expression ']' )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:18: '[' expression ']'
							{
							match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2483); if (state.failed) return ;
							pushFollow(FOLLOW_expression_in_arrayAccess2485);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2487); if (state.failed) return ;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: newOrClone
					{
					pushFollow(FOLLOW_newOrClone_in_arrayAccess2494);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:1: fluentObject : ( functionCall | methodCall | VariableId );
	public final void fluentObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:2: ( functionCall | methodCall | VariableId )
			int alt84=3;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==Identifier) ) {
				alt84=1;
			}
			else if ( (LA84_0==VariableId) ) {
				int LA84_2 = input.LA(2);
				if ( (LA84_2==ObjectOperator) ) {
					alt84=2;
				}
				else if ( (LA84_2==LeftSquareBrace) ) {
					alt84=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_fluentObject2506);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_fluentObject2511);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:486:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_fluentObject2516); if (state.failed) return ;
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



	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:1: newOrClone : ( newObject | 'clone' VariableId | unaryAtom );
	public final void newOrClone() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:2: ( newObject | 'clone' VariableId | unaryAtom )
			int alt85=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt85=1;
				}
				break;
			case Clone:
				{
				alt85=2;
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
				alt85=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: newObject
					{
					pushFollow(FOLLOW_newObject_in_newOrClone2527);
					newObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: 'clone' VariableId
					{
					match(input,Clone,FOLLOW_Clone_in_newOrClone2532); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_newOrClone2534); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_newOrClone2539);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final void newObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt87=2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: 'new' classInterfaceTypeWithoutObject
					{
					match(input,New,FOLLOW_New_in_newObject2550); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2552);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					match(input,New,FOLLOW_New_in_newObject2557); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2559);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2561); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:46: ( expressionList )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==At||LA86_0==BitwiseNot||LA86_0==Bool||LA86_0==Clone||LA86_0==Float||LA86_0==Identifier||LA86_0==Int||(LA86_0 >= LeftParanthesis && LA86_0 <= LeftSquareBrace)||LA86_0==LogicNot||LA86_0==Minus||LA86_0==MinusMinus||LA86_0==NULL||LA86_0==New||LA86_0==Null||LA86_0==Plus||LA86_0==PlusPlus||LA86_0==String||LA86_0==TypeArray||LA86_0==VariableId) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2563);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2566); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:1: unaryAtom : ( '+' atomOrCall | '-' atomOrCall | atomOrCall );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:2: ( '+' atomOrCall | '-' atomOrCall | atomOrCall )
			int alt88=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt88=1;
				}
				break;
			case Minus:
				{
				alt88=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:4: '+' atomOrCall
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2575); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2577);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: '-' atomOrCall
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2582); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2584);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: atomOrCall
					{
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2589);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:504:1: atomOrCall : ( functionCall | methodCall | atom );
	public final void atomOrCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:2: ( functionCall | methodCall | atom )
			int alt89=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA89_1 = input.LA(2);
				if ( (LA89_1==Backslash||LA89_1==LeftParanthesis) ) {
					alt89=1;
				}
				else if ( (LA89_1==EOF||LA89_1==Arrow||LA89_1==Assign||(LA89_1 >= BitwiseAnd && LA89_1 <= BitwiseAndEqual)||(LA89_1 >= BitwiseOr && LA89_1 <= BitwiseXorEqual)||(LA89_1 >= Colon && LA89_1 <= Comma)||(LA89_1 >= Divide && LA89_1 <= DivideEqual)||(LA89_1 >= Dot && LA89_1 <= DotEqual)||LA89_1==Equal||(LA89_1 >= GreaterEqualThan && LA89_1 <= GreaterThan)||LA89_1==Identical||(LA89_1 >= LessEqualThan && LA89_1 <= LogicAndWeak)||(LA89_1 >= LogicOr && LA89_1 <= MinusEqual)||(LA89_1 >= Modulo && LA89_1 <= MultiplyEqual)||(LA89_1 >= NotEqual && LA89_1 <= NotIdentical)||(LA89_1 >= Plus && LA89_1 <= PlusEqual)||LA89_1==QuestionMark||(LA89_1 >= RightParanthesis && LA89_1 <= RightSquareBrace)||(LA89_1 >= Semicolon && LA89_1 <= ShiftRightEqual)||LA89_1==120) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA89_2 = input.LA(2);
				if ( (LA89_2==ObjectOperator) ) {
					alt89=2;
				}
				else if ( (LA89_2==EOF||LA89_2==Arrow||LA89_2==Assign||(LA89_2 >= BitwiseAnd && LA89_2 <= BitwiseAndEqual)||(LA89_2 >= BitwiseOr && LA89_2 <= BitwiseXorEqual)||(LA89_2 >= Colon && LA89_2 <= Comma)||(LA89_2 >= Divide && LA89_2 <= DivideEqual)||(LA89_2 >= Dot && LA89_2 <= DotEqual)||LA89_2==Equal||(LA89_2 >= GreaterEqualThan && LA89_2 <= GreaterThan)||LA89_2==Identical||(LA89_2 >= LessEqualThan && LA89_2 <= LogicAndWeak)||(LA89_2 >= LogicOr && LA89_2 <= MinusEqual)||(LA89_2 >= Modulo && LA89_2 <= MultiplyEqual)||(LA89_2 >= NotEqual && LA89_2 <= NotIdentical)||(LA89_2 >= Plus && LA89_2 <= PlusEqual)||LA89_2==QuestionMark||(LA89_2 >= RightParanthesis && LA89_2 <= RightSquareBrace)||(LA89_2 >= Semicolon && LA89_2 <= ShiftRightEqual)||LA89_2==120) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
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
				alt89=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atomOrCall2599);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_atomOrCall2604);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: atom
					{
					pushFollow(FOLLOW_atom_in_atomOrCall2609);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:1: functionCall : namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? ;
	public final void functionCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:2: ( namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:4: namespaceId '(' ( expressionList )? ')' ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )?
			{
			pushFollow(FOLLOW_namespaceId_in_functionCall2621);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2623); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:20: ( expressionList )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==At||LA90_0==BitwiseNot||LA90_0==Bool||LA90_0==Clone||LA90_0==Float||LA90_0==Identifier||LA90_0==Int||(LA90_0 >= LeftParanthesis && LA90_0 <= LeftSquareBrace)||LA90_0==LogicNot||LA90_0==Minus||LA90_0==MinusMinus||LA90_0==NULL||LA90_0==New||LA90_0==Null||LA90_0==Plus||LA90_0==PlusPlus||LA90_0==String||LA90_0==TypeArray||LA90_0==VariableId) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:20: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2625);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2628); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:40: ( '->' Identifier '(' ( expressionList )? ')' )*
			loop92:
			do {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==ObjectOperator) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:41: '->' Identifier '(' ( expressionList )? ')'
					{
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_functionCall2631); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_functionCall2633); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2635); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:61: ( expressionList )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==At||LA91_0==BitwiseNot||LA91_0==Bool||LA91_0==Clone||LA91_0==Float||LA91_0==Identifier||LA91_0==Int||(LA91_0 >= LeftParanthesis && LA91_0 <= LeftSquareBrace)||LA91_0==LogicNot||LA91_0==Minus||LA91_0==MinusMinus||LA91_0==NULL||LA91_0==New||LA91_0==Null||LA91_0==Plus||LA91_0==PlusPlus||LA91_0==String||LA91_0==TypeArray||LA91_0==VariableId) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:61: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_functionCall2637);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2639); if (state.failed) return ;
					}
					break;

				default :
					break loop92;
				}
			} while (true);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:82: ( arrayAccessCall )?
			int alt93=2;
			switch ( input.LA(1) ) {
				case LeftSquareBrace:
					{
					int LA93_1 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Semicolon:
					{
					int LA93_2 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Comma:
					{
					int LA93_3 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case RightParanthesis:
					{
					int LA93_4 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case EOF:
					{
					int LA93_5 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case 120:
					{
					int LA93_6 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Divide:
				case Modulo:
				case Multiply:
					{
					int LA93_7 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Dot:
				case Minus:
				case Plus:
					{
					int LA93_8 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case ShiftLeft:
				case ShiftRight:
					{
					int LA93_9 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case GreaterEqualThan:
				case GreaterThan:
				case LessEqualThan:
				case LessThan:
					{
					int LA93_10 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Equal:
				case Identical:
				case NotEqual:
				case NotEqualAlternative:
				case NotIdentical:
					{
					int LA93_11 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case BitwiseAnd:
					{
					int LA93_12 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case BitwiseXor:
					{
					int LA93_13 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case BitwiseOr:
					{
					int LA93_14 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case LogicAnd:
					{
					int LA93_15 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case LogicOr:
					{
					int LA93_16 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case QuestionMark:
					{
					int LA93_17 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Assign:
				case BitwiseAndEqual:
				case BitwiseOrEqual:
				case BitwiseXorEqual:
				case DivideEqual:
				case DotEqual:
				case MinusEqual:
				case ModuloEqual:
				case MultiplyEqual:
				case PlusEqual:
				case ShiftLeftEqual:
				case ShiftRightEqual:
					{
					int LA93_18 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case LogicAndWeak:
					{
					int LA93_19 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case LogicXorWeak:
					{
					int LA93_20 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case LogicOrWeak:
					{
					int LA93_21 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Colon:
					{
					int LA93_22 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case RightSquareBrace:
					{
					int LA93_23 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
				case Arrow:
					{
					int LA93_24 = input.LA(2);
					if ( (synpred154_TSPHP()) ) {
						alt93=1;
					}
					}
					break;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:82: arrayAccessCall
					{
					pushFollow(FOLLOW_arrayAccessCall_in_functionCall2643);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:1: methodCall : VariableId ( '->' Identifier '(' ( expressionList )? ')' )+ ( arrayAccessCall )? ;
	public final void methodCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:2: ( VariableId ( '->' Identifier '(' ( expressionList )? ')' )+ ( arrayAccessCall )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:4: VariableId ( '->' Identifier '(' ( expressionList )? ')' )+ ( arrayAccessCall )?
			{
			match(input,VariableId,FOLLOW_VariableId_in_methodCall2653); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:15: ( '->' Identifier '(' ( expressionList )? ')' )+
			int cnt95=0;
			loop95:
			do {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==ObjectOperator) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:16: '->' Identifier '(' ( expressionList )? ')'
					{
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2656); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_methodCall2658); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2660); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:36: ( expressionList )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==At||LA94_0==BitwiseNot||LA94_0==Bool||LA94_0==Clone||LA94_0==Float||LA94_0==Identifier||LA94_0==Int||(LA94_0 >= LeftParanthesis && LA94_0 <= LeftSquareBrace)||LA94_0==LogicNot||LA94_0==Minus||LA94_0==MinusMinus||LA94_0==NULL||LA94_0==New||LA94_0==Null||LA94_0==Plus||LA94_0==PlusPlus||LA94_0==String||LA94_0==TypeArray||LA94_0==VariableId) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:36: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_methodCall2662);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2664); if (state.failed) return ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:57: ( arrayAccessCall )?
			int alt96=2;
			switch ( input.LA(1) ) {
				case LeftSquareBrace:
					{
					int LA96_1 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Semicolon:
					{
					int LA96_2 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Comma:
					{
					int LA96_3 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case RightParanthesis:
					{
					int LA96_4 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case EOF:
					{
					int LA96_5 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case 120:
					{
					int LA96_6 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Divide:
				case Modulo:
				case Multiply:
					{
					int LA96_7 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Dot:
				case Minus:
				case Plus:
					{
					int LA96_8 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case ShiftLeft:
				case ShiftRight:
					{
					int LA96_9 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case GreaterEqualThan:
				case GreaterThan:
				case LessEqualThan:
				case LessThan:
					{
					int LA96_10 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Equal:
				case Identical:
				case NotEqual:
				case NotEqualAlternative:
				case NotIdentical:
					{
					int LA96_11 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case BitwiseAnd:
					{
					int LA96_12 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case BitwiseXor:
					{
					int LA96_13 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case BitwiseOr:
					{
					int LA96_14 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case LogicAnd:
					{
					int LA96_15 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case LogicOr:
					{
					int LA96_16 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case QuestionMark:
					{
					int LA96_17 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Assign:
				case BitwiseAndEqual:
				case BitwiseOrEqual:
				case BitwiseXorEqual:
				case DivideEqual:
				case DotEqual:
				case MinusEqual:
				case ModuloEqual:
				case MultiplyEqual:
				case PlusEqual:
				case ShiftLeftEqual:
				case ShiftRightEqual:
					{
					int LA96_18 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case LogicAndWeak:
					{
					int LA96_19 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case LogicXorWeak:
					{
					int LA96_20 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case LogicOrWeak:
					{
					int LA96_21 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Colon:
					{
					int LA96_22 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case RightSquareBrace:
					{
					int LA96_23 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
				case Arrow:
					{
					int LA96_24 = input.LA(2);
					if ( (synpred157_TSPHP()) ) {
						alt96=1;
					}
					}
					break;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:57: arrayAccessCall
					{
					pushFollow(FOLLOW_arrayAccessCall_in_methodCall2668);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:1: arrayAccessCall : ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )* ;
	public final void arrayAccessCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:2: ( ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )*
			loop99:
			do {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==LeftSquareBrace) ) {
					int LA99_2 = input.LA(2);
					if ( (synpred160_TSPHP()) ) {
						alt99=1;
					}

				}

				switch (alt99) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:6: ( '[' expression ']' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:7: '[' expression ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccessCall2683); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_arrayAccessCall2685);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccessCall2687); if (state.failed) return ;
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:27: ( '->' Identifier '(' ( expressionList )? ')' )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==ObjectOperator) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:28: '->' Identifier '(' ( expressionList )? ')'
							{
							match(input,ObjectOperator,FOLLOW_ObjectOperator_in_arrayAccessCall2691); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_arrayAccessCall2692); if (state.failed) return ;
							match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_arrayAccessCall2694); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:47: ( expressionList )?
							int alt97=2;
							int LA97_0 = input.LA(1);
							if ( (LA97_0==At||LA97_0==BitwiseNot||LA97_0==Bool||LA97_0==Clone||LA97_0==Float||LA97_0==Identifier||LA97_0==Int||(LA97_0 >= LeftParanthesis && LA97_0 <= LeftSquareBrace)||LA97_0==LogicNot||LA97_0==Minus||LA97_0==MinusMinus||LA97_0==NULL||LA97_0==New||LA97_0==Null||LA97_0==Plus||LA97_0==PlusPlus||LA97_0==String||LA97_0==TypeArray||LA97_0==VariableId) ) {
								alt97=1;
							}
							switch (alt97) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:47: expressionList
									{
									pushFollow(FOLLOW_expressionList_in_arrayAccessCall2696);
									expressionList();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

							}

							match(input,RightParanthesis,FOLLOW_RightParanthesis_in_arrayAccessCall2698); if (state.failed) return ;
							}
							break;

					}

					}
					break;

				default :
					break loop99;
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
	// $ANTLR end "arrayAccessCall"



	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: atom : ( '(' expression ')' | primitiveAtom | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:6: ( '(' expression ')' | primitiveAtom | array | VariableId )
			int alt100=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt100=1;
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
				alt100=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt100=3;
				}
				break;
			case VariableId:
				{
				alt100=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2710); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2712);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2714); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2719);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: array
					{
					pushFollow(FOLLOW_array_in_atom2724);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2729); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt101=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt101=1;
				}
				break;
			case Minus:
				{
				alt101=2;
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
				alt101=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2743); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2745);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:529:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2750); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2752);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2757);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL | Identifier );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:2: ( Bool | Int | Float | String | Null | NULL | Identifier )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LeftSquareBrace) ) {
				alt104=1;
			}
			else if ( (LA104_0==TypeArray) ) {
				alt104=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3260); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:13: ( array_content )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==At||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==NULL||LA102_0==New||LA102_0==Null||LA102_0==Plus||LA102_0==PlusPlus||LA102_0==String||LA102_0==TypeArray||LA102_0==VariableId) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3262);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3265); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array3271); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3273); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:18: ( array_content )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==At||LA103_0==BitwiseNot||LA103_0==Bool||LA103_0==Clone||LA103_0==Float||LA103_0==Identifier||LA103_0==Int||(LA103_0 >= LeftParanthesis && LA103_0 <= LeftSquareBrace)||LA103_0==LogicNot||LA103_0==Minus||LA103_0==MinusMinus||LA103_0==NULL||LA103_0==New||LA103_0==Null||LA103_0==Plus||LA103_0==PlusPlus||LA103_0==String||LA103_0==TypeArray||LA103_0==VariableId) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3275);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3278); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:601:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: ( expression '=>' )?
			int alt105=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA105_1 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA105_2 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA105_3 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case At:
					{
					int LA105_4 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case VariableId:
					{
					int LA105_5 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA105_6 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Identifier:
					{
					int LA105_7 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case New:
					{
					int LA105_8 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Clone:
					{
					int LA105_9 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Plus:
					{
					int LA105_10 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Minus:
					{
					int LA105_11 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
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
					int LA105_12 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA105_13 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA105_14 = input.LA(2);
					if ( (synpred175_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3291);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content3293); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3297);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:35: ( ',' ( expression '=>' )? expression )*
			loop107:
			do {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==Comma) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content3301); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:40: ( expression '=>' )?
					int alt106=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA106_1 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA106_2 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA106_3 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case At:
							{
							int LA106_4 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case VariableId:
							{
							int LA106_5 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA106_6 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Identifier:
							{
							int LA106_7 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case New:
							{
							int LA106_8 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Clone:
							{
							int LA106_9 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Plus:
							{
							int LA106_10 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Minus:
							{
							int LA106_11 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
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
							int LA106_12 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA106_13 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA106_14 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3304);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content3306); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3310);
					expression();
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
	// $ANTLR end "array_content"



	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:606:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:606:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition3322); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3324); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition3326);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3328); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3330);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:3: ( 'else' instructionInclBreakContinue )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==Else) ) {
				int LA108_1 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
					alt108=1;
				}
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition3337); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3339);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:611:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3355); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3357); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3359); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3361); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3363); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==Case) ) {
				int LA121_1 = input.LA(2);
				if ( (synpred186_TSPHP()) ) {
					alt121=1;
				}
				else if ( (true) ) {
					alt121=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}
			switch (alt121) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt111=0;
					loop111:
					do {
						int alt111=2;
						int LA111_0 = input.LA(1);
						if ( (LA111_0==Case) ) {
							alt111=1;
						}

						switch (alt111) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: ( caseLabel )+
							int cnt109=0;
							loop109:
							do {
								int alt109=2;
								int LA109_0 = input.LA(1);
								if ( (LA109_0==Case) ) {
									alt109=1;
								}

								switch (alt109) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3374);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt109 >= 1 ) break loop109;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(109, input);
										throw eee;
								}
								cnt109++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:16: ( instructionInclBreakContinue )+
							int cnt110=0;
							loop110:
							do {
								int alt110=2;
								int LA110_0 = input.LA(1);
								if ( (LA110_0==Backslash||LA110_0==Break||LA110_0==Continue||LA110_0==Do||LA110_0==Echo||LA110_0==Exit||(LA110_0 >= For && LA110_0 <= Foreach)||(LA110_0 >= Identifier && LA110_0 <= If)||LA110_0==LeftCurlyBrace||LA110_0==MinusMinus||LA110_0==PlusPlus||LA110_0==Return||(LA110_0 >= Switch && LA110_0 <= TypeString)||LA110_0==VariableId||LA110_0==While) ) {
									alt110=1;
								}

								switch (alt110) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3377);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt110 >= 1 ) break loop110;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(110, input);
										throw eee;
								}
								cnt110++;
							} while (true);

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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3382);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:61: ( instructionInclBreakContinue )+
					int cnt112=0;
					loop112:
					do {
						int alt112=2;
						int LA112_0 = input.LA(1);
						if ( (LA112_0==Backslash||LA112_0==Break||LA112_0==Continue||LA112_0==Do||LA112_0==Echo||LA112_0==Exit||(LA112_0 >= For && LA112_0 <= Foreach)||(LA112_0 >= Identifier && LA112_0 <= If)||LA112_0==LeftCurlyBrace||LA112_0==MinusMinus||LA112_0==PlusPlus||LA112_0==Return||(LA112_0 >= Switch && LA112_0 <= TypeString)||LA112_0==VariableId||LA112_0==While) ) {
							alt112=1;
						}

						switch (alt112) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3384);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt112 >= 1 ) break loop112;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(112, input);
								throw eee;
						}
						cnt112++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: ( caseLabel )+
							int cnt113=0;
							loop113:
							do {
								int alt113=2;
								int LA113_0 = input.LA(1);
								if ( (LA113_0==Case) ) {
									alt113=1;
								}

								switch (alt113) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3388);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt113 >= 1 ) break loop113;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(113, input);
										throw eee;
								}
								cnt113++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:103: ( instructionInclBreakContinue )+
							int cnt114=0;
							loop114:
							do {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==Backslash||LA114_0==Break||LA114_0==Continue||LA114_0==Do||LA114_0==Echo||LA114_0==Exit||(LA114_0 >= For && LA114_0 <= Foreach)||(LA114_0 >= Identifier && LA114_0 <= If)||LA114_0==LeftCurlyBrace||LA114_0==MinusMinus||LA114_0==PlusPlus||LA114_0==Return||(LA114_0 >= Switch && LA114_0 <= TypeString)||LA114_0==VariableId||LA114_0==While) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3391);
									instructionInclBreakContinue();
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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3401);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:17: ( instructionInclBreakContinue )+
							int cnt117=0;
							loop117:
							do {
								int alt117=2;
								int LA117_0 = input.LA(1);
								if ( (LA117_0==Backslash||LA117_0==Break||LA117_0==Continue||LA117_0==Do||LA117_0==Echo||LA117_0==Exit||(LA117_0 >= For && LA117_0 <= Foreach)||(LA117_0 >= Identifier && LA117_0 <= If)||LA117_0==LeftCurlyBrace||LA117_0==MinusMinus||LA117_0==PlusPlus||LA117_0==Return||(LA117_0 >= Switch && LA117_0 <= TypeString)||LA117_0==VariableId||LA117_0==While) ) {
									alt117=1;
								}

								switch (alt117) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3404);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==Default) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3410);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:63: ( instructionInclBreakContinue )+
							int cnt119=0;
							loop119:
							do {
								int alt119=2;
								int LA119_0 = input.LA(1);
								if ( (LA119_0==Backslash||LA119_0==Break||LA119_0==Continue||LA119_0==Do||LA119_0==Echo||LA119_0==Exit||(LA119_0 >= For && LA119_0 <= Foreach)||(LA119_0 >= Identifier && LA119_0 <= If)||LA119_0==LeftCurlyBrace||LA119_0==MinusMinus||LA119_0==PlusPlus||LA119_0==Return||(LA119_0 >= Switch && LA119_0 <= TypeString)||LA119_0==VariableId||LA119_0==While) ) {
									alt119=1;
								}

								switch (alt119) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3412);
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

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3423); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:621:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:621:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3435); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3437);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3439); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3448); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3450); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3459); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3461); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:21: ( forInit )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==Backslash||LA122_0==Identifier||LA122_0==MinusMinus||LA122_0==PlusPlus||(LA122_0 >= TypeArray && LA122_0 <= TypeString)||LA122_0==VariableId) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3463);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3466); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:34: ( expressionList )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==At||LA123_0==BitwiseNot||LA123_0==Bool||LA123_0==Clone||LA123_0==Float||LA123_0==Identifier||LA123_0==Int||(LA123_0 >= LeftParanthesis && LA123_0 <= LeftSquareBrace)||LA123_0==LogicNot||LA123_0==Minus||LA123_0==MinusMinus||LA123_0==NULL||LA123_0==New||LA123_0==Null||LA123_0==Plus||LA123_0==PlusPlus||LA123_0==String||LA123_0==TypeArray||LA123_0==VariableId) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3468);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3472); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:55: ( forUpdate )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==MinusMinus||LA124_0==PlusPlus||LA124_0==VariableId) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3474);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3477); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3479);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:11: ( variableDeclaration | variableAssignment )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==Backslash||LA125_0==Identifier||(LA125_0 >= TypeArray && LA125_0 <= TypeString)) ) {
				alt125=1;
			}
			else if ( (LA125_0==MinusMinus||LA125_0==PlusPlus||LA125_0==VariableId) ) {
				alt125=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3488);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3490);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:52: ( ',' variableAssignment )*
			loop126:
			do {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==Comma) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3494); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3496);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop126;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3506);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:23: ( ',' variableAssignment )*
			loop127:
			do {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==Comma) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3509); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3511);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop127;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:632:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3522); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3524); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:18: ( VariableId | array )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==VariableId) ) {
				alt128=1;
			}
			else if ( (LA128_0==LeftSquareBrace||LA128_0==TypeArray) ) {
				alt128=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3527); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3529);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3532); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3534); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:53: ( '=>' VariableId )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==Arrow) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3537); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3539); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3543); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3545);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:635:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3554); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3556); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3558);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3560); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3562);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:638:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3572); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3574);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3576); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3578); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3580);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3582); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3584); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3591); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3593); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:21: ( instructionInclBreakContinue )+
			int cnt130=0;
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==Backslash||LA130_0==Break||LA130_0==Continue||LA130_0==Do||LA130_0==Echo||LA130_0==Exit||(LA130_0 >= For && LA130_0 <= Foreach)||(LA130_0 >= Identifier && LA130_0 <= If)||LA130_0==LeftCurlyBrace||LA130_0==MinusMinus||LA130_0==PlusPlus||LA130_0==Return||(LA130_0 >= Switch && LA130_0 <= TypeString)||LA130_0==VariableId||LA130_0==While) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3595);
					instructionInclBreakContinue();
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3598); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3600); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3602); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3604);
			classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3606); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3608); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3609); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:114: ( instructionInclBreakContinue )*
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Backslash||LA131_0==Break||LA131_0==Continue||LA131_0==Do||LA131_0==Echo||LA131_0==Exit||(LA131_0 >= For && LA131_0 <= Foreach)||(LA131_0 >= Identifier && LA131_0 <= If)||LA131_0==LeftCurlyBrace||LA131_0==MinusMinus||LA131_0==PlusPlus||LA131_0==Return||(LA131_0 >= Switch && LA131_0 <= TypeString)||LA131_0==VariableId||LA131_0==While) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3611);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop131;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3614); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:643:1: throwException : 'throw' newObject ';' ;
	public final void throwException() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:4: 'throw' newObject ';'
			{
			match(input,Throw,FOLLOW_Throw_in_throwException3623); if (state.failed) return ;
			pushFollow(FOLLOW_newObject_in_throwException3625);
			newObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_throwException3627); if (state.failed) return ;
			}

		}
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
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred103_TSPHP2069); if (state.failed) return ;
		pushFollow(FOLLOW_logicXorWeak_in_synpred103_TSPHP2071);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred104_TSPHP2087); if (state.failed) return ;
		pushFollow(FOLLOW_logicAndWeak_in_synpred104_TSPHP2089);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred105_TSPHP
	public final void synpred105_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred105_TSPHP2105); if (state.failed) return ;
		pushFollow(FOLLOW_assignment_in_synpred105_TSPHP2107);
		assignment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred105_TSPHP

	// $ANTLR start synpred106_TSPHP
	public final void synpred106_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred106_TSPHP2121);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;
		pushFollow(FOLLOW_ternary_in_synpred106_TSPHP2123);
		ternary();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred106_TSPHP

	// $ANTLR start synpred134_TSPHP
	public final void synpred134_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
		{
		match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred134_TSPHP2416); if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
		int alt145=2;
		int LA145_0 = input.LA(1);
		if ( ((LA145_0 >= TypeArray && LA145_0 <= TypeInt)||LA145_0==TypeString) ) {
			alt145=1;
		}
		else if ( (LA145_0==Backslash||LA145_0==Identifier||LA145_0==TypeObject) ) {
			alt145=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 145, 0, input);
			throw nvae;
		}
		switch (alt145) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:10: primitiveTypesInclArray
				{
				pushFollow(FOLLOW_primitiveTypesInclArray_in_synpred134_TSPHP2419);
				primitiveTypesInclArray();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:34: classInterfaceTypeInclObject
				{
				pushFollow(FOLLOW_classInterfaceTypeInclObject_in_synpred134_TSPHP2421);
				classInterfaceTypeInclObject();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

		}

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred134_TSPHP2424); if (state.failed) return ;
		}

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred134_TSPHP2427);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred134_TSPHP

	// $ANTLR start synpred140_TSPHP
	public final void synpred140_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: ( fluentObject ( '[' expression ']' )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: fluentObject ( '[' expression ']' )+
		{
		pushFollow(FOLLOW_fluentObject_in_synpred140_TSPHP2480);
		fluentObject();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:17: ( '[' expression ']' )+
		int cnt146=0;
		loop146:
		do {
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LeftSquareBrace) ) {
				alt146=1;
			}

			switch (alt146) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:18: '[' expression ']'
				{
				match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred140_TSPHP2483); if (state.failed) return ;
				pushFollow(FOLLOW_expression_in_synpred140_TSPHP2485);
				expression();
				state._fsp--;
				if (state.failed) return ;
				match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred140_TSPHP2487); if (state.failed) return ;
				}
				break;

			default :
				if ( cnt146 >= 1 ) break loop146;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(146, input);
					throw eee;
			}
			cnt146++;
		} while (true);

		}

	}
	// $ANTLR end synpred140_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:82: ( arrayAccessCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:82: arrayAccessCall
		{
		pushFollow(FOLLOW_arrayAccessCall_in_synpred154_TSPHP2643);
		arrayAccessCall();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred157_TSPHP
	public final void synpred157_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:57: ( arrayAccessCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:57: arrayAccessCall
		{
		pushFollow(FOLLOW_arrayAccessCall_in_synpred157_TSPHP2668);
		arrayAccessCall();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred157_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:6: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:6: ( '[' expression ']' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:7: '[' expression ']'
		{
		match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred160_TSPHP2683); if (state.failed) return ;
		pushFollow(FOLLOW_expression_in_synpred160_TSPHP2685);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred160_TSPHP2687); if (state.failed) return ;
		}

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:27: ( '->' Identifier '(' ( expressionList )? ')' )?
		int alt151=2;
		int LA151_0 = input.LA(1);
		if ( (LA151_0==ObjectOperator) ) {
			alt151=1;
		}
		switch (alt151) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:28: '->' Identifier '(' ( expressionList )? ')'
				{
				match(input,ObjectOperator,FOLLOW_ObjectOperator_in_synpred160_TSPHP2691); if (state.failed) return ;
				match(input,Identifier,FOLLOW_Identifier_in_synpred160_TSPHP2692); if (state.failed) return ;
				match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred160_TSPHP2694); if (state.failed) return ;
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:47: ( expressionList )?
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==At||LA150_0==BitwiseNot||LA150_0==Bool||LA150_0==Clone||LA150_0==Float||LA150_0==Identifier||LA150_0==Int||(LA150_0 >= LeftParanthesis && LA150_0 <= LeftSquareBrace)||LA150_0==LogicNot||LA150_0==Minus||LA150_0==MinusMinus||LA150_0==NULL||LA150_0==New||LA150_0==Null||LA150_0==Plus||LA150_0==PlusPlus||LA150_0==String||LA150_0==TypeArray||LA150_0==VariableId) ) {
					alt150=1;
				}
				switch (alt150) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:47: expressionList
						{
						pushFollow(FOLLOW_expressionList_in_synpred160_TSPHP2696);
						expressionList();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred160_TSPHP2698); if (state.failed) return ;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred175_TSPHP
	public final void synpred175_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred175_TSPHP3291);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred175_TSPHP3293); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred175_TSPHP

	// $ANTLR start synpred176_TSPHP
	public final void synpred176_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred176_TSPHP3304);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred176_TSPHP3306); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred176_TSPHP

	// $ANTLR start synpred178_TSPHP
	public final void synpred178_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred178_TSPHP3337); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred178_TSPHP3339);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred178_TSPHP

	// $ANTLR start synpred186_TSPHP
	public final void synpred186_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt160=0;
		loop160:
		do {
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==Case) ) {
				alt160=1;
			}

			switch (alt160) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: ( caseLabel )+
				int cnt158=0;
				loop158:
				do {
					int alt158=2;
					int LA158_0 = input.LA(1);
					if ( (LA158_0==Case) ) {
						alt158=1;
					}

					switch (alt158) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred186_TSPHP3374);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt158 >= 1 ) break loop158;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(158, input);
							throw eee;
					}
					cnt158++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:16: ( instructionInclBreakContinue )+
				int cnt159=0;
				loop159:
				do {
					int alt159=2;
					int LA159_0 = input.LA(1);
					if ( (LA159_0==Backslash||LA159_0==Break||LA159_0==Continue||LA159_0==Do||LA159_0==Echo||LA159_0==Exit||(LA159_0 >= For && LA159_0 <= Foreach)||(LA159_0 >= Identifier && LA159_0 <= If)||LA159_0==LeftCurlyBrace||LA159_0==MinusMinus||LA159_0==PlusPlus||LA159_0==Return||(LA159_0 >= Switch && LA159_0 <= TypeString)||LA159_0==VariableId||LA159_0==While) ) {
						alt159=1;
					}

					switch (alt159) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3377);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt159 >= 1 ) break loop159;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(159, input);
							throw eee;
					}
					cnt159++;
				} while (true);

				}
				break;

			default :
				if ( cnt160 >= 1 ) break loop160;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(160, input);
					throw eee;
			}
			cnt160++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred186_TSPHP3382);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:61: ( instructionInclBreakContinue )+
		int cnt161=0;
		loop161:
		do {
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==Backslash||LA161_0==Break||LA161_0==Continue||LA161_0==Do||LA161_0==Echo||LA161_0==Exit||(LA161_0 >= For && LA161_0 <= Foreach)||(LA161_0 >= Identifier && LA161_0 <= If)||LA161_0==LeftCurlyBrace||LA161_0==MinusMinus||LA161_0==PlusPlus||LA161_0==Return||(LA161_0 >= Switch && LA161_0 <= TypeString)||LA161_0==VariableId||LA161_0==While) ) {
				alt161=1;
			}

			switch (alt161) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3384);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt161 >= 1 ) break loop161;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(161, input);
					throw eee;
			}
			cnt161++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: ( caseLabel )+
				int cnt162=0;
				loop162:
				do {
					int alt162=2;
					int LA162_0 = input.LA(1);
					if ( (LA162_0==Case) ) {
						alt162=1;
					}

					switch (alt162) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred186_TSPHP3388);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt162 >= 1 ) break loop162;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(162, input);
							throw eee;
					}
					cnt162++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:103: ( instructionInclBreakContinue )+
				int cnt163=0;
				loop163:
				do {
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==Backslash||LA163_0==Break||LA163_0==Continue||LA163_0==Do||LA163_0==Echo||LA163_0==Exit||(LA163_0 >= For && LA163_0 <= Foreach)||(LA163_0 >= Identifier && LA163_0 <= If)||LA163_0==LeftCurlyBrace||LA163_0==MinusMinus||LA163_0==PlusPlus||LA163_0==Return||(LA163_0 >= Switch && LA163_0 <= TypeString)||LA163_0==VariableId||LA163_0==While) ) {
						alt163=1;
					}

					switch (alt163) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3391);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt163 >= 1 ) break loop163;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(163, input);
							throw eee;
					}
					cnt163++;
				} while (true);

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

		}

	}
	// $ANTLR end synpred186_TSPHP

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
	public final boolean synpred178_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred178_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred160_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred160_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred186_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred157_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred157_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred176_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred176_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred175_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred175_TSPHP_fragment(); // can never throw exception
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
	protected DFA87 dfa87 = new DFA87(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\64\1\uffff\1\12\1\uffff\1\64\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\166\1\71\1\uffff\1\141\1\uffff\1\64\1\uffff\1\141";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\4\uffff\1\2\5\uffff\1\2\4\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\2\uffff\2\2\14\uffff\1\2\5\uffff"+
			"\1\1\11\uffff\1\2\4\uffff\1\2\14\uffff\15\2\1\uffff\1\2",
			"\1\3\4\uffff\1\4",
			"",
			"\1\5\56\uffff\1\4\47\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\56\uffff\1\4\47\uffff\1\6"
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
			return "168:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA50_eotS =
		"\27\uffff";
	static final String DFA50_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA50_minS =
		"\1\12\4\164\1\64\1\12\1\7\1\64\1\uffff\1\12\2\uffff\1\12\4\164\1\64\1"+
		"\12\1\7\1\64\1\12";
	static final String DFA50_maxS =
		"\1\162\4\164\1\64\1\164\1\162\1\64\1\uffff\1\162\2\uffff\5\164\1\64\1"+
		"\164\1\135\1\64\1\164";
	static final String DFA50_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA50_specialS =
		"\27\uffff}>";
	static final String[] DFA50_transitionS = {
			"\1\5\51\uffff\1\6\66\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\151\uffff\1\7",
			"\1\11\2\uffff\1\14\16\uffff\1\12\32\uffff\1\14\50\uffff\1\13\15\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\51\uffff\1\23\66\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\151\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\151\uffff\1\24",
			"\1\14\21\uffff\1\13\103\uffff\1\13",
			"\1\26",
			"\1\25\151\uffff\1\24"
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
			return "322:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA57_eotS =
		"\24\uffff";
	static final String DFA57_eofS =
		"\24\uffff";
	static final String DFA57_minS =
		"\1\12\1\7\2\uffff\1\12\14\uffff\1\64\1\uffff\1\12";
	static final String DFA57_maxS =
		"\1\166\1\145\2\uffff\1\164\14\uffff\1\64\1\uffff\1\164";
	static final String DFA57_acceptS =
		"\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\15\1\16"+
		"\1\17\1\14\1\uffff\1\13\1\uffff";
	static final String DFA57_specialS =
		"\24\uffff}>";
	static final String[] DFA57_transitionS = {
			"\1\3\26\uffff\1\12\4\uffff\1\16\2\uffff\1\17\3\uffff\1\7\1\10\5\uffff"+
			"\1\4\1\5\20\uffff\1\2\17\uffff\1\2\4\uffff\1\15\14\uffff\1\6\1\14\1\13"+
			"\10\3\1\uffff\1\1\1\uffff\1\11",
			"\1\2\4\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\1\2\3\uffff\1\2\40"+
			"\uffff\2\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\20\1\uffff\2\2\14\uffff"+
			"\1\2\1\uffff\1\2",
			"",
			"",
			"\1\21\57\uffff\1\22\71\uffff\1\3",
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
			"\1\21\57\uffff\1\22\71\uffff\1\3"
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
			return "348:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );";
		}
	}

	static final String DFA87_eotS =
		"\10\uffff";
	static final String DFA87_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA87_minS =
		"\1\115\1\12\1\64\1\5\1\64\2\uffff\1\5";
	static final String DFA87_maxS =
		"\1\115\2\64\1\170\1\64\2\uffff\1\170";
	static final String DFA87_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA87_specialS =
		"\10\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\1",
			"\1\2\51\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5\22\uffff\1\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5\22\uffff\1\5"
	};

	static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
	static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
	static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
	static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
	static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
	static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
	static final short[][] DFA87_transition;

	static {
		int numStates = DFA87_transitionS.length;
		DFA87_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
		}
	}

	class DFA87 extends DFA {

		public DFA87(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 87;
			this.eot = DFA87_eot;
			this.eof = DFA87_eof;
			this.min = DFA87_min;
			this.max = DFA87_max;
			this.accept = DFA87_accept;
			this.special = DFA87_special;
			this.transition = DFA87_transition;
		}
		@Override
		public String getDescription() {
			return "495:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_prog860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_prog868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog873 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon888 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon890 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon892 = new BitSet(new long[]{0x0330EA4208400410L,0x005FFF0008400040L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon894 = new BitSet(new long[]{0x0330EA4208400412L,0x005FFF0008400040L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket907 = new BitSet(new long[]{0x0210000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket909 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket912 = new BitSet(new long[]{0x0330EA4208400410L,0x005FFF0008400040L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket914 = new BitSet(new long[]{0x0330EA4208400410L,0x005FFF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId983 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId986 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId988 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1001 = new BitSet(new long[]{0x0330EA4208400412L,0x005FFF0008400040L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1034 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1036 = new BitSet(new long[]{0x0000000002000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1039 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1041 = new BitSet(new long[]{0x0000000002000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1058 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1060 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1062 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1065 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1067 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1078 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1080 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1083 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1085 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_As_in_useDeclaration1099 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_definition1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1151 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1153 = new BitSet(new long[]{0x0240040000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1155 = new BitSet(new long[]{0x0240000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1158 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1161 = new BitSet(new long[]{0x0000880008000010L,0x0000004003800000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1163 = new BitSet(new long[]{0x0000880008000010L,0x0000004013800000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1180 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1191 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1194 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1196 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1207 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_classBody1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constantDeclaration1239 = new BitSet(new long[]{0x0000000000000000L,0x0004F00000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constantDeclaration1241 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_constDeclarationList_in_constantDeclaration1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_constantDeclaration1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1255 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1258 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1260 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1270 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1273 = new BitSet(new long[]{0x0090100000040000L,0x0000008000120810L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1284 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1287 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1289 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000003800000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1304 = new BitSet(new long[]{0x0010000000000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1343 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1346 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1349 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1351 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1366 = new BitSet(new long[]{0x0000800000000000L,0x0000000003000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1368 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1382 = new BitSet(new long[]{0x0000880000000000L,0x0000000003800000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1384 = new BitSet(new long[]{0x0000800000000000L,0x0000000003800000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1392 = new BitSet(new long[]{0x0000800000000000L,0x0000004003800000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1394 = new BitSet(new long[]{0x0000800000000000L,0x0000000003800000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1408 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1425 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1427 = new BitSet(new long[]{0x0240000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1429 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1432 = new BitSet(new long[]{0x0000800008000000L,0x0000000012000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1434 = new BitSet(new long[]{0x0000800008000000L,0x0000000012000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_interfaceBody1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1462 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1483 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1485 = new BitSet(new long[]{0x0230624200000400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1487 = new BitSet(new long[]{0x0230624200000400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1500 = new BitSet(new long[]{0x0010000000000400L,0x0027F80000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1502 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1504 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1506 = new BitSet(new long[]{0x0010000000000400L,0x0007F80020000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1613 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1647 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1650 = new BitSet(new long[]{0x0010000000000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1652 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1659 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1662 = new BitSet(new long[]{0x0010000000000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1664 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1671 = new BitSet(new long[]{0x0010000002000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1674 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1676 = new BitSet(new long[]{0x0010000002000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1681 = new BitSet(new long[]{0x0010000000000400L,0x0007F80000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1683 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1697 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1709 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1712 = new BitSet(new long[]{0x0C90100000040000L,0x0010088000120810L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1736 = new BitSet(new long[]{0x0230624200000400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1738 = new BitSet(new long[]{0x0230624200000400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1758 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1760 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1774 = new BitSet(new long[]{0x0080000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_instruction1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_instruction1856 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1863 = new BitSet(new long[]{0x0C90100000842100L,0x0010088200522851L});
	public static final BitSet FOLLOW_expression_in_instruction1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1873 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expressionList_in_instruction1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1896 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1899 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_expressionList1901 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1912 = new BitSet(new long[]{0x0000001100029080L,0x0000002800200520L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1914 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400040L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2020 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2038 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2040 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2043 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2069 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2087 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2102 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2105 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2107 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2118 = new BitSet(new long[]{0x0000001100029082L,0x0000002800200520L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2121 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_ternary_in_assignment2123 = new BitSet(new long[]{0x0000001100029082L,0x0000002800200520L});
	public static final BitSet FOLLOW_logicOr_in_ternary2133 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2136 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_ternary2138 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2140 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_ternary2142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2155 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2166 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2169 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2171 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2182 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2185 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2187 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2198 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2201 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2203 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2214 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2217 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2219 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2228 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2231 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_comparison_in_equality2233 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2275 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2278 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2280 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2316 = new BitSet(new long[]{0x0000000000000002L,0x0000001400000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2319 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2325 = new BitSet(new long[]{0x0000000000000002L,0x0000001400000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2335 = new BitSet(new long[]{0x0000000800000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2338 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2346 = new BitSet(new long[]{0x0000000800000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_logicNot_in_factor2356 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_set_in_factor2359 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicNot_in_factor2367 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2376 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2395 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_120_in_instanceOf2398 = new BitSet(new long[]{0x0010000000000400L,0x0010000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2416 = new BitSet(new long[]{0x0010000000000400L,0x0005F80000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2424 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2432 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2439 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_incrementDecrement2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_arrayAccess2480 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2483 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2487 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_arrayAccess2494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_fluentObject2506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_fluentObject2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_fluentObject2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2532 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_newOrClone2534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_newOrClone2539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2550 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2557 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2559 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2561 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_newObject2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2575 = new BitSet(new long[]{0x0C90100000040000L,0x0010088000020800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2582 = new BitSet(new long[]{0x0C90100000040000L,0x0010088000020800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atomOrCall2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_atomOrCall2604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrCall2609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_functionCall2621 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2623 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2628 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_functionCall2631 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionCall2633 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2635 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2637 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2639 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_arrayAccessCall_in_functionCall2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_methodCall2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2656 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2658 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2660 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2664 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_arrayAccessCall_in_methodCall2668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccessCall2683 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_arrayAccessCall2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccessCall2687 = new BitSet(new long[]{0x0800000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_arrayAccessCall2691 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_arrayAccessCall2692 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_arrayAccessCall2694 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_arrayAccessCall2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_arrayAccessCall2698 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2710 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_atom2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2743 = new BitSet(new long[]{0x0090100000040000L,0x0000008000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2750 = new BitSet(new long[]{0x0090100000040000L,0x0000008000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3260 = new BitSet(new long[]{0x0C90100000842100L,0x0010088040522851L});
	public static final BitSet FOLLOW_array_content_in_array3262 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3271 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3273 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_array_content_in_array3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3291 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3293 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3297 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3301 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3304 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3306 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3310 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3322 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3324 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_ifCondition3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3328 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3330 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3337 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3355 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3357 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3359 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3361 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3363 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3374 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3377 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3382 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3384 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3388 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3391 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3401 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3404 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3410 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3412 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3435 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_caseLabel3437 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3448 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3459 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3461 = new BitSet(new long[]{0x0010000000000400L,0x0017F80200400040L});
	public static final BitSet FOLLOW_forInit_in_forLoop3463 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3466 = new BitSet(new long[]{0x0C90100000842100L,0x0010088200522851L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3468 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3472 = new BitSet(new long[]{0x0000000000000000L,0x0010000020400040L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3474 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3477 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3488 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3490 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3494 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3496 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3506 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3509 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3511 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3522 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3524 = new BitSet(new long[]{0x0800000000000000L,0x0010080000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3527 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3529 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3532 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3534 = new BitSet(new long[]{0x0000000000000020L,0x0000000020000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3537 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3539 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3543 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3554 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3556 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_whileLoop3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3560 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3572 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3574 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3576 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3578 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3591 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3593 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3595 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3598 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3600 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3602 = new BitSet(new long[]{0x0010000000000400L,0x0001000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3604 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3606 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3608 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3609 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3611 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_newObject_in_throwException3625 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred103_TSPHP2069 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred103_TSPHP2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred104_TSPHP2087 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred104_TSPHP2089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred105_TSPHP2105 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_assignment_in_synpred105_TSPHP2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred106_TSPHP2121 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_ternary_in_synpred106_TSPHP2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred134_TSPHP2416 = new BitSet(new long[]{0x0010000000000400L,0x0005F80000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_synpred134_TSPHP2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_synpred134_TSPHP2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred134_TSPHP2424 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred134_TSPHP2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_synpred140_TSPHP2480 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred140_TSPHP2483 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_synpred140_TSPHP2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred140_TSPHP2487 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_arrayAccessCall_in_synpred154_TSPHP2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccessCall_in_synpred157_TSPHP2668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred160_TSPHP2683 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_synpred160_TSPHP2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred160_TSPHP2687 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_synpred160_TSPHP2691 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_synpred160_TSPHP2692 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred160_TSPHP2694 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_synpred160_TSPHP2696 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred160_TSPHP2698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred175_TSPHP3291 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred175_TSPHP3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred176_TSPHP3304 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred176_TSPHP3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred178_TSPHP3337 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred178_TSPHP3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred186_TSPHP3374 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3377 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred186_TSPHP3382 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3384 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_caseLabel_in_synpred186_TSPHP3388 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3391 = new BitSet(new long[]{0x0230624210180402L,0x0057FF0008400040L});
}
