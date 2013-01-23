// $ANTLR 3.x D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g 2013-01-23 21:16:45

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CLASS_INTERFACE_TYPE", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "NullVariations", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
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
	public static final int NullVariations=95;
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
	public static final int TypeFloat=135;
	public static final int TypeInt=136;
	public static final int TypeObject=137;
	public static final int TypeResource=138;
	public static final int TypeString=139;
	public static final int UMINUS=140;
	public static final int UPLUS=141;
	public static final int Use=142;
	public static final int VARIABLE_DECLARATION=143;
	public static final int VARIABLE_DECLARATION_LIST=144;
	public static final int VariableId=145;
	public static final int Void=146;
	public static final int While=147;
	public static final int Whitespace=148;

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
	@Override public String getGrammarFileName() { return "D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:202:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:202:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:202:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:202:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:202:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1016);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1019); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:203:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:203:4: ( namespaceBracket )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:203:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1025);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1028); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:204:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1034);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1036); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:207:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )* ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:2: ( ( 'namespace' namespaceId ';' ( statement )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' namespaceId ';' ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' namespaceId ';' ( statement )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:5: 'namespace' namespaceId ';' ( statement )*
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1050); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1052);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:33: ( statement )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==At||LA4_0==Backslash||LA4_0==BitwiseNot||LA4_0==Bool||(LA4_0 >= Class && LA4_0 <= Clone)||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||(LA4_0 >= Final && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Int && LA4_0 <= LeftSquareBrace)||LA4_0==LogicNot||LA4_0==Minus||LA4_0==MinusMinus||LA4_0==New||(LA4_0 >= Null && LA4_0 <= NullVariations)||(LA4_0 >= ParentColonColon && LA4_0 <= Plus)||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= SelfColonColon && LA4_0 <= Semicolon)||(LA4_0 >= String && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:208:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1056);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )* '}' ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:4: ( 'namespace' ( namespaceId )? '{' ( statement )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:5: 'namespace' ( namespaceId )? '{' ( statement )* '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1071); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1073);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1076); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:34: ( statement )*
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==At||LA6_0==Backslash||LA6_0==BitwiseNot||LA6_0==Bool||(LA6_0 >= Class && LA6_0 <= Clone)||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||(LA6_0 >= Final && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Int && LA6_0 <= LeftSquareBrace)||LA6_0==LogicNot||LA6_0==Minus||LA6_0==MinusMinus||LA6_0==New||(LA6_0 >= Null && LA6_0 <= NullVariations)||(LA6_0 >= ParentColonColon && LA6_0 <= Plus)||LA6_0==PlusPlus||LA6_0==Return||(LA6_0 >= SelfColonColon && LA6_0 <= Semicolon)||(LA6_0 >= String && LA6_0 <= TypeString)||LA6_0==Use||LA6_0==VariableId||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1078);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1081); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1186); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier16);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1189); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal17);

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1191); if (state.failed) return retval; 
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
			// 228:34: -> ( Identifier )+
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:232:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:233:2: ( ( statement )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:233:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:233:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==At||LA8_0==Backslash||LA8_0==BitwiseNot||LA8_0==Bool||(LA8_0 >= Class && LA8_0 <= Clone)||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||(LA8_0 >= Final && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Int && LA8_0 <= LeftSquareBrace)||LA8_0==LogicNot||LA8_0==Minus||LA8_0==MinusMinus||LA8_0==New||(LA8_0 >= Null && LA8_0 <= NullVariations)||(LA8_0 >= ParentColonColon && LA8_0 <= Plus)||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= SelfColonColon && LA8_0 <= Semicolon)||(LA8_0 >= String && LA8_0 <= TypeString)||LA8_0==Use||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:233:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1211);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:236:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:237:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:237:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1224);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1229);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:239:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1234);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:242:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:243:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:243:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1246); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1248);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:243:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:243:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1251); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1253);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1257); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1274); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1276);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:6: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1284); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1286);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:250:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:250:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1299); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1312);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:254:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1317);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:255:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1322);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:256:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1327);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1349); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1351); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1353);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1356);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1359); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:92: ( classBody )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1361);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1364); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:266:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:267:2: ( 'extends' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:267:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1378); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1380);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1391); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1396); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:274:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:275:2: ( 'implements' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:275:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1409); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1411);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:279:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:279:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1423);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:280:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1428);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:281:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1434);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1448); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1450);
			primitiveTypes57=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes57.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1452);
			constantAssignment58=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment58.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:54: ',' constantAssignment
					{
					char_literal59=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1455); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal59);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1457);
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

			char_literal61=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1461); if (state.failed) return retval; 
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
			// 286:3: -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:289:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:290:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:290:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1487); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier62_tree = 
			(CommonTree)adaptor.create(Identifier62)
			;
			adaptor.addChild(root_0, Identifier62_tree);
			}

			char_literal63=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1489); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal63_tree = 
			(CommonTree)adaptor.create(char_literal63)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1492);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:4: 'static'
					{
					string_literal65=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1504); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = 
					(CommonTree)adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1507);
			accessor66=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor66.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1509);
			variableDeclarationListInclVariableId67=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId67.getTree());

			char_literal68=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1511); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1520);
					accessorWithoutPrivate69=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate69.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:298:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal70=(Token)match(input,Private,FOLLOW_Private_in_accessor1525); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set71=null;

		CommonTree set71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:302:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1550);
			variableDeclaration72=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration72.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal73=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1553); if (state.failed) return retval;
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1557);
							variableAssignment74=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment74.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:50: VariableId
							{
							VariableId75=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1559); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal76=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1578); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal76_tree = 
					(CommonTree)adaptor.create(string_literal76)
					;
					adaptor.addChild(root_0, string_literal76_tree);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1580);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:6: 'static' ( 'final' )?
							{
							string_literal78=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1594); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal78_tree = 
							(CommonTree)adaptor.create(string_literal78)
							;
							adaptor.addChild(root_0, string_literal78_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:15: 'final'
									{
									string_literal79=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1596); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:6: 'final' ( 'static' )?
							{
							string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1604); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal80_tree = 
							(CommonTree)adaptor.create(string_literal80)
							;
							adaptor.addChild(root_0, string_literal80_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:14: 'static'
									{
									string_literal81=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1606); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:316:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:316:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:316:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1620);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1627);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal84=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1639); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal84_tree = 
			(CommonTree)adaptor.create(string_literal84)
			;
			adaptor.addChild(root_0, string_literal84_tree);
			}

			Identifier85=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1641); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier85_tree = 
			(CommonTree)adaptor.create(Identifier85)
			;
			adaptor.addChild(root_0, Identifier85_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1643);
					implementsDeclaration86=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1646); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = 
			(CommonTree)adaptor.create(char_literal87)
			;
			adaptor.addChild(root_0, char_literal87_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1648);
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

			char_literal89=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1651); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:324:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList90 =null;
		ParserRuleReturnScope interfaceMethodDeclaration91 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:325:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:325:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1662);
					constDeclarationList90=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList90.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:326:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1667);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:4: 'public'
					{
					string_literal92=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1678); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal92_tree = 
					(CommonTree)adaptor.create(string_literal92)
					;
					adaptor.addChild(root_0, string_literal92_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1681);
			functionDeclarationWithoutBody93=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody93.getTree());

			char_literal94=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1683); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1700);
			functionDeclarationWithoutBody95=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody95.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1704); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:45: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==At||LA35_0==Backslash||LA35_0==BitwiseNot||LA35_0==Bool||LA35_0==Clone||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= Float && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==Int||(LA35_0 >= LeftCurlyBrace && LA35_0 <= LeftSquareBrace)||LA35_0==LogicNot||LA35_0==Minus||LA35_0==MinusMinus||LA35_0==New||(LA35_0 >= Null && LA35_0 <= NullVariations)||(LA35_0 >= ParentColonColon && LA35_0 <= Plus)||LA35_0==PlusPlus||LA35_0==Return||(LA35_0 >= SelfColonColon && LA35_0 <= Semicolon)||(LA35_0 >= String && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1706);
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

			char_literal97=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1709); if (state.failed) return retval; 
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
			// 339:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody95!=null?((Token)functionDeclarationWithoutBody95.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:122: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:146: ( instructionWithoutBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal98=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1741); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1744);
			returnType99=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType99.getTree());

			Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1746); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier100_tree = 
			(CommonTree)adaptor.create(Identifier100)
			;
			adaptor.addChild(root_0, Identifier100_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody1748);
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


	public static class formalParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
	public final TSPHPParser.formalParameters_return formalParameters() throws RecognitionException {
		TSPHPParser.formalParameters_return retval = new TSPHPParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token params=null;
		Token char_literal103=null;
		ParserRuleReturnScope paramList102 =null;

		CommonTree params_tree=null;
		CommonTree char_literal103_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters1762); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:15: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters1764);
					paramList102=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList102.getTree());
					}
					break;

			}

			char_literal103=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters1767); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal103);

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
			// 347:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:68: ( paramList )?
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
			if ( state.backtracking>0 ) { memoize(input, 27, formalParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class returnType_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:350:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal105=null;
		ParserRuleReturnScope allTypes104 =null;

		CommonTree string_literal105_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:351:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:351:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1789);
					allTypes104=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes104.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:351:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal105=(Token)match(input,Void,FOLLOW_Void_in_returnType1793); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal105_tree = 
					(CommonTree)adaptor.create(string_literal105)
					;
					adaptor.addChild(root_0, string_literal105_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 28, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended106 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:355:2: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:355:4: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1804);
					primitiveTypesExtended106=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:355:29: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1808);
					classInterfaceTypeInclObject107=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject107.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 29, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class allTypesWithoutObjectAndResource_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypesWithoutObjectAndResource"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray108 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= TypeArray && LA39_0 <= TypeInt)||LA39_0==TypeString) ) {
				alt39=1;
			}
			else if ( (LA39_0==Backslash||LA39_0==Identifier) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1819);
					primitiveTypesInclArray108=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:360:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1825);
					classInterfaceTypeWithoutObject109=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject109.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 30, allTypesWithoutObjectAndResource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypesWithoutObjectAndResource"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:1: primitiveTypes : ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token bool=null;
		Token TypeBool110=null;
		Token TypeInt111=null;
		Token TypeFloat112=null;
		Token TypeString113=null;

		CommonTree bool_tree=null;
		CommonTree TypeBool110_tree=null;
		CommonTree TypeInt111_tree=null;
		CommonTree TypeFloat112_tree=null;
		CommonTree TypeString113_tree=null;
		RewriteRuleTokenStream stream_TypeBoolean=new RewriteRuleTokenStream(adaptor,"token TypeBoolean");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:364:2: ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:364:4: TypeBool
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeBool110=(Token)match(input,TypeBool,FOLLOW_TypeBool_in_primitiveTypes1836); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeBool110_tree = 
					(CommonTree)adaptor.create(TypeBool110)
					;
					adaptor.addChild(root_0, TypeBool110_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:365:4: bool= TypeBoolean
					{
					bool=(Token)match(input,TypeBoolean,FOLLOW_TypeBoolean_in_primitiveTypes1845); if (state.failed) return retval; 
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
					// 365:23: -> TypeBool[$bool,\"bool\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:366:4: TypeInt
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeInt111=(Token)match(input,TypeInt,FOLLOW_TypeInt_in_primitiveTypes1855); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeInt111_tree = 
					(CommonTree)adaptor.create(TypeInt111)
					;
					adaptor.addChild(root_0, TypeInt111_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:367:4: TypeFloat
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeFloat112=(Token)match(input,TypeFloat,FOLLOW_TypeFloat_in_primitiveTypes1860); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeFloat112_tree = 
					(CommonTree)adaptor.create(TypeFloat112)
					;
					adaptor.addChild(root_0, TypeFloat112_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:368:4: TypeString
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeString113=(Token)match(input,TypeString,FOLLOW_TypeString_in_primitiveTypes1865); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeString113_tree = 
					(CommonTree)adaptor.create(TypeString113)
					;
					adaptor.addChild(root_0, TypeString113_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray115=null;
		ParserRuleReturnScope primitiveTypes114 =null;

		CommonTree TypeArray115_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1877);
					primitiveTypes114=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes114.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:373:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray115=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1882); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray115_tree = 
					(CommonTree)adaptor.create(TypeArray115)
					;
					adaptor.addChild(root_0, TypeArray115_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 32, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:376:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource117=null;
		ParserRuleReturnScope primitiveTypesInclArray116 =null;

		CommonTree TypeResource117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:377:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:377:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1894);
					primitiveTypesInclArray116=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:378:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource117=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1899); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource117_tree = 
					(CommonTree)adaptor.create(TypeResource117)
					;
					adaptor.addChild(root_0, TypeResource117_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 33, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token root=null;
		ParserRuleReturnScope namespaceId118 =null;

		CommonTree root_tree=null;
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:8: (root= '\\\\' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1915);
			namespaceId118=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId118.getTree());
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
			// 382:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:31: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:118: ( $root)?
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
			if ( state.backtracking>0 ) { memoize(input, 34, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject119=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject120 =null;

		CommonTree TypeObject119_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:387:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==TypeObject) ) {
				alt44=1;
			}
			else if ( (LA44_0==Backslash||LA44_0==Identifier) ) {
				alt44=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:387:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject119=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1942); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject119_tree = 
					(CommonTree)adaptor.create(TypeObject119)
					;
					adaptor.addChild(root_0, TypeObject119_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:388:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1948);
					classInterfaceTypeWithoutObject120=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject120.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 35, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal122=null;
		Token char_literal125=null;
		Token char_literal127=null;
		ParserRuleReturnScope paramDeclarationOptional121 =null;
		ParserRuleReturnScope paramDeclarationOptional123 =null;
		ParserRuleReturnScope paramDeclaration124 =null;
		ParserRuleReturnScope paramDeclaration126 =null;
		ParserRuleReturnScope paramDeclarationOptional128 =null;

		CommonTree char_literal122_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree char_literal127_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* )
			int alt48=2;
			alt48 = dfa48.predict(input);
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1960);
					paramDeclarationOptional121=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional121.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:29: ( ',' ! paramDeclarationOptional )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:30: ',' ! paramDeclarationOptional
							{
							char_literal122=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1963); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1966);
							paramDeclarationOptional123=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional123.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:4: paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1974);
					paramDeclaration124=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration124.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:21: ( ',' ! paramDeclaration )*
					loop46:
					do {
						int alt46=2;
						alt46 = dfa46.predict(input);
						switch (alt46) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:22: ',' ! paramDeclaration
							{
							char_literal125=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1977); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1980);
							paramDeclaration126=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration126.getTree());

							}
							break;

						default :
							break loop46;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:46: ( ',' ! paramDeclarationOptional )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:47: ',' ! paramDeclarationOptional
							{
							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1985); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1988);
							paramDeclarationOptional128=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional128.getTree());

							}
							break;

						default :
							break loop47;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:396:1: paramDeclaration : allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId130=null;
		ParserRuleReturnScope allTypes129 =null;

		CommonTree VariableId130_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:2: ( allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration2002);
			allTypes129=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes129.getTree());
			VariableId130=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration2004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId130);

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
			// 397:24: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:27: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, (allTypes129!=null?((Token)allTypes129.start):null), "parameter declaration")
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:400:1: paramDeclarationOptional : allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId132=null;
		Token char_literal133=null;
		ParserRuleReturnScope allTypes131 =null;
		ParserRuleReturnScope unaryPrimitiveAtom134 =null;

		CommonTree VariableId132_tree=null;
		CommonTree char_literal133_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_unaryPrimitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule unaryPrimitiveAtom");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:401:2: ( allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:401:4: allTypes VariableId '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclarationOptional2027);
			allTypes131=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes131.getTree());
			VariableId132=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationOptional2029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId132);

			char_literal133=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2032); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal133);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2034);
			unaryPrimitiveAtom134=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom134.getTree());
			// AST REWRITE
			// elements: unaryPrimitiveAtom, VariableId, allTypes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 402:3: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:402:6: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, (allTypes131!=null?((Token)allTypes131.start):null), "parameter declaration")
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:2: (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LeftCurlyBrace) ) {
				alt50=1;
			}
			else if ( (LA50_0==At||LA50_0==Backslash||LA50_0==BitwiseNot||LA50_0==Bool||LA50_0==Clone||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= Float && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==Int||(LA50_0 >= LeftParanthesis && LA50_0 <= LeftSquareBrace)||LA50_0==LogicNot||LA50_0==Minus||LA50_0==MinusMinus||LA50_0==New||(LA50_0 >= Null && LA50_0 <= NullVariations)||(LA50_0 >= ParentColonColon && LA50_0 <= Plus)||LA50_0==PlusPlus||LA50_0==Return||(LA50_0 >= SelfColonColon && LA50_0 <= Semicolon)||(LA50_0 >= String && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:4: block= '{' ( instructionWithoutBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2080); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:16: ( instructionWithoutBreakContinue )*
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==At||LA49_0==Backslash||LA49_0==BitwiseNot||LA49_0==Bool||LA49_0==Clone||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= Float && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==Int||(LA49_0 >= LeftCurlyBrace && LA49_0 <= LeftSquareBrace)||LA49_0==LogicNot||LA49_0==Minus||LA49_0==MinusMinus||LA49_0==New||(LA49_0 >= Null && LA49_0 <= NullVariations)||(LA49_0 >= ParentColonColon && LA49_0 <= Plus)||LA49_0==PlusPlus||LA49_0==Return||(LA49_0 >= SelfColonColon && LA49_0 <= Semicolon)||(LA49_0 >= String && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2082);
							instructionWithoutBreakContinue135=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue135.getTree());
							}
							break;

						default :
							break loop49;
						}
					} while (true);

					char_literal136=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2085); if (state.failed) return retval; 
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
					// 410:53: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:56: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:81: ( instructionWithoutBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:411:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2101);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:2: (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
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
			case NullVariations:
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:4: block= '{' ( instructionInclBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2117); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:17: ( instructionInclBreakContinue )*
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==At||LA51_0==Backslash||LA51_0==BitwiseNot||(LA51_0 >= Bool && LA51_0 <= Break)||LA51_0==Clone||LA51_0==Continue||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= Float && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==Int||(LA51_0 >= LeftCurlyBrace && LA51_0 <= LeftSquareBrace)||LA51_0==LogicNot||LA51_0==Minus||LA51_0==MinusMinus||LA51_0==New||(LA51_0 >= Null && LA51_0 <= NullVariations)||(LA51_0 >= ParentColonColon && LA51_0 <= Plus)||LA51_0==PlusPlus||LA51_0==Return||(LA51_0 >= SelfColonColon && LA51_0 <= Semicolon)||(LA51_0 >= String && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2119);
							instructionInclBreakContinue138=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue138.getTree());
							}
							break;

						default :
							break loop51;
						}
					} while (true);

					char_literal139=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2123); if (state.failed) return retval; 
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
					// 415:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:79: ( instructionInclBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:416:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2138);
					instruction140=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction140.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:26: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:417:26: Int
							{
							Int142=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2150); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int142_tree = 
							(CommonTree)adaptor.create(Int142)
							;
							adaptor.addChild(root_0, Int142_tree);
							}

							}
							break;

					}

					char_literal143=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2153); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:420:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:421:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | expression ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !|semi= ';' -> BLOCK[$semi,\"block\"] )
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
			case TypeArray:
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
			case Backslash:
				{
				int LA55_10 = input.LA(2);
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
				else if ( (synpred77_TSPHP()) ) {
					alt55=11;
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:421:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2166);
					variableAssignment144=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment144.getTree());

					char_literal145=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2168); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2174);
					variableDeclaration146=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration146.getTree());

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2176); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2182);
					ifCondition148=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition148.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2187);
					switchCondition149=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition149.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:425:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2192);
					forLoop150=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop150.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:426:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2197);
					foreachLoop151=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop151.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:427:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2202);
					whileLoop152=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop152.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2207);
					doWhileLoop153=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop153.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2212);
					tryCatch154=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch154.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:430:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2217);
					throwException155=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException155.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:4: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction2222);
					expression156=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

					char_literal157=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2224); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal158=(Token)match(input,Return,FOLLOW_Return_in_instruction2230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal158_tree = 
					(CommonTree)adaptor.create(string_literal158)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal158_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:14: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||(LA54_0 >= Null && LA54_0 <= NullVariations)||(LA54_0 >= ParentColonColon && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==SelfColonColon||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2233);
							expression159=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression159.getTree());

							}
							break;

					}

					char_literal160=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2236); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal161=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2242); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal161_tree = 
					(CommonTree)adaptor.create(string_literal161)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal161_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2245);
					expressionList162=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList162.getTree());

					char_literal163=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2247); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal164=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2253); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal164_tree = 
					(CommonTree)adaptor.create(string_literal164)
					;
					adaptor.addChild(root_0, string_literal164_tree);
					}

					char_literal165=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2255); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:435:4: semi= ';'
					{
					semi=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2263); if (state.failed) return retval; 
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
					// 435:13: -> BLOCK[$semi,\"block\"]
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:1: expressionList : expression ( ',' ! expression )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:439:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:439:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2280);
			expression166=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression166.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:439:15: ( ',' ! expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:439:16: ',' ! expression
					{
					char_literal167=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2283); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2286);
					expression168=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:1: variableAssignment : VariableId assignmentOperator ^ expression ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:443:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:443:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId169=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2299); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId169_tree = 
			(CommonTree)adaptor.create(VariableId169)
			;
			adaptor.addChild(root_0, VariableId169_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2301);
			assignmentOperator170=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator170.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2304);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:446:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement172 =null;
		ParserRuleReturnScope preIncrementDecrement173 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:447:2: ( postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:447:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2316);
					postIncrementDecrement172=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement172.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:448:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2321);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:451:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set174=null;

		CommonTree set174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:452:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:1: postIncrementDecrement : postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:2: ( postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:4: postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2400);
			postFixVariableWithoutCallAtTheEnd175=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd175.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2402);
			plusPlusOrMinusMinus176=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus176.getTree());
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
			// 468:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:468:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:471:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set177=null;

		CommonTree set177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:472:2: ( '++' | '--' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:476:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:477:2: ( plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:477:4: plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2445);
			plusPlusOrMinusMinus178=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus178.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2447);
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
			// 478:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:481:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:4: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2474);
			allTypes180=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes180.getTree());
			VariableId181=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2476); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId181);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:24: ( '=' expression )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Assign) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:25: '=' expression
					{
					char_literal182=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2479); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal182);

					pushFollow(FOLLOW_expression_in_variableDeclaration2481);
					expression183=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression183.getTree());
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
			// 482:42: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:45: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes180!=null?((Token)allTypes180.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:128: ( expression )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:485:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak184 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:486:2: ( logicOrWeak )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:486:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2508);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:490:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2521);
			logicXorWeak185=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak185.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:17: ( 'or' ^ logicXorWeak )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:18: 'or' ^ logicXorWeak
					{
					string_literal186=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2524); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal186_tree = 
					(CommonTree)adaptor.create(string_literal186)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal186_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2527);
					logicXorWeak187=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak187.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:494:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2542);
			logicAndWeak188=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak188.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:17: ( 'xor' ^ logicAndWeak )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:18: 'xor' ^ logicAndWeak
					{
					string_literal189=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2545); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal189_tree = 
					(CommonTree)adaptor.create(string_literal189)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal189_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2548);
					logicAndWeak190=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak190.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:498:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2563);
			assignment191=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment191.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:15: ( 'and' ^ assignment )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:16: 'and' ^ assignment
					{
					string_literal192=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2566); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal192_tree = 
					(CommonTree)adaptor.create(string_literal192)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal192_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2569);
					assignment193=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment193.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:502:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary194 =null;
		ParserRuleReturnScope assignmentOperator195 =null;
		ParserRuleReturnScope ternary196 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2582);
			ternary194=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary194.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:12: ( assignmentOperator ^ ternary )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2585);
					assignmentOperator195=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator195.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2588);
					ternary196=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary196.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:506:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:2: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:4: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2602);
			logicOr197=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr197.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:12: ( '?' ^ expression ':' ! expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==QuestionMark) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:13: '?' ^ expression ':' ! expression
					{
					char_literal198=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2605); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal198_tree = 
					(CommonTree)adaptor.create(char_literal198)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2608);
					expression199=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression199.getTree());

					char_literal200=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2610); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2613);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:510:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:511:2: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:511:4: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2627);
			logicAnd202=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd202.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:511:13: ( '||' ^ logicAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOr) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:511:14: '||' ^ logicAnd
					{
					string_literal203=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2630); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = 
					(CommonTree)adaptor.create(string_literal203)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal203_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2633);
					logicAnd204=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd204.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:514:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:515:2: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:515:4: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2646);
			bitwiseOr205=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr205.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:515:14: ( '&&' ^ bitwiseOr )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:515:15: '&&' ^ bitwiseOr
					{
					string_literal206=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal206_tree = 
					(CommonTree)adaptor.create(string_literal206)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal206_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2652);
					bitwiseOr207=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr207.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:518:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:519:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:519:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2666);
			bitwiseXor208=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor208.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:519:15: ( '|' ^ bitwiseXor )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==BitwiseOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:519:16: '|' ^ bitwiseXor
					{
					char_literal209=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal209_tree = 
					(CommonTree)adaptor.create(char_literal209)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal209_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2672);
					bitwiseXor210=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor210.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:522:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2685);
			bitwiseAnd211=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd211.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:15: ( '^' ^ bitwiseAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseXor) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:16: '^' ^ bitwiseAnd
					{
					char_literal212=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2688); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal212_tree = 
					(CommonTree)adaptor.create(char_literal212)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2691);
					bitwiseAnd213=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd213.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:526:1: bitwiseAnd : equality ( '&' ^ equality )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2704);
			equality214=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality214.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:13: ( '&' ^ equality )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:14: '&' ^ equality
					{
					char_literal215=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = 
					(CommonTree)adaptor.create(char_literal215)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2710);
					equality216=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality216.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:530:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison217 =null;
		ParserRuleReturnScope equalityOperator218 =null;
		ParserRuleReturnScope comparison219 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:2: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:4: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2723);
			comparison217=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison217.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:15: ( equalityOperator ^ comparison )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Equal||LA69_0==Identical||(LA69_0 >= NotEqual && LA69_0 <= NotIdentical)) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:16: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2726);
					equalityOperator218=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator218.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2729);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:534:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set220=null;

		CommonTree set220_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:535:2: ( '==' | '===' | '!=' | '!==' | '<>' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:542:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift221 =null;
		ParserRuleReturnScope comparisonOperator222 =null;
		ParserRuleReturnScope bitwiseShift223 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2773);
			bitwiseShift221=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift221.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:17: ( comparisonOperator ^ bitwiseShift )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( ((LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||(LA70_0 >= LessEqualThan && LA70_0 <= LessThan)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2776);
					comparisonOperator222=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator222.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2779);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:546:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set224=null;

		CommonTree set224_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:2: ( '<' | '<=' | '>' | '>=' )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:553:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:2: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:4: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2819);
			termOrStringConcatenation225=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation225.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:30: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ShiftLeft||LA71_0==ShiftRight) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:31: ( '<<' | '>>' ) ^ termOrStringConcatenation
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2829);
					termOrStringConcatenation227=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation227.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:557:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:2: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:4: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2843);
			factor228=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor228.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:11: ( ( '+' | '-' | '.' ) ^ factor )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Dot||LA72_0==Minus||LA72_0==Plus) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:12: ( '+' | '-' | '.' ) ^ factor
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2855);
					factor230=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor230.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:561:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:2: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:4: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2869);
			logicNot231=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot231.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:13: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Divide||LA73_0==Modulo||LA73_0==Multiply) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:14: ( '*' | '/' | '%' ) ^ logicNot
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
					pushFollow(FOLLOW_logicNot_in_factor2881);
					logicNot233=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot233.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:1: logicNot : ( '!' ^ logicNot | instanceOf );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:9: ( '!' ^ logicNot | instanceOf )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==LogicNot) ) {
				alt74=1;
			}
			else if ( (LA74_0==At||LA74_0==Backslash||LA74_0==BitwiseNot||LA74_0==Bool||LA74_0==Clone||LA74_0==Float||LA74_0==Identifier||LA74_0==Int||(LA74_0 >= LeftParanthesis && LA74_0 <= LeftSquareBrace)||LA74_0==Minus||LA74_0==MinusMinus||LA74_0==New||(LA74_0 >= Null && LA74_0 <= NullVariations)||(LA74_0 >= ParentColonColon && LA74_0 <= Plus)||LA74_0==PlusPlus||LA74_0==SelfColonColon||LA74_0==String||LA74_0==This||LA74_0==TypeArray||LA74_0==VariableId) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal234=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2892); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal234_tree = 
					(CommonTree)adaptor.create(char_literal234)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal234_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2895);
					logicNot235=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot235.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:566:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2900);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2911);
			castOrBitwiseNotOrAt237=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt237.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Instanceof) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal238=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal238_tree = 
					(CommonTree)adaptor.create(string_literal238)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal238_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2918);
							classInterfaceTypeWithoutObject239=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject239.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:73: VariableId
							{
							VariableId240=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2920); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2936); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2938);
					allTypesWithoutObjectAndResource241=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource241.getTree());
					char_literal242=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2940); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal242);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2942);
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
					// 573:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:574:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal244=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal244_tree = 
					(CommonTree)adaptor.create(char_literal244)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal244_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2961);
					castOrBitwiseNotOrAt245=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt245.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal246=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2966); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal246_tree = 
					(CommonTree)adaptor.create(char_literal246)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal246_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2969);
					castOrBitwiseNotOrAt247=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt247.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:576:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2975);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:1: cloneOrNew : ( 'clone' ^ cloneOrNew | newObject | unaryPrimary );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:580:2: ( 'clone' ^ cloneOrNew | newObject | unaryPrimary )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:580:4: 'clone' ^ cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal249=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew2986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal249_tree = 
					(CommonTree)adaptor.create(string_literal249)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal249_tree, root_0);
					}

					pushFollow(FOLLOW_cloneOrNew_in_cloneOrNew2989);
					cloneOrNew250=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew250.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:581:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew2994);
					newObject251=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject251.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:582:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew2999);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:586:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:587:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:587:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3012);
					staticAccessOrParent253=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent253.getTree());
					VariableId254=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3014); if (state.failed) return retval; 
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
					// 587:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:587:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:588:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal255=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember3030); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal255_tree = 
					(CommonTree)adaptor.create(string_literal255)
					;
					adaptor.addChild(root_0, string_literal255_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId256=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3035); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:592:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:593:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:593:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3049); if (state.failed) return retval; 
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
					// 593:15: -> Self[$s,\"self\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:594:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3061); if (state.failed) return retval; 
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
					// 594:17: -> Parent[$p,\"parent\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3071);
					classInterfaceTypeWithoutObject257=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject257.getTree());

					string_literal258=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3073); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:598:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:599:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt81=2;
			alt81 = dfa81.predict(input);
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:599:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal259=(Token)match(input,New,FOLLOW_New_in_newObject3086); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal259);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3088);
					classInterfaceTypeWithoutObject260=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject260.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3090);
					actualParameters261=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters261.getTree());
					// AST REWRITE
					// elements: classInterfaceTypeWithoutObject, actualParameters, New
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 599:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:599:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal262=(Token)match(input,New,FOLLOW_New_in_newObject3105); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal262);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3107);
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
					// 600:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:603:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3131); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:13: ( expressionList )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==At||LA82_0==Backslash||LA82_0==BitwiseNot||LA82_0==Bool||LA82_0==Clone||LA82_0==Float||LA82_0==Identifier||LA82_0==Int||(LA82_0 >= LeftParanthesis && LA82_0 <= LeftSquareBrace)||LA82_0==LogicNot||LA82_0==Minus||LA82_0==MinusMinus||LA82_0==New||(LA82_0 >= Null && LA82_0 <= NullVariations)||(LA82_0 >= ParentColonColon && LA82_0 <= Plus)||LA82_0==PlusPlus||LA82_0==SelfColonColon||LA82_0==String||LA82_0==This||LA82_0==TypeArray||LA82_0==VariableId) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3133);
					expressionList264=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList264.getTree());
					}
					break;

			}

			char_literal265=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3136); if (state.failed) return retval; 
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
			// 604:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:75: ( expressionList )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:607:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:608:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:608:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3163);
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
					// 608:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:608:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:609:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3181); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3183);
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
					// 609:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:609:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3197);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:613:1: primary : ( postFixCall | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCall269 =null;
		ParserRuleReturnScope atom270 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:2: ( postFixCall | atom )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:4: postFixCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCall_in_primary3209);
					postFixCall269=postFixCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCall269.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3214);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:618:1: postFixCall : ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:4: ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt85=2;
			alt85 = dfa85.predict(input);
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:619:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCall3229);
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
					// 619:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:620:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCall3239);
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
					// 620:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCall3257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier273=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCall3259); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier273);

					// AST REWRITE
					// elements: postFixCall, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 622:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:623:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCall3281); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCall3283);
					expression274=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression274.getTree());
					char_literal275=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCall3285); if (state.failed) return retval; 
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
					// 623:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:623:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:5: call
					{
					pushFollow(FOLLOW_call_in_postFixCall3303);
					call276=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call276.getTree());
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
					// 624:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:628:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:629:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:629:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3331);
			classInterfaceTypeWithoutObject277=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject277.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3333);
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
			// 630:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:633:1: call : '->' ! Identifier actualParameters ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:633:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:633:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal279=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3357); if (state.failed) return retval;
			Identifier280=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3360); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier280_tree = 
			(CommonTree)adaptor.create(Identifier280)
			;
			adaptor.addChild(root_0, Identifier280_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3362);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:636:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:637:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:637:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3374);
			callee282=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee282.getTree());
			Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3376); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier283);

			pushFollow(FOLLOW_actualParameters_in_methodCall3378);
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
			// 638:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt87=2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3404);
					variableOrMemberOrStaticMember285=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember285.getTree());

					string_literal286=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3406); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3412);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:8: '(' expression ')'
					{
					char_literal288=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal288);

					pushFollow(FOLLOW_expression_in_atom3424);
					expression289=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression289.getTree());
					char_literal290=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3426); if (state.failed) return retval; 
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
					// 645:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3435);
					incrementDecrement291=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement291.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:4: postFixVariableInclCallAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3440);
					postFixVariableInclCallAtTheEnd292=postFixVariableInclCallAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCallAtTheEnd292.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3445);
					classConstant293=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant293.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3450);
					globalConstant294=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant294.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3455);
					array295=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array295.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3460);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:654:1: postFixVariableWithoutCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3472);
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
			// 655:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:3: ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			loop91:
			do {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==LeftSquareBrace||LA91_0==ObjectOperator) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:5: ( call )*
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:5: ( call )*
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:5: call
							{
							pushFollow(FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3487);
							call298=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_call.add(call298.getTree());
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
					// 657:11: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:14: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call298!=null?((Token)call298.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:91: ( call )*
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

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3518); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier299=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3520); if (state.failed) return retval; 
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
							// 659:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3543); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3545);
							expression300=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression300.getTree());
							char_literal301=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3547); if (state.failed) return retval; 
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
							// 660:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:1: postFixVariableInclCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3586);
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
			// 667:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:668:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:668:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier303=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3603); if (state.failed) return retval; 
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
					// 668:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:668:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3625); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3627);
					expression304=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression304.getTree());
					char_literal305=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal305);

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
					// 669:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:669:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCallAtTheEnd3647);
					call306=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call306.getTree());
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
					// 670:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:674:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3675);
			staticAccessOrParent307=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent307.getTree());
			Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3677); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier308);

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
			// 675:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:678:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier309=null;

		CommonTree Identifier309_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:679:2: ( Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:679:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3700); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:682:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom )
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
			case NullVariations:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3716); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3718);
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
					// 683:30: -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:33: ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:684:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3736); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3738);
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
					// 684:31: -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:684:34: ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3752);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:688:1: primitiveAtom : ( Bool | Int | Float | String |n= ( Null | NullVariations ) -> Null[$n,\"null\"] | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token Bool313=null;
		Token Int314=null;
		Token Float315=null;
		Token String316=null;
		Token Null317=null;
		Token NullVariations318=null;
		Token Identifier319=null;

		CommonTree n_tree=null;
		CommonTree Bool313_tree=null;
		CommonTree Int314_tree=null;
		CommonTree Float315_tree=null;
		CommonTree String316_tree=null;
		CommonTree Null317_tree=null;
		CommonTree NullVariations318_tree=null;
		CommonTree Identifier319_tree=null;
		RewriteRuleTokenStream stream_NullVariations=new RewriteRuleTokenStream(adaptor,"token NullVariations");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:2: ( Bool | Int | Float | String |n= ( Null | NullVariations ) -> Null[$n,\"null\"] | Identifier )
			int alt95=6;
			switch ( input.LA(1) ) {
			case Bool:
				{
				alt95=1;
				}
				break;
			case Int:
				{
				alt95=2;
				}
				break;
			case Float:
				{
				alt95=3;
				}
				break;
			case String:
				{
				alt95=4;
				}
				break;
			case Null:
			case NullVariations:
				{
				alt95=5;
				}
				break;
			case Identifier:
				{
				alt95=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:4: Bool
					{
					root_0 = (CommonTree)adaptor.nil();


					Bool313=(Token)match(input,Bool,FOLLOW_Bool_in_primitiveAtom3763); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Bool313_tree = 
					(CommonTree)adaptor.create(Bool313)
					;
					adaptor.addChild(root_0, Bool313_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:4: Int
					{
					root_0 = (CommonTree)adaptor.nil();


					Int314=(Token)match(input,Int,FOLLOW_Int_in_primitiveAtom3768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Int314_tree = 
					(CommonTree)adaptor.create(Int314)
					;
					adaptor.addChild(root_0, Int314_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:691:4: Float
					{
					root_0 = (CommonTree)adaptor.nil();


					Float315=(Token)match(input,Float,FOLLOW_Float_in_primitiveAtom3773); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Float315_tree = 
					(CommonTree)adaptor.create(Float315)
					;
					adaptor.addChild(root_0, Float315_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:692:4: String
					{
					root_0 = (CommonTree)adaptor.nil();


					String316=(Token)match(input,String,FOLLOW_String_in_primitiveAtom3778); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					String316_tree = 
					(CommonTree)adaptor.create(String316)
					;
					adaptor.addChild(root_0, String316_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:4: n= ( Null | NullVariations )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:6: ( Null | NullVariations )
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==Null) ) {
						alt94=1;
					}
					else if ( (LA94_0==NullVariations) ) {
						alt94=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);
						throw nvae;
					}
					switch (alt94) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:7: Null
							{
							Null317=(Token)match(input,Null,FOLLOW_Null_in_primitiveAtom3786); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Null.add(Null317);

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:12: NullVariations
							{
							NullVariations318=(Token)match(input,NullVariations,FOLLOW_NullVariations_in_primitiveAtom3788); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NullVariations.add(NullVariations318);

							}
							break;

					}

					// AST REWRITE
					// elements: Null
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 693:28: -> Null[$n,\"null\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(Null, n, "null")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:694:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier319=(Token)match(input,Identifier,FOLLOW_Identifier_in_primitiveAtom3799); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier319_tree = 
					(CommonTree)adaptor.create(Identifier319)
					;
					adaptor.addChild(root_0, Identifier319_tree);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal321=null;
		Token TypeArray322=null;
		Token char_literal323=null;
		Token char_literal325=null;
		ParserRuleReturnScope arrayContent320 =null;
		ParserRuleReturnScope arrayContent324 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal321_tree=null;
		CommonTree TypeArray322_tree=null;
		CommonTree char_literal323_tree=null;
		CommonTree char_literal325_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LeftSquareBrace) ) {
				alt98=1;
			}
			else if ( (LA98_0==TypeArray) ) {
				alt98=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4281); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:17: ( arrayContent )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==At||LA96_0==Backslash||LA96_0==BitwiseNot||LA96_0==Bool||LA96_0==Clone||LA96_0==Float||LA96_0==Identifier||LA96_0==Int||(LA96_0 >= LeftParanthesis && LA96_0 <= LeftSquareBrace)||LA96_0==LogicNot||LA96_0==Minus||LA96_0==MinusMinus||LA96_0==New||(LA96_0 >= Null && LA96_0 <= NullVariations)||(LA96_0 >= ParentColonColon && LA96_0 <= Plus)||LA96_0==PlusPlus||LA96_0==SelfColonColon||LA96_0==String||LA96_0==This||LA96_0==TypeArray||LA96_0==VariableId) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4283);
							arrayContent320=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent320.getTree());
							}
							break;

					}

					char_literal321=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal321);

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
					// 759:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:759:65: ( arrayContent )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray322=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4302); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray322);

					char_literal323=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4304); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal323);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:18: ( arrayContent )?
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==At||LA97_0==Backslash||LA97_0==BitwiseNot||LA97_0==Bool||LA97_0==Clone||LA97_0==Float||LA97_0==Identifier||LA97_0==Int||(LA97_0 >= LeftParanthesis && LA97_0 <= LeftSquareBrace)||LA97_0==LogicNot||LA97_0==Minus||LA97_0==MinusMinus||LA97_0==New||(LA97_0 >= Null && LA97_0 <= NullVariations)||(LA97_0 >= ParentColonColon && LA97_0 <= Plus)||LA97_0==PlusPlus||LA97_0==SelfColonColon||LA97_0==String||LA97_0==This||LA97_0==TypeArray||LA97_0==VariableId) ) {
						alt97=1;
					}
					switch (alt97) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4306);
							arrayContent324=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent324.getTree());
							}
							break;

					}

					char_literal325=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4309); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal325);

					// AST REWRITE
					// elements: TypeArray, arrayContent
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 760:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:760:51: ( arrayContent )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:763:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal327=null;
		ParserRuleReturnScope arrayKeyValue326 =null;
		ParserRuleReturnScope arrayKeyValue328 =null;

		CommonTree char_literal327_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4330);
			arrayKeyValue326=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue326.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:18: ( ',' ! arrayKeyValue )*
			loop99:
			do {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==Comma) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:764:19: ',' ! arrayKeyValue
					{
					char_literal327=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4333); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4336);
					arrayKeyValue328=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue328.getTree());

					}
					break;

				default :
					break loop99;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:766:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal329=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression330 =null;

		CommonTree string_literal329_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:767:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
			int alt100=2;
			switch ( input.LA(1) ) {
			case LogicNot:
				{
				int LA100_1 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case LeftParanthesis:
				{
				int LA100_2 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case BitwiseNot:
				{
				int LA100_3 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case At:
				{
				int LA100_4 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case Clone:
				{
				int LA100_5 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case New:
				{
				int LA100_6 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
			case Plus:
				{
				int LA100_7 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Minus:
				{
				int LA100_8 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA100_9 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA100_10 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA100_11 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA100_12 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA100_13 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA100_14 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 14, input);
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
				int LA100_15 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
				{
				int LA100_16 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA100_17 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Bool:
				{
				int LA100_18 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Int:
				{
				int LA100_19 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Float:
				{
				int LA100_20 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case String:
				{
				int LA100_21 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Null:
				{
				int LA100_22 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NullVariations:
				{
				int LA100_23 = input.LA(2);
				if ( (synpred170_TSPHP()) ) {
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
							new NoViableAltException("", 100, 23, input);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:767:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4350);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal329=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4352); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal329);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4356);
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
					// 767:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:767:44: ^( '=>' $key $value)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:768:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4373);
					expression330=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression330.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:772:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal331=null;
		Token char_literal332=null;
		Token char_literal334=null;
		Token string_literal335=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression333 =null;

		CommonTree string_literal331_tree=null;
		CommonTree char_literal332_tree=null;
		CommonTree char_literal334_tree=null;
		CommonTree string_literal335_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:773:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:773:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal331=(Token)match(input,If,FOLLOW_If_in_ifCondition4386); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal331);

			char_literal332=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4388); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal332);

			pushFollow(FOLLOW_expression_in_ifCondition4390);
			expression333=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression333.getTree());
			char_literal334=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4392); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal334);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4397);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==Else) ) {
				int LA101_1 = input.LA(2);
				if ( (synpred171_TSPHP()) ) {
					alt101=1;
				}
			}
			switch (alt101) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal335=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4404); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal335);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4409);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: If, expression, instructionElse, instructionThen
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
			// 774:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:100: ( $instructionElse)?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:778:1: switchCondition : 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal336=null;
		Token char_literal337=null;
		Token VariableId338=null;
		Token char_literal339=null;
		Token char_literal340=null;
		Token char_literal342=null;
		ParserRuleReturnScope switchContent341 =null;

		CommonTree string_literal336_tree=null;
		CommonTree char_literal337_tree=null;
		CommonTree VariableId338_tree=null;
		CommonTree char_literal339_tree=null;
		CommonTree char_literal340_tree=null;
		CommonTree char_literal342_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:2: ( 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:4: 'switch' '(' VariableId ')' '{' ( switchContent )? '}'
			{
			string_literal336=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4440); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal336);

			char_literal337=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4442); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal337);

			VariableId338=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4444); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId338);

			char_literal339=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4446); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal339);

			char_literal340=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4448); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal340);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:36: ( switchContent )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==Case||LA102_0==Default) ) {
				alt102=1;
			}
			else if ( (LA102_0==RightCurlyBrace) ) {
				int LA102_2 = input.LA(2);
				if ( (synpred172_TSPHP()) ) {
					alt102=1;
				}
			}
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:36: switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition4450);
					switchContent341=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchContent.add(switchContent341.getTree());
					}
					break;

			}

			char_literal342=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4453); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal342);

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
			// 779:56: -> ^( 'switch' VariableId ( switchContent )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:59: ^( 'switch' VariableId ( switchContent )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:81: ( switchContent )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:782:1: switchContent : ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCaseInstructionMandatory343 =null;
		ParserRuleReturnScope defaultCaseInstructionMandatory344 =null;
		ParserRuleReturnScope normalCaseInstructionOptional345 =null;
		ParserRuleReturnScope normalCaseInstructionMandatory346 =null;
		ParserRuleReturnScope defaultCaseInstructionOptional347 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:2: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? )
			int alt108=2;
			switch ( input.LA(1) ) {
			case Case:
				{
				int LA108_1 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Default:
				{
				int LA108_2 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RightCurlyBrace:
				{
				int LA108_3 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EOF:
				{
				int LA108_4 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt108=1;
				}
				else if ( (true) ) {
					alt108=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 108, 4, input);
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
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( normalCaseInstructionMandatory )*
					loop103:
					do {
						int alt103=2;
						int LA103_0 = input.LA(1);
						if ( (LA103_0==Case) ) {
							int LA103_1 = input.LA(2);
							if ( (synpred173_TSPHP()) ) {
								alt103=1;
							}

						}

						switch (alt103) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4477);
							normalCaseInstructionMandatory343=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory343.getTree());

							}
							break;

						default :
							break loop103;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: ( defaultCaseInstructionMandatory )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==Case) ) {
						int LA104_1 = input.LA(2);
						if ( (synpred174_TSPHP()) ) {
							alt104=1;
						}
					}
					else if ( (LA104_0==Default) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: defaultCaseInstructionMandatory
							{
							pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_switchContent4480);
							defaultCaseInstructionMandatory344=defaultCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionMandatory344.getTree());

							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:69: ( normalCaseInstructionOptional )*
					loop105:
					do {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==Case) ) {
							alt105=1;
						}

						switch (alt105) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:69: normalCaseInstructionOptional
							{
							pushFollow(FOLLOW_normalCaseInstructionOptional_in_switchContent4483);
							normalCaseInstructionOptional345=normalCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionOptional345.getTree());

							}
							break;

						default :
							break loop105;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:4: ( normalCaseInstructionMandatory )*
					loop106:
					do {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==Case) ) {
							int LA106_1 = input.LA(2);
							if ( (synpred177_TSPHP()) ) {
								alt106=1;
							}

						}

						switch (alt106) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4489);
							normalCaseInstructionMandatory346=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory346.getTree());

							}
							break;

						default :
							break loop106;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:36: ( defaultCaseInstructionOptional )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==Case||LA107_0==Default) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:36: defaultCaseInstructionOptional
							{
							pushFollow(FOLLOW_defaultCaseInstructionOptional_in_switchContent4492);
							defaultCaseInstructionOptional347=defaultCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionOptional347.getTree());

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:787:1: normalCaseInstructionMandatory : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.normalCaseInstructionMandatory_return normalCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.normalCaseInstructionMandatory_return retval = new TSPHPParser.normalCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int normalCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel348 =null;
		ParserRuleReturnScope instructionInclBreakContinue349 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionMandatory4505);
					caseLabel348=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel348.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:15: ( instructionInclBreakContinue )+
			int cnt110=0;
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==At||LA110_0==Backslash||LA110_0==BitwiseNot||(LA110_0 >= Bool && LA110_0 <= Break)||LA110_0==Clone||LA110_0==Continue||LA110_0==Do||LA110_0==Echo||LA110_0==Exit||(LA110_0 >= Float && LA110_0 <= Foreach)||(LA110_0 >= Identifier && LA110_0 <= If)||LA110_0==Int||(LA110_0 >= LeftCurlyBrace && LA110_0 <= LeftSquareBrace)||LA110_0==LogicNot||LA110_0==Minus||LA110_0==MinusMinus||LA110_0==New||(LA110_0 >= Null && LA110_0 <= NullVariations)||(LA110_0 >= ParentColonColon && LA110_0 <= Plus)||LA110_0==PlusPlus||LA110_0==Return||(LA110_0 >= SelfColonColon && LA110_0 <= Semicolon)||(LA110_0 >= String && LA110_0 <= TypeString)||LA110_0==VariableId||LA110_0==While) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:788:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4508);
					instructionInclBreakContinue349=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue349.getTree());
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
			// 789:3: -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:789:7: ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:790:5: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:793:1: normalCaseInstructionOptional : ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.normalCaseInstructionOptional_return normalCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.normalCaseInstructionOptional_return retval = new TSPHPParser.normalCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int normalCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel350 =null;
		ParserRuleReturnScope instructionInclBreakContinue351 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:2: ( ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:4: ( caseLabel )+ ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:4: ( caseLabel )+
			int cnt111=0;
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==Case) ) {
					int LA111_2 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}

				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionOptional4546);
					caseLabel350=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel350.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:15: ( instructionInclBreakContinue )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==At||LA112_0==Backslash||LA112_0==BitwiseNot||(LA112_0 >= Bool && LA112_0 <= Break)||LA112_0==Clone||LA112_0==Continue||LA112_0==Do||LA112_0==Echo||LA112_0==Exit||(LA112_0 >= Float && LA112_0 <= Foreach)||(LA112_0 >= Identifier && LA112_0 <= If)||LA112_0==Int||(LA112_0 >= LeftCurlyBrace && LA112_0 <= LeftSquareBrace)||LA112_0==LogicNot||LA112_0==Minus||LA112_0==MinusMinus||LA112_0==New||(LA112_0 >= Null && LA112_0 <= NullVariations)||(LA112_0 >= ParentColonColon && LA112_0 <= Plus)||LA112_0==PlusPlus||LA112_0==Return||(LA112_0 >= SelfColonColon && LA112_0 <= Semicolon)||(LA112_0 >= String && LA112_0 <= TypeString)||LA112_0==VariableId||LA112_0==While) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4549);
					instructionInclBreakContinue351=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue351.getTree());
					}
					break;

				default :
					break loop112;
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
			// 795:3: -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:795:7: ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue351!=null?((Token)instructionInclBreakContinue351.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:796:57: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:799:1: defaultCaseInstructionMandatory : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.defaultCaseInstructionMandatory_return defaultCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionMandatory_return retval = new TSPHPParser.defaultCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel352 =null;
		ParserRuleReturnScope defaultLabel353 =null;
		ParserRuleReturnScope caseLabel354 =null;
		ParserRuleReturnScope instructionInclBreakContinue355 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:4: ( caseLabel )*
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==Case) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4589);
					caseLabel352=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel352.getTree());
					}
					break;

				default :
					break loop113;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4592);
			defaultLabel353=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel353.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:28: ( caseLabel )*
			loop114:
			do {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==Case) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4594);
					caseLabel354=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel354.getTree());
					}
					break;

				default :
					break loop114;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:39: ( instructionInclBreakContinue )+
			int cnt115=0;
			loop115:
			do {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==At||LA115_0==Backslash||LA115_0==BitwiseNot||(LA115_0 >= Bool && LA115_0 <= Break)||LA115_0==Clone||LA115_0==Continue||LA115_0==Do||LA115_0==Echo||LA115_0==Exit||(LA115_0 >= Float && LA115_0 <= Foreach)||(LA115_0 >= Identifier && LA115_0 <= If)||LA115_0==Int||(LA115_0 >= LeftCurlyBrace && LA115_0 <= LeftSquareBrace)||LA115_0==LogicNot||LA115_0==Minus||LA115_0==MinusMinus||LA115_0==New||(LA115_0 >= Null && LA115_0 <= NullVariations)||(LA115_0 >= ParentColonColon && LA115_0 <= Plus)||LA115_0==PlusPlus||LA115_0==Return||(LA115_0 >= SelfColonColon && LA115_0 <= Semicolon)||(LA115_0 >= String && LA115_0 <= TypeString)||LA115_0==VariableId||LA115_0==While) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:800:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4597);
					instructionInclBreakContinue355=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue355.getTree());
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
			// 801:3: -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:7: ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:77: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue355!=null?((Token)instructionInclBreakContinue355.start):null), "block")
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:804:1: defaultCaseInstructionOptional : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.defaultCaseInstructionOptional_return defaultCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionOptional_return retval = new TSPHPParser.defaultCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel356 =null;
		ParserRuleReturnScope defaultLabel357 =null;
		ParserRuleReturnScope caseLabel358 =null;
		ParserRuleReturnScope instructionInclBreakContinue359 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:4: ( caseLabel )*
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==Case) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4635);
					caseLabel356=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel356.getTree());
					}
					break;

				default :
					break loop116;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4638);
			defaultLabel357=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel357.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:28: ( caseLabel )*
			loop117:
			do {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==Case) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4640);
					caseLabel358=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel358.getTree());
					}
					break;

				default :
					break loop117;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:39: ( instructionInclBreakContinue )*
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==At||LA118_0==Backslash||LA118_0==BitwiseNot||(LA118_0 >= Bool && LA118_0 <= Break)||LA118_0==Clone||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= Float && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==Int||(LA118_0 >= LeftCurlyBrace && LA118_0 <= LeftSquareBrace)||LA118_0==LogicNot||LA118_0==Minus||LA118_0==MinusMinus||LA118_0==New||(LA118_0 >= Null && LA118_0 <= NullVariations)||(LA118_0 >= ParentColonColon && LA118_0 <= Plus)||LA118_0==PlusPlus||LA118_0==Return||(LA118_0 >= SelfColonColon && LA118_0 <= Semicolon)||(LA118_0 >= String && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4643);
					instructionInclBreakContinue359=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue359.getTree());
					}
					break;

				default :
					break loop118;
				}
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
			// 806:3: -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:7: ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:76: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue359!=null?((Token)instructionInclBreakContinue359.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:807:57: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:810:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal360=null;
		Token char_literal362=null;
		ParserRuleReturnScope expression361 =null;

		CommonTree string_literal360_tree=null;
		CommonTree char_literal362_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal360=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4684); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4687);
			expression361=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression361.getTree());

			char_literal362=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4689); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:814:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal363=null;
		Token char_literal364=null;

		CommonTree string_literal363_tree=null;
		CommonTree char_literal364_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:2: ( 'default' ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal363=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4701); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal363_tree = 
			(CommonTree)adaptor.create(string_literal363)
			;
			adaptor.addChild(root_0, string_literal363_tree);
			}

			char_literal364=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4703); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:818:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal365=null;
		ParserRuleReturnScope forInit366 =null;
		ParserRuleReturnScope forCondition367 =null;
		ParserRuleReturnScope forUpdate368 =null;
		ParserRuleReturnScope instructionInclBreakContinue369 =null;

		CommonTree string_literal365_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal365=(Token)match(input,For,FOLLOW_For_in_forLoop4717); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal365_tree = 
			(CommonTree)adaptor.create(string_literal365)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal365_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop4720);
			forInit366=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit366.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop4722);
			forCondition367=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition367.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop4724);
			forUpdate368=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate368.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4726);
			instructionInclBreakContinue369=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue369.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:822:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId370 =null;
		ParserRuleReturnScope expressionList371 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:823:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:823:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit4741); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt120=2;
			alt120 = dfa120.predict(input);
			switch (alt120) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit4748);
					variableDeclarationListInclVariableId370=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId370.getTree());
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
					// 824:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:5: ( expressionList )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:5: ( expressionList )?
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==At||LA119_0==Backslash||LA119_0==BitwiseNot||LA119_0==Bool||LA119_0==Clone||LA119_0==Float||LA119_0==Identifier||LA119_0==Int||(LA119_0 >= LeftParanthesis && LA119_0 <= LeftSquareBrace)||LA119_0==LogicNot||LA119_0==Minus||LA119_0==MinusMinus||LA119_0==New||(LA119_0 >= Null && LA119_0 <= NullVariations)||(LA119_0 >= ParentColonColon && LA119_0 <= Plus)||LA119_0==PlusPlus||LA119_0==SelfColonColon||LA119_0==String||LA119_0==This||LA119_0==TypeArray||LA119_0==VariableId) ) {
						alt119=1;
					}
					switch (alt119) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit4763);
							expressionList371=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList371.getTree());
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
					// 825:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:63: ( expressionList )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:829:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList372 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition4793); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:18: ( expressionList )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==At||LA121_0==Backslash||LA121_0==BitwiseNot||LA121_0==Bool||LA121_0==Clone||LA121_0==Float||LA121_0==Identifier||LA121_0==Int||(LA121_0 >= LeftParanthesis && LA121_0 <= LeftSquareBrace)||LA121_0==LogicNot||LA121_0==Minus||LA121_0==MinusMinus||LA121_0==New||(LA121_0 >= Null && LA121_0 <= NullVariations)||(LA121_0 >= ParentColonColon && LA121_0 <= Plus)||LA121_0==PlusPlus||LA121_0==SelfColonColon||LA121_0==String||LA121_0==This||LA121_0==TypeArray||LA121_0==VariableId) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition4795);
					expressionList372=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList372.getTree());
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
			// 830:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:81: ( expressionList )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:833:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal374=null;
		ParserRuleReturnScope expressionList373 =null;

		CommonTree update_tree=null;
		CommonTree char_literal374_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate4821); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:15: ( expressionList )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==At||LA122_0==Backslash||LA122_0==BitwiseNot||LA122_0==Bool||LA122_0==Clone||LA122_0==Float||LA122_0==Identifier||LA122_0==Int||(LA122_0 >= LeftParanthesis && LA122_0 <= LeftSquareBrace)||LA122_0==LogicNot||LA122_0==Minus||LA122_0==MinusMinus||LA122_0==New||(LA122_0 >= Null && LA122_0 <= NullVariations)||(LA122_0 >= ParentColonColon && LA122_0 <= Plus)||LA122_0==PlusPlus||LA122_0==SelfColonColon||LA122_0==String||LA122_0==This||LA122_0==TypeArray||LA122_0==VariableId) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate4823);
					expressionList373=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList373.getTree());
					}
					break;

			}

			char_literal374=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate4826); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal374);

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
			// 834:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:79: ( expressionList )?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:837:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal375=null;
		Token char_literal376=null;
		Token string_literal378=null;
		Token string_literal379=null;
		Token char_literal380=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression377 =null;
		ParserRuleReturnScope instructionInclBreakContinue381 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal375_tree=null;
		CommonTree char_literal376_tree=null;
		CommonTree string_literal378_tree=null;
		CommonTree string_literal379_tree=null;
		CommonTree char_literal380_tree=null;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal375=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4847); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal375);

			char_literal376=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4849); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal376);

			pushFollow(FOLLOW_expression_in_foreachLoop4851);
			expression377=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression377.getTree());
			string_literal378=(Token)match(input,As,FOLLOW_As_in_foreachLoop4853); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal378);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt123=2;
			switch ( input.LA(1) ) {
				case TypeBool:
					{
					int LA123_1 = input.LA(2);
					if ( (LA123_1==VariableId) ) {
						int LA123_7 = input.LA(3);
						if ( (LA123_7==Arrow) ) {
							alt123=1;
						}
					}
					}
					break;
				case TypeBoolean:
					{
					int LA123_2 = input.LA(2);
					if ( (LA123_2==VariableId) ) {
						int LA123_7 = input.LA(3);
						if ( (LA123_7==Arrow) ) {
							alt123=1;
						}
					}
					}
					break;
				case TypeInt:
					{
					int LA123_3 = input.LA(2);
					if ( (LA123_3==VariableId) ) {
						int LA123_7 = input.LA(3);
						if ( (LA123_7==Arrow) ) {
							alt123=1;
						}
					}
					}
					break;
				case TypeFloat:
					{
					int LA123_4 = input.LA(2);
					if ( (LA123_4==VariableId) ) {
						int LA123_7 = input.LA(3);
						if ( (LA123_7==Arrow) ) {
							alt123=1;
						}
					}
					}
					break;
				case TypeString:
					{
					int LA123_5 = input.LA(2);
					if ( (LA123_5==VariableId) ) {
						int LA123_7 = input.LA(3);
						if ( (LA123_7==Arrow) ) {
							alt123=1;
						}
					}
					}
					break;
			}
			switch (alt123) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4858);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4862); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal379=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal379);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4870);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4874); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal380=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4876); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal380);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4878);
			instructionInclBreakContinue381=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue381.getTree());
			// AST REWRITE
			// elements: instructionInclBreakContinue, keyType, Foreach, valueType, keyVarId, expression, valueVarId
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
			// 839:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:40: ( $keyVarId)?
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal382=null;
		Token char_literal383=null;
		Token char_literal385=null;
		ParserRuleReturnScope expression384 =null;
		ParserRuleReturnScope instructionInclBreakContinue386 =null;

		CommonTree string_literal382_tree=null;
		CommonTree char_literal383_tree=null;
		CommonTree char_literal385_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal382=(Token)match(input,While,FOLLOW_While_in_whileLoop4916); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal382);

			char_literal383=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4918); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal383);

			pushFollow(FOLLOW_expression_in_whileLoop4920);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression384.getTree());
			char_literal385=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4922); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal385);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4924);
			instructionInclBreakContinue386=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue386.getTree());
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
			// 843:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:63: ^( 'while' expression instructionInclBreakContinue )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal387=null;
		Token string_literal389=null;
		Token char_literal390=null;
		Token char_literal392=null;
		Token char_literal393=null;
		ParserRuleReturnScope instructionInclBreakContinue388 =null;
		ParserRuleReturnScope expression391 =null;

		CommonTree string_literal387_tree=null;
		CommonTree string_literal389_tree=null;
		CommonTree char_literal390_tree=null;
		CommonTree char_literal392_tree=null;
		CommonTree char_literal393_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal387=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4946); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal387);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4948);
			instructionInclBreakContinue388=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue388.getTree());
			string_literal389=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4950); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal389);

			char_literal390=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4952); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal390);

			pushFollow(FOLLOW_expression_in_doWhileLoop4954);
			expression391=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression391.getTree());
			char_literal392=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4956); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal392);

			char_literal393=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4958); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal393);

			// AST REWRITE
			// elements: Do, expression, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 847:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:72: ^( 'do' instructionInclBreakContinue expression )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:850:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal394=null;
		Token char_literal396=null;
		ParserRuleReturnScope instructionInclBreakContinue395 =null;
		ParserRuleReturnScope catchBlock397 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal394_tree=null;
		CommonTree char_literal396_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+
			{
			string_literal394=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4979); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal394);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4983); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:23: ( instructionInclBreakContinue )*
			loop124:
			do {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==At||LA124_0==Backslash||LA124_0==BitwiseNot||(LA124_0 >= Bool && LA124_0 <= Break)||LA124_0==Clone||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= Float && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==Int||(LA124_0 >= LeftCurlyBrace && LA124_0 <= LeftSquareBrace)||LA124_0==LogicNot||LA124_0==Minus||LA124_0==MinusMinus||LA124_0==New||(LA124_0 >= Null && LA124_0 <= NullVariations)||(LA124_0 >= ParentColonColon && LA124_0 <= Plus)||LA124_0==PlusPlus||LA124_0==Return||(LA124_0 >= SelfColonColon && LA124_0 <= Semicolon)||(LA124_0 >= String && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4985);
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

			char_literal396=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4988); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal396);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:57: ( catchBlock )+
			int cnt125=0;
			loop125:
			do {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==Catch) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4990);
					catchBlock397=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock397.getTree());
					}
					break;

				default :
					if ( cnt125 >= 1 ) break loop125;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(125, input);
						throw eee;
				}
				cnt125++;
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
			// 852:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:41: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:855:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal398=null;
		Token VariableId400=null;
		Token char_literal401=null;
		Token char_literal403=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject399 =null;
		ParserRuleReturnScope instructionInclBreakContinue402 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal398_tree=null;
		CommonTree VariableId400_tree=null;
		CommonTree char_literal401_tree=null;
		CommonTree char_literal403_tree=null;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal398=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock5022); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal398);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock5026); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5028);
			classInterfaceTypeWithoutObject399=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject399.getTree());
			VariableId400=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock5030); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId400);

			char_literal401=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock5032); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal401);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5036); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:83: ( instructionInclBreakContinue )*
			loop126:
			do {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==At||LA126_0==Backslash||LA126_0==BitwiseNot||(LA126_0 >= Bool && LA126_0 <= Break)||LA126_0==Clone||LA126_0==Continue||LA126_0==Do||LA126_0==Echo||LA126_0==Exit||(LA126_0 >= Float && LA126_0 <= Foreach)||(LA126_0 >= Identifier && LA126_0 <= If)||LA126_0==Int||(LA126_0 >= LeftCurlyBrace && LA126_0 <= LeftSquareBrace)||LA126_0==LogicNot||LA126_0==Minus||LA126_0==MinusMinus||LA126_0==New||(LA126_0 >= Null && LA126_0 <= NullVariations)||(LA126_0 >= ParentColonColon && LA126_0 <= Plus)||LA126_0==PlusPlus||LA126_0==Return||(LA126_0 >= SelfColonColon && LA126_0 <= Semicolon)||(LA126_0 >= String && LA126_0 <= TypeString)||LA126_0==VariableId||LA126_0==While) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5038);
					instructionInclBreakContinue402=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue402.getTree());
					}
					break;

				default :
					break loop126;
				}
			} while (true);

			char_literal403=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal403);

			// AST REWRITE
			// elements: VariableId, classInterfaceTypeWithoutObject, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 857:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variable declarations")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject399!=null?((Token)classInterfaceTypeWithoutObject399.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:860:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:860:32: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:863:1: throwException : 'throw' ^ newObject ';' !;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal404=null;
		Token char_literal406=null;
		ParserRuleReturnScope newObject405 =null;

		CommonTree string_literal404_tree=null;
		CommonTree char_literal406_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:864:2: ( 'throw' ^ newObject ';' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:864:4: 'throw' ^ newObject ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal404=(Token)match(input,Throw,FOLLOW_Throw_in_throwException5087); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal404_tree = 
			(CommonTree)adaptor.create(string_literal404)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal404_tree, root_0);
			}

			pushFollow(FOLLOW_newObject_in_throwException5090);
			newObject405=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject405.getTree());

			char_literal406=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException5092); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

	// $ANTLR start synpred67_TSPHP
	public final void synpred67_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:421:4: ( variableAssignment ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:421:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred67_TSPHP2166);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred67_TSPHP2168); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred67_TSPHP

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:4: ( variableDeclaration ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred68_TSPHP2174);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP2176); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred77_TSPHP
	public final void synpred77_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:4: ( expression ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:4: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred77_TSPHP2222);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred77_TSPHP2224); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred77_TSPHP

	// $ANTLR start synpred97_TSPHP
	public final void synpred97_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred97_TSPHP2524); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred97_TSPHP2527);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred97_TSPHP

	// $ANTLR start synpred98_TSPHP
	public final void synpred98_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred98_TSPHP2545); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred98_TSPHP2548);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred98_TSPHP

	// $ANTLR start synpred99_TSPHP
	public final void synpred99_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:16: ( 'and' assignment )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred99_TSPHP2566); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred99_TSPHP2569);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred99_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:13: ( assignmentOperator ternary )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred100_TSPHP2585);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred100_TSPHP2588);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred127_TSPHP
	public final void synpred127_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred127_TSPHP2936); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred127_TSPHP2938);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred127_TSPHP2940); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred127_TSPHP2942);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred127_TSPHP

	// $ANTLR start synpred140_TSPHP
	public final void synpred140_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:4: ( postFixCall )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:4: postFixCall
		{
		pushFollow(FOLLOW_postFixCall_in_synpred140_TSPHP3209);
		postFixCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred140_TSPHP

	// $ANTLR start synpred147_TSPHP
	public final void synpred147_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: ( incrementDecrement )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred147_TSPHP3435);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred147_TSPHP

	// $ANTLR start synpred148_TSPHP
	public final void synpred148_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:4: ( postFixVariableInclCallAtTheEnd )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:4: postFixVariableInclCallAtTheEnd
		{
		pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred148_TSPHP3440);
		postFixVariableInclCallAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred148_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: ( classConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:648:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred149_TSPHP3445);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred149_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: ( globalConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred150_TSPHP3450);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred170_TSPHP
	public final void synpred170_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:767:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:767:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred170_TSPHP4350);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred170_TSPHP4352); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred170_TSPHP4356);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred170_TSPHP

	// $ANTLR start synpred171_TSPHP
	public final void synpred171_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:774:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred171_TSPHP4404); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred171_TSPHP4409);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred171_TSPHP

	// $ANTLR start synpred172_TSPHP
	public final void synpred172_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:36: ( switchContent )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:779:36: switchContent
		{
		pushFollow(FOLLOW_switchContent_in_synpred172_TSPHP4450);
		switchContent();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred172_TSPHP

	// $ANTLR start synpred173_TSPHP
	public final void synpred173_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred173_TSPHP4477);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred173_TSPHP

	// $ANTLR start synpred174_TSPHP
	public final void synpred174_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: ( defaultCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: defaultCaseInstructionMandatory
		{
		pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred174_TSPHP4480);
		defaultCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred174_TSPHP

	// $ANTLR start synpred176_TSPHP
	public final void synpred176_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
		{
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: ( normalCaseInstructionMandatory )*
		loop141:
		do {
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==Case) ) {
				int LA141_1 = input.LA(2);
				if ( (synpred173_TSPHP()) ) {
					alt141=1;
				}

			}

			switch (alt141) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:4: normalCaseInstructionMandatory
				{
				pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4477);
				normalCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop141;
			}
		} while (true);

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: ( defaultCaseInstructionMandatory )?
		int alt142=2;
		int LA142_0 = input.LA(1);
		if ( (LA142_0==Case) ) {
			int LA142_1 = input.LA(2);
			if ( (synpred174_TSPHP()) ) {
				alt142=1;
			}
		}
		else if ( (LA142_0==Default) ) {
			alt142=1;
		}
		switch (alt142) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:36: defaultCaseInstructionMandatory
				{
				pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred176_TSPHP4480);
				defaultCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:69: ( normalCaseInstructionOptional )*
		loop143:
		do {
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==Case) ) {
				alt143=1;
			}

			switch (alt143) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:783:69: normalCaseInstructionOptional
				{
				pushFollow(FOLLOW_normalCaseInstructionOptional_in_synpred176_TSPHP4483);
				normalCaseInstructionOptional();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop143;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred176_TSPHP

	// $ANTLR start synpred177_TSPHP
	public final void synpred177_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:784:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred177_TSPHP4489);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred177_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:4: ( caseLabel )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:794:4: caseLabel
		{
		pushFollow(FOLLOW_caseLabel_in_synpred181_TSPHP4546);
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
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA46 dfa46 = new DFA46(this);
	protected DFA81 dfa81 = new DFA81(this);
	protected DFA85 dfa85 = new DFA85(this);
	protected DFA87 dfa87 = new DFA87(this);
	protected DFA120 dfa120 = new DFA120(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\5\1\76\1\uffff\1\14\1\uffff\1\76\1\uffff\1\14";
	static final String DFA3_maxS =
		"\1\u0093\1\104\1\uffff\1\171\1\uffff\1\76\1\uffff\1\171";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\1\2\7\uffff\2\2\3\uffff"+
			"\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff\1\2\3\uffff\5\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\4\uffff\1\1\1\2\3\uffff\2\2"+
			"\7\uffff\2\2\1\uffff\1\2\5\uffff\1\2\7\uffff\2\2\5\uffff\15\2\2\uffff"+
			"\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\67\uffff\1\4\64\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\67\uffff\1\4\64\uffff\1\6"
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
			return "202:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA48_eotS =
		"\20\uffff";
	static final String DFA48_eofS =
		"\13\uffff\1\16\4\uffff";
	static final String DFA48_minS =
		"\1\14\10\u0091\1\76\1\14\1\10\1\76\2\uffff\1\14";
	static final String DFA48_maxS =
		"\1\u008b\10\u0091\1\76\1\u0091\1\162\1\76\2\uffff\1\u0091";
	static final String DFA48_acceptS =
		"\15\uffff\1\1\1\2\1\uffff";
	static final String DFA48_specialS =
		"\20\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\11\61\uffff\1\12\105\uffff\1\6\1\1\1\2\1\4\1\3\1\10\1\7\1\5",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\12",
			"\1\14\u0084\uffff\1\13",
			"\1\15\26\uffff\1\16\122\uffff\1\16",
			"\1\17",
			"",
			"",
			"\1\14\u0084\uffff\1\13"
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
			return "391:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );";
		}
	}

	static final String DFA46_eotS =
		"\21\uffff";
	static final String DFA46_eofS =
		"\1\2\14\uffff\1\17\3\uffff";
	static final String DFA46_minS =
		"\1\37\1\14\1\uffff\10\u0091\1\76\1\14\1\10\1\76\1\uffff\1\14";
	static final String DFA46_maxS =
		"\1\162\1\u008b\1\uffff\10\u0091\1\76\1\u0091\1\162\1\76\1\uffff\1\u0091";
	static final String DFA46_acceptS =
		"\2\uffff\1\2\14\uffff\1\1\1\uffff";
	static final String DFA46_specialS =
		"\21\uffff}>";
	static final String[] DFA46_transitionS = {
			"\1\1\122\uffff\1\2",
			"\1\13\61\uffff\1\14\105\uffff\1\10\1\3\1\4\1\6\1\5\1\12\1\11\1\7",
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
			"\1\16\u0084\uffff\1\15",
			"\1\2\26\uffff\1\17\122\uffff\1\17",
			"\1\20",
			"",
			"\1\16\u0084\uffff\1\15"
	};

	static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
	static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
	static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
	static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
	static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
	static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
	static final short[][] DFA46_transition;

	static {
		int numStates = DFA46_transitionS.length;
		DFA46_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
		}
	}

	class DFA46 extends DFA {

		public DFA46(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 46;
			this.eot = DFA46_eot;
			this.eof = DFA46_eof;
			this.min = DFA46_min;
			this.max = DFA46_max;
			this.accept = DFA46_accept;
			this.special = DFA46_special;
			this.transition = DFA46_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 393:21: ( ',' ! paramDeclaration )*";
		}
	}

	static final String DFA81_eotS =
		"\10\uffff";
	static final String DFA81_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA81_minS =
		"\1\132\1\14\1\76\1\6\1\76\2\uffff\1\6";
	static final String DFA81_maxS =
		"\1\132\2\76\1\175\1\76\2\uffff\1\175";
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
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\12\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\12\uffff\2\6\5\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\12\uffff\2\6\5\uffff"+
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
			return "598:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA85_eotS =
		"\7\uffff";
	static final String DFA85_eofS =
		"\7\uffff";
	static final String DFA85_minS =
		"\1\14\1\76\1\14\1\uffff\1\76\1\uffff\1\14";
	static final String DFA85_maxS =
		"\1\u0091\1\76\1\105\1\uffff\1\76\1\uffff\1\105";
	static final String DFA85_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA85_specialS =
		"\7\uffff}>";
	static final String[] DFA85_transitionS = {
			"\1\1\61\uffff\1\2\50\uffff\1\3\20\uffff\1\3\10\uffff\1\3\17\uffff\1\3",
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
			return "619:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA87_eotS =
		"\12\uffff";
	static final String DFA87_eofS =
		"\12\uffff";
	static final String DFA87_minS =
		"\1\14\3\76\1\14\2\uffff\2\76\1\14";
	static final String DFA87_maxS =
		"\3\u0091\1\76\1\53\2\uffff\1\76\1\u0091\1\53";
	static final String DFA87_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA87_specialS =
		"\12\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\3\61\uffff\1\4\50\uffff\1\2\20\uffff\1\1\10\uffff\1\5\17\uffff\1\5",
			"\1\6\122\uffff\1\5",
			"\1\6\122\uffff\1\5",
			"\1\4",
			"\1\7\36\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\122\uffff\1\5",
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
			return "641:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA120_eotS =
		"\11\uffff";
	static final String DFA120_eofS =
		"\11\uffff";
	static final String DFA120_minS =
		"\1\11\1\uffff\1\105\1\76\1\10\1\uffff\1\14\1\76\1\14";
	static final String DFA120_maxS =
		"\1\u0091\1\uffff\1\u0091\1\76\1\u0091\1\uffff\1\u0091\1\76\1\u0091";
	static final String DFA120_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA120_specialS =
		"\11\uffff}>";
	static final String[] DFA120_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\10\uffff\1\5\30\uffff\1\5\7"+
			"\uffff\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\2\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\2\7\1\5\uffff\1\5",
			"",
			"\1\5\113\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\13\uffff\1\5\5\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\3\uffff\2\5\1\uffff\4\5\2\uffff\3\5\12\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\23\uffff\1\1",
			"",
			"\1\7\36\uffff\1\5\31\uffff\1\5\113\uffff\1\1",
			"\1\10",
			"\1\7\36\uffff\1\5\31\uffff\1\5\113\uffff\1\1"
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
			return "824:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_EOF_in_prog1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_EOF_in_prog1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1034 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1050 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1052 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1054 = new BitSet(new long[]{0xC3E2408230109222L,0x83010580C414087CL,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1056 = new BitSet(new long[]{0xC3E2408230109222L,0x83010580C414087CL,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1071 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1076 = new BitSet(new long[]{0xC3E2408230109220L,0x83030580C414087CL,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1078 = new BitSet(new long[]{0xC3E2408230109220L,0x83030580C414087CL,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1186 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1189 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1191 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1211 = new BitSet(new long[]{0xC3E2408230109222L,0x83010580C414087CL,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1246 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1248 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1251 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1253 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1272 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1274 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1276 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1284 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1286 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1297 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1349 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1351 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1359 = new BitSet(new long[]{0x0220000200000020L,0x4002680000000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1361 = new BitSet(new long[]{0x0220000200000020L,0x4002680000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1378 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1391 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1394 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1396 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1409 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000009E0L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1450 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1452 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1455 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1457 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1487 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1489 = new BitSet(new long[]{0x4040000000100000L,0x80000100C0040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1504 = new BitSet(new long[]{0x0000000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1507 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1509 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1550 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1557 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1559 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1578 = new BitSet(new long[]{0x0200000000000000L,0x0000600000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1580 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1594 = new BitSet(new long[]{0x0220000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1596 = new BitSet(new long[]{0x0200000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1604 = new BitSet(new long[]{0x0200000000000000L,0x4000680000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1606 = new BitSet(new long[]{0x0200000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1620 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1639 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1646 = new BitSet(new long[]{0x0200000200000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1648 = new BitSet(new long[]{0x0200000200000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1678 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1681 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1704 = new BitSet(new long[]{0xC1C2408020109200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1706 = new BitSet(new long[]{0xC1C2408020109200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1741 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000040FF0L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1744 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters1762 = new BitSet(new long[]{0x4000000000001000L,0x0004000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramList_in_formalParameters1764 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBool_in_primitiveTypes1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBoolean_in_primitiveTypes1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeInt_in_primitiveTypes1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeFloat_in_primitiveTypes1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeString_in_primitiveTypes1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1912 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1960 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1963 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1966 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1974 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1977 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1980 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1985 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1988 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationOptional2027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationOptional2029 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2032 = new BitSet(new long[]{0x4040000000100000L,0x80000100C0040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2080 = new BitSet(new long[]{0xC1C2408020109200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2082 = new BitSet(new long[]{0xC1C2408020109200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2117 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2119 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2143 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000004L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2150 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2166 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2174 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction2222 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2230 = new BitSet(new long[]{0x4040000020109200L,0x83000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_instruction2233 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2242 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_instruction2245 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2253 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2280 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2283 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_expressionList2286 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2299 = new BitSet(new long[]{0x00000440000A4100L,0x2800020001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2301 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2400 = new BitSet(new long[]{0x0000000000000000L,0x0000040000100000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2445 = new BitSet(new long[]{0x4000000000001000L,0x0100008000000000L,0x0000000000020002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2476 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2479 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2524 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2545 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2566 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_ternary_in_assignment2582 = new BitSet(new long[]{0x00000440000A4102L,0x2800020001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2585 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_ternary_in_assignment2588 = new BitSet(new long[]{0x00000440000A4102L,0x2800020001480000L});
	public static final BitSet FOLLOW_logicOr_in_ternary2602 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2605 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ternary2608 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2610 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ternary2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2630 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2649 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2666 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2669 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2672 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2685 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2688 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2691 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2704 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2707 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2710 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality2723 = new BitSet(new long[]{0x2001000000000002L,0x0000000038000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2726 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_comparison_in_equality2729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2773 = new BitSet(new long[]{0x0C00000000000002L,0x0000000000000180L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2776 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2819 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2822 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2829 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2843 = new BitSet(new long[]{0x0000020000000002L,0x0000010000040000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2846 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2855 = new BitSet(new long[]{0x0000020000000002L,0x0000010000040000L});
	public static final BitSet FOLLOW_logicNot_in_factor2869 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_set_in_factor2872 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicNot_in_factor2881 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2892 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2914 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2936 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2938 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2940 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2958 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2966 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew2986 = new BitSet(new long[]{0x4040000020101000L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_cloneOrNew_in_cloneOrNew2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew2994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3071 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3086 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3105 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3131 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3133 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3161 = new BitSet(new long[]{0x4040000000101000L,0x81000480C0100064L,0x0000000000020012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3181 = new BitSet(new long[]{0x4040000000101000L,0x81000480C0100064L,0x0000000000020012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_primary3209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_postFixCall3229 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_methodCall_in_postFixCall3239 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCall3257 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCall3259 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCall3281 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixCall3283 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCall3285 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixCall3303 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3357 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_call3362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3374 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3404 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3422 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_atom3424 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3472 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3518 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3520 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3543 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3545 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3547 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3586 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3601 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3603 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3625 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3627 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3629 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCallAtTheEnd3647 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3675 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3716 = new BitSet(new long[]{0x4040000000100000L,0x80000000C0000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3736 = new BitSet(new long[]{0x4040000000100000L,0x80000000C0000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primitiveAtom3763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primitiveAtom3768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Float_in_primitiveAtom3773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_primitiveAtom3778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_primitiveAtom3786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NullVariations_in_primitiveAtom3788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primitiveAtom3799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4281 = new BitSet(new long[]{0x4040000020109200L,0x81080580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayContent_in_array4283 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4304 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayContent_in_array4306 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4330 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4333 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4336 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4350 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4352 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4388 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ifCondition4390 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4392 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4397 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4404 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4444 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4448 = new BitSet(new long[]{0x0000001004000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4450 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4477 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_switchContent4480 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_switchContent4483 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4489 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionOptional_in_switchContent4492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionMandatory4505 = new BitSet(new long[]{0xC1C2408424309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4508 = new BitSet(new long[]{0xC1C2408420309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionOptional4546 = new BitSet(new long[]{0xC1C2408424309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4549 = new BitSet(new long[]{0xC1C2408420309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4589 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4592 = new BitSet(new long[]{0xC1C2408424309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4594 = new BitSet(new long[]{0xC1C2408424309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4597 = new BitSet(new long[]{0xC1C2408420309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4635 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4638 = new BitSet(new long[]{0xC1C2408424309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4640 = new BitSet(new long[]{0xC1C2408424309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4643 = new BitSet(new long[]{0xC1C2408420309202L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_Case_in_caseLabel4684 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_caseLabel4687 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4701 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forInit_in_forLoop4720 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop4722 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop4724 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit4741 = new BitSet(new long[]{0x4040000020109202L,0x81000580C4140864L,0x0000000000020FF2L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit4748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition4793 = new BitSet(new long[]{0x4040000020109202L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_forCondition4795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate4821 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4823 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate4826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4849 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4851 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop4853 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4862 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4864 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4874 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4876 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4918 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_whileLoop4920 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4922 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4946 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4952 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4954 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4956 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4983 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4985 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4988 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4990 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock5022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock5026 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock5030 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock5032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5036 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5038 = new BitSet(new long[]{0xC1C2408420309200L,0x83030580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException5087 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_newObject_in_throwException5090 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException5092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred67_TSPHP2166 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred67_TSPHP2168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred68_TSPHP2174 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred77_TSPHP2222 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred77_TSPHP2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred97_TSPHP2524 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred97_TSPHP2527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred98_TSPHP2545 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred98_TSPHP2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred99_TSPHP2566 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_assignment_in_synpred99_TSPHP2569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred100_TSPHP2585 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_ternary_in_synpred100_TSPHP2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred127_TSPHP2936 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred127_TSPHP2938 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred127_TSPHP2940 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred127_TSPHP2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_synpred140_TSPHP3209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred147_TSPHP3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred148_TSPHP3440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred149_TSPHP3445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred150_TSPHP3450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred170_TSPHP4350 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred170_TSPHP4352 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_synpred170_TSPHP4356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred171_TSPHP4404 = new BitSet(new long[]{0xC1C2408420309200L,0x83010580C4140874L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred171_TSPHP4409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchContent_in_synpred172_TSPHP4450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred173_TSPHP4477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred174_TSPHP4480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred176_TSPHP4477 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred176_TSPHP4480 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_synpred176_TSPHP4483 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred177_TSPHP4489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred181_TSPHP4546 = new BitSet(new long[]{0x0000000000000002L});
}
