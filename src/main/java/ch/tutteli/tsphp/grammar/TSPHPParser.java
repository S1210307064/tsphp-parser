// $ANTLR 3.x D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g 2013-01-25 14:02:26

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CAST_ASSIGN", "CLASS_INTERFACE_TYPE", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Cast", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Construct", "Continue", "DECIMAL", "DEFAULT_NAMESPACE", "Deconstruct", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeDouble", "TypeFloat", "TypeInt", "TypeInteger", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
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
	public static final int CAST_ASSIGN=23;
	public static final int CLASS_INTERFACE_TYPE=24;
	public static final int CONSTANT_DECLARATION=25;
	public static final int CONSTANT_DECLARATION_LIST=26;
	public static final int Case=27;
	public static final int Cast=28;
	public static final int Catch=29;
	public static final int Class=30;
	public static final int Clone=31;
	public static final int Colon=32;
	public static final int Comma=33;
	public static final int Comment=34;
	public static final int Const=35;
	public static final int Construct=36;
	public static final int Continue=37;
	public static final int DECIMAL=38;
	public static final int DEFAULT_NAMESPACE=39;
	public static final int Deconstruct=40;
	public static final int Default=41;
	public static final int Divide=42;
	public static final int DivideEqual=43;
	public static final int Do=44;
	public static final int Dolar=45;
	public static final int Dot=46;
	public static final int DotEqual=47;
	public static final int DoubleColon=48;
	public static final int EXPONENT=49;
	public static final int EXPRESSION_LIST=50;
	public static final int Echo=51;
	public static final int Else=52;
	public static final int Equal=53;
	public static final int Exit=54;
	public static final int Extends=55;
	public static final int FUNCTION_CALL=56;
	public static final int FUNCTION_DECLARATION=57;
	public static final int Final=58;
	public static final int Float=59;
	public static final int For=60;
	public static final int Foreach=61;
	public static final int Function=62;
	public static final int GreaterEqualThan=63;
	public static final int GreaterThan=64;
	public static final int HEXADECIMAL=65;
	public static final int Identical=66;
	public static final int Identifier=67;
	public static final int If=68;
	public static final int Implements=69;
	public static final int Instanceof=70;
	public static final int Int=71;
	public static final int Interface=72;
	public static final int LeftCurlyBrace=73;
	public static final int LeftParanthesis=74;
	public static final int LeftSquareBrace=75;
	public static final int LessEqualThan=76;
	public static final int LessThan=77;
	public static final int LogicAnd=78;
	public static final int LogicAndWeak=79;
	public static final int LogicNot=80;
	public static final int LogicOr=81;
	public static final int LogicOrWeak=82;
	public static final int LogicXorWeak=83;
	public static final int MEMBER_ACCESS=84;
	public static final int MEMBER_ACCESS_STATIC=85;
	public static final int METHOD_CALL=86;
	public static final int Minus=87;
	public static final int MinusEqual=88;
	public static final int MinusMinus=89;
	public static final int Modulo=90;
	public static final int ModuloEqual=91;
	public static final int Multiply=92;
	public static final int MultiplyEqual=93;
	public static final int Namespace=94;
	public static final int New=95;
	public static final int NotEqual=96;
	public static final int NotEqualAlternative=97;
	public static final int NotIdentical=98;
	public static final int Null=99;
	public static final int OCTAL=100;
	public static final int ObjectOperator=101;
	public static final int PARAM_DECLARATION=102;
	public static final int PARAM_LIST=103;
	public static final int POST_INCREMENT_DECREMENT=104;
	public static final int PRE_INCREMENT_DECREMENT=105;
	public static final int Parent=106;
	public static final int ParentColonColon=107;
	public static final int Plus=108;
	public static final int PlusEqual=109;
	public static final int PlusPlus=110;
	public static final int Private=111;
	public static final int ProtectThis=112;
	public static final int Protected=113;
	public static final int Public=114;
	public static final int QuestionMark=115;
	public static final int Return=116;
	public static final int RightCurlyBrace=117;
	public static final int RightParanthesis=118;
	public static final int RightSquareBrace=119;
	public static final int STRING_DOUBLE_QUOTED=120;
	public static final int STRING_SINGLE_QUOTED=121;
	public static final int SWITCH_CASES=122;
	public static final int Self=123;
	public static final int SelfColonColon=124;
	public static final int Semicolon=125;
	public static final int ShiftLeft=126;
	public static final int ShiftLeftEqual=127;
	public static final int ShiftRight=128;
	public static final int ShiftRightEqual=129;
	public static final int Static=130;
	public static final int String=131;
	public static final int Switch=132;
	public static final int This=133;
	public static final int Throw=134;
	public static final int Try=135;
	public static final int TypeArray=136;
	public static final int TypeBool=137;
	public static final int TypeBoolean=138;
	public static final int TypeDouble=139;
	public static final int TypeFloat=140;
	public static final int TypeInt=141;
	public static final int TypeInteger=142;
	public static final int TypeObject=143;
	public static final int TypeResource=144;
	public static final int TypeString=145;
	public static final int UMINUS=146;
	public static final int UPLUS=147;
	public static final int Use=148;
	public static final int VARIABLE_DECLARATION=149;
	public static final int VARIABLE_DECLARATION_LIST=150;
	public static final int VariableId=151;
	public static final int Void=152;
	public static final int While=153;
	public static final int Whitespace=154;

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
		this.state.ruleMemo = new HashMap[320+1];
		 

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:209:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1064);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1067); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:4: ( namespaceBracket )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:210:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1073);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1076); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1082);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1084); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:214:1: namespaceSemicolon : 'namespace' namespaceId block= ';' ( statement )* -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceId.start,\"class/interface type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) ;
	public final TSPHPParser.namespaceSemicolon_return namespaceSemicolon() throws RecognitionException {
		TSPHPParser.namespaceSemicolon_return retval = new TSPHPParser.namespaceSemicolon_return();
		retval.start = input.LT(1);
		int namespaceSemicolon_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal7=null;
		ParserRuleReturnScope namespaceId8 =null;
		ParserRuleReturnScope statement9 =null;

		CommonTree block_tree=null;
		CommonTree string_literal7_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_Namespace=new RewriteRuleTokenStream(adaptor,"token Namespace");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:2: ( 'namespace' namespaceId block= ';' ( statement )* -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceId.start,\"class/interface type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:4: 'namespace' namespaceId block= ';' ( statement )*
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1097); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Namespace.add(string_literal7);

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1099);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId8.getTree());
			block=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1103); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:38: ( statement )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==At||LA4_0==Backslash||LA4_0==BitwiseNot||LA4_0==Bool||(LA4_0 >= Class && LA4_0 <= Clone)||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||(LA4_0 >= Final && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Int && LA4_0 <= LeftSquareBrace)||LA4_0==LogicNot||LA4_0==Minus||LA4_0==MinusMinus||LA4_0==New||LA4_0==Null||(LA4_0 >= ParentColonColon && LA4_0 <= Plus)||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= SelfColonColon && LA4_0 <= Semicolon)||(LA4_0 >= String && LA4_0 <= TypeBool)||(LA4_0 >= TypeFloat && LA4_0 <= TypeInt)||(LA4_0 >= TypeObject && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:215:38: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1105);
					statement9=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement9.getTree());
					}
					break;

				default :
					break loop4;
				}
			} while (true);

			// AST REWRITE
			// elements: namespaceId, statement, Namespace
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 216:3: -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceId.start,\"class/interface type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:216:6: ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceId.start,\"class/interface type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Namespace.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:216:20: ^( CLASS_INTERFACE_TYPE[$namespaceId.start,\"class/interface type\"] namespaceId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, (namespaceId8!=null?((Token)namespaceId8.start):null), "class/interface type")
				, root_2);

				adaptor.addChild(root_2, stream_namespaceId.nextTree());

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:216:99: ^( BLOCK[$block,\"block\"] ( statement )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:216:123: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());

				}
				stream_statement.reset();

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:219:1: namespaceBracket : 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}' -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceIdOrEmpty.start,\"class/interface type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) ;
	public final TSPHPParser.namespaceBracket_return namespaceBracket() throws RecognitionException {
		TSPHPParser.namespaceBracket_return retval = new TSPHPParser.namespaceBracket_return();
		retval.start = input.LT(1);
		int namespaceBracket_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal10=null;
		Token char_literal13=null;
		ParserRuleReturnScope namespaceIdOrEmpty11 =null;
		ParserRuleReturnScope statement12 =null;

		CommonTree block_tree=null;
		CommonTree string_literal10_tree=null;
		CommonTree char_literal13_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Namespace=new RewriteRuleTokenStream(adaptor,"token Namespace");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_namespaceIdOrEmpty=new RewriteRuleSubtreeStream(adaptor,"rule namespaceIdOrEmpty");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:220:2: ( 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}' -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceIdOrEmpty.start,\"class/interface type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:220:4: 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}'
			{
			string_literal10=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1141); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Namespace.add(string_literal10);

			pushFollow(FOLLOW_namespaceIdOrEmpty_in_namespaceBracket1143);
			namespaceIdOrEmpty11=namespaceIdOrEmpty();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceIdOrEmpty.add(namespaceIdOrEmpty11.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1148); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:220:46: ( statement )*
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==Abstract||LA5_0==At||LA5_0==Backslash||LA5_0==BitwiseNot||LA5_0==Bool||(LA5_0 >= Class && LA5_0 <= Clone)||LA5_0==Const||LA5_0==Do||LA5_0==Echo||LA5_0==Exit||(LA5_0 >= Final && LA5_0 <= Function)||(LA5_0 >= Identifier && LA5_0 <= If)||(LA5_0 >= Int && LA5_0 <= LeftSquareBrace)||LA5_0==LogicNot||LA5_0==Minus||LA5_0==MinusMinus||LA5_0==New||LA5_0==Null||(LA5_0 >= ParentColonColon && LA5_0 <= Plus)||LA5_0==PlusPlus||LA5_0==Return||(LA5_0 >= SelfColonColon && LA5_0 <= Semicolon)||(LA5_0 >= String && LA5_0 <= TypeBool)||(LA5_0 >= TypeFloat && LA5_0 <= TypeInt)||(LA5_0 >= TypeObject && LA5_0 <= TypeString)||LA5_0==Use||LA5_0==VariableId||LA5_0==While) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:220:46: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1150);
					statement12=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement12.getTree());
					}
					break;

				default :
					break loop5;
				}
			} while (true);

			char_literal13=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1153); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal13);

			// AST REWRITE
			// elements: Namespace, namespaceIdOrEmpty, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 221:3: -> ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceIdOrEmpty.start,\"class/interface type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:221:7: ^( 'namespace' ^( CLASS_INTERFACE_TYPE[$namespaceIdOrEmpty.start,\"class/interface type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Namespace.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:222:5: ^( CLASS_INTERFACE_TYPE[$namespaceIdOrEmpty.start,\"class/interface type\"] namespaceIdOrEmpty )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, (namespaceIdOrEmpty11!=null?((Token)namespaceIdOrEmpty11.start):null), "class/interface type")
				, root_2);

				adaptor.addChild(root_2, stream_namespaceIdOrEmpty.nextTree());

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:223:5: ^( BLOCK[$block,\"block\"] ( statement )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:223:29: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());

				}
				stream_statement.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 3, namespaceBracket_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceBracket"


	public static class namespaceIdOrEmpty_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceIdOrEmpty"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:226:1: namespaceIdOrEmpty : ( namespaceId | -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default namespace\"] );
	public final TSPHPParser.namespaceIdOrEmpty_return namespaceIdOrEmpty() throws RecognitionException {
		TSPHPParser.namespaceIdOrEmpty_return retval = new TSPHPParser.namespaceIdOrEmpty_return();
		retval.start = input.LT(1);
		int namespaceIdOrEmpty_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope namespaceId14 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:2: ( namespaceId | -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default namespace\"] )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Identifier) ) {
				alt6=1;
			}
			else if ( (LA6_0==LeftCurlyBrace) ) {
				alt6=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:227:4: namespaceId
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_namespaceId_in_namespaceIdOrEmpty1202);
					namespaceId14=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId14.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:16: 
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
					// 228:16: -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default namespace\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(DEFAULT_NAMESPACE, ((Token)retval.start), "default namespace")
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
			if ( state.backtracking>0 ) { memoize(input, 4, namespaceIdOrEmpty_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceIdOrEmpty"


	public static class namespaceId_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceId"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:239:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
	public final TSPHPParser.namespaceId_return namespaceId() throws RecognitionException {
		TSPHPParser.namespaceId_return retval = new TSPHPParser.namespaceId_return();
		retval.start = input.LT(1);
		int namespaceId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier15=null;
		Token char_literal16=null;
		Token Identifier17=null;

		CommonTree Identifier15_tree=null;
		CommonTree char_literal16_tree=null;
		CommonTree Identifier17_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:240:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:240:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1283); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier15);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:240:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:240:16: '\\\\' Identifier
					{
					char_literal16=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal16);

					Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1288); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier17);

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
			// 240:34: -> ( Identifier )+
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
			if ( state.backtracking>0 ) { memoize(input, 5, namespaceId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceId"


	public static class withoutNamespace_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:244:1: withoutNamespace : ( ( statement )+ ) -> ^( Namespace[$statement.start,\"namespace\"] ^( CLASS_INTERFACE_TYPE[$statement.start,\"class/interface type\"] DEFAULT_NAMESPACE[$statement.start,\"default namespace\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) ) ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement18 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:2: ( ( ( statement )+ ) -> ^( Namespace[$statement.start,\"namespace\"] ^( CLASS_INTERFACE_TYPE[$statement.start,\"class/interface type\"] DEFAULT_NAMESPACE[$statement.start,\"default namespace\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:4: ( ( statement )+ )
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:4: ( ( statement )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:5: ( statement )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:5: ( statement )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:5: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1309);
					statement18=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement18.getTree());
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

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 245:17: -> ^( Namespace[$statement.start,\"namespace\"] ^( CLASS_INTERFACE_TYPE[$statement.start,\"class/interface type\"] DEFAULT_NAMESPACE[$statement.start,\"default namespace\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:20: ^( Namespace[$statement.start,\"namespace\"] ^( CLASS_INTERFACE_TYPE[$statement.start,\"class/interface type\"] DEFAULT_NAMESPACE[$statement.start,\"default namespace\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(Namespace, (statement18!=null?((Token)statement18.start):null), "namespace")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:6: ^( CLASS_INTERFACE_TYPE[$statement.start,\"class/interface type\"] DEFAULT_NAMESPACE[$statement.start,\"default namespace\"] )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, (statement18!=null?((Token)statement18.start):null), "class/interface type")
				, root_2);

				adaptor.addChild(root_2, 
				(CommonTree)adaptor.create(DEFAULT_NAMESPACE, (statement18!=null?((Token)statement18.start):null), "default namespace")
				);

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:6: ^( BLOCK[$statement.start,\"block\"] ( statement )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (statement18!=null?((Token)statement18.start):null), "block")
				, root_2);

				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());

				}
				stream_statement.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 6, withoutNamespace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "withoutNamespace"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:251:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final TSPHPParser.statement_return statement() throws RecognitionException {
		TSPHPParser.statement_return retval = new TSPHPParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope useDeclarationList19 =null;
		ParserRuleReturnScope definition20 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue21 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1363);
					useDeclarationList19=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList19.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1368);
					definition20=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition20.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:254:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1373);
					instructionWithoutBreakContinue21=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue21.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 7, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class useDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:257:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final TSPHPParser.useDeclarationList_return useDeclarationList() throws RecognitionException {
		TSPHPParser.useDeclarationList_return retval = new TSPHPParser.useDeclarationList_return();
		retval.start = input.LT(1);
		int useDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal22=null;
		Token char_literal24=null;
		Token char_literal26=null;
		ParserRuleReturnScope useDeclaration23 =null;
		ParserRuleReturnScope useDeclaration25 =null;

		CommonTree string_literal22_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal26_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:258:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:258:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal22=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1385); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal22_tree = 
			(CommonTree)adaptor.create(string_literal22)
			;
			adaptor.addChild(root_0, string_literal22_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1387);
			useDeclaration23=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration23.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:258:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:258:26: ',' useDeclaration
					{
					char_literal24=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1390); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal24_tree = 
					(CommonTree)adaptor.create(char_literal24)
					;
					adaptor.addChild(root_0, char_literal24_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1392);
					useDeclaration25=useDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration25.getTree());

					}
					break;

				default :
					break loop10;
				}
			} while (true);

			char_literal26=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1396); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal26_tree = 
			(CommonTree)adaptor.create(char_literal26)
			;
			adaptor.addChild(root_0, char_literal26_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, useDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclarationList"


	public static class useDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:261:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
	public final TSPHPParser.useDeclaration_return useDeclaration() throws RecognitionException {
		TSPHPParser.useDeclaration_return retval = new TSPHPParser.useDeclaration_return();
		retval.start = input.LT(1);
		int useDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier27=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token string_literal32=null;
		Token Identifier33=null;
		ParserRuleReturnScope namespaceId29 =null;
		ParserRuleReturnScope namespaceId31 =null;

		CommonTree Identifier27_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree char_literal30_tree=null;
		CommonTree string_literal32_tree=null;
		CommonTree Identifier33_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:262:7: Identifier '\\\\' namespaceId
					{
					Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1411); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier27_tree = 
					(CommonTree)adaptor.create(Identifier27)
					;
					adaptor.addChild(root_0, Identifier27_tree);
					}

					char_literal28=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1413); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal28_tree = 
					(CommonTree)adaptor.create(char_literal28)
					;
					adaptor.addChild(root_0, char_literal28_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1415);
					namespaceId29=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId29.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:5: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:5: ( '\\\\' namespaceId )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:6: '\\\\' namespaceId
					{
					char_literal30=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal30_tree = 
					(CommonTree)adaptor.create(char_literal30)
					;
					adaptor.addChild(root_0, char_literal30_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1425);
					namespaceId31=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId31.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:265:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:265:4: 'as' Identifier
					{
					string_literal32=(Token)match(input,As,FOLLOW_As_in_useDeclaration1436); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal32_tree = 
					(CommonTree)adaptor.create(string_literal32)
					;
					adaptor.addChild(root_0, string_literal32_tree);
					}

					Identifier33=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier33_tree = 
					(CommonTree)adaptor.create(Identifier33)
					;
					adaptor.addChild(root_0, Identifier33_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 9, useDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclaration"


	public static class definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:267:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final TSPHPParser.definition_return definition() throws RecognitionException {
		TSPHPParser.definition_return retval = new TSPHPParser.definition_return();
		retval.start = input.LT(1);
		int definition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classDeclaration34 =null;
		ParserRuleReturnScope interfaceDeclaration35 =null;
		ParserRuleReturnScope functionDeclaration36 =null;
		ParserRuleReturnScope constDeclarationList37 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1451);
					classDeclaration34=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration34.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1456);
					interfaceDeclaration35=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration35.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:270:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1461);
					functionDeclaration36=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration36.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1466);
					constDeclarationList37=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList37.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 10, definition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:277:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' ;
	public final TSPHPParser.classDeclaration_return classDeclaration() throws RecognitionException {
		TSPHPParser.classDeclaration_return retval = new TSPHPParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set38=null;
		Token string_literal39=null;
		Token Identifier40=null;
		Token char_literal43=null;
		Token char_literal45=null;
		ParserRuleReturnScope extendsDeclaration41 =null;
		ParserRuleReturnScope implementsDeclaration42 =null;
		ParserRuleReturnScope classBody44 =null;

		CommonTree set38_tree=null;
		CommonTree string_literal39_tree=null;
		CommonTree Identifier40_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree char_literal45_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:4: ( 'abstract' | 'final' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Abstract||LA14_0==Final) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
					{
					set38=(Token)input.LT(1);
					if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(set38)
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

			string_literal39=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1488); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal39_tree = 
			(CommonTree)adaptor.create(string_literal39)
			;
			adaptor.addChild(root_0, string_literal39_tree);
			}

			Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1490); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier40_tree = 
			(CommonTree)adaptor.create(Identifier40)
			;
			adaptor.addChild(root_0, Identifier40_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1492);
					extendsDeclaration41=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration41.getTree());

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1495);
					implementsDeclaration42=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration42.getTree());

					}
					break;

			}

			char_literal43=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1498); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal43_tree = 
			(CommonTree)adaptor.create(char_literal43)
			;
			adaptor.addChild(root_0, char_literal43_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:92: ( classBody )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:278:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1500);
					classBody44=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody44.getTree());

					}
					break;

				default :
					break loop17;
				}
			} while (true);

			char_literal45=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1503); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal45_tree = 
			(CommonTree)adaptor.create(char_literal45)
			;
			adaptor.addChild(root_0, char_literal45_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class extendsDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:281:1: extendsDeclaration : 'extends' identifierList ;
	public final TSPHPParser.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		TSPHPParser.extendsDeclaration_return retval = new TSPHPParser.extendsDeclaration_return();
		retval.start = input.LT(1);
		int extendsDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal46=null;
		ParserRuleReturnScope identifierList47 =null;

		CommonTree string_literal46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:2: ( 'extends' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal46=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1517); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal46_tree = 
			(CommonTree)adaptor.create(string_literal46)
			;
			adaptor.addChild(root_0, string_literal46_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1519);
			identifierList47=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList47.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, extendsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class identifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:285:1: identifierList : Identifier ( ',' Identifier )* ;
	public final TSPHPParser.identifierList_return identifierList() throws RecognitionException {
		TSPHPParser.identifierList_return retval = new TSPHPParser.identifierList_return();
		retval.start = input.LT(1);
		int identifierList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier48=null;
		Token char_literal49=null;
		Token Identifier50=null;

		CommonTree Identifier48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree Identifier50_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier48=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1530); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier48_tree = 
			(CommonTree)adaptor.create(Identifier48)
			;
			adaptor.addChild(root_0, Identifier48_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:16: ',' Identifier
					{
					char_literal49=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1533); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal49_tree = 
					(CommonTree)adaptor.create(char_literal49)
					;
					adaptor.addChild(root_0, char_literal49_tree);
					}

					Identifier50=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier50_tree = 
					(CommonTree)adaptor.create(Identifier50)
					;
					adaptor.addChild(root_0, Identifier50_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 13, identifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class implementsDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:289:1: implementsDeclaration : 'implements' identifierList ;
	public final TSPHPParser.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		TSPHPParser.implementsDeclaration_return retval = new TSPHPParser.implementsDeclaration_return();
		retval.start = input.LT(1);
		int implementsDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal51=null;
		ParserRuleReturnScope identifierList52 =null;

		CommonTree string_literal51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:290:2: ( 'implements' identifierList )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:290:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal51=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1548); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal51_tree = 
			(CommonTree)adaptor.create(string_literal51)
			;
			adaptor.addChild(root_0, string_literal51_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1550);
			identifierList52=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList52.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, implementsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "implementsDeclaration"


	public static class classBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:293:1: classBody : ( constDeclarationList | attributeDeclaration | specialMethods | methodDeclaration );
	public final TSPHPParser.classBody_return classBody() throws RecognitionException {
		TSPHPParser.classBody_return retval = new TSPHPParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList53 =null;
		ParserRuleReturnScope attributeDeclaration54 =null;
		ParserRuleReturnScope specialMethods55 =null;
		ParserRuleReturnScope methodDeclaration56 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:2: ( constDeclarationList | attributeDeclaration | specialMethods | methodDeclaration )
			int alt19=4;
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
					int LA19_5 = input.LA(3);
					if ( (LA19_5==Backslash||LA19_5==Identifier||(LA19_5 >= TypeArray && LA19_5 <= TypeBool)||(LA19_5 >= TypeFloat && LA19_5 <= TypeInt)||(LA19_5 >= TypeObject && LA19_5 <= TypeString)) ) {
						alt19=2;
					}
					else if ( (LA19_5==Function) ) {
						alt19=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 19, 5, input);
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
						alt19=4;
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
					alt19=4;
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
			case Public:
				{
				int LA19_3 = input.LA(2);
				if ( (LA19_3==Backslash||LA19_3==Identifier||(LA19_3 >= TypeArray && LA19_3 <= TypeBool)||(LA19_3 >= TypeFloat && LA19_3 <= TypeInt)||(LA19_3 >= TypeObject && LA19_3 <= TypeString)) ) {
					alt19=2;
				}
				else if ( (LA19_3==Function) ) {
					int LA19_6 = input.LA(3);
					if ( (LA19_6==Construct||LA19_6==Deconstruct) ) {
						alt19=3;
					}
					else if ( (LA19_6==Backslash||LA19_6==Identifier||(LA19_6 >= TypeArray && LA19_6 <= TypeBool)||(LA19_6 >= TypeFloat && LA19_6 <= TypeInt)||(LA19_6 >= TypeObject && LA19_6 <= TypeString)||LA19_6==Void) ) {
						alt19=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 19, 6, input);
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
					alt19=4;
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
			case Protected:
				{
				int LA19_5 = input.LA(2);
				if ( (LA19_5==Backslash||LA19_5==Identifier||(LA19_5 >= TypeArray && LA19_5 <= TypeBool)||(LA19_5 >= TypeFloat && LA19_5 <= TypeInt)||(LA19_5 >= TypeObject && LA19_5 <= TypeString)) ) {
					alt19=2;
				}
				else if ( (LA19_5==Function) ) {
					alt19=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Function:
				{
				int LA19_6 = input.LA(2);
				if ( (LA19_6==Construct||LA19_6==Deconstruct) ) {
					alt19=3;
				}
				else if ( (LA19_6==Backslash||LA19_6==Identifier||(LA19_6 >= TypeArray && LA19_6 <= TypeBool)||(LA19_6 >= TypeFloat && LA19_6 <= TypeInt)||(LA19_6 >= TypeObject && LA19_6 <= TypeString)||LA19_6==Void) ) {
					alt19=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Abstract:
			case Final:
				{
				alt19=4;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:294:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1562);
					constDeclarationList53=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList53.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:295:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1567);
					attributeDeclaration54=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration54.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:4: specialMethods
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_specialMethods_in_classBody1573);
					specialMethods55=specialMethods();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, specialMethods55.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1578);
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
			if ( state.backtracking>0 ) { memoize(input, 15, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class constDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1594);
			primitiveTypes57=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes57.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1596);
			constantAssignment58=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment58.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:301:54: ',' constantAssignment
					{
					char_literal59=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal59);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1601);
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

			char_literal61=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1605); if (state.failed) return retval; 
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
			// 302:3: -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:302:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constant declarations\"] primitiveTypes ( constantAssignment )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 16, constDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier62=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1631); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier62_tree = 
			(CommonTree)adaptor.create(Identifier62)
			;
			adaptor.addChild(root_0, Identifier62_tree);
			}

			char_literal63=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1633); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal63_tree = 
			(CommonTree)adaptor.create(char_literal63)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1636);
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
			if ( state.backtracking>0 ) { memoize(input, 17, constantAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class attributeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:309:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:4: 'static'
					{
					string_literal65=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = 
					(CommonTree)adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1651);
			accessor66=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor66.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1653);
			variableDeclarationListInclVariableId67=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId67.getTree());

			char_literal68=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1655); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 18, attributeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "attributeDeclaration"


	public static class accessor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal70=null;
		ParserRuleReturnScope accessorWithoutPrivate69 =null;

		CommonTree string_literal70_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:313:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1664);
					accessorWithoutPrivate69=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate69.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:314:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal70=(Token)match(input,Private,FOLLOW_Private_in_accessor1669); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 19, accessor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessor"


	public static class accessorWithoutPrivate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:317:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set71=null;

		CommonTree set71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:318:2: ( 'protected' | 'public' )
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
			if ( state.backtracking>0 ) { memoize(input, 20, accessorWithoutPrivate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessorWithoutPrivate"


	public static class variableDeclarationListInclVariableId_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:321:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1694);
			variableDeclaration72=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration72.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal73=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1697); if (state.failed) return retval;
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1701);
							variableAssignment74=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment74.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:322:50: VariableId
							{
							VariableId75=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1703); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 21, variableDeclarationListInclVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:326:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal76=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal76_tree = 
					(CommonTree)adaptor.create(string_literal76)
					;
					adaptor.addChild(root_0, string_literal76_tree);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1724);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:6: 'static' ( 'final' )?
							{
							string_literal78=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1738); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal78_tree = 
							(CommonTree)adaptor.create(string_literal78)
							;
							adaptor.addChild(root_0, string_literal78_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:329:15: 'final'
									{
									string_literal79=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1740); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:6: 'final' ( 'static' )?
							{
							string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1748); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal80_tree = 
							(CommonTree)adaptor.create(string_literal80)
							;
							adaptor.addChild(root_0, string_literal80_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:330:14: 'static'
									{
									string_literal81=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1750); if (state.failed) return retval;
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1764);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1771);
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
			if ( state.backtracking>0 ) { memoize(input, 22, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class specialMethods_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "specialMethods"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:335:1: specialMethods : ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct ) ;
	public final TSPHPParser.specialMethods_return specialMethods() throws RecognitionException {
		TSPHPParser.specialMethods_return retval = new TSPHPParser.specialMethods_return();
		retval.start = input.LT(1);
		int specialMethods_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal84=null;
		Token string_literal85=null;
		ParserRuleReturnScope construct86 =null;
		ParserRuleReturnScope deconstruct87 =null;

		CommonTree string_literal84_tree=null;
		CommonTree string_literal85_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:2: ( ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:4: ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:4: ( ( 'public' )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:5: ( 'public' )?
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:5: ( 'public' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Public) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:5: 'public'
					{
					string_literal84=(Token)match(input,Public,FOLLOW_Public_in_specialMethods1783); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal84_tree = 
					(CommonTree)adaptor.create(string_literal84)
					;
					adaptor.addChild(root_0, string_literal84_tree);
					}

					}
					break;

			}

			}

			string_literal85=(Token)match(input,Function,FOLLOW_Function_in_specialMethods1788); if (state.failed) return retval;
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:3: ( construct | deconstruct )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Construct) ) {
				alt32=1;
			}
			else if ( (LA32_0==Deconstruct) ) {
				alt32=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:5: construct
					{
					pushFollow(FOLLOW_construct_in_specialMethods1796);
					construct86=construct();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, construct86.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:338:5: deconstruct
					{
					pushFollow(FOLLOW_deconstruct_in_specialMethods1803);
					deconstruct87=deconstruct();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, deconstruct87.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 23, specialMethods_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "specialMethods"


	public static class construct_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "construct"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:1: construct : '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.construct_return construct() throws RecognitionException {
		TSPHPParser.construct_return retval = new TSPHPParser.construct_return();
		retval.start = input.LT(1);
		int construct_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal88=null;
		Token char_literal91=null;
		ParserRuleReturnScope formalParameters89 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue90 =null;

		CommonTree block_tree=null;
		CommonTree string_literal88_tree=null;
		CommonTree char_literal91_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Construct=new RewriteRuleTokenStream(adaptor,"token Construct");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:2: ( '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:4: '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			string_literal88=(Token)match(input,Construct,FOLLOW_Construct_in_construct1819); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Construct.add(string_literal88);

			pushFollow(FOLLOW_formalParameters_in_construct1821);
			formalParameters89=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters89.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_construct1825); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:45: ( instructionWithoutBreakContinue )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==At||LA33_0==Backslash||LA33_0==BitwiseNot||LA33_0==Bool||LA33_0==Clone||LA33_0==Do||LA33_0==Echo||LA33_0==Exit||(LA33_0 >= Float && LA33_0 <= Foreach)||(LA33_0 >= Identifier && LA33_0 <= If)||LA33_0==Int||(LA33_0 >= LeftCurlyBrace && LA33_0 <= LeftSquareBrace)||LA33_0==LogicNot||LA33_0==Minus||LA33_0==MinusMinus||LA33_0==New||LA33_0==Null||(LA33_0 >= ParentColonColon && LA33_0 <= Plus)||LA33_0==PlusPlus||LA33_0==Return||(LA33_0 >= SelfColonColon && LA33_0 <= Semicolon)||(LA33_0 >= String && LA33_0 <= TypeBool)||(LA33_0 >= TypeFloat && LA33_0 <= TypeInt)||(LA33_0 >= TypeObject && LA33_0 <= TypeString)||LA33_0==VariableId||LA33_0==While) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:343:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_construct1827);
					instructionWithoutBreakContinue90=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue90.getTree());
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			char_literal91=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_construct1830); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal91);

			// AST REWRITE
			// elements: instructionWithoutBreakContinue, formalParameters, Construct
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 344:3: -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:344:6: ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Construct.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_formalParameters.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:344:39: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:344:63: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 24, construct_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "construct"


	public static class deconstruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "deconstruct"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:1: deconstruct : '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.deconstruct_return deconstruct() throws RecognitionException {
		TSPHPParser.deconstruct_return retval = new TSPHPParser.deconstruct_return();
		retval.start = input.LT(1);
		int deconstruct_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal92=null;
		Token char_literal93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope instructionWithoutBreakContinue95 =null;

		CommonTree block_tree=null;
		CommonTree string_literal92_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal94_tree=null;
		CommonTree char_literal96_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Deconstruct=new RewriteRuleTokenStream(adaptor,"token Deconstruct");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:2: ( '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:4: '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			string_literal92=(Token)match(input,Deconstruct,FOLLOW_Deconstruct_in_deconstruct1861); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Deconstruct.add(string_literal92);

			char_literal93=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_deconstruct1863); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal93);

			char_literal94=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_deconstruct1864); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal94);

			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_deconstruct1868); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:37: ( instructionWithoutBreakContinue )*
			loop34:
			do {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==At||LA34_0==Backslash||LA34_0==BitwiseNot||LA34_0==Bool||LA34_0==Clone||LA34_0==Do||LA34_0==Echo||LA34_0==Exit||(LA34_0 >= Float && LA34_0 <= Foreach)||(LA34_0 >= Identifier && LA34_0 <= If)||LA34_0==Int||(LA34_0 >= LeftCurlyBrace && LA34_0 <= LeftSquareBrace)||LA34_0==LogicNot||LA34_0==Minus||LA34_0==MinusMinus||LA34_0==New||LA34_0==Null||(LA34_0 >= ParentColonColon && LA34_0 <= Plus)||LA34_0==PlusPlus||LA34_0==Return||(LA34_0 >= SelfColonColon && LA34_0 <= Semicolon)||(LA34_0 >= String && LA34_0 <= TypeBool)||(LA34_0 >= TypeFloat && LA34_0 <= TypeInt)||(LA34_0 >= TypeObject && LA34_0 <= TypeString)||LA34_0==VariableId||LA34_0==While) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:37: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_deconstruct1870);
					instructionWithoutBreakContinue95=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue95.getTree());
					}
					break;

				default :
					break loop34;
				}
			} while (true);

			char_literal96=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_deconstruct1873); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal96);

			// AST REWRITE
			// elements: Deconstruct, instructionWithoutBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 349:3: -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:6: ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Deconstruct.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:24: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:349:48: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 25, deconstruct_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "deconstruct"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:352:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal97=null;
		Token Identifier98=null;
		Token char_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope implementsDeclaration99 =null;
		ParserRuleReturnScope interfaceBody101 =null;

		CommonTree string_literal97_tree=null;
		CommonTree Identifier98_tree=null;
		CommonTree char_literal100_tree=null;
		CommonTree char_literal102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal97=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1902); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal97_tree = 
			(CommonTree)adaptor.create(string_literal97)
			;
			adaptor.addChild(root_0, string_literal97_tree);
			}

			Identifier98=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1904); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier98_tree = 
			(CommonTree)adaptor.create(Identifier98)
			;
			adaptor.addChild(root_0, Identifier98_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:27: ( implementsDeclaration )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Implements) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1906);
					implementsDeclaration99=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration99.getTree());

					}
					break;

			}

			char_literal100=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1909); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal100_tree = 
			(CommonTree)adaptor.create(char_literal100)
			;
			adaptor.addChild(root_0, char_literal100_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:54: ( interfaceBody )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Const||LA36_0==Function||LA36_0==Public) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1911);
					interfaceBody101=interfaceBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody101.getTree());

					}
					break;

				default :
					break loop36;
				}
			} while (true);

			char_literal102=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1914); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal102_tree = 
			(CommonTree)adaptor.create(char_literal102)
			;
			adaptor.addChild(root_0, char_literal102_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:356:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList103 =null;
		ParserRuleReturnScope interfaceMethodDeclaration104 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:357:2: ( constDeclarationList | interfaceMethodDeclaration )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Const) ) {
				alt37=1;
			}
			else if ( (LA37_0==Function||LA37_0==Public) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:357:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1925);
					constDeclarationList103=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList103.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1930);
					interfaceMethodDeclaration104=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration104.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 27, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:361:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope functionDeclarationWithoutBody106 =null;

		CommonTree string_literal105_tree=null;
		CommonTree char_literal107_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:362:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:362:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:362:4: ( 'public' )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Public) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:362:4: 'public'
					{
					string_literal105=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1941); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal105_tree = 
					(CommonTree)adaptor.create(string_literal105)
					;
					adaptor.addChild(root_0, string_literal105_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1944);
			functionDeclarationWithoutBody106=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody106.getTree());

			char_literal107=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1946); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal107_tree = 
			(CommonTree)adaptor.create(char_literal107)
			;
			adaptor.addChild(root_0, char_literal107_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, interfaceMethodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:369:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal110=null;
		ParserRuleReturnScope functionDeclarationWithoutBody108 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue109 =null;

		CommonTree block_tree=null;
		CommonTree char_literal110_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_functionDeclarationWithoutBody=new RewriteRuleSubtreeStream(adaptor,"rule functionDeclarationWithoutBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1963);
			functionDeclarationWithoutBody108=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody108.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1967); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:45: ( instructionWithoutBreakContinue )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==At||LA39_0==Backslash||LA39_0==BitwiseNot||LA39_0==Bool||LA39_0==Clone||LA39_0==Do||LA39_0==Echo||LA39_0==Exit||(LA39_0 >= Float && LA39_0 <= Foreach)||(LA39_0 >= Identifier && LA39_0 <= If)||LA39_0==Int||(LA39_0 >= LeftCurlyBrace && LA39_0 <= LeftSquareBrace)||LA39_0==LogicNot||LA39_0==Minus||LA39_0==MinusMinus||LA39_0==New||LA39_0==Null||(LA39_0 >= ParentColonColon && LA39_0 <= Plus)||LA39_0==PlusPlus||LA39_0==Return||(LA39_0 >= SelfColonColon && LA39_0 <= Semicolon)||(LA39_0 >= String && LA39_0 <= TypeBool)||(LA39_0 >= TypeFloat && LA39_0 <= TypeInt)||(LA39_0 >= TypeObject && LA39_0 <= TypeString)||LA39_0==VariableId||LA39_0==While) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:370:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1969);
					instructionWithoutBreakContinue109=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue109.getTree());
					}
					break;

				default :
					break loop39;
				}
			} while (true);

			char_literal110=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1972); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal110);

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
			// 371:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"function declaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody108!=null?((Token)functionDeclarationWithoutBody108.start):null), "function declaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:122: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:146: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 29, functionDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class functionDeclarationWithoutBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:374:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal111=null;
		Token Identifier113=null;
		ParserRuleReturnScope returnType112 =null;
		ParserRuleReturnScope formalParameters114 =null;

		CommonTree string_literal111_tree=null;
		CommonTree Identifier113_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:375:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal111=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody2004); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody2007);
			returnType112=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType112.getTree());

			Identifier113=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody2009); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier113_tree = 
			(CommonTree)adaptor.create(Identifier113)
			;
			adaptor.addChild(root_0, Identifier113_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody2011);
			formalParameters114=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters114.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, functionDeclarationWithoutBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationWithoutBody"


	public static class returnType_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:378:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal116=null;
		ParserRuleReturnScope allTypes115 =null;

		CommonTree string_literal116_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:379:2: ( allTypes | 'void' )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Backslash||LA40_0==Identifier||(LA40_0 >= TypeArray && LA40_0 <= TypeBool)||(LA40_0 >= TypeFloat && LA40_0 <= TypeInt)||(LA40_0 >= TypeObject && LA40_0 <= TypeString)) ) {
				alt40=1;
			}
			else if ( (LA40_0==Void) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:379:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType2023);
					allTypes115=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes115.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:379:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal116=(Token)match(input,Void,FOLLOW_Void_in_returnType2027); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal116_tree = 
					(CommonTree)adaptor.create(string_literal116)
					;
					adaptor.addChild(root_0, string_literal116_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 31, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:382:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended117 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject118 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:383:2: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= TypeArray && LA41_0 <= TypeBool)||(LA41_0 >= TypeFloat && LA41_0 <= TypeInt)||(LA41_0 >= TypeResource && LA41_0 <= TypeString)) ) {
				alt41=1;
			}
			else if ( (LA41_0==Backslash||LA41_0==Identifier||LA41_0==TypeObject) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:383:4: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes2038);
					primitiveTypesExtended117=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended117.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:383:29: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes2042);
					classInterfaceTypeInclObject118=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject118.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 32, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class allTypesWithoutObjectAndResource_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypesWithoutObjectAndResource"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:386:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray119 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject120 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:387:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( ((LA42_0 >= TypeArray && LA42_0 <= TypeBool)||(LA42_0 >= TypeFloat && LA42_0 <= TypeInt)||LA42_0==TypeString) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:387:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource2053);
					primitiveTypesInclArray119=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray119.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:388:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource2059);
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
			if ( state.backtracking>0 ) { memoize(input, 33, allTypesWithoutObjectAndResource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypesWithoutObjectAndResource"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:391:1: primitiveTypes : ( TypeBool | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set121=null;

		CommonTree set121_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:2: ( TypeBool | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set121=(Token)input.LT(1);
			if ( input.LA(1)==TypeBool||(input.LA(1) >= TypeFloat && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set121)
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
			if ( state.backtracking>0 ) { memoize(input, 34, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:398:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray123=null;
		ParserRuleReturnScope primitiveTypes122 =null;

		CommonTree TypeArray123_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:2: ( primitiveTypes | TypeArray )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==TypeBool||(LA43_0 >= TypeFloat && LA43_0 <= TypeInt)||LA43_0==TypeString) ) {
				alt43=1;
			}
			else if ( (LA43_0==TypeArray) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:399:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray2097);
					primitiveTypes122=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes122.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:400:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray123=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray2102); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray123_tree = 
					(CommonTree)adaptor.create(TypeArray123)
					;
					adaptor.addChild(root_0, TypeArray123_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 35, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:403:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource125=null;
		ParserRuleReturnScope primitiveTypesInclArray124 =null;

		CommonTree TypeResource125_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:404:2: ( primitiveTypesInclArray | TypeResource )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( ((LA44_0 >= TypeArray && LA44_0 <= TypeBool)||(LA44_0 >= TypeFloat && LA44_0 <= TypeInt)||LA44_0==TypeString) ) {
				alt44=1;
			}
			else if ( (LA44_0==TypeResource) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:404:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended2114);
					primitiveTypesInclArray124=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray124.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:405:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource125=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended2119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource125_tree = 
					(CommonTree)adaptor.create(TypeResource125)
					;
					adaptor.addChild(root_0, TypeResource125_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 36, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:408:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token root=null;
		ParserRuleReturnScope namespaceId126 =null;

		CommonTree root_tree=null;
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:2: ( (root= '\\\\' )? namespaceId -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:8: (root= '\\\\' )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Backslash) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject2132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject2135);
			namespaceId126=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId126.getTree());
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
			// 409:27: -> ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:30: ^( CLASS_INTERFACE_TYPE[$classInterfaceTypeWithoutObject.start,\"class/interface type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_INTERFACE_TYPE, ((Token)retval.start), "class/interface type")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:117: ( $root)?
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
			if ( state.backtracking>0 ) { memoize(input, 37, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:413:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject127=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject128 =null;

		CommonTree TypeObject127_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:2: ( TypeObject | classInterfaceTypeWithoutObject )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==TypeObject) ) {
				alt46=1;
			}
			else if ( (LA46_0==Backslash||LA46_0==Identifier) ) {
				alt46=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject127=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject2161); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject127_tree = 
					(CommonTree)adaptor.create(TypeObject127)
					;
					adaptor.addChild(root_0, TypeObject127_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject2167);
					classInterfaceTypeWithoutObject128=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject128.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 38, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class formalParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
	public final TSPHPParser.formalParameters_return formalParameters() throws RecognitionException {
		TSPHPParser.formalParameters_return retval = new TSPHPParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token params=null;
		Token char_literal130=null;
		ParserRuleReturnScope paramList129 =null;

		CommonTree params_tree=null;
		CommonTree char_literal130_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters2180); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:15: ( paramList )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Backslash||LA47_0==Cast||LA47_0==Identifier||(LA47_0 >= TypeArray && LA47_0 <= TypeBool)||(LA47_0 >= TypeFloat && LA47_0 <= TypeInt)||(LA47_0 >= TypeObject && LA47_0 <= TypeString)) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters2182);
					paramList129=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList129.getTree());
					}
					break;

			}

			char_literal130=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters2185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal130);

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
			// 419:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:68: ( paramList )?
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
			if ( state.backtracking>0 ) { memoize(input, 39, formalParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:422:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal132=null;
		Token char_literal135=null;
		Token char_literal137=null;
		ParserRuleReturnScope paramDeclarationOptional131 =null;
		ParserRuleReturnScope paramDeclarationOptional133 =null;
		ParserRuleReturnScope paramDeclarationInclNull134 =null;
		ParserRuleReturnScope paramDeclarationInclNull136 =null;
		ParserRuleReturnScope paramDeclarationOptional138 =null;

		CommonTree char_literal132_tree=null;
		CommonTree char_literal135_tree=null;
		CommonTree char_literal137_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* )
			int alt51=2;
			alt51 = dfa51.predict(input);
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2206);
					paramDeclarationOptional131=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional131.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:29: ( ',' ! paramDeclarationOptional )*
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Comma) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:30: ',' ! paramDeclarationOptional
							{
							char_literal132=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2209); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2212);
							paramDeclarationOptional133=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional133.getTree());

							}
							break;

						default :
							break loop48;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList2219);
					paramDeclarationInclNull134=paramDeclarationInclNull();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull134.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:29: ( ',' ! paramDeclarationInclNull )*
					loop49:
					do {
						int alt49=2;
						alt49 = dfa49.predict(input);
						switch (alt49) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:30: ',' ! paramDeclarationInclNull
							{
							char_literal135=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2222); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList2225);
							paramDeclarationInclNull136=paramDeclarationInclNull();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull136.getTree());

							}
							break;

						default :
							break loop49;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:62: ( ',' ! paramDeclarationOptional )*
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==Comma) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:63: ',' ! paramDeclarationOptional
							{
							char_literal137=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2230); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2233);
							paramDeclarationOptional138=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional138.getTree());

							}
							break;

						default :
							break loop50;
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
			if ( state.backtracking>0 ) { memoize(input, 40, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclarationInclNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationInclNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:427:1: paramDeclarationInclNull : paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? ) ;
	public final TSPHPParser.paramDeclarationInclNull_return paramDeclarationInclNull() throws RecognitionException {
		TSPHPParser.paramDeclarationInclNull_return retval = new TSPHPParser.paramDeclarationInclNull_return();
		retval.start = input.LT(1);
		int paramDeclarationInclNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal140=null;
		Token Null141=null;
		ParserRuleReturnScope paramDeclarationWithoutNull139 =null;

		CommonTree char_literal140_tree=null;
		CommonTree Null141_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:2: ( paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:4: paramDeclarationWithoutNull ( '=' Null )?
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull2248);
			paramDeclarationWithoutNull139=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull139.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:32: ( '=' Null )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Assign) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:33: '=' Null
					{
					char_literal140=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationInclNull2251); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal140);

					Null141=(Token)match(input,Null,FOLLOW_Null_in_paramDeclarationInclNull2253); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Null.add(Null141);

					}
					break;

			}

			// AST REWRITE
			// elements: Null, paramDeclarationWithoutNull
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 428:44: -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:47: ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameter declaration\"] paramDeclarationWithoutNull ( Null )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, ((Token)retval.start), "parameter declaration")
				, root_1);

				adaptor.addChild(root_1, stream_paramDeclarationWithoutNull.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:152: ( Null )?
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
			if ( state.backtracking>0 ) { memoize(input, 41, paramDeclarationInclNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationInclNull"


	public static class paramDeclarationWithoutNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationWithoutNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:431:1: paramDeclarationWithoutNull : ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId ;
	public final TSPHPParser.paramDeclarationWithoutNull_return paramDeclarationWithoutNull() throws RecognitionException {
		TSPHPParser.paramDeclarationWithoutNull_return retval = new TSPHPParser.paramDeclarationWithoutNull_return();
		retval.start = input.LT(1);
		int paramDeclarationWithoutNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Cast142=null;
		Token VariableId144=null;
		ParserRuleReturnScope allTypes143 =null;

		CommonTree Cast142_tree=null;
		CommonTree VariableId144_tree=null;
		RewriteRuleTokenStream stream_Cast=new RewriteRuleTokenStream(adaptor,"token Cast");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:2: ( ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: ( Cast )? allTypes VariableId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: ( Cast )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==Cast) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:4: Cast
					{
					Cast142=(Token)match(input,Cast,FOLLOW_Cast_in_paramDeclarationWithoutNull2278); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Cast.add(Cast142);

					}
					break;

			}

			pushFollow(FOLLOW_allTypes_in_paramDeclarationWithoutNull2281);
			allTypes143=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes143.getTree());
			VariableId144=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationWithoutNull2283); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId144);

			// AST REWRITE
			// elements: allTypes, Cast, VariableId
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 432:30: -> ^( allTypes ( Cast )? ) VariableId
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:33: ^( allTypes ( Cast )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_allTypes.nextNode(), root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:44: ( Cast )?
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
			if ( state.backtracking>0 ) { memoize(input, 42, paramDeclarationWithoutNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationWithoutNull"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:435:1: paramDeclarationOptional : paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal146=null;
		ParserRuleReturnScope paramDeclarationWithoutNull145 =null;
		ParserRuleReturnScope unaryPrimitiveAtom147 =null;

		CommonTree char_literal146_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleSubtreeStream stream_unaryPrimitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule unaryPrimitiveAtom");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:2: ( paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:436:4: paramDeclarationWithoutNull '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2308);
			paramDeclarationWithoutNull145=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull145.getTree());
			char_literal146=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2311); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal146);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2313);
			unaryPrimitiveAtom147=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom147.getTree());
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
			// 437:3: -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:437:6: ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameter declaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
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
			if ( state.backtracking>0 ) { memoize(input, 43, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:444:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal149=null;
		ParserRuleReturnScope instructionWithoutBreakContinue148 =null;
		ParserRuleReturnScope instruction150 =null;

		CommonTree block_tree=null;
		CommonTree char_literal149_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:2: (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==LeftCurlyBrace) ) {
				alt55=1;
			}
			else if ( (LA55_0==At||LA55_0==Backslash||LA55_0==BitwiseNot||LA55_0==Bool||LA55_0==Clone||LA55_0==Do||LA55_0==Echo||LA55_0==Exit||(LA55_0 >= Float && LA55_0 <= Foreach)||(LA55_0 >= Identifier && LA55_0 <= If)||LA55_0==Int||(LA55_0 >= LeftParanthesis && LA55_0 <= LeftSquareBrace)||LA55_0==LogicNot||LA55_0==Minus||LA55_0==MinusMinus||LA55_0==New||LA55_0==Null||(LA55_0 >= ParentColonColon && LA55_0 <= Plus)||LA55_0==PlusPlus||LA55_0==Return||(LA55_0 >= SelfColonColon && LA55_0 <= Semicolon)||(LA55_0 >= String && LA55_0 <= TypeBool)||(LA55_0 >= TypeFloat && LA55_0 <= TypeInt)||(LA55_0 >= TypeObject && LA55_0 <= TypeString)||LA55_0==VariableId||LA55_0==While) ) {
				alt55=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:4: block= '{' ( instructionWithoutBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2357); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:16: ( instructionWithoutBreakContinue )*
					loop54:
					do {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Do||LA54_0==Echo||LA54_0==Exit||(LA54_0 >= Float && LA54_0 <= Foreach)||(LA54_0 >= Identifier && LA54_0 <= If)||LA54_0==Int||(LA54_0 >= LeftCurlyBrace && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||LA54_0==Null||(LA54_0 >= ParentColonColon && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==Return||(LA54_0 >= SelfColonColon && LA54_0 <= Semicolon)||(LA54_0 >= String && LA54_0 <= TypeBool)||(LA54_0 >= TypeFloat && LA54_0 <= TypeInt)||(LA54_0 >= TypeObject && LA54_0 <= TypeString)||LA54_0==VariableId||LA54_0==While) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2359);
							instructionWithoutBreakContinue148=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue148.getTree());
							}
							break;

						default :
							break loop54;
						}
					} while (true);

					char_literal149=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal149);

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
					// 445:53: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:56: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:81: ( instructionWithoutBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:446:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2378);
					instruction150=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction150.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 44, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:449:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal152=null;
		Token set154=null;
		Token Int155=null;
		Token char_literal156=null;
		ParserRuleReturnScope instructionInclBreakContinue151 =null;
		ParserRuleReturnScope instruction153 =null;

		CommonTree block_tree=null;
		CommonTree char_literal152_tree=null;
		CommonTree set154_tree=null;
		CommonTree Int155_tree=null;
		CommonTree char_literal156_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:2: (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
			int alt58=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt58=1;
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
				alt58=2;
				}
				break;
			case Break:
			case Continue:
				{
				alt58=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:4: block= '{' ( instructionInclBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2394); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:17: ( instructionInclBreakContinue )*
					loop56:
					do {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==At||LA56_0==Backslash||LA56_0==BitwiseNot||(LA56_0 >= Bool && LA56_0 <= Break)||LA56_0==Clone||LA56_0==Continue||LA56_0==Do||LA56_0==Echo||LA56_0==Exit||(LA56_0 >= Float && LA56_0 <= Foreach)||(LA56_0 >= Identifier && LA56_0 <= If)||LA56_0==Int||(LA56_0 >= LeftCurlyBrace && LA56_0 <= LeftSquareBrace)||LA56_0==LogicNot||LA56_0==Minus||LA56_0==MinusMinus||LA56_0==New||LA56_0==Null||(LA56_0 >= ParentColonColon && LA56_0 <= Plus)||LA56_0==PlusPlus||LA56_0==Return||(LA56_0 >= SelfColonColon && LA56_0 <= Semicolon)||(LA56_0 >= String && LA56_0 <= TypeBool)||(LA56_0 >= TypeFloat && LA56_0 <= TypeInt)||(LA56_0 >= TypeObject && LA56_0 <= TypeString)||LA56_0==VariableId||LA56_0==While) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2396);
							instructionInclBreakContinue151=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue151.getTree());
							}
							break;

						default :
							break loop56;
						}
					} while (true);

					char_literal152=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2400); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal152);

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
					// 450:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:450:79: ( instructionInclBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:451:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2415);
					instruction153=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction153.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:452:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set154=(Token)input.LT(1);
					set154=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set154)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:452:26: ( Int )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==Int) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:452:26: Int
							{
							Int155=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2427); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int155_tree = 
							(CommonTree)adaptor.create(Int155)
							;
							adaptor.addChild(root_0, Int155_tree);
							}

							}
							break;

					}

					char_literal156=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2430); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 45, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | expression ';' !| 'return' ^ ( expression )? ';' !| 'throw' ^ expression ';' !| 'echo' ^ expressionList ';' !| 'exit' ( '(' expression ')' )? ';' -> ^( 'exit' ( expression )? ) |semi= ';' -> BLOCK[$semi,\"block\"] );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token semi=null;
		Token char_literal158=null;
		Token char_literal160=null;
		Token char_literal169=null;
		Token string_literal170=null;
		Token char_literal172=null;
		Token string_literal173=null;
		Token char_literal175=null;
		Token string_literal176=null;
		Token char_literal178=null;
		Token string_literal179=null;
		Token char_literal180=null;
		Token char_literal182=null;
		Token char_literal183=null;
		ParserRuleReturnScope variableAssignment157 =null;
		ParserRuleReturnScope variableDeclaration159 =null;
		ParserRuleReturnScope ifCondition161 =null;
		ParserRuleReturnScope switchCondition162 =null;
		ParserRuleReturnScope forLoop163 =null;
		ParserRuleReturnScope foreachLoop164 =null;
		ParserRuleReturnScope whileLoop165 =null;
		ParserRuleReturnScope doWhileLoop166 =null;
		ParserRuleReturnScope tryCatch167 =null;
		ParserRuleReturnScope expression168 =null;
		ParserRuleReturnScope expression171 =null;
		ParserRuleReturnScope expression174 =null;
		ParserRuleReturnScope expressionList177 =null;
		ParserRuleReturnScope expression181 =null;

		CommonTree semi_tree=null;
		CommonTree char_literal158_tree=null;
		CommonTree char_literal160_tree=null;
		CommonTree char_literal169_tree=null;
		CommonTree string_literal170_tree=null;
		CommonTree char_literal172_tree=null;
		CommonTree string_literal173_tree=null;
		CommonTree char_literal175_tree=null;
		CommonTree string_literal176_tree=null;
		CommonTree char_literal178_tree=null;
		CommonTree string_literal179_tree=null;
		CommonTree char_literal180_tree=null;
		CommonTree char_literal182_tree=null;
		CommonTree char_literal183_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Exit=new RewriteRuleTokenStream(adaptor,"token Exit");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:456:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | expression ';' !| 'return' ^ ( expression )? ';' !| 'throw' ^ expression ';' !| 'echo' ^ expressionList ';' !| 'exit' ( '(' expression ')' )? ';' -> ^( 'exit' ( expression )? ) |semi= ';' -> BLOCK[$semi,\"block\"] )
			int alt61=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA61_1 = input.LA(2);
				if ( (synpred73_TSPHP()) ) {
					alt61=1;
				}
				else if ( (synpred82_TSPHP()) ) {
					alt61=10;
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
				break;
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeObject:
			case TypeResource:
			case TypeString:
				{
				alt61=2;
				}
				break;
			case TypeArray:
				{
				int LA61_3 = input.LA(2);
				if ( (synpred74_TSPHP()) ) {
					alt61=2;
				}
				else if ( (synpred82_TSPHP()) ) {
					alt61=10;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA61_4 = input.LA(2);
				if ( (synpred74_TSPHP()) ) {
					alt61=2;
				}
				else if ( (synpred82_TSPHP()) ) {
					alt61=10;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA61_5 = input.LA(2);
				if ( (synpred74_TSPHP()) ) {
					alt61=2;
				}
				else if ( (synpred82_TSPHP()) ) {
					alt61=10;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case If:
				{
				alt61=3;
				}
				break;
			case Switch:
				{
				alt61=4;
				}
				break;
			case For:
				{
				alt61=5;
				}
				break;
			case Foreach:
				{
				alt61=6;
				}
				break;
			case While:
				{
				alt61=7;
				}
				break;
			case Do:
				{
				alt61=8;
				}
				break;
			case Try:
				{
				alt61=9;
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
				alt61=10;
				}
				break;
			case Return:
				{
				alt61=11;
				}
				break;
			case Throw:
				{
				alt61=12;
				}
				break;
			case Echo:
				{
				alt61=13;
				}
				break;
			case Exit:
				{
				alt61=14;
				}
				break;
			case Semicolon:
				{
				alt61=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:456:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2443);
					variableAssignment157=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment157.getTree());

					char_literal158=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2445); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:457:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2451);
					variableDeclaration159=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration159.getTree());

					char_literal160=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2453); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:458:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2459);
					ifCondition161=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition161.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:459:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2464);
					switchCondition162=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition162.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2469);
					forLoop163=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop163.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:461:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2474);
					foreachLoop164=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop164.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:462:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2479);
					whileLoop165=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop165.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:463:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2484);
					doWhileLoop166=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop166.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:464:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2489);
					tryCatch167=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch167.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:465:4: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction2494);
					expression168=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

					char_literal169=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2496); if (state.failed) return retval;
					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal170=(Token)match(input,Return,FOLLOW_Return_in_instruction2502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal170_tree = 
					(CommonTree)adaptor.create(string_literal170)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal170_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:14: ( expression )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==At||LA59_0==Backslash||LA59_0==BitwiseNot||LA59_0==Bool||LA59_0==Clone||LA59_0==Float||LA59_0==Identifier||LA59_0==Int||(LA59_0 >= LeftParanthesis && LA59_0 <= LeftSquareBrace)||LA59_0==LogicNot||LA59_0==Minus||LA59_0==MinusMinus||LA59_0==New||LA59_0==Null||(LA59_0 >= ParentColonColon && LA59_0 <= Plus)||LA59_0==PlusPlus||LA59_0==SelfColonColon||LA59_0==String||LA59_0==This||LA59_0==TypeArray||LA59_0==VariableId) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2505);
							expression171=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression171.getTree());

							}
							break;

					}

					char_literal172=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2508); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:4: 'throw' ^ expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal173=(Token)match(input,Throw,FOLLOW_Throw_in_instruction2514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal173_tree = 
					(CommonTree)adaptor.create(string_literal173)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal173_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_instruction2517);
					expression174=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression174.getTree());

					char_literal175=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2519); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:468:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal176=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2525); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal176_tree = 
					(CommonTree)adaptor.create(string_literal176)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal176_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2528);
					expressionList177=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList177.getTree());

					char_literal178=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2530); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:4: 'exit' ( '(' expression ')' )? ';'
					{
					string_literal179=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2536); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Exit.add(string_literal179);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:11: ( '(' expression ')' )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==LeftParanthesis) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:12: '(' expression ')'
							{
							char_literal180=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_instruction2539); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal180);

							pushFollow(FOLLOW_expression_in_instruction2541);
							expression181=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression181.getTree());
							char_literal182=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_instruction2543); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal182);

							}
							break;

					}

					char_literal183=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2547); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Semicolon.add(char_literal183);

					// AST REWRITE
					// elements: Exit, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 469:37: -> ^( 'exit' ( expression )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:40: ^( 'exit' ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_Exit.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:49: ( expression )?
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
					break;
				case 15 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:470:4: semi= ';'
					{
					semi=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2563); if (state.failed) return retval; 
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
					// 470:13: -> BLOCK[$semi,\"block\"]
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
			if ( state.backtracking>0 ) { memoize(input, 46, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:473:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal185=null;
		ParserRuleReturnScope expression184 =null;
		ParserRuleReturnScope expression186 =null;

		CommonTree char_literal185_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2580);
			expression184=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression184.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:15: ( ',' ! expression )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Comma) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:16: ',' ! expression
					{
					char_literal185=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2583); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2586);
					expression186=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression186.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 47, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:477:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId187=null;
		ParserRuleReturnScope assignmentOperator188 =null;
		ParserRuleReturnScope expression189 =null;

		CommonTree VariableId187_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId187=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2599); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId187_tree = 
			(CommonTree)adaptor.create(VariableId187)
			;
			adaptor.addChild(root_0, VariableId187_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2601);
			assignmentOperator188=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator188.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2604);
			expression189=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression189.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:481:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement190 =null;
		ParserRuleReturnScope preIncrementDecrement191 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==Backslash||LA63_0==Identifier||LA63_0==ParentColonColon||LA63_0==SelfColonColon||LA63_0==This||LA63_0==VariableId) ) {
				alt63=1;
			}
			else if ( (LA63_0==MinusMinus||LA63_0==PlusPlus) ) {
				alt63=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:482:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2616);
					postIncrementDecrement190=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement190.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:483:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2621);
					preIncrementDecrement191=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement191.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 49, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:486:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' |cast= '=' '(' ')' -> CAST_ASSIGN[$cast,\"cast assign\"] );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal192=null;
		Token string_literal193=null;
		Token string_literal194=null;
		Token string_literal195=null;
		Token string_literal196=null;
		Token string_literal197=null;
		Token string_literal198=null;
		Token string_literal199=null;
		Token string_literal200=null;
		Token string_literal201=null;
		Token string_literal202=null;
		Token string_literal203=null;
		Token char_literal204=null;
		Token char_literal205=null;

		CommonTree cast_tree=null;
		CommonTree char_literal192_tree=null;
		CommonTree string_literal193_tree=null;
		CommonTree string_literal194_tree=null;
		CommonTree string_literal195_tree=null;
		CommonTree string_literal196_tree=null;
		CommonTree string_literal197_tree=null;
		CommonTree string_literal198_tree=null;
		CommonTree string_literal199_tree=null;
		CommonTree string_literal200_tree=null;
		CommonTree string_literal201_tree=null;
		CommonTree string_literal202_tree=null;
		CommonTree string_literal203_tree=null;
		CommonTree char_literal204_tree=null;
		CommonTree char_literal205_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:487:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' |cast= '=' '(' ')' -> CAST_ASSIGN[$cast,\"cast assign\"] )
			int alt64=13;
			switch ( input.LA(1) ) {
			case Assign:
				{
				int LA64_1 = input.LA(2);
				if ( (LA64_1==LeftParanthesis) ) {
					int LA64_13 = input.LA(3);
					if ( (LA64_13==RightParanthesis) ) {
						alt64=13;
					}
					else if ( (LA64_13==At||LA64_13==Backslash||LA64_13==BitwiseNot||LA64_13==Bool||LA64_13==Clone||LA64_13==Float||LA64_13==Identifier||LA64_13==Int||(LA64_13 >= LeftParanthesis && LA64_13 <= LeftSquareBrace)||LA64_13==LogicNot||LA64_13==Minus||LA64_13==MinusMinus||LA64_13==New||LA64_13==Null||(LA64_13 >= ParentColonColon && LA64_13 <= Plus)||LA64_13==PlusPlus||LA64_13==SelfColonColon||LA64_13==String||LA64_13==This||(LA64_13 >= TypeArray && LA64_13 <= TypeBool)||(LA64_13 >= TypeFloat && LA64_13 <= TypeInt)||LA64_13==TypeString||LA64_13==VariableId) ) {
						alt64=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 64, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA64_1==At||LA64_1==Backslash||LA64_1==BitwiseNot||LA64_1==Bool||LA64_1==Clone||LA64_1==Float||LA64_1==Identifier||LA64_1==Int||LA64_1==LeftSquareBrace||LA64_1==LogicNot||LA64_1==Minus||LA64_1==MinusMinus||LA64_1==New||LA64_1==Null||(LA64_1 >= ParentColonColon && LA64_1 <= Plus)||LA64_1==PlusPlus||LA64_1==SelfColonColon||LA64_1==String||LA64_1==This||LA64_1==TypeArray||LA64_1==VariableId) ) {
					alt64=1;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case PlusEqual:
				{
				alt64=2;
				}
				break;
			case MinusEqual:
				{
				alt64=3;
				}
				break;
			case MultiplyEqual:
				{
				alt64=4;
				}
				break;
			case DivideEqual:
				{
				alt64=5;
				}
				break;
			case BitwiseAndEqual:
				{
				alt64=6;
				}
				break;
			case BitwiseOrEqual:
				{
				alt64=7;
				}
				break;
			case BitwiseXorEqual:
				{
				alt64=8;
				}
				break;
			case ModuloEqual:
				{
				alt64=9;
				}
				break;
			case DotEqual:
				{
				alt64=10;
				}
				break;
			case ShiftLeftEqual:
				{
				alt64=11;
				}
				break;
			case ShiftRightEqual:
				{
				alt64=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:487:4: '='
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal192=(Token)match(input,Assign,FOLLOW_Assign_in_assignmentOperator2632); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal192_tree = 
					(CommonTree)adaptor.create(char_literal192)
					;
					adaptor.addChild(root_0, char_literal192_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:4: '+='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal193=(Token)match(input,PlusEqual,FOLLOW_PlusEqual_in_assignmentOperator2637); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal193_tree = 
					(CommonTree)adaptor.create(string_literal193)
					;
					adaptor.addChild(root_0, string_literal193_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:489:4: '-='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal194=(Token)match(input,MinusEqual,FOLLOW_MinusEqual_in_assignmentOperator2642); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal194_tree = 
					(CommonTree)adaptor.create(string_literal194)
					;
					adaptor.addChild(root_0, string_literal194_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:490:4: '*='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal195=(Token)match(input,MultiplyEqual,FOLLOW_MultiplyEqual_in_assignmentOperator2647); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(CommonTree)adaptor.create(string_literal195)
					;
					adaptor.addChild(root_0, string_literal195_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:4: '/='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal196=(Token)match(input,DivideEqual,FOLLOW_DivideEqual_in_assignmentOperator2652); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal196_tree = 
					(CommonTree)adaptor.create(string_literal196)
					;
					adaptor.addChild(root_0, string_literal196_tree);
					}

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:4: '&='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal197=(Token)match(input,BitwiseAndEqual,FOLLOW_BitwiseAndEqual_in_assignmentOperator2657); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal197_tree = 
					(CommonTree)adaptor.create(string_literal197)
					;
					adaptor.addChild(root_0, string_literal197_tree);
					}

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:4: '|='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal198=(Token)match(input,BitwiseOrEqual,FOLLOW_BitwiseOrEqual_in_assignmentOperator2662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = 
					(CommonTree)adaptor.create(string_literal198)
					;
					adaptor.addChild(root_0, string_literal198_tree);
					}

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:494:4: '^='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal199=(Token)match(input,BitwiseXorEqual,FOLLOW_BitwiseXorEqual_in_assignmentOperator2667); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal199_tree = 
					(CommonTree)adaptor.create(string_literal199)
					;
					adaptor.addChild(root_0, string_literal199_tree);
					}

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:495:4: '%='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal200=(Token)match(input,ModuloEqual,FOLLOW_ModuloEqual_in_assignmentOperator2672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal200_tree = 
					(CommonTree)adaptor.create(string_literal200)
					;
					adaptor.addChild(root_0, string_literal200_tree);
					}

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:4: '.='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal201=(Token)match(input,DotEqual,FOLLOW_DotEqual_in_assignmentOperator2677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = 
					(CommonTree)adaptor.create(string_literal201)
					;
					adaptor.addChild(root_0, string_literal201_tree);
					}

					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:4: '<<='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal202=(Token)match(input,ShiftLeftEqual,FOLLOW_ShiftLeftEqual_in_assignmentOperator2682); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal202_tree = 
					(CommonTree)adaptor.create(string_literal202)
					;
					adaptor.addChild(root_0, string_literal202_tree);
					}

					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:498:4: '>>='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal203=(Token)match(input,ShiftRightEqual,FOLLOW_ShiftRightEqual_in_assignmentOperator2687); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = 
					(CommonTree)adaptor.create(string_literal203)
					;
					adaptor.addChild(root_0, string_literal203_tree);
					}

					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:4: cast= '=' '(' ')'
					{
					cast=(Token)match(input,Assign,FOLLOW_Assign_in_assignmentOperator2694); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(cast);

					char_literal204=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_assignmentOperator2695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal204);

					char_literal205=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_assignmentOperator2696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal205);

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
					// 499:19: -> CAST_ASSIGN[$cast,\"cast assign\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(CAST_ASSIGN, cast, "cast assign")
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
			if ( state.backtracking>0 ) { memoize(input, 50, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:502:1: postIncrementDecrement : postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd206 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus207 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:2: ( postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:4: postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2714);
			postFixVariableWithoutCallAtTheEnd206=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd206.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2716);
			plusPlusOrMinusMinus207=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus207.getTree());
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
			// 504:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"post increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCallAtTheEnd206!=null?((Token)postFixVariableWithoutCallAtTheEnd206.start):null), "post increment/decrement")
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
			if ( state.backtracking>0 ) { memoize(input, 51, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class plusPlusOrMinusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plusPlusOrMinusMinus"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set208=null;

		CommonTree set208_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:2: ( '++' | '--' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set208=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set208)
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
			if ( state.backtracking>0 ) { memoize(input, 52, plusPlusOrMinusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "plusPlusOrMinusMinus"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus209 =null;
		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd210 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:2: ( plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:4: plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2759);
			plusPlusOrMinusMinus209=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus209.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2761);
			postFixVariableWithoutCallAtTheEnd210=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd210.getTree());
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
			// 514:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:514:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"pre increment/decrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus209!=null?((Token)plusPlusOrMinusMinus209.start):null), "pre increment/decrement")
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
			if ( state.backtracking>0 ) { memoize(input, 53, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:1: variableDeclaration : variableDeclarationVariants -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variable declaration\"] variableDeclarationVariants ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope variableDeclarationVariants211 =null;

		RewriteRuleSubtreeStream stream_variableDeclarationVariants=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationVariants");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:518:2: ( variableDeclarationVariants -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variable declaration\"] variableDeclarationVariants ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:518:4: variableDeclarationVariants
			{
			pushFollow(FOLLOW_variableDeclarationVariants_in_variableDeclaration2788);
			variableDeclarationVariants211=variableDeclarationVariants();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclarationVariants.add(variableDeclarationVariants211.getTree());
			// AST REWRITE
			// elements: variableDeclarationVariants
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 518:32: -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variable declaration\"] variableDeclarationVariants )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:518:35: ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variable declaration\"] variableDeclarationVariants )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (variableDeclarationVariants211!=null?((Token)variableDeclarationVariants211.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_variableDeclarationVariants.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 54, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class variableDeclarationVariants_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationVariants"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:520:1: variableDeclarationVariants : ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? );
	public final TSPHPParser.variableDeclarationVariants_return variableDeclarationVariants() throws RecognitionException {
		TSPHPParser.variableDeclarationVariants_return retval = new TSPHPParser.variableDeclarationVariants_return();
		retval.start = input.LT(1);
		int variableDeclarationVariants_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token VariableId213=null;
		Token char_literal214=null;
		Token char_literal215=null;
		Token VariableId218=null;
		Token char_literal219=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource212 =null;
		ParserRuleReturnScope expression216 =null;
		ParserRuleReturnScope allTypes217 =null;
		ParserRuleReturnScope expression220 =null;

		CommonTree cast_tree=null;
		CommonTree VariableId213_tree=null;
		CommonTree char_literal214_tree=null;
		CommonTree char_literal215_tree=null;
		CommonTree VariableId218_tree=null;
		CommonTree char_literal219_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:2: ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? )
			int alt66=2;
			alt66 = dfa66.predict(input);
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:521:4: allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression
					{
					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_variableDeclarationVariants2807);
					allTypesWithoutObjectAndResource212=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource212.getTree());
					VariableId213=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationVariants2809); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId213);

					cast=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclarationVariants2813); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(cast);

					char_literal214=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_variableDeclarationVariants2814); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal214);

					char_literal215=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_variableDeclarationVariants2815); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal215);

					pushFollow(FOLLOW_expression_in_variableDeclarationVariants2817);
					expression216=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression216.getTree());
					// AST REWRITE
					// elements: expression, allTypesWithoutObjectAndResource, VariableId, allTypesWithoutObjectAndResource
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 522:3: -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression )
					{
						adaptor.addChild(root_0, stream_allTypesWithoutObjectAndResource.nextTree());

						adaptor.addChild(root_0, 
						stream_VariableId.nextNode()
						);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:522:51: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(CAST, cast, "cast")
						, root_1);

						adaptor.addChild(root_1, stream_allTypesWithoutObjectAndResource.nextTree());

						adaptor.addChild(root_1, stream_expression.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:4: allTypes VariableId ( '=' expression )?
					{
					pushFollow(FOLLOW_allTypes_in_variableDeclarationVariants2844);
					allTypes217=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypes.add(allTypes217.getTree());
					VariableId218=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationVariants2846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId218);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:24: ( '=' expression )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==Assign) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:25: '=' expression
							{
							char_literal219=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclarationVariants2849); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Assign.add(char_literal219);

							pushFollow(FOLLOW_expression_in_variableDeclarationVariants2851);
							expression220=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression220.getTree());
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
					// 524:42: -> allTypes VariableId ( expression )?
					{
						adaptor.addChild(root_0, stream_allTypes.nextTree());

						adaptor.addChild(root_0, 
						stream_VariableId.nextNode()
						);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:65: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_0, stream_expression.nextTree());

						}
						stream_expression.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 55, variableDeclarationVariants_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationVariants"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak221 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:2: ( logicOrWeak )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2873);
			logicOrWeak221=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak221.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:532:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal223=null;
		ParserRuleReturnScope logicXorWeak222 =null;
		ParserRuleReturnScope logicXorWeak224 =null;

		CommonTree string_literal223_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2886);
			logicXorWeak222=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak222.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:17: ( 'or' ^ logicXorWeak )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==LogicOrWeak) ) {
					int LA67_2 = input.LA(2);
					if ( (synpred106_TSPHP()) ) {
						alt67=1;
					}

				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:18: 'or' ^ logicXorWeak
					{
					string_literal223=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2889); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal223_tree = 
					(CommonTree)adaptor.create(string_literal223)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal223_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2892);
					logicXorWeak224=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak224.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 57, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:536:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal226=null;
		ParserRuleReturnScope logicAndWeak225 =null;
		ParserRuleReturnScope logicAndWeak227 =null;

		CommonTree string_literal226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2907);
			logicAndWeak225=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak225.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:17: ( 'xor' ^ logicAndWeak )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==LogicXorWeak) ) {
					int LA68_2 = input.LA(2);
					if ( (synpred107_TSPHP()) ) {
						alt68=1;
					}

				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:18: 'xor' ^ logicAndWeak
					{
					string_literal226=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2910); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal226_tree = 
					(CommonTree)adaptor.create(string_literal226)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal226_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2913);
					logicAndWeak227=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak227.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 58, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:540:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal229=null;
		ParserRuleReturnScope assignment228 =null;
		ParserRuleReturnScope assignment230 =null;

		CommonTree string_literal229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2928);
			assignment228=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment228.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:15: ( 'and' ^ assignment )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==LogicAndWeak) ) {
					int LA69_2 = input.LA(2);
					if ( (synpred108_TSPHP()) ) {
						alt69=1;
					}

				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:16: 'and' ^ assignment
					{
					string_literal229=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2931); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal229_tree = 
					(CommonTree)adaptor.create(string_literal229)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal229_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2934);
					assignment230=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment230.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:544:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary231 =null;
		ParserRuleReturnScope assignmentOperator232 =null;
		ParserRuleReturnScope ternary233 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2947);
			ternary231=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary231.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:12: ( assignmentOperator ^ ternary )*
			loop70:
			do {
				int alt70=2;
				switch ( input.LA(1) ) {
				case Assign:
					{
					int LA70_2 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case PlusEqual:
					{
					int LA70_3 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case MinusEqual:
					{
					int LA70_4 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case MultiplyEqual:
					{
					int LA70_5 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case DivideEqual:
					{
					int LA70_6 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case BitwiseAndEqual:
					{
					int LA70_7 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case BitwiseOrEqual:
					{
					int LA70_8 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case BitwiseXorEqual:
					{
					int LA70_9 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case ModuloEqual:
					{
					int LA70_10 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case DotEqual:
					{
					int LA70_11 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case ShiftLeftEqual:
					{
					int LA70_12 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				case ShiftRightEqual:
					{
					int LA70_13 = input.LA(2);
					if ( (synpred109_TSPHP()) ) {
						alt70=1;
					}

					}
					break;
				}
				switch (alt70) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2950);
					assignmentOperator232=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator232.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2953);
					ternary233=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary233.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 60, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:548:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal235=null;
		Token char_literal237=null;
		ParserRuleReturnScope logicOr234 =null;
		ParserRuleReturnScope expression236 =null;
		ParserRuleReturnScope expression238 =null;

		CommonTree char_literal235_tree=null;
		CommonTree char_literal237_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:549:2: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:549:4: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2967);
			logicOr234=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr234.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:549:12: ( '?' ^ expression ':' ! expression )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==QuestionMark) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:549:13: '?' ^ expression ':' ! expression
					{
					char_literal235=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal235_tree = 
					(CommonTree)adaptor.create(char_literal235)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal235_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2973);
					expression236=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression236.getTree());

					char_literal237=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2975); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2978);
					expression238=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression238.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 61, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:552:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal240=null;
		ParserRuleReturnScope logicAnd239 =null;
		ParserRuleReturnScope logicAnd241 =null;

		CommonTree string_literal240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:553:2: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:553:4: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2992);
			logicAnd239=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd239.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:553:13: ( '||' ^ logicAnd )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==LogicOr) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:553:14: '||' ^ logicAnd
					{
					string_literal240=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2995); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal240_tree = 
					(CommonTree)adaptor.create(string_literal240)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal240_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2998);
					logicAnd241=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd241.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:556:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal243=null;
		ParserRuleReturnScope bitwiseOr242 =null;
		ParserRuleReturnScope bitwiseOr244 =null;

		CommonTree string_literal243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:557:2: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:557:4: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd3011);
			bitwiseOr242=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr242.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:557:14: ( '&&' ^ bitwiseOr )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==LogicAnd) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:557:15: '&&' ^ bitwiseOr
					{
					string_literal243=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd3014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal243_tree = 
					(CommonTree)adaptor.create(string_literal243)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal243_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd3017);
					bitwiseOr244=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr244.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 63, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:560:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal246=null;
		ParserRuleReturnScope bitwiseXor245 =null;
		ParserRuleReturnScope bitwiseXor247 =null;

		CommonTree char_literal246_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:561:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:561:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr3031);
			bitwiseXor245=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor245.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:561:15: ( '|' ^ bitwiseXor )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==BitwiseOr) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:561:16: '|' ^ bitwiseXor
					{
					char_literal246=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr3034); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal246_tree = 
					(CommonTree)adaptor.create(char_literal246)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal246_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr3037);
					bitwiseXor247=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor247.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:564:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal249=null;
		ParserRuleReturnScope bitwiseAnd248 =null;
		ParserRuleReturnScope bitwiseAnd250 =null;

		CommonTree char_literal249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor3050);
			bitwiseAnd248=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd248.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:15: ( '^' ^ bitwiseAnd )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==BitwiseXor) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:565:16: '^' ^ bitwiseAnd
					{
					char_literal249=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor3053); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal249_tree = 
					(CommonTree)adaptor.create(char_literal249)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal249_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor3056);
					bitwiseAnd250=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd250.getTree());

					}
					break;

				default :
					break loop75;
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
			if ( state.backtracking>0 ) { memoize(input, 65, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:568:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal252=null;
		ParserRuleReturnScope equality251 =null;
		ParserRuleReturnScope equality253 =null;

		CommonTree char_literal252_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd3069);
			equality251=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality251.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:13: ( '&' ^ equality )*
			loop76:
			do {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==BitwiseAnd) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:569:14: '&' ^ equality
					{
					char_literal252=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd3072); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal252_tree = 
					(CommonTree)adaptor.create(char_literal252)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal252_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd3075);
					equality253=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality253.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:572:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison254 =null;
		ParserRuleReturnScope equalityOperator255 =null;
		ParserRuleReturnScope comparison256 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:2: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:4: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality3088);
			comparison254=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison254.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:15: ( equalityOperator ^ comparison )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Equal||LA77_0==Identical||(LA77_0 >= NotEqual && LA77_0 <= NotIdentical)) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:573:16: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality3091);
					equalityOperator255=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator255.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality3094);
					comparison256=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison256.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 67, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:576:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set257=null;

		CommonTree set257_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:577:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set257=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set257)
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
			if ( state.backtracking>0 ) { memoize(input, 68, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:584:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift258 =null;
		ParserRuleReturnScope comparisonOperator259 =null;
		ParserRuleReturnScope bitwiseShift260 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:585:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:585:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison3138);
			bitwiseShift258=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift258.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:585:17: ( comparisonOperator ^ bitwiseShift )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( ((LA78_0 >= GreaterEqualThan && LA78_0 <= GreaterThan)||(LA78_0 >= LessEqualThan && LA78_0 <= LessThan)) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:585:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison3141);
					comparisonOperator259=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator259.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison3144);
					bitwiseShift260=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift260.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 69, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:588:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set261=null;

		CommonTree set261_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:589:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set261=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set261)
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
			if ( state.backtracking>0 ) { memoize(input, 70, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set263=null;
		ParserRuleReturnScope termOrStringConcatenation262 =null;
		ParserRuleReturnScope termOrStringConcatenation264 =null;

		CommonTree set263_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:2: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:4: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift3184);
			termOrStringConcatenation262=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation262.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:30: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop79:
			do {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==ShiftLeft||LA79_0==ShiftRight) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:596:31: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set263=(Token)input.LT(1);
					set263=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set263)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift3194);
					termOrStringConcatenation264=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation264.getTree());

					}
					break;

				default :
					break loop79;
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
			if ( state.backtracking>0 ) { memoize(input, 71, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:599:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set266=null;
		ParserRuleReturnScope factor265 =null;
		ParserRuleReturnScope factor267 =null;

		CommonTree set266_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:2: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:4: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation3208);
			factor265=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor265.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:11: ( ( '+' | '-' | '.' ) ^ factor )*
			loop80:
			do {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==Dot||LA80_0==Minus||LA80_0==Plus) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:600:12: ( '+' | '-' | '.' ) ^ factor
					{
					set266=(Token)input.LT(1);
					set266=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set266)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation3220);
					factor267=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor267.getTree());

					}
					break;

				default :
					break loop80;
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
			if ( state.backtracking>0 ) { memoize(input, 72, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:603:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set269=null;
		ParserRuleReturnScope logicNot268 =null;
		ParserRuleReturnScope logicNot270 =null;

		CommonTree set269_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:2: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:4: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor3234);
			logicNot268=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot268.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:13: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop81:
			do {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==Divide||LA81_0==Modulo||LA81_0==Multiply) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:604:14: ( '*' | '/' | '%' ) ^ logicNot
					{
					set269=(Token)input.LT(1);
					set269=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set269)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor3246);
					logicNot270=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot270.getTree());

					}
					break;

				default :
					break loop81;
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
			if ( state.backtracking>0 ) { memoize(input, 73, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:607:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal271=null;
		ParserRuleReturnScope logicNot272 =null;
		ParserRuleReturnScope instanceOf273 =null;

		CommonTree char_literal271_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:607:9: ( '!' ^ logicNot | instanceOf )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LogicNot) ) {
				alt82=1;
			}
			else if ( (LA82_0==At||LA82_0==Backslash||LA82_0==BitwiseNot||LA82_0==Bool||LA82_0==Clone||LA82_0==Float||LA82_0==Identifier||LA82_0==Int||(LA82_0 >= LeftParanthesis && LA82_0 <= LeftSquareBrace)||LA82_0==Minus||LA82_0==MinusMinus||LA82_0==New||LA82_0==Null||(LA82_0 >= ParentColonColon && LA82_0 <= Plus)||LA82_0==PlusPlus||LA82_0==SelfColonColon||LA82_0==String||LA82_0==This||LA82_0==TypeArray||LA82_0==VariableId) ) {
				alt82=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:607:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal271=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot3257); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal271_tree = 
					(CommonTree)adaptor.create(char_literal271)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal271_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot3260);
					logicNot272=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot272.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:608:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot3265);
					instanceOf273=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf273.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 74, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:611:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal275=null;
		Token VariableId277=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt274 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject276 =null;

		CommonTree string_literal275_tree=null;
		CommonTree VariableId277_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf3276);
			castOrBitwiseNotOrAt274=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt274.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==Instanceof) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal275=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf3279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal275_tree = 
					(CommonTree)adaptor.create(string_literal275)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal275_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==Backslash||LA83_0==Identifier) ) {
						alt83=1;
					}
					else if ( (LA83_0==VariableId) ) {
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf3283);
							classInterfaceTypeWithoutObject276=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject276.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:612:73: VariableId
							{
							VariableId277=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf3285); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId277_tree = 
							(CommonTree)adaptor.create(VariableId277)
							;
							adaptor.addChild(root_0, VariableId277_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 75, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal279=null;
		Token char_literal281=null;
		Token char_literal283=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource278 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt280 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt282 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt284 =null;
		ParserRuleReturnScope cloneOrNew285 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal279_tree=null;
		CommonTree char_literal281_tree=null;
		CommonTree char_literal283_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
			int alt85=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA85_1 = input.LA(2);
				if ( (synpred136_TSPHP()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=4;
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
			case BitwiseNot:
				{
				alt85=2;
				}
				break;
			case At:
				{
				alt85=3;
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
				alt85=4;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt3301); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt3303);
					allTypesWithoutObjectAndResource278=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource278.getTree());
					char_literal279=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt3305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal279);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3307);
					castOrBitwiseNotOrAt280=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt280.getTree());
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
					// 615:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:616:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal281=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt3323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal281_tree = 
					(CommonTree)adaptor.create(char_literal281)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal281_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3326);
					castOrBitwiseNotOrAt282=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt282.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal283=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt3331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal283_tree = 
					(CommonTree)adaptor.create(char_literal283)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal283_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3334);
					castOrBitwiseNotOrAt284=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt284.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:618:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt3340);
					cloneOrNew285=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew285.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 76, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class cloneOrNew_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cloneOrNew"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:1: cloneOrNew : ( 'clone' ^ cloneOrNew | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal286=null;
		ParserRuleReturnScope cloneOrNew287 =null;
		ParserRuleReturnScope newObject288 =null;
		ParserRuleReturnScope unaryPrimary289 =null;

		CommonTree string_literal286_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:2: ( 'clone' ^ cloneOrNew | newObject | unaryPrimary )
			int alt86=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt86=1;
				}
				break;
			case New:
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
				alt86=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:4: 'clone' ^ cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal286=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew3351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal286_tree = 
					(CommonTree)adaptor.create(string_literal286)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal286_tree, root_0);
					}

					pushFollow(FOLLOW_cloneOrNew_in_cloneOrNew3354);
					cloneOrNew287=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew287.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:623:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew3359);
					newObject288=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject288.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew3364);
					unaryPrimary289=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary289.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 77, cloneOrNew_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cloneOrNew"


	public static class variableOrMemberOrStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableOrMemberOrStaticMember"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:628:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId291=null;
		Token string_literal292=null;
		Token VariableId293=null;
		ParserRuleReturnScope staticAccessOrParent290 =null;

		CommonTree VariableId291_tree=null;
		CommonTree string_literal292_tree=null;
		CommonTree VariableId293_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:629:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
			int alt87=3;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case ParentColonColon:
			case SelfColonColon:
				{
				alt87=1;
				}
				break;
			case This:
				{
				alt87=2;
				}
				break;
			case VariableId:
				{
				alt87=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:629:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3377);
					staticAccessOrParent290=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent290.getTree());
					VariableId291=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3379); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId291);

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
					// 629:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:629:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent290!=null?((Token)staticAccessOrParent290.start):null), "static member access")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:630:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal292=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember3395); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal292_tree = 
					(CommonTree)adaptor.create(string_literal292)
					;
					adaptor.addChild(root_0, string_literal292_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:631:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId293=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3400); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId293_tree = 
					(CommonTree)adaptor.create(VariableId293)
					;
					adaptor.addChild(root_0, VariableId293_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 78, variableOrMemberOrStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableOrMemberOrStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:634:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token p=null;
		Token string_literal295=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject294 =null;

		CommonTree s_tree=null;
		CommonTree p_tree=null;
		CommonTree string_literal295_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
			int alt88=3;
			switch ( input.LA(1) ) {
			case SelfColonColon:
				{
				alt88=1;
				}
				break;
			case ParentColonColon:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:635:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3414); if (state.failed) return retval; 
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
					// 635:15: -> Self[$s,\"self\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:636:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3426); if (state.failed) return retval; 
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
					// 636:17: -> Parent[$p,\"parent\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:637:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3436);
					classInterfaceTypeWithoutObject294=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject294.getTree());

					string_literal295=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3438); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 79, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:640:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal296=null;
		Token string_literal299=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject297 =null;
		ParserRuleReturnScope actualParameters298 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject300 =null;

		CommonTree string_literal296_tree=null;
		CommonTree string_literal299_tree=null;
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt89=2;
			alt89 = dfa89.predict(input);
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal296=(Token)match(input,New,FOLLOW_New_in_newObject3451); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal296);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3453);
					classInterfaceTypeWithoutObject297=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject297.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3455);
					actualParameters298=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters298.getTree());
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
					// 641:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal299=(Token)match(input,New,FOLLOW_New_in_newObject3470); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal299);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3472);
					classInterfaceTypeWithoutObject300=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject300.getTree());
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
					// 642:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:642:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, (classInterfaceTypeWithoutObject300!=null?((Token)classInterfaceTypeWithoutObject300.stop):null), "expressions")
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
			if ( state.backtracking>0 ) { memoize(input, 80, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class actualParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.actualParameters_return actualParameters() throws RecognitionException {
		TSPHPParser.actualParameters_return retval = new TSPHPParser.actualParameters_return();
		retval.start = input.LT(1);
		int actualParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token char_literal302=null;
		ParserRuleReturnScope expressionList301 =null;

		CommonTree list_tree=null;
		CommonTree char_literal302_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3496); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:13: ( expressionList )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==At||LA90_0==Backslash||LA90_0==BitwiseNot||LA90_0==Bool||LA90_0==Clone||LA90_0==Float||LA90_0==Identifier||LA90_0==Int||(LA90_0 >= LeftParanthesis && LA90_0 <= LeftSquareBrace)||LA90_0==LogicNot||LA90_0==Minus||LA90_0==MinusMinus||LA90_0==New||LA90_0==Null||(LA90_0 >= ParentColonColon && LA90_0 <= Plus)||LA90_0==PlusPlus||LA90_0==SelfColonColon||LA90_0==String||LA90_0==This||LA90_0==TypeArray||LA90_0==VariableId) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3498);
					expressionList301=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList301.getTree());
					}
					break;

			}

			char_literal302=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3501); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal302);

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
			// 646:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:75: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 81, actualParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "actualParameters"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:649:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary303 =null;
		ParserRuleReturnScope primary304 =null;
		ParserRuleReturnScope primary305 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
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
			case ParentColonColon:
			case PlusPlus:
			case SelfColonColon:
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3526); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3528);
					primary303=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary303.getTree());
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
					// 650:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3546); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3548);
					primary304=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary304.getTree());
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
					// 651:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3562);
					primary305=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary305.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 82, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:1: primary : ( postFixCall | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCall306 =null;
		ParserRuleReturnScope atom307 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:2: ( postFixCall | atom )
			int alt92=2;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA92_1 = input.LA(2);
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
			case SelfColonColon:
				{
				int LA92_3 = input.LA(2);
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
			case ParentColonColon:
				{
				int LA92_4 = input.LA(2);
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
				if ( (synpred149_TSPHP()) ) {
					alt92=1;
				}
				else if ( (true) ) {
					alt92=2;
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
				alt92=2;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:4: postFixCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCall_in_primary3574);
					postFixCall306=postFixCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCall306.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:657:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3579);
					atom307=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom307.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class postFixCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:1: postFixCall : ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* ;
	public final TSPHPParser.postFixCall_return postFixCall() throws RecognitionException {
		TSPHPParser.postFixCall_return retval = new TSPHPParser.postFixCall_return();
		retval.start = input.LT(1);
		int postFixCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier310=null;
		Token char_literal312=null;
		ParserRuleReturnScope functionCall308 =null;
		ParserRuleReturnScope methodCall309 =null;
		ParserRuleReturnScope expression311 =null;
		ParserRuleReturnScope call313 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier310_tree=null;
		CommonTree char_literal312_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:4: ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt93=2;
			alt93 = dfa93.predict(input);
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCall3594);
					functionCall308=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall308.getTree());
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
					// 661:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:662:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCall3604);
					methodCall309=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall309.getTree());
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
					// 662:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call ) )*
			loop94:
			do {
				int alt94=4;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==ObjectOperator) ) {
					int LA94_2 = input.LA(2);
					if ( (LA94_2==Identifier) ) {
						int LA94_4 = input.LA(3);
						if ( (LA94_4==EOF||(LA94_4 >= Arrow && LA94_4 <= Assign)||(LA94_4 >= BitwiseAnd && LA94_4 <= BitwiseAndEqual)||(LA94_4 >= BitwiseOr && LA94_4 <= BitwiseXorEqual)||(LA94_4 >= Colon && LA94_4 <= Comma)||(LA94_4 >= Divide && LA94_4 <= DivideEqual)||(LA94_4 >= Dot && LA94_4 <= DotEqual)||LA94_4==Equal||(LA94_4 >= GreaterEqualThan && LA94_4 <= GreaterThan)||LA94_4==Identical||LA94_4==Instanceof||(LA94_4 >= LeftSquareBrace && LA94_4 <= LogicAndWeak)||(LA94_4 >= LogicOr && LA94_4 <= LogicXorWeak)||(LA94_4 >= Minus && LA94_4 <= MinusEqual)||(LA94_4 >= Modulo && LA94_4 <= MultiplyEqual)||(LA94_4 >= NotEqual && LA94_4 <= NotIdentical)||LA94_4==ObjectOperator||(LA94_4 >= Plus && LA94_4 <= PlusEqual)||LA94_4==QuestionMark||(LA94_4 >= RightParanthesis && LA94_4 <= RightSquareBrace)||(LA94_4 >= Semicolon && LA94_4 <= ShiftRightEqual)) ) {
							alt94=1;
						}
						else if ( (LA94_4==LeftParanthesis) ) {
							alt94=3;
						}

					}

				}
				else if ( (LA94_0==LeftSquareBrace) ) {
					alt94=2;
				}

				switch (alt94) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCall3622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier310=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCall3624); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier310);

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
					// 664:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:664:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixCall Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCall3646); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCall3648);
					expression311=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression311.getTree());
					char_literal312=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCall3650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal312);

					// AST REWRITE
					// elements: postFixCall, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 665:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixCall expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:5: call
					{
					pushFollow(FOLLOW_call_in_postFixCall3668);
					call313=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call313.getTree());
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
					// 666:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call313!=null?((Token)call313.start):null), "method call")
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
			if ( state.backtracking>0 ) { memoize(input, 84, postFixCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCall"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classInterfaceTypeWithoutObject314 =null;
		ParserRuleReturnScope actualParameters315 =null;

		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3696);
			classInterfaceTypeWithoutObject314=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject314.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3698);
			actualParameters315=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters315.getTree());
			// AST REWRITE
			// elements: classInterfaceTypeWithoutObject, actualParameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 672:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"function call\"] classInterfaceTypeWithoutObject actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject314!=null?((Token)classInterfaceTypeWithoutObject314.start):null), "function call")
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
			if ( state.backtracking>0 ) { memoize(input, 85, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:1: call : '->' ! Identifier actualParameters ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal316=null;
		Token Identifier317=null;
		ParserRuleReturnScope actualParameters318 =null;

		CommonTree string_literal316_tree=null;
		CommonTree Identifier317_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal316=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3722); if (state.failed) return retval;
			Identifier317=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3725); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier317_tree = 
			(CommonTree)adaptor.create(Identifier317)
			;
			adaptor.addChild(root_0, Identifier317_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3727);
			actualParameters318=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters318.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:678:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier320=null;
		ParserRuleReturnScope callee319 =null;
		ParserRuleReturnScope actualParameters321 =null;

		CommonTree Identifier320_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:679:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:679:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3739);
			callee319=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee319.getTree());
			Identifier320=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3741); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier320);

			pushFollow(FOLLOW_actualParameters_in_methodCall3743);
			actualParameters321=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters321.getTree());
			// AST REWRITE
			// elements: callee, actualParameters, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 680:3: -> ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:6: ^( METHOD_CALL[$callee.start,\"method call\"] callee Identifier actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee319!=null?((Token)callee319.start):null), "method call")
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
			if ( state.backtracking>0 ) { memoize(input, 87, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class callee_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callee"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal323=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember322 =null;
		ParserRuleReturnScope staticAccessOrParent324 =null;

		CommonTree string_literal323_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt95=2;
			alt95 = dfa95.predict(input);
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:683:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3769);
					variableOrMemberOrStaticMember322=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember322.getTree());

					string_literal323=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3771); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:684:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3777);
					staticAccessOrParent324=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent324.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 88, callee_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callee"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:687:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal325=null;
		Token char_literal327=null;
		ParserRuleReturnScope expression326 =null;
		ParserRuleReturnScope incrementDecrement328 =null;
		ParserRuleReturnScope postFixVariableInclCallAtTheEnd329 =null;
		ParserRuleReturnScope classConstant330 =null;
		ParserRuleReturnScope globalConstant331 =null;
		ParserRuleReturnScope array332 =null;
		ParserRuleReturnScope primitiveAtom333 =null;

		CommonTree char_literal325_tree=null;
		CommonTree char_literal327_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:687:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom )
			int alt96=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt96=1;
				}
				break;
			case SelfColonColon:
				{
				int LA96_2 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else if ( (synpred158_TSPHP()) ) {
					alt96=4;
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
				break;
			case ParentColonColon:
				{
				int LA96_3 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else if ( (synpred158_TSPHP()) ) {
					alt96=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA96_4 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else if ( (synpred158_TSPHP()) ) {
					alt96=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA96_5 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else if ( (synpred158_TSPHP()) ) {
					alt96=4;
				}
				else if ( (synpred159_TSPHP()) ) {
					alt96=5;
				}
				else if ( (true) ) {
					alt96=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA96_6 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA96_7 = input.LA(2);
				if ( (synpred156_TSPHP()) ) {
					alt96=2;
				}
				else if ( (synpred157_TSPHP()) ) {
					alt96=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 7, input);
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
				alt96=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt96=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt96=7;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:687:8: '(' expression ')'
					{
					char_literal325=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3787); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal325);

					pushFollow(FOLLOW_expression_in_atom3789);
					expression326=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression326.getTree());
					char_literal327=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3791); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal327);

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
					// 687:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:688:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3800);
					incrementDecrement328=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement328.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:4: postFixVariableInclCallAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3805);
					postFixVariableInclCallAtTheEnd329=postFixVariableInclCallAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCallAtTheEnd329.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3810);
					classConstant330=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant330.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:691:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3815);
					globalConstant331=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant331.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:692:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3820);
					array332=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array332.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3825);
					primitiveAtom333=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom333.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class postFixVariableWithoutCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableWithoutCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:696:1: postFixVariableWithoutCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* ;
	public final TSPHPParser.postFixVariableWithoutCallAtTheEnd_return postFixVariableWithoutCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCallAtTheEnd_return retval = new TSPHPParser.postFixVariableWithoutCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier336=null;
		Token char_literal338=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember334 =null;
		ParserRuleReturnScope call335 =null;
		ParserRuleReturnScope expression337 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier336_tree=null;
		CommonTree char_literal338_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3837);
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
			// 697:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:698:3: ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			loop99:
			do {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==LeftSquareBrace||LA99_0==ObjectOperator) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:5: ( call )*
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:5: ( call )*
					loop97:
					do {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==ObjectOperator) ) {
							int LA97_1 = input.LA(2);
							if ( (LA97_1==Identifier) ) {
								int LA97_3 = input.LA(3);
								if ( (LA97_3==LeftParanthesis) ) {
									alt97=1;
								}

							}

						}

						switch (alt97) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:5: call
							{
							pushFollow(FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3852);
							call335=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_call.add(call335.getTree());
							}
							break;

						default :
							break loop97;
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
					// 699:11: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:14: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call335!=null?((Token)call335.start):null), "method call")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:91: ( call )*
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

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==ObjectOperator) ) {
						alt98=1;
					}
					else if ( (LA98_0==LeftSquareBrace) ) {
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3883); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier336=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3885); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier336);

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
							// 701:37: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:40: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableWithoutCallAtTheEnd Identifier )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:702:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3908); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3910);
							expression337=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression337.getTree());
							char_literal338=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3912); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal338);

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
							// 702:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:702:42: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableWithoutCallAtTheEnd expression )
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
			if ( state.backtracking>0 ) { memoize(input, 90, postFixVariableWithoutCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableWithoutCallAtTheEnd"


	public static class postFixVariableInclCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableInclCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:708:1: postFixVariableInclCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* ;
	public final TSPHPParser.postFixVariableInclCallAtTheEnd_return postFixVariableInclCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableInclCallAtTheEnd_return retval = new TSPHPParser.postFixVariableInclCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableInclCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier340=null;
		Token char_literal342=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember339 =null;
		ParserRuleReturnScope expression341 =null;
		ParserRuleReturnScope call343 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier340_tree=null;
		CommonTree char_literal342_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3951);
			variableOrMemberOrStaticMember339=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember339.getTree());
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
			// 709:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:710:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call ) )*
			loop100:
			do {
				int alt100=4;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==ObjectOperator) ) {
					int LA100_2 = input.LA(2);
					if ( (LA100_2==Identifier) ) {
						int LA100_4 = input.LA(3);
						if ( (LA100_4==EOF||(LA100_4 >= Arrow && LA100_4 <= Assign)||(LA100_4 >= BitwiseAnd && LA100_4 <= BitwiseAndEqual)||(LA100_4 >= BitwiseOr && LA100_4 <= BitwiseXorEqual)||(LA100_4 >= Colon && LA100_4 <= Comma)||(LA100_4 >= Divide && LA100_4 <= DivideEqual)||(LA100_4 >= Dot && LA100_4 <= DotEqual)||LA100_4==Equal||(LA100_4 >= GreaterEqualThan && LA100_4 <= GreaterThan)||LA100_4==Identical||LA100_4==Instanceof||(LA100_4 >= LeftSquareBrace && LA100_4 <= LogicAndWeak)||(LA100_4 >= LogicOr && LA100_4 <= LogicXorWeak)||(LA100_4 >= Minus && LA100_4 <= MinusEqual)||(LA100_4 >= Modulo && LA100_4 <= MultiplyEqual)||(LA100_4 >= NotEqual && LA100_4 <= NotIdentical)||LA100_4==ObjectOperator||(LA100_4 >= Plus && LA100_4 <= PlusEqual)||LA100_4==QuestionMark||(LA100_4 >= RightParanthesis && LA100_4 <= RightSquareBrace)||(LA100_4 >= Semicolon && LA100_4 <= ShiftRightEqual)) ) {
							alt100=1;
						}
						else if ( (LA100_4==LeftParanthesis) ) {
							alt100=3;
						}

					}

				}
				else if ( (LA100_0==LeftSquareBrace) ) {
					alt100=2;
				}

				switch (alt100) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:710:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3966); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier340=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3968); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier340);

					// AST REWRITE
					// elements: Identifier, postFixVariableInclCallAtTheEnd
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 710:36: -> ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:710:39: ^( MEMBER_ACCESS[$memberAccess,\"member access\"] $postFixVariableInclCallAtTheEnd Identifier )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:711:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3992);
					expression341=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression341.getTree());
					char_literal342=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3994); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal342);

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
					// 711:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:711:41: ^( ARRAY_ACCESS[$arrayAccess,\"array access\"] $postFixVariableInclCallAtTheEnd expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:712:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCallAtTheEnd4012);
					call343=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call343.getTree());
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
					// 712:10: -> ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:712:13: ^( METHOD_CALL[$call.start,\"method call\"] $postFixVariableInclCallAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call343!=null?((Token)call343.start):null), "method call")
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
					break loop100;
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
			if ( state.backtracking>0 ) { memoize(input, 91, postFixVariableInclCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableInclCallAtTheEnd"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:716:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier345=null;
		ParserRuleReturnScope staticAccessOrParent344 =null;

		CommonTree Identifier345_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:717:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:717:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant4040);
			staticAccessOrParent344=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent344.getTree());
			Identifier345=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant4042); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier345);

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
			// 717:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:717:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static member access\"] staticAccessOrParent Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent344!=null?((Token)staticAccessOrParent344.start):null), "static member access")
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
			if ( state.backtracking>0 ) { memoize(input, 92, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:720:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier346=null;

		CommonTree Identifier346_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:721:2: ( Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:721:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier346=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant4065); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier346_tree = 
			(CommonTree)adaptor.create(Identifier346)
			;
			adaptor.addChild(root_0, Identifier346_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:724:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primitiveAtom347 =null;
		ParserRuleReturnScope primitiveAtom348 =null;
		ParserRuleReturnScope primitiveAtom349 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule primitiveAtom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:725:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom ) | primitiveAtom )
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
			case Null:
			case String:
				{
				alt101=3;
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:725:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom4081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4083);
					primitiveAtom347=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom347.getTree());
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
					// 725:30: -> ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:725:33: ^( UPLUS[$uplus,\"unary plus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:726:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom4101); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4103);
					primitiveAtom348=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom348.getTree());
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
					// 726:31: -> ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:726:34: ^( UMINUS[$uminus,\"unary minus\"] primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:727:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4117);
					primitiveAtom349=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom349.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 94, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:730:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set350=null;

		CommonTree set350_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:731:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set350=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set350)
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
			if ( state.backtracking>0 ) { memoize(input, 95, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal352=null;
		Token TypeArray353=null;
		Token char_literal354=null;
		Token char_literal356=null;
		ParserRuleReturnScope arrayContent351 =null;
		ParserRuleReturnScope arrayContent355 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal352_tree=null;
		CommonTree TypeArray353_tree=null;
		CommonTree char_literal354_tree=null;
		CommonTree char_literal356_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LeftSquareBrace) ) {
				alt104=1;
			}
			else if ( (LA104_0==TypeArray) ) {
				alt104=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:17: ( arrayContent )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==At||LA102_0==Backslash||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==New||LA102_0==Null||(LA102_0 >= ParentColonColon && LA102_0 <= Plus)||LA102_0==PlusPlus||LA102_0==SelfColonColon||LA102_0==String||LA102_0==This||LA102_0==TypeArray||LA102_0==VariableId) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4637);
							arrayContent351=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent351.getTree());
							}
							break;

					}

					char_literal352=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4640); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal352);

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
					// 801:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:801:65: ( arrayContent )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray353=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4656); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray353);

					char_literal354=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4658); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal354);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:18: ( arrayContent )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==At||LA103_0==Backslash||LA103_0==BitwiseNot||LA103_0==Bool||LA103_0==Clone||LA103_0==Float||LA103_0==Identifier||LA103_0==Int||(LA103_0 >= LeftParanthesis && LA103_0 <= LeftSquareBrace)||LA103_0==LogicNot||LA103_0==Minus||LA103_0==MinusMinus||LA103_0==New||LA103_0==Null||(LA103_0 >= ParentColonColon && LA103_0 <= Plus)||LA103_0==PlusPlus||LA103_0==SelfColonColon||LA103_0==String||LA103_0==This||LA103_0==TypeArray||LA103_0==VariableId) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4660);
							arrayContent355=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent355.getTree());
							}
							break;

					}

					char_literal356=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4663); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal356);

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
					// 802:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:802:51: ( arrayContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 96, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class arrayContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:805:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal358=null;
		ParserRuleReturnScope arrayKeyValue357 =null;
		ParserRuleReturnScope arrayKeyValue359 =null;

		CommonTree char_literal358_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4684);
			arrayKeyValue357=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue357.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:18: ( ',' ! arrayKeyValue )*
			loop105:
			do {
				int alt105=2;
				int LA105_0 = input.LA(1);
				if ( (LA105_0==Comma) ) {
					alt105=1;
				}

				switch (alt105) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:806:19: ',' ! arrayKeyValue
					{
					char_literal358=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4687); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4690);
					arrayKeyValue359=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue359.getTree());

					}
					break;

				default :
					break loop105;
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
			if ( state.backtracking>0 ) { memoize(input, 97, arrayContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayContent"


	public static class arrayKeyValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:808:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal360=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression361 =null;

		CommonTree string_literal360_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
			int alt106=2;
			switch ( input.LA(1) ) {
			case LogicNot:
				{
				int LA106_1 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
			case LeftParanthesis:
				{
				int LA106_2 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
			case BitwiseNot:
				{
				int LA106_3 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
			case At:
				{
				int LA106_4 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
			case Clone:
				{
				int LA106_5 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case New:
				{
				int LA106_6 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Plus:
				{
				int LA106_7 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Minus:
				{
				int LA106_8 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA106_9 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA106_10 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SelfColonColon:
				{
				int LA106_11 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ParentColonColon:
				{
				int LA106_12 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA106_13 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA106_14 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 14, input);
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
				int LA106_15 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LeftSquareBrace:
				{
				int LA106_16 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TypeArray:
				{
				int LA106_17 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 17, input);
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
				int LA106_18 = input.LA(2);
				if ( (synpred178_TSPHP()) ) {
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
							new NoViableAltException("", 106, 18, input);
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4704);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal360=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4706); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal360);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4710);
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
					// 809:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:44: ^( '=>' $key $value)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:810:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4727);
					expression361=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression361.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 98, arrayKeyValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayKeyValue"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:814:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal362=(Token)match(input,If,FOLLOW_If_in_ifCondition4740); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal362);

			char_literal363=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4742); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal363);

			pushFollow(FOLLOW_expression_in_ifCondition4744);
			expression364=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression364.getTree());
			char_literal365=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal365);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4751);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:3: ( 'else' instructionElse= instructionInclBreakContinue )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==Else) ) {
				int LA107_1 = input.LA(2);
				if ( (synpred179_TSPHP()) ) {
					alt107=1;
				}
			}
			switch (alt107) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal366=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4758); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal366);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4763);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: instructionThen, If, instructionElse, expression
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
			// 816:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:100: ( $instructionElse)?
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
			if ( state.backtracking>0 ) { memoize(input, 99, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:820:1: switchCondition : 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:2: ( 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:4: 'switch' '(' VariableId ')' '{' ( switchContent )? '}'
			{
			string_literal367=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4794); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal367);

			char_literal368=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4796); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal368);

			VariableId369=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4798); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId369);

			char_literal370=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4800); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal370);

			char_literal371=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4802); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal371);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:36: ( switchContent )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==Case||LA108_0==Default) ) {
				alt108=1;
			}
			else if ( (LA108_0==RightCurlyBrace) ) {
				int LA108_2 = input.LA(2);
				if ( (synpred180_TSPHP()) ) {
					alt108=1;
				}
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:36: switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition4804);
					switchContent372=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchContent.add(switchContent372.getTree());
					}
					break;

			}

			char_literal373=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4807); if (state.failed) return retval; 
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
			// 821:56: -> ^( 'switch' VariableId ( switchContent )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:59: ^( 'switch' VariableId ( switchContent )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:81: ( switchContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 100, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:1: switchContent : ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCaseInstructionMandatory374 =null;
		ParserRuleReturnScope defaultCaseInstructionMandatory375 =null;
		ParserRuleReturnScope normalCaseInstructionOptional376 =null;
		ParserRuleReturnScope normalCaseInstructionMandatory377 =null;
		ParserRuleReturnScope defaultCaseInstructionOptional378 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:2: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? )
			int alt114=2;
			switch ( input.LA(1) ) {
			case Case:
				{
				int LA114_1 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt114=1;
				}
				else if ( (true) ) {
					alt114=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Default:
				{
				int LA114_2 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt114=1;
				}
				else if ( (true) ) {
					alt114=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RightCurlyBrace:
				{
				int LA114_3 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt114=1;
				}
				else if ( (true) ) {
					alt114=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EOF:
				{
				int LA114_4 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt114=1;
				}
				else if ( (true) ) {
					alt114=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 4, input);
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
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}
			switch (alt114) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( normalCaseInstructionMandatory )*
					loop109:
					do {
						int alt109=2;
						int LA109_0 = input.LA(1);
						if ( (LA109_0==Case) ) {
							int LA109_1 = input.LA(2);
							if ( (synpred181_TSPHP()) ) {
								alt109=1;
							}

						}

						switch (alt109) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4831);
							normalCaseInstructionMandatory374=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory374.getTree());

							}
							break;

						default :
							break loop109;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: ( defaultCaseInstructionMandatory )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==Case) ) {
						int LA110_1 = input.LA(2);
						if ( (synpred182_TSPHP()) ) {
							alt110=1;
						}
					}
					else if ( (LA110_0==Default) ) {
						alt110=1;
					}
					switch (alt110) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: defaultCaseInstructionMandatory
							{
							pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_switchContent4834);
							defaultCaseInstructionMandatory375=defaultCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionMandatory375.getTree());

							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:69: ( normalCaseInstructionOptional )*
					loop111:
					do {
						int alt111=2;
						int LA111_0 = input.LA(1);
						if ( (LA111_0==Case) ) {
							alt111=1;
						}

						switch (alt111) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:69: normalCaseInstructionOptional
							{
							pushFollow(FOLLOW_normalCaseInstructionOptional_in_switchContent4837);
							normalCaseInstructionOptional376=normalCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionOptional376.getTree());

							}
							break;

						default :
							break loop111;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:4: ( normalCaseInstructionMandatory )*
					loop112:
					do {
						int alt112=2;
						int LA112_0 = input.LA(1);
						if ( (LA112_0==Case) ) {
							int LA112_1 = input.LA(2);
							if ( (synpred185_TSPHP()) ) {
								alt112=1;
							}

						}

						switch (alt112) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4843);
							normalCaseInstructionMandatory377=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory377.getTree());

							}
							break;

						default :
							break loop112;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:36: ( defaultCaseInstructionOptional )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==Case||LA113_0==Default) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:36: defaultCaseInstructionOptional
							{
							pushFollow(FOLLOW_defaultCaseInstructionOptional_in_switchContent4846);
							defaultCaseInstructionOptional378=defaultCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionOptional378.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 101, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:829:1: normalCaseInstructionMandatory : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.normalCaseInstructionMandatory_return normalCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.normalCaseInstructionMandatory_return retval = new TSPHPParser.normalCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int normalCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel379 =null;
		ParserRuleReturnScope instructionInclBreakContinue380 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionMandatory4859);
					caseLabel379=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel379.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:15: ( instructionInclBreakContinue )+
			int cnt116=0;
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==At||LA116_0==Backslash||LA116_0==BitwiseNot||(LA116_0 >= Bool && LA116_0 <= Break)||LA116_0==Clone||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= Float && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==Int||(LA116_0 >= LeftCurlyBrace && LA116_0 <= LeftSquareBrace)||LA116_0==LogicNot||LA116_0==Minus||LA116_0==MinusMinus||LA116_0==New||LA116_0==Null||(LA116_0 >= ParentColonColon && LA116_0 <= Plus)||LA116_0==PlusPlus||LA116_0==Return||(LA116_0 >= SelfColonColon && LA116_0 <= Semicolon)||(LA116_0 >= String && LA116_0 <= TypeBool)||(LA116_0 >= TypeFloat && LA116_0 <= TypeInt)||(LA116_0 >= TypeObject && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4862);
					instructionInclBreakContinue380=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue380.getTree());
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
			// 831:3: -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:7: ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:832:5: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue380!=null?((Token)instructionInclBreakContinue380.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 102, normalCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionMandatory"


	public static class normalCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:1: normalCaseInstructionOptional : ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.normalCaseInstructionOptional_return normalCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.normalCaseInstructionOptional_return retval = new TSPHPParser.normalCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int normalCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel381 =null;
		ParserRuleReturnScope instructionInclBreakContinue382 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:2: ( ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( caseLabel )+ ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( caseLabel )+
			int cnt117=0;
			loop117:
			do {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==Case) ) {
					int LA117_2 = input.LA(2);
					if ( (synpred189_TSPHP()) ) {
						alt117=1;
					}

				}

				switch (alt117) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionOptional4900);
					caseLabel381=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel381.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:15: ( instructionInclBreakContinue )*
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==At||LA118_0==Backslash||LA118_0==BitwiseNot||(LA118_0 >= Bool && LA118_0 <= Break)||LA118_0==Clone||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= Float && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==Int||(LA118_0 >= LeftCurlyBrace && LA118_0 <= LeftSquareBrace)||LA118_0==LogicNot||LA118_0==Minus||LA118_0==MinusMinus||LA118_0==New||LA118_0==Null||(LA118_0 >= ParentColonColon && LA118_0 <= Plus)||LA118_0==PlusPlus||LA118_0==Return||(LA118_0 >= SelfColonColon && LA118_0 <= Semicolon)||(LA118_0 >= String && LA118_0 <= TypeBool)||(LA118_0 >= TypeFloat && LA118_0 <= TypeInt)||(LA118_0 >= TypeObject && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4903);
					instructionInclBreakContinue382=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue382.getTree());
					}
					break;

				default :
					break loop118;
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
			// 837:3: -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:837:7: ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )+ )
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue382!=null?((Token)instructionInclBreakContinue382.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:838:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 103, normalCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionOptional"


	public static class defaultCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:841:1: defaultCaseInstructionMandatory : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.defaultCaseInstructionMandatory_return defaultCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionMandatory_return retval = new TSPHPParser.defaultCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel383 =null;
		ParserRuleReturnScope defaultLabel384 =null;
		ParserRuleReturnScope caseLabel385 =null;
		ParserRuleReturnScope instructionInclBreakContinue386 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:4: ( caseLabel )*
			loop119:
			do {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==Case) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4943);
					caseLabel383=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel383.getTree());
					}
					break;

				default :
					break loop119;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4946);
			defaultLabel384=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel384.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:28: ( caseLabel )*
			loop120:
			do {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==Case) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4948);
					caseLabel385=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel385.getTree());
					}
					break;

				default :
					break loop120;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:39: ( instructionInclBreakContinue )+
			int cnt121=0;
			loop121:
			do {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==At||LA121_0==Backslash||LA121_0==BitwiseNot||(LA121_0 >= Bool && LA121_0 <= Break)||LA121_0==Clone||LA121_0==Continue||LA121_0==Do||LA121_0==Echo||LA121_0==Exit||(LA121_0 >= Float && LA121_0 <= Foreach)||(LA121_0 >= Identifier && LA121_0 <= If)||LA121_0==Int||(LA121_0 >= LeftCurlyBrace && LA121_0 <= LeftSquareBrace)||LA121_0==LogicNot||LA121_0==Minus||LA121_0==MinusMinus||LA121_0==New||LA121_0==Null||(LA121_0 >= ParentColonColon && LA121_0 <= Plus)||LA121_0==PlusPlus||LA121_0==Return||(LA121_0 >= SelfColonColon && LA121_0 <= Semicolon)||(LA121_0 >= String && LA121_0 <= TypeBool)||(LA121_0 >= TypeFloat && LA121_0 <= TypeInt)||(LA121_0 >= TypeObject && LA121_0 <= TypeString)||LA121_0==VariableId||LA121_0==While) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4951);
					instructionInclBreakContinue386=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue386.getTree());
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

			// AST REWRITE
			// elements: instructionInclBreakContinue, caseLabel, defaultLabel
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 843:3: -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:7: ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:843:77: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:844:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue386!=null?((Token)instructionInclBreakContinue386.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 104, defaultCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionMandatory"


	public static class defaultCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:1: defaultCaseInstructionOptional : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.defaultCaseInstructionOptional_return defaultCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionOptional_return retval = new TSPHPParser.defaultCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel387 =null;
		ParserRuleReturnScope defaultLabel388 =null;
		ParserRuleReturnScope caseLabel389 =null;
		ParserRuleReturnScope instructionInclBreakContinue390 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:4: ( caseLabel )*
			loop122:
			do {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==Case) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4989);
					caseLabel387=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel387.getTree());
					}
					break;

				default :
					break loop122;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4992);
			defaultLabel388=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel388.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:28: ( caseLabel )*
			loop123:
			do {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==Case) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional4994);
					caseLabel389=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel389.getTree());
					}
					break;

				default :
					break loop123;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:39: ( instructionInclBreakContinue )*
			loop124:
			do {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==At||LA124_0==Backslash||LA124_0==BitwiseNot||(LA124_0 >= Bool && LA124_0 <= Break)||LA124_0==Clone||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= Float && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==Int||(LA124_0 >= LeftCurlyBrace && LA124_0 <= LeftSquareBrace)||LA124_0==LogicNot||LA124_0==Minus||LA124_0==MinusMinus||LA124_0==New||LA124_0==Null||(LA124_0 >= ParentColonColon && LA124_0 <= Plus)||LA124_0==PlusPlus||LA124_0==Return||(LA124_0 >= SelfColonColon && LA124_0 <= Semicolon)||(LA124_0 >= String && LA124_0 <= TypeBool)||(LA124_0 >= TypeFloat && LA124_0 <= TypeInt)||(LA124_0 >= TypeObject && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4997);
					instructionInclBreakContinue390=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue390.getTree());
					}
					break;

				default :
					break loop124;
				}
			} while (true);

			// AST REWRITE
			// elements: caseLabel, defaultLabel, instructionInclBreakContinue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 848:3: -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:7: ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switch cases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switch cases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:76: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue390!=null?((Token)instructionInclBreakContinue390.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:849:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 105, defaultCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionOptional"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:1: caseLabel : 'case' ! expression ':' !;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal391=null;
		Token char_literal393=null;
		ParserRuleReturnScope expression392 =null;

		CommonTree string_literal391_tree=null;
		CommonTree char_literal393_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal391=(Token)match(input,Case,FOLLOW_Case_in_caseLabel5038); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel5041);
			expression392=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression392.getTree());

			char_literal393=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel5043); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:1: defaultLabel : 'default' ':' !;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal394=null;
		Token char_literal395=null;

		CommonTree string_literal394_tree=null;
		CommonTree char_literal395_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:2: ( 'default' ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal394=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel5055); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal394_tree = 
			(CommonTree)adaptor.create(string_literal394)
			;
			adaptor.addChild(root_0, string_literal394_tree);
			}

			char_literal395=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel5057); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:860:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal396=null;
		ParserRuleReturnScope forInit397 =null;
		ParserRuleReturnScope forCondition398 =null;
		ParserRuleReturnScope forUpdate399 =null;
		ParserRuleReturnScope instructionInclBreakContinue400 =null;

		CommonTree string_literal396_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:861:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:861:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal396=(Token)match(input,For,FOLLOW_For_in_forLoop5071); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal396_tree = 
			(CommonTree)adaptor.create(string_literal396)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal396_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop5074);
			forInit397=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit397.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop5076);
			forCondition398=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition398.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop5078);
			forUpdate399=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate399.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop5080);
			instructionInclBreakContinue400=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue400.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:864:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId401 =null;
		ParserRuleReturnScope expressionList402 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:865:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:865:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit5095); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt126=2;
			alt126 = dfa126.predict(input);
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit5102);
					variableDeclarationListInclVariableId401=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId401.getTree());
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
					// 866:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:5: ( expressionList )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:5: ( expressionList )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==At||LA125_0==Backslash||LA125_0==BitwiseNot||LA125_0==Bool||LA125_0==Clone||LA125_0==Float||LA125_0==Identifier||LA125_0==Int||(LA125_0 >= LeftParanthesis && LA125_0 <= LeftSquareBrace)||LA125_0==LogicNot||LA125_0==Minus||LA125_0==MinusMinus||LA125_0==New||LA125_0==Null||(LA125_0 >= ParentColonColon && LA125_0 <= Plus)||LA125_0==PlusPlus||LA125_0==SelfColonColon||LA125_0==String||LA125_0==This||LA125_0==TypeArray||LA125_0==VariableId) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit5117);
							expressionList402=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList402.getTree());
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
					// 867:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:63: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 109, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:871:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList403 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition5147); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:18: ( expressionList )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==At||LA127_0==Backslash||LA127_0==BitwiseNot||LA127_0==Bool||LA127_0==Clone||LA127_0==Float||LA127_0==Identifier||LA127_0==Int||(LA127_0 >= LeftParanthesis && LA127_0 <= LeftSquareBrace)||LA127_0==LogicNot||LA127_0==Minus||LA127_0==MinusMinus||LA127_0==New||LA127_0==Null||(LA127_0 >= ParentColonColon && LA127_0 <= Plus)||LA127_0==PlusPlus||LA127_0==SelfColonColon||LA127_0==String||LA127_0==This||LA127_0==TypeArray||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition5149);
					expressionList403=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList403.getTree());
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
			// 872:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:872:81: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 110, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:875:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal405=null;
		ParserRuleReturnScope expressionList404 =null;

		CommonTree update_tree=null;
		CommonTree char_literal405_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate5175); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:15: ( expressionList )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==At||LA128_0==Backslash||LA128_0==BitwiseNot||LA128_0==Bool||LA128_0==Clone||LA128_0==Float||LA128_0==Identifier||LA128_0==Int||(LA128_0 >= LeftParanthesis && LA128_0 <= LeftSquareBrace)||LA128_0==LogicNot||LA128_0==Minus||LA128_0==MinusMinus||LA128_0==New||LA128_0==Null||(LA128_0 >= ParentColonColon && LA128_0 <= Plus)||LA128_0==PlusPlus||LA128_0==SelfColonColon||LA128_0==String||LA128_0==This||LA128_0==TypeArray||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate5177);
					expressionList404=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList404.getTree());
					}
					break;

			}

			char_literal405=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate5180); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal405);

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
			// 876:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:79: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 111, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:879:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal406=null;
		Token char_literal407=null;
		Token string_literal409=null;
		Token string_literal410=null;
		Token char_literal411=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression408 =null;
		ParserRuleReturnScope instructionInclBreakContinue412 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal406_tree=null;
		CommonTree char_literal407_tree=null;
		CommonTree string_literal409_tree=null;
		CommonTree string_literal410_tree=null;
		CommonTree char_literal411_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:880:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:880:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal406=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop5201); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal406);

			char_literal407=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop5203); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal407);

			pushFollow(FOLLOW_expression_in_foreachLoop5205);
			expression408=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression408.getTree());
			string_literal409=(Token)match(input,As,FOLLOW_As_in_foreachLoop5207); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal409);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:880:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==TypeBool||(LA129_0 >= TypeFloat && LA129_0 <= TypeInt)||LA129_0==TypeString) ) {
				int LA129_1 = input.LA(2);
				if ( (LA129_1==VariableId) ) {
					int LA129_3 = input.LA(3);
					if ( (LA129_3==Arrow) ) {
						alt129=1;
					}
				}
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:880:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop5212);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop5216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal410=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop5218); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal410);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop5224);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop5228); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal411=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop5230); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal411);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop5232);
			instructionInclBreakContinue412=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue412.getTree());
			// AST REWRITE
			// elements: keyVarId, expression, keyType, instructionInclBreakContinue, valueVarId, Foreach, valueType
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
			// 881:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:881:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:881:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:881:40: ( $keyVarId)?
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
			if ( state.backtracking>0 ) { memoize(input, 112, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:884:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal413=null;
		Token char_literal414=null;
		Token char_literal416=null;
		ParserRuleReturnScope expression415 =null;
		ParserRuleReturnScope instructionInclBreakContinue417 =null;

		CommonTree string_literal413_tree=null;
		CommonTree char_literal414_tree=null;
		CommonTree char_literal416_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:885:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:885:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal413=(Token)match(input,While,FOLLOW_While_in_whileLoop5270); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal413);

			char_literal414=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop5272); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal414);

			pushFollow(FOLLOW_expression_in_whileLoop5274);
			expression415=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression415.getTree());
			char_literal416=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop5276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal416);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop5278);
			instructionInclBreakContinue417=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue417.getTree());
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
			// 885:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:885:63: ^( 'while' expression instructionInclBreakContinue )
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
			if ( state.backtracking>0 ) { memoize(input, 113, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:888:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal418=null;
		Token string_literal420=null;
		Token char_literal421=null;
		Token char_literal423=null;
		Token char_literal424=null;
		ParserRuleReturnScope instructionInclBreakContinue419 =null;
		ParserRuleReturnScope expression422 =null;

		CommonTree string_literal418_tree=null;
		CommonTree string_literal420_tree=null;
		CommonTree char_literal421_tree=null;
		CommonTree char_literal423_tree=null;
		CommonTree char_literal424_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:889:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:889:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal418=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop5300); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal418);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop5302);
			instructionInclBreakContinue419=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue419.getTree());
			string_literal420=(Token)match(input,While,FOLLOW_While_in_doWhileLoop5304); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal420);

			char_literal421=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop5306); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal421);

			pushFollow(FOLLOW_expression_in_doWhileLoop5308);
			expression422=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression422.getTree());
			char_literal423=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop5310); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal423);

			char_literal424=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop5312); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal424);

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
			// 889:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:889:72: ^( 'do' instructionInclBreakContinue expression )
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
			if ( state.backtracking>0 ) { memoize(input, 114, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:892:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal425=null;
		Token char_literal427=null;
		ParserRuleReturnScope instructionInclBreakContinue426 =null;
		ParserRuleReturnScope catchBlock428 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal425_tree=null;
		CommonTree char_literal427_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+
			{
			string_literal425=(Token)match(input,Try,FOLLOW_Try_in_tryCatch5333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal425);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch5337); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:23: ( instructionInclBreakContinue )*
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==At||LA130_0==Backslash||LA130_0==BitwiseNot||(LA130_0 >= Bool && LA130_0 <= Break)||LA130_0==Clone||LA130_0==Continue||LA130_0==Do||LA130_0==Echo||LA130_0==Exit||(LA130_0 >= Float && LA130_0 <= Foreach)||(LA130_0 >= Identifier && LA130_0 <= If)||LA130_0==Int||(LA130_0 >= LeftCurlyBrace && LA130_0 <= LeftSquareBrace)||LA130_0==LogicNot||LA130_0==Minus||LA130_0==MinusMinus||LA130_0==New||LA130_0==Null||(LA130_0 >= ParentColonColon && LA130_0 <= Plus)||LA130_0==PlusPlus||LA130_0==Return||(LA130_0 >= SelfColonColon && LA130_0 <= Semicolon)||(LA130_0 >= String && LA130_0 <= TypeBool)||(LA130_0 >= TypeFloat && LA130_0 <= TypeInt)||(LA130_0 >= TypeObject && LA130_0 <= TypeString)||LA130_0==VariableId||LA130_0==While) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch5339);
					instructionInclBreakContinue426=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue426.getTree());
					}
					break;

				default :
					break loop130;
				}
			} while (true);

			char_literal427=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch5342); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal427);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:57: ( catchBlock )+
			int cnt131=0;
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Catch) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:893:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch5344);
					catchBlock428=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock428.getTree());
					}
					break;

				default :
					if ( cnt131 >= 1 ) break loop131;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(131, input);
						throw eee;
				}
				cnt131++;
			} while (true);

			// AST REWRITE
			// elements: catchBlock, instructionInclBreakContinue, Try
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 894:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:894:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:894:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:894:41: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 115, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:897:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal429=null;
		Token VariableId431=null;
		Token char_literal432=null;
		Token char_literal434=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject430 =null;
		ParserRuleReturnScope instructionInclBreakContinue433 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal429_tree=null;
		CommonTree VariableId431_tree=null;
		CommonTree char_literal432_tree=null;
		CommonTree char_literal434_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Catch=new RewriteRuleTokenStream(adaptor,"token Catch");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:898:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:898:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal429=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock5376); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal429);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock5380); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5382);
			classInterfaceTypeWithoutObject430=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject430.getTree());
			VariableId431=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock5384); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId431);

			char_literal432=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock5386); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal432);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5390); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:898:83: ( instructionInclBreakContinue )*
			loop132:
			do {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==At||LA132_0==Backslash||LA132_0==BitwiseNot||(LA132_0 >= Bool && LA132_0 <= Break)||LA132_0==Clone||LA132_0==Continue||LA132_0==Do||LA132_0==Echo||LA132_0==Exit||(LA132_0 >= Float && LA132_0 <= Foreach)||(LA132_0 >= Identifier && LA132_0 <= If)||LA132_0==Int||(LA132_0 >= LeftCurlyBrace && LA132_0 <= LeftSquareBrace)||LA132_0==LogicNot||LA132_0==Minus||LA132_0==MinusMinus||LA132_0==New||LA132_0==Null||(LA132_0 >= ParentColonColon && LA132_0 <= Plus)||LA132_0==PlusPlus||LA132_0==Return||(LA132_0 >= SelfColonColon && LA132_0 <= Semicolon)||(LA132_0 >= String && LA132_0 <= TypeBool)||(LA132_0 >= TypeFloat && LA132_0 <= TypeInt)||(LA132_0 >= TypeObject && LA132_0 <= TypeString)||LA132_0==VariableId||LA132_0==While) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:898:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5392);
					instructionInclBreakContinue433=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue433.getTree());
					}
					break;

				default :
					break loop132;
				}
			} while (true);

			char_literal434=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal434);

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
			// 899:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:899:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variable declarations\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variable declarations")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:900:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variable declaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject430!=null?((Token)classInterfaceTypeWithoutObject430.start):null), "variable declaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:902:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:902:32: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 116, catchBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchBlock"

	// $ANTLR start synpred61_TSPHP
	public final void synpred61_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
		{
		pushFollow(FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2206);
		paramDeclarationOptional();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:29: ( ',' paramDeclarationOptional )*
		loop139:
		do {
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==Comma) ) {
				alt139=1;
			}

			switch (alt139) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:30: ',' paramDeclarationOptional
				{
				match(input,Comma,FOLLOW_Comma_in_synpred61_TSPHP2209); if (state.failed) return ;

				pushFollow(FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2212);
				paramDeclarationOptional();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop139;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred61_TSPHP

	// $ANTLR start synpred62_TSPHP
	public final void synpred62_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:30: ( ',' paramDeclarationInclNull )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:30: ',' paramDeclarationInclNull
		{
		match(input,Comma,FOLLOW_Comma_in_synpred62_TSPHP2222); if (state.failed) return ;

		pushFollow(FOLLOW_paramDeclarationInclNull_in_synpred62_TSPHP2225);
		paramDeclarationInclNull();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred62_TSPHP

	// $ANTLR start synpred73_TSPHP
	public final void synpred73_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:456:4: ( variableAssignment ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:456:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred73_TSPHP2443);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred73_TSPHP2445); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred73_TSPHP

	// $ANTLR start synpred74_TSPHP
	public final void synpred74_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:457:4: ( variableDeclaration ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:457:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred74_TSPHP2451);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred74_TSPHP2453); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred74_TSPHP

	// $ANTLR start synpred82_TSPHP
	public final void synpred82_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:465:4: ( expression ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:465:4: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred82_TSPHP2494);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred82_TSPHP2496); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred82_TSPHP

	// $ANTLR start synpred106_TSPHP
	public final void synpred106_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:533:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred106_TSPHP2889); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred106_TSPHP2892);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred106_TSPHP

	// $ANTLR start synpred107_TSPHP
	public final void synpred107_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred107_TSPHP2910); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred107_TSPHP2913);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred107_TSPHP

	// $ANTLR start synpred108_TSPHP
	public final void synpred108_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:16: ( 'and' assignment )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:541:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred108_TSPHP2931); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred108_TSPHP2934);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred108_TSPHP

	// $ANTLR start synpred109_TSPHP
	public final void synpred109_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:13: ( assignmentOperator ternary )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:545:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred109_TSPHP2950);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred109_TSPHP2953);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred109_TSPHP

	// $ANTLR start synpred136_TSPHP
	public final void synpred136_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:615:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred136_TSPHP3301); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred136_TSPHP3303);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred136_TSPHP3305); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred136_TSPHP3307);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred136_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:4: ( postFixCall )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:4: postFixCall
		{
		pushFollow(FOLLOW_postFixCall_in_synpred149_TSPHP3574);
		postFixCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred149_TSPHP

	// $ANTLR start synpred156_TSPHP
	public final void synpred156_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:688:4: ( incrementDecrement )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:688:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred156_TSPHP3800);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred156_TSPHP

	// $ANTLR start synpred157_TSPHP
	public final void synpred157_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:4: ( postFixVariableInclCallAtTheEnd )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:4: postFixVariableInclCallAtTheEnd
		{
		pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred157_TSPHP3805);
		postFixVariableInclCallAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred157_TSPHP

	// $ANTLR start synpred158_TSPHP
	public final void synpred158_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:4: ( classConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred158_TSPHP3810);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred158_TSPHP

	// $ANTLR start synpred159_TSPHP
	public final void synpred159_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:691:4: ( globalConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:691:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred159_TSPHP3815);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred159_TSPHP

	// $ANTLR start synpred178_TSPHP
	public final void synpred178_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:809:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred178_TSPHP4704);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred178_TSPHP4706); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred178_TSPHP4710);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred178_TSPHP

	// $ANTLR start synpred179_TSPHP
	public final void synpred179_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred179_TSPHP4758); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred179_TSPHP4763);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred179_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:36: ( switchContent )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:821:36: switchContent
		{
		pushFollow(FOLLOW_switchContent_in_synpred180_TSPHP4804);
		switchContent();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred180_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred181_TSPHP4831);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: ( defaultCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: defaultCaseInstructionMandatory
		{
		pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred182_TSPHP4834);
		defaultCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
		{
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: ( normalCaseInstructionMandatory )*
		loop148:
		do {
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==Case) ) {
				int LA148_1 = input.LA(2);
				if ( (synpred181_TSPHP()) ) {
					alt148=1;
				}

			}

			switch (alt148) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: normalCaseInstructionMandatory
				{
				pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred184_TSPHP4831);
				normalCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop148;
			}
		} while (true);

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: ( defaultCaseInstructionMandatory )?
		int alt149=2;
		int LA149_0 = input.LA(1);
		if ( (LA149_0==Case) ) {
			int LA149_1 = input.LA(2);
			if ( (synpred182_TSPHP()) ) {
				alt149=1;
			}
		}
		else if ( (LA149_0==Default) ) {
			alt149=1;
		}
		switch (alt149) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:36: defaultCaseInstructionMandatory
				{
				pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred184_TSPHP4834);
				defaultCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:69: ( normalCaseInstructionOptional )*
		loop150:
		do {
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==Case) ) {
				alt150=1;
			}

			switch (alt150) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:69: normalCaseInstructionOptional
				{
				pushFollow(FOLLOW_normalCaseInstructionOptional_in_synpred184_TSPHP4837);
				normalCaseInstructionOptional();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop150;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred184_TSPHP

	// $ANTLR start synpred185_TSPHP
	public final void synpred185_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred185_TSPHP4843);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred185_TSPHP

	// $ANTLR start synpred189_TSPHP
	public final void synpred189_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( caseLabel )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: caseLabel
		{
		pushFollow(FOLLOW_caseLabel_in_synpred189_TSPHP4900);
		caseLabel();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred189_TSPHP

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
	public final boolean synpred74_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred107_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred107_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred61_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred108_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred108_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred109_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred109_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred73_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred82_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred158_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred158_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred136_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_TSPHP_fragment(); // can never throw exception
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
	protected DFA51 dfa51 = new DFA51(this);
	protected DFA49 dfa49 = new DFA49(this);
	protected DFA66 dfa66 = new DFA66(this);
	protected DFA89 dfa89 = new DFA89(this);
	protected DFA93 dfa93 = new DFA93(this);
	protected DFA95 dfa95 = new DFA95(this);
	protected DFA126 dfa126 = new DFA126(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\5\1\103\1\uffff\1\14\1\uffff\1\103\1\uffff\1\14";
	static final String DFA3_maxS =
		"\1\u0099\1\111\1\uffff\1\175\1\uffff\1\103\1\uffff\1\175";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\1\2\11\uffff\2\2\3\uffff"+
			"\1\2\10\uffff\1\2\6\uffff\1\2\2\uffff\1\2\3\uffff\5\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\4\uffff\1\1\1\2\3\uffff\1\2"+
			"\7\uffff\2\2\1\uffff\1\2\5\uffff\1\2\7\uffff\2\2\5\uffff\7\2\2\uffff"+
			"\2\2\1\uffff\3\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\74\uffff\1\4\63\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\74\uffff\1\4\63\uffff\1\6"
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
			return "209:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA51_eotS =
		"\17\uffff";
	static final String DFA51_eofS =
		"\10\uffff\1\13\6\uffff";
	static final String DFA51_minS =
		"\2\14\4\u0097\1\103\1\14\1\10\1\103\1\24\1\uffff\1\14\1\0\1\uffff";
	static final String DFA51_maxS =
		"\2\u0091\4\u0097\1\103\1\u0097\1\166\1\103\1\u0083\1\uffff\1\u0097\1\0"+
		"\1\uffff";
	static final String DFA51_acceptS =
		"\13\uffff\1\2\2\uffff\1\1";
	static final String DFA51_specialS =
		"\15\uffff\1\0\1\uffff}>";
	static final String[] DFA51_transitionS = {
			"\1\6\17\uffff\1\1\46\uffff\1\7\104\uffff\1\3\1\2\2\uffff\2\2\1\uffff"+
			"\1\5\1\4\1\2",
			"\1\6\66\uffff\1\7\104\uffff\1\3\1\2\2\uffff\2\2\1\uffff\1\5\1\4\1\2",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\7",
			"\1\11\u008a\uffff\1\10",
			"\1\12\30\uffff\1\13\124\uffff\1\13",
			"\1\14",
			"\1\16\46\uffff\1\16\7\uffff\1\16\3\uffff\1\16\17\uffff\1\16\13\uffff"+
			"\1\15\10\uffff\1\16\26\uffff\1\16",
			"",
			"\1\11\u008a\uffff\1\10",
			"\1\uffff",
			""
	};

	static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
	static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
	static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
	static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
	static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
	static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
	static final short[][] DFA51_transition;

	static {
		int numStates = DFA51_transitionS.length;
		DFA51_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
		}
	}

	class DFA51 extends DFA {

		public DFA51(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 51;
			this.eot = DFA51_eot;
			this.eof = DFA51_eof;
			this.min = DFA51_min;
			this.max = DFA51_max;
			this.accept = DFA51_accept;
			this.special = DFA51_special;
			this.transition = DFA51_transition;
		}
		@Override
		public String getDescription() {
			return "422:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA51_13 = input.LA(1);
						 
						int index51_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred61_TSPHP()) ) {s = 14;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index51_13);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 51, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA49_eotS =
		"\20\uffff";
	static final String DFA49_eofS =
		"\1\2\11\uffff\1\15\5\uffff";
	static final String DFA49_minS =
		"\1\41\1\14\1\uffff\1\14\4\u0097\1\103\1\14\1\10\1\103\1\24\1\uffff\1\14"+
		"\1\0";
	static final String DFA49_maxS =
		"\1\166\1\u0091\1\uffff\1\u0091\4\u0097\1\103\1\u0097\1\166\1\103\1\u0083"+
		"\1\uffff\1\u0097\1\0";
	static final String DFA49_acceptS =
		"\2\uffff\1\2\12\uffff\1\1\2\uffff";
	static final String DFA49_specialS =
		"\17\uffff\1\0}>";
	static final String[] DFA49_transitionS = {
			"\1\1\124\uffff\1\2",
			"\1\10\17\uffff\1\3\46\uffff\1\11\104\uffff\1\5\1\4\2\uffff\2\4\1\uffff"+
			"\1\7\1\6\1\4",
			"",
			"\1\10\66\uffff\1\11\104\uffff\1\5\1\4\2\uffff\2\4\1\uffff\1\7\1\6\1"+
			"\4",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\11",
			"\1\13\u008a\uffff\1\12",
			"\1\14\30\uffff\1\15\124\uffff\1\15",
			"\1\16",
			"\1\2\46\uffff\1\2\7\uffff\1\2\3\uffff\1\2\17\uffff\1\2\13\uffff\1\17"+
			"\10\uffff\1\2\26\uffff\1\2",
			"",
			"\1\13\u008a\uffff\1\12",
			"\1\uffff"
	};

	static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
	static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
	static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
	static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
	static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
	static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
	static final short[][] DFA49_transition;

	static {
		int numStates = DFA49_transitionS.length;
		DFA49_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
		}
	}

	class DFA49 extends DFA {

		public DFA49(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 49;
			this.eot = DFA49_eot;
			this.eof = DFA49_eof;
			this.min = DFA49_min;
			this.max = DFA49_max;
			this.accept = DFA49_accept;
			this.special = DFA49_special;
			this.transition = DFA49_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 424:29: ( ',' ! paramDeclarationInclNull )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA49_15 = input.LA(1);
						 
						int index49_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_TSPHP()) ) {s = 13;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index49_15);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 49, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA66_eotS =
		"\14\uffff";
	static final String DFA66_eofS =
		"\6\uffff\1\5\5\uffff";
	static final String DFA66_minS =
		"\1\14\2\u0097\1\103\1\14\1\uffff\1\10\1\103\1\11\1\14\1\11\1\uffff";
	static final String DFA66_maxS =
		"\1\u0091\2\u0097\1\103\1\u0097\1\uffff\1\175\1\103\3\u0097\1\uffff";
	static final String DFA66_acceptS =
		"\5\uffff\1\2\5\uffff\1\1";
	static final String DFA66_specialS =
		"\14\uffff}>";
	static final String[] DFA66_transitionS = {
			"\1\3\66\uffff\1\4\104\uffff\1\2\1\1\2\uffff\2\1\1\uffff\2\5\1\1",
			"\1\6",
			"\1\6",
			"\1\4",
			"\1\7\u008a\uffff\1\6",
			"",
			"\1\10\30\uffff\1\5\133\uffff\1\5",
			"\1\11",
			"\1\5\2\uffff\1\5\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\5\3\uffff\1\5\2\uffff\1\12\1\5\4\uffff\1\5\6\uffff\1\5\1\uffff"+
			"\1\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\1\5\6\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\5\16\uffff\1\5",
			"\1\7\u008a\uffff\1\6",
			"\1\5\2\uffff\1\5\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\5\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\7\uffff\1\13\5\uffff"+
			"\1\5\6\uffff\1\5\1\uffff\1\5\2\uffff\2\5\2\uffff\2\5\3\uffff\1\5\5\uffff"+
			"\1\5",
			""
	};

	static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
	static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
	static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
	static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
	static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
	static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
	static final short[][] DFA66_transition;

	static {
		int numStates = DFA66_transitionS.length;
		DFA66_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
		}
	}

	class DFA66 extends DFA {

		public DFA66(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 66;
			this.eot = DFA66_eot;
			this.eof = DFA66_eof;
			this.min = DFA66_min;
			this.max = DFA66_max;
			this.accept = DFA66_accept;
			this.special = DFA66_special;
			this.transition = DFA66_transition;
		}
		@Override
		public String getDescription() {
			return "520:1: variableDeclarationVariants : ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? );";
		}
	}

	static final String DFA89_eotS =
		"\10\uffff";
	static final String DFA89_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA89_minS =
		"\1\137\1\14\1\103\1\6\1\103\2\uffff\1\6";
	static final String DFA89_maxS =
		"\1\137\2\103\1\u0081\1\103\2\uffff\1\u0081";
	static final String DFA89_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA89_specialS =
		"\10\uffff}>";
	static final String[] DFA89_transitionS = {
			"\1\1",
			"\1\2\66\uffff\1\3",
			"\1\3",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\14\uffff\2\6\10\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\14\uffff\2\6\10\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\3\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6"
	};

	static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
	static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
	static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
	static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
	static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
	static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
	static final short[][] DFA89_transition;

	static {
		int numStates = DFA89_transitionS.length;
		DFA89_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
		}
	}

	class DFA89 extends DFA {

		public DFA89(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 89;
			this.eot = DFA89_eot;
			this.eof = DFA89_eof;
			this.min = DFA89_min;
			this.max = DFA89_max;
			this.accept = DFA89_accept;
			this.special = DFA89_special;
			this.transition = DFA89_transition;
		}
		@Override
		public String getDescription() {
			return "640:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA93_eotS =
		"\7\uffff";
	static final String DFA93_eofS =
		"\7\uffff";
	static final String DFA93_minS =
		"\1\14\1\103\1\14\1\uffff\1\103\1\uffff\1\14";
	static final String DFA93_maxS =
		"\1\u0097\1\103\1\112\1\uffff\1\103\1\uffff\1\112";
	static final String DFA93_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA93_specialS =
		"\7\uffff}>";
	static final String[] DFA93_transitionS = {
			"\1\1\66\uffff\1\2\47\uffff\1\3\20\uffff\1\3\10\uffff\1\3\21\uffff\1\3",
			"\1\2",
			"\1\4\43\uffff\1\3\31\uffff\1\5",
			"",
			"\1\6",
			"",
			"\1\4\43\uffff\1\3\31\uffff\1\5"
	};

	static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
	static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
	static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
	static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
	static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
	static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
	static final short[][] DFA93_transition;

	static {
		int numStates = DFA93_transitionS.length;
		DFA93_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
		}
	}

	class DFA93 extends DFA {

		public DFA93(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 93;
			this.eot = DFA93_eot;
			this.eof = DFA93_eof;
			this.min = DFA93_min;
			this.max = DFA93_max;
			this.accept = DFA93_accept;
			this.special = DFA93_special;
			this.transition = DFA93_transition;
		}
		@Override
		public String getDescription() {
			return "661:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA95_eotS =
		"\12\uffff";
	static final String DFA95_eofS =
		"\12\uffff";
	static final String DFA95_minS =
		"\1\14\3\103\1\14\2\uffff\2\103\1\14";
	static final String DFA95_maxS =
		"\3\u0097\1\103\1\60\2\uffff\1\103\1\u0097\1\60";
	static final String DFA95_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA95_specialS =
		"\12\uffff}>";
	static final String[] DFA95_transitionS = {
			"\1\3\66\uffff\1\4\47\uffff\1\2\20\uffff\1\1\10\uffff\1\5\21\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\6\123\uffff\1\5",
			"\1\4",
			"\1\7\43\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\123\uffff\1\5",
			"\1\7\43\uffff\1\10"
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
			return "683:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA126_eotS =
		"\11\uffff";
	static final String DFA126_eofS =
		"\11\uffff";
	static final String DFA126_minS =
		"\1\11\1\uffff\1\112\1\103\1\10\1\uffff\1\14\1\103\1\14";
	static final String DFA126_maxS =
		"\1\u0097\1\uffff\1\u0097\1\103\1\u0097\1\uffff\1\u0097\1\103\1\u0097";
	static final String DFA126_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA126_specialS =
		"\11\uffff}>";
	static final String[] DFA126_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\6\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff"+
			"\1\5\1\uffff\1\5\2\uffff\1\2\1\1\2\uffff\2\1\1\uffff\3\1\5\uffff\1\5",
			"",
			"\1\5\114\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\15\uffff\1\5\10\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\3\uffff\2\5\1\uffff\4\5\2\uffff\3\5\11\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\25\uffff\1\1",
			"",
			"\1\7\43\uffff\1\5\31\uffff\1\5\114\uffff\1\1",
			"\1\10",
			"\1\7\43\uffff\1\5\31\uffff\1\5\114\uffff\1\1"
	};

	static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
	static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
	static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
	static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
	static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
	static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
	static final short[][] DFA126_transition;

	static {
		int numStates = DFA126_transitionS.length;
		DFA126_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
		}
	}

	class DFA126 extends DFA {

		public DFA126(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 126;
			this.eot = DFA126_eot;
			this.eof = DFA126_eof;
			this.min = DFA126_min;
			this.max = DFA126_max;
			this.accept = DFA126_accept;
			this.special = DFA126_special;
			this.transition = DFA126_transition;
		}
		@Override
		public String getDescription() {
			return "866:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variable declarations\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_EOF_in_prog1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_EOF_in_prog1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1082 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1099 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1103 = new BitSet(new long[]{0x7C481008C0109222L,0x3010580882810F98L,0x000000000293B3F8L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1105 = new BitSet(new long[]{0x7C481008C0109222L,0x3010580882810F98L,0x000000000293B3F8L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000208L});
	public static final BitSet FOLLOW_namespaceIdOrEmpty_in_namespaceBracket1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1148 = new BitSet(new long[]{0x7C481008C0109220L,0x3030580882810F98L,0x000000000293B3F8L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1150 = new BitSet(new long[]{0x7C481008C0109220L,0x3030580882810F98L,0x000000000293B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceIdOrEmpty1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1283 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1288 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1309 = new BitSet(new long[]{0x7C481008C0109222L,0x3010580882810F98L,0x000000000293B3F8L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1385 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1387 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1390 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1392 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1411 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1415 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1425 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1490 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1498 = new BitSet(new long[]{0x4400000800000020L,0x0026800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1500 = new BitSet(new long[]{0x4400000800000020L,0x0026800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1530 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1535 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialMethods_in_classBody1573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000023200L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1596 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1601 = new BitSet(new long[]{0x0000000200000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1631 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1633 = new BitSet(new long[]{0x0800000000100000L,0x0000100800800088L,0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1648 = new BitSet(new long[]{0x0000000000000000L,0x0006800000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1651 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1653 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1694 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1701 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1703 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1722 = new BitSet(new long[]{0x4000000000000000L,0x0006000000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1724 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1738 = new BitSet(new long[]{0x4400000000000000L,0x0006800000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1740 = new BitSet(new long[]{0x4000000000000000L,0x0006800000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1748 = new BitSet(new long[]{0x4000000000000000L,0x0006800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1750 = new BitSet(new long[]{0x4000000000000000L,0x0006800000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1764 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_specialMethods1783 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Function_in_specialMethods1788 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_construct_in_specialMethods1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deconstruct_in_specialMethods1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_construct1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_formalParameters_in_construct1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_construct1825 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_construct1827 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_construct1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Deconstruct_in_deconstruct1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_deconstruct1863 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_deconstruct1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_deconstruct1868 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_deconstruct1870 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_deconstruct1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1909 = new BitSet(new long[]{0x4000000800000000L,0x0024000000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1911 = new BitSet(new long[]{0x4000000800000000L,0x0024000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1941 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1944 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1967 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1969 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody2004 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000103B300L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes2038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray2097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject2135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject2167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters2180 = new BitSet(new long[]{0x0000000010001000L,0x0040000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramList_in_formalParameters2182 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2206 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2209 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2212 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList2219 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2222 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList2225 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2230 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2233 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull2248 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationInclNull2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_Null_in_paramDeclarationInclNull2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cast_in_paramDeclarationWithoutNull2278 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationWithoutNull2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationWithoutNull2283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2308 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2311 = new BitSet(new long[]{0x0800000000100000L,0x0000100800800088L,0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2357 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2359 = new BitSet(new long[]{0x3848100080109200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2394 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2396 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2420 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000080L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2427 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2443 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2451 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction2494 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2502 = new BitSet(new long[]{0x0800000080109200L,0x3000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_instruction2505 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_instruction2514 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_instruction2517 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2525 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expressionList_in_instruction2528 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2536 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_instruction2539 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_instruction2541 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_instruction2543 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2580 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2583 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_expressionList2586 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2599 = new BitSet(new long[]{0x00008800000A4100L,0x8000200029000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2601 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assign_in_assignmentOperator2632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PlusEqual_in_assignmentOperator2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MinusEqual_in_assignmentOperator2642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MultiplyEqual_in_assignmentOperator2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DivideEqual_in_assignmentOperator2652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseAndEqual_in_assignmentOperator2657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseOrEqual_in_assignmentOperator2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseXorEqual_in_assignmentOperator2667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ModuloEqual_in_assignmentOperator2672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEqual_in_assignmentOperator2677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ShiftLeftEqual_in_assignmentOperator2682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ShiftRightEqual_in_assignmentOperator2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assign_in_assignmentOperator2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_assignmentOperator2695 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_assignmentOperator2696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2714 = new BitSet(new long[]{0x0000000000000000L,0x0000400002000000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2759 = new BitSet(new long[]{0x0000000000001000L,0x1000080000000008L,0x0000000000800020L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarationVariants_in_variableDeclaration2788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_variableDeclarationVariants2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationVariants2809 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_variableDeclarationVariants2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_variableDeclarationVariants2814 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_variableDeclarationVariants2815 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_variableDeclarationVariants2817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationVariants2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationVariants2846 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclarationVariants2849 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_variableDeclarationVariants2851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2889 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2910 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2931 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_ternary_in_assignment2947 = new BitSet(new long[]{0x00008800000A4102L,0x8000200029000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2950 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_ternary_in_assignment2953 = new BitSet(new long[]{0x00008800000A4102L,0x8000200029000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicOr_in_ternary2967 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2970 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_ternary2973 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2975 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_ternary2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2992 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2995 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd3011 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd3014 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd3017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr3031 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr3034 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr3037 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor3050 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor3053 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor3056 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd3069 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd3072 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd3075 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality3088 = new BitSet(new long[]{0x0020000000000002L,0x0000000700000004L});
	public static final BitSet FOLLOW_equalityOperator_in_equality3091 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_comparison_in_equality3094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison3138 = new BitSet(new long[]{0x8000000000000002L,0x0000000000003001L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison3141 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift3184 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_bitwiseShift3187 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift3194 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation3208 = new BitSet(new long[]{0x0000400000000002L,0x0000100000800000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation3211 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation3220 = new BitSet(new long[]{0x0000400000000002L,0x0000100000800000L});
	public static final BitSet FOLLOW_logicNot_in_factor3234 = new BitSet(new long[]{0x0000040000000002L,0x0000000014000000L});
	public static final BitSet FOLLOW_set_in_factor3237 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicNot_in_factor3246 = new BitSet(new long[]{0x0000040000000002L,0x0000000014000000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot3257 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicNot_in_logicNot3260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot3265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf3276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf3279 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000000800000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf3285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt3301 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000000023300L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt3303 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt3305 = new BitSet(new long[]{0x0800000080109200L,0x1000580882800C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt3323 = new BitSet(new long[]{0x0800000080109200L,0x1000580882800C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt3331 = new BitSet(new long[]{0x0800000080109200L,0x1000580882800C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt3340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew3351 = new BitSet(new long[]{0x0800000080101000L,0x1000580882800C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_cloneOrNew_in_cloneOrNew3354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew3364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3436 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3451 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3470 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3496 = new BitSet(new long[]{0x0800000080109200L,0x1040580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3498 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3526 = new BitSet(new long[]{0x0800000000101000L,0x1000480802000C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3546 = new BitSet(new long[]{0x0800000000101000L,0x1000480802000C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_primary3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_postFixCall3594 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_methodCall_in_postFixCall3604 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCall3622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixCall3624 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCall3646 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_postFixCall3648 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCall3650 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_call_in_postFixCall3668 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_call3725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_call3727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3769 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3787 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_atom3789 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3837 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd3852 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd3885 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd3908 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd3910 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd3912 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd3951 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd3966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd3968 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd3990 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCallAtTheEnd3992 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd3994 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCallAtTheEnd4012 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000800L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_classConstant4042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant4065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom4081 = new BitSet(new long[]{0x0800000000100000L,0x0000000800000088L,0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom4101 = new BitSet(new long[]{0x0800000000100000L,0x0000000800000088L,0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4635 = new BitSet(new long[]{0x0800000080109200L,0x1080580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_arrayContent_in_array4637 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4658 = new BitSet(new long[]{0x0800000080109200L,0x1040580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_arrayContent_in_array4660 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4684 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4687 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4690 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4704 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4706 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4742 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_ifCondition4744 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4746 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4751 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4758 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4798 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4802 = new BitSet(new long[]{0x0000020008000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4804 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4831 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_switchContent4834 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_switchContent4837 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4843 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionOptional_in_switchContent4846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionMandatory4859 = new BitSet(new long[]{0x3848102088309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory4862 = new BitSet(new long[]{0x3848102080309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionOptional4900 = new BitSet(new long[]{0x3848102088309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional4903 = new BitSet(new long[]{0x3848102080309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4943 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory4946 = new BitSet(new long[]{0x3848102088309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory4948 = new BitSet(new long[]{0x3848102088309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory4951 = new BitSet(new long[]{0x3848102080309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4989 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionOptional4992 = new BitSet(new long[]{0x3848102088309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional4994 = new BitSet(new long[]{0x3848102088309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional4997 = new BitSet(new long[]{0x3848102080309202L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_Case_in_caseLabel5038 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_caseLabel5041 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel5043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel5055 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel5057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop5071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_forInit_in_forLoop5074 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop5076 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop5078 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop5080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit5095 = new BitSet(new long[]{0x0800000080109202L,0x1000580882810C88L,0x000000000083B328L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit5102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit5117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition5147 = new BitSet(new long[]{0x0800000080109202L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expressionList_in_forCondition5149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate5175 = new BitSet(new long[]{0x0800000080109200L,0x1040580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate5177 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate5180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop5203 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_foreachLoop5205 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop5207 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000000023300L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop5216 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop5218 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000000023300L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop5228 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop5230 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop5232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop5270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop5272 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_whileLoop5274 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop5276 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop5278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop5300 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop5302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop5304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop5306 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop5308 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop5310 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop5312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch5337 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch5339 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch5342 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch5344 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock5376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock5380 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock5384 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock5386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5390 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5392 = new BitSet(new long[]{0x3848102080309200L,0x3030580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2206 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_synpred61_TSPHP2209 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2212 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_synpred62_TSPHP2222 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x000000000003B300L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_synpred62_TSPHP2225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred73_TSPHP2443 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred73_TSPHP2445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred74_TSPHP2451 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred74_TSPHP2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred82_TSPHP2494 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred82_TSPHP2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred106_TSPHP2889 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred106_TSPHP2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred107_TSPHP2910 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred107_TSPHP2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred108_TSPHP2931 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_assignment_in_synpred108_TSPHP2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred109_TSPHP2950 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_ternary_in_synpred109_TSPHP2953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred136_TSPHP3301 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000000023300L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred136_TSPHP3303 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred136_TSPHP3305 = new BitSet(new long[]{0x0800000080109200L,0x1000580882800C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred136_TSPHP3307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_synpred149_TSPHP3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred156_TSPHP3800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred157_TSPHP3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred158_TSPHP3810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred159_TSPHP3815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred178_TSPHP4704 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred178_TSPHP4706 = new BitSet(new long[]{0x0800000080109200L,0x1000580882810C88L,0x0000000000800128L});
	public static final BitSet FOLLOW_expression_in_synpred178_TSPHP4710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred179_TSPHP4758 = new BitSet(new long[]{0x3848102080309200L,0x3010580882810E98L,0x000000000283B3F8L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred179_TSPHP4763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchContent_in_synpred180_TSPHP4804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred181_TSPHP4831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred182_TSPHP4834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred184_TSPHP4831 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred184_TSPHP4834 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_synpred184_TSPHP4837 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred185_TSPHP4843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred189_TSPHP4900 = new BitSet(new long[]{0x0000000000000002L});
}
