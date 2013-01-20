// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-20 12:14:18

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CLASS_INTERFACE_TYPE", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
	};

	public static final int EOF=-1;
	public static final int Abstract=4;
	public static final int Arrow=5;
	public static final int As=6;
	public static final int Assign=7;
	public static final int At=8;
	public static final int BINARY=9;
	public static final int BLOCK=10;
	public static final int Backslash=11;
	public static final int BitwiseAnd=12;
	public static final int BitwiseAndEqual=13;
	public static final int BitwiseNot=14;
	public static final int BitwiseOr=15;
	public static final int BitwiseOrEqual=16;
	public static final int BitwiseXor=17;
	public static final int BitwiseXorEqual=18;
	public static final int Bool=19;
	public static final int Break=20;
	public static final int CAST=21;
	public static final int CLASS_INTERFACE_TYPE=22;
	public static final int Case=23;
	public static final int Catch=24;
	public static final int Class=25;
	public static final int Clone=26;
	public static final int Colon=27;
	public static final int Comma=28;
	public static final int Comment=29;
	public static final int Const=30;
	public static final int Continue=31;
	public static final int DECIMAL=32;
	public static final int Default=33;
	public static final int Divide=34;
	public static final int DivideEqual=35;
	public static final int Do=36;
	public static final int Dolar=37;
	public static final int Dot=38;
	public static final int DotEqual=39;
	public static final int DoubleColon=40;
	public static final int EXPONENT=41;
	public static final int EXPRESSION_LIST=42;
	public static final int Echo=43;
	public static final int Else=44;
	public static final int Equal=45;
	public static final int Exit=46;
	public static final int Extends=47;
	public static final int Final=48;
	public static final int Float=49;
	public static final int For=50;
	public static final int Foreach=51;
	public static final int Function=52;
	public static final int GreaterEqualThan=53;
	public static final int GreaterThan=54;
	public static final int HEXADECIMAL=55;
	public static final int Identical=56;
	public static final int Identifier=57;
	public static final int If=58;
	public static final int Implements=59;
	public static final int Instanceof=60;
	public static final int Int=61;
	public static final int Interface=62;
	public static final int LeftCurlyBrace=63;
	public static final int LeftParanthesis=64;
	public static final int LeftSquareBrace=65;
	public static final int LessEqualThan=66;
	public static final int LessThan=67;
	public static final int LogicAnd=68;
	public static final int LogicAndWeak=69;
	public static final int LogicNot=70;
	public static final int LogicOr=71;
	public static final int LogicOrWeak=72;
	public static final int LogicXorWeak=73;
	public static final int Minus=74;
	public static final int MinusEqual=75;
	public static final int MinusMinus=76;
	public static final int Modulo=77;
	public static final int ModuloEqual=78;
	public static final int Multiply=79;
	public static final int MultiplyEqual=80;
	public static final int Namespace=81;
	public static final int New=82;
	public static final int NotEqual=83;
	public static final int NotEqualAlternative=84;
	public static final int NotIdentical=85;
	public static final int Null=86;
	public static final int OCTAL=87;
	public static final int ObjectOperator=88;
	public static final int POST_INCREMENT_DECREMENT=89;
	public static final int PRE_INCREMENT_DECREMENT=90;
	public static final int Parent=91;
	public static final int Plus=92;
	public static final int PlusEqual=93;
	public static final int PlusPlus=94;
	public static final int Private=95;
	public static final int ProtectParent=96;
	public static final int ProtectSelf=97;
	public static final int ProtectThis=98;
	public static final int Protected=99;
	public static final int Public=100;
	public static final int QuestionMark=101;
	public static final int Return=102;
	public static final int RightCurlyBrace=103;
	public static final int RightParanthesis=104;
	public static final int RightSquareBrace=105;
	public static final int STRING_DOUBLE_QUOTED=106;
	public static final int STRING_SINGLE_QUOTED=107;
	public static final int SWITCH_CASES=108;
	public static final int Self=109;
	public static final int Semicolon=110;
	public static final int ShiftLeft=111;
	public static final int ShiftLeftEqual=112;
	public static final int ShiftRight=113;
	public static final int ShiftRightEqual=114;
	public static final int Static=115;
	public static final int String=116;
	public static final int Switch=117;
	public static final int This=118;
	public static final int Throw=119;
	public static final int Try=120;
	public static final int TypeArray=121;
	public static final int TypeBool=122;
	public static final int TypeBoolean=123;
	public static final int TypeFloat=124;
	public static final int TypeInt=125;
	public static final int TypeObject=126;
	public static final int TypeResource=127;
	public static final int TypeString=128;
	public static final int UMINUS=129;
	public static final int UPLUS=130;
	public static final int Use=131;
	public static final int VARIABLE_DECLARATION=132;
	public static final int VARIABLE_DECLARATION_LIST=133;
	public static final int VariableId=134;
	public static final int Void=135;
	public static final int While=136;
	public static final int Whitespace=137;

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
		this.state.ruleMemo = new HashMap[307+1];
		 

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
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
	public final TSPHPParser.prog_return prog() throws RecognitionException {
		TSPHPParser.prog_return retval = new TSPHPParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF2=null;
		Token EOF4=null;
		Token EOF6=null;
		ParserRuleReturnScope namespaceSemicolon1 =null;
		ParserRuleReturnScope namespaceBracket3 =null;
		ParserRuleReturnScope withoutNamespace5 =null;

		CommonTree EOF2_tree=null;
		CommonTree EOF4_tree=null;
		CommonTree EOF6_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog968);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog971); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog977);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog980); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog986);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog988); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class namespaceSemicolon_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:196:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final TSPHPParser.namespaceSemicolon_return namespaceSemicolon() throws RecognitionException {
		TSPHPParser.namespaceSemicolon_return retval = new TSPHPParser.namespaceSemicolon_return();
		retval.start = input.LT(1);
		int namespaceSemicolon_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		ParserRuleReturnScope namespaceId8 =null;
		ParserRuleReturnScope statement10 =null;

		CommonTree string_literal7_tree=null;
		CommonTree char_literal9_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1002); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1004);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1006); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==Parent||LA4_0==PlusPlus||LA4_0==Return||LA4_0==Self||(LA4_0 >= Switch && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:197:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1008);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, namespaceSemicolon_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceSemicolon"


	public static class namespaceBracket_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceBracket"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final TSPHPParser.namespaceBracket_return namespaceBracket() throws RecognitionException {
		TSPHPParser.namespaceBracket_return retval = new TSPHPParser.namespaceBracket_return();
		retval.start = input.LT(1);
		int namespaceBracket_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal11=null;
		Token char_literal13=null;
		Token char_literal15=null;
		ParserRuleReturnScope namespaceId12 =null;
		ParserRuleReturnScope statement14 =null;

		CommonTree string_literal11_tree=null;
		CommonTree char_literal13_tree=null;
		CommonTree char_literal15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1021); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1023);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1026); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==Parent||LA6_0==PlusPlus||LA6_0==Return||LA6_0==Self||(LA6_0 >= Switch && LA6_0 <= TypeString)||LA6_0==Use||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1028);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1031); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal15_tree = 
			(CommonTree)adaptor.create(char_literal15)
			;
			adaptor.addChild(root_0, char_literal15_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, namespaceBracket_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceBracket"


	public static class namespaceId_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final TSPHPParser.namespaceId_return namespaceId() throws RecognitionException {
		TSPHPParser.namespaceId_return retval = new TSPHPParser.namespaceId_return();
		retval.start = input.LT(1);
		int namespaceId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier16=null;
		Token char_literal17=null;
		Token Identifier18=null;

		CommonTree Identifier16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree Identifier18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: Identifier ( '\\\\' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier16_tree = 
			(CommonTree)adaptor.create(Identifier16)
			;
			adaptor.addChild(root_0, Identifier16_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1130); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = 
					(CommonTree)adaptor.create(char_literal17)
					;
					adaptor.addChild(root_0, char_literal17_tree);
					}

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier18_tree = 
					(CommonTree)adaptor.create(Identifier18)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, namespaceId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceId"


	public static class withoutNamespace_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==Parent||LA8_0==PlusPlus||LA8_0==Return||LA8_0==Self||(LA8_0 >= Switch && LA8_0 <= TypeString)||LA8_0==Use||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1147);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, withoutNamespace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "withoutNamespace"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final TSPHPParser.statement_return statement() throws RecognitionException {
		TSPHPParser.statement_return retval = new TSPHPParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope useDeclarationList20 =null;
		ParserRuleReturnScope definition21 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue22 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1158);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1163);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1168);
					instructionWithoutBreakContinue22=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class useDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final TSPHPParser.useDeclarationList_return useDeclarationList() throws RecognitionException {
		TSPHPParser.useDeclarationList_return retval = new TSPHPParser.useDeclarationList_return();
		retval.start = input.LT(1);
		int useDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal23=null;
		Token char_literal25=null;
		Token char_literal27=null;
		ParserRuleReturnScope useDeclaration24 =null;
		ParserRuleReturnScope useDeclaration26 =null;

		CommonTree string_literal23_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1180); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1182);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1187);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1191); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal27_tree = 
			(CommonTree)adaptor.create(char_literal27)
			;
			adaptor.addChild(root_0, char_literal27_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, useDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclarationList"


	public static class useDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
	public final TSPHPParser.useDeclaration_return useDeclaration() throws RecognitionException {
		TSPHPParser.useDeclaration_return retval = new TSPHPParser.useDeclaration_return();
		retval.start = input.LT(1);
		int useDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token string_literal33=null;
		Token Identifier34=null;
		ParserRuleReturnScope namespaceId30 =null;
		ParserRuleReturnScope namespaceId32 =null;

		CommonTree Identifier28_tree=null;
		CommonTree char_literal29_tree=null;
		CommonTree char_literal31_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree Identifier34_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1208);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:7: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1217); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1218);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier34_tree = 
					(CommonTree)adaptor.create(Identifier34)
					;
					adaptor.addChild(root_0, Identifier34_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, useDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclaration"


	public static class definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final TSPHPParser.definition_return definition() throws RecognitionException {
		TSPHPParser.definition_return retval = new TSPHPParser.definition_return();
		retval.start = input.LT(1);
		int definition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classDeclaration35 =null;
		ParserRuleReturnScope interfaceDeclaration36 =null;
		ParserRuleReturnScope functionDeclaration37 =null;
		ParserRuleReturnScope constDeclarationList38 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1245);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1250);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1255);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1260);
					constDeclarationList38=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList38.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, definition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final TSPHPParser.classDeclaration_return classDeclaration() throws RecognitionException {
		TSPHPParser.classDeclaration_return retval = new TSPHPParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set39=null;
		Token string_literal40=null;
		Token Identifier41=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope extendsDeclaration42 =null;
		ParserRuleReturnScope implementsDeclaration43 =null;
		ParserRuleReturnScope classBody45 =null;

		CommonTree set39_tree=null;
		CommonTree string_literal40_tree=null;
		CommonTree Identifier41_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree char_literal46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: ( 'abstract' | 'final' )?
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
						(CommonTree)adaptor.create(set39)
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1282); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1284); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1286);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1289);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1292); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1294);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1297); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal46_tree = 
			(CommonTree)adaptor.create(char_literal46)
			;
			adaptor.addChild(root_0, char_literal46_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class extendsDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:1: extendsDeclaration : 'extends' identifierList ;
	public final TSPHPParser.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		TSPHPParser.extendsDeclaration_return retval = new TSPHPParser.extendsDeclaration_return();
		retval.start = input.LT(1);
		int extendsDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal47=null;
		ParserRuleReturnScope identifierList48 =null;

		CommonTree string_literal47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1311); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1313);
			identifierList48=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, extendsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class identifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:1: identifierList : Identifier ( ',' Identifier )* ;
	public final TSPHPParser.identifierList_return identifierList() throws RecognitionException {
		TSPHPParser.identifierList_return retval = new TSPHPParser.identifierList_return();
		retval.start = input.LT(1);
		int identifierList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier49=null;
		Token char_literal50=null;
		Token Identifier51=null;

		CommonTree Identifier49_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree Identifier51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1324); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1327); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1329); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier51_tree = 
					(CommonTree)adaptor.create(Identifier51)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, identifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class implementsDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:1: implementsDeclaration : 'implements' identifierList ;
	public final TSPHPParser.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		TSPHPParser.implementsDeclaration_return retval = new TSPHPParser.implementsDeclaration_return();
		retval.start = input.LT(1);
		int implementsDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal52=null;
		ParserRuleReturnScope identifierList53 =null;

		CommonTree string_literal52_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1344);
			identifierList53=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList53.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, implementsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "implementsDeclaration"


	public static class classBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
	public final TSPHPParser.classBody_return classBody() throws RecognitionException {
		TSPHPParser.classBody_return retval = new TSPHPParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList54 =null;
		ParserRuleReturnScope attributeDeclaration55 =null;
		ParserRuleReturnScope methodDeclaration56 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1356);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1361);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1367);
					methodDeclaration56=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class constDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
	public final TSPHPParser.constDeclarationList_return constDeclarationList() throws RecognitionException {
		TSPHPParser.constDeclarationList_return retval = new TSPHPParser.constDeclarationList_return();
		retval.start = input.LT(1);
		int constDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal57=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope primitiveTypes58 =null;
		ParserRuleReturnScope constantAssignment59 =null;
		ParserRuleReturnScope constantAssignment61 =null;

		CommonTree string_literal57_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal62_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1379); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(CommonTree)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1381);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1383);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1386); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(CommonTree)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1388);
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

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1392); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal62_tree = 
			(CommonTree)adaptor.create(char_literal62)
			;
			adaptor.addChild(root_0, char_literal62_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, constDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final TSPHPParser.constantAssignment_return constantAssignment() throws RecognitionException {
		TSPHPParser.constantAssignment_return retval = new TSPHPParser.constantAssignment_return();
		retval.start = input.LT(1);
		int constantAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier63=null;
		Token char_literal64=null;
		ParserRuleReturnScope unaryPrimitiveAtom65 =null;

		CommonTree Identifier63_tree=null;
		CommonTree char_literal64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1402); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(CommonTree)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(CommonTree)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1407);
			unaryPrimitiveAtom65=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom65.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, constantAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class attributeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final TSPHPParser.attributeDeclaration_return attributeDeclaration() throws RecognitionException {
		TSPHPParser.attributeDeclaration_return retval = new TSPHPParser.attributeDeclaration_return();
		retval.start = input.LT(1);
		int attributeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal66=null;
		Token char_literal69=null;
		ParserRuleReturnScope accessor67 =null;
		ParserRuleReturnScope variableDeclarationListInclVariableId68 =null;

		CommonTree string_literal66_tree=null;
		CommonTree char_literal69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:4: 'static'
					{
					string_literal66=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal66_tree = 
					(CommonTree)adaptor.create(string_literal66)
					;
					adaptor.addChild(root_0, string_literal66_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1420);
			accessor67=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor67.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1422);
			variableDeclarationListInclVariableId68=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId68.getTree());

			char_literal69=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1424); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal69_tree = 
			(CommonTree)adaptor.create(char_literal69)
			;
			adaptor.addChild(root_0, char_literal69_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, attributeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "attributeDeclaration"


	public static class accessor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal71=null;
		ParserRuleReturnScope accessorWithoutPrivate70 =null;

		CommonTree string_literal71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1431);
					accessorWithoutPrivate70=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate70.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal71=(Token)match(input,Private,FOLLOW_Private_in_accessor1436); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal71_tree = 
					(CommonTree)adaptor.create(string_literal71)
					;
					adaptor.addChild(root_0, string_literal71_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, accessor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessor"


	public static class accessorWithoutPrivate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set72=null;

		CommonTree set72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:2: ( 'protected' | 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set72=(Token)input.LT(1);
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set72)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, accessorWithoutPrivate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessorWithoutPrivate"


	public static class variableDeclarationListInclVariableId_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final TSPHPParser.variableDeclarationListInclVariableId_return variableDeclarationListInclVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListInclVariableId_return retval = new TSPHPParser.variableDeclarationListInclVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal74=null;
		Token VariableId76=null;
		ParserRuleReturnScope variableDeclaration73 =null;
		ParserRuleReturnScope variableAssignment75 =null;

		CommonTree char_literal74_tree=null;
		CommonTree VariableId76_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1461);
			variableDeclaration73=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration73.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:24: ( ',' ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:25: ',' ( variableAssignment | VariableId )
					{
					char_literal74=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal74_tree = 
					(CommonTree)adaptor.create(char_literal74)
					;
					adaptor.addChild(root_0, char_literal74_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1467);
							variableAssignment75=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment75.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:49: VariableId
							{
							VariableId76=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1469); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId76_tree = 
							(CommonTree)adaptor.create(VariableId76)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, variableDeclarationListInclVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final TSPHPParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		TSPHPParser.methodDeclaration_return retval = new TSPHPParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal77=null;
		Token string_literal79=null;
		Token string_literal80=null;
		Token string_literal81=null;
		Token string_literal82=null;
		ParserRuleReturnScope accessorWithoutPrivate78 =null;
		ParserRuleReturnScope accessor83 =null;
		ParserRuleReturnScope functionDeclaration84 =null;

		CommonTree string_literal77_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree string_literal80_tree=null;
		CommonTree string_literal81_tree=null;
		CommonTree string_literal82_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1488); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal77_tree = 
					(CommonTree)adaptor.create(string_literal77)
					;
					adaptor.addChild(root_0, string_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1490);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:6: 'static' ( 'final' )?
							{
							string_literal79=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1504); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = 
							(CommonTree)adaptor.create(string_literal79)
							;
							adaptor.addChild(root_0, string_literal79_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:15: 'final'
									{
									string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1506); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal80_tree = 
									(CommonTree)adaptor.create(string_literal80)
									;
									adaptor.addChild(root_0, string_literal80_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:6: 'final' ( 'static' )?
							{
							string_literal81=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1514); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal81_tree = 
							(CommonTree)adaptor.create(string_literal81)
							;
							adaptor.addChild(root_0, string_literal81_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:14: 'static'
									{
									string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1516); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal82_tree = 
									(CommonTree)adaptor.create(string_literal82)
									;
									adaptor.addChild(root_0, string_literal82_tree);
									}

									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1530);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1537);
			functionDeclaration84=functionDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration84.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal85=null;
		Token Identifier86=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope implementsDeclaration87 =null;
		ParserRuleReturnScope interfaceBody89 =null;

		CommonTree string_literal85_tree=null;
		CommonTree Identifier86_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree char_literal90_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal85=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1549); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal85_tree = 
			(CommonTree)adaptor.create(string_literal85)
			;
			adaptor.addChild(root_0, string_literal85_tree);
			}

			Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1551); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier86_tree = 
			(CommonTree)adaptor.create(Identifier86)
			;
			adaptor.addChild(root_0, Identifier86_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1553);
					implementsDeclaration87=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration87.getTree());

					}
					break;

			}

			char_literal88=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1556); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = 
			(CommonTree)adaptor.create(char_literal88)
			;
			adaptor.addChild(root_0, char_literal88_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1558);
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

			char_literal90=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1561); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = 
			(CommonTree)adaptor.create(char_literal90)
			;
			adaptor.addChild(root_0, char_literal90_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList91 =null;
		ParserRuleReturnScope interfaceMethodDeclaration92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1572);
					constDeclarationList91=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList91.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1577);
					interfaceMethodDeclaration92=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration92.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal93=null;
		Token char_literal95=null;
		ParserRuleReturnScope functionDeclarationWithoutBody94 =null;

		CommonTree string_literal93_tree=null;
		CommonTree char_literal95_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:4: 'public'
					{
					string_literal93=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1588); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = 
					(CommonTree)adaptor.create(string_literal93)
					;
					adaptor.addChild(root_0, string_literal93_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1591);
			functionDeclarationWithoutBody94=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody94.getTree());

			char_literal95=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1593); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal95_tree = 
			(CommonTree)adaptor.create(char_literal95)
			;
			adaptor.addChild(root_0, char_literal95_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, interfaceMethodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal97=null;
		Token char_literal99=null;
		ParserRuleReturnScope functionDeclarationWithoutBody96 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue98 =null;

		CommonTree char_literal97_tree=null;
		CommonTree char_literal99_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1611);
			functionDeclarationWithoutBody96=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody96.getTree());

			char_literal97=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1613); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = 
			(CommonTree)adaptor.create(char_literal97)
			;
			adaptor.addChild(root_0, char_literal97_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:40: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==Parent||LA35_0==PlusPlus||LA35_0==Return||LA35_0==Self||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1615);
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

			char_literal99=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1618); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal99_tree = 
			(CommonTree)adaptor.create(char_literal99)
			;
			adaptor.addChild(root_0, char_literal99_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, functionDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class functionDeclarationWithoutBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal100=null;
		Token Identifier102=null;
		Token char_literal103=null;
		Token char_literal105=null;
		ParserRuleReturnScope returnType101 =null;
		ParserRuleReturnScope paramList104 =null;

		CommonTree string_literal100_tree=null;
		CommonTree Identifier102_tree=null;
		CommonTree char_literal103_tree=null;
		CommonTree char_literal105_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal100=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1630); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal100_tree = 
			(CommonTree)adaptor.create(string_literal100)
			;
			adaptor.addChild(root_0, string_literal100_tree);
			}

			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1632);
			returnType101=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType101.getTree());

			Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1634); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier102_tree = 
			(CommonTree)adaptor.create(Identifier102)
			;
			adaptor.addChild(root_0, Identifier102_tree);
			}

			char_literal103=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1636); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal103_tree = 
			(CommonTree)adaptor.create(char_literal103)
			;
			adaptor.addChild(root_0, char_literal103_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:41: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1638);
					paramList104=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList104.getTree());

					}
					break;

			}

			char_literal105=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1641); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal105_tree = 
			(CommonTree)adaptor.create(char_literal105)
			;
			adaptor.addChild(root_0, char_literal105_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, functionDeclarationWithoutBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationWithoutBody"


	public static class returnType_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal107=null;
		ParserRuleReturnScope allTypes106 =null;

		CommonTree string_literal107_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1653);
					allTypes106=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal107=(Token)match(input,Void,FOLLOW_Void_in_returnType1657); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal107_tree = 
					(CommonTree)adaptor.create(string_literal107)
					;
					adaptor.addChild(root_0, string_literal107_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended108 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:11: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1666);
					primitiveTypesExtended108=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:36: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1670);
					classInterfaceTypeInclObject109=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject109.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class allTypesWithoutResource_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypesWithoutResource"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:1: allTypesWithoutResource : ( primitiveTypesInclArray | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypesWithoutResource_return allTypesWithoutResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutResource_return retval = new TSPHPParser.allTypesWithoutResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray110 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject111 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:2: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= TypeArray && LA39_0 <= TypeInt)||LA39_0==TypeString) ) {
				alt39=1;
			}
			else if ( (LA39_0==Backslash||LA39_0==Identifier||LA39_0==TypeObject) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:330:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1681);
					primitiveTypesInclArray110=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray110.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:5: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1687);
					classInterfaceTypeInclObject111=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject111.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, allTypesWithoutResource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypesWithoutResource"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:1: primitiveTypes : ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token bool=null;
		Token TypeBool112=null;
		Token TypeInt113=null;
		Token TypeFloat114=null;
		Token TypeString115=null;

		CommonTree bool_tree=null;
		CommonTree TypeBool112_tree=null;
		CommonTree TypeInt113_tree=null;
		CommonTree TypeFloat114_tree=null;
		CommonTree TypeString115_tree=null;
		RewriteRuleTokenStream stream_TypeBoolean=new RewriteRuleTokenStream(adaptor,"token TypeBoolean");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:2: ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString )
			int alt40=5;
			switch ( input.LA(1) ) {
			case TypeBool:
				{
				alt40=1;
				}
				break;
			case TypeBoolean:
				{
				alt40=2;
				}
				break;
			case TypeInt:
				{
				alt40=3;
				}
				break;
			case TypeFloat:
				{
				alt40=4;
				}
				break;
			case TypeString:
				{
				alt40=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:4: TypeBool
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeBool112=(Token)match(input,TypeBool,FOLLOW_TypeBool_in_primitiveTypes1698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeBool112_tree = 
					(CommonTree)adaptor.create(TypeBool112)
					;
					adaptor.addChild(root_0, TypeBool112_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:4: bool= TypeBoolean
					{
					bool=(Token)match(input,TypeBoolean,FOLLOW_TypeBoolean_in_primitiveTypes1707); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeBoolean.add(bool);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 336:23: -> TypeBool[$bool,\"bool\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(TypeBool, bool, "bool")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: TypeInt
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeInt113=(Token)match(input,TypeInt,FOLLOW_TypeInt_in_primitiveTypes1717); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeInt113_tree = 
					(CommonTree)adaptor.create(TypeInt113)
					;
					adaptor.addChild(root_0, TypeInt113_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: TypeFloat
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeFloat114=(Token)match(input,TypeFloat,FOLLOW_TypeFloat_in_primitiveTypes1722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeFloat114_tree = 
					(CommonTree)adaptor.create(TypeFloat114)
					;
					adaptor.addChild(root_0, TypeFloat114_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: TypeString
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeString115=(Token)match(input,TypeString,FOLLOW_TypeString_in_primitiveTypes1727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeString115_tree = 
					(CommonTree)adaptor.create(TypeString115)
					;
					adaptor.addChild(root_0, TypeString115_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray117=null;
		ParserRuleReturnScope primitiveTypes116 =null;

		CommonTree TypeArray117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:2: ( primitiveTypes | TypeArray )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= TypeBool && LA41_0 <= TypeInt)||LA41_0==TypeString) ) {
				alt41=1;
			}
			else if ( (LA41_0==TypeArray) ) {
				alt41=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1739);
					primitiveTypes116=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray117=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray117_tree = 
					(CommonTree)adaptor.create(TypeArray117)
					;
					adaptor.addChild(root_0, TypeArray117_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource119=null;
		ParserRuleReturnScope primitiveTypesInclArray118 =null;

		CommonTree TypeResource119_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:2: ( primitiveTypesInclArray | TypeResource )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( ((LA42_0 >= TypeArray && LA42_0 <= TypeInt)||LA42_0==TypeString) ) {
				alt42=1;
			}
			else if ( (LA42_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1756);
					primitiveTypesInclArray118=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray118.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource119=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1761); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource119_tree = 
					(CommonTree)adaptor.create(TypeResource119)
					;
					adaptor.addChild(root_0, TypeResource119_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:1: classInterfaceTypeWithoutObject : (start= '\\\\' )? id= Identifier ( '\\\\' subId= Identifier )* -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $start)? $id ( $subId)* ) ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token start=null;
		Token id=null;
		Token subId=null;
		Token char_literal120=null;

		CommonTree start_tree=null;
		CommonTree id_tree=null;
		CommonTree subId_tree=null;
		CommonTree char_literal120_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:2: ( (start= '\\\\' )? id= Identifier ( '\\\\' subId= Identifier )* -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $start)? $id ( $subId)* ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:4: (start= '\\\\' )? id= Identifier ( '\\\\' subId= Identifier )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:9: (start= '\\\\' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:9: start= '\\\\'
					{
					start=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(start);

					}
					break;

			}

			id=(Token)match(input,Identifier,FOLLOW_Identifier_in_classInterfaceTypeWithoutObject1779); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(id);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:30: ( '\\\\' subId= Identifier )*
			loop44:
			do {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==Backslash) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:31: '\\\\' subId= Identifier
					{
					char_literal120=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1782); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal120);

					subId=(Token)match(input,Identifier,FOLLOW_Identifier_in_classInterfaceTypeWithoutObject1786); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(subId);

					}
					break;

				default :
					break loop44;
				}
			} while (true);

			// AST REWRITE
			// elements: subId, id, start
			// token labels: id, start, subId
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
			RewriteRuleTokenStream stream_subId=new RewriteRuleTokenStream(adaptor,"token subId",subId);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 353:55: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $start)? $id ( $subId)* )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:59: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $start)? $id ( $subId)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:146: ( $start)?
				if ( stream_start.hasNext() ) {
					adaptor.addChild(root_1, stream_start.nextNode());

				}
				stream_start.reset();

				adaptor.addChild(root_1, stream_id.nextNode());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:158: ( $subId)*
				while ( stream_subId.hasNext() ) {
					adaptor.addChild(root_1, stream_subId.nextNode());

				}
				stream_subId.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject121=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject122 =null;

		CommonTree TypeObject121_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==TypeObject) ) {
				alt45=1;
			}
			else if ( (LA45_0==Backslash||LA45_0==Identifier) ) {
				alt45=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject121=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1819); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject121_tree = 
					(CommonTree)adaptor.create(TypeObject121)
					;
					adaptor.addChild(root_0, TypeObject121_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1825);
					classInterfaceTypeWithoutObject122=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject122.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal124=null;
		Token char_literal127=null;
		Token char_literal131=null;
		Token char_literal132=null;
		ParserRuleReturnScope paramDeclarationOptional123 =null;
		ParserRuleReturnScope paramDeclarationOptional125 =null;
		ParserRuleReturnScope paramDeclaration126 =null;
		ParserRuleReturnScope paramDeclaration128 =null;
		ParserRuleReturnScope paramDeclaration129 =null;
		ParserRuleReturnScope paramDeclaration130 =null;
		ParserRuleReturnScope paramDeclarationOptional133 =null;

		CommonTree char_literal124_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree char_literal131_tree=null;
		CommonTree char_literal132_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt50=3;
			alt50 = dfa50.predict(input);
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1837);
					paramDeclarationOptional123=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional123.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:29: ( ',' paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:30: ',' paramDeclarationOptional
							{
							char_literal124=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1840); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal124_tree = 
							(CommonTree)adaptor.create(char_literal124)
							;
							adaptor.addChild(root_0, char_literal124_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1842);
							paramDeclarationOptional125=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional125.getTree());

							}
							break;

						default :
							break loop46;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: paramDeclaration ( ',' paramDeclaration )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1849);
					paramDeclaration126=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration126.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:21: ( ',' paramDeclaration )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:22: ',' paramDeclaration
							{
							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1852); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal127_tree = 
							(CommonTree)adaptor.create(char_literal127)
							;
							adaptor.addChild(root_0, char_literal127_tree);
							}

							pushFollow(FOLLOW_paramDeclaration_in_paramList1854);
							paramDeclaration128=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration128.getTree());

							}
							break;

						default :
							break loop47;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1861);
					paramDeclaration129=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration129.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:21: ( paramDeclaration ',' )*
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Identifier||(LA48_0 >= TypeArray && LA48_0 <= TypeString)) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1864);
							paramDeclaration130=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration130.getTree());

							char_literal131=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1866); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal131_tree = 
							(CommonTree)adaptor.create(char_literal131)
							;
							adaptor.addChild(root_0, char_literal131_tree);
							}

							}
							break;

						default :
							break loop48;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:45: ( ',' paramDeclarationOptional )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:46: ',' paramDeclarationOptional
							{
							char_literal132=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1871); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal132_tree = 
							(CommonTree)adaptor.create(char_literal132)
							;
							adaptor.addChild(root_0, char_literal132_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1873);
							paramDeclarationOptional133=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional133.getTree());

							}
							break;

						default :
							if ( cnt49 >= 1 ) break loop49;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(49, input);
								throw eee;
						}
						cnt49++;
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:1: paramDeclaration : allTypes VariableId ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId135=null;
		ParserRuleReturnScope allTypes134 =null;

		CommonTree VariableId135_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: allTypes VariableId
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_paramDeclaration1887);
			allTypes134=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes134.getTree());

			VariableId135=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1889); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId135_tree = 
			(CommonTree)adaptor.create(VariableId135)
			;
			adaptor.addChild(root_0, VariableId135_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, paramDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclaration"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal137=null;
		ParserRuleReturnScope paramDeclaration136 =null;
		ParserRuleReturnScope unaryPrimitiveAtom138 =null;

		CommonTree char_literal137_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1899);
			paramDeclaration136=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration136.getTree());

			char_literal137=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1902); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal137_tree = 
			(CommonTree)adaptor.create(char_literal137)
			;
			adaptor.addChild(root_0, char_literal137_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1904);
			unaryPrimitiveAtom138=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom138.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal140=null;
		ParserRuleReturnScope instructionWithoutBreakContinue139 =null;
		ParserRuleReturnScope instruction141 =null;

		CommonTree block_tree=null;
		CommonTree char_literal140_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:2: (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LeftCurlyBrace) ) {
				alt52=1;
			}
			else if ( (LA52_0==Backslash||LA52_0==Do||LA52_0==Echo||LA52_0==Exit||(LA52_0 >= For && LA52_0 <= Foreach)||(LA52_0 >= Identifier && LA52_0 <= If)||LA52_0==MinusMinus||LA52_0==Parent||LA52_0==PlusPlus||LA52_0==Return||LA52_0==Self||(LA52_0 >= Switch && LA52_0 <= TypeString)||LA52_0==VariableId||LA52_0==While) ) {
				alt52=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: block= '{' ( instructionWithoutBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: ( instructionWithoutBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1932);
							instructionWithoutBreakContinue139=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue139.getTree());
							}
							break;

						default :
							if ( cnt51 >= 1 ) break loop51;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(51, input);
								throw eee;
						}
						cnt51++;
					} while (true);

					char_literal140=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1936); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal140);

					// AST REWRITE
					// elements: instructionWithoutBreakContinue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 377:54: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:57: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						if ( !(stream_instructionWithoutBreakContinue.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_instructionWithoutBreakContinue.hasNext() ) {
							adaptor.addChild(root_1, stream_instructionWithoutBreakContinue.nextTree());

						}
						stream_instructionWithoutBreakContinue.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1951);
					instruction141=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction141.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal143=null;
		Token set145=null;
		Token Int146=null;
		Token char_literal147=null;
		ParserRuleReturnScope instructionInclBreakContinue142 =null;
		ParserRuleReturnScope instruction144 =null;

		CommonTree block_tree=null;
		CommonTree char_literal143_tree=null;
		CommonTree set145_tree=null;
		CommonTree Int146_tree=null;
		CommonTree char_literal147_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:2: (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:4: block= '{' ( instructionInclBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1967); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:17: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1969);
							instructionInclBreakContinue142=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue142.getTree());
							}
							break;

						default :
							if ( cnt53 >= 1 ) break loop53;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(53, input);
								throw eee;
						}
						cnt53++;
					} while (true);

					char_literal143=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1973); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal143);

					// AST REWRITE
					// elements: instructionInclBreakContinue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 382:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						if ( !(stream_instructionInclBreakContinue.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_instructionInclBreakContinue.hasNext() ) {
							adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

						}
						stream_instructionInclBreakContinue.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1988);
					instruction144=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction144.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set145=(Token)input.LT(1);
					set145=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set145)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:26: ( Int )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==Int) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:26: Int
							{
							Int146=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2000); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int146_tree = 
							(CommonTree)adaptor.create(Int146)
							;
							adaptor.addChild(root_0, Int146_tree);
							}

							}
							break;

					}

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2003); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' !| methodCallFluentWithoutAccessAtTheEnd ';' !| 'return' ( expression )? ';' !| 'echo' ^ expression ( ',' ! expression )* ';' !| 'exit' ';' !);
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal149=null;
		Token char_literal151=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token string_literal164=null;
		Token char_literal166=null;
		Token string_literal167=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token string_literal172=null;
		Token char_literal173=null;
		ParserRuleReturnScope variableAssignment148 =null;
		ParserRuleReturnScope variableDeclaration150 =null;
		ParserRuleReturnScope ifCondition152 =null;
		ParserRuleReturnScope switchCondition153 =null;
		ParserRuleReturnScope forLoop154 =null;
		ParserRuleReturnScope foreachLoop155 =null;
		ParserRuleReturnScope whileLoop156 =null;
		ParserRuleReturnScope doWhileLoop157 =null;
		ParserRuleReturnScope tryCatch158 =null;
		ParserRuleReturnScope throwException159 =null;
		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd160 =null;
		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd162 =null;
		ParserRuleReturnScope expression165 =null;
		ParserRuleReturnScope expression168 =null;
		ParserRuleReturnScope expression170 =null;

		CommonTree char_literal149_tree=null;
		CommonTree char_literal151_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree char_literal163_tree=null;
		CommonTree string_literal164_tree=null;
		CommonTree char_literal166_tree=null;
		CommonTree string_literal167_tree=null;
		CommonTree char_literal169_tree=null;
		CommonTree char_literal171_tree=null;
		CommonTree string_literal172_tree=null;
		CommonTree char_literal173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' !| methodCallFluentWithoutAccessAtTheEnd ';' !| 'return' ( expression )? ';' !| 'echo' ^ expression ( ',' ! expression )* ';' !| 'exit' ';' !)
			int alt58=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA58_1 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Self:
				{
				int LA58_2 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA58_3 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA58_4 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred71_TSPHP()) ) {
					alt58=2;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt58=11;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA58_5 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred71_TSPHP()) ) {
					alt58=2;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt58=11;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA58_6 = input.LA(2);
				if ( (synpred70_TSPHP()) ) {
					alt58=1;
				}
				else if ( (synpred81_TSPHP()) ) {
					alt58=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 6, input);
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
				alt58=1;
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
				alt58=2;
				}
				break;
			case If:
				{
				alt58=3;
				}
				break;
			case Switch:
				{
				alt58=4;
				}
				break;
			case For:
				{
				alt58=5;
				}
				break;
			case Foreach:
				{
				alt58=6;
				}
				break;
			case While:
				{
				alt58=7;
				}
				break;
			case Do:
				{
				alt58=8;
				}
				break;
			case Try:
				{
				alt58=9;
				}
				break;
			case Throw:
				{
				alt58=10;
				}
				break;
			case Return:
				{
				alt58=13;
				}
				break;
			case Echo:
				{
				alt58=14;
				}
				break;
			case Exit:
				{
				alt58=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2016);
					variableAssignment148=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment148.getTree());

					char_literal149=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2018); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2024);
					variableDeclaration150=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration150.getTree());

					char_literal151=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2026); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2032);
					ifCondition152=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition152.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2037);
					switchCondition153=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition153.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2042);
					forLoop154=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop154.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2047);
					foreachLoop155=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop155.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2052);
					whileLoop156=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop156.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2057);
					doWhileLoop157=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop157.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2062);
					tryCatch158=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch158.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2067);
					throwException159=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException159.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: functionCallFluentWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction2072);
					functionCallFluentWithoutAccessAtTheEnd160=functionCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd160.getTree());

					char_literal161=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2074); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: methodCallFluentWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction2080);
					methodCallFluentWithoutAccessAtTheEnd162=methodCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd162.getTree());

					char_literal163=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2082); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: 'return' ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal164=(Token)match(input,Return,FOLLOW_Return_in_instruction2089); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal164_tree = 
					(CommonTree)adaptor.create(string_literal164)
					;
					adaptor.addChild(root_0, string_literal164_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:13: ( expression )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==At||LA56_0==Backslash||LA56_0==BitwiseNot||LA56_0==Bool||LA56_0==Clone||LA56_0==Float||LA56_0==Identifier||LA56_0==Int||(LA56_0 >= LeftParanthesis && LA56_0 <= LeftSquareBrace)||LA56_0==LogicNot||LA56_0==Minus||LA56_0==MinusMinus||LA56_0==New||LA56_0==Null||(LA56_0 >= Parent && LA56_0 <= Plus)||LA56_0==PlusPlus||LA56_0==Self||LA56_0==String||LA56_0==This||LA56_0==TypeArray||LA56_0==VariableId) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2091);
							expression165=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression165.getTree());

							}
							break;

					}

					char_literal166=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2094); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:4: 'echo' ^ expression ( ',' ! expression )* ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal167=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal167_tree = 
					(CommonTree)adaptor.create(string_literal167)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal167_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_instruction2103);
					expression168=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:23: ( ',' ! expression )*
					loop57:
					do {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==Comma) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:24: ',' ! expression
							{
							char_literal169=(Token)match(input,Comma,FOLLOW_Comma_in_instruction2106); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_instruction2109);
							expression170=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

							}
							break;

						default :
							break loop57;
						}
					} while (true);

					char_literal171=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2113); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal172=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal172_tree = 
					(CommonTree)adaptor.create(string_literal172)
					;
					adaptor.addChild(root_0, string_literal172_tree);
					}

					char_literal173=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2121); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:1: expressionList : ( expression ( ',' expression )* -> ^( EXPRESSION_LIST ( expression )+ ) | -> EXPRESSION_LIST );
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal175=null;
		ParserRuleReturnScope expression174 =null;
		ParserRuleReturnScope expression176 =null;

		CommonTree char_literal175_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:2: ( expression ( ',' expression )* -> ^( EXPRESSION_LIST ( expression )+ ) | -> EXPRESSION_LIST )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==At||LA60_0==Backslash||LA60_0==BitwiseNot||LA60_0==Bool||LA60_0==Clone||LA60_0==Float||LA60_0==Identifier||LA60_0==Int||(LA60_0 >= LeftParanthesis && LA60_0 <= LeftSquareBrace)||LA60_0==LogicNot||LA60_0==Minus||LA60_0==MinusMinus||LA60_0==New||LA60_0==Null||(LA60_0 >= Parent && LA60_0 <= Plus)||LA60_0==PlusPlus||LA60_0==Self||LA60_0==String||LA60_0==This||LA60_0==TypeArray||LA60_0==VariableId) ) {
				alt60=1;
			}
			else if ( (LA60_0==RightParanthesis||LA60_0==Semicolon) ) {
				alt60=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:4: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_expressionList2134);
					expression174=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression174.getTree());
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:15: ( ',' expression )*
					loop59:
					do {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==Comma) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:16: ',' expression
							{
							char_literal175=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2137); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(char_literal175);

							pushFollow(FOLLOW_expression_in_expressionList2139);
							expression176=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression176.getTree());
							}
							break;

						default :
							break loop59;
						}
					} while (true);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 406:33: -> ^( EXPRESSION_LIST ( expression )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:36: ^( EXPRESSION_LIST ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST")
						, root_1);

						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());

						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 407:4: -> EXPRESSION_LIST
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST")
						);

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:1: variableAssignment : ( VariableId assignmentOperator ^ expression | incrementDecrement );
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId177=null;
		ParserRuleReturnScope assignmentOperator178 =null;
		ParserRuleReturnScope expression179 =null;
		ParserRuleReturnScope incrementDecrement180 =null;

		CommonTree VariableId177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:2: ( VariableId assignmentOperator ^ expression | incrementDecrement )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==VariableId) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==Assign||LA61_1==BitwiseAndEqual||LA61_1==BitwiseOrEqual||LA61_1==BitwiseXorEqual||LA61_1==DivideEqual||LA61_1==DotEqual||LA61_1==MinusEqual||LA61_1==ModuloEqual||LA61_1==MultiplyEqual||LA61_1==PlusEqual||LA61_1==ShiftLeftEqual||LA61_1==ShiftRightEqual) ) {
					alt61=1;
				}
				else if ( (LA61_1==LeftSquareBrace||LA61_1==MinusMinus||LA61_1==ObjectOperator||LA61_1==PlusPlus) ) {
					alt61=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA61_0==Backslash||LA61_0==Identifier||LA61_0==MinusMinus||LA61_0==Parent||LA61_0==PlusPlus||LA61_0==Self||LA61_0==This) ) {
				alt61=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:4: VariableId assignmentOperator ^ expression
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId177=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2168); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId177_tree = 
					(CommonTree)adaptor.create(VariableId177)
					;
					adaptor.addChild(root_0, VariableId177_tree);
					}

					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2170);
					assignmentOperator178=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator178.getTree(), root_0);
					pushFollow(FOLLOW_expression_in_variableAssignment2173);
					expression179=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression179.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_variableAssignment2178);
					incrementDecrement180=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement180.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement181 =null;
		ParserRuleReturnScope preIncrementDecrement182 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==Backslash||LA62_0==Identifier||LA62_0==Parent||LA62_0==Self||LA62_0==This||LA62_0==VariableId) ) {
				alt62=1;
			}
			else if ( (LA62_0==MinusMinus||LA62_0==PlusPlus) ) {
				alt62=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2190);
					postIncrementDecrement181=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement181.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2195);
					preIncrementDecrement182=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement182.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set183=null;

		CommonTree set183_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set183=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set183)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:1: postIncrementDecrement : variableMemberStaticMember plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope variableMemberStaticMember184 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus185 =null;

		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:2: ( variableMemberStaticMember plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:4: variableMemberStaticMember plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2274);
			variableMemberStaticMember184=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember184.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2276);
			plusPlusOrMinusMinus185=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus185.getTree());
			// AST REWRITE
			// elements: plusPlusOrMinusMinus, variableMemberStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 436:52: -> ^( POST_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:55: ^( POST_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, "POST_INCREMENT_DECREMENT")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_variableMemberStaticMember.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class plusPlusOrMinusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plusPlusOrMinusMinus"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set186=null;

		CommonTree set186_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:2: ( '++' | '--' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set186=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set186)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, plusPlusOrMinusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "plusPlusOrMinusMinus"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:1: preIncrementDecrement : plusPlusOrMinusMinus variableMemberStaticMember -> ^( PRE_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus187 =null;
		ParserRuleReturnScope variableMemberStaticMember188 =null;

		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:2: ( plusPlusOrMinusMinus variableMemberStaticMember -> ^( PRE_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:4: plusPlusOrMinusMinus variableMemberStaticMember
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2315);
			plusPlusOrMinusMinus187=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus187.getTree());
			pushFollow(FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2317);
			variableMemberStaticMember188=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember188.getTree());
			// AST REWRITE
			// elements: plusPlusOrMinusMinus, variableMemberStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 445:52: -> ^( PRE_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:55: ^( PRE_INCREMENT_DECREMENT plusPlusOrMinusMinus variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, "PRE_INCREMENT_DECREMENT")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_variableMemberStaticMember.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId190=null;
		Token char_literal191=null;
		ParserRuleReturnScope allTypes189 =null;
		ParserRuleReturnScope expression192 =null;

		CommonTree VariableId190_tree=null;
		CommonTree char_literal191_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:5: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2342);
			allTypes189=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes189.getTree());
			VariableId190=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2344); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId190);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:25: ( '=' expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==Assign) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:26: '=' expression
					{
					char_literal191=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal191);

					pushFollow(FOLLOW_expression_in_variableDeclaration2349);
					expression192=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression192.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, VariableId, allTypes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 450:43: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:46: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes189!=null?((Token)allTypes189.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:129: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());

				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak193 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2375);
			logicOrWeak193=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak193.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionForTest_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionForTest"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:1: expressionForTest : expression ';' !;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal195=null;
		ParserRuleReturnScope expression194 =null;

		CommonTree char_literal195_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:2: ( expression ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2384);
			expression194=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());

			char_literal195=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2386); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, expressionForTest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionForTest"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal197=null;
		ParserRuleReturnScope logicXorWeak196 =null;
		ParserRuleReturnScope logicXorWeak198 =null;

		CommonTree string_literal197_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2396);
			logicXorWeak196=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak196.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:17: ( 'or' ^ logicXorWeak )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOrWeak) ) {
					int LA64_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt64=1;
					}

				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:18: 'or' ^ logicXorWeak
					{
					string_literal197=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2399); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal197_tree = 
					(CommonTree)adaptor.create(string_literal197)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal197_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2402);
					logicXorWeak198=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak198.getTree());

					}
					break;

				default :
					break loop64;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal200=null;
		ParserRuleReturnScope logicAndWeak199 =null;
		ParserRuleReturnScope logicAndWeak201 =null;

		CommonTree string_literal200_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2415);
			logicAndWeak199=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak199.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:17: ( 'xor' ^ logicAndWeak )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicXorWeak) ) {
					int LA65_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt65=1;
					}

				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:18: 'xor' ^ logicAndWeak
					{
					string_literal200=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2418); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal200_tree = 
					(CommonTree)adaptor.create(string_literal200)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal200_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2421);
					logicAndWeak201=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak201.getTree());

					}
					break;

				default :
					break loop65;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal203=null;
		ParserRuleReturnScope assignment202 =null;
		ParserRuleReturnScope assignment204 =null;

		CommonTree string_literal203_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2434);
			assignment202=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment202.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:15: ( 'and' ^ assignment )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicAndWeak) ) {
					int LA66_2 = input.LA(2);
					if ( (synpred105_TSPHP()) ) {
						alt66=1;
					}

				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:16: 'and' ^ assignment
					{
					string_literal203=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2437); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = 
					(CommonTree)adaptor.create(string_literal203)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal203_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2440);
					assignment204=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment204.getTree());

					}
					break;

				default :
					break loop66;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary205 =null;
		ParserRuleReturnScope assignmentOperator206 =null;
		ParserRuleReturnScope ternary207 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2451);
			ternary205=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary205.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:12: ( assignmentOperator ^ ternary )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==Assign||LA67_0==BitwiseAndEqual||LA67_0==BitwiseOrEqual||LA67_0==BitwiseXorEqual||LA67_0==DivideEqual||LA67_0==DotEqual||LA67_0==MinusEqual||LA67_0==ModuloEqual||LA67_0==MultiplyEqual||LA67_0==PlusEqual||LA67_0==ShiftLeftEqual||LA67_0==ShiftRightEqual) ) {
					int LA67_2 = input.LA(2);
					if ( (synpred106_TSPHP()) ) {
						alt67=1;
					}

				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2454);
					assignmentOperator206=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator206.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2457);
					ternary207=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary207.getTree());

					}
					break;

				default :
					break loop67;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal209=null;
		Token char_literal211=null;
		ParserRuleReturnScope logicOr208 =null;
		ParserRuleReturnScope expression210 =null;
		ParserRuleReturnScope expression212 =null;

		CommonTree char_literal209_tree=null;
		CommonTree char_literal211_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2467);
			logicOr208=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr208.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:19: ( '?' ^ expression ':' ! expression )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==QuestionMark) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:20: '?' ^ expression ':' ! expression
					{
					char_literal209=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2470); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal209_tree = 
					(CommonTree)adaptor.create(char_literal209)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal209_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2473);
					expression210=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());

					char_literal211=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2475); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2478);
					expression212=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression212.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal214=null;
		ParserRuleReturnScope logicAnd213 =null;
		ParserRuleReturnScope logicAnd215 =null;

		CommonTree string_literal214_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2488);
			logicAnd213=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd213.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:20: ( '||' ^ logicAnd )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==LogicOr) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:21: '||' ^ logicAnd
					{
					string_literal214=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2491); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal214_tree = 
					(CommonTree)adaptor.create(string_literal214)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal214_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2494);
					logicAnd215=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd215.getTree());

					}
					break;

				default :
					break loop69;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal217=null;
		ParserRuleReturnScope bitwiseOr216 =null;
		ParserRuleReturnScope bitwiseOr218 =null;

		CommonTree string_literal217_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2503);
			bitwiseOr216=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr216.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:21: ( '&&' ^ bitwiseOr )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==LogicAnd) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:474:22: '&&' ^ bitwiseOr
					{
					string_literal217=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2506); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal217_tree = 
					(CommonTree)adaptor.create(string_literal217)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal217_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2509);
					bitwiseOr218=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr218.getTree());

					}
					break;

				default :
					break loop70;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal220=null;
		ParserRuleReturnScope bitwiseXor219 =null;
		ParserRuleReturnScope bitwiseXor221 =null;

		CommonTree char_literal220_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2520);
			bitwiseXor219=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor219.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:15: ( '|' ^ bitwiseXor )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==BitwiseOr) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:16: '|' ^ bitwiseXor
					{
					char_literal220=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2523); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal220_tree = 
					(CommonTree)adaptor.create(char_literal220)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal220_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2526);
					bitwiseXor221=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor221.getTree());

					}
					break;

				default :
					break loop71;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal223=null;
		ParserRuleReturnScope bitwiseAnd222 =null;
		ParserRuleReturnScope bitwiseAnd224 =null;

		CommonTree char_literal223_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2537);
			bitwiseAnd222=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd222.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:15: ( '^' ^ bitwiseAnd )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==BitwiseXor) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:16: '^' ^ bitwiseAnd
					{
					char_literal223=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2540); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal223_tree = 
					(CommonTree)adaptor.create(char_literal223)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal223_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2543);
					bitwiseAnd224=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd224.getTree());

					}
					break;

				default :
					break loop72;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal226=null;
		ParserRuleReturnScope equality225 =null;
		ParserRuleReturnScope equality227 =null;

		CommonTree char_literal226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2554);
			equality225=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality225.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:13: ( '&' ^ equality )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==BitwiseAnd) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:14: '&' ^ equality
					{
					char_literal226=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2557); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal226_tree = 
					(CommonTree)adaptor.create(char_literal226)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal226_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2560);
					equality227=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality227.getTree());

					}
					break;

				default :
					break loop73;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison228 =null;
		ParserRuleReturnScope equalityOperator229 =null;
		ParserRuleReturnScope comparison230 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2569);
			comparison228=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison228.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:22: ( equalityOperator ^ comparison )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==Equal||LA74_0==Identical||(LA74_0 >= NotEqual && LA74_0 <= NotIdentical)) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2572);
					equalityOperator229=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator229.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2575);
					comparison230=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison230.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set231=null;

		CommonTree set231_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set231=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set231)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift232 =null;
		ParserRuleReturnScope comparisonOperator233 =null;
		ParserRuleReturnScope bitwiseShift234 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2617);
			bitwiseShift232=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift232.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:17: ( comparisonOperator ^ bitwiseShift )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( ((LA75_0 >= GreaterEqualThan && LA75_0 <= GreaterThan)||(LA75_0 >= LessEqualThan && LA75_0 <= LessThan)) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2620);
					comparisonOperator233=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator233.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2623);
					bitwiseShift234=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift234.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set235=null;

		CommonTree set235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set235=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set235)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set237=null;
		ParserRuleReturnScope termOrStringConcatenation236 =null;
		ParserRuleReturnScope termOrStringConcatenation238 =null;

		CommonTree set237_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2659);
			termOrStringConcatenation236=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation236.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop76:
			do {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==ShiftLeft||LA76_0==ShiftRight) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set237=(Token)input.LT(1);
					set237=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set237)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2669);
					termOrStringConcatenation238=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation238.getTree());

					}
					break;

				default :
					break loop76;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set240=null;
		ParserRuleReturnScope factor239 =null;
		ParserRuleReturnScope factor241 =null;

		CommonTree set240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2679);
			factor239=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor239.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop77:
			do {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==Dot||LA77_0==Minus||LA77_0==Plus) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:37: ( '+' | '-' | '.' ) ^ factor
					{
					set240=(Token)input.LT(1);
					set240=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set240)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2691);
					factor241=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor241.getTree());

					}
					break;

				default :
					break loop77;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set243=null;
		ParserRuleReturnScope logicNot242 =null;
		ParserRuleReturnScope logicNot244 =null;

		CommonTree set243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2701);
			logicNot242=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot242.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop78:
			do {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==Divide||LA78_0==Modulo||LA78_0==Multiply) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set243=(Token)input.LT(1);
					set243=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set243)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2713);
					logicNot244=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot244.getTree());

					}
					break;

				default :
					break loop78;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal245=null;
		ParserRuleReturnScope logicNot246 =null;
		ParserRuleReturnScope instanceOf247 =null;

		CommonTree char_literal245_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:9: ( '!' ^ logicNot | instanceOf )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LogicNot) ) {
				alt79=1;
			}
			else if ( (LA79_0==At||LA79_0==Backslash||LA79_0==BitwiseNot||LA79_0==Bool||LA79_0==Clone||LA79_0==Float||LA79_0==Identifier||LA79_0==Int||(LA79_0 >= LeftParanthesis && LA79_0 <= LeftSquareBrace)||LA79_0==Minus||LA79_0==MinusMinus||LA79_0==New||LA79_0==Null||(LA79_0 >= Parent && LA79_0 <= Plus)||LA79_0==PlusPlus||LA79_0==Self||LA79_0==String||LA79_0==This||LA79_0==TypeArray||LA79_0==VariableId) ) {
				alt79=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal245=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal245_tree = 
					(CommonTree)adaptor.create(char_literal245)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal245_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2725);
					logicNot246=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot246.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2730);
					instanceOf247=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf247.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal249=null;
		Token VariableId251=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt248 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject250 =null;

		CommonTree string_literal249_tree=null;
		CommonTree VariableId251_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2741);
			castOrBitwiseNotOrAt248=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt248.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==Instanceof) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal249=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal249_tree = 
					(CommonTree)adaptor.create(string_literal249)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal249_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==Backslash||LA80_0==Identifier) ) {
						alt80=1;
					}
					else if ( (LA80_0==VariableId) ) {
						alt80=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 80, 0, input);
						throw nvae;
					}
					switch (alt80) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2748);
							classInterfaceTypeWithoutObject250=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject250.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:73: VariableId
							{
							VariableId251=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2750); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId251_tree = 
							(CommonTree)adaptor.create(VariableId251)
							;
							adaptor.addChild(root_0, VariableId251_tree);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal253=null;
		Token char_literal255=null;
		Token char_literal257=null;
		ParserRuleReturnScope allTypesWithoutResource252 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt254 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt256 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt258 =null;
		ParserRuleReturnScope newOrClone259 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal253_tree=null;
		CommonTree char_literal255_tree=null;
		CommonTree char_literal257_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");
		RewriteRuleSubtreeStream stream_allTypesWithoutResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutResource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:2: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone )
			int alt82=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA82_1 = input.LA(2);
				if ( (synpred133_TSPHP()) ) {
					alt82=1;
				}
				else if ( (true) ) {
					alt82=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt82=2;
				}
				break;
			case At:
				{
				alt82=3;
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
				alt82=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2768);
					allTypesWithoutResource252=allTypesWithoutResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(allTypesWithoutResource252.getTree());
					char_literal253=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2770); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal253);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2772);
					castOrBitwiseNotOrAt254=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt254.getTree());
					// AST REWRITE
					// elements: castOrBitwiseNotOrAt, allTypesWithoutResource
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 519:64: -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:67: ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(CAST, cast, "cast")
						, root_1);

						adaptor.addChild(root_1, stream_allTypesWithoutResource.nextTree());

						adaptor.addChild(root_1, stream_castOrBitwiseNotOrAt.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal255=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal255_tree = 
					(CommonTree)adaptor.create(char_literal255)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal255_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2791);
					castOrBitwiseNotOrAt256=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt256.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal257=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2796); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal257_tree = 
					(CommonTree)adaptor.create(char_literal257)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal257_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2799);
					castOrBitwiseNotOrAt258=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt258.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: newOrClone
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2805);
					newOrClone259=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone259.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class newOrClone_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:1: newOrClone : ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary );
	public final TSPHPParser.newOrClone_return newOrClone() throws RecognitionException {
		TSPHPParser.newOrClone_return retval = new TSPHPParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal260=null;
		ParserRuleReturnScope variableMemberStaticMember261 =null;
		ParserRuleReturnScope newObject262 =null;
		ParserRuleReturnScope unaryPrimary263 =null;

		CommonTree string_literal260_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:2: ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary )
			int alt83=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt83=1;
				}
				break;
			case New:
				{
				alt83=2;
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
				alt83=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: 'clone' ^ variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal260=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone2816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal260_tree = 
					(CommonTree)adaptor.create(string_literal260)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal260_tree, root_0);
					}

					pushFollow(FOLLOW_variableMemberStaticMember_in_newOrClone2819);
					variableMemberStaticMember261=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember261.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_newOrClone2824);
					newObject262=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject262.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_newOrClone2829);
					unaryPrimary263=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary263.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, newOrClone_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newOrClone"


	public static class variableMemberStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableMemberStaticMember"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:1: variableMemberStaticMember : ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId );
	public final TSPHPParser.variableMemberStaticMember_return variableMemberStaticMember() throws RecognitionException {
		TSPHPParser.variableMemberStaticMember_return retval = new TSPHPParser.variableMemberStaticMember_return();
		retval.start = input.LT(1);
		int variableMemberStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId265=null;
		Token string_literal267=null;
		Token VariableId269=null;
		Token string_literal271=null;
		Token VariableId272=null;
		ParserRuleReturnScope staticAccessOrParent264 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess266 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess268 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess270 =null;

		CommonTree VariableId265_tree=null;
		CommonTree string_literal267_tree=null;
		CommonTree VariableId269_tree=null;
		CommonTree string_literal271_tree=null;
		CommonTree VariableId272_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:2: ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId )
			int alt87=5;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt87=1;
				}
				break;
			case This:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA87_4 = input.LA(3);
					if ( (LA87_4==Identifier) ) {
						int LA87_10 = input.LA(4);
						if ( (LA87_10==LeftParanthesis) ) {
							alt87=4;
						}
						else if ( (LA87_10==EOF||(LA87_10 >= Arrow && LA87_10 <= Assign)||(LA87_10 >= BitwiseAnd && LA87_10 <= BitwiseAndEqual)||(LA87_10 >= BitwiseOr && LA87_10 <= BitwiseXorEqual)||(LA87_10 >= Colon && LA87_10 <= Comma)||(LA87_10 >= Divide && LA87_10 <= DivideEqual)||(LA87_10 >= Dot && LA87_10 <= DotEqual)||LA87_10==Equal||(LA87_10 >= GreaterEqualThan && LA87_10 <= GreaterThan)||LA87_10==Identical||LA87_10==Instanceof||(LA87_10 >= LeftSquareBrace && LA87_10 <= LogicAndWeak)||(LA87_10 >= LogicOr && LA87_10 <= MultiplyEqual)||(LA87_10 >= NotEqual && LA87_10 <= NotIdentical)||LA87_10==ObjectOperator||(LA87_10 >= Plus && LA87_10 <= PlusPlus)||LA87_10==QuestionMark||(LA87_10 >= RightParanthesis && LA87_10 <= RightSquareBrace)||(LA87_10 >= Semicolon && LA87_10 <= ShiftRightEqual)) ) {
							alt87=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 87, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA87_4==EOF) ) {
						alt87=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 87, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt87=2;
					}
					break;
				case EOF:
				case Arrow:
				case As:
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
					alt87=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 87, 2, input);
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
					int LA87_7 = input.LA(3);
					if ( (LA87_7==Identifier) ) {
						int LA87_11 = input.LA(4);
						if ( (LA87_11==LeftParanthesis) ) {
							alt87=5;
						}
						else if ( (LA87_11==EOF||(LA87_11 >= Arrow && LA87_11 <= Assign)||(LA87_11 >= BitwiseAnd && LA87_11 <= BitwiseAndEqual)||(LA87_11 >= BitwiseOr && LA87_11 <= BitwiseXorEqual)||(LA87_11 >= Colon && LA87_11 <= Comma)||(LA87_11 >= Divide && LA87_11 <= DivideEqual)||(LA87_11 >= Dot && LA87_11 <= DotEqual)||LA87_11==Equal||(LA87_11 >= GreaterEqualThan && LA87_11 <= GreaterThan)||LA87_11==Identical||LA87_11==Instanceof||(LA87_11 >= LeftSquareBrace && LA87_11 <= LogicAndWeak)||(LA87_11 >= LogicOr && LA87_11 <= MultiplyEqual)||(LA87_11 >= NotEqual && LA87_11 <= NotIdentical)||LA87_11==ObjectOperator||(LA87_11 >= Plus && LA87_11 <= PlusPlus)||LA87_11==QuestionMark||(LA87_11 >= RightParanthesis && LA87_11 <= RightSquareBrace)||(LA87_11 >= Semicolon && LA87_11 <= ShiftRightEqual)) ) {
							alt87=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 87, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA87_7==EOF) ) {
						alt87=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 87, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt87=3;
					}
					break;
				case EOF:
				case Arrow:
				case As:
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
					alt87=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 87, 3, input);
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
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:4: staticAccessOrParent VariableId ( memberAccessOrArrayAccess )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2842);
					staticAccessOrParent264=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent264.getTree());

					VariableId265=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2844); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId265_tree = 
					(CommonTree)adaptor.create(VariableId265)
					;
					adaptor.addChild(root_0, VariableId265_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:36: ( memberAccessOrArrayAccess )*
					loop84:
					do {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==ObjectOperator) ) {
							int LA84_2 = input.LA(2);
							if ( (LA84_2==Identifier) ) {
								int LA84_4 = input.LA(3);
								if ( (LA84_4==EOF||(LA84_4 >= Arrow && LA84_4 <= Assign)||(LA84_4 >= BitwiseAnd && LA84_4 <= BitwiseAndEqual)||(LA84_4 >= BitwiseOr && LA84_4 <= BitwiseXorEqual)||(LA84_4 >= Colon && LA84_4 <= Comma)||(LA84_4 >= Divide && LA84_4 <= DivideEqual)||(LA84_4 >= Dot && LA84_4 <= DotEqual)||LA84_4==Equal||(LA84_4 >= GreaterEqualThan && LA84_4 <= GreaterThan)||LA84_4==Identical||LA84_4==Instanceof||(LA84_4 >= LeftSquareBrace && LA84_4 <= LogicAndWeak)||(LA84_4 >= LogicOr && LA84_4 <= MultiplyEqual)||(LA84_4 >= NotEqual && LA84_4 <= NotIdentical)||LA84_4==ObjectOperator||(LA84_4 >= Plus && LA84_4 <= PlusPlus)||LA84_4==QuestionMark||(LA84_4 >= RightParanthesis && LA84_4 <= RightSquareBrace)||(LA84_4 >= Semicolon && LA84_4 <= ShiftRightEqual)) ) {
									alt84=1;
								}

							}

						}
						else if ( (LA84_0==LeftSquareBrace) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:36: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2846);
							memberAccessOrArrayAccess266=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess266.getTree());

							}
							break;

						default :
							break loop84;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:4: '$this' ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal267=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2852); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal267_tree = 
					(CommonTree)adaptor.create(string_literal267)
					;
					adaptor.addChild(root_0, string_literal267_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:12: ( memberAccessOrArrayAccess )+
					int cnt85=0;
					loop85:
					do {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==ObjectOperator) ) {
							int LA85_2 = input.LA(2);
							if ( (LA85_2==Identifier) ) {
								int LA85_4 = input.LA(3);
								if ( (LA85_4==EOF||(LA85_4 >= Arrow && LA85_4 <= Assign)||(LA85_4 >= BitwiseAnd && LA85_4 <= BitwiseAndEqual)||(LA85_4 >= BitwiseOr && LA85_4 <= BitwiseXorEqual)||(LA85_4 >= Colon && LA85_4 <= Comma)||(LA85_4 >= Divide && LA85_4 <= DivideEqual)||(LA85_4 >= Dot && LA85_4 <= DotEqual)||LA85_4==Equal||(LA85_4 >= GreaterEqualThan && LA85_4 <= GreaterThan)||LA85_4==Identical||LA85_4==Instanceof||(LA85_4 >= LeftSquareBrace && LA85_4 <= LogicAndWeak)||(LA85_4 >= LogicOr && LA85_4 <= MultiplyEqual)||(LA85_4 >= NotEqual && LA85_4 <= NotIdentical)||LA85_4==ObjectOperator||(LA85_4 >= Plus && LA85_4 <= PlusPlus)||LA85_4==QuestionMark||(LA85_4 >= RightParanthesis && LA85_4 <= RightSquareBrace)||(LA85_4 >= Semicolon && LA85_4 <= ShiftRightEqual)) ) {
									alt85=1;
								}

							}

						}
						else if ( (LA85_0==LeftSquareBrace) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:12: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2854);
							memberAccessOrArrayAccess268=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess268.getTree());

							}
							break;

						default :
							if ( cnt85 >= 1 ) break loop85;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(85, input);
								throw eee;
						}
						cnt85++;
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:4: VariableId ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId269=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2860); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId269_tree = 
					(CommonTree)adaptor.create(VariableId269)
					;
					adaptor.addChild(root_0, VariableId269_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:15: ( memberAccessOrArrayAccess )+
					int cnt86=0;
					loop86:
					do {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==ObjectOperator) ) {
							int LA86_2 = input.LA(2);
							if ( (LA86_2==Identifier) ) {
								int LA86_4 = input.LA(3);
								if ( (LA86_4==EOF||(LA86_4 >= Arrow && LA86_4 <= Assign)||(LA86_4 >= BitwiseAnd && LA86_4 <= BitwiseAndEqual)||(LA86_4 >= BitwiseOr && LA86_4 <= BitwiseXorEqual)||(LA86_4 >= Colon && LA86_4 <= Comma)||(LA86_4 >= Divide && LA86_4 <= DivideEqual)||(LA86_4 >= Dot && LA86_4 <= DotEqual)||LA86_4==Equal||(LA86_4 >= GreaterEqualThan && LA86_4 <= GreaterThan)||LA86_4==Identical||LA86_4==Instanceof||(LA86_4 >= LeftSquareBrace && LA86_4 <= LogicAndWeak)||(LA86_4 >= LogicOr && LA86_4 <= MultiplyEqual)||(LA86_4 >= NotEqual && LA86_4 <= NotIdentical)||LA86_4==ObjectOperator||(LA86_4 >= Plus && LA86_4 <= PlusPlus)||LA86_4==QuestionMark||(LA86_4 >= RightParanthesis && LA86_4 <= RightSquareBrace)||(LA86_4 >= Semicolon && LA86_4 <= ShiftRightEqual)) ) {
									alt86=1;
								}

							}

						}
						else if ( (LA86_0==LeftSquareBrace) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:15: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2862);
							memberAccessOrArrayAccess270=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess270.getTree());

							}
							break;

						default :
							if ( cnt86 >= 1 ) break loop86;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(86, input);
								throw eee;
						}
						cnt86++;
					} while (true);

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal271=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal271_tree = 
					(CommonTree)adaptor.create(string_literal271)
					;
					adaptor.addChild(root_0, string_literal271_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId272=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2873); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId272_tree = 
					(CommonTree)adaptor.create(VariableId272)
					;
					adaptor.addChild(root_0, VariableId272_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, variableMemberStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableMemberStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:1: staticAccessOrParent : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal273=null;
		Token string_literal274=null;
		Token string_literal276=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject275 =null;

		CommonTree string_literal273_tree=null;
		CommonTree string_literal274_tree=null;
		CommonTree string_literal276_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt88=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt88=1;
				}
				break;
			case Parent:
				{
				alt88=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:4: 'self::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal273=(Token)match(input,Self,FOLLOW_Self_in_staticAccessOrParent2884); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal273_tree = 
					(CommonTree)adaptor.create(string_literal273)
					;
					adaptor.addChild(root_0, string_literal273_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: 'parent::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal274=(Token)match(input,Parent,FOLLOW_Parent_in_staticAccessOrParent2889); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal274_tree = 
					(CommonTree)adaptor.create(string_literal274)
					;
					adaptor.addChild(root_0, string_literal274_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: classInterfaceTypeWithoutObject '::'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2894);
					classInterfaceTypeWithoutObject275=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject275.getTree());

					string_literal276=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2895); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal276_tree = 
					(CommonTree)adaptor.create(string_literal276)
					;
					adaptor.addChild(root_0, string_literal276_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class memberAccessOrArrayAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccessOrArrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:1: memberAccessOrArrayAccess : ( memberAccess | arrayAccess );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccess277 =null;
		ParserRuleReturnScope arrayAccess278 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:2: ( memberAccess | arrayAccess )
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==ObjectOperator) ) {
				alt89=1;
			}
			else if ( (LA89_0==LeftSquareBrace) ) {
				alt89=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:4: memberAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_memberAccessOrArrayAccess2906);
					memberAccess277=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess277.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:4: arrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2911);
					arrayAccess278=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess278.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, memberAccessOrArrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccessOrArrayAccess"


	public static class memberAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:1: memberAccess : '->' Identifier ;
	public final TSPHPParser.memberAccess_return memberAccess() throws RecognitionException {
		TSPHPParser.memberAccess_return retval = new TSPHPParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal279=null;
		Token Identifier280=null;

		CommonTree string_literal279_tree=null;
		CommonTree Identifier280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:2: ( '->' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:4: '->' Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal279=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccess2921); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal279_tree = 
			(CommonTree)adaptor.create(string_literal279)
			;
			adaptor.addChild(root_0, string_literal279_tree);
			}

			Identifier280=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccess2923); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier280_tree = 
			(CommonTree)adaptor.create(Identifier280)
			;
			adaptor.addChild(root_0, Identifier280_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class arrayAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:1: arrayAccess : '[' expression ']' ;
	public final TSPHPParser.arrayAccess_return arrayAccess() throws RecognitionException {
		TSPHPParser.arrayAccess_return retval = new TSPHPParser.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal281=null;
		Token char_literal283=null;
		ParserRuleReturnScope expression282 =null;

		CommonTree char_literal281_tree=null;
		CommonTree char_literal283_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:2: ( '[' expression ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: '[' expression ']'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal281=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2933); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal281_tree = 
			(CommonTree)adaptor.create(char_literal281)
			;
			adaptor.addChild(root_0, char_literal281_tree);
			}

			pushFollow(FOLLOW_expression_in_arrayAccess2935);
			expression282=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression282.getTree());

			char_literal283=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2937); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal283_tree = 
			(CommonTree)adaptor.create(char_literal283)
			;
			adaptor.addChild(root_0, char_literal283_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, arrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:1: newObject : ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal284=null;
		Token char_literal286=null;
		Token char_literal288=null;
		Token string_literal289=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject285 =null;
		ParserRuleReturnScope expressionList287 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject290 =null;

		CommonTree string_literal284_tree=null;
		CommonTree char_literal286_tree=null;
		CommonTree char_literal288_tree=null;
		CommonTree string_literal289_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:2: ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) )
			int alt90=2;
			alt90 = dfa90.predict(input);
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:4: 'new' classInterfaceTypeWithoutObject '(' expressionList ')'
					{
					string_literal284=(Token)match(input,New,FOLLOW_New_in_newObject2950); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal284);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2952);
					classInterfaceTypeWithoutObject285=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject285.getTree());
					char_literal286=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2954); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal286);

					pushFollow(FOLLOW_expressionList_in_newObject2956);
					expressionList287=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList287.getTree());
					char_literal288=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2958); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal288);

					// AST REWRITE
					// elements: expressionList, New, classInterfaceTypeWithoutObject
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 559:65: -> ^( 'new' classInterfaceTypeWithoutObject expressionList )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:68: ^( 'new' classInterfaceTypeWithoutObject expressionList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, stream_expressionList.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal289=(Token)match(input,New,FOLLOW_New_in_newObject2973); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal289);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2975);
					classInterfaceTypeWithoutObject290=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject290.getTree());
					// AST REWRITE
					// elements: classInterfaceTypeWithoutObject, New
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 560:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST")
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary291 =null;
		ParserRuleReturnScope primary292 =null;
		ParserRuleReturnScope primary293 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
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
				alt91=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3002);
					primary291=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary291.getTree());
					// AST REWRITE
					// elements: primary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 564:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UPLUS, uplus, "unary plus")
						, root_1);

						adaptor.addChild(root_1, stream_primary.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3022);
					primary292=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary292.getTree());
					// AST REWRITE
					// elements: primary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 565:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UMINUS, uminus, "unary minus")
						, root_1);

						adaptor.addChild(root_1, stream_primary.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3036);
					primary293=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary293.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:1: primary : ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentInclAccessAtTheEnd294 =null;
		ParserRuleReturnScope methodCallFluentInclAccessAtTheEnd295 =null;
		ParserRuleReturnScope atom296 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:2: ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom )
			int alt92=3;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA92_1 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt92=1;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA92_2 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt92=1;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Self:
				{
				int LA92_3 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA92_4 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA92_5 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA92_6 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt92=2;
				}
				else if ( (true) ) {
					alt92=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 6, input);
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
				alt92=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}
			switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: functionCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary3046);
					functionCallFluentInclAccessAtTheEnd294=functionCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentInclAccessAtTheEnd294.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: methodCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary3051);
					methodCallFluentInclAccessAtTheEnd295=methodCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentInclAccessAtTheEnd295.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3056);
					atom296=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom296.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class functionCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:1: functionCallFluentInclAccessAtTheEnd : functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.functionCallFluentInclAccessAtTheEnd_return functionCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd297 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess298 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:2: ( functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:4: functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd3068);
			functionCallFluentWithoutAccessAtTheEnd297=functionCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd297.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:44: ( memberAccessOrArrayAccess )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LeftSquareBrace||LA93_0==ObjectOperator) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:44: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd3070);
					memberAccessOrArrayAccess298=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess298.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, functionCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentInclAccessAtTheEnd"


	public static class functionCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:1: functionCallFluentWithoutAccessAtTheEnd : ( functionCall ( callOrAccess )* call | functionCall ( call )* );
	public final TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return functionCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCall299 =null;
		ParserRuleReturnScope callOrAccess300 =null;
		ParserRuleReturnScope call301 =null;
		ParserRuleReturnScope functionCall302 =null;
		ParserRuleReturnScope call303 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:2: ( functionCall ( callOrAccess )* call | functionCall ( call )* )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==Backslash) ) {
				int LA96_1 = input.LA(2);
				if ( (synpred155_TSPHP()) ) {
					alt96=1;
				}
				else if ( (true) ) {
					alt96=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			else if ( (LA96_0==Identifier) ) {
				int LA96_2 = input.LA(2);
				if ( (synpred155_TSPHP()) ) {
					alt96=1;
				}
				else if ( (true) ) {
					alt96=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:4: functionCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd3082);
					functionCall299=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall299.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: ( callOrAccess )*
					loop94:
					do {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==ObjectOperator) ) {
							int LA94_1 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt94=1;
							}

						}
						else if ( (LA94_0==LeftSquareBrace) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd3084);
							callOrAccess300=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess300.getTree());

							}
							break;

						default :
							break loop94;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd3087);
					call301=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call301.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:4: functionCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd3092);
					functionCall302=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall302.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:17: ( call )*
					loop95:
					do {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==ObjectOperator) ) {
							int LA95_2 = input.LA(2);
							if ( (LA95_2==Identifier) ) {
								int LA95_3 = input.LA(3);
								if ( (LA95_3==LeftParanthesis) ) {
									alt95=1;
								}

							}

						}

						switch (alt95) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:17: call
							{
							pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd3094);
							call303=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call303.getTree());

							}
							break;

						default :
							break loop95;
						}
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, functionCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentWithoutAccessAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:1: functionCall : classInterfaceTypeWithoutObject '(' expressionList ')' ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal305=null;
		Token char_literal307=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject304 =null;
		ParserRuleReturnScope expressionList306 =null;

		CommonTree char_literal305_tree=null;
		CommonTree char_literal307_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:2: ( classInterfaceTypeWithoutObject '(' expressionList ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: classInterfaceTypeWithoutObject '(' expressionList ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3106);
			classInterfaceTypeWithoutObject304=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject304.getTree());

			char_literal305=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall3108); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal305_tree = 
			(CommonTree)adaptor.create(char_literal305)
			;
			adaptor.addChild(root_0, char_literal305_tree);
			}

			pushFollow(FOLLOW_expressionList_in_functionCall3110);
			expressionList306=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList306.getTree());

			char_literal307=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall3112); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal307_tree = 
			(CommonTree)adaptor.create(char_literal307)
			;
			adaptor.addChild(root_0, char_literal307_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class callOrAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callOrAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess308 =null;
		ParserRuleReturnScope call309 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:2: ( memberAccessOrArrayAccess | call )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==ObjectOperator) ) {
				int LA97_1 = input.LA(2);
				if ( (LA97_1==Identifier) ) {
					int LA97_3 = input.LA(3);
					if ( (LA97_3==LeftParanthesis) ) {
						alt97=2;
					}
					else if ( (LA97_3==EOF||LA97_3==LeftSquareBrace||LA97_3==ObjectOperator) ) {
						alt97=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 97, 3, input);
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
							new NoViableAltException("", 97, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA97_0==LeftSquareBrace) ) {
				alt97=1;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:4: memberAccessOrArrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess3123);
					memberAccessOrArrayAccess308=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess308.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:589:4: call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess3128);
					call309=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call309.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, callOrAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callOrAccess"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:1: call : ( '->' Identifier '(' expressionList ')' ) ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal310=null;
		Token Identifier311=null;
		Token char_literal312=null;
		Token char_literal314=null;
		ParserRuleReturnScope expressionList313 =null;

		CommonTree string_literal310_tree=null;
		CommonTree Identifier311_tree=null;
		CommonTree char_literal312_tree=null;
		CommonTree char_literal314_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:6: ( ( '->' Identifier '(' expressionList ')' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:8: ( '->' Identifier '(' expressionList ')' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:8: ( '->' Identifier '(' expressionList ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:9: '->' Identifier '(' expressionList ')'
			{
			string_literal310=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3141); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal310_tree = 
			(CommonTree)adaptor.create(string_literal310)
			;
			adaptor.addChild(root_0, string_literal310_tree);
			}

			Identifier311=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3143); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier311_tree = 
			(CommonTree)adaptor.create(Identifier311)
			;
			adaptor.addChild(root_0, Identifier311_tree);
			}

			char_literal312=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call3145); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal312_tree = 
			(CommonTree)adaptor.create(char_literal312)
			;
			adaptor.addChild(root_0, char_literal312_tree);
			}

			pushFollow(FOLLOW_expressionList_in_call3147);
			expressionList313=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList313.getTree());

			char_literal314=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call3148); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal314_tree = 
			(CommonTree)adaptor.create(char_literal314)
			;
			adaptor.addChild(root_0, char_literal314_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:594:1: methodCallFluentInclAccessAtTheEnd : methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.methodCallFluentInclAccessAtTheEnd_return methodCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd315 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess316 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:2: ( methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:4: methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd3159);
			methodCallFluentWithoutAccessAtTheEnd315=methodCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd315.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:42: ( memberAccessOrArrayAccess )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LeftSquareBrace||LA98_0==ObjectOperator) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:42: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd3161);
					memberAccessOrArrayAccess316=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess316.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, methodCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentInclAccessAtTheEnd"


	public static class methodCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:1: methodCallFluentWithoutAccessAtTheEnd : ( methodCall ( callOrAccess )* call | methodCall ( call )* );
	public final TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return methodCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCall317 =null;
		ParserRuleReturnScope callOrAccess318 =null;
		ParserRuleReturnScope call319 =null;
		ParserRuleReturnScope methodCall320 =null;
		ParserRuleReturnScope call321 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:2: ( methodCall ( callOrAccess )* call | methodCall ( call )* )
			int alt101=2;
			switch ( input.LA(1) ) {
			case Self:
				{
				int LA101_1 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA101_2 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA101_3 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA101_4 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA101_5 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA101_6 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt101=1;
				}
				else if ( (true) ) {
					alt101=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 6, input);
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
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: methodCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3175);
					methodCall317=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall317.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: ( callOrAccess )*
					loop99:
					do {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==ObjectOperator) ) {
							int LA99_1 = input.LA(2);
							if ( (synpred159_TSPHP()) ) {
								alt99=1;
							}

						}
						else if ( (LA99_0==LeftSquareBrace) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd3177);
							callOrAccess318=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess318.getTree());

							}
							break;

						default :
							break loop99;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3180);
					call319=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call319.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:4: methodCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3185);
					methodCall320=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall320.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:15: ( call )*
					loop100:
					do {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==ObjectOperator) ) {
							int LA100_2 = input.LA(2);
							if ( (LA100_2==Identifier) ) {
								int LA100_3 = input.LA(3);
								if ( (LA100_3==LeftParanthesis) ) {
									alt100=1;
								}

							}

						}

						switch (alt100) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:15: call
							{
							pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3187);
							call321=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call321.getTree());

							}
							break;

						default :
							break loop100;
						}
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, methodCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentWithoutAccessAtTheEnd"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:1: methodCall : ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' expressionList ')' ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal323=null;
		Token Identifier325=null;
		Token char_literal326=null;
		Token char_literal328=null;
		ParserRuleReturnScope variableMemberStaticMember322 =null;
		ParserRuleReturnScope staticAccessOrParent324 =null;
		ParserRuleReturnScope expressionList327 =null;

		CommonTree string_literal323_tree=null;
		CommonTree Identifier325_tree=null;
		CommonTree char_literal326_tree=null;
		CommonTree char_literal328_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:2: ( ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' expressionList ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' expressionList ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )
			int alt102=2;
			alt102 = dfa102.predict(input);
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:6: ( variableMemberStaticMember '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:6: ( variableMemberStaticMember '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:7: variableMemberStaticMember '->'
					{
					pushFollow(FOLLOW_variableMemberStaticMember_in_methodCall3201);
					variableMemberStaticMember322=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember322.getTree());

					string_literal323=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall3203); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal323_tree = 
					(CommonTree)adaptor.create(string_literal323)
					;
					adaptor.addChild(root_0, string_literal323_tree);
					}

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:42: staticAccessOrParent
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_methodCall3208);
					staticAccessOrParent324=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent324.getTree());

					}
					break;

			}

			Identifier325=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3211); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier325_tree = 
			(CommonTree)adaptor.create(Identifier325)
			;
			adaptor.addChild(root_0, Identifier325_tree);
			}

			char_literal326=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall3213); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal326_tree = 
			(CommonTree)adaptor.create(char_literal326)
			;
			adaptor.addChild(root_0, char_literal326_tree);
			}

			pushFollow(FOLLOW_expressionList_in_methodCall3215);
			expressionList327=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList327.getTree());

			char_literal328=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall3216); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal328_tree = 
			(CommonTree)adaptor.create(char_literal328)
			;
			adaptor.addChild(root_0, char_literal328_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:606:1: atom : ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal329=null;
		Token char_literal331=null;
		ParserRuleReturnScope expression330 =null;
		ParserRuleReturnScope incrementDecrement332 =null;
		ParserRuleReturnScope variableMemberStaticMember333 =null;
		ParserRuleReturnScope classConstant334 =null;
		ParserRuleReturnScope globalConstant335 =null;
		ParserRuleReturnScope array336 =null;
		ParserRuleReturnScope primitiveAtom337 =null;

		CommonTree char_literal329_tree=null;
		CommonTree char_literal331_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:606:6: ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom )
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred166_TSPHP()) ) {
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred166_TSPHP()) ) {
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred166_TSPHP()) ) {
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
					alt103=3;
				}
				else if ( (synpred166_TSPHP()) ) {
					alt103=4;
				}
				else if ( (synpred167_TSPHP()) ) {
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
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
				if ( (synpred164_TSPHP()) ) {
					alt103=2;
				}
				else if ( (synpred165_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:606:8: '(' expression ')'
					{
					char_literal329=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal329);

					pushFollow(FOLLOW_expression_in_atom3228);
					expression330=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression330.getTree());
					char_literal331=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3230); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal331);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 606:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3239);
					incrementDecrement332=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement332.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableMemberStaticMember_in_atom3244);
					variableMemberStaticMember333=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember333.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:609:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3249);
					classConstant334=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant334.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3254);
					globalConstant335=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant335.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:611:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3259);
					array336=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array336.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3264);
					primitiveAtom337=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom337.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:615:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier338=null;

		CommonTree Identifier338_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier338=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3276); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier338_tree = 
			(CommonTree)adaptor.create(Identifier338)
			;
			adaptor.addChild(root_0, Identifier338_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier340=null;
		ParserRuleReturnScope staticAccessOrParent339 =null;

		CommonTree Identifier340_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:4: staticAccessOrParent Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3287);
			staticAccessOrParent339=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent339.getTree());

			Identifier340=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3289); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier340_tree = 
			(CommonTree)adaptor.create(Identifier340)
			;
			adaptor.addChild(root_0, Identifier340_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal341=null;
		Token char_literal343=null;
		ParserRuleReturnScope primitiveAtom342 =null;
		ParserRuleReturnScope primitiveAtom344 =null;
		ParserRuleReturnScope primitiveAtom345 =null;

		CommonTree char_literal341_tree=null;
		CommonTree char_literal343_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:624:4: '+' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal341=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3301); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal341_tree = 
					(CommonTree)adaptor.create(char_literal341)
					;
					adaptor.addChild(root_0, char_literal341_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3303);
					primitiveAtom342=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom342.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:4: '-' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal343=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3308); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal343_tree = 
					(CommonTree)adaptor.create(char_literal343)
					;
					adaptor.addChild(root_0, char_literal343_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3310);
					primitiveAtom344=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom344.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3315);
					primitiveAtom345=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom345.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set346=null;

		CommonTree set346_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set346=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set346)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal347=null;
		Token char_literal349=null;
		Token TypeArray350=null;
		Token char_literal351=null;
		Token char_literal353=null;
		ParserRuleReturnScope array_content348 =null;
		ParserRuleReturnScope array_content352 =null;

		CommonTree char_literal347_tree=null;
		CommonTree char_literal349_tree=null;
		CommonTree TypeArray350_tree=null;
		CommonTree char_literal351_tree=null;
		CommonTree char_literal353_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:9: '[' ( array_content )? ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal347=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal347_tree = 
					(CommonTree)adaptor.create(char_literal347)
					;
					adaptor.addChild(root_0, char_literal347_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:13: ( array_content )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==At||LA105_0==Backslash||LA105_0==BitwiseNot||LA105_0==Bool||LA105_0==Clone||LA105_0==Float||LA105_0==Identifier||LA105_0==Int||(LA105_0 >= LeftParanthesis && LA105_0 <= LeftSquareBrace)||LA105_0==LogicNot||LA105_0==Minus||LA105_0==MinusMinus||LA105_0==New||LA105_0==Null||(LA105_0 >= Parent && LA105_0 <= Plus)||LA105_0==PlusPlus||LA105_0==Self||LA105_0==String||LA105_0==This||LA105_0==TypeArray||LA105_0==VariableId) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3815);
							array_content348=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content348.getTree());

							}
							break;

					}

					char_literal349=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal349_tree = 
					(CommonTree)adaptor.create(char_literal349)
					;
					adaptor.addChild(root_0, char_literal349_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray350=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array3824); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray350_tree = 
					(CommonTree)adaptor.create(TypeArray350)
					;
					adaptor.addChild(root_0, TypeArray350_tree);
					}

					char_literal351=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3826); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal351_tree = 
					(CommonTree)adaptor.create(char_literal351)
					;
					adaptor.addChild(root_0, char_literal351_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:18: ( array_content )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==At||LA106_0==Backslash||LA106_0==BitwiseNot||LA106_0==Bool||LA106_0==Clone||LA106_0==Float||LA106_0==Identifier||LA106_0==Int||(LA106_0 >= LeftParanthesis && LA106_0 <= LeftSquareBrace)||LA106_0==LogicNot||LA106_0==Minus||LA106_0==MinusMinus||LA106_0==New||LA106_0==Null||(LA106_0 >= Parent && LA106_0 <= Plus)||LA106_0==PlusPlus||LA106_0==Self||LA106_0==String||LA106_0==This||LA106_0==TypeArray||LA106_0==VariableId) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3828);
							array_content352=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content352.getTree());

							}
							break;

					}

					char_literal353=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3831); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal353_tree = 
					(CommonTree)adaptor.create(char_literal353)
					;
					adaptor.addChild(root_0, char_literal353_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class array_content_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_content"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final TSPHPParser.array_content_return array_content() throws RecognitionException {
		TSPHPParser.array_content_return retval = new TSPHPParser.array_content_return();
		retval.start = input.LT(1);
		int array_content_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal355=null;
		Token char_literal357=null;
		Token string_literal359=null;
		ParserRuleReturnScope expression354 =null;
		ParserRuleReturnScope expression356 =null;
		ParserRuleReturnScope expression358 =null;
		ParserRuleReturnScope expression360 =null;

		CommonTree string_literal355_tree=null;
		CommonTree char_literal357_tree=null;
		CommonTree string_literal359_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:4: ( expression '=>' )?
			int alt108=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA108_1 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA108_2 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA108_3 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case At:
					{
					int LA108_4 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Clone:
					{
					int LA108_5 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case New:
					{
					int LA108_6 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Plus:
					{
					int LA108_7 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Minus:
					{
					int LA108_8 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Backslash:
					{
					int LA108_9 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Identifier:
					{
					int LA108_10 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Self:
					{
					int LA108_11 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case Parent:
					{
					int LA108_12 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case This:
					{
					int LA108_13 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case VariableId:
					{
					int LA108_14 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA108_15 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA108_16 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA108_17 = input.LA(2);
					if ( (synpred179_TSPHP()) ) {
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
					if ( (synpred179_TSPHP()) ) {
						alt108=1;
					}
					}
					break;
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3844);
					expression354=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression354.getTree());

					string_literal355=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal355_tree = 
					(CommonTree)adaptor.create(string_literal355)
					;
					adaptor.addChild(root_0, string_literal355_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3850);
			expression356=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression356.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:35: ( ',' ( expression '=>' )? expression )*
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==Comma) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:36: ',' ( expression '=>' )? expression
					{
					char_literal357=(Token)match(input,Comma,FOLLOW_Comma_in_array_content3854); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal357_tree = 
					(CommonTree)adaptor.create(char_literal357)
					;
					adaptor.addChild(root_0, char_literal357_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:40: ( expression '=>' )?
					int alt109=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA109_1 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA109_2 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA109_3 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case At:
							{
							int LA109_4 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Clone:
							{
							int LA109_5 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case New:
							{
							int LA109_6 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Plus:
							{
							int LA109_7 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Minus:
							{
							int LA109_8 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Backslash:
							{
							int LA109_9 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Identifier:
							{
							int LA109_10 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Self:
							{
							int LA109_11 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case Parent:
							{
							int LA109_12 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case This:
							{
							int LA109_13 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case VariableId:
							{
							int LA109_14 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA109_15 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA109_16 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA109_17 = input.LA(2);
							if ( (synpred180_TSPHP()) ) {
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
							if ( (synpred180_TSPHP()) ) {
								alt109=1;
							}
							}
							break;
					}
					switch (alt109) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3857);
							expression358=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression358.getTree());

							string_literal359=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3859); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal359_tree = 
							(CommonTree)adaptor.create(string_literal359)
							;
							adaptor.addChild(root_0, string_literal359_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3863);
					expression360=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression360.getTree());

					}
					break;

				default :
					break loop110;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, array_content_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array_content"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:700:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal361=null;
		Token char_literal362=null;
		Token char_literal364=null;
		Token string_literal365=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression363 =null;

		CommonTree string_literal361_tree=null;
		CommonTree char_literal362_tree=null;
		CommonTree char_literal364_tree=null;
		CommonTree string_literal365_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal361=(Token)match(input,If,FOLLOW_If_in_ifCondition3875); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal361);

			char_literal362=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3877); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal362);

			pushFollow(FOLLOW_expression_in_ifCondition3879);
			expression363=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression363.getTree());
			char_literal364=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3881); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal364);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3886);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==Else) ) {
				int LA111_1 = input.LA(2);
				if ( (synpred182_TSPHP()) ) {
					alt111=1;
				}
			}
			switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal365=(Token)match(input,Else,FOLLOW_Else_in_ifCondition3893); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal365);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3898);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: instructionThen, expression, If, instructionElse
			// token labels: 
			// rule labels: retval, instructionThen, instructionElse
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_instructionThen=new RewriteRuleSubtreeStream(adaptor,"rule instructionThen",instructionThen!=null?instructionThen.getTree():null);
			RewriteRuleSubtreeStream stream_instructionElse=new RewriteRuleSubtreeStream(adaptor,"rule instructionElse",instructionElse!=null?instructionElse.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 702:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:100: ( $instructionElse)?
				if ( stream_instructionElse.hasNext() ) {
					adaptor.addChild(root_1, stream_instructionElse.nextTree());

				}
				stream_instructionElse.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:706:1: switchCondition : 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal366=null;
		Token char_literal367=null;
		Token VariableId368=null;
		Token char_literal369=null;
		Token char_literal370=null;
		Token char_literal372=null;
		ParserRuleReturnScope switchContent371 =null;

		CommonTree string_literal366_tree=null;
		CommonTree char_literal367_tree=null;
		CommonTree VariableId368_tree=null;
		CommonTree char_literal369_tree=null;
		CommonTree char_literal370_tree=null;
		CommonTree char_literal372_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:2: ( 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:4: 'switch' '(' VariableId ')' '{' switchContent '}'
			{
			string_literal366=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition3929); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal366);

			char_literal367=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3931); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal367);

			VariableId368=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition3933); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId368);

			char_literal369=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3935); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal369);

			char_literal370=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal370);

			pushFollow(FOLLOW_switchContent_in_switchCondition3939);
			switchContent371=switchContent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_switchContent.add(switchContent371.getTree());
			char_literal372=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3941); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal372);

			// AST REWRITE
			// elements: VariableId, switchContent, Switch
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 707:55: -> ^( 'switch' VariableId switchContent )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:58: ^( 'switch' VariableId switchContent )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, stream_switchContent.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:1: switchContent : ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCase373 =null;
		ParserRuleReturnScope defaultCase374 =null;
		ParserRuleReturnScope normalCase375 =null;
		ParserRuleReturnScope normalCase376 =null;
		ParserRuleReturnScope defaultCase377 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:2: ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? )
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==Case) ) {
				int LA116_1 = input.LA(2);
				if ( (synpred185_TSPHP()) ) {
					alt116=1;
				}
				else if ( (true) ) {
					alt116=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 116, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 116, 0, input);
				throw nvae;
			}
			switch (alt116) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: ( normalCase )+ defaultCase ( normalCase )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: ( normalCase )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent3962);
							normalCase373=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase373.getTree());

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

					pushFollow(FOLLOW_defaultCase_in_switchContent3965);
					defaultCase374=defaultCase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase374.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:28: ( normalCase )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:28: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent3967);
							normalCase375=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase375.getTree());

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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:4: ( normalCase )+ ( defaultCase )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:4: ( normalCase )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent3974);
							normalCase376=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase376.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:16: ( defaultCase )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==Default) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:16: defaultCase
							{
							pushFollow(FOLLOW_defaultCase_in_switchContent3977);
							defaultCase377=defaultCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase377.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCase_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCase"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:1: normalCase : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.normalCase_return normalCase() throws RecognitionException {
		TSPHPParser.normalCase_return retval = new TSPHPParser.normalCase_return();
		retval.start = input.LT(1);
		int normalCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel378 =null;
		ParserRuleReturnScope instructionInclBreakContinue379 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:4: ( caseLabel )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCase3989);
					caseLabel378=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel378.getTree());
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:15: ( instructionInclBreakContinue )+
			int cnt118=0;
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==Backslash||LA118_0==Break||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= For && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==LeftCurlyBrace||LA118_0==MinusMinus||LA118_0==Parent||LA118_0==PlusPlus||LA118_0==Return||LA118_0==Self||(LA118_0 >= Switch && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCase3992);
					instructionInclBreakContinue379=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue379.getTree());
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

			// AST REWRITE
			// elements: caseLabel, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 716:3: -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:716:6: ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				if ( !(stream_caseLabel.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_0, root_1);
				}

				if ( !(stream_instructionInclBreakContinue.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_instructionInclBreakContinue.hasNext() ) {
					adaptor.addChild(root_0, stream_instructionInclBreakContinue.nextTree());

				}
				stream_instructionInclBreakContinue.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, normalCase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCase"


	public static class defaultCase_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCase"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:719:1: defaultCase : defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.defaultCase_return defaultCase() throws RecognitionException {
		TSPHPParser.defaultCase_return retval = new TSPHPParser.defaultCase_return();
		retval.start = input.LT(1);
		int defaultCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope defaultLabel380 =null;
		ParserRuleReturnScope instructionInclBreakContinue381 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:720:2: ( defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:720:4: defaultLabel ( instructionInclBreakContinue )+
			{
			pushFollow(FOLLOW_defaultLabel_in_defaultCase4023);
			defaultLabel380=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel380.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:720:17: ( instructionInclBreakContinue )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:720:17: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCase4025);
					instructionInclBreakContinue381=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue381.getTree());
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

			// AST REWRITE
			// elements: instructionInclBreakContinue, defaultLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 721:3: -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:721:6: ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				if ( !(stream_instructionInclBreakContinue.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_instructionInclBreakContinue.hasNext() ) {
					adaptor.addChild(root_0, stream_instructionInclBreakContinue.nextTree());

				}
				stream_instructionInclBreakContinue.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, defaultCase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCase"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:724:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal382=null;
		Token char_literal384=null;
		ParserRuleReturnScope expression383 =null;

		CommonTree string_literal382_tree=null;
		CommonTree char_literal384_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:725:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:725:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal382=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4053); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4056);
			expression383=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression383.getTree());

			char_literal384=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4058); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:727:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal385=null;
		Token char_literal386=null;

		CommonTree string_literal385_tree=null;
		CommonTree char_literal386_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:2: ( 'default' ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal385=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4068); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal385_tree = 
			(CommonTree)adaptor.create(string_literal385)
			;
			adaptor.addChild(root_0, string_literal385_tree);
			}

			char_literal386=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4070); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:730:1: forLoop : 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue ) ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal387=null;
		Token char_literal388=null;
		Token char_literal390=null;
		Token char_literal392=null;
		Token char_literal394=null;
		ParserRuleReturnScope forInit389 =null;
		ParserRuleReturnScope expressionList391 =null;
		ParserRuleReturnScope expressionList393 =null;
		ParserRuleReturnScope instructionInclBreakContinue395 =null;

		CommonTree string_literal387_tree=null;
		CommonTree char_literal388_tree=null;
		CommonTree char_literal390_tree=null;
		CommonTree char_literal392_tree=null;
		CommonTree char_literal394_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:730:9: ( 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:730:11: 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue
			{
			string_literal387=(Token)match(input,For,FOLLOW_For_in_forLoop4080); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_For.add(string_literal387);

			char_literal388=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop4082); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal388);

			pushFollow(FOLLOW_forInit_in_forLoop4084);
			forInit389=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_forInit.add(forInit389.getTree());
			char_literal390=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop4086); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal390);

			pushFollow(FOLLOW_expressionList_in_forLoop4088);
			expressionList391=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList391.getTree());
			char_literal392=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop4091); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal392);

			pushFollow(FOLLOW_expressionList_in_forLoop4093);
			expressionList393=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList393.getTree());
			char_literal394=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop4095); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal394);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4097);
			instructionInclBreakContinue395=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue395.getTree());
			// AST REWRITE
			// elements: forInit, instructionInclBreakContinue, For, expressionList, expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 730:101: -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:730:104: ^( 'for' forInit expressionList expressionList instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_For.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_forInit.nextTree());

				adaptor.addChild(root_1, stream_expressionList.nextTree());

				adaptor.addChild(root_1, stream_expressionList.nextTree());

				adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:1: forInit : varListOrExprList ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope varListOrExprList396 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:9: ( varListOrExprList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:11: varListOrExprList
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_varListOrExprList_in_forInit4119);
			varListOrExprList396=varListOrExprList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varListOrExprList396.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class varListOrExprList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varListOrExprList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:735:1: varListOrExprList : ( variableDeclarationList -> ^( VARIABLE_DECLARATION_LIST variableDeclarationList ) | expressionList );
	public final TSPHPParser.varListOrExprList_return varListOrExprList() throws RecognitionException {
		TSPHPParser.varListOrExprList_return retval = new TSPHPParser.varListOrExprList_return();
		retval.start = input.LT(1);
		int varListOrExprList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope variableDeclarationList397 =null;
		ParserRuleReturnScope expressionList398 =null;

		RewriteRuleSubtreeStream stream_variableDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:736:2: ( variableDeclarationList -> ^( VARIABLE_DECLARATION_LIST variableDeclarationList ) | expressionList )
			int alt120=2;
			alt120 = dfa120.predict(input);
			switch (alt120) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:736:4: variableDeclarationList
					{
					pushFollow(FOLLOW_variableDeclarationList_in_varListOrExprList4130);
					variableDeclarationList397=variableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationList.add(variableDeclarationList397.getTree());
					// AST REWRITE
					// elements: variableDeclarationList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 736:28: -> ^( VARIABLE_DECLARATION_LIST variableDeclarationList )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:736:31: ^( VARIABLE_DECLARATION_LIST variableDeclarationList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, "VARIABLE_DECLARATION_LIST")
						, root_1);

						adaptor.addChild(root_1, stream_variableDeclarationList.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:737:4: expressionList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expressionList_in_varListOrExprList4143);
					expressionList398=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList398.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, varListOrExprList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varListOrExprList"


	public static class variableDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:740:1: variableDeclarationList : variableDeclaration ( ',' ! variableAssignment )* ;
	public final TSPHPParser.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		TSPHPParser.variableDeclarationList_return retval = new TSPHPParser.variableDeclarationList_return();
		retval.start = input.LT(1);
		int variableDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal400=null;
		ParserRuleReturnScope variableDeclaration399 =null;
		ParserRuleReturnScope variableAssignment401 =null;

		CommonTree char_literal400_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:2: ( variableDeclaration ( ',' ! variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:4: variableDeclaration ( ',' ! variableAssignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList4154);
			variableDeclaration399=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration399.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:24: ( ',' ! variableAssignment )*
			loop121:
			do {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==Comma) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:25: ',' ! variableAssignment
					{
					char_literal400=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationList4157); if (state.failed) return retval;
					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationList4160);
					variableAssignment401=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment401.getTree());

					}
					break;

				default :
					break loop121;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, variableDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationList"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:744:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal402=null;
		Token char_literal403=null;
		Token string_literal405=null;
		Token string_literal406=null;
		Token char_literal407=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression404 =null;
		ParserRuleReturnScope instructionInclBreakContinue408 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal402_tree=null;
		CommonTree char_literal403_tree=null;
		CommonTree string_literal405_tree=null;
		CommonTree string_literal406_tree=null;
		CommonTree char_literal407_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_As=new RewriteRuleTokenStream(adaptor,"token As");
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_primitiveTypes=new RewriteRuleSubtreeStream(adaptor,"rule primitiveTypes");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_allTypesWithoutResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutResource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:745:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:745:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal402=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4174); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal402);

			char_literal403=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4176); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal403);

			pushFollow(FOLLOW_expression_in_foreachLoop4178);
			expression404=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression404.getTree());
			string_literal405=(Token)match(input,As,FOLLOW_As_in_foreachLoop4180); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal405);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:745:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt122=2;
			switch ( input.LA(1) ) {
				case TypeBool:
					{
					int LA122_1 = input.LA(2);
					if ( (LA122_1==VariableId) ) {
						int LA122_7 = input.LA(3);
						if ( (LA122_7==Arrow) ) {
							alt122=1;
						}
					}
					}
					break;
				case TypeBoolean:
					{
					int LA122_2 = input.LA(2);
					if ( (LA122_2==VariableId) ) {
						int LA122_7 = input.LA(3);
						if ( (LA122_7==Arrow) ) {
							alt122=1;
						}
					}
					}
					break;
				case TypeInt:
					{
					int LA122_3 = input.LA(2);
					if ( (LA122_3==VariableId) ) {
						int LA122_7 = input.LA(3);
						if ( (LA122_7==Arrow) ) {
							alt122=1;
						}
					}
					}
					break;
				case TypeFloat:
					{
					int LA122_4 = input.LA(2);
					if ( (LA122_4==VariableId) ) {
						int LA122_7 = input.LA(3);
						if ( (LA122_7==Arrow) ) {
							alt122=1;
						}
					}
					}
					break;
				case TypeString:
					{
					int LA122_5 = input.LA(2);
					if ( (LA122_5==VariableId) ) {
						int LA122_7 = input.LA(3);
						if ( (LA122_7==Arrow) ) {
							alt122=1;
						}
					}
					}
					break;
			}
			switch (alt122) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:745:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4185);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4189); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal406=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4191); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal406);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutResource_in_foreachLoop4197);
			valueType=allTypesWithoutResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4201); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal407=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4203); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal407);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4205);
			instructionInclBreakContinue408=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue408.getTree());
			// AST REWRITE
			// elements: valueType, keyVarId, expression, instructionInclBreakContinue, valueVarId, Foreach, keyType
			// token labels: keyVarId, valueVarId
			// rule labels: retval, keyType, valueType
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleTokenStream stream_keyVarId=new RewriteRuleTokenStream(adaptor,"token keyVarId",keyVarId);
			RewriteRuleTokenStream stream_valueVarId=new RewriteRuleTokenStream(adaptor,"token valueVarId",valueVarId);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_keyType=new RewriteRuleSubtreeStream(adaptor,"rule keyType",keyType!=null?keyType.getTree():null);
			RewriteRuleSubtreeStream stream_valueType=new RewriteRuleSubtreeStream(adaptor,"rule valueType",valueType!=null?valueType.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 746:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:40: ( $keyVarId)?
				if ( stream_keyVarId.hasNext() ) {
					adaptor.addChild(root_1, stream_keyVarId.nextNode());

				}
				stream_keyVarId.reset();

				adaptor.addChild(root_1, stream_valueType.nextTree());

				adaptor.addChild(root_1, stream_valueVarId.nextNode());

				adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:748:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal409=null;
		Token char_literal410=null;
		Token char_literal412=null;
		ParserRuleReturnScope expression411 =null;
		ParserRuleReturnScope instructionInclBreakContinue413 =null;

		CommonTree string_literal409_tree=null;
		CommonTree char_literal410_tree=null;
		CommonTree char_literal412_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:749:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:749:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal409=(Token)match(input,While,FOLLOW_While_in_whileLoop4241); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal409);

			char_literal410=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4243); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal410);

			pushFollow(FOLLOW_expression_in_whileLoop4245);
			expression411=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression411.getTree());
			char_literal412=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal412);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4249);
			instructionInclBreakContinue413=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue413.getTree());
			// AST REWRITE
			// elements: While, instructionInclBreakContinue, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 749:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:749:63: ^( 'while' expression instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_While.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal414=null;
		Token string_literal416=null;
		Token char_literal417=null;
		Token char_literal419=null;
		Token char_literal420=null;
		ParserRuleReturnScope instructionInclBreakContinue415 =null;
		ParserRuleReturnScope expression418 =null;

		CommonTree string_literal414_tree=null;
		CommonTree string_literal416_tree=null;
		CommonTree char_literal417_tree=null;
		CommonTree char_literal419_tree=null;
		CommonTree char_literal420_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:752:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:752:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal414=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4269); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal414);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4271);
			instructionInclBreakContinue415=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue415.getTree());
			string_literal416=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4273); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal416);

			char_literal417=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4275); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal417);

			pushFollow(FOLLOW_expression_in_doWhileLoop4277);
			expression418=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression418.getTree());
			char_literal419=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4279); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal419);

			char_literal420=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4281); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal420);

			// AST REWRITE
			// elements: Do, instructionInclBreakContinue, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 752:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:752:72: ^( 'do' instructionInclBreakContinue expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Do.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal421=null;
		Token char_literal423=null;
		ParserRuleReturnScope instructionInclBreakContinue422 =null;
		ParserRuleReturnScope catchBlock424 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal421_tree=null;
		CommonTree char_literal423_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+
			{
			string_literal421=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4300); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal421);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4304); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:23: ( instructionInclBreakContinue )+
			int cnt123=0;
			loop123:
			do {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==Backslash||LA123_0==Break||LA123_0==Continue||LA123_0==Do||LA123_0==Echo||LA123_0==Exit||(LA123_0 >= For && LA123_0 <= Foreach)||(LA123_0 >= Identifier && LA123_0 <= If)||LA123_0==LeftCurlyBrace||LA123_0==MinusMinus||LA123_0==Parent||LA123_0==PlusPlus||LA123_0==Return||LA123_0==Self||(LA123_0 >= Switch && LA123_0 <= TypeString)||LA123_0==VariableId||LA123_0==While) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4306);
					instructionInclBreakContinue422=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue422.getTree());
					}
					break;

				default :
					if ( cnt123 >= 1 ) break loop123;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(123, input);
						throw eee;
				}
				cnt123++;
			} while (true);

			char_literal423=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal423);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:57: ( catchBlock )+
			int cnt124=0;
			loop124:
			do {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==Catch) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4311);
					catchBlock424=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock424.getTree());
					}
					break;

				default :
					if ( cnt124 >= 1 ) break loop124;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(124, input);
						throw eee;
				}
				cnt124++;
			} while (true);

			// AST REWRITE
			// elements: Try, instructionInclBreakContinue, catchBlock
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 756:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				if ( !(stream_instructionInclBreakContinue.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_instructionInclBreakContinue.hasNext() ) {
					adaptor.addChild(root_2, stream_instructionInclBreakContinue.nextTree());

				}
				stream_instructionInclBreakContinue.reset();

				adaptor.addChild(root_1, root_2);
				}

				if ( !(stream_catchBlock.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_catchBlock.hasNext() ) {
					adaptor.addChild(root_1, stream_catchBlock.nextTree());

				}
				stream_catchBlock.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:758:1: catchBlock : 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token catchBegin=null;
		Token string_literal425=null;
		Token char_literal426=null;
		Token VariableId428=null;
		Token char_literal429=null;
		Token char_literal431=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject427 =null;
		ParserRuleReturnScope instructionInclBreakContinue430 =null;

		CommonTree catchBegin_tree=null;
		CommonTree string_literal425_tree=null;
		CommonTree char_literal426_tree=null;
		CommonTree VariableId428_tree=null;
		CommonTree char_literal429_tree=null;
		CommonTree char_literal431_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Catch=new RewriteRuleTokenStream(adaptor,"token Catch");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:759:2: ( 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:759:4: 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal425=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock4341); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal425);

			char_literal426=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock4343); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal426);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4345);
			classInterfaceTypeWithoutObject427=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject427.getTree());
			VariableId428=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock4347); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId428);

			char_literal429=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock4349); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal429);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock4353); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:759:78: ( instructionInclBreakContinue )*
			loop125:
			do {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==Backslash||LA125_0==Break||LA125_0==Continue||LA125_0==Do||LA125_0==Echo||LA125_0==Exit||(LA125_0 >= For && LA125_0 <= Foreach)||(LA125_0 >= Identifier && LA125_0 <= If)||LA125_0==LeftCurlyBrace||LA125_0==MinusMinus||LA125_0==Parent||LA125_0==PlusPlus||LA125_0==Return||LA125_0==Self||(LA125_0 >= Switch && LA125_0 <= TypeString)||LA125_0==VariableId||LA125_0==While) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:759:78: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock4355);
					instructionInclBreakContinue430=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue430.getTree());
					}
					break;

				default :
					break loop125;
				}
			} while (true);

			char_literal431=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock4358); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal431);

			// AST REWRITE
			// elements: classInterfaceTypeWithoutObject, VariableId, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 760:3: -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:760:6: ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, "VARIABLE_DECLARATION_LIST")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject427!=null?((Token)classInterfaceTypeWithoutObject427.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:763:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:763:32: ( instructionInclBreakContinue )*
				while ( stream_instructionInclBreakContinue.hasNext() ) {
					adaptor.addChild(root_1, stream_instructionInclBreakContinue.nextTree());

				}
				stream_instructionInclBreakContinue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, catchBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchBlock"


	public static class throwException_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:1: throwException : 'throw' newObject ';' ;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal432=null;
		Token char_literal434=null;
		ParserRuleReturnScope newObject433 =null;

		CommonTree string_literal432_tree=null;
		CommonTree char_literal434_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:767:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:767:4: 'throw' newObject ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal432=(Token)match(input,Throw,FOLLOW_Throw_in_throwException4404); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal432_tree = 
			(CommonTree)adaptor.create(string_literal432)
			;
			adaptor.addChild(root_0, string_literal432_tree);
			}

			pushFollow(FOLLOW_newObject_in_throwException4406);
			newObject433=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject433.getTree());

			char_literal434=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException4408); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal434_tree = 
			(CommonTree)adaptor.create(char_literal434)
			;
			adaptor.addChild(root_0, char_literal434_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, throwException_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred70_TSPHP
	public final void synpred70_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred70_TSPHP2016);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred70_TSPHP2018); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred70_TSPHP

	// $ANTLR start synpred71_TSPHP
	public final void synpred71_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred71_TSPHP2024);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred71_TSPHP2026); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred71_TSPHP

	// $ANTLR start synpred80_TSPHP
	public final void synpred80_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: ( functionCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: functionCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP2072);
		functionCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred80_TSPHP2074); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred80_TSPHP

	// $ANTLR start synpred81_TSPHP
	public final void synpred81_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: ( methodCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: methodCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred81_TSPHP2080);
		methodCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred81_TSPHP2082); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred81_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred103_TSPHP2399); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred103_TSPHP2402);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred104_TSPHP2418); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred104_TSPHP2421);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred105_TSPHP
	public final void synpred105_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred105_TSPHP2437); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred105_TSPHP2440);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred105_TSPHP

	// $ANTLR start synpred106_TSPHP
	public final void synpred106_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred106_TSPHP2454);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred106_TSPHP2457);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred106_TSPHP

	// $ANTLR start synpred133_TSPHP
	public final void synpred133_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:4: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:519:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred133_TSPHP2766); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutResource_in_synpred133_TSPHP2768);
		allTypesWithoutResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred133_TSPHP2770); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred133_TSPHP2772);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred133_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: ( functionCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: functionCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP3046);
		functionCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred152_TSPHP
	public final void synpred152_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: ( methodCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: methodCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred152_TSPHP3051);
		methodCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred152_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred154_TSPHP3084);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred155_TSPHP
	public final void synpred155_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:4: ( functionCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:4: functionCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_functionCall_in_synpred155_TSPHP3082);
		functionCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: ( callOrAccess )*
		loop143:
		do {
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==ObjectOperator) ) {
				int LA143_1 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt143=1;
				}

			}
			else if ( (LA143_0==LeftSquareBrace) ) {
				alt143=1;
			}

			switch (alt143) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:17: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred155_TSPHP3084);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop143;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred155_TSPHP3087);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred155_TSPHP

	// $ANTLR start synpred159_TSPHP
	public final void synpred159_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred159_TSPHP3177);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred159_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: ( methodCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: methodCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_methodCall_in_synpred160_TSPHP3175);
		methodCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: ( callOrAccess )*
		loop144:
		do {
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==ObjectOperator) ) {
				int LA144_1 = input.LA(2);
				if ( (synpred159_TSPHP()) ) {
					alt144=1;
				}

			}
			else if ( (LA144_0==LeftSquareBrace) ) {
				alt144=1;
			}

			switch (alt144) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:16: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred160_TSPHP3177);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop144;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred160_TSPHP3180);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred164_TSPHP
	public final void synpred164_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred164_TSPHP3239);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred164_TSPHP

	// $ANTLR start synpred165_TSPHP
	public final void synpred165_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: ( variableMemberStaticMember )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: variableMemberStaticMember
		{
		pushFollow(FOLLOW_variableMemberStaticMember_in_synpred165_TSPHP3244);
		variableMemberStaticMember();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred165_TSPHP

	// $ANTLR start synpred166_TSPHP
	public final void synpred166_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:609:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:609:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred166_TSPHP3249);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred166_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred167_TSPHP3254);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred179_TSPHP
	public final void synpred179_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred179_TSPHP3844);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred179_TSPHP3846); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred179_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred180_TSPHP3857);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred180_TSPHP3859); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred180_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred182_TSPHP3893); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred182_TSPHP3898);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred185_TSPHP
	public final void synpred185_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: ( ( normalCase )+ defaultCase ( normalCase )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: ( normalCase )+ defaultCase ( normalCase )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: ( normalCase )+
		int cnt147=0;
		loop147:
		do {
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==Case) ) {
				alt147=1;
			}

			switch (alt147) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred185_TSPHP3962);
				normalCase();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				if ( cnt147 >= 1 ) break loop147;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(147, input);
					throw eee;
			}
			cnt147++;
		} while (true);

		pushFollow(FOLLOW_defaultCase_in_synpred185_TSPHP3965);
		defaultCase();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:28: ( normalCase )+
		int cnt148=0;
		loop148:
		do {
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==Case) ) {
				alt148=1;
			}

			switch (alt148) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:28: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred185_TSPHP3967);
				normalCase();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				if ( cnt148 >= 1 ) break loop148;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(148, input);
					throw eee;
			}
			cnt148++;
		} while (true);

		}

	}
	// $ANTLR end synpred185_TSPHP

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
	public final boolean synpred165_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred165_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred81_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred80_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred155_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred155_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred70_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_TSPHP_fragment(); // can never throw exception
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
	protected DFA50 dfa50 = new DFA50(this);
	protected DFA90 dfa90 = new DFA90(this);
	protected DFA102 dfa102 = new DFA102(this);
	protected DFA120 dfa120 = new DFA120(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\71\1\uffff\1\13\1\uffff\1\71\1\uffff\1\13";
	static final String DFA3_maxS =
		"\1\u0088\1\77\1\uffff\1\156\1\uffff\1\71\1\uffff\1\156";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\6\uffff\1\2\15\uffff\1\2\4\uffff\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\4\uffff"+
			"\1\1\11\uffff\1\2\2\uffff\1\2\7\uffff\1\2\6\uffff\1\2\7\uffff\14\2\2"+
			"\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\63\uffff\1\4\56\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\63\uffff\1\4\56\uffff\1\6"
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
			return "191:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA50_eotS =
		"\37\uffff";
	static final String DFA50_eofS =
		"\13\uffff\1\17\20\uffff\1\17\2\uffff";
	static final String DFA50_minS =
		"\1\13\10\u0086\1\71\1\13\1\7\1\71\1\uffff\1\13\2\uffff\1\13\10\u0086\1"+
		"\71\1\13\1\7\1\71\1\13";
	static final String DFA50_maxS =
		"\1\u0080\10\u0086\1\71\1\u0086\1\u0080\1\71\1\uffff\1\u0080\2\uffff\11"+
		"\u0086\1\71\1\u0086\1\150\1\71\1\u0086";
	static final String DFA50_acceptS =
		"\15\uffff\1\1\1\uffff\1\2\1\3\16\uffff";
	static final String DFA50_specialS =
		"\37\uffff}>";
	static final String[] DFA50_transitionS = {
			"\1\11\55\uffff\1\12\77\uffff\1\6\1\1\1\2\1\4\1\3\1\10\1\7\1\5",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\12",
			"\1\14\172\uffff\1\13",
			"\1\15\3\uffff\1\20\20\uffff\1\16\34\uffff\1\20\56\uffff\1\17\20\uffff"+
			"\10\20",
			"\1\21",
			"",
			"\1\32\55\uffff\1\33\77\uffff\1\27\1\22\1\23\1\25\1\24\1\31\1\30\1\26",
			"",
			"",
			"\1\14\172\uffff\1\13",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\33",
			"\1\35\172\uffff\1\34",
			"\1\20\24\uffff\1\17\113\uffff\1\17",
			"\1\36",
			"\1\35\172\uffff\1\34"
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
			return "361:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA90_eotS =
		"\10\uffff";
	static final String DFA90_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA90_minS =
		"\1\122\1\13\1\71\1\5\1\71\2\uffff\1\5";
	static final String DFA90_maxS =
		"\1\122\2\71\1\162\1\71\2\uffff\1\162";
	static final String DFA90_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA90_specialS =
		"\10\uffff}>";
	static final String[] DFA90_transitionS = {
			"\1\1",
			"\1\2\55\uffff\1\3",
			"\1\3",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\10\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\7\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\5\6\1\uffff\4\6\2\uffff\3\6\6\uffff\2\6\7\uffff\1\6\2\uffff"+
			"\2\6\4\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\10\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\7\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\5\6\1\uffff\4\6\2\uffff\3\6\6\uffff\2\6\7\uffff\1\6\2\uffff"+
			"\2\6\4\uffff\5\6"
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
			return "558:1: newObject : ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) );";
		}
	}

	static final String DFA102_eotS =
		"\12\uffff";
	static final String DFA102_eofS =
		"\12\uffff";
	static final String DFA102_minS =
		"\1\13\3\71\1\13\2\uffff\2\71\1\13";
	static final String DFA102_maxS =
		"\3\u0086\1\71\1\50\2\uffff\1\71\1\u0086\1\50";
	static final String DFA102_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA102_specialS =
		"\12\uffff}>";
	static final String[] DFA102_transitionS = {
			"\1\3\55\uffff\1\4\41\uffff\1\2\21\uffff\1\1\10\uffff\1\5\17\uffff\1\5",
			"\1\6\114\uffff\1\5",
			"\1\6\114\uffff\1\5",
			"\1\4",
			"\1\7\34\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\114\uffff\1\5",
			"\1\7\34\uffff\1\10"
	};

	static final short[] DFA102_eot = DFA.unpackEncodedString(DFA102_eotS);
	static final short[] DFA102_eof = DFA.unpackEncodedString(DFA102_eofS);
	static final char[] DFA102_min = DFA.unpackEncodedStringToUnsignedChars(DFA102_minS);
	static final char[] DFA102_max = DFA.unpackEncodedStringToUnsignedChars(DFA102_maxS);
	static final short[] DFA102_accept = DFA.unpackEncodedString(DFA102_acceptS);
	static final short[] DFA102_special = DFA.unpackEncodedString(DFA102_specialS);
	static final short[][] DFA102_transition;

	static {
		int numStates = DFA102_transitionS.length;
		DFA102_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA102_transition[i] = DFA.unpackEncodedString(DFA102_transitionS[i]);
		}
	}

	class DFA102 extends DFA {

		public DFA102(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 102;
			this.eot = DFA102_eot;
			this.eof = DFA102_eof;
			this.min = DFA102_min;
			this.max = DFA102_max;
			this.accept = DFA102_accept;
			this.special = DFA102_special;
			this.transition = DFA102_transition;
		}
		@Override
		public String getDescription() {
			return "603:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )";
		}
	}

	static final String DFA120_eotS =
		"\11\uffff";
	static final String DFA120_eofS =
		"\11\uffff";
	static final String DFA120_minS =
		"\1\10\1\uffff\1\100\1\71\1\7\1\uffff\1\13\1\71\1\13";
	static final String DFA120_maxS =
		"\1\u0086\1\uffff\1\u0086\1\71\1\u0086\1\uffff\1\u0086\1\71\1\u0086";
	static final String DFA120_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA120_specialS =
		"\11\uffff}>";
	static final String[] DFA120_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\6\uffff\1\5\26\uffff\1\5\7\uffff"+
			"\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5\5\uffff"+
			"\1\5\3\uffff\1\5\4\uffff\2\5\1\uffff\1\5\16\uffff\2\5\5\uffff\1\5\1\uffff"+
			"\1\5\2\uffff\1\2\7\1\5\uffff\1\5",
			"",
			"\1\5\105\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\11\uffff\1\5\5\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\5\5\1\uffff\4\5\2\uffff\3\5\6\uffff\2\5\7\uffff\1\5\10\uffff"+
			"\5\5\23\uffff\1\1",
			"",
			"\1\7\34\uffff\1\5\27\uffff\1\5\105\uffff\1\1",
			"\1\10",
			"\1\7\34\uffff\1\5\27\uffff\1\5\105\uffff\1\1"
	};

	static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
	static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
	static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
	static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
	static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
	static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
	static final short[][] DFA120_transition;

	static {
		int numStates = DFA120_transitionS.length;
		DFA120_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
		}
	}

	class DFA120 extends DFA {

		public DFA120(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 120;
			this.eot = DFA120_eot;
			this.eof = DFA120_eof;
			this.min = DFA120_min;
			this.max = DFA120_max;
			this.accept = DFA120_accept;
			this.special = DFA120_special;
			this.transition = DFA120_transition;
		}
		@Override
		public String getDescription() {
			return "735:1: varListOrExprList : ( variableDeclarationList -> ^( VARIABLE_DECLARATION_LIST variableDeclarationList ) | expressionList );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_EOF_in_prog971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_EOF_in_prog980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog986 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1002 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1004 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1006 = new BitSet(new long[]{0xC61D481042000810L,0xFFE0204048001000L,0x0000000000000149L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1008 = new BitSet(new long[]{0xC61D481042000812L,0xFFE0204048001000L,0x0000000000000149L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1021 = new BitSet(new long[]{0x8200000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1023 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1026 = new BitSet(new long[]{0xC61D481042000810L,0xFFE0204048001000L,0x0000000000000149L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1028 = new BitSet(new long[]{0xC61D481042000810L,0xFFE020C048001000L,0x0000000000000149L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1127 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1130 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1132 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1147 = new BitSet(new long[]{0xC61D481042000812L,0xFFE0204048001000L,0x0000000000000149L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1180 = new BitSet(new long[]{0x0200000000000800L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1182 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1185 = new BitSet(new long[]{0x0200000000000800L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1187 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1204 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1206 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1208 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1217 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1218 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1230 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1282 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1284 = new BitSet(new long[]{0x8800800000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1286 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1289 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1292 = new BitSet(new long[]{0x0011000040000010L,0x0008001880000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1294 = new BitSet(new long[]{0x0011000040000010L,0x0008009880000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1311 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1324 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1327 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1329 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1342 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1379 = new BitSet(new long[]{0x0000000000000000L,0x3C00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1381 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1383 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1386 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1388 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1402 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1405 = new BitSet(new long[]{0x2202000000080000L,0x0010000010400400L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1417 = new BitSet(new long[]{0x0000000000000000L,0x0000001880000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1420 = new BitSet(new long[]{0x0200000000000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1422 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1461 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1464 = new BitSet(new long[]{0x0200000000000800L,0x0040200048001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1467 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1469 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1488 = new BitSet(new long[]{0x0010000000000000L,0x0000001800000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1490 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1504 = new BitSet(new long[]{0x0011000000000000L,0x0000001880000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1506 = new BitSet(new long[]{0x0010000000000000L,0x0000001880000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1514 = new BitSet(new long[]{0x0010000000000000L,0x0008001880000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1516 = new BitSet(new long[]{0x0010000000000000L,0x0000001880000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1530 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1549 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1551 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1553 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1556 = new BitSet(new long[]{0x0010000040000000L,0x0000009000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1558 = new BitSet(new long[]{0x0010000040000000L,0x0000009000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1588 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1591 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1611 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1613 = new BitSet(new long[]{0x860C481000000800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1615 = new BitSet(new long[]{0x860C481000000800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1630 = new BitSet(new long[]{0x0200000000000800L,0xFE00000000000000L,0x0000000000000081L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1632 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1636 = new BitSet(new long[]{0x0200000000000800L,0xFE00010000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1638 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBool_in_primitiveTypes1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBoolean_in_primitiveTypes1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeInt_in_primitiveTypes1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeFloat_in_primitiveTypes1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeString_in_primitiveTypes1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1774 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classInterfaceTypeWithoutObject1779 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1782 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classInterfaceTypeWithoutObject1786 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1837 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1840 = new BitSet(new long[]{0x0200000000000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1842 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1849 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1852 = new BitSet(new long[]{0x0200000000000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1854 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1861 = new BitSet(new long[]{0x0200000010000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1864 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1866 = new BitSet(new long[]{0x0200000010000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_Comma_in_paramList1871 = new BitSet(new long[]{0x0200000000000800L,0xFE00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1873 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1899 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1902 = new BitSet(new long[]{0x2202000000080000L,0x0010000010400400L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1930 = new BitSet(new long[]{0x860C481000000800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1932 = new BitSet(new long[]{0x860C481000000800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1967 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1969 = new BitSet(new long[]{0x860C481080100800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1993 = new BitSet(new long[]{0x2000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2000 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2016 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2024 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction2072 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction2080 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2089 = new BitSet(new long[]{0x2202000004084900L,0x0250600058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_instruction2091 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2100 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_instruction2103 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Comma_in_instruction2106 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_instruction2109 = new BitSet(new long[]{0x0000000010000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2119 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2134 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2137 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_expressionList2139 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2168 = new BitSet(new long[]{0x0000008800052080L,0x0005000020014800L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2170 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_variableAssignment2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000040001000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2315 = new BitSet(new long[]{0x0200000000000800L,0x0040200008000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2344 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2347 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2384 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2399 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2418 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2437 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_ternary_in_assignment2451 = new BitSet(new long[]{0x0000008800052082L,0x0005000020014800L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2454 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_ternary_in_assignment2457 = new BitSet(new long[]{0x0000008800052082L,0x0005000020014800L});
	public static final BitSet FOLLOW_logicOr_in_ternary2467 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2470 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_ternary2473 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2475 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_ternary2478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2491 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2506 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2520 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2523 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2526 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2537 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2540 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2543 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2554 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2557 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2560 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_comparison_in_equality2569 = new BitSet(new long[]{0x0100200000000002L,0x0000000000380000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2572 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_comparison_in_equality2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2617 = new BitSet(new long[]{0x0060000000000002L,0x000000000000000CL});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2620 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2659 = new BitSet(new long[]{0x0000000000000002L,0x0002800000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2662 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2669 = new BitSet(new long[]{0x0000000000000002L,0x0002800000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2679 = new BitSet(new long[]{0x0000004000000002L,0x0000000010000400L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2682 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2691 = new BitSet(new long[]{0x0000004000000002L,0x0000000010000400L});
	public static final BitSet FOLLOW_logicNot_in_factor2701 = new BitSet(new long[]{0x0000000400000002L,0x000000000000A000L});
	public static final BitSet FOLLOW_set_in_factor2704 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicNot_in_factor2713 = new BitSet(new long[]{0x0000000400000002L,0x000000000000A000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2722 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2741 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2744 = new BitSet(new long[]{0x0200000000000800L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2766 = new BitSet(new long[]{0x0200000000000800L,0x7E00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2768 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2770 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441403L,0x0000000000000040L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2788 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441403L,0x0000000000000040L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2796 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441403L,0x0000000000000040L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2816 = new BitSet(new long[]{0x0200000000000800L,0x0040200008000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_newOrClone2819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_newOrClone2829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2844 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2846 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2852 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2854 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2860 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2862 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccessOrParent2884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccessOrParent2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2894 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_memberAccessOrArrayAccess2906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccess2921 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccess2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2933 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2935 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2950 = new BitSet(new long[]{0x0200000000000800L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2954 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_newObject2956 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2973 = new BitSet(new long[]{0x0200000000000800L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3000 = new BitSet(new long[]{0x2202000000080800L,0x0250200048401003L,0x0000000000000040L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3020 = new BitSet(new long[]{0x2202000000080800L,0x0250200048401003L,0x0000000000000040L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary3046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary3051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd3068 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd3070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd3082 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd3092 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd3094 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall3108 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_functionCall3110 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall3112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess3123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3141 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call3145 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_call3147 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd3159 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd3161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3185 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3187 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_methodCall3201 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall3203 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_methodCall3208 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall3213 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_methodCall3215 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall3216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3226 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_atom3228 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_atom3244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3287 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3301 = new BitSet(new long[]{0x2202000000080000L,0x0010000000400000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3308 = new BitSet(new long[]{0x2202000000080000L,0x0010000000400000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3813 = new BitSet(new long[]{0x2202000004084900L,0x0250220058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_array_content_in_array3815 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3826 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_array_content_in_array3828 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3844 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3846 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_array_content3850 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3854 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_array_content3857 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3859 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_array_content3863 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3877 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_ifCondition3879 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3881 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3886 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3893 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3933 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3935 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3937 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition3939 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent3962 = new BitSet(new long[]{0x0000000200800000L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent3965 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_normalCase_in_switchContent3967 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent3974 = new BitSet(new long[]{0x0000000200800002L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent3977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCase3989 = new BitSet(new long[]{0x860C481080900800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCase3992 = new BitSet(new long[]{0x860C481080100802L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCase4023 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCase4025 = new BitSet(new long[]{0x860C481080100802L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_Case_in_caseLabel4053 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_caseLabel4056 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4068 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop4082 = new BitSet(new long[]{0x2202000004084900L,0xFE50200058441443L,0x0000000000000041L});
	public static final BitSet FOLLOW_forInit_in_forLoop4084 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop4086 = new BitSet(new long[]{0x2202000004084900L,0x0250600058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_forLoop4088 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop4091 = new BitSet(new long[]{0x2202000004084900L,0x0250210058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expressionList_in_forLoop4093 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop4095 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varListOrExprList_in_forInit4119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarationList_in_varListOrExprList4130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_varListOrExprList4143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList4154 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationList4157 = new BitSet(new long[]{0x0200000000000800L,0x0040200048001000L,0x0000000000000040L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationList4160 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4176 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4178 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop4180 = new BitSet(new long[]{0x0200000000000800L,0x7E00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4189 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4191 = new BitSet(new long[]{0x0200000000000800L,0x7E00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_foreachLoop4197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4201 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4203 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4243 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_whileLoop4245 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4247 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4269 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4275 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4277 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4279 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4300 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4304 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4306 = new BitSet(new long[]{0x860C481080100800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4309 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4311 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock4343 = new BitSet(new long[]{0x0200000000000800L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock4347 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock4349 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock4353 = new BitSet(new long[]{0x860C481080100800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock4355 = new BitSet(new long[]{0x860C481080100800L,0xFFE020C048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock4358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException4404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_newObject_in_throwException4406 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException4408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred70_TSPHP2016 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred70_TSPHP2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred71_TSPHP2024 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred71_TSPHP2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP2072 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred80_TSPHP2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred81_TSPHP2080 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred81_TSPHP2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred103_TSPHP2399 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred103_TSPHP2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred104_TSPHP2418 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred104_TSPHP2421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred105_TSPHP2437 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_assignment_in_synpred105_TSPHP2440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred106_TSPHP2454 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441443L,0x0000000000000040L});
	public static final BitSet FOLLOW_ternary_in_synpred106_TSPHP2457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred133_TSPHP2766 = new BitSet(new long[]{0x0200000000000800L,0x7E00000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_synpred133_TSPHP2768 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred133_TSPHP2770 = new BitSet(new long[]{0x2202000004084900L,0x0250200058441403L,0x0000000000000040L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred133_TSPHP2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP3046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred152_TSPHP3051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred154_TSPHP3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_synpred155_TSPHP3082 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred155_TSPHP3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_call_in_synpred155_TSPHP3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred159_TSPHP3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_synpred160_TSPHP3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred160_TSPHP3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_call_in_synpred160_TSPHP3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred164_TSPHP3239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_synpred165_TSPHP3244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred166_TSPHP3249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred167_TSPHP3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred179_TSPHP3844 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred179_TSPHP3846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred180_TSPHP3857 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred180_TSPHP3859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred182_TSPHP3893 = new BitSet(new long[]{0x860C481080100800L,0xFFE0204048001000L,0x0000000000000141L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred182_TSPHP3898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_synpred185_TSPHP3962 = new BitSet(new long[]{0x0000000200800000L});
	public static final BitSet FOLLOW_defaultCase_in_synpred185_TSPHP3965 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_normalCase_in_synpred185_TSPHP3967 = new BitSet(new long[]{0x0000000000800002L});
}
