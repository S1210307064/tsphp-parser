// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-20 23:46:25

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CLASS_INTERFACE_TYPE", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
	};

	public static final int EOF=-1;
	public static final int ARRAY_ACCESS=4;
	public static final int Abstract=5;
	public static final int Arrow=6;
	public static final int As=7;
	public static final int Assign=8;
	public static final int At=9;
	public static final int BINARY=10;
	public static final int BLOCK=11;
	public static final int Backslash=12;
	public static final int BitwiseAnd=13;
	public static final int BitwiseAndEqual=14;
	public static final int BitwiseNot=15;
	public static final int BitwiseOr=16;
	public static final int BitwiseOrEqual=17;
	public static final int BitwiseXor=18;
	public static final int BitwiseXorEqual=19;
	public static final int Bool=20;
	public static final int Break=21;
	public static final int CAST=22;
	public static final int CLASS_INTERFACE_TYPE=23;
	public static final int Case=24;
	public static final int Catch=25;
	public static final int Class=26;
	public static final int Clone=27;
	public static final int Colon=28;
	public static final int Comma=29;
	public static final int Comment=30;
	public static final int Const=31;
	public static final int Continue=32;
	public static final int DECIMAL=33;
	public static final int Default=34;
	public static final int Divide=35;
	public static final int DivideEqual=36;
	public static final int Do=37;
	public static final int Dolar=38;
	public static final int Dot=39;
	public static final int DotEqual=40;
	public static final int DoubleColon=41;
	public static final int EXPONENT=42;
	public static final int EXPRESSION_LIST=43;
	public static final int Echo=44;
	public static final int Else=45;
	public static final int Equal=46;
	public static final int Exit=47;
	public static final int Extends=48;
	public static final int FUNCTION_CALL=49;
	public static final int FUNCTION_DECLARATION=50;
	public static final int Final=51;
	public static final int Float=52;
	public static final int For=53;
	public static final int Foreach=54;
	public static final int Function=55;
	public static final int GreaterEqualThan=56;
	public static final int GreaterThan=57;
	public static final int HEXADECIMAL=58;
	public static final int Identical=59;
	public static final int Identifier=60;
	public static final int If=61;
	public static final int Implements=62;
	public static final int Instanceof=63;
	public static final int Int=64;
	public static final int Interface=65;
	public static final int LeftCurlyBrace=66;
	public static final int LeftParanthesis=67;
	public static final int LeftSquareBrace=68;
	public static final int LessEqualThan=69;
	public static final int LessThan=70;
	public static final int LogicAnd=71;
	public static final int LogicAndWeak=72;
	public static final int LogicNot=73;
	public static final int LogicOr=74;
	public static final int LogicOrWeak=75;
	public static final int LogicXorWeak=76;
	public static final int MEMBER_ACCESS=77;
	public static final int MEMBER_ACCESS_STATIC=78;
	public static final int METHOD_CALL=79;
	public static final int Minus=80;
	public static final int MinusEqual=81;
	public static final int MinusMinus=82;
	public static final int Modulo=83;
	public static final int ModuloEqual=84;
	public static final int Multiply=85;
	public static final int MultiplyEqual=86;
	public static final int Namespace=87;
	public static final int New=88;
	public static final int NotEqual=89;
	public static final int NotEqualAlternative=90;
	public static final int NotIdentical=91;
	public static final int Null=92;
	public static final int OCTAL=93;
	public static final int ObjectOperator=94;
	public static final int PARAM_DECLARATION=95;
	public static final int PARAM_LIST=96;
	public static final int POST_INCREMENT_DECREMENT=97;
	public static final int PRE_INCREMENT_DECREMENT=98;
	public static final int Parent=99;
	public static final int ParentColonColon=100;
	public static final int Plus=101;
	public static final int PlusEqual=102;
	public static final int PlusPlus=103;
	public static final int Private=104;
	public static final int ProtectThis=105;
	public static final int Protected=106;
	public static final int Public=107;
	public static final int QuestionMark=108;
	public static final int Return=109;
	public static final int RightCurlyBrace=110;
	public static final int RightParanthesis=111;
	public static final int RightSquareBrace=112;
	public static final int STRING_DOUBLE_QUOTED=113;
	public static final int STRING_SINGLE_QUOTED=114;
	public static final int SWITCH_CASES=115;
	public static final int Self=116;
	public static final int SelfColonColon=117;
	public static final int Semicolon=118;
	public static final int ShiftLeft=119;
	public static final int ShiftLeftEqual=120;
	public static final int ShiftRight=121;
	public static final int ShiftRightEqual=122;
	public static final int Static=123;
	public static final int String=124;
	public static final int Switch=125;
	public static final int This=126;
	public static final int Throw=127;
	public static final int Try=128;
	public static final int TypeArray=129;
	public static final int TypeBool=130;
	public static final int TypeBoolean=131;
	public static final int TypeFloat=132;
	public static final int TypeInt=133;
	public static final int TypeObject=134;
	public static final int TypeResource=135;
	public static final int TypeString=136;
	public static final int UMINUS=137;
	public static final int UPLUS=138;
	public static final int Use=139;
	public static final int VARIABLE_DECLARATION=140;
	public static final int VARIABLE_DECLARATION_LIST=141;
	public static final int VariableId=142;
	public static final int Void=143;
	public static final int While=144;
	public static final int Whitespace=145;

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
		this.state.ruleMemo = new HashMap[303+1];
		 

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1000);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1003); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:200:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1009);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1012); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1018);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1020); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1034); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1036);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1038); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==ParentColonColon||LA4_0==PlusPlus||LA4_0==Return||LA4_0==SelfColonColon||(LA4_0 >= Switch && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:205:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1040);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1053); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1055);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1058); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==ParentColonColon||LA6_0==PlusPlus||LA6_0==Return||LA6_0==SelfColonColon||(LA6_0 >= Switch && LA6_0 <= TypeString)||LA6_0==Use||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1060);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1063); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier16);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1162); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal17);

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1164); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier18);

					}
					break;

				default :
					break loop7;
				}
			} while (true);

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 219:34: -> ( Identifier )+
			{
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_0, 
					stream_Identifier.nextNode()
					);

				}
				stream_Identifier.reset();

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==ParentColonColon||LA8_0==PlusPlus||LA8_0==Return||LA8_0==SelfColonColon||(LA8_0 >= Switch && LA8_0 <= TypeString)||LA8_0==Use||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1184);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
			case ParentColonColon:
			case PlusPlus:
			case Return:
			case SelfColonColon:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1195);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1200);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1205);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:232:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1217); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1219);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1222); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1224);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1228); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1241); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1245);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:6: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1253); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1255);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1268); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1281);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1286);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1291);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1296);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1318); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1320); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1322);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1325);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1328); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1330);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1333); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1349);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1360); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1365); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1378); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1380);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1392);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1397);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1403);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1415); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(CommonTree)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1417);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1419);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(CommonTree)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1424);
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

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1428); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1438); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(CommonTree)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1441); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(CommonTree)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1443);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:4: 'static'
					{
					string_literal66=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1453); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal66_tree = 
					(CommonTree)adaptor.create(string_literal66)
					;
					adaptor.addChild(root_0, string_literal66_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1456);
			accessor67=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor67.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1458);
			variableDeclarationListInclVariableId68=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId68.getTree());

			char_literal69=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1460); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1467);
					accessorWithoutPrivate70=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate70.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal71=(Token)match(input,Private,FOLLOW_Private_in_accessor1472); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set72=null;

		CommonTree set72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1497);
			variableDeclaration73=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration73.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal74=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1500); if (state.failed) return retval;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:30: ( variableAssignment | VariableId )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==VariableId) ) {
						int LA23_1 = input.LA(2);
						if ( (LA23_1==Assign||LA23_1==BitwiseAndEqual||LA23_1==BitwiseOrEqual||LA23_1==BitwiseXorEqual||LA23_1==DivideEqual||LA23_1==DotEqual||LA23_1==MinusEqual||LA23_1==ModuloEqual||LA23_1==MultiplyEqual||LA23_1==PlusEqual||LA23_1==ShiftLeftEqual||LA23_1==ShiftRightEqual) ) {
							alt23=1;
						}
						else if ( (LA23_1==EOF||LA23_1==Comma||LA23_1==Semicolon) ) {
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
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1504);
							variableAssignment75=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment75.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:50: VariableId
							{
							VariableId76=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1506); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1525); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal77_tree = 
					(CommonTree)adaptor.create(string_literal77)
					;
					adaptor.addChild(root_0, string_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1527);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:6: 'static' ( 'final' )?
							{
							string_literal79=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1541); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = 
							(CommonTree)adaptor.create(string_literal79)
							;
							adaptor.addChild(root_0, string_literal79_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:15: 'final'
									{
									string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1543); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:6: 'final' ( 'static' )?
							{
							string_literal81=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1551); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal81_tree = 
							(CommonTree)adaptor.create(string_literal81)
							;
							adaptor.addChild(root_0, string_literal81_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:14: 'static'
									{
									string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1553); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1567);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1574);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal85=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1586); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal85_tree = 
			(CommonTree)adaptor.create(string_literal85)
			;
			adaptor.addChild(root_0, string_literal85_tree);
			}

			Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1588); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier86_tree = 
			(CommonTree)adaptor.create(Identifier86)
			;
			adaptor.addChild(root_0, Identifier86_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1590);
					implementsDeclaration87=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration87.getTree());

					}
					break;

			}

			char_literal88=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1593); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = 
			(CommonTree)adaptor.create(char_literal88)
			;
			adaptor.addChild(root_0, char_literal88_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1595);
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

			char_literal90=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1598); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList91 =null;
		ParserRuleReturnScope interfaceMethodDeclaration92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1609);
					constDeclarationList91=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList91.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1614);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:4: 'public'
					{
					string_literal93=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1625); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = 
					(CommonTree)adaptor.create(string_literal93)
					;
					adaptor.addChild(root_0, string_literal93_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1628);
			functionDeclarationWithoutBody94=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody94.getTree());

			char_literal95=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1630); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK ( instructionWithoutBreakContinue )* ) ) ;
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
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_functionDeclarationWithoutBody=new RewriteRuleSubtreeStream(adaptor,"rule functionDeclarationWithoutBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1647);
			functionDeclarationWithoutBody96=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody96.getTree());
			char_literal97=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1649); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal97);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:39: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==ParentColonColon||LA35_0==PlusPlus||LA35_0==Return||LA35_0==SelfColonColon||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:39: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1651);
					instructionWithoutBreakContinue98=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue98.getTree());
					}
					break;

				default :
					break loop35;
				}
			} while (true);

			char_literal99=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1654); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal99);

			// AST REWRITE
			// elements: functionDeclarationWithoutBody, instructionWithoutBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 324:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody96!=null?((Token)functionDeclarationWithoutBody96.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:122: ^( BLOCK ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, "BLOCK")
				, root_2);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:130: ( instructionWithoutBreakContinue )*
				while ( stream_instructionWithoutBreakContinue.hasNext() ) {
					adaptor.addChild(root_2, stream_instructionWithoutBreakContinue.nextTree());

				}
				stream_instructionWithoutBreakContinue.reset();

				adaptor.addChild(root_1, root_2);
				}

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier '(' ! paramList ')' !;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:2: ( 'function' ! returnType Identifier '(' ! paramList ')' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: 'function' ! returnType Identifier '(' ! paramList ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal100=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1685); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1688);
			returnType101=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType101.getTree());

			Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1690); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier102_tree = 
			(CommonTree)adaptor.create(Identifier102)
			;
			adaptor.addChild(root_0, Identifier102_tree);
			}

			char_literal103=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1692); if (state.failed) return retval;
			pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1695);
			paramList104=paramList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList104.getTree());

			char_literal105=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1697); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: returnType : ( allTypes | 'void' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:2: ( allTypes | 'void' )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			else if ( (LA36_0==Void) ) {
				alt36=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1710);
					allTypes106=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal107=(Token)match(input,Void,FOLLOW_Void_in_returnType1714); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended108 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= TypeArray && LA37_0 <= TypeInt)||(LA37_0 >= TypeResource && LA37_0 <= TypeString)) ) {
				alt37=1;
			}
			else if ( (LA37_0==Backslash||LA37_0==Identifier||LA37_0==TypeObject) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:11: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1723);
					primitiveTypesExtended108=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:36: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1727);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:1: allTypesWithoutResource : ( primitiveTypesInclArray | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypesWithoutResource_return allTypesWithoutResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutResource_return retval = new TSPHPParser.allTypesWithoutResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray110 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject111 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:2: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= TypeArray && LA38_0 <= TypeInt)||LA38_0==TypeString) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1738);
					primitiveTypesInclArray110=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray110.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:5: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1744);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:1: primitiveTypes : ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:2: ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString )
			int alt39=5;
			switch ( input.LA(1) ) {
			case TypeBool:
				{
				alt39=1;
				}
				break;
			case TypeBoolean:
				{
				alt39=2;
				}
				break;
			case TypeInt:
				{
				alt39=3;
				}
				break;
			case TypeFloat:
				{
				alt39=4;
				}
				break;
			case TypeString:
				{
				alt39=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: TypeBool
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeBool112=(Token)match(input,TypeBool,FOLLOW_TypeBool_in_primitiveTypes1755); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeBool112_tree = 
					(CommonTree)adaptor.create(TypeBool112)
					;
					adaptor.addChild(root_0, TypeBool112_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: bool= TypeBoolean
					{
					bool=(Token)match(input,TypeBoolean,FOLLOW_TypeBoolean_in_primitiveTypes1764); if (state.failed) return retval; 
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
					// 345:23: -> TypeBool[$bool,\"bool\"]
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:4: TypeInt
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeInt113=(Token)match(input,TypeInt,FOLLOW_TypeInt_in_primitiveTypes1774); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeInt113_tree = 
					(CommonTree)adaptor.create(TypeInt113)
					;
					adaptor.addChild(root_0, TypeInt113_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: TypeFloat
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeFloat114=(Token)match(input,TypeFloat,FOLLOW_TypeFloat_in_primitiveTypes1779); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeFloat114_tree = 
					(CommonTree)adaptor.create(TypeFloat114)
					;
					adaptor.addChild(root_0, TypeFloat114_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: TypeString
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeString115=(Token)match(input,TypeString,FOLLOW_TypeString_in_primitiveTypes1784); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:2: ( primitiveTypes | TypeArray )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= TypeBool && LA40_0 <= TypeInt)||LA40_0==TypeString) ) {
				alt40=1;
			}
			else if ( (LA40_0==TypeArray) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1796);
					primitiveTypes116=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray117=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1801); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:2: ( primitiveTypesInclArray | TypeResource )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= TypeArray && LA41_0 <= TypeInt)||LA41_0==TypeString) ) {
				alt41=1;
			}
			else if ( (LA41_0==TypeResource) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1813);
					primitiveTypesInclArray118=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray118.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource119=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1818); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token root=null;
		ParserRuleReturnScope namespaceId120 =null;

		CommonTree root_tree=null;
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:8: (root= '\\\\' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Backslash) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1831); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1834);
			namespaceId120=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId120.getTree());
			// AST REWRITE
			// elements: namespaceId, root
			// token labels: root
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleTokenStream stream_root=new RewriteRuleTokenStream(adaptor,"token root",root);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 362:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:31: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:118: ( $root)?
				if ( stream_root.hasNext() ) {
					adaptor.addChild(root_1, stream_root.nextNode());

				}
				stream_root.reset();

				adaptor.addChild(root_1, stream_namespaceId.nextTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==TypeObject) ) {
				alt43=1;
			}
			else if ( (LA43_0==Backslash||LA43_0==Identifier) ) {
				alt43=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject121=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1861); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject121_tree = 
					(CommonTree)adaptor.create(TypeObject121)
					;
					adaptor.addChild(root_0, TypeObject121_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1867);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclarationOptional )+ ) | paramDeclaration ( ',' paramDeclaration )* ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclaration )+ ( paramDeclarationOptional )* ) | -> PARAM_LIST );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal124=null;
		Token char_literal127=null;
		Token char_literal129=null;
		ParserRuleReturnScope paramDeclarationOptional123 =null;
		ParserRuleReturnScope paramDeclarationOptional125 =null;
		ParserRuleReturnScope paramDeclaration126 =null;
		ParserRuleReturnScope paramDeclaration128 =null;
		ParserRuleReturnScope paramDeclarationOptional130 =null;

		CommonTree char_literal124_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree char_literal129_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_paramDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclaration");
		RewriteRuleSubtreeStream stream_paramDeclarationOptional=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationOptional");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclarationOptional )+ ) | paramDeclaration ( ',' paramDeclaration )* ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclaration )+ ( paramDeclarationOptional )* ) | -> PARAM_LIST )
			int alt47=3;
			alt47 = dfa47.predict(input);
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1879);
					paramDeclarationOptional123=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramDeclarationOptional.add(paramDeclarationOptional123.getTree());
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:29: ( ',' paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:30: ',' paramDeclarationOptional
							{
							char_literal124=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1882); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(char_literal124);

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1884);
							paramDeclarationOptional125=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramDeclarationOptional.add(paramDeclarationOptional125.getTree());
							}
							break;

						default :
							break loop44;
						}
					} while (true);

					// AST REWRITE
					// elements: paramDeclarationOptional
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 372:61: -> ^( PARAM_LIST ( paramDeclarationOptional )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:64: ^( PARAM_LIST ( paramDeclarationOptional )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(PARAM_LIST, "PARAM_LIST")
						, root_1);

						if ( !(stream_paramDeclarationOptional.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_paramDeclarationOptional.hasNext() ) {
							adaptor.addChild(root_1, stream_paramDeclarationOptional.nextTree());

						}
						stream_paramDeclarationOptional.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:4: paramDeclaration ( ',' paramDeclaration )* ( ',' paramDeclarationOptional )*
					{
					pushFollow(FOLLOW_paramDeclaration_in_paramList1900);
					paramDeclaration126=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramDeclaration.add(paramDeclaration126.getTree());
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:21: ( ',' paramDeclaration )*
					loop45:
					do {
						int alt45=2;
						alt45 = dfa45.predict(input);
						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:22: ',' paramDeclaration
							{
							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1903); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(char_literal127);

							pushFollow(FOLLOW_paramDeclaration_in_paramList1905);
							paramDeclaration128=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramDeclaration.add(paramDeclaration128.getTree());
							}
							break;

						default :
							break loop45;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:45: ( ',' paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:46: ',' paramDeclarationOptional
							{
							char_literal129=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1910); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(char_literal129);

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1912);
							paramDeclarationOptional130=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramDeclarationOptional.add(paramDeclarationOptional130.getTree());
							}
							break;

						default :
							break loop46;
						}
					} while (true);

					// AST REWRITE
					// elements: paramDeclaration, paramDeclarationOptional
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 373:77: -> ^( PARAM_LIST ( paramDeclaration )+ ( paramDeclarationOptional )* )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:79: ^( PARAM_LIST ( paramDeclaration )+ ( paramDeclarationOptional )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(PARAM_LIST, "PARAM_LIST")
						, root_1);

						if ( !(stream_paramDeclaration.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_paramDeclaration.hasNext() ) {
							adaptor.addChild(root_1, stream_paramDeclaration.nextTree());

						}
						stream_paramDeclaration.reset();

						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:110: ( paramDeclarationOptional )*
						while ( stream_paramDeclarationOptional.hasNext() ) {
							adaptor.addChild(root_1, stream_paramDeclarationOptional.nextTree());

						}
						stream_paramDeclarationOptional.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:14: 
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
					// 374:14: -> PARAM_LIST
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(PARAM_LIST, "PARAM_LIST")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:1: paramDeclaration : allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId132=null;
		ParserRuleReturnScope allTypes131 =null;

		CommonTree VariableId132_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:2: ( allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1946);
			allTypes131=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes131.getTree());
			VariableId132=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1948); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId132);

			// AST REWRITE
			// elements: VariableId, allTypes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 378:24: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:27: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, (allTypes131!=null?((Token)allTypes131.start):null), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal134=null;
		ParserRuleReturnScope paramDeclaration133 =null;
		ParserRuleReturnScope unaryPrimitiveAtom135 =null;

		CommonTree char_literal134_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1969);
			paramDeclaration133=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration133.getTree());

			char_literal134=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1972); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal134_tree = 
			(CommonTree)adaptor.create(char_literal134)
			;
			adaptor.addChild(root_0, char_literal134_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1974);
			unaryPrimitiveAtom135=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom135.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal137=null;
		ParserRuleReturnScope instructionWithoutBreakContinue136 =null;
		ParserRuleReturnScope instruction138 =null;

		CommonTree block_tree=null;
		CommonTree char_literal137_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:2: (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LeftCurlyBrace) ) {
				alt49=1;
			}
			else if ( (LA49_0==Backslash||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= For && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==MinusMinus||LA49_0==ParentColonColon||LA49_0==PlusPlus||LA49_0==Return||LA49_0==SelfColonColon||(LA49_0 >= Switch && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:4: block= '{' ( instructionWithoutBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:16: ( instructionWithoutBreakContinue )+
					int cnt48=0;
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Backslash||LA48_0==Do||LA48_0==Echo||LA48_0==Exit||(LA48_0 >= For && LA48_0 <= Foreach)||(LA48_0 >= Identifier && LA48_0 <= If)||LA48_0==LeftCurlyBrace||LA48_0==MinusMinus||LA48_0==ParentColonColon||LA48_0==PlusPlus||LA48_0==Return||LA48_0==SelfColonColon||(LA48_0 >= Switch && LA48_0 <= TypeString)||LA48_0==VariableId||LA48_0==While) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2002);
							instructionWithoutBreakContinue136=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue136.getTree());
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

					char_literal137=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2006); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal137);

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
					// 387:54: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:57: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2021);
					instruction138=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction138.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal140=null;
		Token set142=null;
		Token Int143=null;
		Token char_literal144=null;
		ParserRuleReturnScope instructionInclBreakContinue139 =null;
		ParserRuleReturnScope instruction141 =null;

		CommonTree block_tree=null;
		CommonTree char_literal140_tree=null;
		CommonTree set142_tree=null;
		CommonTree Int143_tree=null;
		CommonTree char_literal144_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:2: (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
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
			case ParentColonColon:
			case PlusPlus:
			case Return:
			case SelfColonColon:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:4: block= '{' ( instructionInclBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2037); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:17: ( instructionInclBreakContinue )+
					int cnt50=0;
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==Backslash||LA50_0==Break||LA50_0==Continue||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==LeftCurlyBrace||LA50_0==MinusMinus||LA50_0==ParentColonColon||LA50_0==PlusPlus||LA50_0==Return||LA50_0==SelfColonColon||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2039);
							instructionInclBreakContinue139=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue139.getTree());
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

					char_literal140=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2043); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal140);

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
					// 392:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2058);
					instruction141=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction141.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set142=(Token)input.LT(1);
					set142=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set142)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:26: ( Int )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==Int) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:26: Int
							{
							Int143=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2070); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int143_tree = 
							(CommonTree)adaptor.create(Int143)
							;
							adaptor.addChild(root_0, Int143_tree);
							}

							}
							break;

					}

					char_literal144=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2073); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| incrementDecrement ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | postFixCallWithoutAccesAtTheEnd ';' !| postFixMethodCallWithoutAccessAtTheEnd ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expression ( ',' ! expression )* ';' !| 'exit' ';' !);
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal146=null;
		Token char_literal148=null;
		Token char_literal150=null;
		Token char_literal160=null;
		Token char_literal162=null;
		Token string_literal163=null;
		Token char_literal165=null;
		Token string_literal166=null;
		Token char_literal168=null;
		Token char_literal170=null;
		Token string_literal171=null;
		Token char_literal172=null;
		ParserRuleReturnScope variableAssignment145 =null;
		ParserRuleReturnScope variableDeclaration147 =null;
		ParserRuleReturnScope incrementDecrement149 =null;
		ParserRuleReturnScope ifCondition151 =null;
		ParserRuleReturnScope switchCondition152 =null;
		ParserRuleReturnScope forLoop153 =null;
		ParserRuleReturnScope foreachLoop154 =null;
		ParserRuleReturnScope whileLoop155 =null;
		ParserRuleReturnScope doWhileLoop156 =null;
		ParserRuleReturnScope tryCatch157 =null;
		ParserRuleReturnScope throwException158 =null;
		ParserRuleReturnScope postFixCallWithoutAccesAtTheEnd159 =null;
		ParserRuleReturnScope postFixMethodCallWithoutAccessAtTheEnd161 =null;
		ParserRuleReturnScope expression164 =null;
		ParserRuleReturnScope expression167 =null;
		ParserRuleReturnScope expression169 =null;

		CommonTree char_literal146_tree=null;
		CommonTree char_literal148_tree=null;
		CommonTree char_literal150_tree=null;
		CommonTree char_literal160_tree=null;
		CommonTree char_literal162_tree=null;
		CommonTree string_literal163_tree=null;
		CommonTree char_literal165_tree=null;
		CommonTree string_literal166_tree=null;
		CommonTree char_literal168_tree=null;
		CommonTree char_literal170_tree=null;
		CommonTree string_literal171_tree=null;
		CommonTree char_literal172_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:2: ( variableAssignment ';' !| variableDeclaration ';' !| incrementDecrement ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | postFixCallWithoutAccesAtTheEnd ';' !| postFixMethodCallWithoutAccessAtTheEnd ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expression ( ',' ! expression )* ';' !| 'exit' ';' !)
			int alt55=16;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA55_1 = input.LA(2);
				if ( (synpred67_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
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
				alt55=2;
				}
				break;
			case Backslash:
				{
				int LA55_10 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA55_11 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA55_12 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA55_13 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA55_14 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=3;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt55=12;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=13;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 14, input);
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
				alt55=3;
				}
				break;
			case If:
				{
				alt55=4;
				}
				break;
			case Switch:
				{
				alt55=5;
				}
				break;
			case For:
				{
				alt55=6;
				}
				break;
			case Foreach:
				{
				alt55=7;
				}
				break;
			case While:
				{
				alt55=8;
				}
				break;
			case Do:
				{
				alt55=9;
				}
				break;
			case Try:
				{
				alt55=10;
				}
				break;
			case Throw:
				{
				alt55=11;
				}
				break;
			case Return:
				{
				alt55=14;
				}
				break;
			case Echo:
				{
				alt55=15;
				}
				break;
			case Exit:
				{
				alt55=16;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2086);
					variableAssignment145=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment145.getTree());

					char_literal146=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2088); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2094);
					variableDeclaration147=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration147.getTree());

					char_literal148=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2096); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: incrementDecrement ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_instruction2102);
					incrementDecrement149=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement149.getTree());

					char_literal150=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2104); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:401:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2110);
					ifCondition151=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition151.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2115);
					switchCondition152=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition152.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2120);
					forLoop153=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop153.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2125);
					foreachLoop154=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop154.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:405:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2130);
					whileLoop155=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop155.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2135);
					doWhileLoop156=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop156.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2140);
					tryCatch157=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch157.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2145);
					throwException158=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException158.getTree());

					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: postFixCallWithoutAccesAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_instruction2150);
					postFixCallWithoutAccesAtTheEnd159=postFixCallWithoutAccesAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallWithoutAccesAtTheEnd159.getTree());

					char_literal160=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2152); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: postFixMethodCallWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_instruction2158);
					postFixMethodCallWithoutAccessAtTheEnd161=postFixMethodCallWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixMethodCallWithoutAccessAtTheEnd161.getTree());

					char_literal162=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2160); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal163=(Token)match(input,Return,FOLLOW_Return_in_instruction2166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal163_tree = 
					(CommonTree)adaptor.create(string_literal163)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal163_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:14: ( expression )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==At||LA53_0==Backslash||LA53_0==BitwiseNot||LA53_0==Bool||LA53_0==Clone||LA53_0==Float||LA53_0==Identifier||LA53_0==Int||(LA53_0 >= LeftParanthesis && LA53_0 <= LeftSquareBrace)||LA53_0==LogicNot||LA53_0==Minus||LA53_0==MinusMinus||LA53_0==New||LA53_0==Null||(LA53_0 >= ParentColonColon && LA53_0 <= Plus)||LA53_0==PlusPlus||LA53_0==SelfColonColon||LA53_0==String||LA53_0==This||LA53_0==TypeArray||LA53_0==VariableId) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2169);
							expression164=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression164.getTree());

							}
							break;

					}

					char_literal165=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2172); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:4: 'echo' ^ expression ( ',' ! expression )* ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal166=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2178); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal166_tree = 
					(CommonTree)adaptor.create(string_literal166)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal166_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_instruction2181);
					expression167=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:23: ( ',' ! expression )*
					loop54:
					do {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==Comma) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:412:24: ',' ! expression
							{
							char_literal168=(Token)match(input,Comma,FOLLOW_Comma_in_instruction2184); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_instruction2187);
							expression169=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

							}
							break;

						default :
							break loop54;
						}
					} while (true);

					char_literal170=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2191); if (state.failed) return retval;
					}
					break;
				case 16 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal171=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2197); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal171_tree = 
					(CommonTree)adaptor.create(string_literal171)
					;
					adaptor.addChild(root_0, string_literal171_tree);
					}

					char_literal172=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2199); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:1: expressionList : ( expression ( ',' expression )* -> ^( EXPRESSION_LIST ( expression )+ ) | -> EXPRESSION_LIST );
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal174=null;
		ParserRuleReturnScope expression173 =null;
		ParserRuleReturnScope expression175 =null;

		CommonTree char_literal174_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:2: ( expression ( ',' expression )* -> ^( EXPRESSION_LIST ( expression )+ ) | -> EXPRESSION_LIST )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==At||LA57_0==Backslash||LA57_0==BitwiseNot||LA57_0==Bool||LA57_0==Clone||LA57_0==Float||LA57_0==Identifier||LA57_0==Int||(LA57_0 >= LeftParanthesis && LA57_0 <= LeftSquareBrace)||LA57_0==LogicNot||LA57_0==Minus||LA57_0==MinusMinus||LA57_0==New||LA57_0==Null||(LA57_0 >= ParentColonColon && LA57_0 <= Plus)||LA57_0==PlusPlus||LA57_0==SelfColonColon||LA57_0==String||LA57_0==This||LA57_0==TypeArray||LA57_0==VariableId) ) {
				alt57=1;
			}
			else if ( (LA57_0==RightParanthesis||LA57_0==Semicolon) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:4: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_expressionList2212);
					expression173=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression173.getTree());
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:15: ( ',' expression )*
					loop56:
					do {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==Comma) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:16: ',' expression
							{
							char_literal174=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2215); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(char_literal174);

							pushFollow(FOLLOW_expression_in_expressionList2217);
							expression175=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression175.getTree());
							}
							break;

						default :
							break loop56;
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
					// 417:33: -> ^( EXPRESSION_LIST ( expression )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:36: ^( EXPRESSION_LIST ( expression )+ )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:16: 
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
					// 418:16: -> EXPRESSION_LIST
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId176=null;
		ParserRuleReturnScope assignmentOperator177 =null;
		ParserRuleReturnScope expression178 =null;

		CommonTree VariableId176_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId176=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2248); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId176_tree = 
			(CommonTree)adaptor.create(VariableId176)
			;
			adaptor.addChild(root_0, VariableId176_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2250);
			assignmentOperator177=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator177.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2253);
			expression178=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement179 =null;
		ParserRuleReturnScope preIncrementDecrement180 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Backslash||LA58_0==Identifier||LA58_0==ParentColonColon||LA58_0==SelfColonColon||LA58_0==This||LA58_0==VariableId) ) {
				alt58=1;
			}
			else if ( (LA58_0==MinusMinus||LA58_0==PlusPlus) ) {
				alt58=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2265);
					postIncrementDecrement179=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement179.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2270);
					preIncrementDecrement180=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement180.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set181=null;

		CommonTree set181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set181=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set181)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:1: postIncrementDecrement : postFixVariableWithoutCall plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCall182 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus183 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCall=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCall");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:2: ( postFixVariableWithoutCall plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:4: postFixVariableWithoutCall plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCall_in_postIncrementDecrement2349);
			postFixVariableWithoutCall182=postFixVariableWithoutCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCall.add(postFixVariableWithoutCall182.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2351);
			plusPlusOrMinusMinus183=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus183.getTree());
			// AST REWRITE
			// elements: postFixVariableWithoutCall, plusPlusOrMinusMinus
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 447:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCall182!=null?((Token)postFixVariableWithoutCall182.start):null), "post increment/decrement")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_postFixVariableWithoutCall.nextTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set184=null;

		CommonTree set184_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:2: ( '++' | '--' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set184=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set184)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCall -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus185 =null;
		ParserRuleReturnScope postFixVariableWithoutCall186 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCall=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCall");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:2: ( plusPlusOrMinusMinus postFixVariableWithoutCall -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: plusPlusOrMinusMinus postFixVariableWithoutCall
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2394);
			plusPlusOrMinusMinus185=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus185.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCall_in_preIncrementDecrement2396);
			postFixVariableWithoutCall186=postFixVariableWithoutCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCall.add(postFixVariableWithoutCall186.getTree());
			// AST REWRITE
			// elements: postFixVariableWithoutCall, plusPlusOrMinusMinus
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 457:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus185!=null?((Token)plusPlusOrMinusMinus185.start):null), "pre increment/decrement")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_postFixVariableWithoutCall.nextTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId188=null;
		Token char_literal189=null;
		ParserRuleReturnScope allTypes187 =null;
		ParserRuleReturnScope expression190 =null;

		CommonTree VariableId188_tree=null;
		CommonTree char_literal189_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:5: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2424);
			allTypes187=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes187.getTree());
			VariableId188=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2426); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId188);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:25: ( '=' expression )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Assign) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:26: '=' expression
					{
					char_literal189=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2429); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal189);

					pushFollow(FOLLOW_expression_in_variableDeclaration2431);
					expression190=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression190.getTree());
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
			// 461:43: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:46: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes187!=null?((Token)allTypes187.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:129: ( expression )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:463:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak191 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:464:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2457);
			logicOrWeak191=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak191.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:1: expressionForTest : expression ';' !;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal193=null;
		ParserRuleReturnScope expression192 =null;

		CommonTree char_literal193_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:2: ( expression ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:467:4: expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2466);
			expression192=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());

			char_literal193=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2468); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal195=null;
		ParserRuleReturnScope logicXorWeak194 =null;
		ParserRuleReturnScope logicXorWeak196 =null;

		CommonTree string_literal195_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2478);
			logicXorWeak194=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak194.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:17: ( 'or' ^ logicXorWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicOrWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred100_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:18: 'or' ^ logicXorWeak
					{
					string_literal195=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2481); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(CommonTree)adaptor.create(string_literal195)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal195_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2484);
					logicXorWeak196=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak196.getTree());

					}
					break;

				default :
					break loop60;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal198=null;
		ParserRuleReturnScope logicAndWeak197 =null;
		ParserRuleReturnScope logicAndWeak199 =null;

		CommonTree string_literal198_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2497);
			logicAndWeak197=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak197.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:17: ( 'xor' ^ logicAndWeak )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicXorWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:18: 'xor' ^ logicAndWeak
					{
					string_literal198=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = 
					(CommonTree)adaptor.create(string_literal198)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2503);
					logicAndWeak199=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak199.getTree());

					}
					break;

				default :
					break loop61;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:475:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal201=null;
		ParserRuleReturnScope assignment200 =null;
		ParserRuleReturnScope assignment202 =null;

		CommonTree string_literal201_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2516);
			assignment200=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment200.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:15: ( 'and' ^ assignment )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicAndWeak) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:16: 'and' ^ assignment
					{
					string_literal201=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2519); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = 
					(CommonTree)adaptor.create(string_literal201)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal201_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2522);
					assignment202=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment202.getTree());

					}
					break;

				default :
					break loop62;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary203 =null;
		ParserRuleReturnScope assignmentOperator204 =null;
		ParserRuleReturnScope ternary205 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2533);
			ternary203=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary203.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:12: ( assignmentOperator ^ ternary )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==Assign||LA63_0==BitwiseAndEqual||LA63_0==BitwiseOrEqual||LA63_0==BitwiseXorEqual||LA63_0==DivideEqual||LA63_0==DotEqual||LA63_0==MinusEqual||LA63_0==ModuloEqual||LA63_0==MultiplyEqual||LA63_0==PlusEqual||LA63_0==ShiftLeftEqual||LA63_0==ShiftRightEqual) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2536);
					assignmentOperator204=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator204.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2539);
					ternary205=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary205.getTree());

					}
					break;

				default :
					break loop63;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal207=null;
		Token char_literal209=null;
		ParserRuleReturnScope logicOr206 =null;
		ParserRuleReturnScope expression208 =null;
		ParserRuleReturnScope expression210 =null;

		CommonTree char_literal207_tree=null;
		CommonTree char_literal209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2549);
			logicOr206=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr206.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:19: ( '?' ^ expression ':' ! expression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==QuestionMark) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:20: '?' ^ expression ':' ! expression
					{
					char_literal207=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal207_tree = 
					(CommonTree)adaptor.create(char_literal207)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal207_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2555);
					expression208=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());

					char_literal209=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2557); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2560);
					expression210=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope logicAnd211 =null;
		ParserRuleReturnScope logicAnd213 =null;

		CommonTree string_literal212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2570);
			logicAnd211=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd211.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:20: ( '||' ^ logicAnd )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicOr) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:21: '||' ^ logicAnd
					{
					string_literal212=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2573); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = 
					(CommonTree)adaptor.create(string_literal212)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2576);
					logicAnd213=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd213.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal215=null;
		ParserRuleReturnScope bitwiseOr214 =null;
		ParserRuleReturnScope bitwiseOr216 =null;

		CommonTree string_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2585);
			bitwiseOr214=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr214.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:21: ( '&&' ^ bitwiseOr )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicAnd) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:22: '&&' ^ bitwiseOr
					{
					string_literal215=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2588); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal215_tree = 
					(CommonTree)adaptor.create(string_literal215)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2591);
					bitwiseOr216=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr216.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope bitwiseXor217 =null;
		ParserRuleReturnScope bitwiseXor219 =null;

		CommonTree char_literal218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2602);
			bitwiseXor217=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor217.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:15: ( '|' ^ bitwiseXor )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseOr) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:16: '|' ^ bitwiseXor
					{
					char_literal218=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2605); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal218_tree = 
					(CommonTree)adaptor.create(char_literal218)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal218_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2608);
					bitwiseXor219=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor219.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal221=null;
		ParserRuleReturnScope bitwiseAnd220 =null;
		ParserRuleReturnScope bitwiseAnd222 =null;

		CommonTree char_literal221_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2619);
			bitwiseAnd220=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd220.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:15: ( '^' ^ bitwiseAnd )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseXor) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:16: '^' ^ bitwiseAnd
					{
					char_literal221=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2622); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal221_tree = 
					(CommonTree)adaptor.create(char_literal221)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal221_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2625);
					bitwiseAnd222=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd222.getTree());

					}
					break;

				default :
					break loop68;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal224=null;
		ParserRuleReturnScope equality223 =null;
		ParserRuleReturnScope equality225 =null;

		CommonTree char_literal224_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2636);
			equality223=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality223.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:13: ( '&' ^ equality )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseAnd) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:14: '&' ^ equality
					{
					char_literal224=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2639); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal224_tree = 
					(CommonTree)adaptor.create(char_literal224)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal224_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2642);
					equality225=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality225.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison226 =null;
		ParserRuleReturnScope equalityOperator227 =null;
		ParserRuleReturnScope comparison228 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2651);
			comparison226=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison226.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:22: ( equalityOperator ^ comparison )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==Equal||LA70_0==Identical||(LA70_0 >= NotEqual && LA70_0 <= NotIdentical)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2654);
					equalityOperator227=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator227.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2657);
					comparison228=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison228.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set229=null;

		CommonTree set229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set229=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set229)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift230 =null;
		ParserRuleReturnScope comparisonOperator231 =null;
		ParserRuleReturnScope bitwiseShift232 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2699);
			bitwiseShift230=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift230.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:17: ( comparisonOperator ^ bitwiseShift )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( ((LA71_0 >= GreaterEqualThan && LA71_0 <= GreaterThan)||(LA71_0 >= LessEqualThan && LA71_0 <= LessThan)) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2702);
					comparisonOperator231=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator231.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2705);
					bitwiseShift232=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift232.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set233=null;

		CommonTree set233_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set233=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set233)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set235=null;
		ParserRuleReturnScope termOrStringConcatenation234 =null;
		ParserRuleReturnScope termOrStringConcatenation236 =null;

		CommonTree set235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2741);
			termOrStringConcatenation234=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation234.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ShiftLeft||LA72_0==ShiftRight) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set235=(Token)input.LT(1);
					set235=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set235)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2751);
					termOrStringConcatenation236=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation236.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set238=null;
		ParserRuleReturnScope factor237 =null;
		ParserRuleReturnScope factor239 =null;

		CommonTree set238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2761);
			factor237=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor237.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Dot||LA73_0==Minus||LA73_0==Plus) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:37: ( '+' | '-' | '.' ) ^ factor
					{
					set238=(Token)input.LT(1);
					set238=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set238)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2773);
					factor239=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor239.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set241=null;
		ParserRuleReturnScope logicNot240 =null;
		ParserRuleReturnScope logicNot242 =null;

		CommonTree set241_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2783);
			logicNot240=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot240.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==Divide||LA74_0==Modulo||LA74_0==Multiply) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set241=(Token)input.LT(1);
					set241=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set241)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2795);
					logicNot242=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot242.getTree());

					}
					break;

				default :
					break loop74;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal243=null;
		ParserRuleReturnScope logicNot244 =null;
		ParserRuleReturnScope instanceOf245 =null;

		CommonTree char_literal243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:9: ( '!' ^ logicNot | instanceOf )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==LogicNot) ) {
				alt75=1;
			}
			else if ( (LA75_0==At||LA75_0==Backslash||LA75_0==BitwiseNot||LA75_0==Bool||LA75_0==Clone||LA75_0==Float||LA75_0==Identifier||LA75_0==Int||(LA75_0 >= LeftParanthesis && LA75_0 <= LeftSquareBrace)||LA75_0==Minus||LA75_0==MinusMinus||LA75_0==New||LA75_0==Null||(LA75_0 >= ParentColonColon && LA75_0 <= Plus)||LA75_0==PlusPlus||LA75_0==SelfColonColon||LA75_0==String||LA75_0==This||LA75_0==TypeArray||LA75_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal243=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2804); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal243_tree = 
					(CommonTree)adaptor.create(char_literal243)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal243_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2807);
					logicNot244=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot244.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2812);
					instanceOf245=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf245.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal247=null;
		Token VariableId249=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt246 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject248 =null;

		CommonTree string_literal247_tree=null;
		CommonTree VariableId249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2823);
			castOrBitwiseNotOrAt246=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt246.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Instanceof) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal247=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2826); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal247_tree = 
					(CommonTree)adaptor.create(string_literal247)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal247_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==Backslash||LA76_0==Identifier) ) {
						alt76=1;
					}
					else if ( (LA76_0==VariableId) ) {
						alt76=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 76, 0, input);
						throw nvae;
					}
					switch (alt76) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2830);
							classInterfaceTypeWithoutObject248=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject248.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:73: VariableId
							{
							VariableId249=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2832); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId249_tree = 
							(CommonTree)adaptor.create(VariableId249)
							;
							adaptor.addChild(root_0, VariableId249_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:529:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal251=null;
		Token char_literal253=null;
		Token char_literal255=null;
		ParserRuleReturnScope allTypesWithoutResource250 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt252 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt254 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt256 =null;
		ParserRuleReturnScope cloneOrNew257 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal251_tree=null;
		CommonTree char_literal253_tree=null;
		CommonTree char_literal255_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");
		RewriteRuleSubtreeStream stream_allTypesWithoutResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutResource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:2: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
			int alt78=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA78_1 = input.LA(2);
				if ( (synpred130_TSPHP()) ) {
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
			case ParentColonColon:
			case Plus:
			case PlusPlus:
			case SelfColonColon:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2848); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2850);
					allTypesWithoutResource250=allTypesWithoutResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(allTypesWithoutResource250.getTree());
					char_literal251=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2852); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal251);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2854);
					castOrBitwiseNotOrAt252=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt252.getTree());
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
					// 530:64: -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:67: ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal253=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2870); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal253_tree = 
					(CommonTree)adaptor.create(char_literal253)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal253_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2873);
					castOrBitwiseNotOrAt254=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt254.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal255=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal255_tree = 
					(CommonTree)adaptor.create(char_literal255)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal255_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2881);
					castOrBitwiseNotOrAt256=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt256.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2887);
					cloneOrNew257=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew257.getTree());

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


	public static class cloneOrNew_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cloneOrNew"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:1: cloneOrNew : ( 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall ) | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal258=null;
		ParserRuleReturnScope postFixCallInclAccesAtTheEnd259 =null;
		ParserRuleReturnScope postFixVariableInclCall260 =null;
		ParserRuleReturnScope newObject261 =null;
		ParserRuleReturnScope unaryPrimary262 =null;

		CommonTree string_literal258_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:2: ( 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall ) | newObject | unaryPrimary )
			int alt80=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt80=1;
				}
				break;
			case New:
				{
				alt80=2;
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
			case ParentColonColon:
			case Plus:
			case PlusPlus:
			case SelfColonColon:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt80=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:4: 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal258=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew2898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal258_tree = 
					(CommonTree)adaptor.create(string_literal258)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal258_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:13: ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall )
					int alt79=2;
					switch ( input.LA(1) ) {
					case Backslash:
						{
						int LA79_1 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
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
					case Identifier:
						{
						int LA79_2 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 79, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case SelfColonColon:
						{
						int LA79_3 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 79, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case ParentColonColon:
						{
						int LA79_4 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 79, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case This:
						{
						int LA79_5 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 79, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case VariableId:
						{
						int LA79_6 = input.LA(2);
						if ( (synpred133_TSPHP()) ) {
							alt79=1;
						}
						else if ( (true) ) {
							alt79=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 79, 6, input);
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
							new NoViableAltException("", 79, 0, input);
						throw nvae;
					}
					switch (alt79) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:14: postFixCallInclAccesAtTheEnd
							{
							pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_cloneOrNew2902);
							postFixCallInclAccesAtTheEnd259=postFixCallInclAccesAtTheEnd();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallInclAccesAtTheEnd259.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:43: postFixVariableInclCall
							{
							pushFollow(FOLLOW_postFixVariableInclCall_in_cloneOrNew2904);
							postFixVariableInclCall260=postFixVariableInclCall();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCall260.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew2910);
					newObject261=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject261.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew2915);
					unaryPrimary262=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary262.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 71, cloneOrNew_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cloneOrNew"


	public static class variableOrMemberOrStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableOrMemberOrStaticMember"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId264=null;
		Token string_literal265=null;
		Token VariableId266=null;
		ParserRuleReturnScope staticAccessOrParent263 =null;

		CommonTree VariableId264_tree=null;
		CommonTree string_literal265_tree=null;
		CommonTree VariableId266_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
			int alt81=3;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case ParentColonColon:
			case SelfColonColon:
				{
				alt81=1;
				}
				break;
			case This:
				{
				alt81=2;
				}
				break;
			case VariableId:
				{
				alt81=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2928);
					staticAccessOrParent263=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent263.getTree());
					VariableId264=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember2930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId264);

					// AST REWRITE
					// elements: staticAccessOrParent, VariableId
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 544:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent263!=null?((Token)staticAccessOrParent263.start):null), "static member access")
						, root_1);

						adaptor.addChild(root_1, stream_staticAccessOrParent.nextTree());

						adaptor.addChild(root_1, 
						stream_VariableId.nextNode()
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal265=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember2946); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal265_tree = 
					(CommonTree)adaptor.create(string_literal265)
					;
					adaptor.addChild(root_0, string_literal265_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId266=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember2951); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId266_tree = 
					(CommonTree)adaptor.create(VariableId266)
					;
					adaptor.addChild(root_0, VariableId266_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 72, variableOrMemberOrStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableOrMemberOrStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:1: staticAccessOrParent : ( 'self::' -> 'self' | 'parent::' -> 'parent' | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal267=null;
		Token string_literal268=null;
		Token string_literal270=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject269 =null;

		CommonTree string_literal267_tree=null;
		CommonTree string_literal268_tree=null;
		CommonTree string_literal270_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:2: ( 'self::' -> 'self' | 'parent::' -> 'parent' | classInterfaceTypeWithoutObject '::' !)
			int alt82=3;
			switch ( input.LA(1) ) {
			case SelfColonColon:
				{
				alt82=1;
				}
				break;
			case ParentColonColon:
				{
				alt82=2;
				}
				break;
			case Backslash:
			case Identifier:
				{
				alt82=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:4: 'self::'
					{
					string_literal267=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent2963); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SelfColonColon.add(string_literal267);

					// AST REWRITE
					// elements: Self
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 550:13: -> 'self'
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(Self, "Self")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:4: 'parent::'
					{
					string_literal268=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent2972); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ParentColonColon.add(string_literal268);

					// AST REWRITE
					// elements: Parent
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 551:15: -> 'parent'
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(Parent, "Parent")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2981);
					classInterfaceTypeWithoutObject269=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject269.getTree());

					string_literal270=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2983); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:1: memberAccessOrArrayAccess : ( '->' Identifier -> ^( '->' Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] expression ) );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arrayAccess=null;
		Token string_literal271=null;
		Token Identifier272=null;
		Token char_literal274=null;
		ParserRuleReturnScope expression273 =null;

		CommonTree arrayAccess_tree=null;
		CommonTree string_literal271_tree=null;
		CommonTree Identifier272_tree=null;
		CommonTree char_literal274_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:2: ( '->' Identifier -> ^( '->' Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] expression ) )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==ObjectOperator) ) {
				alt83=1;
			}
			else if ( (LA83_0==LeftSquareBrace) ) {
				alt83=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:4: '->' Identifier
					{
					string_literal271=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccessOrArrayAccess2995); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(string_literal271);

					Identifier272=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccessOrArrayAccess2997); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier272);

					// AST REWRITE
					// elements: ObjectOperator, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 556:20: -> ^( '->' Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:23: ^( '->' Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_ObjectOperator.nextNode()
						, root_1);

						adaptor.addChild(root_1, 
						stream_Identifier.nextNode()
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:4: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_memberAccessOrArrayAccess3014); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_memberAccessOrArrayAccess3016);
					expression273=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression273.getTree());
					char_literal274=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_memberAccessOrArrayAccess3018); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal274);

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
					// 557:37: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:40: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
						, root_1);

						adaptor.addChild(root_1, stream_expression.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 74, memberAccessOrArrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccessOrArrayAccess"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:1: newObject : ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal275=null;
		Token char_literal277=null;
		Token char_literal279=null;
		Token string_literal280=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject276 =null;
		ParserRuleReturnScope expressionList278 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject281 =null;

		CommonTree string_literal275_tree=null;
		CommonTree char_literal277_tree=null;
		CommonTree char_literal279_tree=null;
		CommonTree string_literal280_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:2: ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) )
			int alt84=2;
			alt84 = dfa84.predict(input);
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:4: 'new' classInterfaceTypeWithoutObject '(' expressionList ')'
					{
					string_literal275=(Token)match(input,New,FOLLOW_New_in_newObject3039); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal275);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3041);
					classInterfaceTypeWithoutObject276=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject276.getTree());
					char_literal277=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject3043); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal277);

					pushFollow(FOLLOW_expressionList_in_newObject3045);
					expressionList278=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList278.getTree());
					char_literal279=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject3047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal279);

					// AST REWRITE
					// elements: New, classInterfaceTypeWithoutObject, expressionList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 561:65: -> ^( 'new' classInterfaceTypeWithoutObject expressionList )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:68: ^( 'new' classInterfaceTypeWithoutObject expressionList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:562:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal280=(Token)match(input,New,FOLLOW_New_in_newObject3062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal280);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3064);
					classInterfaceTypeWithoutObject281=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject281.getTree());
					// AST REWRITE
					// elements: New, classInterfaceTypeWithoutObject
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 562:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:562:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST )
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
			if ( state.backtracking>0 ) { memoize(input, 75, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary282 =null;
		ParserRuleReturnScope primary283 =null;
		ParserRuleReturnScope primary284 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
			int alt85=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt85=1;
				}
				break;
			case Minus:
				{
				alt85=2;
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
			case ParentColonColon:
			case PlusPlus:
			case SelfColonColon:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt85=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3089); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3091);
					primary282=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary282.getTree());
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
					// 566:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3109); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3111);
					primary283=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary283.getTree());
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
					// 567:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3125);
					primary284=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary284.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 76, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:1: primary : ( postFixCallInclAccesAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCallInclAccesAtTheEnd285 =null;
		ParserRuleReturnScope atom286 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:2: ( postFixCallInclAccesAtTheEnd | atom )
			int alt86=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA86_1 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA86_2 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA86_3 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA86_4 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA86_5 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA86_6 = input.LA(2);
				if ( (synpred144_TSPHP()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 6, input);
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
				alt86=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: postFixCallInclAccesAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_primary3135);
					postFixCallInclAccesAtTheEnd285=postFixCallInclAccesAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallInclAccesAtTheEnd285.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3140);
					atom286=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom286.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 77, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class postFixCallInclAccesAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCallInclAccesAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:1: postFixCallInclAccesAtTheEnd : ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )* ;
	public final TSPHPParser.postFixCallInclAccesAtTheEnd_return postFixCallInclAccesAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixCallInclAccesAtTheEnd_return retval = new TSPHPParser.postFixCallInclAccesAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixCallInclAccesAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier288=null;
		Token char_literal290=null;
		ParserRuleReturnScope postFixCallWithoutAccesAtTheEnd287 =null;
		ParserRuleReturnScope expression289 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier288_tree=null;
		CommonTree char_literal290_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_postFixCallWithoutAccesAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixCallWithoutAccesAtTheEnd");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:2: ( ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:5: postFixCallWithoutAccesAtTheEnd
			{
			pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_postFixCallInclAccesAtTheEnd3154);
			postFixCallWithoutAccesAtTheEnd287=postFixCallWithoutAccesAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixCallWithoutAccesAtTheEnd.add(postFixCallWithoutAccesAtTheEnd287.getTree());
			// AST REWRITE
			// elements: postFixCallWithoutAccesAtTheEnd
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 576:37: -> postFixCallWithoutAccesAtTheEnd
			{
				adaptor.addChild(root_0, stream_postFixCallWithoutAccesAtTheEnd.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )*
			loop87:
			do {
				int alt87=3;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==ObjectOperator) ) {
					alt87=1;
				}
				else if ( (LA87_0==LeftSquareBrace) ) {
					alt87=2;
				}

				switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCallInclAccesAtTheEnd3169); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier288=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCallInclAccesAtTheEnd3171); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier288);

					// AST REWRITE
					// elements: postFixCallInclAccesAtTheEnd, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 577:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "member access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, 
						stream_Identifier.nextNode()
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCallInclAccesAtTheEnd3193); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCallInclAccesAtTheEnd3195);
					expression289=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression289.getTree());
					char_literal290=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCallInclAccesAtTheEnd3197); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal290);

					// AST REWRITE
					// elements: expression, postFixCallInclAccesAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 578:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:578:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_expression.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop87;
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
			if ( state.backtracking>0 ) { memoize(input, 78, postFixCallInclAccesAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCallInclAccesAtTheEnd"


	public static class postFixCallWithoutAccesAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCallWithoutAccesAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:1: postFixCallWithoutAccesAtTheEnd : ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )* ;
	public final TSPHPParser.postFixCallWithoutAccesAtTheEnd_return postFixCallWithoutAccesAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixCallWithoutAccesAtTheEnd_return retval = new TSPHPParser.postFixCallWithoutAccesAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixCallWithoutAccesAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier293=null;
		Token char_literal295=null;
		ParserRuleReturnScope functionCall291 =null;
		ParserRuleReturnScope methodCall292 =null;
		ParserRuleReturnScope expression294 =null;
		ParserRuleReturnScope call296 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier293_tree=null;
		CommonTree char_literal295_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt88=2;
			alt88 = dfa88.predict(input);
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCallWithoutAccesAtTheEnd3228);
					functionCall291=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall291.getTree());
					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 583:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCallWithoutAccesAtTheEnd3238);
					methodCall292=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall292.getTree());
					// AST REWRITE
					// elements: methodCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 584:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:3: ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )*
			loop90:
			do {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==ObjectOperator) ) {
					int LA90_2 = input.LA(2);
					if ( (synpred150_TSPHP()) ) {
						alt90=1;
					}

				}
				else if ( (LA90_0==LeftSquareBrace) ) {
					int LA90_3 = input.LA(2);
					if ( (synpred150_TSPHP()) ) {
						alt90=1;
					}

				}

				switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )*
					loop89:
					do {
						int alt89=3;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==ObjectOperator) ) {
							int LA89_1 = input.LA(2);
							if ( (LA89_1==Identifier) ) {
								int LA89_3 = input.LA(3);
								if ( (LA89_3==LeftSquareBrace||LA89_3==ObjectOperator) ) {
									alt89=1;
								}

							}

						}
						else if ( (LA89_0==LeftSquareBrace) ) {
							alt89=2;
						}

						switch (alt89) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCallWithoutAccesAtTheEnd3261); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier293=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCallWithoutAccesAtTheEnd3263); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier293);

							// AST REWRITE
							// elements: postFixCallWithoutAccesAtTheEnd, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 587:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "member access")
								, root_1);

								adaptor.addChild(root_1, stream_retval.nextTree());

								adaptor.addChild(root_1, 
								stream_Identifier.nextNode()
								);

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCallWithoutAccesAtTheEnd3286); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixCallWithoutAccesAtTheEnd3288);
							expression294=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression294.getTree());
							char_literal295=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCallWithoutAccesAtTheEnd3290); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal295);

							// AST REWRITE
							// elements: expression, postFixCallWithoutAccesAtTheEnd
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 588:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
								, root_1);

								adaptor.addChild(root_1, stream_retval.nextTree());

								adaptor.addChild(root_1, stream_expression.nextTree());

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

						default :
							break loop89;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_postFixCallWithoutAccesAtTheEnd3313);
					call296=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call296.getTree());
					// AST REWRITE
					// elements: call, postFixCallWithoutAccesAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 590:9: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:12: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call296!=null?((Token)call296.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_call.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop90;
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
			if ( state.backtracking>0 ) { memoize(input, 79, postFixCallWithoutAccesAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCallWithoutAccesAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:594:1: functionCall : classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject expressionList ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal298=null;
		Token char_literal300=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject297 =null;
		ParserRuleReturnScope expressionList299 =null;

		CommonTree char_literal298_tree=null;
		CommonTree char_literal300_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:2: ( classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject expressionList ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:595:4: classInterfaceTypeWithoutObject '(' expressionList ')'
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3341);
			classInterfaceTypeWithoutObject297=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject297.getTree());
			char_literal298=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall3343); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal298);

			pushFollow(FOLLOW_expressionList_in_functionCall3345);
			expressionList299=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList299.getTree());
			char_literal300=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall3347); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal300);

			// AST REWRITE
			// elements: classInterfaceTypeWithoutObject, expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 596:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject expressionList )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject expressionList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject297!=null?((Token)classInterfaceTypeWithoutObject297.start):null), "function call")
				, root_1);

				adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_1, stream_expressionList.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 80, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class callOrAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callOrAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess301 =null;
		ParserRuleReturnScope call302 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:2: ( memberAccessOrArrayAccess | call )
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==ObjectOperator) ) {
				int LA91_1 = input.LA(2);
				if ( (LA91_1==Identifier) ) {
					int LA91_3 = input.LA(3);
					if ( (LA91_3==LeftParanthesis) ) {
						alt91=2;
					}
					else if ( (LA91_3==EOF) ) {
						alt91=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 91, 3, input);
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
							new NoViableAltException("", 91, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA91_0==LeftSquareBrace) ) {
				alt91=1;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:4: memberAccessOrArrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess3372);
					memberAccessOrArrayAccess301=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess301.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:601:4: call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess3377);
					call302=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call302.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 81, callOrAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callOrAccess"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:1: call : '->' ! Identifier '(' ! expressionList ')' !;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal303=null;
		Token Identifier304=null;
		Token char_literal305=null;
		Token char_literal307=null;
		ParserRuleReturnScope expressionList306 =null;

		CommonTree string_literal303_tree=null;
		CommonTree Identifier304_tree=null;
		CommonTree char_literal305_tree=null;
		CommonTree char_literal307_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:6: ( '->' ! Identifier '(' ! expressionList ')' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:8: '->' ! Identifier '(' ! expressionList ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal303=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3389); if (state.failed) return retval;
			Identifier304=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3392); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier304_tree = 
			(CommonTree)adaptor.create(Identifier304)
			;
			adaptor.addChild(root_0, Identifier304_tree);
			}

			char_literal305=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call3394); if (state.failed) return retval;
			pushFollow(FOLLOW_expressionList_in_call3397);
			expressionList306=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList306.getTree());

			char_literal307=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call3399); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 82, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:607:1: methodCall : callee Identifier '(' expressionList ')' -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier expressionList ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier309=null;
		Token char_literal310=null;
		Token char_literal312=null;
		ParserRuleReturnScope callee308 =null;
		ParserRuleReturnScope expressionList311 =null;

		CommonTree Identifier309_tree=null;
		CommonTree char_literal310_tree=null;
		CommonTree char_literal312_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:2: ( callee Identifier '(' expressionList ')' -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier expressionList ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:608:4: callee Identifier '(' expressionList ')'
			{
			pushFollow(FOLLOW_callee_in_methodCall3412);
			callee308=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee308.getTree());
			Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier309);

			char_literal310=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall3416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal310);

			pushFollow(FOLLOW_expressionList_in_methodCall3418);
			expressionList311=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList311.getTree());
			char_literal312=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall3419); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal312);

			// AST REWRITE
			// elements: callee, expressionList, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 609:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier expressionList )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:609:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier expressionList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee308!=null?((Token)callee308.start):null), "method call")
				, root_1);

				adaptor.addChild(root_1, stream_callee.nextTree());

				adaptor.addChild(root_1, 
				stream_Identifier.nextNode()
				);

				adaptor.addChild(root_1, stream_expressionList.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class callee_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callee"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal314=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember313 =null;
		ParserRuleReturnScope staticAccessOrParent315 =null;

		CommonTree string_literal314_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt92=2;
			alt92 = dfa92.predict(input);
			switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:612:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3445);
					variableOrMemberOrStaticMember313=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember313.getTree());

					string_literal314=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3447); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:613:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3453);
					staticAccessOrParent315=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent315.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, callee_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callee"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCall | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal316=null;
		Token char_literal318=null;
		ParserRuleReturnScope expression317 =null;
		ParserRuleReturnScope incrementDecrement319 =null;
		ParserRuleReturnScope postFixVariableInclCall320 =null;
		ParserRuleReturnScope classConstant321 =null;
		ParserRuleReturnScope globalConstant322 =null;
		ParserRuleReturnScope array323 =null;
		ParserRuleReturnScope primitiveAtom324 =null;

		CommonTree char_literal316_tree=null;
		CommonTree char_literal318_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCall | classConstant | globalConstant | array | primitiveAtom )
			int alt93=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt93=1;
				}
				break;
			case SelfColonColon:
				{
				int LA93_2 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else if ( (synpred156_TSPHP()) ) {
					alt93=4;
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
				break;
			case ParentColonColon:
				{
				int LA93_3 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else if ( (synpred156_TSPHP()) ) {
					alt93=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA93_4 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else if ( (synpred156_TSPHP()) ) {
					alt93=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA93_5 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else if ( (synpred156_TSPHP()) ) {
					alt93=4;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt93=5;
				}
				else if ( (true) ) {
					alt93=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA93_6 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA93_7 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt93=2;
				}
				else if ( (synpred155_TSPHP()) ) {
					alt93=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 7, input);
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
				alt93=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt93=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt93=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:616:8: '(' expression ')'
					{
					char_literal316=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3463); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal316);

					pushFollow(FOLLOW_expression_in_atom3465);
					expression317=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression317.getTree());
					char_literal318=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3467); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal318);

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
					// 616:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3476);
					incrementDecrement319=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement319.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: postFixVariableInclCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCall_in_atom3481);
					postFixVariableInclCall320=postFixVariableInclCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCall320.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3486);
					classConstant321=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant321.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3491);
					globalConstant322=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant322.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:621:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3496);
					array323=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array323.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3501);
					primitiveAtom324=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom324.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 85, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class postFixVariableWithoutCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableWithoutCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:625:1: postFixVariableWithoutCall : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )* ;
	public final TSPHPParser.postFixVariableWithoutCall_return postFixVariableWithoutCall() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCall_return retval = new TSPHPParser.postFixVariableWithoutCall_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier326=null;
		Token char_literal328=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember325 =null;
		ParserRuleReturnScope expression327 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier326_tree=null;
		CommonTree char_literal328_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCall3513);
			variableOrMemberOrStaticMember325=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember325.getTree());
			// AST REWRITE
			// elements: variableOrMemberOrStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 626:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )*
			loop94:
			do {
				int alt94=3;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==ObjectOperator) ) {
					alt94=1;
				}
				else if ( (LA94_0==LeftSquareBrace) ) {
					alt94=2;
				}

				switch (alt94) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCall3531); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier326=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCall3533); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier326);

					// AST REWRITE
					// elements: Identifier, postFixVariableWithoutCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 628:35: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:38: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "member access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, 
						stream_Identifier.nextNode()
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCall3555); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableWithoutCall3557);
					expression327=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression327.getTree());
					char_literal328=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCall3559); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal328);

					// AST REWRITE
					// elements: expression, postFixVariableWithoutCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 629:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_expression.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop94;
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
			if ( state.backtracking>0 ) { memoize(input, 86, postFixVariableWithoutCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableWithoutCall"


	public static class postFixVariableInclCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableInclCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:633:1: postFixVariableInclCall : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )* ;
	public final TSPHPParser.postFixVariableInclCall_return postFixVariableInclCall() throws RecognitionException {
		TSPHPParser.postFixVariableInclCall_return retval = new TSPHPParser.postFixVariableInclCall_return();
		retval.start = input.LT(1);
		int postFixVariableInclCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier330=null;
		Token char_literal332=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember329 =null;
		ParserRuleReturnScope expression331 =null;
		ParserRuleReturnScope call333 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier330_tree=null;
		CommonTree char_literal332_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:634:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:634:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:634:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:634:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCall3590);
			variableOrMemberOrStaticMember329=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember329.getTree());
			// AST REWRITE
			// elements: variableOrMemberOrStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 634:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:635:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )*
			loop95:
			do {
				int alt95=4;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==ObjectOperator) ) {
					int LA95_2 = input.LA(2);
					if ( (LA95_2==Identifier) ) {
						int LA95_4 = input.LA(3);
						if ( (LA95_4==LeftParanthesis) ) {
							alt95=3;
						}
						else if ( (LA95_4==EOF||(LA95_4 >= Arrow && LA95_4 <= Assign)||(LA95_4 >= BitwiseAnd && LA95_4 <= BitwiseAndEqual)||(LA95_4 >= BitwiseOr && LA95_4 <= BitwiseXorEqual)||(LA95_4 >= Colon && LA95_4 <= Comma)||(LA95_4 >= Divide && LA95_4 <= DivideEqual)||(LA95_4 >= Dot && LA95_4 <= DotEqual)||LA95_4==Equal||(LA95_4 >= GreaterEqualThan && LA95_4 <= GreaterThan)||LA95_4==Identical||LA95_4==Instanceof||(LA95_4 >= LeftSquareBrace && LA95_4 <= LogicAndWeak)||(LA95_4 >= LogicOr && LA95_4 <= LogicXorWeak)||(LA95_4 >= Minus && LA95_4 <= MinusEqual)||(LA95_4 >= Modulo && LA95_4 <= MultiplyEqual)||(LA95_4 >= NotEqual && LA95_4 <= NotIdentical)||LA95_4==ObjectOperator||(LA95_4 >= Plus && LA95_4 <= PlusEqual)||LA95_4==QuestionMark||(LA95_4 >= RightParanthesis && LA95_4 <= RightSquareBrace)||(LA95_4 >= Semicolon && LA95_4 <= ShiftRightEqual)) ) {
							alt95=1;
						}

					}

				}
				else if ( (LA95_0==LeftSquareBrace) ) {
					alt95=2;
				}

				switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:635:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCall3605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier330=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCall3607); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier330);

					// AST REWRITE
					// elements: Identifier, postFixVariableInclCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 635:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:635:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "member access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, 
						stream_Identifier.nextNode()
						);

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCall3629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCall3631);
					expression331=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression331.getTree());
					char_literal332=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCall3633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal332);

					// AST REWRITE
					// elements: postFixVariableInclCall, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 636:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_expression.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCall3651);
					call333=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call333.getTree());
					// AST REWRITE
					// elements: postFixVariableInclCall, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 637:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call333!=null?((Token)call333.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_call.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop95;
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
			if ( state.backtracking>0 ) { memoize(input, 87, postFixVariableInclCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableInclCall"


	public static class postFixMethodCallWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixMethodCallWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:641:1: postFixMethodCallWithoutAccessAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+ ;
	public final TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return postFixMethodCallWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return retval = new TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixMethodCallWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier335=null;
		Token char_literal337=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember334 =null;
		ParserRuleReturnScope expression336 =null;
		ParserRuleReturnScope call338 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier335_tree=null;
		CommonTree char_literal337_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:642:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixMethodCallWithoutAccessAtTheEnd3681);
			variableOrMemberOrStaticMember334=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember334.getTree());
			// AST REWRITE
			// elements: variableOrMemberOrStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 642:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:643:3: ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+
			int cnt97=0;
			loop97:
			do {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==LeftSquareBrace||LA97_0==ObjectOperator) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )*
					loop96:
					do {
						int alt96=3;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==ObjectOperator) ) {
							int LA96_1 = input.LA(2);
							if ( (LA96_1==Identifier) ) {
								int LA96_3 = input.LA(3);
								if ( (LA96_3==LeftSquareBrace||LA96_3==ObjectOperator) ) {
									alt96=1;
								}

							}

						}
						else if ( (LA96_0==LeftSquareBrace) ) {
							alt96=2;
						}

						switch (alt96) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixMethodCallWithoutAccessAtTheEnd3701); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier335=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixMethodCallWithoutAccessAtTheEnd3703); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier335);

							// AST REWRITE
							// elements: postFixMethodCallWithoutAccessAtTheEnd, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 644:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "member access")
								, root_1);

								adaptor.addChild(root_1, stream_retval.nextTree());

								adaptor.addChild(root_1, 
								stream_Identifier.nextNode()
								);

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3726); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixMethodCallWithoutAccessAtTheEnd3728);
							expression336=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression336.getTree());
							char_literal337=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3730); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal337);

							// AST REWRITE
							// elements: postFixMethodCallWithoutAccessAtTheEnd, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 645:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "array access")
								, root_1);

								adaptor.addChild(root_1, stream_retval.nextTree());

								adaptor.addChild(root_1, stream_expression.nextTree());

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

						default :
							break loop96;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_postFixMethodCallWithoutAccessAtTheEnd3753);
					call338=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call338.getTree());
					// AST REWRITE
					// elements: call, postFixMethodCallWithoutAccessAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 647:9: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:647:12: ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call338!=null?((Token)call338.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						adaptor.addChild(root_1, stream_call.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					if ( cnt97 >= 1 ) break loop97;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(97, input);
						throw eee;
				}
				cnt97++;
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
			if ( state.backtracking>0 ) { memoize(input, 88, postFixMethodCallWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixMethodCallWithoutAccessAtTheEnd"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:651:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier339=null;

		CommonTree Identifier339_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier339=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3782); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier339_tree = 
			(CommonTree)adaptor.create(Identifier339)
			;
			adaptor.addChild(root_0, Identifier339_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier341=null;
		ParserRuleReturnScope staticAccessOrParent340 =null;

		CommonTree Identifier341_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:656:4: staticAccessOrParent Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3793);
			staticAccessOrParent340=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent340.getTree());

			Identifier341=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3795); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier341_tree = 
			(CommonTree)adaptor.create(Identifier341)
			;
			adaptor.addChild(root_0, Identifier341_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal342=null;
		Token char_literal344=null;
		ParserRuleReturnScope primitiveAtom343 =null;
		ParserRuleReturnScope primitiveAtom345 =null;
		ParserRuleReturnScope primitiveAtom346 =null;

		CommonTree char_literal342_tree=null;
		CommonTree char_literal344_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:660:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt98=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt98=1;
				}
				break;
			case Minus:
				{
				alt98=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt98=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:660:4: '+' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal342=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3807); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal342_tree = 
					(CommonTree)adaptor.create(char_literal342)
					;
					adaptor.addChild(root_0, char_literal342_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3809);
					primitiveAtom343=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom343.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:661:4: '-' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal344=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal344_tree = 
					(CommonTree)adaptor.create(char_literal344)
					;
					adaptor.addChild(root_0, char_literal344_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3816);
					primitiveAtom345=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom345.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3821);
					primitiveAtom346=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom346.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set347=null;

		CommonTree set347_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set347=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set347)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal348=null;
		Token char_literal350=null;
		Token TypeArray351=null;
		Token char_literal352=null;
		Token char_literal354=null;
		ParserRuleReturnScope array_content349 =null;
		ParserRuleReturnScope array_content353 =null;

		CommonTree char_literal348_tree=null;
		CommonTree char_literal350_tree=null;
		CommonTree TypeArray351_tree=null;
		CommonTree char_literal352_tree=null;
		CommonTree char_literal354_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LeftSquareBrace) ) {
				alt101=1;
			}
			else if ( (LA101_0==TypeArray) ) {
				alt101=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:9: '[' ( array_content )? ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal348=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal348_tree = 
					(CommonTree)adaptor.create(char_literal348)
					;
					adaptor.addChild(root_0, char_literal348_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:13: ( array_content )?
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==At||LA99_0==Backslash||LA99_0==BitwiseNot||LA99_0==Bool||LA99_0==Clone||LA99_0==Float||LA99_0==Identifier||LA99_0==Int||(LA99_0 >= LeftParanthesis && LA99_0 <= LeftSquareBrace)||LA99_0==LogicNot||LA99_0==Minus||LA99_0==MinusMinus||LA99_0==New||LA99_0==Null||(LA99_0 >= ParentColonColon && LA99_0 <= Plus)||LA99_0==PlusPlus||LA99_0==SelfColonColon||LA99_0==String||LA99_0==This||LA99_0==TypeArray||LA99_0==VariableId) ) {
						alt99=1;
					}
					switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:728:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array4321);
							array_content349=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content349.getTree());

							}
							break;

					}

					char_literal350=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4324); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal350_tree = 
					(CommonTree)adaptor.create(char_literal350)
					;
					adaptor.addChild(root_0, char_literal350_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:729:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray351=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4330); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray351_tree = 
					(CommonTree)adaptor.create(TypeArray351)
					;
					adaptor.addChild(root_0, TypeArray351_tree);
					}

					char_literal352=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal352_tree = 
					(CommonTree)adaptor.create(char_literal352)
					;
					adaptor.addChild(root_0, char_literal352_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:729:18: ( array_content )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==At||LA100_0==Backslash||LA100_0==BitwiseNot||LA100_0==Bool||LA100_0==Clone||LA100_0==Float||LA100_0==Identifier||LA100_0==Int||(LA100_0 >= LeftParanthesis && LA100_0 <= LeftSquareBrace)||LA100_0==LogicNot||LA100_0==Minus||LA100_0==MinusMinus||LA100_0==New||LA100_0==Null||(LA100_0 >= ParentColonColon && LA100_0 <= Plus)||LA100_0==PlusPlus||LA100_0==SelfColonColon||LA100_0==String||LA100_0==This||LA100_0==TypeArray||LA100_0==VariableId) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:729:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array4334);
							array_content353=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content353.getTree());

							}
							break;

					}

					char_literal354=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal354_tree = 
					(CommonTree)adaptor.create(char_literal354)
					;
					adaptor.addChild(root_0, char_literal354_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final TSPHPParser.array_content_return array_content() throws RecognitionException {
		TSPHPParser.array_content_return retval = new TSPHPParser.array_content_return();
		retval.start = input.LT(1);
		int array_content_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal356=null;
		Token char_literal358=null;
		Token string_literal360=null;
		ParserRuleReturnScope expression355 =null;
		ParserRuleReturnScope expression357 =null;
		ParserRuleReturnScope expression359 =null;
		ParserRuleReturnScope expression361 =null;

		CommonTree string_literal356_tree=null;
		CommonTree char_literal358_tree=null;
		CommonTree string_literal360_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:4: ( expression '=>' )?
			int alt102=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA102_1 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA102_2 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA102_3 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case At:
					{
					int LA102_4 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Clone:
					{
					int LA102_5 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case New:
					{
					int LA102_6 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Plus:
					{
					int LA102_7 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Minus:
					{
					int LA102_8 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Backslash:
					{
					int LA102_9 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Identifier:
					{
					int LA102_10 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case SelfColonColon:
					{
					int LA102_11 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case ParentColonColon:
					{
					int LA102_12 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case This:
					{
					int LA102_13 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case VariableId:
					{
					int LA102_14 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA102_15 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA102_16 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA102_17 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case Null:
				case String:
					{
					int LA102_18 = input.LA(2);
					if ( (synpred177_TSPHP()) ) {
						alt102=1;
					}
					}
					break;
			}
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content4350);
					expression355=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression355.getTree());

					string_literal356=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content4352); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal356_tree = 
					(CommonTree)adaptor.create(string_literal356)
					;
					adaptor.addChild(root_0, string_literal356_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content4356);
			expression357=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression357.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:35: ( ',' ( expression '=>' )? expression )*
			loop104:
			do {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( (LA104_0==Comma) ) {
					alt104=1;
				}

				switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:36: ',' ( expression '=>' )? expression
					{
					char_literal358=(Token)match(input,Comma,FOLLOW_Comma_in_array_content4360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal358_tree = 
					(CommonTree)adaptor.create(char_literal358)
					;
					adaptor.addChild(root_0, char_literal358_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:40: ( expression '=>' )?
					int alt103=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA103_1 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA103_2 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA103_3 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case At:
							{
							int LA103_4 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Clone:
							{
							int LA103_5 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case New:
							{
							int LA103_6 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Plus:
							{
							int LA103_7 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Minus:
							{
							int LA103_8 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Backslash:
							{
							int LA103_9 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Identifier:
							{
							int LA103_10 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case SelfColonColon:
							{
							int LA103_11 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case ParentColonColon:
							{
							int LA103_12 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case This:
							{
							int LA103_13 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case VariableId:
							{
							int LA103_14 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA103_15 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA103_16 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA103_17 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case Null:
						case String:
							{
							int LA103_18 = input.LA(2);
							if ( (synpred178_TSPHP()) ) {
								alt103=1;
							}
							}
							break;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content4363);
							expression359=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression359.getTree());

							string_literal360=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content4365); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal360_tree = 
							(CommonTree)adaptor.create(string_literal360)
							;
							adaptor.addChild(root_0, string_literal360_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content4369);
					expression361=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression361.getTree());

					}
					break;

				default :
					break loop104;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:736:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal362=null;
		Token char_literal363=null;
		Token char_literal365=null;
		Token string_literal366=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression364 =null;

		CommonTree string_literal362_tree=null;
		CommonTree char_literal363_tree=null;
		CommonTree char_literal365_tree=null;
		CommonTree string_literal366_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:737:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:737:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal362=(Token)match(input,If,FOLLOW_If_in_ifCondition4381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal362);

			char_literal363=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4383); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal363);

			pushFollow(FOLLOW_expression_in_ifCondition4385);
			expression364=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression364.getTree());
			char_literal365=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4387); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal365);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4392);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==Else) ) {
				int LA105_1 = input.LA(2);
				if ( (synpred180_TSPHP()) ) {
					alt105=1;
				}
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal366=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal366);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4404);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, If, instructionThen, instructionElse
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
			// 738:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:100: ( $instructionElse)?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:742:1: switchCondition : 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal367=null;
		Token char_literal368=null;
		Token VariableId369=null;
		Token char_literal370=null;
		Token char_literal371=null;
		Token char_literal373=null;
		ParserRuleReturnScope switchContent372 =null;

		CommonTree string_literal367_tree=null;
		CommonTree char_literal368_tree=null;
		CommonTree VariableId369_tree=null;
		CommonTree char_literal370_tree=null;
		CommonTree char_literal371_tree=null;
		CommonTree char_literal373_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:2: ( 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:4: 'switch' '(' VariableId ')' '{' switchContent '}'
			{
			string_literal367=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4435); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal367);

			char_literal368=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal368);

			VariableId369=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId369);

			char_literal370=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4441); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal370);

			char_literal371=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4443); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal371);

			pushFollow(FOLLOW_switchContent_in_switchCondition4445);
			switchContent372=switchContent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_switchContent.add(switchContent372.getTree());
			char_literal373=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4447); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal373);

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
			// 743:55: -> ^( 'switch' VariableId switchContent )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:58: ^( 'switch' VariableId switchContent )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:745:1: switchContent : ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCase374 =null;
		ParserRuleReturnScope defaultCase375 =null;
		ParserRuleReturnScope normalCase376 =null;
		ParserRuleReturnScope normalCase377 =null;
		ParserRuleReturnScope defaultCase378 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:2: ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==Case) ) {
				int LA110_1 = input.LA(2);
				if ( (synpred183_TSPHP()) ) {
					alt110=1;
				}
				else if ( (true) ) {
					alt110=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: ( normalCase )+ defaultCase ( normalCase )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: ( normalCase )+
					int cnt106=0;
					loop106:
					do {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==Case) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4468);
							normalCase374=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase374.getTree());

							}
							break;

						default :
							if ( cnt106 >= 1 ) break loop106;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(106, input);
								throw eee;
						}
						cnt106++;
					} while (true);

					pushFollow(FOLLOW_defaultCase_in_switchContent4471);
					defaultCase375=defaultCase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase375.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:28: ( normalCase )+
					int cnt107=0;
					loop107:
					do {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==Case) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:28: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4473);
							normalCase376=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase376.getTree());

							}
							break;

						default :
							if ( cnt107 >= 1 ) break loop107;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(107, input);
								throw eee;
						}
						cnt107++;
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:4: ( normalCase )+ ( defaultCase )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:4: ( normalCase )+
					int cnt108=0;
					loop108:
					do {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==Case) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4480);
							normalCase377=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase377.getTree());

							}
							break;

						default :
							if ( cnt108 >= 1 ) break loop108;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(108, input);
								throw eee;
						}
						cnt108++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:16: ( defaultCase )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==Default) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:16: defaultCase
							{
							pushFollow(FOLLOW_defaultCase_in_switchContent4483);
							defaultCase378=defaultCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase378.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:750:1: normalCase : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.normalCase_return normalCase() throws RecognitionException {
		TSPHPParser.normalCase_return retval = new TSPHPParser.normalCase_return();
		retval.start = input.LT(1);
		int normalCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel379 =null;
		ParserRuleReturnScope instructionInclBreakContinue380 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:4: ( caseLabel )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCase4495);
					caseLabel379=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel379.getTree());
					}
					break;

				default :
					if ( cnt111 >= 1 ) break loop111;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(111, input);
						throw eee;
				}
				cnt111++;
			} while (true);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:15: ( instructionInclBreakContinue )+
			int cnt112=0;
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Backslash||LA112_0==Break||LA112_0==Continue||LA112_0==Do||LA112_0==Echo||LA112_0==Exit||(LA112_0 >= For && LA112_0 <= Foreach)||(LA112_0 >= Identifier && LA112_0 <= If)||LA112_0==LeftCurlyBrace||LA112_0==MinusMinus||LA112_0==ParentColonColon||LA112_0==PlusPlus||LA112_0==Return||LA112_0==SelfColonColon||(LA112_0 >= Switch && LA112_0 <= TypeString)||LA112_0==VariableId||LA112_0==While) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCase4498);
					instructionInclBreakContinue380=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue380.getTree());
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

			// AST REWRITE
			// elements: instructionInclBreakContinue, caseLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 752:3: -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:752:6: ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:1: defaultCase : defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.defaultCase_return defaultCase() throws RecognitionException {
		TSPHPParser.defaultCase_return retval = new TSPHPParser.defaultCase_return();
		retval.start = input.LT(1);
		int defaultCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope defaultLabel381 =null;
		ParserRuleReturnScope instructionInclBreakContinue382 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:2: ( defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:4: defaultLabel ( instructionInclBreakContinue )+
			{
			pushFollow(FOLLOW_defaultLabel_in_defaultCase4529);
			defaultLabel381=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel381.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:17: ( instructionInclBreakContinue )+
			int cnt113=0;
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==Backslash||LA113_0==Break||LA113_0==Continue||LA113_0==Do||LA113_0==Echo||LA113_0==Exit||(LA113_0 >= For && LA113_0 <= Foreach)||(LA113_0 >= Identifier && LA113_0 <= If)||LA113_0==LeftCurlyBrace||LA113_0==MinusMinus||LA113_0==ParentColonColon||LA113_0==PlusPlus||LA113_0==Return||LA113_0==SelfColonColon||(LA113_0 >= Switch && LA113_0 <= TypeString)||LA113_0==VariableId||LA113_0==While) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:756:17: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCase4531);
					instructionInclBreakContinue382=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue382.getTree());
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

			// AST REWRITE
			// elements: defaultLabel, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 757:3: -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:757:6: ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:760:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal383=null;
		Token char_literal385=null;
		ParserRuleReturnScope expression384 =null;

		CommonTree string_literal383_tree=null;
		CommonTree char_literal385_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal383=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4559); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4562);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression384.getTree());

			char_literal385=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4564); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:763:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal386=null;
		Token char_literal387=null;

		CommonTree string_literal386_tree=null;
		CommonTree char_literal387_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:764:2: ( 'default' ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:764:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal386=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4574); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal386_tree = 
			(CommonTree)adaptor.create(string_literal386)
			;
			adaptor.addChild(root_0, string_literal386_tree);
			}

			char_literal387=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4576); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:1: forLoop : 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue ) ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal388=null;
		Token char_literal389=null;
		Token char_literal391=null;
		Token char_literal393=null;
		Token char_literal395=null;
		ParserRuleReturnScope forInit390 =null;
		ParserRuleReturnScope expressionList392 =null;
		ParserRuleReturnScope expressionList394 =null;
		ParserRuleReturnScope instructionInclBreakContinue396 =null;

		CommonTree string_literal388_tree=null;
		CommonTree char_literal389_tree=null;
		CommonTree char_literal391_tree=null;
		CommonTree char_literal393_tree=null;
		CommonTree char_literal395_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:9: ( 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:11: 'for' '(' forInit ';' expressionList ';' expressionList ')' instructionInclBreakContinue
			{
			string_literal388=(Token)match(input,For,FOLLOW_For_in_forLoop4586); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_For.add(string_literal388);

			char_literal389=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop4588); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal389);

			pushFollow(FOLLOW_forInit_in_forLoop4590);
			forInit390=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_forInit.add(forInit390.getTree());
			char_literal391=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop4592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal391);

			pushFollow(FOLLOW_expressionList_in_forLoop4594);
			expressionList392=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList392.getTree());
			char_literal393=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop4597); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal393);

			pushFollow(FOLLOW_expressionList_in_forLoop4599);
			expressionList394=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionList.add(expressionList394.getTree());
			char_literal395=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop4601); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal395);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4603);
			instructionInclBreakContinue396=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue396.getTree());
			// AST REWRITE
			// elements: For, expressionList, expressionList, instructionInclBreakContinue, forInit
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 766:101: -> ^( 'for' forInit expressionList expressionList instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:104: ^( 'for' forInit expressionList expressionList instructionInclBreakContinue )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:768:1: forInit : varListOrExprList ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope varListOrExprList397 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:768:9: ( varListOrExprList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:768:11: varListOrExprList
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_varListOrExprList_in_forInit4625);
			varListOrExprList397=varListOrExprList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varListOrExprList397.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:1: varListOrExprList : ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST variableDeclarationListInclVariableId ) | expressionList );
	public final TSPHPParser.varListOrExprList_return varListOrExprList() throws RecognitionException {
		TSPHPParser.varListOrExprList_return retval = new TSPHPParser.varListOrExprList_return();
		retval.start = input.LT(1);
		int varListOrExprList_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope variableDeclarationListInclVariableId398 =null;
		ParserRuleReturnScope expressionList399 =null;

		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:772:2: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST variableDeclarationListInclVariableId ) | expressionList )
			int alt114=2;
			alt114 = dfa114.predict(input);
			switch (alt114) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:772:4: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_varListOrExprList4636);
					variableDeclarationListInclVariableId398=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId398.getTree());
					// AST REWRITE
					// elements: variableDeclarationListInclVariableId
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 772:42: -> ^( VARIABLE_DECLARATION_LIST variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:772:45: ^( VARIABLE_DECLARATION_LIST variableDeclarationListInclVariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, "VARIABLE_DECLARATION_LIST")
						, root_1);

						adaptor.addChild(root_1, stream_variableDeclarationListInclVariableId.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:773:4: expressionList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expressionList_in_varListOrExprList4649);
					expressionList399=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList399.getTree());

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


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:776:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal400=null;
		Token char_literal401=null;
		Token string_literal403=null;
		Token string_literal404=null;
		Token char_literal405=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression402 =null;
		ParserRuleReturnScope instructionInclBreakContinue406 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal400_tree=null;
		CommonTree char_literal401_tree=null;
		CommonTree string_literal403_tree=null;
		CommonTree string_literal404_tree=null;
		CommonTree char_literal405_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:777:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:777:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal400=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4660); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal400);

			char_literal401=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4662); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal401);

			pushFollow(FOLLOW_expression_in_foreachLoop4664);
			expression402=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression402.getTree());
			string_literal403=(Token)match(input,As,FOLLOW_As_in_foreachLoop4666); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal403);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:777:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt115=2;
			switch ( input.LA(1) ) {
				case TypeBool:
					{
					int LA115_1 = input.LA(2);
					if ( (LA115_1==VariableId) ) {
						int LA115_7 = input.LA(3);
						if ( (LA115_7==Arrow) ) {
							alt115=1;
						}
					}
					}
					break;
				case TypeBoolean:
					{
					int LA115_2 = input.LA(2);
					if ( (LA115_2==VariableId) ) {
						int LA115_7 = input.LA(3);
						if ( (LA115_7==Arrow) ) {
							alt115=1;
						}
					}
					}
					break;
				case TypeInt:
					{
					int LA115_3 = input.LA(2);
					if ( (LA115_3==VariableId) ) {
						int LA115_7 = input.LA(3);
						if ( (LA115_7==Arrow) ) {
							alt115=1;
						}
					}
					}
					break;
				case TypeFloat:
					{
					int LA115_4 = input.LA(2);
					if ( (LA115_4==VariableId) ) {
						int LA115_7 = input.LA(3);
						if ( (LA115_7==Arrow) ) {
							alt115=1;
						}
					}
					}
					break;
				case TypeString:
					{
					int LA115_5 = input.LA(2);
					if ( (LA115_5==VariableId) ) {
						int LA115_7 = input.LA(3);
						if ( (LA115_7==Arrow) ) {
							alt115=1;
						}
					}
					}
					break;
			}
			switch (alt115) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:777:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4671);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal404=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4677); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal404);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutResource_in_foreachLoop4683);
			valueType=allTypesWithoutResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4687); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal405=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4689); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal405);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4691);
			instructionInclBreakContinue406=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue406.getTree());
			// AST REWRITE
			// elements: valueVarId, valueType, expression, Foreach, keyType, instructionInclBreakContinue, keyVarId
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
			// 778:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:778:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:778:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:778:40: ( $keyVarId)?
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
			if ( state.backtracking>0 ) { memoize(input, 105, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:780:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal407=null;
		Token char_literal408=null;
		Token char_literal410=null;
		ParserRuleReturnScope expression409 =null;
		ParserRuleReturnScope instructionInclBreakContinue411 =null;

		CommonTree string_literal407_tree=null;
		CommonTree char_literal408_tree=null;
		CommonTree char_literal410_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:781:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:781:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal407=(Token)match(input,While,FOLLOW_While_in_whileLoop4727); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal407);

			char_literal408=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4729); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal408);

			pushFollow(FOLLOW_expression_in_whileLoop4731);
			expression409=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression409.getTree());
			char_literal410=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4733); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal410);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4735);
			instructionInclBreakContinue411=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue411.getTree());
			// AST REWRITE
			// elements: expression, instructionInclBreakContinue, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 781:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:781:63: ^( 'while' expression instructionInclBreakContinue )
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
			if ( state.backtracking>0 ) { memoize(input, 106, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:783:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal412=null;
		Token string_literal414=null;
		Token char_literal415=null;
		Token char_literal417=null;
		Token char_literal418=null;
		ParserRuleReturnScope instructionInclBreakContinue413 =null;
		ParserRuleReturnScope expression416 =null;

		CommonTree string_literal412_tree=null;
		CommonTree string_literal414_tree=null;
		CommonTree char_literal415_tree=null;
		CommonTree char_literal417_tree=null;
		CommonTree char_literal418_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:784:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:784:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal412=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4755); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal412);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4757);
			instructionInclBreakContinue413=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue413.getTree());
			string_literal414=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4759); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal414);

			char_literal415=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4761); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal415);

			pushFollow(FOLLOW_expression_in_doWhileLoop4763);
			expression416=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression416.getTree());
			char_literal417=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4765); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal417);

			char_literal418=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4767); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal418);

			// AST REWRITE
			// elements: expression, instructionInclBreakContinue, Do
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 784:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:784:72: ^( 'do' instructionInclBreakContinue expression )
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
			if ( state.backtracking>0 ) { memoize(input, 107, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:786:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal419=null;
		Token char_literal421=null;
		ParserRuleReturnScope instructionInclBreakContinue420 =null;
		ParserRuleReturnScope catchBlock422 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal419_tree=null;
		CommonTree char_literal421_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+
			{
			string_literal419=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4786); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal419);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4790); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:23: ( instructionInclBreakContinue )+
			int cnt116=0;
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==Backslash||LA116_0==Break||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= For && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==LeftCurlyBrace||LA116_0==MinusMinus||LA116_0==ParentColonColon||LA116_0==PlusPlus||LA116_0==Return||LA116_0==SelfColonColon||(LA116_0 >= Switch && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4792);
					instructionInclBreakContinue420=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue420.getTree());
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

			char_literal421=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4795); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal421);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:57: ( catchBlock )+
			int cnt117=0;
			loop117:
			do {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==Catch) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:787:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4797);
					catchBlock422=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock422.getTree());
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

			// AST REWRITE
			// elements: instructionInclBreakContinue, catchBlock, Try
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 788:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:788:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:788:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 108, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:790:1: catchBlock : 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token catchBegin=null;
		Token string_literal423=null;
		Token char_literal424=null;
		Token VariableId426=null;
		Token char_literal427=null;
		Token char_literal429=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject425 =null;
		ParserRuleReturnScope instructionInclBreakContinue428 =null;

		CommonTree catchBegin_tree=null;
		CommonTree string_literal423_tree=null;
		CommonTree char_literal424_tree=null;
		CommonTree VariableId426_tree=null;
		CommonTree char_literal427_tree=null;
		CommonTree char_literal429_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Catch=new RewriteRuleTokenStream(adaptor,"token Catch");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:791:2: ( 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:791:4: 'catch' '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal423=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock4827); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal423);

			char_literal424=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock4829); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal424);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4831);
			classInterfaceTypeWithoutObject425=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject425.getTree());
			VariableId426=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock4833); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId426);

			char_literal427=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock4835); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal427);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock4839); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:791:78: ( instructionInclBreakContinue )*
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==Backslash||LA118_0==Break||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= For && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==LeftCurlyBrace||LA118_0==MinusMinus||LA118_0==ParentColonColon||LA118_0==PlusPlus||LA118_0==Return||LA118_0==SelfColonColon||(LA118_0 >= Switch && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:791:78: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock4841);
					instructionInclBreakContinue428=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue428.getTree());
					}
					break;

				default :
					break loop118;
				}
			} while (true);

			char_literal429=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock4844); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal429);

			// AST REWRITE
			// elements: instructionInclBreakContinue, VariableId, classInterfaceTypeWithoutObject
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 792:3: -> ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:792:6: ^( VARIABLE_DECLARATION_LIST ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, "VARIABLE_DECLARATION_LIST")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:793:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject425!=null?((Token)classInterfaceTypeWithoutObject425.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:795:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:795:32: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 109, catchBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchBlock"


	public static class throwException_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:798:1: throwException : 'throw' ^ newObject ';' !;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal430=null;
		Token char_literal432=null;
		ParserRuleReturnScope newObject431 =null;

		CommonTree string_literal430_tree=null;
		CommonTree char_literal432_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:2: ( 'throw' ^ newObject ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:4: 'throw' ^ newObject ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal430=(Token)match(input,Throw,FOLLOW_Throw_in_throwException4890); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal430_tree = 
			(CommonTree)adaptor.create(string_literal430)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal430_tree, root_0);
			}

			pushFollow(FOLLOW_newObject_in_throwException4893);
			newObject431=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject431.getTree());

			char_literal432=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException4895); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 110, throwException_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred67_TSPHP
	public final void synpred67_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred67_TSPHP2086);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred67_TSPHP2088); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred67_TSPHP

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred68_TSPHP2094);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP2096); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred69_TSPHP
	public final void synpred69_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: ( incrementDecrement ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: incrementDecrement ';'
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred69_TSPHP2102);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP2104); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred78_TSPHP
	public final void synpred78_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: ( postFixCallWithoutAccesAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: postFixCallWithoutAccesAtTheEnd ';'
		{
		pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_synpred78_TSPHP2150);
		postFixCallWithoutAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred78_TSPHP2152); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred78_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: ( postFixMethodCallWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: postFixMethodCallWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_synpred79_TSPHP2158);
		postFixMethodCallWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP2160); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred100_TSPHP2481); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred100_TSPHP2484);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred101_TSPHP2500); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred101_TSPHP2503);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred102_TSPHP2519); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred102_TSPHP2522);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred103_TSPHP2536);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred103_TSPHP2539);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred130_TSPHP
	public final void synpred130_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred130_TSPHP2848); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutResource_in_synpred130_TSPHP2850);
		allTypesWithoutResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred130_TSPHP2852); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred130_TSPHP2854);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred130_TSPHP

	// $ANTLR start synpred133_TSPHP
	public final void synpred133_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:14: ( postFixCallInclAccesAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:14: postFixCallInclAccesAtTheEnd
		{
		pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred133_TSPHP2902);
		postFixCallInclAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred133_TSPHP

	// $ANTLR start synpred144_TSPHP
	public final void synpred144_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: ( postFixCallInclAccesAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: postFixCallInclAccesAtTheEnd
		{
		pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred144_TSPHP3135);
		postFixCallInclAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred144_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		Token memberAccess=null;
		Token arrayAccess=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: ( (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )* call
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )*
		loop135:
		do {
			int alt135=3;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==ObjectOperator) ) {
				int LA135_1 = input.LA(2);
				if ( (LA135_1==Identifier) ) {
					int LA135_3 = input.LA(3);
					if ( (LA135_3==LeftSquareBrace||LA135_3==ObjectOperator) ) {
						alt135=1;
					}

				}

			}
			else if ( (LA135_0==LeftSquareBrace) ) {
				alt135=2;
			}

			switch (alt135) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:6: memberAccess= '->' Identifier
				{
				memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_synpred150_TSPHP3261); if (state.failed) return ;

				match(input,Identifier,FOLLOW_Identifier_in_synpred150_TSPHP3263); if (state.failed) return ;

				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:6: arrayAccess= '[' expression ']'
				{
				arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred150_TSPHP3286); if (state.failed) return ;

				pushFollow(FOLLOW_expression_in_synpred150_TSPHP3288);
				expression();
				state._fsp--;
				if (state.failed) return ;

				match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred150_TSPHP3290); if (state.failed) return ;

				}
				break;

			default :
				break loop135;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred150_TSPHP3313);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred154_TSPHP3476);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred155_TSPHP
	public final void synpred155_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: ( postFixVariableInclCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: postFixVariableInclCall
		{
		pushFollow(FOLLOW_postFixVariableInclCall_in_synpred155_TSPHP3481);
		postFixVariableInclCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred155_TSPHP

	// $ANTLR start synpred156_TSPHP
	public final void synpred156_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred156_TSPHP3486);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred156_TSPHP

	// $ANTLR start synpred157_TSPHP
	public final void synpred157_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:620:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred157_TSPHP3491);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred157_TSPHP

	// $ANTLR start synpred177_TSPHP
	public final void synpred177_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred177_TSPHP4350);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred177_TSPHP4352); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred177_TSPHP

	// $ANTLR start synpred178_TSPHP
	public final void synpred178_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred178_TSPHP4363);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred178_TSPHP4365); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred178_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:738:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred180_TSPHP4399); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred180_TSPHP4404);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred180_TSPHP

	// $ANTLR start synpred183_TSPHP
	public final void synpred183_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: ( ( normalCase )+ defaultCase ( normalCase )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: ( normalCase )+ defaultCase ( normalCase )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: ( normalCase )+
		int cnt139=0;
		loop139:
		do {
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==Case) ) {
				alt139=1;
			}

			switch (alt139) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:4: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred183_TSPHP4468);
				normalCase();
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

		pushFollow(FOLLOW_defaultCase_in_synpred183_TSPHP4471);
		defaultCase();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:28: ( normalCase )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:28: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred183_TSPHP4473);
				normalCase();
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

		}

	}
	// $ANTLR end synpred183_TSPHP

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
	public final boolean synpred177_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred177_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred67_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred130_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_TSPHP_fragment(); // can never throw exception
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
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA84 dfa84 = new DFA84(this);
	protected DFA88 dfa88 = new DFA88(this);
	protected DFA92 dfa92 = new DFA92(this);
	protected DFA114 dfa114 = new DFA114(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\5\1\74\1\uffff\1\14\1\uffff\1\74\1\uffff\1\14";
	static final String DFA3_maxS =
		"\1\u0090\1\102\1\uffff\1\166\1\uffff\1\74\1\uffff\1\166";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\6\uffff\1\2\15\uffff\1\2\4\uffff\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\17\uffff\1\2\4\uffff"+
			"\1\1\14\uffff\1\2\2\uffff\1\2\5\uffff\1\2\7\uffff\1\2\7\uffff\14\2\2"+
			"\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\65\uffff\1\4\63\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\65\uffff\1\4\63\uffff\1\6"
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
			return "199:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA47_eotS =
		"\21\uffff";
	static final String DFA47_eofS =
		"\21\uffff";
	static final String DFA47_minS =
		"\1\14\10\u008e\1\74\1\14\1\uffff\1\10\1\74\2\uffff\1\14";
	static final String DFA47_maxS =
		"\1\u0088\10\u008e\1\74\1\u008e\1\uffff\1\157\1\74\2\uffff\1\u008e";
	static final String DFA47_acceptS =
		"\13\uffff\1\3\2\uffff\1\1\1\2\1\uffff";
	static final String DFA47_specialS =
		"\21\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\11\57\uffff\1\12\62\uffff\1\13\21\uffff\1\6\1\1\1\2\1\4\1\3\1\10\1"+
			"\7\1\5",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\14",
			"\1\12",
			"\1\15\u0081\uffff\1\14",
			"",
			"\1\16\24\uffff\1\17\121\uffff\1\17",
			"\1\20",
			"",
			"",
			"\1\15\u0081\uffff\1\14"
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
			return "371:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclarationOptional )+ ) | paramDeclaration ( ',' paramDeclaration )* ( ',' paramDeclarationOptional )* -> ^( PARAM_LIST ( paramDeclaration )+ ( paramDeclarationOptional )* ) | -> PARAM_LIST );";
		}
	}

	static final String DFA45_eotS =
		"\21\uffff";
	static final String DFA45_eofS =
		"\21\uffff";
	static final String DFA45_minS =
		"\1\35\1\14\1\uffff\10\u008e\1\74\1\14\1\10\1\74\1\uffff\1\14";
	static final String DFA45_maxS =
		"\1\157\1\u0088\1\uffff\10\u008e\1\74\1\u008e\1\157\1\74\1\uffff\1\u008e";
	static final String DFA45_acceptS =
		"\2\uffff\1\2\14\uffff\1\1\1\uffff";
	static final String DFA45_specialS =
		"\21\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\1\121\uffff\1\2",
			"\1\13\57\uffff\1\14\104\uffff\1\10\1\3\1\4\1\6\1\5\1\12\1\11\1\7",
			"",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\15",
			"\1\14",
			"\1\16\u0081\uffff\1\15",
			"\1\2\24\uffff\1\17\121\uffff\1\17",
			"\1\20",
			"",
			"\1\16\u0081\uffff\1\15"
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
			return "()* loopback of 373:21: ( ',' paramDeclaration )*";
		}
	}

	static final String DFA84_eotS =
		"\10\uffff";
	static final String DFA84_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA84_minS =
		"\1\130\1\14\1\74\1\6\1\74\2\uffff\1\6";
	static final String DFA84_maxS =
		"\1\130\2\74\1\172\1\74\2\uffff\1\172";
	static final String DFA84_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA84_specialS =
		"\10\uffff}>";
	static final String[] DFA84_transitionS = {
			"\1\1",
			"\1\2\57\uffff\1\3",
			"\1\3",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\10\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\10\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6"
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
			return "560:1: newObject : ( 'new' classInterfaceTypeWithoutObject '(' expressionList ')' -> ^( 'new' classInterfaceTypeWithoutObject expressionList ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST ) );";
		}
	}

	static final String DFA88_eotS =
		"\7\uffff";
	static final String DFA88_eofS =
		"\7\uffff";
	static final String DFA88_minS =
		"\1\14\1\74\1\14\1\uffff\1\74\1\uffff\1\14";
	static final String DFA88_maxS =
		"\1\u008e\1\74\1\103\1\uffff\1\74\1\uffff\1\103";
	static final String DFA88_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA88_specialS =
		"\7\uffff}>";
	static final String[] DFA88_transitionS = {
			"\1\1\57\uffff\1\2\47\uffff\1\3\20\uffff\1\3\10\uffff\1\3\17\uffff\1\3",
			"\1\2",
			"\1\4\34\uffff\1\3\31\uffff\1\5",
			"",
			"\1\6",
			"",
			"\1\4\34\uffff\1\3\31\uffff\1\5"
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
			return "583:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA92_eotS =
		"\12\uffff";
	static final String DFA92_eofS =
		"\12\uffff";
	static final String DFA92_minS =
		"\1\14\3\74\1\14\2\uffff\2\74\1\14";
	static final String DFA92_maxS =
		"\3\u008e\1\74\1\51\2\uffff\1\74\1\u008e\1\51";
	static final String DFA92_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA92_specialS =
		"\12\uffff}>";
	static final String[] DFA92_transitionS = {
			"\1\3\57\uffff\1\4\47\uffff\1\2\20\uffff\1\1\10\uffff\1\5\17\uffff\1\5",
			"\1\6\121\uffff\1\5",
			"\1\6\121\uffff\1\5",
			"\1\4",
			"\1\7\34\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\121\uffff\1\5",
			"\1\7\34\uffff\1\10"
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
			return "612:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA114_eotS =
		"\11\uffff";
	static final String DFA114_eofS =
		"\11\uffff";
	static final String DFA114_minS =
		"\1\11\1\uffff\1\103\1\74\1\10\1\uffff\1\14\1\74\1\14";
	static final String DFA114_maxS =
		"\1\u008e\1\uffff\1\u008e\1\74\1\u008e\1\uffff\1\u008e\1\74\1\u008e";
	static final String DFA114_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA114_specialS =
		"\11\uffff}>";
	static final String[] DFA114_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\6\uffff\1\5\30\uffff\1\5\7\uffff"+
			"\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1\5\5\uffff"+
			"\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff\1\5\1\uffff"+
			"\1\5\2\uffff\1\2\7\1\5\uffff\1\5",
			"",
			"\1\5\112\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\11\uffff\1\5\5\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\3\uffff\2\5\1\uffff\4\5\2\uffff\3\5\11\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\23\uffff\1\1",
			"",
			"\1\7\34\uffff\1\5\31\uffff\1\5\112\uffff\1\1",
			"\1\10",
			"\1\7\34\uffff\1\5\31\uffff\1\5\112\uffff\1\1"
	};

	static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
	static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
	static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
	static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
	static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
	static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
	static final short[][] DFA114_transition;

	static {
		int numStates = DFA114_transitionS.length;
		DFA114_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
		}
	}

	class DFA114 extends DFA {

		public DFA114(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 114;
			this.eot = DFA114_eot;
			this.eof = DFA114_eof;
			this.min = DFA114_min;
			this.max = DFA114_max;
			this.accept = DFA114_accept;
			this.special = DFA114_special;
			this.transition = DFA114_transition;
		}
		@Override
		public String getDescription() {
			return "771:1: varListOrExprList : ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST variableDeclarationListInclVariableId ) | expressionList );";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_EOF_in_prog1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_EOF_in_prog1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1018 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1034 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1036 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1038 = new BitSet(new long[]{0x30E8902084001020L,0xE020209000040006L,0x00000000000149FFL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1040 = new BitSet(new long[]{0x30E8902084001022L,0xE020209000040006L,0x00000000000149FFL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1053 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1058 = new BitSet(new long[]{0x30E8902084001020L,0xE020209000040006L,0x00000000000149FFL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1060 = new BitSet(new long[]{0x30E8902084001020L,0xE020609000040006L,0x00000000000149FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1159 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1162 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1164 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1184 = new BitSet(new long[]{0x30E8902084001022L,0xE020209000040006L,0x00000000000149FFL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1217 = new BitSet(new long[]{0x1000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1219 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1222 = new BitSet(new long[]{0x1000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1224 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1241 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1243 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1245 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1253 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1255 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1266 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1318 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1320 = new BitSet(new long[]{0x4001000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1322 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1328 = new BitSet(new long[]{0x0088000080000020L,0x08000D0000000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1330 = new BitSet(new long[]{0x0088000080000020L,0x08004D0000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1347 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1360 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1363 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1365 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1378 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000013CL});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1417 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1419 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1422 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1424 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1438 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1441 = new BitSet(new long[]{0x1010000000100000L,0x1000002010010001L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1453 = new BitSet(new long[]{0x0000000000000000L,0x00000D0000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1456 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x00000000000001FEL});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1458 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1497 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1504 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1506 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1525 = new BitSet(new long[]{0x0080000000000000L,0x00000C0000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1527 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1541 = new BitSet(new long[]{0x0088000000000000L,0x00000D0000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1543 = new BitSet(new long[]{0x0080000000000000L,0x00000D0000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1551 = new BitSet(new long[]{0x0080000000000000L,0x08000D0000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1553 = new BitSet(new long[]{0x0080000000000000L,0x00000D0000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1567 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1586 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1588 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1593 = new BitSet(new long[]{0x0080000080000000L,0x0000480000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1595 = new BitSet(new long[]{0x0080000080000000L,0x0000480000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1625 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1628 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1649 = new BitSet(new long[]{0x3060902000001000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1651 = new BitSet(new long[]{0x3060902000001000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1685 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x00000000000081FEL});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1688 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1692 = new BitSet(new long[]{0x1000000000001000L,0x0000800000000000L,0x00000000000001FEL});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1695 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBool_in_primitiveTypes1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBoolean_in_primitiveTypes1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeInt_in_primitiveTypes1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeFloat_in_primitiveTypes1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeString_in_primitiveTypes1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1831 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1879 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1882 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x00000000000001FEL});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1884 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1900 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1903 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x00000000000001FEL});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1905 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1910 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x00000000000001FEL});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1912 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1969 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1972 = new BitSet(new long[]{0x1010000000100000L,0x1000002010010001L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2000 = new BitSet(new long[]{0x3060902000001000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2002 = new BitSet(new long[]{0x3060902000001000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2037 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2039 = new BitSet(new long[]{0x3060902100201000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2063 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000001L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2070 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2086 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2094 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_instruction2102 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_instruction2150 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_instruction2158 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2166 = new BitSet(new long[]{0x1010000008109200L,0x506000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_instruction2169 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2178 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_instruction2181 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Comma_in_instruction2184 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_instruction2187 = new BitSet(new long[]{0x0000000020000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2197 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2212 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2215 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_expressionList2217 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2248 = new BitSet(new long[]{0x00000110000A4100L,0x0500004000520000L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2250 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCall_in_postIncrementDecrement2349 = new BitSet(new long[]{0x0000000000000000L,0x0000008000040000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2394 = new BitSet(new long[]{0x1000000000001000L,0x4020001000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_postFixVariableWithoutCall_in_preIncrementDecrement2396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2426 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2429 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2466 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2481 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2500 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2519 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ternary_in_assignment2533 = new BitSet(new long[]{0x00000110000A4102L,0x0500004000520000L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2536 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_ternary_in_assignment2539 = new BitSet(new long[]{0x00000110000A4102L,0x0500004000520000L});
	public static final BitSet FOLLOW_logicOr_in_ternary2549 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2552 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_ternary2555 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2557 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_ternary2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2573 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2588 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2602 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2605 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2608 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2619 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2622 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2625 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2636 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2639 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2642 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality2651 = new BitSet(new long[]{0x0800400000000002L,0x000000000E000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2654 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_comparison_in_equality2657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2699 = new BitSet(new long[]{0x0300000000000002L,0x0000000000000060L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2702 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2741 = new BitSet(new long[]{0x0000000000000002L,0x0280000000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2744 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2751 = new BitSet(new long[]{0x0000000000000002L,0x0280000000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2761 = new BitSet(new long[]{0x0000008000000002L,0x0000002000010000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2764 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2773 = new BitSet(new long[]{0x0000008000000002L,0x0000002000010000L});
	public static final BitSet FOLLOW_logicNot_in_factor2783 = new BitSet(new long[]{0x0000000800000002L,0x0000000000280000L});
	public static final BitSet FOLLOW_set_in_factor2786 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicNot_in_factor2795 = new BitSet(new long[]{0x0000000800000002L,0x0000000000280000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2804 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2823 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2826 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2848 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x000000000000017EL});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2850 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2852 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050019L,0x0000000000004002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2870 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050019L,0x0000000000004002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2878 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050019L,0x0000000000004002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew2898 = new BitSet(new long[]{0x1000000000001000L,0x4020001000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_cloneOrNew2902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_cloneOrNew2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew2910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew2915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember2930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember2946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember2951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent2963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2981 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccessOrArrayAccess2995 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccessOrArrayAccess2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_memberAccessOrArrayAccess3014 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_memberAccessOrArrayAccess3016 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_memberAccessOrArrayAccess3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3039 = new BitSet(new long[]{0x1000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject3043 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_newObject3045 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject3047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3062 = new BitSet(new long[]{0x1000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3089 = new BitSet(new long[]{0x1010000000101000L,0x5020009010040019L,0x0000000000004002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3109 = new BitSet(new long[]{0x1010000000101000L,0x5020009010040019L,0x0000000000004002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_primary3135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_postFixCallInclAccesAtTheEnd3154 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCallInclAccesAtTheEnd3169 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCallInclAccesAtTheEnd3171 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCallInclAccesAtTheEnd3193 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_postFixCallInclAccesAtTheEnd3195 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCallInclAccesAtTheEnd3197 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_functionCall_in_postFixCallWithoutAccesAtTheEnd3228 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_methodCall_in_postFixCallWithoutAccesAtTheEnd3238 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCallWithoutAccesAtTheEnd3261 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCallWithoutAccesAtTheEnd3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCallWithoutAccesAtTheEnd3286 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_postFixCallWithoutAccesAtTheEnd3288 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCallWithoutAccesAtTheEnd3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_call_in_postFixCallWithoutAccesAtTheEnd3313 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall3343 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_functionCall3345 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall3347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess3372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess3377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3389 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call3394 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_call3397 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call3399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3412 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall3416 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_methodCall3418 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall3419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3445 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3463 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_atom3465 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_atom3481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCall3513 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCall3531 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCall3533 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCall3555 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCall3557 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCall3559 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCall3590 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCall3605 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCall3607 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCall3629 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCall3631 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCall3633 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCall3651 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixMethodCallWithoutAccessAtTheEnd3681 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixMethodCallWithoutAccessAtTheEnd3701 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixMethodCallWithoutAccessAtTheEnd3703 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3726 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_postFixMethodCallWithoutAccessAtTheEnd3728 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3730 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_call_in_postFixMethodCallWithoutAccessAtTheEnd3753 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000010L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3793 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3807 = new BitSet(new long[]{0x1010000000100000L,0x1000000010000001L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3814 = new BitSet(new long[]{0x1010000000100000L,0x1000000010000001L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4319 = new BitSet(new long[]{0x1010000008109200L,0x502100B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_array_content_in_array4321 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4332 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_array_content_in_array4334 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content4350 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_array_content4352 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_array_content4356 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Comma_in_array_content4360 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_array_content4363 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_array_content4365 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_array_content4369 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4383 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_ifCondition4385 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4387 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4392 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4399 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4439 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4443 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4445 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4468 = new BitSet(new long[]{0x0000000401000000L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent4471 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4473 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4480 = new BitSet(new long[]{0x0000000401000002L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent4483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCase4495 = new BitSet(new long[]{0x3060902101201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCase4498 = new BitSet(new long[]{0x3060902100201002L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCase4529 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCase4531 = new BitSet(new long[]{0x3060902100201002L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_Case_in_caseLabel4559 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_caseLabel4562 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4574 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop4588 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x00000000000041FEL});
	public static final BitSet FOLLOW_forInit_in_forLoop4590 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop4592 = new BitSet(new long[]{0x1010000008109200L,0x506000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_forLoop4594 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop4597 = new BitSet(new long[]{0x1010000008109200L,0x502080B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expressionList_in_forLoop4599 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop4601 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varListOrExprList_in_forInit4625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_varListOrExprList4636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_varListOrExprList4649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4662 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4664 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop4666 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x000000000000017EL});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4675 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4677 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x000000000000017EL});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_foreachLoop4683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4687 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4689 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4729 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_whileLoop4731 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4733 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4755 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4761 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4763 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4765 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4790 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4792 = new BitSet(new long[]{0x3060902100201000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4795 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4797 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock4827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock4829 = new BitSet(new long[]{0x1000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock4833 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock4835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock4839 = new BitSet(new long[]{0x3060902100201000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock4841 = new BitSet(new long[]{0x3060902100201000L,0xE020609000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock4844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_newObject_in_throwException4893 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException4895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred67_TSPHP2086 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred67_TSPHP2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred68_TSPHP2094 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred69_TSPHP2102 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_synpred78_TSPHP2150 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred78_TSPHP2152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_synpred79_TSPHP2158 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred100_TSPHP2481 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred100_TSPHP2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred101_TSPHP2500 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred101_TSPHP2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred102_TSPHP2519 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_assignment_in_synpred102_TSPHP2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred103_TSPHP2536 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_ternary_in_synpred103_TSPHP2539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred130_TSPHP2848 = new BitSet(new long[]{0x1000000000001000L,0x0000000000000000L,0x000000000000017EL});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_synpred130_TSPHP2850 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred130_TSPHP2852 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050019L,0x0000000000004002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred130_TSPHP2854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred133_TSPHP2902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred144_TSPHP3135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_synpred150_TSPHP3261 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_synpred150_TSPHP3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred150_TSPHP3286 = new BitSet(new long[]{0x1010000008109200L,0x502000B011050219L,0x0000000000004002L});
	public static final BitSet FOLLOW_expression_in_synpred150_TSPHP3288 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred150_TSPHP3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_call_in_synpred150_TSPHP3313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred154_TSPHP3476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_synpred155_TSPHP3481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred156_TSPHP3486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred157_TSPHP3491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred177_TSPHP4350 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred177_TSPHP4352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred178_TSPHP4363 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred178_TSPHP4365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred180_TSPHP4399 = new BitSet(new long[]{0x3060902100201000L,0xE020209000040004L,0x00000000000141FFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred180_TSPHP4404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_synpred183_TSPHP4468 = new BitSet(new long[]{0x0000000401000000L});
	public static final BitSet FOLLOW_defaultCase_in_synpred183_TSPHP4471 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_normalCase_in_synpred183_TSPHP4473 = new BitSet(new long[]{0x0000000001000002L});
}
