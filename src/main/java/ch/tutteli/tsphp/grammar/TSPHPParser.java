// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-28 01:01:31

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Class", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "EXPONENT", "Echo", "Else", "Equal", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "Plus", "PlusEqual", "PlusPlus", "Private", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "VariableId", "Void", "While", "Whitespace"
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
	public static final int Echo=36;
	public static final int Else=37;
	public static final int Equal=38;
	public static final int Extends=39;
	public static final int Final=40;
	public static final int Float=41;
	public static final int For=42;
	public static final int Foreach=43;
	public static final int Function=44;
	public static final int GreaterEqualThan=45;
	public static final int GreaterThan=46;
	public static final int HEXADECIMAL=47;
	public static final int Identical=48;
	public static final int Identifier=49;
	public static final int If=50;
	public static final int Implements=51;
	public static final int Int=52;
	public static final int Interface=53;
	public static final int LeftCurlyBrace=54;
	public static final int LeftParanthesis=55;
	public static final int LeftSquareBrace=56;
	public static final int LessEqualThan=57;
	public static final int LessThan=58;
	public static final int LogicAnd=59;
	public static final int LogicAndWeak=60;
	public static final int LogicNot=61;
	public static final int LogicOr=62;
	public static final int LogicOrWeak=63;
	public static final int LogicXorWeak=64;
	public static final int Minus=65;
	public static final int MinusEqual=66;
	public static final int MinusMinus=67;
	public static final int Modulo=68;
	public static final int ModuloEqual=69;
	public static final int Multiply=70;
	public static final int MultiplyEqual=71;
	public static final int Namespace=72;
	public static final int NotEqual=73;
	public static final int NotEqualAlternative=74;
	public static final int NotIdentical=75;
	public static final int Null=76;
	public static final int OCTAL=77;
	public static final int Plus=78;
	public static final int PlusEqual=79;
	public static final int PlusPlus=80;
	public static final int Private=81;
	public static final int Protected=82;
	public static final int Public=83;
	public static final int QuestionMark=84;
	public static final int Return=85;
	public static final int RightCurlyBrace=86;
	public static final int RightParanthesis=87;
	public static final int RightSquareBrace=88;
	public static final int STRING_DOUBLE_QUOTED=89;
	public static final int STRING_SINGLE_QUOTED=90;
	public static final int Semicolon=91;
	public static final int ShiftLeft=92;
	public static final int ShiftLeftEqual=93;
	public static final int ShiftRight=94;
	public static final int ShiftRightEqual=95;
	public static final int Static=96;
	public static final int String=97;
	public static final int Switch=98;
	public static final int TypeArray=99;
	public static final int TypeBool=100;
	public static final int TypeBoolean=101;
	public static final int TypeFloat=102;
	public static final int TypeInt=103;
	public static final int TypeObject=104;
	public static final int TypeResource=105;
	public static final int TypeString=106;
	public static final int VariableId=107;
	public static final int Void=108;
	public static final int While=109;
	public static final int Whitespace=110;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final void prog() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:8: ( namespaceSemicolon )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:159:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog785);
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

					match(input,EOF,FOLLOW_EOF_in_prog788); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:160:4: ( namespaceBracket )+ EOF
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:160:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:160:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog793);
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

					match(input,EOF,FOLLOW_EOF_in_prog796); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:161:4: withoutNamespace EOF
					{
					pushFollow(FOLLOW_withoutNamespace_in_prog801);
					withoutNamespace();
					state._fsp--;
					if (state.failed) return ;
					match(input,EOF,FOLLOW_EOF_in_prog803); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:164:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final void namespaceSemicolon() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:5: 'namespace' namespaceId ';' ( statement )+
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon816); if (state.failed) return ;
			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon818);
			namespaceId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon820); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Class||LA4_0==Do||LA4_0==Echo||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:165:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon822);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:167:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final void namespaceBracket() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket835); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket837);
					namespaceId();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket840); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Class||LA6_0==Do||LA6_0==Echo||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:168:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket842);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket845); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final void namespaceId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:4: Identifier ( '\\\\' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_namespaceId911); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:16: '\\\\' Identifier
					{
					match(input,Backslash,FOLLOW_Backslash_in_namespaceId914); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_namespaceId916); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:1: withoutNamespace : ( statement )+ ;
	public final void withoutNamespace() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: ( statement )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Class||LA8_0==Do||LA8_0==Echo||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:181:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace929);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:1: statement : ( definition | instructionWithoutBreakContinue );
	public final void statement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:2: ( definition | instructionWithoutBreakContinue )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Abstract||LA9_0==Class||LA9_0==Final||LA9_0==Function||LA9_0==Interface) ) {
				alt9=1;
			}
			else if ( (LA9_0==Do||LA9_0==Echo||(LA9_0 >= For && LA9_0 <= Foreach)||(LA9_0 >= Identifier && LA9_0 <= If)||LA9_0==LeftCurlyBrace||LA9_0==MinusMinus||LA9_0==PlusPlus||LA9_0==Return||(LA9_0 >= Switch && LA9_0 <= VariableId)||LA9_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement940);
					definition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement945);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration );
	public final void definition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:2: ( classDeclaration | interfaceDeclaration | functionDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition956);
					classDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition961);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition966);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final void classDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: ( 'abstract' | 'final' )?
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

			match(input,Class,FOLLOW_Class_in_classDeclaration985); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_classDeclaration987); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:45: ( extendsDeclaration )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Extends) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration989);
					extendsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:65: ( implementsDeclaration )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Implements) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration992);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration995); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration997);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1000); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:1: extendsDeclaration : 'extends' identifierList ;
	public final void extendsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: 'extends' identifierList
			{
			match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1014); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1016);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:1: identifierList : Identifier ( ',' Identifier )* ;
	public final void identifierList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: Identifier ( ',' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_identifierList1025); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:15: ( ',' Identifier )*
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:16: ',' Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_identifierList1028); if (state.failed) return ;
					match(input,Identifier,FOLLOW_Identifier_in_identifierList1030); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:1: implementsDeclaration : 'implements' identifierList ;
	public final void implementsDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: 'implements' identifierList
			{
			match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1041); if (state.failed) return ;
			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1043);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: classBody : ( constantDeclaration | attributeDeclaration | methodDeclaration );
	public final void classBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( constantDeclaration | attributeDeclaration | methodDeclaration )
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
					if ( (LA16_3==Identifier||(LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
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
					if ( (LA16_4==Identifier||(LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
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
				if ( (LA16_3==Identifier||(LA16_3 >= TypeArray && LA16_3 <= TypeString)) ) {
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
				if ( (LA16_4==Identifier||(LA16_4 >= TypeArray && LA16_4 <= TypeString)) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_classBody1053);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:4: attributeDeclaration
					{
					pushFollow(FOLLOW_attributeDeclaration_in_classBody1058);
					attributeDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBody1064);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:1: constantDeclaration : 'const' primitiveTypes constDeclarationList ';' ;
	public final void constantDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:20: ( 'const' primitiveTypes constDeclarationList ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:22: 'const' primitiveTypes constDeclarationList ';'
			{
			match(input,Const,FOLLOW_Const_in_constantDeclaration1073); if (state.failed) return ;
			pushFollow(FOLLOW_primitiveTypes_in_constantDeclaration1075);
			primitiveTypes();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_constDeclarationList_in_constantDeclaration1077);
			constDeclarationList();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_constantDeclaration1079); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:1: constDeclarationList : constantAssignment ( ',' constantAssignment )* ;
	public final void constDeclarationList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:2: ( constantAssignment ( ',' constantAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:5: constantAssignment ( ',' constantAssignment )*
			{
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1089);
			constantAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:24: ( ',' constantAssignment )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Comma) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:25: ',' constantAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_constDeclarationList1092); if (state.failed) return ;
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1094);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final void constantAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: Identifier '=' unaryPrimitiveAtom
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1104); if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_constantAssignment1107); if (state.failed) return ;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1109);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final void variableDeclarationListWithoutVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:4: variableDeclaration ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1118);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:24: ( ',' variableAssignment )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:25: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1121); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1123);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final void attributeDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( 'static' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Static) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: 'static'
					{
					match(input,Static,FOLLOW_Static_in_attributeDeclaration1135); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1138);
			accessor();
			state._fsp--;
			if (state.failed) return ;
			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1140);
			variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1142); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final void accessor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:11: accessorWithoutPrivate
					{
					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1149);
					accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: 'private'
					{
					match(input,Private,FOLLOW_Private_in_accessor1154); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final void accessorWithoutPrivate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final void variableDeclarationListInclVariableId() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1177);
			variableDeclaration();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:24: ( ',' ( variableAssignment | VariableId ) )*
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Comma) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:25: ',' ( variableAssignment | VariableId )
					{
					match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1180); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1183);
							variableAssignment();
							state._fsp--;
							if (state.failed) return ;
							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:49: VariableId
							{
							match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1185); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final void methodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:19: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:21: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:23: 'abstract' ( accessorWithoutPrivate )?
					{
					match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1200); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:34: ( accessorWithoutPrivate )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:34: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1202);
							accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:6: 'static' ( 'final' )?
							{
							match(input,Static,FOLLOW_Static_in_methodDeclaration1216); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:15: ( 'final' )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==Final) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:15: 'final'
									{
									match(input,Final,FOLLOW_Final_in_methodDeclaration1218); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:6: 'final' ( 'static' )?
							{
							match(input,Final,FOLLOW_Final_in_methodDeclaration1226); if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:14: ( 'static' )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==Static) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:14: 'static'
									{
									match(input,Static,FOLLOW_Static_in_methodDeclaration1228); if (state.failed) return ;
									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:6: ( accessor )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= Private && LA27_0 <= Public)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1242);
							accessor();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1249);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final void interfaceDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1259); if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1261); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:27: ( implementsDeclaration )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Implements) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1263);
					implementsDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1266); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:54: ( interfaceBody )*
			loop30:
			do {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Const||LA30_0==Function||LA30_0==Public) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1268);
					interfaceBody();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop30;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1271); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: interfaceBody : ( constantDeclaration | interfaceMethodDeclaration );
	public final void interfaceBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( constantDeclaration | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: constantDeclaration
					{
					pushFollow(FOLLOW_constantDeclaration_in_interfaceBody1280);
					constantDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1285);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final void interfaceMethodDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: ( 'public' )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Public) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: 'public'
					{
					match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1296); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1299);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1301); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final void functionDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1312);
			functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1314); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:40: ( instructionWithoutBreakContinue )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Do||LA33_0==Echo||(LA33_0 >= For && LA33_0 <= Foreach)||(LA33_0 >= Identifier && LA33_0 <= If)||LA33_0==LeftCurlyBrace||LA33_0==MinusMinus||LA33_0==PlusPlus||LA33_0==Return||(LA33_0 >= Switch && LA33_0 <= VariableId)||LA33_0==While) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1316);
					instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1319); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final void functionDeclarationWithoutBody() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1329); if (state.failed) return ;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1331);
			returnType();
			state._fsp--;
			if (state.failed) return ;
			match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1333); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1335); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:41: ( paramList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Identifier||(LA34_0 >= TypeArray && LA34_0 <= TypeString)) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1337);
					paramList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1340); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:1: returnType : ( allTypes | 'void' );
	public final void returnType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:2: ( allTypes | 'void' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Identifier||(LA35_0 >= TypeArray && LA35_0 <= TypeString)) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1350);
					allTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:15: 'void'
					{
					match(input,Void,FOLLOW_Void_in_returnType1354); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:1: allTypes : ( primitiveTypesExtended | classInterfaceType );
	public final void allTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:9: ( primitiveTypesExtended | classInterfaceType )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( ((LA36_0 >= TypeArray && LA36_0 <= TypeInt)||(LA36_0 >= TypeResource && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			else if ( (LA36_0==Identifier||LA36_0==TypeObject) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:11: primitiveTypesExtended
					{
					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1361);
					primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:36: classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_allTypes1365);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final void primitiveTypes() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final void primitiveTypesInclArray() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1406);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1411); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final void primitiveTypesExtended() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:4: primitiveTypesInclArray
					{
					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1423);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1428); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:1: classInterfaceType : ( TypeObject | Identifier );
	public final void classInterfaceType() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:2: ( TypeObject | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Identifier||input.LA(1)==TypeObject ) {
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
	// $ANTLR end "classInterfaceType"



	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final void paramList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt43=3;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeBoolean:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				int LA43_1 = input.LA(2);
				if ( (LA43_1==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt43=1;
						}
						break;
					case Comma:
						{
						switch ( input.LA(4) ) {
						case TypeBool:
						case TypeBoolean:
						case TypeFloat:
						case TypeInt:
						case TypeString:
							{
							int LA43_10 = input.LA(5);
							if ( (LA43_10==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeArray:
							{
							int LA43_11 = input.LA(5);
							if ( (LA43_11==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeResource:
							{
							int LA43_12 = input.LA(5);
							if ( (LA43_12==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case Identifier:
						case TypeObject:
							{
							int LA43_13 = input.LA(5);
							if ( (LA43_13==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 43, 7, input);
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
						alt43=2;
						}
						break;
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
						alt43=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 5, input);
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
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA43_2 = input.LA(2);
				if ( (LA43_2==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt43=1;
						}
						break;
					case Comma:
						{
						switch ( input.LA(4) ) {
						case TypeBool:
						case TypeBoolean:
						case TypeFloat:
						case TypeInt:
						case TypeString:
							{
							int LA43_10 = input.LA(5);
							if ( (LA43_10==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeArray:
							{
							int LA43_11 = input.LA(5);
							if ( (LA43_11==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeResource:
							{
							int LA43_12 = input.LA(5);
							if ( (LA43_12==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case Identifier:
						case TypeObject:
							{
							int LA43_13 = input.LA(5);
							if ( (LA43_13==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 43, 7, input);
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
						alt43=2;
						}
						break;
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
						alt43=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 5, input);
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
							new NoViableAltException("", 43, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeResource:
				{
				int LA43_3 = input.LA(2);
				if ( (LA43_3==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt43=1;
						}
						break;
					case Comma:
						{
						switch ( input.LA(4) ) {
						case TypeBool:
						case TypeBoolean:
						case TypeFloat:
						case TypeInt:
						case TypeString:
							{
							int LA43_10 = input.LA(5);
							if ( (LA43_10==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeArray:
							{
							int LA43_11 = input.LA(5);
							if ( (LA43_11==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeResource:
							{
							int LA43_12 = input.LA(5);
							if ( (LA43_12==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case Identifier:
						case TypeObject:
							{
							int LA43_13 = input.LA(5);
							if ( (LA43_13==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 43, 7, input);
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
						alt43=2;
						}
						break;
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
						alt43=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 5, input);
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
							new NoViableAltException("", 43, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
			case TypeObject:
				{
				int LA43_4 = input.LA(2);
				if ( (LA43_4==VariableId) ) {
					switch ( input.LA(3) ) {
					case Assign:
						{
						alt43=1;
						}
						break;
					case Comma:
						{
						switch ( input.LA(4) ) {
						case TypeBool:
						case TypeBoolean:
						case TypeFloat:
						case TypeInt:
						case TypeString:
							{
							int LA43_10 = input.LA(5);
							if ( (LA43_10==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeArray:
							{
							int LA43_11 = input.LA(5);
							if ( (LA43_11==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case TypeResource:
							{
							int LA43_12 = input.LA(5);
							if ( (LA43_12==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case Identifier:
						case TypeObject:
							{
							int LA43_13 = input.LA(5);
							if ( (LA43_13==VariableId) ) {
								int LA43_14 = input.LA(6);
								if ( (LA43_14==EOF||LA43_14==Comma||LA43_14==RightParanthesis) ) {
									alt43=2;
								}
								else if ( (LA43_14==Assign) ) {
									alt43=3;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return ;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 14, input);
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
										new NoViableAltException("", 43, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return ;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 43, 7, input);
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
						alt43=2;
						}
						break;
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
						alt43=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 43, 5, input);
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
							new NoViableAltException("", 43, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1458);
					paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:29: ( ',' paramDeclarationOptional )*
					loop39:
					do {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==Comma) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:30: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1461); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1463);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop39;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: paramDeclaration ( ',' paramDeclaration )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1470);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:21: ( ',' paramDeclaration )*
					loop40:
					do {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==Comma) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:22: ',' paramDeclaration
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1473); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1475);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							break loop40;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1482);
					paramDeclaration();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:21: ( paramDeclaration ',' )*
					loop41:
					do {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==Identifier||(LA41_0 >= TypeArray && LA41_0 <= TypeString)) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1485);
							paramDeclaration();
							state._fsp--;
							if (state.failed) return ;
							match(input,Comma,FOLLOW_Comma_in_paramList1487); if (state.failed) return ;
							}
							break;

						default :
							break loop41;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:45: ( ',' paramDeclarationOptional )+
					int cnt42=0;
					loop42:
					do {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==Comma) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:46: ',' paramDeclarationOptional
							{
							match(input,Comma,FOLLOW_Comma_in_paramList1492); if (state.failed) return ;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1494);
							paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

						default :
							if ( cnt42 >= 1 ) break loop42;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(42, input);
								throw eee;
						}
						cnt42++;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:1: paramDeclaration : allTypes VariableId ;
	public final void paramDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1508);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1510); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:1: paramDeclarationOptional : paramDeclaration '=' unaryAtom ;
	public final void paramDeclarationOptional() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:2: ( paramDeclaration '=' unaryAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:4: paramDeclaration '=' unaryAtom
			{
			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1520);
			paramDeclaration();
			state._fsp--;
			if (state.failed) return ;
			match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1523); if (state.failed) return ;
			pushFollow(FOLLOW_unaryAtom_in_paramDeclarationOptional1525);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final void instructionWithoutBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==LeftCurlyBrace) ) {
				alt45=1;
			}
			else if ( (LA45_0==Do||LA45_0==Echo||(LA45_0 >= For && LA45_0 <= Foreach)||(LA45_0 >= Identifier && LA45_0 <= If)||LA45_0==MinusMinus||LA45_0==PlusPlus||LA45_0==Return||(LA45_0 >= Switch && LA45_0 <= VariableId)||LA45_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1547); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:8: ( instructionWithoutBreakContinue )+
					int cnt44=0;
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Do||LA44_0==Echo||(LA44_0 >= For && LA44_0 <= Foreach)||(LA44_0 >= Identifier && LA44_0 <= If)||LA44_0==LeftCurlyBrace||LA44_0==MinusMinus||LA44_0==PlusPlus||LA44_0==Return||(LA44_0 >= Switch && LA44_0 <= VariableId)||LA44_0==While) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1549);
							instructionWithoutBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1553); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1558);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final void instructionInclBreakContinue() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt48=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt48=1;
				}
				break;
			case Do:
			case Echo:
			case For:
			case Foreach:
			case Identifier:
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
				alt48=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt48=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1569); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:8: ( instructionInclBreakContinue )+
					int cnt46=0;
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Break||LA46_0==Continue||LA46_0==Do||LA46_0==Echo||(LA46_0 >= For && LA46_0 <= Foreach)||(LA46_0 >= Identifier && LA46_0 <= If)||LA46_0==LeftCurlyBrace||LA46_0==MinusMinus||LA46_0==PlusPlus||LA46_0==Return||(LA46_0 >= Switch && LA46_0 <= VariableId)||LA46_0==While) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1571);
							instructionInclBreakContinue();
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

					match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1575); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1580);
					instruction();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: ( 'break' | 'continue' ) ( Int )? ';'
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:25: ( Int )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==Int) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:25: Int
							{
							match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1591); if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1594); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' | 'echo' expressionList ';' );
	public final void instruction() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | 'return' ( expression )? ';' | 'echo' expressionList ';' )
			int alt50=10;
			switch ( input.LA(1) ) {
			case MinusMinus:
			case PlusPlus:
			case VariableId:
				{
				alt50=1;
				}
				break;
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
				alt50=2;
				}
				break;
			case If:
				{
				alt50=3;
				}
				break;
			case Switch:
				{
				alt50=4;
				}
				break;
			case For:
				{
				alt50=5;
				}
				break;
			case Foreach:
				{
				alt50=6;
				}
				break;
			case While:
				{
				alt50=7;
				}
				break;
			case Do:
				{
				alt50=8;
				}
				break;
			case Return:
				{
				alt50=9;
				}
				break;
			case Echo:
				{
				alt50=10;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: variableAssignment ';'
					{
					pushFollow(FOLLOW_variableAssignment_in_instruction1606);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1608); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_instruction1613);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1615); if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction1620);
					ifCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:320:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction1625);
					switchCondition();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:321:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction1630);
					forLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction1635);
					foreachLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction1640);
					whileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction1645);
					doWhileLoop();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:4: 'return' ( expression )? ';'
					{
					match(input,Return,FOLLOW_Return_in_instruction1650); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:13: ( expression )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==At||LA49_0==BitwiseNot||LA49_0==Bool||LA49_0==Float||LA49_0==Int||(LA49_0 >= LeftParanthesis && LA49_0 <= LeftSquareBrace)||LA49_0==LogicNot||LA49_0==Minus||LA49_0==MinusMinus||LA49_0==Null||LA49_0==Plus||LA49_0==PlusPlus||LA49_0==String||LA49_0==TypeArray||LA49_0==VariableId) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1652);
							expression();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1655); if (state.failed) return ;
					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:4: 'echo' expressionList ';'
					{
					match(input,Echo,FOLLOW_Echo_in_instruction1660); if (state.failed) return ;
					pushFollow(FOLLOW_expressionList_in_instruction1662);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					match(input,Semicolon,FOLLOW_Semicolon_in_instruction1664); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList1676);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:15: ( ',' expression )*
			loop51:
			do {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==Comma) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:16: ',' expression
					{
					match(input,Comma,FOLLOW_Comma_in_expressionList1679); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_expressionList1681);
					expression();
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
	// $ANTLR end "expressionList"



	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:1: variableAssignment : ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement );
	public final void variableAssignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:2: ( VariableId assignmentOperator expression | postIncrementDecrement | preIncrementDecrement )
			int alt52=3;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==VariableId) ) {
				int LA52_1 = input.LA(2);
				if ( (LA52_1==MinusMinus||LA52_1==PlusPlus) ) {
					alt52=2;
				}
				else if ( (LA52_1==Assign||LA52_1==BitwiseAndEqual||LA52_1==BitwiseOrEqual||LA52_1==BitwiseXorEqual||LA52_1==DivideEqual||LA52_1==DotEqual||LA52_1==MinusEqual||LA52_1==ModuloEqual||LA52_1==MultiplyEqual||LA52_1==PlusEqual||LA52_1==ShiftLeftEqual||LA52_1==ShiftRightEqual) ) {
					alt52=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA52_0==MinusMinus||LA52_0==PlusPlus) ) {
				alt52=3;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: VariableId assignmentOperator expression
					{
					match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1692); if (state.failed) return ;
					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1694);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableAssignment1696);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_variableAssignment1701);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_variableAssignment1706);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final void assignmentOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:1: postIncrementDecrement : VariableId ( '++' | '--' ) ;
	public final void postIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:2: ( VariableId ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: VariableId ( '++' | '--' )
			{
			match(input,VariableId,FOLLOW_VariableId_in_postIncrementDecrement1784); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: preIncrementDecrement : ( '++' | '--' ) VariableId ;
	public final void preIncrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:2: ( ( '++' | '--' ) VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: ( '++' | '--' ) VariableId
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
			match(input,VariableId,FOLLOW_VariableId_in_preIncrementDecrement1806); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:1: variableDeclaration : allTypes VariableId ( '=' expression )? ;
	public final void variableDeclaration() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:2: ( allTypes VariableId ( '=' expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration1818);
			allTypes();
			state._fsp--;
			if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1820); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:24: ( '=' expression )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==Assign) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:25: '=' expression
					{
					match(input,Assign,FOLLOW_Assign_in_variableDeclaration1823); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_variableDeclaration1825);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:1: expression : logicOrWeak ;
	public final void expression() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: logicOrWeak
			{
			pushFollow(FOLLOW_logicOrWeak_in_expression1837);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:1: logicOrWeak : logicXorWeak ( 'or' logicXorWeak )* ;
	public final void logicOrWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:2: ( logicXorWeak ( 'or' logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: logicXorWeak ( 'or' logicXorWeak )*
			{
			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1846);
			logicXorWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:17: ( 'or' logicXorWeak )*
			loop54:
			do {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==LogicOrWeak) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:18: 'or' logicXorWeak
					{
					match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak1849); if (state.failed) return ;
					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak1851);
					logicXorWeak();
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
	// $ANTLR end "logicOrWeak"



	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:1: logicXorWeak : logicAndWeak ( 'xor' logicAndWeak )* ;
	public final void logicXorWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:2: ( logicAndWeak ( 'xor' logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: logicAndWeak ( 'xor' logicAndWeak )*
			{
			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1864);
			logicAndWeak();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:17: ( 'xor' logicAndWeak )*
			loop55:
			do {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==LogicXorWeak) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:18: 'xor' logicAndWeak
					{
					match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak1867); if (state.failed) return ;
					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak1869);
					logicAndWeak();
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
	// $ANTLR end "logicXorWeak"



	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:1: logicAndWeak : assignment ( 'and' assignment )* ;
	public final void logicAndWeak() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:2: ( assignment ( 'and' assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:4: assignment ( 'and' assignment )*
			{
			pushFollow(FOLLOW_assignment_in_logicAndWeak1882);
			assignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:15: ( 'and' assignment )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==LogicAndWeak) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:16: 'and' assignment
					{
					match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak1885); if (state.failed) return ;
					pushFollow(FOLLOW_assignment_in_logicAndWeak1887);
					assignment();
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
	// $ANTLR end "logicAndWeak"



	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final void assignment() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: ternary ( assignmentOperator ternary )*
			{
			pushFollow(FOLLOW_ternary_in_assignment1898);
			ternary();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:12: ( assignmentOperator ternary )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==Assign||LA57_0==BitwiseAndEqual||LA57_0==BitwiseOrEqual||LA57_0==BitwiseXorEqual||LA57_0==DivideEqual||LA57_0==DotEqual||LA57_0==MinusEqual||LA57_0==ModuloEqual||LA57_0==MultiplyEqual||LA57_0==PlusEqual||LA57_0==ShiftLeftEqual||LA57_0==ShiftRightEqual) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment1901);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_ternary_in_assignment1903);
					ternary();
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
	// $ANTLR end "assignment"



	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: ternary : logicOr ( '?' expression ':' logicOr )? ;
	public final void ternary() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:9: ( logicOr ( '?' expression ':' logicOr )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:11: logicOr ( '?' expression ':' logicOr )?
			{
			pushFollow(FOLLOW_logicOr_in_ternary1913);
			logicOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:19: ( '?' expression ':' logicOr )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==QuestionMark) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:20: '?' expression ':' logicOr
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary1916); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_ternary1918);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Colon,FOLLOW_Colon_in_ternary1920); if (state.failed) return ;
					pushFollow(FOLLOW_logicOr_in_ternary1922);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:1: logicOr : logicAnd ( '||' logicAnd )* ;
	public final void logicOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:9: ( logicAnd ( '||' logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:11: logicAnd ( '||' logicAnd )*
			{
			pushFollow(FOLLOW_logicAnd_in_logicOr1932);
			logicAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:20: ( '||' logicAnd )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==LogicOr) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:21: '||' logicAnd
					{
					match(input,LogicOr,FOLLOW_LogicOr_in_logicOr1935); if (state.failed) return ;
					pushFollow(FOLLOW_logicAnd_in_logicOr1937);
					logicAnd();
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
	// $ANTLR end "logicOr"



	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:1: logicAnd : bitwiseOr ( '&&' bitwiseOr )* ;
	public final void logicAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:9: ( bitwiseOr ( '&&' bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:11: bitwiseOr ( '&&' bitwiseOr )*
			{
			pushFollow(FOLLOW_bitwiseOr_in_logicAnd1946);
			bitwiseOr();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:21: ( '&&' bitwiseOr )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicAnd) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:22: '&&' bitwiseOr
					{
					match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd1949); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseOr_in_logicAnd1951);
					bitwiseOr();
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
	// $ANTLR end "logicAnd"



	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:1: bitwiseOr : bitwiseXor ( '|' bitwiseXor )* ;
	public final void bitwiseOr() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:2: ( bitwiseXor ( '|' bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:4: bitwiseXor ( '|' bitwiseXor )*
			{
			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1962);
			bitwiseXor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:15: ( '|' bitwiseXor )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==BitwiseOr) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:16: '|' bitwiseXor
					{
					match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr1965); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr1967);
					bitwiseXor();
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
	// $ANTLR end "bitwiseOr"



	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:1: bitwiseXor : bitwiseAnd ( '^' bitwiseAnd )* ;
	public final void bitwiseXor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:2: ( bitwiseAnd ( '^' bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:4: bitwiseAnd ( '^' bitwiseAnd )*
			{
			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1978);
			bitwiseAnd();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:15: ( '^' bitwiseAnd )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==BitwiseXor) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:16: '^' bitwiseAnd
					{
					match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor1981); if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor1983);
					bitwiseAnd();
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
	// $ANTLR end "bitwiseXor"



	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:1: bitwiseAnd : equality ( '&' equality )* ;
	public final void bitwiseAnd() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:2: ( equality ( '&' equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:4: equality ( '&' equality )*
			{
			pushFollow(FOLLOW_equality_in_bitwiseAnd1994);
			equality();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:13: ( '&' equality )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==BitwiseAnd) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:14: '&' equality
					{
					match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd1997); if (state.failed) return ;
					pushFollow(FOLLOW_equality_in_bitwiseAnd1999);
					equality();
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
	// $ANTLR end "bitwiseAnd"



	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:1: equality : comparison ( equalityOperator comparison )* ;
	public final void equality() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:9: ( comparison ( equalityOperator comparison )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:11: comparison ( equalityOperator comparison )*
			{
			pushFollow(FOLLOW_comparison_in_equality2008);
			comparison();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:22: ( equalityOperator comparison )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==Equal||LA64_0==Identical||(LA64_0 >= NotEqual && LA64_0 <= NotIdentical)) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:23: equalityOperator comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2011);
					equalityOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_comparison_in_equality2013);
					comparison();
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
	// $ANTLR end "equality"



	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final void equalityOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:1: comparison : bitwiseShift ( comparisonOperator bitwiseShift )* ;
	public final void comparison() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:2: ( bitwiseShift ( comparisonOperator bitwiseShift )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:4: bitwiseShift ( comparisonOperator bitwiseShift )*
			{
			pushFollow(FOLLOW_bitwiseShift_in_comparison2055);
			bitwiseShift();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:17: ( comparisonOperator bitwiseShift )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( ((LA65_0 >= GreaterEqualThan && LA65_0 <= GreaterThan)||(LA65_0 >= LessEqualThan && LA65_0 <= LessThan)) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:18: comparisonOperator bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2058);
					comparisonOperator();
					state._fsp--;
					if (state.failed) return ;
					pushFollow(FOLLOW_bitwiseShift_in_comparison2060);
					bitwiseShift();
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
	// $ANTLR end "comparison"



	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final void comparisonOperator() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* ;
	public final void bitwiseShift() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:16: termOrStringConcatenation ( ( '<<' | '>>' ) termOrStringConcatenation )*
			{
			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2096);
			termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:42: ( ( '<<' | '>>' ) termOrStringConcatenation )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==ShiftLeft||LA66_0==ShiftRight) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:43: ( '<<' | '>>' ) termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2105);
					termOrStringConcatenation();
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
	// $ANTLR end "bitwiseShift"



	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) factor )* ;
	public final void termOrStringConcatenation() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:27: ( factor ( ( '+' | '-' | '.' ) factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:29: factor ( ( '+' | '-' | '.' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2115);
			factor();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:36: ( ( '+' | '-' | '.' ) factor )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Dot||LA67_0==Minus||LA67_0==Plus) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:37: ( '+' | '-' | '.' ) factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2126);
					factor();
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
	// $ANTLR end "termOrStringConcatenation"



	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: factor : logicNot ( ( '*' | '/' | '%' ) logicNot )* ;
	public final void factor() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:8: ( logicNot ( ( '*' | '/' | '%' ) logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:10: logicNot ( ( '*' | '/' | '%' ) logicNot )*
			{
			pushFollow(FOLLOW_logicNot_in_factor2136);
			logicNot();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:19: ( ( '*' | '/' | '%' ) logicNot )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==Divide||LA68_0==Modulo||LA68_0==Multiply) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:20: ( '*' | '/' | '%' ) logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2147);
					logicNot();
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
	// $ANTLR end "factor"



	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:1: logicNot : ( '!' logicNot | castOrBitwiseNotOrAt );
	public final void logicNot() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:9: ( '!' logicNot | castOrBitwiseNotOrAt )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==LogicNot) ) {
				alt69=1;
			}
			else if ( (LA69_0==At||LA69_0==BitwiseNot||LA69_0==Bool||LA69_0==Float||LA69_0==Int||(LA69_0 >= LeftParanthesis && LA69_0 <= LeftSquareBrace)||LA69_0==Minus||LA69_0==MinusMinus||LA69_0==Null||LA69_0==Plus||LA69_0==PlusPlus||LA69_0==String||LA69_0==TypeArray||LA69_0==VariableId) ) {
				alt69=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:11: '!' logicNot
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2156); if (state.failed) return ;
					pushFollow(FOLLOW_logicNot_in_logicNot2158);
					logicNot();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:4: castOrBitwiseNotOrAt
					{
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_logicNot2163);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:1: castOrBitwiseNotOrAt : ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement );
	public final void castOrBitwiseNotOrAt() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:2: ( ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt | '~' castOrBitwiseNotOrAt | '@' castOrBitwiseNotOrAt | incrementDecrement )
			int alt70=4;
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
					alt70=1;
					}
					break;
				case TypeArray:
					{
					int LA70_6 = input.LA(3);
					if ( (LA70_6==LeftParanthesis) ) {
						alt70=4;
					}
					else if ( (LA70_6==RightParanthesis) ) {
						alt70=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 70, 6, input);
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
				case Null:
				case Plus:
				case PlusPlus:
				case String:
				case VariableId:
					{
					alt70=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt70=2;
				}
				break;
			case At:
				{
				alt70=3;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftSquareBrace:
			case Minus:
			case MinusMinus:
			case Null:
			case Plus:
			case PlusPlus:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt70=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: ( '(' primitiveTypesInclArray ')' ) castOrBitwiseNotOrAt
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: ( '(' primitiveTypesInclArray ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:5: '(' primitiveTypesInclArray ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2177); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2179);
					primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2181); if (state.failed) return ;
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2184);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:4: '~' castOrBitwiseNotOrAt
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2189); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2191);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:4: '@' castOrBitwiseNotOrAt
					{
					match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2196); if (state.failed) return ;
					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2198);
					castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:4: incrementDecrement
					{
					pushFollow(FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2203);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement | unaryAtom );
	public final void incrementDecrement() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:2: ( postIncrementDecrement | preIncrementDecrement | unaryAtom )
			int alt71=3;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA71_1 = input.LA(2);
				if ( (LA71_1==MinusMinus||LA71_1==PlusPlus) ) {
					alt71=1;
				}
				else if ( (LA71_1==EOF||LA71_1==Arrow||LA71_1==Assign||(LA71_1 >= BitwiseAnd && LA71_1 <= BitwiseAndEqual)||(LA71_1 >= BitwiseOr && LA71_1 <= BitwiseXorEqual)||(LA71_1 >= Colon && LA71_1 <= Comma)||(LA71_1 >= Divide && LA71_1 <= DivideEqual)||(LA71_1 >= Dot && LA71_1 <= DotEqual)||LA71_1==Equal||(LA71_1 >= GreaterEqualThan && LA71_1 <= GreaterThan)||LA71_1==Identical||(LA71_1 >= LessEqualThan && LA71_1 <= LogicAndWeak)||(LA71_1 >= LogicOr && LA71_1 <= MinusEqual)||(LA71_1 >= Modulo && LA71_1 <= MultiplyEqual)||(LA71_1 >= NotEqual && LA71_1 <= NotIdentical)||(LA71_1 >= Plus && LA71_1 <= PlusEqual)||LA71_1==QuestionMark||(LA71_1 >= RightParanthesis && LA71_1 <= RightSquareBrace)||(LA71_1 >= Semicolon && LA71_1 <= ShiftRightEqual)) ) {
					alt71=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return ;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
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
				alt71=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Minus:
			case Null:
			case Plus:
			case String:
			case TypeArray:
				{
				alt71=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:4: postIncrementDecrement
					{
					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2215);
					postIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:4: preIncrementDecrement
					{
					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2220);
					preIncrementDecrement();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:4: unaryAtom
					{
					pushFollow(FOLLOW_unaryAtom_in_incrementDecrement2225);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: unaryAtom : ( '+' atom | '-' atom | atom );
	public final void unaryAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:2: ( '+' atom | '-' atom | atom )
			int alt72=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt72=1;
				}
				break;
			case Minus:
				{
				alt72=2;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case Null:
			case String:
			case TypeArray:
			case VariableId:
				{
				alt72=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:4: '+' atom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryAtom2236); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2238);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: '-' atom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryAtom2243); if (state.failed) return ;
					pushFollow(FOLLOW_atom_in_unaryAtom2245);
					atom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:4: atom
					{
					pushFollow(FOLLOW_atom_in_unaryAtom2250);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:1: atom : ( '(' expression ')' | primitiveAtom | array | VariableId );
	public final void atom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:6: ( '(' expression ')' | primitiveAtom | array | VariableId )
			int alt73=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt73=1;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt73=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt73=3;
				}
				break;
			case VariableId:
				{
				alt73=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:8: '(' expression ')'
					{
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2262); if (state.failed) return ;
					pushFollow(FOLLOW_expression_in_atom2264);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2266); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2271);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:4: array
					{
					pushFollow(FOLLOW_array_in_atom2276);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:4: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_atom2281); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final void unaryPrimitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
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
			case Null:
			case String:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:4: '+' primitiveAtom
					{
					match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2295); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2297);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: '-' primitiveAtom
					{
					match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2302); if (state.failed) return ;
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2304);
					primitiveAtom();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2309);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:1: primitiveAtom : ( Bool | Int | Float | String | Null );
	public final void primitiveAtom() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:2: ( Bool | Int | Float | String | Null )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final void array() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LeftSquareBrace) ) {
				alt77=1;
			}
			else if ( (LA77_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:9: '[' ( array_content )? ']'
					{
					match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array2802); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:13: ( array_content )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==At||LA75_0==BitwiseNot||LA75_0==Bool||LA75_0==Float||LA75_0==Int||(LA75_0 >= LeftParanthesis && LA75_0 <= LeftSquareBrace)||LA75_0==LogicNot||LA75_0==Minus||LA75_0==MinusMinus||LA75_0==Null||LA75_0==Plus||LA75_0==PlusPlus||LA75_0==String||LA75_0==TypeArray||LA75_0==VariableId) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2804);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array2807); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: TypeArray '(' ( array_content )? ')'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_array2813); if (state.failed) return ;
					match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array2815); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:18: ( array_content )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==At||LA76_0==BitwiseNot||LA76_0==Bool||LA76_0==Float||LA76_0==Int||(LA76_0 >= LeftParanthesis && LA76_0 <= LeftSquareBrace)||LA76_0==LogicNot||LA76_0==Minus||LA76_0==MinusMinus||LA76_0==Null||LA76_0==Plus||LA76_0==PlusPlus||LA76_0==String||LA76_0==TypeArray||LA76_0==VariableId) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array2817);
							array_content();
							state._fsp--;
							if (state.failed) return ;
							}
							break;

					}

					match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array2820); if (state.failed) return ;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final void array_content() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: ( expression '=>' )?
			int alt78=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA78_1 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA78_2 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA78_3 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case At:
					{
					int LA78_4 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case VariableId:
					{
					int LA78_5 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA78_6 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case Plus:
					{
					int LA78_7 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case Minus:
					{
					int LA78_8 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case Null:
				case String:
					{
					int LA78_9 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA78_10 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA78_11 = input.LA(2);
					if ( (synpred137_TSPHP()) ) {
						alt78=1;
					}
					}
					break;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content2833);
					expression();
					state._fsp--;
					if (state.failed) return ;
					match(input,Arrow,FOLLOW_Arrow_in_array_content2835); if (state.failed) return ;
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content2839);
			expression();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:35: ( ',' ( expression '=>' )? expression )*
			loop80:
			do {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==Comma) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:36: ',' ( expression '=>' )? expression
					{
					match(input,Comma,FOLLOW_Comma_in_array_content2843); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:40: ( expression '=>' )?
					int alt79=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA79_1 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA79_2 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA79_3 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case At:
							{
							int LA79_4 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case VariableId:
							{
							int LA79_5 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA79_6 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case Plus:
							{
							int LA79_7 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case Minus:
							{
							int LA79_8 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case Null:
						case String:
							{
							int LA79_9 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA79_10 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA79_11 = input.LA(2);
							if ( (synpred138_TSPHP()) ) {
								alt79=1;
							}
							}
							break;
					}
					switch (alt79) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content2846);
							expression();
							state._fsp--;
							if (state.failed) return ;
							match(input,Arrow,FOLLOW_Arrow_in_array_content2848); if (state.failed) return ;
							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content2852);
					expression();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop80;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:1: ifCondition : 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? ;
	public final void ifCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:2: ( 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: 'if' '(' expression ')' instructionWithoutBreakContinue ( 'else' instructionWithoutBreakContinue )?
			{
			match(input,If,FOLLOW_If_in_ifCondition2864); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition2866); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_ifCondition2868);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition2870); if (state.failed) return ;
			pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2872);
			instructionWithoutBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:3: ( 'else' instructionWithoutBreakContinue )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==Else) ) {
				int LA81_1 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt81=1;
				}
			}
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:5: 'else' instructionWithoutBreakContinue
					{
					match(input,Else,FOLLOW_Else_in_ifCondition2879); if (state.failed) return ;
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_ifCondition2881);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final void forLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			match(input,For,FOLLOW_For_in_forLoop2896); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop2898); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:21: ( forInit )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Identifier||LA82_0==MinusMinus||LA82_0==PlusPlus||(LA82_0 >= TypeArray && LA82_0 <= VariableId)) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop2900);
					forInit();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2903); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:34: ( expressionList )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==At||LA83_0==BitwiseNot||LA83_0==Bool||LA83_0==Float||LA83_0==Int||(LA83_0 >= LeftParanthesis && LA83_0 <= LeftSquareBrace)||LA83_0==LogicNot||LA83_0==Minus||LA83_0==MinusMinus||LA83_0==Null||LA83_0==Plus||LA83_0==PlusPlus||LA83_0==String||LA83_0==TypeArray||LA83_0==VariableId) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop2905);
					expressionList();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,Semicolon,FOLLOW_Semicolon_in_forLoop2909); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:55: ( forUpdate )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==MinusMinus||LA84_0==PlusPlus||LA84_0==VariableId) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop2911);
					forUpdate();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop2914); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop2916);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final void forInit() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:11: ( variableDeclaration | variableAssignment )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==Identifier||(LA85_0 >= TypeArray && LA85_0 <= TypeString)) ) {
				alt85=1;
			}
			else if ( (LA85_0==MinusMinus||LA85_0==PlusPlus||LA85_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit2925);
					variableDeclaration();
					state._fsp--;
					if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit2927);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:52: ( ',' variableAssignment )*
			loop86:
			do {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==Comma) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:53: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forInit2931); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forInit2933);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop86;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final void forUpdate() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: variableAssignment ( ',' variableAssignment )*
			{
			pushFollow(FOLLOW_variableAssignment_in_forUpdate2943);
			variableAssignment();
			state._fsp--;
			if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:23: ( ',' variableAssignment )*
			loop87:
			do {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==Comma) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:24: ',' variableAssignment
					{
					match(input,Comma,FOLLOW_Comma_in_forUpdate2946); if (state.failed) return ;
					pushFollow(FOLLOW_variableAssignment_in_forUpdate2948);
					variableAssignment();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

				default :
					break loop87;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final void foreachLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop2959); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop2961); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:18: ( VariableId | array )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==VariableId) ) {
				alt88=1;
			}
			else if ( (LA88_0==LeftSquareBrace||LA88_0==TypeArray) ) {
				alt88=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:19: VariableId
					{
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2964); if (state.failed) return ;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop2966);
					array();
					state._fsp--;
					if (state.failed) return ;
					}
					break;

			}

			match(input,As,FOLLOW_As_in_foreachLoop2969); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2971); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:53: ( '=>' VariableId )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==Arrow) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:54: '=>' VariableId
					{
					match(input,Arrow,FOLLOW_Arrow_in_foreachLoop2974); if (state.failed) return ;
					match(input,VariableId,FOLLOW_VariableId_in_foreachLoop2976); if (state.failed) return ;
					}
					break;

			}

			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop2980); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop2982);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final void whileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			match(input,While,FOLLOW_While_in_whileLoop2991); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop2993); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_whileLoop2995);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop2997); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop2999);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final void doWhileLoop() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3009); if (state.failed) return ;
			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3011);
			instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return ;
			match(input,While,FOLLOW_While_in_doWhileLoop3013); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3015); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_doWhileLoop3017);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3019); if (state.failed) return ;
			match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3021); if (state.failed) return ;
			}

		}
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final void switchCondition() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition3031); if (state.failed) return ;
			match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3033); if (state.failed) return ;
			match(input,VariableId,FOLLOW_VariableId_in_switchCondition3035); if (state.failed) return ;
			match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3037); if (state.failed) return ;
			match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3039); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==Case) ) {
				int LA102_1 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3050);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: ( instructionInclBreakContinue )+
							int cnt91=0;
							loop91:
							do {
								int alt91=2;
								int LA91_0 = input.LA(1);
								if ( (LA91_0==Break||LA91_0==Continue||LA91_0==Do||LA91_0==Echo||(LA91_0 >= For && LA91_0 <= Foreach)||(LA91_0 >= Identifier && LA91_0 <= If)||LA91_0==LeftCurlyBrace||LA91_0==MinusMinus||LA91_0==PlusPlus||LA91_0==Return||(LA91_0 >= Switch && LA91_0 <= VariableId)||LA91_0==While) ) {
									alt91=1;
								}

								switch (alt91) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3053);
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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3058);
					defaultLabel();
					state._fsp--;
					if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: ( instructionInclBreakContinue )+
					int cnt93=0;
					loop93:
					do {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==Break||LA93_0==Continue||LA93_0==Do||LA93_0==Echo||(LA93_0 >= For && LA93_0 <= Foreach)||(LA93_0 >= Identifier && LA93_0 <= If)||LA93_0==LeftCurlyBrace||LA93_0==MinusMinus||LA93_0==PlusPlus||LA93_0==Return||(LA93_0 >= Switch && LA93_0 <= VariableId)||LA93_0==While) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3060);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3064);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: ( instructionInclBreakContinue )+
							int cnt95=0;
							loop95:
							do {
								int alt95=2;
								int LA95_0 = input.LA(1);
								if ( (LA95_0==Break||LA95_0==Continue||LA95_0==Do||LA95_0==Echo||(LA95_0 >= For && LA95_0 <= Foreach)||(LA95_0 >= Identifier && LA95_0 <= If)||LA95_0==LeftCurlyBrace||LA95_0==MinusMinus||LA95_0==PlusPlus||LA95_0==Return||(LA95_0 >= Switch && LA95_0 <= VariableId)||LA95_0==While) ) {
									alt95=1;
								}

								switch (alt95) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3067);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3077);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:17: ( instructionInclBreakContinue )+
							int cnt98=0;
							loop98:
							do {
								int alt98=2;
								int LA98_0 = input.LA(1);
								if ( (LA98_0==Break||LA98_0==Continue||LA98_0==Do||LA98_0==Echo||(LA98_0 >= For && LA98_0 <= Foreach)||(LA98_0 >= Identifier && LA98_0 <= If)||LA98_0==LeftCurlyBrace||LA98_0==MinusMinus||LA98_0==PlusPlus||LA98_0==Return||(LA98_0 >= Switch && LA98_0 <= VariableId)||LA98_0==While) ) {
									alt98=1;
								}

								switch (alt98) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3080);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==Default) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3086);
							defaultLabel();
							state._fsp--;
							if (state.failed) return ;
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:63: ( instructionInclBreakContinue )+
							int cnt100=0;
							loop100:
							do {
								int alt100=2;
								int LA100_0 = input.LA(1);
								if ( (LA100_0==Break||LA100_0==Continue||LA100_0==Do||LA100_0==Echo||(LA100_0 >= For && LA100_0 <= Foreach)||(LA100_0 >= Identifier && LA100_0 <= If)||LA100_0==LeftCurlyBrace||LA100_0==MinusMinus||LA100_0==PlusPlus||LA100_0==Return||(LA100_0 >= Switch && LA100_0 <= VariableId)||LA100_0==While) ) {
									alt100=1;
								}

								switch (alt100) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3088);
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

			match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3099); if (state.failed) return ;
			}

		}
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
			match(input,Case,FOLLOW_Case_in_caseLabel3111); if (state.failed) return ;
			pushFollow(FOLLOW_expression_in_caseLabel3113);
			expression();
			state._fsp--;
			if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_caseLabel3115); if (state.failed) return ;
			}

		}
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
			match(input,Default,FOLLOW_Default_in_defaultLabel3124); if (state.failed) return ;
			match(input,Colon,FOLLOW_Colon_in_defaultLabel3126); if (state.failed) return ;
			}

		}
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

	// $ANTLR start synpred137_TSPHP
	public final void synpred137_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred137_TSPHP2833);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred137_TSPHP2835); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred137_TSPHP

	// $ANTLR start synpred138_TSPHP
	public final void synpred138_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred138_TSPHP2846);
		expression();
		state._fsp--;
		if (state.failed) return ;
		match(input,Arrow,FOLLOW_Arrow_in_synpred138_TSPHP2848); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred138_TSPHP

	// $ANTLR start synpred140_TSPHP
	public final void synpred140_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:5: ( 'else' instructionWithoutBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:5: 'else' instructionWithoutBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred140_TSPHP2879); if (state.failed) return ;
		pushFollow(FOLLOW_instructionWithoutBreakContinue_in_synpred140_TSPHP2881);
		instructionWithoutBreakContinue();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred140_TSPHP

	// $ANTLR start synpred156_TSPHP
	public final void synpred156_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt122=0;
		loop122:
		do {
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==Case) ) {
				alt122=1;
			}

			switch (alt122) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred156_TSPHP3050);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: ( instructionInclBreakContinue )+
				int cnt121=0;
				loop121:
				do {
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==Break||LA121_0==Continue||LA121_0==Do||LA121_0==Echo||(LA121_0 >= For && LA121_0 <= Foreach)||(LA121_0 >= Identifier && LA121_0 <= If)||LA121_0==LeftCurlyBrace||LA121_0==MinusMinus||LA121_0==PlusPlus||LA121_0==Return||(LA121_0 >= Switch && LA121_0 <= VariableId)||LA121_0==While) ) {
						alt121=1;
					}

					switch (alt121) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3053);
						instructionInclBreakContinue();
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

		pushFollow(FOLLOW_defaultLabel_in_synpred156_TSPHP3058);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: ( instructionInclBreakContinue )+
		int cnt123=0;
		loop123:
		do {
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==Break||LA123_0==Continue||LA123_0==Do||LA123_0==Echo||(LA123_0 >= For && LA123_0 <= Foreach)||(LA123_0 >= Identifier && LA123_0 <= If)||LA123_0==LeftCurlyBrace||LA123_0==MinusMinus||LA123_0==PlusPlus||LA123_0==Return||(LA123_0 >= Switch && LA123_0 <= VariableId)||LA123_0==While) ) {
				alt123=1;
			}

			switch (alt123) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3060);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred156_TSPHP3064);
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: ( instructionInclBreakContinue )+
				int cnt125=0;
				loop125:
				do {
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==Break||LA125_0==Continue||LA125_0==Do||LA125_0==Echo||(LA125_0 >= For && LA125_0 <= Foreach)||(LA125_0 >= Identifier && LA125_0 <= If)||LA125_0==LeftCurlyBrace||LA125_0==MinusMinus||LA125_0==PlusPlus||LA125_0==Return||(LA125_0 >= Switch && LA125_0 <= VariableId)||LA125_0==While) ) {
						alt125=1;
					}

					switch (alt125) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3067);
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

		}

	}
	// $ANTLR end synpred156_TSPHP

	// Delegated rules

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
	public final boolean synpred137_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred137_TSPHP_fragment(); // can never throw exception
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
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\61\1\uffff\1\12\1\uffff\1\61\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\155\1\66\1\uffff\1\133\1\uffff\1\61\1\uffff\1\133";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\20\uffff\1\2\11\uffff\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\3\2\4"+
			"\uffff\2\2\2\uffff\2\2\14\uffff\1\2\4\uffff\1\1\7\uffff\1\2\4\uffff\1"+
			"\2\14\uffff\12\2\1\uffff\1\2",
			"\1\3\4\uffff\1\4",
			"",
			"\1\5\53\uffff\1\4\44\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\53\uffff\1\4\44\uffff\1\6"
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
			return "159:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_EOF_in_prog788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_EOF_in_prog796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog801 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon816 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon818 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon820 = new BitSet(new long[]{0x00661D1080200010L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon822 = new BitSet(new long[]{0x00661D1080200012L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket835 = new BitSet(new long[]{0x0042000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket837 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket840 = new BitSet(new long[]{0x00661D1080200010L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket842 = new BitSet(new long[]{0x00661D1080200010L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId911 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId914 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId916 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace929 = new BitSet(new long[]{0x00661D1080200012L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_definition_in_statement940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration985 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration987 = new BitSet(new long[]{0x0048008000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration989 = new BitSet(new long[]{0x0048000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration992 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration995 = new BitSet(new long[]{0x0000110002000010L,0x00000001000E0000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration997 = new BitSet(new long[]{0x0000110002000010L,0x00000001004E0000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1014 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1025 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1028 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1030 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1041 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_classBody1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constantDeclaration1073 = new BitSet(new long[]{0x0000000000000000L,0x000004F000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constantDeclaration1075 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_constDeclarationList_in_constantDeclaration1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_constantDeclaration1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1089 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1092 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1094 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1104 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1107 = new BitSet(new long[]{0x0010020000040000L,0x0000000200005002L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1118 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1121 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010008L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1123 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1135 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1138 = new BitSet(new long[]{0x0002000000000000L,0x000007F800000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1177 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1180 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010008L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1183 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1185 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1200 = new BitSet(new long[]{0x0000100000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1202 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1216 = new BitSet(new long[]{0x0000110000000000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1218 = new BitSet(new long[]{0x0000100000000000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1226 = new BitSet(new long[]{0x0000100000000000L,0x00000001000E0000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1228 = new BitSet(new long[]{0x0000100000000000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1242 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1259 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1261 = new BitSet(new long[]{0x0048000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1263 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1266 = new BitSet(new long[]{0x0000100002000000L,0x0000000000480000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1268 = new BitSet(new long[]{0x0000100002000000L,0x0000000000480000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaration_in_interfaceBody1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1296 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1312 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1314 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1316 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1329 = new BitSet(new long[]{0x0002000000000000L,0x000017F800000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1331 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1333 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1335 = new BitSet(new long[]{0x0002000000000000L,0x000007F800800000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceType_in_allTypes1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1458 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_paramList1461 = new BitSet(new long[]{0x0002000000000000L,0x000007F800000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1463 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1470 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_paramList1473 = new BitSet(new long[]{0x0002000000000000L,0x000007F800000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1475 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1482 = new BitSet(new long[]{0x0002000000800000L,0x000007F800000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1485 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Comma_in_paramList1487 = new BitSet(new long[]{0x0002000000800000L,0x000007F800000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1492 = new BitSet(new long[]{0x0002000000000000L,0x000007F800000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1494 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1508 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1520 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1523 = new BitSet(new long[]{0x0190020000040000L,0x0000080A00005002L});
	public static final BitSet FOLLOW_unaryAtom_in_paramDeclarationOptional1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1547 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1549 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1569 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1571 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1585 = new BitSet(new long[]{0x0010000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1650 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0801500AL});
	public static final BitSet FOLLOW_expression_in_instruction1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1660 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expressionList_in_instruction1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1676 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1679 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_expressionList1681 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1692 = new BitSet(new long[]{0x0000000440029080L,0x00000000A00080A4L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1694 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_variableAssignment1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_variableAssignment1701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_variableAssignment1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_postIncrementDecrement1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010008L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement1800 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_preIncrementDecrement1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration1818 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1820 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration1823 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1846 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak1849 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak1851 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak1867 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak1869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1882 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak1885 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak1887 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment1898 = new BitSet(new long[]{0x0000000440029082L,0x00000000A00080A4L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment1901 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_ternary_in_assignment1903 = new BitSet(new long[]{0x0000000440029082L,0x00000000A00080A4L});
	public static final BitSet FOLLOW_logicOr_in_ternary1913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary1916 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_ternary1918 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_ternary1920 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicOr_in_ternary1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1932 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr1935 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicAnd_in_logicOr1937 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1946 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd1949 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd1951 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1962 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr1965 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr1967 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1978 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor1981 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor1983 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1994 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd1997 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd1999 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2008 = new BitSet(new long[]{0x0001004000000002L,0x0000000000000E00L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2011 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_comparison_in_equality2013 = new BitSet(new long[]{0x0001004000000002L,0x0000000000000E00L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2055 = new BitSet(new long[]{0x0600600000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2058 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2060 = new BitSet(new long[]{0x0600600000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2096 = new BitSet(new long[]{0x0000000000000002L,0x0000000050000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2099 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2105 = new BitSet(new long[]{0x0000000000000002L,0x0000000050000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2115 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2118 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2126 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicNot_in_factor2136 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000050L});
	public static final BitSet FOLLOW_set_in_factor2139 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicNot_in_factor2147 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000050L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2156 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_logicNot_in_logicNot2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_logicNot2163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2177 = new BitSet(new long[]{0x0000000000000000L,0x000004F800000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2181 = new BitSet(new long[]{0x0190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2189 = new BitSet(new long[]{0x0190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2196 = new BitSet(new long[]{0x0190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_castOrBitwiseNotOrAt2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryAtom_in_incrementDecrement2225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryAtom2236 = new BitSet(new long[]{0x0190020000040000L,0x0000080A00001000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryAtom2243 = new BitSet(new long[]{0x0190020000040000L,0x0000080A00001000L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryAtom2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2262 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_atom2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_atom2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2295 = new BitSet(new long[]{0x0010020000040000L,0x0000000200001000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2302 = new BitSet(new long[]{0x0010020000040000L,0x0000000200001000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array2802 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0101500AL});
	public static final BitSet FOLLOW_array_content_in_array2804 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array2813 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array2815 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0081500AL});
	public static final BitSet FOLLOW_array_content_in_array2817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content2833 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2835 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_array_content2839 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_array_content2843 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_array_content2846 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content2848 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_array_content2852 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_If_in_ifCondition2864 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition2866 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_ifCondition2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition2870 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2872 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition2879 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_ifCondition2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop2896 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop2898 = new BitSet(new long[]{0x0002000000000000L,0x00000FF808010008L});
	public static final BitSet FOLLOW_forInit_in_forLoop2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2903 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0801500AL});
	public static final BitSet FOLLOW_expressionList_in_forLoop2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop2909 = new BitSet(new long[]{0x0000000000000000L,0x0000080000810008L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop2911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop2914 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit2925 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit2927 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_forInit2931 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010008L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit2933 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate2943 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate2946 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010008L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate2948 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop2959 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop2961 = new BitSet(new long[]{0x0100000000000000L,0x0000080800000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2964 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop2966 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop2969 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2971 = new BitSet(new long[]{0x0000000000000020L,0x0000000000800000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop2974 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop2980 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop2982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop2991 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop2993 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_whileLoop2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop2997 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3009 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3011 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3013 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3015 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3019 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3031 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3033 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3037 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3039 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3050 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3053 = new BitSet(new long[]{0x00460C1094180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3058 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3060 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3064 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3067 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3077 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3080 = new BitSet(new long[]{0x00460C1094180000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3086 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3088 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00610008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3111 = new BitSet(new long[]{0x2190020000042100L,0x0000080A0001500AL});
	public static final BitSet FOLLOW_expression_in_caseLabel3113 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3124 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred137_TSPHP2833 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred137_TSPHP2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred138_TSPHP2846 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred138_TSPHP2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred140_TSPHP2879 = new BitSet(new long[]{0x00460C1080000000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_synpred140_TSPHP2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred156_TSPHP3050 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3053 = new BitSet(new long[]{0x00460C1094180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred156_TSPHP3058 = new BitSet(new long[]{0x00460C1084080000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3060 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_caseLabel_in_synpred156_TSPHP3064 = new BitSet(new long[]{0x00460C1084180000L,0x00002FFC00210008L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred156_TSPHP3067 = new BitSet(new long[]{0x00460C1084180002L,0x00002FFC00210008L});
}
