// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 09:38:25

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "VariableId", "Void", "While", "Whitespace"
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
	public static final int NotEqual=76;
	public static final int NotEqualAlternative=77;
	public static final int NotIdentical=78;
	public static final int Null=79;
	public static final int OCTAL=80;
	public static final int Plus=81;
	public static final int PlusEqual=82;
	public static final int PlusPlus=83;
	public static final int Private=84;
	public static final int Protected=85;
	public static final int Public=86;
	public static final int QuestionMark=87;
	public static final int Return=88;
	public static final int RightCurlyBrace=89;
	public static final int RightParanthesis=90;
	public static final int RightSquareBrace=91;
	public static final int STRING_DOUBLE_QUOTED=92;
	public static final int STRING_SINGLE_QUOTED=93;
	public static final int Semicolon=94;
	public static final int ShiftLeft=95;
	public static final int ShiftLeftEqual=96;
	public static final int ShiftRight=97;
	public static final int ShiftRightEqual=98;
	public static final int Static=99;
	public static final int String=100;
	public static final int Switch=101;
	public static final int Try=102;
	public static final int TypeArray=103;
	public static final int TypeBool=104;
	public static final int TypeBoolean=105;
	public static final int TypeFloat=106;
	public static final int TypeInt=107;
	public static final int TypeObject=108;
	public static final int TypeResource=109;
	public static final int TypeString=110;
	public static final int VariableId=111;
	public static final int Void=112;
	public static final int While=113;
	public static final int Whitespace=114;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:163:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog817);
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

					match(input,EOF,FOLLOW_EOF_in_prog820); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog825);
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

					match(input,EOF,FOLLOW_EOF_in_prog828); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog833);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog835); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon848); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon850);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon852); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:169:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon854);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:171:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket867); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket869);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket872); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:172:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket874);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket877); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId943); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId946); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId948); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace961);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:187:1: statement : ( definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:2: ( definition | instructionWithoutBreakContinue )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Abstract||LA9_0==Class||LA9_0==Final||LA9_0==Function||LA9_0==Interface) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement972);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement977);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:2: ( classDeclaration | interfaceDeclaration | functionDeclaration )
			int alt10=3;
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
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition988);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition993);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition998);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: ( 'abstract' | 'final' )?
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

			match(input,Class,FOLLOW_Class_in_classDeclaration1020); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1022); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:45: ( extendsDeclaration )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Extends) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1024);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:65: ( implementsDeclaration )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Implements) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1027);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1030); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1032);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1035); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1049); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1051);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1060); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:15: ( ',' Identifier )*
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1063); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1065); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1076); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1078);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:1: classBody : ( constantDeclaration | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:2: ( constantDeclaration | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_classBody1088);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1093);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1099);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:1: constantDeclaration : 'const' primitiveTypes constDeclarationList ';' ;
	public final void constantDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:20: ( 'const' primitiveTypes constDeclarationList ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:22: 'const' primitiveTypes constDeclarationList ';'
			{
			match(input,Const,FOLLOW_Const_in_constantDeclaration1108); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constantDeclaration1110);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constDeclarationList_in_constantDeclaration1112);
			constDeclarationList();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_constantDeclaration1114); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:1: constDeclarationList : constantAssignment ( ',' constantAssignment )* ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:2: ( constantAssignment ( ',' constantAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:5: constantAssignment ( ',' constantAssignment )*
			{
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1124);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:24: ( ',' constantAssignment )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Comma) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:25: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1127); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1129);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1139); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1142); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1144);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1153);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:24: ( ',' variableAssignment )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1156); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1158);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: ( 'static' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Static) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1170); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1173);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1175);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1177); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1184);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1189); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1212);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:24: ( ',' ( variableAssignment | VariableId ) )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1215); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1218);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1220); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1235); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:34: ( accessorWithoutPrivate )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1237);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1251); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:15: ( 'final' )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==Final) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1253); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1261); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:14: ( 'static' )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==Static) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1263); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:6: ( accessor )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= Private && LA27_0 <= Public)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1277);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1284);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1294); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1296); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:27: ( implementsDeclaration )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Implements) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1298);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1301); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:54: ( interfaceBody )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Const||LA30_0==Function||LA30_0==Public) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1303);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop30;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1306); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:1: interfaceBody : ( constantDeclaration | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:2: ( constantDeclaration | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_interfaceBody1315);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1320);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'public' )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Public) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1331); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1334);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1336); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1352);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1354); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:40: ( instructionWithoutBreakContinue )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Backslash||LA33_0==Do||LA33_0==Echo||LA33_0==Exit||(LA33_0 >= For && LA33_0 <= Foreach)||(LA33_0 >= Identifier && LA33_0 <= If)||LA33_0==LeftCurlyBrace||LA33_0==MinusMinus||LA33_0==PlusPlus||LA33_0==Return||(LA33_0 >= Switch && LA33_0 <= VariableId)||LA33_0==While) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1356);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1359); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1369); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1371);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1373); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1375); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:41: ( paramList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Backslash||LA34_0==Identifier||(LA34_0 >= TypeArray && LA34_0 <= TypeString)) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1377);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1380); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1390);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1394); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: allTypes : ( primitiveTypesExtended | classInterfaceType );
	public final void allTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:9: ( primitiveTypesExtended | classInterfaceType )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1401);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:36: classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_allTypes1405);
					classInterfaceType();
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1446);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1451); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1463);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1468); if (state.failed) return ;
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



	// $ANTLR start "classInterfaceType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:1: classInterfaceType : ( TypeObject | ( '\\\\' )? namespaceId );
	public final void classInterfaceType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:2: ( TypeObject | ( '\\\\' )? namespaceId )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceType1480); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:4: ( '\\\\' )? namespaceId
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:4: ( '\\\\' )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==Backslash) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:4: '\\\\'
							{
							match(input,Backslash,FOLLOW_Backslash_in_classInterfaceType1489); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_namespaceId_in_classInterfaceType1492);
					namespaceId();
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
	// $ANTLR end "classInterfaceType"



	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt45=3;
			alt45 = dfa45.predict(input);
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1505);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:29: ( ',' paramDeclarationOptional )*
					loop41:
					do {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==Comma) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1508); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1510);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1517);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:21: ( ',' paramDeclaration )*
					loop42:
					do {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==Comma) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1520); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1522);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1529);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:21: ( paramDeclaration ',' )*
					loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==Backslash||LA43_0==Identifier||(LA43_0 >= TypeArray && LA43_0 <= TypeString)) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1532);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1534); if (state.failed) return ;
							}
							break;

						default :
							break loop43;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:45: ( ',' paramDeclarationOptional )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1539); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1541);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1555);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1557); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1567);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1570); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1572);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1594); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:8: ( instructionWithoutBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1596);
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1600); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1605);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1616); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:8: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1618);
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1622); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1627);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:25: ( Int )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==Int) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1638); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1641); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt52=12;
			switch ( input.LA(1) ) {
			case MinusMinus:
			case PlusPlus:
			case VariableId:
				{
				alt52=1;
				}
				break;
			case Backslash:
			case Identifier:
			case TypeArray:
			case TypeBool:
			case TypeBoolean:
			case TypeFloat:
			case TypeInt:
			case TypeObject:
			case TypeResource:
			case TypeString:
				{
				alt52=2;
				}
				break;
			case If:
				{
				alt52=3;
				}
				break;
			case Switch:
				{
				alt52=4;
				}
				break;
			case For:
				{
				alt52=5;
				}
				break;
			case Foreach:
				{
				alt52=6;
				}
				break;
			case While:
				{
				alt52=7;
				}
				break;
			case Do:
				{
				alt52=8;
				}
				break;
			case Try:
				{
				alt52=9;
				}
				break;
			case Return:
				{
				alt52=10;
				}
				break;
			case Echo:
				{
				alt52=11;
				}
				break;
			case Exit:
				{
				alt52=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1653);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1655); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1660);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1662); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1667);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1672);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1677);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1682);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1687);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1692);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction1697);
					tryCatch();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1702); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:13: ( expression )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==At||LA51_0==BitwiseNot||LA51_0==Bool||LA51_0==Float||LA51_0==Int||(LA51_0 >= LeftParanthesis && LA51_0 <= LeftSquareBrace)||LA51_0==LogicNot||LA51_0==Minus||LA51_0==MinusMinus||LA51_0==NULL||LA51_0==Null||LA51_0==Plus||LA51_0==PlusPlus||LA51_0==String||LA51_0==TypeArray||LA51_0==VariableId) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1704);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1707); if (state.failed) return ;
					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1712); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1714);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1716); if (state.failed) return ;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:4: 'exit' ';'
					{
					match(input,Exit,FOLLOW_Exit_in_instruction1721); if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1723); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1735);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:15: ( ',' expression )*
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==Comma) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1738); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1740);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1751); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1753);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1755);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1760);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1765);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement1843); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement1865); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration1877);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1879); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:24: ( '=' expression )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==Assign) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration1882); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration1884);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression1896);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1905);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:17: ( 'or' logicXorWeak )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==LogicOrWeak) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak1908); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1910);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1923);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:17: ( 'xor' logicAndWeak )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==LogicXorWeak) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak1926); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1928);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak1941);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:15: ( 'and' assignment )*
			loop58:
			do {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==LogicAndWeak) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak1944); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak1946);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment1957);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:12: ( assignmentOperator ternary )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==Assign||LA59_0==BitwiseAndEqual||LA59_0==BitwiseOrEqual||LA59_0==BitwiseXorEqual||LA59_0==DivideEqual||LA59_0==DotEqual||LA59_0==MinusEqual||LA59_0==ModuloEqual||LA59_0==MultiplyEqual||LA59_0==PlusEqual||LA59_0==ShiftLeftEqual||LA59_0==ShiftRightEqual) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment1960);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment1962);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary1972);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:19: ( '?' expression ':' logicOr )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==QuestionMark) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary1975); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary1977);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary1979); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary1981);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr1991);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:20: ( '||' logicAnd )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicOr) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr1994); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr1996);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2005);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:21: ( '&&' bitwiseOr )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicAnd) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2008); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2010);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2021);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:15: ( '|' bitwiseXor )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==BitwiseOr) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2024); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2026);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2037);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:15: ( '^' bitwiseAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==BitwiseXor) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2040); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2042);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd2053);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:13: ( '&' equality )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==BitwiseAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2056); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd2058);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2067);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:22: ( equalityOperator comparison )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==Equal||LA66_0==Identical||(LA66_0 >= NotEqual && LA66_0 <= NotIdentical)) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2070);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2072);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2114);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:17: ( comparisonOperator bitwiseShift )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= GreaterEqualThan && LA67_0 <= GreaterThan)||(LA67_0 >= LessEqualThan && LA67_0 <= LessThan)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2117);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2119);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2155);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==ShiftLeft||LA68_0==ShiftRight) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2164);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2174);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:36: ( ( '+' | '-' | '.' ) factor )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==Dot||LA69_0==Minus||LA69_0==Plus) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2185);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2195);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==Divide||LA70_0==Modulo||LA70_0==Multiply) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2206);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:9: ( '!' logicNot | castOrBitwiseNotOrAt )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==LogicNot) ) {
				alt71=1;
			}
			else if ( (LA71_0==At||LA71_0==BitwiseNot||LA71_0==Bool||LA71_0==Float||LA71_0==Int||(LA71_0 >= LeftParanthesis && LA71_0 <= LeftSquareBrace)||LA71_0==Minus||LA71_0==MinusMinus||LA71_0==NULL||LA71_0==Null||LA71_0==Plus||LA71_0==PlusPlus||LA71_0==String||LA71_0==TypeArray||LA71_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2215); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2217);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot2222);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:2: ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
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
				case Int:
				case LeftParanthesis:
				case LeftSquareBrace:
				case LogicNot:
				case Minus:
				case MinusMinus:
				case NULL:
				case Null:
				case Plus:
				case PlusPlus:
				case String:
				case VariableId:
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
			case Int:
			case LeftSquareBrace:
			case Minus:
			case MinusMinus:
			case NULL:
			case Null:
			case Plus:
			case PlusPlus:
			case String:
			case TypeArray:
			case VariableId:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: ( '(' primitiveTypesInclArray ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:5: '(' primitiveTypesInclArray ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2236); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2238);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2240); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2243);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2248); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2250);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2255); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2257);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2262);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | unaryAtom );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:2: ( postIncrementDecrement | preIncrementDecrement | unaryAtom )
			int alt73=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA73_1 = input.LA(2);
				if ( (LA73_1==MinusMinus||LA73_1==PlusPlus) ) {
					alt73=1;
				}
				else if ( (LA73_1==EOF||LA73_1==Arrow||LA73_1==Assign||(LA73_1 >= BitwiseAnd && LA73_1 <= BitwiseAndEqual)||(LA73_1 >= BitwiseOr && LA73_1 <= BitwiseXorEqual)||(LA73_1 >= Colon && LA73_1 <= Comma)||(LA73_1 >= Divide && LA73_1 <= DivideEqual)||(LA73_1 >= Dot && LA73_1 <= DotEqual)||LA73_1==Equal||(LA73_1 >= GreaterEqualThan && LA73_1 <= GreaterThan)||LA73_1==Identical||(LA73_1 >= LessEqualThan && LA73_1 <= LogicAndWeak)||(LA73_1 >= LogicOr && LA73_1 <= MinusEqual)||(LA73_1 >= Modulo && LA73_1 <= MultiplyEqual)||(LA73_1 >= NotEqual && LA73_1 <= NotIdentical)||(LA73_1 >= Plus && LA73_1 <= PlusEqual)||LA73_1==QuestionMark||(LA73_1 >= RightParanthesis && LA73_1 <= RightSquareBrace)||(LA73_1 >= Semicolon && LA73_1 <= ShiftRightEqual)) ) {
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
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case NULL:
			case Null:
			case Plus:
			case String:
			case TypeArray:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2274);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2279);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_incrementDecrement2284);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:1: unaryAtom : ( '+' atom | '-' atom | atom );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:2: ( '+' atom | '-' atom | atom )
			int alt74=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt74=1;
				}
				break;
			case Minus:
				{
				alt74=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:4: '+' atom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2295); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2297);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: '-' atom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2302); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2304);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: atom
					{
					pushFollow(FOLLOW_atom_in_unaryAtom2309);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: atom : ( '(' expression ')' | primitiveAtom | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:6: ( '(' expression ')' | primitiveAtom | array | VariableId )
			int alt75=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt75=1;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt75=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt75=3;
				}
				break;
			case VariableId:
				{
				alt75=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2321); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2323);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2325); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2330);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:4: array
					{
					pushFollow(FOLLOW_array_in_atom2335);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2340); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt76=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt76=1;
				}
				break;
			case Minus:
				{
				alt76=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt76=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2354); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2356);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2361); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2363);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2368);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:475:2: ( Bool | Int | Float | String | Null | NULL )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LeftSquareBrace) ) {
				alt79=1;
			}
			else if ( (LA79_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array2866); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:13: ( array_content )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==At||LA77_0==BitwiseNot||LA77_0==Bool||LA77_0==Float||LA77_0==Int||(LA77_0 >= LeftParanthesis && LA77_0 <= LeftSquareBrace)||LA77_0==LogicNot||LA77_0==Minus||LA77_0==MinusMinus||LA77_0==NULL||LA77_0==Null||LA77_0==Plus||LA77_0==PlusPlus||LA77_0==String||LA77_0==TypeArray||LA77_0==VariableId) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2868);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array2871); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array2877); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array2879); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:18: ( array_content )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==At||LA78_0==BitwiseNot||LA78_0==Bool||LA78_0==Float||LA78_0==Int||(LA78_0 >= LeftParanthesis && LA78_0 <= LeftSquareBrace)||LA78_0==LogicNot||LA78_0==Minus||LA78_0==MinusMinus||LA78_0==NULL||LA78_0==Null||LA78_0==Plus||LA78_0==PlusPlus||LA78_0==String||LA78_0==TypeArray||LA78_0==VariableId) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2881);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array2884); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: ( expression '=>' )?
			int alt80=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA80_1 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA80_2 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA80_3 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case At:
					{
					int LA80_4 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case VariableId:
					{
					int LA80_5 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA80_6 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case Plus:
					{
					int LA80_7 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case Minus:
					{
					int LA80_8 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
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
					int LA80_9 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA80_10 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA80_11 = input.LA(2);
					if ( (synpred141_TSPHP()) ) {
						alt80=1;
					}
					}
					break;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content2897);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content2899); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content2903);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:35: ( ',' ( expression '=>' )? expression )*
			loop82:
			do {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==Comma) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content2907); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:40: ( expression '=>' )?
					int alt81=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA81_1 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA81_2 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA81_3 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case At:
							{
							int LA81_4 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case VariableId:
							{
							int LA81_5 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA81_6 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case Plus:
							{
							int LA81_7 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case Minus:
							{
							int LA81_8 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
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
							int LA81_9 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA81_10 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA81_11 = input.LA(2);
							if ( (synpred142_TSPHP()) ) {
								alt81=1;
							}
							}
							break;
					}
					switch (alt81) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content2910);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content2912); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content2916);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop82;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition2928); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition2930); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition2932);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition2934); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition2936);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:3: ( 'else' instructionInclBreakContinue )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==Else) ) {
				int LA83_1 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt83=1;
				}
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:5: 'else' instructionInclBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition2943); if (state.failed) return ;
					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition2945);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2961); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition2963); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition2965); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition2967); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition2969); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==Case) ) {
				int LA96_1 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt96=1;
				}
				else if ( (true) ) {
					alt96=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2980);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: ( instructionInclBreakContinue )+
							int cnt85=0;
							loop85:
							do {
								int alt85=2;
								int LA85_0 = input.LA(1);
								if ( (LA85_0==Backslash||LA85_0==Break||LA85_0==Continue||LA85_0==Do||LA85_0==Echo||LA85_0==Exit||(LA85_0 >= For && LA85_0 <= Foreach)||(LA85_0 >= Identifier && LA85_0 <= If)||LA85_0==LeftCurlyBrace||LA85_0==MinusMinus||LA85_0==PlusPlus||LA85_0==Return||(LA85_0 >= Switch && LA85_0 <= VariableId)||LA85_0==While) ) {
									alt85=1;
								}

								switch (alt85) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2983);
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition2988);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: ( instructionInclBreakContinue )+
					int cnt87=0;
					loop87:
					do {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==Backslash||LA87_0==Break||LA87_0==Continue||LA87_0==Do||LA87_0==Echo||LA87_0==Exit||(LA87_0 >= For && LA87_0 <= Foreach)||(LA87_0 >= Identifier && LA87_0 <= If)||LA87_0==LeftCurlyBrace||LA87_0==MinusMinus||LA87_0==PlusPlus||LA87_0==Return||(LA87_0 >= Switch && LA87_0 <= VariableId)||LA87_0==While) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2990);
							instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return ;
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+
							int cnt88=0;
							loop88:
							do {
								int alt88=2;
								int LA88_0 = input.LA(1);
								if ( (LA88_0==Case) ) {
									alt88=1;
								}

								switch (alt88) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition2994);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: ( instructionInclBreakContinue )+
							int cnt89=0;
							loop89:
							do {
								int alt89=2;
								int LA89_0 = input.LA(1);
								if ( (LA89_0==Backslash||LA89_0==Break||LA89_0==Continue||LA89_0==Do||LA89_0==Echo||LA89_0==Exit||(LA89_0 >= For && LA89_0 <= Foreach)||(LA89_0 >= Identifier && LA89_0 <= If)||LA89_0==LeftCurlyBrace||LA89_0==MinusMinus||LA89_0==PlusPlus||LA89_0==Return||(LA89_0 >= Switch && LA89_0 <= VariableId)||LA89_0==While) ) {
									alt89=1;
								}

								switch (alt89) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition2997);
									instructionInclBreakContinue();
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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt93=0;
					loop93:
					do {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==Case) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3007);
									caseLabel();
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:17: ( instructionInclBreakContinue )+
							int cnt92=0;
							loop92:
							do {
								int alt92=2;
								int LA92_0 = input.LA(1);
								if ( (LA92_0==Backslash||LA92_0==Break||LA92_0==Continue||LA92_0==Do||LA92_0==Echo||LA92_0==Exit||(LA92_0 >= For && LA92_0 <= Foreach)||(LA92_0 >= Identifier && LA92_0 <= If)||LA92_0==LeftCurlyBrace||LA92_0==MinusMinus||LA92_0==PlusPlus||LA92_0==Return||(LA92_0 >= Switch && LA92_0 <= VariableId)||LA92_0==While) ) {
									alt92=1;
								}

								switch (alt92) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3010);
									instructionInclBreakContinue();
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==Default) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3016);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:63: ( instructionInclBreakContinue )+
							int cnt94=0;
							loop94:
							do {
								int alt94=2;
								int LA94_0 = input.LA(1);
								if ( (LA94_0==Backslash||LA94_0==Break||LA94_0==Continue||LA94_0==Do||LA94_0==Echo||LA94_0==Exit||(LA94_0 >= For && LA94_0 <= Foreach)||(LA94_0 >= Identifier && LA94_0 <= If)||LA94_0==LeftCurlyBrace||LA94_0==MinusMinus||LA94_0==PlusPlus||LA94_0==Return||(LA94_0 >= Switch && LA94_0 <= VariableId)||LA94_0==While) ) {
									alt94=1;
								}

								switch (alt94) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3018);
									instructionInclBreakContinue();
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

							}
							break;

					}

					}
					break;

			}

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3029); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:1: caseLabel : 'case' expression ':' ;
	public final void caseLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:4: 'case' expression ':'
			{
			match(input,Case,FOLLOW_Case_in_caseLabel3041); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3043);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3045); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:1: defaultLabel : 'default' ':' ;
	public final void defaultLabel() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: 'default' ':'
			{
			match(input,Default,FOLLOW_Default_in_defaultLabel3054); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3056); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop3065); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3067); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:21: ( forInit )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==Backslash||LA97_0==Identifier||LA97_0==MinusMinus||LA97_0==PlusPlus||(LA97_0 >= TypeArray && LA97_0 <= VariableId)) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3069);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3072); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:34: ( expressionList )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==At||LA98_0==BitwiseNot||LA98_0==Bool||LA98_0==Float||LA98_0==Int||(LA98_0 >= LeftParanthesis && LA98_0 <= LeftSquareBrace)||LA98_0==LogicNot||LA98_0==Minus||LA98_0==MinusMinus||LA98_0==NULL||LA98_0==Null||LA98_0==Plus||LA98_0==PlusPlus||LA98_0==String||LA98_0==TypeArray||LA98_0==VariableId) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3074);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3078); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:55: ( forUpdate )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==MinusMinus||LA99_0==PlusPlus||LA99_0==VariableId) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3080);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3083); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3085);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:11: ( variableDeclaration | variableAssignment )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==Backslash||LA100_0==Identifier||(LA100_0 >= TypeArray && LA100_0 <= TypeString)) ) {
				alt100=1;
			}
			else if ( (LA100_0==MinusMinus||LA100_0==PlusPlus||LA100_0==VariableId) ) {
				alt100=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3094);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3096);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:52: ( ',' variableAssignment )*
			loop101:
			do {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==Comma) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit3100); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit3102);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop101;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate3112);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:23: ( ',' variableAssignment )*
			loop102:
			do {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==Comma) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate3115); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate3117);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop102;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3128); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3130); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:18: ( VariableId | array )
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==VariableId) ) {
				alt103=1;
			}
			else if ( (LA103_0==LeftSquareBrace||LA103_0==TypeArray) ) {
				alt103=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3133); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3135);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop3138); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3140); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:53: ( '=>' VariableId )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==Arrow) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3143); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3145); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3149); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3151);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop3160); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3162); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop3164);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3166); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3168);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3178); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3180);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3182); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3184); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3186);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3188); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3190); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceType VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final void tryCatch() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceType VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceType VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3197); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3199); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:21: ( instructionInclBreakContinue )+
			int cnt105=0;
			loop105:
			do {
				int alt105=2;
				int LA105_0 = input.LA(1);
				if ( (LA105_0==Backslash||LA105_0==Break||LA105_0==Continue||LA105_0==Do||LA105_0==Echo||LA105_0==Exit||(LA105_0 >= For && LA105_0 <= Foreach)||(LA105_0 >= Identifier && LA105_0 <= If)||LA105_0==LeftCurlyBrace||LA105_0==MinusMinus||LA105_0==PlusPlus||LA105_0==Return||(LA105_0 >= Switch && LA105_0 <= VariableId)||LA105_0==While) ) {
					alt105=1;
				}

				switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3201);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3204); if (state.failed) return ;
			match(input,Catch,FOLLOW_Catch_in_tryCatch3206); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3208); if (state.failed) return ;
			pushFollow(FOLLOW_classInterfaceType_in_tryCatch3210);
			classInterfaceType();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_tryCatch3212); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3214); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3215); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:104: ( instructionInclBreakContinue )*
			loop106:
			do {
				int alt106=2;
				int LA106_0 = input.LA(1);
				if ( (LA106_0==Backslash||LA106_0==Break||LA106_0==Continue||LA106_0==Do||LA106_0==Echo||LA106_0==Exit||(LA106_0 >= For && LA106_0 <= Foreach)||(LA106_0 >= Identifier && LA106_0 <= If)||LA106_0==LeftCurlyBrace||LA106_0==MinusMinus||LA106_0==PlusPlus||LA106_0==Return||(LA106_0 >= Switch && LA106_0 <= VariableId)||LA106_0==While) ) {
					alt106=1;
				}

				switch (alt106) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:104: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3217);
					instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop106;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3220); if (state.failed) return ;
			}

		}
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

	// $ANTLR start synpred141_TSPHP
	public final void synpred141_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred141_TSPHP2897);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred141_TSPHP2899); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred141_TSPHP

	// $ANTLR start synpred142_TSPHP
	public final void synpred142_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred142_TSPHP2910);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred142_TSPHP2912); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred142_TSPHP

	// $ANTLR start synpred144_TSPHP
	public final void synpred144_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred144_TSPHP2943); if (state.failed) return ;
		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred144_TSPHP2945);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred144_TSPHP

	// $ANTLR start synpred152_TSPHP
	public final void synpred152_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt126=0;
		loop126:
		do {
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==Case) ) {
				alt126=1;
			}

			switch (alt126) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+
				int cnt124=0;
				loop124:
				do {
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==Case) ) {
						alt124=1;
					}

					switch (alt124) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred152_TSPHP2980);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: ( instructionInclBreakContinue )+
				int cnt125=0;
				loop125:
				do {
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==Backslash||LA125_0==Break||LA125_0==Continue||LA125_0==Do||LA125_0==Echo||LA125_0==Exit||(LA125_0 >= For && LA125_0 <= Foreach)||(LA125_0 >= Identifier && LA125_0 <= If)||LA125_0==LeftCurlyBrace||LA125_0==MinusMinus||LA125_0==PlusPlus||LA125_0==Return||(LA125_0 >= Switch && LA125_0 <= VariableId)||LA125_0==While) ) {
						alt125=1;
					}

					switch (alt125) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2983);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt125 >= 1 ) break loop125;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(125, input);
							throw eee;
					}
					cnt125++;
				} while (true);

				}
				break;

			default :
				if ( cnt126 >= 1 ) break loop126;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(126, input);
					throw eee;
			}
			cnt126++;
		} while (true);

		pushFollow(FOLLOW_defaultLabel_in_synpred152_TSPHP2988);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: ( instructionInclBreakContinue )+
		int cnt127=0;
		loop127:
		do {
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Backslash||LA127_0==Break||LA127_0==Continue||LA127_0==Do||LA127_0==Echo||LA127_0==Exit||(LA127_0 >= For && LA127_0 <= Foreach)||(LA127_0 >= Identifier && LA127_0 <= If)||LA127_0==LeftCurlyBrace||LA127_0==MinusMinus||LA127_0==PlusPlus||LA127_0==Return||(LA127_0 >= Switch && LA127_0 <= VariableId)||LA127_0==While) ) {
				alt127=1;
			}

			switch (alt127) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2990);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				if ( cnt127 >= 1 ) break loop127;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(127, input);
					throw eee;
			}
			cnt127++;
		} while (true);

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+
				int cnt128=0;
				loop128:
				do {
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==Case) ) {
						alt128=1;
					}

					switch (alt128) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred152_TSPHP2994);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt128 >= 1 ) break loop128;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(128, input);
							throw eee;
					}
					cnt128++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: ( instructionInclBreakContinue )+
				int cnt129=0;
				loop129:
				do {
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==Backslash||LA129_0==Break||LA129_0==Continue||LA129_0==Do||LA129_0==Echo||LA129_0==Exit||(LA129_0 >= For && LA129_0 <= Foreach)||(LA129_0 >= Identifier && LA129_0 <= If)||LA129_0==LeftCurlyBrace||LA129_0==MinusMinus||LA129_0==PlusPlus||LA129_0==Return||(LA129_0 >= Switch && LA129_0 <= VariableId)||LA129_0==While) ) {
						alt129=1;
					}

					switch (alt129) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2997);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

					default :
						if ( cnt129 >= 1 ) break loop129;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(129, input);
							throw eee;
					}
					cnt129++;
				} while (true);

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

		}

	}
	// $ANTLR end synpred152_TSPHP

	// Delegated rules

	public final boolean synpred152_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred152_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred141_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred141_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred144_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred144_TSPHP_fragment(); // can never throw exception
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
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\63\1\uffff\1\12\1\uffff\1\63\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\161\1\70\1\uffff\1\136\1\uffff\1\63\1\uffff\1\136";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\11\uffff\1\2\4\uffff\1\2\2\uffff\1\2\1"+
			"\uffff\1\2\1\uffff\3\2\4\uffff\2\2\2\uffff\2\2\14\uffff\1\2\5\uffff\1"+
			"\1\7\uffff\1\2\4\uffff\1\2\14\uffff\13\2\1\uffff\1\2",
			"\1\3\4\uffff\1\4",
			"",
			"\1\5\55\uffff\1\4\45\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\55\uffff\1\4\45\uffff\1\6"
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
			return "163:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA45_eotS =
		"\27\uffff";
	static final String DFA45_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA45_minS =
		"\1\12\4\157\1\63\1\12\1\7\1\63\1\uffff\1\12\2\uffff\1\12\4\157\1\63\1"+
		"\12\1\7\1\63\1\12";
	static final String DFA45_maxS =
		"\1\156\4\157\1\63\1\157\1\156\1\63\1\uffff\1\156\2\uffff\5\157\1\63\1"+
		"\157\1\132\1\63\1\157";
	static final String DFA45_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA45_specialS =
		"\27\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\5\50\uffff\1\6\63\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\144\uffff\1\7",
			"\1\11\2\uffff\1\14\15\uffff\1\12\32\uffff\1\14\46\uffff\1\13\14\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\50\uffff\1\23\63\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\144\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\144\uffff\1\24",
			"\1\14\20\uffff\1\13\101\uffff\1\13",
			"\1\26",
			"\1\25\144\uffff\1\24"
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
			return "302:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_EOF_in_prog820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_EOF_in_prog828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog833 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon848 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon850 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon852 = new BitSet(new long[]{0x0198752100400410L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon854 = new BitSet(new long[]{0x0198752100400412L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket867 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket869 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket872 = new BitSet(new long[]{0x0198752100400410L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket874 = new BitSet(new long[]{0x0198752100400410L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId943 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId946 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId948 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace961 = new BitSet(new long[]{0x0198752100400412L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_definition_in_statement972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1020 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1022 = new BitSet(new long[]{0x0120020000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1024 = new BitSet(new long[]{0x0120000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1027 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1030 = new BitSet(new long[]{0x0000440004000010L,0x0000000800700000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1032 = new BitSet(new long[]{0x0000440004000010L,0x0000000802700000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1049 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1060 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1063 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1065 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1076 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_classBody1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constantDeclaration1108 = new BitSet(new long[]{0x0000000000000000L,0x00004F0000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constantDeclaration1110 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_constDeclarationList_in_constantDeclaration1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_constantDeclaration1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1124 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1127 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1129 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1139 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1142 = new BitSet(new long[]{0x0040080000040000L,0x0000001000028408L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1153 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1156 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080020L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1158 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000700000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1173 = new BitSet(new long[]{0x0008000000000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1212 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1215 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080020L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1218 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1220 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1235 = new BitSet(new long[]{0x0000400000000000L,0x0000000000600000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1237 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1251 = new BitSet(new long[]{0x0000440000000000L,0x0000000000700000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1253 = new BitSet(new long[]{0x0000400000000000L,0x0000000000700000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1261 = new BitSet(new long[]{0x0000400000000000L,0x0000000800700000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1263 = new BitSet(new long[]{0x0000400000000000L,0x0000000000700000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1277 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1294 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1296 = new BitSet(new long[]{0x0120000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1298 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1301 = new BitSet(new long[]{0x0000400004000000L,0x0000000002400000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1303 = new BitSet(new long[]{0x0000400004000000L,0x0000000002400000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_interfaceBody1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1331 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1352 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1354 = new BitSet(new long[]{0x0118312100000400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1356 = new BitSet(new long[]{0x0118312100000400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1369 = new BitSet(new long[]{0x0008000000000400L,0x00017F8000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1371 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1373 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1375 = new BitSet(new long[]{0x0008000000000400L,0x00007F8004000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceType_in_allTypes1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceType1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceType1489 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceType1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1505 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1508 = new BitSet(new long[]{0x0008000000000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1510 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1517 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1520 = new BitSet(new long[]{0x0008000000000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1522 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1529 = new BitSet(new long[]{0x0008000001000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1532 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1534 = new BitSet(new long[]{0x0008000001000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1539 = new BitSet(new long[]{0x0008000000000400L,0x00007F8000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1541 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1555 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1567 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1570 = new BitSet(new long[]{0x0640080000040000L,0x0000809000028408L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1594 = new BitSet(new long[]{0x0118312100000400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1596 = new BitSet(new long[]{0x0118312100000400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1616 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1618 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1632 = new BitSet(new long[]{0x0040000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1702 = new BitSet(new long[]{0x8640080000042100L,0x00008090400A8428L});
	public static final BitSet FOLLOW_expression_in_instruction1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1712 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expressionList_in_instruction1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1735 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1738 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_expressionList1740 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1751 = new BitSet(new long[]{0x0000000880029080L,0x0000000500040290L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1753 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080020L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration1877 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1879 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration1882 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak1908 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1910 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1923 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak1926 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1941 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak1944 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1946 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment1957 = new BitSet(new long[]{0x0000000880029082L,0x0000000500040290L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment1960 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_ternary_in_assignment1962 = new BitSet(new long[]{0x0000000880029082L,0x0000000500040290L});
	public static final BitSet FOLLOW_logicOr_in_ternary1972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary1975 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_ternary1977 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_ternary1979 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicOr_in_ternary1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr1994 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1996 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2005 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2008 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2010 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2021 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2024 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2026 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2037 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2040 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2042 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2053 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2056 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2058 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2067 = new BitSet(new long[]{0x0004008000000002L,0x0000000000007000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2070 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_comparison_in_equality2072 = new BitSet(new long[]{0x0004008000000002L,0x0000000000007000L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2114 = new BitSet(new long[]{0x1801800000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2117 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2119 = new BitSet(new long[]{0x1801800000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2155 = new BitSet(new long[]{0x0000000000000002L,0x0000000280000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2158 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2164 = new BitSet(new long[]{0x0000000000000002L,0x0000000280000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2174 = new BitSet(new long[]{0x0000000400000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2177 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2185 = new BitSet(new long[]{0x0000000400000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_logicNot_in_factor2195 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000140L});
	public static final BitSet FOLLOW_set_in_factor2198 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicNot_in_factor2206 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000140L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2215 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot2222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2236 = new BitSet(new long[]{0x0000000000000000L,0x00004F8000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2240 = new BitSet(new long[]{0x0640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2248 = new BitSet(new long[]{0x0640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2255 = new BitSet(new long[]{0x0640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_incrementDecrement2284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2295 = new BitSet(new long[]{0x0640080000040000L,0x0000809000008400L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2302 = new BitSet(new long[]{0x0640080000040000L,0x0000809000008400L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2321 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_atom2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2354 = new BitSet(new long[]{0x0040080000040000L,0x0000001000008400L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2361 = new BitSet(new long[]{0x0040080000040000L,0x0000001000008400L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array2866 = new BitSet(new long[]{0x8640080000042100L,0x00008090080A8428L});
	public static final BitSet FOLLOW_array_content_in_array2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array2871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array2877 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array2879 = new BitSet(new long[]{0x8640080000042100L,0x00008090040A8428L});
	public static final BitSet FOLLOW_array_content_in_array2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array2884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content2897 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2899 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_array_content2903 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_array_content2907 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_array_content2910 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2912 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_array_content2916 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_If_in_ifCondition2928 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition2930 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_ifCondition2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition2934 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition2936 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition2943 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition2945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2961 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition2963 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition2967 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition2969 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2980 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2983 = new BitSet(new long[]{0x0118312128180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition2988 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2990 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition2994 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition2997 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3007 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3010 = new BitSet(new long[]{0x0118312128180400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3016 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3018 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3041 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_caseLabel3043 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3054 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3065 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3067 = new BitSet(new long[]{0x0008000000000400L,0x0000FF8040080020L});
	public static final BitSet FOLLOW_forInit_in_forLoop3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3072 = new BitSet(new long[]{0x8640080000042100L,0x00008090400A8428L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3078 = new BitSet(new long[]{0x0000000000000000L,0x0000800004080020L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3083 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3094 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3096 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3100 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080020L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3102 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3112 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3115 = new BitSet(new long[]{0x0000000000000000L,0x0000800000080020L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3117 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3128 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3130 = new BitSet(new long[]{0x0400000000000000L,0x0000808000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3133 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3135 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3138 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3140 = new BitSet(new long[]{0x0000000000000020L,0x0000000004000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3143 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3149 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3160 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3162 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_whileLoop3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3166 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3178 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3180 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3182 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3184 = new BitSet(new long[]{0x8640080000042100L,0x00008090000A8428L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3188 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3197 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3199 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3201 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3204 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3206 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3208 = new BitSet(new long[]{0x0008000000000400L,0x0000100000000000L});
	public static final BitSet FOLLOW_classInterfaceType_in_tryCatch3210 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3214 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3215 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3217 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE003080020L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred141_TSPHP2897 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred141_TSPHP2899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred142_TSPHP2910 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred142_TSPHP2912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred144_TSPHP2943 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred144_TSPHP2945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred152_TSPHP2980 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2983 = new BitSet(new long[]{0x0118312128180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred152_TSPHP2988 = new BitSet(new long[]{0x0118312108080400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2990 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_caseLabel_in_synpred152_TSPHP2994 = new BitSet(new long[]{0x0118312108180400L,0x0002FFE001080020L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred152_TSPHP2997 = new BitSet(new long[]{0x0118312108180402L,0x0002FFE001080020L});
}
