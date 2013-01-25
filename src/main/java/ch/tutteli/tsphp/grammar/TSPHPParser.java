// $ANTLR 3.x D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g 2013-01-25 16:34:43

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "CAST_ASSIGN", "CLASS_BODY", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Cast", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Construct", "Continue", "DECIMAL", "DEFAULT_NAMESPACE", "Deconstruct", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_DECLARATION", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "MEMBER_ACCESS", "MEMBER_ACCESS_STATIC", "METHOD_CALL", "MODIFIER", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAM_DECLARATION", "PARAM_LIST", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "ParentColonColon", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "TYPE", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeDouble", "TypeFloat", "TypeInt", "TypeInteger", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "USE_DECLRATARION", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
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
	public static final int CLASS_BODY=24;
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
	public static final int MODIFIER=87;
	public static final int Minus=88;
	public static final int MinusEqual=89;
	public static final int MinusMinus=90;
	public static final int Modulo=91;
	public static final int ModuloEqual=92;
	public static final int Multiply=93;
	public static final int MultiplyEqual=94;
	public static final int Namespace=95;
	public static final int New=96;
	public static final int NotEqual=97;
	public static final int NotEqualAlternative=98;
	public static final int NotIdentical=99;
	public static final int Null=100;
	public static final int OCTAL=101;
	public static final int ObjectOperator=102;
	public static final int PARAM_DECLARATION=103;
	public static final int PARAM_LIST=104;
	public static final int POST_INCREMENT_DECREMENT=105;
	public static final int PRE_INCREMENT_DECREMENT=106;
	public static final int Parent=107;
	public static final int ParentColonColon=108;
	public static final int Plus=109;
	public static final int PlusEqual=110;
	public static final int PlusPlus=111;
	public static final int Private=112;
	public static final int ProtectThis=113;
	public static final int Protected=114;
	public static final int Public=115;
	public static final int QuestionMark=116;
	public static final int Return=117;
	public static final int RightCurlyBrace=118;
	public static final int RightParanthesis=119;
	public static final int RightSquareBrace=120;
	public static final int STRING_DOUBLE_QUOTED=121;
	public static final int STRING_SINGLE_QUOTED=122;
	public static final int SWITCH_CASES=123;
	public static final int Self=124;
	public static final int SelfColonColon=125;
	public static final int Semicolon=126;
	public static final int ShiftLeft=127;
	public static final int ShiftLeftEqual=128;
	public static final int ShiftRight=129;
	public static final int ShiftRightEqual=130;
	public static final int Static=131;
	public static final int String=132;
	public static final int Switch=133;
	public static final int TYPE=134;
	public static final int This=135;
	public static final int Throw=136;
	public static final int Try=137;
	public static final int TypeArray=138;
	public static final int TypeBool=139;
	public static final int TypeBoolean=140;
	public static final int TypeDouble=141;
	public static final int TypeFloat=142;
	public static final int TypeInt=143;
	public static final int TypeInteger=144;
	public static final int TypeObject=145;
	public static final int TypeResource=146;
	public static final int TypeString=147;
	public static final int UMINUS=148;
	public static final int UPLUS=149;
	public static final int USE_DECLRATARION=150;
	public static final int Use=151;
	public static final int VARIABLE_DECLARATION=152;
	public static final int VARIABLE_DECLARATION_LIST=153;
	public static final int VariableId=154;
	public static final int Void=155;
	public static final int While=156;
	public static final int Whitespace=157;

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
		this.state.ruleMemo = new HashMap[321+1];
		 

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:211:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog1075);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog1078); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:4: ( namespaceBracket )+
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:212:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog1084);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog1087); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:213:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog1093);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog1095); if (state.failed) return retval;
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:216:1: namespaceSemicolon : 'namespace' namespaceId block= ';' ( statement )* -> ^( 'namespace' ^( TYPE[$namespaceId.start,\"type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:217:2: ( 'namespace' namespaceId block= ';' ( statement )* -> ^( 'namespace' ^( TYPE[$namespaceId.start,\"type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:217:4: 'namespace' namespaceId block= ';' ( statement )*
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon1108); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Namespace.add(string_literal7);

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon1110);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId8.getTree());
			block=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon1114); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:217:38: ( statement )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==At||LA4_0==Backslash||LA4_0==BitwiseNot||LA4_0==Bool||(LA4_0 >= Class && LA4_0 <= Clone)||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||(LA4_0 >= Final && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Int && LA4_0 <= LeftSquareBrace)||LA4_0==LogicNot||LA4_0==Minus||LA4_0==MinusMinus||LA4_0==New||LA4_0==Null||(LA4_0 >= ParentColonColon && LA4_0 <= Plus)||LA4_0==PlusPlus||LA4_0==Return||(LA4_0 >= SelfColonColon && LA4_0 <= Semicolon)||(LA4_0 >= String && LA4_0 <= Switch)||(LA4_0 >= This && LA4_0 <= TypeBool)||(LA4_0 >= TypeFloat && LA4_0 <= TypeInt)||(LA4_0 >= TypeObject && LA4_0 <= TypeString)||LA4_0==Use||LA4_0==VariableId||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:217:38: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon1116);
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
			// 218:3: -> ^( 'namespace' ^( TYPE[$namespaceId.start,\"type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:218:6: ^( 'namespace' ^( TYPE[$namespaceId.start,\"type\"] namespaceId ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Namespace.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:218:20: ^( TYPE[$namespaceId.start,\"type\"] namespaceId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(TYPE, (namespaceId8!=null?((Token)namespaceId8.start):null), "type")
				, root_2);

				adaptor.addChild(root_2, stream_namespaceId.nextTree());

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:218:67: ^( BLOCK[$block,\"block\"] ( statement )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:218:91: ( statement )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:221:1: namespaceBracket : 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}' -> ^( 'namespace' ^( TYPE[$namespaceIdOrEmpty.start,\"type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:222:2: ( 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}' -> ^( 'namespace' ^( TYPE[$namespaceIdOrEmpty.start,\"type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:222:4: 'namespace' namespaceIdOrEmpty block= '{' ( statement )* '}'
			{
			string_literal10=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket1152); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Namespace.add(string_literal10);

			pushFollow(FOLLOW_namespaceIdOrEmpty_in_namespaceBracket1154);
			namespaceIdOrEmpty11=namespaceIdOrEmpty();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespaceIdOrEmpty.add(namespaceIdOrEmpty11.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:222:46: ( statement )*
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==Abstract||LA5_0==At||LA5_0==Backslash||LA5_0==BitwiseNot||LA5_0==Bool||(LA5_0 >= Class && LA5_0 <= Clone)||LA5_0==Const||LA5_0==Do||LA5_0==Echo||LA5_0==Exit||(LA5_0 >= Final && LA5_0 <= Function)||(LA5_0 >= Identifier && LA5_0 <= If)||(LA5_0 >= Int && LA5_0 <= LeftSquareBrace)||LA5_0==LogicNot||LA5_0==Minus||LA5_0==MinusMinus||LA5_0==New||LA5_0==Null||(LA5_0 >= ParentColonColon && LA5_0 <= Plus)||LA5_0==PlusPlus||LA5_0==Return||(LA5_0 >= SelfColonColon && LA5_0 <= Semicolon)||(LA5_0 >= String && LA5_0 <= Switch)||(LA5_0 >= This && LA5_0 <= TypeBool)||(LA5_0 >= TypeFloat && LA5_0 <= TypeInt)||(LA5_0 >= TypeObject && LA5_0 <= TypeString)||LA5_0==Use||LA5_0==VariableId||LA5_0==While) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:222:46: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1161);
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

			char_literal13=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1164); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal13);

			// AST REWRITE
			// elements: statement, Namespace, namespaceIdOrEmpty
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 223:3: -> ^( 'namespace' ^( TYPE[$namespaceIdOrEmpty.start,\"type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:223:7: ^( 'namespace' ^( TYPE[$namespaceIdOrEmpty.start,\"type\"] namespaceIdOrEmpty ) ^( BLOCK[$block,\"block\"] ( statement )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Namespace.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:224:5: ^( TYPE[$namespaceIdOrEmpty.start,\"type\"] namespaceIdOrEmpty )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(TYPE, (namespaceIdOrEmpty11!=null?((Token)namespaceIdOrEmpty11.start):null), "type")
				, root_2);

				adaptor.addChild(root_2, stream_namespaceIdOrEmpty.nextTree());

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:225:5: ^( BLOCK[$block,\"block\"] ( statement )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:225:29: ( statement )*
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:228:1: namespaceIdOrEmpty : ( namespaceId | -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default\"] );
	public final TSPHPParser.namespaceIdOrEmpty_return namespaceIdOrEmpty() throws RecognitionException {
		TSPHPParser.namespaceIdOrEmpty_return retval = new TSPHPParser.namespaceIdOrEmpty_return();
		retval.start = input.LT(1);
		int namespaceIdOrEmpty_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope namespaceId14 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:229:2: ( namespaceId | -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default\"] )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:229:4: namespaceId
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_namespaceId_in_namespaceIdOrEmpty1213);
					namespaceId14=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId14.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:230:16: 
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
					// 230:16: -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,\"default\"]
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(DEFAULT_NAMESPACE, ((Token)retval.start), "default")
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:237:1: namespaceId : Identifier ( '\\\\' Identifier )* -> ( Identifier )+ ;
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:2: ( Identifier ( '\\\\' Identifier )* -> ( Identifier )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:4: Identifier ( '\\\\' Identifier )*
			{
			Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier15);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:238:16: '\\\\' Identifier
					{
					char_literal16=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1250); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal16);

					Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1252); if (state.failed) return retval; 
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
			// 238:34: -> ( Identifier )+
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:245:1: withoutNamespace : ( ( statement )+ ) -> ^( Namespace[$statement.start,\"namespace\"] ^( TYPE[$statement.start,\"type\"] DEFAULT_NAMESPACE[$statement.start,\"default\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) ) ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement18 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:2: ( ( ( statement )+ ) -> ^( Namespace[$statement.start,\"namespace\"] ^( TYPE[$statement.start,\"type\"] DEFAULT_NAMESPACE[$statement.start,\"default\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:4: ( ( statement )+ )
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:4: ( ( statement )+ )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:5: ( statement )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:5: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==At||LA8_0==Backslash||LA8_0==BitwiseNot||LA8_0==Bool||(LA8_0 >= Class && LA8_0 <= Clone)||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||(LA8_0 >= Final && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Int && LA8_0 <= LeftSquareBrace)||LA8_0==LogicNot||LA8_0==Minus||LA8_0==MinusMinus||LA8_0==New||LA8_0==Null||(LA8_0 >= ParentColonColon && LA8_0 <= Plus)||LA8_0==PlusPlus||LA8_0==Return||(LA8_0 >= SelfColonColon && LA8_0 <= Semicolon)||(LA8_0 >= String && LA8_0 <= Switch)||(LA8_0 >= This && LA8_0 <= TypeBool)||(LA8_0 >= TypeFloat && LA8_0 <= TypeInt)||(LA8_0 >= TypeObject && LA8_0 <= TypeString)||LA8_0==Use||LA8_0==VariableId||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:5: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1319);
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
			// 246:17: -> ^( Namespace[$statement.start,\"namespace\"] ^( TYPE[$statement.start,\"type\"] DEFAULT_NAMESPACE[$statement.start,\"default\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:246:20: ^( Namespace[$statement.start,\"namespace\"] ^( TYPE[$statement.start,\"type\"] DEFAULT_NAMESPACE[$statement.start,\"default\"] ) ^( BLOCK[$statement.start,\"block\"] ( statement )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(Namespace, (statement18!=null?((Token)statement18.start):null), "namespace")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:247:6: ^( TYPE[$statement.start,\"type\"] DEFAULT_NAMESPACE[$statement.start,\"default\"] )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(TYPE, (statement18!=null?((Token)statement18.start):null), "type")
				, root_2);

				adaptor.addChild(root_2, 
				(CommonTree)adaptor.create(DEFAULT_NAMESPACE, (statement18!=null?((Token)statement18.start):null), "default")
				);

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:248:6: ^( BLOCK[$statement.start,\"block\"] ( statement )+ )
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:252:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:253:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1373);
					useDeclarationList19=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList19.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:254:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1378);
					definition20=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition20.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:255:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1383);
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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:258:1: useDeclarationList : 'use' first= useDeclaration ( ',' other= useDeclaration )* ';' -> ^( 'use' ^( USE_DECLRATARION[$first.start,\"useDeclaration\"] useDeclaration ) ( ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration ) )* ) ;
	public final TSPHPParser.useDeclarationList_return useDeclarationList() throws RecognitionException {
		TSPHPParser.useDeclarationList_return retval = new TSPHPParser.useDeclarationList_return();
		retval.start = input.LT(1);
		int useDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal22=null;
		Token char_literal23=null;
		Token char_literal24=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope other =null;

		CommonTree string_literal22_tree=null;
		CommonTree char_literal23_tree=null;
		CommonTree char_literal24_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Use=new RewriteRuleTokenStream(adaptor,"token Use");
		RewriteRuleSubtreeStream stream_useDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule useDeclaration");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:259:2: ( 'use' first= useDeclaration ( ',' other= useDeclaration )* ';' -> ^( 'use' ^( USE_DECLRATARION[$first.start,\"useDeclaration\"] useDeclaration ) ( ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration ) )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:259:4: 'use' first= useDeclaration ( ',' other= useDeclaration )* ';'
			{
			string_literal22=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Use.add(string_literal22);

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1399);
			first=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_useDeclaration.add(first.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:259:31: ( ',' other= useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:259:32: ',' other= useDeclaration
					{
					char_literal23=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal23);

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1406);
					other=useDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_useDeclaration.add(other.getTree());
					}
					break;

				default :
					break loop10;
				}
			} while (true);

			char_literal24=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1410); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal24);

			// AST REWRITE
			// elements: useDeclaration, Use, useDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 260:3: -> ^( 'use' ^( USE_DECLRATARION[$first.start,\"useDeclaration\"] useDeclaration ) ( ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration ) )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:260:6: ^( 'use' ^( USE_DECLRATARION[$first.start,\"useDeclaration\"] useDeclaration ) ( ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration ) )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Use.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:260:14: ^( USE_DECLRATARION[$first.start,\"useDeclaration\"] useDeclaration )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(USE_DECLRATARION, (first!=null?((Token)first.start):null), "useDeclaration")
				, root_2);

				adaptor.addChild(root_2, stream_useDeclaration.nextTree());

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:260:80: ( ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration ) )*
				while ( stream_useDeclaration.hasNext() ) {
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:260:81: ^( USE_DECLRATARION[$other.start,\"useDeclaration\"] useDeclaration )
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(
					(CommonTree)adaptor.create(USE_DECLRATARION, (other!=null?((Token)other.start):null), "useDeclaration")
					, root_2);

					adaptor.addChild(root_2, stream_useDeclaration.nextTree());

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_useDeclaration.reset();

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
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:263:1: useDeclaration : useDeclarationWithoutAs ( 'as' ! Identifier )? ;
	public final TSPHPParser.useDeclaration_return useDeclaration() throws RecognitionException {
		TSPHPParser.useDeclaration_return retval = new TSPHPParser.useDeclaration_return();
		retval.start = input.LT(1);
		int useDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal26=null;
		Token Identifier27=null;
		ParserRuleReturnScope useDeclarationWithoutAs25 =null;

		CommonTree string_literal26_tree=null;
		CommonTree Identifier27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:264:2: ( useDeclarationWithoutAs ( 'as' ! Identifier )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:264:4: useDeclarationWithoutAs ( 'as' ! Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_useDeclarationWithoutAs_in_useDeclaration1449);
			useDeclarationWithoutAs25=useDeclarationWithoutAs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationWithoutAs25.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:264:28: ( 'as' ! Identifier )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==As) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:264:29: 'as' ! Identifier
					{
					string_literal26=(Token)match(input,As,FOLLOW_As_in_useDeclaration1452); if (state.failed) return retval;
					Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1455); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier27_tree = 
					(CommonTree)adaptor.create(Identifier27)
					;
					adaptor.addChild(root_0, Identifier27_tree);
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


	public static class useDeclarationWithoutAs_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclarationWithoutAs"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:267:1: useDeclarationWithoutAs : (root= Identifier '\\\\' namespaceId -> ^( TYPE[$root,\"type\"] $root namespaceId ) |root= '\\\\' namespaceId -> ^( TYPE[$root,\"type\"] $root namespaceId ) );
	public final TSPHPParser.useDeclarationWithoutAs_return useDeclarationWithoutAs() throws RecognitionException {
		TSPHPParser.useDeclarationWithoutAs_return retval = new TSPHPParser.useDeclarationWithoutAs_return();
		retval.start = input.LT(1);
		int useDeclarationWithoutAs_StartIndex = input.index();

		CommonTree root_0 = null;

		Token root=null;
		Token char_literal28=null;
		ParserRuleReturnScope namespaceId29 =null;
		ParserRuleReturnScope namespaceId30 =null;

		CommonTree root_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Backslash=new RewriteRuleTokenStream(adaptor,"token Backslash");
		RewriteRuleSubtreeStream stream_namespaceId=new RewriteRuleSubtreeStream(adaptor,"rule namespaceId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:2: (root= Identifier '\\\\' namespaceId -> ^( TYPE[$root,\"type\"] $root namespaceId ) |root= '\\\\' namespaceId -> ^( TYPE[$root,\"type\"] $root namespaceId ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Identifier) ) {
				alt12=1;
			}
			else if ( (LA12_0==Backslash) ) {
				alt12=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:4: root= Identifier '\\\\' namespaceId
					{
					root=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclarationWithoutAs1471); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(root);

					char_literal28=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclarationWithoutAs1473); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(char_literal28);

					pushFollow(FOLLOW_namespaceId_in_useDeclarationWithoutAs1475);
					namespaceId29=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId29.getTree());
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
					// 268:37: -> ^( TYPE[$root,\"type\"] $root namespaceId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:268:40: ^( TYPE[$root,\"type\"] $root namespaceId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TYPE, root, "type")
						, root_1);

						adaptor.addChild(root_1, stream_root.nextNode());

						adaptor.addChild(root_1, stream_namespaceId.nextTree());

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:4: root= '\\\\' namespaceId
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclarationWithoutAs1494); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					pushFollow(FOLLOW_namespaceId_in_useDeclarationWithoutAs1496);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namespaceId.add(namespaceId30.getTree());
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
					// 269:26: -> ^( TYPE[$root,\"type\"] $root namespaceId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:269:30: ^( TYPE[$root,\"type\"] $root namespaceId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TYPE, root, "type")
						, root_1);

						adaptor.addChild(root_1, stream_root.nextNode());

						adaptor.addChild(root_1, stream_namespaceId.nextTree());

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
			if ( state.backtracking>0 ) { memoize(input, 10, useDeclarationWithoutAs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclarationWithoutAs"


	public static class definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:271:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final TSPHPParser.definition_return definition() throws RecognitionException {
		TSPHPParser.definition_return retval = new TSPHPParser.definition_return();
		retval.start = input.LT(1);
		int definition_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classDeclaration31 =null;
		ParserRuleReturnScope interfaceDeclaration32 =null;
		ParserRuleReturnScope functionDeclaration33 =null;
		ParserRuleReturnScope constDeclarationList34 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:272:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:272:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1519);
					classDeclaration31=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration31.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:273:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1524);
					interfaceDeclaration32=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration32.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:274:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1529);
					functionDeclaration33=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration33.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:275:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1534);
					constDeclarationList34=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList34.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 11, definition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:281:1: classDeclaration : ( classModifier )? 'class' Identifier (ex= 'extends' exIds= identifierList )? (impl= 'implements' implIds= identifierList )? block= '{' ( classBody )* '}' -> ^( 'class' ^( MODIFIER[$classModifier.start,\"classModifier\"] ( classModifier )? ) Identifier ^( Extends[$ex,\"extends\"] ( $exIds)? ) ^( Implements[$impl,\"implements\"] ( $implIds)? ) ^( CLASS_BODY[$block,\"classBody\"] ( classBody )* ) ) ;
	public final TSPHPParser.classDeclaration_return classDeclaration() throws RecognitionException {
		TSPHPParser.classDeclaration_return retval = new TSPHPParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ex=null;
		Token impl=null;
		Token block=null;
		Token string_literal36=null;
		Token Identifier37=null;
		Token char_literal39=null;
		ParserRuleReturnScope exIds =null;
		ParserRuleReturnScope implIds =null;
		ParserRuleReturnScope classModifier35 =null;
		ParserRuleReturnScope classBody38 =null;

		CommonTree ex_tree=null;
		CommonTree impl_tree=null;
		CommonTree block_tree=null;
		CommonTree string_literal36_tree=null;
		CommonTree Identifier37_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
		RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Implements=new RewriteRuleTokenStream(adaptor,"token Implements");
		RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
		RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
		RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:2: ( ( classModifier )? 'class' Identifier (ex= 'extends' exIds= identifierList )? (impl= 'implements' implIds= identifierList )? block= '{' ( classBody )* '}' -> ^( 'class' ^( MODIFIER[$classModifier.start,\"classModifier\"] ( classModifier )? ) Identifier ^( Extends[$ex,\"extends\"] ( $exIds)? ) ^( Implements[$impl,\"implements\"] ( $implIds)? ) ^( CLASS_BODY[$block,\"classBody\"] ( classBody )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:4: ( classModifier )? 'class' Identifier (ex= 'extends' exIds= identifierList )? (impl= 'implements' implIds= identifierList )? block= '{' ( classBody )* '}'
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:4: ( classModifier )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Abstract||LA14_0==Final) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:4: classModifier
					{
					pushFollow(FOLLOW_classModifier_in_classDeclaration1549);
					classModifier35=classModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classModifier.add(classModifier35.getTree());
					}
					break;

			}

			string_literal36=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1552); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Class.add(string_literal36);

			Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1554); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier37);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:38: (ex= 'extends' exIds= identifierList )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:39: ex= 'extends' exIds= identifierList
					{
					ex=(Token)match(input,Extends,FOLLOW_Extends_in_classDeclaration1559); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Extends.add(ex);

					pushFollow(FOLLOW_identifierList_in_classDeclaration1563);
					exIds=identifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifierList.add(exIds.getTree());
					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:75: (impl= 'implements' implIds= identifierList )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:76: impl= 'implements' implIds= identifierList
					{
					impl=(Token)match(input,Implements,FOLLOW_Implements_in_classDeclaration1570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Implements.add(impl);

					pushFollow(FOLLOW_identifierList_in_classDeclaration1574);
					implIds=identifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifierList.add(implIds.getTree());
					}
					break;

			}

			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1580); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:129: ( classBody )*
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Abstract||LA17_0==Const||LA17_0==Final||LA17_0==Function||LA17_0==Private||(LA17_0 >= Protected && LA17_0 <= Public)||LA17_0==Static) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:282:129: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1582);
					classBody38=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classBody.add(classBody38.getTree());
					}
					break;

				default :
					break loop17;
				}
			} while (true);

			char_literal39=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1585); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal39);

			// AST REWRITE
			// elements: implIds, classModifier, Class, Identifier, classBody, exIds
			// token labels: 
			// rule labels: retval, implIds, exIds
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_implIds=new RewriteRuleSubtreeStream(adaptor,"rule implIds",implIds!=null?implIds.getTree():null);
			RewriteRuleSubtreeStream stream_exIds=new RewriteRuleSubtreeStream(adaptor,"rule exIds",exIds!=null?exIds.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 283:3: -> ^( 'class' ^( MODIFIER[$classModifier.start,\"classModifier\"] ( classModifier )? ) Identifier ^( Extends[$ex,\"extends\"] ( $exIds)? ) ^( Implements[$impl,\"implements\"] ( $implIds)? ) ^( CLASS_BODY[$block,\"classBody\"] ( classBody )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:283:6: ^( 'class' ^( MODIFIER[$classModifier.start,\"classModifier\"] ( classModifier )? ) Identifier ^( Extends[$ex,\"extends\"] ( $exIds)? ) ^( Implements[$impl,\"implements\"] ( $implIds)? ) ^( CLASS_BODY[$block,\"classBody\"] ( classBody )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Class.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:4: ^( MODIFIER[$classModifier.start,\"classModifier\"] ( classModifier )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MODIFIER, (classModifier35!=null?((Token)classModifier35.start):null), "classModifier")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:284:53: ( classModifier )?
				if ( stream_classModifier.hasNext() ) {
					adaptor.addChild(root_2, stream_classModifier.nextTree());

				}
				stream_classModifier.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, 
				stream_Identifier.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:4: ^( Extends[$ex,\"extends\"] ( $exIds)? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(Extends, ex, "extends")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:286:30: ( $exIds)?
				if ( stream_exIds.hasNext() ) {
					adaptor.addChild(root_2, stream_exIds.nextTree());

				}
				stream_exIds.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:287:4: ^( Implements[$impl,\"implements\"] ( $implIds)? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(Implements, impl, "implements")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:287:38: ( $implIds)?
				if ( stream_implIds.hasNext() ) {
					adaptor.addChild(root_2, stream_implIds.nextTree());

				}
				stream_implIds.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:288:4: ^( CLASS_BODY[$block,\"classBody\"] ( classBody )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CLASS_BODY, block, "classBody")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:288:37: ( classBody )*
				while ( stream_classBody.hasNext() ) {
					adaptor.addChild(root_2, stream_classBody.nextTree());

				}
				stream_classBody.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 12, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class classModifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classModifier"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:291:1: classModifier : ( 'abstract' | 'final' ) ;
	public final TSPHPParser.classModifier_return classModifier() throws RecognitionException {
		TSPHPParser.classModifier_return retval = new TSPHPParser.classModifier_return();
		retval.start = input.LT(1);
		int classModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set40=null;

		CommonTree set40_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:292:2: ( ( 'abstract' | 'final' ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set40=(Token)input.LT(1);
			if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set40)
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
			if ( state.backtracking>0 ) { memoize(input, 13, classModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classModifier"


	public static class extendsDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:295:1: extendsDeclaration :;
	public final TSPHPParser.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		TSPHPParser.extendsDeclaration_return retval = new TSPHPParser.extendsDeclaration_return();
		retval.start = input.LT(1);
		int extendsDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:296:2: ()
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:297:2: 
			{
			root_0 = (CommonTree)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, extendsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class identifierList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:299:1: identifierList : classInterfaceTypeWithoutObject ( ',' ! classInterfaceTypeWithoutObject )* ;
	public final TSPHPParser.identifierList_return identifierList() throws RecognitionException {
		TSPHPParser.identifierList_return retval = new TSPHPParser.identifierList_return();
		retval.start = input.LT(1);
		int identifierList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal42=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject41 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject43 =null;

		CommonTree char_literal42_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:2: ( classInterfaceTypeWithoutObject ( ',' ! classInterfaceTypeWithoutObject )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:4: classInterfaceTypeWithoutObject ( ',' ! classInterfaceTypeWithoutObject )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_identifierList1686);
			classInterfaceTypeWithoutObject41=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject41.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:36: ( ',' ! classInterfaceTypeWithoutObject )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:300:37: ',' ! classInterfaceTypeWithoutObject
					{
					char_literal42=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1689); if (state.failed) return retval;
					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_identifierList1692);
					classInterfaceTypeWithoutObject43=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject43.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 15, identifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class classBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:303:1: classBody : ( constDeclarationList | attributeDeclaration | specialMethods | methodDeclaration );
	public final TSPHPParser.classBody_return classBody() throws RecognitionException {
		TSPHPParser.classBody_return retval = new TSPHPParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList44 =null;
		ParserRuleReturnScope attributeDeclaration45 =null;
		ParserRuleReturnScope specialMethods46 =null;
		ParserRuleReturnScope methodDeclaration47 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:2: ( constDeclarationList | attributeDeclaration | specialMethods | methodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:304:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1706);
					constDeclarationList44=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList44.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:305:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1711);
					attributeDeclaration45=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration45.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:306:4: specialMethods
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_specialMethods_in_classBody1717);
					specialMethods46=specialMethods();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, specialMethods46.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:307:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1722);
					methodDeclaration47=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration47.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 16, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class constDeclarationList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:310:1: constDeclarationList : begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constants\"] primitiveTypes ( constantAssignment )+ ) ;
	public final TSPHPParser.constDeclarationList_return constDeclarationList() throws RecognitionException {
		TSPHPParser.constDeclarationList_return retval = new TSPHPParser.constDeclarationList_return();
		retval.start = input.LT(1);
		int constDeclarationList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token begin=null;
		Token char_literal50=null;
		Token char_literal52=null;
		ParserRuleReturnScope primitiveTypes48 =null;
		ParserRuleReturnScope constantAssignment49 =null;
		ParserRuleReturnScope constantAssignment51 =null;

		CommonTree begin_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_primitiveTypes=new RewriteRuleSubtreeStream(adaptor,"rule primitiveTypes");
		RewriteRuleSubtreeStream stream_constantAssignment=new RewriteRuleSubtreeStream(adaptor,"rule constantAssignment");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:2: (begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constants\"] primitiveTypes ( constantAssignment )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:5: begin= 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			begin=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1736); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Const.add(begin);

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1738);
			primitiveTypes48=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveTypes.add(primitiveTypes48.getTree());
			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1740);
			constantAssignment49=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment49.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:53: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:311:54: ',' constantAssignment
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1743); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Comma.add(char_literal50);

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1745);
					constantAssignment51=constantAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constantAssignment.add(constantAssignment51.getTree());
					}
					break;

				default :
					break loop20;
				}
			} while (true);

			char_literal52=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1749); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal52);

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
			// 312:3: -> ^( CONSTANT_DECLARATION_LIST[$begin,\"constants\"] primitiveTypes ( constantAssignment )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:312:6: ^( CONSTANT_DECLARATION_LIST[$begin,\"constants\"] primitiveTypes ( constantAssignment )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(CONSTANT_DECLARATION_LIST, begin, "constants")
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
			if ( state.backtracking>0 ) { memoize(input, 17, constDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:315:1: constantAssignment : Identifier '=' ^ unaryPrimitiveAtom ;
	public final TSPHPParser.constantAssignment_return constantAssignment() throws RecognitionException {
		TSPHPParser.constantAssignment_return retval = new TSPHPParser.constantAssignment_return();
		retval.start = input.LT(1);
		int constantAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier53=null;
		Token char_literal54=null;
		ParserRuleReturnScope unaryPrimitiveAtom55 =null;

		CommonTree Identifier53_tree=null;
		CommonTree char_literal54_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:316:2: ( Identifier '=' ^ unaryPrimitiveAtom )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:316:4: Identifier '=' ^ unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier53=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1775); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier53_tree = 
			(CommonTree)adaptor.create(Identifier53)
			;
			adaptor.addChild(root_0, Identifier53_tree);
			}

			char_literal54=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1777); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal54_tree = 
			(CommonTree)adaptor.create(char_literal54)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal54_tree, root_0);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1780);
			unaryPrimitiveAtom55=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom55.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, constantAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class attributeDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:319:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final TSPHPParser.attributeDeclaration_return attributeDeclaration() throws RecognitionException {
		TSPHPParser.attributeDeclaration_return retval = new TSPHPParser.attributeDeclaration_return();
		retval.start = input.LT(1);
		int attributeDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal56=null;
		Token char_literal59=null;
		ParserRuleReturnScope accessor57 =null;
		ParserRuleReturnScope variableDeclarationListInclVariableId58 =null;

		CommonTree string_literal56_tree=null;
		CommonTree char_literal59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:320:4: 'static'
					{
					string_literal56=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal56_tree = 
					(CommonTree)adaptor.create(string_literal56)
					;
					adaptor.addChild(root_0, string_literal56_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1795);
			accessor57=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor57.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1797);
			variableDeclarationListInclVariableId58=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId58.getTree());

			char_literal59=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1799); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal59_tree = 
			(CommonTree)adaptor.create(char_literal59)
			;
			adaptor.addChild(root_0, char_literal59_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, attributeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "attributeDeclaration"


	public static class accessor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal61=null;
		ParserRuleReturnScope accessorWithoutPrivate60 =null;

		CommonTree string_literal61_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:323:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1808);
					accessorWithoutPrivate60=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate60.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:324:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal61=(Token)match(input,Private,FOLLOW_Private_in_accessor1813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal61_tree = 
					(CommonTree)adaptor.create(string_literal61)
					;
					adaptor.addChild(root_0, string_literal61_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 20, accessor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessor"


	public static class accessorWithoutPrivate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:327:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set62=null;

		CommonTree set62_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:328:2: ( 'protected' | 'public' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set62=(Token)input.LT(1);
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set62)
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
			if ( state.backtracking>0 ) { memoize(input, 21, accessorWithoutPrivate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessorWithoutPrivate"


	public static class variableDeclarationListInclVariableId_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:331:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* ;
	public final TSPHPParser.variableDeclarationListInclVariableId_return variableDeclarationListInclVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListInclVariableId_return retval = new TSPHPParser.variableDeclarationListInclVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal64=null;
		Token VariableId66=null;
		ParserRuleReturnScope variableDeclaration63 =null;
		ParserRuleReturnScope variableAssignment65 =null;

		CommonTree char_literal64_tree=null;
		CommonTree VariableId66_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:2: ( variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:4: variableDeclaration ( ',' ! ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1838);
			variableDeclaration63=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration63.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:24: ( ',' ! ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:25: ',' ! ( variableAssignment | VariableId )
					{
					char_literal64=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1841); if (state.failed) return retval;
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:30: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:31: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1845);
							variableAssignment65=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment65.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:332:50: VariableId
							{
							VariableId66=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1847); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId66_tree = 
							(CommonTree)adaptor.create(VariableId66)
							;
							adaptor.addChild(root_0, VariableId66_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 22, variableDeclarationListInclVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:336:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final TSPHPParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		TSPHPParser.methodDeclaration_return retval = new TSPHPParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal67=null;
		Token string_literal69=null;
		Token string_literal70=null;
		Token string_literal71=null;
		Token string_literal72=null;
		ParserRuleReturnScope accessorWithoutPrivate68 =null;
		ParserRuleReturnScope accessor73 =null;
		ParserRuleReturnScope functionDeclaration74 =null;

		CommonTree string_literal67_tree=null;
		CommonTree string_literal69_tree=null;
		CommonTree string_literal70_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal67=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal67_tree = 
					(CommonTree)adaptor.create(string_literal67)
					;
					adaptor.addChild(root_0, string_literal67_tree);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:337:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1868);
							accessorWithoutPrivate68=accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate68.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:6: 'static' ( 'final' )?
							{
							string_literal69=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1882); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal69_tree = 
							(CommonTree)adaptor.create(string_literal69)
							;
							adaptor.addChild(root_0, string_literal69_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:339:15: 'final'
									{
									string_literal70=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1884); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal70_tree = 
									(CommonTree)adaptor.create(string_literal70)
									;
									adaptor.addChild(root_0, string_literal70_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:340:6: 'final' ( 'static' )?
							{
							string_literal71=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1892); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal71_tree = 
							(CommonTree)adaptor.create(string_literal71)
							;
							adaptor.addChild(root_0, string_literal71_tree);
							}

							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:340:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:340:14: 'static'
									{
									string_literal72=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1894); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal72_tree = 
									(CommonTree)adaptor.create(string_literal72)
									;
									adaptor.addChild(root_0, string_literal72_tree);
									}

									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:342:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1908);
							accessor73=accessor();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor73.getTree());

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1915);
			functionDeclaration74=functionDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration74.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class specialMethods_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "specialMethods"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:345:1: specialMethods : ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct ) ;
	public final TSPHPParser.specialMethods_return specialMethods() throws RecognitionException {
		TSPHPParser.specialMethods_return retval = new TSPHPParser.specialMethods_return();
		retval.start = input.LT(1);
		int specialMethods_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal75=null;
		Token string_literal76=null;
		ParserRuleReturnScope construct77 =null;
		ParserRuleReturnScope deconstruct78 =null;

		CommonTree string_literal75_tree=null;
		CommonTree string_literal76_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:2: ( ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:4: ( ( 'public' )? ) ! 'function' ! ( construct | deconstruct )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:4: ( ( 'public' )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:5: ( 'public' )?
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:5: ( 'public' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Public) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:346:5: 'public'
					{
					string_literal75=(Token)match(input,Public,FOLLOW_Public_in_specialMethods1927); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal75_tree = 
					(CommonTree)adaptor.create(string_literal75)
					;
					adaptor.addChild(root_0, string_literal75_tree);
					}

					}
					break;

			}

			}

			string_literal76=(Token)match(input,Function,FOLLOW_Function_in_specialMethods1932); if (state.failed) return retval;
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:3: ( construct | deconstruct )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:347:5: construct
					{
					pushFollow(FOLLOW_construct_in_specialMethods1940);
					construct77=construct();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, construct77.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:348:5: deconstruct
					{
					pushFollow(FOLLOW_deconstruct_in_specialMethods1947);
					deconstruct78=deconstruct();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, deconstruct78.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 24, specialMethods_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "specialMethods"


	public static class construct_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "construct"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:352:1: construct : '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.construct_return construct() throws RecognitionException {
		TSPHPParser.construct_return retval = new TSPHPParser.construct_return();
		retval.start = input.LT(1);
		int construct_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal79=null;
		Token char_literal82=null;
		ParserRuleReturnScope formalParameters80 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue81 =null;

		CommonTree block_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree char_literal82_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Construct=new RewriteRuleTokenStream(adaptor,"token Construct");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:2: ( '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:4: '__construct' formalParameters block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			string_literal79=(Token)match(input,Construct,FOLLOW_Construct_in_construct1963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Construct.add(string_literal79);

			pushFollow(FOLLOW_formalParameters_in_construct1965);
			formalParameters80=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters80.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_construct1969); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:45: ( instructionWithoutBreakContinue )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==At||LA33_0==Backslash||LA33_0==BitwiseNot||LA33_0==Bool||LA33_0==Clone||LA33_0==Do||LA33_0==Echo||LA33_0==Exit||(LA33_0 >= Float && LA33_0 <= Foreach)||(LA33_0 >= Identifier && LA33_0 <= If)||LA33_0==Int||(LA33_0 >= LeftCurlyBrace && LA33_0 <= LeftSquareBrace)||LA33_0==LogicNot||LA33_0==Minus||LA33_0==MinusMinus||LA33_0==New||LA33_0==Null||(LA33_0 >= ParentColonColon && LA33_0 <= Plus)||LA33_0==PlusPlus||LA33_0==Return||(LA33_0 >= SelfColonColon && LA33_0 <= Semicolon)||(LA33_0 >= String && LA33_0 <= Switch)||(LA33_0 >= This && LA33_0 <= TypeBool)||(LA33_0 >= TypeFloat && LA33_0 <= TypeInt)||(LA33_0 >= TypeObject && LA33_0 <= TypeString)||LA33_0==VariableId||LA33_0==While) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:353:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_construct1971);
					instructionWithoutBreakContinue81=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue81.getTree());
					}
					break;

				default :
					break loop33;
				}
			} while (true);

			char_literal82=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_construct1974); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal82);

			// AST REWRITE
			// elements: Construct, instructionWithoutBreakContinue, formalParameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 354:3: -> ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:6: ^( '__construct' formalParameters ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Construct.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_formalParameters.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:39: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:354:63: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 25, construct_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "construct"


	public static class deconstruct_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "deconstruct"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:357:1: deconstruct : '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.deconstruct_return deconstruct() throws RecognitionException {
		TSPHPParser.deconstruct_return retval = new TSPHPParser.deconstruct_return();
		retval.start = input.LT(1);
		int deconstruct_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token string_literal83=null;
		Token char_literal84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope instructionWithoutBreakContinue86 =null;

		CommonTree block_tree=null;
		CommonTree string_literal83_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree char_literal85_tree=null;
		CommonTree char_literal87_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Deconstruct=new RewriteRuleTokenStream(adaptor,"token Deconstruct");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:2: ( '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:4: '__deconstruct' '(' ')' block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			string_literal83=(Token)match(input,Deconstruct,FOLLOW_Deconstruct_in_deconstruct2005); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Deconstruct.add(string_literal83);

			char_literal84=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_deconstruct2007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal84);

			char_literal85=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_deconstruct2008); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal85);

			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_deconstruct2012); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:37: ( instructionWithoutBreakContinue )*
			loop34:
			do {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==At||LA34_0==Backslash||LA34_0==BitwiseNot||LA34_0==Bool||LA34_0==Clone||LA34_0==Do||LA34_0==Echo||LA34_0==Exit||(LA34_0 >= Float && LA34_0 <= Foreach)||(LA34_0 >= Identifier && LA34_0 <= If)||LA34_0==Int||(LA34_0 >= LeftCurlyBrace && LA34_0 <= LeftSquareBrace)||LA34_0==LogicNot||LA34_0==Minus||LA34_0==MinusMinus||LA34_0==New||LA34_0==Null||(LA34_0 >= ParentColonColon && LA34_0 <= Plus)||LA34_0==PlusPlus||LA34_0==Return||(LA34_0 >= SelfColonColon && LA34_0 <= Semicolon)||(LA34_0 >= String && LA34_0 <= Switch)||(LA34_0 >= This && LA34_0 <= TypeBool)||(LA34_0 >= TypeFloat && LA34_0 <= TypeInt)||(LA34_0 >= TypeObject && LA34_0 <= TypeString)||LA34_0==VariableId||LA34_0==While) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:358:37: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_deconstruct2014);
					instructionWithoutBreakContinue86=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue86.getTree());
					}
					break;

				default :
					break loop34;
				}
			} while (true);

			char_literal87=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_deconstruct2017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal87);

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
			// 359:3: -> ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:6: ^( '__deconstruct' ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Deconstruct.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:24: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:359:48: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 26, deconstruct_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "deconstruct"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:362:1: interfaceDeclaration : 'interface' Identifier ( 'implements' identifierList )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal88=null;
		Token Identifier89=null;
		Token string_literal90=null;
		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope identifierList91 =null;
		ParserRuleReturnScope interfaceBody93 =null;

		CommonTree string_literal88_tree=null;
		CommonTree Identifier89_tree=null;
		CommonTree string_literal90_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree char_literal94_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:2: ( 'interface' Identifier ( 'implements' identifierList )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:4: 'interface' Identifier ( 'implements' identifierList )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal88=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration2046); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal88_tree = 
			(CommonTree)adaptor.create(string_literal88)
			;
			adaptor.addChild(root_0, string_literal88_tree);
			}

			Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration2048); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier89_tree = 
			(CommonTree)adaptor.create(Identifier89)
			;
			adaptor.addChild(root_0, Identifier89_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:27: ( 'implements' identifierList )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Implements) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:28: 'implements' identifierList
					{
					string_literal90=(Token)match(input,Implements,FOLLOW_Implements_in_interfaceDeclaration2051); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal90_tree = 
					(CommonTree)adaptor.create(string_literal90)
					;
					adaptor.addChild(root_0, string_literal90_tree);
					}

					pushFollow(FOLLOW_identifierList_in_interfaceDeclaration2053);
					identifierList91=identifierList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList91.getTree());

					}
					break;

			}

			char_literal92=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration2057); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal92_tree = 
			(CommonTree)adaptor.create(char_literal92)
			;
			adaptor.addChild(root_0, char_literal92_tree);
			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:62: ( interfaceBody )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Const||LA36_0==Function||LA36_0==Public) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:363:62: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration2059);
					interfaceBody93=interfaceBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody93.getTree());

					}
					break;

				default :
					break loop36;
				}
			} while (true);

			char_literal94=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration2062); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 27, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:366:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList95 =null;
		ParserRuleReturnScope interfaceMethodDeclaration96 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:367:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:367:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody2073);
					constDeclarationList95=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList95.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:368:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody2078);
					interfaceMethodDeclaration96=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration96.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 28, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:371:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal97=null;
		Token char_literal99=null;
		ParserRuleReturnScope functionDeclarationWithoutBody98 =null;

		CommonTree string_literal97_tree=null;
		CommonTree char_literal99_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:4: ( 'public' )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Public) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:372:4: 'public'
					{
					string_literal97=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration2089); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal97_tree = 
					(CommonTree)adaptor.create(string_literal97)
					;
					adaptor.addChild(root_0, string_literal97_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration2092);
			functionDeclarationWithoutBody98=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody98.getTree());

			char_literal99=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration2094); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 29, interfaceMethodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:379:1: functionDeclaration : functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"functionDeclaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal102=null;
		ParserRuleReturnScope functionDeclarationWithoutBody100 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue101 =null;

		CommonTree block_tree=null;
		CommonTree char_literal102_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");
		RewriteRuleSubtreeStream stream_functionDeclarationWithoutBody=new RewriteRuleSubtreeStream(adaptor,"rule functionDeclarationWithoutBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:2: ( functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"functionDeclaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:4: functionDeclarationWithoutBody block= '{' ( instructionWithoutBreakContinue )* '}'
			{
			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration2111);
			functionDeclarationWithoutBody100=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionDeclarationWithoutBody.add(functionDeclarationWithoutBody100.getTree());
			block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration2115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:45: ( instructionWithoutBreakContinue )*
			loop39:
			do {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==At||LA39_0==Backslash||LA39_0==BitwiseNot||LA39_0==Bool||LA39_0==Clone||LA39_0==Do||LA39_0==Echo||LA39_0==Exit||(LA39_0 >= Float && LA39_0 <= Foreach)||(LA39_0 >= Identifier && LA39_0 <= If)||LA39_0==Int||(LA39_0 >= LeftCurlyBrace && LA39_0 <= LeftSquareBrace)||LA39_0==LogicNot||LA39_0==Minus||LA39_0==MinusMinus||LA39_0==New||LA39_0==Null||(LA39_0 >= ParentColonColon && LA39_0 <= Plus)||LA39_0==PlusPlus||LA39_0==Return||(LA39_0 >= SelfColonColon && LA39_0 <= Semicolon)||(LA39_0 >= String && LA39_0 <= Switch)||(LA39_0 >= This && LA39_0 <= TypeBool)||(LA39_0 >= TypeFloat && LA39_0 <= TypeInt)||(LA39_0 >= TypeObject && LA39_0 <= TypeString)||LA39_0==VariableId||LA39_0==While) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:380:45: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration2117);
					instructionWithoutBreakContinue101=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue101.getTree());
					}
					break;

				default :
					break loop39;
				}
			} while (true);

			char_literal102=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration2120); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal102);

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
			// 381:3: -> ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"functionDeclaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:6: ^( FUNCTION_DECLARATION[$functionDeclarationWithoutBody.start,\"functionDeclaration\"] functionDeclarationWithoutBody ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_DECLARATION, (functionDeclarationWithoutBody100!=null?((Token)functionDeclarationWithoutBody100.start):null), "functionDeclaration")
				, root_1);

				adaptor.addChild(root_1, stream_functionDeclarationWithoutBody.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:121: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, block, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:381:145: ( instructionWithoutBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 30, functionDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class functionDeclarationWithoutBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:384:1: functionDeclarationWithoutBody : 'function' ! returnType Identifier formalParameters ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal103=null;
		Token Identifier105=null;
		ParserRuleReturnScope returnType104 =null;
		ParserRuleReturnScope formalParameters106 =null;

		CommonTree string_literal103_tree=null;
		CommonTree Identifier105_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:2: ( 'function' ! returnType Identifier formalParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:385:4: 'function' ! returnType Identifier formalParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal103=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody2152); if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody2155);
			returnType104=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType104.getTree());

			Identifier105=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody2157); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier105_tree = 
			(CommonTree)adaptor.create(Identifier105)
			;
			adaptor.addChild(root_0, Identifier105_tree);
			}

			pushFollow(FOLLOW_formalParameters_in_functionDeclarationWithoutBody2159);
			formalParameters106=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters106.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, functionDeclarationWithoutBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationWithoutBody"


	public static class returnType_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:388:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal108=null;
		ParserRuleReturnScope allTypes107 =null;

		CommonTree string_literal108_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType2171);
					allTypes107=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes107.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:389:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal108=(Token)match(input,Void,FOLLOW_Void_in_returnType2175); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal108_tree = 
					(CommonTree)adaptor.create(string_literal108)
					;
					adaptor.addChild(root_0, string_literal108_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 32, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:392:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended109 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject110 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:2: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:4: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes2186);
					primitiveTypesExtended109=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended109.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:393:29: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes2190);
					classInterfaceTypeInclObject110=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject110.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 33, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class allTypesWithoutObjectAndResource_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypesWithoutObjectAndResource"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:396:1: allTypesWithoutObjectAndResource : ( primitiveTypesInclArray | classInterfaceTypeWithoutObject );
	public final TSPHPParser.allTypesWithoutObjectAndResource_return allTypesWithoutObjectAndResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutObjectAndResource_return retval = new TSPHPParser.allTypesWithoutObjectAndResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutObjectAndResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray111 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject112 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:2: ( primitiveTypesInclArray | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:397:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource2201);
					primitiveTypesInclArray111=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray111.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:398:5: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource2207);
					classInterfaceTypeWithoutObject112=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject112.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 34, allTypesWithoutObjectAndResource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypesWithoutObjectAndResource"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:401:1: primitiveTypes : ( TypeBool | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set113=null;

		CommonTree set113_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:402:2: ( TypeBool | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set113=(Token)input.LT(1);
			if ( input.LA(1)==TypeBool||(input.LA(1) >= TypeFloat && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set113)
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
			if ( state.backtracking>0 ) { memoize(input, 35, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:408:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray115=null;
		ParserRuleReturnScope primitiveTypes114 =null;

		CommonTree TypeArray115_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:409:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray2245);
					primitiveTypes114=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes114.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:410:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray115=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray2250); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 36, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:413:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource117=null;
		ParserRuleReturnScope primitiveTypesInclArray116 =null;

		CommonTree TypeResource117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:414:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended2262);
					primitiveTypesInclArray116=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:415:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource117=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended2267); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 37, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:418:1: classInterfaceTypeWithoutObject : (root= '\\\\' )? namespaceId -> ^( TYPE[$classInterfaceTypeWithoutObject.start,\"type\"] ( $root)? namespaceId ) ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:2: ( (root= '\\\\' )? namespaceId -> ^( TYPE[$classInterfaceTypeWithoutObject.start,\"type\"] ( $root)? namespaceId ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:4: (root= '\\\\' )? namespaceId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:8: (root= '\\\\' )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Backslash) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:8: root= '\\\\'
					{
					root=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject2280); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Backslash.add(root);

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject2283);
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
			// 419:27: -> ^( TYPE[$classInterfaceTypeWithoutObject.start,\"type\"] ( $root)? namespaceId )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:30: ^( TYPE[$classInterfaceTypeWithoutObject.start,\"type\"] ( $root)? namespaceId )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(TYPE, ((Token)retval.start), "type")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:419:85: ( $root)?
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
			if ( state.backtracking>0 ) { memoize(input, 38, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:423:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject119=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject120 =null;

		CommonTree TypeObject119_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:424:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject119=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject2309); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject119_tree = 
					(CommonTree)adaptor.create(TypeObject119)
					;
					adaptor.addChild(root_0, TypeObject119_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:425:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject2315);
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
			if ( state.backtracking>0 ) { memoize(input, 39, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class formalParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:428:1: formalParameters : params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) ;
	public final TSPHPParser.formalParameters_return formalParameters() throws RecognitionException {
		TSPHPParser.formalParameters_return retval = new TSPHPParser.formalParameters_return();
		retval.start = input.LT(1);
		int formalParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token params=null;
		Token char_literal122=null;
		ParserRuleReturnScope paramList121 =null;

		CommonTree params_tree=null;
		CommonTree char_literal122_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:2: (params= '(' ( paramList )? ')' -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:4: params= '(' ( paramList )? ')'
			{
			params=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_formalParameters2328); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(params);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:15: ( paramList )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Backslash||LA47_0==Cast||LA47_0==Identifier||(LA47_0 >= TypeArray && LA47_0 <= TypeBool)||(LA47_0 >= TypeFloat && LA47_0 <= TypeInt)||(LA47_0 >= TypeObject && LA47_0 <= TypeString)) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:15: paramList
					{
					pushFollow(FOLLOW_paramList_in_formalParameters2330);
					paramList121=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramList.add(paramList121.getTree());
					}
					break;

			}

			char_literal122=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_formalParameters2333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal122);

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
			// 429:30: -> ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:33: ^( PARAM_LIST[$params,\"parameters\"] ( paramList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_LIST, params, "parameters")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:429:68: ( paramList )?
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
			if ( state.backtracking>0 ) { memoize(input, 40, formalParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:432:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );
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
		ParserRuleReturnScope paramDeclarationInclNull126 =null;
		ParserRuleReturnScope paramDeclarationInclNull128 =null;
		ParserRuleReturnScope paramDeclarationOptional130 =null;

		CommonTree char_literal124_tree=null;
		CommonTree char_literal127_tree=null;
		CommonTree char_literal129_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:2: ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* )
			int alt51=2;
			alt51 = dfa51.predict(input);
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: paramDeclarationOptional ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2354);
					paramDeclarationOptional123=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional123.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:29: ( ',' ! paramDeclarationOptional )*
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Comma) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:30: ',' ! paramDeclarationOptional
							{
							char_literal124=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2357); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2360);
							paramDeclarationOptional125=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional125.getTree());

							}
							break;

						default :
							break loop48;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:4: paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList2367);
					paramDeclarationInclNull126=paramDeclarationInclNull();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull126.getTree());

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:29: ( ',' ! paramDeclarationInclNull )*
					loop49:
					do {
						int alt49=2;
						alt49 = dfa49.predict(input);
						switch (alt49) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:30: ',' ! paramDeclarationInclNull
							{
							char_literal127=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2370); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationInclNull_in_paramList2373);
							paramDeclarationInclNull128=paramDeclarationInclNull();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationInclNull128.getTree());

							}
							break;

						default :
							break loop49;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:62: ( ',' ! paramDeclarationOptional )*
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==Comma) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:63: ',' ! paramDeclarationOptional
							{
							char_literal129=(Token)match(input,Comma,FOLLOW_Comma_in_paramList2378); if (state.failed) return retval;
							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList2381);
							paramDeclarationOptional130=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional130.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 41, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclarationInclNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationInclNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:437:1: paramDeclarationInclNull : paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameterDeclaration\"] paramDeclarationWithoutNull ( Null )? ) ;
	public final TSPHPParser.paramDeclarationInclNull_return paramDeclarationInclNull() throws RecognitionException {
		TSPHPParser.paramDeclarationInclNull_return retval = new TSPHPParser.paramDeclarationInclNull_return();
		retval.start = input.LT(1);
		int paramDeclarationInclNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal132=null;
		Token Null133=null;
		ParserRuleReturnScope paramDeclarationWithoutNull131 =null;

		CommonTree char_literal132_tree=null;
		CommonTree Null133_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Null=new RewriteRuleTokenStream(adaptor,"token Null");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:2: ( paramDeclarationWithoutNull ( '=' Null )? -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameterDeclaration\"] paramDeclarationWithoutNull ( Null )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:4: paramDeclarationWithoutNull ( '=' Null )?
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull2396);
			paramDeclarationWithoutNull131=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull131.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:32: ( '=' Null )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Assign) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:33: '=' Null
					{
					char_literal132=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationInclNull2399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal132);

					Null133=(Token)match(input,Null,FOLLOW_Null_in_paramDeclarationInclNull2401); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Null.add(Null133);

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
			// 438:44: -> ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameterDeclaration\"] paramDeclarationWithoutNull ( Null )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:47: ^( PARAM_DECLARATION[$paramDeclarationInclNull.start,\"parameterDeclaration\"] paramDeclarationWithoutNull ( Null )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, ((Token)retval.start), "parameterDeclaration")
				, root_1);

				adaptor.addChild(root_1, stream_paramDeclarationWithoutNull.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:438:151: ( Null )?
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
			if ( state.backtracking>0 ) { memoize(input, 42, paramDeclarationInclNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationInclNull"


	public static class paramDeclarationWithoutNull_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationWithoutNull"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:441:1: paramDeclarationWithoutNull : ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId ;
	public final TSPHPParser.paramDeclarationWithoutNull_return paramDeclarationWithoutNull() throws RecognitionException {
		TSPHPParser.paramDeclarationWithoutNull_return retval = new TSPHPParser.paramDeclarationWithoutNull_return();
		retval.start = input.LT(1);
		int paramDeclarationWithoutNull_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Cast134=null;
		Token VariableId136=null;
		ParserRuleReturnScope allTypes135 =null;

		CommonTree Cast134_tree=null;
		CommonTree VariableId136_tree=null;
		RewriteRuleTokenStream stream_Cast=new RewriteRuleTokenStream(adaptor,"token Cast");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:2: ( ( Cast )? allTypes VariableId -> ^( allTypes ( Cast )? ) VariableId )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:4: ( Cast )? allTypes VariableId
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:4: ( Cast )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==Cast) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:4: Cast
					{
					Cast134=(Token)match(input,Cast,FOLLOW_Cast_in_paramDeclarationWithoutNull2426); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Cast.add(Cast134);

					}
					break;

			}

			pushFollow(FOLLOW_allTypes_in_paramDeclarationWithoutNull2429);
			allTypes135=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes135.getTree());
			VariableId136=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclarationWithoutNull2431); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId136);

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
			// 442:30: -> ^( allTypes ( Cast )? ) VariableId
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:33: ^( allTypes ( Cast )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_allTypes.nextNode(), root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:442:44: ( Cast )?
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
			if ( state.backtracking>0 ) { memoize(input, 43, paramDeclarationWithoutNull_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationWithoutNull"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:445:1: paramDeclarationOptional : paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameterDeclaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal138=null;
		ParserRuleReturnScope paramDeclarationWithoutNull137 =null;
		ParserRuleReturnScope unaryPrimitiveAtom139 =null;

		CommonTree char_literal138_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleSubtreeStream stream_unaryPrimitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule unaryPrimitiveAtom");
		RewriteRuleSubtreeStream stream_paramDeclarationWithoutNull=new RewriteRuleSubtreeStream(adaptor,"rule paramDeclarationWithoutNull");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:446:2: ( paramDeclarationWithoutNull '=' unaryPrimitiveAtom -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameterDeclaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:446:4: paramDeclarationWithoutNull '=' unaryPrimitiveAtom
			{
			pushFollow(FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2456);
			paramDeclarationWithoutNull137=paramDeclarationWithoutNull();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paramDeclarationWithoutNull.add(paramDeclarationWithoutNull137.getTree());
			char_literal138=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional2459); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Assign.add(char_literal138);

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2461);
			unaryPrimitiveAtom139=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryPrimitiveAtom.add(unaryPrimitiveAtom139.getTree());
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
			// 447:3: -> ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameterDeclaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:447:6: ^( PARAM_DECLARATION[$paramDeclarationOptional.start,\"parameterDeclaration\"] paramDeclarationWithoutNull unaryPrimitiveAtom )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PARAM_DECLARATION, ((Token)retval.start), "parameterDeclaration")
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
			if ( state.backtracking>0 ) { memoize(input, 44, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:454:1: instructionWithoutBreakContinue : (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal141=null;
		ParserRuleReturnScope instructionWithoutBreakContinue140 =null;
		ParserRuleReturnScope instruction142 =null;

		CommonTree block_tree=null;
		CommonTree char_literal141_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionWithoutBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionWithoutBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:2: (block= '{' ( instructionWithoutBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* ) | instruction )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==LeftCurlyBrace) ) {
				alt55=1;
			}
			else if ( (LA55_0==At||LA55_0==Backslash||LA55_0==BitwiseNot||LA55_0==Bool||LA55_0==Clone||LA55_0==Do||LA55_0==Echo||LA55_0==Exit||(LA55_0 >= Float && LA55_0 <= Foreach)||(LA55_0 >= Identifier && LA55_0 <= If)||LA55_0==Int||(LA55_0 >= LeftParanthesis && LA55_0 <= LeftSquareBrace)||LA55_0==LogicNot||LA55_0==Minus||LA55_0==MinusMinus||LA55_0==New||LA55_0==Null||(LA55_0 >= ParentColonColon && LA55_0 <= Plus)||LA55_0==PlusPlus||LA55_0==Return||(LA55_0 >= SelfColonColon && LA55_0 <= Semicolon)||(LA55_0 >= String && LA55_0 <= Switch)||(LA55_0 >= This && LA55_0 <= TypeBool)||(LA55_0 >= TypeFloat && LA55_0 <= TypeInt)||(LA55_0 >= TypeObject && LA55_0 <= TypeString)||LA55_0==VariableId||LA55_0==While) ) {
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:4: block= '{' ( instructionWithoutBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2505); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:16: ( instructionWithoutBreakContinue )*
					loop54:
					do {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Do||LA54_0==Echo||LA54_0==Exit||(LA54_0 >= Float && LA54_0 <= Foreach)||(LA54_0 >= Identifier && LA54_0 <= If)||LA54_0==Int||(LA54_0 >= LeftCurlyBrace && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||LA54_0==Null||(LA54_0 >= ParentColonColon && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==Return||(LA54_0 >= SelfColonColon && LA54_0 <= Semicolon)||(LA54_0 >= String && LA54_0 <= Switch)||(LA54_0 >= This && LA54_0 <= TypeBool)||(LA54_0 >= TypeFloat && LA54_0 <= TypeInt)||(LA54_0 >= TypeObject && LA54_0 <= TypeString)||LA54_0==VariableId||LA54_0==While) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:16: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2507);
							instructionWithoutBreakContinue140=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionWithoutBreakContinue.add(instructionWithoutBreakContinue140.getTree());
							}
							break;

						default :
							break loop54;
						}
					} while (true);

					char_literal141=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2510); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal141);

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
					// 455:53: -> ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:56: ^( BLOCK[$block,\"block\"] ( instructionWithoutBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:455:81: ( instructionWithoutBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:456:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue2526);
					instruction142=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction142.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 45, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:459:1: instructionInclBreakContinue : (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !);
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token block=null;
		Token char_literal144=null;
		Token set146=null;
		Token Int147=null;
		Token char_literal148=null;
		ParserRuleReturnScope instructionInclBreakContinue143 =null;
		ParserRuleReturnScope instruction145 =null;

		CommonTree block_tree=null;
		CommonTree char_literal144_tree=null;
		CommonTree set146_tree=null;
		CommonTree Int147_tree=null;
		CommonTree char_literal148_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:2: (block= '{' ( instructionInclBreakContinue )* '}' -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* ) | instruction | ( 'break' | 'continue' ) ^ ( Int )? ';' !)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:4: block= '{' ( instructionInclBreakContinue )* '}'
					{
					block=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(block);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:17: ( instructionInclBreakContinue )*
					loop56:
					do {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==At||LA56_0==Backslash||LA56_0==BitwiseNot||(LA56_0 >= Bool && LA56_0 <= Break)||LA56_0==Clone||LA56_0==Continue||LA56_0==Do||LA56_0==Echo||LA56_0==Exit||(LA56_0 >= Float && LA56_0 <= Foreach)||(LA56_0 >= Identifier && LA56_0 <= If)||LA56_0==Int||(LA56_0 >= LeftCurlyBrace && LA56_0 <= LeftSquareBrace)||LA56_0==LogicNot||LA56_0==Minus||LA56_0==MinusMinus||LA56_0==New||LA56_0==Null||(LA56_0 >= ParentColonColon && LA56_0 <= Plus)||LA56_0==PlusPlus||LA56_0==Return||(LA56_0 >= SelfColonColon && LA56_0 <= Semicolon)||(LA56_0 >= String && LA56_0 <= Switch)||(LA56_0 >= This && LA56_0 <= TypeBool)||(LA56_0 >= TypeFloat && LA56_0 <= TypeInt)||(LA56_0 >= TypeObject && LA56_0 <= TypeString)||LA56_0==VariableId||LA56_0==While) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:17: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2544);
							instructionInclBreakContinue143=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue143.getTree());
							}
							break;

						default :
							break loop56;
						}
					} while (true);

					char_literal144=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal144);

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
					// 460:52: -> ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:55: ^( BLOCK[$block,\"block\"] ( instructionInclBreakContinue )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(BLOCK, block, "block")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:460:79: ( instructionInclBreakContinue )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:461:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue2563);
					instruction145=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction145.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:462:4: ( 'break' | 'continue' ) ^ ( Int )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					set146=(Token)input.LT(1);
					set146=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set146)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:462:26: ( Int )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==Int) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:462:26: Int
							{
							Int147=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue2575); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int147_tree = 
							(CommonTree)adaptor.create(Int147)
							;
							adaptor.addChild(root_0, Int147_tree);
							}

							}
							break;

					}

					char_literal148=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue2578); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 46, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:465:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | expression ';' !| 'return' ^ ( expression )? ';' !| 'throw' ^ expression ';' !| 'echo' ^ expressionList ';' !| 'exit' ( '(' expression ')' )? ';' -> ^( 'exit' ( expression )? ) |semi= ';' -> BLOCK[$semi,\"block\"] );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token semi=null;
		Token char_literal150=null;
		Token char_literal152=null;
		Token char_literal161=null;
		Token string_literal162=null;
		Token char_literal164=null;
		Token string_literal165=null;
		Token char_literal167=null;
		Token string_literal168=null;
		Token char_literal170=null;
		Token string_literal171=null;
		Token char_literal172=null;
		Token char_literal174=null;
		Token char_literal175=null;
		ParserRuleReturnScope variableAssignment149 =null;
		ParserRuleReturnScope variableDeclaration151 =null;
		ParserRuleReturnScope ifCondition153 =null;
		ParserRuleReturnScope switchCondition154 =null;
		ParserRuleReturnScope forLoop155 =null;
		ParserRuleReturnScope foreachLoop156 =null;
		ParserRuleReturnScope whileLoop157 =null;
		ParserRuleReturnScope doWhileLoop158 =null;
		ParserRuleReturnScope tryCatch159 =null;
		ParserRuleReturnScope expression160 =null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope expression166 =null;
		ParserRuleReturnScope expressionList169 =null;
		ParserRuleReturnScope expression173 =null;

		CommonTree semi_tree=null;
		CommonTree char_literal150_tree=null;
		CommonTree char_literal152_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree string_literal162_tree=null;
		CommonTree char_literal164_tree=null;
		CommonTree string_literal165_tree=null;
		CommonTree char_literal167_tree=null;
		CommonTree string_literal168_tree=null;
		CommonTree char_literal170_tree=null;
		CommonTree string_literal171_tree=null;
		CommonTree char_literal172_tree=null;
		CommonTree char_literal174_tree=null;
		CommonTree char_literal175_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Exit=new RewriteRuleTokenStream(adaptor,"token Exit");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | expression ';' !| 'return' ^ ( expression )? ';' !| 'throw' ^ expression ';' !| 'echo' ^ expressionList ';' !| 'exit' ( '(' expression ')' )? ';' -> ^( 'exit' ( expression )? ) |semi= ';' -> BLOCK[$semi,\"block\"] )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction2591);
					variableAssignment149=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment149.getTree());

					char_literal150=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2593); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction2599);
					variableDeclaration151=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration151.getTree());

					char_literal152=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2601); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:468:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction2607);
					ifCondition153=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition153.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:469:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction2612);
					switchCondition154=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition154.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:470:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction2617);
					forLoop155=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop155.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:471:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction2622);
					foreachLoop156=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop156.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:472:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction2627);
					whileLoop157=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop157.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:473:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction2632);
					doWhileLoop158=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop158.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:474:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction2637);
					tryCatch159=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch159.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:475:4: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction2642);
					expression160=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression160.getTree());

					char_literal161=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2644); if (state.failed) return retval;
					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:476:4: 'return' ^ ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal162=(Token)match(input,Return,FOLLOW_Return_in_instruction2650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal162_tree = 
					(CommonTree)adaptor.create(string_literal162)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal162_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:476:14: ( expression )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==At||LA59_0==Backslash||LA59_0==BitwiseNot||LA59_0==Bool||LA59_0==Clone||LA59_0==Float||LA59_0==Identifier||LA59_0==Int||(LA59_0 >= LeftParanthesis && LA59_0 <= LeftSquareBrace)||LA59_0==LogicNot||LA59_0==Minus||LA59_0==MinusMinus||LA59_0==New||LA59_0==Null||(LA59_0 >= ParentColonColon && LA59_0 <= Plus)||LA59_0==PlusPlus||LA59_0==SelfColonColon||LA59_0==String||LA59_0==This||LA59_0==TypeArray||LA59_0==VariableId) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:476:14: expression
							{
							pushFollow(FOLLOW_expression_in_instruction2653);
							expression163=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());

							}
							break;

					}

					char_literal164=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2656); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:477:4: 'throw' ^ expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal165=(Token)match(input,Throw,FOLLOW_Throw_in_instruction2662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal165_tree = 
					(CommonTree)adaptor.create(string_literal165)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal165_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_instruction2665);
					expression166=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression166.getTree());

					char_literal167=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2667); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:478:4: 'echo' ^ expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal168=(Token)match(input,Echo,FOLLOW_Echo_in_instruction2673); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal168_tree = 
					(CommonTree)adaptor.create(string_literal168)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal168_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_instruction2676);
					expressionList169=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList169.getTree());

					char_literal170=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2678); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:4: 'exit' ( '(' expression ')' )? ';'
					{
					string_literal171=(Token)match(input,Exit,FOLLOW_Exit_in_instruction2684); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Exit.add(string_literal171);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:11: ( '(' expression ')' )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==LeftParanthesis) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:12: '(' expression ')'
							{
							char_literal172=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_instruction2687); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal172);

							pushFollow(FOLLOW_expression_in_instruction2689);
							expression173=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression173.getTree());
							char_literal174=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_instruction2691); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal174);

							}
							break;

					}

					char_literal175=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Semicolon.add(char_literal175);

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
					// 479:37: -> ^( 'exit' ( expression )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:40: ^( 'exit' ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_Exit.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:479:49: ( expression )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:480:4: semi= ';'
					{
					semi=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction2711); if (state.failed) return retval; 
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
					// 480:13: -> BLOCK[$semi,\"block\"]
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
			if ( state.backtracking>0 ) { memoize(input, 47, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:483:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal177=null;
		ParserRuleReturnScope expression176 =null;
		ParserRuleReturnScope expression178 =null;

		CommonTree char_literal177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2728);
			expression176=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression176.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:15: ( ',' ! expression )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==Comma) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:484:16: ',' ! expression
					{
					char_literal177=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2731); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2734);
					expression178=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 48, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:487:1: variableAssignment : VariableId assignmentOperator ^ expression ;
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId179=null;
		ParserRuleReturnScope assignmentOperator180 =null;
		ParserRuleReturnScope expression181 =null;

		CommonTree VariableId179_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:2: ( VariableId assignmentOperator ^ expression )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:488:4: VariableId assignmentOperator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			VariableId179=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2747); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId179_tree = 
			(CommonTree)adaptor.create(VariableId179)
			;
			adaptor.addChild(root_0, VariableId179_tree);
			}

			pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2749);
			assignmentOperator180=assignmentOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator180.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_variableAssignment2752);
			expression181=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:491:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement182 =null;
		ParserRuleReturnScope preIncrementDecrement183 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:2: ( postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:492:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2764);
					postIncrementDecrement182=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement182.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:493:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2769);
					preIncrementDecrement183=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement183.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 50, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:496:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' |cast= '=' '(' ')' -> CAST_ASSIGN[$cast,\"cast assign\"] );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal184=null;
		Token string_literal185=null;
		Token string_literal186=null;
		Token string_literal187=null;
		Token string_literal188=null;
		Token string_literal189=null;
		Token string_literal190=null;
		Token string_literal191=null;
		Token string_literal192=null;
		Token string_literal193=null;
		Token string_literal194=null;
		Token string_literal195=null;
		Token char_literal196=null;
		Token char_literal197=null;

		CommonTree cast_tree=null;
		CommonTree char_literal184_tree=null;
		CommonTree string_literal185_tree=null;
		CommonTree string_literal186_tree=null;
		CommonTree string_literal187_tree=null;
		CommonTree string_literal188_tree=null;
		CommonTree string_literal189_tree=null;
		CommonTree string_literal190_tree=null;
		CommonTree string_literal191_tree=null;
		CommonTree string_literal192_tree=null;
		CommonTree string_literal193_tree=null;
		CommonTree string_literal194_tree=null;
		CommonTree string_literal195_tree=null;
		CommonTree char_literal196_tree=null;
		CommonTree char_literal197_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' |cast= '=' '(' ')' -> CAST_ASSIGN[$cast,\"cast assign\"] )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:497:4: '='
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal184=(Token)match(input,Assign,FOLLOW_Assign_in_assignmentOperator2780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal184_tree = 
					(CommonTree)adaptor.create(char_literal184)
					;
					adaptor.addChild(root_0, char_literal184_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:498:4: '+='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal185=(Token)match(input,PlusEqual,FOLLOW_PlusEqual_in_assignmentOperator2785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal185_tree = 
					(CommonTree)adaptor.create(string_literal185)
					;
					adaptor.addChild(root_0, string_literal185_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:499:4: '-='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal186=(Token)match(input,MinusEqual,FOLLOW_MinusEqual_in_assignmentOperator2790); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal186_tree = 
					(CommonTree)adaptor.create(string_literal186)
					;
					adaptor.addChild(root_0, string_literal186_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:500:4: '*='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal187=(Token)match(input,MultiplyEqual,FOLLOW_MultiplyEqual_in_assignmentOperator2795); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal187_tree = 
					(CommonTree)adaptor.create(string_literal187)
					;
					adaptor.addChild(root_0, string_literal187_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:501:4: '/='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal188=(Token)match(input,DivideEqual,FOLLOW_DivideEqual_in_assignmentOperator2800); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal188_tree = 
					(CommonTree)adaptor.create(string_literal188)
					;
					adaptor.addChild(root_0, string_literal188_tree);
					}

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:502:4: '&='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal189=(Token)match(input,BitwiseAndEqual,FOLLOW_BitwiseAndEqual_in_assignmentOperator2805); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal189_tree = 
					(CommonTree)adaptor.create(string_literal189)
					;
					adaptor.addChild(root_0, string_literal189_tree);
					}

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:503:4: '|='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal190=(Token)match(input,BitwiseOrEqual,FOLLOW_BitwiseOrEqual_in_assignmentOperator2810); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal190_tree = 
					(CommonTree)adaptor.create(string_literal190)
					;
					adaptor.addChild(root_0, string_literal190_tree);
					}

					}
					break;
				case 8 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:504:4: '^='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal191=(Token)match(input,BitwiseXorEqual,FOLLOW_BitwiseXorEqual_in_assignmentOperator2815); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal191_tree = 
					(CommonTree)adaptor.create(string_literal191)
					;
					adaptor.addChild(root_0, string_literal191_tree);
					}

					}
					break;
				case 9 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:505:4: '%='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal192=(Token)match(input,ModuloEqual,FOLLOW_ModuloEqual_in_assignmentOperator2820); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal192_tree = 
					(CommonTree)adaptor.create(string_literal192)
					;
					adaptor.addChild(root_0, string_literal192_tree);
					}

					}
					break;
				case 10 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:506:4: '.='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal193=(Token)match(input,DotEqual,FOLLOW_DotEqual_in_assignmentOperator2825); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal193_tree = 
					(CommonTree)adaptor.create(string_literal193)
					;
					adaptor.addChild(root_0, string_literal193_tree);
					}

					}
					break;
				case 11 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:507:4: '<<='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal194=(Token)match(input,ShiftLeftEqual,FOLLOW_ShiftLeftEqual_in_assignmentOperator2830); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal194_tree = 
					(CommonTree)adaptor.create(string_literal194)
					;
					adaptor.addChild(root_0, string_literal194_tree);
					}

					}
					break;
				case 12 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:508:4: '>>='
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal195=(Token)match(input,ShiftRightEqual,FOLLOW_ShiftRightEqual_in_assignmentOperator2835); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(CommonTree)adaptor.create(string_literal195)
					;
					adaptor.addChild(root_0, string_literal195_tree);
					}

					}
					break;
				case 13 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:509:4: cast= '=' '(' ')'
					{
					cast=(Token)match(input,Assign,FOLLOW_Assign_in_assignmentOperator2842); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(cast);

					char_literal196=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_assignmentOperator2843); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal196);

					char_literal197=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_assignmentOperator2844); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal197);

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
					// 509:19: -> CAST_ASSIGN[$cast,\"cast assign\"]
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
			if ( state.backtracking>0 ) { memoize(input, 51, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:512:1: postIncrementDecrement : postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"postIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd198 =null;
		ParserRuleReturnScope plusPlusOrMinusMinus199 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:2: ( postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"postIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:513:4: postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus
			{
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2862);
			postFixVariableWithoutCallAtTheEnd198=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd198.getTree());
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2864);
			plusPlusOrMinusMinus199=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus199.getTree());
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
			// 514:3: -> ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"postIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:514:6: ^( POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, \"postIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (postFixVariableWithoutCallAtTheEnd198!=null?((Token)postFixVariableWithoutCallAtTheEnd198.start):null), "postIncrementDecrement")
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
			if ( state.backtracking>0 ) { memoize(input, 52, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class plusPlusOrMinusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plusPlusOrMinusMinus"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:517:1: plusPlusOrMinusMinus : ( '++' | '--' );
	public final TSPHPParser.plusPlusOrMinusMinus_return plusPlusOrMinusMinus() throws RecognitionException {
		TSPHPParser.plusPlusOrMinusMinus_return retval = new TSPHPParser.plusPlusOrMinusMinus_return();
		retval.start = input.LT(1);
		int plusPlusOrMinusMinus_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set200=null;

		CommonTree set200_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:518:2: ( '++' | '--' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set200=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set200)
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
			if ( state.backtracking>0 ) { memoize(input, 53, plusPlusOrMinusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "plusPlusOrMinusMinus"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:522:1: preIncrementDecrement : plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"preIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope plusPlusOrMinusMinus201 =null;
		ParserRuleReturnScope postFixVariableWithoutCallAtTheEnd202 =null;

		RewriteRuleSubtreeStream stream_postFixVariableWithoutCallAtTheEnd=new RewriteRuleSubtreeStream(adaptor,"rule postFixVariableWithoutCallAtTheEnd");
		RewriteRuleSubtreeStream stream_plusPlusOrMinusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusPlusOrMinusMinus");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:2: ( plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"preIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:523:4: plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd
			{
			pushFollow(FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2907);
			plusPlusOrMinusMinus201=plusPlusOrMinusMinus();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plusPlusOrMinusMinus.add(plusPlusOrMinusMinus201.getTree());
			pushFollow(FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2909);
			postFixVariableWithoutCallAtTheEnd202=postFixVariableWithoutCallAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_postFixVariableWithoutCallAtTheEnd.add(postFixVariableWithoutCallAtTheEnd202.getTree());
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
			// 524:3: -> ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"preIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:524:6: ^( PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,\"preIncrementDecrement\"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, (plusPlusOrMinusMinus201!=null?((Token)plusPlusOrMinusMinus201.start):null), "preIncrementDecrement")
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
			if ( state.backtracking>0 ) { memoize(input, 54, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:527:1: variableDeclaration : variableDeclarationVariants -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variableDeclaration\"] variableDeclarationVariants ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope variableDeclarationVariants203 =null;

		RewriteRuleSubtreeStream stream_variableDeclarationVariants=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationVariants");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:2: ( variableDeclarationVariants -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variableDeclaration\"] variableDeclarationVariants ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:4: variableDeclarationVariants
			{
			pushFollow(FOLLOW_variableDeclarationVariants_in_variableDeclaration2936);
			variableDeclarationVariants203=variableDeclarationVariants();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableDeclarationVariants.add(variableDeclarationVariants203.getTree());
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
			// 528:32: -> ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variableDeclaration\"] variableDeclarationVariants )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:528:35: ^( VARIABLE_DECLARATION[$variableDeclarationVariants.start,\"variableDeclaration\"] variableDeclarationVariants )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (variableDeclarationVariants203!=null?((Token)variableDeclarationVariants203.start):null), "variableDeclaration")
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
			if ( state.backtracking>0 ) { memoize(input, 55, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class variableDeclarationVariants_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationVariants"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:530:1: variableDeclarationVariants : ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? );
	public final TSPHPParser.variableDeclarationVariants_return variableDeclarationVariants() throws RecognitionException {
		TSPHPParser.variableDeclarationVariants_return retval = new TSPHPParser.variableDeclarationVariants_return();
		retval.start = input.LT(1);
		int variableDeclarationVariants_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token VariableId205=null;
		Token char_literal206=null;
		Token char_literal207=null;
		Token VariableId210=null;
		Token char_literal211=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource204 =null;
		ParserRuleReturnScope expression208 =null;
		ParserRuleReturnScope allTypes209 =null;
		ParserRuleReturnScope expression212 =null;

		CommonTree cast_tree=null;
		CommonTree VariableId205_tree=null;
		CommonTree char_literal206_tree=null;
		CommonTree char_literal207_tree=null;
		CommonTree VariableId210_tree=null;
		CommonTree char_literal211_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:2: ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? )
			int alt66=2;
			alt66 = dfa66.predict(input);
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:531:4: allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression
					{
					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_variableDeclarationVariants2955);
					allTypesWithoutObjectAndResource204=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource204.getTree());
					VariableId205=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationVariants2957); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId205);

					cast=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclarationVariants2961); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(cast);

					char_literal206=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_variableDeclarationVariants2962); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal206);

					char_literal207=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_variableDeclarationVariants2963); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal207);

					pushFollow(FOLLOW_expression_in_variableDeclarationVariants2965);
					expression208=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression208.getTree());
					// AST REWRITE
					// elements: allTypesWithoutObjectAndResource, allTypesWithoutObjectAndResource, VariableId, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 532:3: -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression )
					{
						adaptor.addChild(root_0, stream_allTypesWithoutObjectAndResource.nextTree());

						adaptor.addChild(root_0, 
						stream_VariableId.nextNode()
						);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:532:51: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:534:4: allTypes VariableId ( '=' expression )?
					{
					pushFollow(FOLLOW_allTypes_in_variableDeclarationVariants2992);
					allTypes209=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypes.add(allTypes209.getTree());
					VariableId210=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationVariants2994); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId210);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:534:24: ( '=' expression )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==Assign) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:534:25: '=' expression
							{
							char_literal211=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclarationVariants2997); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Assign.add(char_literal211);

							pushFollow(FOLLOW_expression_in_variableDeclarationVariants2999);
							expression212=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression212.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: allTypes, expression, VariableId
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 534:42: -> allTypes VariableId ( expression )?
					{
						adaptor.addChild(root_0, stream_allTypes.nextTree());

						adaptor.addChild(root_0, 
						stream_VariableId.nextNode()
						);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:534:65: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 56, variableDeclarationVariants_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationVariants"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:537:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak213 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:538:2: ( logicOrWeak )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:538:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression3021);
			logicOrWeak213=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak213.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:542:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal215=null;
		ParserRuleReturnScope logicXorWeak214 =null;
		ParserRuleReturnScope logicXorWeak216 =null;

		CommonTree string_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak3034);
			logicXorWeak214=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak214.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:17: ( 'or' ^ logicXorWeak )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:18: 'or' ^ logicXorWeak
					{
					string_literal215=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak3037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal215_tree = 
					(CommonTree)adaptor.create(string_literal215)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak3040);
					logicXorWeak216=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak216.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 58, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:546:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal218=null;
		ParserRuleReturnScope logicAndWeak217 =null;
		ParserRuleReturnScope logicAndWeak219 =null;

		CommonTree string_literal218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak3055);
			logicAndWeak217=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak217.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:17: ( 'xor' ^ logicAndWeak )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:18: 'xor' ^ logicAndWeak
					{
					string_literal218=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak3058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal218_tree = 
					(CommonTree)adaptor.create(string_literal218)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal218_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak3061);
					logicAndWeak219=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak219.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:550:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal221=null;
		ParserRuleReturnScope assignment220 =null;
		ParserRuleReturnScope assignment222 =null;

		CommonTree string_literal221_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak3076);
			assignment220=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment220.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:15: ( 'and' ^ assignment )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:16: 'and' ^ assignment
					{
					string_literal221=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak3079); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal221_tree = 
					(CommonTree)adaptor.create(string_literal221)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal221_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak3082);
					assignment222=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment222.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 60, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:554:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary223 =null;
		ParserRuleReturnScope assignmentOperator224 =null;
		ParserRuleReturnScope ternary225 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment3095);
			ternary223=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary223.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:12: ( assignmentOperator ^ ternary )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment3098);
					assignmentOperator224=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator224.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment3101);
					ternary225=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary225.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 61, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:558:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal227=null;
		Token char_literal229=null;
		ParserRuleReturnScope logicOr226 =null;
		ParserRuleReturnScope expression228 =null;
		ParserRuleReturnScope expression230 =null;

		CommonTree char_literal227_tree=null;
		CommonTree char_literal229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:2: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:4: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary3115);
			logicOr226=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr226.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:12: ( '?' ^ expression ':' ! expression )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==QuestionMark) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:559:13: '?' ^ expression ':' ! expression
					{
					char_literal227=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary3118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal227_tree = 
					(CommonTree)adaptor.create(char_literal227)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal227_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary3121);
					expression228=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression228.getTree());

					char_literal229=(Token)match(input,Colon,FOLLOW_Colon_in_ternary3123); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary3126);
					expression230=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression230.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:562:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal232=null;
		ParserRuleReturnScope logicAnd231 =null;
		ParserRuleReturnScope logicAnd233 =null;

		CommonTree string_literal232_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:2: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:4: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr3140);
			logicAnd231=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd231.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:13: ( '||' ^ logicAnd )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==LogicOr) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:563:14: '||' ^ logicAnd
					{
					string_literal232=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr3143); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal232_tree = 
					(CommonTree)adaptor.create(string_literal232)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal232_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr3146);
					logicAnd233=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd233.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 63, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:566:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal235=null;
		ParserRuleReturnScope bitwiseOr234 =null;
		ParserRuleReturnScope bitwiseOr236 =null;

		CommonTree string_literal235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:2: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:4: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd3159);
			bitwiseOr234=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr234.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:14: ( '&&' ^ bitwiseOr )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==LogicAnd) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:567:15: '&&' ^ bitwiseOr
					{
					string_literal235=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd3162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal235_tree = 
					(CommonTree)adaptor.create(string_literal235)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal235_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd3165);
					bitwiseOr236=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr236.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:570:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal238=null;
		ParserRuleReturnScope bitwiseXor237 =null;
		ParserRuleReturnScope bitwiseXor239 =null;

		CommonTree char_literal238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr3179);
			bitwiseXor237=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor237.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:15: ( '|' ^ bitwiseXor )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==BitwiseOr) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:571:16: '|' ^ bitwiseXor
					{
					char_literal238=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr3182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal238_tree = 
					(CommonTree)adaptor.create(char_literal238)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal238_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr3185);
					bitwiseXor239=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor239.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 65, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:574:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal241=null;
		ParserRuleReturnScope bitwiseAnd240 =null;
		ParserRuleReturnScope bitwiseAnd242 =null;

		CommonTree char_literal241_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor3198);
			bitwiseAnd240=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd240.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:15: ( '^' ^ bitwiseAnd )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==BitwiseXor) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:575:16: '^' ^ bitwiseAnd
					{
					char_literal241=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor3201); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal241_tree = 
					(CommonTree)adaptor.create(char_literal241)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal241_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor3204);
					bitwiseAnd242=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd242.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:578:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal244=null;
		ParserRuleReturnScope equality243 =null;
		ParserRuleReturnScope equality245 =null;

		CommonTree char_literal244_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd3217);
			equality243=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality243.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:13: ( '&' ^ equality )*
			loop76:
			do {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==BitwiseAnd) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:579:14: '&' ^ equality
					{
					char_literal244=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd3220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal244_tree = 
					(CommonTree)adaptor.create(char_literal244)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal244_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd3223);
					equality245=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality245.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 67, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:582:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison246 =null;
		ParserRuleReturnScope equalityOperator247 =null;
		ParserRuleReturnScope comparison248 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:2: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:4: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality3236);
			comparison246=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison246.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:15: ( equalityOperator ^ comparison )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Equal||LA77_0==Identical||(LA77_0 >= NotEqual && LA77_0 <= NotIdentical)) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:583:16: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality3239);
					equalityOperator247=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator247.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality3242);
					comparison248=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison248.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 68, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:586:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set249=null;

		CommonTree set249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:587:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set249=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set249)
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
			if ( state.backtracking>0 ) { memoize(input, 69, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:594:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift250 =null;
		ParserRuleReturnScope comparisonOperator251 =null;
		ParserRuleReturnScope bitwiseShift252 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison3286);
			bitwiseShift250=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift250.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:17: ( comparisonOperator ^ bitwiseShift )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( ((LA78_0 >= GreaterEqualThan && LA78_0 <= GreaterThan)||(LA78_0 >= LessEqualThan && LA78_0 <= LessThan)) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:595:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison3289);
					comparisonOperator251=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator251.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison3292);
					bitwiseShift252=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift252.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 70, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:598:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set253=null;

		CommonTree set253_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:599:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set253=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set253)
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
			if ( state.backtracking>0 ) { memoize(input, 71, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:605:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set255=null;
		ParserRuleReturnScope termOrStringConcatenation254 =null;
		ParserRuleReturnScope termOrStringConcatenation256 =null;

		CommonTree set255_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:2: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:4: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift3332);
			termOrStringConcatenation254=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation254.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:30: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop79:
			do {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==ShiftLeft||LA79_0==ShiftRight) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:606:31: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set255=(Token)input.LT(1);
					set255=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set255)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift3342);
					termOrStringConcatenation256=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation256.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 72, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:609:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set258=null;
		ParserRuleReturnScope factor257 =null;
		ParserRuleReturnScope factor259 =null;

		CommonTree set258_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:2: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:4: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation3356);
			factor257=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor257.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:11: ( ( '+' | '-' | '.' ) ^ factor )*
			loop80:
			do {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==Dot||LA80_0==Minus||LA80_0==Plus) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:610:12: ( '+' | '-' | '.' ) ^ factor
					{
					set258=(Token)input.LT(1);
					set258=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set258)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation3368);
					factor259=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor259.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 73, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:613:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set261=null;
		ParserRuleReturnScope logicNot260 =null;
		ParserRuleReturnScope logicNot262 =null;

		CommonTree set261_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:2: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:4: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor3382);
			logicNot260=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot260.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:13: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop81:
			do {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==Divide||LA81_0==Modulo||LA81_0==Multiply) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:614:14: ( '*' | '/' | '%' ) ^ logicNot
					{
					set261=(Token)input.LT(1);
					set261=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set261)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor3394);
					logicNot262=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot262.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 74, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal263=null;
		ParserRuleReturnScope logicNot264 =null;
		ParserRuleReturnScope instanceOf265 =null;

		CommonTree char_literal263_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:9: ( '!' ^ logicNot | instanceOf )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:617:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal263=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot3405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal263_tree = 
					(CommonTree)adaptor.create(char_literal263)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal263_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot3408);
					logicNot264=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot264.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:618:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot3413);
					instanceOf265=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf265.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 75, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:621:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal267=null;
		Token VariableId269=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt266 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject268 =null;

		CommonTree string_literal267_tree=null;
		CommonTree VariableId269_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf3424);
			castOrBitwiseNotOrAt266=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt266.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==Instanceof) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal267=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf3427); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal267_tree = 
					(CommonTree)adaptor.create(string_literal267)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal267_tree, root_0);
					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf3431);
							classInterfaceTypeWithoutObject268=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject268.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:622:73: VariableId
							{
							VariableId269=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf3433); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId269_tree = 
							(CommonTree)adaptor.create(VariableId269)
							;
							adaptor.addChild(root_0, VariableId269_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 76, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:624:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal271=null;
		Token char_literal273=null;
		Token char_literal275=null;
		ParserRuleReturnScope allTypesWithoutObjectAndResource270 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt272 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt274 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt276 =null;
		ParserRuleReturnScope cloneOrNew277 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal271_tree=null;
		CommonTree char_literal273_tree=null;
		CommonTree char_literal275_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_allTypesWithoutObjectAndResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutObjectAndResource");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:2: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | cloneOrNew )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt3449); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt3451);
					allTypesWithoutObjectAndResource270=allTypesWithoutObjectAndResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(allTypesWithoutObjectAndResource270.getTree());
					char_literal271=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt3453); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal271);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3455);
					castOrBitwiseNotOrAt272=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt272.getTree());
					// AST REWRITE
					// elements: castOrBitwiseNotOrAt, allTypesWithoutObjectAndResource
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 625:73: -> ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:76: ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:626:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal273=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt3471); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal273_tree = 
					(CommonTree)adaptor.create(char_literal273)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal273_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3474);
					castOrBitwiseNotOrAt274=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt274.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:627:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal275=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt3479); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal275_tree = 
					(CommonTree)adaptor.create(char_literal275)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal275_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3482);
					castOrBitwiseNotOrAt276=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt276.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:628:4: cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt3488);
					cloneOrNew277=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew277.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 77, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class cloneOrNew_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cloneOrNew"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:631:1: cloneOrNew : ( 'clone' ^ cloneOrNew | newObject | unaryPrimary );
	public final TSPHPParser.cloneOrNew_return cloneOrNew() throws RecognitionException {
		TSPHPParser.cloneOrNew_return retval = new TSPHPParser.cloneOrNew_return();
		retval.start = input.LT(1);
		int cloneOrNew_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal278=null;
		ParserRuleReturnScope cloneOrNew279 =null;
		ParserRuleReturnScope newObject280 =null;
		ParserRuleReturnScope unaryPrimary281 =null;

		CommonTree string_literal278_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:632:2: ( 'clone' ^ cloneOrNew | newObject | unaryPrimary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:632:4: 'clone' ^ cloneOrNew
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal278=(Token)match(input,Clone,FOLLOW_Clone_in_cloneOrNew3499); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal278_tree = 
					(CommonTree)adaptor.create(string_literal278)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal278_tree, root_0);
					}

					pushFollow(FOLLOW_cloneOrNew_in_cloneOrNew3502);
					cloneOrNew279=cloneOrNew();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cloneOrNew279.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:633:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_cloneOrNew3507);
					newObject280=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject280.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:634:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_cloneOrNew3512);
					unaryPrimary281=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary281.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 78, cloneOrNew_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cloneOrNew"


	public static class variableOrMemberOrStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableOrMemberOrStaticMember"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:638:1: variableOrMemberOrStaticMember : ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent VariableId ) | '$this' | VariableId );
	public final TSPHPParser.variableOrMemberOrStaticMember_return variableOrMemberOrStaticMember() throws RecognitionException {
		TSPHPParser.variableOrMemberOrStaticMember_return retval = new TSPHPParser.variableOrMemberOrStaticMember_return();
		retval.start = input.LT(1);
		int variableOrMemberOrStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId283=null;
		Token string_literal284=null;
		Token VariableId285=null;
		ParserRuleReturnScope staticAccessOrParent282 =null;

		CommonTree VariableId283_tree=null;
		CommonTree string_literal284_tree=null;
		CommonTree VariableId285_tree=null;
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:2: ( staticAccessOrParent VariableId -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent VariableId ) | '$this' | VariableId )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:4: staticAccessOrParent VariableId
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3525);
					staticAccessOrParent282=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent282.getTree());
					VariableId283=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3527); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(VariableId283);

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
					// 639:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent VariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:639:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent VariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent282!=null?((Token)staticAccessOrParent282.start):null), "static memberAccess")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:640:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal284=(Token)match(input,This,FOLLOW_This_in_variableOrMemberOrStaticMember3543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal284_tree = 
					(CommonTree)adaptor.create(string_literal284)
					;
					adaptor.addChild(root_0, string_literal284_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:641:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId285=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableOrMemberOrStaticMember3548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId285_tree = 
					(CommonTree)adaptor.create(VariableId285)
					;
					adaptor.addChild(root_0, VariableId285_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 79, variableOrMemberOrStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableOrMemberOrStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:644:1: staticAccessOrParent : (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !);
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token s=null;
		Token p=null;
		Token string_literal287=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject286 =null;

		CommonTree s_tree=null;
		CommonTree p_tree=null;
		CommonTree string_literal287_tree=null;
		RewriteRuleTokenStream stream_SelfColonColon=new RewriteRuleTokenStream(adaptor,"token SelfColonColon");
		RewriteRuleTokenStream stream_ParentColonColon=new RewriteRuleTokenStream(adaptor,"token ParentColonColon");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:2: (s= 'self::' -> Self[$s,\"self\"] |p= 'parent::' -> Parent[$p,\"parent\"] | classInterfaceTypeWithoutObject '::' !)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:645:4: s= 'self::'
					{
					s=(Token)match(input,SelfColonColon,FOLLOW_SelfColonColon_in_staticAccessOrParent3562); if (state.failed) return retval; 
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
					// 645:15: -> Self[$s,\"self\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:646:4: p= 'parent::'
					{
					p=(Token)match(input,ParentColonColon,FOLLOW_ParentColonColon_in_staticAccessOrParent3574); if (state.failed) return retval; 
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
					// 646:17: -> Parent[$p,\"parent\"]
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:647:4: classInterfaceTypeWithoutObject '::' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3584);
					classInterfaceTypeWithoutObject286=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject286.getTree());

					string_literal287=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent3586); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 80, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:650:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal288=null;
		Token string_literal291=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject289 =null;
		ParserRuleReturnScope actualParameters290 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject292 =null;

		CommonTree string_literal288_tree=null;
		CommonTree string_literal291_tree=null;
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:2: ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) )
			int alt89=2;
			alt89 = dfa89.predict(input);
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:4: 'new' classInterfaceTypeWithoutObject actualParameters
					{
					string_literal288=(Token)match(input,New,FOLLOW_New_in_newObject3599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal288);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3601);
					classInterfaceTypeWithoutObject289=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject289.getTree());
					pushFollow(FOLLOW_actualParameters_in_newObject3603);
					actualParameters290=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters290.getTree());
					// AST REWRITE
					// elements: actualParameters, New, classInterfaceTypeWithoutObject
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 651:59: -> ^( 'new' classInterfaceTypeWithoutObject actualParameters )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:651:62: ^( 'new' classInterfaceTypeWithoutObject actualParameters )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:4: 'new' classInterfaceTypeWithoutObject
					{
					string_literal291=(Token)match(input,New,FOLLOW_New_in_newObject3618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_New.add(string_literal291);

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject3620);
					classInterfaceTypeWithoutObject292=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject292.getTree());
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
					// 652:42: -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:652:45: ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_New.nextNode()
						, root_1);

						adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

						adaptor.addChild(root_1, 
						(CommonTree)adaptor.create(EXPRESSION_LIST, (classInterfaceTypeWithoutObject292!=null?((Token)classInterfaceTypeWithoutObject292.stop):null), "expressions")
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
			if ( state.backtracking>0 ) { memoize(input, 81, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class actualParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:655:1: actualParameters : list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.actualParameters_return actualParameters() throws RecognitionException {
		TSPHPParser.actualParameters_return retval = new TSPHPParser.actualParameters_return();
		retval.start = input.LT(1);
		int actualParameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token char_literal294=null;
		ParserRuleReturnScope expressionList293 =null;

		CommonTree list_tree=null;
		CommonTree char_literal294_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:2: (list= '(' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:4: list= '(' ( expressionList )? ')'
			{
			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_actualParameters3644); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:13: ( expressionList )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==At||LA90_0==Backslash||LA90_0==BitwiseNot||LA90_0==Bool||LA90_0==Clone||LA90_0==Float||LA90_0==Identifier||LA90_0==Int||(LA90_0 >= LeftParanthesis && LA90_0 <= LeftSquareBrace)||LA90_0==LogicNot||LA90_0==Minus||LA90_0==MinusMinus||LA90_0==New||LA90_0==Null||(LA90_0 >= ParentColonColon && LA90_0 <= Plus)||LA90_0==PlusPlus||LA90_0==SelfColonColon||LA90_0==String||LA90_0==This||LA90_0==TypeArray||LA90_0==VariableId) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_actualParameters3646);
					expressionList293=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList293.getTree());
					}
					break;

			}

			char_literal294=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_actualParameters3649); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal294);

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
			// 656:33: -> ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:36: ^( EXPRESSION_LIST[$list,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, list, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:656:75: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 82, actualParameters_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "actualParameters"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:659:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unaryPlus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unaryMinus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary295 =null;
		ParserRuleReturnScope primary296 =null;
		ParserRuleReturnScope primary297 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unaryPlus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unaryMinus\"] primary ) | primary )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary3674); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3676);
					primary295=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary295.getTree());
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
					// 660:24: -> ^( UPLUS[$uplus,\"unaryPlus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:660:27: ^( UPLUS[$uplus,\"unaryPlus\"] primary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UPLUS, uplus, "unaryPlus")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary3694); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary3696);
					primary296=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary296.getTree());
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
					// 661:25: -> ^( UMINUS[$uminus,\"unaryMinus\"] primary )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:661:28: ^( UMINUS[$uminus,\"unaryMinus\"] primary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UMINUS, uminus, "unaryMinus")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:662:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary3710);
					primary297=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary297.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 83, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:665:1: primary : ( postFixCall | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postFixCall298 =null;
		ParserRuleReturnScope atom299 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:2: ( postFixCall | atom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:4: postFixCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixCall_in_primary3722);
					postFixCall298=postFixCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixCall298.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:667:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary3727);
					atom299=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom299.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class postFixCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:670:1: postFixCall : ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call ) )* ;
	public final TSPHPParser.postFixCall_return postFixCall() throws RecognitionException {
		TSPHPParser.postFixCall_return retval = new TSPHPParser.postFixCall_return();
		retval.start = input.LT(1);
		int postFixCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier302=null;
		Token char_literal304=null;
		ParserRuleReturnScope functionCall300 =null;
		ParserRuleReturnScope methodCall301 =null;
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
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:2: ( ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:4: ( functionCall -> functionCall | methodCall -> methodCall ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:4: ( functionCall -> functionCall | methodCall -> methodCall )
			int alt93=2;
			alt93 = dfa93.predict(input);
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:671:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_postFixCall3742);
					functionCall300=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(functionCall300.getTree());
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
					// 671:19: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:672:5: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_postFixCall3752);
					methodCall301=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(methodCall301.getTree());
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
					// 672:16: -> methodCall
					{
						adaptor.addChild(root_0, stream_methodCall.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:674:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call ) )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:674:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixCall3770); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier302=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixCall3772); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier302);

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
					// 674:36: -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:674:39: ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixCall Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "memberAccess")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixCall3794); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixCall3796);
					expression303=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression303.getTree());
					char_literal304=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixCall3798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal304);

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
					// 675:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:675:41: ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixCall expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "arrayAccess")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:676:5: call
					{
					pushFollow(FOLLOW_call_in_postFixCall3816);
					call305=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call305.getTree());
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
					// 676:10: -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:676:13: ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixCall call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call305!=null?((Token)call305.start):null), "methodCall")
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
			if ( state.backtracking>0 ) { memoize(input, 85, postFixCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixCall"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:680:1: functionCall : classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"functionCall\"] classInterfaceTypeWithoutObject actualParameters ) ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope classInterfaceTypeWithoutObject306 =null;
		ParserRuleReturnScope actualParameters307 =null;

		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:2: ( classInterfaceTypeWithoutObject actualParameters -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"functionCall\"] classInterfaceTypeWithoutObject actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:681:4: classInterfaceTypeWithoutObject actualParameters
			{
			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3844);
			classInterfaceTypeWithoutObject306=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject306.getTree());
			pushFollow(FOLLOW_actualParameters_in_functionCall3846);
			actualParameters307=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters307.getTree());
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
			// 682:3: -> ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"functionCall\"] classInterfaceTypeWithoutObject actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:682:6: ^( FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,\"functionCall\"] classInterfaceTypeWithoutObject actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(FUNCTION_CALL, (classInterfaceTypeWithoutObject306!=null?((Token)classInterfaceTypeWithoutObject306.start):null), "functionCall")
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
			if ( state.backtracking>0 ) { memoize(input, 86, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:1: call : '->' ! Identifier actualParameters ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal308=null;
		Token Identifier309=null;
		ParserRuleReturnScope actualParameters310 =null;

		CommonTree string_literal308_tree=null;
		CommonTree Identifier309_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:6: ( '->' ! Identifier actualParameters )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:685:8: '->' ! Identifier actualParameters
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal308=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call3870); if (state.failed) return retval;
			Identifier309=(Token)match(input,Identifier,FOLLOW_Identifier_in_call3873); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier309_tree = 
			(CommonTree)adaptor.create(Identifier309)
			;
			adaptor.addChild(root_0, Identifier309_tree);
			}

			pushFollow(FOLLOW_actualParameters_in_call3875);
			actualParameters310=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters310.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:688:1: methodCall : callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"methodCall\"] callee Identifier actualParameters ) ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier312=null;
		ParserRuleReturnScope callee311 =null;
		ParserRuleReturnScope actualParameters313 =null;

		CommonTree Identifier312_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
		RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:2: ( callee Identifier actualParameters -> ^( METHOD_CALL[$callee.start,\"methodCall\"] callee Identifier actualParameters ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:689:4: callee Identifier actualParameters
			{
			pushFollow(FOLLOW_callee_in_methodCall3887);
			callee311=callee();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_callee.add(callee311.getTree());
			Identifier312=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3889); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier312);

			pushFollow(FOLLOW_actualParameters_in_methodCall3891);
			actualParameters313=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters313.getTree());
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
			// 690:3: -> ^( METHOD_CALL[$callee.start,\"methodCall\"] callee Identifier actualParameters )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:690:6: ^( METHOD_CALL[$callee.start,\"methodCall\"] callee Identifier actualParameters )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(METHOD_CALL, (callee311!=null?((Token)callee311.start):null), "methodCall")
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
			if ( state.backtracking>0 ) { memoize(input, 88, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class callee_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callee"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );
	public final TSPHPParser.callee_return callee() throws RecognitionException {
		TSPHPParser.callee_return retval = new TSPHPParser.callee_return();
		retval.start = input.LT(1);
		int callee_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal315=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember314 =null;
		ParserRuleReturnScope staticAccessOrParent316 =null;

		CommonTree string_literal315_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:8: ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent )
			int alt95=2;
			alt95 = dfa95.predict(input);
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:693:10: variableOrMemberOrStaticMember '->' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_callee3917);
					variableOrMemberOrStaticMember314=variableOrMemberOrStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableOrMemberOrStaticMember314.getTree());

					string_literal315=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_callee3919); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:694:4: staticAccessOrParent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_callee3925);
					staticAccessOrParent316=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent316.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 89, callee_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callee"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:1: atom : ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal317=null;
		Token char_literal319=null;
		ParserRuleReturnScope expression318 =null;
		ParserRuleReturnScope incrementDecrement320 =null;
		ParserRuleReturnScope postFixVariableInclCallAtTheEnd321 =null;
		ParserRuleReturnScope classConstant322 =null;
		ParserRuleReturnScope globalConstant323 =null;
		ParserRuleReturnScope array324 =null;
		ParserRuleReturnScope primitiveAtom325 =null;

		CommonTree char_literal317_tree=null;
		CommonTree char_literal319_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:6: ( '(' expression ')' -> expression | incrementDecrement | postFixVariableInclCallAtTheEnd | classConstant | globalConstant | array | primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:697:8: '(' expression ')'
					{
					char_literal317=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3935); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal317);

					pushFollow(FOLLOW_expression_in_atom3937);
					expression318=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression318.getTree());
					char_literal319=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3939); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal319);

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
					// 697:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:698:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3948);
					incrementDecrement320=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement320.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:4: postFixVariableInclCallAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3953);
					postFixVariableInclCallAtTheEnd321=postFixVariableInclCallAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postFixVariableInclCallAtTheEnd321.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:700:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3958);
					classConstant322=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant322.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3963);
					globalConstant323=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant323.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:702:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3968);
					array324=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array324.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:703:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3973);
					primitiveAtom325=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom325.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 90, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class postFixVariableWithoutCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableWithoutCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:706:1: postFixVariableWithoutCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* ;
	public final TSPHPParser.postFixVariableWithoutCallAtTheEnd_return postFixVariableWithoutCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableWithoutCallAtTheEnd_return retval = new TSPHPParser.postFixVariableWithoutCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableWithoutCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier328=null;
		Token char_literal330=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember326 =null;
		ParserRuleReturnScope call327 =null;
		ParserRuleReturnScope expression329 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier328_tree=null;
		CommonTree char_literal330_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:707:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:707:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:707:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:707:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3985);
			variableOrMemberOrStaticMember326=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember326.getTree());
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
			// 707:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:708:3: ( ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) ) )*
			loop99:
			do {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==LeftSquareBrace||LA99_0==ObjectOperator) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) )
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:4: ( ( call )* -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* ) )
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:5: ( call )*
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:5: ( call )*
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:5: call
							{
							pushFollow(FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd4000);
							call327=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_call.add(call327.getTree());
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
					// 709:11: -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:14: ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableWithoutCallAtTheEnd ( call )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call327!=null?((Token)call327.start):null), "methodCall")
						, root_1);

						adaptor.addChild(root_1, stream_retval.nextTree());

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:709:90: ( call )*
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

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:711:4: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression ) )
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:711:6: memberAccess= '->' Identifier
							{
							memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd4031); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

							Identifier328=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd4033); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier328);

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
							// 711:37: -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:711:40: ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableWithoutCallAtTheEnd Identifier )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "memberAccess")
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:712:6: arrayAccess= '[' expression ']'
							{
							arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd4056); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

							pushFollow(FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd4058);
							expression329=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression329.getTree());
							char_literal330=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd4060); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal330);

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
							// 712:39: -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression )
							{
								// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:712:42: ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableWithoutCallAtTheEnd expression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(
								(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "arrayAccess")
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
			if ( state.backtracking>0 ) { memoize(input, 91, postFixVariableWithoutCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableWithoutCallAtTheEnd"


	public static class postFixVariableInclCallAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postFixVariableInclCallAtTheEnd"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:718:1: postFixVariableInclCallAtTheEnd : ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call ) )* ;
	public final TSPHPParser.postFixVariableInclCallAtTheEnd_return postFixVariableInclCallAtTheEnd() throws RecognitionException {
		TSPHPParser.postFixVariableInclCallAtTheEnd_return retval = new TSPHPParser.postFixVariableInclCallAtTheEnd_return();
		retval.start = input.LT(1);
		int postFixVariableInclCallAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token memberAccess=null;
		Token arrayAccess=null;
		Token Identifier332=null;
		Token char_literal334=null;
		ParserRuleReturnScope variableOrMemberOrStaticMember331 =null;
		ParserRuleReturnScope expression333 =null;
		ParserRuleReturnScope call335 =null;

		CommonTree memberAccess_tree=null;
		CommonTree arrayAccess_tree=null;
		CommonTree Identifier332_tree=null;
		CommonTree char_literal334_tree=null;
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_ObjectOperator=new RewriteRuleTokenStream(adaptor,"token ObjectOperator");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_variableOrMemberOrStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableOrMemberOrStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:719:2: ( ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call ) )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:719:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember ) (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call ) )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:719:4: ( variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:719:5: variableOrMemberOrStaticMember
			{
			pushFollow(FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd4099);
			variableOrMemberOrStaticMember331=variableOrMemberOrStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableOrMemberOrStaticMember.add(variableOrMemberOrStaticMember331.getTree());
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
			// 719:36: -> variableOrMemberOrStaticMember
			{
				adaptor.addChild(root_0, stream_variableOrMemberOrStaticMember.nextTree());

			}


			retval.tree = root_0;
			}

			}

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:720:3: (memberAccess= '->' Identifier -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier ) |arrayAccess= '[' expression ']' -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression ) | call -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call ) )*
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:720:5: memberAccess= '->' Identifier
					{
					memberAccess=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd4114); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ObjectOperator.add(memberAccess);

					Identifier332=(Token)match(input,Identifier,FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd4116); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier332);

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
					// 720:36: -> ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:720:39: ^( MEMBER_ACCESS[$memberAccess,\"memberAccess\"] $postFixVariableInclCallAtTheEnd Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(MEMBER_ACCESS, memberAccess, "memberAccess")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:721:5: arrayAccess= '[' expression ']'
					{
					arrayAccess=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd4138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arrayAccess);

					pushFollow(FOLLOW_expression_in_postFixVariableInclCallAtTheEnd4140);
					expression333=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression333.getTree());
					char_literal334=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd4142); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal334);

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
					// 721:38: -> ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:721:41: ^( ARRAY_ACCESS[$arrayAccess,\"arrayAccess\"] $postFixVariableInclCallAtTheEnd expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(ARRAY_ACCESS, arrayAccess, "arrayAccess")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:722:5: call
					{
					pushFollow(FOLLOW_call_in_postFixVariableInclCallAtTheEnd4160);
					call335=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_call.add(call335.getTree());
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
					// 722:10: -> ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:722:13: ^( METHOD_CALL[$call.start,\"methodCall\"] $postFixVariableInclCallAtTheEnd call )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(METHOD_CALL, (call335!=null?((Token)call335.start):null), "methodCall")
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
			if ( state.backtracking>0 ) { memoize(input, 92, postFixVariableInclCallAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postFixVariableInclCallAtTheEnd"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:726:1: classConstant : staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent Identifier ) ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier337=null;
		ParserRuleReturnScope staticAccessOrParent336 =null;

		CommonTree Identifier337_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_staticAccessOrParent=new RewriteRuleSubtreeStream(adaptor,"rule staticAccessOrParent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:727:2: ( staticAccessOrParent Identifier -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent Identifier ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:727:4: staticAccessOrParent Identifier
			{
			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant4188);
			staticAccessOrParent336=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_staticAccessOrParent.add(staticAccessOrParent336.getTree());
			Identifier337=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant4190); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier337);

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
			// 727:36: -> ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent Identifier )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:727:39: ^( MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,\"static memberAccess\"] staticAccessOrParent Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(MEMBER_ACCESS_STATIC, (staticAccessOrParent336!=null?((Token)staticAccessOrParent336.start):null), "static memberAccess")
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
			if ( state.backtracking>0 ) { memoize(input, 93, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:730:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier338=null;

		CommonTree Identifier338_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:731:2: ( Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:731:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier338=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant4213); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 94, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:734:1: unaryPrimitiveAtom : (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unaryPlus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unaryMinus\"] primitiveAtom ) | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primitiveAtom339 =null;
		ParserRuleReturnScope primitiveAtom340 =null;
		ParserRuleReturnScope primitiveAtom341 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primitiveAtom=new RewriteRuleSubtreeStream(adaptor,"rule primitiveAtom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:735:2: (uplus= '+' primitiveAtom -> ^( UPLUS[$uplus,\"unaryPlus\"] primitiveAtom ) |uminus= '-' primitiveAtom -> ^( UMINUS[$uminus,\"unaryMinus\"] primitiveAtom ) | primitiveAtom )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:735:4: uplus= '+' primitiveAtom
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom4229); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4231);
					primitiveAtom339=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom339.getTree());
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
					// 735:30: -> ^( UPLUS[$uplus,\"unaryPlus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:735:33: ^( UPLUS[$uplus,\"unaryPlus\"] primitiveAtom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UPLUS, uplus, "unaryPlus")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:736:4: uminus= '-' primitiveAtom
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom4249); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4251);
					primitiveAtom340=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveAtom.add(primitiveAtom340.getTree());
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
					// 736:31: -> ^( UMINUS[$uminus,\"unaryMinus\"] primitiveAtom )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:736:34: ^( UMINUS[$uminus,\"unaryMinus\"] primitiveAtom )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(UMINUS, uminus, "unaryMinus")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:737:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4265);
					primitiveAtom341=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom341.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 95, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:740:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set342=null;

		CommonTree set342_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:741:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set342=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set342)
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
			if ( state.backtracking>0 ) { memoize(input, 96, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:1: array : (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token arr=null;
		Token char_literal344=null;
		Token TypeArray345=null;
		Token char_literal346=null;
		Token char_literal348=null;
		ParserRuleReturnScope arrayContent343 =null;
		ParserRuleReturnScope arrayContent347 =null;

		CommonTree arr_tree=null;
		CommonTree char_literal344_tree=null;
		CommonTree TypeArray345_tree=null;
		CommonTree char_literal346_tree=null;
		CommonTree char_literal348_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightSquareBrace=new RewriteRuleTokenStream(adaptor,"token RightSquareBrace");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_TypeArray=new RewriteRuleTokenStream(adaptor,"token TypeArray");
		RewriteRuleTokenStream stream_LeftSquareBrace=new RewriteRuleTokenStream(adaptor,"token LeftSquareBrace");
		RewriteRuleSubtreeStream stream_arrayContent=new RewriteRuleSubtreeStream(adaptor,"rule arrayContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:7: (arr= '[' ( arrayContent )? ']' -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? ) | TypeArray '(' ( arrayContent )? ')' -> ^( TypeArray ( arrayContent )? ) )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:9: arr= '[' ( arrayContent )? ']'
					{
					arr=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array4783); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftSquareBrace.add(arr);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:17: ( arrayContent )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==At||LA102_0==Backslash||LA102_0==BitwiseNot||LA102_0==Bool||LA102_0==Clone||LA102_0==Float||LA102_0==Identifier||LA102_0==Int||(LA102_0 >= LeftParanthesis && LA102_0 <= LeftSquareBrace)||LA102_0==LogicNot||LA102_0==Minus||LA102_0==MinusMinus||LA102_0==New||LA102_0==Null||(LA102_0 >= ParentColonColon && LA102_0 <= Plus)||LA102_0==PlusPlus||LA102_0==SelfColonColon||LA102_0==String||LA102_0==This||LA102_0==TypeArray||LA102_0==VariableId) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:17: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4785);
							arrayContent343=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent343.getTree());
							}
							break;

					}

					char_literal344=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array4788); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightSquareBrace.add(char_literal344);

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
					// 811:36: -> ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:39: ^( TypeArray[$arr,\"array\"] ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(TypeArray, arr, "array")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:811:65: ( arrayContent )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:4: TypeArray '(' ( arrayContent )? ')'
					{
					TypeArray345=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array4804); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeArray.add(TypeArray345);

					char_literal346=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array4806); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal346);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:18: ( arrayContent )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==At||LA103_0==Backslash||LA103_0==BitwiseNot||LA103_0==Bool||LA103_0==Clone||LA103_0==Float||LA103_0==Identifier||LA103_0==Int||(LA103_0 >= LeftParanthesis && LA103_0 <= LeftSquareBrace)||LA103_0==LogicNot||LA103_0==Minus||LA103_0==MinusMinus||LA103_0==New||LA103_0==Null||(LA103_0 >= ParentColonColon && LA103_0 <= Plus)||LA103_0==PlusPlus||LA103_0==SelfColonColon||LA103_0==String||LA103_0==This||LA103_0==TypeArray||LA103_0==VariableId) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:18: arrayContent
							{
							pushFollow(FOLLOW_arrayContent_in_array4808);
							arrayContent347=arrayContent();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayContent.add(arrayContent347.getTree());
							}
							break;

					}

					char_literal348=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array4811); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal348);

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
					// 812:36: -> ^( TypeArray ( arrayContent )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:39: ^( TypeArray ( arrayContent )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_TypeArray.nextNode()
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:812:51: ( arrayContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 97, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class arrayContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:815:1: arrayContent : arrayKeyValue ( ',' ! arrayKeyValue )* ;
	public final TSPHPParser.arrayContent_return arrayContent() throws RecognitionException {
		TSPHPParser.arrayContent_return retval = new TSPHPParser.arrayContent_return();
		retval.start = input.LT(1);
		int arrayContent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal350=null;
		ParserRuleReturnScope arrayKeyValue349 =null;
		ParserRuleReturnScope arrayKeyValue351 =null;

		CommonTree char_literal350_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:2: ( arrayKeyValue ( ',' ! arrayKeyValue )* )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:4: arrayKeyValue ( ',' ! arrayKeyValue )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4832);
			arrayKeyValue349=arrayKeyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue349.getTree());

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:18: ( ',' ! arrayKeyValue )*
			loop105:
			do {
				int alt105=2;
				int LA105_0 = input.LA(1);
				if ( (LA105_0==Comma) ) {
					alt105=1;
				}

				switch (alt105) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:816:19: ',' ! arrayKeyValue
					{
					char_literal350=(Token)match(input,Comma,FOLLOW_Comma_in_arrayContent4835); if (state.failed) return retval;
					pushFollow(FOLLOW_arrayKeyValue_in_arrayContent4838);
					arrayKeyValue351=arrayKeyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayKeyValue351.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 98, arrayContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayContent"


	public static class arrayKeyValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:818:1: arrayKeyValue : (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression );
	public final TSPHPParser.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		TSPHPParser.arrayKeyValue_return retval = new TSPHPParser.arrayKeyValue_return();
		retval.start = input.LT(1);
		int arrayKeyValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal352=null;
		ParserRuleReturnScope key =null;
		ParserRuleReturnScope value =null;
		ParserRuleReturnScope expression353 =null;

		CommonTree string_literal352_tree=null;
		RewriteRuleTokenStream stream_Arrow=new RewriteRuleTokenStream(adaptor,"token Arrow");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:2: (key= expression '=>' value= expression -> ^( '=>' $key $value) | expression )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:4: key= expression '=>' value= expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue4852);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(key.getTree());
					string_literal352=(Token)match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue4854); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal352);

					pushFollow(FOLLOW_expression_in_arrayKeyValue4858);
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
					// 819:41: -> ^( '=>' $key $value)
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:44: ^( '=>' $key $value)
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:820:4: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arrayKeyValue4875);
					expression353=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression353.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 99, arrayKeyValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayKeyValue"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:824:1: ifCondition : 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal354=null;
		Token char_literal355=null;
		Token char_literal357=null;
		Token string_literal358=null;
		ParserRuleReturnScope instructionThen =null;
		ParserRuleReturnScope instructionElse =null;
		ParserRuleReturnScope expression356 =null;

		CommonTree string_literal354_tree=null;
		CommonTree char_literal355_tree=null;
		CommonTree char_literal357_tree=null;
		CommonTree string_literal358_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:2: ( 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )? -> ^( 'if' expression $instructionThen ( $instructionElse)? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:825:4: 'if' '(' expression ')' instructionThen= instructionInclBreakContinue ( 'else' instructionElse= instructionInclBreakContinue )?
			{
			string_literal354=(Token)match(input,If,FOLLOW_If_in_ifCondition4888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_If.add(string_literal354);

			char_literal355=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition4890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal355);

			pushFollow(FOLLOW_expression_in_ifCondition4892);
			expression356=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression356.getTree());
			char_literal357=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition4894); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal357);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4899);
			instructionThen=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionThen.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:3: ( 'else' instructionElse= instructionInclBreakContinue )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:5: 'else' instructionElse= instructionInclBreakContinue
					{
					string_literal358=(Token)match(input,Else,FOLLOW_Else_in_ifCondition4906); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(string_literal358);

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition4911);
					instructionElse=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionElse.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: instructionElse, expression, instructionThen, If
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
			// 826:61: -> ^( 'if' expression $instructionThen ( $instructionElse)? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:64: ^( 'if' expression $instructionThen ( $instructionElse)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_If.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				adaptor.addChild(root_1, stream_instructionThen.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:100: ( $instructionElse)?
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
			if ( state.backtracking>0 ) { memoize(input, 100, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:830:1: switchCondition : 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal359=null;
		Token char_literal360=null;
		Token VariableId361=null;
		Token char_literal362=null;
		Token char_literal363=null;
		Token char_literal365=null;
		ParserRuleReturnScope switchContent364 =null;

		CommonTree string_literal359_tree=null;
		CommonTree char_literal360_tree=null;
		CommonTree VariableId361_tree=null;
		CommonTree char_literal362_tree=null;
		CommonTree char_literal363_tree=null;
		CommonTree char_literal365_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_switchContent=new RewriteRuleSubtreeStream(adaptor,"rule switchContent");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:2: ( 'switch' '(' VariableId ')' '{' ( switchContent )? '}' -> ^( 'switch' VariableId ( switchContent )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:4: 'switch' '(' VariableId ')' '{' ( switchContent )? '}'
			{
			string_literal359=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition4942); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Switch.add(string_literal359);

			char_literal360=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition4944); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal360);

			VariableId361=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition4946); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId361);

			char_literal362=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition4948); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal362);

			char_literal363=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition4950); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(char_literal363);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:36: ( switchContent )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:36: switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition4952);
					switchContent364=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switchContent.add(switchContent364.getTree());
					}
					break;

			}

			char_literal365=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition4955); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal365);

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
			// 831:56: -> ^( 'switch' VariableId ( switchContent )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:59: ^( 'switch' VariableId ( switchContent )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Switch.nextNode()
				, root_1);

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:81: ( switchContent )?
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
			if ( state.backtracking>0 ) { memoize(input, 101, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:834:1: switchContent : ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? );
	public final TSPHPParser.switchContent_return switchContent() throws RecognitionException {
		TSPHPParser.switchContent_return retval = new TSPHPParser.switchContent_return();
		retval.start = input.LT(1);
		int switchContent_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope normalCaseInstructionMandatory366 =null;
		ParserRuleReturnScope defaultCaseInstructionMandatory367 =null;
		ParserRuleReturnScope normalCaseInstructionOptional368 =null;
		ParserRuleReturnScope normalCaseInstructionMandatory369 =null;
		ParserRuleReturnScope defaultCaseInstructionOptional370 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:2: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* | ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )? )
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( normalCaseInstructionMandatory )*
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4979);
							normalCaseInstructionMandatory366=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory366.getTree());

							}
							break;

						default :
							break loop109;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: ( defaultCaseInstructionMandatory )?
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: defaultCaseInstructionMandatory
							{
							pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_switchContent4982);
							defaultCaseInstructionMandatory367=defaultCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionMandatory367.getTree());

							}
							break;

					}

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:69: ( normalCaseInstructionOptional )*
					loop111:
					do {
						int alt111=2;
						int LA111_0 = input.LA(1);
						if ( (LA111_0==Case) ) {
							alt111=1;
						}

						switch (alt111) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:69: normalCaseInstructionOptional
							{
							pushFollow(FOLLOW_normalCaseInstructionOptional_in_switchContent4985);
							normalCaseInstructionOptional368=normalCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionOptional368.getTree());

							}
							break;

						default :
							break loop111;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionOptional )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( normalCaseInstructionMandatory )*
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
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: normalCaseInstructionMandatory
							{
							pushFollow(FOLLOW_normalCaseInstructionMandatory_in_switchContent4991);
							normalCaseInstructionMandatory369=normalCaseInstructionMandatory();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, normalCaseInstructionMandatory369.getTree());

							}
							break;

						default :
							break loop112;
						}
					} while (true);

					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:36: ( defaultCaseInstructionOptional )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==Case||LA113_0==Default) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:36: defaultCaseInstructionOptional
							{
							pushFollow(FOLLOW_defaultCaseInstructionOptional_in_switchContent4994);
							defaultCaseInstructionOptional370=defaultCaseInstructionOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultCaseInstructionOptional370.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 102, switchContent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchContent"


	public static class normalCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:839:1: normalCaseInstructionMandatory : ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.normalCaseInstructionMandatory_return normalCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.normalCaseInstructionMandatory_return retval = new TSPHPParser.normalCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int normalCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel371 =null;
		ParserRuleReturnScope instructionInclBreakContinue372 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:2: ( ( caseLabel )+ ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:4: ( caseLabel )+ ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionMandatory5007);
					caseLabel371=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel371.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:15: ( instructionInclBreakContinue )+
			int cnt116=0;
			loop116:
			do {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==At||LA116_0==Backslash||LA116_0==BitwiseNot||(LA116_0 >= Bool && LA116_0 <= Break)||LA116_0==Clone||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= Float && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==Int||(LA116_0 >= LeftCurlyBrace && LA116_0 <= LeftSquareBrace)||LA116_0==LogicNot||LA116_0==Minus||LA116_0==MinusMinus||LA116_0==New||LA116_0==Null||(LA116_0 >= ParentColonColon && LA116_0 <= Plus)||LA116_0==PlusPlus||LA116_0==Return||(LA116_0 >= SelfColonColon && LA116_0 <= Semicolon)||(LA116_0 >= String && LA116_0 <= Switch)||(LA116_0 >= This && LA116_0 <= TypeBool)||(LA116_0 >= TypeFloat && LA116_0 <= TypeInt)||(LA116_0 >= TypeObject && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:840:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory5010);
					instructionInclBreakContinue372=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue372.getTree());
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
			// 841:3: -> ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:841:7: ^( SWITCH_CASES[$normalCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switchCases")
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:842:5: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue372!=null?((Token)instructionInclBreakContinue372.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 103, normalCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionMandatory"


	public static class normalCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:845:1: normalCaseInstructionOptional : ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.normalCaseInstructionOptional_return normalCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.normalCaseInstructionOptional_return retval = new TSPHPParser.normalCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int normalCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel373 =null;
		ParserRuleReturnScope instructionInclBreakContinue374 =null;

		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:2: ( ( caseLabel )+ ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:4: ( caseLabel )+ ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:4: ( caseLabel )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_normalCaseInstructionOptional5048);
					caseLabel373=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel373.getTree());
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

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:15: ( instructionInclBreakContinue )*
			loop118:
			do {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==At||LA118_0==Backslash||LA118_0==BitwiseNot||(LA118_0 >= Bool && LA118_0 <= Break)||LA118_0==Clone||LA118_0==Continue||LA118_0==Do||LA118_0==Echo||LA118_0==Exit||(LA118_0 >= Float && LA118_0 <= Foreach)||(LA118_0 >= Identifier && LA118_0 <= If)||LA118_0==Int||(LA118_0 >= LeftCurlyBrace && LA118_0 <= LeftSquareBrace)||LA118_0==LogicNot||LA118_0==Minus||LA118_0==MinusMinus||LA118_0==New||LA118_0==Null||(LA118_0 >= ParentColonColon && LA118_0 <= Plus)||LA118_0==PlusPlus||LA118_0==Return||(LA118_0 >= SelfColonColon && LA118_0 <= Semicolon)||(LA118_0 >= String && LA118_0 <= Switch)||(LA118_0 >= This && LA118_0 <= TypeBool)||(LA118_0 >= TypeFloat && LA118_0 <= TypeInt)||(LA118_0 >= TypeObject && LA118_0 <= TypeString)||LA118_0==VariableId||LA118_0==While) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:15: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional5051);
					instructionInclBreakContinue374=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue374.getTree());
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
			// 847:3: -> ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )+ ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:847:7: ^( SWITCH_CASES[$normalCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switchCases")
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

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue374!=null?((Token)instructionInclBreakContinue374.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:848:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 104, normalCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "normalCaseInstructionOptional"


	public static class defaultCaseInstructionMandatory_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionMandatory"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:851:1: defaultCaseInstructionMandatory : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) ;
	public final TSPHPParser.defaultCaseInstructionMandatory_return defaultCaseInstructionMandatory() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionMandatory_return retval = new TSPHPParser.defaultCaseInstructionMandatory_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionMandatory_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel375 =null;
		ParserRuleReturnScope defaultLabel376 =null;
		ParserRuleReturnScope caseLabel377 =null;
		ParserRuleReturnScope instructionInclBreakContinue378 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+ -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )+
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:4: ( caseLabel )*
			loop119:
			do {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==Case) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory5091);
					caseLabel375=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel375.getTree());
					}
					break;

				default :
					break loop119;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory5094);
			defaultLabel376=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel376.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:28: ( caseLabel )*
			loop120:
			do {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==Case) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionMandatory5096);
					caseLabel377=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel377.getTree());
					}
					break;

				default :
					break loop120;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:39: ( instructionInclBreakContinue )+
			int cnt121=0;
			loop121:
			do {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==At||LA121_0==Backslash||LA121_0==BitwiseNot||(LA121_0 >= Bool && LA121_0 <= Break)||LA121_0==Clone||LA121_0==Continue||LA121_0==Do||LA121_0==Echo||LA121_0==Exit||(LA121_0 >= Float && LA121_0 <= Foreach)||(LA121_0 >= Identifier && LA121_0 <= If)||LA121_0==Int||(LA121_0 >= LeftCurlyBrace && LA121_0 <= LeftSquareBrace)||LA121_0==LogicNot||LA121_0==Minus||LA121_0==MinusMinus||LA121_0==New||LA121_0==Null||(LA121_0 >= ParentColonColon && LA121_0 <= Plus)||LA121_0==PlusPlus||LA121_0==Return||(LA121_0 >= SelfColonColon && LA121_0 <= Semicolon)||(LA121_0 >= String && LA121_0 <= Switch)||(LA121_0 >= This && LA121_0 <= TypeBool)||(LA121_0 >= TypeFloat && LA121_0 <= TypeInt)||(LA121_0 >= TypeObject && LA121_0 <= TypeString)||LA121_0==VariableId||LA121_0==While) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:852:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory5099);
					instructionInclBreakContinue378=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue378.getTree());
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
			// 853:3: -> ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:7: ^( SWITCH_CASES[$defaultCaseInstructionMandatory.start,\"switchCases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switchCases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:853:76: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:854:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue378!=null?((Token)instructionInclBreakContinue378.start):null), "block")
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
			if ( state.backtracking>0 ) { memoize(input, 105, defaultCaseInstructionMandatory_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionMandatory"


	public static class defaultCaseInstructionOptional_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultCaseInstructionOptional"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:856:1: defaultCaseInstructionOptional : ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.defaultCaseInstructionOptional_return defaultCaseInstructionOptional() throws RecognitionException {
		TSPHPParser.defaultCaseInstructionOptional_return retval = new TSPHPParser.defaultCaseInstructionOptional_return();
		retval.start = input.LT(1);
		int defaultCaseInstructionOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope caseLabel379 =null;
		ParserRuleReturnScope defaultLabel380 =null;
		ParserRuleReturnScope caseLabel381 =null;
		ParserRuleReturnScope instructionInclBreakContinue382 =null;

		RewriteRuleSubtreeStream stream_defaultLabel=new RewriteRuleSubtreeStream(adaptor,"rule defaultLabel");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");
		RewriteRuleSubtreeStream stream_caseLabel=new RewriteRuleSubtreeStream(adaptor,"rule caseLabel");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:2: ( ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )* -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:4: ( caseLabel )* defaultLabel ( caseLabel )* ( instructionInclBreakContinue )*
			{
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:4: ( caseLabel )*
			loop122:
			do {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==Case) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:4: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional5137);
					caseLabel379=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel379.getTree());
					}
					break;

				default :
					break loop122;
				}
			} while (true);

			pushFollow(FOLLOW_defaultLabel_in_defaultCaseInstructionOptional5140);
			defaultLabel380=defaultLabel();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_defaultLabel.add(defaultLabel380.getTree());
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:28: ( caseLabel )*
			loop123:
			do {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==Case) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:28: caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_defaultCaseInstructionOptional5142);
					caseLabel381=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_caseLabel.add(caseLabel381.getTree());
					}
					break;

				default :
					break loop123;
				}
			} while (true);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:39: ( instructionInclBreakContinue )*
			loop124:
			do {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==At||LA124_0==Backslash||LA124_0==BitwiseNot||(LA124_0 >= Bool && LA124_0 <= Break)||LA124_0==Clone||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= Float && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==Int||(LA124_0 >= LeftCurlyBrace && LA124_0 <= LeftSquareBrace)||LA124_0==LogicNot||LA124_0==Minus||LA124_0==MinusMinus||LA124_0==New||LA124_0==Null||(LA124_0 >= ParentColonColon && LA124_0 <= Plus)||LA124_0==PlusPlus||LA124_0==Return||(LA124_0 >= SelfColonColon && LA124_0 <= Semicolon)||(LA124_0 >= String && LA124_0 <= Switch)||(LA124_0 >= This && LA124_0 <= TypeBool)||(LA124_0 >= TypeFloat && LA124_0 <= TypeInt)||(LA124_0 >= TypeObject && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:857:39: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional5145);
					instructionInclBreakContinue382=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue382.getTree());
					}
					break;

				default :
					break loop124;
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
			// 858:3: -> ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )* defaultLabel ) ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:7: ^( SWITCH_CASES[$defaultCaseInstructionOptional.start,\"switchCases\"] ( caseLabel )* defaultLabel )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(SWITCH_CASES, ((Token)retval.start), "switchCases")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:858:75: ( caseLabel )*
				while ( stream_caseLabel.hasNext() ) {
					adaptor.addChild(root_1, stream_caseLabel.nextTree());

				}
				stream_caseLabel.reset();

				adaptor.addChild(root_1, stream_defaultLabel.nextTree());

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:859:4: ^( BLOCK[$instructionInclBreakContinue.start,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, (instructionInclBreakContinue382!=null?((Token)instructionInclBreakContinue382.start):null), "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:859:57: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 106, defaultCaseInstructionOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultCaseInstructionOptional"


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:862:1: caseLabel : 'case' ! expression ':' !;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:863:2: ( 'case' ! expression ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:863:4: 'case' ! expression ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal383=(Token)match(input,Case,FOLLOW_Case_in_caseLabel5186); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseLabel5189);
			expression384=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression384.getTree());

			char_literal385=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel5191); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:866:1: defaultLabel : 'default' ':' !;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:2: ( 'default' ':' !)
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:867:4: 'default' ':' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal386=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel5203); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal386_tree = 
			(CommonTree)adaptor.create(string_literal386)
			;
			adaptor.addChild(root_0, string_literal386_tree);
			}

			char_literal387=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel5205); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:870:1: forLoop : 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal388=null;
		ParserRuleReturnScope forInit389 =null;
		ParserRuleReturnScope forCondition390 =null;
		ParserRuleReturnScope forUpdate391 =null;
		ParserRuleReturnScope instructionInclBreakContinue392 =null;

		CommonTree string_literal388_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:871:2: ( 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:871:4: 'for' ^ forInit forCondition forUpdate instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal388=(Token)match(input,For,FOLLOW_For_in_forLoop5219); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal388_tree = 
			(CommonTree)adaptor.create(string_literal388)
			;
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal388_tree, root_0);
			}

			pushFollow(FOLLOW_forInit_in_forLoop5222);
			forInit389=forInit();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit389.getTree());

			pushFollow(FOLLOW_forCondition_in_forLoop5224);
			forCondition390=forCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forCondition390.getTree());

			pushFollow(FOLLOW_forUpdate_in_forLoop5226);
			forUpdate391=forUpdate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate391.getTree());

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop5228);
			instructionInclBreakContinue392=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue392.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:874:1: forInit : init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token init=null;
		ParserRuleReturnScope variableDeclarationListInclVariableId393 =null;
		ParserRuleReturnScope expressionList394 =null;

		CommonTree init_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
		RewriteRuleSubtreeStream stream_variableDeclarationListInclVariableId=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationListInclVariableId");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:875:2: (init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:875:4: init= '(' ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			{
			init=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forInit5243); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(init);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )
			int alt126=2;
			alt126 = dfa126.predict(input);
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:5: variableDeclarationListInclVariableId
					{
					pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_forInit5250);
					variableDeclarationListInclVariableId393=variableDeclarationListInclVariableId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableDeclarationListInclVariableId.add(variableDeclarationListInclVariableId393.getTree());
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
					// 876:43: -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:876:46: ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, init, "variables")
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:877:5: ( expressionList )?
					{
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:877:5: ( expressionList )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==At||LA125_0==Backslash||LA125_0==BitwiseNot||LA125_0==Bool||LA125_0==Clone||LA125_0==Float||LA125_0==Identifier||LA125_0==Int||(LA125_0 >= LeftParanthesis && LA125_0 <= LeftSquareBrace)||LA125_0==LogicNot||LA125_0==Minus||LA125_0==MinusMinus||LA125_0==New||LA125_0==Null||(LA125_0 >= ParentColonColon && LA125_0 <= Plus)||LA125_0==PlusPlus||LA125_0==SelfColonColon||LA125_0==String||LA125_0==This||LA125_0==TypeArray||LA125_0==VariableId) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:877:5: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_forInit5265);
							expressionList394=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList394.getTree());
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
					// 877:21: -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
					{
						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:877:24: ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(EXPRESSION_LIST, init, "expressions")
						, root_1);

						// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:877:63: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 110, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:881:1: forCondition : condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forCondition_return forCondition() throws RecognitionException {
		TSPHPParser.forCondition_return retval = new TSPHPParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token condition=null;
		ParserRuleReturnScope expressionList395 =null;

		CommonTree condition_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:2: (condition= ';' ( expressionList )? -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:4: condition= ';' ( expressionList )?
			{
			condition=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forCondition5295); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(condition);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:18: ( expressionList )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==At||LA127_0==Backslash||LA127_0==BitwiseNot||LA127_0==Bool||LA127_0==Clone||LA127_0==Float||LA127_0==Identifier||LA127_0==Int||(LA127_0 >= LeftParanthesis && LA127_0 <= LeftSquareBrace)||LA127_0==LogicNot||LA127_0==Minus||LA127_0==MinusMinus||LA127_0==New||LA127_0==Null||(LA127_0 >= ParentColonColon && LA127_0 <= Plus)||LA127_0==PlusPlus||LA127_0==SelfColonColon||LA127_0==String||LA127_0==This||LA127_0==TypeArray||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forCondition5297);
					expressionList395=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList395.getTree());
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
			// 882:34: -> ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:37: ^( EXPRESSION_LIST[$condition,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, condition, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:882:81: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 111, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:885:1: forUpdate : update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token update=null;
		Token char_literal397=null;
		ParserRuleReturnScope expressionList396 =null;

		CommonTree update_tree=null;
		CommonTree char_literal397_tree=null;
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:2: (update= ';' ( expressionList )? ')' -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:4: update= ';' ( expressionList )? ')'
			{
			update=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forUpdate5323); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(update);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:15: ( expressionList )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==At||LA128_0==Backslash||LA128_0==BitwiseNot||LA128_0==Bool||LA128_0==Clone||LA128_0==Float||LA128_0==Identifier||LA128_0==Int||(LA128_0 >= LeftParanthesis && LA128_0 <= LeftSquareBrace)||LA128_0==LogicNot||LA128_0==Minus||LA128_0==MinusMinus||LA128_0==New||LA128_0==Null||(LA128_0 >= ParentColonColon && LA128_0 <= Plus)||LA128_0==PlusPlus||LA128_0==SelfColonColon||LA128_0==String||LA128_0==This||LA128_0==TypeArray||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:15: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forUpdate5325);
					expressionList396=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionList.add(expressionList396.getTree());
					}
					break;

			}

			char_literal397=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forUpdate5328); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal397);

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
			// 886:35: -> ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:38: ^( EXPRESSION_LIST[$update,\"expressions\"] ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(EXPRESSION_LIST, update, "expressions")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:886:79: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 112, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:889:1: foreachLoop : 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token keyVarId=null;
		Token valueVarId=null;
		Token string_literal398=null;
		Token char_literal399=null;
		Token string_literal401=null;
		Token string_literal402=null;
		Token char_literal403=null;
		ParserRuleReturnScope keyType =null;
		ParserRuleReturnScope valueType =null;
		ParserRuleReturnScope expression400 =null;
		ParserRuleReturnScope instructionInclBreakContinue404 =null;

		CommonTree keyVarId_tree=null;
		CommonTree valueVarId_tree=null;
		CommonTree string_literal398_tree=null;
		CommonTree char_literal399_tree=null;
		CommonTree string_literal401_tree=null;
		CommonTree string_literal402_tree=null;
		CommonTree char_literal403_tree=null;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:890:2: ( 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:890:4: 'foreach' '(' expression 'as' (keyType= primitiveTypes keyVarId= VariableId '=>' )? valueType= allTypesWithoutObjectAndResource valueVarId= VariableId ')' instructionInclBreakContinue
			{
			string_literal398=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop5349); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Foreach.add(string_literal398);

			char_literal399=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop5351); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal399);

			pushFollow(FOLLOW_expression_in_foreachLoop5353);
			expression400=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression400.getTree());
			string_literal401=(Token)match(input,As,FOLLOW_As_in_foreachLoop5355); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_As.add(string_literal401);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:890:34: (keyType= primitiveTypes keyVarId= VariableId '=>' )?
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:890:35: keyType= primitiveTypes keyVarId= VariableId '=>'
					{
					pushFollow(FOLLOW_primitiveTypes_in_foreachLoop5360);
					keyType=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primitiveTypes.add(keyType.getTree());
					keyVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop5364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VariableId.add(keyVarId);

					string_literal402=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop5366); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Arrow.add(string_literal402);

					}
					break;

			}

			pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop5372);
			valueType=allTypesWithoutObjectAndResource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypesWithoutObjectAndResource.add(valueType.getTree());
			valueVarId=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop5376); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(valueVarId);

			char_literal403=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop5378); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal403);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop5380);
			instructionInclBreakContinue404=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue404.getTree());
			// AST REWRITE
			// elements: valueType, expression, instructionInclBreakContinue, Foreach, keyVarId, keyType, valueVarId
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
			// 891:3: -> ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:891:6: ^( 'foreach' expression ( $keyType)? ( $keyVarId)? $valueType $valueVarId instructionInclBreakContinue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Foreach.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_expression.nextTree());

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:891:30: ( $keyType)?
				if ( stream_keyType.hasNext() ) {
					adaptor.addChild(root_1, stream_keyType.nextTree());

				}
				stream_keyType.reset();

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:891:40: ( $keyVarId)?
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
			if ( state.backtracking>0 ) { memoize(input, 113, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:894:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal405=null;
		Token char_literal406=null;
		Token char_literal408=null;
		ParserRuleReturnScope expression407 =null;
		ParserRuleReturnScope instructionInclBreakContinue409 =null;

		CommonTree string_literal405_tree=null;
		CommonTree char_literal406_tree=null;
		CommonTree char_literal408_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:895:2: ( 'while' '(' expression ')' instructionInclBreakContinue -> ^( 'while' expression instructionInclBreakContinue ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:895:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			string_literal405=(Token)match(input,While,FOLLOW_While_in_whileLoop5418); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal405);

			char_literal406=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop5420); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal406);

			pushFollow(FOLLOW_expression_in_whileLoop5422);
			expression407=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression407.getTree());
			char_literal408=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop5424); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal408);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop5426);
			instructionInclBreakContinue409=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue409.getTree());
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
			// 895:60: -> ^( 'while' expression instructionInclBreakContinue )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:895:63: ^( 'while' expression instructionInclBreakContinue )
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
			if ( state.backtracking>0 ) { memoize(input, 114, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:898:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal410=null;
		Token string_literal412=null;
		Token char_literal413=null;
		Token char_literal415=null;
		Token char_literal416=null;
		ParserRuleReturnScope instructionInclBreakContinue411 =null;
		ParserRuleReturnScope expression414 =null;

		CommonTree string_literal410_tree=null;
		CommonTree string_literal412_tree=null;
		CommonTree char_literal413_tree=null;
		CommonTree char_literal415_tree=null;
		CommonTree char_literal416_tree=null;
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:899:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^( 'do' instructionInclBreakContinue expression ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:899:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			string_literal410=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop5448); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Do.add(string_literal410);

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop5450);
			instructionInclBreakContinue411=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue411.getTree());
			string_literal412=(Token)match(input,While,FOLLOW_While_in_doWhileLoop5452); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_While.add(string_literal412);

			char_literal413=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop5454); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal413);

			pushFollow(FOLLOW_expression_in_doWhileLoop5456);
			expression414=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression414.getTree());
			char_literal415=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop5458); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal415);

			char_literal416=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop5460); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Semicolon.add(char_literal416);

			// AST REWRITE
			// elements: instructionInclBreakContinue, Do, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 899:69: -> ^( 'do' instructionInclBreakContinue expression )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:899:72: ^( 'do' instructionInclBreakContinue expression )
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
			if ( state.backtracking>0 ) { memoize(input, 115, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:902:1: tryCatch : 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token tryBegin=null;
		Token string_literal417=null;
		Token char_literal419=null;
		ParserRuleReturnScope instructionInclBreakContinue418 =null;
		ParserRuleReturnScope catchBlock420 =null;

		CommonTree tryBegin_tree=null;
		CommonTree string_literal417_tree=null;
		CommonTree char_literal419_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Try=new RewriteRuleTokenStream(adaptor,"token Try");
		RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:2: ( 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+ -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:4: 'try' tryBegin= '{' ( instructionInclBreakContinue )* '}' ( catchBlock )+
			{
			string_literal417=(Token)match(input,Try,FOLLOW_Try_in_tryCatch5481); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Try.add(string_literal417);

			tryBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch5485); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(tryBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:23: ( instructionInclBreakContinue )*
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==At||LA130_0==Backslash||LA130_0==BitwiseNot||(LA130_0 >= Bool && LA130_0 <= Break)||LA130_0==Clone||LA130_0==Continue||LA130_0==Do||LA130_0==Echo||LA130_0==Exit||(LA130_0 >= Float && LA130_0 <= Foreach)||(LA130_0 >= Identifier && LA130_0 <= If)||LA130_0==Int||(LA130_0 >= LeftCurlyBrace && LA130_0 <= LeftSquareBrace)||LA130_0==LogicNot||LA130_0==Minus||LA130_0==MinusMinus||LA130_0==New||LA130_0==Null||(LA130_0 >= ParentColonColon && LA130_0 <= Plus)||LA130_0==PlusPlus||LA130_0==Return||(LA130_0 >= SelfColonColon && LA130_0 <= Semicolon)||(LA130_0 >= String && LA130_0 <= Switch)||(LA130_0 >= This && LA130_0 <= TypeBool)||(LA130_0 >= TypeFloat && LA130_0 <= TypeInt)||(LA130_0 >= TypeObject && LA130_0 <= TypeString)||LA130_0==VariableId||LA130_0==While) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:23: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch5487);
					instructionInclBreakContinue418=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue418.getTree());
					}
					break;

				default :
					break loop130;
				}
			} while (true);

			char_literal419=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch5490); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal419);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:57: ( catchBlock )+
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
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:903:57: catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch5492);
					catchBlock420=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock420.getTree());
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
			// 904:3: -> ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:904:6: ^( 'try' ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* ) ( catchBlock )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_Try.nextNode()
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:904:14: ^( BLOCK[$tryBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, tryBegin, "block")
				, root_2);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:904:41: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 116, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:907:1: catchBlock : 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variables\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variableDeclaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) ;
	public final TSPHPParser.catchBlock_return catchBlock() throws RecognitionException {
		TSPHPParser.catchBlock_return retval = new TSPHPParser.catchBlock_return();
		retval.start = input.LT(1);
		int catchBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token list=null;
		Token catchBegin=null;
		Token string_literal421=null;
		Token VariableId423=null;
		Token char_literal424=null;
		Token char_literal426=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject422 =null;
		ParserRuleReturnScope instructionInclBreakContinue425 =null;

		CommonTree list_tree=null;
		CommonTree catchBegin_tree=null;
		CommonTree string_literal421_tree=null;
		CommonTree VariableId423_tree=null;
		CommonTree char_literal424_tree=null;
		CommonTree char_literal426_tree=null;
		RewriteRuleTokenStream stream_LeftCurlyBrace=new RewriteRuleTokenStream(adaptor,"token LeftCurlyBrace");
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightCurlyBrace=new RewriteRuleTokenStream(adaptor,"token RightCurlyBrace");
		RewriteRuleTokenStream stream_Catch=new RewriteRuleTokenStream(adaptor,"token Catch");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_instructionInclBreakContinue=new RewriteRuleSubtreeStream(adaptor,"rule instructionInclBreakContinue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:908:2: ( 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}' -> ^( VARIABLE_DECLARATION_LIST[$list,\"variables\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variableDeclaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* ) )
			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:908:4: 'catch' list= '(' classInterfaceTypeWithoutObject VariableId ')' catchBegin= '{' ( instructionInclBreakContinue )* '}'
			{
			string_literal421=(Token)match(input,Catch,FOLLOW_Catch_in_catchBlock5524); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Catch.add(string_literal421);

			list=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_catchBlock5528); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftParanthesis.add(list);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5530);
			classInterfaceTypeWithoutObject422=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject422.getTree());
			VariableId423=(Token)match(input,VariableId,FOLLOW_VariableId_in_catchBlock5532); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId423);

			char_literal424=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_catchBlock5534); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal424);

			catchBegin=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_catchBlock5538); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LeftCurlyBrace.add(catchBegin);

			// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:908:83: ( instructionInclBreakContinue )*
			loop132:
			do {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==At||LA132_0==Backslash||LA132_0==BitwiseNot||(LA132_0 >= Bool && LA132_0 <= Break)||LA132_0==Clone||LA132_0==Continue||LA132_0==Do||LA132_0==Echo||LA132_0==Exit||(LA132_0 >= Float && LA132_0 <= Foreach)||(LA132_0 >= Identifier && LA132_0 <= If)||LA132_0==Int||(LA132_0 >= LeftCurlyBrace && LA132_0 <= LeftSquareBrace)||LA132_0==LogicNot||LA132_0==Minus||LA132_0==MinusMinus||LA132_0==New||LA132_0==Null||(LA132_0 >= ParentColonColon && LA132_0 <= Plus)||LA132_0==PlusPlus||LA132_0==Return||(LA132_0 >= SelfColonColon && LA132_0 <= Semicolon)||(LA132_0 >= String && LA132_0 <= Switch)||(LA132_0 >= This && LA132_0 <= TypeBool)||(LA132_0 >= TypeFloat && LA132_0 <= TypeInt)||(LA132_0 >= TypeObject && LA132_0 <= TypeString)||LA132_0==VariableId||LA132_0==While) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:908:83: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_catchBlock5540);
					instructionInclBreakContinue425=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_instructionInclBreakContinue.add(instructionInclBreakContinue425.getTree());
					}
					break;

				default :
					break loop132;
				}
			} while (true);

			char_literal426=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_catchBlock5543); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RightCurlyBrace.add(char_literal426);

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
			// 909:3: -> ^( VARIABLE_DECLARATION_LIST[$list,\"variables\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variableDeclaration\"] classInterfaceTypeWithoutObject VariableId ) ) ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
			{
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:909:6: ^( VARIABLE_DECLARATION_LIST[$list,\"variables\"] ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variableDeclaration\"] classInterfaceTypeWithoutObject VariableId ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION_LIST, list, "variables")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:910:4: ^( VARIABLE_DECLARATION[$classInterfaceTypeWithoutObject.start,\"variableDeclaration\"] classInterfaceTypeWithoutObject VariableId )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (classInterfaceTypeWithoutObject422!=null?((Token)classInterfaceTypeWithoutObject422.start):null), "variableDeclaration")
				, root_2);

				adaptor.addChild(root_2, stream_classInterfaceTypeWithoutObject.nextTree());

				adaptor.addChild(root_2, 
				stream_VariableId.nextNode()
				);

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:912:3: ^( BLOCK[$catchBegin,\"block\"] ( instructionInclBreakContinue )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(BLOCK, catchBegin, "block")
				, root_1);

				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:912:32: ( instructionInclBreakContinue )*
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
			if ( state.backtracking>0 ) { memoize(input, 117, catchBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "catchBlock"

	// $ANTLR start synpred61_TSPHP
	public final void synpred61_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
		{
		pushFollow(FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2354);
		paramDeclarationOptional();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:29: ( ',' paramDeclarationOptional )*
		loop139:
		do {
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==Comma) ) {
				alt139=1;
			}

			switch (alt139) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:433:30: ',' paramDeclarationOptional
				{
				match(input,Comma,FOLLOW_Comma_in_synpred61_TSPHP2357); if (state.failed) return ;

				pushFollow(FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2360);
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
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:30: ( ',' paramDeclarationInclNull )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:434:30: ',' paramDeclarationInclNull
		{
		match(input,Comma,FOLLOW_Comma_in_synpred62_TSPHP2370); if (state.failed) return ;

		pushFollow(FOLLOW_paramDeclarationInclNull_in_synpred62_TSPHP2373);
		paramDeclarationInclNull();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred62_TSPHP

	// $ANTLR start synpred73_TSPHP
	public final void synpred73_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:4: ( variableAssignment ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:466:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred73_TSPHP2591);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred73_TSPHP2593); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred73_TSPHP

	// $ANTLR start synpred74_TSPHP
	public final void synpred74_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:4: ( variableDeclaration ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:467:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred74_TSPHP2599);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred74_TSPHP2601); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred74_TSPHP

	// $ANTLR start synpred82_TSPHP
	public final void synpred82_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:475:4: ( expression ';' )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:475:4: expression ';'
		{
		pushFollow(FOLLOW_expression_in_synpred82_TSPHP2642);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred82_TSPHP2644); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred82_TSPHP

	// $ANTLR start synpred106_TSPHP
	public final void synpred106_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:543:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred106_TSPHP3037); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred106_TSPHP3040);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred106_TSPHP

	// $ANTLR start synpred107_TSPHP
	public final void synpred107_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:547:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred107_TSPHP3058); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred107_TSPHP3061);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred107_TSPHP

	// $ANTLR start synpred108_TSPHP
	public final void synpred108_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:16: ( 'and' assignment )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:551:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred108_TSPHP3079); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred108_TSPHP3082);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred108_TSPHP

	// $ANTLR start synpred109_TSPHP
	public final void synpred109_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:13: ( assignmentOperator ternary )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:555:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred109_TSPHP3098);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred109_TSPHP3101);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred109_TSPHP

	// $ANTLR start synpred136_TSPHP
	public final void synpred136_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:4: (cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:625:4: cast= '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred136_TSPHP3449); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutObjectAndResource_in_synpred136_TSPHP3451);
		allTypesWithoutObjectAndResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred136_TSPHP3453); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred136_TSPHP3455);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred136_TSPHP

	// $ANTLR start synpred149_TSPHP
	public final void synpred149_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:4: ( postFixCall )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:666:4: postFixCall
		{
		pushFollow(FOLLOW_postFixCall_in_synpred149_TSPHP3722);
		postFixCall();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred149_TSPHP

	// $ANTLR start synpred156_TSPHP
	public final void synpred156_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:698:4: ( incrementDecrement )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:698:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred156_TSPHP3948);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred156_TSPHP

	// $ANTLR start synpred157_TSPHP
	public final void synpred157_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:4: ( postFixVariableInclCallAtTheEnd )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:699:4: postFixVariableInclCallAtTheEnd
		{
		pushFollow(FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred157_TSPHP3953);
		postFixVariableInclCallAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred157_TSPHP

	// $ANTLR start synpred158_TSPHP
	public final void synpred158_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:700:4: ( classConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:700:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred158_TSPHP3958);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred158_TSPHP

	// $ANTLR start synpred159_TSPHP
	public final void synpred159_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:4: ( globalConstant )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:701:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred159_TSPHP3963);
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


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:4: (key= expression '=>' value= expression )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:819:4: key= expression '=>' value= expression
		{
		pushFollow(FOLLOW_expression_in_synpred178_TSPHP4852);
		key=expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred178_TSPHP4854); if (state.failed) return ;

		pushFollow(FOLLOW_expression_in_synpred178_TSPHP4858);
		value=expression();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred178_TSPHP

	// $ANTLR start synpred179_TSPHP
	public final void synpred179_TSPHP_fragment() throws RecognitionException {
		ParserRuleReturnScope instructionElse =null;


		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:5: ( 'else' instructionElse= instructionInclBreakContinue )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:826:5: 'else' instructionElse= instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred179_TSPHP4906); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred179_TSPHP4911);
		instructionElse=instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred179_TSPHP

	// $ANTLR start synpred180_TSPHP
	public final void synpred180_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:36: ( switchContent )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:831:36: switchContent
		{
		pushFollow(FOLLOW_switchContent_in_synpred180_TSPHP4952);
		switchContent();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred180_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred181_TSPHP4979);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: ( defaultCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: defaultCaseInstructionMandatory
		{
		pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred182_TSPHP4982);
		defaultCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )* )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( normalCaseInstructionMandatory )* ( defaultCaseInstructionMandatory )? ( normalCaseInstructionOptional )*
		{
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: ( normalCaseInstructionMandatory )*
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
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:4: normalCaseInstructionMandatory
				{
				pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred184_TSPHP4979);
				normalCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop148;
			}
		} while (true);

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: ( defaultCaseInstructionMandatory )?
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
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:36: defaultCaseInstructionMandatory
				{
				pushFollow(FOLLOW_defaultCaseInstructionMandatory_in_synpred184_TSPHP4982);
				defaultCaseInstructionMandatory();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:69: ( normalCaseInstructionOptional )*
		loop150:
		do {
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==Case) ) {
				alt150=1;
			}

			switch (alt150) {
			case 1 :
				// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:835:69: normalCaseInstructionOptional
				{
				pushFollow(FOLLOW_normalCaseInstructionOptional_in_synpred184_TSPHP4985);
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
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: ( normalCaseInstructionMandatory )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:836:4: normalCaseInstructionMandatory
		{
		pushFollow(FOLLOW_normalCaseInstructionMandatory_in_synpred185_TSPHP4991);
		normalCaseInstructionMandatory();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred185_TSPHP

	// $ANTLR start synpred189_TSPHP
	public final void synpred189_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:4: ( caseLabel )
		// D:\\TSPHP-parser\\src\\main\\antlr\\TSPHP.g:846:4: caseLabel
		{
		pushFollow(FOLLOW_caseLabel_in_synpred189_TSPHP5048);
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
		"\1\u009c\1\111\1\uffff\1\176\1\uffff\1\103\1\uffff\1\176";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\1\2\11\uffff\2\2\3\uffff"+
			"\1\2\10\uffff\1\2\6\uffff\1\2\2\uffff\1\2\3\uffff\5\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\1\2\7\uffff\1\2\1\uffff\1\2\4\uffff\1\1\1\2\3\uffff\1\2"+
			"\7\uffff\2\2\1\uffff\1\2\5\uffff\1\2\7\uffff\2\2\5\uffff\2\2\1\uffff"+
			"\5\2\2\uffff\2\2\1\uffff\3\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\74\uffff\1\4\64\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\74\uffff\1\4\64\uffff\1\6"
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
			return "211:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA51_eotS =
		"\17\uffff";
	static final String DFA51_eofS =
		"\10\uffff\1\13\6\uffff";
	static final String DFA51_minS =
		"\2\14\4\u009a\1\103\1\14\1\10\1\103\1\24\1\uffff\1\14\1\0\1\uffff";
	static final String DFA51_maxS =
		"\2\u0093\4\u009a\1\103\1\u009a\1\167\1\103\1\u0084\1\uffff\1\u009a\1\0"+
		"\1\uffff";
	static final String DFA51_acceptS =
		"\13\uffff\1\2\2\uffff\1\1";
	static final String DFA51_specialS =
		"\15\uffff\1\0\1\uffff}>";
	static final String[] DFA51_transitionS = {
			"\1\6\17\uffff\1\1\46\uffff\1\7\106\uffff\1\3\1\2\2\uffff\2\2\1\uffff"+
			"\1\5\1\4\1\2",
			"\1\6\66\uffff\1\7\106\uffff\1\3\1\2\2\uffff\2\2\1\uffff\1\5\1\4\1\2",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\10",
			"\1\7",
			"\1\11\u008d\uffff\1\10",
			"\1\12\30\uffff\1\13\125\uffff\1\13",
			"\1\14",
			"\1\16\46\uffff\1\16\7\uffff\1\16\3\uffff\1\16\20\uffff\1\16\13\uffff"+
			"\1\15\10\uffff\1\16\26\uffff\1\16",
			"",
			"\1\11\u008d\uffff\1\10",
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
			return "432:1: paramList : ( paramDeclarationOptional ( ',' ! paramDeclarationOptional )* | paramDeclarationInclNull ( ',' ! paramDeclarationInclNull )* ( ',' ! paramDeclarationOptional )* );";
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
		"\1\41\1\14\1\uffff\1\14\4\u009a\1\103\1\14\1\10\1\103\1\24\1\uffff\1\14"+
		"\1\0";
	static final String DFA49_maxS =
		"\1\167\1\u0093\1\uffff\1\u0093\4\u009a\1\103\1\u009a\1\167\1\103\1\u0084"+
		"\1\uffff\1\u009a\1\0";
	static final String DFA49_acceptS =
		"\2\uffff\1\2\12\uffff\1\1\2\uffff";
	static final String DFA49_specialS =
		"\17\uffff\1\0}>";
	static final String[] DFA49_transitionS = {
			"\1\1\125\uffff\1\2",
			"\1\10\17\uffff\1\3\46\uffff\1\11\106\uffff\1\5\1\4\2\uffff\2\4\1\uffff"+
			"\1\7\1\6\1\4",
			"",
			"\1\10\66\uffff\1\11\106\uffff\1\5\1\4\2\uffff\2\4\1\uffff\1\7\1\6\1"+
			"\4",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\12",
			"\1\11",
			"\1\13\u008d\uffff\1\12",
			"\1\14\30\uffff\1\15\125\uffff\1\15",
			"\1\16",
			"\1\2\46\uffff\1\2\7\uffff\1\2\3\uffff\1\2\20\uffff\1\2\13\uffff\1\17"+
			"\10\uffff\1\2\26\uffff\1\2",
			"",
			"\1\13\u008d\uffff\1\12",
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
			return "()* loopback of 434:29: ( ',' ! paramDeclarationInclNull )*";
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
		"\1\14\2\u009a\1\103\1\14\1\uffff\1\10\1\103\1\11\1\14\1\11\1\uffff";
	static final String DFA66_maxS =
		"\1\u0093\2\u009a\1\103\1\u009a\1\uffff\1\176\1\103\3\u009a\1\uffff";
	static final String DFA66_acceptS =
		"\5\uffff\1\2\5\uffff\1\1";
	static final String DFA66_specialS =
		"\14\uffff}>";
	static final String[] DFA66_transitionS = {
			"\1\3\66\uffff\1\4\106\uffff\1\2\1\1\2\uffff\2\1\1\uffff\2\5\1\1",
			"\1\6",
			"\1\6",
			"\1\4",
			"\1\7\u008d\uffff\1\6",
			"",
			"\1\10\30\uffff\1\5\134\uffff\1\5",
			"\1\11",
			"\1\5\2\uffff\1\5\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\5\3\uffff\1\5\2\uffff\1\12\1\5\4\uffff\1\5\7\uffff\1\5\1\uffff"+
			"\1\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\1\5\6\uffff"+
			"\1\5\2\uffff\1\5\2\uffff\1\5\17\uffff\1\5",
			"\1\7\u008d\uffff\1\6",
			"\1\5\2\uffff\1\5\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\5\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\7\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\7\uffff\1\13\5\uffff"+
			"\1\5\6\uffff\1\5\2\uffff\1\5\2\uffff\2\5\2\uffff\2\5\3\uffff\1\5\6\uffff"+
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
			return "530:1: variableDeclarationVariants : ( allTypesWithoutObjectAndResource VariableId cast= '=' '(' ')' expression -> allTypesWithoutObjectAndResource VariableId ^( CAST[$cast,\"cast\"] allTypesWithoutObjectAndResource expression ) | allTypes VariableId ( '=' expression )? -> allTypes VariableId ( expression )? );";
		}
	}

	static final String DFA89_eotS =
		"\10\uffff";
	static final String DFA89_eofS =
		"\3\uffff\1\6\3\uffff\1\6";
	static final String DFA89_minS =
		"\1\140\1\14\1\103\1\6\1\103\2\uffff\1\6";
	static final String DFA89_maxS =
		"\1\140\2\103\1\u0082\1\103\2\uffff\1\u0082";
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
			"\4\6\1\uffff\3\6\4\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
			"\1\6\2\uffff\2\6\5\uffff\5\6",
			"\1\7",
			"",
			"",
			"\3\6\3\uffff\1\4\2\6\1\uffff\4\6\14\uffff\2\6\10\uffff\2\6\2\uffff\2"+
			"\6\5\uffff\1\6\11\uffff\2\6\1\uffff\1\6\3\uffff\1\6\3\uffff\1\5\1\uffff"+
			"\4\6\1\uffff\3\6\4\uffff\2\6\1\uffff\4\6\2\uffff\3\6\11\uffff\2\6\5\uffff"+
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
			return "650:1: newObject : ( 'new' classInterfaceTypeWithoutObject actualParameters -> ^( 'new' classInterfaceTypeWithoutObject actualParameters ) | 'new' classInterfaceTypeWithoutObject -> ^( 'new' classInterfaceTypeWithoutObject EXPRESSION_LIST[$classInterfaceTypeWithoutObject.stop,\"expressions\"] ) );";
		}
	}

	static final String DFA93_eotS =
		"\7\uffff";
	static final String DFA93_eofS =
		"\7\uffff";
	static final String DFA93_minS =
		"\1\14\1\103\1\14\1\uffff\1\103\1\uffff\1\14";
	static final String DFA93_maxS =
		"\1\u009a\1\103\1\112\1\uffff\1\103\1\uffff\1\112";
	static final String DFA93_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA93_specialS =
		"\7\uffff}>";
	static final String[] DFA93_transitionS = {
			"\1\1\66\uffff\1\2\50\uffff\1\3\20\uffff\1\3\11\uffff\1\3\22\uffff\1\3",
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
			return "671:4: ( functionCall -> functionCall | methodCall -> methodCall )";
		}
	}

	static final String DFA95_eotS =
		"\12\uffff";
	static final String DFA95_eofS =
		"\12\uffff";
	static final String DFA95_minS =
		"\1\14\3\103\1\14\2\uffff\2\103\1\14";
	static final String DFA95_maxS =
		"\3\u009a\1\103\1\60\2\uffff\1\103\1\u009a\1\60";
	static final String DFA95_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA95_specialS =
		"\12\uffff}>";
	static final String[] DFA95_transitionS = {
			"\1\3\66\uffff\1\4\50\uffff\1\2\20\uffff\1\1\11\uffff\1\5\22\uffff\1\5",
			"\1\6\126\uffff\1\5",
			"\1\6\126\uffff\1\5",
			"\1\4",
			"\1\7\43\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\126\uffff\1\5",
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
			return "693:1: callee : ( variableOrMemberOrStaticMember '->' !| staticAccessOrParent );";
		}
	}

	static final String DFA126_eotS =
		"\11\uffff";
	static final String DFA126_eofS =
		"\11\uffff";
	static final String DFA126_minS =
		"\1\11\1\uffff\1\112\1\103\1\10\1\uffff\1\14\1\103\1\14";
	static final String DFA126_maxS =
		"\1\u009a\1\uffff\1\u009a\1\103\1\u009a\1\uffff\1\u009a\1\103\1\u009a";
	static final String DFA126_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\3\uffff";
	static final String DFA126_specialS =
		"\11\uffff}>";
	static final String[] DFA126_transitionS = {
			"\1\5\2\uffff\1\3\2\uffff\1\5\4\uffff\1\5\12\uffff\1\5\33\uffff\1\5\7"+
			"\uffff\1\4\3\uffff\1\5\2\uffff\2\5\4\uffff\1\5\7\uffff\1\5\1\uffff\1"+
			"\5\5\uffff\1\5\3\uffff\1\5\7\uffff\2\5\1\uffff\1\5\15\uffff\2\5\5\uffff"+
			"\1\5\2\uffff\1\5\2\uffff\1\2\1\1\2\uffff\2\1\1\uffff\3\1\6\uffff\1\5",
			"",
			"\1\5\117\uffff\1\1",
			"\1\6",
			"\1\5\3\uffff\1\7\2\5\1\uffff\4\5\15\uffff\1\5\10\uffff\2\5\2\uffff\3"+
			"\5\4\uffff\1\5\11\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\3\5\4\uffff\2\5\1\uffff\4\5\2\uffff\3\5\11\uffff\2\5\5\uffff"+
			"\1\5\11\uffff\5\5\27\uffff\1\1",
			"",
			"\1\7\43\uffff\1\5\31\uffff\1\5\117\uffff\1\1",
			"\1\10",
			"\1\7\43\uffff\1\5\31\uffff\1\5\117\uffff\1\1"
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
			return "876:3: ( variableDeclarationListInclVariableId -> ^( VARIABLE_DECLARATION_LIST[$init,\"variables\"] variableDeclarationListInclVariableId ) | ( expressionList )? -> ^( EXPRESSION_LIST[$init,\"expressions\"] ( expressionList )? ) )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_EOF_in_prog1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_EOF_in_prog1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog1093 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon1110 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon1114 = new BitSet(new long[]{0x7C481008C0109222L,0x6020B01105010F98L,0x00000000148ECFB0L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon1116 = new BitSet(new long[]{0x7C481008C0109222L,0x6020B01105010F98L,0x00000000148ECFB0L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000208L});
	public static final BitSet FOLLOW_namespaceIdOrEmpty_in_namespaceBracket1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1159 = new BitSet(new long[]{0x7C481008C0109220L,0x6060B01105010F98L,0x00000000148ECFB0L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1161 = new BitSet(new long[]{0x7C481008C0109220L,0x6060B01105010F98L,0x00000000148ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceIdOrEmpty1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1247 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1252 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1319 = new BitSet(new long[]{0x7C481008C0109222L,0x6020B01105010F98L,0x00000000148ECFB0L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1395 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1399 = new BitSet(new long[]{0x0000000200000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1402 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1406 = new BitSet(new long[]{0x0000000200000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useDeclarationWithoutAs_in_useDeclaration1449 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_As_in_useDeclaration1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclarationWithoutAs1471 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_Backslash_in_useDeclarationWithoutAs1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclarationWithoutAs1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_useDeclarationWithoutAs1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclarationWithoutAs1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classModifier_in_classDeclaration1549 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1554 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_Extends_in_classDeclaration1559 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_identifierList_in_classDeclaration1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_Implements_in_classDeclaration1570 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_identifierList_in_classDeclaration1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1580 = new BitSet(new long[]{0x4400000800000020L,0x004D000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1582 = new BitSet(new long[]{0x4400000800000020L,0x004D000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_identifierList1686 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1689 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_identifierList1692 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specialMethods_in_classBody1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000008C800L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1740 = new BitSet(new long[]{0x0000000200000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1745 = new BitSet(new long[]{0x0000000200000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1775 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1777 = new BitSet(new long[]{0x0800000000100000L,0x0000201001000088L,0x0000000000000010L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1792 = new BitSet(new long[]{0x0000000000000000L,0x000D000000000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1795 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1797 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1838 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1845 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1847 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1866 = new BitSet(new long[]{0x4000000000000000L,0x000C000000000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1868 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1882 = new BitSet(new long[]{0x4400000000000000L,0x000D000000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1884 = new BitSet(new long[]{0x4000000000000000L,0x000D000000000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1892 = new BitSet(new long[]{0x4000000000000000L,0x000D000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1894 = new BitSet(new long[]{0x4000000000000000L,0x000D000000000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1908 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_specialMethods1927 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_Function_in_specialMethods1932 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_construct_in_specialMethods1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deconstruct_in_specialMethods1947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_construct1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_formalParameters_in_construct1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_construct1969 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_construct1971 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_construct1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Deconstruct_in_deconstruct2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_deconstruct2007 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_deconstruct2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_deconstruct2012 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_deconstruct2014 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_deconstruct2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
	public static final BitSet FOLLOW_Implements_in_interfaceDeclaration2051 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_identifierList_in_interfaceDeclaration2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration2057 = new BitSet(new long[]{0x4000000800000000L,0x0048000000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration2059 = new BitSet(new long[]{0x4000000800000000L,0x0048000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody2073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody2078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration2089 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration2092 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration2115 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration2117 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody2152 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x00000000080ECC00L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclarationWithoutBody2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutObjectAndResource2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_allTypesWithoutObjectAndResource2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended2267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject2283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject2315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_formalParameters2328 = new BitSet(new long[]{0x0000000010001000L,0x0080000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramList_in_formalParameters2330 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_formalParameters2333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2354 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2357 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2360 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList2367 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2370 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_paramList2373 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_paramList2378 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList2381 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationInclNull2396 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationInclNull2399 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_Null_in_paramDeclarationInclNull2401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cast_in_paramDeclarationWithoutNull2426 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclarationWithoutNull2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclarationWithoutNull2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationWithoutNull_in_paramDeclarationOptional2456 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional2459 = new BitSet(new long[]{0x0800000000100000L,0x0000201001000088L,0x0000000000000010L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional2461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue2505 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue2507 = new BitSet(new long[]{0x3848100080109200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue2542 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue2544 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue2563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue2568 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000080L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue2575 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue2578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction2591 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction2599 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction2642 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction2650 = new BitSet(new long[]{0x0800000080109200L,0x6000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_instruction2653 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_instruction2662 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_instruction2665 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction2673 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expressionList_in_instruction2676 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction2684 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_instruction2687 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_instruction2689 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_instruction2691 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_instruction2711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2728 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2731 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_expressionList2734 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2747 = new BitSet(new long[]{0x00008800000A4100L,0x0000400052000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2749 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assign_in_assignmentOperator2780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PlusEqual_in_assignmentOperator2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MinusEqual_in_assignmentOperator2790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MultiplyEqual_in_assignmentOperator2795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DivideEqual_in_assignmentOperator2800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseAndEqual_in_assignmentOperator2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseOrEqual_in_assignmentOperator2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseXorEqual_in_assignmentOperator2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ModuloEqual_in_assignmentOperator2820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEqual_in_assignmentOperator2825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ShiftLeftEqual_in_assignmentOperator2830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ShiftRightEqual_in_assignmentOperator2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assign_in_assignmentOperator2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_assignmentOperator2843 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_assignmentOperator2844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_postIncrementDecrement2862 = new BitSet(new long[]{0x0000000000000000L,0x0000800004000000L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_postIncrementDecrement2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plusPlusOrMinusMinus_in_preIncrementDecrement2907 = new BitSet(new long[]{0x0000000000001000L,0x2000100000000008L,0x0000000004000080L});
	public static final BitSet FOLLOW_postFixVariableWithoutCallAtTheEnd_in_preIncrementDecrement2909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarationVariants_in_variableDeclaration2936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_variableDeclarationVariants2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationVariants2957 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_variableDeclarationVariants2961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_variableDeclarationVariants2962 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_variableDeclarationVariants2963 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_variableDeclarationVariants2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationVariants2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationVariants2994 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Assign_in_variableDeclarationVariants2997 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_variableDeclarationVariants2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak3034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak3037 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak3040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak3055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak3058 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak3061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak3076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak3079 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak3082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_ternary_in_assignment3095 = new BitSet(new long[]{0x00008800000A4102L,0x0000400052000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment3098 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_ternary_in_assignment3101 = new BitSet(new long[]{0x00008800000A4102L,0x0000400052000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_logicOr_in_ternary3115 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary3118 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_ternary3121 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_ternary3123 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_ternary3126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr3140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr3143 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr3146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd3159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd3162 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd3165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr3179 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr3182 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr3185 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor3198 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor3201 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor3204 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd3217 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd3220 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd3223 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_comparison_in_equality3236 = new BitSet(new long[]{0x0020000000000002L,0x0000000E00000004L});
	public static final BitSet FOLLOW_equalityOperator_in_equality3239 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_comparison_in_equality3242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison3286 = new BitSet(new long[]{0x8000000000000002L,0x0000000000003001L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison3289 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison3292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift3332 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_bitwiseShift3335 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift3342 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation3356 = new BitSet(new long[]{0x0000400000000002L,0x0000200001000000L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation3359 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation3368 = new BitSet(new long[]{0x0000400000000002L,0x0000200001000000L});
	public static final BitSet FOLLOW_logicNot_in_factor3382 = new BitSet(new long[]{0x0000040000000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_set_in_factor3385 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicNot_in_factor3394 = new BitSet(new long[]{0x0000040000000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot3405 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicNot_in_logicNot3408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot3413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf3424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf3427 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x0000000004000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf3431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf3433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt3449 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000008CC00L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_castOrBitwiseNotOrAt3451 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt3453 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt3471 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt3479 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt3482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cloneOrNew_in_castOrBitwiseNotOrAt3488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_cloneOrNew3499 = new BitSet(new long[]{0x0800000080101000L,0x2000B01105000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_cloneOrNew_in_cloneOrNew3502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_cloneOrNew3507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_cloneOrNew3512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableOrMemberOrStaticMember3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_variableOrMemberOrStaticMember3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableOrMemberOrStaticMember3548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SelfColonColon_in_staticAccessOrParent3562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ParentColonColon_in_staticAccessOrParent3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent3584 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent3586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3599 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_newObject3603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject3618 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject3620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_actualParameters3644 = new BitSet(new long[]{0x0800000080109200L,0x2080B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expressionList_in_actualParameters3646 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_actualParameters3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary3674 = new BitSet(new long[]{0x0800000000101000L,0x2000901004000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary3694 = new BitSet(new long[]{0x0800000000101000L,0x2000901004000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary3710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_primary3722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary3727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_postFixCall3742 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_methodCall_in_postFixCall3752 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixCall3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixCall3772 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixCall3794 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_postFixCall3796 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixCall3798 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_call_in_postFixCall3816 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call3870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_call3873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_call3875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callee_in_methodCall3887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_callee3917 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_ObjectOperator_in_callee3919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_callee3925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3935 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_atom3937 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_atom3953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableWithoutCallAtTheEnd3985 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_call_in_postFixVariableWithoutCallAtTheEnd4000 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableWithoutCallAtTheEnd4031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableWithoutCallAtTheEnd4033 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableWithoutCallAtTheEnd4056 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_postFixVariableWithoutCallAtTheEnd4058 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableWithoutCallAtTheEnd4060 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_variableOrMemberOrStaticMember_in_postFixVariableInclCallAtTheEnd4099 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_ObjectOperator_in_postFixVariableInclCallAtTheEnd4114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_postFixVariableInclCallAtTheEnd4116 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_postFixVariableInclCallAtTheEnd4138 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_postFixVariableInclCallAtTheEnd4140 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_postFixVariableInclCallAtTheEnd4142 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_call_in_postFixVariableInclCallAtTheEnd4160 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant4188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_classConstant4190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant4213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom4229 = new BitSet(new long[]{0x0800000000100000L,0x0000001000000088L,0x0000000000000010L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom4249 = new BitSet(new long[]{0x0800000000100000L,0x0000001000000088L,0x0000000000000010L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom4265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array4783 = new BitSet(new long[]{0x0800000080109200L,0x2100B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_arrayContent_in_array4785 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array4788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array4804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array4806 = new BitSet(new long[]{0x0800000080109200L,0x2080B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_arrayContent_in_array4808 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array4811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4832 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_arrayContent4835 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_arrayKeyValue_in_arrayContent4838 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4852 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue4854 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue4875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition4888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition4890 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_ifCondition4892 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition4894 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4899 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition4906 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition4911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition4942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition4944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition4946 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition4948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition4950 = new BitSet(new long[]{0x0000020008000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition4952 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition4955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4979 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_switchContent4982 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_switchContent4985 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_switchContent4991 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionOptional_in_switchContent4994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionMandatory5007 = new BitSet(new long[]{0x3848102088309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionMandatory5010 = new BitSet(new long[]{0x3848102080309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_caseLabel_in_normalCaseInstructionOptional5048 = new BitSet(new long[]{0x3848102088309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_normalCaseInstructionOptional5051 = new BitSet(new long[]{0x3848102080309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory5091 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionMandatory5094 = new BitSet(new long[]{0x3848102088309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionMandatory5096 = new BitSet(new long[]{0x3848102088309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionMandatory5099 = new BitSet(new long[]{0x3848102080309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional5137 = new BitSet(new long[]{0x0000020008000000L});
	public static final BitSet FOLLOW_defaultLabel_in_defaultCaseInstructionOptional5140 = new BitSet(new long[]{0x3848102088309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_caseLabel_in_defaultCaseInstructionOptional5142 = new BitSet(new long[]{0x3848102088309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_defaultCaseInstructionOptional5145 = new BitSet(new long[]{0x3848102080309202L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_Case_in_caseLabel5186 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_caseLabel5189 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel5191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel5203 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel5205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop5219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_forInit_in_forLoop5222 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_forCondition_in_forLoop5224 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop5226 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop5228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forInit5243 = new BitSet(new long[]{0x0800000080109202L,0x2000B01105010C88L,0x00000000040ECC90L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_forInit5250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit5265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forCondition5295 = new BitSet(new long[]{0x0800000080109202L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expressionList_in_forCondition5297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Semicolon_in_forUpdate5323 = new BitSet(new long[]{0x0800000080109200L,0x2080B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate5325 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forUpdate5328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop5351 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_foreachLoop5353 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_As_in_foreachLoop5355 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000008CC00L});
	public static final BitSet FOLLOW_primitiveTypes_in_foreachLoop5360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop5364 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop5366 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000008CC00L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_foreachLoop5372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop5376 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop5378 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop5380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop5420 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_whileLoop5422 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop5424 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop5426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop5448 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop5450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop5452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop5454 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop5456 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop5458 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop5460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch5481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch5485 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch5487 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch5490 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch5492 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_Catch_in_catchBlock5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LeftParanthesis_in_catchBlock5528 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_catchBlock5530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock5532 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_catchBlock5534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_catchBlock5538 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_catchBlock5540 = new BitSet(new long[]{0x3848102080309200L,0x6060B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_catchBlock5543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2354 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_synpred61_TSPHP2357 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_synpred61_TSPHP2360 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Comma_in_synpred62_TSPHP2370 = new BitSet(new long[]{0x0000000010001000L,0x0000000000000008L,0x00000000000ECC00L});
	public static final BitSet FOLLOW_paramDeclarationInclNull_in_synpred62_TSPHP2373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred73_TSPHP2591 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred73_TSPHP2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred74_TSPHP2599 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred74_TSPHP2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred82_TSPHP2642 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred82_TSPHP2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred106_TSPHP3037 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred106_TSPHP3040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred107_TSPHP3058 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred107_TSPHP3061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred108_TSPHP3079 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_assignment_in_synpred108_TSPHP3082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred109_TSPHP3098 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_ternary_in_synpred109_TSPHP3101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred136_TSPHP3449 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000008L,0x000000000008CC00L});
	public static final BitSet FOLLOW_allTypesWithoutObjectAndResource_in_synpred136_TSPHP3451 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred136_TSPHP3453 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105000C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred136_TSPHP3455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixCall_in_synpred149_TSPHP3722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred156_TSPHP3948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixVariableInclCallAtTheEnd_in_synpred157_TSPHP3953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred158_TSPHP3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred159_TSPHP3963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred178_TSPHP4852 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Arrow_in_synpred178_TSPHP4854 = new BitSet(new long[]{0x0800000080109200L,0x2000B01105010C88L,0x0000000004000490L});
	public static final BitSet FOLLOW_expression_in_synpred178_TSPHP4858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred179_TSPHP4906 = new BitSet(new long[]{0x3848102080309200L,0x6020B01105010E98L,0x00000000140ECFB0L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred179_TSPHP4911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchContent_in_synpred180_TSPHP4952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred181_TSPHP4979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred182_TSPHP4982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred184_TSPHP4979 = new BitSet(new long[]{0x0000020008000002L});
	public static final BitSet FOLLOW_defaultCaseInstructionMandatory_in_synpred184_TSPHP4982 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionOptional_in_synpred184_TSPHP4985 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_normalCaseInstructionMandatory_in_synpred185_TSPHP4991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred189_TSPHP5048 = new BitSet(new long[]{0x0000000000000002L});
}
