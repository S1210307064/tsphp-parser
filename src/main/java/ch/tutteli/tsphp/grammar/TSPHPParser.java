// $ANTLR 3.x D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g 2013-01-23 23:32:06

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CLASS_INTERFACE_TYPE", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeDouble", "TypeFloat", "TypeInt", "TypeInteger", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
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
	public static final int CONSTANT_DECLARATION=24;
	public static final int CONSTANT_DECLARATION_LIST=25;
	public static final int Case=26;
	public static final int Catch=27;
	public static final int Class=28;
	public static final int Clone=29;
	public static final int Colon=30;
	public static final int Comma=31;
	public static final int Comment=32;
	public static final int Const=33;
	public static final int Continue=34;
	public static final int DECIMAL=35;
	public static final int Default=36;
	public static final int Divide=37;
	public static final int DivideEqual=38;
	public static final int Do=39;
	public static final int Dolar=40;
	public static final int Dot=41;
	public static final int DotEqual=42;
	public static final int DoubleColon=43;
	public static final int EXPONENT=44;
	public static final int EXPRESSION_LIST=45;
	public static final int Echo=46;
	public static final int Else=47;
	public static final int Equal=48;
	public static final int Exit=49;
	public static final int Extends=50;
	public static final int FUNCTION_CALL=51;
	public static final int FUNCTION_DECLARATION=52;
	public static final int Final=53;
	public static final int Float=54;
	public static final int For=55;
	public static final int Foreach=56;
	public static final int Function=57;
	public static final int GreaterEqualThan=58;
	public static final int GreaterThan=59;
	public static final int HEXADECIMAL=60;
	public static final int Identical=61;
	public static final int Identifier=62;
	public static final int If=63;
	public static final int Implements=64;
	public static final int Instanceof=65;
	public static final int Int=66;
	public static final int Interface=67;
	public static final int LeftCurlyBrace=68;
	public static final int LeftParanthesis=69;
	public static final int LeftSquareBrace=70;
	public static final int LessEqualThan=71;
	public static final int LessThan=72;
	public static final int LogicAnd=73;
	public static final int LogicAndWeak=74;
	public static final int LogicNot=75;
	public static final int LogicOr=76;
	public static final int LogicOrWeak=77;
	public static final int LogicXorWeak=78;
	public static final int MEMBER_ACCESS=79;
	public static final int MEMBER_ACCESS_STATIC=80;
	public static final int METHOD_CALL=81;
	public static final int Minus=82;
	public static final int MinusEqual=83;
	public static final int MinusMinus=84;
	public static final int Modulo=85;
	public static final int ModuloEqual=86;
	public static final int Multiply=87;
	public static final int MultiplyEqual=88;
	public static final int Namespace=89;
	public static final int New=90;
	public static final int NotEqual=91;
	public static final int NotEqualAlternative=92;
	public static final int NotIdentical=93;
	public static final int Null=94;
	public static final int OCTAL=95;
	public static final int ObjectOperator=96;
	public static final int PARAM_DECLARATION=97;
	public static final int PARAM_LIST=98;
	public static final int POST_INCREMENT_DECREMENT=99;
	public static final int PRE_INCREMENT_DECREMENT=100;
	public static final int Parent=101;
	public static final int ParentColonColon=102;
	public static final int Plus=103;
	public static final int PlusEqual=104;
	public static final int PlusPlus=105;
	public static final int Private=106;
	public static final int ProtectThis=107;
	public static final int Protected=108;
	public static final int Public=109;
	public static final int QuestionMark=110;
	public static final int Return=111;
	public static final int RightCurlyBrace=112;
	public static final int RightParanthesis=113;
	public static final int RightSquareBrace=114;
	public static final int STRING_DOUBLE_QUOTED=115;
	public static final int STRING_SINGLE_QUOTED=116;
	public static final int SWITCH_CASES=117;
	public static final int Self=118;
	public static final int SelfColonColon=119;
	public static final int Semicolon=120;
	public static final int ShiftLeft=121;
	public static final int ShiftLeftEqual=122;
	public static final int ShiftRight=123;
	public static final int ShiftRightEqual=124;
	public static final int Static=125;
	public static final int String=126;
	public static final int Switch=127;
	public static final int This=128;
	public static final int Throw=129;
	public static final int Try=130;
	public static final int TypeArray=131;
	public static final int TypeBool=132;
	public static final int TypeBoolean=133;
	public static final int TypeDouble=134;
	public static final int TypeFloat=135;
	public static final int TypeInt=136;
	public static final int TypeInteger=137;
	public static final int TypeObject=138;
	public static final int TypeResource=139;
	public static final int TypeString=140;
	public static final int UMINUS=141;
	public static final int UPLUS=142;
	public static final int Use=143;
	public static final int VARIABLE_DECLARATION=144;
	public static final int VARIABLE_DECLARATION_LIST=145;
	public static final int VariableId=146;
	public static final int Void=147;
	public static final int While=148;
	public static final int Whitespace=149;

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
		this.state.ruleMemo = new HashMap[306+1];
		 

	}

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
	this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
	return adaptor;
}
	@Override public String[] getTokenNames() { return TSPHPParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1032);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1035); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:4: ( namespaceBracket )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1041);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1044); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:206:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1050);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1052); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )* ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:2: ( ( 'namespace' namespaceId ';' ( statement )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:4: ( 'namespace' namespaceId ';' ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:4: ( 'namespace' namespaceId ';' ( statement )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:5: 'namespace' namespaceId ';' ( statement )*
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1066); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1068);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1070); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:33: ( statement )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==At||LA4_0==Backslash||LA4_0==BitwiseNot||LA4_0==Bool||(LA4_0 >= Class && LA4_0 <= Clone)||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||(LA4_0 >= Final && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Int && LA4_0 <= LeftSquareBrace)||LA4_0==LogicNot||LA4_0==Minus||LA4_0==MinusMinus||LA4_0==New||LA4_0==Null||(LA4_0 >= ParentColonColon && LA4_0 <= Plus)||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= SelfColonColon && LA4_0 <= Semicolon)||(LA4_0 >= String && LA4_0 <= TypeBool)||(LA4_0 >= TypeFloat && LA4_0 <= TypeInt)||(LA4_0 >= TypeObject && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1072);
					statement10=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement10.getTree());

					}
					break;

				default :
					break loop4;
				}
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:213:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:5: 'namespace' ( namespaceId )? '{' ( statement )* '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1087); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1089);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1092); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:34: ( statement )*
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==At||LA6_0==Backslash||LA6_0==BitwiseNot||LA6_0==Bool||(LA6_0 >= Class && LA6_0 <= Clone)||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||(LA6_0 >= Final && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Int && LA6_0 <= LeftSquareBrace)||LA6_0==LogicNot||LA6_0==Minus||LA6_0==MinusMinus||LA6_0==New||LA6_0==Null||(LA6_0 >= ParentColonColon && LA6_0 <= Plus)||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= SelfColonColon && LA6_0 <= Semicolon)||(LA6_0 >= String && LA6_0 <= TypeBool)||(LA6_0 >= TypeFloat && LA6_0 <= TypeInt)||(LA6_0 >= TypeObject && LA6_0 <= TypeString)||LA6_0==Use||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1094);
					statement14=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement14.getTree());

					}
					break;

				default :
					break loop6;
				}
			} while (true);

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1097); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:225:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1169); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier16);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal17);

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1174); if (state.failed) return retval; 
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
			// 226:34: -> ( Identifier )+
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:230:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:231:2: ( ( statement )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:231:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:231:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==At||LA8_0==Backslash||LA8_0==BitwiseNot||LA8_0==Bool||(LA8_0 >= Class && LA8_0 <= Clone)||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||(LA8_0 >= Final && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Int && LA8_0 <= LeftSquareBrace)||LA8_0==LogicNot||LA8_0==Minus||LA8_0==MinusMinus||LA8_0==New||LA8_0==Null||(LA8_0 >= ParentColonColon && LA8_0 <= Plus)||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= SelfColonColon && LA8_0 <= Semicolon)||(LA8_0 >= String && LA8_0 <= TypeBool)||(LA8_0 >= TypeFloat && LA8_0 <= TypeInt)||(LA8_0 >= TypeObject && LA8_0 <= TypeString)||LA8_0==Use||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:231:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1194);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:234:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:235:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
			case At:
			case Backslash:
			case BitwiseNot:
			case Bool:
			case Clone:
			case Do:
			case Echo:
			case Exit:
			case Float:
			case For:
			case Foreach:
			case Identifier:
			case If:
			case Int:
			case LeftCurlyBrace:
			case LeftParanthesis:
			case LeftSquareBrace:
			case LogicNot:
			case Minus:
			case MinusMinus:
			case New:
			case Null:
			case ParentColonColon:
			case Plus:
			case PlusPlus:
			case Return:
			case SelfColonColon:
			case Semicolon:
			case String:
			case Switch:
			case This:
			case Throw:
			case Try:
			case TypeArray:
			case TypeBool:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:235:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1207);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:236:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1212);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:237:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1217);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:240:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:241:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:241:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1229); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1231);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:241:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:241:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1236);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1240); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:244:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1255); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1257); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1259);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:6: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1269);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1280); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1282); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:250:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:251:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:251:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1295);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1300);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1305);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:254:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1310);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:260:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:4: ( 'abstract' | 'final' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Abstract||LA14_0==Final) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1332); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1334); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1336);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1339);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:92: ( classBody )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1344);
					classBody45=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody45.getTree());

					}
					break;

				default :
					break loop17;
				}
			} while (true);

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1347); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:264:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:265:2: ( 'extends' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:265:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1361); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1363);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1374); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1377); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1379); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:272:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:273:2: ( 'implements' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:273:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1392); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1394);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:276:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:277:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					if ( (LA19_3==Backslash||LA19_3==Identifier||(LA19_3 >= TypeArray && LA19_3 <= TypeBool)||(LA19_3 >= TypeFloat && LA19_3 <= TypeInt)||(LA19_3 >= TypeObject && LA19_3 <= TypeString)) ) {
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
					if ( (LA19_4==Backslash||LA19_4==Identifier||(LA19_4 >= TypeArray && LA19_4 <= TypeBool)||(LA19_4 >= TypeFloat && LA19_4 <= TypeInt)||(LA19_4 >= TypeObject && LA19_4 <= TypeString)) ) {
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
				if ( (LA19_3==Backslash||LA19_3==Identifier||(LA19_3 >= TypeArray && LA19_3 <= TypeBool)||(LA19_3 >= TypeFloat && LA19_3 <= TypeInt)||(LA19_3 >= TypeObject && LA19_3 <= TypeString)) ) {
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
				if ( (LA19_4==Backslash||LA19_4==Identifier||(LA19_4 >= TypeArray && LA19_4 <= TypeBool)||(LA19_4 >= TypeFloat && LA19_4 <= TypeInt)||(LA19_4 >= TypeObject && LA19_4 <= TypeString)) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:277:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1406);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1411);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:279:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1417);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) ;
	public final TSPHPParser.constDeclarationList_return constDeclarationList() throws RecognitionException {
		TSPHPParser.constDeclarationList_return retval = new TSPHPParser.constDeclarationList_return();
		retval.start = input.LT(1);
		int constDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token begin=null;
		Token char_literal59=null;
		Token char_literal61=null;
		ParserRuleReturnScope primitiveTypes57 =null;
		ParserRuleReturnScope constantAssignment58 =null;
		ParserRuleReturnScope constantAssignment60 =null;

		CommonTree begin_tree=null;
		CommonTree char_literal59_tree=null;
		CommonTree char_literal61_tree=null;
		RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_primitiveTypes=new RewriteRuleSubtreeStream(adaptor,"rule primitiveTypes");
		RewriteRuleSubtreeStream stream_constantAssignment=new RewriteRuleSubtreeStream(adaptor,"rule constantAssignment");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1431); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1433);
			primitiveTypes57=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes57.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1435);
			constantAssignment58=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment58.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:54: ',' constantAssignment
					{
					char_literal59=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1438); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal59);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1440);
					constantAssignment60=constantAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment60.getTree());
					}
					break;

				default :
					break loop20;
				}
			} while (true);

			char_literal61=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1444); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal61);

			// AST REWRITE
			// elements: primitiveTypes, constantAssignment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 284:3: -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CONSTANT_DECLARATION_LIST, begin, "constant declarations")
				, root_1);

				adaptor.addChild(root_1, stream_primitiveTypes.nextTree());

				if ( !(stream_constantAssignment.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_constantAssignment.hasNext() ) {
					adaptor.addChild(root_1, stream_constantAssignment.nextTree());

				}
				stream_constantAssignment.reset();

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:287:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
	public final TSPHPParser.constantAssignment_return constantAssignment() throws RecognitionException {
		TSPHPParser.constantAssignment_return retval = new TSPHPParser.constantAssignment_return();
		retval.start = input.LT(1);
		int constantAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier62=null;
		Token char_literal63=null;
		ParserRuleReturnScope unaryPrimitiveAtom64 =null;

		CommonTree Identifier62_tree=null;
		CommonTree char_literal63_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:288:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:288:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier62_tree = 
			(CommonTree)adaptor.create(Identifier62)
			;
			adaptor.addChild(root_0, Identifier62_tree);
			}

			char_literal63=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal63_tree = 
			(CommonTree)adaptor.create(char_literal63)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1475);
			unaryPrimitiveAtom64=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom64.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:291:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final TSPHPParser.attributeDeclaration_return attributeDeclaration() throws RecognitionException {
		TSPHPParser.attributeDeclaration_return retval = new TSPHPParser.attributeDeclaration_return();
		retval.start = input.LT(1);
		int attributeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal65=null;
		Token char_literal68=null;
		ParserRuleReturnScope accessor66 =null;
		ParserRuleReturnScope variableDeclarationListInclVariableId67 =null;

		CommonTree string_literal65_tree=null;
		CommonTree char_literal68_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:4: 'static'
					{
					string_literal65=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = 
					(CommonTree)adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1490);
			accessor66=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor66.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1492);
			variableDeclarationListInclVariableId67=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId67.getTree());

			char_literal68=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1494); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal68_tree = 
			(CommonTree)adaptor.create(char_literal68)
			;
			adaptor.addChild(root_0, char_literal68_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:295:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal70=null;
		ParserRuleReturnScope accessorWithoutPrivate69 =null;

		CommonTree string_literal70_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:295:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:295:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1503);
					accessorWithoutPrivate69=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate69.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal70=(Token)match(input,Private,FOLLOW_Private_in_accessor1508); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal70_tree = 
					(CommonTree)adaptor.create(string_literal70)
					;
					adaptor.addChild(root_0, string_literal70_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:299:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set71=null;

		CommonTree set71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:2: ( 'protected' | 'public' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set71=(Token)input.LT(1);
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set71)
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:303:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
	public final TSPHPParser.variableDeclarationListInclVariableId_return variableDeclarationListInclVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListInclVariableId_return retval = new TSPHPParser.variableDeclarationListInclVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal73=null;
		Token VariableId75=null;
		ParserRuleReturnScope variableDeclaration72 =null;
		ParserRuleReturnScope variableAssignment74 =null;

		CommonTree char_literal73_tree=null;
		CommonTree VariableId75_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1533);
			variableDeclaration72=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration72.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal73=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1536); if (state.failed) return retval;
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1540);
							variableAssignment74=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment74.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:50: VariableId
							{
							VariableId75=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1542); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId75_tree = 
							(CommonTree)adaptor.create(VariableId75)
							;
							adaptor.addChild(root_0, VariableId75_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:308:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final TSPHPParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		TSPHPParser.methodDeclaration_return retval = new TSPHPParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal76=null;
		Token string_literal78=null;
		Token string_literal79=null;
		Token string_literal80=null;
		Token string_literal81=null;
		ParserRuleReturnScope accessorWithoutPrivate77 =null;
		ParserRuleReturnScope accessor82 =null;
		ParserRuleReturnScope functionDeclaration83 =null;

		CommonTree string_literal76_tree=null;
		CommonTree string_literal78_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree string_literal80_tree=null;
		CommonTree string_literal81_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal76=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1561); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal76_tree = 
					(CommonTree)adaptor.create(string_literal76)
					;
					adaptor.addChild(root_0, string_literal76_tree);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1563);
							accessorWithoutPrivate77=accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate77.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:6: 'static' ( 'final' )?
							{
							string_literal78=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1577); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal78_tree = 
							(CommonTree)adaptor.create(string_literal78)
							;
							adaptor.addChild(root_0, string_literal78_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:15: 'final'
									{
									string_literal79=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1579); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal79_tree = 
									(CommonTree)adaptor.create(string_literal79)
									;
									adaptor.addChild(root_0, string_literal79_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:6: 'final' ( 'static' )?
							{
							string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1587); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal80_tree = 
							(CommonTree)adaptor.create(string_literal80)
							;
							adaptor.addChild(root_0, string_literal80_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:14: 'static'
									{
									string_literal81=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1589); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal81_tree = 
									(CommonTree)adaptor.create(string_literal81)
									;
									adaptor.addChild(root_0, string_literal81_tree);
									}

									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1603);
							accessor82=accessor();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor82.getTree());

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1610);
			functionDeclaration83=functionDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration83.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:318:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal84=null;
		Token Identifier85=null;
		Token char_literal87=null;
		Token char_literal89=null;
		ParserRuleReturnScope implementsDeclaration86 =null;
		ParserRuleReturnScope interfaceBody88 =null;

		CommonTree string_literal84_tree=null;
		CommonTree Identifier85_tree=null;
		CommonTree char_literal87_tree=null;
		CommonTree char_literal89_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal84=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1622); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal84_tree = 
			(CommonTree)adaptor.create(string_literal84)
			;
			adaptor.addChild(root_0, string_literal84_tree);
			}

			Identifier85=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1624); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier85_tree = 
			(CommonTree)adaptor.create(Identifier85)
			;
			adaptor.addChild(root_0, Identifier85_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1626);
					implementsDeclaration86=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1629); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = 
			(CommonTree)adaptor.create(char_literal87)
			;
			adaptor.addChild(root_0, char_literal87_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1631);
					interfaceBody88=interfaceBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody88.getTree());

					}
					break;

				default :
					break loop32;
				}
			} while (true);

			char_literal89=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1634); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal89_tree = 
			(CommonTree)adaptor.create(char_literal89)
			;
			adaptor.addChild(root_0, char_literal89_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList90 =null;
		ParserRuleReturnScope interfaceMethodDeclaration91 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1645);
					constDeclarationList90=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList90.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:324:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1650);
					interfaceMethodDeclaration91=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration91.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope functionDeclarationWithoutBody93 =null;

		CommonTree string_literal92_tree=null;
		CommonTree char_literal94_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:4: 'public'
					{
					string_literal92=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1661); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal92_tree = 
					(CommonTree)adaptor.create(string_literal92)
					;
					adaptor.addChild(root_0, string_literal92_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1664);
			functionDeclarationWithoutBody93=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody93.getTree());

			char_literal94=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1666); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal94_tree = 
			(CommonTree)adaptor.create(char_literal94)
			;
			adaptor.addChild(root_0, char_literal94_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:335:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal97=null;
		ParserRuleReturnScope functionDeclarationWithoutBody95 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue96 =null;

		CommonTree block_tree=null;
		CommonTree char_literal97_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_functionDeclarationWithoutBody=new RewriteRuleSubtreeStream(adaptor,"rule functionDeclarationWithoutBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1683);
			functionDeclarationWithoutBody95=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody95.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1687); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:45: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==At||LA35_0==Backslash||LA35_0==BitwiseNot||LA35_0==Bool||LA35_0==Clone||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= Float && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==Int||(LA35_0 >= LeftCurlyBrace && LA35_0 <= LeftSquareBrace)||LA35_0==LogicNot||LA35_0==Minus||LA35_0==MinusMinus||LA35_0==New||LA35_0==Null||(LA35_0 >= ParentColonColon && LA35_0 <= Plus)||LA35_0==PlusPlus||LA35_0==Return||(LA35_0 >= SelfColonColon && LA35_0 <= Semicolon)||(LA35_0 >= String && LA35_0 <= TypeBool)||(LA35_0 >= TypeFloat && LA35_0 <= TypeInt)||(LA35_0 >= TypeObject && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1689);
					instructionWithoutBreakContinue96=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue96.getTree());
					}
					break;

				default :
					break loop35;
				}
			} while (true);

			char_literal97=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal97);

			// AST REWRITE
			// elements: instructionWithoutBreakContinue, functionDeclarationWithoutBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 337:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody95!=null?((Token)functionDeclarationWithoutBody95.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:122: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:146: ( instructionWithoutBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:340:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal98=null;
		Token Identifier100=null;
		ParserRuleReturnScope returnType99 =null;
		ParserRuleReturnScope formalParameters101 =null;

		CommonTree string_literal98_tree=null;
		CommonTree Identifier100_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:341:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:341:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal98=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1724); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1727);
			returnType99=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType99.getTree());

			Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1729); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier100_tree = 
			(CommonTree)adaptor.create(Identifier100)
			;
			adaptor.addChild(root_0, Identifier100_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody1731);
			formalParameters101=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters101.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:344:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope allTypes102 =null;

		CommonTree string_literal103_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:345:2: ( allTypes | 'void' )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeBool)||(LA36_0 >= TypeFloat && LA36_0 <= TypeInt)||(LA36_0 >= TypeObject && LA36_0 <= TypeString)) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:345:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1743);
					allTypes102=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes102.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:345:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal103=(Token)match(input,Void,FOLLOW_Void_in_returnType1747); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal103_tree = 
					(CommonTree)adaptor.create(string_literal103)
					;
					adaptor.addChild(root_0, string_literal103_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended104 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject105 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:2: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= TypeArray && LA37_0 <= TypeBool)||(LA37_0 >= TypeFloat && LA37_0 <= TypeInt)||(LA37_0 >= TypeResource && LA37_0 <= TypeString)) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:4: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1758);
					primitiveTypesExtended104=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended104.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:29: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1762);
					classInterfaceTypeInclObject105=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject105.getTree());

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


	public static class allTypesWithoutObjectAndResource_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypesWithoutObjectAndResource"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:352:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray106 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= TypeArray && LA38_0 <= TypeBool)||(LA38_0 >= TypeFloat && LA38_0 <= TypeInt)||LA38_0==TypeString) ) {
				alt38=1;
			}
			else if ( (LA38_0==Backslash||LA38_0==Identifier) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1773);
					primitiveTypesInclArray106=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1779);
					classInterfaceTypeWithoutObject107=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject107.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 29, allTypesWithoutObjectAndResource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypesWithoutObjectAndResource"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:357:1: primitiveTypes : ( TypeBool | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set108=null;

		CommonTree set108_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:2: ( TypeBool | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set108=(Token)input.LT(1);
			if ( input.LA(1)==TypeBool||(input.LA(1) >= TypeFloat && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set108)
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:364:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray110=null;
		ParserRuleReturnScope primitiveTypes109 =null;

		CommonTree TypeArray110_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:365:2: ( primitiveTypes | TypeArray )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==TypeBool||(LA39_0 >= TypeFloat && LA39_0 <= TypeInt)||LA39_0==TypeString) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:365:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1817);
					primitiveTypes109=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes109.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:366:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray110=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1822); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray110_tree = 
					(CommonTree)adaptor.create(TypeArray110)
					;
					adaptor.addChild(root_0, TypeArray110_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:369:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource112=null;
		ParserRuleReturnScope primitiveTypesInclArray111 =null;

		CommonTree TypeResource112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:2: ( primitiveTypesInclArray | TypeResource )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( ((LA40_0 >= TypeArray && LA40_0 <= TypeBool)||(LA40_0 >= TypeFloat && LA40_0 <= TypeInt)||LA40_0==TypeString) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1834);
					primitiveTypesInclArray111=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray111.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource112=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1839); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource112_tree = 
					(CommonTree)adaptor.create(TypeResource112)
					;
					adaptor.addChild(root_0, TypeResource112_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:374:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token root=null;
		ParserRuleReturnScope namespaceId113 =null;

		CommonTree root_tree=null;
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:8: (root= '\\\\' )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Backslash) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1852); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1855);
			namespaceId113=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId113.getTree());
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
			// 375:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:31: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:118: ( $root)?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:379:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject114=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject115 =null;

		CommonTree TypeObject114_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject114=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1882); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject114_tree = 
					(CommonTree)adaptor.create(TypeObject114)
					;
					adaptor.addChild(root_0, TypeObject114_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1888);
					classInterfaceTypeWithoutObject115=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject115.getTree());

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


	public static class formalParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:384:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
	public final TSPHPParser.formalParameters_return formalParameters() throws RecognitionException {
		TSPHPParser.formalParameters_return retval = new TSPHPParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token params=null;
		Token char_literal117=null;
		ParserRuleReturnScope paramList116 =null;

		CommonTree params_tree=null;
		CommonTree char_literal117_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters1901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:15: ( paramList )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash||LA43_0==Identifier||(LA43_0 >= TypeArray && LA43_0 <= TypeBool)||(LA43_0 >= TypeFloat && LA43_0 <= TypeInt)||(LA43_0 >= TypeObject && LA43_0 <= TypeString)) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters1903);
					paramList116=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList116.getTree());
					}
					break;

			}

			char_literal117=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters1906); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal117);

			// AST REWRITE
			// elements: paramList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 385:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:68: ( paramList )?
				if ( stream_paramList.hasNext() ) {
					adaptor.addChild(root_1, stream_paramList.nextTree());

				}
				stream_paramList.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 35, formalParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:388:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal119=null;
		Token char_literal122=null;
		Token char_literal124=null;
		ParserRuleReturnScope paramDeclarationOptional118 =null;
		ParserRuleReturnScope paramDeclarationOptional120 =null;
		ParserRuleReturnScope paramDeclaration121 =null;
		ParserRuleReturnScope paramDeclaration123 =null;
		ParserRuleReturnScope paramDeclarationOptional125 =null;

		CommonTree char_literal119_tree=null;
		CommonTree char_literal122_tree=null;
		CommonTree char_literal124_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* )
			int alt47=2;
			alt47 = dfa47.predict(input);
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1927);
					paramDeclarationOptional118=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional118.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:29: ( ',' ! paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:30: ',' ! paramDeclarationOptional
							{
							char_literal119=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1930); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1933);
							paramDeclarationOptional120=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional120.getTree());

							}
							break;

						default :
							break loop44;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:4: paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1941);
					paramDeclaration121=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration121.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:21: ( ',' ! paramDeclaration )*
					loop45:
					do {
						int alt45=2;
						alt45 = dfa45.predict(input);
						switch (alt45) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:22: ',' ! paramDeclaration
							{
							char_literal122=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1944); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1947);
							paramDeclaration123=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration123.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:46: ( ',' ! paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:47: ',' ! paramDeclarationOptional
							{
							char_literal124=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1952); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1955);
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
			if ( state.backtracking>0 ) { memoize(input, 36, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:1: paramDeclaration : allTypes VariableId ( '=' Null )? -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ( Null )? ) ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId127=null;
		Token char_literal128=null;
		Token Null129=null;
		ParserRuleReturnScope allTypes126 =null;

		CommonTree VariableId127_tree=null;
		CommonTree char_literal128_tree=null;
		CommonTree Null129_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:2: ( allTypes VariableId ( '=' Null )? -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ( Null )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:4: allTypes VariableId ( '=' Null )?
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1969);
			allTypes126=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes126.getTree());
			VariableId127=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1971); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId127);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:24: ( '=' Null )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==Assign) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:25: '=' Null
					{
					char_literal128=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclaration1974); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal128);

					Null129=(Token)match(input,Null,FOLLOW_Null_in_paramDeclaration1976); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Null.add(Null129);

					}
					break;

			}

			// AST REWRITE
			// elements: Null, allTypes, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 394:36: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ( Null )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:39: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ( Null )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, (allTypes126!=null?((Token)allTypes126.start):null), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:120: ( Null )?
				if ( stream_Null.hasNext() ) {
					adaptor.addChild(root_1, 
					stream_Null.nextNode()
					);

				}
				stream_Null.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 37, paramDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclaration"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:1: paramDeclarationOptional : allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId131=null;
		Token char_literal132=null;
		ParserRuleReturnScope allTypes130 =null;
		ParserRuleReturnScope unaryPrimitiveAtom133 =null;

		CommonTree VariableId131_tree=null;
		CommonTree char_literal132_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_unaryPrimitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule unaryPrimitiveAtom");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:398:2: ( allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:398:4: allTypes VariableId '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclarationOptional2004);
			allTypes130=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes130.getTree());
			VariableId131=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationOptional2006); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId131);

			char_literal132=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal132);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2011);
			unaryPrimitiveAtom133=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom133.getTree());
			// AST REWRITE
			// elements: allTypes, VariableId, unaryPrimitiveAtom
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 399:3: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:6: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, (allTypes130!=null?((Token)allTypes130.start):null), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, stream_unaryPrimitiveAtom.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 38, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:406:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal135=null;
		ParserRuleReturnScope instructionWithoutBreakContinue134 =null;
		ParserRuleReturnScope instruction136 =null;

		CommonTree block_tree=null;
		CommonTree char_literal135_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:2: (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LeftCurlyBrace) ) {
				alt50=1;
			}
			else if ( (LA50_0==At||LA50_0==Backslash||LA50_0==BitwiseNot||LA50_0==Bool||LA50_0==Clone||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= Float && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==Int||(LA50_0 >= LeftParanthesis && LA50_0 <= LeftSquareBrace)||LA50_0==LogicNot||LA50_0==Minus||LA50_0==MinusMinus||LA50_0==New||LA50_0==Null||(LA50_0 >= ParentColonColon && LA50_0 <= Plus)||LA50_0==PlusPlus||LA50_0==Return||(LA50_0 >= SelfColonColon && LA50_0 <= Semicolon)||(LA50_0 >= String && LA50_0 <= TypeBool)||(LA50_0 >= TypeFloat && LA50_0 <= TypeInt)||(LA50_0 >= TypeObject && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
				alt50=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:4: block= '{' ( instructionWithoutBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2057); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:16: ( instructionWithoutBreakContinue )*
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==At||LA49_0==Backslash||LA49_0==BitwiseNot||LA49_0==Bool||LA49_0==Clone||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= Float && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==Int||(LA49_0 >= LeftCurlyBrace && LA49_0 <= LeftSquareBrace)||LA49_0==LogicNot||LA49_0==Minus||LA49_0==MinusMinus||LA49_0==New||LA49_0==Null||(LA49_0 >= ParentColonColon && LA49_0 <= Plus)||LA49_0==PlusPlus||LA49_0==Return||(LA49_0 >= SelfColonColon && LA49_0 <= Semicolon)||(LA49_0 >= String && LA49_0 <= TypeBool)||(LA49_0 >= TypeFloat && LA49_0 <= TypeInt)||(LA49_0 >= TypeObject && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2059);
							instructionWithoutBreakContinue134=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue134.getTree());
							}
							break;

						default :
							break loop49;
						}
					} while (true);

					char_literal135=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal135);

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
					// 407:53: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:56: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:407:81: ( instructionWithoutBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:408:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2078);
					instruction136=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction136.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 39, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:411:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal138=null;
		Token set140=null;
		Token Int141=null;
		Token char_literal142=null;
		ParserRuleReturnScope instructionInclBreakContinue137 =null;
		ParserRuleReturnScope instruction139 =null;

		CommonTree block_tree=null;
		CommonTree char_literal138_tree=null;
		CommonTree set140_tree=null;
		CommonTree Int141_tree=null;
		CommonTree char_literal142_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:2: (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
			int alt53=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt53=1;
				}
				break;
			case At:
			case Backslash:
			case BitwiseNot:
			case Bool:
			case Clone:
			case Do:
			case Echo:
			case Exit:
			case Float:
			case For:
			case Foreach:
			case Identifier:
			case If:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case LogicNot:
			case Minus:
			case MinusMinus:
			case New:
			case Null:
			case ParentColonColon:
			case Plus:
			case PlusPlus:
			case Return:
			case SelfColonColon:
			case Semicolon:
			case String:
			case Switch:
			case This:
			case Throw:
			case Try:
			case TypeArray:
			case TypeBool:
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:4: block= '{' ( instructionInclBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2094); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:17: ( instructionInclBreakContinue )*
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==At||LA51_0==Backslash||LA51_0==BitwiseNot||(LA51_0 >= Bool && LA51_0 <= Break)||LA51_0==Clone||LA51_0==Continue||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= Float && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==Int||(LA51_0 >= LeftCurlyBrace && LA51_0 <= LeftSquareBrace)||LA51_0==LogicNot||LA51_0==Minus||LA51_0==MinusMinus||LA51_0==New||LA51_0==Null||(LA51_0 >= ParentColonColon && LA51_0 <= Plus)||LA51_0==PlusPlus||LA51_0==Return||(LA51_0 >= SelfColonColon && LA51_0 <= Semicolon)||(LA51_0 >= String && LA51_0 <= TypeBool)||(LA51_0 >= TypeFloat && LA51_0 <= TypeInt)||(LA51_0 >= TypeObject && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2096);
							instructionInclBreakContinue137=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue137.getTree());
							}
							break;

						default :
							break loop51;
						}
					} while (true);

					char_literal138=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2100); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal138);

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
					// 412:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:79: ( instructionInclBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:413:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2115);
					instruction139=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction139.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set140=(Token)input.LT(1);
					set140=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set140)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:26: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:26: Int
							{
							Int141=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2127); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int141_tree = 
							(CommonTree)adaptor.create(Int141)
							;
							adaptor.addChild(root_0, Int141_tree);
							}

							}
							break;

					}

					char_literal142=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2130); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 40, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token semi=null;
		Token char_literal144=null;
		Token char_literal146=null;
		Token char_literal156=null;
		Token string_literal157=null;
		Token char_literal159=null;
		Token string_literal160=null;
		Token char_literal162=null;
		Token string_literal163=null;
		Token char_literal164=null;
		ParserRuleReturnScope variableAssignment143 =null;
		ParserRuleReturnScope variableDeclaration145 =null;
		ParserRuleReturnScope ifCondition147 =null;
		ParserRuleReturnScope switchCondition148 =null;
		ParserRuleReturnScope forLoop149 =null;
		ParserRuleReturnScope foreachLoop150 =null;
		ParserRuleReturnScope whileLoop151 =null;
		ParserRuleReturnScope doWhileLoop152 =null;
		ParserRuleReturnScope tryCatch153 =null;
		ParserRuleReturnScope throwException154 =null;
		ParserRuleReturnScope expression155 =null;
		ParserRuleReturnScope expression158 =null;
		ParserRuleReturnScope expressionList161 =null;

		CommonTree semi_tree=null;
		CommonTree char_literal144_tree=null;
		CommonTree char_literal146_tree=null;
		CommonTree char_literal156_tree=null;
		CommonTree string_literal157_tree=null;
		CommonTree char_literal159_tree=null;
		CommonTree string_literal160_tree=null;
		CommonTree char_literal162_tree=null;
		CommonTree string_literal163_tree=null;
		CommonTree char_literal164_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] )
			int alt55=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA55_1 = input.LA(2);
				if ( (synpred67_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred77_TSPHP()) ) {
					alt55=11;
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
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeObject:
			case TypeResource:
			case TypeString:
				{
				alt55=2;
				}
				break;
			case TypeArray:
				{
				int LA55_3 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred77_TSPHP()) ) {
					alt55=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA55_6 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred77_TSPHP()) ) {
					alt55=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA55_7 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred77_TSPHP()) ) {
					alt55=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case If:
				{
				alt55=3;
				}
				break;
			case Switch:
				{
				alt55=4;
				}
				break;
			case For:
				{
				alt55=5;
				}
				break;
			case Foreach:
				{
				alt55=6;
				}
				break;
			case While:
				{
				alt55=7;
				}
				break;
			case Do:
				{
				alt55=8;
				}
				break;
			case Try:
				{
				alt55=9;
				}
				break;
			case Throw:
				{
				alt55=10;
				}
				break;
			case At:
			case BitwiseNot:
			case Bool:
			case Clone:
			case Float:
			case Int:
			case LeftParanthesis:
			case LeftSquareBrace:
			case LogicNot:
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
				{
				alt55=11;
				}
				break;
			case Return:
				{
				alt55=12;
				}
				break;
			case Echo:
				{
				alt55=13;
				}
				break;
			case Exit:
				{
				alt55=14;
				}
				break;
			case Semicolon:
				{
				alt55=15;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2143);
					variableAssignment143=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment143.getTree());

					char_literal144=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2145); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2151);
					variableDeclaration145=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration145.getTree());

					char_literal146=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2153); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:420:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2159);
					ifCondition147=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition147.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:421:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2164);
					switchCondition148=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition148.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2169);
					forLoop149=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop149.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2174);
					foreachLoop150=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop150.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2179);
					whileLoop151=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop151.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:425:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2184);
					doWhileLoop152=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop152.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:426:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2189);
					tryCatch153=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch153.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:427:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2194);
					throwException154=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException154.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction2199);
					expression155=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression155.getTree());

					char_literal156=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2201); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal157=(Token)match(input,Return,FOLLOW_Return_in_instruction2207); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal157_tree = 
					(CommonTree)adaptor.create(string_literal157)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal157_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:14: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||LA54_0==Null||(LA54_0 >= ParentColonColon && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==SelfColonColon||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2210);
							expression158=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression158.getTree());

							}
							break;

					}

					char_literal159=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2213); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:430:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal160=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2219); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal160_tree = 
					(CommonTree)adaptor.create(string_literal160)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal160_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2222);
					expressionList161=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList161.getTree());

					char_literal162=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2224); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal163=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal163_tree = 
					(CommonTree)adaptor.create(string_literal163)
					;
					adaptor.addChild(root_0, string_literal163_tree);
					}

					char_literal164=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2232); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: semi= ';'
					{
					semi=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2240); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Semicolon.add(semi);

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
					// 432:13: -> BLOCK[$semi,\"block\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(BLOCK, semi, "block")
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
			if ( state.backtracking>0 ) { memoize(input, 41, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:435:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal166=null;
		ParserRuleReturnScope expression165 =null;
		ParserRuleReturnScope expression167 =null;

		CommonTree char_literal166_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2257);
			expression165=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression165.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:15: ( ',' ! expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:16: ',' ! expression
					{
					char_literal166=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2260); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2263);
					expression167=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());

					}
					break;

				default :
					break loop56;
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
			if ( state.backtracking>0 ) { memoize(input, 42, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:439:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId168=null;
		ParserRuleReturnScope assignmentOperator169 =null;
		ParserRuleReturnScope expression170 =null;

		CommonTree VariableId168_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:440:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:440:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId168=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2276); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId168_tree = 
			(CommonTree)adaptor.create(VariableId168)
			;
			adaptor.addChild(root_0, VariableId168_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2278);
			assignmentOperator169=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator169.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2281);
			expression170=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 43, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:443:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement171 =null;
		ParserRuleReturnScope preIncrementDecrement172 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:444:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==Backslash||LA57_0==Identifier||LA57_0==ParentColonColon||LA57_0==SelfColonColon||LA57_0==This||LA57_0==VariableId) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:444:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2293);
					postIncrementDecrement171=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement171.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2298);
					preIncrementDecrement172=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement172.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 44, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:448:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set173=null;

		CommonTree set173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:449:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set173=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set173)
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
			if ( state.backtracking>0 ) { memoize(input, 45, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:463:1: postIncrementDecrement : postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd174 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus175 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:464:2: ( postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:464:4: postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2377);
			postFixVariableWithoutCallAtTheEnd174=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd174.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2379);
			plusPlusOrMinusMinus175=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus175.getTree());
			// AST REWRITE
			// elements: plusPlusOrMinusMinus, postFixVariableWithoutCallAtTheEnd
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 465:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:465:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCallAtTheEnd174!=null?((Token)postFixVariableWithoutCallAtTheEnd174.start):null), "post increment/decrement")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_postFixVariableWithoutCallAtTheEnd.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 46, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class plusPlusOrMinusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plusPlusOrMinusMinus"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:468:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set176=null;

		CommonTree set176_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:2: ( '++' | '--' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set176=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set176)
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
			if ( state.backtracking>0 ) { memoize(input, 47, plusPlusOrMinusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "plusPlusOrMinusMinus"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:473:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus177 =null;
		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd178 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:2: ( plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:4: plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2422);
			plusPlusOrMinusMinus177=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus177.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2424);
			postFixVariableWithoutCallAtTheEnd178=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd178.getTree());
			// AST REWRITE
			// elements: postFixVariableWithoutCallAtTheEnd, plusPlusOrMinusMinus
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 475:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:475:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus177!=null?((Token)plusPlusOrMinusMinus177.start):null), "pre increment/decrement")
				, root_1);

				adaptor.addChild(root_1, stream_plusPlusOrMinusMinus.nextTree());

				adaptor.addChild(root_1, stream_postFixVariableWithoutCallAtTheEnd.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 48, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId180=null;
		Token char_literal181=null;
		ParserRuleReturnScope allTypes179 =null;
		ParserRuleReturnScope expression182 =null;

		CommonTree VariableId180_tree=null;
		CommonTree char_literal181_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2451);
			allTypes179=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes179.getTree());
			VariableId180=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2453); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId180);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:24: ( '=' expression )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Assign) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:25: '=' expression
					{
					char_literal181=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2456); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal181);

					pushFollow(FOLLOW_expression_in_variableDeclaration2458);
					expression182=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression182.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, allTypes, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 479:42: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:45: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes179!=null?((Token)allTypes179.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:128: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 49, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak183 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:483:2: ( logicOrWeak )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:483:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2485);
			logicOrWeak183=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak183.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 50, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:487:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal185=null;
		ParserRuleReturnScope logicXorWeak184 =null;
		ParserRuleReturnScope logicXorWeak186 =null;

		CommonTree string_literal185_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2498);
			logicXorWeak184=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak184.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:17: ( 'or' ^ logicXorWeak )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==LogicOrWeak) ) {
					int LA59_2 = input.LA(2);
					if ( (synpred97_TSPHP()) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:18: 'or' ^ logicXorWeak
					{
					string_literal185=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2501); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal185_tree = 
					(CommonTree)adaptor.create(string_literal185)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal185_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2504);
					logicXorWeak186=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak186.getTree());

					}
					break;

				default :
					break loop59;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal188=null;
		ParserRuleReturnScope logicAndWeak187 =null;
		ParserRuleReturnScope logicAndWeak189 =null;

		CommonTree string_literal188_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2519);
			logicAndWeak187=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak187.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:17: ( 'xor' ^ logicAndWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicXorWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred98_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:18: 'xor' ^ logicAndWeak
					{
					string_literal188=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2522); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal188_tree = 
					(CommonTree)adaptor.create(string_literal188)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal188_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2525);
					logicAndWeak189=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak189.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal191=null;
		ParserRuleReturnScope assignment190 =null;
		ParserRuleReturnScope assignment192 =null;

		CommonTree string_literal191_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2540);
			assignment190=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment190.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:15: ( 'and' ^ assignment )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicAndWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:16: 'and' ^ assignment
					{
					string_literal191=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal191_tree = 
					(CommonTree)adaptor.create(string_literal191)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal191_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2546);
					assignment192=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment192.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary193 =null;
		ParserRuleReturnScope assignmentOperator194 =null;
		ParserRuleReturnScope ternary195 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2559);
			ternary193=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary193.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:12: ( assignmentOperator ^ ternary )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Assign||LA62_0==BitwiseAndEqual||LA62_0==BitwiseOrEqual||LA62_0==BitwiseXorEqual||LA62_0==DivideEqual||LA62_0==DotEqual||LA62_0==MinusEqual||LA62_0==ModuloEqual||LA62_0==MultiplyEqual||LA62_0==PlusEqual||LA62_0==ShiftLeftEqual||LA62_0==ShiftRightEqual) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred100_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2562);
					assignmentOperator194=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator194.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2565);
					ternary195=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary195.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal197=null;
		Token char_literal199=null;
		ParserRuleReturnScope logicOr196 =null;
		ParserRuleReturnScope expression198 =null;
		ParserRuleReturnScope expression200 =null;

		CommonTree char_literal197_tree=null;
		CommonTree char_literal199_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:2: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:4: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2579);
			logicOr196=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr196.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:12: ( '?' ^ expression ':' ! expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==QuestionMark) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:13: '?' ^ expression ':' ! expression
					{
					char_literal197=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2582); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal197_tree = 
					(CommonTree)adaptor.create(char_literal197)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal197_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2585);
					expression198=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression198.getTree());

					char_literal199=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2587); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2590);
					expression200=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression200.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal202=null;
		ParserRuleReturnScope logicAnd201 =null;
		ParserRuleReturnScope logicAnd203 =null;

		CommonTree string_literal202_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:2: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:4: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2604);
			logicAnd201=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd201.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:13: ( '||' ^ logicAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOr) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:14: '||' ^ logicAnd
					{
					string_literal202=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2607); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal202_tree = 
					(CommonTree)adaptor.create(string_literal202)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal202_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2610);
					logicAnd203=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd203.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:511:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal205=null;
		ParserRuleReturnScope bitwiseOr204 =null;
		ParserRuleReturnScope bitwiseOr206 =null;

		CommonTree string_literal205_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:2: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:4: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2623);
			bitwiseOr204=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr204.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:14: ( '&&' ^ bitwiseOr )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:15: '&&' ^ bitwiseOr
					{
					string_literal205=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2626); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal205_tree = 
					(CommonTree)adaptor.create(string_literal205)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal205_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2629);
					bitwiseOr206=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr206.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:515:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal208=null;
		ParserRuleReturnScope bitwiseXor207 =null;
		ParserRuleReturnScope bitwiseXor209 =null;

		CommonTree char_literal208_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:516:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:516:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2643);
			bitwiseXor207=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor207.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:516:15: ( '|' ^ bitwiseXor )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==BitwiseOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:516:16: '|' ^ bitwiseXor
					{
					char_literal208=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2646); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal208_tree = 
					(CommonTree)adaptor.create(char_literal208)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal208_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2649);
					bitwiseXor209=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor209.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:519:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal211=null;
		ParserRuleReturnScope bitwiseAnd210 =null;
		ParserRuleReturnScope bitwiseAnd212 =null;

		CommonTree char_literal211_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2662);
			bitwiseAnd210=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd210.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:15: ( '^' ^ bitwiseAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseXor) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:16: '^' ^ bitwiseAnd
					{
					char_literal211=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal211_tree = 
					(CommonTree)adaptor.create(char_literal211)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal211_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2668);
					bitwiseAnd212=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd212.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal214=null;
		ParserRuleReturnScope equality213 =null;
		ParserRuleReturnScope equality215 =null;

		CommonTree char_literal214_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2681);
			equality213=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality213.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:13: ( '&' ^ equality )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:14: '&' ^ equality
					{
					char_literal214=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2684); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal214_tree = 
					(CommonTree)adaptor.create(char_literal214)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal214_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2687);
					equality215=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality215.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison216 =null;
		ParserRuleReturnScope equalityOperator217 =null;
		ParserRuleReturnScope comparison218 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:2: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:4: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2700);
			comparison216=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison216.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:15: ( equalityOperator ^ comparison )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Equal||LA69_0==Identical||(LA69_0 >= NotEqual && LA69_0 <= NotIdentical)) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:16: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2703);
					equalityOperator217=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator217.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2706);
					comparison218=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison218.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set219=null;

		CommonTree set219_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:532:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set219=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set219)
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:539:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift220 =null;
		ParserRuleReturnScope comparisonOperator221 =null;
		ParserRuleReturnScope bitwiseShift222 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:540:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:540:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2750);
			bitwiseShift220=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift220.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:540:17: ( comparisonOperator ^ bitwiseShift )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( ((LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||(LA70_0 >= LessEqualThan && LA70_0 <= LessThan)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:540:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2753);
					comparisonOperator221=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator221.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2756);
					bitwiseShift222=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift222.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set223=null;

		CommonTree set223_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:544:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set223=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set223)
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:550:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set225=null;
		ParserRuleReturnScope termOrStringConcatenation224 =null;
		ParserRuleReturnScope termOrStringConcatenation226 =null;

		CommonTree set225_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:2: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:4: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2796);
			termOrStringConcatenation224=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation224.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:30: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ShiftLeft||LA71_0==ShiftRight) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:31: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set225=(Token)input.LT(1);
					set225=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set225)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2806);
					termOrStringConcatenation226=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation226.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set228=null;
		ParserRuleReturnScope factor227 =null;
		ParserRuleReturnScope factor229 =null;

		CommonTree set228_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:2: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:4: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2820);
			factor227=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor227.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:11: ( ( '+' | '-' | '.' ) ^ factor )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Dot||LA72_0==Minus||LA72_0==Plus) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:12: ( '+' | '-' | '.' ) ^ factor
					{
					set228=(Token)input.LT(1);
					set228=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set228)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2832);
					factor229=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor229.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set231=null;
		ParserRuleReturnScope logicNot230 =null;
		ParserRuleReturnScope logicNot232 =null;

		CommonTree set231_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:2: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:4: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2846);
			logicNot230=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot230.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:13: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Divide||LA73_0==Modulo||LA73_0==Multiply) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:14: ( '*' | '/' | '%' ) ^ logicNot
					{
					set231=(Token)input.LT(1);
					set231=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set231)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2858);
					logicNot232=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot232.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal233=null;
		ParserRuleReturnScope logicNot234 =null;
		ParserRuleReturnScope instanceOf235 =null;

		CommonTree char_literal233_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:9: ( '!' ^ logicNot | instanceOf )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LogicNot) ) {
				alt74=1;
			}
			else if ( (LA74_0==At||LA74_0==Backslash||LA74_0==BitwiseNot||LA74_0==Bool||LA74_0==Clone||LA74_0==Float||LA74_0==Identifier||LA74_0==Int||(LA74_0 >= LeftParanthesis && LA74_0 <= LeftSquareBrace)||LA74_0==Minus||LA74_0==MinusMinus||LA74_0==New||LA74_0==Null||(LA74_0 >= ParentColonColon && LA74_0 <= Plus)||LA74_0==PlusPlus||LA74_0==SelfColonColon||LA74_0==String||LA74_0==This||LA74_0==TypeArray||LA74_0==VariableId) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal233=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2869); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal233_tree = 
					(CommonTree)adaptor.create(char_literal233)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal233_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2872);
					logicNot234=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot234.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2877);
					instanceOf235=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf235.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:566:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal237=null;
		Token VariableId239=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt236 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject238 =null;

		CommonTree string_literal237_tree=null;
		CommonTree VariableId239_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2888);
			castOrBitwiseNotOrAt236=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt236.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Instanceof) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal237=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2891); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal237_tree = 
					(CommonTree)adaptor.create(string_literal237)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal237_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2895);
							classInterfaceTypeWithoutObject238=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject238.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:73: VariableId
							{
							VariableId239=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2897); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId239_tree = 
							(CommonTree)adaptor.create(VariableId239)
							;
							adaptor.addChild(root_0, VariableId239_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal241=null;
		Token char_literal243=null;
		Token char_literal245=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource240 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt242 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt244 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt246 =null;
		ParserRuleReturnScope cloneOrNew247 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal241_tree=null;
		CommonTree char_literal243_tree=null;
		CommonTree char_literal245_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
			int alt77=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA77_1 = input.LA(2);
				if ( (synpred127_TSPHP()) ) {
					alt77=1;
				}
				else if ( (true) ) {
					alt77=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				alt77=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2913); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2915);
					allTypesWithoutObjectAndResource240=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource240.getTree());
					char_literal241=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2917); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal241);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2919);
					castOrBitwiseNotOrAt242=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt242.getTree());
					// AST REWRITE
					// elements: allTypesWithoutObjectAndResource, castOrBitwiseNotOrAt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 570:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(CAST, cast, "cast")
						, root_1);

						adaptor.addChild(root_1, stream_allTypesWithoutObjectAndResource.nextTree());

						adaptor.addChild(root_1, stream_castOrBitwiseNotOrAt.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal243=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal243_tree = 
					(CommonTree)adaptor.create(char_literal243)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal243_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2938);
					castOrBitwiseNotOrAt244=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt244.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal245=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2943); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal245_tree = 
					(CommonTree)adaptor.create(char_literal245)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal245_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2946);
					castOrBitwiseNotOrAt246=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt246.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2952);
					cloneOrNew247=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew247.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:576:1: cloneOrNew : ( 'clone' ^ cloneOrNew | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal248=null;
		ParserRuleReturnScope cloneOrNew249 =null;
		ParserRuleReturnScope newObject250 =null;
		ParserRuleReturnScope unaryPrimary251 =null;

		CommonTree string_literal248_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:577:2: ( 'clone' ^ cloneOrNew | newObject | unaryPrimary )
			int alt78=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt78=1;
				}
				break;
			case New:
				{
				alt78=2;
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
				alt78=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:577:4: 'clone' ^ cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal248=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew2963); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal248_tree = 
					(CommonTree)adaptor.create(string_literal248)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal248_tree, root_0);
					}

					pushFollow(FOLLOW_cloneOrNew_in_cloneOrNew2966);
					cloneOrNew249=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew249.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:578:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew2971);
					newObject250=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject250.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew2976);
					unaryPrimary251=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary251.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId253=null;
		Token string_literal254=null;
		Token VariableId255=null;
		ParserRuleReturnScope staticAccessOrParent252 =null;

		CommonTree VariableId253_tree=null;
		CommonTree string_literal254_tree=null;
		CommonTree VariableId255_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:584:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
			int alt79=3;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case ParentColonColon:
			case SelfColonColon:
				{
				alt79=1;
				}
				break;
			case This:
				{
				alt79=2;
				}
				break;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:584:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2989);
					staticAccessOrParent252=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent252.getTree());
					VariableId253=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember2991); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId253);

					// AST REWRITE
					// elements: VariableId, staticAccessOrParent
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 584:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:584:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent252!=null?((Token)staticAccessOrParent252.start):null), "static member access")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:585:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal254=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember3007); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal254_tree = 
					(CommonTree)adaptor.create(string_literal254)
					;
					adaptor.addChild(root_0, string_literal254_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:586:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId255=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3012); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId255_tree = 
					(CommonTree)adaptor.create(VariableId255)
					;
					adaptor.addChild(root_0, VariableId255_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token p=null;
		Token string_literal257=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject256 =null;

		CommonTree s_tree=null;
		CommonTree p_tree=null;
		CommonTree string_literal257_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:590:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
			int alt80=3;
			switch ( input.LA(1) ) {
			case SelfColonColon:
				{
				alt80=1;
				}
				break;
			case ParentColonColon:
				{
				alt80=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:590:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3026); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SelfColonColon.add(s);

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
					// 590:15: -> Self[$s,\"self\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(Self, s, "self")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:591:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3038); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ParentColonColon.add(p);

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
					// 591:17: -> Parent[$p,\"parent\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(Parent, p, "parent")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:592:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3048);
					classInterfaceTypeWithoutObject256=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject256.getTree());

					string_literal257=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3050); if (state.failed) return retval;
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


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal258=null;
		Token string_literal261=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject259 =null;
		ParserRuleReturnScope actualParameters260 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject262 =null;

		CommonTree string_literal258_tree=null;
		CommonTree string_literal261_tree=null;
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt81=2;
			alt81 = dfa81.predict(input);
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal258=(Token)match(input,New,FOLLOW_New_in_newObject3063); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal258);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3065);
					classInterfaceTypeWithoutObject259=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject259.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3067);
					actualParameters260=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters260.getTree());
					// AST REWRITE
					// elements: New, actualParameters, classInterfaceTypeWithoutObject
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 596:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, stream_actualParameters.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:597:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal261=(Token)match(input,New,FOLLOW_New_in_newObject3082); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal261);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3084);
					classInterfaceTypeWithoutObject262=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject262.getTree());
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
					// 597:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:597:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, (classInterfaceTypeWithoutObject262!=null?((Token)classInterfaceTypeWithoutObject262.stop):null), "expressions")
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
			if ( state.backtracking>0 ) { memoize(input, 74, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class actualParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.actualParameters_return actualParameters() throws RecognitionException {
		TSPHPParser.actualParameters_return retval = new TSPHPParser.actualParameters_return();
		retval.start = input.LT(1);
		int actualParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token char_literal264=null;
		ParserRuleReturnScope expressionList263 =null;

		CommonTree list_tree=null;
		CommonTree char_literal264_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3108); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:13: ( expressionList )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==At||LA82_0==Backslash||LA82_0==BitwiseNot||LA82_0==Bool||LA82_0==Clone||LA82_0==Float||LA82_0==Identifier||LA82_0==Int||(LA82_0 >= LeftParanthesis && LA82_0 <= LeftSquareBrace)||LA82_0==LogicNot||LA82_0==Minus||LA82_0==MinusMinus||LA82_0==New||LA82_0==Null||(LA82_0 >= ParentColonColon && LA82_0 <= Plus)||LA82_0==PlusPlus||LA82_0==SelfColonColon||LA82_0==String||LA82_0==This||LA82_0==TypeArray||LA82_0==VariableId) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3110);
					expressionList263=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList263.getTree());
					}
					break;

			}

			char_literal264=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3113); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal264);

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 601:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:75: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());

				}
				stream_expressionList.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 75, actualParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "actualParameters"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary265 =null;
		ParserRuleReturnScope primary266 =null;
		ParserRuleReturnScope primary267 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:605:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
			int alt83=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt83=1;
				}
				break;
			case Minus:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:605:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3140);
					primary265=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary265.getTree());
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
					// 605:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:605:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3158); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3160);
					primary266=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary266.getTree());
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
					// 606:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:607:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3174);
					primary267=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary267.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:1: primary : ( postFixCall | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCall268 =null;
		ParserRuleReturnScope atom269 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:2: ( postFixCall | atom )
			int alt84=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA84_1 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA84_2 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				break;
			case SelfColonColon:
				{
				int LA84_3 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA84_4 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA84_5 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA84_6 = input.LA(2);
				if ( (synpred140_TSPHP()) ) {
					alt84=1;
				}
				else if ( (true) ) {
					alt84=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 6, input);
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
				alt84=2;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:4: postFixCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCall_in_primary3186);
					postFixCall268=postFixCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCall268.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3191);
					atom269=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom269.getTree());

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


	public static class postFixCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:1: postFixCall : ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* ;
	public final TSPHPParser.postFixCall_return postFixCall() throws RecognitionException {
		TSPHPParser.postFixCall_return retval = new TSPHPParser.postFixCall_return();
		retval.start = input.LT(1);
		int postFixCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier272=null;
		Token char_literal274=null;
		ParserRuleReturnScope functionCall270 =null;
		ParserRuleReturnScope methodCall271 =null;
		ParserRuleReturnScope expression273 =null;
		ParserRuleReturnScope call275 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier272_tree=null;
		CommonTree char_literal274_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt85=2;
			alt85 = dfa85.predict(input);
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCall3206);
					functionCall270=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall270.getTree());
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
					// 616:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCall3216);
					methodCall271=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall271.getTree());
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
					// 617:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			loop86:
			do {
				int alt86=4;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==ObjectOperator) ) {
					int LA86_2 = input.LA(2);
					if ( (LA86_2==Identifier) ) {
						int LA86_4 = input.LA(3);
						if ( (LA86_4==EOF||(LA86_4 >= Arrow && LA86_4 <= Assign)||(LA86_4 >= BitwiseAnd && LA86_4 <= BitwiseAndEqual)||(LA86_4 >= BitwiseOr && LA86_4 <= BitwiseXorEqual)||(LA86_4 >= Colon && LA86_4 <= Comma)||(LA86_4 >= Divide && LA86_4 <= DivideEqual)||(LA86_4 >= Dot && LA86_4 <= DotEqual)||LA86_4==Equal||(LA86_4 >= GreaterEqualThan && LA86_4 <= GreaterThan)||LA86_4==Identical||LA86_4==Instanceof||(LA86_4 >= LeftSquareBrace && LA86_4 <= LogicAndWeak)||(LA86_4 >= LogicOr && LA86_4 <= LogicXorWeak)||(LA86_4 >= Minus && LA86_4 <= MinusEqual)||(LA86_4 >= Modulo && LA86_4 <= MultiplyEqual)||(LA86_4 >= NotEqual && LA86_4 <= NotIdentical)||LA86_4==ObjectOperator||(LA86_4 >= Plus && LA86_4 <= PlusEqual)||LA86_4==QuestionMark||(LA86_4 >= RightParanthesis && LA86_4 <= RightSquareBrace)||(LA86_4 >= Semicolon && LA86_4 <= ShiftRightEqual)) ) {
							alt86=1;
						}
						else if ( (LA86_4==LeftParanthesis) ) {
							alt86=3;
						}

					}

				}
				else if ( (LA86_0==LeftSquareBrace) ) {
					alt86=2;
				}

				switch (alt86) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCall3234); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier272=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCall3236); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier272);

					// AST REWRITE
					// elements: Identifier, postFixCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 619:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:620:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCall3258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCall3260);
					expression273=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression273.getTree());
					char_literal274=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCall3262); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal274);

					// AST REWRITE
					// elements: expression, postFixCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 620:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:620:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:5: call
					{
					pushFollow(FOLLOW_call_in_postFixCall3280);
					call275=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call275.getTree());
					// AST REWRITE
					// elements: postFixCall, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 621:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call275!=null?((Token)call275.start):null), "method call")
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
					break loop86;
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
			if ( state.backtracking>0 ) { memoize(input, 78, postFixCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCall"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classInterfaceTypeWithoutObject276 =null;
		ParserRuleReturnScope actualParameters277 =null;

		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:626:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:626:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3308);
			classInterfaceTypeWithoutObject276=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject276.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3310);
			actualParameters277=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters277.getTree());
			// AST REWRITE
			// elements: actualParameters, classInterfaceTypeWithoutObject
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 627:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:627:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject276!=null?((Token)classInterfaceTypeWithoutObject276.start):null), "function call")
				, root_1);

				adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_1, stream_actualParameters.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 79, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:1: call : '->' ! Identifier actualParameters ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal278=null;
		Token Identifier279=null;
		ParserRuleReturnScope actualParameters280 =null;

		CommonTree string_literal278_tree=null;
		CommonTree Identifier279_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal278=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3334); if (state.failed) return retval;
			Identifier279=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3337); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier279_tree = 
			(CommonTree)adaptor.create(Identifier279)
			;
			adaptor.addChild(root_0, Identifier279_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3339);
			actualParameters280=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters280.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 80, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:633:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier282=null;
		ParserRuleReturnScope callee281 =null;
		ParserRuleReturnScope actualParameters283 =null;

		CommonTree Identifier282_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:634:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:634:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3351);
			callee281=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee281.getTree());
			Identifier282=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3353); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier282);

			pushFollow(FOLLOW_actualParameters_in_methodCall3355);
			actualParameters283=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters283.getTree());
			// AST REWRITE
			// elements: actualParameters, callee, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 635:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee281!=null?((Token)callee281.start):null), "method call")
				, root_1);

				adaptor.addChild(root_1, stream_callee.nextTree());

				adaptor.addChild(root_1, 
				stream_Identifier.nextNode()
				);

				adaptor.addChild(root_1, stream_actualParameters.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 81, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class callee_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callee"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal285=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember284 =null;
		ParserRuleReturnScope staticAccessOrParent286 =null;

		CommonTree string_literal285_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt87=2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3381);
					variableOrMemberOrStaticMember284=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember284.getTree());

					string_literal285=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3383); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3389);
					staticAccessOrParent286=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent286.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 82, callee_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callee"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal287=null;
		Token char_literal289=null;
		ParserRuleReturnScope expression288 =null;
		ParserRuleReturnScope incrementDecrement290 =null;
		ParserRuleReturnScope postFixVariableInclCallAtTheEnd291 =null;
		ParserRuleReturnScope classConstant292 =null;
		ParserRuleReturnScope globalConstant293 =null;
		ParserRuleReturnScope array294 =null;
		ParserRuleReturnScope primitiveAtom295 =null;

		CommonTree char_literal287_tree=null;
		CommonTree char_literal289_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom )
			int alt88=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt88=1;
				}
				break;
			case SelfColonColon:
				{
				int LA88_2 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt88=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA88_3 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt88=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA88_4 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt88=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA88_5 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt88=4;
				}
				else if ( (synpred150_TSPHP()) ) {
					alt88=5;
				}
				else if ( (true) ) {
					alt88=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA88_6 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA88_7 = input.LA(2);
				if ( (synpred147_TSPHP()) ) {
					alt88=2;
				}
				else if ( (synpred148_TSPHP()) ) {
					alt88=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 7, input);
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
				alt88=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt88=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt88=7;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:8: '(' expression ')'
					{
					char_literal287=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal287);

					pushFollow(FOLLOW_expression_in_atom3401);
					expression288=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression288.getTree());
					char_literal289=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal289);

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
					// 642:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3412);
					incrementDecrement290=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement290.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:644:4: postFixVariableInclCallAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3417);
					postFixVariableInclCallAtTheEnd291=postFixVariableInclCallAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCallAtTheEnd291.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3422);
					classConstant292=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant292.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3427);
					globalConstant293=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant293.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3432);
					array294=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array294.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3437);
					primitiveAtom295=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom295.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class postFixVariableWithoutCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableWithoutCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:1: postFixVariableWithoutCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* ;
	public final TSPHPParser.postFixVariableWithoutCallAtTheEnd_return postFixVariableWithoutCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCallAtTheEnd_return retval = new TSPHPParser.postFixVariableWithoutCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier298=null;
		Token char_literal300=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember296 =null;
		ParserRuleReturnScope call297 =null;
		ParserRuleReturnScope expression299 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier298_tree=null;
		CommonTree char_literal300_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3449);
			variableOrMemberOrStaticMember296=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember296.getTree());
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
			// 652:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:653:3: ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			loop91:
			do {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==LeftSquareBrace||LA91_0==ObjectOperator) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:5: ( call )*
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:5: ( call )*
					loop89:
					do {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==ObjectOperator) ) {
							int LA89_1 = input.LA(2);
							if ( (LA89_1==Identifier) ) {
								int LA89_3 = input.LA(3);
								if ( (LA89_3==LeftParanthesis) ) {
									alt89=1;
								}

							}

						}

						switch (alt89) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:5: call
							{
							pushFollow(FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3464);
							call297=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_call.add(call297.getTree());
							}
							break;

						default :
							break loop89;
						}
					} while (true);

					// AST REWRITE
					// elements: postFixVariableWithoutCallAtTheEnd, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 654:11: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:14: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call297!=null?((Token)call297.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:91: ( call )*
						while ( stream_call.hasNext() ) {
							adaptor.addChild(root_1, stream_call.nextTree());

						}
						stream_call.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==ObjectOperator) ) {
						alt90=1;
					}
					else if ( (LA90_0==LeftSquareBrace) ) {
						alt90=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 90, 0, input);
						throw nvae;
					}
					switch (alt90) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3495); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier298=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3497); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier298);

							// AST REWRITE
							// elements: Identifier, postFixVariableWithoutCallAtTheEnd
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 656:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3520); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3522);
							expression299=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression299.getTree());
							char_literal300=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3524); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal300);

							// AST REWRITE
							// elements: postFixVariableWithoutCallAtTheEnd, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 657:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
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

					}

					}
					break;

				default :
					break loop91;
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
			if ( state.backtracking>0 ) { memoize(input, 84, postFixVariableWithoutCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableWithoutCallAtTheEnd"


	public static class postFixVariableInclCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableInclCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:663:1: postFixVariableInclCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* ;
	public final TSPHPParser.postFixVariableInclCallAtTheEnd_return postFixVariableInclCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableInclCallAtTheEnd_return retval = new TSPHPParser.postFixVariableInclCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableInclCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier302=null;
		Token char_literal304=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember301 =null;
		ParserRuleReturnScope expression303 =null;
		ParserRuleReturnScope call305 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier302_tree=null;
		CommonTree char_literal304_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3563);
			variableOrMemberOrStaticMember301=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember301.getTree());
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
			// 664:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			loop92:
			do {
				int alt92=4;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==ObjectOperator) ) {
					int LA92_2 = input.LA(2);
					if ( (LA92_2==Identifier) ) {
						int LA92_4 = input.LA(3);
						if ( (LA92_4==EOF||(LA92_4 >= Arrow && LA92_4 <= Assign)||(LA92_4 >= BitwiseAnd && LA92_4 <= BitwiseAndEqual)||(LA92_4 >= BitwiseOr && LA92_4 <= BitwiseXorEqual)||(LA92_4 >= Colon && LA92_4 <= Comma)||(LA92_4 >= Divide && LA92_4 <= DivideEqual)||(LA92_4 >= Dot && LA92_4 <= DotEqual)||LA92_4==Equal||(LA92_4 >= GreaterEqualThan && LA92_4 <= GreaterThan)||LA92_4==Identical||LA92_4==Instanceof||(LA92_4 >= LeftSquareBrace && LA92_4 <= LogicAndWeak)||(LA92_4 >= LogicOr && LA92_4 <= LogicXorWeak)||(LA92_4 >= Minus && LA92_4 <= MinusEqual)||(LA92_4 >= Modulo && LA92_4 <= MultiplyEqual)||(LA92_4 >= NotEqual && LA92_4 <= NotIdentical)||LA92_4==ObjectOperator||(LA92_4 >= Plus && LA92_4 <= PlusEqual)||LA92_4==QuestionMark||(LA92_4 >= RightParanthesis && LA92_4 <= RightSquareBrace)||(LA92_4 >= Semicolon && LA92_4 <= ShiftRightEqual)) ) {
							alt92=1;
						}
						else if ( (LA92_4==LeftParanthesis) ) {
							alt92=3;
						}

					}

				}
				else if ( (LA92_0==LeftSquareBrace) ) {
					alt92=2;
				}

				switch (alt92) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3578); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier302=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3580); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier302);

					// AST REWRITE
					// elements: postFixVariableInclCallAtTheEnd, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 665:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3604);
					expression303=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression303.getTree());
					char_literal304=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3606); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal304);

					// AST REWRITE
					// elements: postFixVariableInclCallAtTheEnd, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 666:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCallAtTheEnd3624);
					call305=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call305.getTree());
					// AST REWRITE
					// elements: call, postFixVariableInclCallAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 667:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call305!=null?((Token)call305.start):null), "method call")
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
					break loop92;
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
			if ( state.backtracking>0 ) { memoize(input, 85, postFixVariableInclCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableInclCallAtTheEnd"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier307=null;
		ParserRuleReturnScope staticAccessOrParent306 =null;

		CommonTree Identifier307_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3652);
			staticAccessOrParent306=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent306.getTree());
			Identifier307=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3654); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier307);

			// AST REWRITE
			// elements: Identifier, staticAccessOrParent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 672:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent306!=null?((Token)staticAccessOrParent306.start):null), "static member access")
				, root_1);

				adaptor.addChild(root_1, stream_staticAccessOrParent.nextTree());

				adaptor.addChild(root_1, 
				stream_Identifier.nextNode()
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
			if ( state.backtracking>0 ) { memoize(input, 86, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier308=null;

		CommonTree Identifier308_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:676:2: ( Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:676:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3677); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier308_tree = 
			(CommonTree)adaptor.create(Identifier308)
			;
			adaptor.addChild(root_0, Identifier308_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 87, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:679:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primitiveAtom309 =null;
		ParserRuleReturnScope primitiveAtom310 =null;
		ParserRuleReturnScope primitiveAtom311 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule primitiveAtom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom )
			int alt93=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt93=1;
				}
				break;
			case Minus:
				{
				alt93=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt93=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3693); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3695);
					primitiveAtom309=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom309.getTree());
					// AST REWRITE
					// elements: primitiveAtom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 680:30: -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:33: ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UPLUS, uplus, "unary plus")
						, root_1);

						adaptor.addChild(root_1, stream_primitiveAtom.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3713); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3715);
					primitiveAtom310=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom310.getTree());
					// AST REWRITE
					// elements: primitiveAtom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 681:31: -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:34: ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UMINUS, uminus, "unary minus")
						, root_1);

						adaptor.addChild(root_1, stream_primitiveAtom.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:682:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3729);
					primitiveAtom311=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom311.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 88, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set312=null;

		CommonTree set312_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:686:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set312=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set312)
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
			if ( state.backtracking>0 ) { memoize(input, 89, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal314=null;
		Token TypeArray315=null;
		Token char_literal316=null;
		Token char_literal318=null;
		ParserRuleReturnScope arrayContent313 =null;
		ParserRuleReturnScope arrayContent317 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal314_tree=null;
		CommonTree TypeArray315_tree=null;
		CommonTree char_literal316_tree=null;
		CommonTree char_literal318_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==LeftSquareBrace) ) {
				alt96=1;
			}
			else if ( (LA96_0==TypeArray) ) {
				alt96=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4247); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:17: ( arrayContent )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==At||LA94_0==Backslash||LA94_0==BitwiseNot||LA94_0==Bool||LA94_0==Clone||LA94_0==Float||LA94_0==Identifier||LA94_0==Int||(LA94_0 >= LeftParanthesis && LA94_0 <= LeftSquareBrace)||LA94_0==LogicNot||LA94_0==Minus||LA94_0==MinusMinus||LA94_0==New||LA94_0==Null||(LA94_0 >= ParentColonColon && LA94_0 <= Plus)||LA94_0==PlusPlus||LA94_0==SelfColonColon||LA94_0==String||LA94_0==This||LA94_0==TypeArray||LA94_0==VariableId) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4249);
							arrayContent313=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent313.getTree());
							}
							break;

					}

					char_literal314=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4252); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal314);

					// AST REWRITE
					// elements: arrayContent
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 756:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:756:65: ( arrayContent )?
						if ( stream_arrayContent.hasNext() ) {
							adaptor.addChild(root_1, stream_arrayContent.nextTree());

						}
						stream_arrayContent.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:757:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray315=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4268); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray315);

					char_literal316=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4270); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal316);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:757:18: ( arrayContent )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==At||LA95_0==Backslash||LA95_0==BitwiseNot||LA95_0==Bool||LA95_0==Clone||LA95_0==Float||LA95_0==Identifier||LA95_0==Int||(LA95_0 >= LeftParanthesis && LA95_0 <= LeftSquareBrace)||LA95_0==LogicNot||LA95_0==Minus||LA95_0==MinusMinus||LA95_0==New||LA95_0==Null||(LA95_0 >= ParentColonColon && LA95_0 <= Plus)||LA95_0==PlusPlus||LA95_0==SelfColonColon||LA95_0==String||LA95_0==This||LA95_0==TypeArray||LA95_0==VariableId) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:757:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4272);
							arrayContent317=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent317.getTree());
							}
							break;

					}

					char_literal318=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4275); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal318);

					// AST REWRITE
					// elements: arrayContent, TypeArray
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 757:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:757:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:757:51: ( arrayContent )?
						if ( stream_arrayContent.hasNext() ) {
							adaptor.addChild(root_1, stream_arrayContent.nextTree());

						}
						stream_arrayContent.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 90, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class arrayContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal320=null;
		ParserRuleReturnScope arrayKeyValue319 =null;
		ParserRuleReturnScope arrayKeyValue321 =null;

		CommonTree char_literal320_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4296);
			arrayKeyValue319=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue319.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:18: ( ',' ! arrayKeyValue )*
			loop97:
			do {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==Comma) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:19: ',' ! arrayKeyValue
					{
					char_literal320=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4299); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4302);
					arrayKeyValue321=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue321.getTree());

					}
					break;

				default :
					break loop97;
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
			if ( state.backtracking>0 ) { memoize(input, 91, arrayContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayContent"


	public static class arrayKeyValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:763:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal322=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression323 =null;

		CommonTree string_literal322_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
			int alt98=2;
			switch ( input.LA(1) ) {
			case LogicNot:
				{
				int LA98_1 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftParanthesis:
				{
				int LA98_2 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				int LA98_3 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case At:
				{
				int LA98_4 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Clone:
				{
				int LA98_5 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case New:
				{
				int LA98_6 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Plus:
				{
				int LA98_7 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Minus:
				{
				int LA98_8 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA98_9 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA98_10 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA98_11 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA98_12 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA98_13 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA98_14 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 14, input);
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
				int LA98_15 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
				{
				int LA98_16 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA98_17 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 17, input);
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
			case Null:
			case String:
				{
				int LA98_18 = input.LA(2);
				if ( (synpred169_TSPHP()) ) {
					alt98=1;
				}
				else if ( (true) ) {
					alt98=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 18, input);
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
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4316);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal322=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4318); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal322);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4322);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(value.getTree());
					// AST REWRITE
					// elements: key, Arrow, value
					// token labels: 
					// rule labels: retval, value, key
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value",value!=null?value.getTree():null);
					RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key",key!=null?key.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 764:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:44: ^( '=>' $key $value)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_Arrow.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_key.nextTree());

						adaptor.addChild(root_1, stream_value.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:765:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4339);
					expression323=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression323.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 92, arrayKeyValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayKeyValue"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal324=null;
		Token char_literal325=null;
		Token char_literal327=null;
		Token string_literal328=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression326 =null;

		CommonTree string_literal324_tree=null;
		CommonTree char_literal325_tree=null;
		CommonTree char_literal327_tree=null;
		CommonTree string_literal328_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:770:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:770:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal324=(Token)match(input,If,FOLLOW_If_in_ifCondition4352); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal324);

			char_literal325=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4354); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal325);

			pushFollow(FOLLOW_expression_in_ifCondition4356);
			expression326=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression326.getTree());
			char_literal327=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4358); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal327);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4363);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==Else) ) {
				int LA99_1 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
			}
			switch (alt99) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal328=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4370); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal328);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4375);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: instructionElse, expression, If, instructionThen
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
			// 771:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:100: ( $instructionElse)?
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
			if ( state.backtracking>0 ) { memoize(input, 93, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:775:1: switchCondition : 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal329=null;
		Token char_literal330=null;
		Token VariableId331=null;
		Token char_literal332=null;
		Token char_literal333=null;
		Token char_literal335=null;
		ParserRuleReturnScope switchContent334 =null;

		CommonTree string_literal329_tree=null;
		CommonTree char_literal330_tree=null;
		CommonTree VariableId331_tree=null;
		CommonTree char_literal332_tree=null;
		CommonTree char_literal333_tree=null;
		CommonTree char_literal335_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:2: ( 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:4: 'switch' '(' VariableId ')' '{' ( switchContent )? '}'
			{
			string_literal329=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4406); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal329);

			char_literal330=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4408); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal330);

			VariableId331=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4410); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId331);

			char_literal332=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4412); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal332);

			char_literal333=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal333);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:36: ( switchContent )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==Case||LA100_0==Default) ) {
				alt100=1;
			}
			else if ( (LA100_0==RightCurlyBrace) ) {
				int LA100_2 = input.LA(2);
				if ( (synpred171_TSPHP()) ) {
					alt100=1;
				}
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:36: switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition4416);
					switchContent334=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchContent.add(switchContent334.getTree());
					}
					break;

			}

			char_literal335=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4419); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal335);

			// AST REWRITE
			// elements: switchContent, Switch, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 776:56: -> ^( 'switch' VariableId ( switchContent )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:59: ^( 'switch' VariableId ( switchContent )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:81: ( switchContent )?
				if ( stream_switchContent.hasNext() ) {
					adaptor.addChild(root_1, stream_switchContent.nextTree());

				}
				stream_switchContent.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 94, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:1: switchContent : ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCaseInstructionMandatory336 =null;
		ParserRuleReturnScope defaultCaseInstructionMandatory337 =null;
		ParserRuleReturnScope normalCaseInstructionOptional338 =null;
		ParserRuleReturnScope normalCaseInstructionMandatory339 =null;
		ParserRuleReturnScope defaultCaseInstructionOptional340 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:2: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? )
			int alt106=2;
			switch ( input.LA(1) ) {
			case Case:
				{
				int LA106_1 = input.LA(2);
				if ( (synpred175_TSPHP()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Default:
				{
				int LA106_2 = input.LA(2);
				if ( (synpred175_TSPHP()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RightCurlyBrace:
				{
				int LA106_3 = input.LA(2);
				if ( (synpred175_TSPHP()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EOF:
				{
				int LA106_4 = input.LA(2);
				if ( (synpred175_TSPHP()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 4, input);
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
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( normalCaseInstructionMandatory )*
					loop101:
					do {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==Case) ) {
							int LA101_1 = input.LA(2);
							if ( (synpred172_TSPHP()) ) {
								alt101=1;
							}

						}

						switch (alt101) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4443);
							normalCaseInstructionMandatory336=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory336.getTree());

							}
							break;

						default :
							break loop101;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: ( defaultCaseInstructionMandatory )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==Case) ) {
						int LA102_1 = input.LA(2);
						if ( (synpred173_TSPHP()) ) {
							alt102=1;
						}
					}
					else if ( (LA102_0==Default) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: defaultCaseInstructionMandatory
							{
							pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_switchContent4446);
							defaultCaseInstructionMandatory337=defaultCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionMandatory337.getTree());

							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:69: ( normalCaseInstructionOptional )*
					loop103:
					do {
						int alt103=2;
						int LA103_0 = input.LA(1);
						if ( (LA103_0==Case) ) {
							alt103=1;
						}

						switch (alt103) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:69: normalCaseInstructionOptional
							{
							pushFollow(FOLLOW_normalCaseInstructionOptional_in_switchContent4449);
							normalCaseInstructionOptional338=normalCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionOptional338.getTree());

							}
							break;

						default :
							break loop103;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: ( normalCaseInstructionMandatory )*
					loop104:
					do {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==Case) ) {
							int LA104_1 = input.LA(2);
							if ( (synpred176_TSPHP()) ) {
								alt104=1;
							}

						}

						switch (alt104) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4455);
							normalCaseInstructionMandatory339=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory339.getTree());

							}
							break;

						default :
							break loop104;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: ( defaultCaseInstructionOptional )?
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==Case||LA105_0==Default) ) {
						alt105=1;
					}
					switch (alt105) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: defaultCaseInstructionOptional
							{
							pushFollow(FOLLOW_defaultCaseInstructionOptional_in_switchContent4458);
							defaultCaseInstructionOptional340=defaultCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionOptional340.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 95, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:1: normalCaseInstructionMandatory : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.normalCaseInstructionMandatory_return normalCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.normalCaseInstructionMandatory_return retval = new TSPHPParser.normalCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int normalCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel341 =null;
		ParserRuleReturnScope instructionInclBreakContinue342 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionMandatory4471);
					caseLabel341=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel341.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:15: ( instructionInclBreakContinue )+
			int cnt108=0;
			loop108:
			do {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==At||LA108_0==Backslash||LA108_0==BitwiseNot||(LA108_0 >= Bool && LA108_0 <= Break)||LA108_0==Clone||LA108_0==Continue||LA108_0==Do||LA108_0==Echo||LA108_0==Exit||(LA108_0 >= Float && LA108_0 <= Foreach)||(LA108_0 >= Identifier && LA108_0 <= If)||LA108_0==Int||(LA108_0 >= LeftCurlyBrace && LA108_0 <= LeftSquareBrace)||LA108_0==LogicNot||LA108_0==Minus||LA108_0==MinusMinus||LA108_0==New||LA108_0==Null||(LA108_0 >= ParentColonColon && LA108_0 <= Plus)||LA108_0==PlusPlus||LA108_0==Return||(LA108_0 >= SelfColonColon && LA108_0 <= Semicolon)||(LA108_0 >= String && LA108_0 <= TypeBool)||(LA108_0 >= TypeFloat && LA108_0 <= TypeInt)||(LA108_0 >= TypeObject && LA108_0 <= TypeString)||LA108_0==VariableId||LA108_0==While) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4474);
					instructionInclBreakContinue342=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue342.getTree());
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
			// 786:3: -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:7: ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:787:5: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue342!=null?((Token)instructionInclBreakContinue342.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 96, normalCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionMandatory"


	public static class normalCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:1: normalCaseInstructionOptional : ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.normalCaseInstructionOptional_return normalCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.normalCaseInstructionOptional_return retval = new TSPHPParser.normalCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int normalCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel343 =null;
		ParserRuleReturnScope instructionInclBreakContinue344 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:2: ( ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:4: ( caseLabel )+ ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:4: ( caseLabel )+
			int cnt109=0;
			loop109:
			do {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==Case) ) {
					int LA109_2 = input.LA(2);
					if ( (synpred180_TSPHP()) ) {
						alt109=1;
					}

				}

				switch (alt109) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionOptional4512);
					caseLabel343=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel343.getTree());
					}
					break;

				default :
					if ( cnt109 >= 1 ) break loop109;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(109, input);
						throw eee;
				}
				cnt109++;
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:15: ( instructionInclBreakContinue )*
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==At||LA110_0==Backslash||LA110_0==BitwiseNot||(LA110_0 >= Bool && LA110_0 <= Break)||LA110_0==Clone||LA110_0==Continue||LA110_0==Do||LA110_0==Echo||LA110_0==Exit||(LA110_0 >= Float && LA110_0 <= Foreach)||(LA110_0 >= Identifier && LA110_0 <= If)||LA110_0==Int||(LA110_0 >= LeftCurlyBrace && LA110_0 <= LeftSquareBrace)||LA110_0==LogicNot||LA110_0==Minus||LA110_0==MinusMinus||LA110_0==New||LA110_0==Null||(LA110_0 >= ParentColonColon && LA110_0 <= Plus)||LA110_0==PlusPlus||LA110_0==Return||(LA110_0 >= SelfColonColon && LA110_0 <= Semicolon)||(LA110_0 >= String && LA110_0 <= TypeBool)||(LA110_0 >= TypeFloat && LA110_0 <= TypeInt)||(LA110_0 >= TypeObject && LA110_0 <= TypeString)||LA110_0==VariableId||LA110_0==While) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4515);
					instructionInclBreakContinue344=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue344.getTree());
					}
					break;

				default :
					break loop110;
				}
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
			// 792:3: -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:792:7: ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:793:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue344!=null?((Token)instructionInclBreakContinue344.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:793:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 97, normalCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionOptional"


	public static class defaultCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:1: defaultCaseInstructionMandatory : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.defaultCaseInstructionMandatory_return defaultCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionMandatory_return retval = new TSPHPParser.defaultCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel345 =null;
		ParserRuleReturnScope defaultLabel346 =null;
		ParserRuleReturnScope caseLabel347 =null;
		ParserRuleReturnScope instructionInclBreakContinue348 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:4: ( caseLabel )*
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==Case) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4555);
					caseLabel345=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel345.getTree());
					}
					break;

				default :
					break loop111;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4558);
			defaultLabel346=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel346.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:28: ( caseLabel )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Case) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4560);
					caseLabel347=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel347.getTree());
					}
					break;

				default :
					break loop112;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:39: ( instructionInclBreakContinue )+
			int cnt113=0;
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==At||LA113_0==Backslash||LA113_0==BitwiseNot||(LA113_0 >= Bool && LA113_0 <= Break)||LA113_0==Clone||LA113_0==Continue||LA113_0==Do||LA113_0==Echo||LA113_0==Exit||(LA113_0 >= Float && LA113_0 <= Foreach)||(LA113_0 >= Identifier && LA113_0 <= If)||LA113_0==Int||(LA113_0 >= LeftCurlyBrace && LA113_0 <= LeftSquareBrace)||LA113_0==LogicNot||LA113_0==Minus||LA113_0==MinusMinus||LA113_0==New||LA113_0==Null||(LA113_0 >= ParentColonColon && LA113_0 <= Plus)||LA113_0==PlusPlus||LA113_0==Return||(LA113_0 >= SelfColonColon && LA113_0 <= Semicolon)||(LA113_0 >= String && LA113_0 <= TypeBool)||(LA113_0 >= TypeFloat && LA113_0 <= TypeInt)||(LA113_0 >= TypeObject && LA113_0 <= TypeString)||LA113_0==VariableId||LA113_0==While) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4563);
					instructionInclBreakContinue348=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue348.getTree());
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
			// elements: defaultLabel, instructionInclBreakContinue, caseLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 798:3: -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:798:7: ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:798:77: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:799:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue348!=null?((Token)instructionInclBreakContinue348.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 98, defaultCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionMandatory"


	public static class defaultCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:1: defaultCaseInstructionOptional : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.defaultCaseInstructionOptional_return defaultCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionOptional_return retval = new TSPHPParser.defaultCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel349 =null;
		ParserRuleReturnScope defaultLabel350 =null;
		ParserRuleReturnScope caseLabel351 =null;
		ParserRuleReturnScope instructionInclBreakContinue352 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: ( caseLabel )*
			loop114:
			do {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==Case) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4601);
					caseLabel349=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel349.getTree());
					}
					break;

				default :
					break loop114;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4604);
			defaultLabel350=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel350.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:28: ( caseLabel )*
			loop115:
			do {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==Case) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4606);
					caseLabel351=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel351.getTree());
					}
					break;

				default :
					break loop115;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:39: ( instructionInclBreakContinue )*
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==At||LA116_0==Backslash||LA116_0==BitwiseNot||(LA116_0 >= Bool && LA116_0 <= Break)||LA116_0==Clone||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= Float && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==Int||(LA116_0 >= LeftCurlyBrace && LA116_0 <= LeftSquareBrace)||LA116_0==LogicNot||LA116_0==Minus||LA116_0==MinusMinus||LA116_0==New||LA116_0==Null||(LA116_0 >= ParentColonColon && LA116_0 <= Plus)||LA116_0==PlusPlus||LA116_0==Return||(LA116_0 >= SelfColonColon && LA116_0 <= Semicolon)||(LA116_0 >= String && LA116_0 <= TypeBool)||(LA116_0 >= TypeFloat && LA116_0 <= TypeInt)||(LA116_0 >= TypeObject && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4609);
					instructionInclBreakContinue352=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue352.getTree());
					}
					break;

				default :
					break loop116;
				}
			} while (true);

			// AST REWRITE
			// elements: defaultLabel, caseLabel, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 803:3: -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:803:7: ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:803:76: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:804:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue352!=null?((Token)instructionInclBreakContinue352.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:804:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 99, defaultCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionOptional"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal353=null;
		Token char_literal355=null;
		ParserRuleReturnScope expression354 =null;

		CommonTree string_literal353_tree=null;
		CommonTree char_literal355_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:808:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:808:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal353=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4650); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4653);
			expression354=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression354.getTree());

			char_literal355=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4655); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal356=null;
		Token char_literal357=null;

		CommonTree string_literal356_tree=null;
		CommonTree char_literal357_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:2: ( 'default' ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal356=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4667); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal356_tree = 
			(CommonTree)adaptor.create(string_literal356)
			;
			adaptor.addChild(root_0, string_literal356_tree);
			}

			char_literal357=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4669); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal358=null;
		ParserRuleReturnScope forInit359 =null;
		ParserRuleReturnScope forCondition360 =null;
		ParserRuleReturnScope forUpdate361 =null;
		ParserRuleReturnScope instructionInclBreakContinue362 =null;

		CommonTree string_literal358_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal358=(Token)match(input,For,FOLLOW_For_in_forLoop4683); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal358_tree = 
			(CommonTree)adaptor.create(string_literal358)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal358_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop4686);
			forInit359=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit359.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop4688);
			forCondition360=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition360.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop4690);
			forUpdate361=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate361.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4692);
			instructionInclBreakContinue362=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue362.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId363 =null;
		ParserRuleReturnScope expressionList364 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:820:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:820:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit4707); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt118=2;
			alt118 = dfa118.predict(input);
			switch (alt118) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit4714);
					variableDeclarationListInclVariableId363=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId363.getTree());
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
					// 821:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, init, "variable declarations")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:5: ( expressionList )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:5: ( expressionList )?
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==At||LA117_0==Backslash||LA117_0==BitwiseNot||LA117_0==Bool||LA117_0==Clone||LA117_0==Float||LA117_0==Identifier||LA117_0==Int||(LA117_0 >= LeftParanthesis && LA117_0 <= LeftSquareBrace)||LA117_0==LogicNot||LA117_0==Minus||LA117_0==MinusMinus||LA117_0==New||LA117_0==Null||(LA117_0 >= ParentColonColon && LA117_0 <= Plus)||LA117_0==PlusPlus||LA117_0==SelfColonColon||LA117_0==String||LA117_0==This||LA117_0==TypeArray||LA117_0==VariableId) ) {
						alt117=1;
					}
					switch (alt117) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit4729);
							expressionList364=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList364.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: expressionList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 822:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:63: ( expressionList )?
						if ( stream_expressionList.hasNext() ) {
							adaptor.addChild(root_1, stream_expressionList.nextTree());

						}
						stream_expressionList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
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
			if ( state.backtracking>0 ) { memoize(input, 103, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList365 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition4759); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:18: ( expressionList )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==At||LA119_0==Backslash||LA119_0==BitwiseNot||LA119_0==Bool||LA119_0==Clone||LA119_0==Float||LA119_0==Identifier||LA119_0==Int||(LA119_0 >= LeftParanthesis && LA119_0 <= LeftSquareBrace)||LA119_0==LogicNot||LA119_0==Minus||LA119_0==MinusMinus||LA119_0==New||LA119_0==Null||(LA119_0 >= ParentColonColon && LA119_0 <= Plus)||LA119_0==PlusPlus||LA119_0==SelfColonColon||LA119_0==String||LA119_0==This||LA119_0==TypeArray||LA119_0==VariableId) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition4761);
					expressionList365=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList365.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 827:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:81: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());

				}
				stream_expressionList.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 104, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal367=null;
		ParserRuleReturnScope expressionList366 =null;

		CommonTree update_tree=null;
		CommonTree char_literal367_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate4787); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:15: ( expressionList )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==At||LA120_0==Backslash||LA120_0==BitwiseNot||LA120_0==Bool||LA120_0==Clone||LA120_0==Float||LA120_0==Identifier||LA120_0==Int||(LA120_0 >= LeftParanthesis && LA120_0 <= LeftSquareBrace)||LA120_0==LogicNot||LA120_0==Minus||LA120_0==MinusMinus||LA120_0==New||LA120_0==Null||(LA120_0 >= ParentColonColon && LA120_0 <= Plus)||LA120_0==PlusPlus||LA120_0==SelfColonColon||LA120_0==String||LA120_0==This||LA120_0==TypeArray||LA120_0==VariableId) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate4789);
					expressionList366=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList366.getTree());
					}
					break;

			}

			char_literal367=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate4792); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal367);

			// AST REWRITE
			// elements: expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 831:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:79: ( expressionList )?
				if ( stream_expressionList.hasNext() ) {
					adaptor.addChild(root_1, stream_expressionList.nextTree());

				}
				stream_expressionList.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 105, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal368=null;
		Token char_literal369=null;
		Token string_literal371=null;
		Token string_literal372=null;
		Token char_literal373=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression370 =null;
		ParserRuleReturnScope instructionInclBreakContinue374 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal368_tree=null;
		CommonTree char_literal369_tree=null;
		CommonTree string_literal371_tree=null;
		CommonTree string_literal372_tree=null;
		CommonTree char_literal373_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_As=new RewriteRuleTokenStream(adaptor,"token As");
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_primitiveTypes=new RewriteRuleSubtreeStream(adaptor,"rule primitiveTypes");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal368=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal368);

			char_literal369=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4815); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal369);

			pushFollow(FOLLOW_expression_in_foreachLoop4817);
			expression370=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression370.getTree());
			string_literal371=(Token)match(input,As,FOLLOW_As_in_foreachLoop4819); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal371);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==TypeBool||(LA121_0 >= TypeFloat && LA121_0 <= TypeInt)||LA121_0==TypeString) ) {
				int LA121_1 = input.LA(2);
				if ( (LA121_1==VariableId) ) {
					int LA121_3 = input.LA(3);
					if ( (LA121_3==Arrow) ) {
						alt121=1;
					}
				}
			}
			switch (alt121) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4824);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4828); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal372=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal372);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4836);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4840); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal373=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4842); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal373);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4844);
			instructionInclBreakContinue374=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue374.getTree());
			// AST REWRITE
			// elements: expression, valueType, keyType, Foreach, keyVarId, valueVarId, instructionInclBreakContinue
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
			// 836:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:40: ( $keyVarId)?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal375=null;
		Token char_literal376=null;
		Token char_literal378=null;
		ParserRuleReturnScope expression377 =null;
		ParserRuleReturnScope instructionInclBreakContinue379 =null;

		CommonTree string_literal375_tree=null;
		CommonTree char_literal376_tree=null;
		CommonTree char_literal378_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal375=(Token)match(input,While,FOLLOW_While_in_whileLoop4882); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal375);

			char_literal376=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4884); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal376);

			pushFollow(FOLLOW_expression_in_whileLoop4886);
			expression377=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression377.getTree());
			char_literal378=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal378);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4890);
			instructionInclBreakContinue379=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue379.getTree());
			// AST REWRITE
			// elements: instructionInclBreakContinue, While, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 840:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:63: ^( 'while' expression instructionInclBreakContinue )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal380=null;
		Token string_literal382=null;
		Token char_literal383=null;
		Token char_literal385=null;
		Token char_literal386=null;
		ParserRuleReturnScope instructionInclBreakContinue381 =null;
		ParserRuleReturnScope expression384 =null;

		CommonTree string_literal380_tree=null;
		CommonTree string_literal382_tree=null;
		CommonTree char_literal383_tree=null;
		CommonTree char_literal385_tree=null;
		CommonTree char_literal386_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:844:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:844:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal380=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4912); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal380);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4914);
			instructionInclBreakContinue381=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue381.getTree());
			string_literal382=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4916); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal382);

			char_literal383=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4918); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal383);

			pushFollow(FOLLOW_expression_in_doWhileLoop4920);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression384.getTree());
			char_literal385=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4922); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal385);

			char_literal386=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4924); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal386);

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
			// 844:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:844:72: ^( 'do' instructionInclBreakContinue expression )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal387=null;
		Token char_literal389=null;
		ParserRuleReturnScope instructionInclBreakContinue388 =null;
		ParserRuleReturnScope catchBlock390 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal387_tree=null;
		CommonTree char_literal389_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+
			{
			string_literal387=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal387);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4949); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:23: ( instructionInclBreakContinue )*
			loop122:
			do {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==At||LA122_0==Backslash||LA122_0==BitwiseNot||(LA122_0 >= Bool && LA122_0 <= Break)||LA122_0==Clone||LA122_0==Continue||LA122_0==Do||LA122_0==Echo||LA122_0==Exit||(LA122_0 >= Float && LA122_0 <= Foreach)||(LA122_0 >= Identifier && LA122_0 <= If)||LA122_0==Int||(LA122_0 >= LeftCurlyBrace && LA122_0 <= LeftSquareBrace)||LA122_0==LogicNot||LA122_0==Minus||LA122_0==MinusMinus||LA122_0==New||LA122_0==Null||(LA122_0 >= ParentColonColon && LA122_0 <= Plus)||LA122_0==PlusPlus||LA122_0==Return||(LA122_0 >= SelfColonColon && LA122_0 <= Semicolon)||(LA122_0 >= String && LA122_0 <= TypeBool)||(LA122_0 >= TypeFloat && LA122_0 <= TypeInt)||(LA122_0 >= TypeObject && LA122_0 <= TypeString)||LA122_0==VariableId||LA122_0==While) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4951);
					instructionInclBreakContinue388=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue388.getTree());
					}
					break;

				default :
					break loop122;
				}
			} while (true);

			char_literal389=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal389);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:57: ( catchBlock )+
			int cnt123=0;
			loop123:
			do {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==Catch) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4956);
					catchBlock390=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock390.getTree());
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

			// AST REWRITE
			// elements: Try, catchBlock, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 849:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:41: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal391=null;
		Token VariableId393=null;
		Token char_literal394=null;
		Token char_literal396=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject392 =null;
		ParserRuleReturnScope instructionInclBreakContinue395 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal391_tree=null;
		CommonTree VariableId393_tree=null;
		CommonTree char_literal394_tree=null;
		CommonTree char_literal396_tree=null;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal391=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock4988); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal391);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock4992); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4994);
			classInterfaceTypeWithoutObject392=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject392.getTree());
			VariableId393=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock4996); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId393);

			char_literal394=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock4998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal394);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5002); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:83: ( instructionInclBreakContinue )*
			loop124:
			do {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==At||LA124_0==Backslash||LA124_0==BitwiseNot||(LA124_0 >= Bool && LA124_0 <= Break)||LA124_0==Clone||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= Float && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==Int||(LA124_0 >= LeftCurlyBrace && LA124_0 <= LeftSquareBrace)||LA124_0==LogicNot||LA124_0==Minus||LA124_0==MinusMinus||LA124_0==New||LA124_0==Null||(LA124_0 >= ParentColonColon && LA124_0 <= Plus)||LA124_0==PlusPlus||LA124_0==Return||(LA124_0 >= SelfColonColon && LA124_0 <= Semicolon)||(LA124_0 >= String && LA124_0 <= TypeBool)||(LA124_0 >= TypeFloat && LA124_0 <= TypeInt)||(LA124_0 >= TypeObject && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5004);
					instructionInclBreakContinue395=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue395.getTree());
					}
					break;

				default :
					break loop124;
				}
			} while (true);

			char_literal396=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal396);

			// AST REWRITE
			// elements: instructionInclBreakContinue, classInterfaceTypeWithoutObject, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 854:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:854:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variable declarations")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:855:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject392!=null?((Token)classInterfaceTypeWithoutObject392.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:32: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:860:1: throwException : 'throw' ^ newObject ';' !;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal397=null;
		Token char_literal399=null;
		ParserRuleReturnScope newObject398 =null;

		CommonTree string_literal397_tree=null;
		CommonTree char_literal399_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:861:2: ( 'throw' ^ newObject ';' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:861:4: 'throw' ^ newObject ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal397=(Token)match(input,Throw,FOLLOW_Throw_in_throwException5053); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal397_tree = 
			(CommonTree)adaptor.create(string_literal397)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal397_tree, root_0);
			}

			pushFollow(FOLLOW_newObject_in_throwException5056);
			newObject398=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject398.getTree());

			char_literal399=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException5058); if (state.failed) return retval;
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

	// $ANTLR start synpred56_TSPHP
	public final void synpred56_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:4: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
		{
		pushFollow(FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1927);
		paramDeclarationOptional();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:29: ( ',' paramDeclarationOptional )*
		loop131:
		do {
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==Comma) ) {
				alt131=1;
			}

			switch (alt131) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:30: ',' paramDeclarationOptional
				{
				match(input,Comma,FOLLOW_Comma_in_synpred56_TSPHP1930); if (state.failed) return ;

				pushFollow(FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1933);
				paramDeclarationOptional();
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
	// $ANTLR end synpred56_TSPHP

	// $ANTLR start synpred57_TSPHP
	public final void synpred57_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:22: ( ',' paramDeclaration )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:22: ',' paramDeclaration
		{
		match(input,Comma,FOLLOW_Comma_in_synpred57_TSPHP1944); if (state.failed) return ;

		pushFollow(FOLLOW_paramDeclaration_in_synpred57_TSPHP1947);
		paramDeclaration();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred57_TSPHP

	// $ANTLR start synpred67_TSPHP
	public final void synpred67_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:4: ( variableAssignment ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred67_TSPHP2143);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred67_TSPHP2145); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred67_TSPHP

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: ( variableDeclaration ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred68_TSPHP2151);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP2153); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred77_TSPHP
	public final void synpred77_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: ( expression ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred77_TSPHP2199);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred77_TSPHP2201); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred77_TSPHP

	// $ANTLR start synpred97_TSPHP
	public final void synpred97_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred97_TSPHP2501); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred97_TSPHP2504);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred97_TSPHP

	// $ANTLR start synpred98_TSPHP
	public final void synpred98_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred98_TSPHP2522); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred98_TSPHP2525);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred98_TSPHP

	// $ANTLR start synpred99_TSPHP
	public final void synpred99_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:16: ( 'and' assignment )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred99_TSPHP2543); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred99_TSPHP2546);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred99_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:13: ( assignmentOperator ternary )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred100_TSPHP2562);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred100_TSPHP2565);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred127_TSPHP
	public final void synpred127_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred127_TSPHP2913); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred127_TSPHP2915);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred127_TSPHP2917); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred127_TSPHP2919);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred127_TSPHP

	// $ANTLR start synpred140_TSPHP
	public final void synpred140_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:4: ( postFixCall )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:4: postFixCall
		{
		pushFollow(FOLLOW_postFixCall_in_synpred140_TSPHP3186);
		postFixCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred140_TSPHP

	// $ANTLR start synpred147_TSPHP
	public final void synpred147_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:4: ( incrementDecrement )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred147_TSPHP3412);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred147_TSPHP

	// $ANTLR start synpred148_TSPHP
	public final void synpred148_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:644:4: ( postFixVariableInclCallAtTheEnd )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:644:4: postFixVariableInclCallAtTheEnd
		{
		pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred148_TSPHP3417);
		postFixVariableInclCallAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred148_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:4: ( classConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred149_TSPHP3422);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred149_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: ( globalConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred150_TSPHP3427);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred169_TSPHP
	public final void synpred169_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred169_TSPHP4316);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred169_TSPHP4318); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred169_TSPHP4322);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred169_TSPHP

	// $ANTLR start synpred170_TSPHP
	public final void synpred170_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:771:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred170_TSPHP4370); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP4375);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred170_TSPHP

	// $ANTLR start synpred171_TSPHP
	public final void synpred171_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:36: ( switchContent )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:36: switchContent
		{
		pushFollow(FOLLOW_switchContent_in_synpred171_TSPHP4416);
		switchContent();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred171_TSPHP

	// $ANTLR start synpred172_TSPHP
	public final void synpred172_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred172_TSPHP4443);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred172_TSPHP

	// $ANTLR start synpred173_TSPHP
	public final void synpred173_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: ( defaultCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: defaultCaseInstructionMandatory
		{
		pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred173_TSPHP4446);
		defaultCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred173_TSPHP

	// $ANTLR start synpred175_TSPHP
	public final void synpred175_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
		{
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: ( normalCaseInstructionMandatory )*
		loop139:
		do {
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==Case) ) {
				int LA139_1 = input.LA(2);
				if ( (synpred172_TSPHP()) ) {
					alt139=1;
				}

			}

			switch (alt139) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:4: normalCaseInstructionMandatory
				{
				pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred175_TSPHP4443);
				normalCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop139;
			}
		} while (true);

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: ( defaultCaseInstructionMandatory )?
		int alt140=2;
		int LA140_0 = input.LA(1);
		if ( (LA140_0==Case) ) {
			int LA140_1 = input.LA(2);
			if ( (synpred173_TSPHP()) ) {
				alt140=1;
			}
		}
		else if ( (LA140_0==Default) ) {
			alt140=1;
		}
		switch (alt140) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:36: defaultCaseInstructionMandatory
				{
				pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred175_TSPHP4446);
				defaultCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:69: ( normalCaseInstructionOptional )*
		loop141:
		do {
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==Case) ) {
				alt141=1;
			}

			switch (alt141) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:69: normalCaseInstructionOptional
				{
				pushFollow(FOLLOW_normalCaseInstructionOptional_in_synpred175_TSPHP4449);
				normalCaseInstructionOptional();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop141;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred175_TSPHP

	// $ANTLR start synpred176_TSPHP
	public final void synpred176_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4455);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred176_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:4: ( caseLabel )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:4: caseLabel
		{
		pushFollow(FOLLOW_caseLabel_in_synpred180_TSPHP4512);
		caseLabel();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred180_TSPHP

	// Delegated rules

	public final boolean synpred97_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred97_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred149_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred149_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred147_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred147_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred172_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred172_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred99_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred173_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred173_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred148_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred148_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred77_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred171_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred171_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred98_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_TSPHP_fragment(); // can never throw exception
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
	protected DFA81 dfa81 = new DFA81(this);
	protected DFA85 dfa85 = new DFA85(this);
	protected DFA87 dfa87 = new DFA87(this);
	protected DFA118 dfa118 = new DFA118(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\5\1\76\1\uffff\1\14\1\uffff\1\76\1\uffff\1\14";
	static final String DFA3_maxS =
		"\1\u0094\1\104\1\uffff\1\170\1\uffff\1\76\1\uffff\1\170";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\1\2\7\uffff\2\2\3\uffff"+
			"\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff\1\2\3\uffff\5\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\4\uffff\1\1\1\2\3\uffff\1\2"+
			"\7\uffff\2\2\1\uffff\1\2\5\uffff\1\2\7\uffff\2\2\5\uffff\7\2\2\uffff"+
			"\2\2\1\uffff\3\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\67\uffff\1\4\63\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\67\uffff\1\4\63\uffff\1\6"
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
			return "204:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA47_eotS =
		"\16\uffff";
	static final String DFA47_eofS =
		"\7\uffff\1\12\6\uffff";
	static final String DFA47_minS =
		"\1\14\4\u0092\1\76\1\14\1\10\1\76\1\24\1\uffff\1\14\1\0\1\uffff";
	static final String DFA47_maxS =
		"\1\u008c\4\u0092\1\76\1\u0092\1\161\1\76\1\176\1\uffff\1\u0092\1\0\1\uffff";
	static final String DFA47_acceptS =
		"\12\uffff\1\2\2\uffff\1\1";
	static final String DFA47_specialS =
		"\14\uffff\1\0\1\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\5\61\uffff\1\6\104\uffff\1\2\1\1\2\uffff\2\1\1\uffff\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\u0085\uffff\1\7",
			"\1\11\26\uffff\1\12\121\uffff\1\12",
			"\1\13",
			"\1\15\41\uffff\1\15\7\uffff\1\15\3\uffff\1\15\17\uffff\1\15\13\uffff"+
			"\1\14\10\uffff\1\15\26\uffff\1\15",
			"",
			"\1\10\u0085\uffff\1\7",
			"\1\uffff",
			""
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
			return "388:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA47_12 = input.LA(1);
						 
						int index47_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_TSPHP()) ) {s = 13;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index47_12);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 47, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA45_eotS =
		"\17\uffff";
	static final String DFA45_eofS =
		"\1\2\10\uffff\1\14\5\uffff";
	static final String DFA45_minS =
		"\1\37\1\14\1\uffff\4\u0092\1\76\1\14\1\10\1\76\1\24\1\uffff\1\14\1\0";
	static final String DFA45_maxS =
		"\1\161\1\u008c\1\uffff\4\u0092\1\76\1\u0092\1\161\1\76\1\176\1\uffff\1"+
		"\u0092\1\0";
	static final String DFA45_acceptS =
		"\2\uffff\1\2\11\uffff\1\1\2\uffff";
	static final String DFA45_specialS =
		"\16\uffff\1\0}>";
	static final String[] DFA45_transitionS = {
			"\1\1\121\uffff\1\2",
			"\1\7\61\uffff\1\10\104\uffff\1\4\1\3\2\uffff\2\3\1\uffff\1\6\1\5\1\3",
			"",
			"\1\11",
			"\1\11",
			"\1\11",
			"\1\11",
			"\1\10",
			"\1\12\u0085\uffff\1\11",
			"\1\13\26\uffff\1\14\121\uffff\1\14",
			"\1\15",
			"\1\2\41\uffff\1\2\7\uffff\1\2\3\uffff\1\2\17\uffff\1\2\13\uffff\1\16"+
			"\10\uffff\1\2\26\uffff\1\2",
			"",
			"\1\12\u0085\uffff\1\11",
			"\1\uffff"
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
			return "()* loopback of 390:21: ( ',' ! paramDeclaration )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA45_14 = input.LA(1);
						 
						int index45_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_TSPHP()) ) {s = 12;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index45_14);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 45, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA81_eotS =
		"\10\uffff";
	static final String DFA81_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA81_minS =
		"\1\132\1\14\1\76\1\6\1\76\2\uffff\1\6";
	static final String DFA81_maxS =
		"\1\132\2\76\1\174\1\76\2\uffff\1\174";
	static final String DFA81_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA81_specialS =
		"\10\uffff}>";
	static final String[] DFA81_transitionS = {
			"\1\1",
			"\1\2\61\uffff\1\3",
			"\1\3",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\12\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\12\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6"
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
			return "595:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA85_eotS =
		"\7\uffff";
	static final String DFA85_eofS =
		"\7\uffff";
	static final String DFA85_minS =
		"\1\14\1\76\1\14\1\uffff\1\76\1\uffff\1\14";
	static final String DFA85_maxS =
		"\1\u0092\1\76\1\105\1\uffff\1\76\1\uffff\1\105";
	static final String DFA85_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA85_specialS =
		"\7\uffff}>";
	static final String[] DFA85_transitionS = {
			"\1\1\61\uffff\1\2\47\uffff\1\3\20\uffff\1\3\10\uffff\1\3\21\uffff\1\3",
			"\1\2",
			"\1\4\36\uffff\1\3\31\uffff\1\5",
			"",
			"\1\6",
			"",
			"\1\4\36\uffff\1\3\31\uffff\1\5"
	};

	static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
	static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
	static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
	static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
	static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
	static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
	static final short[][] DFA85_transition;

	static {
		int numStates = DFA85_transitionS.length;
		DFA85_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
		}
	}

	class DFA85 extends DFA {

		public DFA85(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 85;
			this.eot = DFA85_eot;
			this.eof = DFA85_eof;
			this.min = DFA85_min;
			this.max = DFA85_max;
			this.accept = DFA85_accept;
			this.special = DFA85_special;
			this.transition = DFA85_transition;
		}
		@Override
		public String getDescription() {
			return "616:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA87_eotS =
		"\12\uffff";
	static final String DFA87_eofS =
		"\12\uffff";
	static final String DFA87_minS =
		"\1\14\3\76\1\14\2\uffff\2\76\1\14";
	static final String DFA87_maxS =
		"\3\u0092\1\76\1\53\2\uffff\1\76\1\u0092\1\53";
	static final String DFA87_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA87_specialS =
		"\12\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\3\61\uffff\1\4\47\uffff\1\2\20\uffff\1\1\10\uffff\1\5\21\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\4",
			"\1\7\36\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\123\uffff\1\5",
			"\1\7\36\uffff\1\10"
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
			return "638:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA118_eotS =
		"\11\uffff";
	static final String DFA118_eofS =
		"\11\uffff";
	static final String DFA118_minS =
		"\1\11\1\uffff\1\105\1\76\1\10\1\uffff\1\14\1\76\1\14";
	static final String DFA118_maxS =
		"\1\u0092\1\uffff\1\u0092\1\76\1\u0092\1\uffff\1\u0092\1\76\1\u0092";
	static final String DFA118_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA118_specialS =
		"\11\uffff}>";
	static final String[] DFA118_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\10\uffff\1\5\30\uffff\1\5\7"+
			"\uffff\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\2\1\1\2\uffff\2\1\1\uffff\3\1\5\uffff\1\5",
			"",
			"\1\5\114\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\13\uffff\1\5\5\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\3\uffff\2\5\1\uffff\4\5\2\uffff\3\5\11\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\25\uffff\1\1",
			"",
			"\1\7\36\uffff\1\5\31\uffff\1\5\114\uffff\1\1",
			"\1\10",
			"\1\7\36\uffff\1\5\31\uffff\1\5\114\uffff\1\1"
	};

	static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
	static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
	static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
	static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
	static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
	static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
	static final short[][] DFA118_transition;

	static {
		int numStates = DFA118_transitionS.length;
		DFA118_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
		}
	}

	class DFA118 extends DFA {

		public DFA118(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 118;
			this.eot = DFA118_eot;
			this.eof = DFA118_eof;
			this.min = DFA118_min;
			this.max = DFA118_max;
			this.accept = DFA118_accept;
			this.special = DFA118_special;
			this.transition = DFA118_transition;
		}
		@Override
		public String getDescription() {
			return "821:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_EOF_in_prog1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_EOF_in_prog1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1050 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1066 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1068 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1070 = new BitSet(new long[]{0xC3E2408230109222L,0xC18082C04414087CL,0x0000000000149D9FL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1072 = new BitSet(new long[]{0xC3E2408230109222L,0xC18082C04414087CL,0x0000000000149D9FL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1087 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1092 = new BitSet(new long[]{0xC3E2408230109220L,0xC18182C04414087CL,0x0000000000149D9FL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1094 = new BitSet(new long[]{0xC3E2408230109220L,0xC18182C04414087CL,0x0000000000149D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1169 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1172 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1174 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1194 = new BitSet(new long[]{0xC3E2408230109222L,0xC18082C04414087CL,0x0000000000149D9FL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1229 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1231 = new BitSet(new long[]{0x0000000080000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1234 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1236 = new BitSet(new long[]{0x0000000080000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1255 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1257 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1259 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1267 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1269 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1280 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1332 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1334 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1342 = new BitSet(new long[]{0x0220000200000020L,0x2001340000000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1344 = new BitSet(new long[]{0x0220000200000020L,0x2001340000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1361 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1374 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1377 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1379 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1392 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001190L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1433 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1435 = new BitSet(new long[]{0x0000000080000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1438 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1440 = new BitSet(new long[]{0x0000000080000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1470 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1472 = new BitSet(new long[]{0x4040000000100000L,0x4000008040040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1487 = new BitSet(new long[]{0x0000000000000000L,0x0000340000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1490 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1492 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1533 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1540 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1542 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1561 = new BitSet(new long[]{0x0200000000000000L,0x0000300000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1563 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1577 = new BitSet(new long[]{0x0220000000000000L,0x0000340000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1579 = new BitSet(new long[]{0x0200000000000000L,0x0000340000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1587 = new BitSet(new long[]{0x0200000000000000L,0x2000340000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1589 = new BitSet(new long[]{0x0200000000000000L,0x0000340000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1603 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1622 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1629 = new BitSet(new long[]{0x0200000200000000L,0x0001200000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1631 = new BitSet(new long[]{0x0200000200000000L,0x0001200000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1661 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1664 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1687 = new BitSet(new long[]{0xC1C2408020109200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1689 = new BitSet(new long[]{0xC1C2408020109200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1724 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000081D98L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1727 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1852 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters1901 = new BitSet(new long[]{0x4000000000001000L,0x0002000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramList_in_formalParameters1903 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1927 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1930 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1933 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1941 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1944 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1947 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1952 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1955 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1971 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_paramDeclaration1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Null_in_paramDeclaration1976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationOptional2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationOptional2006 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2009 = new BitSet(new long[]{0x4040000000100000L,0x4000008040040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2057 = new BitSet(new long[]{0xC1C2408020109200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2059 = new BitSet(new long[]{0xC1C2408020109200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2094 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2096 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2120 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000004L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2127 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2143 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2151 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction2199 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2207 = new BitSet(new long[]{0x4040000020109200L,0x418002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_instruction2210 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2219 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expressionList_in_instruction2222 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2230 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2257 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2260 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_expressionList2263 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2276 = new BitSet(new long[]{0x00000440000A4100L,0x1400010001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2278 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2377 = new BitSet(new long[]{0x0000000000000000L,0x0000020000100000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2422 = new BitSet(new long[]{0x4000000000001000L,0x0080004000000000L,0x0000000000040001L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2453 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2456 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2501 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2522 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2543 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_ternary_in_assignment2559 = new BitSet(new long[]{0x00000440000A4102L,0x1400010001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2562 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_ternary_in_assignment2565 = new BitSet(new long[]{0x00000440000A4102L,0x1400010001480000L});
	public static final BitSet FOLLOW_logicOr_in_ternary2579 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2582 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_ternary2585 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2587 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_ternary2590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2607 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2626 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2643 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2646 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2649 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2662 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2665 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2668 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2681 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2684 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2687 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality2700 = new BitSet(new long[]{0x2001000000000002L,0x0000000038000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2703 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_comparison_in_equality2706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2750 = new BitSet(new long[]{0x0C00000000000002L,0x0000000000000180L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2753 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2796 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2799 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2806 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2820 = new BitSet(new long[]{0x0000020000000002L,0x0000008000040000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2823 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2832 = new BitSet(new long[]{0x0000020000000002L,0x0000008000040000L});
	public static final BitSet FOLLOW_logicNot_in_factor2846 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_set_in_factor2849 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicNot_in_factor2858 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2869 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2891 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2913 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001198L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2915 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2917 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140064L,0x0000000000040009L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2935 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140064L,0x0000000000040009L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2943 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140064L,0x0000000000040009L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew2963 = new BitSet(new long[]{0x4040000020101000L,0x408002C044140064L,0x0000000000040009L});
	public static final BitSet FOLLOW_cloneOrNew_in_cloneOrNew2966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew2971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember3007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3048 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3063 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3082 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3108 = new BitSet(new long[]{0x4040000020109200L,0x408202C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3110 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3138 = new BitSet(new long[]{0x4040000000101000L,0x4080024040100064L,0x0000000000040009L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3158 = new BitSet(new long[]{0x4040000000101000L,0x4080024040100064L,0x0000000000040009L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_primary3186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_postFixCall3206 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_methodCall_in_postFixCall3216 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCall3234 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCall3236 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCall3258 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_postFixCall3260 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCall3262 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_call_in_postFixCall3280 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3334 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_call3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3351 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3381 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3399 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_atom3401 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3449 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3464 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3495 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3497 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3520 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3522 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3524 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3563 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3578 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3580 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3602 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3604 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3606 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCallAtTheEnd3624 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000040L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3652 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3693 = new BitSet(new long[]{0x4040000000100000L,0x4000000040000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3713 = new BitSet(new long[]{0x4040000000100000L,0x4000000040000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4247 = new BitSet(new long[]{0x4040000020109200L,0x408402C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_arrayContent_in_array4249 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4270 = new BitSet(new long[]{0x4040000020109200L,0x408202C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_arrayContent_in_array4272 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4296 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4299 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4302 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4316 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4318 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4354 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_ifCondition4356 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4358 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4363 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4370 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4410 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4414 = new BitSet(new long[]{0x0000001004000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4416 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4443 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_switchContent4446 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_switchContent4449 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4455 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionOptional_in_switchContent4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionMandatory4471 = new BitSet(new long[]{0xC1C2408424309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4474 = new BitSet(new long[]{0xC1C2408420309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionOptional4512 = new BitSet(new long[]{0xC1C2408424309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4515 = new BitSet(new long[]{0xC1C2408420309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4555 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4558 = new BitSet(new long[]{0xC1C2408424309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4560 = new BitSet(new long[]{0xC1C2408424309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4563 = new BitSet(new long[]{0xC1C2408420309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4601 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4604 = new BitSet(new long[]{0xC1C2408424309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4606 = new BitSet(new long[]{0xC1C2408424309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4609 = new BitSet(new long[]{0xC1C2408420309202L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_Case_in_caseLabel4650 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_caseLabel4653 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4667 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forInit_in_forLoop4686 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop4688 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop4690 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit4707 = new BitSet(new long[]{0x4040000020109202L,0x408002C044140864L,0x0000000000041D99L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit4714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition4759 = new BitSet(new long[]{0x4040000020109202L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expressionList_in_forCondition4761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate4787 = new BitSet(new long[]{0x4040000020109200L,0x408202C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4789 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate4792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4815 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4817 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop4819 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001198L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4828 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4830 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001198L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4840 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4842 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4884 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_whileLoop4886 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4888 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4912 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4918 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4920 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4922 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4949 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4951 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4954 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4956 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock4988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock4992 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock4994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock4996 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock4998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5002 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5004 = new BitSet(new long[]{0xC1C2408420309200L,0xC18182C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException5053 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_newObject_in_throwException5056 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException5058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1927 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_synpred56_TSPHP1930 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1933 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_synpred57_TSPHP1944 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001D98L});
	public static final BitSet FOLLOW_paramDeclaration_in_synpred57_TSPHP1947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred67_TSPHP2143 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred67_TSPHP2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred68_TSPHP2151 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred77_TSPHP2199 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred77_TSPHP2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred97_TSPHP2501 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred97_TSPHP2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred98_TSPHP2522 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred98_TSPHP2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred99_TSPHP2543 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_assignment_in_synpred99_TSPHP2546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred100_TSPHP2562 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_ternary_in_synpred100_TSPHP2565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred127_TSPHP2913 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000001198L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred127_TSPHP2915 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred127_TSPHP2917 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140064L,0x0000000000040009L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred127_TSPHP2919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_synpred140_TSPHP3186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred147_TSPHP3412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred148_TSPHP3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred149_TSPHP3422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred150_TSPHP3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred169_TSPHP4316 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred169_TSPHP4318 = new BitSet(new long[]{0x4040000020109200L,0x408002C044140864L,0x0000000000040009L});
	public static final BitSet FOLLOW_expression_in_synpred169_TSPHP4322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred170_TSPHP4370 = new BitSet(new long[]{0xC1C2408420309200L,0xC18082C044140874L,0x0000000000141D9FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred170_TSPHP4375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchContent_in_synpred171_TSPHP4416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred172_TSPHP4443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred173_TSPHP4446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred175_TSPHP4443 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred175_TSPHP4446 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_synpred175_TSPHP4449 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred180_TSPHP4512 = new BitSet(new long[]{0x0000000000000002L});
}
