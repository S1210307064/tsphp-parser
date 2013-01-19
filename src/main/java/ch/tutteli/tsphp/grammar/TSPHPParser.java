// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-19 13:48:40

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

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TSPHPParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace"
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
	public static final int Namespace=77;
	public static final int New=78;
	public static final int NotEqual=79;
	public static final int NotEqualAlternative=80;
	public static final int NotIdentical=81;
	public static final int Null=82;
	public static final int OCTAL=83;
	public static final int ObjectOperator=84;
	public static final int Parent=85;
	public static final int Plus=86;
	public static final int PlusEqual=87;
	public static final int PlusPlus=88;
	public static final int Private=89;
	public static final int ProtectParent=90;
	public static final int ProtectSelf=91;
	public static final int ProtectThis=92;
	public static final int Protected=93;
	public static final int Public=94;
	public static final int QuestionMark=95;
	public static final int Return=96;
	public static final int RightCurlyBrace=97;
	public static final int RightParanthesis=98;
	public static final int RightSquareBrace=99;
	public static final int STRING_DOUBLE_QUOTED=100;
	public static final int STRING_SINGLE_QUOTED=101;
	public static final int Self=102;
	public static final int Semicolon=103;
	public static final int ShiftLeft=104;
	public static final int ShiftLeftEqual=105;
	public static final int ShiftRight=106;
	public static final int ShiftRightEqual=107;
	public static final int Static=108;
	public static final int String=109;
	public static final int Switch=110;
	public static final int This=111;
	public static final int Throw=112;
	public static final int Try=113;
	public static final int TypeArray=114;
	public static final int TypeBool=115;
	public static final int TypeBoolean=116;
	public static final int TypeFloat=117;
	public static final int TypeInt=118;
	public static final int TypeObject=119;
	public static final int TypeResource=120;
	public static final int TypeString=121;
	public static final int Use=122;
	public static final int VariableId=123;
	public static final int Void=124;
	public static final int While=125;
	public static final int Whitespace=126;

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
		this.state.ruleMemo = new HashMap[311+1];
		 

	}

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
	this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
	return adaptor;
}
	@Override public String[] getTokenNames() { return TSPHPParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final TSPHPParser.prog_return prog() throws RecognitionException {
		TSPHPParser.prog_return retval = new TSPHPParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		Object root_0 = null;

		Token EOF2=null;
		Token EOF4=null;
		Token EOF6=null;
		ParserRuleReturnScope namespaceSemicolon1 =null;
		ParserRuleReturnScope namespaceBracket3 =null;
		ParserRuleReturnScope withoutNamespace5 =null;

		Object EOF2_tree=null;
		Object EOF4_tree=null;
		Object EOF6_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:174:8: ( namespaceSemicolon )+ EOF
					{
					root_0 = (Object)adaptor.nil();


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
							pushFollow(FOLLOW_namespaceSemicolon_in_prog906);
							namespaceSemicolon1=namespaceSemicolon();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceSemicolon1.getTree());

							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(1, input);
								throw eee;
						}
						cnt1++;
					} while (true);

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog909); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF2_tree = 
					(Object)adaptor.create(EOF2)
					;
					adaptor.addChild(root_0, EOF2_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:175:4: ( namespaceBracket )+ EOF
					{
					root_0 = (Object)adaptor.nil();


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
							pushFollow(FOLLOW_namespaceBracket_in_prog914);
							namespaceBracket3=namespaceBracket();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceBracket3.getTree());

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(2, input);
								throw eee;
						}
						cnt2++;
					} while (true);

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog917); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF4_tree = 
					(Object)adaptor.create(EOF4)
					;
					adaptor.addChild(root_0, EOF4_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:176:4: withoutNamespace EOF
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog922);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF6_tree = 
					(Object)adaptor.create(EOF6)
					;
					adaptor.addChild(root_0, EOF6_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class namespaceSemicolon_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:179:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final TSPHPParser.namespaceSemicolon_return namespaceSemicolon() throws RecognitionException {
		TSPHPParser.namespaceSemicolon_return retval = new TSPHPParser.namespaceSemicolon_return();
		retval.start = input.LT(1);
		int namespaceSemicolon_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		ParserRuleReturnScope namespaceId8 =null;
		ParserRuleReturnScope statement10 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:180:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon937); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(Object)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon939);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon941); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(Object)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

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
					pushFollow(FOLLOW_statement_in_namespaceSemicolon943);
					statement10=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement10.getTree());

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(4, input);
						throw eee;
				}
				cnt4++;
			} while (true);

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, namespaceSemicolon_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceSemicolon"


	public static class namespaceBracket_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceBracket"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final TSPHPParser.namespaceBracket_return namespaceBracket() throws RecognitionException {
		TSPHPParser.namespaceBracket_return retval = new TSPHPParser.namespaceBracket_return();
		retval.start = input.LT(1);
		int namespaceBracket_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal11=null;
		Token char_literal13=null;
		Token char_literal15=null;
		ParserRuleReturnScope namespaceId12 =null;
		ParserRuleReturnScope statement14 =null;

		Object string_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket956); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(Object)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

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
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket958);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket961); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(Object)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

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
					pushFollow(FOLLOW_statement_in_namespaceBracket963);
					statement14=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement14.getTree());

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(6, input);
						throw eee;
				}
				cnt6++;
			} while (true);

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket966); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal15_tree = 
			(Object)adaptor.create(char_literal15)
			;
			adaptor.addChild(root_0, char_literal15_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, namespaceBracket_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceBracket"


	public static class namespaceId_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final TSPHPParser.namespaceId_return namespaceId() throws RecognitionException {
		TSPHPParser.namespaceId_return retval = new TSPHPParser.namespaceId_return();
		retval.start = input.LT(1);
		int namespaceId_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier16=null;
		Token char_literal17=null;
		Token Identifier18=null;

		Object Identifier16_tree=null;
		Object char_literal17_tree=null;
		Object Identifier18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:4: Identifier ( '\\\\' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1062); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier16_tree = 
			(Object)adaptor.create(Identifier16)
			;
			adaptor.addChild(root_0, Identifier16_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1065); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = 
					(Object)adaptor.create(char_literal17)
					;
					adaptor.addChild(root_0, char_literal17_tree);
					}

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1067); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier18_tree = 
					(Object)adaptor.create(Identifier18)
					;
					adaptor.addChild(root_0, Identifier18_tree);
					}

					}
					break;

				default :
					break loop7;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, namespaceId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceId"


	public static class withoutNamespace_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: ( statement )+
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1080);
					statement19=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement19.getTree());

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(8, input);
						throw eee;
				}
				cnt8++;
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, withoutNamespace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "withoutNamespace"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final TSPHPParser.statement_return statement() throws RecognitionException {
		TSPHPParser.statement_return retval = new TSPHPParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope useDeclarationList20 =null;
		ParserRuleReturnScope definition21 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue22 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:4: useDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1091);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1096);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: instructionWithoutBreakContinue
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1101);
					instructionWithoutBreakContinue22=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class useDeclarationList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final TSPHPParser.useDeclarationList_return useDeclarationList() throws RecognitionException {
		TSPHPParser.useDeclarationList_return retval = new TSPHPParser.useDeclarationList_return();
		retval.start = input.LT(1);
		int useDeclarationList_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal23=null;
		Token char_literal25=null;
		Token char_literal27=null;
		ParserRuleReturnScope useDeclaration24 =null;
		ParserRuleReturnScope useDeclaration26 =null;

		Object string_literal23_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1113); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(Object)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1115);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(Object)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1120);
					useDeclaration26=useDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration26.getTree());

					}
					break;

				default :
					break loop10;
				}
			} while (true);

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1124); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal27_tree = 
			(Object)adaptor.create(char_literal27)
			;
			adaptor.addChild(root_0, char_literal27_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, useDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclarationList"


	public static class useDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
	public final TSPHPParser.useDeclaration_return useDeclaration() throws RecognitionException {
		TSPHPParser.useDeclaration_return retval = new TSPHPParser.useDeclaration_return();
		retval.start = input.LT(1);
		int useDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token string_literal33=null;
		Token Identifier34=null;
		ParserRuleReturnScope namespaceId30 =null;
		ParserRuleReturnScope namespaceId32 =null;

		Object Identifier28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object string_literal33_tree=null;
		Object Identifier34_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			else if ( (LA11_0==Backslash) ) {
				alt11=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1137); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(Object)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(Object)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1141);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:7: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(Object)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1151);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1163); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(Object)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1165); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier34_tree = 
					(Object)adaptor.create(Identifier34)
					;
					adaptor.addChild(root_0, Identifier34_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, useDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclaration"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final TSPHPParser.definition_return definition() throws RecognitionException {
		TSPHPParser.definition_return retval = new TSPHPParser.definition_return();
		retval.start = input.LT(1);
		int definition_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classDeclaration35 =null;
		ParserRuleReturnScope interfaceDeclaration36 =null;
		ParserRuleReturnScope functionDeclaration37 =null;
		ParserRuleReturnScope constDeclarationList38 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1178);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1183);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: functionDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1188);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1193);
					constDeclarationList38=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList38.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, definition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final TSPHPParser.classDeclaration_return classDeclaration() throws RecognitionException {
		TSPHPParser.classDeclaration_return retval = new TSPHPParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token set39=null;
		Token string_literal40=null;
		Token Identifier41=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope extendsDeclaration42 =null;
		ParserRuleReturnScope implementsDeclaration43 =null;
		ParserRuleReturnScope classBody45 =null;

		Object set39_tree=null;
		Object string_literal40_tree=null;
		Object Identifier41_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: ( 'abstract' | 'final' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Abstract||LA14_0==Final) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					set39=(Token)input.LT(1);
					if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(Object)adaptor.create(set39)
						);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1215); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(Object)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1217); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(Object)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1219);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1222);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1225); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(Object)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1227);
					classBody45=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody45.getTree());

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
			} while (true);

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1230); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal46_tree = 
			(Object)adaptor.create(char_literal46)
			;
			adaptor.addChild(root_0, char_literal46_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class extendsDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:1: extendsDeclaration : 'extends' identifierList ;
	public final TSPHPParser.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		TSPHPParser.extendsDeclaration_return retval = new TSPHPParser.extendsDeclaration_return();
		retval.start = input.LT(1);
		int extendsDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal47=null;
		ParserRuleReturnScope identifierList48 =null;

		Object string_literal47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:4: 'extends' identifierList
			{
			root_0 = (Object)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1244); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(Object)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1246);
			identifierList48=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, extendsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class identifierList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:1: identifierList : Identifier ( ',' Identifier )* ;
	public final TSPHPParser.identifierList_return identifierList() throws RecognitionException {
		TSPHPParser.identifierList_return retval = new TSPHPParser.identifierList_return();
		retval.start = input.LT(1);
		int identifierList_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier49=null;
		Token char_literal50=null;
		Token Identifier51=null;

		Object Identifier49_tree=null;
		Object char_literal50_tree=null;
		Object Identifier51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:4: Identifier ( ',' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1255); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(Object)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1258); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(Object)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier51_tree = 
					(Object)adaptor.create(Identifier51)
					;
					adaptor.addChild(root_0, Identifier51_tree);
					}

					}
					break;

				default :
					break loop18;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, identifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class implementsDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:1: implementsDeclaration : 'implements' identifierList ;
	public final TSPHPParser.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		TSPHPParser.implementsDeclaration_return retval = new TSPHPParser.implementsDeclaration_return();
		retval.start = input.LT(1);
		int implementsDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal52=null;
		ParserRuleReturnScope identifierList53 =null;

		Object string_literal52_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: 'implements' identifierList
			{
			root_0 = (Object)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1271); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(Object)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1273);
			identifierList53=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList53.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, implementsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "implementsDeclaration"


	public static class classBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
	public final TSPHPParser.classBody_return classBody() throws RecognitionException {
		TSPHPParser.classBody_return retval = new TSPHPParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope constDeclarationList54 =null;
		ParserRuleReturnScope attributeDeclaration55 =null;
		ParserRuleReturnScope methodDeclaration56 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1283);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:4: attributeDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1288);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: methodDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1294);
					methodDeclaration56=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class constDeclarationList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
	public final TSPHPParser.constDeclarationList_return constDeclarationList() throws RecognitionException {
		TSPHPParser.constDeclarationList_return retval = new TSPHPParser.constDeclarationList_return();
		retval.start = input.LT(1);
		int constDeclarationList_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal57=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope primitiveTypes58 =null;
		ParserRuleReturnScope constantAssignment59 =null;
		ParserRuleReturnScope constantAssignment61 =null;

		Object string_literal57_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1306); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(Object)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1308);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1310);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1313); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(Object)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1315);
					constantAssignment61=constantAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment61.getTree());

					}
					break;

				default :
					break loop20;
				}
			} while (true);

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1319); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal62_tree = 
			(Object)adaptor.create(char_literal62)
			;
			adaptor.addChild(root_0, char_literal62_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, constDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final TSPHPParser.constantAssignment_return constantAssignment() throws RecognitionException {
		TSPHPParser.constantAssignment_return retval = new TSPHPParser.constantAssignment_return();
		retval.start = input.LT(1);
		int constantAssignment_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier63=null;
		Token char_literal64=null;
		ParserRuleReturnScope unaryPrimitiveAtom65 =null;

		Object Identifier63_tree=null;
		Object char_literal64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (Object)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1329); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(Object)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1332); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(Object)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1334);
			unaryPrimitiveAtom65=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom65.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, constantAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class attributeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final TSPHPParser.attributeDeclaration_return attributeDeclaration() throws RecognitionException {
		TSPHPParser.attributeDeclaration_return retval = new TSPHPParser.attributeDeclaration_return();
		retval.start = input.LT(1);
		int attributeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal66=null;
		Token char_literal69=null;
		ParserRuleReturnScope accessor67 =null;
		ParserRuleReturnScope variableDeclarationListInclVariableId68 =null;

		Object string_literal66_tree=null;
		Object char_literal69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: 'static'
					{
					string_literal66=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal66_tree = 
					(Object)adaptor.create(string_literal66)
					;
					adaptor.addChild(root_0, string_literal66_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1347);
			accessor67=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor67.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1349);
			variableDeclarationListInclVariableId68=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId68.getTree());

			char_literal69=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1351); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal69_tree = 
			(Object)adaptor.create(char_literal69)
			;
			adaptor.addChild(root_0, char_literal69_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, attributeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "attributeDeclaration"


	public static class accessor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal71=null;
		ParserRuleReturnScope accessorWithoutPrivate70 =null;

		Object string_literal71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:9: ( accessorWithoutPrivate | 'private' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= Protected && LA22_0 <= Public)) ) {
				alt22=1;
			}
			else if ( (LA22_0==Private) ) {
				alt22=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:11: accessorWithoutPrivate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1358);
					accessorWithoutPrivate70=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate70.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: 'private'
					{
					root_0 = (Object)adaptor.nil();


					string_literal71=(Token)match(input,Private,FOLLOW_Private_in_accessor1363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal71_tree = 
					(Object)adaptor.create(string_literal71)
					;
					adaptor.addChild(root_0, string_literal71_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, accessor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessor"


	public static class accessorWithoutPrivate_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		Object root_0 = null;

		Token set72=null;

		Object set72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:2: ( 'protected' | 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set72=(Token)input.LT(1);
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set72)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, accessorWithoutPrivate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessorWithoutPrivate"


	public static class variableDeclarationListInclVariableId_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final TSPHPParser.variableDeclarationListInclVariableId_return variableDeclarationListInclVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListInclVariableId_return retval = new TSPHPParser.variableDeclarationListInclVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal74=null;
		Token VariableId76=null;
		ParserRuleReturnScope variableDeclaration73 =null;
		ParserRuleReturnScope variableAssignment75 =null;

		Object char_literal74_tree=null;
		Object VariableId76_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1386);
			variableDeclaration73=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration73.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:24: ( ',' ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:25: ',' ( variableAssignment | VariableId )
					{
					char_literal74=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1389); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal74_tree = 
					(Object)adaptor.create(char_literal74)
					;
					adaptor.addChild(root_0, char_literal74_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:29: ( variableAssignment | VariableId )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==VariableId) ) {
						int LA23_1 = input.LA(2);
						if ( (LA23_1==Assign||LA23_1==BitwiseAndEqual||LA23_1==BitwiseOrEqual||LA23_1==BitwiseXorEqual||LA23_1==DivideEqual||LA23_1==DotEqual||LA23_1==LeftSquareBrace||(LA23_1 >= MinusEqual && LA23_1 <= MinusMinus)||LA23_1==ModuloEqual||LA23_1==MultiplyEqual||LA23_1==ObjectOperator||(LA23_1 >= PlusEqual && LA23_1 <= PlusPlus)||LA23_1==ShiftLeftEqual||LA23_1==ShiftRightEqual) ) {
							alt23=1;
						}
						else if ( (LA23_1==Comma||LA23_1==Semicolon) ) {
							alt23=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
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
					else if ( (LA23_0==Backslash||LA23_0==Identifier||LA23_0==MinusMinus||LA23_0==Parent||LA23_0==PlusPlus||LA23_0==Self||LA23_0==This) ) {
						alt23=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1392);
							variableAssignment75=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment75.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:49: VariableId
							{
							VariableId76=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1394); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId76_tree = 
							(Object)adaptor.create(VariableId76)
							;
							adaptor.addChild(root_0, VariableId76_tree);
							}

							}
							break;

					}

					}
					break;

				default :
					break loop24;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, variableDeclarationListInclVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final TSPHPParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		TSPHPParser.methodDeclaration_return retval = new TSPHPParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal77=null;
		Token string_literal79=null;
		Token string_literal80=null;
		Token string_literal81=null;
		Token string_literal82=null;
		ParserRuleReturnScope accessorWithoutPrivate78 =null;
		ParserRuleReturnScope accessor83 =null;
		ParserRuleReturnScope functionDeclaration84 =null;

		Object string_literal77_tree=null;
		Object string_literal79_tree=null;
		Object string_literal80_tree=null;
		Object string_literal81_tree=null;
		Object string_literal82_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==Abstract) ) {
				alt30=1;
			}
			else if ( (LA30_0==Final||LA30_0==Function||LA30_0==Private||(LA30_0 >= Protected && LA30_0 <= Public)||LA30_0==Static) ) {
				alt30=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1411); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal77_tree = 
					(Object)adaptor.create(string_literal77)
					;
					adaptor.addChild(root_0, string_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1413);
							accessorWithoutPrivate78=accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate78.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
					int alt28=3;
					switch ( input.LA(1) ) {
					case Static:
						{
						alt28=1;
						}
						break;
					case Final:
						{
						alt28=2;
						}
						break;
					case Function:
					case Private:
					case Protected:
					case Public:
						{
						alt28=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}
					switch (alt28) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:6: 'static' ( 'final' )?
							{
							string_literal79=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1427); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = 
							(Object)adaptor.create(string_literal79)
							;
							adaptor.addChild(root_0, string_literal79_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:15: 'final'
									{
									string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1429); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal80_tree = 
									(Object)adaptor.create(string_literal80)
									;
									adaptor.addChild(root_0, string_literal80_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:6: 'final' ( 'static' )?
							{
							string_literal81=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1437); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal81_tree = 
							(Object)adaptor.create(string_literal81)
							;
							adaptor.addChild(root_0, string_literal81_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:14: 'static'
									{
									string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1439); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal82_tree = 
									(Object)adaptor.create(string_literal82)
									;
									adaptor.addChild(root_0, string_literal82_tree);
									}

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
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1453);
							accessor83=accessor();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor83.getTree());

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1460);
			functionDeclaration84=functionDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration84.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal85=null;
		Token Identifier86=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope implementsDeclaration87 =null;
		ParserRuleReturnScope interfaceBody89 =null;

		Object string_literal85_tree=null;
		Object Identifier86_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal85=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal85_tree = 
			(Object)adaptor.create(string_literal85)
			;
			adaptor.addChild(root_0, string_literal85_tree);
			}

			Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier86_tree = 
			(Object)adaptor.create(Identifier86)
			;
			adaptor.addChild(root_0, Identifier86_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1474);
					implementsDeclaration87=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration87.getTree());

					}
					break;

			}

			char_literal88=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1477); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = 
			(Object)adaptor.create(char_literal88)
			;
			adaptor.addChild(root_0, char_literal88_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1479);
					interfaceBody89=interfaceBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody89.getTree());

					}
					break;

				default :
					break loop32;
				}
			} while (true);

			char_literal90=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1482); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = 
			(Object)adaptor.create(char_literal90)
			;
			adaptor.addChild(root_0, char_literal90_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope constDeclarationList91 =null;
		ParserRuleReturnScope interfaceMethodDeclaration92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( constDeclarationList | interfaceMethodDeclaration )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Const) ) {
				alt33=1;
			}
			else if ( (LA33_0==Function||LA33_0==Public) ) {
				alt33=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1491);
					constDeclarationList91=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList91.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: interfaceMethodDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1496);
					interfaceMethodDeclaration92=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration92.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal93=null;
		Token char_literal95=null;
		ParserRuleReturnScope functionDeclarationWithoutBody94 =null;

		Object string_literal93_tree=null;
		Object char_literal95_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: 'public'
					{
					string_literal93=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1507); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = 
					(Object)adaptor.create(string_literal93)
					;
					adaptor.addChild(root_0, string_literal93_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1510);
			functionDeclarationWithoutBody94=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody94.getTree());

			char_literal95=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1512); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal95_tree = 
			(Object)adaptor.create(char_literal95)
			;
			adaptor.addChild(root_0, char_literal95_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, interfaceMethodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal97=null;
		Token char_literal99=null;
		ParserRuleReturnScope functionDeclarationWithoutBody96 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue98 =null;

		Object char_literal97_tree=null;
		Object char_literal99_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1528);
			functionDeclarationWithoutBody96=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody96.getTree());

			char_literal97=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1530); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = 
			(Object)adaptor.create(char_literal97)
			;
			adaptor.addChild(root_0, char_literal97_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:40: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==Parent||LA35_0==PlusPlus||LA35_0==Return||LA35_0==Self||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:289:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1532);
					instructionWithoutBreakContinue98=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue98.getTree());

					}
					break;

				default :
					break loop35;
				}
			} while (true);

			char_literal99=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1535); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal99_tree = 
			(Object)adaptor.create(char_literal99)
			;
			adaptor.addChild(root_0, char_literal99_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, functionDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class functionDeclarationWithoutBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal100=null;
		Token Identifier102=null;
		Token char_literal103=null;
		Token char_literal105=null;
		ParserRuleReturnScope returnType101 =null;
		ParserRuleReturnScope paramList104 =null;

		Object string_literal100_tree=null;
		Object Identifier102_tree=null;
		Object char_literal103_tree=null;
		Object char_literal105_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal100=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1545); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal100_tree = 
			(Object)adaptor.create(string_literal100)
			;
			adaptor.addChild(root_0, string_literal100_tree);
			}

			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1547);
			returnType101=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType101.getTree());

			Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1549); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier102_tree = 
			(Object)adaptor.create(Identifier102)
			;
			adaptor.addChild(root_0, Identifier102_tree);
			}

			char_literal103=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1551); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal103_tree = 
			(Object)adaptor.create(char_literal103)
			;
			adaptor.addChild(root_0, char_literal103_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:41: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1553);
					paramList104=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList104.getTree());

					}
					break;

			}

			char_literal105=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1556); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal105_tree = 
			(Object)adaptor.create(char_literal105)
			;
			adaptor.addChild(root_0, char_literal105_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, functionDeclarationWithoutBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationWithoutBody"


	public static class returnType_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:294:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal107=null;
		ParserRuleReturnScope allTypes106 =null;

		Object string_literal107_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:2: ( allTypes | 'void' )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Backslash||LA37_0==Identifier||(LA37_0 >= TypeArray && LA37_0 <= TypeString)) ) {
				alt37=1;
			}
			else if ( (LA37_0==Void) ) {
				alt37=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:4: allTypes
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1566);
					allTypes106=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:15: 'void'
					{
					root_0 = (Object)adaptor.nil();


					string_literal107=(Token)match(input,Void,FOLLOW_Void_in_returnType1570); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal107_tree = 
					(Object)adaptor.create(string_literal107)
					;
					adaptor.addChild(root_0, string_literal107_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended108 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= TypeArray && LA38_0 <= TypeInt)||(LA38_0 >= TypeResource && LA38_0 <= TypeString)) ) {
				alt38=1;
			}
			else if ( (LA38_0==Backslash||LA38_0==Identifier||LA38_0==TypeObject) ) {
				alt38=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:11: primitiveTypesExtended
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1577);
					primitiveTypesExtended108=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:36: classInterfaceTypeInclObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1581);
					classInterfaceTypeInclObject109=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject109.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		Object root_0 = null;

		Token set110=null;

		Object set110_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set110=(Token)input.LT(1);
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set110)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		Object root_0 = null;

		Token TypeArray112=null;
		ParserRuleReturnScope primitiveTypes111 =null;

		Object TypeArray112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:2: ( primitiveTypes | TypeArray )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= TypeBool && LA39_0 <= TypeInt)||LA39_0==TypeString) ) {
				alt39=1;
			}
			else if ( (LA39_0==TypeArray) ) {
				alt39=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:4: primitiveTypes
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1622);
					primitiveTypes111=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes111.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: TypeArray
					{
					root_0 = (Object)adaptor.nil();


					TypeArray112=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1627); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray112_tree = 
					(Object)adaptor.create(TypeArray112)
					;
					adaptor.addChild(root_0, TypeArray112_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		Object root_0 = null;

		Token TypeResource114=null;
		ParserRuleReturnScope primitiveTypesInclArray113 =null;

		Object TypeResource114_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:2: ( primitiveTypesInclArray | TypeResource )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= TypeArray && LA40_0 <= TypeInt)||LA40_0==TypeString) ) {
				alt40=1;
			}
			else if ( (LA40_0==TypeResource) ) {
				alt40=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: primitiveTypesInclArray
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1639);
					primitiveTypesInclArray113=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray113.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: TypeResource
					{
					root_0 = (Object)adaptor.nil();


					TypeResource114=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource114_tree = 
					(Object)adaptor.create(TypeResource114)
					;
					adaptor.addChild(root_0, TypeResource114_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope namespaceId116 =null;

		Object char_literal115_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( '\\\\' )? namespaceId
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: ( '\\\\' )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Backslash) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: '\\\\'
					{
					char_literal115=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal115_tree = 
					(Object)adaptor.create(char_literal115)
					;
					adaptor.addChild(root_0, char_literal115_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1661);
			namespaceId116=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId116.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		Object root_0 = null;

		Token TypeObject117=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject118 =null;

		Object TypeObject117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==TypeObject) ) {
				alt42=1;
			}
			else if ( (LA42_0==Backslash||LA42_0==Identifier) ) {
				alt42=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: TypeObject
					{
					root_0 = (Object)adaptor.nil();


					TypeObject117=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1674); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject117_tree = 
					(Object)adaptor.create(TypeObject117)
					;
					adaptor.addChild(root_0, TypeObject117_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: classInterfaceTypeWithoutObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1680);
					classInterfaceTypeWithoutObject118=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject118.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal120=null;
		Token char_literal123=null;
		Token char_literal127=null;
		Token char_literal128=null;
		ParserRuleReturnScope paramDeclarationOptional119 =null;
		ParserRuleReturnScope paramDeclarationOptional121 =null;
		ParserRuleReturnScope paramDeclaration122 =null;
		ParserRuleReturnScope paramDeclaration124 =null;
		ParserRuleReturnScope paramDeclaration125 =null;
		ParserRuleReturnScope paramDeclaration126 =null;
		ParserRuleReturnScope paramDeclarationOptional129 =null;

		Object char_literal120_tree=null;
		Object char_literal123_tree=null;
		Object char_literal127_tree=null;
		Object char_literal128_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt47=3;
			alt47 = dfa47.predict(input);
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1692);
					paramDeclarationOptional119=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional119.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:29: ( ',' paramDeclarationOptional )*
					loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==Comma) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:30: ',' paramDeclarationOptional
							{
							char_literal120=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1695); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal120_tree = 
							(Object)adaptor.create(char_literal120)
							;
							adaptor.addChild(root_0, char_literal120_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1697);
							paramDeclarationOptional121=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional121.getTree());

							}
							break;

						default :
							break loop43;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: paramDeclaration ( ',' paramDeclaration )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1704);
					paramDeclaration122=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration122.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:21: ( ',' paramDeclaration )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:22: ',' paramDeclaration
							{
							char_literal123=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1707); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal123_tree = 
							(Object)adaptor.create(char_literal123)
							;
							adaptor.addChild(root_0, char_literal123_tree);
							}

							pushFollow(FOLLOW_paramDeclaration_in_paramList1709);
							paramDeclaration124=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration124.getTree());

							}
							break;

						default :
							break loop44;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1716);
					paramDeclaration125=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration125.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:21: ( paramDeclaration ',' )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Backslash||LA45_0==Identifier||(LA45_0 >= TypeArray && LA45_0 <= TypeString)) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1719);
							paramDeclaration126=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration126.getTree());

							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1721); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal127_tree = 
							(Object)adaptor.create(char_literal127)
							;
							adaptor.addChild(root_0, char_literal127_tree);
							}

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:45: ( ',' paramDeclarationOptional )+
					int cnt46=0;
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:46: ',' paramDeclarationOptional
							{
							char_literal128=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1726); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal128_tree = 
							(Object)adaptor.create(char_literal128)
							;
							adaptor.addChild(root_0, char_literal128_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1728);
							paramDeclarationOptional129=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional129.getTree());

							}
							break;

						default :
							if ( cnt46 >= 1 ) break loop46;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(46, input);
								throw eee;
						}
						cnt46++;
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:1: paramDeclaration : allTypes VariableId ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId131=null;
		ParserRuleReturnScope allTypes130 =null;

		Object VariableId131_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: allTypes VariableId
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_paramDeclaration1742);
			allTypes130=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes130.getTree());

			VariableId131=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1744); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId131_tree = 
			(Object)adaptor.create(VariableId131)
			;
			adaptor.addChild(root_0, VariableId131_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, paramDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclaration"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal133=null;
		ParserRuleReturnScope paramDeclaration132 =null;
		ParserRuleReturnScope unaryPrimitiveAtom134 =null;

		Object char_literal133_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1754);
			paramDeclaration132=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration132.getTree());

			char_literal133=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1757); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal133_tree = 
			(Object)adaptor.create(char_literal133)
			;
			adaptor.addChild(root_0, char_literal133_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1759);
			unaryPrimitiveAtom134=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom134.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal135=null;
		Token char_literal137=null;
		ParserRuleReturnScope instructionWithoutBreakContinue136 =null;
		ParserRuleReturnScope instruction138 =null;

		Object char_literal135_tree=null;
		Object char_literal137_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LeftCurlyBrace) ) {
				alt49=1;
			}
			else if ( (LA49_0==Backslash||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= For && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==MinusMinus||LA49_0==Parent||LA49_0==PlusPlus||LA49_0==Return||LA49_0==Self||(LA49_0 >= Switch && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
				alt49=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					root_0 = (Object)adaptor.nil();


					char_literal135=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal135_tree = 
					(Object)adaptor.create(char_literal135)
					;
					adaptor.addChild(root_0, char_literal135_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: ( instructionWithoutBreakContinue )+
					int cnt48=0;
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Do||LA48_0==Echo||LA48_0==Exit||(LA48_0 >= For && LA48_0 <= Foreach)||(LA48_0 >= Identifier && LA48_0 <= If)||LA48_0==LeftCurlyBrace||LA48_0==MinusMinus||LA48_0==Parent||LA48_0==PlusPlus||LA48_0==Return||LA48_0==Self||(LA48_0 >= Switch && LA48_0 <= TypeString)||LA48_0==VariableId||LA48_0==While) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1783);
							instructionWithoutBreakContinue136=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue136.getTree());

							}
							break;

						default :
							if ( cnt48 >= 1 ) break loop48;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(48, input);
								throw eee;
						}
						cnt48++;
					} while (true);

					char_literal137=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1787); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal137_tree = 
					(Object)adaptor.create(char_literal137)
					;
					adaptor.addChild(root_0, char_literal137_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: instruction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1792);
					instruction138=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal139=null;
		Token char_literal141=null;
		Token set143=null;
		Token Int144=null;
		Token char_literal145=null;
		ParserRuleReturnScope instructionInclBreakContinue140 =null;
		ParserRuleReturnScope instruction142 =null;

		Object char_literal139_tree=null;
		Object char_literal141_tree=null;
		Object set143_tree=null;
		Object Int144_tree=null;
		Object char_literal145_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt52=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt52=1;
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
				alt52=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt52=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					root_0 = (Object)adaptor.nil();


					char_literal139=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1803); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal139_tree = 
					(Object)adaptor.create(char_literal139)
					;
					adaptor.addChild(root_0, char_literal139_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:8: ( instructionInclBreakContinue )+
					int cnt50=0;
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==Backslash||LA50_0==Break||LA50_0==Continue||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==LeftCurlyBrace||LA50_0==MinusMinus||LA50_0==Parent||LA50_0==PlusPlus||LA50_0==Return||LA50_0==Self||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1805);
							instructionInclBreakContinue140=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue140.getTree());

							}
							break;

						default :
							if ( cnt50 >= 1 ) break loop50;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(50, input);
								throw eee;
						}
						cnt50++;
					} while (true);

					char_literal141=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1809); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal141_tree = 
					(Object)adaptor.create(char_literal141)
					;
					adaptor.addChild(root_0, char_literal141_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: instruction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1814);
					instruction142=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction142.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:4: ( 'break' | 'continue' ) ( Int )? ';'
					{
					root_0 = (Object)adaptor.nil();


					set143=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(Object)adaptor.create(set143)
						);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:25: ( Int )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==Int) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:25: Int
							{
							Int144=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1825); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int144_tree = 
							(Object)adaptor.create(Int144)
							;
							adaptor.addChild(root_0, Int144_tree);
							}

							}
							break;

					}

					char_literal145=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1828); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal145_tree = 
					(Object)adaptor.create(char_literal145)
					;
					adaptor.addChild(root_0, char_literal145_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal147=null;
		Token char_literal149=null;
		Token char_literal159=null;
		Token char_literal161=null;
		Token string_literal162=null;
		Token char_literal164=null;
		Token string_literal165=null;
		Token char_literal167=null;
		Token string_literal168=null;
		Token char_literal169=null;
		ParserRuleReturnScope variableAssignment146 =null;
		ParserRuleReturnScope variableDeclaration148 =null;
		ParserRuleReturnScope ifCondition150 =null;
		ParserRuleReturnScope switchCondition151 =null;
		ParserRuleReturnScope forLoop152 =null;
		ParserRuleReturnScope foreachLoop153 =null;
		ParserRuleReturnScope whileLoop154 =null;
		ParserRuleReturnScope doWhileLoop155 =null;
		ParserRuleReturnScope tryCatch156 =null;
		ParserRuleReturnScope throwException157 =null;
		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd158 =null;
		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd160 =null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expressionList166 =null;

		Object char_literal147_tree=null;
		Object char_literal149_tree=null;
		Object char_literal159_tree=null;
		Object char_literal161_tree=null;
		Object string_literal162_tree=null;
		Object char_literal164_tree=null;
		Object string_literal165_tree=null;
		Object char_literal167_tree=null;
		Object string_literal168_tree=null;
		Object char_literal169_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt54=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA54_1 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				break;
			case Self:
				{
				int LA54_2 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA54_3 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA54_4 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred69_TSPHP()) ) {
					alt54=2;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt54=11;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA54_5 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred69_TSPHP()) ) {
					alt54=2;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt54=11;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA54_6 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt54=1;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt54=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 6, input);
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
				alt54=1;
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
				alt54=2;
				}
				break;
			case If:
				{
				alt54=3;
				}
				break;
			case Switch:
				{
				alt54=4;
				}
				break;
			case For:
				{
				alt54=5;
				}
				break;
			case Foreach:
				{
				alt54=6;
				}
				break;
			case While:
				{
				alt54=7;
				}
				break;
			case Do:
				{
				alt54=8;
				}
				break;
			case Try:
				{
				alt54=9;
				}
				break;
			case Throw:
				{
				alt54=10;
				}
				break;
			case Return:
				{
				alt54=13;
				}
				break;
			case Echo:
				{
				alt54=14;
				}
				break;
			case Exit:
				{
				alt54=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: variableAssignment ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction1840);
					variableAssignment146=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment146.getTree());

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1842); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal147_tree = 
					(Object)adaptor.create(char_literal147)
					;
					adaptor.addChild(root_0, char_literal147_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: variableDeclaration ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction1847);
					variableDeclaration148=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration148.getTree());

					char_literal149=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal149_tree = 
					(Object)adaptor.create(char_literal149)
					;
					adaptor.addChild(root_0, char_literal149_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:4: ifCondition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction1854);
					ifCondition150=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition150.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: switchCondition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction1859);
					switchCondition151=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition151.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: forLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction1864);
					forLoop152=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop152.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: foreachLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction1869);
					foreachLoop153=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop153.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: whileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction1874);
					whileLoop154=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop154.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: doWhileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction1879);
					doWhileLoop155=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop155.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: tryCatch
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction1884);
					tryCatch156=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch156.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: throwException
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction1889);
					throwException157=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException157.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: functionCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1894);
					functionCallFluentWithoutAccessAtTheEnd158=functionCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd158.getTree());

					char_literal159=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1896); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal159_tree = 
					(Object)adaptor.create(char_literal159)
					;
					adaptor.addChild(root_0, char_literal159_tree);
					}

					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: methodCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1901);
					methodCallFluentWithoutAccessAtTheEnd160=methodCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd160.getTree());

					char_literal161=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1903); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal161_tree = 
					(Object)adaptor.create(char_literal161)
					;
					adaptor.addChild(root_0, char_literal161_tree);
					}

					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: 'return' ( expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal162=(Token)match(input,Return,FOLLOW_Return_in_instruction1909); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal162_tree = 
					(Object)adaptor.create(string_literal162)
					;
					adaptor.addChild(root_0, string_literal162_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:13: ( expression )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==At||LA53_0==Backslash||LA53_0==BitwiseNot||LA53_0==Bool||LA53_0==Clone||LA53_0==Float||LA53_0==Identifier||LA53_0==Int||(LA53_0 >= LeftParanthesis && LA53_0 <= LeftSquareBrace)||LA53_0==LogicNot||LA53_0==Minus||LA53_0==MinusMinus||LA53_0==New||LA53_0==Null||(LA53_0 >= Parent && LA53_0 <= Plus)||LA53_0==PlusPlus||LA53_0==Self||LA53_0==String||LA53_0==This||LA53_0==TypeArray||LA53_0==VariableId) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1911);
							expression163=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());

							}
							break;

					}

					char_literal164=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal164_tree = 
					(Object)adaptor.create(char_literal164)
					;
					adaptor.addChild(root_0, char_literal164_tree);
					}

					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: 'echo' expressionList ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal165=(Token)match(input,Echo,FOLLOW_Echo_in_instruction1919); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal165_tree = 
					(Object)adaptor.create(string_literal165)
					;
					adaptor.addChild(root_0, string_literal165_tree);
					}

					pushFollow(FOLLOW_expressionList_in_instruction1921);
					expressionList166=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList166.getTree());

					char_literal167=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1923); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal167_tree = 
					(Object)adaptor.create(char_literal167)
					;
					adaptor.addChild(root_0, char_literal167_tree);
					}

					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: 'exit' ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal168=(Token)match(input,Exit,FOLLOW_Exit_in_instruction1928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal168_tree = 
					(Object)adaptor.create(string_literal168)
					;
					adaptor.addChild(root_0, string_literal168_tree);
					}

					char_literal169=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1930); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal169_tree = 
					(Object)adaptor.create(char_literal169)
					;
					adaptor.addChild(root_0, char_literal169_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:1: expressionList : expression ( ',' expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal171=null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression172 =null;

		Object char_literal171_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList1942);
			expression170=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:15: ( ',' expression )*
			loop55:
			do {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==Comma) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:16: ',' expression
					{
					char_literal171=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList1945); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal171_tree = 
					(Object)adaptor.create(char_literal171)
					;
					adaptor.addChild(root_0, char_literal171_tree);
					}

					pushFollow(FOLLOW_expression_in_expressionList1947);
					expression172=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression172.getTree());

					}
					break;

				default :
					break loop55;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:1: variableAssignment : ( VariableId assignmentOperator expression | incrementDecrement );
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId173=null;
		ParserRuleReturnScope assignmentOperator174 =null;
		ParserRuleReturnScope expression175 =null;
		ParserRuleReturnScope incrementDecrement176 =null;

		Object VariableId173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:2: ( VariableId assignmentOperator expression | incrementDecrement )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==VariableId) ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1==Assign||LA56_1==BitwiseAndEqual||LA56_1==BitwiseOrEqual||LA56_1==BitwiseXorEqual||LA56_1==DivideEqual||LA56_1==DotEqual||LA56_1==MinusEqual||LA56_1==ModuloEqual||LA56_1==MultiplyEqual||LA56_1==PlusEqual||LA56_1==ShiftLeftEqual||LA56_1==ShiftRightEqual) ) {
					alt56=1;
				}
				else if ( (LA56_1==LeftSquareBrace||LA56_1==MinusMinus||LA56_1==ObjectOperator||LA56_1==PlusPlus) ) {
					alt56=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA56_0==Backslash||LA56_0==Identifier||LA56_0==MinusMinus||LA56_0==Parent||LA56_0==PlusPlus||LA56_0==Self||LA56_0==This) ) {
				alt56=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: VariableId assignmentOperator expression
					{
					root_0 = (Object)adaptor.nil();


					VariableId173=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId173_tree = 
					(Object)adaptor.create(VariableId173)
					;
					adaptor.addChild(root_0, VariableId173_tree);
					}

					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1960);
					assignmentOperator174=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator174.getTree());

					pushFollow(FOLLOW_expression_in_variableAssignment1962);
					expression175=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression175.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: incrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_variableAssignment1967);
					incrementDecrement176=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement176.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope postIncrementDecrement177 =null;
		ParserRuleReturnScope preIncrementDecrement178 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==Backslash||LA57_0==Identifier||LA57_0==Parent||LA57_0==Self||LA57_0==This||LA57_0==VariableId) ) {
				alt57=1;
			}
			else if ( (LA57_0==MinusMinus||LA57_0==PlusPlus) ) {
				alt57=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: postIncrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement1979);
					postIncrementDecrement177=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement177.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: preIncrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement1984);
					preIncrementDecrement178=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement178.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set179=null;

		Object set179_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set179=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set179)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:1: postIncrementDecrement : variableMemberStaticMember ( '++' | '--' ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		Token set181=null;
		ParserRuleReturnScope variableMemberStaticMember180 =null;

		Object set181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:2: ( variableMemberStaticMember ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: variableMemberStaticMember ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2062);
			variableMemberStaticMember180=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember180.getTree());

			set181=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set181)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:1: preIncrementDecrement : ( '++' | '--' ) variableMemberStaticMember ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		Token set182=null;
		ParserRuleReturnScope variableMemberStaticMember183 =null;

		Object set182_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:2: ( ( '++' | '--' ) variableMemberStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: ( '++' | '--' ) variableMemberStaticMember
			{
			root_0 = (Object)adaptor.nil();


			set182=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set182)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2084);
			variableMemberStaticMember183=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember183.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: variableDeclaration : allTypes VariableId ( '=' ^ expression )? ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId185=null;
		Token char_literal186=null;
		ParserRuleReturnScope allTypes184 =null;
		ParserRuleReturnScope expression187 =null;

		Object VariableId185_tree=null;
		Object char_literal186_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( allTypes VariableId ( '=' ^ expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: allTypes VariableId ( '=' ^ expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_variableDeclaration2096);
			allTypes184=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes184.getTree());

			VariableId185=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2098); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId185_tree = 
			(Object)adaptor.create(VariableId185)
			;
			adaptor.addChild(root_0, VariableId185_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:24: ( '=' ^ expression )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Assign) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:25: '=' ^ expression
					{
					char_literal186=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2101); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal186_tree = 
					(Object)adaptor.create(char_literal186)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal186_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_variableDeclaration2104);
					expression187=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression187.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope logicOrWeak188 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: logicOrWeak
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2116);
			logicOrWeak188=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak188.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionForTest_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionForTest"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:1: expressionForTest : expression ';' ;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal190=null;
		ParserRuleReturnScope expression189 =null;

		Object char_literal190_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:2: ( expression ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: expression ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2125);
			expression189=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression189.getTree());

			char_literal190=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal190_tree = 
			(Object)adaptor.create(char_literal190)
			;
			adaptor.addChild(root_0, char_literal190_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, expressionForTest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionForTest"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal192=null;
		ParserRuleReturnScope logicXorWeak191 =null;
		ParserRuleReturnScope logicXorWeak193 =null;

		Object string_literal192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2136);
			logicXorWeak191=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak191.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:17: ( 'or' ^ logicXorWeak )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==LogicOrWeak) ) {
					int LA59_2 = input.LA(2);
					if ( (synpred100_TSPHP()) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: 'or' ^ logicXorWeak
					{
					string_literal192=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal192_tree = 
					(Object)adaptor.create(string_literal192)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal192_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2142);
					logicXorWeak193=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak193.getTree());

					}
					break;

				default :
					break loop59;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal195=null;
		ParserRuleReturnScope logicAndWeak194 =null;
		ParserRuleReturnScope logicAndWeak196 =null;

		Object string_literal195_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2155);
			logicAndWeak194=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak194.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:17: ( 'xor' ^ logicAndWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicXorWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:18: 'xor' ^ logicAndWeak
					{
					string_literal195=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2158); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(Object)adaptor.create(string_literal195)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal195_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2161);
					logicAndWeak196=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak196.getTree());

					}
					break;

				default :
					break loop60;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal198=null;
		ParserRuleReturnScope assignment197 =null;
		ParserRuleReturnScope assignment199 =null;

		Object string_literal198_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2174);
			assignment197=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment197.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:15: ( 'and' ^ assignment )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicAndWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:16: 'and' ^ assignment
					{
					string_literal198=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = 
					(Object)adaptor.create(string_literal198)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2180);
					assignment199=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment199.getTree());

					}
					break;

				default :
					break loop61;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope ternary200 =null;
		ParserRuleReturnScope assignmentOperator201 =null;
		ParserRuleReturnScope ternary202 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:4: ternary ( assignmentOperator ternary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2191);
			ternary200=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary200.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:12: ( assignmentOperator ternary )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Assign||LA62_0==BitwiseAndEqual||LA62_0==BitwiseOrEqual||LA62_0==BitwiseXorEqual||LA62_0==DivideEqual||LA62_0==DotEqual||LA62_0==MinusEqual||LA62_0==ModuloEqual||LA62_0==MultiplyEqual||LA62_0==PlusEqual||LA62_0==ShiftLeftEqual||LA62_0==ShiftRightEqual) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2194);
					assignmentOperator201=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator201.getTree());

					pushFollow(FOLLOW_ternary_in_assignment2196);
					ternary202=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary202.getTree());

					}
					break;

				default :
					break loop62;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal204=null;
		Token char_literal206=null;
		ParserRuleReturnScope logicOr203 =null;
		ParserRuleReturnScope expression205 =null;
		ParserRuleReturnScope expression207 =null;

		Object char_literal204_tree=null;
		Object char_literal206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2206);
			logicOr203=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr203.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:19: ( '?' ^ expression ':' ! expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==QuestionMark) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:20: '?' ^ expression ':' ! expression
					{
					char_literal204=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2209); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal204_tree = 
					(Object)adaptor.create(char_literal204)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal204_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2212);
					expression205=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression205.getTree());

					char_literal206=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2214); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2217);
					expression207=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression207.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal209=null;
		ParserRuleReturnScope logicAnd208 =null;
		ParserRuleReturnScope logicAnd210 =null;

		Object string_literal209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2227);
			logicAnd208=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd208.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:20: ( '||' ^ logicAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOr) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:21: '||' ^ logicAnd
					{
					string_literal209=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal209_tree = 
					(Object)adaptor.create(string_literal209)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal209_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2233);
					logicAnd210=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd210.getTree());

					}
					break;

				default :
					break loop64;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope bitwiseOr211 =null;
		ParserRuleReturnScope bitwiseOr213 =null;

		Object string_literal212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2242);
			bitwiseOr211=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr211.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:21: ( '&&' ^ bitwiseOr )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:22: '&&' ^ bitwiseOr
					{
					string_literal212=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = 
					(Object)adaptor.create(string_literal212)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2248);
					bitwiseOr213=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr213.getTree());

					}
					break;

				default :
					break loop65;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal215=null;
		ParserRuleReturnScope bitwiseXor214 =null;
		ParserRuleReturnScope bitwiseXor216 =null;

		Object char_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2259);
			bitwiseXor214=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor214.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:15: ( '|' ^ bitwiseXor )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==BitwiseOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:16: '|' ^ bitwiseXor
					{
					char_literal215=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = 
					(Object)adaptor.create(char_literal215)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2265);
					bitwiseXor216=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor216.getTree());

					}
					break;

				default :
					break loop66;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope bitwiseAnd217 =null;
		ParserRuleReturnScope bitwiseAnd219 =null;

		Object char_literal218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2276);
			bitwiseAnd217=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd217.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:15: ( '^' ^ bitwiseAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseXor) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:16: '^' ^ bitwiseAnd
					{
					char_literal218=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal218_tree = 
					(Object)adaptor.create(char_literal218)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal218_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2282);
					bitwiseAnd219=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd219.getTree());

					}
					break;

				default :
					break loop67;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal221=null;
		ParserRuleReturnScope equality220 =null;
		ParserRuleReturnScope equality222 =null;

		Object char_literal221_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:4: equality ( '&' ^ equality )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2293);
			equality220=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality220.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:13: ( '&' ^ equality )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:14: '&' ^ equality
					{
					char_literal221=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2296); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal221_tree = 
					(Object)adaptor.create(char_literal221)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal221_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2299);
					equality222=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality222.getTree());

					}
					break;

				default :
					break loop68;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope comparison223 =null;
		ParserRuleReturnScope equalityOperator224 =null;
		ParserRuleReturnScope comparison225 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2308);
			comparison223=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison223.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:22: ( equalityOperator ^ comparison )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Equal||LA69_0==Identical||(LA69_0 >= NotEqual && LA69_0 <= NotIdentical)) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2311);
					equalityOperator224=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(equalityOperator224.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2314);
					comparison225=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison225.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set226=null;

		Object set226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set226=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set226)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope bitwiseShift227 =null;
		ParserRuleReturnScope comparisonOperator228 =null;
		ParserRuleReturnScope bitwiseShift229 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2356);
			bitwiseShift227=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift227.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:17: ( comparisonOperator ^ bitwiseShift )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( ((LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||(LA70_0 >= LessEqualThan && LA70_0 <= LessThan)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2359);
					comparisonOperator228=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(comparisonOperator228.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2362);
					bitwiseShift229=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift229.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set230=null;

		Object set230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set230=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set230)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		Object root_0 = null;

		Token set232=null;
		ParserRuleReturnScope termOrStringConcatenation231 =null;
		ParserRuleReturnScope termOrStringConcatenation233 =null;

		Object set232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2398);
			termOrStringConcatenation231=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation231.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ShiftLeft||LA71_0==ShiftRight) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set232=(Token)input.LT(1);
					set232=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set232)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2408);
					termOrStringConcatenation233=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation233.getTree());

					}
					break;

				default :
					break loop71;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		Object root_0 = null;

		Token set235=null;
		ParserRuleReturnScope factor234 =null;
		ParserRuleReturnScope factor236 =null;

		Object set235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2418);
			factor234=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor234.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Dot||LA72_0==Minus||LA72_0==Plus) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:37: ( '+' | '-' | '.' ) ^ factor
					{
					set235=(Token)input.LT(1);
					set235=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set235)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2430);
					factor236=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor236.getTree());

					}
					break;

				default :
					break loop72;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		Object root_0 = null;

		Token set238=null;
		ParserRuleReturnScope logicNot237 =null;
		ParserRuleReturnScope logicNot239 =null;

		Object set238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2440);
			logicNot237=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot237.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Divide||LA73_0==Modulo||LA73_0==Multiply) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set238=(Token)input.LT(1);
					set238=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set238)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2452);
					logicNot239=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot239.getTree());

					}
					break;

				default :
					break loop73;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:1: logicNot : ( '!' logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal240=null;
		ParserRuleReturnScope logicNot241 =null;
		ParserRuleReturnScope instanceOf242 =null;

		Object char_literal240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:9: ( '!' logicNot | instanceOf )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LogicNot) ) {
				alt74=1;
			}
			else if ( (LA74_0==At||LA74_0==Backslash||LA74_0==BitwiseNot||LA74_0==Bool||LA74_0==Clone||LA74_0==Float||LA74_0==Identifier||LA74_0==Int||(LA74_0 >= LeftParanthesis && LA74_0 <= LeftSquareBrace)||LA74_0==Minus||LA74_0==MinusMinus||LA74_0==New||LA74_0==Null||(LA74_0 >= Parent && LA74_0 <= Plus)||LA74_0==PlusPlus||LA74_0==Self||LA74_0==String||LA74_0==This||LA74_0==TypeArray||LA74_0==VariableId) ) {
				alt74=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:11: '!' logicNot
					{
					root_0 = (Object)adaptor.nil();


					char_literal240=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2461); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal240_tree = 
					(Object)adaptor.create(char_literal240)
					;
					adaptor.addChild(root_0, char_literal240_tree);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2463);
					logicNot241=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot241.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:4: instanceOf
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2468);
					instanceOf242=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf242.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal244=null;
		Token VariableId246=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt243 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject245 =null;

		Object string_literal244_tree=null;
		Object VariableId246_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2480);
			castOrBitwiseNotOrAt243=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt243.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Instanceof) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal244=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2483); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal244_tree = 
					(Object)adaptor.create(string_literal244)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal244_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==Backslash||LA75_0==Identifier) ) {
						alt75=1;
					}
					else if ( (LA75_0==VariableId) ) {
						alt75=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 75, 0, input);
						throw nvae;
					}
					switch (alt75) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2487);
							classInterfaceTypeWithoutObject245=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject245.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:73: VariableId
							{
							VariableId246=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2489); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId246_tree = 
							(Object)adaptor.create(VariableId246)
							;
							adaptor.addChild(root_0, VariableId246_tree);
							}

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:1: castOrBitwiseNotOrAt : ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal247=null;
		Token char_literal250=null;
		Token char_literal252=null;
		Token char_literal254=null;
		ParserRuleReturnScope primitiveTypesInclArray248 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject249 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt251 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt253 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt255 =null;
		ParserRuleReturnScope newOrClone256 =null;

		Object char_literal247_tree=null;
		Object char_literal250_tree=null;
		Object char_literal252_tree=null;
		Object char_literal254_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:2: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone )
			int alt78=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA78_1 = input.LA(2);
				if ( (synpred131_TSPHP()) ) {
					alt78=1;
				}
				else if ( (true) ) {
					alt78=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
					{
					char_literal247=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal247_tree = 
					(Object)adaptor.create(char_literal247)
					;
					adaptor.addChild(root_0, char_literal247_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( ((LA77_0 >= TypeArray && LA77_0 <= TypeInt)||LA77_0==TypeString) ) {
						alt77=1;
					}
					else if ( (LA77_0==Backslash||LA77_0==Identifier||LA77_0==TypeObject) ) {
						alt77=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 77, 0, input);
						throw nvae;
					}
					switch (alt77) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:10: primitiveTypesInclArray
							{
							pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2505);
							primitiveTypesInclArray248=primitiveTypesInclArray();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray248.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:34: classInterfaceTypeInclObject
							{
							pushFollow(FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2507);
							classInterfaceTypeInclObject249=classInterfaceTypeInclObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject249.getTree());

							}
							break;

					}

					char_literal250=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2510); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal250_tree = 
					(Object)adaptor.create(char_literal250)
					;
					adaptor.addChild(root_0, char_literal250_tree);
					}

					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2513);
					castOrBitwiseNotOrAt251=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt251.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					char_literal252=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal252_tree = 
					(Object)adaptor.create(char_literal252)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal252_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2521);
					castOrBitwiseNotOrAt253=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt253.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					char_literal254=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal254_tree = 
					(Object)adaptor.create(char_literal254)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal254_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2529);
					castOrBitwiseNotOrAt255=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt255.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:4: newOrClone
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2534);
					newOrClone256=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone256.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class newOrClone_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:1: newOrClone : ( 'clone' variableMemberStaticMember | newObject | unaryPrimary );
	public final TSPHPParser.newOrClone_return newOrClone() throws RecognitionException {
		TSPHPParser.newOrClone_return retval = new TSPHPParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal257=null;
		ParserRuleReturnScope variableMemberStaticMember258 =null;
		ParserRuleReturnScope newObject259 =null;
		ParserRuleReturnScope unaryPrimary260 =null;

		Object string_literal257_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:2: ( 'clone' variableMemberStaticMember | newObject | unaryPrimary )
			int alt79=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt79=1;
				}
				break;
			case New:
				{
				alt79=2;
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
			case MinusMinus:
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
				alt79=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:4: 'clone' variableMemberStaticMember
					{
					root_0 = (Object)adaptor.nil();


					string_literal257=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone2545); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal257_tree = 
					(Object)adaptor.create(string_literal257)
					;
					adaptor.addChild(root_0, string_literal257_tree);
					}

					pushFollow(FOLLOW_variableMemberStaticMember_in_newOrClone2547);
					variableMemberStaticMember258=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember258.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:4: newObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_newOrClone2552);
					newObject259=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject259.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:486:4: unaryPrimary
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_newOrClone2557);
					unaryPrimary260=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary260.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, newOrClone_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newOrClone"


	public static class variableMemberStaticMember_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableMemberStaticMember"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:1: variableMemberStaticMember : ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId );
	public final TSPHPParser.variableMemberStaticMember_return variableMemberStaticMember() throws RecognitionException {
		TSPHPParser.variableMemberStaticMember_return retval = new TSPHPParser.variableMemberStaticMember_return();
		retval.start = input.LT(1);
		int variableMemberStaticMember_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId262=null;
		Token string_literal264=null;
		Token VariableId266=null;
		Token string_literal268=null;
		Token VariableId269=null;
		ParserRuleReturnScope staticAccessOrParent261 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess263 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess265 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess267 =null;

		Object VariableId262_tree=null;
		Object string_literal264_tree=null;
		Object VariableId266_tree=null;
		Object string_literal268_tree=null;
		Object VariableId269_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:2: ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId )
			int alt83=5;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt83=1;
				}
				break;
			case This:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA83_4 = input.LA(3);
					if ( (LA83_4==Identifier) ) {
						int LA83_10 = input.LA(4);
						if ( (LA83_10==LeftParanthesis) ) {
							alt83=4;
						}
						else if ( (LA83_10==EOF||LA83_10==Arrow||LA83_10==Assign||(LA83_10 >= BitwiseAnd && LA83_10 <= BitwiseAndEqual)||(LA83_10 >= BitwiseOr && LA83_10 <= BitwiseXorEqual)||(LA83_10 >= Colon && LA83_10 <= Comma)||(LA83_10 >= Divide && LA83_10 <= DivideEqual)||(LA83_10 >= Dot && LA83_10 <= DotEqual)||LA83_10==Equal||(LA83_10 >= GreaterEqualThan && LA83_10 <= GreaterThan)||LA83_10==Identical||LA83_10==Instanceof||(LA83_10 >= LeftSquareBrace && LA83_10 <= LogicAndWeak)||(LA83_10 >= LogicOr && LA83_10 <= MultiplyEqual)||(LA83_10 >= NotEqual && LA83_10 <= NotIdentical)||LA83_10==ObjectOperator||(LA83_10 >= Plus && LA83_10 <= PlusPlus)||LA83_10==QuestionMark||(LA83_10 >= RightParanthesis && LA83_10 <= RightSquareBrace)||(LA83_10 >= Semicolon && LA83_10 <= ShiftRightEqual)) ) {
							alt83=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 83, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA83_4==EOF) ) {
						alt83=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
				case LeftSquareBrace:
					{
					alt83=2;
					}
					break;
				case EOF:
				case Arrow:
				case Assign:
				case BitwiseAnd:
				case BitwiseAndEqual:
				case BitwiseOr:
				case BitwiseOrEqual:
				case BitwiseXor:
				case BitwiseXorEqual:
				case Colon:
				case Comma:
				case Divide:
				case DivideEqual:
				case Dot:
				case DotEqual:
				case Equal:
				case GreaterEqualThan:
				case GreaterThan:
				case Identical:
				case Instanceof:
				case LessEqualThan:
				case LessThan:
				case LogicAnd:
				case LogicAndWeak:
				case LogicOr:
				case LogicOrWeak:
				case LogicXorWeak:
				case Minus:
				case MinusEqual:
				case MinusMinus:
				case Modulo:
				case ModuloEqual:
				case Multiply:
				case MultiplyEqual:
				case NotEqual:
				case NotEqualAlternative:
				case NotIdentical:
				case Plus:
				case PlusEqual:
				case PlusPlus:
				case QuestionMark:
				case RightParanthesis:
				case RightSquareBrace:
				case Semicolon:
				case ShiftLeft:
				case ShiftLeftEqual:
				case ShiftRight:
				case ShiftRightEqual:
					{
					alt83=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case VariableId:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA83_7 = input.LA(3);
					if ( (LA83_7==Identifier) ) {
						int LA83_11 = input.LA(4);
						if ( (LA83_11==LeftParanthesis) ) {
							alt83=5;
						}
						else if ( (LA83_11==EOF||LA83_11==Arrow||LA83_11==Assign||(LA83_11 >= BitwiseAnd && LA83_11 <= BitwiseAndEqual)||(LA83_11 >= BitwiseOr && LA83_11 <= BitwiseXorEqual)||(LA83_11 >= Colon && LA83_11 <= Comma)||(LA83_11 >= Divide && LA83_11 <= DivideEqual)||(LA83_11 >= Dot && LA83_11 <= DotEqual)||LA83_11==Equal||(LA83_11 >= GreaterEqualThan && LA83_11 <= GreaterThan)||LA83_11==Identical||LA83_11==Instanceof||(LA83_11 >= LeftSquareBrace && LA83_11 <= LogicAndWeak)||(LA83_11 >= LogicOr && LA83_11 <= MultiplyEqual)||(LA83_11 >= NotEqual && LA83_11 <= NotIdentical)||LA83_11==ObjectOperator||(LA83_11 >= Plus && LA83_11 <= PlusPlus)||LA83_11==QuestionMark||(LA83_11 >= RightParanthesis && LA83_11 <= RightSquareBrace)||(LA83_11 >= Semicolon && LA83_11 <= ShiftRightEqual)) ) {
							alt83=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 83, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA83_7==EOF) ) {
						alt83=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 83, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt83=3;
					}
					break;
				case EOF:
				case Arrow:
				case Assign:
				case BitwiseAnd:
				case BitwiseAndEqual:
				case BitwiseOr:
				case BitwiseOrEqual:
				case BitwiseXor:
				case BitwiseXorEqual:
				case Colon:
				case Comma:
				case Divide:
				case DivideEqual:
				case Dot:
				case DotEqual:
				case Equal:
				case GreaterEqualThan:
				case GreaterThan:
				case Identical:
				case Instanceof:
				case LessEqualThan:
				case LessThan:
				case LogicAnd:
				case LogicAndWeak:
				case LogicOr:
				case LogicOrWeak:
				case LogicXorWeak:
				case Minus:
				case MinusEqual:
				case MinusMinus:
				case Modulo:
				case ModuloEqual:
				case Multiply:
				case MultiplyEqual:
				case NotEqual:
				case NotEqualAlternative:
				case NotIdentical:
				case Plus:
				case PlusEqual:
				case PlusPlus:
				case QuestionMark:
				case RightParanthesis:
				case RightSquareBrace:
				case Semicolon:
				case ShiftLeft:
				case ShiftLeftEqual:
				case ShiftRight:
				case ShiftRightEqual:
					{
					alt83=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: staticAccessOrParent VariableId ( memberAccessOrArrayAccess )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2570);
					staticAccessOrParent261=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent261.getTree());

					VariableId262=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2572); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId262_tree = 
					(Object)adaptor.create(VariableId262)
					;
					adaptor.addChild(root_0, VariableId262_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:36: ( memberAccessOrArrayAccess )*
					loop80:
					do {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==ObjectOperator) ) {
							int LA80_2 = input.LA(2);
							if ( (LA80_2==Identifier) ) {
								int LA80_4 = input.LA(3);
								if ( (LA80_4==EOF||LA80_4==Arrow||LA80_4==Assign||(LA80_4 >= BitwiseAnd && LA80_4 <= BitwiseAndEqual)||(LA80_4 >= BitwiseOr && LA80_4 <= BitwiseXorEqual)||(LA80_4 >= Colon && LA80_4 <= Comma)||(LA80_4 >= Divide && LA80_4 <= DivideEqual)||(LA80_4 >= Dot && LA80_4 <= DotEqual)||LA80_4==Equal||(LA80_4 >= GreaterEqualThan && LA80_4 <= GreaterThan)||LA80_4==Identical||LA80_4==Instanceof||(LA80_4 >= LeftSquareBrace && LA80_4 <= LogicAndWeak)||(LA80_4 >= LogicOr && LA80_4 <= MultiplyEqual)||(LA80_4 >= NotEqual && LA80_4 <= NotIdentical)||LA80_4==ObjectOperator||(LA80_4 >= Plus && LA80_4 <= PlusPlus)||LA80_4==QuestionMark||(LA80_4 >= RightParanthesis && LA80_4 <= RightSquareBrace)||(LA80_4 >= Semicolon && LA80_4 <= ShiftRightEqual)) ) {
									alt80=1;
								}

							}

						}
						else if ( (LA80_0==LeftSquareBrace) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:36: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2574);
							memberAccessOrArrayAccess263=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess263.getTree());

							}
							break;

						default :
							break loop80;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:4: '$this' ( memberAccessOrArrayAccess )+
					{
					root_0 = (Object)adaptor.nil();


					string_literal264=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2580); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal264_tree = 
					(Object)adaptor.create(string_literal264)
					;
					adaptor.addChild(root_0, string_literal264_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:12: ( memberAccessOrArrayAccess )+
					int cnt81=0;
					loop81:
					do {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==ObjectOperator) ) {
							int LA81_2 = input.LA(2);
							if ( (LA81_2==Identifier) ) {
								int LA81_4 = input.LA(3);
								if ( (LA81_4==EOF||LA81_4==Arrow||LA81_4==Assign||(LA81_4 >= BitwiseAnd && LA81_4 <= BitwiseAndEqual)||(LA81_4 >= BitwiseOr && LA81_4 <= BitwiseXorEqual)||(LA81_4 >= Colon && LA81_4 <= Comma)||(LA81_4 >= Divide && LA81_4 <= DivideEqual)||(LA81_4 >= Dot && LA81_4 <= DotEqual)||LA81_4==Equal||(LA81_4 >= GreaterEqualThan && LA81_4 <= GreaterThan)||LA81_4==Identical||LA81_4==Instanceof||(LA81_4 >= LeftSquareBrace && LA81_4 <= LogicAndWeak)||(LA81_4 >= LogicOr && LA81_4 <= MultiplyEqual)||(LA81_4 >= NotEqual && LA81_4 <= NotIdentical)||LA81_4==ObjectOperator||(LA81_4 >= Plus && LA81_4 <= PlusPlus)||LA81_4==QuestionMark||(LA81_4 >= RightParanthesis && LA81_4 <= RightSquareBrace)||(LA81_4 >= Semicolon && LA81_4 <= ShiftRightEqual)) ) {
									alt81=1;
								}

							}

						}
						else if ( (LA81_0==LeftSquareBrace) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:12: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2582);
							memberAccessOrArrayAccess265=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess265.getTree());

							}
							break;

						default :
							if ( cnt81 >= 1 ) break loop81;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(81, input);
								throw eee;
						}
						cnt81++;
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: VariableId ( memberAccessOrArrayAccess )+
					{
					root_0 = (Object)adaptor.nil();


					VariableId266=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2588); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId266_tree = 
					(Object)adaptor.create(VariableId266)
					;
					adaptor.addChild(root_0, VariableId266_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:15: ( memberAccessOrArrayAccess )+
					int cnt82=0;
					loop82:
					do {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==ObjectOperator) ) {
							int LA82_2 = input.LA(2);
							if ( (LA82_2==Identifier) ) {
								int LA82_4 = input.LA(3);
								if ( (LA82_4==EOF||LA82_4==Arrow||LA82_4==Assign||(LA82_4 >= BitwiseAnd && LA82_4 <= BitwiseAndEqual)||(LA82_4 >= BitwiseOr && LA82_4 <= BitwiseXorEqual)||(LA82_4 >= Colon && LA82_4 <= Comma)||(LA82_4 >= Divide && LA82_4 <= DivideEqual)||(LA82_4 >= Dot && LA82_4 <= DotEqual)||LA82_4==Equal||(LA82_4 >= GreaterEqualThan && LA82_4 <= GreaterThan)||LA82_4==Identical||LA82_4==Instanceof||(LA82_4 >= LeftSquareBrace && LA82_4 <= LogicAndWeak)||(LA82_4 >= LogicOr && LA82_4 <= MultiplyEqual)||(LA82_4 >= NotEqual && LA82_4 <= NotIdentical)||LA82_4==ObjectOperator||(LA82_4 >= Plus && LA82_4 <= PlusPlus)||LA82_4==QuestionMark||(LA82_4 >= RightParanthesis && LA82_4 <= RightSquareBrace)||(LA82_4 >= Semicolon && LA82_4 <= ShiftRightEqual)) ) {
									alt82=1;
								}

							}

						}
						else if ( (LA82_0==LeftSquareBrace) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:15: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2590);
							memberAccessOrArrayAccess267=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess267.getTree());

							}
							break;

						default :
							if ( cnt82 >= 1 ) break loop82;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(82, input);
								throw eee;
						}
						cnt82++;
					} while (true);

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: '$this'
					{
					root_0 = (Object)adaptor.nil();


					string_literal268=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2596); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal268_tree = 
					(Object)adaptor.create(string_literal268)
					;
					adaptor.addChild(root_0, string_literal268_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: VariableId
					{
					root_0 = (Object)adaptor.nil();


					VariableId269=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2601); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId269_tree = 
					(Object)adaptor.create(VariableId269)
					;
					adaptor.addChild(root_0, VariableId269_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, variableMemberStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableMemberStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: staticAccessOrParent : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal270=null;
		Token string_literal271=null;
		Token string_literal273=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject272 =null;

		Object string_literal270_tree=null;
		Object string_literal271_tree=null;
		Object string_literal273_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt84=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt84=1;
				}
				break;
			case Parent:
				{
				alt84=2;
				}
				break;
			case Backslash:
			case Identifier:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:4: 'self::'
					{
					root_0 = (Object)adaptor.nil();


					string_literal270=(Token)match(input,Self,FOLLOW_Self_in_staticAccessOrParent2612); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal270_tree = 
					(Object)adaptor.create(string_literal270)
					;
					adaptor.addChild(root_0, string_literal270_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:4: 'parent::'
					{
					root_0 = (Object)adaptor.nil();


					string_literal271=(Token)match(input,Parent,FOLLOW_Parent_in_staticAccessOrParent2617); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal271_tree = 
					(Object)adaptor.create(string_literal271)
					;
					adaptor.addChild(root_0, string_literal271_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: classInterfaceTypeWithoutObject '::'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2622);
					classInterfaceTypeWithoutObject272=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject272.getTree());

					string_literal273=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2623); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal273_tree = 
					(Object)adaptor.create(string_literal273)
					;
					adaptor.addChild(root_0, string_literal273_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class memberAccessOrArrayAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccessOrArrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:504:1: memberAccessOrArrayAccess : ( memberAccess | arrayAccess );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope memberAccess274 =null;
		ParserRuleReturnScope arrayAccess275 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:2: ( memberAccess | arrayAccess )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==ObjectOperator) ) {
				alt85=1;
			}
			else if ( (LA85_0==LeftSquareBrace) ) {
				alt85=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:4: memberAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_memberAccessOrArrayAccess2634);
					memberAccess274=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess274.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:4: arrayAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2639);
					arrayAccess275=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess275.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, memberAccessOrArrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccessOrArrayAccess"


	public static class memberAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:1: memberAccess : '->' Identifier ;
	public final TSPHPParser.memberAccess_return memberAccess() throws RecognitionException {
		TSPHPParser.memberAccess_return retval = new TSPHPParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal276=null;
		Token Identifier277=null;

		Object string_literal276_tree=null;
		Object Identifier277_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:2: ( '->' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: '->' Identifier
			{
			root_0 = (Object)adaptor.nil();


			string_literal276=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccess2649); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal276_tree = 
			(Object)adaptor.create(string_literal276)
			;
			adaptor.addChild(root_0, string_literal276_tree);
			}

			Identifier277=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccess2651); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier277_tree = 
			(Object)adaptor.create(Identifier277)
			;
			adaptor.addChild(root_0, Identifier277_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class arrayAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:1: arrayAccess : '[' expression ']' ;
	public final TSPHPParser.arrayAccess_return arrayAccess() throws RecognitionException {
		TSPHPParser.arrayAccess_return retval = new TSPHPParser.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal278=null;
		Token char_literal280=null;
		ParserRuleReturnScope expression279 =null;

		Object char_literal278_tree=null;
		Object char_literal280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:2: ( '[' expression ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:4: '[' expression ']'
			{
			root_0 = (Object)adaptor.nil();


			char_literal278=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2661); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal278_tree = 
			(Object)adaptor.create(char_literal278)
			;
			adaptor.addChild(root_0, char_literal278_tree);
			}

			pushFollow(FOLLOW_expression_in_arrayAccess2663);
			expression279=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression279.getTree());

			char_literal280=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2665); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal280_tree = 
			(Object)adaptor.create(char_literal280)
			;
			adaptor.addChild(root_0, char_literal280_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, arrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class newObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal281=null;
		Token string_literal283=null;
		Token char_literal285=null;
		Token char_literal287=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject282 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject284 =null;
		ParserRuleReturnScope expressionList286 =null;

		Object string_literal281_tree=null;
		Object string_literal283_tree=null;
		Object char_literal285_tree=null;
		Object char_literal287_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt87=2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: 'new' classInterfaceTypeWithoutObject
					{
					root_0 = (Object)adaptor.nil();


					string_literal281=(Token)match(input,New,FOLLOW_New_in_newObject2678); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal281_tree = 
					(Object)adaptor.create(string_literal281)
					;
					adaptor.addChild(root_0, string_literal281_tree);
					}

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2680);
					classInterfaceTypeWithoutObject282=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject282.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal283=(Token)match(input,New,FOLLOW_New_in_newObject2685); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal283_tree = 
					(Object)adaptor.create(string_literal283)
					;
					adaptor.addChild(root_0, string_literal283_tree);
					}

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2687);
					classInterfaceTypeWithoutObject284=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject284.getTree());

					char_literal285=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2689); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal285_tree = 
					(Object)adaptor.create(char_literal285)
					;
					adaptor.addChild(root_0, char_literal285_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:46: ( expressionList )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==At||LA86_0==Backslash||LA86_0==BitwiseNot||LA86_0==Bool||LA86_0==Clone||LA86_0==Float||LA86_0==Identifier||LA86_0==Int||(LA86_0 >= LeftParanthesis && LA86_0 <= LeftSquareBrace)||LA86_0==LogicNot||LA86_0==Minus||LA86_0==MinusMinus||LA86_0==New||LA86_0==Null||(LA86_0 >= Parent && LA86_0 <= Plus)||LA86_0==PlusPlus||LA86_0==Self||LA86_0==String||LA86_0==This||LA86_0==TypeArray||LA86_0==VariableId) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2691);
							expressionList286=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList286.getTree());

							}
							break;

					}

					char_literal287=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2694); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal287_tree = 
					(Object)adaptor.create(char_literal287)
					;
					adaptor.addChild(root_0, char_literal287_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: unaryPrimary : ( '+' primary | '-' primary | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal288=null;
		Token char_literal290=null;
		ParserRuleReturnScope primary289 =null;
		ParserRuleReturnScope primary291 =null;
		ParserRuleReturnScope primary292 =null;

		Object char_literal288_tree=null;
		Object char_literal290_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:2: ( '+' primary | '-' primary | primary )
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
			case Backslash:
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case MinusMinus:
			case Null:
			case Parent:
			case PlusPlus:
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: '+' primary
					{
					root_0 = (Object)adaptor.nil();


					char_literal288=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary2703); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = 
					(Object)adaptor.create(char_literal288)
					;
					adaptor.addChild(root_0, char_literal288_tree);
					}

					pushFollow(FOLLOW_primary_in_unaryPrimary2705);
					primary289=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary289.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: '-' primary
					{
					root_0 = (Object)adaptor.nil();


					char_literal290=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary2710); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = 
					(Object)adaptor.create(char_literal290)
					;
					adaptor.addChild(root_0, char_literal290_tree);
					}

					pushFollow(FOLLOW_primary_in_unaryPrimary2712);
					primary291=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary291.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: primary
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary2717);
					primary292=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary292.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:1: primary : ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCallFluentInclAccessAtTheEnd293 =null;
		ParserRuleReturnScope methodCallFluentInclAccessAtTheEnd294 =null;
		ParserRuleReturnScope atom295 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:2: ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom )
			int alt89=3;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA89_1 = input.LA(2);
				if ( (synpred150_TSPHP()) ) {
					alt89=1;
				}
				else if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case Identifier:
				{
				int LA89_2 = input.LA(2);
				if ( (synpred150_TSPHP()) ) {
					alt89=1;
				}
				else if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case Self:
				{
				int LA89_3 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA89_4 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA89_5 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA89_6 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt89=2;
				}
				else if ( (true) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 6, input);
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
			case MinusMinus:
			case Null:
			case PlusPlus:
			case String:
			case TypeArray:
				{
				alt89=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: functionCallFluentInclAccessAtTheEnd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2727);
					functionCallFluentInclAccessAtTheEnd293=functionCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentInclAccessAtTheEnd293.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: methodCallFluentInclAccessAtTheEnd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2732);
					methodCallFluentInclAccessAtTheEnd294=methodCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentInclAccessAtTheEnd294.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary2737);
					atom295=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom295.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class functionCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:1: functionCallFluentInclAccessAtTheEnd : functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.functionCallFluentInclAccessAtTheEnd_return functionCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd296 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess297 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:2: ( functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:4: functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2749);
			functionCallFluentWithoutAccessAtTheEnd296=functionCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd296.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:44: ( memberAccessOrArrayAccess )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LeftSquareBrace||LA90_0==ObjectOperator) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:44: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2751);
					memberAccessOrArrayAccess297=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess297.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, functionCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentInclAccessAtTheEnd"


	public static class functionCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:1: functionCallFluentWithoutAccessAtTheEnd : ( functionCall ( callOrAccess )* call | functionCall ( call )* );
	public final TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return functionCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCall298 =null;
		ParserRuleReturnScope callOrAccess299 =null;
		ParserRuleReturnScope call300 =null;
		ParserRuleReturnScope functionCall301 =null;
		ParserRuleReturnScope call302 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:2: ( functionCall ( callOrAccess )* call | functionCall ( call )* )
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==Backslash) ) {
				int LA93_1 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=1;
				}
				else if ( (true) ) {
					alt93=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA93_0==Identifier) ) {
				int LA93_2 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=1;
				}
				else if ( (true) ) {
					alt93=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:4: functionCall ( callOrAccess )* call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2763);
					functionCall298=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall298.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: ( callOrAccess )*
					loop91:
					do {
						int alt91=2;
						int LA91_0 = input.LA(1);
						if ( (LA91_0==ObjectOperator) ) {
							int LA91_1 = input.LA(2);
							if ( (synpred153_TSPHP()) ) {
								alt91=1;
							}

						}
						else if ( (LA91_0==LeftSquareBrace) ) {
							alt91=1;
						}

						switch (alt91) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2765);
							callOrAccess299=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess299.getTree());

							}
							break;

						default :
							break loop91;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2768);
					call300=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call300.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:4: functionCall ( call )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2773);
					functionCall301=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall301.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:17: ( call )*
					loop92:
					do {
						int alt92=2;
						int LA92_0 = input.LA(1);
						if ( (LA92_0==ObjectOperator) ) {
							int LA92_2 = input.LA(2);
							if ( (LA92_2==Identifier) ) {
								int LA92_3 = input.LA(3);
								if ( (LA92_3==LeftParanthesis) ) {
									alt92=1;
								}

							}

						}

						switch (alt92) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:17: call
							{
							pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2775);
							call302=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call302.getTree());

							}
							break;

						default :
							break loop92;
						}
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, functionCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentWithoutAccessAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:1: functionCall : classInterfaceTypeWithoutObject '(' ( expressionList )? ')' ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal304=null;
		Token char_literal306=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject303 =null;
		ParserRuleReturnScope expressionList305 =null;

		Object char_literal304_tree=null;
		Object char_literal306_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:2: ( classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:4: classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2787);
			classInterfaceTypeWithoutObject303=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject303.getTree());

			char_literal304=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2789); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal304_tree = 
			(Object)adaptor.create(char_literal304)
			;
			adaptor.addChild(root_0, char_literal304_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:40: ( expressionList )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==At||LA94_0==Backslash||LA94_0==BitwiseNot||LA94_0==Bool||LA94_0==Clone||LA94_0==Float||LA94_0==Identifier||LA94_0==Int||(LA94_0 >= LeftParanthesis && LA94_0 <= LeftSquareBrace)||LA94_0==LogicNot||LA94_0==Minus||LA94_0==MinusMinus||LA94_0==New||LA94_0==Null||(LA94_0 >= Parent && LA94_0 <= Plus)||LA94_0==PlusPlus||LA94_0==Self||LA94_0==String||LA94_0==This||LA94_0==TypeArray||LA94_0==VariableId) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2791);
					expressionList305=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList305.getTree());

					}
					break;

			}

			char_literal306=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2794); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal306_tree = 
			(Object)adaptor.create(char_literal306)
			;
			adaptor.addChild(root_0, char_literal306_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class callOrAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callOrAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess307 =null;
		ParserRuleReturnScope call308 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:2: ( memberAccessOrArrayAccess | call )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==ObjectOperator) ) {
				int LA95_1 = input.LA(2);
				if ( (LA95_1==Identifier) ) {
					int LA95_3 = input.LA(3);
					if ( (LA95_3==LeftParanthesis) ) {
						alt95=2;
					}
					else if ( (LA95_3==EOF||LA95_3==LeftSquareBrace||LA95_3==ObjectOperator) ) {
						alt95=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 95, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA95_0==LeftSquareBrace) ) {
				alt95=1;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: memberAccessOrArrayAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2805);
					memberAccessOrArrayAccess307=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess307.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess2810);
					call308=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call308.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, callOrAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callOrAccess"


	public static class call_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:1: call : ( '->' Identifier '(' ( expressionList )? ')' ) ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal309=null;
		Token Identifier310=null;
		Token char_literal311=null;
		Token char_literal313=null;
		ParserRuleReturnScope expressionList312 =null;

		Object string_literal309_tree=null;
		Object Identifier310_tree=null;
		Object char_literal311_tree=null;
		Object char_literal313_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:6: ( ( '->' Identifier '(' ( expressionList )? ')' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:8: ( '->' Identifier '(' ( expressionList )? ')' )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:8: ( '->' Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:9: '->' Identifier '(' ( expressionList )? ')'
			{
			string_literal309=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call2823); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal309_tree = 
			(Object)adaptor.create(string_literal309)
			;
			adaptor.addChild(root_0, string_literal309_tree);
			}

			Identifier310=(Token)match(input,Identifier,FOLLOW_Identifier_in_call2825); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier310_tree = 
			(Object)adaptor.create(Identifier310)
			;
			adaptor.addChild(root_0, Identifier310_tree);
			}

			char_literal311=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call2827); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal311_tree = 
			(Object)adaptor.create(char_literal311)
			;
			adaptor.addChild(root_0, char_literal311_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:29: ( expressionList )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==At||LA96_0==Backslash||LA96_0==BitwiseNot||LA96_0==Bool||LA96_0==Clone||LA96_0==Float||LA96_0==Identifier||LA96_0==Int||(LA96_0 >= LeftParanthesis && LA96_0 <= LeftSquareBrace)||LA96_0==LogicNot||LA96_0==Minus||LA96_0==MinusMinus||LA96_0==New||LA96_0==Null||(LA96_0 >= Parent && LA96_0 <= Plus)||LA96_0==PlusPlus||LA96_0==Self||LA96_0==String||LA96_0==This||LA96_0==TypeArray||LA96_0==VariableId) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:29: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_call2829);
					expressionList312=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList312.getTree());

					}
					break;

			}

			char_literal313=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call2831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal313_tree = 
			(Object)adaptor.create(char_literal313)
			;
			adaptor.addChild(root_0, char_literal313_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:1: methodCallFluentInclAccessAtTheEnd : methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.methodCallFluentInclAccessAtTheEnd_return methodCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd314 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess315 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:2: ( methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2842);
			methodCallFluentWithoutAccessAtTheEnd314=methodCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd314.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:42: ( memberAccessOrArrayAccess )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==LeftSquareBrace||LA97_0==ObjectOperator) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:42: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2844);
					memberAccessOrArrayAccess315=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess315.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, methodCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentInclAccessAtTheEnd"


	public static class methodCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:1: methodCallFluentWithoutAccessAtTheEnd : ( methodCall ( callOrAccess )* call | methodCall ( call )* );
	public final TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return methodCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope methodCall316 =null;
		ParserRuleReturnScope callOrAccess317 =null;
		ParserRuleReturnScope call318 =null;
		ParserRuleReturnScope methodCall319 =null;
		ParserRuleReturnScope call320 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:2: ( methodCall ( callOrAccess )* call | methodCall ( call )* )
			int alt100=2;
			switch ( input.LA(1) ) {
			case Self:
				{
				int LA100_1 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA100_2 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA100_3 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA100_4 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA100_5 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA100_6 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt100=1;
				}
				else if ( (true) ) {
					alt100=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 100, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:5: methodCall ( callOrAccess )* call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2858);
					methodCall316=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall316.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: ( callOrAccess )*
					loop98:
					do {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==ObjectOperator) ) {
							int LA98_1 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt98=1;
							}

						}
						else if ( (LA98_0==LeftSquareBrace) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2860);
							callOrAccess317=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess317.getTree());

							}
							break;

						default :
							break loop98;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2863);
					call318=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call318.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:4: methodCall ( call )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2868);
					methodCall319=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall319.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:15: ( call )*
					loop99:
					do {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==ObjectOperator) ) {
							int LA99_2 = input.LA(2);
							if ( (LA99_2==Identifier) ) {
								int LA99_3 = input.LA(3);
								if ( (LA99_3==LeftParanthesis) ) {
									alt99=1;
								}

							}

						}

						switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:15: call
							{
							pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2870);
							call320=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call320.getTree());

							}
							break;

						default :
							break loop99;
						}
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, methodCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentWithoutAccessAtTheEnd"


	public static class methodCall_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:1: methodCall : ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal322=null;
		Token Identifier324=null;
		Token char_literal325=null;
		Token char_literal327=null;
		ParserRuleReturnScope variableMemberStaticMember321 =null;
		ParserRuleReturnScope staticAccessOrParent323 =null;
		ParserRuleReturnScope expressionList326 =null;

		Object string_literal322_tree=null;
		Object Identifier324_tree=null;
		Object char_literal325_tree=null;
		Object char_literal327_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:2: ( ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )
			int alt101=2;
			alt101 = dfa101.predict(input);
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:6: ( variableMemberStaticMember '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:6: ( variableMemberStaticMember '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:7: variableMemberStaticMember '->'
					{
					pushFollow(FOLLOW_variableMemberStaticMember_in_methodCall2884);
					variableMemberStaticMember321=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember321.getTree());

					string_literal322=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2886); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal322_tree = 
					(Object)adaptor.create(string_literal322)
					;
					adaptor.addChild(root_0, string_literal322_tree);
					}

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:42: staticAccessOrParent
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_methodCall2891);
					staticAccessOrParent323=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent323.getTree());

					}
					break;

			}

			Identifier324=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall2894); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier324_tree = 
			(Object)adaptor.create(Identifier324)
			;
			adaptor.addChild(root_0, Identifier324_tree);
			}

			char_literal325=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2896); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal325_tree = 
			(Object)adaptor.create(char_literal325)
			;
			adaptor.addChild(root_0, char_literal325_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:79: ( expressionList )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==At||LA102_0==Backslash||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==New||LA102_0==Null||(LA102_0 >= Parent && LA102_0 <= Plus)||LA102_0==PlusPlus||LA102_0==Self||LA102_0==String||LA102_0==This||LA102_0==TypeArray||LA102_0==VariableId) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:79: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2898);
					expressionList326=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList326.getTree());

					}
					break;

			}

			char_literal327=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2900); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal327_tree = 
			(Object)adaptor.create(char_literal327)
			;
			adaptor.addChild(root_0, char_literal327_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:1: atom : ( '(' expression ')' | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal328=null;
		Token char_literal330=null;
		ParserRuleReturnScope expression329 =null;
		ParserRuleReturnScope incrementDecrement331 =null;
		ParserRuleReturnScope variableMemberStaticMember332 =null;
		ParserRuleReturnScope classConstant333 =null;
		ParserRuleReturnScope globalConstant334 =null;
		ParserRuleReturnScope array335 =null;
		ParserRuleReturnScope primitiveAtom336 =null;

		Object char_literal328_tree=null;
		Object char_literal330_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:6: ( '(' expression ')' | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom )
			int alt103=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt103=1;
				}
				break;
			case Self:
				{
				int LA103_2 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt103=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA103_3 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt103=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA103_4 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt103=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA103_5 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt103=4;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt103=5;
				}
				else if ( (true) ) {
					alt103=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA103_6 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA103_7 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt103=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 7, input);
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
				alt103=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt103=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt103=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:8: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal328=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2910); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal328_tree = 
					(Object)adaptor.create(char_literal328)
					;
					adaptor.addChild(root_0, char_literal328_tree);
					}

					pushFollow(FOLLOW_expression_in_atom2912);
					expression329=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression329.getTree());

					char_literal330=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal330_tree = 
					(Object)adaptor.create(char_literal330)
					;
					adaptor.addChild(root_0, char_literal330_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: incrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom2919);
					incrementDecrement331=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement331.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:4: variableMemberStaticMember
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableMemberStaticMember_in_atom2924);
					variableMemberStaticMember332=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember332.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: classConstant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom2929);
					classConstant333=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant333.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:4: globalConstant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom2934);
					globalConstant334=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant334.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: array
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom2939);
					array335=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array335.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom2944);
					primitiveAtom336=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom336.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class globalConstant_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier337=null;

		Object Identifier337_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:4: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier337=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant2956); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier337_tree = 
			(Object)adaptor.create(Identifier337)
			;
			adaptor.addChild(root_0, Identifier337_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class classConstant_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier339=null;
		ParserRuleReturnScope staticAccessOrParent338 =null;

		Object Identifier339_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:4: staticAccessOrParent Identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant2967);
			staticAccessOrParent338=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent338.getTree());

			Identifier339=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant2969); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier339_tree = 
			(Object)adaptor.create(Identifier339)
			;
			adaptor.addChild(root_0, Identifier339_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal340=null;
		Token char_literal342=null;
		ParserRuleReturnScope primitiveAtom341 =null;
		ParserRuleReturnScope primitiveAtom343 =null;
		ParserRuleReturnScope primitiveAtom344 =null;

		Object char_literal340_tree=null;
		Object char_literal342_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt104=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt104=1;
				}
				break;
			case Minus:
				{
				alt104=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt104=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: '+' primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					char_literal340=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal340_tree = 
					(Object)adaptor.create(char_literal340)
					;
					adaptor.addChild(root_0, char_literal340_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2983);
					primitiveAtom341=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom341.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: '-' primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					char_literal342=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2988); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal342_tree = 
					(Object)adaptor.create(char_literal342)
					;
					adaptor.addChild(root_0, char_literal342_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2990);
					primitiveAtom343=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom343.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2995);
					primitiveAtom344=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom344.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		Object root_0 = null;

		Token set345=null;

		Object set345_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set345=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set345)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal346=null;
		Token char_literal348=null;
		Token TypeArray349=null;
		Token char_literal350=null;
		Token char_literal352=null;
		ParserRuleReturnScope array_content347 =null;
		ParserRuleReturnScope array_content351 =null;

		Object char_literal346_tree=null;
		Object char_literal348_tree=null;
		Object TypeArray349_tree=null;
		Object char_literal350_tree=null;
		Object char_literal352_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==LeftSquareBrace) ) {
				alt107=1;
			}
			else if ( (LA107_0==TypeArray) ) {
				alt107=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:9: '[' ( array_content )? ']'
					{
					root_0 = (Object)adaptor.nil();


					char_literal346=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3493); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal346_tree = 
					(Object)adaptor.create(char_literal346)
					;
					adaptor.addChild(root_0, char_literal346_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:13: ( array_content )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==At||LA105_0==Backslash||LA105_0==BitwiseNot||LA105_0==Bool||LA105_0==Clone||LA105_0==Float||LA105_0==Identifier||LA105_0==Int||(LA105_0 >= LeftParanthesis && LA105_0 <= LeftSquareBrace)||LA105_0==LogicNot||LA105_0==Minus||LA105_0==MinusMinus||LA105_0==New||LA105_0==Null||(LA105_0 >= Parent && LA105_0 <= Plus)||LA105_0==PlusPlus||LA105_0==Self||LA105_0==String||LA105_0==This||LA105_0==TypeArray||LA105_0==VariableId) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:649:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3495);
							array_content347=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content347.getTree());

							}
							break;

					}

					char_literal348=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3498); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal348_tree = 
					(Object)adaptor.create(char_literal348)
					;
					adaptor.addChild(root_0, char_literal348_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:650:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (Object)adaptor.nil();


					TypeArray349=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array3504); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray349_tree = 
					(Object)adaptor.create(TypeArray349)
					;
					adaptor.addChild(root_0, TypeArray349_tree);
					}

					char_literal350=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3506); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal350_tree = 
					(Object)adaptor.create(char_literal350)
					;
					adaptor.addChild(root_0, char_literal350_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:650:18: ( array_content )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==At||LA106_0==Backslash||LA106_0==BitwiseNot||LA106_0==Bool||LA106_0==Clone||LA106_0==Float||LA106_0==Identifier||LA106_0==Int||(LA106_0 >= LeftParanthesis && LA106_0 <= LeftSquareBrace)||LA106_0==LogicNot||LA106_0==Minus||LA106_0==MinusMinus||LA106_0==New||LA106_0==Null||(LA106_0 >= Parent && LA106_0 <= Plus)||LA106_0==PlusPlus||LA106_0==Self||LA106_0==String||LA106_0==This||LA106_0==TypeArray||LA106_0==VariableId) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:650:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3508);
							array_content351=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content351.getTree());

							}
							break;

					}

					char_literal352=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal352_tree = 
					(Object)adaptor.create(char_literal352)
					;
					adaptor.addChild(root_0, char_literal352_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class array_content_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_content"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:653:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final TSPHPParser.array_content_return array_content() throws RecognitionException {
		TSPHPParser.array_content_return retval = new TSPHPParser.array_content_return();
		retval.start = input.LT(1);
		int array_content_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal354=null;
		Token char_literal356=null;
		Token string_literal358=null;
		ParserRuleReturnScope expression353 =null;
		ParserRuleReturnScope expression355 =null;
		ParserRuleReturnScope expression357 =null;
		ParserRuleReturnScope expression359 =null;

		Object string_literal354_tree=null;
		Object char_literal356_tree=null;
		Object string_literal358_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:4: ( expression '=>' )?
			int alt108=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA108_1 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA108_2 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA108_3 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case At:
					{
					int LA108_4 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Clone:
					{
					int LA108_5 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case New:
					{
					int LA108_6 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Plus:
					{
					int LA108_7 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Minus:
					{
					int LA108_8 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Backslash:
					{
					int LA108_9 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Identifier:
					{
					int LA108_10 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Self:
					{
					int LA108_11 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Parent:
					{
					int LA108_12 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case This:
					{
					int LA108_13 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case VariableId:
					{
					int LA108_14 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA108_15 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA108_16 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA108_17 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case Null:
				case String:
					{
					int LA108_18 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3524);
					expression353=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression353.getTree());

					string_literal354=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal354_tree = 
					(Object)adaptor.create(string_literal354)
					;
					adaptor.addChild(root_0, string_literal354_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3530);
			expression355=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression355.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:35: ( ',' ( expression '=>' )? expression )*
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==Comma) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:36: ',' ( expression '=>' )? expression
					{
					char_literal356=(Token)match(input,Comma,FOLLOW_Comma_in_array_content3534); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal356_tree = 
					(Object)adaptor.create(char_literal356)
					;
					adaptor.addChild(root_0, char_literal356_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:40: ( expression '=>' )?
					int alt109=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA109_1 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA109_2 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA109_3 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case At:
							{
							int LA109_4 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Clone:
							{
							int LA109_5 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case New:
							{
							int LA109_6 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Plus:
							{
							int LA109_7 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Minus:
							{
							int LA109_8 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Backslash:
							{
							int LA109_9 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Identifier:
							{
							int LA109_10 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Self:
							{
							int LA109_11 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Parent:
							{
							int LA109_12 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case This:
							{
							int LA109_13 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case VariableId:
							{
							int LA109_14 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA109_15 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA109_16 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA109_17 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case Null:
						case String:
							{
							int LA109_18 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
					}
					switch (alt109) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3537);
							expression357=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression357.getTree());

							string_literal358=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3539); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal358_tree = 
							(Object)adaptor.create(string_literal358)
							;
							adaptor.addChild(root_0, string_literal358_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3543);
					expression359=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression359.getTree());

					}
					break;

				default :
					break loop110;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, array_content_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array_content"


	public static class ifCondition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal360=null;
		Token char_literal361=null;
		Token char_literal363=null;
		Token string_literal365=null;
		ParserRuleReturnScope expression362 =null;
		ParserRuleReturnScope instructionInclBreakContinue364 =null;
		ParserRuleReturnScope instructionInclBreakContinue366 =null;

		Object string_literal360_tree=null;
		Object char_literal361_tree=null;
		Object char_literal363_tree=null;
		Object string_literal365_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:658:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:658:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal360=(Token)match(input,If,FOLLOW_If_in_ifCondition3555); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal360_tree = 
			(Object)adaptor.create(string_literal360)
			;
			adaptor.addChild(root_0, string_literal360_tree);
			}

			char_literal361=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3557); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal361_tree = 
			(Object)adaptor.create(char_literal361)
			;
			adaptor.addChild(root_0, char_literal361_tree);
			}

			pushFollow(FOLLOW_expression_in_ifCondition3559);
			expression362=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression362.getTree());

			char_literal363=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3561); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal363_tree = 
			(Object)adaptor.create(char_literal363)
			;
			adaptor.addChild(root_0, char_literal363_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3563);
			instructionInclBreakContinue364=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue364.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:3: ( 'else' instructionInclBreakContinue )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==Else) ) {
				int LA111_1 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt111=1;
				}
			}
			switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: 'else' instructionInclBreakContinue
					{
					string_literal365=(Token)match(input,Else,FOLLOW_Else_in_ifCondition3570); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal365_tree = 
					(Object)adaptor.create(string_literal365)
					;
					adaptor.addChild(root_0, string_literal365_tree);
					}

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3572);
					instructionInclBreakContinue366=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue366.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:663:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal367=null;
		Token char_literal368=null;
		Token VariableId369=null;
		Token char_literal370=null;
		Token char_literal371=null;
		Token char_literal382=null;
		ParserRuleReturnScope caseLabel372 =null;
		ParserRuleReturnScope instructionInclBreakContinue373 =null;
		ParserRuleReturnScope defaultLabel374 =null;
		ParserRuleReturnScope instructionInclBreakContinue375 =null;
		ParserRuleReturnScope caseLabel376 =null;
		ParserRuleReturnScope instructionInclBreakContinue377 =null;
		ParserRuleReturnScope caseLabel378 =null;
		ParserRuleReturnScope instructionInclBreakContinue379 =null;
		ParserRuleReturnScope defaultLabel380 =null;
		ParserRuleReturnScope instructionInclBreakContinue381 =null;

		Object string_literal367_tree=null;
		Object char_literal368_tree=null;
		Object VariableId369_tree=null;
		Object char_literal370_tree=null;
		Object char_literal371_tree=null;
		Object char_literal382_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal367=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition3588); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal367_tree = 
			(Object)adaptor.create(string_literal367)
			;
			adaptor.addChild(root_0, string_literal367_tree);
			}

			char_literal368=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3590); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal368_tree = 
			(Object)adaptor.create(char_literal368)
			;
			adaptor.addChild(root_0, char_literal368_tree);
			}

			VariableId369=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition3592); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId369_tree = 
			(Object)adaptor.create(VariableId369)
			;
			adaptor.addChild(root_0, VariableId369_tree);
			}

			char_literal370=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3594); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal370_tree = 
			(Object)adaptor.create(char_literal370)
			;
			adaptor.addChild(root_0, char_literal370_tree);
			}

			char_literal371=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3596); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal371_tree = 
			(Object)adaptor.create(char_literal371)
			;
			adaptor.addChild(root_0, char_literal371_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==Case) ) {
				int LA124_1 = input.LA(2);
				if ( (synpred192_TSPHP()) ) {
					alt124=1;
				}
				else if ( (true) ) {
					alt124=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: ( caseLabel )+
							int cnt112=0;
							loop112:
							do {
								int alt112=2;
								int LA112_0 = input.LA(1);
								if ( (LA112_0==Case) ) {
									alt112=1;
								}

								switch (alt112) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3607);
									caseLabel372=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel372.getTree());

									}
									break;

								default :
									if ( cnt112 >= 1 ) break loop112;
									if (state.backtracking>0) {state.failed=true; return retval;}
										EarlyExitException eee =
											new EarlyExitException(112, input);
										throw eee;
								}
								cnt112++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:16: ( instructionInclBreakContinue )+
							int cnt113=0;
							loop113:
							do {
								int alt113=2;
								int LA113_0 = input.LA(1);
								if ( (LA113_0==Backslash||LA113_0==Break||LA113_0==Continue||LA113_0==Do||LA113_0==Echo||LA113_0==Exit||(LA113_0 >= For && LA113_0 <= Foreach)||(LA113_0 >= Identifier && LA113_0 <= If)||LA113_0==LeftCurlyBrace||LA113_0==MinusMinus||LA113_0==Parent||LA113_0==PlusPlus||LA113_0==Return||LA113_0==Self||(LA113_0 >= Switch && LA113_0 <= TypeString)||LA113_0==VariableId||LA113_0==While) ) {
									alt113=1;
								}

								switch (alt113) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3610);
									instructionInclBreakContinue373=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue373.getTree());

									}
									break;

								default :
									if ( cnt113 >= 1 ) break loop113;
									if (state.backtracking>0) {state.failed=true; return retval;}
										EarlyExitException eee =
											new EarlyExitException(113, input);
										throw eee;
								}
								cnt113++;
							} while (true);

							}
							break;

						default :
							if ( cnt114 >= 1 ) break loop114;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(114, input);
								throw eee;
						}
						cnt114++;
					} while (true);

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3615);
					defaultLabel374=defaultLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel374.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:61: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3617);
							instructionInclBreakContinue375=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue375.getTree());

							}
							break;

						default :
							if ( cnt115 >= 1 ) break loop115;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(115, input);
								throw eee;
						}
						cnt115++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3621);
									caseLabel376=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel376.getTree());

									}
									break;

								default :
									if ( cnt116 >= 1 ) break loop116;
									if (state.backtracking>0) {state.failed=true; return retval;}
										EarlyExitException eee =
											new EarlyExitException(116, input);
										throw eee;
								}
								cnt116++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:103: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3624);
									instructionInclBreakContinue377=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue377.getTree());

									}
									break;

								default :
									if ( cnt117 >= 1 ) break loop117;
									if (state.backtracking>0) {state.failed=true; return retval;}
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
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(118, input);
								throw eee;
						}
						cnt118++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3634);
									caseLabel378=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel378.getTree());

									}
									break;

								default :
									if ( cnt119 >= 1 ) break loop119;
									if (state.backtracking>0) {state.failed=true; return retval;}
										EarlyExitException eee =
											new EarlyExitException(119, input);
										throw eee;
								}
								cnt119++;
							} while (true);

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:17: ( instructionInclBreakContinue )+
							int cnt120=0;
							loop120:
							do {
								int alt120=2;
								int LA120_0 = input.LA(1);
								if ( (LA120_0==Backslash||LA120_0==Break||LA120_0==Continue||LA120_0==Do||LA120_0==Echo||LA120_0==Exit||(LA120_0 >= For && LA120_0 <= Foreach)||(LA120_0 >= Identifier && LA120_0 <= If)||LA120_0==LeftCurlyBrace||LA120_0==MinusMinus||LA120_0==Parent||LA120_0==PlusPlus||LA120_0==Return||LA120_0==Self||(LA120_0 >= Switch && LA120_0 <= TypeString)||LA120_0==VariableId||LA120_0==While) ) {
									alt120=1;
								}

								switch (alt120) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3637);
									instructionInclBreakContinue379=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue379.getTree());

									}
									break;

								default :
									if ( cnt120 >= 1 ) break loop120;
									if (state.backtracking>0) {state.failed=true; return retval;}
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
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(121, input);
								throw eee;
						}
						cnt121++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==Default) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3643);
							defaultLabel380=defaultLabel();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel380.getTree());

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:63: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3645);
									instructionInclBreakContinue381=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue381.getTree());

									}
									break;

								default :
									if ( cnt122 >= 1 ) break loop122;
									if (state.backtracking>0) {state.failed=true; return retval;}
										EarlyExitException eee =
											new EarlyExitException(122, input);
										throw eee;
								}
								cnt122++;
							} while (true);

							}
							break;

					}

					}
					break;

			}

			char_literal382=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3656); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal382_tree = 
			(Object)adaptor.create(char_literal382)
			;
			adaptor.addChild(root_0, char_literal382_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class caseLabel_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:1: caseLabel : 'case' expression ':' ;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal383=null;
		Token char_literal385=null;
		ParserRuleReturnScope expression384 =null;

		Object string_literal383_tree=null;
		Object char_literal385_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:673:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:673:4: 'case' expression ':'
			{
			root_0 = (Object)adaptor.nil();


			string_literal383=(Token)match(input,Case,FOLLOW_Case_in_caseLabel3668); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal383_tree = 
			(Object)adaptor.create(string_literal383)
			;
			adaptor.addChild(root_0, string_literal383_tree);
			}

			pushFollow(FOLLOW_expression_in_caseLabel3670);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression384.getTree());

			char_literal385=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel3672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal385_tree = 
			(Object)adaptor.create(char_literal385)
			;
			adaptor.addChild(root_0, char_literal385_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:1: defaultLabel : 'default' ':' ;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal386=null;
		Token char_literal387=null;

		Object string_literal386_tree=null;
		Object char_literal387_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:4: 'default' ':'
			{
			root_0 = (Object)adaptor.nil();


			string_literal386=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel3681); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal386_tree = 
			(Object)adaptor.create(string_literal386)
			;
			adaptor.addChild(root_0, string_literal386_tree);
			}

			char_literal387=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel3683); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal387_tree = 
			(Object)adaptor.create(char_literal387)
			;
			adaptor.addChild(root_0, char_literal387_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal388=null;
		Token char_literal389=null;
		Token char_literal391=null;
		Token char_literal393=null;
		Token char_literal395=null;
		ParserRuleReturnScope forInit390 =null;
		ParserRuleReturnScope expressionList392 =null;
		ParserRuleReturnScope forUpdate394 =null;
		ParserRuleReturnScope instructionInclBreakContinue396 =null;

		Object string_literal388_tree=null;
		Object char_literal389_tree=null;
		Object char_literal391_tree=null;
		Object char_literal393_tree=null;
		Object char_literal395_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal388=(Token)match(input,For,FOLLOW_For_in_forLoop3692); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal388_tree = 
			(Object)adaptor.create(string_literal388)
			;
			adaptor.addChild(root_0, string_literal388_tree);
			}

			char_literal389=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3694); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal389_tree = 
			(Object)adaptor.create(char_literal389)
			;
			adaptor.addChild(root_0, char_literal389_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:21: ( forInit )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==Backslash||LA125_0==Identifier||LA125_0==MinusMinus||LA125_0==Parent||LA125_0==PlusPlus||LA125_0==Self||LA125_0==This||(LA125_0 >= TypeArray && LA125_0 <= TypeString)||LA125_0==VariableId) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3696);
					forInit390=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit390.getTree());

					}
					break;

			}

			char_literal391=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3699); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal391_tree = 
			(Object)adaptor.create(char_literal391)
			;
			adaptor.addChild(root_0, char_literal391_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:34: ( expressionList )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==At||LA126_0==Backslash||LA126_0==BitwiseNot||LA126_0==Bool||LA126_0==Clone||LA126_0==Float||LA126_0==Identifier||LA126_0==Int||(LA126_0 >= LeftParanthesis && LA126_0 <= LeftSquareBrace)||LA126_0==LogicNot||LA126_0==Minus||LA126_0==MinusMinus||LA126_0==New||LA126_0==Null||(LA126_0 >= Parent && LA126_0 <= Plus)||LA126_0==PlusPlus||LA126_0==Self||LA126_0==String||LA126_0==This||LA126_0==TypeArray||LA126_0==VariableId) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3701);
					expressionList392=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList392.getTree());

					}
					break;

			}

			char_literal393=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3705); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal393_tree = 
			(Object)adaptor.create(char_literal393)
			;
			adaptor.addChild(root_0, char_literal393_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:55: ( forUpdate )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Backslash||LA127_0==Identifier||LA127_0==MinusMinus||LA127_0==Parent||LA127_0==PlusPlus||LA127_0==Self||LA127_0==This||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3707);
					forUpdate394=forUpdate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate394.getTree());

					}
					break;

			}

			char_literal395=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3710); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal395_tree = 
			(Object)adaptor.create(char_literal395)
			;
			adaptor.addChild(root_0, char_literal395_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3712);
			instructionInclBreakContinue396=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue396.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal399=null;
		ParserRuleReturnScope variableDeclaration397 =null;
		ParserRuleReturnScope variableAssignment398 =null;
		ParserRuleReturnScope variableAssignment400 =null;

		Object char_literal399_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:11: ( variableDeclaration | variableAssignment )
			int alt128=2;
			alt128 = dfa128.predict(input);
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3721);
					variableDeclaration397=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration397.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3723);
					variableAssignment398=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment398.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:52: ( ',' variableAssignment )*
			loop129:
			do {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==Comma) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:53: ',' variableAssignment
					{
					char_literal399=(Token)match(input,Comma,FOLLOW_Comma_in_forInit3727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal399_tree = 
					(Object)adaptor.create(char_literal399)
					;
					adaptor.addChild(root_0, char_literal399_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forInit3729);
					variableAssignment400=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment400.getTree());

					}
					break;

				default :
					break loop129;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forUpdate_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal402=null;
		ParserRuleReturnScope variableAssignment401 =null;
		ParserRuleReturnScope variableAssignment403 =null;

		Object char_literal402_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: variableAssignment ( ',' variableAssignment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableAssignment_in_forUpdate3739);
			variableAssignment401=variableAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment401.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:23: ( ',' variableAssignment )*
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==Comma) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:24: ',' variableAssignment
					{
					char_literal402=(Token)match(input,Comma,FOLLOW_Comma_in_forUpdate3742); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal402_tree = 
					(Object)adaptor.create(char_literal402)
					;
					adaptor.addChild(root_0, char_literal402_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forUpdate3744);
					variableAssignment403=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment403.getTree());

					}
					break;

				default :
					break loop130;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal404=null;
		Token char_literal405=null;
		Token VariableId406=null;
		Token string_literal408=null;
		Token VariableId409=null;
		Token string_literal410=null;
		Token VariableId411=null;
		Token char_literal412=null;
		ParserRuleReturnScope array407 =null;
		ParserRuleReturnScope instructionInclBreakContinue413 =null;

		Object string_literal404_tree=null;
		Object char_literal405_tree=null;
		Object VariableId406_tree=null;
		Object string_literal408_tree=null;
		Object VariableId409_tree=null;
		Object string_literal410_tree=null;
		Object VariableId411_tree=null;
		Object char_literal412_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal404=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3755); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal404_tree = 
			(Object)adaptor.create(string_literal404)
			;
			adaptor.addChild(root_0, string_literal404_tree);
			}

			char_literal405=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3757); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal405_tree = 
			(Object)adaptor.create(char_literal405)
			;
			adaptor.addChild(root_0, char_literal405_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:18: ( VariableId | array )
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==VariableId) ) {
				alt131=1;
			}
			else if ( (LA131_0==LeftSquareBrace||LA131_0==TypeArray) ) {
				alt131=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}
			switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:19: VariableId
					{
					VariableId406=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3760); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId406_tree = 
					(Object)adaptor.create(VariableId406)
					;
					adaptor.addChild(root_0, VariableId406_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3762);
					array407=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array407.getTree());

					}
					break;

			}

			string_literal408=(Token)match(input,As,FOLLOW_As_in_foreachLoop3765); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal408_tree = 
			(Object)adaptor.create(string_literal408)
			;
			adaptor.addChild(root_0, string_literal408_tree);
			}

			VariableId409=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3767); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId409_tree = 
			(Object)adaptor.create(VariableId409)
			;
			adaptor.addChild(root_0, VariableId409_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:53: ( '=>' VariableId )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==Arrow) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:54: '=>' VariableId
					{
					string_literal410=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3770); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal410_tree = 
					(Object)adaptor.create(string_literal410)
					;
					adaptor.addChild(root_0, string_literal410_tree);
					}

					VariableId411=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3772); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId411_tree = 
					(Object)adaptor.create(VariableId411)
					;
					adaptor.addChild(root_0, VariableId411_tree);
					}

					}
					break;

			}

			char_literal412=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal412_tree = 
			(Object)adaptor.create(char_literal412)
			;
			adaptor.addChild(root_0, char_literal412_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3778);
			instructionInclBreakContinue413=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue413.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal414=null;
		Token char_literal415=null;
		Token char_literal417=null;
		ParserRuleReturnScope expression416 =null;
		ParserRuleReturnScope instructionInclBreakContinue418 =null;

		Object string_literal414_tree=null;
		Object char_literal415_tree=null;
		Object char_literal417_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:688:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:688:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal414=(Token)match(input,While,FOLLOW_While_in_whileLoop3787); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal414_tree = 
			(Object)adaptor.create(string_literal414)
			;
			adaptor.addChild(root_0, string_literal414_tree);
			}

			char_literal415=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3789); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal415_tree = 
			(Object)adaptor.create(char_literal415)
			;
			adaptor.addChild(root_0, char_literal415_tree);
			}

			pushFollow(FOLLOW_expression_in_whileLoop3791);
			expression416=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression416.getTree());

			char_literal417=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal417_tree = 
			(Object)adaptor.create(char_literal417)
			;
			adaptor.addChild(root_0, char_literal417_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3795);
			instructionInclBreakContinue418=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue418.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal419=null;
		Token string_literal421=null;
		Token char_literal422=null;
		Token char_literal424=null;
		Token char_literal425=null;
		ParserRuleReturnScope instructionInclBreakContinue420 =null;
		ParserRuleReturnScope expression423 =null;

		Object string_literal419_tree=null;
		Object string_literal421_tree=null;
		Object char_literal422_tree=null;
		Object char_literal424_tree=null;
		Object char_literal425_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:691:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:691:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal419=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop3805); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal419_tree = 
			(Object)adaptor.create(string_literal419)
			;
			adaptor.addChild(root_0, string_literal419_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3807);
			instructionInclBreakContinue420=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue420.getTree());

			string_literal421=(Token)match(input,While,FOLLOW_While_in_doWhileLoop3809); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal421_tree = 
			(Object)adaptor.create(string_literal421)
			;
			adaptor.addChild(root_0, string_literal421_tree);
			}

			char_literal422=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3811); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal422_tree = 
			(Object)adaptor.create(char_literal422)
			;
			adaptor.addChild(root_0, char_literal422_tree);
			}

			pushFollow(FOLLOW_expression_in_doWhileLoop3813);
			expression423=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression423.getTree());

			char_literal424=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3815); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal424_tree = 
			(Object)adaptor.create(char_literal424)
			;
			adaptor.addChild(root_0, char_literal424_tree);
			}

			char_literal425=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3817); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal425_tree = 
			(Object)adaptor.create(char_literal425)
			;
			adaptor.addChild(root_0, char_literal425_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal426=null;
		Token char_literal427=null;
		Token char_literal429=null;
		Token string_literal430=null;
		Token char_literal431=null;
		Token VariableId433=null;
		Token char_literal434=null;
		Token char_literal435=null;
		Token char_literal437=null;
		ParserRuleReturnScope instructionInclBreakContinue428 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject432 =null;
		ParserRuleReturnScope instructionInclBreakContinue436 =null;

		Object string_literal426_tree=null;
		Object char_literal427_tree=null;
		Object char_literal429_tree=null;
		Object string_literal430_tree=null;
		Object char_literal431_tree=null;
		Object VariableId433_tree=null;
		Object char_literal434_tree=null;
		Object char_literal435_tree=null;
		Object char_literal437_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal426=(Token)match(input,Try,FOLLOW_Try_in_tryCatch3824); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal426_tree = 
			(Object)adaptor.create(string_literal426)
			;
			adaptor.addChild(root_0, string_literal426_tree);
			}

			char_literal427=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3826); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal427_tree = 
			(Object)adaptor.create(char_literal427)
			;
			adaptor.addChild(root_0, char_literal427_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:21: ( instructionInclBreakContinue )+
			int cnt133=0;
			loop133:
			do {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==Backslash||LA133_0==Break||LA133_0==Continue||LA133_0==Do||LA133_0==Echo||LA133_0==Exit||(LA133_0 >= For && LA133_0 <= Foreach)||(LA133_0 >= Identifier && LA133_0 <= If)||LA133_0==LeftCurlyBrace||LA133_0==MinusMinus||LA133_0==Parent||LA133_0==PlusPlus||LA133_0==Return||LA133_0==Self||(LA133_0 >= Switch && LA133_0 <= TypeString)||LA133_0==VariableId||LA133_0==While) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3828);
					instructionInclBreakContinue428=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue428.getTree());

					}
					break;

				default :
					if ( cnt133 >= 1 ) break loop133;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(133, input);
						throw eee;
				}
				cnt133++;
			} while (true);

			char_literal429=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal429_tree = 
			(Object)adaptor.create(char_literal429)
			;
			adaptor.addChild(root_0, char_literal429_tree);
			}

			string_literal430=(Token)match(input,Catch,FOLLOW_Catch_in_tryCatch3833); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal430_tree = 
			(Object)adaptor.create(string_literal430)
			;
			adaptor.addChild(root_0, string_literal430_tree);
			}

			char_literal431=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal431_tree = 
			(Object)adaptor.create(char_literal431)
			;
			adaptor.addChild(root_0, char_literal431_tree);
			}

			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3837);
			classInterfaceTypeInclObject432=classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject432.getTree());

			VariableId433=(Token)match(input,VariableId,FOLLOW_VariableId_in_tryCatch3839); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId433_tree = 
			(Object)adaptor.create(VariableId433)
			;
			adaptor.addChild(root_0, VariableId433_tree);
			}

			char_literal434=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3841); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal434_tree = 
			(Object)adaptor.create(char_literal434)
			;
			adaptor.addChild(root_0, char_literal434_tree);
			}

			char_literal435=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3842); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal435_tree = 
			(Object)adaptor.create(char_literal435)
			;
			adaptor.addChild(root_0, char_literal435_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:114: ( instructionInclBreakContinue )*
			loop134:
			do {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==Backslash||LA134_0==Break||LA134_0==Continue||LA134_0==Do||LA134_0==Echo||LA134_0==Exit||(LA134_0 >= For && LA134_0 <= Foreach)||(LA134_0 >= Identifier && LA134_0 <= If)||LA134_0==LeftCurlyBrace||LA134_0==MinusMinus||LA134_0==Parent||LA134_0==PlusPlus||LA134_0==Return||LA134_0==Self||(LA134_0 >= Switch && LA134_0 <= TypeString)||LA134_0==VariableId||LA134_0==While) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3844);
					instructionInclBreakContinue436=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue436.getTree());

					}
					break;

				default :
					break loop134;
				}
			} while (true);

			char_literal437=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3847); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal437_tree = 
			(Object)adaptor.create(char_literal437)
			;
			adaptor.addChild(root_0, char_literal437_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class throwException_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:1: throwException : 'throw' newObject ';' ;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal438=null;
		Token char_literal440=null;
		ParserRuleReturnScope newObject439 =null;

		Object string_literal438_tree=null;
		Object char_literal440_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:4: 'throw' newObject ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal438=(Token)match(input,Throw,FOLLOW_Throw_in_throwException3856); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal438_tree = 
			(Object)adaptor.create(string_literal438)
			;
			adaptor.addChild(root_0, string_literal438_tree);
			}

			pushFollow(FOLLOW_newObject_in_throwException3858);
			newObject439=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject439.getTree());

			char_literal440=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException3860); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal440_tree = 
			(Object)adaptor.create(char_literal440)
			;
			adaptor.addChild(root_0, char_literal440_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, throwException_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred68_TSPHP1840);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP1842); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred69_TSPHP
	public final void synpred69_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred69_TSPHP1847);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP1849); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred78_TSPHP
	public final void synpred78_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: ( functionCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: functionCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred78_TSPHP1894);
		functionCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred78_TSPHP1896); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred78_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: ( methodCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: methodCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1901);
		methodCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP1903); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred100_TSPHP2139); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred100_TSPHP2142);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred101_TSPHP2158); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred101_TSPHP2161);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred102_TSPHP2177); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred102_TSPHP2180);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred103_TSPHP2194);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred103_TSPHP2196);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred131_TSPHP
	public final void synpred131_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
		{
		match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred131_TSPHP2502); if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
		int alt147=2;
		int LA147_0 = input.LA(1);
		if ( ((LA147_0 >= TypeArray && LA147_0 <= TypeInt)||LA147_0==TypeString) ) {
			alt147=1;
		}
		else if ( (LA147_0==Backslash||LA147_0==Identifier||LA147_0==TypeObject) ) {
			alt147=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 147, 0, input);
			throw nvae;
		}
		switch (alt147) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:10: primitiveTypesInclArray
				{
				pushFollow(FOLLOW_primitiveTypesInclArray_in_synpred131_TSPHP2505);
				primitiveTypesInclArray();
				state._fsp--;
				if (state.failed) return ;

				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:34: classInterfaceTypeInclObject
				{
				pushFollow(FOLLOW_classInterfaceTypeInclObject_in_synpred131_TSPHP2507);
				classInterfaceTypeInclObject();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred131_TSPHP2510); if (state.failed) return ;

		}

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2513);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred131_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: ( functionCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: functionCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2727);
		functionCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: ( methodCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: methodCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2732);
		methodCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred153_TSPHP
	public final void synpred153_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred153_TSPHP2765);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred153_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:4: ( functionCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:4: functionCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_functionCall_in_synpred154_TSPHP2763);
		functionCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: ( callOrAccess )*
		loop151:
		do {
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==ObjectOperator) ) {
				int LA151_1 = input.LA(2);
				if ( (synpred153_TSPHP()) ) {
					alt151=1;
				}

			}
			else if ( (LA151_0==LeftSquareBrace) ) {
				alt151=1;
			}

			switch (alt151) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:17: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred154_TSPHP2765);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop151;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred154_TSPHP2768);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred160_TSPHP2860);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred161_TSPHP
	public final void synpred161_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:5: ( methodCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:5: methodCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_methodCall_in_synpred161_TSPHP2858);
		methodCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: ( callOrAccess )*
		loop152:
		do {
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==ObjectOperator) ) {
				int LA152_1 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt152=1;
				}

			}
			else if ( (LA152_0==LeftSquareBrace) ) {
				alt152=1;
			}

			switch (alt152) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:16: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred161_TSPHP2860);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop152;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred161_TSPHP2863);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred161_TSPHP

	// $ANTLR start synpred166_TSPHP
	public final void synpred166_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred166_TSPHP2919);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred166_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:4: ( variableMemberStaticMember )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:4: variableMemberStaticMember
		{
		pushFollow(FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP2924);
		variableMemberStaticMember();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred168_TSPHP
	public final void synpred168_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred168_TSPHP2929);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred168_TSPHP

	// $ANTLR start synpred169_TSPHP
	public final void synpred169_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred169_TSPHP2934);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred169_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred181_TSPHP3524);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred181_TSPHP3526); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred182_TSPHP3537);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred182_TSPHP3539); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred184_TSPHP3570); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3572);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred184_TSPHP

	// $ANTLR start synpred192_TSPHP
	public final void synpred192_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3607);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:16: ( instructionInclBreakContinue )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3610);
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

		pushFollow(FOLLOW_defaultLabel_in_synpred192_TSPHP3615);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:61: ( instructionInclBreakContinue )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3617);
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt165=0;
		loop165:
		do {
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==Case) ) {
				alt165=1;
			}

			switch (alt165) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3621);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:103: ( instructionInclBreakContinue )+
				int cnt164=0;
				loop164:
				do {
					int alt164=2;
					int LA164_0 = input.LA(1);
					if ( (LA164_0==Backslash||LA164_0==Break||LA164_0==Continue||LA164_0==Do||LA164_0==Echo||LA164_0==Exit||(LA164_0 >= For && LA164_0 <= Foreach)||(LA164_0 >= Identifier && LA164_0 <= If)||LA164_0==LeftCurlyBrace||LA164_0==MinusMinus||LA164_0==Parent||LA164_0==PlusPlus||LA164_0==Return||LA164_0==Self||(LA164_0 >= Switch && LA164_0 <= TypeString)||LA164_0==VariableId||LA164_0==While) ) {
						alt164=1;
					}

					switch (alt164) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3624);
						instructionInclBreakContinue();
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

	}
	// $ANTLR end synpred192_TSPHP

	// Delegated rules

	public final boolean synpred181_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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
	public final boolean synpred68_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred69_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred161_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred161_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred150_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred150_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred151_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred192_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred192_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred166_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred166_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred169_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred169_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred79_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred168_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred168_TSPHP_fragment(); // can never throw exception
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
	protected DFA47 dfa47 = new DFA47(this);
	protected DFA87 dfa87 = new DFA87(this);
	protected DFA101 dfa101 = new DFA101(this);
	protected DFA128 dfa128 = new DFA128(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\65\1\uffff\1\12\1\uffff\1\65\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\175\1\73\1\uffff\1\147\1\uffff\1\65\1\uffff\1\147";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\4\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\4\uffff"+
			"\1\1\7\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\16\2\1\uffff"+
			"\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\60\uffff\1\4\53\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\60\uffff\1\4\53\uffff\1\6"
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

	static final String DFA47_eotS =
		"\27\uffff";
	static final String DFA47_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA47_minS =
		"\1\12\4\173\1\65\1\12\1\7\1\65\1\uffff\1\12\2\uffff\1\12\4\173\1\65\1"+
		"\12\1\7\1\65\1\12";
	static final String DFA47_maxS =
		"\1\171\4\173\1\65\1\173\1\171\1\65\1\uffff\1\171\2\uffff\5\173\1\65\1"+
		"\173\1\142\1\65\1\173";
	static final String DFA47_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA47_specialS =
		"\27\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\5\52\uffff\1\6\74\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\160\uffff\1\7",
			"\1\11\2\uffff\1\14\16\uffff\1\12\33\uffff\1\14\54\uffff\1\13\17\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\52\uffff\1\23\74\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\160\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\160\uffff\1\24",
			"\1\14\21\uffff\1\13\110\uffff\1\13",
			"\1\26",
			"\1\25\160\uffff\1\24"
	};

	static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
	static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
	static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
	static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
	static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
	static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
	static final short[][] DFA47_transition;

	static {
		int numStates = DFA47_transitionS.length;
		DFA47_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
		}
	}

	class DFA47 extends DFA {

		public DFA47(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 47;
			this.eot = DFA47_eot;
			this.eof = DFA47_eof;
			this.min = DFA47_min;
			this.max = DFA47_max;
			this.accept = DFA47_accept;
			this.special = DFA47_special;
			this.transition = DFA47_transition;
		}
		@Override
		public String getDescription() {
			return "327:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA87_eotS =
		"\10\uffff";
	static final String DFA87_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA87_minS =
		"\1\116\1\12\1\65\1\5\1\65\2\uffff\1\5";
	static final String DFA87_maxS =
		"\1\116\2\65\1\153\1\65\2\uffff\1\153";
	static final String DFA87_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA87_specialS =
		"\10\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\1",
			"\1\2\52\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\2\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\2\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5"
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
			return "516:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	static final String DFA101_eotS =
		"\12\uffff";
	static final String DFA101_eofS =
		"\12\uffff";
	static final String DFA101_minS =
		"\1\12\3\65\1\12\2\uffff\2\65\1\12";
	static final String DFA101_maxS =
		"\3\173\1\65\1\45\2\uffff\1\65\1\173\1\45";
	static final String DFA101_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA101_specialS =
		"\12\uffff}>";
	static final String[] DFA101_transitionS = {
			"\1\3\52\uffff\1\4\37\uffff\1\2\20\uffff\1\1\10\uffff\1\5\13\uffff\1\5",
			"\1\6\105\uffff\1\5",
			"\1\6\105\uffff\1\5",
			"\1\4",
			"\1\7\32\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\105\uffff\1\5",
			"\1\7\32\uffff\1\10"
	};

	static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
	static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
	static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
	static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
	static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
	static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
	static final short[][] DFA101_transition;

	static {
		int numStates = DFA101_transitionS.length;
		DFA101_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
		}
	}

	class DFA101 extends DFA {

		public DFA101(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 101;
			this.eot = DFA101_eot;
			this.eof = DFA101_eof;
			this.min = DFA101_min;
			this.max = DFA101_max;
			this.accept = DFA101_accept;
			this.special = DFA101_special;
			this.transition = DFA101_transition;
		}
		@Override
		public String getDescription() {
			return "560:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )";
		}
	}

	static final String DFA128_eotS =
		"\7\uffff";
	static final String DFA128_eofS =
		"\7\uffff";
	static final String DFA128_minS =
		"\1\12\1\uffff\1\65\1\12\1\uffff\1\65\1\12";
	static final String DFA128_maxS =
		"\1\173\1\uffff\1\65\1\173\1\uffff\1\65\1\173";
	static final String DFA128_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA128_specialS =
		"\7\uffff}>";
	static final String[] DFA128_transitionS = {
			"\1\2\52\uffff\1\3\22\uffff\1\4\14\uffff\1\4\2\uffff\1\4\15\uffff\1\4"+
			"\10\uffff\1\4\2\uffff\10\1\1\uffff\1\4",
			"",
			"\1\3",
			"\1\5\32\uffff\1\4\125\uffff\1\1",
			"",
			"\1\6",
			"\1\5\32\uffff\1\4\125\uffff\1\1"
	};

	static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
	static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
	static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
	static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
	static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
	static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
	static final short[][] DFA128_transition;

	static {
		int numStates = DFA128_transitionS.length;
		DFA128_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
		}
	}

	class DFA128 extends DFA {

		public DFA128(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 128;
			this.eot = DFA128_eot;
			this.eof = DFA128_eof;
			this.min = DFA128_min;
			this.max = DFA128_max;
			this.accept = DFA128_accept;
			this.special = DFA128_special;
			this.transition = DFA128_transition;
		}
		@Override
		public String getDescription() {
			return "680:11: ( variableDeclaration | variableAssignment )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_EOF_in_prog909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_EOF_in_prog917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog922 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon937 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon939 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon941 = new BitSet(new long[]{0x0C61D48208400410L,0x2FFFC04101200100L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon943 = new BitSet(new long[]{0x0C61D48208400412L,0x2FFFC04101200100L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket956 = new BitSet(new long[]{0x0820000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket958 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket961 = new BitSet(new long[]{0x0C61D48208400410L,0x2FFFC04101200100L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket963 = new BitSet(new long[]{0x0C61D48208400410L,0x2FFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1062 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1065 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1067 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1080 = new BitSet(new long[]{0x0C61D48208400412L,0x2FFFC04101200100L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1113 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1115 = new BitSet(new long[]{0x0000000002000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1118 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1120 = new BitSet(new long[]{0x0000000002000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1137 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1139 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1141 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1150 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1151 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1163 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1215 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1217 = new BitSet(new long[]{0x0880080000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1219 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1222 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1225 = new BitSet(new long[]{0x0001100008000010L,0x0000100062000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1227 = new BitSet(new long[]{0x0001100008000010L,0x0000100262000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1244 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1255 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1258 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1260 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1271 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1306 = new BitSet(new long[]{0x0000000000000000L,0x0278000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1308 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1310 = new BitSet(new long[]{0x0000000002000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1313 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1315 = new BitSet(new long[]{0x0000000002000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1329 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1332 = new BitSet(new long[]{0x0220200000040000L,0x0000200000440040L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000062000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1347 = new BitSet(new long[]{0x0020000000000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1349 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1386 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1389 = new BitSet(new long[]{0x0020000000000400L,0x0800804001200100L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1392 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1394 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1411 = new BitSet(new long[]{0x0001000000000000L,0x0000000060000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1413 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1427 = new BitSet(new long[]{0x0001100000000000L,0x0000000062000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1429 = new BitSet(new long[]{0x0001000000000000L,0x0000000062000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1437 = new BitSet(new long[]{0x0001000000000000L,0x0000100062000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1439 = new BitSet(new long[]{0x0001000000000000L,0x0000000062000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1453 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1470 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1472 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1474 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1477 = new BitSet(new long[]{0x0001000008000000L,0x0000000240000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1479 = new BitSet(new long[]{0x0001000008000000L,0x0000000240000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1507 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1510 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1528 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1530 = new BitSet(new long[]{0x0860C48200000400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1532 = new BitSet(new long[]{0x0860C48200000400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1545 = new BitSet(new long[]{0x0020000000000400L,0x13FC000000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1547 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1549 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1551 = new BitSet(new long[]{0x0020000000000400L,0x03FC000400000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1658 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1692 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1695 = new BitSet(new long[]{0x0020000000000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1697 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1704 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1707 = new BitSet(new long[]{0x0020000000000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1709 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1716 = new BitSet(new long[]{0x0020000002000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1719 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1721 = new BitSet(new long[]{0x0020000002000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1726 = new BitSet(new long[]{0x0020000000000400L,0x03FC000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1728 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1742 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1754 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1757 = new BitSet(new long[]{0x0220200000040000L,0x0000200000440040L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1781 = new BitSet(new long[]{0x0860C48200000400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1783 = new BitSet(new long[]{0x0860C48200000400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1803 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1805 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1819 = new BitSet(new long[]{0x0200000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1825 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1840 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1847 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1894 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1901 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1909 = new BitSet(new long[]{0x3220200000842500L,0x0804A0C001644144L});
	public static final BitSet FOLLOW_expression_in_instruction1911 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1919 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expressionList_in_instruction1921 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1928 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1942 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1945 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_expressionList1947 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1958 = new BitSet(new long[]{0x0000001100029080L,0x00000A0000801480L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1960 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_variableAssignment1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement1979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement1984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000100L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2078 = new BitSet(new long[]{0x0020000000000400L,0x0800804000200000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2096 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2098 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2101 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2125 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2139 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2158 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2177 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2191 = new BitSet(new long[]{0x0000001100029082L,0x00000A0000801480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2194 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_ternary_in_assignment2196 = new BitSet(new long[]{0x0000001100029082L,0x00000A0000801480L});
	public static final BitSet FOLLOW_logicOr_in_ternary2206 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2209 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_ternary2212 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2214 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_ternary2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2230 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2245 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2259 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2262 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2265 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2276 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2279 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2282 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2293 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2296 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2299 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2308 = new BitSet(new long[]{0x0010020000000002L,0x0000000000038000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2311 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_comparison_in_equality2314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2356 = new BitSet(new long[]{0xC006000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2359 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2398 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2401 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2408 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2418 = new BitSet(new long[]{0x0000000800000002L,0x0000000000400040L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2421 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2430 = new BitSet(new long[]{0x0000000800000002L,0x0000000000400040L});
	public static final BitSet FOLLOW_logicNot_in_factor2440 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_set_in_factor2443 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicNot_in_factor2452 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2461 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2480 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2483 = new BitSet(new long[]{0x0020000000000400L,0x0800000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2502 = new BitSet(new long[]{0x0020000000000400L,0x02FC000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2510 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2518 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2526 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2545 = new BitSet(new long[]{0x0020000000000400L,0x0800804000200000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_newOrClone2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_newOrClone2557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2570 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2572 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2574 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2580 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2582 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2588 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2590 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccessOrParent2612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccessOrParent2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2622 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_memberAccessOrArrayAccess2634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccess2649 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccess2651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2661 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2678 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2685 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2687 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2689 = new BitSet(new long[]{0x3220200000842500L,0x0804A04401644144L});
	public static final BitSet FOLLOW_expressionList_in_newObject2691 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary2703 = new BitSet(new long[]{0x3220200000040400L,0x0804A04001240100L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary2710 = new BitSet(new long[]{0x3220200000040400L,0x0804A04001240100L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2749 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2763 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2765 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2787 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2789 = new BitSet(new long[]{0x3220200000842500L,0x0804A04401644144L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2791 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call2823 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call2825 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call2827 = new BitSet(new long[]{0x3220200000842500L,0x0804A04401644144L});
	public static final BitSet FOLLOW_expressionList_in_call2829 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call2831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2842 = new BitSet(new long[]{0x2000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2858 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2860 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_methodCall2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2886 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_methodCall2891 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2894 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2896 = new BitSet(new long[]{0x3220200000842500L,0x0804A04401644144L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2910 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_atom2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom2919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_atom2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom2929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant2967 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant2969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2981 = new BitSet(new long[]{0x0220200000040000L,0x0000200000040000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2988 = new BitSet(new long[]{0x0220200000040000L,0x0000200000040000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3493 = new BitSet(new long[]{0x3220200000842500L,0x0804A04801644144L});
	public static final BitSet FOLLOW_array_content_in_array3495 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3504 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3506 = new BitSet(new long[]{0x3220200000842500L,0x0804A04401644144L});
	public static final BitSet FOLLOW_array_content_in_array3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3524 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3526 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_array_content3530 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3534 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_array_content3537 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3539 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_array_content3543 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3555 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3557 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_ifCondition3559 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3561 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3563 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3570 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3588 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3590 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3592 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3594 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3596 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3607 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3610 = new BitSet(new long[]{0x0860C48250180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3615 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3617 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3621 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3624 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3634 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3637 = new BitSet(new long[]{0x0860C48250180400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3643 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3645 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3668 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_caseLabel3670 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3681 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3692 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3694 = new BitSet(new long[]{0x0020000000000400L,0x0BFC80C001200100L});
	public static final BitSet FOLLOW_forInit_in_forLoop3696 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3699 = new BitSet(new long[]{0x3220200000842500L,0x0804A0C001644144L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3701 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3705 = new BitSet(new long[]{0x0020000000000400L,0x0800804401200100L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3710 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3721 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3723 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3727 = new BitSet(new long[]{0x0020000000000400L,0x0800804001200100L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3729 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3739 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3742 = new BitSet(new long[]{0x0020000000000400L,0x0800804001200100L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3744 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3755 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3757 = new BitSet(new long[]{0x2000000000000000L,0x0804000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3760 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3762 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3765 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3767 = new BitSet(new long[]{0x0000000000000020L,0x0000000400000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3770 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3772 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3776 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3787 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3789 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_whileLoop3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3793 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3805 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3807 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3809 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3811 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3813 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3815 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3824 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3826 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3828 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3831 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3833 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3835 = new BitSet(new long[]{0x0020000000000400L,0x0080000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3837 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3841 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3842 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3844 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04301200100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_newObject_in_throwException3858 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred68_TSPHP1840 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred69_TSPHP1847 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred78_TSPHP1894 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred78_TSPHP1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1901 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred100_TSPHP2139 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred100_TSPHP2142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred101_TSPHP2158 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred101_TSPHP2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred102_TSPHP2177 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_assignment_in_synpred102_TSPHP2180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred103_TSPHP2194 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644144L});
	public static final BitSet FOLLOW_ternary_in_synpred103_TSPHP2196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred131_TSPHP2502 = new BitSet(new long[]{0x0020000000000400L,0x02FC000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_synpred131_TSPHP2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_synpred131_TSPHP2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred131_TSPHP2510 = new BitSet(new long[]{0x3220200000842500L,0x0804A04001644140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred153_TSPHP2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_synpred154_TSPHP2763 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred154_TSPHP2765 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_synpred154_TSPHP2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred160_TSPHP2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_synpred161_TSPHP2858 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred161_TSPHP2860 = new BitSet(new long[]{0x2000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_call_in_synpred161_TSPHP2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred166_TSPHP2919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred168_TSPHP2929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred169_TSPHP2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred181_TSPHP3524 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred181_TSPHP3526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred182_TSPHP3537 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred182_TSPHP3539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred184_TSPHP3570 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3607 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3610 = new BitSet(new long[]{0x0860C48250180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred192_TSPHP3615 = new BitSet(new long[]{0x0860C48210080400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3617 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3621 = new BitSet(new long[]{0x0860C48210180400L,0x2BFFC04101200100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3624 = new BitSet(new long[]{0x0860C48210180402L,0x2BFFC04101200100L});
}
