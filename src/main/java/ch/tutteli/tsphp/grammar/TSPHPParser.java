// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-21 21:24:00

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
		this.state.ruleMemo = new HashMap[305+1];
		 

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:8: namespaceSemicolon
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: namespaceBracket
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: withoutNamespace EOF !
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:5: 'namespace' namespaceId ';' ( statement )+
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:33: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1056);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1069); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1071);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:34: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1076);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1079); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1182); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier16);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1185); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal17);

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1187); if (state.failed) return retval; 
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1207);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1220);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1225);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1230);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1242); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1244);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1247); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1249);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1253); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1270); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1272);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:6: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1280); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1282);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1293); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1295); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1308);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1313);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1318);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1323);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1345); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1349);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1352);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1355); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1357);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1360); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1374); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1376);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1387); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1390); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1392); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1407);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1419);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1424);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1430);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1444); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1446);
			primitiveTypes57=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes57.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1448);
			constantAssignment58=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment58.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:54: ',' constantAssignment
					{
					char_literal59=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1451); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal59);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1453);
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

			char_literal61=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal61);

			// AST REWRITE
			// elements: constantAssignment, primitiveTypes
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1483); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier62_tree = 
			(CommonTree)adaptor.create(Identifier62)
			;
			adaptor.addChild(root_0, Identifier62_tree);
			}

			char_literal63=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1485); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal63_tree = 
			(CommonTree)adaptor.create(char_literal63)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1488);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: 'static'
					{
					string_literal65=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = 
					(CommonTree)adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1503);
			accessor66=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor66.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1505);
			variableDeclarationListInclVariableId67=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId67.getTree());

			char_literal68=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1507); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1516);
					accessorWithoutPrivate69=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate69.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal70=(Token)match(input,Private,FOLLOW_Private_in_accessor1521); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set71=null;

		CommonTree set71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:2: ( 'protected' | 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1546);
			variableDeclaration72=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration72.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal73=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1549); if (state.failed) return retval;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1553);
							variableAssignment74=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment74.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:50: VariableId
							{
							VariableId75=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1555); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal76=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1574); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal76_tree = 
					(CommonTree)adaptor.create(string_literal76)
					;
					adaptor.addChild(root_0, string_literal76_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1576);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:6: 'static' ( 'final' )?
							{
							string_literal78=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1590); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal78_tree = 
							(CommonTree)adaptor.create(string_literal78)
							;
							adaptor.addChild(root_0, string_literal78_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:15: 'final'
									{
									string_literal79=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1592); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:6: 'final' ( 'static' )?
							{
							string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1600); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal80_tree = 
							(CommonTree)adaptor.create(string_literal80)
							;
							adaptor.addChild(root_0, string_literal80_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:14: 'static'
									{
									string_literal81=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1602); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1616);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1623);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal84=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1635); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal84_tree = 
			(CommonTree)adaptor.create(string_literal84)
			;
			adaptor.addChild(root_0, string_literal84_tree);
			}

			Identifier85=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1637); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier85_tree = 
			(CommonTree)adaptor.create(Identifier85)
			;
			adaptor.addChild(root_0, Identifier85_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1639);
					implementsDeclaration86=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1642); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = 
			(CommonTree)adaptor.create(char_literal87)
			;
			adaptor.addChild(root_0, char_literal87_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1644);
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

			char_literal89=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1647); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList90 =null;
		ParserRuleReturnScope interfaceMethodDeclaration91 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1658);
					constDeclarationList90=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList90.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1663);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: 'public'
					{
					string_literal92=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1674); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal92_tree = 
					(CommonTree)adaptor.create(string_literal92)
					;
					adaptor.addChild(root_0, string_literal92_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1677);
			functionDeclarationWithoutBody93=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody93.getTree());

			char_literal94=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1679); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:335:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1696);
			functionDeclarationWithoutBody95=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody95.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:45: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==ParentColonColon||LA35_0==PlusPlus||LA35_0==Return||LA35_0==SelfColonColon||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1702);
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

			char_literal97=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1705); if (state.failed) return retval; 
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody95!=null?((Token)functionDeclarationWithoutBody95.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:122: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:146: ( instructionWithoutBreakContinue )*
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal98=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1737); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1740);
			returnType99=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType99.getTree());

			Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1742); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier100_tree = 
			(CommonTree)adaptor.create(Identifier100)
			;
			adaptor.addChild(root_0, Identifier100_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody1744);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters1758); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:15: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters1760);
					paramList102=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList102.getTree());
					}
					break;

			}

			char_literal103=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters1763); if (state.failed) return retval; 
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
			// 345:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:68: ( paramList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:1: returnType : ( allTypes | 'void' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1785);
					allTypes104=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes104.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal105=(Token)match(input,Void,FOLLOW_Void_in_returnType1789); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended106 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:11: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1798);
					primitiveTypesExtended106=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:36: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1802);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:355:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray108 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1813);
					primitiveTypesInclArray108=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1819);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:1: primitiveTypes : ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:2: ( TypeBool |bool= TypeBoolean -> TypeBool[$bool,\"bool\"] | TypeInt | TypeFloat | TypeString )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: TypeBool
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeBool110=(Token)match(input,TypeBool,FOLLOW_TypeBool_in_primitiveTypes1830); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeBool110_tree = 
					(CommonTree)adaptor.create(TypeBool110)
					;
					adaptor.addChild(root_0, TypeBool110_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: bool= TypeBoolean
					{
					bool=(Token)match(input,TypeBoolean,FOLLOW_TypeBoolean_in_primitiveTypes1839); if (state.failed) return retval; 
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
					// 362:23: -> TypeBool[$bool,\"bool\"]
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: TypeInt
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeInt111=(Token)match(input,TypeInt,FOLLOW_TypeInt_in_primitiveTypes1849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeInt111_tree = 
					(CommonTree)adaptor.create(TypeInt111)
					;
					adaptor.addChild(root_0, TypeInt111_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: TypeFloat
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeFloat112=(Token)match(input,TypeFloat,FOLLOW_TypeFloat_in_primitiveTypes1854); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeFloat112_tree = 
					(CommonTree)adaptor.create(TypeFloat112)
					;
					adaptor.addChild(root_0, TypeFloat112_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: TypeString
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeString113=(Token)match(input,TypeString,FOLLOW_TypeString_in_primitiveTypes1859); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1871);
					primitiveTypes114=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes114.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray115=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1876); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1888);
					primitiveTypesInclArray116=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource117=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1893); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:8: (root= '\\\\' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1906); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1909);
			namespaceId118=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId118.getTree());
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
			// 379:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:31: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:118: ( $root)?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject119=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1936); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject119_tree = 
					(CommonTree)adaptor.create(TypeObject119)
					;
					adaptor.addChild(root_0, TypeObject119_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1942);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* )
			int alt48=2;
			alt48 = dfa48.predict(input);
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1954);
					paramDeclarationOptional121=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional121.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:29: ( ',' ! paramDeclarationOptional )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:30: ',' ! paramDeclarationOptional
							{
							char_literal122=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1957); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1960);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:4: paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1968);
					paramDeclaration124=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration124.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:21: ( ',' ! paramDeclaration )*
					loop46:
					do {
						int alt46=2;
						alt46 = dfa46.predict(input);
						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:22: ',' ! paramDeclaration
							{
							char_literal125=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1971); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclaration_in_paramList1974);
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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:46: ( ',' ! paramDeclarationOptional )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:47: ',' ! paramDeclarationOptional
							{
							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1979); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1982);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:1: paramDeclaration : allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:2: ( allTypes VariableId -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:4: allTypes VariableId
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclaration1996);
			allTypes129=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes129.getTree());
			VariableId130=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId130);

			// AST REWRITE
			// elements: allTypes, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 394:24: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:27: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:1: paramDeclarationOptional : allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:2: ( allTypes VariableId '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:4: allTypes VariableId '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_allTypes_in_paramDeclarationOptional2019);
			allTypes131=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes131.getTree());
			VariableId132=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationOptional2021); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId132);

			char_literal133=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2024); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal133);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2026);
			unaryPrimitiveAtom134=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom134.getTree());
			// AST REWRITE
			// elements: VariableId, unaryPrimitiveAtom, allTypes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 397:48: -> ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:397:51: ^( PARAM_DECLARATION[$allTypes.start,\"parameter declaration\"] allTypes VariableId unaryPrimitiveAtom )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:402:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:2: (block= '{' ( instructionWithoutBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ ) | instruction )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LeftCurlyBrace) ) {
				alt50=1;
			}
			else if ( (LA50_0==Backslash||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==MinusMinus||LA50_0==ParentColonColon||LA50_0==PlusPlus||LA50_0==Return||LA50_0==SelfColonColon||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:4: block= '{' ( instructionWithoutBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:16: ( instructionWithoutBreakContinue )+
					int cnt49=0;
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==Backslash||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= For && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==LeftCurlyBrace||LA49_0==MinusMinus||LA49_0==ParentColonColon||LA49_0==PlusPlus||LA49_0==Return||LA49_0==SelfColonColon||(LA49_0 >= Switch && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2067);
							instructionWithoutBreakContinue135=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue135.getTree());
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

					char_literal136=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2071); if (state.failed) return retval; 
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
					// 403:54: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:57: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )+ )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2086);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:2: (block= '{' ( instructionInclBreakContinue )+ '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:4: block= '{' ( instructionInclBreakContinue )+ '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:17: ( instructionInclBreakContinue )+
					int cnt51=0;
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==Backslash||LA51_0==Break||LA51_0==Continue||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==LeftCurlyBrace||LA51_0==MinusMinus||LA51_0==ParentColonColon||LA51_0==PlusPlus||LA51_0==Return||LA51_0==SelfColonColon||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2104);
							instructionInclBreakContinue138=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue138.getTree());
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

					char_literal139=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2108); if (state.failed) return retval; 
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
					// 408:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:408:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )+ )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:409:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2123);
					instruction140=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction140.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:26: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:26: Int
							{
							Int142=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2135); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int142_tree = 
							(CommonTree)adaptor.create(Int142)
							;
							adaptor.addChild(root_0, Int142_tree);
							}

							}
							break;

					}

					char_literal143=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2138); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| incrementDecrement ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | postFixCallWithoutAccesAtTheEnd ';' !| postFixMethodCallWithoutAccessAtTheEnd ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !);
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal145=null;
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
		ParserRuleReturnScope variableAssignment144 =null;
		ParserRuleReturnScope variableDeclaration146 =null;
		ParserRuleReturnScope incrementDecrement148 =null;
		ParserRuleReturnScope ifCondition150 =null;
		ParserRuleReturnScope switchCondition151 =null;
		ParserRuleReturnScope forLoop152 =null;
		ParserRuleReturnScope foreachLoop153 =null;
		ParserRuleReturnScope whileLoop154 =null;
		ParserRuleReturnScope doWhileLoop155 =null;
		ParserRuleReturnScope tryCatch156 =null;
		ParserRuleReturnScope throwException157 =null;
		ParserRuleReturnScope postFixCallWithoutAccesAtTheEnd158 =null;
		ParserRuleReturnScope postFixMethodCallWithoutAccessAtTheEnd160 =null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expressionList166 =null;

		CommonTree char_literal145_tree=null;
		CommonTree char_literal147_tree=null;
		CommonTree char_literal149_tree=null;
		CommonTree char_literal159_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree string_literal162_tree=null;
		CommonTree char_literal164_tree=null;
		CommonTree string_literal165_tree=null;
		CommonTree char_literal167_tree=null;
		CommonTree string_literal168_tree=null;
		CommonTree char_literal169_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:2: ( variableAssignment ';' !| variableDeclaration ';' !| incrementDecrement ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | postFixCallWithoutAccesAtTheEnd ';' !| postFixMethodCallWithoutAccessAtTheEnd ';' !| 'return' ^ ( expression )? ';' !| 'echo' ^ expressionList ';' !| 'exit' ';' !)
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2151);
					variableAssignment144=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment144.getTree());

					char_literal145=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2153); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2159);
					variableDeclaration146=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration146.getTree());

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2161); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: incrementDecrement ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_instruction2167);
					incrementDecrement148=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement148.getTree());

					char_literal149=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2169); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2175);
					ifCondition150=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition150.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2180);
					switchCondition151=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition151.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2185);
					forLoop152=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop152.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2190);
					foreachLoop153=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop153.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:421:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2195);
					whileLoop154=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop154.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2200);
					doWhileLoop155=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop155.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2205);
					tryCatch156=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch156.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction2210);
					throwException157=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException157.getTree());

					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:4: postFixCallWithoutAccesAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_instruction2215);
					postFixCallWithoutAccesAtTheEnd158=postFixCallWithoutAccesAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallWithoutAccesAtTheEnd158.getTree());

					char_literal159=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2217); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: postFixMethodCallWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_instruction2223);
					postFixMethodCallWithoutAccessAtTheEnd160=postFixMethodCallWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixMethodCallWithoutAccessAtTheEnd160.getTree());

					char_literal161=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2225); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal162=(Token)match(input,Return,FOLLOW_Return_in_instruction2231); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal162_tree = 
					(CommonTree)adaptor.create(string_literal162)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal162_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:14: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||(LA54_0 >= Null && LA54_0 <= NullVariations)||(LA54_0 >= ParentColonColon && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==SelfColonColon||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2234);
							expression163=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());

							}
							break;

					}

					char_literal164=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2237); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal165=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal165_tree = 
					(CommonTree)adaptor.create(string_literal165)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal165_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2246);
					expressionList166=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList166.getTree());

					char_literal167=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2248); if (state.failed) return retval;
					}
					break;
				case 16 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal168=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2254); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal168_tree = 
					(CommonTree)adaptor.create(string_literal168)
					;
					adaptor.addChild(root_0, string_literal168_tree);
					}

					char_literal169=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2256); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal171=null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression172 =null;

		CommonTree char_literal171_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2269);
			expression170=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:15: ( ',' ! expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:16: ',' ! expression
					{
					char_literal171=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2272); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2275);
					expression172=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression172.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId173=null;
		ParserRuleReturnScope assignmentOperator174 =null;
		ParserRuleReturnScope expression175 =null;

		CommonTree VariableId173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId173=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2288); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId173_tree = 
			(CommonTree)adaptor.create(VariableId173)
			;
			adaptor.addChild(root_0, VariableId173_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2290);
			assignmentOperator174=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator174.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2293);
			expression175=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression175.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement176 =null;
		ParserRuleReturnScope preIncrementDecrement177 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:2: ( postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2305);
					postIncrementDecrement176=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement176.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2310);
					preIncrementDecrement177=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement177.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set178=null;

		CommonTree set178_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set178=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set178)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:1: postIncrementDecrement : postFixVariableWithoutCall plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCall179 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus180 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCall=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCall");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:2: ( postFixVariableWithoutCall plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:4: postFixVariableWithoutCall plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCall_in_postIncrementDecrement2389);
			postFixVariableWithoutCall179=postFixVariableWithoutCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCall.add(postFixVariableWithoutCall179.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2391);
			plusPlusOrMinusMinus180=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus180.getTree());
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
			// 462:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCall.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCall179!=null?((Token)postFixVariableWithoutCall179.start):null), "post increment/decrement")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:465:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set181=null;

		CommonTree set181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:2: ( '++' | '--' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set181=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCall -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus182 =null;
		ParserRuleReturnScope postFixVariableWithoutCall183 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCall=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCall");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:2: ( plusPlusOrMinusMinus postFixVariableWithoutCall -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:4: plusPlusOrMinusMinus postFixVariableWithoutCall
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2434);
			plusPlusOrMinusMinus182=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus182.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCall_in_preIncrementDecrement2436);
			postFixVariableWithoutCall183=postFixVariableWithoutCall();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCall.add(postFixVariableWithoutCall183.getTree());
			// AST REWRITE
			// elements: plusPlusOrMinusMinus, postFixVariableWithoutCall
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 472:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCall )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus182!=null?((Token)plusPlusOrMinusMinus182.start):null), "pre increment/decrement")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:475:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId185=null;
		Token char_literal186=null;
		ParserRuleReturnScope allTypes184 =null;
		ParserRuleReturnScope expression187 =null;

		CommonTree VariableId185_tree=null;
		CommonTree char_literal186_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:5: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2464);
			allTypes184=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes184.getTree());
			VariableId185=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2466); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId185);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:25: ( '=' expression )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Assign) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:26: '=' expression
					{
					char_literal186=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2469); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal186);

					pushFollow(FOLLOW_expression_in_variableDeclaration2471);
					expression187=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression187.getTree());
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
			// 476:43: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:46: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes184!=null?((Token)allTypes184.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:476:129: ( expression )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak188 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2497);
			logicOrWeak188=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak188.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


	public static class expressionForTest_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionForTest"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:1: expressionForTest : expression ';' !;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal190=null;
		ParserRuleReturnScope expression189 =null;

		CommonTree char_literal190_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:2: ( expression ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:4: expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2506);
			expression189=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression189.getTree());

			char_literal190=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2508); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, expressionForTest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionForTest"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal192=null;
		ParserRuleReturnScope logicXorWeak191 =null;
		ParserRuleReturnScope logicXorWeak193 =null;

		CommonTree string_literal192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2518);
			logicXorWeak191=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak191.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:17: ( 'or' ^ logicXorWeak )*
			loop59:
			do {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==LogicOrWeak) ) {
					int LA59_2 = input.LA(2);
					if ( (synpred98_TSPHP()) ) {
						alt59=1;
					}

				}

				switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:18: 'or' ^ logicXorWeak
					{
					string_literal192=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2521); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal192_tree = 
					(CommonTree)adaptor.create(string_literal192)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal192_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2524);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal195=null;
		ParserRuleReturnScope logicAndWeak194 =null;
		ParserRuleReturnScope logicAndWeak196 =null;

		CommonTree string_literal195_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2537);
			logicAndWeak194=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak194.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:17: ( 'xor' ^ logicAndWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicXorWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred99_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:18: 'xor' ^ logicAndWeak
					{
					string_literal195=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2540); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(CommonTree)adaptor.create(string_literal195)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal195_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2543);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal198=null;
		ParserRuleReturnScope assignment197 =null;
		ParserRuleReturnScope assignment199 =null;

		CommonTree string_literal198_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2556);
			assignment197=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment197.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:15: ( 'and' ^ assignment )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicAndWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred100_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:16: 'and' ^ assignment
					{
					string_literal198=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2559); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = 
					(CommonTree)adaptor.create(string_literal198)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2562);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary200 =null;
		ParserRuleReturnScope assignmentOperator201 =null;
		ParserRuleReturnScope ternary202 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2573);
			ternary200=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary200.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:12: ( assignmentOperator ^ ternary )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Assign||LA62_0==BitwiseAndEqual||LA62_0==BitwiseOrEqual||LA62_0==BitwiseXorEqual||LA62_0==DivideEqual||LA62_0==DotEqual||LA62_0==MinusEqual||LA62_0==ModuloEqual||LA62_0==MultiplyEqual||LA62_0==PlusEqual||LA62_0==ShiftLeftEqual||LA62_0==ShiftRightEqual) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2576);
					assignmentOperator201=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator201.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2579);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal204=null;
		Token char_literal206=null;
		ParserRuleReturnScope logicOr203 =null;
		ParserRuleReturnScope expression205 =null;
		ParserRuleReturnScope expression207 =null;

		CommonTree char_literal204_tree=null;
		CommonTree char_literal206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2589);
			logicOr203=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr203.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:19: ( '?' ^ expression ':' ! expression )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==QuestionMark) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:20: '?' ^ expression ':' ! expression
					{
					char_literal204=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2592); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal204_tree = 
					(CommonTree)adaptor.create(char_literal204)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal204_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2595);
					expression205=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression205.getTree());

					char_literal206=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2597); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2600);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal209=null;
		ParserRuleReturnScope logicAnd208 =null;
		ParserRuleReturnScope logicAnd210 =null;

		CommonTree string_literal209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2610);
			logicAnd208=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd208.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:20: ( '||' ^ logicAnd )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicOr) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:21: '||' ^ logicAnd
					{
					string_literal209=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2613); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal209_tree = 
					(CommonTree)adaptor.create(string_literal209)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal209_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2616);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope bitwiseOr211 =null;
		ParserRuleReturnScope bitwiseOr213 =null;

		CommonTree string_literal212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2625);
			bitwiseOr211=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr211.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:21: ( '&&' ^ bitwiseOr )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAnd) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:22: '&&' ^ bitwiseOr
					{
					string_literal212=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2628); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = 
					(CommonTree)adaptor.create(string_literal212)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2631);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal215=null;
		ParserRuleReturnScope bitwiseXor214 =null;
		ParserRuleReturnScope bitwiseXor216 =null;

		CommonTree char_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2642);
			bitwiseXor214=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor214.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:15: ( '|' ^ bitwiseXor )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==BitwiseOr) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:16: '|' ^ bitwiseXor
					{
					char_literal215=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2645); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal215_tree = 
					(CommonTree)adaptor.create(char_literal215)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2648);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope bitwiseAnd217 =null;
		ParserRuleReturnScope bitwiseAnd219 =null;

		CommonTree char_literal218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2659);
			bitwiseAnd217=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd217.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:15: ( '^' ^ bitwiseAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseXor) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:16: '^' ^ bitwiseAnd
					{
					char_literal218=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal218_tree = 
					(CommonTree)adaptor.create(char_literal218)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal218_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2665);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal221=null;
		ParserRuleReturnScope equality220 =null;
		ParserRuleReturnScope equality222 =null;

		CommonTree char_literal221_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2676);
			equality220=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality220.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:13: ( '&' ^ equality )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:14: '&' ^ equality
					{
					char_literal221=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2679); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal221_tree = 
					(CommonTree)adaptor.create(char_literal221)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal221_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2682);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison223 =null;
		ParserRuleReturnScope equalityOperator224 =null;
		ParserRuleReturnScope comparison225 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2691);
			comparison223=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison223.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:22: ( equalityOperator ^ comparison )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Equal||LA69_0==Identical||(LA69_0 >= NotEqual && LA69_0 <= NotIdentical)) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2694);
					equalityOperator224=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator224.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2697);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set226=null;

		CommonTree set226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set226=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set226)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift227 =null;
		ParserRuleReturnScope comparisonOperator228 =null;
		ParserRuleReturnScope bitwiseShift229 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2739);
			bitwiseShift227=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift227.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:17: ( comparisonOperator ^ bitwiseShift )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( ((LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||(LA70_0 >= LessEqualThan && LA70_0 <= LessThan)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2742);
					comparisonOperator228=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator228.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2745);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:524:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set230=null;

		CommonTree set230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set230=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set230)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set232=null;
		ParserRuleReturnScope termOrStringConcatenation231 =null;
		ParserRuleReturnScope termOrStringConcatenation233 =null;

		CommonTree set232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2781);
			termOrStringConcatenation231=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation231.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ShiftLeft||LA71_0==ShiftRight) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set232=(Token)input.LT(1);
					set232=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2791);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set235=null;
		ParserRuleReturnScope factor234 =null;
		ParserRuleReturnScope factor236 =null;

		CommonTree set235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2801);
			factor234=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor234.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==Dot||LA72_0==Minus||LA72_0==Plus) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:37: ( '+' | '-' | '.' ) ^ factor
					{
					set235=(Token)input.LT(1);
					set235=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2813);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set238=null;
		ParserRuleReturnScope logicNot237 =null;
		ParserRuleReturnScope logicNot239 =null;

		CommonTree set238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2823);
			logicNot237=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot237.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Divide||LA73_0==Modulo||LA73_0==Multiply) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set238=(Token)input.LT(1);
					set238=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
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
					pushFollow(FOLLOW_logicNot_in_factor2835);
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal240=null;
		ParserRuleReturnScope logicNot241 =null;
		ParserRuleReturnScope instanceOf242 =null;

		CommonTree char_literal240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:9: ( '!' ^ logicNot | instanceOf )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal240=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2844); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal240_tree = 
					(CommonTree)adaptor.create(char_literal240)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal240_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2847);
					logicNot241=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot241.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2852);
					instanceOf242=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf242.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal244=null;
		Token VariableId246=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt243 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject245 =null;

		CommonTree string_literal244_tree=null;
		CommonTree VariableId246_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2863);
			castOrBitwiseNotOrAt243=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt243.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Instanceof) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal244=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal244_tree = 
					(CommonTree)adaptor.create(string_literal244)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal244_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2870);
							classInterfaceTypeWithoutObject245=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject245.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:73: VariableId
							{
							VariableId246=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2872); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId246_tree = 
							(CommonTree)adaptor.create(VariableId246)
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
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal248=null;
		Token char_literal250=null;
		Token char_literal252=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource247 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt249 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt251 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt253 =null;
		ParserRuleReturnScope cloneOrNew254 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal248_tree=null;
		CommonTree char_literal250_tree=null;
		CommonTree char_literal252_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
			int alt77=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA77_1 = input.LA(2);
				if ( (synpred128_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2888); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2890);
					allTypesWithoutObjectAndResource247=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource247.getTree());
					char_literal248=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal248);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2894);
					castOrBitwiseNotOrAt249=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt249.getTree());
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
					// 545:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:546:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal250=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2910); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal250_tree = 
					(CommonTree)adaptor.create(char_literal250)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal250_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2913);
					castOrBitwiseNotOrAt251=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt251.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal252=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal252_tree = 
					(CommonTree)adaptor.create(char_literal252)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal252_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2921);
					castOrBitwiseNotOrAt253=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt253.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2927);
					cloneOrNew254=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew254.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:1: cloneOrNew : ( 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall ) | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal255=null;
		ParserRuleReturnScope postFixCallInclAccesAtTheEnd256 =null;
		ParserRuleReturnScope postFixVariableInclCall257 =null;
		ParserRuleReturnScope newObject258 =null;
		ParserRuleReturnScope unaryPrimary259 =null;

		CommonTree string_literal255_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:2: ( 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall ) | newObject | unaryPrimary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: 'clone' ^ ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall )
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal255=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew2938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal255_tree = 
					(CommonTree)adaptor.create(string_literal255)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal255_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:13: ( postFixCallInclAccesAtTheEnd | postFixVariableInclCall )
					int alt78=2;
					switch ( input.LA(1) ) {
					case Backslash:
						{
						int LA78_1 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
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
					case Identifier:
						{
						int LA78_2 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 78, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case SelfColonColon:
						{
						int LA78_3 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 78, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case ParentColonColon:
						{
						int LA78_4 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 78, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case This:
						{
						int LA78_5 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 78, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case VariableId:
						{
						int LA78_6 = input.LA(2);
						if ( (synpred131_TSPHP()) ) {
							alt78=1;
						}
						else if ( (true) ) {
							alt78=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 78, 6, input);
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
							new NoViableAltException("", 78, 0, input);
						throw nvae;
					}
					switch (alt78) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:14: postFixCallInclAccesAtTheEnd
							{
							pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_cloneOrNew2942);
							postFixCallInclAccesAtTheEnd256=postFixCallInclAccesAtTheEnd();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallInclAccesAtTheEnd256.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:43: postFixVariableInclCall
							{
							pushFollow(FOLLOW_postFixVariableInclCall_in_cloneOrNew2944);
							postFixVariableInclCall257=postFixVariableInclCall();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCall257.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew2950);
					newObject258=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject258.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew2955);
					unaryPrimary259=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary259.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId261=null;
		Token string_literal262=null;
		Token VariableId263=null;
		ParserRuleReturnScope staticAccessOrParent260 =null;

		CommonTree VariableId261_tree=null;
		CommonTree string_literal262_tree=null;
		CommonTree VariableId263_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2968);
					staticAccessOrParent260=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent260.getTree());
					VariableId261=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember2970); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId261);

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
					// 559:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent260!=null?((Token)staticAccessOrParent260.start):null), "static member access")
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal262=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember2986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal262_tree = 
					(CommonTree)adaptor.create(string_literal262)
					;
					adaptor.addChild(root_0, string_literal262_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId263=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember2991); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId263_tree = 
					(CommonTree)adaptor.create(VariableId263)
					;
					adaptor.addChild(root_0, VariableId263_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token p=null;
		Token string_literal265=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject264 =null;

		CommonTree s_tree=null;
		CommonTree p_tree=null;
		CommonTree string_literal265_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3005); if (state.failed) return retval; 
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
					// 565:15: -> Self[$s,\"self\"]
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3017); if (state.failed) return retval; 
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
					// 566:17: -> Parent[$p,\"parent\"]
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3027);
					classInterfaceTypeWithoutObject264=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject264.getTree());

					string_literal265=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3029); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal266=null;
		Token string_literal269=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject267 =null;
		ParserRuleReturnScope actualParameters268 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject270 =null;

		CommonTree string_literal266_tree=null;
		CommonTree string_literal269_tree=null;
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt82=2;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal266=(Token)match(input,New,FOLLOW_New_in_newObject3042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal266);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3044);
					classInterfaceTypeWithoutObject267=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject267.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3046);
					actualParameters268=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters268.getTree());
					// AST REWRITE
					// elements: actualParameters, classInterfaceTypeWithoutObject, New
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 571:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal269=(Token)match(input,New,FOLLOW_New_in_newObject3061); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal269);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3063);
					classInterfaceTypeWithoutObject270=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject270.getTree());
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
					// 572:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, (classInterfaceTypeWithoutObject270!=null?((Token)classInterfaceTypeWithoutObject270.stop):null), "expressions")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.actualParameters_return actualParameters() throws RecognitionException {
		TSPHPParser.actualParameters_return retval = new TSPHPParser.actualParameters_return();
		retval.start = input.LT(1);
		int actualParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token char_literal272=null;
		ParserRuleReturnScope expressionList271 =null;

		CommonTree list_tree=null;
		CommonTree char_literal272_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3087); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:13: ( expressionList )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==At||LA83_0==Backslash||LA83_0==BitwiseNot||LA83_0==Bool||LA83_0==Clone||LA83_0==Float||LA83_0==Identifier||LA83_0==Int||(LA83_0 >= LeftParanthesis && LA83_0 <= LeftSquareBrace)||LA83_0==LogicNot||LA83_0==Minus||LA83_0==MinusMinus||LA83_0==New||(LA83_0 >= Null && LA83_0 <= NullVariations)||(LA83_0 >= ParentColonColon && LA83_0 <= Plus)||LA83_0==PlusPlus||LA83_0==SelfColonColon||LA83_0==String||LA83_0==This||LA83_0==TypeArray||LA83_0==VariableId) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3089);
					expressionList271=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList271.getTree());
					}
					break;

			}

			char_literal272=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3092); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal272);

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
			// 576:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:75: ( expressionList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary273 =null;
		ParserRuleReturnScope primary274 =null;
		ParserRuleReturnScope primary275 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
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
			case NullVariations:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3117); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3119);
					primary273=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary273.getTree());
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
					// 580:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3137); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3139);
					primary274=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary274.getTree());
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
					// 581:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3153);
					primary275=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary275.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:1: primary : ( postFixCallInclAccesAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCallInclAccesAtTheEnd276 =null;
		ParserRuleReturnScope atom277 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:2: ( postFixCallInclAccesAtTheEnd | atom )
			int alt85=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA85_1 = input.LA(2);
				if ( (synpred142_TSPHP()) ) {
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
				if ( (synpred142_TSPHP()) ) {
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
				if ( (synpred142_TSPHP()) ) {
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
				if ( (synpred142_TSPHP()) ) {
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
				if ( (synpred142_TSPHP()) ) {
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
				if ( (synpred142_TSPHP()) ) {
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
			case NullVariations:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: postFixCallInclAccesAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_primary3165);
					postFixCallInclAccesAtTheEnd276=postFixCallInclAccesAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCallInclAccesAtTheEnd276.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3170);
					atom277=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom277.getTree());

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


	public static class postFixCallInclAccesAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCallInclAccesAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:1: postFixCallInclAccesAtTheEnd : ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )* ;
	public final TSPHPParser.postFixCallInclAccesAtTheEnd_return postFixCallInclAccesAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixCallInclAccesAtTheEnd_return retval = new TSPHPParser.postFixCallInclAccesAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixCallInclAccesAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier279=null;
		Token char_literal281=null;
		ParserRuleReturnScope postFixCallWithoutAccesAtTheEnd278 =null;
		ParserRuleReturnScope expression280 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier279_tree=null;
		CommonTree char_literal281_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_postFixCallWithoutAccesAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixCallWithoutAccesAtTheEnd");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:2: ( ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:4: ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:4: ( postFixCallWithoutAccesAtTheEnd -> postFixCallWithoutAccesAtTheEnd )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:5: postFixCallWithoutAccesAtTheEnd
			{
			pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_postFixCallInclAccesAtTheEnd3184);
			postFixCallWithoutAccesAtTheEnd278=postFixCallWithoutAccesAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixCallWithoutAccesAtTheEnd.add(postFixCallWithoutAccesAtTheEnd278.getTree());
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
			// 591:37: -> postFixCallWithoutAccesAtTheEnd
			{
				adaptor.addChild(root_0, stream_postFixCallWithoutAccesAtTheEnd.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression ) )*
			loop86:
			do {
				int alt86=3;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==ObjectOperator) ) {
					alt86=1;
				}
				else if ( (LA86_0==LeftSquareBrace) ) {
					alt86=2;
				}

				switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCallInclAccesAtTheEnd3199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier279=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCallInclAccesAtTheEnd3201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier279);

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
					// 592:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallInclAccesAtTheEnd Identifier )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCallInclAccesAtTheEnd3223); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCallInclAccesAtTheEnd3225);
					expression280=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression280.getTree());
					char_literal281=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCallInclAccesAtTheEnd3227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal281);

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
					// 593:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallInclAccesAtTheEnd expression )
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
			if ( state.backtracking>0 ) { memoize(input, 79, postFixCallInclAccesAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCallInclAccesAtTheEnd"


	public static class postFixCallWithoutAccesAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCallWithoutAccesAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:1: postFixCallWithoutAccesAtTheEnd : ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )* ;
	public final TSPHPParser.postFixCallWithoutAccesAtTheEnd_return postFixCallWithoutAccesAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixCallWithoutAccesAtTheEnd_return retval = new TSPHPParser.postFixCallWithoutAccesAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixCallWithoutAccesAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier284=null;
		Token char_literal286=null;
		ParserRuleReturnScope functionCall282 =null;
		ParserRuleReturnScope methodCall283 =null;
		ParserRuleReturnScope expression285 =null;
		ParserRuleReturnScope call287 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier284_tree=null;
		CommonTree char_literal286_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( functionCall -> functionCall | methodCall -> methodCall ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt87=2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCallWithoutAccesAtTheEnd3258);
					functionCall282=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall282.getTree());
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
					// 598:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCallWithoutAccesAtTheEnd3268);
					methodCall283=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall283.getTree());
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
					// 599:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:601:3: ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call ) )*
			loop89:
			do {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==ObjectOperator) ) {
					int LA89_2 = input.LA(2);
					if ( (synpred148_TSPHP()) ) {
						alt89=1;
					}

				}
				else if ( (LA89_0==LeftSquareBrace) ) {
					int LA89_3 = input.LA(2);
					if ( (synpred148_TSPHP()) ) {
						alt89=1;
					}

				}

				switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )* call
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression ) )*
					loop88:
					do {
						int alt88=3;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==ObjectOperator) ) {
							int LA88_1 = input.LA(2);
							if ( (LA88_1==Identifier) ) {
								int LA88_3 = input.LA(3);
								if ( (LA88_3==LeftSquareBrace||LA88_3==ObjectOperator) ) {
									alt88=1;
								}

							}

						}
						else if ( (LA88_0==LeftSquareBrace) ) {
							alt88=2;
						}

						switch (alt88) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCallWithoutAccesAtTheEnd3291); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier284=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCallWithoutAccesAtTheEnd3293); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier284);

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
							// 602:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCallWithoutAccesAtTheEnd Identifier )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCallWithoutAccesAtTheEnd3316); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixCallWithoutAccesAtTheEnd3318);
							expression285=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression285.getTree());
							char_literal286=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCallWithoutAccesAtTheEnd3320); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal286);

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
							// 603:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCallWithoutAccesAtTheEnd expression )
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
							break loop88;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_postFixCallWithoutAccesAtTheEnd3343);
					call287=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call287.getTree());
					// AST REWRITE
					// elements: postFixCallWithoutAccesAtTheEnd, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 605:9: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:605:12: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCallWithoutAccesAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call287!=null?((Token)call287.start):null), "method call")
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
					break loop89;
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
			if ( state.backtracking>0 ) { memoize(input, 80, postFixCallWithoutAccesAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCallWithoutAccesAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:609:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classInterfaceTypeWithoutObject288 =null;
		ParserRuleReturnScope actualParameters289 =null;

		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:610:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3371);
			classInterfaceTypeWithoutObject288=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject288.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3373);
			actualParameters289=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters289.getTree());
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
			// 611:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:611:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject288!=null?((Token)classInterfaceTypeWithoutObject288.start):null), "function call")
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
			if ( state.backtracking>0 ) { memoize(input, 81, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:1: call : '->' ! Identifier actualParameters ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal290=null;
		Token Identifier291=null;
		ParserRuleReturnScope actualParameters292 =null;

		CommonTree string_literal290_tree=null;
		CommonTree Identifier291_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:614:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal290=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3397); if (state.failed) return retval;
			Identifier291=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3400); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier291_tree = 
			(CommonTree)adaptor.create(Identifier291)
			;
			adaptor.addChild(root_0, Identifier291_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3402);
			actualParameters292=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters292.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:617:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier294=null;
		ParserRuleReturnScope callee293 =null;
		ParserRuleReturnScope actualParameters295 =null;

		CommonTree Identifier294_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:618:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3414);
			callee293=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee293.getTree());
			Identifier294=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier294);

			pushFollow(FOLLOW_actualParameters_in_methodCall3418);
			actualParameters295=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters295.getTree());
			// AST REWRITE
			// elements: actualParameters, Identifier, callee
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 619:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:619:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee293!=null?((Token)callee293.start):null), "method call")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal297=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember296 =null;
		ParserRuleReturnScope staticAccessOrParent298 =null;

		CommonTree string_literal297_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt90=2;
			alt90 = dfa90.predict(input);
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:622:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3444);
					variableOrMemberOrStaticMember296=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember296.getTree());

					string_literal297=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3446); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:623:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3452);
					staticAccessOrParent298=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent298.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCall | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal299=null;
		Token char_literal301=null;
		ParserRuleReturnScope expression300 =null;
		ParserRuleReturnScope incrementDecrement302 =null;
		ParserRuleReturnScope postFixVariableInclCall303 =null;
		ParserRuleReturnScope classConstant304 =null;
		ParserRuleReturnScope globalConstant305 =null;
		ParserRuleReturnScope array306 =null;
		ParserRuleReturnScope primitiveAtom307 =null;

		CommonTree char_literal299_tree=null;
		CommonTree char_literal301_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCall | classConstant | globalConstant | array | primitiveAtom )
			int alt91=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt91=1;
				}
				break;
			case SelfColonColon:
				{
				int LA91_2 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else if ( (synpred153_TSPHP()) ) {
					alt91=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA91_3 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else if ( (synpred153_TSPHP()) ) {
					alt91=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA91_4 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else if ( (synpred153_TSPHP()) ) {
					alt91=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA91_5 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else if ( (synpred153_TSPHP()) ) {
					alt91=4;
				}
				else if ( (synpred154_TSPHP()) ) {
					alt91=5;
				}
				else if ( (true) ) {
					alt91=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA91_6 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA91_7 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt91=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 7, input);
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
				alt91=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt91=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case NullVariations:
			case String:
				{
				alt91=7;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:626:8: '(' expression ')'
					{
					char_literal299=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal299);

					pushFollow(FOLLOW_expression_in_atom3464);
					expression300=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression300.getTree());
					char_literal301=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3466); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal301);

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
					// 626:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3475);
					incrementDecrement302=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement302.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: postFixVariableInclCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCall_in_atom3480);
					postFixVariableInclCall303=postFixVariableInclCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCall303.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3485);
					classConstant304=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant304.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3490);
					globalConstant305=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant305.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:631:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3495);
					array306=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array306.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:632:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3500);
					primitiveAtom307=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom307.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:635:1: postFixVariableWithoutCall : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )* ;
	public final TSPHPParser.postFixVariableWithoutCall_return postFixVariableWithoutCall() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCall_return retval = new TSPHPParser.postFixVariableWithoutCall_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier309=null;
		Token char_literal311=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember308 =null;
		ParserRuleReturnScope expression310 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier309_tree=null;
		CommonTree char_literal311_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:636:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCall3512);
			variableOrMemberOrStaticMember308=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember308.getTree());
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
			// 636:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:637:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression ) )*
			loop92:
			do {
				int alt92=3;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==ObjectOperator) ) {
					alt92=1;
				}
				else if ( (LA92_0==LeftSquareBrace) ) {
					alt92=2;
				}

				switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:638:4: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCall3530); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCall3532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier309);

					// AST REWRITE
					// elements: postFixVariableWithoutCall, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 638:35: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:638:38: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCall Identifier )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCall3554); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableWithoutCall3556);
					expression310=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression310.getTree());
					char_literal311=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCall3558); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal311);

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
					// 639:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:639:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCall expression )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:643:1: postFixVariableInclCall : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )* ;
	public final TSPHPParser.postFixVariableInclCall_return postFixVariableInclCall() throws RecognitionException {
		TSPHPParser.postFixVariableInclCall_return retval = new TSPHPParser.postFixVariableInclCall_return();
		retval.start = input.LT(1);
		int postFixVariableInclCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier313=null;
		Token char_literal315=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember312 =null;
		ParserRuleReturnScope expression314 =null;
		ParserRuleReturnScope call316 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier313_tree=null;
		CommonTree char_literal315_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )*
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:644:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCall3589);
			variableOrMemberOrStaticMember312=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember312.getTree());
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
			// 644:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call ) )*
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCall3604); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier313=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCall3606); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier313);

					// AST REWRITE
					// elements: postFixVariableInclCall, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 645:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:645:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCall Identifier )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCall3628); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCall3630);
					expression314=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression314.getTree());
					char_literal315=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCall3632); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal315);

					// AST REWRITE
					// elements: expression, postFixVariableInclCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 646:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:646:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCall expression )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:647:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCall3650);
					call316=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call316.getTree());
					// AST REWRITE
					// elements: call, postFixVariableInclCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 647:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:647:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call316!=null?((Token)call316.start):null), "method call")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:651:1: postFixMethodCallWithoutAccessAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+ ;
	public final TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return postFixMethodCallWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return retval = new TSPHPParser.postFixMethodCallWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixMethodCallWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier318=null;
		Token char_literal320=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember317 =null;
		ParserRuleReturnScope expression319 =null;
		ParserRuleReturnScope call321 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier318_tree=null;
		CommonTree char_literal320_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:652:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixMethodCallWithoutAccessAtTheEnd3680);
			variableOrMemberOrStaticMember317=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember317.getTree());
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:653:3: ( (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call ) )+
			int cnt95=0;
			loop95:
			do {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==LeftSquareBrace||LA95_0==ObjectOperator) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )* call
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression ) )*
					loop94:
					do {
						int alt94=3;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==ObjectOperator) ) {
							int LA94_1 = input.LA(2);
							if ( (LA94_1==Identifier) ) {
								int LA94_3 = input.LA(3);
								if ( (LA94_3==LeftSquareBrace||LA94_3==ObjectOperator) ) {
									alt94=1;
								}

							}

						}
						else if ( (LA94_0==LeftSquareBrace) ) {
							alt94=2;
						}

						switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixMethodCallWithoutAccessAtTheEnd3700); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier318=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixMethodCallWithoutAccessAtTheEnd3702); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier318);

							// AST REWRITE
							// elements: Identifier, postFixMethodCallWithoutAccessAtTheEnd
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {

							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 654:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixMethodCallWithoutAccessAtTheEnd Identifier )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3725); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixMethodCallWithoutAccessAtTheEnd3727);
							expression319=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression319.getTree());
							char_literal320=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3729); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal320);

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
							// 655:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression )
							{
								// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixMethodCallWithoutAccessAtTheEnd expression )
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

					pushFollow(FOLLOW_call_in_postFixMethodCallWithoutAccessAtTheEnd3752);
					call321=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call321.getTree());
					// AST REWRITE
					// elements: postFixMethodCallWithoutAccessAtTheEnd, call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 657:9: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:657:12: ^( METHOD_CALL[$call.start,\"method call\"] $postFixMethodCallWithoutAccessAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call321!=null?((Token)call321.start):null), "method call")
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
					if ( cnt95 >= 1 ) break loop95;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(95, input);
						throw eee;
				}
				cnt95++;
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


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:661:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier323=null;
		ParserRuleReturnScope staticAccessOrParent322 =null;

		CommonTree Identifier323_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3780);
			staticAccessOrParent322=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent322.getTree());
			Identifier323=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier323);

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
			// 662:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent322!=null?((Token)staticAccessOrParent322.start):null), "static member access")
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
			if ( state.backtracking>0 ) { memoize(input, 89, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier324=null;

		CommonTree Identifier324_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier324=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3805); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier324_tree = 
			(CommonTree)adaptor.create(Identifier324)
			;
			adaptor.addChild(root_0, Identifier324_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 90, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:669:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primitiveAtom325 =null;
		ParserRuleReturnScope primitiveAtom326 =null;
		ParserRuleReturnScope primitiveAtom327 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule primitiveAtom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom )
			int alt96=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt96=1;
				}
				break;
			case Minus:
				{
				alt96=2;
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
				alt96=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3821); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3823);
					primitiveAtom325=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom325.getTree());
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
					// 670:30: -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:33: ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3841); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3843);
					primitiveAtom326=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom326.getTree());
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
					// 671:31: -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:34: ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3857);
					primitiveAtom327=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom327.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:1: primitiveAtom : ( Bool | Int | Float | String |n= ( Null | NullVariations ) -> Null[$n,\"null\"] | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token n=null;
		Token Bool328=null;
		Token Int329=null;
		Token Float330=null;
		Token String331=null;
		Token Null332=null;
		Token NullVariations333=null;
		Token Identifier334=null;

		CommonTree n_tree=null;
		CommonTree Bool328_tree=null;
		CommonTree Int329_tree=null;
		CommonTree Float330_tree=null;
		CommonTree String331_tree=null;
		CommonTree Null332_tree=null;
		CommonTree NullVariations333_tree=null;
		CommonTree Identifier334_tree=null;
		RewriteRuleTokenStream stream_NullVariations=new RewriteRuleTokenStream(adaptor,"token NullVariations");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:2: ( Bool | Int | Float | String |n= ( Null | NullVariations ) -> Null[$n,\"null\"] | Identifier )
			int alt98=6;
			switch ( input.LA(1) ) {
			case Bool:
				{
				alt98=1;
				}
				break;
			case Int:
				{
				alt98=2;
				}
				break;
			case Float:
				{
				alt98=3;
				}
				break;
			case String:
				{
				alt98=4;
				}
				break;
			case Null:
			case NullVariations:
				{
				alt98=5;
				}
				break;
			case Identifier:
				{
				alt98=6;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:4: Bool
					{
					root_0 = (CommonTree)adaptor.nil();


					Bool328=(Token)match(input,Bool,FOLLOW_Bool_in_primitiveAtom3868); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Bool328_tree = 
					(CommonTree)adaptor.create(Bool328)
					;
					adaptor.addChild(root_0, Bool328_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:677:4: Int
					{
					root_0 = (CommonTree)adaptor.nil();


					Int329=(Token)match(input,Int,FOLLOW_Int_in_primitiveAtom3873); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Int329_tree = 
					(CommonTree)adaptor.create(Int329)
					;
					adaptor.addChild(root_0, Int329_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:4: Float
					{
					root_0 = (CommonTree)adaptor.nil();


					Float330=(Token)match(input,Float,FOLLOW_Float_in_primitiveAtom3878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Float330_tree = 
					(CommonTree)adaptor.create(Float330)
					;
					adaptor.addChild(root_0, Float330_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:679:4: String
					{
					root_0 = (CommonTree)adaptor.nil();


					String331=(Token)match(input,String,FOLLOW_String_in_primitiveAtom3883); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					String331_tree = 
					(CommonTree)adaptor.create(String331)
					;
					adaptor.addChild(root_0, String331_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:4: n= ( Null | NullVariations )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:6: ( Null | NullVariations )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==Null) ) {
						alt97=1;
					}
					else if ( (LA97_0==NullVariations) ) {
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:7: Null
							{
							Null332=(Token)match(input,Null,FOLLOW_Null_in_primitiveAtom3891); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Null.add(Null332);

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:12: NullVariations
							{
							NullVariations333=(Token)match(input,NullVariations,FOLLOW_NullVariations_in_primitiveAtom3893); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NullVariations.add(NullVariations333);

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
					// 680:28: -> Null[$n,\"null\"]
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier334=(Token)match(input,Identifier,FOLLOW_Identifier_in_primitiveAtom3904); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier334_tree = 
					(CommonTree)adaptor.create(Identifier334)
					;
					adaptor.addChild(root_0, Identifier334_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal336=null;
		Token TypeArray337=null;
		Token char_literal338=null;
		Token char_literal340=null;
		ParserRuleReturnScope arrayContent335 =null;
		ParserRuleReturnScope arrayContent339 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal336_tree=null;
		CommonTree TypeArray337_tree=null;
		CommonTree char_literal338_tree=null;
		CommonTree char_literal340_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4386); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:17: ( arrayContent )?
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==At||LA99_0==Backslash||LA99_0==BitwiseNot||LA99_0==Bool||LA99_0==Clone||LA99_0==Float||LA99_0==Identifier||LA99_0==Int||(LA99_0 >= LeftParanthesis && LA99_0 <= LeftSquareBrace)||LA99_0==LogicNot||LA99_0==Minus||LA99_0==MinusMinus||LA99_0==New||(LA99_0 >= Null && LA99_0 <= NullVariations)||(LA99_0 >= ParentColonColon && LA99_0 <= Plus)||LA99_0==PlusPlus||LA99_0==SelfColonColon||LA99_0==String||LA99_0==This||LA99_0==TypeArray||LA99_0==VariableId) ) {
						alt99=1;
					}
					switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4388);
							arrayContent335=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent335.getTree());
							}
							break;

					}

					char_literal336=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4391); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal336);

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
					// 746:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:746:65: ( arrayContent )?
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray337=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4407); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray337);

					char_literal338=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4409); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal338);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:18: ( arrayContent )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==At||LA100_0==Backslash||LA100_0==BitwiseNot||LA100_0==Bool||LA100_0==Clone||LA100_0==Float||LA100_0==Identifier||LA100_0==Int||(LA100_0 >= LeftParanthesis && LA100_0 <= LeftSquareBrace)||LA100_0==LogicNot||LA100_0==Minus||LA100_0==MinusMinus||LA100_0==New||(LA100_0 >= Null && LA100_0 <= NullVariations)||(LA100_0 >= ParentColonColon && LA100_0 <= Plus)||LA100_0==PlusPlus||LA100_0==SelfColonColon||LA100_0==String||LA100_0==This||LA100_0==TypeArray||LA100_0==VariableId) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4411);
							arrayContent339=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent339.getTree());
							}
							break;

					}

					char_literal340=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4414); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal340);

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
					// 747:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:747:51: ( arrayContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 93, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class arrayContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayContent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:750:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal342=null;
		ParserRuleReturnScope arrayKeyValue341 =null;
		ParserRuleReturnScope arrayKeyValue343 =null;

		CommonTree char_literal342_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4435);
			arrayKeyValue341=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue341.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:18: ( ',' ! arrayKeyValue )*
			loop102:
			do {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==Comma) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:751:19: ',' ! arrayKeyValue
					{
					char_literal342=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4438); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4441);
					arrayKeyValue343=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue343.getTree());

					}
					break;

				default :
					break loop102;
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
			if ( state.backtracking>0 ) { memoize(input, 94, arrayContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayContent"


	public static class arrayKeyValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:753:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal344=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression345 =null;

		CommonTree string_literal344_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
			int alt103=2;
			switch ( input.LA(1) ) {
			case LogicNot:
				{
				int LA103_1 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftParanthesis:
				{
				int LA103_2 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case BitwiseNot:
				{
				int LA103_3 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case At:
				{
				int LA103_4 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case Clone:
				{
				int LA103_5 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case New:
				{
				int LA103_6 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case Plus:
				{
				int LA103_7 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
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
			case Minus:
				{
				int LA103_8 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA103_9 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA103_10 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA103_11 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA103_12 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA103_13 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA103_14 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 14, input);
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
				int LA103_15 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
				{
				int LA103_16 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA103_17 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Bool:
				{
				int LA103_18 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Int:
				{
				int LA103_19 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Float:
				{
				int LA103_20 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case String:
				{
				int LA103_21 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Null:
				{
				int LA103_22 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NullVariations:
				{
				int LA103_23 = input.LA(2);
				if ( (synpred176_TSPHP()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 23, input);
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
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4455);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal344=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4457); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal344);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4461);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(value.getTree());
					// AST REWRITE
					// elements: Arrow, key, value
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
					// 754:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:44: ^( '=>' $key $value)
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:755:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4478);
					expression345=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression345.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 95, arrayKeyValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayKeyValue"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:759:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal346=null;
		Token char_literal347=null;
		Token char_literal349=null;
		Token string_literal350=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression348 =null;

		CommonTree string_literal346_tree=null;
		CommonTree char_literal347_tree=null;
		CommonTree char_literal349_tree=null;
		CommonTree string_literal350_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:760:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:760:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal346=(Token)match(input,If,FOLLOW_If_in_ifCondition4491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal346);

			char_literal347=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4493); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal347);

			pushFollow(FOLLOW_expression_in_ifCondition4495);
			expression348=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression348.getTree());
			char_literal349=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal349);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4502);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==Else) ) {
				int LA104_1 = input.LA(2);
				if ( (synpred177_TSPHP()) ) {
					alt104=1;
				}
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal350=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4509); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal350);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4514);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: instructionElse, instructionThen, If, expression
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
			// 761:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:100: ( $instructionElse)?
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
			if ( state.backtracking>0 ) { memoize(input, 96, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:765:1: switchCondition : 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal351=null;
		Token char_literal352=null;
		Token VariableId353=null;
		Token char_literal354=null;
		Token char_literal355=null;
		Token char_literal357=null;
		ParserRuleReturnScope switchContent356 =null;

		CommonTree string_literal351_tree=null;
		CommonTree char_literal352_tree=null;
		CommonTree VariableId353_tree=null;
		CommonTree char_literal354_tree=null;
		CommonTree char_literal355_tree=null;
		CommonTree char_literal357_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:2: ( 'switch' '(' VariableId ')' '{' switchContent '}' -> ^( 'switch' VariableId switchContent ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:4: 'switch' '(' VariableId ')' '{' switchContent '}'
			{
			string_literal351=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4545); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal351);

			char_literal352=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4547); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal352);

			VariableId353=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId353);

			char_literal354=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal354);

			char_literal355=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4553); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal355);

			pushFollow(FOLLOW_switchContent_in_switchCondition4555);
			switchContent356=switchContent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_switchContent.add(switchContent356.getTree());
			char_literal357=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal357);

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
			// 766:55: -> ^( 'switch' VariableId switchContent )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:766:58: ^( 'switch' VariableId switchContent )
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
			if ( state.backtracking>0 ) { memoize(input, 97, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:769:1: switchContent : ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCase358 =null;
		ParserRuleReturnScope defaultCase359 =null;
		ParserRuleReturnScope normalCase360 =null;
		ParserRuleReturnScope normalCase361 =null;
		ParserRuleReturnScope defaultCase362 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:2: ( ( normalCase )+ defaultCase ( normalCase )+ | ( normalCase )+ ( defaultCase )? )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==Case) ) {
				int LA109_1 = input.LA(2);
				if ( (synpred180_TSPHP()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 109, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: ( normalCase )+ defaultCase ( normalCase )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: ( normalCase )+
					int cnt105=0;
					loop105:
					do {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==Case) ) {
							alt105=1;
						}

						switch (alt105) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4580);
							normalCase358=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase358.getTree());

							}
							break;

						default :
							if ( cnt105 >= 1 ) break loop105;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(105, input);
								throw eee;
						}
						cnt105++;
					} while (true);

					pushFollow(FOLLOW_defaultCase_in_switchContent4583);
					defaultCase359=defaultCase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase359.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:28: ( normalCase )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:28: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4585);
							normalCase360=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase360.getTree());

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

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:4: ( normalCase )+ ( defaultCase )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:4: ( normalCase )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:4: normalCase
							{
							pushFollow(FOLLOW_normalCase_in_switchContent4592);
							normalCase361=normalCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCase361.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:16: ( defaultCase )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==Default) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:771:16: defaultCase
							{
							pushFollow(FOLLOW_defaultCase_in_switchContent4595);
							defaultCase362=defaultCase();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCase362.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 98, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCase_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCase"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:774:1: normalCase : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.normalCase_return normalCase() throws RecognitionException {
		TSPHPParser.normalCase_return retval = new TSPHPParser.normalCase_return();
		retval.start = input.LT(1);
		int normalCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel363 =null;
		ParserRuleReturnScope instructionInclBreakContinue364 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:4: ( caseLabel )+
			int cnt110=0;
			loop110:
			do {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==Case) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCase4607);
					caseLabel363=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel363.getTree());
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:15: ( instructionInclBreakContinue )+
			int cnt111=0;
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==Backslash||LA111_0==Break||LA111_0==Continue||LA111_0==Do||LA111_0==Echo||LA111_0==Exit||(LA111_0 >= For && LA111_0 <= Foreach)||(LA111_0 >= Identifier && LA111_0 <= If)||LA111_0==LeftCurlyBrace||LA111_0==MinusMinus||LA111_0==ParentColonColon||LA111_0==PlusPlus||LA111_0==Return||LA111_0==SelfColonColon||(LA111_0 >= Switch && LA111_0 <= TypeString)||LA111_0==VariableId||LA111_0==While) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:775:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCase4610);
					instructionInclBreakContinue364=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue364.getTree());
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
			// 776:3: -> ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:776:6: ^( SWITCH_CASES[$normalCase.start,\"switch cases\"] ( caseLabel )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 99, normalCase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCase"


	public static class defaultCase_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCase"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:779:1: defaultCase : defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ ;
	public final TSPHPParser.defaultCase_return defaultCase() throws RecognitionException {
		TSPHPParser.defaultCase_return retval = new TSPHPParser.defaultCase_return();
		retval.start = input.LT(1);
		int defaultCase_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope defaultLabel365 =null;
		ParserRuleReturnScope instructionInclBreakContinue366 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:780:2: ( defaultLabel ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:780:4: defaultLabel ( instructionInclBreakContinue )+
			{
			pushFollow(FOLLOW_defaultLabel_in_defaultCase4641);
			defaultLabel365=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel365.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:780:17: ( instructionInclBreakContinue )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:780:17: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCase4643);
					instructionInclBreakContinue366=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue366.getTree());
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
			// 781:3: -> ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel ) ( instructionInclBreakContinue )+
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:781:6: ^( SWITCH_CASES[$defaultCase.start,\"switch cases\"] defaultLabel )
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
			if ( state.backtracking>0 ) { memoize(input, 100, defaultCase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCase"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:784:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal367=null;
		Token char_literal369=null;
		ParserRuleReturnScope expression368 =null;

		CommonTree string_literal367_tree=null;
		CommonTree char_literal369_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:785:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:785:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal367=(Token)match(input,Case,FOLLOW_Case_in_caseLabel4671); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel4674);
			expression368=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression368.getTree());

			char_literal369=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel4676); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:788:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal370=null;
		Token char_literal371=null;

		CommonTree string_literal370_tree=null;
		CommonTree char_literal371_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:789:2: ( 'default' ':' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:789:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal370=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel4688); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal370_tree = 
			(CommonTree)adaptor.create(string_literal370)
			;
			adaptor.addChild(root_0, string_literal370_tree);
			}

			char_literal371=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel4690); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:792:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal372=null;
		ParserRuleReturnScope forInit373 =null;
		ParserRuleReturnScope forCondition374 =null;
		ParserRuleReturnScope forUpdate375 =null;
		ParserRuleReturnScope instructionInclBreakContinue376 =null;

		CommonTree string_literal372_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:793:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:793:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal372=(Token)match(input,For,FOLLOW_For_in_forLoop4704); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal372_tree = 
			(CommonTree)adaptor.create(string_literal372)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal372_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop4707);
			forInit373=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit373.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop4709);
			forCondition374=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition374.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop4711);
			forUpdate375=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate375.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop4713);
			instructionInclBreakContinue376=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue376.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:796:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId377 =null;
		ParserRuleReturnScope expressionList378 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:797:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:797:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit4728); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:798:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt114=2;
			alt114 = dfa114.predict(input);
			switch (alt114) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:798:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit4735);
					variableDeclarationListInclVariableId377=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId377.getTree());
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
					// 798:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:798:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:5: ( expressionList )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:5: ( expressionList )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==At||LA113_0==Backslash||LA113_0==BitwiseNot||LA113_0==Bool||LA113_0==Clone||LA113_0==Float||LA113_0==Identifier||LA113_0==Int||(LA113_0 >= LeftParanthesis && LA113_0 <= LeftSquareBrace)||LA113_0==LogicNot||LA113_0==Minus||LA113_0==MinusMinus||LA113_0==New||(LA113_0 >= Null && LA113_0 <= NullVariations)||(LA113_0 >= ParentColonColon && LA113_0 <= Plus)||LA113_0==PlusPlus||LA113_0==SelfColonColon||LA113_0==String||LA113_0==This||LA113_0==TypeArray||LA113_0==VariableId) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit4750);
							expressionList378=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList378.getTree());
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
					// 799:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:799:63: ( expressionList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:803:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList379 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition4780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:18: ( expressionList )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==At||LA115_0==Backslash||LA115_0==BitwiseNot||LA115_0==Bool||LA115_0==Clone||LA115_0==Float||LA115_0==Identifier||LA115_0==Int||(LA115_0 >= LeftParanthesis && LA115_0 <= LeftSquareBrace)||LA115_0==LogicNot||LA115_0==Minus||LA115_0==MinusMinus||LA115_0==New||(LA115_0 >= Null && LA115_0 <= NullVariations)||(LA115_0 >= ParentColonColon && LA115_0 <= Plus)||LA115_0==PlusPlus||LA115_0==SelfColonColon||LA115_0==String||LA115_0==This||LA115_0==TypeArray||LA115_0==VariableId) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition4782);
					expressionList379=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList379.getTree());
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
			// 804:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:804:81: ( expressionList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:807:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal381=null;
		ParserRuleReturnScope expressionList380 =null;

		CommonTree update_tree=null;
		CommonTree char_literal381_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate4808); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:15: ( expressionList )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==At||LA116_0==Backslash||LA116_0==BitwiseNot||LA116_0==Bool||LA116_0==Clone||LA116_0==Float||LA116_0==Identifier||LA116_0==Int||(LA116_0 >= LeftParanthesis && LA116_0 <= LeftSquareBrace)||LA116_0==LogicNot||LA116_0==Minus||LA116_0==MinusMinus||LA116_0==New||(LA116_0 >= Null && LA116_0 <= NullVariations)||(LA116_0 >= ParentColonColon && LA116_0 <= Plus)||LA116_0==PlusPlus||LA116_0==SelfColonColon||LA116_0==String||LA116_0==This||LA116_0==TypeArray||LA116_0==VariableId) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate4810);
					expressionList380=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList380.getTree());
					}
					break;

			}

			char_literal381=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate4813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal381);

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
			// 808:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:808:79: ( expressionList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:811:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal382=null;
		Token char_literal383=null;
		Token string_literal385=null;
		Token string_literal386=null;
		Token char_literal387=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression384 =null;
		ParserRuleReturnScope instructionInclBreakContinue388 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal382_tree=null;
		CommonTree char_literal383_tree=null;
		CommonTree string_literal385_tree=null;
		CommonTree string_literal386_tree=null;
		CommonTree char_literal387_tree=null;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:812:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:812:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal382=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop4834); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal382);

			char_literal383=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop4836); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal383);

			pushFollow(FOLLOW_expression_in_foreachLoop4838);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression384.getTree());
			string_literal385=(Token)match(input,As,FOLLOW_As_in_foreachLoop4840); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal385);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:812:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt117=2;
			switch ( input.LA(1) ) {
				case TypeBool:
					{
					int LA117_1 = input.LA(2);
					if ( (LA117_1==VariableId) ) {
						int LA117_7 = input.LA(3);
						if ( (LA117_7==Arrow) ) {
							alt117=1;
						}
					}
					}
					break;
				case TypeBoolean:
					{
					int LA117_2 = input.LA(2);
					if ( (LA117_2==VariableId) ) {
						int LA117_7 = input.LA(3);
						if ( (LA117_7==Arrow) ) {
							alt117=1;
						}
					}
					}
					break;
				case TypeInt:
					{
					int LA117_3 = input.LA(2);
					if ( (LA117_3==VariableId) ) {
						int LA117_7 = input.LA(3);
						if ( (LA117_7==Arrow) ) {
							alt117=1;
						}
					}
					}
					break;
				case TypeFloat:
					{
					int LA117_4 = input.LA(2);
					if ( (LA117_4==VariableId) ) {
						int LA117_7 = input.LA(3);
						if ( (LA117_7==Arrow) ) {
							alt117=1;
						}
					}
					}
					break;
				case TypeString:
					{
					int LA117_5 = input.LA(2);
					if ( (LA117_5==VariableId) ) {
						int LA117_7 = input.LA(3);
						if ( (LA117_7==Arrow) ) {
							alt117=1;
						}
					}
					}
					break;
			}
			switch (alt117) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:812:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop4845);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal386=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop4851); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal386);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4857);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop4861); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal387=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop4863); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal387);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop4865);
			instructionInclBreakContinue388=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue388.getTree());
			// AST REWRITE
			// elements: expression, keyVarId, Foreach, instructionInclBreakContinue, keyType, valueVarId, valueType
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
			// 813:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:813:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:813:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:813:40: ( $keyVarId)?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:816:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal389=null;
		Token char_literal390=null;
		Token char_literal392=null;
		ParserRuleReturnScope expression391 =null;
		ParserRuleReturnScope instructionInclBreakContinue393 =null;

		CommonTree string_literal389_tree=null;
		CommonTree char_literal390_tree=null;
		CommonTree char_literal392_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:817:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:817:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal389=(Token)match(input,While,FOLLOW_While_in_whileLoop4903); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal389);

			char_literal390=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop4905); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal390);

			pushFollow(FOLLOW_expression_in_whileLoop4907);
			expression391=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression391.getTree());
			char_literal392=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop4909); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal392);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop4911);
			instructionInclBreakContinue393=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue393.getTree());
			// AST REWRITE
			// elements: expression, While, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 817:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:817:63: ^( 'while' expression instructionInclBreakContinue )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:820:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal394=null;
		Token string_literal396=null;
		Token char_literal397=null;
		Token char_literal399=null;
		Token char_literal400=null;
		ParserRuleReturnScope instructionInclBreakContinue395 =null;
		ParserRuleReturnScope expression398 =null;

		CommonTree string_literal394_tree=null;
		CommonTree string_literal396_tree=null;
		CommonTree char_literal397_tree=null;
		CommonTree char_literal399_tree=null;
		CommonTree char_literal400_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:821:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:821:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal394=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop4933); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal394);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop4935);
			instructionInclBreakContinue395=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue395.getTree());
			string_literal396=(Token)match(input,While,FOLLOW_While_in_doWhileLoop4937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal396);

			char_literal397=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop4939); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal397);

			pushFollow(FOLLOW_expression_in_doWhileLoop4941);
			expression398=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression398.getTree());
			char_literal399=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop4943); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal399);

			char_literal400=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop4945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal400);

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
			// 821:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:821:72: ^( 'do' instructionInclBreakContinue expression )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:824:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal401=null;
		Token char_literal403=null;
		ParserRuleReturnScope instructionInclBreakContinue402 =null;
		ParserRuleReturnScope catchBlock404 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal401_tree=null;
		CommonTree char_literal403_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )+ '}' ( catchBlock )+
			{
			string_literal401=(Token)match(input,Try,FOLLOW_Try_in_tryCatch4966); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal401);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4970); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:23: ( instructionInclBreakContinue )+
			int cnt118=0;
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==Backslash||LA118_0==Break||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= For && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==LeftCurlyBrace||LA118_0==MinusMinus||LA118_0==ParentColonColon||LA118_0==PlusPlus||LA118_0==Return||LA118_0==SelfColonColon||(LA118_0 >= Switch && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4972);
					instructionInclBreakContinue402=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue402.getTree());
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

			char_literal403=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4975); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal403);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:57: ( catchBlock )+
			int cnt119=0;
			loop119:
			do {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==Catch) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:825:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch4977);
					catchBlock404=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock404.getTree());
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
			// 826:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:826:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:826:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )+ )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:829:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal405=null;
		Token VariableId407=null;
		Token char_literal408=null;
		Token char_literal410=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject406 =null;
		ParserRuleReturnScope instructionInclBreakContinue409 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal405_tree=null;
		CommonTree VariableId407_tree=null;
		CommonTree char_literal408_tree=null;
		CommonTree char_literal410_tree=null;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:830:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:830:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal405=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock5009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal405);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock5013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5015);
			classInterfaceTypeWithoutObject406=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject406.getTree());
			VariableId407=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock5017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId407);

			char_literal408=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock5019); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal408);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5023); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:830:83: ( instructionInclBreakContinue )*
			loop120:
			do {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==Backslash||LA120_0==Break||LA120_0==Continue||LA120_0==Do||LA120_0==Echo||LA120_0==Exit||(LA120_0 >= For && LA120_0 <= Foreach)||(LA120_0 >= Identifier && LA120_0 <= If)||LA120_0==LeftCurlyBrace||LA120_0==MinusMinus||LA120_0==ParentColonColon||LA120_0==PlusPlus||LA120_0==Return||LA120_0==SelfColonColon||(LA120_0 >= Switch && LA120_0 <= TypeString)||LA120_0==VariableId||LA120_0==While) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:830:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5025);
					instructionInclBreakContinue409=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue409.getTree());
					}
					break;

				default :
					break loop120;
				}
			} while (true);

			char_literal410=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5028); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal410);

			// AST REWRITE
			// elements: classInterfaceTypeWithoutObject, instructionInclBreakContinue, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 831:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:831:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variable declarations")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:832:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject406!=null?((Token)classInterfaceTypeWithoutObject406.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:834:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:834:32: ( instructionInclBreakContinue )*
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:837:1: throwException : 'throw' ^ newObject ';' !;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal411=null;
		Token char_literal413=null;
		ParserRuleReturnScope newObject412 =null;

		CommonTree string_literal411_tree=null;
		CommonTree char_literal413_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:838:2: ( 'throw' ^ newObject ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:838:4: 'throw' ^ newObject ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal411=(Token)match(input,Throw,FOLLOW_Throw_in_throwException5074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal411_tree = 
			(CommonTree)adaptor.create(string_literal411)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal411_tree, root_0);
			}

			pushFollow(FOLLOW_newObject_in_throwException5077);
			newObject412=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject412.getTree());

			char_literal413=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException5079); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

	// $ANTLR start synpred67_TSPHP
	public final void synpred67_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred67_TSPHP2151);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred67_TSPHP2153); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred67_TSPHP

	// $ANTLR start synpred68_TSPHP
	public final void synpred68_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred68_TSPHP2159);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred68_TSPHP2161); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred68_TSPHP

	// $ANTLR start synpred69_TSPHP
	public final void synpred69_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: ( incrementDecrement ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:4: incrementDecrement ';'
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred69_TSPHP2167);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP2169); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred78_TSPHP
	public final void synpred78_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:4: ( postFixCallWithoutAccesAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:4: postFixCallWithoutAccesAtTheEnd ';'
		{
		pushFollow(FOLLOW_postFixCallWithoutAccesAtTheEnd_in_synpred78_TSPHP2215);
		postFixCallWithoutAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred78_TSPHP2217); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred78_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: ( postFixMethodCallWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: postFixMethodCallWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_synpred79_TSPHP2223);
		postFixMethodCallWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP2225); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred98_TSPHP
	public final void synpred98_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred98_TSPHP2521); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred98_TSPHP2524);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred98_TSPHP

	// $ANTLR start synpred99_TSPHP
	public final void synpred99_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred99_TSPHP2540); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred99_TSPHP2543);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred99_TSPHP

	// $ANTLR start synpred100_TSPHP
	public final void synpred100_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred100_TSPHP2559); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred100_TSPHP2562);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred100_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred101_TSPHP2576);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred101_TSPHP2579);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred128_TSPHP
	public final void synpred128_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred128_TSPHP2888); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred128_TSPHP2890);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred128_TSPHP2892); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred128_TSPHP2894);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred128_TSPHP

	// $ANTLR start synpred131_TSPHP
	public final void synpred131_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:14: ( postFixCallInclAccesAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:14: postFixCallInclAccesAtTheEnd
		{
		pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred131_TSPHP2942);
		postFixCallInclAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred131_TSPHP

	// $ANTLR start synpred142_TSPHP
	public final void synpred142_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: ( postFixCallInclAccesAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: postFixCallInclAccesAtTheEnd
		{
		pushFollow(FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred142_TSPHP3165);
		postFixCallInclAccesAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred142_TSPHP

	// $ANTLR start synpred148_TSPHP
	public final void synpred148_TSPHP_fragment() throws RecognitionException {
		Token memberAccess=null;
		Token arrayAccess=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: ( (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )* call
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:4: (memberAccess= '->' Identifier |arrayAccess= '[' expression ']' )*
		loop133:
		do {
			int alt133=3;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==ObjectOperator) ) {
				int LA133_1 = input.LA(2);
				if ( (LA133_1==Identifier) ) {
					int LA133_3 = input.LA(3);
					if ( (LA133_3==LeftSquareBrace||LA133_3==ObjectOperator) ) {
						alt133=1;
					}

				}

			}
			else if ( (LA133_0==LeftSquareBrace) ) {
				alt133=2;
			}

			switch (alt133) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:6: memberAccess= '->' Identifier
				{
				memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_synpred148_TSPHP3291); if (state.failed) return ;

				match(input,Identifier,FOLLOW_Identifier_in_synpred148_TSPHP3293); if (state.failed) return ;

				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:6: arrayAccess= '[' expression ']'
				{
				arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_synpred148_TSPHP3316); if (state.failed) return ;

				pushFollow(FOLLOW_expression_in_synpred148_TSPHP3318);
				expression();
				state._fsp--;
				if (state.failed) return ;

				match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_synpred148_TSPHP3320); if (state.failed) return ;

				}
				break;

			default :
				break loop133;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred148_TSPHP3343);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred148_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:627:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred151_TSPHP3475);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred152_TSPHP
	public final void synpred152_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: ( postFixVariableInclCall )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:628:4: postFixVariableInclCall
		{
		pushFollow(FOLLOW_postFixVariableInclCall_in_synpred152_TSPHP3480);
		postFixVariableInclCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred152_TSPHP

	// $ANTLR start synpred153_TSPHP
	public final void synpred153_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:629:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred153_TSPHP3485);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred153_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:630:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred154_TSPHP3490);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred176_TSPHP
	public final void synpred176_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:754:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred176_TSPHP4455);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred176_TSPHP4457); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred176_TSPHP4461);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred176_TSPHP

	// $ANTLR start synpred177_TSPHP
	public final void synpred177_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:761:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred177_TSPHP4509); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred177_TSPHP4514);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred177_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: ( ( normalCase )+ defaultCase ( normalCase )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: ( normalCase )+ defaultCase ( normalCase )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: ( normalCase )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:4: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred180_TSPHP4580);
				normalCase();
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

		pushFollow(FOLLOW_defaultCase_in_synpred180_TSPHP4583);
		defaultCase();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:28: ( normalCase )+
		int cnt137=0;
		loop137:
		do {
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==Case) ) {
				alt137=1;
			}

			switch (alt137) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:770:28: normalCase
				{
				pushFollow(FOLLOW_normalCase_in_synpred180_TSPHP4585);
				normalCase();
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

	}
	// $ANTLR end synpred180_TSPHP

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
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA46 dfa46 = new DFA46(this);
	protected DFA82 dfa82 = new DFA82(this);
	protected DFA87 dfa87 = new DFA87(this);
	protected DFA90 dfa90 = new DFA90(this);
	protected DFA114 dfa114 = new DFA114(this);
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
			"\1\2\6\uffff\1\2\17\uffff\1\2\4\uffff\1\2\5\uffff\1\2\6\uffff\1\2\2\uffff"+
			"\1\2\3\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\17\uffff\1\2\4\uffff"+
			"\1\1\15\uffff\1\2\2\uffff\1\2\5\uffff\1\2\7\uffff\1\2\7\uffff\14\2\2"+
			"\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
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
			return "388:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclaration ( ',' ! paramDeclaration )* ( ',' ! paramDeclarationOptional )* );";
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
			return "()* loopback of 390:21: ( ',' ! paramDeclaration )*";
		}
	}

	static final String DFA82_eotS =
		"\10\uffff";
	static final String DFA82_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA82_minS =
		"\1\132\1\14\1\76\1\6\1\76\2\uffff\1\6";
	static final String DFA82_maxS =
		"\1\132\2\76\1\175\1\76\2\uffff\1\175";
	static final String DFA82_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA82_specialS =
		"\10\uffff}>";
	static final String[] DFA82_transitionS = {
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
			return "570:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA87_eotS =
		"\7\uffff";
	static final String DFA87_eofS =
		"\7\uffff";
	static final String DFA87_minS =
		"\1\14\1\76\1\14\1\uffff\1\76\1\uffff\1\14";
	static final String DFA87_maxS =
		"\1\u0091\1\76\1\105\1\uffff\1\76\1\uffff\1\105";
	static final String DFA87_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA87_specialS =
		"\7\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\1\61\uffff\1\2\50\uffff\1\3\20\uffff\1\3\10\uffff\1\3\17\uffff\1\3",
			"\1\2",
			"\1\4\36\uffff\1\3\31\uffff\1\5",
			"",
			"\1\6",
			"",
			"\1\4\36\uffff\1\3\31\uffff\1\5"
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
			return "598:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA90_eotS =
		"\12\uffff";
	static final String DFA90_eofS =
		"\12\uffff";
	static final String DFA90_minS =
		"\1\14\3\76\1\14\2\uffff\2\76\1\14";
	static final String DFA90_maxS =
		"\3\u0091\1\76\1\53\2\uffff\1\76\1\u0091\1\53";
	static final String DFA90_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA90_specialS =
		"\12\uffff}>";
	static final String[] DFA90_transitionS = {
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
			return "622:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA114_eotS =
		"\11\uffff";
	static final String DFA114_eofS =
		"\11\uffff";
	static final String DFA114_minS =
		"\1\11\1\uffff\1\105\1\76\1\10\1\uffff\1\14\1\76\1\14";
	static final String DFA114_maxS =
		"\1\u0091\1\uffff\1\u0091\1\76\1\u0091\1\uffff\1\u0091\1\76\1\u0091";
	static final String DFA114_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA114_specialS =
		"\11\uffff}>";
	static final String[] DFA114_transitionS = {
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
			return "798:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
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
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1054 = new BitSet(new long[]{0xC3A2408210001020L,0x0101048000100018L,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1056 = new BitSet(new long[]{0xC3A2408210001022L,0x0101048000100018L,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1069 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1074 = new BitSet(new long[]{0xC3A2408210001020L,0x0101048000100018L,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1076 = new BitSet(new long[]{0xC3A2408210001020L,0x0103048000100018L,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1182 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1185 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1187 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1207 = new BitSet(new long[]{0xC3A2408210001022L,0x0101048000100018L,0x00000000000A4FFFL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1242 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1244 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1247 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1249 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1268 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1270 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1272 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1280 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1282 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1293 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1345 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1347 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1355 = new BitSet(new long[]{0x0220000200000020L,0x4000680000000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1357 = new BitSet(new long[]{0x0220000200000020L,0x4002680000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1374 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1387 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1390 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1392 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1405 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000009E0L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1446 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1448 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1451 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1453 = new BitSet(new long[]{0x0000000080000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1483 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1485 = new BitSet(new long[]{0x4040000000100000L,0x80000100C0040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1500 = new BitSet(new long[]{0x0000000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1503 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1505 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1546 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1553 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1555 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1574 = new BitSet(new long[]{0x0200000000000000L,0x0000600000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1576 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1590 = new BitSet(new long[]{0x0220000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1592 = new BitSet(new long[]{0x0200000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1600 = new BitSet(new long[]{0x0200000000000000L,0x4000680000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1602 = new BitSet(new long[]{0x0200000000000000L,0x0000680000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1616 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1635 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000011L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1642 = new BitSet(new long[]{0x0200000200000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1644 = new BitSet(new long[]{0x0200000200000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1674 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1677 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1700 = new BitSet(new long[]{0xC182408000001000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1702 = new BitSet(new long[]{0xC182408000001000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1737 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000040FF0L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1740 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters1758 = new BitSet(new long[]{0x4000000000001000L,0x0004000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramList_in_formalParameters1760 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters1763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBool_in_primitiveTypes1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBoolean_in_primitiveTypes1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeInt_in_primitiveTypes1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeFloat_in_primitiveTypes1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeString_in_primitiveTypes1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1906 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1954 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1957 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1960 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1968 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1971 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1974 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1979 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000000FF0L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1982 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationOptional2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationOptional2021 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2024 = new BitSet(new long[]{0x4040000000100000L,0x80000100C0040004L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2065 = new BitSet(new long[]{0xC182408000001000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2067 = new BitSet(new long[]{0xC182408000001000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2102 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2104 = new BitSet(new long[]{0xC182408400201000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2128 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000004L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2135 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2151 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2159 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_instruction2167 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction2210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_instruction2215 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_instruction2223 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2231 = new BitSet(new long[]{0x4040000020109200L,0x83000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_instruction2234 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2243 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_instruction2246 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2254 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2269 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2272 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_expressionList2275 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2288 = new BitSet(new long[]{0x00000440000A4100L,0x2800020001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2290 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCall_in_postIncrementDecrement2389 = new BitSet(new long[]{0x0000000000000000L,0x0000040000100000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2434 = new BitSet(new long[]{0x4000000000001000L,0x0100008000000000L,0x0000000000020002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCall_in_preIncrementDecrement2436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2466 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2469 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2506 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2521 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2540 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2543 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2559 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_ternary_in_assignment2573 = new BitSet(new long[]{0x00000440000A4102L,0x2800020001480000L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2576 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_ternary_in_assignment2579 = new BitSet(new long[]{0x00000440000A4102L,0x2800020001480000L});
	public static final BitSet FOLLOW_logicOr_in_ternary2589 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2592 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ternary2595 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2597 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ternary2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2613 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2628 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2642 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2645 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2648 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2659 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2662 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2665 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2676 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2679 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2682 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality2691 = new BitSet(new long[]{0x2001000000000002L,0x0000000038000000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2694 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_comparison_in_equality2697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2739 = new BitSet(new long[]{0x0C00000000000002L,0x0000000000000180L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2742 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2781 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2784 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2791 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2801 = new BitSet(new long[]{0x0000020000000002L,0x0000010000040000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2804 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2813 = new BitSet(new long[]{0x0000020000000002L,0x0000010000040000L});
	public static final BitSet FOLLOW_logicNot_in_factor2823 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_set_in_factor2826 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicNot_in_factor2835 = new BitSet(new long[]{0x0000002000000002L,0x0000000000A00000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2844 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2866 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2888 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt2890 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2892 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2910 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2918 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt2927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew2938 = new BitSet(new long[]{0x4000000000001000L,0x0100008000000000L,0x0000000000020002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_cloneOrNew2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_cloneOrNew2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember2968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember2970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember2986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3027 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3042 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3061 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3087 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3089 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3117 = new BitSet(new long[]{0x4040000000101000L,0x81000480C0100064L,0x0000000000020012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3137 = new BitSet(new long[]{0x4040000000101000L,0x81000480C0100064L,0x0000000000020012L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_primary3165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_postFixCallInclAccesAtTheEnd3184 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCallInclAccesAtTheEnd3199 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCallInclAccesAtTheEnd3201 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCallInclAccesAtTheEnd3223 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixCallInclAccesAtTheEnd3225 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCallInclAccesAtTheEnd3227 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_functionCall_in_postFixCallWithoutAccesAtTheEnd3258 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_methodCall_in_postFixCallWithoutAccesAtTheEnd3268 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCallWithoutAccesAtTheEnd3291 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixCallWithoutAccesAtTheEnd3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCallWithoutAccesAtTheEnd3316 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixCallWithoutAccesAtTheEnd3318 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCallWithoutAccesAtTheEnd3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixCallWithoutAccesAtTheEnd3343 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3397 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_call3402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3414 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3462 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_atom3464 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_atom3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCall3512 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCall3530 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCall3532 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCall3554 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCall3556 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCall3558 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCall3589 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCall3604 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCall3606 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCall3628 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCall3630 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCall3632 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCall3650 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixMethodCallWithoutAccessAtTheEnd3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixMethodCallWithoutAccessAtTheEnd3700 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_postFixMethodCallWithoutAccessAtTheEnd3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3725 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_postFixMethodCallWithoutAccessAtTheEnd3727 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixMethodCallWithoutAccessAtTheEnd3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_postFixMethodCallWithoutAccessAtTheEnd3752 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000040L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3780 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3821 = new BitSet(new long[]{0x4040000000100000L,0x80000000C0000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3841 = new BitSet(new long[]{0x4040000000100000L,0x80000000C0000004L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primitiveAtom3868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primitiveAtom3873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Float_in_primitiveAtom3878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_primitiveAtom3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_primitiveAtom3891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NullVariations_in_primitiveAtom3893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primitiveAtom3904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4386 = new BitSet(new long[]{0x4040000020109200L,0x81080580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayContent_in_array4388 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4409 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayContent_in_array4411 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4435 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4438 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4441 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4455 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4457 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4493 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_ifCondition4495 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4497 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4502 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4509 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4549 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4553 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4555 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4580 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent4583 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4585 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_normalCase_in_switchContent4592 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_defaultCase_in_switchContent4595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCase4607 = new BitSet(new long[]{0xC182408404201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCase4610 = new BitSet(new long[]{0xC182408400201002L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCase4641 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCase4643 = new BitSet(new long[]{0xC182408400201002L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_Case_in_caseLabel4671 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_caseLabel4674 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel4676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel4688 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel4690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_forInit_in_forLoop4707 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop4709 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop4711 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop4713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit4728 = new BitSet(new long[]{0x4040000020109202L,0x81000580C4140864L,0x0000000000020FF2L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit4735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition4780 = new BitSet(new long[]{0x4040000020109202L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_forCondition4782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate4808 = new BitSet(new long[]{0x4040000020109200L,0x81040580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4810 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate4813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop4834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop4836 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_foreachLoop4838 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop4840 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop4845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4849 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop4851 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop4861 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop4863 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop4865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop4905 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_whileLoop4907 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop4909 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop4911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop4933 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop4935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop4937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop4939 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop4941 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop4943 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop4945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch4966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4970 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4972 = new BitSet(new long[]{0xC182408400201000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4975 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch4977 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock5009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock5013 = new BitSet(new long[]{0x4000000000001000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock5017 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock5019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5023 = new BitSet(new long[]{0xC182408400201000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5025 = new BitSet(new long[]{0xC182408400201000L,0x0103048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException5074 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_newObject_in_throwException5077 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException5079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred67_TSPHP2151 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred67_TSPHP2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred68_TSPHP2159 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred68_TSPHP2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred69_TSPHP2167 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallWithoutAccesAtTheEnd_in_synpred78_TSPHP2215 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred78_TSPHP2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixMethodCallWithoutAccessAtTheEnd_in_synpred79_TSPHP2223 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP2225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred98_TSPHP2521 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred98_TSPHP2524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred99_TSPHP2540 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred99_TSPHP2543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred100_TSPHP2559 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_assignment_in_synpred100_TSPHP2562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred101_TSPHP2576 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_ternary_in_synpred101_TSPHP2579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred128_TSPHP2888 = new BitSet(new long[]{0x4000000000001000L,0x0000000000000000L,0x00000000000009F0L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred128_TSPHP2890 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred128_TSPHP2892 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140064L,0x0000000000020012L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred128_TSPHP2894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred131_TSPHP2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCallInclAccesAtTheEnd_in_synpred142_TSPHP3165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_synpred148_TSPHP3291 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_synpred148_TSPHP3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_synpred148_TSPHP3316 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_synpred148_TSPHP3318 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_synpred148_TSPHP3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000040L});
	public static final BitSet FOLLOW_call_in_synpred148_TSPHP3343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred151_TSPHP3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCall_in_synpred152_TSPHP3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred153_TSPHP3485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred154_TSPHP3490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred176_TSPHP4455 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred176_TSPHP4457 = new BitSet(new long[]{0x4040000020109200L,0x81000580C4140864L,0x0000000000020012L});
	public static final BitSet FOLLOW_expression_in_synpred176_TSPHP4461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred177_TSPHP4509 = new BitSet(new long[]{0xC182408400201000L,0x0101048000100010L,0x00000000000A0FFFL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred177_TSPHP4514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCase_in_synpred180_TSPHP4580 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_defaultCase_in_synpred180_TSPHP4583 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_normalCase_in_synpred180_TSPHP4585 = new BitSet(new long[]{0x0000000004000002L});
}
