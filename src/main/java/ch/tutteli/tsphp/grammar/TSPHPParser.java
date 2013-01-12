// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-12 20:58:29

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace"
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
	public static final int DoubleColon=37;
	public static final int EXPONENT=38;
	public static final int Echo=39;
	public static final int Else=40;
	public static final int Equal=41;
	public static final int Exit=42;
	public static final int Extends=43;
	public static final int Final=44;
	public static final int Float=45;
	public static final int For=46;
	public static final int Foreach=47;
	public static final int Function=48;
	public static final int GreaterEqualThan=49;
	public static final int GreaterThan=50;
	public static final int HEXADECIMAL=51;
	public static final int Identical=52;
	public static final int Identifier=53;
	public static final int If=54;
	public static final int Implements=55;
	public static final int Instanceof=56;
	public static final int Int=57;
	public static final int Interface=58;
	public static final int LeftCurlyBrace=59;
	public static final int LeftParanthesis=60;
	public static final int LeftSquareBrace=61;
	public static final int LessEqualThan=62;
	public static final int LessThan=63;
	public static final int LogicAnd=64;
	public static final int LogicAndWeak=65;
	public static final int LogicNot=66;
	public static final int LogicOr=67;
	public static final int LogicOrWeak=68;
	public static final int LogicXorWeak=69;
	public static final int Minus=70;
	public static final int MinusEqual=71;
	public static final int MinusMinus=72;
	public static final int Modulo=73;
	public static final int ModuloEqual=74;
	public static final int Multiply=75;
	public static final int MultiplyEqual=76;
	public static final int NULL=77;
	public static final int Namespace=78;
	public static final int New=79;
	public static final int NotEqual=80;
	public static final int NotEqualAlternative=81;
	public static final int NotIdentical=82;
	public static final int Null=83;
	public static final int OCTAL=84;
	public static final int ObjectOperator=85;
	public static final int Parent=86;
	public static final int Plus=87;
	public static final int PlusEqual=88;
	public static final int PlusPlus=89;
	public static final int Private=90;
	public static final int ProtectParent=91;
	public static final int ProtectSelf=92;
	public static final int ProtectThis=93;
	public static final int Protected=94;
	public static final int Public=95;
	public static final int QuestionMark=96;
	public static final int Return=97;
	public static final int RightCurlyBrace=98;
	public static final int RightParanthesis=99;
	public static final int RightSquareBrace=100;
	public static final int STRING_DOUBLE_QUOTED=101;
	public static final int STRING_SINGLE_QUOTED=102;
	public static final int Self=103;
	public static final int Semicolon=104;
	public static final int ShiftLeft=105;
	public static final int ShiftLeftEqual=106;
	public static final int ShiftRight=107;
	public static final int ShiftRightEqual=108;
	public static final int Static=109;
	public static final int String=110;
	public static final int Switch=111;
	public static final int This=112;
	public static final int Throw=113;
	public static final int Try=114;
	public static final int TypeArray=115;
	public static final int TypeBool=116;
	public static final int TypeBoolean=117;
	public static final int TypeFloat=118;
	public static final int TypeInt=119;
	public static final int TypeObject=120;
	public static final int TypeResource=121;
	public static final int TypeString=122;
	public static final int Use=123;
	public static final int VariableId=124;
	public static final int Void=125;
	public static final int While=126;
	public static final int Whitespace=127;

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
		this.state.ruleMemo = new HashMap[302+1];
		 

	}

	@Override public String[] getTokenNames() { return TSPHPParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }



	// $ANTLR start "prog"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		int prog_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog930);
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

					match(input,EOF,FOLLOW_EOF_in_prog933); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog938);
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

					match(input,EOF,FOLLOW_EOF_in_prog941); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:179:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog946);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog948); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "prog"



	// $ANTLR start "namespaceSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		int namespaceSemicolon_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon961); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon963);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon965); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:33: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon967);
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
			if ( state.backtracking>0 ) { memoize(input, 2, namespaceSemicolon_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "namespaceSemicolon"



	// $ANTLR start "namespaceBracket"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		int namespaceBracket_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket980); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket982);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket985); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:34: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket987);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket990); if (state.failed) return ;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, namespaceBracket_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "namespaceBracket"



	// $ANTLR start "namespaceId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		int namespaceId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId1056); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId1059); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId1061); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 4, namespaceId_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "namespaceId"



	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		int withoutNamespace_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1074);
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
			if ( state.backtracking>0 ) { memoize(input, 5, withoutNamespace_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "withoutNamespace"



	// $ANTLR start "statement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement1085);
					useDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement1090);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1095);
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
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "statement"



	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final void useDeclarationList() throws RecognitionException {
		int useDeclarationList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList1107); if (state.failed) return ;
			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1109);
			useDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:26: ',' useDeclaration
					{
					match(input,Comma,FOLLOW_Comma_in_useDeclarationList1112); if (state.failed) return ;
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1114);
					useDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop10;
				}
			} while (true);

			match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1118); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, useDeclarationList_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "useDeclarationList"



	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
	public final void useDeclaration() throws RecognitionException {
		int useDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			else if ( (LA11_0==Backslash) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:7: Identifier '\\\\' namespaceId
					{
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1131); if (state.failed) return ;
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1133); if (state.failed) return ;
					pushFollow(FOLLOW_namespaceId_in_useDeclaration1135);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:7: '\\\\' namespaceId
					{
					match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1144); if (state.failed) return ;
					pushFollow(FOLLOW_namespaceId_in_useDeclaration1145);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:4: 'as' Identifier
					{
					match(input,As,FOLLOW_As_in_useDeclaration1157); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1159); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 8, useDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "useDeclaration"



	// $ANTLR start "definition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final void definition() throws RecognitionException {
		int definition_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
			int alt13=4;
			switch ( input.LA(1) ) {
			case Abstract:
			case Class:
			case Final:
				{
				alt13=1;
				}
				break;
			case Interface:
				{
				alt13=2;
				}
				break;
			case Function:
				{
				alt13=3;
				}
				break;
			case Const:
				{
				alt13=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition1172);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition1177);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition1182);
					functionDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition1187);
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
			if ( state.backtracking>0 ) { memoize(input, 9, definition_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "definition"



	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: ( 'abstract' | 'final' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Abstract||LA14_0==Final) ) {
				alt14=1;
			}
			switch (alt14) {
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

			match(input,Class,FOLLOW_Class_in_classDeclaration1209); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1211); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1213);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1216);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1219); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:92: ( classBody )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1221);
					classBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1224); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, classDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		int extendsDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1238); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1240);
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
			if ( state.backtracking>0 ) { memoize(input, 11, extendsDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "extendsDeclaration"



	// $ANTLR start "identifierList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		int identifierList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1249); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1252); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1254); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 12, identifierList_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "identifierList"



	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		int implementsDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1265); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1267);
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
			if ( state.backtracking>0 ) { memoize(input, 13, implementsDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "implementsDeclaration"



	// $ANTLR start "classBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		int classBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
			int alt19=3;
			switch ( input.LA(1) ) {
			case Const:
				{
				alt19=1;
				}
				break;
			case Static:
				{
				switch ( input.LA(2) ) {
				case Protected:
				case Public:
					{
					int LA19_3 = input.LA(3);
					if ( (LA19_3==Backslash||LA19_3==Identifier||(LA19_3 >= TypeArray && LA19_3 <= TypeString)) ) {
						alt19=2;
					}
					else if ( (LA19_3==Function) ) {
						alt19=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 19, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Private:
					{
					int LA19_4 = input.LA(3);
					if ( (LA19_4==Backslash||LA19_4==Identifier||(LA19_4 >= TypeArray && LA19_4 <= TypeString)) ) {
						alt19=2;
					}
					else if ( (LA19_4==Function) ) {
						alt19=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 19, 4, input);
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
					alt19=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
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
				int LA19_3 = input.LA(2);
				if ( (LA19_3==Backslash||LA19_3==Identifier||(LA19_3 >= TypeArray && LA19_3 <= TypeString)) ) {
					alt19=2;
				}
				else if ( (LA19_3==Function) ) {
					alt19=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Private:
				{
				int LA19_4 = input.LA(2);
				if ( (LA19_4==Backslash||LA19_4==Identifier||(LA19_4 >= TypeArray && LA19_4 <= TypeString)) ) {
					alt19=2;
				}
				else if ( (LA19_4==Function) ) {
					alt19=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 4, input);
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
				alt19=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBody1277);
					constDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1282);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1288);
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
			if ( state.backtracking>0 ) { memoize(input, 14, classBody_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "classBody"



	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
	public final void constDeclarationList() throws RecognitionException {
		int constDeclarationList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			match(input,Const,FOLLOW_Const_in_constDeclarationList1300); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1302);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1304);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:48: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1307); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1309);
					constantAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop20;
				}
			} while (true);

			match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1313); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, constDeclarationList_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "constDeclarationList"



	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		int constantAssignment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1323); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1326); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1328);
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
			if ( state.backtracking>0 ) { memoize(input, 16, constantAssignment_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "constantAssignment"



	// $ANTLR start "variableDeclarationListWithoutVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		int variableDeclarationListWithoutVariableId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1337);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:24: ( ',' variableAssignment )*
			loop21:
			do {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==Comma) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1340); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1342);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop21;
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
			if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarationListWithoutVariableId_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "variableDeclarationListWithoutVariableId"



	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		int attributeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: ( 'static' )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Static) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1354); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1357);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1359);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1361); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, attributeDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "attributeDeclaration"



	// $ANTLR start "accessor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		int accessor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:9: ( accessorWithoutPrivate | 'private' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
				alt23=1;
			}
			else if ( (LA23_0==Private) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1368);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1373); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 19, accessor_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "accessor"



	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		int accessorWithoutPrivate_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:2: ( 'protected' | 'public' )
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
			if ( state.backtracking>0 ) { memoize(input, 20, accessorWithoutPrivate_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "accessorWithoutPrivate"



	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1396);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:24: ( ',' ( variableAssignment | VariableId ) )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==Comma) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1399); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:29: ( variableAssignment | VariableId )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==VariableId) ) {
						int LA24_1 = input.LA(2);
						if ( (LA24_1==Assign||LA24_1==BitwiseAndEqual||LA24_1==BitwiseOrEqual||LA24_1==BitwiseXorEqual||LA24_1==DivideEqual||LA24_1==DotEqual||(LA24_1 >= MinusEqual && LA24_1 <= MinusMinus)||LA24_1==ModuloEqual||LA24_1==MultiplyEqual||(LA24_1 >= PlusEqual && LA24_1 <= PlusPlus)||LA24_1==ShiftLeftEqual||LA24_1==ShiftRightEqual) ) {
							alt24=1;
						}
						else if ( (LA24_1==Comma||LA24_1==Semicolon) ) {
							alt24=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 24, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA24_0==MinusMinus||LA24_0==PlusPlus) ) {
						alt24=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1402);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1404); if (state.failed) return ;
							}
							break;

					}

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
			if ( state.backtracking>0 ) { memoize(input, 21, variableDeclarationListInclVariableId_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"



	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		int methodDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Abstract) ) {
				alt31=1;
			}
			else if ( (LA31_0==Final||LA31_0==Function||LA31_0==Private||(LA31_0 >= Protected && LA31_0 <= Public)||LA31_0==Static) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:6: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1421); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:17: ( accessorWithoutPrivate )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( ((LA26_0 >= Protected && LA26_0 <= Public)) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1423);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
					int alt29=3;
					switch ( input.LA(1) ) {
					case Static:
						{
						alt29=1;
						}
						break;
					case Final:
						{
						alt29=2;
						}
						break;
					case Function:
					case Private:
					case Protected:
					case Public:
						{
						alt29=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1437); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:15: ( 'final' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Final) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1439); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1447); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:14: ( 'static' )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==Static) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1449); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:6: ( accessor )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==Private||(LA30_0 >= Protected && LA30_0 <= Public)) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1463);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1470);
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
			if ( state.backtracking>0 ) { memoize(input, 22, methodDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1480); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1482); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:27: ( implementsDeclaration )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Implements) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1484);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1487); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:54: ( interfaceBody )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Const||LA33_0==Function||LA33_0==Public) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1489);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1492); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		int interfaceBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:2: ( constDeclarationList | interfaceMethodDeclaration )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Const) ) {
				alt34=1;
			}
			else if ( (LA34_0==Function||LA34_0==Public) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1501);
					constDeclarationList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1506);
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
			if ( state.backtracking>0 ) { memoize(input, 24, interfaceBody_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "interfaceBody"



	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		int interfaceMethodDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: ( 'public' )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Public) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1517); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1520);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1522); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, interfaceMethodDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "interfaceMethodDeclaration"



	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		int functionDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1538);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1540); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:40: ( instructionWithoutBreakContinue )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Backslash||LA36_0==Do||LA36_0==Echo||LA36_0==Exit||(LA36_0 >= For && LA36_0 <= Foreach)||(LA36_0 >= Identifier && LA36_0 <= If)||LA36_0==LeftCurlyBrace||LA36_0==MinusMinus||LA36_0==Parent||LA36_0==PlusPlus||LA36_0==Return||LA36_0==Self||(LA36_0 >= Switch && LA36_0 <= TypeString)||LA36_0==VariableId||LA36_0==While) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1542);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop36;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1545); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, functionDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "functionDeclaration"



	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		int functionDeclarationWithoutBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1555); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1557);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1559); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1561); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:41: ( paramList )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Backslash||LA37_0==Identifier||(LA37_0 >= TypeArray && LA37_0 <= TypeString)) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1563);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1566); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, functionDeclarationWithoutBody_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "functionDeclarationWithoutBody"



	// $ANTLR start "returnType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		int returnType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:2: ( allTypes | 'void' )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Backslash||LA38_0==Identifier||(LA38_0 >= TypeArray && LA38_0 <= TypeString)) ) {
				alt38=1;
			}
			else if ( (LA38_0==Void) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1576);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1580); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 28, returnType_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "returnType"



	// $ANTLR start "allTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final void allTypes() throws RecognitionException {
		int allTypes_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= TypeArray && LA39_0 <= TypeInt)||(LA39_0 >= TypeResource && LA39_0 <= TypeString)) ) {
				alt39=1;
			}
			else if ( (LA39_0==Backslash||LA39_0==Identifier||LA39_0==TypeObject) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1587);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:36: classInterfaceTypeInclObject
					{
					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1591);
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
			if ( state.backtracking>0 ) { memoize(input, 29, allTypes_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "allTypes"



	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		int primitiveTypes_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
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
			if ( state.backtracking>0 ) { memoize(input, 30, primitiveTypes_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "primitiveTypes"



	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		int primitiveTypesInclArray_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:2: ( primitiveTypes | TypeArray )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= TypeBool && LA40_0 <= TypeInt)||LA40_0==TypeString) ) {
				alt40=1;
			}
			else if ( (LA40_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1632);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1637); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveTypesInclArray_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "primitiveTypesInclArray"



	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		int primitiveTypesExtended_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:2: ( primitiveTypesInclArray | TypeResource )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= TypeArray && LA41_0 <= TypeInt)||LA41_0==TypeString) ) {
				alt41=1;
			}
			else if ( (LA41_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1649);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1654); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 32, primitiveTypesExtended_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "primitiveTypesExtended"



	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:321:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final void classInterfaceTypeWithoutObject() throws RecognitionException {
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: ( '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: ( '\\\\' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Backslash) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: '\\\\'
					{
					match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1668); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1671);
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
			if ( state.backtracking>0 ) { memoize(input, 33, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"



	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final void classInterfaceTypeInclObject() throws RecognitionException {
		int classInterfaceTypeInclObject_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==TypeObject) ) {
				alt43=1;
			}
			else if ( (LA43_0==Backslash||LA43_0==Identifier) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1684); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: classInterfaceTypeWithoutObject
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1690);
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
			if ( state.backtracking>0 ) { memoize(input, 34, classInterfaceTypeInclObject_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "classInterfaceTypeInclObject"



	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		int paramList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt48=3;
			alt48 = dfa48.predict(input);
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1702);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:29: ( ',' paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1705); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1707);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop44;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1714);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:21: ( ',' paramDeclaration )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1717); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1719);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop45;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1726);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:21: ( paramDeclaration ',' )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Backslash||LA46_0==Identifier||(LA46_0 >= TypeArray && LA46_0 <= TypeString)) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1729);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1731); if (state.failed) return ;
							}
							break;

						default :
							break loop46;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:45: ( ',' paramDeclarationOptional )+
					int cnt47=0;
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1736); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1738);
							paramDeclarationOptional();
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
			if ( state.backtracking>0 ) { memoize(input, 35, paramList_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "paramList"



	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		int paramDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1752);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1754); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, paramDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "paramDeclaration"



	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		int paramDeclarationOptional_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1764);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1767); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1769);
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
			if ( state.backtracking>0 ) { memoize(input, 37, paramDeclarationOptional_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "paramDeclarationOptional"



	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		int instructionWithoutBreakContinue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LeftCurlyBrace) ) {
				alt50=1;
			}
			else if ( (LA50_0==Backslash||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==MinusMinus||LA50_0==Parent||LA50_0==PlusPlus||LA50_0==Return||LA50_0==Self||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
				alt50=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1791); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:8: ( instructionWithoutBreakContinue )+
					int cnt49=0;
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==Backslash||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= For && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==LeftCurlyBrace||LA49_0==MinusMinus||LA49_0==Parent||LA49_0==PlusPlus||LA49_0==Return||LA49_0==Self||(LA49_0 >= Switch && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1793);
							instructionWithoutBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1797); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1802);
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
			if ( state.backtracking>0 ) { memoize(input, 38, instructionWithoutBreakContinue_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "instructionWithoutBreakContinue"



	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		int instructionInclBreakContinue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt53=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt53=1;
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
				alt53=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt53=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1813); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:8: ( instructionInclBreakContinue )+
					int cnt51=0;
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==Backslash||LA51_0==Break||LA51_0==Continue||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==LeftCurlyBrace||LA51_0==MinusMinus||LA51_0==Parent||LA51_0==PlusPlus||LA51_0==Return||LA51_0==Self||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1815);
							instructionInclBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1819); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1824);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:25: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1835); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1838); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 39, instructionInclBreakContinue_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "instructionInclBreakContinue"



	// $ANTLR start "instruction"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		int instruction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt55=15;
			alt55 = dfa55.predict(input);
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1850);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1852); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1857);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1859); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1864);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1869);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1874);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1879);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1884);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1889);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction1894);
					tryCatch();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: throwException
					{
					pushFollow(FOLLOW_throwException_in_instruction1899);
					throwException();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_instruction1904);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1906); if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: methodCall ';'
					{
					pushFollow(FOLLOW_methodCall_in_instruction1911);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1913); if (state.failed) return ;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1918); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:13: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==NULL||LA54_0==New||LA54_0==Null||(LA54_0 >= Parent && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==Self||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1920);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1923); if (state.failed) return ;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1928); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1930);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1932); if (state.failed) return ;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1937); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1939); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 40, instruction_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "instruction"



	// $ANTLR start "expressionList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		int expressionList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1951);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:15: ( ',' expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1954); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1956);
					expression();
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
			if ( state.backtracking>0 ) { memoize(input, 41, expressionList_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "expressionList"



	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		int variableAssignment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt57=3;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==VariableId) ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1==MinusMinus||LA57_1==PlusPlus) ) {
					alt57=2;
				}
				else if ( (LA57_1==Assign||LA57_1==BitwiseAndEqual||LA57_1==BitwiseOrEqual||LA57_1==BitwiseXorEqual||LA57_1==DivideEqual||LA57_1==DotEqual||LA57_1==MinusEqual||LA57_1==ModuloEqual||LA57_1==MultiplyEqual||LA57_1==PlusEqual||LA57_1==ShiftLeftEqual||LA57_1==ShiftRightEqual) ) {
					alt57=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA57_0==MinusMinus||LA57_0==PlusPlus) ) {
				alt57=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1967); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1969);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1971);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1976);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1981);
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
			if ( state.backtracking>0 ) { memoize(input, 42, variableAssignment_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "variableAssignment"



	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		int assignmentOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
			if ( state.backtracking>0 ) { memoize(input, 43, assignmentOperator_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "assignmentOperator"



	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		int postIncrementDecrement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement2059); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 44, postIncrementDecrement_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "postIncrementDecrement"



	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		int preIncrementDecrement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement2081); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, preIncrementDecrement_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "preIncrementDecrement"



	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		int variableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2093);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2095); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:24: ( '=' expression )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Assign) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration2098); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration2100);
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
			if ( state.backtracking>0 ) { memoize(input, 46, variableDeclaration_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "variableDeclaration"



	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression2112);
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
			if ( state.backtracking>0 ) { memoize(input, 47, expression_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "expression"



	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		int logicOrWeak_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2121);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:17: ( 'or' logicXorWeak )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==LogicOrWeak) ) {
					int LA59_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2124); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2126);
					logicXorWeak();
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
			if ( state.backtracking>0 ) { memoize(input, 48, logicOrWeak_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicOrWeak"



	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		int logicXorWeak_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2139);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:17: ( 'xor' logicAndWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicXorWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2142); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2144);
					logicAndWeak();
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
			if ( state.backtracking>0 ) { memoize(input, 49, logicXorWeak_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicXorWeak"



	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		int logicAndWeak_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak2157);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:15: ( 'and' assignment )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicAndWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2160); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak2162);
					assignment();
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
			if ( state.backtracking>0 ) { memoize(input, 50, logicAndWeak_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicAndWeak"



	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		int assignment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment2173);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:12: ( assignmentOperator ternary )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Assign||LA62_0==BitwiseAndEqual||LA62_0==BitwiseOrEqual||LA62_0==BitwiseXorEqual||LA62_0==DivideEqual||LA62_0==DotEqual||LA62_0==MinusEqual||LA62_0==ModuloEqual||LA62_0==MultiplyEqual||LA62_0==PlusEqual||LA62_0==ShiftLeftEqual||LA62_0==ShiftRightEqual) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2176);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment2178);
					ternary();
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
			if ( state.backtracking>0 ) { memoize(input, 51, assignment_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:1: ternary : logicOr ( '?' expression ':' expression )? ;
	public final void ternary() throws RecognitionException {
		int ternary_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:9: ( logicOr ( '?' expression ':' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:11: logicOr ( '?' expression ':' expression )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary2188);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:19: ( '?' expression ':' expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==QuestionMark) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:20: '?' expression ':' expression
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2191); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2193);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary2195); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary2197);
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
			if ( state.backtracking>0 ) { memoize(input, 52, ternary_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "ternary"



	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		int logicOr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr2207);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:20: ( '||' logicAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOr) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2210); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr2212);
					logicAnd();
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
			if ( state.backtracking>0 ) { memoize(input, 53, logicOr_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicOr"



	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		int logicAnd_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2221);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:21: ( '&&' bitwiseOr )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2224); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2226);
					bitwiseOr();
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
			if ( state.backtracking>0 ) { memoize(input, 54, logicAnd_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		int bitwiseOr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2237);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:15: ( '|' bitwiseXor )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==BitwiseOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2240); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2242);
					bitwiseXor();
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
			if ( state.backtracking>0 ) { memoize(input, 55, bitwiseOr_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "bitwiseOr"



	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		int bitwiseXor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2253);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:15: ( '^' bitwiseAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseXor) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2256); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2258);
					bitwiseAnd();
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
			if ( state.backtracking>0 ) { memoize(input, 56, bitwiseXor_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "bitwiseXor"



	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		int bitwiseAnd_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd2269);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:13: ( '&' equality )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2272); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2274);
					equality();
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
			if ( state.backtracking>0 ) { memoize(input, 57, bitwiseAnd_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "bitwiseAnd"



	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		int equality_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2283);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:22: ( equalityOperator comparison )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==Equal||LA69_0==Identical||(LA69_0 >= NotEqual && LA69_0 <= NotIdentical)) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2286);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2288);
					comparison();
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
			if ( state.backtracking>0 ) { memoize(input, 58, equality_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "equality"



	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		int equalityOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
			if ( state.backtracking>0 ) { memoize(input, 59, equalityOperator_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "equalityOperator"



	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		int comparison_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2330);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:17: ( comparisonOperator bitwiseShift )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( ((LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||(LA70_0 >= LessEqualThan && LA70_0 <= LessThan)) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2333);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2335);
					bitwiseShift();
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
			if ( state.backtracking>0 ) { memoize(input, 60, comparison_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "comparison"



	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		int comparisonOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:2: ( '<' | '<=' | '>' | '>=' )
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
			if ( state.backtracking>0 ) { memoize(input, 61, comparisonOperator_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "comparisonOperator"



	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		int bitwiseShift_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2371);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ShiftLeft||LA71_0==ShiftRight) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2380);
					termOrStringConcatenation();
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
			if ( state.backtracking>0 ) { memoize(input, 62, bitwiseShift_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "bitwiseShift"



	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		int termOrStringConcatenation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2390);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:36: ( ( '+' | '-' | '.' ) factor )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Dot||LA72_0==Minus||LA72_0==Plus) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2401);
					factor();
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
			if ( state.backtracking>0 ) { memoize(input, 63, termOrStringConcatenation_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "termOrStringConcatenation"



	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		int factor_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2411);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Divide||LA73_0==Modulo||LA73_0==Multiply) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2422);
					logicNot();
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
			if ( state.backtracking>0 ) { memoize(input, 64, factor_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "factor"



	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:1: logicNot : ( '!' logicNot | instanceOf );
	public final void logicNot() throws RecognitionException {
		int logicNot_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:9: ( '!' logicNot | instanceOf )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LogicNot) ) {
				alt74=1;
			}
			else if ( (LA74_0==At||LA74_0==Backslash||LA74_0==BitwiseNot||LA74_0==Bool||LA74_0==Clone||LA74_0==Float||LA74_0==Identifier||LA74_0==Int||(LA74_0 >= LeftParanthesis && LA74_0 <= LeftSquareBrace)||LA74_0==Minus||LA74_0==MinusMinus||LA74_0==NULL||LA74_0==New||LA74_0==Null||(LA74_0 >= Parent && LA74_0 <= Plus)||LA74_0==PlusPlus||LA74_0==Self||LA74_0==String||LA74_0==This||LA74_0==TypeArray||LA74_0==VariableId) ) {
				alt74=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2431); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2433);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:4: instanceOf
					{
					pushFollow(FOLLOW_instanceOf_in_logicNot2438);
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
			if ( state.backtracking>0 ) { memoize(input, 65, logicNot_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "logicNot"



	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final void instanceOf() throws RecognitionException {
		int instanceOf_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:2: ( castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:4: castOrBitwiseNotOrAt ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2450);
			castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:25: ( 'instanceof' ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Instanceof) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:26: 'instanceof' ( classInterfaceTypeWithoutObject | VariableId )
					{
					match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2453); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:39: ( classInterfaceTypeWithoutObject | VariableId )
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==Backslash||LA75_0==Identifier) ) {
						alt75=1;
					}
					else if ( (LA75_0==VariableId) ) {
						alt75=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						NoViableAltException nvae =
							new NoViableAltException("", 75, 0, input);
						throw nvae;
					}
					switch (alt75) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:40: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2456);
							classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:72: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_instanceOf2458); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 66, instanceOf_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "instanceOf"



	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:1: castOrBitwiseNotOrAt : ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:2: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt78=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA78_1 = input.LA(2);
				if ( (synpred132_TSPHP()) ) {
					alt78=1;
				}
				else if ( (true) ) {
					alt78=4;
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
			case BitwiseNot:
				{
				alt78=2;
				}
				break;
			case At:
				{
				alt78=3;
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
				alt78=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2471); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( ((LA77_0 >= TypeArray && LA77_0 <= TypeInt)||LA77_0==TypeString) ) {
						alt77=1;
					}
					else if ( (LA77_0==Backslash||LA77_0==Identifier||LA77_0==TypeObject) ) {
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:10: primitiveTypesInclArray
							{
							pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2474);
							primitiveTypesInclArray();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:34: classInterfaceTypeInclObject
							{
							pushFollow(FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2476);
							classInterfaceTypeInclObject();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2479); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2482);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:475:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2487); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2489);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2494); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2496);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2501);
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
			if ( state.backtracking>0 ) { memoize(input, 67, castOrBitwiseNotOrAt_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"



	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | arrayAccess );
	public final void incrementDecrement() throws RecognitionException {
		int incrementDecrement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:2: ( postIncrementDecrement | preIncrementDecrement | arrayAccess )
			int alt79=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA79_1 = input.LA(2);
				if ( (LA79_1==MinusMinus||LA79_1==PlusPlus) ) {
					alt79=1;
				}
				else if ( (LA79_1==EOF||LA79_1==Arrow||LA79_1==Assign||(LA79_1 >= BitwiseAnd && LA79_1 <= BitwiseAndEqual)||(LA79_1 >= BitwiseOr && LA79_1 <= BitwiseXorEqual)||(LA79_1 >= Colon && LA79_1 <= Comma)||(LA79_1 >= Divide && LA79_1 <= DivideEqual)||(LA79_1 >= Dot && LA79_1 <= DotEqual)||LA79_1==Equal||(LA79_1 >= GreaterEqualThan && LA79_1 <= GreaterThan)||LA79_1==Identical||LA79_1==Instanceof||(LA79_1 >= LeftSquareBrace && LA79_1 <= LogicAndWeak)||(LA79_1 >= LogicOr && LA79_1 <= MinusEqual)||(LA79_1 >= Modulo && LA79_1 <= MultiplyEqual)||(LA79_1 >= NotEqual && LA79_1 <= NotIdentical)||LA79_1==ObjectOperator||(LA79_1 >= Plus && LA79_1 <= PlusEqual)||LA79_1==QuestionMark||(LA79_1 >= RightParanthesis && LA79_1 <= RightSquareBrace)||(LA79_1 >= Semicolon && LA79_1 <= ShiftRightEqual)) ) {
					alt79=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
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
				alt79=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2513);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2518);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: arrayAccess
					{
					pushFollow(FOLLOW_arrayAccess_in_incrementDecrement2523);
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
			if ( state.backtracking>0 ) { memoize(input, 68, incrementDecrement_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "incrementDecrement"



	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:486:1: arrayAccess : ( fluentObject ( '[' expression ']' )+ | newOrClone );
	public final void arrayAccess() throws RecognitionException {
		int arrayAccess_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:2: ( fluentObject ( '[' expression ']' )+ | newOrClone )
			int alt81=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA81_1 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
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
			case Identifier:
				{
				int LA81_2 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA81_3 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Self:
				{
				int LA81_4 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA81_5 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA81_6 = input.LA(2);
				if ( (synpred138_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 6, input);
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
				alt81=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:4: fluentObject ( '[' expression ']' )+
					{
					pushFollow(FOLLOW_fluentObject_in_arrayAccess2535);
					fluentObject();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:17: ( '[' expression ']' )+
					int cnt80=0;
					loop80:
					do {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==LeftSquareBrace) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:18: '[' expression ']'
							{
							match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2538); if (state.failed) return ;
							pushFollow(FOLLOW_expression_in_arrayAccess2540);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2542); if (state.failed) return ;
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

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:4: newOrClone
					{
					pushFollow(FOLLOW_newOrClone_in_arrayAccess2549);
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
			if ( state.backtracking>0 ) { memoize(input, 69, arrayAccess_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "arrayAccess"



	// $ANTLR start "fluentObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:1: fluentObject : ( functionCall | methodCall | varAccess );
	public final void fluentObject() throws RecognitionException {
		int fluentObject_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:2: ( functionCall | methodCall | varAccess )
			int alt82=3;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_fluentObject2561);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_fluentObject2566);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: varAccess
					{
					pushFollow(FOLLOW_varAccess_in_fluentObject2571);
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
			if ( state.backtracking>0 ) { memoize(input, 70, fluentObject_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "fluentObject"



	// $ANTLR start "varAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: varAccess : ( '$this' ( '->' Identifier )* | staticAccess VariableId | VariableId );
	public final void varAccess() throws RecognitionException {
		int varAccess_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:2: ( '$this' ( '->' Identifier )* | staticAccess VariableId | VariableId )
			int alt84=3;
			switch ( input.LA(1) ) {
			case This:
				{
				alt84=1;
				}
				break;
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt84=2;
				}
				break;
			case VariableId:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:4: '$this' ( '->' Identifier )*
					{
					match(input,This,FOLLOW_This_in_varAccess2583); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:12: ( '->' Identifier )*
					loop83:
					do {
						int alt83=2;
						int LA83_0 = input.LA(1);
						if ( (LA83_0==ObjectOperator) ) {
							int LA83_2 = input.LA(2);
							if ( (LA83_2==Identifier) ) {
								int LA83_3 = input.LA(3);
								if ( (LA83_3==EOF||LA83_3==Arrow||LA83_3==Assign||(LA83_3 >= BitwiseAnd && LA83_3 <= BitwiseAndEqual)||(LA83_3 >= BitwiseOr && LA83_3 <= BitwiseXorEqual)||(LA83_3 >= Colon && LA83_3 <= Comma)||(LA83_3 >= Divide && LA83_3 <= DivideEqual)||(LA83_3 >= Dot && LA83_3 <= DotEqual)||LA83_3==Equal||(LA83_3 >= GreaterEqualThan && LA83_3 <= GreaterThan)||LA83_3==Identical||LA83_3==Instanceof||(LA83_3 >= LeftSquareBrace && LA83_3 <= LogicAndWeak)||(LA83_3 >= LogicOr && LA83_3 <= MinusEqual)||(LA83_3 >= Modulo && LA83_3 <= MultiplyEqual)||(LA83_3 >= NotEqual && LA83_3 <= NotIdentical)||LA83_3==ObjectOperator||(LA83_3 >= Plus && LA83_3 <= PlusEqual)||LA83_3==QuestionMark||(LA83_3 >= RightParanthesis && LA83_3 <= RightSquareBrace)||(LA83_3 >= Semicolon && LA83_3 <= ShiftRightEqual)) ) {
									alt83=1;
								}

							}

						}

						switch (alt83) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:13: '->' Identifier
							{
							match(input,ObjectOperator,FOLLOW_ObjectOperator_in_varAccess2586); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_varAccess2588); if (state.failed) return ;
							}
							break;

						default :
							break loop83;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:4: staticAccess VariableId
					{
					pushFollow(FOLLOW_staticAccess_in_varAccess2595);
					staticAccess();
					state._fsp--;
					if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_varAccess2597); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_varAccess2602); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 71, varAccess_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "varAccess"



	// $ANTLR start "staticAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:504:1: staticAccess : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final void staticAccess() throws RecognitionException {
		int staticAccess_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt85=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt85=1;
				}
				break;
			case Parent:
				{
				alt85=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:4: 'self::'
					{
					match(input,Self,FOLLOW_Self_in_staticAccess2614); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:4: 'parent::'
					{
					match(input,Parent,FOLLOW_Parent_in_staticAccess2619); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: classInterfaceTypeWithoutObject '::'
					{
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccess2624);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccess2625); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 72, staticAccess_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "staticAccess"



	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:1: newOrClone : ( newObject | 'clone' VariableId | unaryAtom );
	public final void newOrClone() throws RecognitionException {
		int newOrClone_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:2: ( newObject | 'clone' VariableId | unaryAtom )
			int alt86=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt86=1;
				}
				break;
			case Clone:
				{
				alt86=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:4: newObject
					{
					pushFollow(FOLLOW_newObject_in_newOrClone2636);
					newObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:4: 'clone' VariableId
					{
					match(input,Clone,FOLLOW_Clone_in_newOrClone2641); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_newOrClone2643); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_newOrClone2648);
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
			if ( state.backtracking>0 ) { memoize(input, 73, newOrClone_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "newOrClone"



	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final void newObject() throws RecognitionException {
		int newObject_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt88=2;
			alt88 = dfa88.predict(input);
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: 'new' classInterfaceTypeWithoutObject
					{
					match(input,New,FOLLOW_New_in_newObject2659); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2661);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					match(input,New,FOLLOW_New_in_newObject2666); if (state.failed) return ;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2668);
					classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2670); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:46: ( expressionList )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==At||LA87_0==Backslash||LA87_0==BitwiseNot||LA87_0==Bool||LA87_0==Clone||LA87_0==Float||LA87_0==Identifier||LA87_0==Int||(LA87_0 >= LeftParanthesis && LA87_0 <= LeftSquareBrace)||LA87_0==LogicNot||LA87_0==Minus||LA87_0==MinusMinus||LA87_0==NULL||LA87_0==New||LA87_0==Null||(LA87_0 >= Parent && LA87_0 <= Plus)||LA87_0==PlusPlus||LA87_0==Self||LA87_0==String||LA87_0==This||LA87_0==TypeArray||LA87_0==VariableId) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2672);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2675); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 74, newObject_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "newObject"



	// $ANTLR start "unaryAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: unaryAtom : ( '+' atomOrCall | '-' atomOrCall | atomOrCall );
	public final void unaryAtom() throws RecognitionException {
		int unaryAtom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:2: ( '+' atomOrCall | '-' atomOrCall | atomOrCall )
			int alt89=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt89=1;
				}
				break;
			case Minus:
				{
				alt89=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: '+' atomOrCall
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2684); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2686);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: '-' atomOrCall
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2691); if (state.failed) return ;
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2693);
					atomOrCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: atomOrCall
					{
					pushFollow(FOLLOW_atomOrCall_in_unaryAtom2698);
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
			if ( state.backtracking>0 ) { memoize(input, 75, unaryAtom_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "unaryAtom"



	// $ANTLR start "atomOrCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:1: atomOrCall : ( functionCall | methodCall | atom );
	public final void atomOrCall() throws RecognitionException {
		int atomOrCall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:2: ( functionCall | methodCall | atom )
			int alt90=3;
			alt90 = dfa90.predict(input);
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atomOrCall2708);
					functionCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_atomOrCall2713);
					methodCall();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: atom
					{
					pushFollow(FOLLOW_atom_in_atomOrCall2718);
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
			if ( state.backtracking>0 ) { memoize(input, 76, atomOrCall_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "atomOrCall"



	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:1: functionCall : classInterfaceTypeWithoutObject '(' ( expressionList )? ')' callArrayAccess ;
	public final void functionCall() throws RecognitionException {
		int functionCall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:2: ( classInterfaceTypeWithoutObject '(' ( expressionList )? ')' callArrayAccess )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:4: classInterfaceTypeWithoutObject '(' ( expressionList )? ')' callArrayAccess
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2730);
			classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2732); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:40: ( expressionList )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==At||LA91_0==Backslash||LA91_0==BitwiseNot||LA91_0==Bool||LA91_0==Clone||LA91_0==Float||LA91_0==Identifier||LA91_0==Int||(LA91_0 >= LeftParanthesis && LA91_0 <= LeftSquareBrace)||LA91_0==LogicNot||LA91_0==Minus||LA91_0==MinusMinus||LA91_0==NULL||LA91_0==New||LA91_0==Null||(LA91_0 >= Parent && LA91_0 <= Plus)||LA91_0==PlusPlus||LA91_0==Self||LA91_0==String||LA91_0==This||LA91_0==TypeArray||LA91_0==VariableId) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2734);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2737); if (state.failed) return ;
			pushFollow(FOLLOW_callArrayAccess_in_functionCall2739);
			callArrayAccess();
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
			if ( state.backtracking>0 ) { memoize(input, 77, functionCall_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "callArrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:1: callArrayAccess : ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? ;
	public final void callArrayAccess() throws RecognitionException {
		int callArrayAccess_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:2: ( ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:4: ( '->' Identifier '(' ( expressionList )? ')' )* ( arrayAccessCall )?
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:4: ( '->' Identifier '(' ( expressionList )? ')' )*
			loop93:
			do {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==ObjectOperator) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:5: '->' Identifier '(' ( expressionList )? ')'
					{
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callArrayAccess2749); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_callArrayAccess2751); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_callArrayAccess2753); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:25: ( expressionList )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==At||LA92_0==Backslash||LA92_0==BitwiseNot||LA92_0==Bool||LA92_0==Clone||LA92_0==Float||LA92_0==Identifier||LA92_0==Int||(LA92_0 >= LeftParanthesis && LA92_0 <= LeftSquareBrace)||LA92_0==LogicNot||LA92_0==Minus||LA92_0==MinusMinus||LA92_0==NULL||LA92_0==New||LA92_0==Null||(LA92_0 >= Parent && LA92_0 <= Plus)||LA92_0==PlusPlus||LA92_0==Self||LA92_0==String||LA92_0==This||LA92_0==TypeArray||LA92_0==VariableId) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:25: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_callArrayAccess2755);
							expressionList();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_callArrayAccess2757); if (state.failed) return ;
					}
					break;

				default :
					break loop93;
				}
			} while (true);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:46: ( arrayAccessCall )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LeftSquareBrace) ) {
				int LA94_1 = input.LA(2);
				if ( (synpred157_TSPHP()) ) {
					alt94=1;
				}
			}
			switch (alt94) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:46: arrayAccessCall
					{
					pushFollow(FOLLOW_arrayAccessCall_in_callArrayAccess2761);
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
			if ( state.backtracking>0 ) { memoize(input, 78, callArrayAccess_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "callArrayAccess"



	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:1: methodCall : ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' callArrayAccess ;
	public final void methodCall() throws RecognitionException {
		int methodCall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:2: ( ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' callArrayAccess )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: ( ( varAccess '->' ) | staticAccess ) Identifier '(' ( expressionList )? ')' callArrayAccess
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: ( ( varAccess '->' ) | staticAccess )
			int alt95=2;
			alt95 = dfa95.predict(input);
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:6: ( varAccess '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:6: ( varAccess '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:7: varAccess '->'
					{
					pushFollow(FOLLOW_varAccess_in_methodCall2776);
					varAccess();
					state._fsp--;
					if (state.failed) return ;
					match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2778); if (state.failed) return ;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:25: staticAccess
					{
					pushFollow(FOLLOW_staticAccess_in_methodCall2783);
					staticAccess();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_methodCall2786); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2788); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:54: ( expressionList )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==At||LA96_0==Backslash||LA96_0==BitwiseNot||LA96_0==Bool||LA96_0==Clone||LA96_0==Float||LA96_0==Identifier||LA96_0==Int||(LA96_0 >= LeftParanthesis && LA96_0 <= LeftSquareBrace)||LA96_0==LogicNot||LA96_0==Minus||LA96_0==MinusMinus||LA96_0==NULL||LA96_0==New||LA96_0==Null||(LA96_0 >= Parent && LA96_0 <= Plus)||LA96_0==PlusPlus||LA96_0==Self||LA96_0==String||LA96_0==This||LA96_0==TypeArray||LA96_0==VariableId) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:54: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2790);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2792); if (state.failed) return ;
			pushFollow(FOLLOW_callArrayAccess_in_methodCall2794);
			callArrayAccess();
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
			if ( state.backtracking>0 ) { memoize(input, 79, methodCall_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "methodCall"



	// $ANTLR start "arrayAccessCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:1: arrayAccessCall : ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+ ;
	public final void arrayAccessCall() throws RecognitionException {
		int arrayAccessCall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:2: ( ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:5: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )+
			int cnt99=0;
			loop99:
			do {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==LeftSquareBrace) ) {
					int LA99_2 = input.LA(2);
					if ( (synpred162_TSPHP()) ) {
						alt99=1;
					}

				}

				switch (alt99) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:6: ( '[' expression ']' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:7: '[' expression ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccessCall2808); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_arrayAccessCall2810);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccessCall2812); if (state.failed) return ;
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:27: ( '->' Identifier '(' ( expressionList )? ')' )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==ObjectOperator) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:28: '->' Identifier '(' ( expressionList )? ')'
							{
							match(input,ObjectOperator,FOLLOW_ObjectOperator_in_arrayAccessCall2816); if (state.failed) return ;
							match(input,Identifier,FOLLOW_Identifier_in_arrayAccessCall2817); if (state.failed) return ;
							match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_arrayAccessCall2819); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:47: ( expressionList )?
							int alt97=2;
							int LA97_0 = input.LA(1);
							if ( (LA97_0==At||LA97_0==Backslash||LA97_0==BitwiseNot||LA97_0==Bool||LA97_0==Clone||LA97_0==Float||LA97_0==Identifier||LA97_0==Int||(LA97_0 >= LeftParanthesis && LA97_0 <= LeftSquareBrace)||LA97_0==LogicNot||LA97_0==Minus||LA97_0==MinusMinus||LA97_0==NULL||LA97_0==New||LA97_0==Null||(LA97_0 >= Parent && LA97_0 <= Plus)||LA97_0==PlusPlus||LA97_0==Self||LA97_0==String||LA97_0==This||LA97_0==TypeArray||LA97_0==VariableId) ) {
								alt97=1;
							}
							switch (alt97) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:47: expressionList
									{
									pushFollow(FOLLOW_expressionList_in_arrayAccessCall2821);
									expressionList();
									state._fsp--;
									if (state.failed) return ;
									}
									break;

							}

							match(input,RightParanthesis,FOLLOW_RightParanthesis_in_arrayAccessCall2823); if (state.failed) return ;
							}
							break;

					}

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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, arrayAccessCall_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "arrayAccessCall"



	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:1: atom : ( '(' expression ')' | array | staticAccess Identifier | varAccess | Identifier | primitiveAtom );
	public final void atom() throws RecognitionException {
		int atom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:6: ( '(' expression ')' | array | staticAccess Identifier | varAccess | Identifier | primitiveAtom )
			int alt100=6;
			alt100 = dfa100.predict(input);
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2835); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2837);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2839); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: array
					{
					pushFollow(FOLLOW_array_in_atom2844);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:4: staticAccess Identifier
					{
					pushFollow(FOLLOW_staticAccess_in_atom2849);
					staticAccess();
					state._fsp--;
					if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_atom2851); if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:4: varAccess
					{
					pushFollow(FOLLOW_varAccess_in_atom2856);
					varAccess();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_atom2861); if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2866);
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
			if ( state.backtracking>0 ) { memoize(input, 81, atom_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "atom"



	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		int unaryPrimitiveAtom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2878); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2880);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2885); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2887);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2892);
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
			if ( state.backtracking>0 ) { memoize(input, 82, unaryPrimitiveAtom_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "unaryPrimitiveAtom"



	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL | Identifier );
	public final void primitiveAtom() throws RecognitionException {
		int primitiveAtom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:2: ( Bool | Int | Float | String | Null | NULL | Identifier )
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
			if ( state.backtracking>0 ) { memoize(input, 83, primitiveAtom_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "primitiveAtom"



	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		int array_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3395); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:13: ( array_content )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==At||LA102_0==Backslash||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==NULL||LA102_0==New||LA102_0==Null||(LA102_0 >= Parent && LA102_0 <= Plus)||LA102_0==PlusPlus||LA102_0==Self||LA102_0==String||LA102_0==This||LA102_0==TypeArray||LA102_0==VariableId) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3397);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3400); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array3406); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3408); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:18: ( array_content )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==At||LA103_0==Backslash||LA103_0==BitwiseNot||LA103_0==Bool||LA103_0==Clone||LA103_0==Float||LA103_0==Identifier||LA103_0==Int||(LA103_0 >= LeftParanthesis && LA103_0 <= LeftSquareBrace)||LA103_0==LogicNot||LA103_0==Minus||LA103_0==MinusMinus||LA103_0==NULL||LA103_0==New||LA103_0==Null||(LA103_0 >= Parent && LA103_0 <= Plus)||LA103_0==PlusPlus||LA103_0==Self||LA103_0==String||LA103_0==This||LA103_0==TypeArray||LA103_0==VariableId) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3410);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3413); if (state.failed) return ;
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
			if ( state.backtracking>0 ) { memoize(input, 84, array_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "array"



	// $ANTLR start "array_content"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		int array_content_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: ( expression '=>' )?
			int alt105=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA105_1 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA105_2 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA105_3 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case At:
					{
					int LA105_4 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case VariableId:
					{
					int LA105_5 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA105_6 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Backslash:
					{
					int LA105_7 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Identifier:
					{
					int LA105_8 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case This:
					{
					int LA105_9 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Self:
					{
					int LA105_10 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Parent:
					{
					int LA105_11 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case New:
					{
					int LA105_12 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Clone:
					{
					int LA105_13 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Plus:
					{
					int LA105_14 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case Minus:
					{
					int LA105_15 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA105_16 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA105_17 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
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
					int LA105_18 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt105=1;
					}
					}
					break;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3426);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content3428); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3432);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:35: ( ',' ( expression '=>' )? expression )*
			loop107:
			do {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==Comma) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content3436); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:40: ( expression '=>' )?
					int alt106=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA106_1 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA106_2 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA106_3 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case At:
							{
							int LA106_4 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case VariableId:
							{
							int LA106_5 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA106_6 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Backslash:
							{
							int LA106_7 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Identifier:
							{
							int LA106_8 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case This:
							{
							int LA106_9 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Self:
							{
							int LA106_10 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Parent:
							{
							int LA106_11 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case New:
							{
							int LA106_12 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Clone:
							{
							int LA106_13 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Plus:
							{
							int LA106_14 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case Minus:
							{
							int LA106_15 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA106_16 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA106_17 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
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
							int LA106_18 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt106=1;
							}
							}
							break;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3439);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content3441); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3445);
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
			if ( state.backtracking>0 ) { memoize(input, 85, array_content_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "array_content"



	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		int ifCondition_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:632:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:632:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition3457); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3459); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition3461);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3463); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3465);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:3: ( 'else' instructionInclBreakContinue )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==Else) ) {
				int LA108_1 = input.LA(2);
				if ( (synpred182_TSPHP()) ) {
					alt108=1;
				}
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition3472); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3474);
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
			if ( state.backtracking>0 ) { memoize(input, 86, ifCondition_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "ifCondition"



	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		int switchCondition_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:638:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:638:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3490); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3492); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3494); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3496); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3498); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==Case) ) {
				int LA121_1 = input.LA(2);
				if ( (synpred190_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3509);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:16: ( instructionInclBreakContinue )+
							int cnt110=0;
							loop110:
							do {
								int alt110=2;
								int LA110_0 = input.LA(1);
								if ( (LA110_0==Backslash||LA110_0==Break||LA110_0==Continue||LA110_0==Do||LA110_0==Echo||LA110_0==Exit||(LA110_0 >= For && LA110_0 <= Foreach)||(LA110_0 >= Identifier && LA110_0 <= If)||LA110_0==LeftCurlyBrace||LA110_0==MinusMinus||LA110_0==Parent||LA110_0==PlusPlus||LA110_0==Return||LA110_0==Self||(LA110_0 >= Switch && LA110_0 <= TypeString)||LA110_0==VariableId||LA110_0==While) ) {
									alt110=1;
								}

								switch (alt110) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3512);
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3517);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:61: ( instructionInclBreakContinue )+
					int cnt112=0;
					loop112:
					do {
						int alt112=2;
						int LA112_0 = input.LA(1);
						if ( (LA112_0==Backslash||LA112_0==Break||LA112_0==Continue||LA112_0==Do||LA112_0==Echo||LA112_0==Exit||(LA112_0 >= For && LA112_0 <= Foreach)||(LA112_0 >= Identifier && LA112_0 <= If)||LA112_0==LeftCurlyBrace||LA112_0==MinusMinus||LA112_0==Parent||LA112_0==PlusPlus||LA112_0==Return||LA112_0==Self||(LA112_0 >= Switch && LA112_0 <= TypeString)||LA112_0==VariableId||LA112_0==While) ) {
							alt112=1;
						}

						switch (alt112) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3519);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3523);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:103: ( instructionInclBreakContinue )+
							int cnt114=0;
							loop114:
							do {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==Backslash||LA114_0==Break||LA114_0==Continue||LA114_0==Do||LA114_0==Echo||LA114_0==Exit||(LA114_0 >= For && LA114_0 <= Foreach)||(LA114_0 >= Identifier && LA114_0 <= If)||LA114_0==LeftCurlyBrace||LA114_0==MinusMinus||LA114_0==Parent||LA114_0==PlusPlus||LA114_0==Return||LA114_0==Self||(LA114_0 >= Switch && LA114_0 <= TypeString)||LA114_0==VariableId||LA114_0==While) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3526);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3536);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:17: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3539);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==Default) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3545);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:63: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3547);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3558); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, switchCondition_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "switchCondition"



	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		int caseLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:647:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:647:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3570); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3572);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3574); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, caseLabel_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "caseLabel"



	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		int defaultLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:650:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:650:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3583); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3585); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, defaultLabel_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "defaultLabel"



	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		int forLoop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3594); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3596); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:21: ( forInit )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==Backslash||LA122_0==Identifier||LA122_0==MinusMinus||LA122_0==PlusPlus||(LA122_0 >= TypeArray && LA122_0 <= TypeString)||LA122_0==VariableId) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3598);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3601); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:34: ( expressionList )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==At||LA123_0==Backslash||LA123_0==BitwiseNot||LA123_0==Bool||LA123_0==Clone||LA123_0==Float||LA123_0==Identifier||LA123_0==Int||(LA123_0 >= LeftParanthesis && LA123_0 <= LeftSquareBrace)||LA123_0==LogicNot||LA123_0==Minus||LA123_0==MinusMinus||LA123_0==NULL||LA123_0==New||LA123_0==Null||(LA123_0 >= Parent && LA123_0 <= Plus)||LA123_0==PlusPlus||LA123_0==Self||LA123_0==String||LA123_0==This||LA123_0==TypeArray||LA123_0==VariableId) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3603);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3607); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:55: ( forUpdate )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==MinusMinus||LA124_0==PlusPlus||LA124_0==VariableId) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3609);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3612); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3614);
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
			if ( state.backtracking>0 ) { memoize(input, 90, forLoop_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "forLoop"



	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:11: ( variableDeclaration | variableAssignment )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3623);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3625);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:52: ( ',' variableAssignment )*
			loop126:
			do {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==Comma) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3629); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3631);
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
			if ( state.backtracking>0 ) { memoize(input, 91, forInit_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "forInit"



	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		int forUpdate_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3641);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:23: ( ',' variableAssignment )*
			loop127:
			do {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==Comma) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3644); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3646);
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
			if ( state.backtracking>0 ) { memoize(input, 92, forUpdate_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "forUpdate"



	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:658:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		int foreachLoop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3657); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3659); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:18: ( VariableId | array )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3662); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3664);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3667); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3669); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:53: ( '=>' VariableId )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==Arrow) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3672); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3674); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3678); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3680);
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
			if ( state.backtracking>0 ) { memoize(input, 93, foreachLoop_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "foreachLoop"



	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:661:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		int whileLoop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3689); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3691); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3693);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3695); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3697);
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
			if ( state.backtracking>0 ) { memoize(input, 94, whileLoop_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "whileLoop"



	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		int doWhileLoop_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3707); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3709);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3711); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3713); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3715);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3717); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3719); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, doWhileLoop_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "doWhileLoop"



	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		int tryCatch_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3726); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3728); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:21: ( instructionInclBreakContinue )+
			int cnt130=0;
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==Backslash||LA130_0==Break||LA130_0==Continue||LA130_0==Do||LA130_0==Echo||LA130_0==Exit||(LA130_0 >= For && LA130_0 <= Foreach)||(LA130_0 >= Identifier && LA130_0 <= If)||LA130_0==LeftCurlyBrace||LA130_0==MinusMinus||LA130_0==Parent||LA130_0==PlusPlus||LA130_0==Return||LA130_0==Self||(LA130_0 >= Switch && LA130_0 <= TypeString)||LA130_0==VariableId||LA130_0==While) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3730);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3733); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3735); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3737); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3739);
			classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3741); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3743); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3744); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:114: ( instructionInclBreakContinue )*
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Backslash||LA131_0==Break||LA131_0==Continue||LA131_0==Do||LA131_0==Echo||LA131_0==Exit||(LA131_0 >= For && LA131_0 <= Foreach)||(LA131_0 >= Identifier && LA131_0 <= If)||LA131_0==LeftCurlyBrace||LA131_0==MinusMinus||LA131_0==Parent||LA131_0==PlusPlus||LA131_0==Return||LA131_0==Self||(LA131_0 >= Switch && LA131_0 <= TypeString)||LA131_0==VariableId||LA131_0==While) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3746);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop131;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3749); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, tryCatch_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "tryCatch"



	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:669:1: throwException : 'throw' newObject ';' ;
	public final void throwException() throws RecognitionException {
		int throwException_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:4: 'throw' newObject ';'
			{
			match(input,Throw,FOLLOW_Throw_in_throwException3758); if (state.failed) return ;
			pushFollow(FOLLOW_newObject_in_throwException3760);
			newObject();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_throwException3762); if (state.failed) return ;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, throwException_StartIndex); }

		}
		return ;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred101_TSPHP2124); if (state.failed) return ;
		pushFollow(FOLLOW_logicXorWeak_in_synpred101_TSPHP2126);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred102_TSPHP2142); if (state.failed) return ;
		pushFollow(FOLLOW_logicAndWeak_in_synpred102_TSPHP2144);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred103_TSPHP2160); if (state.failed) return ;
		pushFollow(FOLLOW_assignment_in_synpred103_TSPHP2162);
		assignment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred104_TSPHP2176);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;
		pushFollow(FOLLOW_ternary_in_synpred104_TSPHP2178);
		ternary();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred132_TSPHP
	public final void synpred132_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
		{
		match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred132_TSPHP2471); if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
		int alt144=2;
		int LA144_0 = input.LA(1);
		if ( ((LA144_0 >= TypeArray && LA144_0 <= TypeInt)||LA144_0==TypeString) ) {
			alt144=1;
		}
		else if ( (LA144_0==Backslash||LA144_0==Identifier||LA144_0==TypeObject) ) {
			alt144=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 144, 0, input);
			throw nvae;
		}
		switch (alt144) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:10: primitiveTypesInclArray
				{
				pushFollow(FOLLOW_primitiveTypesInclArray_in_synpred132_TSPHP2474);
				primitiveTypesInclArray();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:34: classInterfaceTypeInclObject
				{
				pushFollow(FOLLOW_classInterfaceTypeInclObject_in_synpred132_TSPHP2476);
				classInterfaceTypeInclObject();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

		}

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred132_TSPHP2479); if (state.failed) return ;
		}

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred132_TSPHP2482);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred132_TSPHP

	// $ANTLR start synpred138_TSPHP
	public final void synpred138_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:4: ( fluentObject ( '[' expression ']' )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:4: fluentObject ( '[' expression ']' )+
		{
		pushFollow(FOLLOW_fluentObject_in_synpred138_TSPHP2535);
		fluentObject();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:17: ( '[' expression ']' )+
		int cnt145=0;
		loop145:
		do {
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LeftSquareBrace) ) {
				alt145=1;
			}

			switch (alt145) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:18: '[' expression ']'
				{
				match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred138_TSPHP2538); if (state.failed) return ;
				pushFollow(FOLLOW_expression_in_synpred138_TSPHP2540);
				expression();
				state._fsp--;
				if (state.failed) return ;
				match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred138_TSPHP2542); if (state.failed) return ;
				}
				break;

			default :
				if ( cnt145 >= 1 ) break loop145;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(145, input);
					throw eee;
			}
			cnt145++;
		} while (true);

		}

	}
	// $ANTLR end synpred138_TSPHP

	// $ANTLR start synpred157_TSPHP
	public final void synpred157_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:46: ( arrayAccessCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:46: arrayAccessCall
		{
		pushFollow(FOLLOW_arrayAccessCall_in_synpred157_TSPHP2761);
		arrayAccessCall();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred157_TSPHP

	// $ANTLR start synpred162_TSPHP
	public final void synpred162_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:6: ( ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )? )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:6: ( '[' expression ']' ) ( '->' Identifier '(' ( expressionList )? ')' )?
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:6: ( '[' expression ']' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:7: '[' expression ']'
		{
		match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred162_TSPHP2808); if (state.failed) return ;
		pushFollow(FOLLOW_expression_in_synpred162_TSPHP2810);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred162_TSPHP2812); if (state.failed) return ;
		}

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:27: ( '->' Identifier '(' ( expressionList )? ')' )?
		int alt150=2;
		int LA150_0 = input.LA(1);
		if ( (LA150_0==ObjectOperator) ) {
			alt150=1;
		}
		switch (alt150) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:28: '->' Identifier '(' ( expressionList )? ')'
				{
				match(input,ObjectOperator,FOLLOW_ObjectOperator_in_synpred162_TSPHP2816); if (state.failed) return ;
				match(input,Identifier,FOLLOW_Identifier_in_synpred162_TSPHP2817); if (state.failed) return ;
				match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred162_TSPHP2819); if (state.failed) return ;
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:47: ( expressionList )?
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==At||LA149_0==Backslash||LA149_0==BitwiseNot||LA149_0==Bool||LA149_0==Clone||LA149_0==Float||LA149_0==Identifier||LA149_0==Int||(LA149_0 >= LeftParanthesis && LA149_0 <= LeftSquareBrace)||LA149_0==LogicNot||LA149_0==Minus||LA149_0==MinusMinus||LA149_0==NULL||LA149_0==New||LA149_0==Null||(LA149_0 >= Parent && LA149_0 <= Plus)||LA149_0==PlusPlus||LA149_0==Self||LA149_0==String||LA149_0==This||LA149_0==TypeArray||LA149_0==VariableId) ) {
					alt149=1;
				}
				switch (alt149) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:47: expressionList
						{
						pushFollow(FOLLOW_expressionList_in_synpred162_TSPHP2821);
						expressionList();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred162_TSPHP2823); if (state.failed) return ;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred162_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: ( Identifier )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: Identifier
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred167_TSPHP2861); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred179_TSPHP
	public final void synpred179_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred179_TSPHP3426);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred179_TSPHP3428); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred179_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred180_TSPHP3439);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred180_TSPHP3441); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred180_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred182_TSPHP3472); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred182_TSPHP3474);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred190_TSPHP
	public final void synpred190_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt159=0;
		loop159:
		do {
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==Case) ) {
				alt159=1;
			}

			switch (alt159) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: ( caseLabel )+
				int cnt157=0;
				loop157:
				do {
					int alt157=2;
					int LA157_0 = input.LA(1);
					if ( (LA157_0==Case) ) {
						alt157=1;
					}

					switch (alt157) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred190_TSPHP3509);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt157 >= 1 ) break loop157;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(157, input);
							throw eee;
					}
					cnt157++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:16: ( instructionInclBreakContinue )+
				int cnt158=0;
				loop158:
				do {
					int alt158=2;
					int LA158_0 = input.LA(1);
					if ( (LA158_0==Backslash||LA158_0==Break||LA158_0==Continue||LA158_0==Do||LA158_0==Echo||LA158_0==Exit||(LA158_0 >= For && LA158_0 <= Foreach)||(LA158_0 >= Identifier && LA158_0 <= If)||LA158_0==LeftCurlyBrace||LA158_0==MinusMinus||LA158_0==Parent||LA158_0==PlusPlus||LA158_0==Return||LA158_0==Self||(LA158_0 >= Switch && LA158_0 <= TypeString)||LA158_0==VariableId||LA158_0==While) ) {
						alt158=1;
					}

					switch (alt158) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3512);
						instructionInclBreakContinue();
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

		pushFollow(FOLLOW_defaultLabel_in_synpred190_TSPHP3517);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:61: ( instructionInclBreakContinue )+
		int cnt160=0;
		loop160:
		do {
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==Backslash||LA160_0==Break||LA160_0==Continue||LA160_0==Do||LA160_0==Echo||LA160_0==Exit||(LA160_0 >= For && LA160_0 <= Foreach)||(LA160_0 >= Identifier && LA160_0 <= If)||LA160_0==LeftCurlyBrace||LA160_0==MinusMinus||LA160_0==Parent||LA160_0==PlusPlus||LA160_0==Return||LA160_0==Self||(LA160_0 >= Switch && LA160_0 <= TypeString)||LA160_0==VariableId||LA160_0==While) ) {
				alt160=1;
			}

			switch (alt160) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3519);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt163=0;
		loop163:
		do {
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==Case) ) {
				alt163=1;
			}

			switch (alt163) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: ( caseLabel )+
				int cnt161=0;
				loop161:
				do {
					int alt161=2;
					int LA161_0 = input.LA(1);
					if ( (LA161_0==Case) ) {
						alt161=1;
					}

					switch (alt161) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred190_TSPHP3523);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:103: ( instructionInclBreakContinue )+
				int cnt162=0;
				loop162:
				do {
					int alt162=2;
					int LA162_0 = input.LA(1);
					if ( (LA162_0==Backslash||LA162_0==Break||LA162_0==Continue||LA162_0==Do||LA162_0==Echo||LA162_0==Exit||(LA162_0 >= For && LA162_0 <= Foreach)||(LA162_0 >= Identifier && LA162_0 <= If)||LA162_0==LeftCurlyBrace||LA162_0==MinusMinus||LA162_0==Parent||LA162_0==PlusPlus||LA162_0==Return||LA162_0==Self||(LA162_0 >= Switch && LA162_0 <= TypeString)||LA162_0==VariableId||LA162_0==While) ) {
						alt162=1;
					}

					switch (alt162) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:640:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3526);
						instructionInclBreakContinue();
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

	}
	// $ANTLR end synpred190_TSPHP

	// Delegated rules

	public final boolean synpred190_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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
	public final boolean synpred101_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred179_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred179_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred132_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred132_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred180_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred138_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred138_TSPHP_fragment(); // can never throw exception
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


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA55 dfa55 = new DFA55(this);
	protected DFA82 dfa82 = new DFA82(this);
	protected DFA88 dfa88 = new DFA88(this);
	protected DFA90 dfa90 = new DFA90(this);
	protected DFA95 dfa95 = new DFA95(this);
	protected DFA100 dfa100 = new DFA100(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\65\1\uffff\1\12\1\uffff\1\65\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\176\1\73\1\uffff\1\150\1\uffff\1\65\1\uffff\1\150";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\4\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\5\uffff"+
			"\1\1\7\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\16\2\1\uffff"+
			"\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\60\uffff\1\4\54\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\60\uffff\1\4\54\uffff\1\6"
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
			return "177:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA48_eotS =
		"\27\uffff";
	static final String DFA48_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA48_minS =
		"\1\12\4\174\1\65\1\12\1\7\1\65\1\uffff\1\12\2\uffff\1\12\4\174\1\65\1"+
		"\12\1\7\1\65\1\12";
	static final String DFA48_maxS =
		"\1\172\4\174\1\65\1\174\1\172\1\65\1\uffff\1\172\2\uffff\5\174\1\65\1"+
		"\174\1\143\1\65\1\174";
	static final String DFA48_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA48_specialS =
		"\27\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\5\52\uffff\1\6\75\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\161\uffff\1\7",
			"\1\11\2\uffff\1\14\16\uffff\1\12\33\uffff\1\14\55\uffff\1\13\17\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\52\uffff\1\23\75\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\161\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\161\uffff\1\24",
			"\1\14\21\uffff\1\13\111\uffff\1\13",
			"\1\26",
			"\1\25\161\uffff\1\24"
	};

	static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
	static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
	static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
	static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
	static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
	static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
	static final short[][] DFA48_transition;

	static {
		int numStates = DFA48_transitionS.length;
		DFA48_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
		}
	}

	class DFA48 extends DFA {

		public DFA48(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 48;
			this.eot = DFA48_eot;
			this.eof = DFA48_eof;
			this.min = DFA48_min;
			this.max = DFA48_max;
			this.accept = DFA48_accept;
			this.special = DFA48_special;
			this.transition = DFA48_transition;
		}
		@Override
		public String getDescription() {
			return "331:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA55_eotS =
		"\25\uffff";
	static final String DFA55_eofS =
		"\25\uffff";
	static final String DFA55_minS =
		"\1\12\1\7\2\uffff\1\65\1\12\14\uffff\1\65\1\uffff\1\12";
	static final String DFA55_maxS =
		"\1\176\1\154\2\uffff\1\65\1\174\14\uffff\1\65\1\uffff\1\174";
	static final String DFA55_acceptS =
		"\2\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\14\1\15"+
		"\1\16\1\17\1\uffff\1\13\1\uffff";
	static final String DFA55_specialS =
		"\25\uffff}>";
	static final String[] DFA55_transitionS = {
			"\1\4\26\uffff\1\13\5\uffff\1\20\2\uffff\1\21\3\uffff\1\10\1\11\5\uffff"+
			"\1\5\1\6\21\uffff\1\2\15\uffff\1\16\2\uffff\1\2\7\uffff\1\17\5\uffff"+
			"\1\16\7\uffff\1\7\1\16\1\15\1\14\10\3\1\uffff\1\1\1\uffff\1\12",
			"\1\2\4\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\1\2\3\uffff\1\2\42"+
			"\uffff\2\2\1\uffff\1\2\1\uffff\1\2\10\uffff\1\16\2\uffff\2\2\20\uffff"+
			"\1\2\1\uffff\1\2",
			"",
			"",
			"\1\5",
			"\1\22\32\uffff\1\16\26\uffff\1\23\77\uffff\1\3",
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
			"\1\24",
			"",
			"\1\22\32\uffff\1\16\26\uffff\1\23\77\uffff\1\3"
	};

	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
	static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
	static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
	static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	class DFA55 extends DFA {

		public DFA55(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}
		@Override
		public String getDescription() {
			return "357:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCall ';' | methodCall ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );";
		}
	}

	static final String DFA82_eotS =
		"\20\uffff";
	static final String DFA82_eofS =
		"\20\uffff";
	static final String DFA82_minS =
		"\1\12\1\65\1\12\1\75\2\65\1\75\1\65\1\uffff\2\65\1\uffff\1\75\1\uffff"+
		"\1\12\1\74";
	static final String DFA82_maxS =
		"\1\174\1\65\1\74\1\125\2\174\1\125\1\65\1\uffff\1\174\1\65\1\uffff\1\125"+
		"\1\uffff\1\74\1\125";
	static final String DFA82_acceptS =
		"\10\uffff\1\1\2\uffff\1\3\1\uffff\1\2\2\uffff";
	static final String DFA82_specialS =
		"\20\uffff}>";
	static final String[] DFA82_transitionS = {
			"\1\1\52\uffff\1\2\40\uffff\1\5\20\uffff\1\4\10\uffff\1\3\13\uffff\1\6",
			"\1\2",
			"\1\7\32\uffff\1\11\26\uffff\1\10",
			"\1\13\27\uffff\1\12",
			"\1\15\106\uffff\1\14",
			"\1\15\106\uffff\1\14",
			"\1\13\27\uffff\1\15",
			"\1\16",
			"",
			"\1\15\106\uffff\1\14",
			"\1\17",
			"",
			"\1\13\27\uffff\1\15",
			"",
			"\1\7\32\uffff\1\11\26\uffff\1\10",
			"\1\15\1\13\27\uffff\1\12"
	};

	static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
	static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
	static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
	static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
	static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
	static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
	static final short[][] DFA82_transition;

	static {
		int numStates = DFA82_transitionS.length;
		DFA82_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
		}
	}

	class DFA82 extends DFA {

		public DFA82(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 82;
			this.eot = DFA82_eot;
			this.eof = DFA82_eof;
			this.min = DFA82_min;
			this.max = DFA82_max;
			this.accept = DFA82_accept;
			this.special = DFA82_special;
			this.transition = DFA82_transition;
		}
		@Override
		public String getDescription() {
			return "492:1: fluentObject : ( functionCall | methodCall | varAccess );";
		}
	}

	static final String DFA88_eotS =
		"\10\uffff";
	static final String DFA88_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA88_minS =
		"\1\117\1\12\1\65\1\5\1\65\2\uffff\1\5";
	static final String DFA88_maxS =
		"\1\117\2\65\1\154\1\65\2\uffff\1\154";
	static final String DFA88_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA88_specialS =
		"\10\uffff}>";
	static final String[] DFA88_transitionS = {
			"\1\1",
			"\1\2\52\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5"
	};

	static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
	static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
	static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
	static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
	static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
	static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
	static final short[][] DFA88_transition;

	static {
		int numStates = DFA88_transitionS.length;
		DFA88_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
		}
	}

	class DFA88 extends DFA {

		public DFA88(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 88;
			this.eot = DFA88_eot;
			this.eof = DFA88_eof;
			this.min = DFA88_min;
			this.max = DFA88_max;
			this.accept = DFA88_accept;
			this.special = DFA88_special;
			this.transition = DFA88_transition;
		}
		@Override
		public String getDescription() {
			return "516:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	static final String DFA90_eotS =
		"\22\uffff";
	static final String DFA90_eofS =
		"\2\uffff\2\7\2\uffff\1\7\6\uffff\2\7\2\uffff\1\7";
	static final String DFA90_minS =
		"\1\12\1\65\2\5\2\65\1\5\1\uffff\1\12\1\65\1\uffff\2\65\2\5\1\uffff\1\12"+
		"\1\5";
	static final String DFA90_maxS =
		"\1\174\1\65\2\154\2\174\1\154\1\uffff\1\74\1\65\1\uffff\1\174\1\65\2\154"+
		"\1\uffff\1\74\1\154";
	static final String DFA90_acceptS =
		"\7\uffff\1\3\2\uffff\1\1\4\uffff\1\2\2\uffff";
	static final String DFA90_specialS =
		"\22\uffff}>";
	static final String[] DFA90_transitionS = {
			"\1\1\7\uffff\1\7\32\uffff\1\7\7\uffff\1\2\3\uffff\1\7\2\uffff\2\7\17"+
			"\uffff\1\7\5\uffff\1\7\2\uffff\1\5\20\uffff\1\4\6\uffff\1\7\1\uffff\1"+
			"\3\2\uffff\1\7\10\uffff\1\6",
			"\1\10",
			"\1\7\1\uffff\1\7\2\uffff\1\11\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2"+
			"\7\2\uffff\2\7\1\13\3\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\3"+
			"\uffff\1\12\1\uffff\4\7\1\uffff\5\7\1\uffff\4\7\3\uffff\3\7\4\uffff\2"+
			"\7\7\uffff\1\7\2\uffff\2\7\3\uffff\5\7",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\4\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\5\uffff\4\7\1\uffff"+
			"\5\7\1\uffff\4\7\3\uffff\3\7\2\uffff\1\14\1\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7",
			"\1\16\106\uffff\1\15",
			"\1\16\106\uffff\1\15",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\4\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\5\uffff\4\7\1\uffff"+
			"\5\7\1\uffff\4\7\3\uffff\3\7\2\uffff\1\17\1\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7",
			"",
			"\1\11\32\uffff\1\13\26\uffff\1\12",
			"\1\20",
			"",
			"\1\16\106\uffff\1\15",
			"\1\21",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\4\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\5\uffff\4\7\1\uffff"+
			"\5\7\1\uffff\4\7\3\uffff\3\7\2\uffff\1\17\1\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\4\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\3\uffff\1\17\1\uffff"+
			"\4\7\1\uffff\5\7\1\uffff\4\7\3\uffff\3\7\4\uffff\2\7\7\uffff\1\7\2\uffff"+
			"\2\7\3\uffff\5\7",
			"",
			"\1\11\32\uffff\1\13\26\uffff\1\12",
			"\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\4\7\6\uffff\2\7\5\uffff\2\7\2\uffff"+
			"\2\7\4\uffff\1\7\7\uffff\2\7\1\uffff\1\7\3\uffff\1\7\3\uffff\1\17\1\uffff"+
			"\4\7\1\uffff\5\7\1\uffff\4\7\3\uffff\3\7\2\uffff\1\14\1\uffff\2\7\7\uffff"+
			"\1\7\2\uffff\2\7\3\uffff\5\7"
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
			return "525:1: atomOrCall : ( functionCall | methodCall | atom );";
		}
	}

	static final String DFA95_eotS =
		"\12\uffff";
	static final String DFA95_eofS =
		"\12\uffff";
	static final String DFA95_minS =
		"\1\12\1\uffff\3\65\1\12\1\uffff\2\65\1\12";
	static final String DFA95_maxS =
		"\1\174\1\uffff\2\174\1\65\1\45\1\uffff\1\65\1\174\1\45";
	static final String DFA95_acceptS =
		"\1\uffff\1\1\4\uffff\1\2\3\uffff";
	static final String DFA95_specialS =
		"\12\uffff}>";
	static final String[] DFA95_transitionS = {
			"\1\4\52\uffff\1\5\40\uffff\1\3\20\uffff\1\2\10\uffff\1\1\13\uffff\1\1",
			"",
			"\1\6\106\uffff\1\1",
			"\1\6\106\uffff\1\1",
			"\1\5",
			"\1\7\32\uffff\1\10",
			"",
			"\1\11",
			"\1\6\106\uffff\1\1",
			"\1\7\32\uffff\1\10"
	};

	static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
	static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
	static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
	static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
	static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
	static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
	static final short[][] DFA95_transition;

	static {
		int numStates = DFA95_transitionS.length;
		DFA95_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
		}
	}

	class DFA95 extends DFA {

		public DFA95(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 95;
			this.eot = DFA95_eot;
			this.eof = DFA95_eof;
			this.min = DFA95_min;
			this.max = DFA95_max;
			this.accept = DFA95_accept;
			this.special = DFA95_special;
			this.transition = DFA95_transition;
		}
		@Override
		public String getDescription() {
			return "539:4: ( ( varAccess '->' ) | staticAccess )";
		}
	}

	static final String DFA100_eotS =
		"\17\uffff";
	static final String DFA100_eofS =
		"\17\uffff";
	static final String DFA100_minS =
		"\1\12\2\uffff\3\65\1\12\3\uffff\1\12\2\65\1\uffff\1\12";
	static final String DFA100_maxS =
		"\1\174\2\uffff\2\174\1\65\1\45\3\uffff\1\45\1\65\1\174\1\uffff\1\45";
	static final String DFA100_acceptS =
		"\1\uffff\1\1\1\2\4\uffff\1\4\1\6\1\3\3\uffff\1\5\1\uffff";
	static final String DFA100_specialS =
		"\6\uffff\1\0\10\uffff}>";
	static final String[] DFA100_transitionS = {
			"\1\5\7\uffff\1\10\32\uffff\1\10\7\uffff\1\6\3\uffff\1\10\2\uffff\1\1"+
			"\1\2\17\uffff\1\10\5\uffff\1\10\2\uffff\1\4\20\uffff\1\3\6\uffff\1\10"+
			"\1\uffff\1\7\2\uffff\1\2\10\uffff\1\7",
			"",
			"",
			"\1\11\106\uffff\1\7",
			"\1\11\106\uffff\1\7",
			"\1\12",
			"\1\13\32\uffff\1\14",
			"",
			"",
			"",
			"\1\13\32\uffff\1\14",
			"\1\16",
			"\1\11\106\uffff\1\7",
			"",
			"\1\13\32\uffff\1\14"
	};

	static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
	static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
	static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
	static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
	static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
	static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
	static final short[][] DFA100_transition;

	static {
		int numStates = DFA100_transitionS.length;
		DFA100_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
		}
	}

	class DFA100 extends DFA {

		public DFA100(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 100;
			this.eot = DFA100_eot;
			this.eof = DFA100_eof;
			this.min = DFA100_min;
			this.max = DFA100_max;
			this.accept = DFA100_accept;
			this.special = DFA100_special;
			this.transition = DFA100_transition;
		}
		@Override
		public String getDescription() {
			return "545:1: atom : ( '(' expression ')' | array | staticAccess Identifier | varAccess | Identifier | primitiveAtom );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA100_6 = input.LA(1);
						 
						int index100_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA100_6==Backslash) ) {s = 11;}
						else if ( (LA100_6==DoubleColon) ) {s = 12;}
						else if ( (synpred167_TSPHP()) ) {s = 13;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index100_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 100, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog946 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon961 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon963 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon965 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon967 = new BitSet(new long[]{0x0C61D48208400412L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket980 = new BitSet(new long[]{0x0820000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket982 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket985 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket987 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1056 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1059 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1061 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1074 = new BitSet(new long[]{0x0C61D48208400412L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1107 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1109 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1112 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1114 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1131 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1133 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1135 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1144 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1145 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1157 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1209 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1211 = new BitSet(new long[]{0x0880080000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1213 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1216 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1219 = new BitSet(new long[]{0x0001100008000010L,0x00002000C4000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1221 = new BitSet(new long[]{0x0001100008000010L,0x00002004C4000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1238 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1249 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1252 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1254 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1265 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1300 = new BitSet(new long[]{0x0000000000000000L,0x04F0000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1302 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1304 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1307 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1309 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1323 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1326 = new BitSet(new long[]{0x0220200000040000L,0x0000400000882040L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1337 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1340 = new BitSet(new long[]{0x0000000000000000L,0x1000000002000100L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1342 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1354 = new BitSet(new long[]{0x0000000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1357 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1359 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1396 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1399 = new BitSet(new long[]{0x0000000000000000L,0x1000000002000100L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1402 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1404 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1421 = new BitSet(new long[]{0x0001000000000000L,0x00000000C0000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1423 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1437 = new BitSet(new long[]{0x0001100000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1439 = new BitSet(new long[]{0x0001000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1447 = new BitSet(new long[]{0x0001000000000000L,0x00002000C4000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1449 = new BitSet(new long[]{0x0001000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1463 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1480 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1482 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1484 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1487 = new BitSet(new long[]{0x0001000008000000L,0x0000000480000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1489 = new BitSet(new long[]{0x0001000008000000L,0x0000000480000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1517 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1520 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1538 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1540 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1542 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1555 = new BitSet(new long[]{0x0020000000000400L,0x27F8000000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1557 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1559 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1561 = new BitSet(new long[]{0x0020000000000400L,0x07F8000800000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1668 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1702 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1705 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1707 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1714 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1717 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1719 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1726 = new BitSet(new long[]{0x0020000002000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1729 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1731 = new BitSet(new long[]{0x0020000002000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1736 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1738 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1752 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1764 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1767 = new BitSet(new long[]{0x3220200000040400L,0x1009408000C82040L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1791 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1793 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1813 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1815 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1829 = new BitSet(new long[]{0x0200000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1835 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1850 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1857 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_instruction1904 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_instruction1911 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1918 = new BitSet(new long[]{0x3220200000842500L,0x1009418002C8A144L});
	public static final BitSet FOLLOW_expression_in_instruction1920 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1928 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expressionList_in_instruction1930 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1937 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1951 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1954 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_expressionList1956 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1967 = new BitSet(new long[]{0x0000001100029080L,0x0000140001001480L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1969 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000100L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2075 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2093 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2095 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2098 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2124 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2142 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2160 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2173 = new BitSet(new long[]{0x0000001100029082L,0x0000140001001480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2176 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_ternary_in_assignment2178 = new BitSet(new long[]{0x0000001100029082L,0x0000140001001480L});
	public static final BitSet FOLLOW_logicOr_in_ternary2188 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2191 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ternary2193 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2195 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ternary2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2210 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2224 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2237 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2240 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2242 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2253 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2256 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2258 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2269 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2272 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2274 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2283 = new BitSet(new long[]{0x0010020000000002L,0x0000000000070000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2286 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_comparison_in_equality2288 = new BitSet(new long[]{0x0010020000000002L,0x0000000000070000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2330 = new BitSet(new long[]{0xC006000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2333 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2335 = new BitSet(new long[]{0xC006000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2371 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2374 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2380 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2390 = new BitSet(new long[]{0x0000000800000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2393 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2401 = new BitSet(new long[]{0x0000000800000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_logicNot_in_factor2411 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_set_in_factor2414 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicNot_in_factor2422 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2431 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2450 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2453 = new BitSet(new long[]{0x0020000000000400L,0x1000000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2471 = new BitSet(new long[]{0x0020000000000400L,0x05F8000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2479 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2487 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2494 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_incrementDecrement2523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_arrayAccess2535 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2538 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2540 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2542 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_arrayAccess2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_fluentObject2561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_fluentObject2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_fluentObject2571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_varAccess2583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_varAccess2586 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_varAccess2588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_staticAccess_in_varAccess2595 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_varAccess2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_varAccess2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess2614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccess2624 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccess2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2641 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_newOrClone2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_newOrClone2648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2659 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2666 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2668 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2670 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_newObject2672 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2684 = new BitSet(new long[]{0x3220200000040400L,0x1009408000482000L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2691 = new BitSet(new long[]{0x3220200000040400L,0x1009408000482000L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrCall_in_unaryAtom2698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atomOrCall2708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_atomOrCall2713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrCall2718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2730 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2732 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2734 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2737 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callArrayAccess_in_functionCall2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_callArrayAccess2749 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_callArrayAccess2751 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_callArrayAccess2753 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_callArrayAccess2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_callArrayAccess2757 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_arrayAccessCall_in_callArrayAccess2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_methodCall2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2778 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_staticAccess_in_methodCall2783 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2786 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2788 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2792 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callArrayAccess_in_methodCall2794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccessCall2808 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_arrayAccessCall2810 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccessCall2812 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_arrayAccessCall2816 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_arrayAccessCall2817 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_arrayAccessCall2819 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_arrayAccessCall2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_arrayAccessCall2823 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2835 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_atom2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccess_in_atom2849 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_atom2851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varAccess_in_atom2856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_atom2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2878 = new BitSet(new long[]{0x0220200000040000L,0x0000400000082000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2885 = new BitSet(new long[]{0x0220200000040000L,0x0000400000082000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3395 = new BitSet(new long[]{0x3220200000842500L,0x1009409002C8A144L});
	public static final BitSet FOLLOW_array_content_in_array3397 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3406 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3408 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_array_content_in_array3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3426 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3428 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3432 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3436 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3439 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3441 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3445 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3457 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3459 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ifCondition3461 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3463 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3465 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3472 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3490 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3492 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3494 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3496 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3498 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3509 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3512 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3517 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3519 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3523 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3526 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3536 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3539 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3545 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3547 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3570 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_caseLabel3572 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3583 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3594 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3596 = new BitSet(new long[]{0x0020000000000400L,0x17F8010002000100L});
	public static final BitSet FOLLOW_forInit_in_forLoop3598 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3601 = new BitSet(new long[]{0x3220200000842500L,0x1009418002C8A144L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3603 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3607 = new BitSet(new long[]{0x0000000000000000L,0x1000000802000100L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3609 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3612 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3623 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3625 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3629 = new BitSet(new long[]{0x0000000000000000L,0x1000000002000100L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3631 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3641 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3644 = new BitSet(new long[]{0x0000000000000000L,0x1000000002000100L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3646 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3657 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3659 = new BitSet(new long[]{0x2000000000000000L,0x1008000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3662 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3664 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3667 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3669 = new BitSet(new long[]{0x0000000000000020L,0x0000000800000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3672 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3674 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3678 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3689 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3691 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_whileLoop3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3695 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3707 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3709 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3711 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3713 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3715 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3717 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3726 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3728 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3730 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3733 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3735 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3737 = new BitSet(new long[]{0x0020000000000400L,0x0100000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3739 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3743 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3744 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3746 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_newObject_in_throwException3760 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred101_TSPHP2124 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred101_TSPHP2126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred102_TSPHP2142 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred102_TSPHP2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred103_TSPHP2160 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_assignment_in_synpred103_TSPHP2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred104_TSPHP2176 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_ternary_in_synpred104_TSPHP2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred132_TSPHP2471 = new BitSet(new long[]{0x0020000000000400L,0x05F8000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_synpred132_TSPHP2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_synpred132_TSPHP2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred132_TSPHP2479 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred132_TSPHP2482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fluentObject_in_synpred138_TSPHP2535 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred138_TSPHP2538 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_synpred138_TSPHP2540 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred138_TSPHP2542 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_arrayAccessCall_in_synpred157_TSPHP2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred162_TSPHP2808 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_synpred162_TSPHP2810 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred162_TSPHP2812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_synpred162_TSPHP2816 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_synpred162_TSPHP2817 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred162_TSPHP2819 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_synpred162_TSPHP2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred162_TSPHP2823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred167_TSPHP2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred179_TSPHP3426 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred179_TSPHP3428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred180_TSPHP3439 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred180_TSPHP3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred182_TSPHP3472 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred182_TSPHP3474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred190_TSPHP3509 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3512 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred190_TSPHP3517 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3519 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_caseLabel_in_synpred190_TSPHP3523 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred190_TSPHP3526 = new BitSet(new long[]{0x0860C48210180402L,0x57FF808202400100L});
}
