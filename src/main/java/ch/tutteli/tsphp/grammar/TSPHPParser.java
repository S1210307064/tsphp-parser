// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 13:56:46

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace"
	};

	public static final int EOF=-1;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_instruction1849);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_instruction1854);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1859); if (state.failed) return ;
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
							pushFollow(FOLLOW_expression_in_instruction1861);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1864); if (state.failed) return ;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1869); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1871);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1873); if (state.failed) return ;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1878); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1880); if (state.failed) return ;
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
			pushFollow(FOLLOW_expression_in_expressionList1892);
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
					match(input,Comma,FOLLOW_Comma_in_expressionList1895); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1897);
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
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1908); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1910);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1912);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1917);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1922);
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
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement2000); if (state.failed) return ;
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement2022); if (state.failed) return ;
			}

		}
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
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2034);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2036); if (state.failed) return ;
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
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration2039); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration2041);
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
			pushFollow(FOLLOW_logicOrWeak_in_expression2053);
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
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2062);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:17: ( 'or' logicXorWeak )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicOrWeak) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2065); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2067);
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
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2080);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:17: ( 'xor' logicAndWeak )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicXorWeak) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2083); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2085);
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
			pushFollow(FOLLOW_assignment_in_logicAndWeak2098);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:15: ( 'and' assignment )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==LogicAndWeak) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2101); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak2103);
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
			pushFollow(FOLLOW_ternary_in_assignment2114);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:12: ( assignmentOperator ternary )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==Assign||LA64_0==BitwiseAndEqual||LA64_0==BitwiseOrEqual||LA64_0==BitwiseXorEqual||LA64_0==DivideEqual||LA64_0==DotEqual||LA64_0==MinusEqual||LA64_0==ModuloEqual||LA64_0==MultiplyEqual||LA64_0==PlusEqual||LA64_0==ShiftLeftEqual||LA64_0==ShiftRightEqual) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2117);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment2119);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary2129);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:19: ( '?' expression ':' logicOr )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==QuestionMark) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2132); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2134);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary2136); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary2138);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr2148);
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
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2151); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr2153);
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
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2162);
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
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2165); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2167);
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
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2178);
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
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2181); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2183);
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
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2194);
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
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2197); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2199);
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
			pushFollow(FOLLOW_equality_in_bitwiseAnd2210);
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
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2213); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2215);
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
			pushFollow(FOLLOW_comparison_in_equality2224);
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
					pushFollow(FOLLOW_equalityOperator_in_equality2227);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2229);
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
			pushFollow(FOLLOW_bitwiseShift_in_comparison2271);
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
					pushFollow(FOLLOW_comparisonOperator_in_comparison2274);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2276);
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
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2312);
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2321);
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
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2331);
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2342);
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
			pushFollow(FOLLOW_logicNot_in_factor2352);
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
					pushFollow(FOLLOW_logicNot_in_factor2363);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:9: ( '!' logicNot | castOrBitwiseNotOrAt )
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
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2372); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2374);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot2379);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:2: ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt77=4;
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
					alt77=1;
					}
					break;
				case TypeArray:
					{
					int LA77_6 = input.LA(3);
					if ( (LA77_6==LeftParanthesis) ) {
						alt77=4;
					}
					else if ( (LA77_6==RightParanthesis) ) {
						alt77=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 77, 6, input);
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
				case Clone:
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
					{
					alt77=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt77=2;
				}
				break;
			case At:
				{
				alt77=3;
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
				alt77=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: ( '(' primitiveTypesInclArray ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:5: '(' primitiveTypesInclArray ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2393); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2395);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2397); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2400);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2405); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2407);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2412); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2414);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2419);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | newOrClone );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:2: ( postIncrementDecrement | preIncrementDecrement | newOrClone )
			int alt78=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA78_1 = input.LA(2);
				if ( (LA78_1==MinusMinus||LA78_1==PlusPlus) ) {
					alt78=1;
				}
				else if ( (LA78_1==EOF||LA78_1==Arrow||LA78_1==Assign||(LA78_1 >= BitwiseAnd && LA78_1 <= BitwiseAndEqual)||(LA78_1 >= BitwiseOr && LA78_1 <= BitwiseXorEqual)||(LA78_1 >= Colon && LA78_1 <= Comma)||(LA78_1 >= Divide && LA78_1 <= DivideEqual)||(LA78_1 >= Dot && LA78_1 <= DotEqual)||LA78_1==Equal||(LA78_1 >= GreaterEqualThan && LA78_1 <= GreaterThan)||LA78_1==Identical||(LA78_1 >= LessEqualThan && LA78_1 <= LogicAndWeak)||(LA78_1 >= LogicOr && LA78_1 <= MinusEqual)||(LA78_1 >= Modulo && LA78_1 <= MultiplyEqual)||(LA78_1 >= NotEqual && LA78_1 <= NotIdentical)||(LA78_1 >= ObjectOperator && LA78_1 <= PlusEqual)||LA78_1==QuestionMark||(LA78_1 >= RightParanthesis && LA78_1 <= RightSquareBrace)||(LA78_1 >= Semicolon && LA78_1 <= ShiftRightEqual)) ) {
					alt78=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 1, input);
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
				alt78=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2431);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2436);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: newOrClone
					{
					pushFollow(FOLLOW_newOrClone_in_incrementDecrement2441);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:1: newOrClone : ( newObject | 'clone' VariableId | unaryAtom );
	public final void newOrClone() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:2: ( newObject | 'clone' VariableId | unaryAtom )
			int alt79=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt79=1;
				}
				break;
			case Clone:
				{
				alt79=2;
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
				alt79=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: newObject
					{
					pushFollow(FOLLOW_newObject_in_newOrClone2452);
					newObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: 'clone' VariableId
					{
					match(input,Clone,FOLLOW_Clone_in_newOrClone2457); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_newOrClone2459); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_newOrClone2464);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final void newObject() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt81=2;
			alt81 = dfa81.predict(input);
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:4: 'new' classInterfaceTypeWithoutObject
					{
					match(input,New,FOLLOW_New_in_newObject2475); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2477);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					match(input,New,FOLLOW_New_in_newObject2482); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2484);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2486); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:46: ( expressionList )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==At||LA80_0==BitwiseNot||LA80_0==Bool||LA80_0==Clone||LA80_0==Float||LA80_0==Identifier||LA80_0==Int||(LA80_0 >= LeftParanthesis && LA80_0 <= LeftSquareBrace)||LA80_0==LogicNot||LA80_0==Minus||LA80_0==MinusMinus||LA80_0==NULL||LA80_0==New||LA80_0==Null||LA80_0==Plus||LA80_0==PlusPlus||LA80_0==String||LA80_0==TypeArray||LA80_0==VariableId) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2488);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2491); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:1: unaryAtom : ( '+' atomOrCall | '-' atomOrCall | atomOrCall );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:2: ( '+' atomOrCall | '-' atomOrCall | atomOrCall )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:4: '+' atomOrCall
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2500); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2502);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:4: '-' atomOrCall
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2507); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2509);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: atomOrCall
					{
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2514);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:1: atomOrCall : ( atom | methodCall | functionCall );
	public final void atomOrCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:2: ( atom | methodCall | functionCall )
			int alt83=3;
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
				alt83=1;
				}
				break;
			case VariableId:
				{
				int LA83_2 = input.LA(2);
				if ( (LA83_2==ObjectOperator) ) {
					alt83=2;
				}
				else if ( (LA83_2==EOF||LA83_2==Arrow||LA83_2==Assign||(LA83_2 >= BitwiseAnd && LA83_2 <= BitwiseAndEqual)||(LA83_2 >= BitwiseOr && LA83_2 <= BitwiseXorEqual)||(LA83_2 >= Colon && LA83_2 <= Comma)||(LA83_2 >= Divide && LA83_2 <= DivideEqual)||(LA83_2 >= Dot && LA83_2 <= DotEqual)||LA83_2==Equal||(LA83_2 >= GreaterEqualThan && LA83_2 <= GreaterThan)||LA83_2==Identical||(LA83_2 >= LessEqualThan && LA83_2 <= LogicAndWeak)||(LA83_2 >= LogicOr && LA83_2 <= MinusEqual)||(LA83_2 >= Modulo && LA83_2 <= MultiplyEqual)||(LA83_2 >= NotEqual && LA83_2 <= NotIdentical)||(LA83_2 >= Plus && LA83_2 <= PlusEqual)||LA83_2==QuestionMark||(LA83_2 >= RightParanthesis && LA83_2 <= RightSquareBrace)||(LA83_2 >= Semicolon && LA83_2 <= ShiftRightEqual)) ) {
					alt83=1;
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
			case Identifier:
				{
				alt83=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: atom
					{
					pushFollow(FOLLOW_atom_in_atomOrCall2524);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_atomOrCall2529);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atomOrCall2534);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: functionCall : namespaceId '(' ( expressionList )? ')' ';' ;
	public final void functionCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:2: ( namespaceId '(' ( expressionList )? ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:4: namespaceId '(' ( expressionList )? ')' ';'
			{
			pushFollow(FOLLOW_namespaceId_in_functionCall2546);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2548); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:20: ( expressionList )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==At||LA84_0==BitwiseNot||LA84_0==Bool||LA84_0==Clone||LA84_0==Float||LA84_0==Identifier||LA84_0==Int||(LA84_0 >= LeftParanthesis && LA84_0 <= LeftSquareBrace)||LA84_0==LogicNot||LA84_0==Minus||LA84_0==MinusMinus||LA84_0==NULL||LA84_0==New||LA84_0==Null||LA84_0==Plus||LA84_0==PlusPlus||LA84_0==String||LA84_0==TypeArray||LA84_0==VariableId) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:20: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2550);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2553); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_functionCall2555); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:1: methodCall : VariableId '->' Identifier '(' ( expressionList )? ')' ';' ;
	public final void methodCall() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:2: ( VariableId '->' Identifier '(' ( expressionList )? ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: VariableId '->' Identifier '(' ( expressionList )? ')' ';'
			{
			match(input,VariableId,FOLLOW_VariableId_in_methodCall2564); if (state.failed) return ;
			match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2565); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_methodCall2566); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2568); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:33: ( expressionList )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==At||LA85_0==BitwiseNot||LA85_0==Bool||LA85_0==Clone||LA85_0==Float||LA85_0==Identifier||LA85_0==Int||(LA85_0 >= LeftParanthesis && LA85_0 <= LeftSquareBrace)||LA85_0==LogicNot||LA85_0==Minus||LA85_0==MinusMinus||LA85_0==NULL||LA85_0==New||LA85_0==Null||LA85_0==Plus||LA85_0==PlusPlus||LA85_0==String||LA85_0==TypeArray||LA85_0==VariableId) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:33: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2570);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2572); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_methodCall2574); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:1: atom : ( '(' expression ')' | primitiveAtom | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:6: ( '(' expression ')' | primitiveAtom | array | VariableId )
			int alt86=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt86=1;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt86=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt86=3;
				}
				break;
			case VariableId:
				{
				alt86=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2584); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2586);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2588); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2593);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: array
					{
					pushFollow(FOLLOW_array_in_atom2598);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2603); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt87=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt87=1;
				}
				break;
			case Minus:
				{
				alt87=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2617); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2619);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2624); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2626);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2631);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:2: ( Bool | Int | Float | String | Null | NULL )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LeftSquareBrace) ) {
				alt90=1;
			}
			else if ( (LA90_0==TypeArray) ) {
				alt90=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3129); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:13: ( array_content )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==At||LA88_0==BitwiseNot||LA88_0==Bool||LA88_0==Clone||LA88_0==Float||LA88_0==Identifier||LA88_0==Int||(LA88_0 >= LeftParanthesis && LA88_0 <= LeftSquareBrace)||LA88_0==LogicNot||LA88_0==Minus||LA88_0==MinusMinus||LA88_0==NULL||LA88_0==New||LA88_0==Null||LA88_0==Plus||LA88_0==PlusPlus||LA88_0==String||LA88_0==TypeArray||LA88_0==VariableId) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3131);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3134); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array3140); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3142); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:18: ( array_content )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==At||LA89_0==BitwiseNot||LA89_0==Bool||LA89_0==Clone||LA89_0==Float||LA89_0==Identifier||LA89_0==Int||(LA89_0 >= LeftParanthesis && LA89_0 <= LeftSquareBrace)||LA89_0==LogicNot||LA89_0==Minus||LA89_0==MinusMinus||LA89_0==NULL||LA89_0==New||LA89_0==Null||LA89_0==Plus||LA89_0==PlusPlus||LA89_0==String||LA89_0==TypeArray||LA89_0==VariableId) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3144);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3147); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( expression '=>' )?
			int alt91=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA91_1 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA91_2 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA91_3 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case At:
					{
					int LA91_4 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case VariableId:
					{
					int LA91_5 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA91_6 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case New:
					{
					int LA91_7 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case Clone:
					{
					int LA91_8 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case Plus:
					{
					int LA91_9 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case Minus:
					{
					int LA91_10 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
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
					int LA91_11 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA91_12 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA91_13 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
				case Identifier:
					{
					int LA91_14 = input.LA(2);
					if ( (synpred159_TSPHP()) ) {
						alt91=1;
					}
					}
					break;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3160);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content3162); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3166);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:35: ( ',' ( expression '=>' )? expression )*
			loop93:
			do {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==Comma) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content3170); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:40: ( expression '=>' )?
					int alt92=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA92_1 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA92_2 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA92_3 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case At:
							{
							int LA92_4 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case VariableId:
							{
							int LA92_5 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA92_6 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case New:
							{
							int LA92_7 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case Clone:
							{
							int LA92_8 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case Plus:
							{
							int LA92_9 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case Minus:
							{
							int LA92_10 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
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
							int LA92_11 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA92_12 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA92_13 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
						case Identifier:
							{
							int LA92_14 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt92=1;
							}
							}
							break;
					}
					switch (alt92) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3173);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content3175); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3179);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop93;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:589:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition3191); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3193); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition3195);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3197); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3199);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:3: ( 'else' instructionInclBreakContinue )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==Else) ) {
				int LA94_1 = input.LA(2);
				if ( (synpred162_TSPHP()) ) {
					alt94=1;
				}
			}
			switch (alt94) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition3206); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3208);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3224); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3226); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3228); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3230); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3232); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==Case) ) {
				int LA107_1 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: ( caseLabel )+
							int cnt95=0;
							loop95:
							do {
								int alt95=2;
								int LA95_0 = input.LA(1);
								if ( (LA95_0==Case) ) {
									alt95=1;
								}

								switch (alt95) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3243);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:16: ( instructionInclBreakContinue )+
							int cnt96=0;
							loop96:
							do {
								int alt96=2;
								int LA96_0 = input.LA(1);
								if ( (LA96_0==Backslash||LA96_0==Break||LA96_0==Continue||LA96_0==Do||LA96_0==Echo||LA96_0==Exit||(LA96_0 >= For && LA96_0 <= Foreach)||(LA96_0 >= Identifier && LA96_0 <= If)||LA96_0==LeftCurlyBrace||LA96_0==MinusMinus||LA96_0==PlusPlus||LA96_0==Return||(LA96_0 >= Switch && LA96_0 <= TypeString)||LA96_0==VariableId||LA96_0==While) ) {
									alt96=1;
								}

								switch (alt96) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3246);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
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

						default :
							if ( cnt97 >= 1 ) break loop97;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(97, input);
								throw eee;
						}
						cnt97++;
					} while (true);

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3251);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:61: ( instructionInclBreakContinue )+
					int cnt98=0;
					loop98:
					do {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==Backslash||LA98_0==Break||LA98_0==Continue||LA98_0==Do||LA98_0==Echo||LA98_0==Exit||(LA98_0 >= For && LA98_0 <= Foreach)||(LA98_0 >= Identifier && LA98_0 <= If)||LA98_0==LeftCurlyBrace||LA98_0==MinusMinus||LA98_0==PlusPlus||LA98_0==Return||(LA98_0 >= Switch && LA98_0 <= TypeString)||LA98_0==VariableId||LA98_0==While) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3253);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt101=0;
					loop101:
					do {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==Case) ) {
							alt101=1;
						}

						switch (alt101) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3257);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:103: ( instructionInclBreakContinue )+
							int cnt100=0;
							loop100:
							do {
								int alt100=2;
								int LA100_0 = input.LA(1);
								if ( (LA100_0==Backslash||LA100_0==Break||LA100_0==Continue||LA100_0==Do||LA100_0==Echo||LA100_0==Exit||(LA100_0 >= For && LA100_0 <= Foreach)||(LA100_0 >= Identifier && LA100_0 <= If)||LA100_0==LeftCurlyBrace||LA100_0==MinusMinus||LA100_0==PlusPlus||LA100_0==Return||(LA100_0 >= Switch && LA100_0 <= TypeString)||LA100_0==VariableId||LA100_0==While) ) {
									alt100=1;
								}

								switch (alt100) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3260);
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

						default :
							if ( cnt101 >= 1 ) break loop101;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(101, input);
								throw eee;
						}
						cnt101++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt104=0;
					loop104:
					do {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==Case) ) {
							alt104=1;
						}

						switch (alt104) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:6: ( caseLabel )+
							int cnt102=0;
							loop102:
							do {
								int alt102=2;
								int LA102_0 = input.LA(1);
								if ( (LA102_0==Case) ) {
									alt102=1;
								}

								switch (alt102) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3270);
									caseLabel();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt102 >= 1 ) break loop102;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(102, input);
										throw eee;
								}
								cnt102++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:17: ( instructionInclBreakContinue )+
							int cnt103=0;
							loop103:
							do {
								int alt103=2;
								int LA103_0 = input.LA(1);
								if ( (LA103_0==Backslash||LA103_0==Break||LA103_0==Continue||LA103_0==Do||LA103_0==Echo||LA103_0==Exit||(LA103_0 >= For && LA103_0 <= Foreach)||(LA103_0 >= Identifier && LA103_0 <= If)||LA103_0==LeftCurlyBrace||LA103_0==MinusMinus||LA103_0==PlusPlus||LA103_0==Return||(LA103_0 >= Switch && LA103_0 <= TypeString)||LA103_0==VariableId||LA103_0==While) ) {
									alt103=1;
								}

								switch (alt103) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3273);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt103 >= 1 ) break loop103;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(103, input);
										throw eee;
								}
								cnt103++;
							} while (true);

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==Default) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3279);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:63: ( instructionInclBreakContinue )+
							int cnt105=0;
							loop105:
							do {
								int alt105=2;
								int LA105_0 = input.LA(1);
								if ( (LA105_0==Backslash||LA105_0==Break||LA105_0==Continue||LA105_0==Do||LA105_0==Echo||LA105_0==Exit||(LA105_0 >= For && LA105_0 <= Foreach)||(LA105_0 >= Identifier && LA105_0 <= If)||LA105_0==LeftCurlyBrace||LA105_0==MinusMinus||LA105_0==PlusPlus||LA105_0==Return||(LA105_0 >= Switch && LA105_0 <= TypeString)||LA105_0==VariableId||LA105_0==While) ) {
									alt105=1;
								}

								switch (alt105) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3281);
									instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

								default :
									if ( cnt105 >= 1 ) break loop105;
									if (state.backtracking>0) {state.failed=true; return ;}
										EarlyExitException eee =
											new EarlyExitException(105, input);
										throw eee;
								}
								cnt105++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3292); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3304); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3306);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3308); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3317); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3319); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3328); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3330); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:21: ( forInit )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==Backslash||LA108_0==Identifier||LA108_0==MinusMinus||LA108_0==PlusPlus||(LA108_0 >= TypeArray && LA108_0 <= TypeString)||LA108_0==VariableId) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3332);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3335); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:34: ( expressionList )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==At||LA109_0==BitwiseNot||LA109_0==Bool||LA109_0==Clone||LA109_0==Float||LA109_0==Identifier||LA109_0==Int||(LA109_0 >= LeftParanthesis && LA109_0 <= LeftSquareBrace)||LA109_0==LogicNot||LA109_0==Minus||LA109_0==MinusMinus||LA109_0==NULL||LA109_0==New||LA109_0==Null||LA109_0==Plus||LA109_0==PlusPlus||LA109_0==String||LA109_0==TypeArray||LA109_0==VariableId) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3337);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3341); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:55: ( forUpdate )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==MinusMinus||LA110_0==PlusPlus||LA110_0==VariableId) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3343);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3346); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3348);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:11: ( variableDeclaration | variableAssignment )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==Backslash||LA111_0==Identifier||(LA111_0 >= TypeArray && LA111_0 <= TypeString)) ) {
				alt111=1;
			}
			else if ( (LA111_0==MinusMinus||LA111_0==PlusPlus||LA111_0==VariableId) ) {
				alt111=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3357);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3359);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:52: ( ',' variableAssignment )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Comma) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3363); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3365);
					variableAssignment();
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
	// $ANTLR end "forInit"



	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3375);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:23: ( ',' variableAssignment )*
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==Comma) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3378); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3380);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop113;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3391); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3393); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:18: ( VariableId | array )
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==VariableId) ) {
				alt114=1;
			}
			else if ( (LA114_0==LeftSquareBrace||LA114_0==TypeArray) ) {
				alt114=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}
			switch (alt114) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3396); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3398);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3401); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3403); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:53: ( '=>' VariableId )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==Arrow) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3406); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3408); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3412); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3414);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3423); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3425); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3427);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3429); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3431);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3441); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3443);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3445); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3447); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3449);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3451); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3453); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3460); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3462); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:21: ( instructionInclBreakContinue )+
			int cnt116=0;
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==Backslash||LA116_0==Break||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= For && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==LeftCurlyBrace||LA116_0==MinusMinus||LA116_0==PlusPlus||LA116_0==Return||(LA116_0 >= Switch && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3464);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3467); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3469); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3471); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3473);
			classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3475); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3477); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3478); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:114: ( instructionInclBreakContinue )*
			loop117:
			do {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==Backslash||LA117_0==Break||LA117_0==Continue||LA117_0==Do||LA117_0==Echo||LA117_0==Exit||(LA117_0 >= For && LA117_0 <= Foreach)||(LA117_0 >= Identifier && LA117_0 <= If)||LA117_0==LeftCurlyBrace||LA117_0==MinusMinus||LA117_0==PlusPlus||LA117_0==Return||(LA117_0 >= Switch && LA117_0 <= TypeString)||LA117_0==VariableId||LA117_0==While) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3480);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop117;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3483); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:1: throwException : 'throw' newObject ';' ;
	public final void throwException() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: 'throw' newObject ';'
			{
			match(input,Throw,FOLLOW_Throw_in_throwException3492); if (state.failed) return ;
			pushFollow(FOLLOW_newObject_in_throwException3494);
			newObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_throwException3496); if (state.failed) return ;
			}

		}
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

	// $ANTLR start synpred159_TSPHP
	public final void synpred159_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred159_TSPHP3160);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred159_TSPHP3162); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred159_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred160_TSPHP3173);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred160_TSPHP3175); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred162_TSPHP
	public final void synpred162_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred162_TSPHP3206); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred162_TSPHP3208);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred162_TSPHP

	// $ANTLR start synpred170_TSPHP
	public final void synpred170_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt138=0;
		loop138:
		do {
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==Case) ) {
				alt138=1;
			}

			switch (alt138) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred170_TSPHP3243);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:16: ( instructionInclBreakContinue )+
				int cnt137=0;
				loop137:
				do {
					int alt137=2;
					int LA137_0 = input.LA(1);
					if ( (LA137_0==Backslash||LA137_0==Break||LA137_0==Continue||LA137_0==Do||LA137_0==Echo||LA137_0==Exit||(LA137_0 >= For && LA137_0 <= Foreach)||(LA137_0 >= Identifier && LA137_0 <= If)||LA137_0==LeftCurlyBrace||LA137_0==MinusMinus||LA137_0==PlusPlus||LA137_0==Return||(LA137_0 >= Switch && LA137_0 <= TypeString)||LA137_0==VariableId||LA137_0==While) ) {
						alt137=1;
					}

					switch (alt137) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3246);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt137 >= 1 ) break loop137;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(137, input);
							throw eee;
					}
					cnt137++;
				} while (true);

				}
				break;

			default :
				if ( cnt138 >= 1 ) break loop138;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(138, input);
					throw eee;
			}
			cnt138++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred170_TSPHP3251);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:61: ( instructionInclBreakContinue )+
		int cnt139=0;
		loop139:
		do {
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==Backslash||LA139_0==Break||LA139_0==Continue||LA139_0==Do||LA139_0==Echo||LA139_0==Exit||(LA139_0 >= For && LA139_0 <= Foreach)||(LA139_0 >= Identifier && LA139_0 <= If)||LA139_0==LeftCurlyBrace||LA139_0==MinusMinus||LA139_0==PlusPlus||LA139_0==Return||(LA139_0 >= Switch && LA139_0 <= TypeString)||LA139_0==VariableId||LA139_0==While) ) {
				alt139=1;
			}

			switch (alt139) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3253);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt139 >= 1 ) break loop139;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(139, input);
					throw eee;
			}
			cnt139++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt142=0;
		loop142:
		do {
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==Case) ) {
				alt142=1;
			}

			switch (alt142) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: ( caseLabel )+
				int cnt140=0;
				loop140:
				do {
					int alt140=2;
					int LA140_0 = input.LA(1);
					if ( (LA140_0==Case) ) {
						alt140=1;
					}

					switch (alt140) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred170_TSPHP3257);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt140 >= 1 ) break loop140;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(140, input);
							throw eee;
					}
					cnt140++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:103: ( instructionInclBreakContinue )+
				int cnt141=0;
				loop141:
				do {
					int alt141=2;
					int LA141_0 = input.LA(1);
					if ( (LA141_0==Backslash||LA141_0==Break||LA141_0==Continue||LA141_0==Do||LA141_0==Echo||LA141_0==Exit||(LA141_0 >= For && LA141_0 <= Foreach)||(LA141_0 >= Identifier && LA141_0 <= If)||LA141_0==LeftCurlyBrace||LA141_0==MinusMinus||LA141_0==PlusPlus||LA141_0==Return||(LA141_0 >= Switch && LA141_0 <= TypeString)||LA141_0==VariableId||LA141_0==While) ) {
						alt141=1;
					}

					switch (alt141) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3260);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt141 >= 1 ) break loop141;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(141, input);
							throw eee;
					}
					cnt141++;
				} while (true);

				}
				break;

			default :
				if ( cnt142 >= 1 ) break loop142;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(142, input);
					throw eee;
			}
			cnt142++;
		} while (true);

		}

	}
	// $ANTLR end synpred170_TSPHP

	// Delegated rules

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
	public final boolean synpred162_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred162_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred170_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred170_TSPHP_fragment(); // can never throw exception
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


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA50 dfa50 = new DFA50(this);
	protected DFA57 dfa57 = new DFA57(this);
	protected DFA81 dfa81 = new DFA81(this);
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
			return "348:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall | methodCall | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );";
		}
	}

	static final String DFA81_eotS =
		"\10\uffff";
	static final String DFA81_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA81_minS =
		"\1\115\1\12\1\64\1\5\1\64\2\uffff\1\5";
	static final String DFA81_maxS =
		"\1\115\2\64\1\145\1\64\2\uffff\1\145";
	static final String DFA81_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA81_specialS =
		"\10\uffff}>";
	static final String[] DFA81_transitionS = {
			"\1\1",
			"\1\2\51\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\6\uffff\1\6\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\3\uffff\2\5\4\uffff\1\5\2\uffff"+
			"\2\5\2\uffff\5\5"
	};

	static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
	static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
	static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
	static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
	static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
	static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
	static final short[][] DFA81_transition;

	static {
		int numStates = DFA81_transitionS.length;
		DFA81_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
		}
	}

	class DFA81 extends DFA {

		public DFA81(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 81;
			this.eot = DFA81_eot;
			this.eof = DFA81_eof;
			this.min = DFA81_min;
			this.max = DFA81_max;
			this.accept = DFA81_accept;
			this.special = DFA81_special;
			this.transition = DFA81_transition;
		}
		@Override
		public String getDescription() {
			return "483:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
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
	public static final BitSet FOLLOW_Assign_in_constantAssignment1273 = new BitSet(new long[]{0x0080100000040000L,0x0000008000120810L});
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
	public static final BitSet FOLLOW_functionCall_in_instruction1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_instruction1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1859 = new BitSet(new long[]{0x0C90100000842100L,0x0010088200522851L});
	public static final BitSet FOLLOW_expression_in_instruction1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1869 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expressionList_in_instruction1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1892 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1895 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_expressionList1897 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1908 = new BitSet(new long[]{0x0000001100029080L,0x0000002800200520L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1910 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400040L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2016 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2034 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2036 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2039 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2065 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2083 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2098 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2101 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2103 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2114 = new BitSet(new long[]{0x0000001100029082L,0x0000002800200520L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2117 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_ternary_in_assignment2119 = new BitSet(new long[]{0x0000001100029082L,0x0000002800200520L});
	public static final BitSet FOLLOW_logicOr_in_ternary2129 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2132 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_ternary2134 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2136 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicOr_in_ternary2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2151 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2162 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2165 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2167 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2178 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2181 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2183 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2194 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2197 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2199 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2210 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2213 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2215 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2224 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2227 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_comparison_in_equality2229 = new BitSet(new long[]{0x0008010000000002L,0x000000000001C000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2271 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2274 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2276 = new BitSet(new long[]{0x3003000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2312 = new BitSet(new long[]{0x0000000000000002L,0x0000001400000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2315 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2321 = new BitSet(new long[]{0x0000000000000002L,0x0000001400000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2331 = new BitSet(new long[]{0x0000000800000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2334 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2342 = new BitSet(new long[]{0x0000000800000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_logicNot_in_factor2352 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_set_in_factor2355 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicNot_in_factor2363 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2372 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot2379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2393 = new BitSet(new long[]{0x0000000000000000L,0x0004F80000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2395 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2397 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2405 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2412 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522850L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_incrementDecrement2441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2457 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_newOrClone2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_newOrClone2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2475 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2482 = new BitSet(new long[]{0x0010000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2484 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2486 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_newObject2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2500 = new BitSet(new long[]{0x0C90100000040000L,0x0010088000020800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2507 = new BitSet(new long[]{0x0C90100000040000L,0x0010088000020800L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrCall2524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_atomOrCall2529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atomOrCall2534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_functionCall2546 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2548 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_functionCall2555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_methodCall2564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2565 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2566 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2568 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_methodCall2574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2584 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_atom2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2617 = new BitSet(new long[]{0x0080100000040000L,0x0000008000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2624 = new BitSet(new long[]{0x0080100000040000L,0x0000008000020800L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3129 = new BitSet(new long[]{0x0C90100000842100L,0x0010088040522851L});
	public static final BitSet FOLLOW_array_content_in_array3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3140 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3142 = new BitSet(new long[]{0x0C90100000842100L,0x0010088020522851L});
	public static final BitSet FOLLOW_array_content_in_array3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3160 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3162 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3166 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3170 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3173 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3175 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_array_content3179 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3191 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3193 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_ifCondition3195 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3197 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3199 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3206 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3224 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3226 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3230 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3232 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3243 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3246 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3251 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3253 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3257 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3260 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3270 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3273 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3279 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3281 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3304 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_caseLabel3306 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3317 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3328 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3330 = new BitSet(new long[]{0x0010000000000400L,0x0017F80200400040L});
	public static final BitSet FOLLOW_forInit_in_forLoop3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3335 = new BitSet(new long[]{0x0C90100000842100L,0x0010088200522851L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3341 = new BitSet(new long[]{0x0000000000000000L,0x0010000020400040L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3346 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3357 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3359 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3363 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3365 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3375 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3378 = new BitSet(new long[]{0x0000000000000000L,0x0010000000400040L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3380 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3391 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3393 = new BitSet(new long[]{0x0800000000000000L,0x0010080000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3396 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3398 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3401 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3403 = new BitSet(new long[]{0x0000000000000020L,0x0000000020000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3406 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3412 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3423 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3425 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_whileLoop3427 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3429 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3441 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3443 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3445 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3447 = new BitSet(new long[]{0x0C90100000842100L,0x0010088000522851L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3449 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3451 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3460 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3462 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3464 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3467 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3469 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3471 = new BitSet(new long[]{0x0010000000000400L,0x0001000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3473 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3477 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3478 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3480 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0018400040L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_newObject_in_throwException3494 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred159_TSPHP3160 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred159_TSPHP3162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred160_TSPHP3173 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred160_TSPHP3175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred162_TSPHP3206 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred162_TSPHP3208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred170_TSPHP3243 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3246 = new BitSet(new long[]{0x0230624250180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred170_TSPHP3251 = new BitSet(new long[]{0x0230624210080400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3253 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_caseLabel_in_synpred170_TSPHP3257 = new BitSet(new long[]{0x0230624210180400L,0x0057FF0008400040L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP3260 = new BitSet(new long[]{0x0230624210180402L,0x0057FF0008400040L});
}
