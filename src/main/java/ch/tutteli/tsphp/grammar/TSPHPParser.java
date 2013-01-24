// $ANTLR 3.x D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g 2013-01-24 17:12:23

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CLASS_INTERFACE_TYPE", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Cast", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeDouble", "TypeFloat", "TypeInt", "TypeInteger", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
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
	public static final int Cast=27;
	public static final int Catch=28;
	public static final int Class=29;
	public static final int Clone=30;
	public static final int Colon=31;
	public static final int Comma=32;
	public static final int Comment=33;
	public static final int Const=34;
	public static final int Continue=35;
	public static final int DECIMAL=36;
	public static final int Default=37;
	public static final int Divide=38;
	public static final int DivideEqual=39;
	public static final int Do=40;
	public static final int Dolar=41;
	public static final int Dot=42;
	public static final int DotEqual=43;
	public static final int DoubleColon=44;
	public static final int EXPONENT=45;
	public static final int EXPRESSION_LIST=46;
	public static final int Echo=47;
	public static final int Else=48;
	public static final int Equal=49;
	public static final int Exit=50;
	public static final int Extends=51;
	public static final int FUNCTION_CALL=52;
	public static final int FUNCTION_DECLARATION=53;
	public static final int Final=54;
	public static final int Float=55;
	public static final int For=56;
	public static final int Foreach=57;
	public static final int Function=58;
	public static final int GreaterEqualThan=59;
	public static final int GreaterThan=60;
	public static final int HEXADECIMAL=61;
	public static final int Identical=62;
	public static final int Identifier=63;
	public static final int If=64;
	public static final int Implements=65;
	public static final int Instanceof=66;
	public static final int Int=67;
	public static final int Interface=68;
	public static final int LeftCurlyBrace=69;
	public static final int LeftParanthesis=70;
	public static final int LeftSquareBrace=71;
	public static final int LessEqualThan=72;
	public static final int LessThan=73;
	public static final int LogicAnd=74;
	public static final int LogicAndWeak=75;
	public static final int LogicNot=76;
	public static final int LogicOr=77;
	public static final int LogicOrWeak=78;
	public static final int LogicXorWeak=79;
	public static final int MEMBER_ACCESS=80;
	public static final int MEMBER_ACCESS_STATIC=81;
	public static final int METHOD_CALL=82;
	public static final int Minus=83;
	public static final int MinusEqual=84;
	public static final int MinusMinus=85;
	public static final int Modulo=86;
	public static final int ModuloEqual=87;
	public static final int Multiply=88;
	public static final int MultiplyEqual=89;
	public static final int Namespace=90;
	public static final int New=91;
	public static final int NotEqual=92;
	public static final int NotEqualAlternative=93;
	public static final int NotIdentical=94;
	public static final int Null=95;
	public static final int OCTAL=96;
	public static final int ObjectOperator=97;
	public static final int PARAM_DECLARATION=98;
	public static final int PARAM_LIST=99;
	public static final int POST_INCREMENT_DECREMENT=100;
	public static final int PRE_INCREMENT_DECREMENT=101;
	public static final int Parent=102;
	public static final int ParentColonColon=103;
	public static final int Plus=104;
	public static final int PlusEqual=105;
	public static final int PlusPlus=106;
	public static final int Private=107;
	public static final int ProtectThis=108;
	public static final int Protected=109;
	public static final int Public=110;
	public static final int QuestionMark=111;
	public static final int Return=112;
	public static final int RightCurlyBrace=113;
	public static final int RightParanthesis=114;
	public static final int RightSquareBrace=115;
	public static final int STRING_DOUBLE_QUOTED=116;
	public static final int STRING_SINGLE_QUOTED=117;
	public static final int SWITCH_CASES=118;
	public static final int Self=119;
	public static final int SelfColonColon=120;
	public static final int Semicolon=121;
	public static final int ShiftLeft=122;
	public static final int ShiftLeftEqual=123;
	public static final int ShiftRight=124;
	public static final int ShiftRightEqual=125;
	public static final int Static=126;
	public static final int String=127;
	public static final int Switch=128;
	public static final int This=129;
	public static final int Throw=130;
	public static final int Try=131;
	public static final int TypeArray=132;
	public static final int TypeBool=133;
	public static final int TypeBoolean=134;
	public static final int TypeDouble=135;
	public static final int TypeFloat=136;
	public static final int TypeInt=137;
	public static final int TypeInteger=138;
	public static final int TypeObject=139;
	public static final int TypeResource=140;
	public static final int TypeString=141;
	public static final int UMINUS=142;
	public static final int UPLUS=143;
	public static final int Use=144;
	public static final int VARIABLE_DECLARATION=145;
	public static final int VARIABLE_DECLARATION_LIST=146;
	public static final int VariableId=147;
	public static final int Void=148;
	public static final int While=149;
	public static final int Whitespace=150;

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
		this.state.ruleMemo = new HashMap[308+1];
		 

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:205:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1040);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1043); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:206:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:206:4: ( namespaceBracket )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:206:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1049);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1052); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:207:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1058);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1060); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )* ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:2: ( ( 'namespace' namespaceId ';' ( statement )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:4: ( 'namespace' namespaceId ';' ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:4: ( 'namespace' namespaceId ';' ( statement )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:5: 'namespace' namespaceId ';' ( statement )*
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1076);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1078); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:33: ( statement )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==At||LA4_0==Backslash||LA4_0==BitwiseNot||LA4_0==Bool||(LA4_0 >= Class && LA4_0 <= Clone)||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||(LA4_0 >= Final && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Int && LA4_0 <= LeftSquareBrace)||LA4_0==LogicNot||LA4_0==Minus||LA4_0==MinusMinus||LA4_0==New||LA4_0==Null||(LA4_0 >= ParentColonColon && LA4_0 <= Plus)||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= SelfColonColon && LA4_0 <= Semicolon)||(LA4_0 >= String && LA4_0 <= TypeBool)||(LA4_0 >= TypeFloat && LA4_0 <= TypeInt)||(LA4_0 >= TypeObject && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1080);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:5: 'namespace' ( namespaceId )? '{' ( statement )* '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1095); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1097);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1100); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:34: ( statement )*
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==At||LA6_0==Backslash||LA6_0==BitwiseNot||LA6_0==Bool||(LA6_0 >= Class && LA6_0 <= Clone)||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||(LA6_0 >= Final && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Int && LA6_0 <= LeftSquareBrace)||LA6_0==LogicNot||LA6_0==Minus||LA6_0==MinusMinus||LA6_0==New||LA6_0==Null||(LA6_0 >= ParentColonColon && LA6_0 <= Plus)||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= SelfColonColon && LA6_0 <= Semicolon)||(LA6_0 >= String && LA6_0 <= TypeBool)||(LA6_0 >= TypeFloat && LA6_0 <= TypeInt)||(LA6_0 >= TypeObject && LA6_0 <= TypeString)||LA6_0==Use||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1102);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1105); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1177); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier16);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal17);

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1182); if (state.failed) return retval; 
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
			// 227:34: -> ( Identifier )+
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:231:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:232:2: ( ( statement )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:232:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:232:4: ( statement )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:232:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1202);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:235:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:236:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:236:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1215);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:237:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1220);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1225);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:241:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:242:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:242:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1237); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1239);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:242:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:242:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1242); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1244);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1248); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1263); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1265); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1267);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:6: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1277);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:249:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:249:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1288); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1290); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:251:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1303);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1308);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:254:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1313);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:255:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1318);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1340); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1344);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1347);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1350); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:92: ( classBody )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1352);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1355); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:265:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:266:2: ( 'extends' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:266:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1369); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1371);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1382); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1385); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1387); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:273:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:274:2: ( 'implements' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:274:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1400); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1402);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:277:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1414);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:279:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1419);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:280:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1425);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1441);
			primitiveTypes57=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes57.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1443);
			constantAssignment58=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment58.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:54: ',' constantAssignment
					{
					char_literal59=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1446); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal59);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1448);
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

			char_literal61=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1452); if (state.failed) return retval; 
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
			// 285:3: -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:288:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:289:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:289:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1478); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier62_tree = 
			(CommonTree)adaptor.create(Identifier62)
			;
			adaptor.addChild(root_0, Identifier62_tree);
			}

			char_literal63=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1480); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal63_tree = 
			(CommonTree)adaptor.create(char_literal63)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1483);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:4: 'static'
					{
					string_literal65=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1495); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = 
					(CommonTree)adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1498);
			accessor66=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor66.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1500);
			variableDeclarationListInclVariableId67=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId67.getTree());

			char_literal68=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1502); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1511);
					accessorWithoutPrivate69=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate69.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal70=(Token)match(input,Private,FOLLOW_Private_in_accessor1516); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set71=null;

		CommonTree set71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1541);
			variableDeclaration72=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration72.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal73=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1544); if (state.failed) return retval;
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1548);
							variableAssignment74=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment74.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:50: VariableId
							{
							VariableId75=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1550); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal76=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal76_tree = 
					(CommonTree)adaptor.create(string_literal76)
					;
					adaptor.addChild(root_0, string_literal76_tree);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1571);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:6: 'static' ( 'final' )?
							{
							string_literal78=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1585); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal78_tree = 
							(CommonTree)adaptor.create(string_literal78)
							;
							adaptor.addChild(root_0, string_literal78_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:15: 'final'
									{
									string_literal79=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1587); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:6: 'final' ( 'static' )?
							{
							string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1595); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal80_tree = 
							(CommonTree)adaptor.create(string_literal80)
							;
							adaptor.addChild(root_0, string_literal80_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:14: 'static'
									{
									string_literal81=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1597); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:315:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:315:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:315:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1611);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1618);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal84=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1630); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal84_tree = 
			(CommonTree)adaptor.create(string_literal84)
			;
			adaptor.addChild(root_0, string_literal84_tree);
			}

			Identifier85=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1632); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier85_tree = 
			(CommonTree)adaptor.create(Identifier85)
			;
			adaptor.addChild(root_0, Identifier85_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1634);
					implementsDeclaration86=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1637); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = 
			(CommonTree)adaptor.create(char_literal87)
			;
			adaptor.addChild(root_0, char_literal87_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1639);
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

			char_literal89=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1642); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList90 =null;
		ParserRuleReturnScope interfaceMethodDeclaration91 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:324:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:324:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1653);
					constDeclarationList90=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList90.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:325:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1658);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:4: 'public'
					{
					string_literal92=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal92_tree = 
					(CommonTree)adaptor.create(string_literal92)
					;
					adaptor.addChild(root_0, string_literal92_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1672);
			functionDeclarationWithoutBody93=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody93.getTree());

			char_literal94=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1674); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1691);
			functionDeclarationWithoutBody95=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody95.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1695); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:45: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==At||LA35_0==Backslash||LA35_0==BitwiseNot||LA35_0==Bool||LA35_0==Clone||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= Float && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==Int||(LA35_0 >= LeftCurlyBrace && LA35_0 <= LeftSquareBrace)||LA35_0==LogicNot||LA35_0==Minus||LA35_0==MinusMinus||LA35_0==New||LA35_0==Null||(LA35_0 >= ParentColonColon && LA35_0 <= Plus)||LA35_0==PlusPlus||LA35_0==Return||(LA35_0 >= SelfColonColon && LA35_0 <= Semicolon)||(LA35_0 >= String && LA35_0 <= TypeBool)||(LA35_0 >= TypeFloat && LA35_0 <= TypeInt)||(LA35_0 >= TypeObject && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1697);
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

			char_literal97=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal97);

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
			// 338:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody95!=null?((Token)functionDeclarationWithoutBody95.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:122: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:146: ( instructionWithoutBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:341:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal98=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1732); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1735);
			returnType99=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType99.getTree());

			Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1737); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier100_tree = 
			(CommonTree)adaptor.create(Identifier100)
			;
			adaptor.addChild(root_0, Identifier100_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody1739);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:345:1: returnType : ( allTypes | 'void' );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1751);
					allTypes102=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes102.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal103=(Token)match(input,Void,FOLLOW_Void_in_returnType1755); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended104 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject105 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:350:2: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:350:4: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1766);
					primitiveTypesExtended104=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended104.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:350:29: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1770);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray106 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1781);
					primitiveTypesInclArray106=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:355:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1787);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:1: primitiveTypes : ( TypeBool | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set108=null;

		CommonTree set108_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:2: ( TypeBool | TypeInt | TypeFloat | TypeString )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:365:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:366:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:366:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1825);
					primitiveTypes109=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes109.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:367:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray110=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1830); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1842);
					primitiveTypesInclArray111=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray111.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource112=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1847); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:8: (root= '\\\\' )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Backslash) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1860); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1863);
			namespaceId113=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId113.getTree());
			// AST REWRITE
			// elements: root, namespaceId
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
			// 376:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:31: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:118: ( $root)?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject114=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1890); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject114_tree = 
					(CommonTree)adaptor.create(TypeObject114)
					;
					adaptor.addChild(root_0, TypeObject114_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1896);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters1909); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:15: ( paramList )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash||LA43_0==Cast||LA43_0==Identifier||(LA43_0 >= TypeArray && LA43_0 <= TypeBool)||(LA43_0 >= TypeFloat && LA43_0 <= TypeInt)||(LA43_0 >= TypeObject && LA43_0 <= TypeString)) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters1911);
					paramList116=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList116.getTree());
					}
					break;

			}

			char_literal117=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters1914); if (state.failed) return retval; 
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
			// 386:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:68: ( paramList )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );
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
		ParserRuleReturnScope paramDeclarationInclNull121 =null;
		ParserRuleReturnScope paramDeclarationInclNull123 =null;
		ParserRuleReturnScope paramDeclarationOptional125 =null;

		CommonTree char_literal119_tree=null;
		CommonTree char_literal122_tree=null;
		CommonTree char_literal124_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* )
			int alt47=2;
			alt47 = dfa47.predict(input);
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1935);
					paramDeclarationOptional118=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional118.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:29: ( ',' ! paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:30: ',' ! paramDeclarationOptional
							{
							char_literal119=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1938); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1941);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:4: paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList1948);
					paramDeclarationInclNull121=paramDeclarationInclNull();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull121.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:29: ( ',' ! paramDeclarationInclNull )*
					loop45:
					do {
						int alt45=2;
						alt45 = dfa45.predict(input);
						switch (alt45) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:30: ',' ! paramDeclarationInclNull
							{
							char_literal122=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1951); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList1954);
							paramDeclarationInclNull123=paramDeclarationInclNull();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull123.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:62: ( ',' ! paramDeclarationOptional )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:63: ',' ! paramDeclarationOptional
							{
							char_literal124=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1959); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1962);
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


	public static class paramDeclarationInclNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationInclNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:394:1: paramDeclarationInclNull : paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? ) ;
	public final TSPHPParser.paramDeclarationInclNull_return paramDeclarationInclNull() throws RecognitionException {
		TSPHPParser.paramDeclarationInclNull_return retval = new TSPHPParser.paramDeclarationInclNull_return();
		retval.start = input.LT(1);
		int paramDeclarationInclNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal127=null;
		Token Null128=null;
		ParserRuleReturnScope paramDeclarationWithoutNull126 =null;

		CommonTree char_literal127_tree=null;
		CommonTree Null128_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:2: ( paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:4: paramDeclarationWithoutNull ( '=' Null )?
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull1977);
			paramDeclarationWithoutNull126=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull126.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:32: ( '=' Null )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==Assign) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:33: '=' Null
					{
					char_literal127=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationInclNull1980); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal127);

					Null128=(Token)match(input,Null,FOLLOW_Null_in_paramDeclarationInclNull1982); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Null.add(Null128);

					}
					break;

			}

			// AST REWRITE
			// elements: paramDeclarationWithoutNull, Null
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 395:44: -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:47: ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, ((Token)retval.start), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_paramDeclarationWithoutNull.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:395:152: ( Null )?
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
			if ( state.backtracking>0 ) { memoize(input, 37, paramDeclarationInclNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationInclNull"


	public static class paramDeclarationWithoutNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationWithoutNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:398:1: paramDeclarationWithoutNull : ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId ;
	public final TSPHPParser.paramDeclarationWithoutNull_return paramDeclarationWithoutNull() throws RecognitionException {
		TSPHPParser.paramDeclarationWithoutNull_return retval = new TSPHPParser.paramDeclarationWithoutNull_return();
		retval.start = input.LT(1);
		int paramDeclarationWithoutNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Cast129=null;
		Token VariableId131=null;
		ParserRuleReturnScope allTypes130 =null;

		CommonTree Cast129_tree=null;
		CommonTree VariableId131_tree=null;
		RewriteRuleTokenStream stream_Cast=new RewriteRuleTokenStream(adaptor,"token Cast");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:2: ( ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:4: ( Cast )? allTypes VariableId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:4: ( Cast )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Cast) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:4: Cast
					{
					Cast129=(Token)match(input,Cast,FOLLOW_Cast_in_paramDeclarationWithoutNull2007); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Cast.add(Cast129);

					}
					break;

			}

			pushFollow(FOLLOW_allTypes_in_paramDeclarationWithoutNull2010);
			allTypes130=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes130.getTree());
			VariableId131=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationWithoutNull2012); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId131);

			// AST REWRITE
			// elements: Cast, allTypes, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 399:30: -> ^( allTypes ( Cast )? ) VariableId
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:33: ^( allTypes ( Cast )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_allTypes.nextNode(), root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:44: ( Cast )?
				if ( stream_Cast.hasNext() ) {
					adaptor.addChild(root_1, 
					stream_Cast.nextNode()
					);

				}
				stream_Cast.reset();

				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, 
				stream_VariableId.nextNode()
				);

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
			if ( state.backtracking>0 ) { memoize(input, 38, paramDeclarationWithoutNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationWithoutNull"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:402:1: paramDeclarationOptional : paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal133=null;
		ParserRuleReturnScope paramDeclarationWithoutNull132 =null;
		ParserRuleReturnScope unaryPrimitiveAtom134 =null;

		CommonTree char_literal133_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleSubtreeStream stream_unaryPrimitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule unaryPrimitiveAtom");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:403:2: ( paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:403:4: paramDeclarationWithoutNull '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2037);
			paramDeclarationWithoutNull132=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull132.getTree());
			char_literal133=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2040); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal133);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2042);
			unaryPrimitiveAtom134=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom134.getTree());
			// AST REWRITE
			// elements: paramDeclarationWithoutNull, unaryPrimitiveAtom
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 404:3: -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:404:6: ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, ((Token)retval.start), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_paramDeclarationWithoutNull.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 39, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:411:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal136=null;
		ParserRuleReturnScope instructionWithoutBreakContinue135 =null;
		ParserRuleReturnScope instruction137 =null;

		CommonTree block_tree=null;
		CommonTree char_literal136_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:2: (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LeftCurlyBrace) ) {
				alt51=1;
			}
			else if ( (LA51_0==At||LA51_0==Backslash||LA51_0==BitwiseNot||LA51_0==Bool||LA51_0==Clone||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= Float && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==Int||(LA51_0 >= LeftParanthesis && LA51_0 <= LeftSquareBrace)||LA51_0==LogicNot||LA51_0==Minus||LA51_0==MinusMinus||LA51_0==New||LA51_0==Null||(LA51_0 >= ParentColonColon && LA51_0 <= Plus)||LA51_0==PlusPlus||LA51_0==Return||(LA51_0 >= SelfColonColon && LA51_0 <= Semicolon)||(LA51_0 >= String && LA51_0 <= TypeBool)||(LA51_0 >= TypeFloat && LA51_0 <= TypeInt)||(LA51_0 >= TypeObject && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
				alt51=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:4: block= '{' ( instructionWithoutBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2086); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:16: ( instructionWithoutBreakContinue )*
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==At||LA50_0==Backslash||LA50_0==BitwiseNot||LA50_0==Bool||LA50_0==Clone||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= Float && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==Int||(LA50_0 >= LeftCurlyBrace && LA50_0 <= LeftSquareBrace)||LA50_0==LogicNot||LA50_0==Minus||LA50_0==MinusMinus||LA50_0==New||LA50_0==Null||(LA50_0 >= ParentColonColon && LA50_0 <= Plus)||LA50_0==PlusPlus||LA50_0==Return||(LA50_0 >= SelfColonColon && LA50_0 <= Semicolon)||(LA50_0 >= String && LA50_0 <= TypeBool)||(LA50_0 >= TypeFloat && LA50_0 <= TypeInt)||(LA50_0 >= TypeObject && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2088);
							instructionWithoutBreakContinue135=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue135.getTree());
							}
							break;

						default :
							break loop50;
						}
					} while (true);

					char_literal136=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2091); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal136);

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
					// 412:53: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:56: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:412:81: ( instructionWithoutBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:413:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2107);
					instruction137=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction137.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 40, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:416:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal139=null;
		Token set141=null;
		Token Int142=null;
		Token char_literal143=null;
		ParserRuleReturnScope instructionInclBreakContinue138 =null;
		ParserRuleReturnScope instruction140 =null;

		CommonTree block_tree=null;
		CommonTree char_literal139_tree=null;
		CommonTree set141_tree=null;
		CommonTree Int142_tree=null;
		CommonTree char_literal143_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:2: (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
			int alt54=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt54=1;
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
				alt54=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt54=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:4: block= '{' ( instructionInclBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:17: ( instructionInclBreakContinue )*
					loop52:
					do {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==At||LA52_0==Backslash||LA52_0==BitwiseNot||(LA52_0 >= Bool && LA52_0 <= Break)||LA52_0==Clone||LA52_0==Continue||LA52_0==Do||LA52_0==Echo||LA52_0==Exit||(LA52_0 >= Float && LA52_0 <= Foreach)||(LA52_0 >= Identifier && LA52_0 <= If)||LA52_0==Int||(LA52_0 >= LeftCurlyBrace && LA52_0 <= LeftSquareBrace)||LA52_0==LogicNot||LA52_0==Minus||LA52_0==MinusMinus||LA52_0==New||LA52_0==Null||(LA52_0 >= ParentColonColon && LA52_0 <= Plus)||LA52_0==PlusPlus||LA52_0==Return||(LA52_0 >= SelfColonColon && LA52_0 <= Semicolon)||(LA52_0 >= String && LA52_0 <= TypeBool)||(LA52_0 >= TypeFloat && LA52_0 <= TypeInt)||(LA52_0 >= TypeObject && LA52_0 <= TypeString)||LA52_0==VariableId||LA52_0==While) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2125);
							instructionInclBreakContinue138=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue138.getTree());
							}
							break;

						default :
							break loop52;
						}
					} while (true);

					char_literal139=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal139);

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
					// 417:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:79: ( instructionInclBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2144);
					instruction140=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction140.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set141=(Token)input.LT(1);
					set141=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set141)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:26: ( Int )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==Int) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:26: Int
							{
							Int142=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2156); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int142_tree = 
							(CommonTree)adaptor.create(Int142)
							;
							adaptor.addChild(root_0, Int142_tree);
							}

							}
							break;

					}

					char_literal143=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2159); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 41, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token semi=null;
		Token char_literal145=null;
		Token char_literal147=null;
		Token char_literal157=null;
		Token string_literal158=null;
		Token char_literal160=null;
		Token string_literal161=null;
		Token char_literal163=null;
		Token string_literal164=null;
		Token char_literal165=null;
		ParserRuleReturnScope variableAssignment144 =null;
		ParserRuleReturnScope variableDeclaration146 =null;
		ParserRuleReturnScope ifCondition148 =null;
		ParserRuleReturnScope switchCondition149 =null;
		ParserRuleReturnScope forLoop150 =null;
		ParserRuleReturnScope foreachLoop151 =null;
		ParserRuleReturnScope whileLoop152 =null;
		ParserRuleReturnScope doWhileLoop153 =null;
		ParserRuleReturnScope tryCatch154 =null;
		ParserRuleReturnScope throwException155 =null;
		ParserRuleReturnScope expression156 =null;
		ParserRuleReturnScope expression159 =null;
		ParserRuleReturnScope expressionList162 =null;

		CommonTree semi_tree=null;
		CommonTree char_literal145_tree=null;
		CommonTree char_literal147_tree=null;
		CommonTree char_literal157_tree=null;
		CommonTree string_literal158_tree=null;
		CommonTree char_literal160_tree=null;
		CommonTree string_literal161_tree=null;
		CommonTree char_literal163_tree=null;
		CommonTree string_literal164_tree=null;
		CommonTree char_literal165_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] )
			int alt56=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA56_1 = input.LA(2);
				if ( (synpred68_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt56=11;
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
				break;
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeObject:
			case TypeResource:
			case TypeString:
				{
				alt56=2;
				}
				break;
			case TypeArray:
				{
				int LA56_3 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=2;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt56=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA56_6 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=2;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt56=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA56_7 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=2;
				}
				else if ( (synpred78_TSPHP()) ) {
					alt56=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case If:
				{
				alt56=3;
				}
				break;
			case Switch:
				{
				alt56=4;
				}
				break;
			case For:
				{
				alt56=5;
				}
				break;
			case Foreach:
				{
				alt56=6;
				}
				break;
			case While:
				{
				alt56=7;
				}
				break;
			case Do:
				{
				alt56=8;
				}
				break;
			case Try:
				{
				alt56=9;
				}
				break;
			case Throw:
				{
				alt56=10;
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
				alt56=11;
				}
				break;
			case Return:
				{
				alt56=12;
				}
				break;
			case Echo:
				{
				alt56=13;
				}
				break;
			case Exit:
				{
				alt56=14;
				}
				break;
			case Semicolon:
				{
				alt56=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2172);
					variableAssignment144=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment144.getTree());

					char_literal145=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2174); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2180);
					variableDeclaration146=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration146.getTree());

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2182); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:425:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2188);
					ifCondition148=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition148.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:426:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2193);
					switchCondition149=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition149.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:427:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2198);
					forLoop150=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop150.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2203);
					foreachLoop151=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop151.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2208);
					whileLoop152=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop152.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:430:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2213);
					doWhileLoop153=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop153.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2218);
					tryCatch154=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch154.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2223);
					throwException155=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException155.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction2228);
					expression156=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

					char_literal157=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2230); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal158=(Token)match(input,Return,FOLLOW_Return_in_instruction2236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal158_tree = 
					(CommonTree)adaptor.create(string_literal158)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal158_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:14: ( expression )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==At||LA55_0==Backslash||LA55_0==BitwiseNot||LA55_0==Bool||LA55_0==Clone||LA55_0==Float||LA55_0==Identifier||LA55_0==Int||(LA55_0 >= LeftParanthesis && LA55_0 <= LeftSquareBrace)||LA55_0==LogicNot||LA55_0==Minus||LA55_0==MinusMinus||LA55_0==New||LA55_0==Null||(LA55_0 >= ParentColonColon && LA55_0 <= Plus)||LA55_0==PlusPlus||LA55_0==SelfColonColon||LA55_0==String||LA55_0==This||LA55_0==TypeArray||LA55_0==VariableId) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2239);
							expression159=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression159.getTree());

							}
							break;

					}

					char_literal160=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2242); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:435:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal161=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2248); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal161_tree = 
					(CommonTree)adaptor.create(string_literal161)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal161_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2251);
					expressionList162=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList162.getTree());

					char_literal163=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2253); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal164=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2259); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal164_tree = 
					(CommonTree)adaptor.create(string_literal164)
					;
					adaptor.addChild(root_0, string_literal164_tree);
					}

					char_literal165=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2261); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:437:4: semi= ';'
					{
					semi=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2269); if (state.failed) return retval; 
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
					// 437:13: -> BLOCK[$semi,\"block\"]
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
			if ( state.backtracking>0 ) { memoize(input, 42, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:440:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal167=null;
		ParserRuleReturnScope expression166 =null;
		ParserRuleReturnScope expression168 =null;

		CommonTree char_literal167_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:441:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:441:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2286);
			expression166=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression166.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:441:15: ( ',' ! expression )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==Comma) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:441:16: ',' ! expression
					{
					char_literal167=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2289); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2292);
					expression168=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

					}
					break;

				default :
					break loop57;
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
			if ( state.backtracking>0 ) { memoize(input, 43, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:444:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId169=null;
		ParserRuleReturnScope assignmentOperator170 =null;
		ParserRuleReturnScope expression171 =null;

		CommonTree VariableId169_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId169=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2305); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId169_tree = 
			(CommonTree)adaptor.create(VariableId169)
			;
			adaptor.addChild(root_0, VariableId169_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2307);
			assignmentOperator170=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator170.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2310);
			expression171=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression171.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:448:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement172 =null;
		ParserRuleReturnScope preIncrementDecrement173 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:449:2: ( postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:449:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2322);
					postIncrementDecrement172=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement172.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2327);
					preIncrementDecrement173=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement173.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 45, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:453:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set174=null;

		CommonTree set174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:454:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set174=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set174)
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
			if ( state.backtracking>0 ) { memoize(input, 46, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:468:1: postIncrementDecrement : postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd175 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus176 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:2: ( postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:4: postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2406);
			postFixVariableWithoutCallAtTheEnd175=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd175.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2408);
			plusPlusOrMinusMinus176=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus176.getTree());
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
			// 470:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:470:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCallAtTheEnd175!=null?((Token)postFixVariableWithoutCallAtTheEnd175.start):null), "post increment/decrement")
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
			if ( state.backtracking>0 ) { memoize(input, 47, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class plusPlusOrMinusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plusPlusOrMinusMinus"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:473:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set177=null;

		CommonTree set177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:2: ( '++' | '--' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set177=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set177)
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
			if ( state.backtracking>0 ) { memoize(input, 48, plusPlusOrMinusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "plusPlusOrMinusMinus"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus178 =null;
		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd179 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:2: ( plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:4: plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2451);
			plusPlusOrMinusMinus178=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus178.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2453);
			postFixVariableWithoutCallAtTheEnd179=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd179.getTree());
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
			// 480:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:480:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus178!=null?((Token)plusPlusOrMinusMinus178.start):null), "pre increment/decrement")
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
			if ( state.backtracking>0 ) { memoize(input, 49, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:483:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId181=null;
		Token char_literal182=null;
		ParserRuleReturnScope allTypes180 =null;
		ParserRuleReturnScope expression183 =null;

		CommonTree VariableId181_tree=null;
		CommonTree char_literal182_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2480);
			allTypes180=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes180.getTree());
			VariableId181=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2482); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId181);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:24: ( '=' expression )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Assign) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:25: '=' expression
					{
					char_literal182=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal182);

					pushFollow(FOLLOW_expression_in_variableDeclaration2487);
					expression183=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression183.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: allTypes, VariableId, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 484:42: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:45: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes180!=null?((Token)allTypes180.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:128: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 50, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:487:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak184 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:2: ( logicOrWeak )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2514);
			logicOrWeak184=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak184.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal186=null;
		ParserRuleReturnScope logicXorWeak185 =null;
		ParserRuleReturnScope logicXorWeak187 =null;

		CommonTree string_literal186_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2527);
			logicXorWeak185=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak185.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:17: ( 'or' ^ logicXorWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicOrWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred98_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:18: 'or' ^ logicXorWeak
					{
					string_literal186=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2530); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal186_tree = 
					(CommonTree)adaptor.create(string_literal186)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal186_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2533);
					logicXorWeak187=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak187.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 52, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal189=null;
		ParserRuleReturnScope logicAndWeak188 =null;
		ParserRuleReturnScope logicAndWeak190 =null;

		CommonTree string_literal189_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2548);
			logicAndWeak188=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak188.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:17: ( 'xor' ^ logicAndWeak )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicXorWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:18: 'xor' ^ logicAndWeak
					{
					string_literal189=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2551); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal189_tree = 
					(CommonTree)adaptor.create(string_literal189)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal189_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2554);
					logicAndWeak190=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak190.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 53, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal192=null;
		ParserRuleReturnScope assignment191 =null;
		ParserRuleReturnScope assignment193 =null;

		CommonTree string_literal192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2569);
			assignment191=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment191.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:15: ( 'and' ^ assignment )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicAndWeak) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred100_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:16: 'and' ^ assignment
					{
					string_literal192=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2572); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal192_tree = 
					(CommonTree)adaptor.create(string_literal192)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal192_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2575);
					assignment193=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment193.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 54, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary194 =null;
		ParserRuleReturnScope assignmentOperator195 =null;
		ParserRuleReturnScope ternary196 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2588);
			ternary194=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary194.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:12: ( assignmentOperator ^ ternary )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==Assign||LA63_0==BitwiseAndEqual||LA63_0==BitwiseOrEqual||LA63_0==BitwiseXorEqual||LA63_0==DivideEqual||LA63_0==DotEqual||LA63_0==MinusEqual||LA63_0==ModuloEqual||LA63_0==MultiplyEqual||LA63_0==PlusEqual||LA63_0==ShiftLeftEqual||LA63_0==ShiftRightEqual) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2591);
					assignmentOperator195=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator195.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2594);
					ternary196=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary196.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 55, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal198=null;
		Token char_literal200=null;
		ParserRuleReturnScope logicOr197 =null;
		ParserRuleReturnScope expression199 =null;
		ParserRuleReturnScope expression201 =null;

		CommonTree char_literal198_tree=null;
		CommonTree char_literal200_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:509:2: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:509:4: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2608);
			logicOr197=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr197.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:509:12: ( '?' ^ expression ':' ! expression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==QuestionMark) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:509:13: '?' ^ expression ':' ! expression
					{
					char_literal198=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2611); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal198_tree = 
					(CommonTree)adaptor.create(char_literal198)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2614);
					expression199=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression199.getTree());

					char_literal200=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2616); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2619);
					expression201=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression201.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 56, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal203=null;
		ParserRuleReturnScope logicAnd202 =null;
		ParserRuleReturnScope logicAnd204 =null;

		CommonTree string_literal203_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:2: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:4: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2633);
			logicAnd202=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd202.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:13: ( '||' ^ logicAnd )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicOr) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:14: '||' ^ logicAnd
					{
					string_literal203=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2636); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = 
					(CommonTree)adaptor.create(string_literal203)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal203_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2639);
					logicAnd204=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd204.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 57, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:516:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal206=null;
		ParserRuleReturnScope bitwiseOr205 =null;
		ParserRuleReturnScope bitwiseOr207 =null;

		CommonTree string_literal206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:2: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:4: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2652);
			bitwiseOr205=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr205.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:14: ( '&&' ^ bitwiseOr )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicAnd) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:15: '&&' ^ bitwiseOr
					{
					string_literal206=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2655); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal206_tree = 
					(CommonTree)adaptor.create(string_literal206)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal206_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2658);
					bitwiseOr207=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr207.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 58, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal209=null;
		ParserRuleReturnScope bitwiseXor208 =null;
		ParserRuleReturnScope bitwiseXor210 =null;

		CommonTree char_literal209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2672);
			bitwiseXor208=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor208.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:15: ( '|' ^ bitwiseXor )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseOr) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:16: '|' ^ bitwiseXor
					{
					char_literal209=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2675); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal209_tree = 
					(CommonTree)adaptor.create(char_literal209)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal209_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2678);
					bitwiseXor210=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor210.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal212=null;
		ParserRuleReturnScope bitwiseAnd211 =null;
		ParserRuleReturnScope bitwiseAnd213 =null;

		CommonTree char_literal212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:525:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:525:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2691);
			bitwiseAnd211=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd211.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:525:15: ( '^' ^ bitwiseAnd )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseXor) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:525:16: '^' ^ bitwiseAnd
					{
					char_literal212=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2694); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal212_tree = 
					(CommonTree)adaptor.create(char_literal212)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2697);
					bitwiseAnd213=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd213.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 60, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal215=null;
		ParserRuleReturnScope equality214 =null;
		ParserRuleReturnScope equality216 =null;

		CommonTree char_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:529:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:529:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2710);
			equality214=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality214.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:529:13: ( '&' ^ equality )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseAnd) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:529:14: '&' ^ equality
					{
					char_literal215=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = 
					(CommonTree)adaptor.create(char_literal215)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2716);
					equality216=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality216.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 61, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:532:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison217 =null;
		ParserRuleReturnScope equalityOperator218 =null;
		ParserRuleReturnScope comparison219 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:2: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:4: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2729);
			comparison217=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison217.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:15: ( equalityOperator ^ comparison )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==Equal||LA70_0==Identical||(LA70_0 >= NotEqual && LA70_0 <= NotIdentical)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:16: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2732);
					equalityOperator218=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator218.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2735);
					comparison219=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison219.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:536:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set220=null;

		CommonTree set220_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set220=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set220)
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
			if ( state.backtracking>0 ) { memoize(input, 63, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:544:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift221 =null;
		ParserRuleReturnScope comparisonOperator222 =null;
		ParserRuleReturnScope bitwiseShift223 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2779);
			bitwiseShift221=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift221.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:17: ( comparisonOperator ^ bitwiseShift )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( ((LA71_0 >= GreaterEqualThan && LA71_0 <= GreaterThan)||(LA71_0 >= LessEqualThan && LA71_0 <= LessThan)) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2782);
					comparisonOperator222=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator222.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2785);
					bitwiseShift223=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift223.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:548:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set224=null;

		CommonTree set224_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:549:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set224=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set224)
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
			if ( state.backtracking>0 ) { memoize(input, 65, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set226=null;
		ParserRuleReturnScope termOrStringConcatenation225 =null;
		ParserRuleReturnScope termOrStringConcatenation227 =null;

		CommonTree set226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:556:2: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:556:4: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2825);
			termOrStringConcatenation225=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation225.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:556:30: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ShiftLeft||LA72_0==ShiftRight) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:556:31: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set226=(Token)input.LT(1);
					set226=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set226)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2835);
					termOrStringConcatenation227=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation227.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set229=null;
		ParserRuleReturnScope factor228 =null;
		ParserRuleReturnScope factor230 =null;

		CommonTree set229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:560:2: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:560:4: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2849);
			factor228=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor228.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:560:11: ( ( '+' | '-' | '.' ) ^ factor )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Dot||LA73_0==Minus||LA73_0==Plus) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:560:12: ( '+' | '-' | '.' ) ^ factor
					{
					set229=(Token)input.LT(1);
					set229=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set229)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2861);
					factor230=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor230.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 67, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set232=null;
		ParserRuleReturnScope logicNot231 =null;
		ParserRuleReturnScope logicNot233 =null;

		CommonTree set232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:564:2: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:564:4: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2875);
			logicNot231=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot231.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:564:13: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==Divide||LA74_0==Modulo||LA74_0==Multiply) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:564:14: ( '*' | '/' | '%' ) ^ logicNot
					{
					set232=(Token)input.LT(1);
					set232=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set232)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2887);
					logicNot233=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot233.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 68, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal234=null;
		ParserRuleReturnScope logicNot235 =null;
		ParserRuleReturnScope instanceOf236 =null;

		CommonTree char_literal234_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:9: ( '!' ^ logicNot | instanceOf )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal234=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal234_tree = 
					(CommonTree)adaptor.create(char_literal234)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal234_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2901);
					logicNot235=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot235.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:568:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2906);
					instanceOf236=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf236.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 69, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal238=null;
		Token VariableId240=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt237 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject239 =null;

		CommonTree string_literal238_tree=null;
		CommonTree VariableId240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2917);
			castOrBitwiseNotOrAt237=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt237.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Instanceof) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal238=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2920); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal238_tree = 
					(CommonTree)adaptor.create(string_literal238)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal238_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2924);
							classInterfaceTypeWithoutObject239=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject239.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:73: VariableId
							{
							VariableId240=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2926); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId240_tree = 
							(CommonTree)adaptor.create(VariableId240)
							;
							adaptor.addChild(root_0, VariableId240_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 70, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:574:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal242=null;
		Token char_literal244=null;
		Token char_literal246=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource241 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt243 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt245 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt247 =null;
		ParserRuleReturnScope cloneOrNew248 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal242_tree=null;
		CommonTree char_literal244_tree=null;
		CommonTree char_literal246_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
			int alt78=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA78_1 = input.LA(2);
				if ( (synpred128_TSPHP()) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2942); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2944);
					allTypesWithoutObjectAndResource241=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource241.getTree());
					char_literal242=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal242);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2948);
					castOrBitwiseNotOrAt243=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt243.getTree());
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
					// 575:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:576:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal244=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal244_tree = 
					(CommonTree)adaptor.create(char_literal244)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal244_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2967);
					castOrBitwiseNotOrAt245=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt245.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:577:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal246=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2972); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal246_tree = 
					(CommonTree)adaptor.create(char_literal246)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal246_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2975);
					castOrBitwiseNotOrAt247=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt247.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:578:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2981);
					cloneOrNew248=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew248.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 71, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class cloneOrNew_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cloneOrNew"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:581:1: cloneOrNew : ( 'clone' ^ cloneOrNew | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal249=null;
		ParserRuleReturnScope cloneOrNew250 =null;
		ParserRuleReturnScope newObject251 =null;
		ParserRuleReturnScope unaryPrimary252 =null;

		CommonTree string_literal249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:582:2: ( 'clone' ^ cloneOrNew | newObject | unaryPrimary )
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
			case ParentColonColon:
			case Plus:
			case PlusPlus:
			case SelfColonColon:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:582:4: 'clone' ^ cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal249=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew2992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal249_tree = 
					(CommonTree)adaptor.create(string_literal249)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal249_tree, root_0);
					}

					pushFollow(FOLLOW_cloneOrNew_in_cloneOrNew2995);
					cloneOrNew250=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew250.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew3000);
					newObject251=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject251.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:584:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew3005);
					unaryPrimary252=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary252.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 72, cloneOrNew_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cloneOrNew"


	public static class variableOrMemberOrStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableOrMemberOrStaticMember"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:588:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId254=null;
		Token string_literal255=null;
		Token VariableId256=null;
		ParserRuleReturnScope staticAccessOrParent253 =null;

		CommonTree VariableId254_tree=null;
		CommonTree string_literal255_tree=null;
		CommonTree VariableId256_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
			int alt80=3;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case ParentColonColon:
			case SelfColonColon:
				{
				alt80=1;
				}
				break;
			case This:
				{
				alt80=2;
				}
				break;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3018);
					staticAccessOrParent253=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent253.getTree());
					VariableId254=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId254);

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
					// 589:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent253!=null?((Token)staticAccessOrParent253.start):null), "static member access")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:590:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal255=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember3036); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal255_tree = 
					(CommonTree)adaptor.create(string_literal255)
					;
					adaptor.addChild(root_0, string_literal255_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:591:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId256=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3041); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId256_tree = 
					(CommonTree)adaptor.create(VariableId256)
					;
					adaptor.addChild(root_0, VariableId256_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 73, variableOrMemberOrStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableOrMemberOrStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:594:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token p=null;
		Token string_literal258=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject257 =null;

		CommonTree s_tree=null;
		CommonTree p_tree=null;
		CommonTree string_literal258_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
			int alt81=3;
			switch ( input.LA(1) ) {
			case SelfColonColon:
				{
				alt81=1;
				}
				break;
			case ParentColonColon:
				{
				alt81=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3055); if (state.failed) return retval; 
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
					// 595:15: -> Self[$s,\"self\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3067); if (state.failed) return retval; 
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
					// 596:17: -> Parent[$p,\"parent\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:597:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3077);
					classInterfaceTypeWithoutObject257=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject257.getTree());

					string_literal258=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3079); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 74, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal259=null;
		Token string_literal262=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject260 =null;
		ParserRuleReturnScope actualParameters261 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject263 =null;

		CommonTree string_literal259_tree=null;
		CommonTree string_literal262_tree=null;
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt82=2;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal259=(Token)match(input,New,FOLLOW_New_in_newObject3092); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal259);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3094);
					classInterfaceTypeWithoutObject260=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject260.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3096);
					actualParameters261=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters261.getTree());
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
					// 601:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:601:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:602:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal262=(Token)match(input,New,FOLLOW_New_in_newObject3111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal262);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3113);
					classInterfaceTypeWithoutObject263=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject263.getTree());
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
					// 602:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:602:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, (classInterfaceTypeWithoutObject263!=null?((Token)classInterfaceTypeWithoutObject263.stop):null), "expressions")
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


	public static class actualParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:605:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.actualParameters_return actualParameters() throws RecognitionException {
		TSPHPParser.actualParameters_return retval = new TSPHPParser.actualParameters_return();
		retval.start = input.LT(1);
		int actualParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token char_literal265=null;
		ParserRuleReturnScope expressionList264 =null;

		CommonTree list_tree=null;
		CommonTree char_literal265_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3137); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:13: ( expressionList )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==At||LA83_0==Backslash||LA83_0==BitwiseNot||LA83_0==Bool||LA83_0==Clone||LA83_0==Float||LA83_0==Identifier||LA83_0==Int||(LA83_0 >= LeftParanthesis && LA83_0 <= LeftSquareBrace)||LA83_0==LogicNot||LA83_0==Minus||LA83_0==MinusMinus||LA83_0==New||LA83_0==Null||(LA83_0 >= ParentColonColon && LA83_0 <= Plus)||LA83_0==PlusPlus||LA83_0==SelfColonColon||LA83_0==String||LA83_0==This||LA83_0==TypeArray||LA83_0==VariableId) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3139);
					expressionList264=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList264.getTree());
					}
					break;

			}

			char_literal265=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3142); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal265);

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
			// 606:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:75: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 76, actualParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "actualParameters"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:609:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary266 =null;
		ParserRuleReturnScope primary267 =null;
		ParserRuleReturnScope primary268 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
			int alt84=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt84=1;
				}
				break;
			case Minus:
				{
				alt84=2;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3169);
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
					// 610:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3187); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3189);
					primary267=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary267.getTree());
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
					// 611:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3203);
					primary268=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary268.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 77, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:1: primary : ( postFixCall | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCall269 =null;
		ParserRuleReturnScope atom270 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:2: ( postFixCall | atom )
			int alt85=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA85_1 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA85_2 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA85_3 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA85_4 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA85_5 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA85_6 = input.LA(2);
				if ( (synpred141_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 85, 6, input);
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
				alt85=2;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: postFixCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCall_in_primary3215);
					postFixCall269=postFixCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCall269.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3220);
					atom270=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom270.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 78, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class postFixCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:620:1: postFixCall : ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* ;
	public final TSPHPParser.postFixCall_return postFixCall() throws RecognitionException {
		TSPHPParser.postFixCall_return retval = new TSPHPParser.postFixCall_return();
		retval.start = input.LT(1);
		int postFixCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier273=null;
		Token char_literal275=null;
		ParserRuleReturnScope functionCall271 =null;
		ParserRuleReturnScope methodCall272 =null;
		ParserRuleReturnScope expression274 =null;
		ParserRuleReturnScope call276 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier273_tree=null;
		CommonTree char_literal275_tree=null;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:4: ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt86=2;
			alt86 = dfa86.predict(input);
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCall3235);
					functionCall271=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall271.getTree());
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
					// 621:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCall3245);
					methodCall272=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall272.getTree());
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
					// 622:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			loop87:
			do {
				int alt87=4;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==ObjectOperator) ) {
					int LA87_2 = input.LA(2);
					if ( (LA87_2==Identifier) ) {
						int LA87_4 = input.LA(3);
						if ( (LA87_4==EOF||(LA87_4 >= Arrow && LA87_4 <= Assign)||(LA87_4 >= BitwiseAnd && LA87_4 <= BitwiseAndEqual)||(LA87_4 >= BitwiseOr && LA87_4 <= BitwiseXorEqual)||(LA87_4 >= Colon && LA87_4 <= Comma)||(LA87_4 >= Divide && LA87_4 <= DivideEqual)||(LA87_4 >= Dot && LA87_4 <= DotEqual)||LA87_4==Equal||(LA87_4 >= GreaterEqualThan && LA87_4 <= GreaterThan)||LA87_4==Identical||LA87_4==Instanceof||(LA87_4 >= LeftSquareBrace && LA87_4 <= LogicAndWeak)||(LA87_4 >= LogicOr && LA87_4 <= LogicXorWeak)||(LA87_4 >= Minus && LA87_4 <= MinusEqual)||(LA87_4 >= Modulo && LA87_4 <= MultiplyEqual)||(LA87_4 >= NotEqual && LA87_4 <= NotIdentical)||LA87_4==ObjectOperator||(LA87_4 >= Plus && LA87_4 <= PlusEqual)||LA87_4==QuestionMark||(LA87_4 >= RightParanthesis && LA87_4 <= RightSquareBrace)||(LA87_4 >= Semicolon && LA87_4 <= ShiftRightEqual)) ) {
							alt87=1;
						}
						else if ( (LA87_4==LeftParanthesis) ) {
							alt87=3;
						}

					}

				}
				else if ( (LA87_0==LeftSquareBrace) ) {
					alt87=2;
				}

				switch (alt87) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCall3263); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier273=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCall3265); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier273);

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
					// 624:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCall3287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCall3289);
					expression274=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression274.getTree());
					char_literal275=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCall3291); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal275);

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
					// 625:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:626:5: call
					{
					pushFollow(FOLLOW_call_in_postFixCall3309);
					call276=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call276.getTree());
					// AST REWRITE
					// elements: call, postFixCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 626:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:626:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call276!=null?((Token)call276.start):null), "method call")
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
			if ( state.backtracking>0 ) { memoize(input, 79, postFixCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCall"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classInterfaceTypeWithoutObject277 =null;
		ParserRuleReturnScope actualParameters278 =null;

		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:631:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:631:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3337);
			classInterfaceTypeWithoutObject277=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject277.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3339);
			actualParameters278=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters278.getTree());
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
			// 632:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:632:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject277!=null?((Token)classInterfaceTypeWithoutObject277.start):null), "function call")
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
			if ( state.backtracking>0 ) { memoize(input, 80, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:1: call : '->' ! Identifier actualParameters ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal279=null;
		Token Identifier280=null;
		ParserRuleReturnScope actualParameters281 =null;

		CommonTree string_literal279_tree=null;
		CommonTree Identifier280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal279=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3363); if (state.failed) return retval;
			Identifier280=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3366); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier280_tree = 
			(CommonTree)adaptor.create(Identifier280)
			;
			adaptor.addChild(root_0, Identifier280_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3368);
			actualParameters281=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters281.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier283=null;
		ParserRuleReturnScope callee282 =null;
		ParserRuleReturnScope actualParameters284 =null;

		CommonTree Identifier283_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3380);
			callee282=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee282.getTree());
			Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3382); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier283);

			pushFollow(FOLLOW_actualParameters_in_methodCall3384);
			actualParameters284=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters284.getTree());
			// AST REWRITE
			// elements: callee, Identifier, actualParameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 640:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:640:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee282!=null?((Token)callee282.start):null), "method call")
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
			if ( state.backtracking>0 ) { memoize(input, 82, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class callee_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callee"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal286=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember285 =null;
		ParserRuleReturnScope staticAccessOrParent287 =null;

		CommonTree string_literal286_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt88=2;
			alt88 = dfa88.predict(input);
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:643:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3410);
					variableOrMemberOrStaticMember285=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember285.getTree());

					string_literal286=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3412); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:644:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3418);
					staticAccessOrParent287=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent287.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, callee_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callee"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal288=null;
		Token char_literal290=null;
		ParserRuleReturnScope expression289 =null;
		ParserRuleReturnScope incrementDecrement291 =null;
		ParserRuleReturnScope postFixVariableInclCallAtTheEnd292 =null;
		ParserRuleReturnScope classConstant293 =null;
		ParserRuleReturnScope globalConstant294 =null;
		ParserRuleReturnScope array295 =null;
		ParserRuleReturnScope primitiveAtom296 =null;

		CommonTree char_literal288_tree=null;
		CommonTree char_literal290_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom )
			int alt89=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt89=1;
				}
				break;
			case SelfColonColon:
				{
				int LA89_2 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt89=3;
				}
				else if ( (synpred150_TSPHP()) ) {
					alt89=4;
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
			case ParentColonColon:
				{
				int LA89_3 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt89=3;
				}
				else if ( (synpred150_TSPHP()) ) {
					alt89=4;
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
			case Backslash:
				{
				int LA89_4 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt89=3;
				}
				else if ( (synpred150_TSPHP()) ) {
					alt89=4;
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
			case Identifier:
				{
				int LA89_5 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt89=3;
				}
				else if ( (synpred150_TSPHP()) ) {
					alt89=4;
				}
				else if ( (synpred151_TSPHP()) ) {
					alt89=5;
				}
				else if ( (true) ) {
					alt89=7;
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
			case This:
				{
				int LA89_6 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
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
			case VariableId:
				{
				int LA89_7 = input.LA(2);
				if ( (synpred148_TSPHP()) ) {
					alt89=2;
				}
				else if ( (synpred149_TSPHP()) ) {
					alt89=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 7, input);
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
				alt89=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt89=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt89=7;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:8: '(' expression ')'
					{
					char_literal288=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3428); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal288);

					pushFollow(FOLLOW_expression_in_atom3430);
					expression289=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression289.getTree());
					char_literal290=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3432); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal290);

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
					// 647:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3441);
					incrementDecrement291=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement291.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: postFixVariableInclCallAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3446);
					postFixVariableInclCallAtTheEnd292=postFixVariableInclCallAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCallAtTheEnd292.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3451);
					classConstant293=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant293.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3456);
					globalConstant294=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant294.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3461);
					array295=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array295.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:653:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3466);
					primitiveAtom296=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom296.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class postFixVariableWithoutCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableWithoutCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:1: postFixVariableWithoutCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* ;
	public final TSPHPParser.postFixVariableWithoutCallAtTheEnd_return postFixVariableWithoutCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCallAtTheEnd_return retval = new TSPHPParser.postFixVariableWithoutCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier299=null;
		Token char_literal301=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember297 =null;
		ParserRuleReturnScope call298 =null;
		ParserRuleReturnScope expression300 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier299_tree=null;
		CommonTree char_literal301_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3478);
			variableOrMemberOrStaticMember297=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember297.getTree());
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
			// 657:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:658:3: ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			loop92:
			do {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==LeftSquareBrace||LA92_0==ObjectOperator) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:5: ( call )*
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:5: ( call )*
					loop90:
					do {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==ObjectOperator) ) {
							int LA90_1 = input.LA(2);
							if ( (LA90_1==Identifier) ) {
								int LA90_3 = input.LA(3);
								if ( (LA90_3==LeftParanthesis) ) {
									alt90=1;
								}

							}

						}

						switch (alt90) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:5: call
							{
							pushFollow(FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3493);
							call298=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_call.add(call298.getTree());
							}
							break;

						default :
							break loop90;
						}
					} while (true);

					// AST REWRITE
					// elements: call, postFixVariableWithoutCallAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 659:11: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:14: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call298!=null?((Token)call298.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:91: ( call )*
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

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==ObjectOperator) ) {
						alt91=1;
					}
					else if ( (LA91_0==LeftSquareBrace) ) {
						alt91=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 91, 0, input);
						throw nvae;
					}
					switch (alt91) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3524); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier299=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3526); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier299);

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
							// 661:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:662:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3549); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3551);
							expression300=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression300.getTree());
							char_literal301=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3553); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal301);

							// AST REWRITE
							// elements: expression, postFixVariableWithoutCallAtTheEnd
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 662:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:662:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
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
			if ( state.backtracking>0 ) { memoize(input, 85, postFixVariableWithoutCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableWithoutCallAtTheEnd"


	public static class postFixVariableInclCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableInclCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:668:1: postFixVariableInclCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* ;
	public final TSPHPParser.postFixVariableInclCallAtTheEnd_return postFixVariableInclCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableInclCallAtTheEnd_return retval = new TSPHPParser.postFixVariableInclCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableInclCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier303=null;
		Token char_literal305=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember302 =null;
		ParserRuleReturnScope expression304 =null;
		ParserRuleReturnScope call306 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier303_tree=null;
		CommonTree char_literal305_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3592);
			variableOrMemberOrStaticMember302=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember302.getTree());
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
			// 669:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			loop93:
			do {
				int alt93=4;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==ObjectOperator) ) {
					int LA93_2 = input.LA(2);
					if ( (LA93_2==Identifier) ) {
						int LA93_4 = input.LA(3);
						if ( (LA93_4==EOF||(LA93_4 >= Arrow && LA93_4 <= Assign)||(LA93_4 >= BitwiseAnd && LA93_4 <= BitwiseAndEqual)||(LA93_4 >= BitwiseOr && LA93_4 <= BitwiseXorEqual)||(LA93_4 >= Colon && LA93_4 <= Comma)||(LA93_4 >= Divide && LA93_4 <= DivideEqual)||(LA93_4 >= Dot && LA93_4 <= DotEqual)||LA93_4==Equal||(LA93_4 >= GreaterEqualThan && LA93_4 <= GreaterThan)||LA93_4==Identical||LA93_4==Instanceof||(LA93_4 >= LeftSquareBrace && LA93_4 <= LogicAndWeak)||(LA93_4 >= LogicOr && LA93_4 <= LogicXorWeak)||(LA93_4 >= Minus && LA93_4 <= MinusEqual)||(LA93_4 >= Modulo && LA93_4 <= MultiplyEqual)||(LA93_4 >= NotEqual && LA93_4 <= NotIdentical)||LA93_4==ObjectOperator||(LA93_4 >= Plus && LA93_4 <= PlusEqual)||LA93_4==QuestionMark||(LA93_4 >= RightParanthesis && LA93_4 <= RightSquareBrace)||(LA93_4 >= Semicolon && LA93_4 <= ShiftRightEqual)) ) {
							alt93=1;
						}
						else if ( (LA93_4==LeftParanthesis) ) {
							alt93=3;
						}

					}

				}
				else if ( (LA93_0==LeftSquareBrace) ) {
					alt93=2;
				}

				switch (alt93) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3607); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier303=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier303);

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
					// 670:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3631); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3633);
					expression304=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression304.getTree());
					char_literal305=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal305);

					// AST REWRITE
					// elements: expression, postFixVariableInclCallAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 671:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCallAtTheEnd3653);
					call306=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call306.getTree());
					// AST REWRITE
					// elements: postFixVariableInclCallAtTheEnd, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 672:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call306!=null?((Token)call306.start):null), "method call")
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
					break loop93;
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
			if ( state.backtracking>0 ) { memoize(input, 86, postFixVariableInclCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableInclCallAtTheEnd"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:676:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier308=null;
		ParserRuleReturnScope staticAccessOrParent307 =null;

		CommonTree Identifier308_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:677:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:677:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3681);
			staticAccessOrParent307=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent307.getTree());
			Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3683); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier308);

			// AST REWRITE
			// elements: staticAccessOrParent, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 677:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:677:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent307!=null?((Token)staticAccessOrParent307.start):null), "static member access")
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
			if ( state.backtracking>0 ) { memoize(input, 87, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier309=null;

		CommonTree Identifier309_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:2: ( Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3706); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier309_tree = 
			(CommonTree)adaptor.create(Identifier309)
			;
			adaptor.addChild(root_0, Identifier309_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 88, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:684:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primitiveAtom310 =null;
		ParserRuleReturnScope primitiveAtom311 =null;
		ParserRuleReturnScope primitiveAtom312 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule primitiveAtom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom )
			int alt94=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt94=1;
				}
				break;
			case Minus:
				{
				alt94=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt94=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3722); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3724);
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
					// 685:30: -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:33: ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:686:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3742); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3744);
					primitiveAtom311=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom311.getTree());
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
					// 686:31: -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:686:34: ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:687:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3758);
					primitiveAtom312=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom312.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set313=null;

		CommonTree set313_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:691:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set313=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set313)
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
			if ( state.backtracking>0 ) { memoize(input, 90, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal315=null;
		Token TypeArray316=null;
		Token char_literal317=null;
		Token char_literal319=null;
		ParserRuleReturnScope arrayContent314 =null;
		ParserRuleReturnScope arrayContent318 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal315_tree=null;
		CommonTree TypeArray316_tree=null;
		CommonTree char_literal317_tree=null;
		CommonTree char_literal319_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==LeftSquareBrace) ) {
				alt97=1;
			}
			else if ( (LA97_0==TypeArray) ) {
				alt97=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4276); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:17: ( arrayContent )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==At||LA95_0==Backslash||LA95_0==BitwiseNot||LA95_0==Bool||LA95_0==Clone||LA95_0==Float||LA95_0==Identifier||LA95_0==Int||(LA95_0 >= LeftParanthesis && LA95_0 <= LeftSquareBrace)||LA95_0==LogicNot||LA95_0==Minus||LA95_0==MinusMinus||LA95_0==New||LA95_0==Null||(LA95_0 >= ParentColonColon && LA95_0 <= Plus)||LA95_0==PlusPlus||LA95_0==SelfColonColon||LA95_0==String||LA95_0==This||LA95_0==TypeArray||LA95_0==VariableId) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4278);
							arrayContent314=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent314.getTree());
							}
							break;

					}

					char_literal315=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4281); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal315);

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
					// 761:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:761:65: ( arrayContent )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:762:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray316=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4297); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray316);

					char_literal317=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4299); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal317);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:762:18: ( arrayContent )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==At||LA96_0==Backslash||LA96_0==BitwiseNot||LA96_0==Bool||LA96_0==Clone||LA96_0==Float||LA96_0==Identifier||LA96_0==Int||(LA96_0 >= LeftParanthesis && LA96_0 <= LeftSquareBrace)||LA96_0==LogicNot||LA96_0==Minus||LA96_0==MinusMinus||LA96_0==New||LA96_0==Null||(LA96_0 >= ParentColonColon && LA96_0 <= Plus)||LA96_0==PlusPlus||LA96_0==SelfColonColon||LA96_0==String||LA96_0==This||LA96_0==TypeArray||LA96_0==VariableId) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:762:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4301);
							arrayContent318=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent318.getTree());
							}
							break;

					}

					char_literal319=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4304); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal319);

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
					// 762:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:762:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:762:51: ( arrayContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 91, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class arrayContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:765:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal321=null;
		ParserRuleReturnScope arrayKeyValue320 =null;
		ParserRuleReturnScope arrayKeyValue322 =null;

		CommonTree char_literal321_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:766:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:766:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4325);
			arrayKeyValue320=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue320.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:766:18: ( ',' ! arrayKeyValue )*
			loop98:
			do {
				int alt98=2;
				int LA98_0 = input.LA(1);
				if ( (LA98_0==Comma) ) {
					alt98=1;
				}

				switch (alt98) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:766:19: ',' ! arrayKeyValue
					{
					char_literal321=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4328); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4331);
					arrayKeyValue322=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue322.getTree());

					}
					break;

				default :
					break loop98;
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
			if ( state.backtracking>0 ) { memoize(input, 92, arrayContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayContent"


	public static class arrayKeyValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:768:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal323=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression324 =null;

		CommonTree string_literal323_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
			int alt99=2;
			switch ( input.LA(1) ) {
			case LogicNot:
				{
				int LA99_1 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftParanthesis:
				{
				int LA99_2 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				int LA99_3 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case At:
				{
				int LA99_4 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Clone:
				{
				int LA99_5 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case New:
				{
				int LA99_6 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Plus:
				{
				int LA99_7 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Minus:
				{
				int LA99_8 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA99_9 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA99_10 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA99_11 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA99_12 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA99_13 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA99_14 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 14, input);
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
				int LA99_15 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
				{
				int LA99_16 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA99_17 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 17, input);
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
				int LA99_18 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
					alt99=1;
				}
				else if ( (true) ) {
					alt99=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 18, input);
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
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4345);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal323=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal323);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4351);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(value.getTree());
					// AST REWRITE
					// elements: value, key, Arrow
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
					// 769:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:44: ^( '=>' $key $value)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:770:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4368);
					expression324=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression324.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 93, arrayKeyValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayKeyValue"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal325=null;
		Token char_literal326=null;
		Token char_literal328=null;
		Token string_literal329=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression327 =null;

		CommonTree string_literal325_tree=null;
		CommonTree char_literal326_tree=null;
		CommonTree char_literal328_tree=null;
		CommonTree string_literal329_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:775:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:775:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal325=(Token)match(input,If,FOLLOW_If_in_ifCondition4381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal325);

			char_literal326=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4383); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal326);

			pushFollow(FOLLOW_expression_in_ifCondition4385);
			expression327=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression327.getTree());
			char_literal328=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4387); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal328);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4392);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==Else) ) {
				int LA100_1 = input.LA(2);
				if ( (synpred171_TSPHP()) ) {
					alt100=1;
				}
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal329=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal329);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4404);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, If, instructionElse, instructionThen
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
			// 776:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:100: ( $instructionElse)?
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
			if ( state.backtracking>0 ) { memoize(input, 94, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:780:1: switchCondition : 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal330=null;
		Token char_literal331=null;
		Token VariableId332=null;
		Token char_literal333=null;
		Token char_literal334=null;
		Token char_literal336=null;
		ParserRuleReturnScope switchContent335 =null;

		CommonTree string_literal330_tree=null;
		CommonTree char_literal331_tree=null;
		CommonTree VariableId332_tree=null;
		CommonTree char_literal333_tree=null;
		CommonTree char_literal334_tree=null;
		CommonTree char_literal336_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:2: ( 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:4: 'switch' '(' VariableId ')' '{' ( switchContent )? '}'
			{
			string_literal330=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4435); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal330);

			char_literal331=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal331);

			VariableId332=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId332);

			char_literal333=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4441); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal333);

			char_literal334=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4443); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal334);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: ( switchContent )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==Case||LA101_0==Default) ) {
				alt101=1;
			}
			else if ( (LA101_0==RightCurlyBrace) ) {
				int LA101_2 = input.LA(2);
				if ( (synpred172_TSPHP()) ) {
					alt101=1;
				}
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition4445);
					switchContent335=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchContent.add(switchContent335.getTree());
					}
					break;

			}

			char_literal336=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4448); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal336);

			// AST REWRITE
			// elements: Switch, VariableId, switchContent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 781:56: -> ^( 'switch' VariableId ( switchContent )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:59: ^( 'switch' VariableId ( switchContent )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:81: ( switchContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 95, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:1: switchContent : ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCaseInstructionMandatory337 =null;
		ParserRuleReturnScope defaultCaseInstructionMandatory338 =null;
		ParserRuleReturnScope normalCaseInstructionOptional339 =null;
		ParserRuleReturnScope normalCaseInstructionMandatory340 =null;
		ParserRuleReturnScope defaultCaseInstructionOptional341 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:2: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? )
			int alt107=2;
			switch ( input.LA(1) ) {
			case Case:
				{
				int LA107_1 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				break;
			case Default:
				{
				int LA107_2 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RightCurlyBrace:
				{
				int LA107_3 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EOF:
				{
				int LA107_4 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 4, input);
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
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( normalCaseInstructionMandatory )*
					loop102:
					do {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==Case) ) {
							int LA102_1 = input.LA(2);
							if ( (synpred173_TSPHP()) ) {
								alt102=1;
							}

						}

						switch (alt102) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4472);
							normalCaseInstructionMandatory337=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory337.getTree());

							}
							break;

						default :
							break loop102;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: ( defaultCaseInstructionMandatory )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==Case) ) {
						int LA103_1 = input.LA(2);
						if ( (synpred174_TSPHP()) ) {
							alt103=1;
						}
					}
					else if ( (LA103_0==Default) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: defaultCaseInstructionMandatory
							{
							pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_switchContent4475);
							defaultCaseInstructionMandatory338=defaultCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionMandatory338.getTree());

							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:69: ( normalCaseInstructionOptional )*
					loop104:
					do {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==Case) ) {
							alt104=1;
						}

						switch (alt104) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:69: normalCaseInstructionOptional
							{
							pushFollow(FOLLOW_normalCaseInstructionOptional_in_switchContent4478);
							normalCaseInstructionOptional339=normalCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionOptional339.getTree());

							}
							break;

						default :
							break loop104;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:4: ( normalCaseInstructionMandatory )*
					loop105:
					do {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==Case) ) {
							int LA105_1 = input.LA(2);
							if ( (synpred177_TSPHP()) ) {
								alt105=1;
							}

						}

						switch (alt105) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4484);
							normalCaseInstructionMandatory340=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory340.getTree());

							}
							break;

						default :
							break loop105;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:36: ( defaultCaseInstructionOptional )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==Case||LA106_0==Default) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:36: defaultCaseInstructionOptional
							{
							pushFollow(FOLLOW_defaultCaseInstructionOptional_in_switchContent4487);
							defaultCaseInstructionOptional341=defaultCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionOptional341.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 96, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:789:1: normalCaseInstructionMandatory : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.normalCaseInstructionMandatory_return normalCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.normalCaseInstructionMandatory_return retval = new TSPHPParser.normalCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int normalCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel342 =null;
		ParserRuleReturnScope instructionInclBreakContinue343 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionMandatory4500);
					caseLabel342=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel342.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:15: ( instructionInclBreakContinue )+
			int cnt109=0;
			loop109:
			do {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==At||LA109_0==Backslash||LA109_0==BitwiseNot||(LA109_0 >= Bool && LA109_0 <= Break)||LA109_0==Clone||LA109_0==Continue||LA109_0==Do||LA109_0==Echo||LA109_0==Exit||(LA109_0 >= Float && LA109_0 <= Foreach)||(LA109_0 >= Identifier && LA109_0 <= If)||LA109_0==Int||(LA109_0 >= LeftCurlyBrace && LA109_0 <= LeftSquareBrace)||LA109_0==LogicNot||LA109_0==Minus||LA109_0==MinusMinus||LA109_0==New||LA109_0==Null||(LA109_0 >= ParentColonColon && LA109_0 <= Plus)||LA109_0==PlusPlus||LA109_0==Return||(LA109_0 >= SelfColonColon && LA109_0 <= Semicolon)||(LA109_0 >= String && LA109_0 <= TypeBool)||(LA109_0 >= TypeFloat && LA109_0 <= TypeInt)||(LA109_0 >= TypeObject && LA109_0 <= TypeString)||LA109_0==VariableId||LA109_0==While) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4503);
					instructionInclBreakContinue343=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue343.getTree());
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
			// 791:3: -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:791:7: ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:792:5: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue343!=null?((Token)instructionInclBreakContinue343.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 97, normalCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionMandatory"


	public static class normalCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:795:1: normalCaseInstructionOptional : ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.normalCaseInstructionOptional_return normalCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.normalCaseInstructionOptional_return retval = new TSPHPParser.normalCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int normalCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel344 =null;
		ParserRuleReturnScope instructionInclBreakContinue345 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:2: ( ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: ( caseLabel )+ ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: ( caseLabel )+
			int cnt110=0;
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==Case) ) {
					int LA110_2 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}

				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionOptional4541);
					caseLabel344=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel344.getTree());
					}
					break;

				default :
					if ( cnt110 >= 1 ) break loop110;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(110, input);
						throw eee;
				}
				cnt110++;
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:15: ( instructionInclBreakContinue )*
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==At||LA111_0==Backslash||LA111_0==BitwiseNot||(LA111_0 >= Bool && LA111_0 <= Break)||LA111_0==Clone||LA111_0==Continue||LA111_0==Do||LA111_0==Echo||LA111_0==Exit||(LA111_0 >= Float && LA111_0 <= Foreach)||(LA111_0 >= Identifier && LA111_0 <= If)||LA111_0==Int||(LA111_0 >= LeftCurlyBrace && LA111_0 <= LeftSquareBrace)||LA111_0==LogicNot||LA111_0==Minus||LA111_0==MinusMinus||LA111_0==New||LA111_0==Null||(LA111_0 >= ParentColonColon && LA111_0 <= Plus)||LA111_0==PlusPlus||LA111_0==Return||(LA111_0 >= SelfColonColon && LA111_0 <= Semicolon)||(LA111_0 >= String && LA111_0 <= TypeBool)||(LA111_0 >= TypeFloat && LA111_0 <= TypeInt)||(LA111_0 >= TypeObject && LA111_0 <= TypeString)||LA111_0==VariableId||LA111_0==While) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4544);
					instructionInclBreakContinue345=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue345.getTree());
					}
					break;

				default :
					break loop111;
				}
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
			// 797:3: -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:797:7: ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:798:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue345!=null?((Token)instructionInclBreakContinue345.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:798:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 98, normalCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionOptional"


	public static class defaultCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:1: defaultCaseInstructionMandatory : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.defaultCaseInstructionMandatory_return defaultCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionMandatory_return retval = new TSPHPParser.defaultCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel346 =null;
		ParserRuleReturnScope defaultLabel347 =null;
		ParserRuleReturnScope caseLabel348 =null;
		ParserRuleReturnScope instructionInclBreakContinue349 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: ( caseLabel )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Case) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4584);
					caseLabel346=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel346.getTree());
					}
					break;

				default :
					break loop112;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4587);
			defaultLabel347=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel347.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:28: ( caseLabel )*
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==Case) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4589);
					caseLabel348=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel348.getTree());
					}
					break;

				default :
					break loop113;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:39: ( instructionInclBreakContinue )+
			int cnt114=0;
			loop114:
			do {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==At||LA114_0==Backslash||LA114_0==BitwiseNot||(LA114_0 >= Bool && LA114_0 <= Break)||LA114_0==Clone||LA114_0==Continue||LA114_0==Do||LA114_0==Echo||LA114_0==Exit||(LA114_0 >= Float && LA114_0 <= Foreach)||(LA114_0 >= Identifier && LA114_0 <= If)||LA114_0==Int||(LA114_0 >= LeftCurlyBrace && LA114_0 <= LeftSquareBrace)||LA114_0==LogicNot||LA114_0==Minus||LA114_0==MinusMinus||LA114_0==New||LA114_0==Null||(LA114_0 >= ParentColonColon && LA114_0 <= Plus)||LA114_0==PlusPlus||LA114_0==Return||(LA114_0 >= SelfColonColon && LA114_0 <= Semicolon)||(LA114_0 >= String && LA114_0 <= TypeBool)||(LA114_0 >= TypeFloat && LA114_0 <= TypeInt)||(LA114_0 >= TypeObject && LA114_0 <= TypeString)||LA114_0==VariableId||LA114_0==While) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4592);
					instructionInclBreakContinue349=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue349.getTree());
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
			// 803:3: -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:803:7: ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:803:77: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:804:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue349!=null?((Token)instructionInclBreakContinue349.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 99, defaultCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionMandatory"


	public static class defaultCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:1: defaultCaseInstructionOptional : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.defaultCaseInstructionOptional_return defaultCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionOptional_return retval = new TSPHPParser.defaultCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel350 =null;
		ParserRuleReturnScope defaultLabel351 =null;
		ParserRuleReturnScope caseLabel352 =null;
		ParserRuleReturnScope instructionInclBreakContinue353 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:4: ( caseLabel )*
			loop115:
			do {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==Case) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4630);
					caseLabel350=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel350.getTree());
					}
					break;

				default :
					break loop115;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4633);
			defaultLabel351=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel351.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:28: ( caseLabel )*
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==Case) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4635);
					caseLabel352=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel352.getTree());
					}
					break;

				default :
					break loop116;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:39: ( instructionInclBreakContinue )*
			loop117:
			do {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==At||LA117_0==Backslash||LA117_0==BitwiseNot||(LA117_0 >= Bool && LA117_0 <= Break)||LA117_0==Clone||LA117_0==Continue||LA117_0==Do||LA117_0==Echo||LA117_0==Exit||(LA117_0 >= Float && LA117_0 <= Foreach)||(LA117_0 >= Identifier && LA117_0 <= If)||LA117_0==Int||(LA117_0 >= LeftCurlyBrace && LA117_0 <= LeftSquareBrace)||LA117_0==LogicNot||LA117_0==Minus||LA117_0==MinusMinus||LA117_0==New||LA117_0==Null||(LA117_0 >= ParentColonColon && LA117_0 <= Plus)||LA117_0==PlusPlus||LA117_0==Return||(LA117_0 >= SelfColonColon && LA117_0 <= Semicolon)||(LA117_0 >= String && LA117_0 <= TypeBool)||(LA117_0 >= TypeFloat && LA117_0 <= TypeInt)||(LA117_0 >= TypeObject && LA117_0 <= TypeString)||LA117_0==VariableId||LA117_0==While) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4638);
					instructionInclBreakContinue353=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue353.getTree());
					}
					break;

				default :
					break loop117;
				}
			} while (true);

			// AST REWRITE
			// elements: caseLabel, instructionInclBreakContinue, defaultLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 808:3: -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:808:7: ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:808:76: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue353!=null?((Token)instructionInclBreakContinue353.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 100, defaultCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionOptional"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal354=null;
		Token char_literal356=null;
		ParserRuleReturnScope expression355 =null;

		CommonTree string_literal354_tree=null;
		CommonTree char_literal356_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:813:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:813:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal354=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4679); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4682);
			expression355=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression355.getTree());

			char_literal356=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4684); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal357=null;
		Token char_literal358=null;

		CommonTree string_literal357_tree=null;
		CommonTree char_literal358_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:817:2: ( 'default' ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:817:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal357=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4696); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal357_tree = 
			(CommonTree)adaptor.create(string_literal357)
			;
			adaptor.addChild(root_0, string_literal357_tree);
			}

			char_literal358=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4698); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:820:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal359=null;
		ParserRuleReturnScope forInit360 =null;
		ParserRuleReturnScope forCondition361 =null;
		ParserRuleReturnScope forUpdate362 =null;
		ParserRuleReturnScope instructionInclBreakContinue363 =null;

		CommonTree string_literal359_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal359=(Token)match(input,For,FOLLOW_For_in_forLoop4712); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal359_tree = 
			(CommonTree)adaptor.create(string_literal359)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal359_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop4715);
			forInit360=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit360.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop4717);
			forCondition361=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition361.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop4719);
			forUpdate362=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate362.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4721);
			instructionInclBreakContinue363=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue363.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId364 =null;
		ParserRuleReturnScope expressionList365 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit4736); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt119=2;
			alt119 = dfa119.predict(input);
			switch (alt119) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit4743);
					variableDeclarationListInclVariableId364=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId364.getTree());
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
					// 826:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:5: ( expressionList )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:5: ( expressionList )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==At||LA118_0==Backslash||LA118_0==BitwiseNot||LA118_0==Bool||LA118_0==Clone||LA118_0==Float||LA118_0==Identifier||LA118_0==Int||(LA118_0 >= LeftParanthesis && LA118_0 <= LeftSquareBrace)||LA118_0==LogicNot||LA118_0==Minus||LA118_0==MinusMinus||LA118_0==New||LA118_0==Null||(LA118_0 >= ParentColonColon && LA118_0 <= Plus)||LA118_0==PlusPlus||LA118_0==SelfColonColon||LA118_0==String||LA118_0==This||LA118_0==TypeArray||LA118_0==VariableId) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit4758);
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
					// 827:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:827:63: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 104, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList366 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition4788); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:18: ( expressionList )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==At||LA120_0==Backslash||LA120_0==BitwiseNot||LA120_0==Bool||LA120_0==Clone||LA120_0==Float||LA120_0==Identifier||LA120_0==Int||(LA120_0 >= LeftParanthesis && LA120_0 <= LeftSquareBrace)||LA120_0==LogicNot||LA120_0==Minus||LA120_0==MinusMinus||LA120_0==New||LA120_0==Null||(LA120_0 >= ParentColonColon && LA120_0 <= Plus)||LA120_0==PlusPlus||LA120_0==SelfColonColon||LA120_0==String||LA120_0==This||LA120_0==TypeArray||LA120_0==VariableId) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition4790);
					expressionList366=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList366.getTree());
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
			// 832:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:81: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 105, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal368=null;
		ParserRuleReturnScope expressionList367 =null;

		CommonTree update_tree=null;
		CommonTree char_literal368_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate4816); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:15: ( expressionList )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==At||LA121_0==Backslash||LA121_0==BitwiseNot||LA121_0==Bool||LA121_0==Clone||LA121_0==Float||LA121_0==Identifier||LA121_0==Int||(LA121_0 >= LeftParanthesis && LA121_0 <= LeftSquareBrace)||LA121_0==LogicNot||LA121_0==Minus||LA121_0==MinusMinus||LA121_0==New||LA121_0==Null||(LA121_0 >= ParentColonColon && LA121_0 <= Plus)||LA121_0==PlusPlus||LA121_0==SelfColonColon||LA121_0==String||LA121_0==This||LA121_0==TypeArray||LA121_0==VariableId) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate4818);
					expressionList367=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList367.getTree());
					}
					break;

			}

			char_literal368=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate4821); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal368);

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
			// 836:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:79: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 106, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal369=null;
		Token char_literal370=null;
		Token string_literal372=null;
		Token string_literal373=null;
		Token char_literal374=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression371 =null;
		ParserRuleReturnScope instructionInclBreakContinue375 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal369_tree=null;
		CommonTree char_literal370_tree=null;
		CommonTree string_literal372_tree=null;
		CommonTree string_literal373_tree=null;
		CommonTree char_literal374_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal369=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4842); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal369);

			char_literal370=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4844); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal370);

			pushFollow(FOLLOW_expression_in_foreachLoop4846);
			expression371=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression371.getTree());
			string_literal372=(Token)match(input,As,FOLLOW_As_in_foreachLoop4848); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal372);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==TypeBool||(LA122_0 >= TypeFloat && LA122_0 <= TypeInt)||LA122_0==TypeString) ) {
				int LA122_1 = input.LA(2);
				if ( (LA122_1==VariableId) ) {
					int LA122_3 = input.LA(3);
					if ( (LA122_3==Arrow) ) {
						alt122=1;
					}
				}
			}
			switch (alt122) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4853);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal373=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4859); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal373);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4865);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4869); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal374=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4871); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal374);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4873);
			instructionInclBreakContinue375=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue375.getTree());
			// AST REWRITE
			// elements: expression, instructionInclBreakContinue, keyType, valueType, valueVarId, keyVarId, Foreach
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
			// 841:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:841:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:841:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:841:40: ( $keyVarId)?
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
			if ( state.backtracking>0 ) { memoize(input, 107, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:844:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal376=null;
		Token char_literal377=null;
		Token char_literal379=null;
		ParserRuleReturnScope expression378 =null;
		ParserRuleReturnScope instructionInclBreakContinue380 =null;

		CommonTree string_literal376_tree=null;
		CommonTree char_literal377_tree=null;
		CommonTree char_literal379_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:845:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:845:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal376=(Token)match(input,While,FOLLOW_While_in_whileLoop4911); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal376);

			char_literal377=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4913); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal377);

			pushFollow(FOLLOW_expression_in_whileLoop4915);
			expression378=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression378.getTree());
			char_literal379=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4917); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal379);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4919);
			instructionInclBreakContinue380=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue380.getTree());
			// AST REWRITE
			// elements: While, expression, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 845:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:845:63: ^( 'while' expression instructionInclBreakContinue )
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
			if ( state.backtracking>0 ) { memoize(input, 108, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal381=null;
		Token string_literal383=null;
		Token char_literal384=null;
		Token char_literal386=null;
		Token char_literal387=null;
		ParserRuleReturnScope instructionInclBreakContinue382 =null;
		ParserRuleReturnScope expression385 =null;

		CommonTree string_literal381_tree=null;
		CommonTree string_literal383_tree=null;
		CommonTree char_literal384_tree=null;
		CommonTree char_literal386_tree=null;
		CommonTree char_literal387_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal381=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4941); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal381);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4943);
			instructionInclBreakContinue382=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue382.getTree());
			string_literal383=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal383);

			char_literal384=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4947); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal384);

			pushFollow(FOLLOW_expression_in_doWhileLoop4949);
			expression385=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression385.getTree());
			char_literal386=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4951); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal386);

			char_literal387=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4953); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal387);

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
			// 849:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:72: ^( 'do' instructionInclBreakContinue expression )
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
			if ( state.backtracking>0 ) { memoize(input, 109, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal388=null;
		Token char_literal390=null;
		ParserRuleReturnScope instructionInclBreakContinue389 =null;
		ParserRuleReturnScope catchBlock391 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal388_tree=null;
		CommonTree char_literal390_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+
			{
			string_literal388=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4974); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal388);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:23: ( instructionInclBreakContinue )*
			loop123:
			do {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==At||LA123_0==Backslash||LA123_0==BitwiseNot||(LA123_0 >= Bool && LA123_0 <= Break)||LA123_0==Clone||LA123_0==Continue||LA123_0==Do||LA123_0==Echo||LA123_0==Exit||(LA123_0 >= Float && LA123_0 <= Foreach)||(LA123_0 >= Identifier && LA123_0 <= If)||LA123_0==Int||(LA123_0 >= LeftCurlyBrace && LA123_0 <= LeftSquareBrace)||LA123_0==LogicNot||LA123_0==Minus||LA123_0==MinusMinus||LA123_0==New||LA123_0==Null||(LA123_0 >= ParentColonColon && LA123_0 <= Plus)||LA123_0==PlusPlus||LA123_0==Return||(LA123_0 >= SelfColonColon && LA123_0 <= Semicolon)||(LA123_0 >= String && LA123_0 <= TypeBool)||(LA123_0 >= TypeFloat && LA123_0 <= TypeInt)||(LA123_0 >= TypeObject && LA123_0 <= TypeString)||LA123_0==VariableId||LA123_0==While) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4980);
					instructionInclBreakContinue389=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue389.getTree());
					}
					break;

				default :
					break loop123;
				}
			} while (true);

			char_literal390=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4983); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal390);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:57: ( catchBlock )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4985);
					catchBlock391=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock391.getTree());
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
			// elements: instructionInclBreakContinue, Try, catchBlock
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 854:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:854:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:854:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:854:41: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 110, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal392=null;
		Token VariableId394=null;
		Token char_literal395=null;
		Token char_literal397=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject393 =null;
		ParserRuleReturnScope instructionInclBreakContinue396 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal392_tree=null;
		CommonTree VariableId394_tree=null;
		CommonTree char_literal395_tree=null;
		CommonTree char_literal397_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Catch=new RewriteRuleTokenStream(adaptor,"token Catch");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal392=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock5017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal392);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock5021); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5023);
			classInterfaceTypeWithoutObject393=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject393.getTree());
			VariableId394=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock5025); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId394);

			char_literal395=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock5027); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal395);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:83: ( instructionInclBreakContinue )*
			loop125:
			do {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==At||LA125_0==Backslash||LA125_0==BitwiseNot||(LA125_0 >= Bool && LA125_0 <= Break)||LA125_0==Clone||LA125_0==Continue||LA125_0==Do||LA125_0==Echo||LA125_0==Exit||(LA125_0 >= Float && LA125_0 <= Foreach)||(LA125_0 >= Identifier && LA125_0 <= If)||LA125_0==Int||(LA125_0 >= LeftCurlyBrace && LA125_0 <= LeftSquareBrace)||LA125_0==LogicNot||LA125_0==Minus||LA125_0==MinusMinus||LA125_0==New||LA125_0==Null||(LA125_0 >= ParentColonColon && LA125_0 <= Plus)||LA125_0==PlusPlus||LA125_0==Return||(LA125_0 >= SelfColonColon && LA125_0 <= Semicolon)||(LA125_0 >= String && LA125_0 <= TypeBool)||(LA125_0 >= TypeFloat && LA125_0 <= TypeInt)||(LA125_0 >= TypeObject && LA125_0 <= TypeString)||LA125_0==VariableId||LA125_0==While) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5033);
					instructionInclBreakContinue396=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue396.getTree());
					}
					break;

				default :
					break loop125;
				}
			} while (true);

			char_literal397=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5036); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal397);

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
			// 859:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:859:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variable declarations")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:860:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject393!=null?((Token)classInterfaceTypeWithoutObject393.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:862:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:862:32: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 111, catchBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchBlock"


	public static class throwException_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:865:1: throwException : 'throw' ^ newObject ';' !;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal398=null;
		Token char_literal400=null;
		ParserRuleReturnScope newObject399 =null;

		CommonTree string_literal398_tree=null;
		CommonTree char_literal400_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:2: ( 'throw' ^ newObject ';' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:4: 'throw' ^ newObject ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal398=(Token)match(input,Throw,FOLLOW_Throw_in_throwException5082); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal398_tree = 
			(CommonTree)adaptor.create(string_literal398)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal398_tree, root_0);
			}

			pushFollow(FOLLOW_newObject_in_throwException5085);
			newObject399=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject399.getTree());

			char_literal400=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException5087); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, throwException_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred56_TSPHP
	public final void synpred56_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:4: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
		{
		pushFollow(FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1935);
		paramDeclarationOptional();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:29: ( ',' paramDeclarationOptional )*
		loop132:
		do {
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==Comma) ) {
				alt132=1;
			}

			switch (alt132) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:390:30: ',' paramDeclarationOptional
				{
				match(input,Comma,FOLLOW_Comma_in_synpred56_TSPHP1938); if (state.failed) return ;

				pushFollow(FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1941);
				paramDeclarationOptional();
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
	// $ANTLR end synpred56_TSPHP

	// $ANTLR start synpred57_TSPHP
	public final void synpred57_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:30: ( ',' paramDeclarationInclNull )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:30: ',' paramDeclarationInclNull
		{
		match(input,Comma,FOLLOW_Comma_in_synpred57_TSPHP1951); if (state.failed) return ;

		pushFollow(FOLLOW_paramDeclarationInclNull_in_synpred57_TSPHP1954);
		paramDeclarationInclNull();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred57_TSPHP

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: ( variableAssignment ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred68_TSPHP2172);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP2174); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred69_TSPHP
	public final void synpred69_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: ( variableDeclaration ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred69_TSPHP2180);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP2182); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred78_TSPHP
	public final void synpred78_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: ( expression ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred78_TSPHP2228);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred78_TSPHP2230); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred78_TSPHP

	// $ANTLR start synpred98_TSPHP
	public final void synpred98_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred98_TSPHP2530); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred98_TSPHP2533);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred98_TSPHP

	// $ANTLR start synpred99_TSPHP
	public final void synpred99_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred99_TSPHP2551); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred99_TSPHP2554);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred99_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:16: ( 'and' assignment )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred100_TSPHP2572); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred100_TSPHP2575);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:13: ( assignmentOperator ternary )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred101_TSPHP2591);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred101_TSPHP2594);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred128_TSPHP
	public final void synpred128_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred128_TSPHP2942); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred128_TSPHP2944);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred128_TSPHP2946); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred128_TSPHP2948);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred128_TSPHP

	// $ANTLR start synpred141_TSPHP
	public final void synpred141_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: ( postFixCall )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: postFixCall
		{
		pushFollow(FOLLOW_postFixCall_in_synpred141_TSPHP3215);
		postFixCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred141_TSPHP

	// $ANTLR start synpred148_TSPHP
	public final void synpred148_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: ( incrementDecrement )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred148_TSPHP3441);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred148_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: ( postFixVariableInclCallAtTheEnd )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: postFixVariableInclCallAtTheEnd
		{
		pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred149_TSPHP3446);
		postFixVariableInclCallAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred149_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:4: ( classConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred150_TSPHP3451);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: ( globalConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred151_TSPHP3456);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred170_TSPHP
	public final void synpred170_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:769:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred170_TSPHP4345);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred170_TSPHP4347); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred170_TSPHP4351);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred170_TSPHP

	// $ANTLR start synpred171_TSPHP
	public final void synpred171_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:776:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred171_TSPHP4399); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred171_TSPHP4404);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred171_TSPHP

	// $ANTLR start synpred172_TSPHP
	public final void synpred172_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: ( switchContent )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:781:36: switchContent
		{
		pushFollow(FOLLOW_switchContent_in_synpred172_TSPHP4445);
		switchContent();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred172_TSPHP

	// $ANTLR start synpred173_TSPHP
	public final void synpred173_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred173_TSPHP4472);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred173_TSPHP

	// $ANTLR start synpred174_TSPHP
	public final void synpred174_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: ( defaultCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: defaultCaseInstructionMandatory
		{
		pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred174_TSPHP4475);
		defaultCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred174_TSPHP

	// $ANTLR start synpred176_TSPHP
	public final void synpred176_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
		{
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: ( normalCaseInstructionMandatory )*
		loop140:
		do {
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==Case) ) {
				int LA140_1 = input.LA(2);
				if ( (synpred173_TSPHP()) ) {
					alt140=1;
				}

			}

			switch (alt140) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:4: normalCaseInstructionMandatory
				{
				pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4472);
				normalCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop140;
			}
		} while (true);

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: ( defaultCaseInstructionMandatory )?
		int alt141=2;
		int LA141_0 = input.LA(1);
		if ( (LA141_0==Case) ) {
			int LA141_1 = input.LA(2);
			if ( (synpred174_TSPHP()) ) {
				alt141=1;
			}
		}
		else if ( (LA141_0==Default) ) {
			alt141=1;
		}
		switch (alt141) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:36: defaultCaseInstructionMandatory
				{
				pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred176_TSPHP4475);
				defaultCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:69: ( normalCaseInstructionOptional )*
		loop142:
		do {
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==Case) ) {
				alt142=1;
			}

			switch (alt142) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:785:69: normalCaseInstructionOptional
				{
				pushFollow(FOLLOW_normalCaseInstructionOptional_in_synpred176_TSPHP4478);
				normalCaseInstructionOptional();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop142;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred176_TSPHP

	// $ANTLR start synpred177_TSPHP
	public final void synpred177_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:786:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred177_TSPHP4484);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred177_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: ( caseLabel )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: caseLabel
		{
		pushFollow(FOLLOW_caseLabel_in_synpred181_TSPHP4541);
		caseLabel();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

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
	public final boolean synpred128_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred128_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred174_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred174_TSPHP_fragment(); // can never throw exception
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


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA47 dfa47 = new DFA47(this);
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA82 dfa82 = new DFA82(this);
	protected DFA86 dfa86 = new DFA86(this);
	protected DFA88 dfa88 = new DFA88(this);
	protected DFA119 dfa119 = new DFA119(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\5\1\77\1\uffff\1\14\1\uffff\1\77\1\uffff\1\14";
	static final String DFA3_maxS =
		"\1\u0095\1\105\1\uffff\1\171\1\uffff\1\77\1\uffff\1\171";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\1\2\10\uffff\2\2\3\uffff"+
			"\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff\1\2\3\uffff\5\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\4\uffff\1\1\1\2\3\uffff\1\2"+
			"\7\uffff\2\2\1\uffff\1\2\5\uffff\1\2\7\uffff\2\2\5\uffff\7\2\2\uffff"+
			"\2\2\1\uffff\3\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\70\uffff\1\4\63\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\70\uffff\1\4\63\uffff\1\6"
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
			return "205:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA47_eotS =
		"\17\uffff";
	static final String DFA47_eofS =
		"\10\uffff\1\13\6\uffff";
	static final String DFA47_minS =
		"\2\14\4\u0093\1\77\1\14\1\10\1\77\1\24\1\uffff\1\14\1\0\1\uffff";
	static final String DFA47_maxS =
		"\2\u008d\4\u0093\1\77\1\u0093\1\162\1\77\1\177\1\uffff\1\u0093\1\0\1\uffff";
	static final String DFA47_acceptS =
		"\13\uffff\1\2\2\uffff\1\1";
	static final String DFA47_specialS =
		"\15\uffff\1\0\1\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\6\16\uffff\1\1\43\uffff\1\7\104\uffff\1\3\1\2\2\uffff\2\2\1\uffff"+
			"\1\5\1\4\1\2",
			"\1\6\62\uffff\1\7\104\uffff\1\3\1\2\2\uffff\2\2\1\uffff\1\5\1\4\1\2",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\7",
			"\1\11\u0086\uffff\1\10",
			"\1\12\27\uffff\1\13\121\uffff\1\13",
			"\1\14",
			"\1\16\42\uffff\1\16\7\uffff\1\16\3\uffff\1\16\17\uffff\1\16\13\uffff"+
			"\1\15\10\uffff\1\16\26\uffff\1\16",
			"",
			"\1\11\u0086\uffff\1\10",
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
			return "389:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA47_13 = input.LA(1);
						 
						int index47_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_TSPHP()) ) {s = 14;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index47_13);
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
		"\20\uffff";
	static final String DFA45_eofS =
		"\1\2\11\uffff\1\15\5\uffff";
	static final String DFA45_minS =
		"\1\40\1\14\1\uffff\1\14\4\u0093\1\77\1\14\1\10\1\77\1\24\1\uffff\1\14"+
		"\1\0";
	static final String DFA45_maxS =
		"\1\162\1\u008d\1\uffff\1\u008d\4\u0093\1\77\1\u0093\1\162\1\77\1\177\1"+
		"\uffff\1\u0093\1\0";
	static final String DFA45_acceptS =
		"\2\uffff\1\2\12\uffff\1\1\2\uffff";
	static final String DFA45_specialS =
		"\17\uffff\1\0}>";
	static final String[] DFA45_transitionS = {
			"\1\1\121\uffff\1\2",
			"\1\10\16\uffff\1\3\43\uffff\1\11\104\uffff\1\5\1\4\2\uffff\2\4\1\uffff"+
			"\1\7\1\6\1\4",
			"",
			"\1\10\62\uffff\1\11\104\uffff\1\5\1\4\2\uffff\2\4\1\uffff\1\7\1\6\1"+
			"\4",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\11",
			"\1\13\u0086\uffff\1\12",
			"\1\14\27\uffff\1\15\121\uffff\1\15",
			"\1\16",
			"\1\2\42\uffff\1\2\7\uffff\1\2\3\uffff\1\2\17\uffff\1\2\13\uffff\1\17"+
			"\10\uffff\1\2\26\uffff\1\2",
			"",
			"\1\13\u0086\uffff\1\12",
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
			return "()* loopback of 391:29: ( ',' ! paramDeclarationInclNull )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA45_15 = input.LA(1);
						 
						int index45_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_TSPHP()) ) {s = 13;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index45_15);
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

	static final String DFA82_eotS =
		"\10\uffff";
	static final String DFA82_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA82_minS =
		"\1\133\1\14\1\77\1\6\1\77\2\uffff\1\6";
	static final String DFA82_maxS =
		"\1\133\2\77\1\175\1\77\2\uffff\1\175";
	static final String DFA82_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA82_specialS =
		"\10\uffff}>";
	static final String[] DFA82_transitionS = {
			"\1\1",
			"\1\2\62\uffff\1\3",
			"\1\3",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\13\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\13\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6"
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
			return "600:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA86_eotS =
		"\7\uffff";
	static final String DFA86_eofS =
		"\7\uffff";
	static final String DFA86_minS =
		"\1\14\1\77\1\14\1\uffff\1\77\1\uffff\1\14";
	static final String DFA86_maxS =
		"\1\u0093\1\77\1\106\1\uffff\1\77\1\uffff\1\106";
	static final String DFA86_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA86_specialS =
		"\7\uffff}>";
	static final String[] DFA86_transitionS = {
			"\1\1\62\uffff\1\2\47\uffff\1\3\20\uffff\1\3\10\uffff\1\3\21\uffff\1\3",
			"\1\2",
			"\1\4\37\uffff\1\3\31\uffff\1\5",
			"",
			"\1\6",
			"",
			"\1\4\37\uffff\1\3\31\uffff\1\5"
	};

	static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
	static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
	static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
	static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
	static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
	static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
	static final short[][] DFA86_transition;

	static {
		int numStates = DFA86_transitionS.length;
		DFA86_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
		}
	}

	class DFA86 extends DFA {

		public DFA86(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 86;
			this.eot = DFA86_eot;
			this.eof = DFA86_eof;
			this.min = DFA86_min;
			this.max = DFA86_max;
			this.accept = DFA86_accept;
			this.special = DFA86_special;
			this.transition = DFA86_transition;
		}
		@Override
		public String getDescription() {
			return "621:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA88_eotS =
		"\12\uffff";
	static final String DFA88_eofS =
		"\12\uffff";
	static final String DFA88_minS =
		"\1\14\3\77\1\14\2\uffff\2\77\1\14";
	static final String DFA88_maxS =
		"\3\u0093\1\77\1\54\2\uffff\1\77\1\u0093\1\54";
	static final String DFA88_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA88_specialS =
		"\12\uffff}>";
	static final String[] DFA88_transitionS = {
			"\1\3\62\uffff\1\4\47\uffff\1\2\20\uffff\1\1\10\uffff\1\5\21\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\4",
			"\1\7\37\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\123\uffff\1\5",
			"\1\7\37\uffff\1\10"
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
			return "643:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA119_eotS =
		"\11\uffff";
	static final String DFA119_eofS =
		"\11\uffff";
	static final String DFA119_minS =
		"\1\11\1\uffff\1\106\1\77\1\10\1\uffff\1\14\1\77\1\14";
	static final String DFA119_maxS =
		"\1\u0093\1\uffff\1\u0093\1\77\1\u0093\1\uffff\1\u0093\1\77\1\u0093";
	static final String DFA119_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA119_specialS =
		"\11\uffff}>";
	static final String[] DFA119_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\11\uffff\1\5\30\uffff\1\5\7"+
			"\uffff\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\2\1\1\2\uffff\2\1\1\uffff\3\1\5\uffff\1\5",
			"",
			"\1\5\114\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\14\uffff\1\5\5\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\3\uffff\2\5\1\uffff\4\5\2\uffff\3\5\11\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\25\uffff\1\1",
			"",
			"\1\7\37\uffff\1\5\31\uffff\1\5\114\uffff\1\1",
			"\1\10",
			"\1\7\37\uffff\1\5\31\uffff\1\5\114\uffff\1\1"
	};

	static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
	static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
	static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
	static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
	static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
	static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
	static final short[][] DFA119_transition;

	static {
		int numStates = DFA119_transitionS.length;
		DFA119_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
		}
	}

	class DFA119 extends DFA {

		public DFA119(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 119;
			this.eot = DFA119_eot;
			this.eof = DFA119_eof;
			this.min = DFA119_min;
			this.max = DFA119_max;
			this.accept = DFA119_accept;
			this.special = DFA119_special;
			this.transition = DFA119_transition;
		}
		@Override
		public String getDescription() {
			return "826:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_EOF_in_prog1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_EOF_in_prog1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1058 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1074 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1076 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1078 = new BitSet(new long[]{0x87C4810460109222L,0x83010580882810F9L,0x0000000000293B3FL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1080 = new BitSet(new long[]{0x87C4810460109222L,0x83010580882810F9L,0x0000000000293B3FL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1095 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1100 = new BitSet(new long[]{0x87C4810460109220L,0x83030580882810F9L,0x0000000000293B3FL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1102 = new BitSet(new long[]{0x87C4810460109220L,0x83030580882810F9L,0x0000000000293B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1177 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1180 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1182 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1202 = new BitSet(new long[]{0x87C4810460109222L,0x83010580882810F9L,0x0000000000293B3FL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1237 = new BitSet(new long[]{0x8000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1239 = new BitSet(new long[]{0x0000000100000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1242 = new BitSet(new long[]{0x8000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1244 = new BitSet(new long[]{0x0000000100000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1263 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1265 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1267 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1275 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1277 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1288 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1340 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1342 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000022L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000022L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1350 = new BitSet(new long[]{0x0440000400000020L,0x4002680000000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1352 = new BitSet(new long[]{0x0440000400000020L,0x4002680000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1369 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1382 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1385 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1387 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1400 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002320L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1441 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1443 = new BitSet(new long[]{0x0000000100000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1446 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1448 = new BitSet(new long[]{0x0000000100000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1478 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1480 = new BitSet(new long[]{0x8080000000100000L,0x8000010080080008L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1495 = new BitSet(new long[]{0x0000000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1498 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1500 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1541 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1548 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1550 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1569 = new BitSet(new long[]{0x0400000000000000L,0x0000600000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1571 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1585 = new BitSet(new long[]{0x0440000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1587 = new BitSet(new long[]{0x0400000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1595 = new BitSet(new long[]{0x0400000000000000L,0x4000680000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1597 = new BitSet(new long[]{0x0400000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1611 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1630 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000022L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1637 = new BitSet(new long[]{0x0400000400000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1639 = new BitSet(new long[]{0x0400000400000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1669 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1672 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1695 = new BitSet(new long[]{0x8384810040109200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1697 = new BitSet(new long[]{0x8384810040109200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1732 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000103B30L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1735 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1860 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters1909 = new BitSet(new long[]{0x8000000008001000L,0x0004000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramList_in_formalParameters1911 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1935 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1938 = new BitSet(new long[]{0x8000000008001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1941 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList1948 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1951 = new BitSet(new long[]{0x8000000008001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList1954 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1959 = new BitSet(new long[]{0x8000000008001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1962 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull1977 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationInclNull1980 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_Null_in_paramDeclarationInclNull1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cast_in_paramDeclarationWithoutNull2007 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationWithoutNull2010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationWithoutNull2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2037 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2040 = new BitSet(new long[]{0x8080000000100000L,0x8000010080080008L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2086 = new BitSet(new long[]{0x8384810040109200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2088 = new BitSet(new long[]{0x8384810040109200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2123 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2125 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2149 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000008L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2156 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2172 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2180 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction2228 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2236 = new BitSet(new long[]{0x8080000040109200L,0x83000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_instruction2239 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2248 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expressionList_in_instruction2251 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2259 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2286 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2289 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_expressionList2292 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2305 = new BitSet(new long[]{0x00000880000A4100L,0x2800020002900000L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2307 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2406 = new BitSet(new long[]{0x0000000000000000L,0x0000040000200000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2451 = new BitSet(new long[]{0x8000000000001000L,0x0100008000000000L,0x0000000000080002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2482 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2485 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2530 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2551 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2554 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2572 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_ternary_in_assignment2588 = new BitSet(new long[]{0x00000880000A4102L,0x2800020002900000L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2591 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_ternary_in_assignment2594 = new BitSet(new long[]{0x00000880000A4102L,0x2800020002900000L});
	public static final BitSet FOLLOW_logicOr_in_ternary2608 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2611 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_ternary2614 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2616 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_ternary2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2636 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2655 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2672 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2675 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2678 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2691 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2694 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2697 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2710 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2713 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2716 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality2729 = new BitSet(new long[]{0x4002000000000002L,0x0000000070000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2732 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_comparison_in_equality2735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2779 = new BitSet(new long[]{0x1800000000000002L,0x0000000000000300L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2782 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2825 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2828 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2835 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2849 = new BitSet(new long[]{0x0000040000000002L,0x0000010000080000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2852 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2861 = new BitSet(new long[]{0x0000040000000002L,0x0000010000080000L});
	public static final BitSet FOLLOW_logicNot_in_factor2875 = new BitSet(new long[]{0x0000004000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_set_in_factor2878 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicNot_in_factor2887 = new BitSet(new long[]{0x0000004000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2898 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2920 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2942 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000002330L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2944 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2946 = new BitSet(new long[]{0x8080000040109200L,0x81000580882800C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2964 = new BitSet(new long[]{0x8080000040109200L,0x81000580882800C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2972 = new BitSet(new long[]{0x8080000040109200L,0x81000580882800C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew2992 = new BitSet(new long[]{0x8080000040101000L,0x81000580882800C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_cloneOrNew_in_cloneOrNew2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew3000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember3036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3077 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3092 = new BitSet(new long[]{0x8000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3111 = new BitSet(new long[]{0x8000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3137 = new BitSet(new long[]{0x8080000040109200L,0x81040580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3139 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3167 = new BitSet(new long[]{0x8080000000101000L,0x81000480802000C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3187 = new BitSet(new long[]{0x8080000000101000L,0x81000480802000C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_primary3215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_postFixCall3235 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_methodCall_in_postFixCall3245 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCall3263 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCall3265 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCall3287 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_postFixCall3289 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCall3291 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_call_in_postFixCall3309 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3363 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_actualParameters_in_call3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3380 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3428 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_atom3430 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3478 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000080L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3524 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3526 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3549 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3551 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3553 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3592 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3607 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3609 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3631 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3633 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3635 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCallAtTheEnd3653 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000080L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3681 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3722 = new BitSet(new long[]{0x8080000000100000L,0x8000000080000008L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3742 = new BitSet(new long[]{0x8080000000100000L,0x8000000080000008L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4276 = new BitSet(new long[]{0x8080000040109200L,0x81080580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_arrayContent_in_array4278 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4299 = new BitSet(new long[]{0x8080000040109200L,0x81040580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_arrayContent_in_array4301 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4325 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4328 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4331 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4345 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4347 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4383 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_ifCondition4385 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4387 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4392 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4399 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4439 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4443 = new BitSet(new long[]{0x0000002004000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4445 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4472 = new BitSet(new long[]{0x0000002004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_switchContent4475 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_switchContent4478 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4484 = new BitSet(new long[]{0x0000002004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionOptional_in_switchContent4487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionMandatory4500 = new BitSet(new long[]{0x8384810844309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4503 = new BitSet(new long[]{0x8384810840309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionOptional4541 = new BitSet(new long[]{0x8384810844309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4544 = new BitSet(new long[]{0x8384810840309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4584 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4587 = new BitSet(new long[]{0x8384810844309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4589 = new BitSet(new long[]{0x8384810844309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4592 = new BitSet(new long[]{0x8384810840309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4630 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4633 = new BitSet(new long[]{0x8384810844309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4635 = new BitSet(new long[]{0x8384810844309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4638 = new BitSet(new long[]{0x8384810840309202L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_Case_in_caseLabel4679 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_caseLabel4682 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4696 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_forInit_in_forLoop4715 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop4717 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop4719 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit4736 = new BitSet(new long[]{0x8080000040109202L,0x81000580882810C8L,0x0000000000083B32L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit4743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition4788 = new BitSet(new long[]{0x8080000040109202L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expressionList_in_forCondition4790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate4816 = new BitSet(new long[]{0x8080000040109200L,0x81040580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4818 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate4821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4844 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4846 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop4848 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000002330L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4857 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4859 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000002330L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4869 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4871 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4913 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_whileLoop4915 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4917 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4941 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4947 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4949 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4951 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4978 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4980 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4983 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4985 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock5017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock5021 = new BitSet(new long[]{0x8000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock5025 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5031 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5033 = new BitSet(new long[]{0x8384810840309200L,0x83030580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException5082 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_newObject_in_throwException5085 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException5087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1935 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_synpred56_TSPHP1938 = new BitSet(new long[]{0x8000000008001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred56_TSPHP1941 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Comma_in_synpred57_TSPHP1951 = new BitSet(new long[]{0x8000000008001000L,0x0000000000000000L,0x0000000000003B30L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_synpred57_TSPHP1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred68_TSPHP2172 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred69_TSPHP2180 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP2182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred78_TSPHP2228 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred78_TSPHP2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred98_TSPHP2530 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred98_TSPHP2533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred99_TSPHP2551 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred99_TSPHP2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred100_TSPHP2572 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_assignment_in_synpred100_TSPHP2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred101_TSPHP2591 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_ternary_in_synpred101_TSPHP2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred128_TSPHP2942 = new BitSet(new long[]{0x8000000000001000L,0x0000000000000000L,0x0000000000002330L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred128_TSPHP2944 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred128_TSPHP2946 = new BitSet(new long[]{0x8080000040109200L,0x81000580882800C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred128_TSPHP2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_synpred141_TSPHP3215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred148_TSPHP3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred149_TSPHP3446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred150_TSPHP3451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred151_TSPHP3456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred170_TSPHP4345 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred170_TSPHP4347 = new BitSet(new long[]{0x8080000040109200L,0x81000580882810C8L,0x0000000000080012L});
	public static final BitSet FOLLOW_expression_in_synpred170_TSPHP4351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred171_TSPHP4399 = new BitSet(new long[]{0x8384810840309200L,0x83010580882810E9L,0x0000000000283B3FL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred171_TSPHP4404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchContent_in_synpred172_TSPHP4445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred173_TSPHP4472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred174_TSPHP4475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4472 = new BitSet(new long[]{0x0000002004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred176_TSPHP4475 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_synpred176_TSPHP4478 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred177_TSPHP4484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred181_TSPHP4541 = new BitSet(new long[]{0x0000000000000002L});
}
