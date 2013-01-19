// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-19 23:34:22

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "POST_INCREMENT_DECREMENT", "PRE_INCREMENT_DECREMENT", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VARIABLE_DECLARATION", "VariableId", "Void", "While", "Whitespace"
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
	public static final int CAST=20;
	public static final int Case=21;
	public static final int Catch=22;
	public static final int Class=23;
	public static final int Clone=24;
	public static final int Colon=25;
	public static final int Comma=26;
	public static final int Comment=27;
	public static final int Const=28;
	public static final int Continue=29;
	public static final int DECIMAL=30;
	public static final int Default=31;
	public static final int Divide=32;
	public static final int DivideEqual=33;
	public static final int Do=34;
	public static final int Dolar=35;
	public static final int Dot=36;
	public static final int DotEqual=37;
	public static final int DoubleColon=38;
	public static final int EXPONENT=39;
	public static final int Echo=40;
	public static final int Else=41;
	public static final int Equal=42;
	public static final int Exit=43;
	public static final int Extends=44;
	public static final int Final=45;
	public static final int Float=46;
	public static final int For=47;
	public static final int Foreach=48;
	public static final int Function=49;
	public static final int GreaterEqualThan=50;
	public static final int GreaterThan=51;
	public static final int HEXADECIMAL=52;
	public static final int Identical=53;
	public static final int Identifier=54;
	public static final int If=55;
	public static final int Implements=56;
	public static final int Instanceof=57;
	public static final int Int=58;
	public static final int Interface=59;
	public static final int LeftCurlyBrace=60;
	public static final int LeftParanthesis=61;
	public static final int LeftSquareBrace=62;
	public static final int LessEqualThan=63;
	public static final int LessThan=64;
	public static final int LogicAnd=65;
	public static final int LogicAndWeak=66;
	public static final int LogicNot=67;
	public static final int LogicOr=68;
	public static final int LogicOrWeak=69;
	public static final int LogicXorWeak=70;
	public static final int Minus=71;
	public static final int MinusEqual=72;
	public static final int MinusMinus=73;
	public static final int Modulo=74;
	public static final int ModuloEqual=75;
	public static final int Multiply=76;
	public static final int MultiplyEqual=77;
	public static final int Namespace=78;
	public static final int New=79;
	public static final int NotEqual=80;
	public static final int NotEqualAlternative=81;
	public static final int NotIdentical=82;
	public static final int Null=83;
	public static final int OCTAL=84;
	public static final int ObjectOperator=85;
	public static final int POST_INCREMENT_DECREMENT=86;
	public static final int PRE_INCREMENT_DECREMENT=87;
	public static final int Parent=88;
	public static final int Plus=89;
	public static final int PlusEqual=90;
	public static final int PlusPlus=91;
	public static final int Private=92;
	public static final int ProtectParent=93;
	public static final int ProtectSelf=94;
	public static final int ProtectThis=95;
	public static final int Protected=96;
	public static final int Public=97;
	public static final int QuestionMark=98;
	public static final int Return=99;
	public static final int RightCurlyBrace=100;
	public static final int RightParanthesis=101;
	public static final int RightSquareBrace=102;
	public static final int STRING_DOUBLE_QUOTED=103;
	public static final int STRING_SINGLE_QUOTED=104;
	public static final int Self=105;
	public static final int Semicolon=106;
	public static final int ShiftLeft=107;
	public static final int ShiftLeftEqual=108;
	public static final int ShiftRight=109;
	public static final int ShiftRightEqual=110;
	public static final int Static=111;
	public static final int String=112;
	public static final int Switch=113;
	public static final int This=114;
	public static final int Throw=115;
	public static final int Try=116;
	public static final int TypeArray=117;
	public static final int TypeBool=118;
	public static final int TypeBoolean=119;
	public static final int TypeFloat=120;
	public static final int TypeInt=121;
	public static final int TypeObject=122;
	public static final int TypeResource=123;
	public static final int TypeString=124;
	public static final int UMINUS=125;
	public static final int UPLUS=126;
	public static final int Use=127;
	public static final int VARIABLE_DECLARATION=128;
	public static final int VariableId=129;
	public static final int Void=130;
	public static final int While=131;
	public static final int Whitespace=132;

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
		this.state.ruleMemo = new HashMap[312+1];
		 

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:6: ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !)
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:8: ( namespaceSemicolon )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog945);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog948); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: ( namespaceBracket )+ EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog954);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog957); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: withoutNamespace EOF !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog963);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog965); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon979); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon981);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon983); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:33: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:190:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon985);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket998); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket1000);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket1003); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:34: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:193:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket1005);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1008); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: Identifier ( '\\\\' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1104); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier16_tree = 
			(CommonTree)adaptor.create(Identifier16)
			;
			adaptor.addChild(root_0, Identifier16_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1107); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = 
					(CommonTree)adaptor.create(char_literal17)
					;
					adaptor.addChild(root_0, char_literal17_tree);
					}

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1109); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: ( statement )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1122);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1133);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1138);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:213:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1143);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1155); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1157);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1160); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1162);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1166); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1181); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1183);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:221:7: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1193);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:223:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1205); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1207); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1220);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1225);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1230);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:229:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1235);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1257); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1259); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1261);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1264);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1267); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1269);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1272); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1286); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1288);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1297); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1300); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1302); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1313); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1315);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1325);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1330);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1336);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1348); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(CommonTree)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1350);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1352);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1355); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(CommonTree)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1357);
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

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1361); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1371); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(CommonTree)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1374); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(CommonTree)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1376);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:4: 'static'
					{
					string_literal66=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1386); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal66_tree = 
					(CommonTree)adaptor.create(string_literal66)
					;
					adaptor.addChild(root_0, string_literal66_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1389);
			accessor67=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor67.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1391);
			variableDeclarationListInclVariableId68=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId68.getTree());

			char_literal69=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1393); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1400);
					accessorWithoutPrivate70=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate70.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal71=(Token)match(input,Private,FOLLOW_Private_in_accessor1405); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set72=null;

		CommonTree set72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1428);
			variableDeclaration73=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration73.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:24: ( ',' ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:25: ',' ( variableAssignment | VariableId )
					{
					char_literal74=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1431); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal74_tree = 
					(CommonTree)adaptor.create(char_literal74)
					;
					adaptor.addChild(root_0, char_literal74_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1434);
							variableAssignment75=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment75.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:49: VariableId
							{
							VariableId76=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1436); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1453); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal77_tree = 
					(CommonTree)adaptor.create(string_literal77)
					;
					adaptor.addChild(root_0, string_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1455);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:6: 'static' ( 'final' )?
							{
							string_literal79=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1469); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = 
							(CommonTree)adaptor.create(string_literal79)
							;
							adaptor.addChild(root_0, string_literal79_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:15: 'final'
									{
									string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1471); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:6: 'final' ( 'static' )?
							{
							string_literal81=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1479); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal81_tree = 
							(CommonTree)adaptor.create(string_literal81)
							;
							adaptor.addChild(root_0, string_literal81_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:14: 'static'
									{
									string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1481); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1495);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1502);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal85=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1512); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal85_tree = 
			(CommonTree)adaptor.create(string_literal85)
			;
			adaptor.addChild(root_0, string_literal85_tree);
			}

			Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1514); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier86_tree = 
			(CommonTree)adaptor.create(Identifier86)
			;
			adaptor.addChild(root_0, Identifier86_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1516);
					implementsDeclaration87=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration87.getTree());

					}
					break;

			}

			char_literal88=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1519); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = 
			(CommonTree)adaptor.create(char_literal88)
			;
			adaptor.addChild(root_0, char_literal88_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1521);
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

			char_literal90=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1524); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList91 =null;
		ParserRuleReturnScope interfaceMethodDeclaration92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1533);
					constDeclarationList91=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList91.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:288:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1538);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:4: 'public'
					{
					string_literal93=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1549); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = 
					(CommonTree)adaptor.create(string_literal93)
					;
					adaptor.addChild(root_0, string_literal93_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1552);
			functionDeclarationWithoutBody94=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody94.getTree());

			char_literal95=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1554); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1570);
			functionDeclarationWithoutBody96=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody96.getTree());

			char_literal97=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1572); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = 
			(CommonTree)adaptor.create(char_literal97)
			;
			adaptor.addChild(root_0, char_literal97_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:40: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==Parent||LA35_0==PlusPlus||LA35_0==Return||LA35_0==Self||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1574);
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

			char_literal99=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1577); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal100=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1587); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal100_tree = 
			(CommonTree)adaptor.create(string_literal100)
			;
			adaptor.addChild(root_0, string_literal100_tree);
			}

			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1589);
			returnType101=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType101.getTree());

			Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1591); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier102_tree = 
			(CommonTree)adaptor.create(Identifier102)
			;
			adaptor.addChild(root_0, Identifier102_tree);
			}

			char_literal103=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1593); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal103_tree = 
			(CommonTree)adaptor.create(char_literal103)
			;
			adaptor.addChild(root_0, char_literal103_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:41: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1595);
					paramList104=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList104.getTree());

					}
					break;

			}

			char_literal105=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1598); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:1: returnType : ( allTypes | 'void' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1608);
					allTypes106=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal107=(Token)match(input,Void,FOLLOW_Void_in_returnType1612); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended108 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:11: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1619);
					primitiveTypesExtended108=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:36: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1623);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:1: allTypesWithoutResource : ( primitiveTypesInclArray | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypesWithoutResource_return allTypesWithoutResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutResource_return retval = new TSPHPParser.allTypesWithoutResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray110 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject111 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:2: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1632);
					primitiveTypesInclArray110=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray110.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:5: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1638);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:1: primitiveTypes : ( TypeBool | TypeBoolean -> TypeBool | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeBool112=null;
		Token TypeBoolean113=null;
		Token TypeInt114=null;
		Token TypeFloat115=null;
		Token TypeString116=null;

		CommonTree TypeBool112_tree=null;
		CommonTree TypeBoolean113_tree=null;
		CommonTree TypeInt114_tree=null;
		CommonTree TypeFloat115_tree=null;
		CommonTree TypeString116_tree=null;
		RewriteRuleTokenStream stream_TypeBoolean=new RewriteRuleTokenStream(adaptor,"token TypeBoolean");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:2: ( TypeBool | TypeBoolean -> TypeBool | TypeInt | TypeFloat | TypeString )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:315:4: TypeBool
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeBool112=(Token)match(input,TypeBool,FOLLOW_TypeBool_in_primitiveTypes1649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeBool112_tree = 
					(CommonTree)adaptor.create(TypeBool112)
					;
					adaptor.addChild(root_0, TypeBool112_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:4: TypeBoolean
					{
					TypeBoolean113=(Token)match(input,TypeBoolean,FOLLOW_TypeBoolean_in_primitiveTypes1654); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TypeBoolean.add(TypeBoolean113);

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
					// 316:16: -> TypeBool
					{
						adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(TypeBool, "TypeBool")
						);

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: TypeInt
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeInt114=(Token)match(input,TypeInt,FOLLOW_TypeInt_in_primitiveTypes1663); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeInt114_tree = 
					(CommonTree)adaptor.create(TypeInt114)
					;
					adaptor.addChild(root_0, TypeInt114_tree);
					}

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: TypeFloat
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeFloat115=(Token)match(input,TypeFloat,FOLLOW_TypeFloat_in_primitiveTypes1668); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeFloat115_tree = 
					(CommonTree)adaptor.create(TypeFloat115)
					;
					adaptor.addChild(root_0, TypeFloat115_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:4: TypeString
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeString116=(Token)match(input,TypeString,FOLLOW_TypeString_in_primitiveTypes1673); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeString116_tree = 
					(CommonTree)adaptor.create(TypeString116)
					;
					adaptor.addChild(root_0, TypeString116_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray118=null;
		ParserRuleReturnScope primitiveTypes117 =null;

		CommonTree TypeArray118_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1685);
					primitiveTypes117=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes117.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:324:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray118=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1690); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray118_tree = 
					(CommonTree)adaptor.create(TypeArray118)
					;
					adaptor.addChild(root_0, TypeArray118_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource120=null;
		ParserRuleReturnScope primitiveTypesInclArray119 =null;

		CommonTree TypeResource120_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1702);
					primitiveTypesInclArray119=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray119.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource120=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource120_tree = 
					(CommonTree)adaptor.create(TypeResource120)
					;
					adaptor.addChild(root_0, TypeResource120_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope namespaceId122 =null;

		CommonTree char_literal121_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: ( '\\\\' )? namespaceId
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: ( '\\\\' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Backslash) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: '\\\\'
					{
					char_literal121=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal121_tree = 
					(CommonTree)adaptor.create(char_literal121)
					;
					adaptor.addChild(root_0, char_literal121_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1724);
			namespaceId122=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId122.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject123=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject124 =null;

		CommonTree TypeObject123_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject123=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject123_tree = 
					(CommonTree)adaptor.create(TypeObject123)
					;
					adaptor.addChild(root_0, TypeObject123_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:339:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1743);
					classInterfaceTypeWithoutObject124=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject124.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal126=null;
		Token char_literal129=null;
		Token char_literal133=null;
		Token char_literal134=null;
		ParserRuleReturnScope paramDeclarationOptional125 =null;
		ParserRuleReturnScope paramDeclarationOptional127 =null;
		ParserRuleReturnScope paramDeclaration128 =null;
		ParserRuleReturnScope paramDeclaration130 =null;
		ParserRuleReturnScope paramDeclaration131 =null;
		ParserRuleReturnScope paramDeclaration132 =null;
		ParserRuleReturnScope paramDeclarationOptional135 =null;

		CommonTree char_literal126_tree=null;
		CommonTree char_literal129_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree char_literal134_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt49=3;
			alt49 = dfa49.predict(input);
			switch (alt49) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1755);
					paramDeclarationOptional125=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional125.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:29: ( ',' paramDeclarationOptional )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:30: ',' paramDeclarationOptional
							{
							char_literal126=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1758); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal126_tree = 
							(CommonTree)adaptor.create(char_literal126)
							;
							adaptor.addChild(root_0, char_literal126_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1760);
							paramDeclarationOptional127=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional127.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: paramDeclaration ( ',' paramDeclaration )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1767);
					paramDeclaration128=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration128.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:21: ( ',' paramDeclaration )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Comma) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:22: ',' paramDeclaration
							{
							char_literal129=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1770); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal129_tree = 
							(CommonTree)adaptor.create(char_literal129)
							;
							adaptor.addChild(root_0, char_literal129_tree);
							}

							pushFollow(FOLLOW_paramDeclaration_in_paramList1772);
							paramDeclaration130=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration130.getTree());

							}
							break;

						default :
							break loop46;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1779);
					paramDeclaration131=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration131.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:21: ( paramDeclaration ',' )*
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Backslash||LA47_0==Identifier||(LA47_0 >= TypeArray && LA47_0 <= TypeString)) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1782);
							paramDeclaration132=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration132.getTree());

							char_literal133=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1784); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal133_tree = 
							(CommonTree)adaptor.create(char_literal133)
							;
							adaptor.addChild(root_0, char_literal133_tree);
							}

							}
							break;

						default :
							break loop47;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:45: ( ',' paramDeclarationOptional )+
					int cnt48=0;
					loop48:
					do {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Comma) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:345:46: ',' paramDeclarationOptional
							{
							char_literal134=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1789); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal134_tree = 
							(CommonTree)adaptor.create(char_literal134)
							;
							adaptor.addChild(root_0, char_literal134_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1791);
							paramDeclarationOptional135=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional135.getTree());

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

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:1: paramDeclaration : allTypes VariableId ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId137=null;
		ParserRuleReturnScope allTypes136 =null;

		CommonTree VariableId137_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:349:4: allTypes VariableId
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_paramDeclaration1805);
			allTypes136=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes136.getTree());

			VariableId137=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId137_tree = 
			(CommonTree)adaptor.create(VariableId137)
			;
			adaptor.addChild(root_0, VariableId137_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal139=null;
		ParserRuleReturnScope paramDeclaration138 =null;
		ParserRuleReturnScope unaryPrimitiveAtom140 =null;

		CommonTree char_literal139_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1817);
			paramDeclaration138=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration138.getTree());

			char_literal139=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal139_tree = 
			(CommonTree)adaptor.create(char_literal139)
			;
			adaptor.addChild(root_0, char_literal139_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1822);
			unaryPrimitiveAtom140=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom140.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal141=null;
		Token char_literal143=null;
		ParserRuleReturnScope instructionWithoutBreakContinue142 =null;
		ParserRuleReturnScope instruction144 =null;

		CommonTree char_literal141_tree=null;
		CommonTree char_literal143_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LeftCurlyBrace) ) {
				alt51=1;
			}
			else if ( (LA51_0==Backslash||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==MinusMinus||LA51_0==Parent||LA51_0==PlusPlus||LA51_0==Return||LA51_0==Self||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal141=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1844); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal141_tree = 
					(CommonTree)adaptor.create(char_literal141)
					;
					adaptor.addChild(root_0, char_literal141_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:8: ( instructionWithoutBreakContinue )+
					int cnt50=0;
					loop50:
					do {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==Backslash||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==LeftCurlyBrace||LA50_0==MinusMinus||LA50_0==Parent||LA50_0==PlusPlus||LA50_0==Return||LA50_0==Self||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1846);
							instructionWithoutBreakContinue142=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue142.getTree());

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

					char_literal143=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1850); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal143_tree = 
					(CommonTree)adaptor.create(char_literal143)
					;
					adaptor.addChild(root_0, char_literal143_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1855);
					instruction144=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction144.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal145=null;
		Token char_literal147=null;
		Token set149=null;
		Token Int150=null;
		Token char_literal151=null;
		ParserRuleReturnScope instructionInclBreakContinue146 =null;
		ParserRuleReturnScope instruction148 =null;

		CommonTree char_literal145_tree=null;
		CommonTree char_literal147_tree=null;
		CommonTree set149_tree=null;
		CommonTree Int150_tree=null;
		CommonTree char_literal151_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
			int alt54=3;
			switch ( input.LA(1) ) {
			case LeftCurlyBrace:
				{
				alt54=1;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal145=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1866); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal145_tree = 
					(CommonTree)adaptor.create(char_literal145)
					;
					adaptor.addChild(root_0, char_literal145_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:8: ( instructionInclBreakContinue )+
					int cnt52=0;
					loop52:
					do {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==Backslash||LA52_0==Break||LA52_0==Continue||LA52_0==Do||LA52_0==Echo||LA52_0==Exit||(LA52_0 >= For && LA52_0 <= Foreach)||(LA52_0 >= Identifier && LA52_0 <= If)||LA52_0==LeftCurlyBrace||LA52_0==MinusMinus||LA52_0==Parent||LA52_0==PlusPlus||LA52_0==Return||LA52_0==Self||(LA52_0 >= Switch && LA52_0 <= TypeString)||LA52_0==VariableId||LA52_0==While) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1868);
							instructionInclBreakContinue146=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue146.getTree());

							}
							break;

						default :
							if ( cnt52 >= 1 ) break loop52;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(52, input);
								throw eee;
						}
						cnt52++;
					} while (true);

					char_literal147=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1872); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal147_tree = 
					(CommonTree)adaptor.create(char_literal147)
					;
					adaptor.addChild(root_0, char_literal147_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1877);
					instruction148=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction148.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: ( 'break' | 'continue' ) ( Int )? ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					set149=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(set149)
						);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:25: ( Int )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==Int) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:25: Int
							{
							Int150=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1888); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int150_tree = 
							(CommonTree)adaptor.create(Int150)
							;
							adaptor.addChild(root_0, Int150_tree);
							}

							}
							break;

					}

					char_literal151=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1891); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal151_tree = 
					(CommonTree)adaptor.create(char_literal151)
					;
					adaptor.addChild(root_0, char_literal151_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:1: instruction : ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' !| methodCallFluentWithoutAccessAtTheEnd ';' !| 'return' ( expression )? ';' !| 'echo' expressionList ';' !| 'exit' ';' !);
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal153=null;
		Token char_literal155=null;
		Token char_literal165=null;
		Token char_literal167=null;
		Token string_literal168=null;
		Token char_literal170=null;
		Token string_literal171=null;
		Token char_literal173=null;
		Token string_literal174=null;
		Token char_literal175=null;
		ParserRuleReturnScope variableAssignment152 =null;
		ParserRuleReturnScope variableDeclaration154 =null;
		ParserRuleReturnScope ifCondition156 =null;
		ParserRuleReturnScope switchCondition157 =null;
		ParserRuleReturnScope forLoop158 =null;
		ParserRuleReturnScope foreachLoop159 =null;
		ParserRuleReturnScope whileLoop160 =null;
		ParserRuleReturnScope doWhileLoop161 =null;
		ParserRuleReturnScope tryCatch162 =null;
		ParserRuleReturnScope throwException163 =null;
		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd164 =null;
		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd166 =null;
		ParserRuleReturnScope expression169 =null;
		ParserRuleReturnScope expressionList172 =null;

		CommonTree char_literal153_tree=null;
		CommonTree char_literal155_tree=null;
		CommonTree char_literal165_tree=null;
		CommonTree char_literal167_tree=null;
		CommonTree string_literal168_tree=null;
		CommonTree char_literal170_tree=null;
		CommonTree string_literal171_tree=null;
		CommonTree char_literal173_tree=null;
		CommonTree string_literal174_tree=null;
		CommonTree char_literal175_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:2: ( variableAssignment ';' !| variableDeclaration ';' !| ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' !| methodCallFluentWithoutAccessAtTheEnd ';' !| 'return' ( expression )? ';' !| 'echo' expressionList ';' !| 'exit' ';' !)
			int alt56=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA56_1 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
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
			case Self:
				{
				int LA56_2 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA56_3 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
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
				int LA56_4 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred70_TSPHP()) ) {
					alt56=2;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt56=11;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA56_5 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred70_TSPHP()) ) {
					alt56=2;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt56=11;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA56_6 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt56=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt56=12;
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
			case MinusMinus:
			case PlusPlus:
				{
				alt56=1;
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
				alt56=2;
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
			case Return:
				{
				alt56=13;
				}
				break;
			case Echo:
				{
				alt56=14;
				}
				break;
			case Exit:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: variableAssignment ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction1903);
					variableAssignment152=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment152.getTree());

					char_literal153=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1905); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction1911);
					variableDeclaration154=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration154.getTree());

					char_literal155=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1913); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction1919);
					ifCondition156=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition156.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction1924);
					switchCondition157=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition157.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction1929);
					forLoop158=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop158.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction1934);
					foreachLoop159=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop159.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction1939);
					whileLoop160=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop160.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction1944);
					doWhileLoop161=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop161.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction1949);
					tryCatch162=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch162.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction1954);
					throwException163=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException163.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: functionCallFluentWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1959);
					functionCallFluentWithoutAccessAtTheEnd164=functionCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd164.getTree());

					char_literal165=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1961); if (state.failed) return retval;
					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: methodCallFluentWithoutAccessAtTheEnd ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1967);
					methodCallFluentWithoutAccessAtTheEnd166=methodCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd166.getTree());

					char_literal167=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1969); if (state.failed) return retval;
					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: 'return' ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal168=(Token)match(input,Return,FOLLOW_Return_in_instruction1976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal168_tree = 
					(CommonTree)adaptor.create(string_literal168)
					;
					adaptor.addChild(root_0, string_literal168_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:13: ( expression )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==At||LA55_0==Backslash||LA55_0==BitwiseNot||LA55_0==Bool||LA55_0==Clone||LA55_0==Float||LA55_0==Identifier||LA55_0==Int||(LA55_0 >= LeftParanthesis && LA55_0 <= LeftSquareBrace)||LA55_0==LogicNot||LA55_0==Minus||LA55_0==MinusMinus||LA55_0==New||LA55_0==Null||(LA55_0 >= Parent && LA55_0 <= Plus)||LA55_0==PlusPlus||LA55_0==Self||LA55_0==String||LA55_0==This||LA55_0==TypeArray||LA55_0==VariableId) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1978);
							expression169=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

							}
							break;

					}

					char_literal170=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1981); if (state.failed) return retval;
					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:4: 'echo' expressionList ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal171=(Token)match(input,Echo,FOLLOW_Echo_in_instruction1987); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal171_tree = 
					(CommonTree)adaptor.create(string_literal171)
					;
					adaptor.addChild(root_0, string_literal171_tree);
					}

					pushFollow(FOLLOW_expressionList_in_instruction1989);
					expressionList172=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList172.getTree());

					char_literal173=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1991); if (state.failed) return retval;
					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:4: 'exit' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal174=(Token)match(input,Exit,FOLLOW_Exit_in_instruction1997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal174_tree = 
					(CommonTree)adaptor.create(string_literal174)
					;
					adaptor.addChild(root_0, string_literal174_tree);
					}

					char_literal175=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1999); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:1: expressionList : expression ( ',' ! expression )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList2012);
			expression176=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression176.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:15: ( ',' ! expression )*
			loop57:
			do {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==Comma) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:16: ',' ! expression
					{
					char_literal177=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList2015); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2018);
					expression178=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:1: variableAssignment : ( VariableId assignmentOperator expression | incrementDecrement );
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId179=null;
		ParserRuleReturnScope assignmentOperator180 =null;
		ParserRuleReturnScope expression181 =null;
		ParserRuleReturnScope incrementDecrement182 =null;

		CommonTree VariableId179_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:2: ( VariableId assignmentOperator expression | incrementDecrement )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==VariableId) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==Assign||LA58_1==BitwiseAndEqual||LA58_1==BitwiseOrEqual||LA58_1==BitwiseXorEqual||LA58_1==DivideEqual||LA58_1==DotEqual||LA58_1==MinusEqual||LA58_1==ModuloEqual||LA58_1==MultiplyEqual||LA58_1==PlusEqual||LA58_1==ShiftLeftEqual||LA58_1==ShiftRightEqual) ) {
					alt58=1;
				}
				else if ( (LA58_1==LeftSquareBrace||LA58_1==MinusMinus||LA58_1==ObjectOperator||LA58_1==PlusPlus) ) {
					alt58=2;
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
			else if ( (LA58_0==Backslash||LA58_0==Identifier||LA58_0==MinusMinus||LA58_0==Parent||LA58_0==PlusPlus||LA58_0==Self||LA58_0==This) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:4: VariableId assignmentOperator expression
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId179=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2029); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId179_tree = 
					(CommonTree)adaptor.create(VariableId179)
					;
					adaptor.addChild(root_0, VariableId179_tree);
					}

					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2031);
					assignmentOperator180=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator180.getTree());

					pushFollow(FOLLOW_expression_in_variableAssignment2033);
					expression181=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_variableAssignment2038);
					incrementDecrement182=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement182.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement183 =null;
		ParserRuleReturnScope preIncrementDecrement184 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Backslash||LA59_0==Identifier||LA59_0==Parent||LA59_0==Self||LA59_0==This||LA59_0==VariableId) ) {
				alt59=1;
			}
			else if ( (LA59_0==MinusMinus||LA59_0==PlusPlus) ) {
				alt59=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2050);
					postIncrementDecrement183=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement183.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:396:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2055);
					preIncrementDecrement184=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement184.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set185=null;

		CommonTree set185_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set185=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set185)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:1: postIncrementDecrement : variableMemberStaticMember ( '++' | '--' ) -> ^( POST_INCREMENT_DECREMENT[$variableMemberStaticMember.start, \"post increment/decrement\"] variableMemberStaticMember ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal187=null;
		Token string_literal188=null;
		ParserRuleReturnScope variableMemberStaticMember186 =null;

		CommonTree string_literal187_tree=null;
		CommonTree string_literal188_tree=null;
		RewriteRuleTokenStream stream_MinusMinus=new RewriteRuleTokenStream(adaptor,"token MinusMinus");
		RewriteRuleTokenStream stream_PlusPlus=new RewriteRuleTokenStream(adaptor,"token PlusPlus");
		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:2: ( variableMemberStaticMember ( '++' | '--' ) -> ^( POST_INCREMENT_DECREMENT[$variableMemberStaticMember.start, \"post increment/decrement\"] variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:4: variableMemberStaticMember ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2133);
			variableMemberStaticMember186=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember186.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:31: ( '++' | '--' )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==PlusPlus) ) {
				alt60=1;
			}
			else if ( (LA60_0==MinusMinus) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:32: '++'
					{
					string_literal187=(Token)match(input,PlusPlus,FOLLOW_PlusPlus_in_postIncrementDecrement2136); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PlusPlus.add(string_literal187);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:37: '--'
					{
					string_literal188=(Token)match(input,MinusMinus,FOLLOW_MinusMinus_in_postIncrementDecrement2138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MinusMinus.add(string_literal188);

					}
					break;

			}

			// AST REWRITE
			// elements: variableMemberStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 415:43: -> ^( POST_INCREMENT_DECREMENT[$variableMemberStaticMember.start, \"post increment/decrement\"] variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:415:46: ^( POST_INCREMENT_DECREMENT[$variableMemberStaticMember.start, \"post increment/decrement\"] variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT_DECREMENT, (variableMemberStaticMember186!=null?((Token)variableMemberStaticMember186.start):null), "post increment/decrement")
				, root_1);

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


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:1: preIncrementDecrement : pre= ( '++' | '--' ) variableMemberStaticMember -> ^( PRE_INCREMENT_DECREMENT[$pre, \"pre increment/decrement\"] variableMemberStaticMember ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token pre=null;
		Token string_literal189=null;
		Token string_literal190=null;
		ParserRuleReturnScope variableMemberStaticMember191 =null;

		CommonTree pre_tree=null;
		CommonTree string_literal189_tree=null;
		CommonTree string_literal190_tree=null;
		RewriteRuleTokenStream stream_MinusMinus=new RewriteRuleTokenStream(adaptor,"token MinusMinus");
		RewriteRuleTokenStream stream_PlusPlus=new RewriteRuleTokenStream(adaptor,"token PlusPlus");
		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:2: (pre= ( '++' | '--' ) variableMemberStaticMember -> ^( PRE_INCREMENT_DECREMENT[$pre, \"pre increment/decrement\"] variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:4: pre= ( '++' | '--' ) variableMemberStaticMember
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:10: ( '++' | '--' )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==PlusPlus) ) {
				alt61=1;
			}
			else if ( (LA61_0==MinusMinus) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:11: '++'
					{
					string_literal189=(Token)match(input,PlusPlus,FOLLOW_PlusPlus_in_preIncrementDecrement2165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PlusPlus.add(string_literal189);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:16: '--'
					{
					string_literal190=(Token)match(input,MinusMinus,FOLLOW_MinusMinus_in_preIncrementDecrement2167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MinusMinus.add(string_literal190);

					}
					break;

			}

			pushFollow(FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2170);
			variableMemberStaticMember191=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember191.getTree());
			// AST REWRITE
			// elements: variableMemberStaticMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 419:49: -> ^( PRE_INCREMENT_DECREMENT[$pre, \"pre increment/decrement\"] variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:52: ^( PRE_INCREMENT_DECREMENT[$pre, \"pre increment/decrement\"] variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT_DECREMENT, pre, "pre increment/decrement")
				, root_1);

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
			if ( state.backtracking>0 ) { memoize(input, 46, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:1: variableDeclaration : allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId193=null;
		Token char_literal194=null;
		ParserRuleReturnScope allTypes192 =null;
		ParserRuleReturnScope expression195 =null;

		CommonTree VariableId193_tree=null;
		CommonTree char_literal194_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_VariableId=new RewriteRuleTokenStream(adaptor,"token VariableId");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_allTypes=new RewriteRuleSubtreeStream(adaptor,"rule allTypes");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:2: ( allTypes VariableId ( '=' expression )? -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:5: allTypes VariableId ( '=' expression )?
			{
			pushFollow(FOLLOW_allTypes_in_variableDeclaration2194);
			allTypes192=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_allTypes.add(allTypes192.getTree());
			VariableId193=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2196); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VariableId.add(VariableId193);

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:25: ( '=' expression )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==Assign) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:26: '=' expression
					{
					char_literal194=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Assign.add(char_literal194);

					pushFollow(FOLLOW_expression_in_variableDeclaration2201);
					expression195=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression195.getTree());
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
			// 424:43: -> ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:46: ^( VARIABLE_DECLARATION[$allTypes.start,\"variable declaration\"] allTypes VariableId ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(VARIABLE_DECLARATION, (allTypes192!=null?((Token)allTypes192.start):null), "variable declaration")
				, root_1);

				adaptor.addChild(root_1, stream_allTypes.nextTree());

				adaptor.addChild(root_1, 
				stream_VariableId.nextNode()
				);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:424:129: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 47, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak196 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:427:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2227);
			logicOrWeak196=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak196.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionForTest_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionForTest"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:1: expressionForTest : expression ';' !;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal198=null;
		ParserRuleReturnScope expression197 =null;

		CommonTree char_literal198_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:2: ( expression ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:430:4: expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2236);
			expression197=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression197.getTree());

			char_literal198=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2238); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, expressionForTest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionForTest"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal200=null;
		ParserRuleReturnScope logicXorWeak199 =null;
		ParserRuleReturnScope logicXorWeak201 =null;

		CommonTree string_literal200_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2248);
			logicXorWeak199=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak199.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:17: ( 'or' ^ logicXorWeak )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==LogicOrWeak) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:18: 'or' ^ logicXorWeak
					{
					string_literal200=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2251); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal200_tree = 
					(CommonTree)adaptor.create(string_literal200)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal200_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2254);
					logicXorWeak201=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak201.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 50, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal203=null;
		ParserRuleReturnScope logicAndWeak202 =null;
		ParserRuleReturnScope logicAndWeak204 =null;

		CommonTree string_literal203_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2267);
			logicAndWeak202=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak202.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:17: ( 'xor' ^ logicAndWeak )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicXorWeak) ) {
					int LA64_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt64=1;
					}

				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:18: 'xor' ^ logicAndWeak
					{
					string_literal203=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2270); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal203_tree = 
					(CommonTree)adaptor.create(string_literal203)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal203_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2273);
					logicAndWeak204=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak204.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 51, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal206=null;
		ParserRuleReturnScope assignment205 =null;
		ParserRuleReturnScope assignment207 =null;

		CommonTree string_literal206_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2286);
			assignment205=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment205.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:15: ( 'and' ^ assignment )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicAndWeak) ) {
					int LA65_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt65=1;
					}

				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:16: 'and' ^ assignment
					{
					string_literal206=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal206_tree = 
					(CommonTree)adaptor.create(string_literal206)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal206_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2292);
					assignment207=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment207.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 52, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary208 =null;
		ParserRuleReturnScope assignmentOperator209 =null;
		ParserRuleReturnScope ternary210 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2303);
			ternary208=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary208.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:12: ( assignmentOperator ^ ternary )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==Assign||LA66_0==BitwiseAndEqual||LA66_0==BitwiseOrEqual||LA66_0==BitwiseXorEqual||LA66_0==DivideEqual||LA66_0==DotEqual||LA66_0==MinusEqual||LA66_0==ModuloEqual||LA66_0==MultiplyEqual||LA66_0==PlusEqual||LA66_0==ShiftLeftEqual||LA66_0==ShiftRightEqual) ) {
					int LA66_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt66=1;
					}

				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2306);
					assignmentOperator209=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator209.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2309);
					ternary210=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary210.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 53, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal212=null;
		Token char_literal214=null;
		ParserRuleReturnScope logicOr211 =null;
		ParserRuleReturnScope expression213 =null;
		ParserRuleReturnScope expression215 =null;

		CommonTree char_literal212_tree=null;
		CommonTree char_literal214_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2319);
			logicOr211=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr211.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:19: ( '?' ^ expression ':' ! expression )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==QuestionMark) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:20: '?' ^ expression ':' ! expression
					{
					char_literal212=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2322); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal212_tree = 
					(CommonTree)adaptor.create(char_literal212)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2325);
					expression213=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());

					char_literal214=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2327); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2330);
					expression215=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression215.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 54, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal217=null;
		ParserRuleReturnScope logicAnd216 =null;
		ParserRuleReturnScope logicAnd218 =null;

		CommonTree string_literal217_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2340);
			logicAnd216=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd216.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:20: ( '||' ^ logicAnd )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==LogicOr) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:21: '||' ^ logicAnd
					{
					string_literal217=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal217_tree = 
					(CommonTree)adaptor.create(string_literal217)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal217_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2346);
					logicAnd218=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd218.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 55, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal220=null;
		ParserRuleReturnScope bitwiseOr219 =null;
		ParserRuleReturnScope bitwiseOr221 =null;

		CommonTree string_literal220_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2355);
			bitwiseOr219=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr219.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:21: ( '&&' ^ bitwiseOr )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==LogicAnd) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:22: '&&' ^ bitwiseOr
					{
					string_literal220=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2358); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal220_tree = 
					(CommonTree)adaptor.create(string_literal220)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal220_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2361);
					bitwiseOr221=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr221.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 56, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal223=null;
		ParserRuleReturnScope bitwiseXor222 =null;
		ParserRuleReturnScope bitwiseXor224 =null;

		CommonTree char_literal223_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2372);
			bitwiseXor222=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor222.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:15: ( '|' ^ bitwiseXor )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==BitwiseOr) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:451:16: '|' ^ bitwiseXor
					{
					char_literal223=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2375); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal223_tree = 
					(CommonTree)adaptor.create(char_literal223)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal223_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2378);
					bitwiseXor224=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor224.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 57, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal226=null;
		ParserRuleReturnScope bitwiseAnd225 =null;
		ParserRuleReturnScope bitwiseAnd227 =null;

		CommonTree char_literal226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2389);
			bitwiseAnd225=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd225.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:15: ( '^' ^ bitwiseAnd )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==BitwiseXor) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:454:16: '^' ^ bitwiseAnd
					{
					char_literal226=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2392); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal226_tree = 
					(CommonTree)adaptor.create(char_literal226)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal226_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2395);
					bitwiseAnd227=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd227.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 58, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal229=null;
		ParserRuleReturnScope equality228 =null;
		ParserRuleReturnScope equality230 =null;

		CommonTree char_literal229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2406);
			equality228=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality228.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:13: ( '&' ^ equality )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==BitwiseAnd) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:14: '&' ^ equality
					{
					char_literal229=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2409); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal229_tree = 
					(CommonTree)adaptor.create(char_literal229)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal229_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2412);
					equality230=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality230.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 59, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison231 =null;
		ParserRuleReturnScope equalityOperator232 =null;
		ParserRuleReturnScope comparison233 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2421);
			comparison231=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison231.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:22: ( equalityOperator ^ comparison )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==Equal||LA73_0==Identical||(LA73_0 >= NotEqual && LA73_0 <= NotIdentical)) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2424);
					equalityOperator232=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator232.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2427);
					comparison233=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison233.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 60, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set234=null;

		CommonTree set234_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:462:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set234=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set234)
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
			if ( state.backtracking>0 ) { memoize(input, 61, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift235 =null;
		ParserRuleReturnScope comparisonOperator236 =null;
		ParserRuleReturnScope bitwiseShift237 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2469);
			bitwiseShift235=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift235.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:17: ( comparisonOperator ^ bitwiseShift )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( ((LA74_0 >= GreaterEqualThan && LA74_0 <= GreaterThan)||(LA74_0 >= LessEqualThan && LA74_0 <= LessThan)) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2472);
					comparisonOperator236=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator236.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2475);
					bitwiseShift237=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift237.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 62, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set238=null;

		CommonTree set238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set238=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set238)
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
			if ( state.backtracking>0 ) { memoize(input, 63, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set240=null;
		ParserRuleReturnScope termOrStringConcatenation239 =null;
		ParserRuleReturnScope termOrStringConcatenation241 =null;

		CommonTree set240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2511);
			termOrStringConcatenation239=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation239.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==ShiftLeft||LA75_0==ShiftRight) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:479:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set240=(Token)input.LT(1);
					set240=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
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
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2521);
					termOrStringConcatenation241=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation241.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 64, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set243=null;
		ParserRuleReturnScope factor242 =null;
		ParserRuleReturnScope factor244 =null;

		CommonTree set243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2531);
			factor242=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor242.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop76:
			do {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==Dot||LA76_0==Minus||LA76_0==Plus) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:37: ( '+' | '-' | '.' ) ^ factor
					{
					set243=(Token)input.LT(1);
					set243=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
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
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2543);
					factor244=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor244.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 65, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set246=null;
		ParserRuleReturnScope logicNot245 =null;
		ParserRuleReturnScope logicNot247 =null;

		CommonTree set246_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2553);
			logicNot245=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot245.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop77:
			do {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==Divide||LA77_0==Modulo||LA77_0==Multiply) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set246=(Token)input.LT(1);
					set246=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set246)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2565);
					logicNot247=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot247.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 66, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal248=null;
		ParserRuleReturnScope logicNot249 =null;
		ParserRuleReturnScope instanceOf250 =null;

		CommonTree char_literal248_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:9: ( '!' ^ logicNot | instanceOf )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==LogicNot) ) {
				alt78=1;
			}
			else if ( (LA78_0==At||LA78_0==Backslash||LA78_0==BitwiseNot||LA78_0==Bool||LA78_0==Clone||LA78_0==Float||LA78_0==Identifier||LA78_0==Int||(LA78_0 >= LeftParanthesis && LA78_0 <= LeftSquareBrace)||LA78_0==Minus||LA78_0==MinusMinus||LA78_0==New||LA78_0==Null||(LA78_0 >= Parent && LA78_0 <= Plus)||LA78_0==PlusPlus||LA78_0==Self||LA78_0==String||LA78_0==This||LA78_0==TypeArray||LA78_0==VariableId) ) {
				alt78=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal248=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2574); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal248_tree = 
					(CommonTree)adaptor.create(char_literal248)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal248_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2577);
					logicNot249=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot249.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:486:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2582);
					instanceOf250=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf250.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal252=null;
		Token VariableId254=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt251 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject253 =null;

		CommonTree string_literal252_tree=null;
		CommonTree VariableId254_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2594);
			castOrBitwiseNotOrAt251=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt251.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==Instanceof) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal252=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2597); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal252_tree = 
					(CommonTree)adaptor.create(string_literal252)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal252_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==Backslash||LA79_0==Identifier) ) {
						alt79=1;
					}
					else if ( (LA79_0==VariableId) ) {
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2601);
							classInterfaceTypeWithoutObject253=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject253.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:491:73: VariableId
							{
							VariableId254=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2603); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId254_tree = 
							(CommonTree)adaptor.create(VariableId254)
							;
							adaptor.addChild(root_0, VariableId254_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 68, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal256=null;
		Token char_literal258=null;
		Token char_literal260=null;
		ParserRuleReturnScope allTypesWithoutResource255 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt257 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt259 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt261 =null;
		ParserRuleReturnScope newOrClone262 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal256_tree=null;
		CommonTree char_literal258_tree=null;
		CommonTree char_literal260_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");
		RewriteRuleSubtreeStream stream_allTypesWithoutResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutResource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:2: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone )
			int alt81=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA81_1 = input.LA(2);
				if ( (synpred131_TSPHP()) ) {
					alt81=1;
				}
				else if ( (true) ) {
					alt81=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt81=2;
				}
				break;
			case At:
				{
				alt81=3;
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
				alt81=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2619); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2621);
					allTypesWithoutResource255=allTypesWithoutResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(allTypesWithoutResource255.getTree());
					char_literal256=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2623); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal256);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2625);
					castOrBitwiseNotOrAt257=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt257.getTree());
					// AST REWRITE
					// elements: allTypesWithoutResource, castOrBitwiseNotOrAt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 494:64: -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:67: ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal258=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2641); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal258_tree = 
					(CommonTree)adaptor.create(char_literal258)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal258_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2644);
					castOrBitwiseNotOrAt259=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt259.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal260=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal260_tree = 
					(CommonTree)adaptor.create(char_literal260)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal260_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2652);
					castOrBitwiseNotOrAt261=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt261.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:4: newOrClone
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2658);
					newOrClone262=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone262.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class newOrClone_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:1: newOrClone : ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary );
	public final TSPHPParser.newOrClone_return newOrClone() throws RecognitionException {
		TSPHPParser.newOrClone_return retval = new TSPHPParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal263=null;
		ParserRuleReturnScope variableMemberStaticMember264 =null;
		ParserRuleReturnScope newObject265 =null;
		ParserRuleReturnScope unaryPrimary266 =null;

		CommonTree string_literal263_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:2: ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary )
			int alt82=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt82=1;
				}
				break;
			case New:
				{
				alt82=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: 'clone' ^ variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal263=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone2669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal263_tree = 
					(CommonTree)adaptor.create(string_literal263)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal263_tree, root_0);
					}

					pushFollow(FOLLOW_variableMemberStaticMember_in_newOrClone2672);
					variableMemberStaticMember264=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember264.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_newOrClone2677);
					newObject265=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject265.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_newOrClone2682);
					unaryPrimary266=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary266.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, newOrClone_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newOrClone"


	public static class variableMemberStaticMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableMemberStaticMember"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:1: variableMemberStaticMember : ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId );
	public final TSPHPParser.variableMemberStaticMember_return variableMemberStaticMember() throws RecognitionException {
		TSPHPParser.variableMemberStaticMember_return retval = new TSPHPParser.variableMemberStaticMember_return();
		retval.start = input.LT(1);
		int variableMemberStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId268=null;
		Token string_literal270=null;
		Token VariableId272=null;
		Token string_literal274=null;
		Token VariableId275=null;
		ParserRuleReturnScope staticAccessOrParent267 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess269 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess271 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess273 =null;

		CommonTree VariableId268_tree=null;
		CommonTree string_literal270_tree=null;
		CommonTree VariableId272_tree=null;
		CommonTree string_literal274_tree=null;
		CommonTree VariableId275_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:2: ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId )
			int alt86=5;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt86=1;
				}
				break;
			case This:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA86_4 = input.LA(3);
					if ( (LA86_4==Identifier) ) {
						int LA86_10 = input.LA(4);
						if ( (LA86_10==LeftParanthesis) ) {
							alt86=4;
						}
						else if ( (LA86_10==EOF||LA86_10==Arrow||LA86_10==Assign||(LA86_10 >= BitwiseAnd && LA86_10 <= BitwiseAndEqual)||(LA86_10 >= BitwiseOr && LA86_10 <= BitwiseXorEqual)||(LA86_10 >= Colon && LA86_10 <= Comma)||(LA86_10 >= Divide && LA86_10 <= DivideEqual)||(LA86_10 >= Dot && LA86_10 <= DotEqual)||LA86_10==Equal||(LA86_10 >= GreaterEqualThan && LA86_10 <= GreaterThan)||LA86_10==Identical||LA86_10==Instanceof||(LA86_10 >= LeftSquareBrace && LA86_10 <= LogicAndWeak)||(LA86_10 >= LogicOr && LA86_10 <= MultiplyEqual)||(LA86_10 >= NotEqual && LA86_10 <= NotIdentical)||LA86_10==ObjectOperator||(LA86_10 >= Plus && LA86_10 <= PlusPlus)||LA86_10==QuestionMark||(LA86_10 >= RightParanthesis && LA86_10 <= RightSquareBrace)||(LA86_10 >= Semicolon && LA86_10 <= ShiftRightEqual)) ) {
							alt86=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 86, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA86_4==EOF) ) {
						alt86=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
				case LeftSquareBrace:
					{
					alt86=2;
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
					alt86=4;
					}
					break;
				default:
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
			case VariableId:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA86_7 = input.LA(3);
					if ( (LA86_7==Identifier) ) {
						int LA86_11 = input.LA(4);
						if ( (LA86_11==LeftParanthesis) ) {
							alt86=5;
						}
						else if ( (LA86_11==EOF||LA86_11==Arrow||LA86_11==Assign||(LA86_11 >= BitwiseAnd && LA86_11 <= BitwiseAndEqual)||(LA86_11 >= BitwiseOr && LA86_11 <= BitwiseXorEqual)||(LA86_11 >= Colon && LA86_11 <= Comma)||(LA86_11 >= Divide && LA86_11 <= DivideEqual)||(LA86_11 >= Dot && LA86_11 <= DotEqual)||LA86_11==Equal||(LA86_11 >= GreaterEqualThan && LA86_11 <= GreaterThan)||LA86_11==Identical||LA86_11==Instanceof||(LA86_11 >= LeftSquareBrace && LA86_11 <= LogicAndWeak)||(LA86_11 >= LogicOr && LA86_11 <= MultiplyEqual)||(LA86_11 >= NotEqual && LA86_11 <= NotIdentical)||LA86_11==ObjectOperator||(LA86_11 >= Plus && LA86_11 <= PlusPlus)||LA86_11==QuestionMark||(LA86_11 >= RightParanthesis && LA86_11 <= RightSquareBrace)||(LA86_11 >= Semicolon && LA86_11 <= ShiftRightEqual)) ) {
							alt86=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 86, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA86_7==EOF) ) {
						alt86=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 86, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt86=3;
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
					alt86=5;
					}
					break;
				default:
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:4: staticAccessOrParent VariableId ( memberAccessOrArrayAccess )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2695);
					staticAccessOrParent267=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent267.getTree());

					VariableId268=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2697); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId268_tree = 
					(CommonTree)adaptor.create(VariableId268)
					;
					adaptor.addChild(root_0, VariableId268_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:36: ( memberAccessOrArrayAccess )*
					loop83:
					do {
						int alt83=2;
						int LA83_0 = input.LA(1);
						if ( (LA83_0==ObjectOperator) ) {
							int LA83_2 = input.LA(2);
							if ( (LA83_2==Identifier) ) {
								int LA83_4 = input.LA(3);
								if ( (LA83_4==EOF||LA83_4==Arrow||LA83_4==Assign||(LA83_4 >= BitwiseAnd && LA83_4 <= BitwiseAndEqual)||(LA83_4 >= BitwiseOr && LA83_4 <= BitwiseXorEqual)||(LA83_4 >= Colon && LA83_4 <= Comma)||(LA83_4 >= Divide && LA83_4 <= DivideEqual)||(LA83_4 >= Dot && LA83_4 <= DotEqual)||LA83_4==Equal||(LA83_4 >= GreaterEqualThan && LA83_4 <= GreaterThan)||LA83_4==Identical||LA83_4==Instanceof||(LA83_4 >= LeftSquareBrace && LA83_4 <= LogicAndWeak)||(LA83_4 >= LogicOr && LA83_4 <= MultiplyEqual)||(LA83_4 >= NotEqual && LA83_4 <= NotIdentical)||LA83_4==ObjectOperator||(LA83_4 >= Plus && LA83_4 <= PlusPlus)||LA83_4==QuestionMark||(LA83_4 >= RightParanthesis && LA83_4 <= RightSquareBrace)||(LA83_4 >= Semicolon && LA83_4 <= ShiftRightEqual)) ) {
									alt83=1;
								}

							}

						}
						else if ( (LA83_0==LeftSquareBrace) ) {
							alt83=1;
						}

						switch (alt83) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:36: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2699);
							memberAccessOrArrayAccess269=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess269.getTree());

							}
							break;

						default :
							break loop83;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: '$this' ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal270=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2705); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal270_tree = 
					(CommonTree)adaptor.create(string_literal270)
					;
					adaptor.addChild(root_0, string_literal270_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:12: ( memberAccessOrArrayAccess )+
					int cnt84=0;
					loop84:
					do {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==ObjectOperator) ) {
							int LA84_2 = input.LA(2);
							if ( (LA84_2==Identifier) ) {
								int LA84_4 = input.LA(3);
								if ( (LA84_4==EOF||LA84_4==Arrow||LA84_4==Assign||(LA84_4 >= BitwiseAnd && LA84_4 <= BitwiseAndEqual)||(LA84_4 >= BitwiseOr && LA84_4 <= BitwiseXorEqual)||(LA84_4 >= Colon && LA84_4 <= Comma)||(LA84_4 >= Divide && LA84_4 <= DivideEqual)||(LA84_4 >= Dot && LA84_4 <= DotEqual)||LA84_4==Equal||(LA84_4 >= GreaterEqualThan && LA84_4 <= GreaterThan)||LA84_4==Identical||LA84_4==Instanceof||(LA84_4 >= LeftSquareBrace && LA84_4 <= LogicAndWeak)||(LA84_4 >= LogicOr && LA84_4 <= MultiplyEqual)||(LA84_4 >= NotEqual && LA84_4 <= NotIdentical)||LA84_4==ObjectOperator||(LA84_4 >= Plus && LA84_4 <= PlusPlus)||LA84_4==QuestionMark||(LA84_4 >= RightParanthesis && LA84_4 <= RightSquareBrace)||(LA84_4 >= Semicolon && LA84_4 <= ShiftRightEqual)) ) {
									alt84=1;
								}

							}

						}
						else if ( (LA84_0==LeftSquareBrace) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:12: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2707);
							memberAccessOrArrayAccess271=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess271.getTree());

							}
							break;

						default :
							if ( cnt84 >= 1 ) break loop84;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(84, input);
								throw eee;
						}
						cnt84++;
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:4: VariableId ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId272=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId272_tree = 
					(CommonTree)adaptor.create(VariableId272)
					;
					adaptor.addChild(root_0, VariableId272_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:15: ( memberAccessOrArrayAccess )+
					int cnt85=0;
					loop85:
					do {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==ObjectOperator) ) {
							int LA85_2 = input.LA(2);
							if ( (LA85_2==Identifier) ) {
								int LA85_4 = input.LA(3);
								if ( (LA85_4==EOF||LA85_4==Arrow||LA85_4==Assign||(LA85_4 >= BitwiseAnd && LA85_4 <= BitwiseAndEqual)||(LA85_4 >= BitwiseOr && LA85_4 <= BitwiseXorEqual)||(LA85_4 >= Colon && LA85_4 <= Comma)||(LA85_4 >= Divide && LA85_4 <= DivideEqual)||(LA85_4 >= Dot && LA85_4 <= DotEqual)||LA85_4==Equal||(LA85_4 >= GreaterEqualThan && LA85_4 <= GreaterThan)||LA85_4==Identical||LA85_4==Instanceof||(LA85_4 >= LeftSquareBrace && LA85_4 <= LogicAndWeak)||(LA85_4 >= LogicOr && LA85_4 <= MultiplyEqual)||(LA85_4 >= NotEqual && LA85_4 <= NotIdentical)||LA85_4==ObjectOperator||(LA85_4 >= Plus && LA85_4 <= PlusPlus)||LA85_4==QuestionMark||(LA85_4 >= RightParanthesis && LA85_4 <= RightSquareBrace)||(LA85_4 >= Semicolon && LA85_4 <= ShiftRightEqual)) ) {
									alt85=1;
								}

							}

						}
						else if ( (LA85_0==LeftSquareBrace) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:15: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2715);
							memberAccessOrArrayAccess273=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess273.getTree());

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
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal274=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal274_tree = 
					(CommonTree)adaptor.create(string_literal274)
					;
					adaptor.addChild(root_0, string_literal274_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId275=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2726); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId275_tree = 
					(CommonTree)adaptor.create(VariableId275)
					;
					adaptor.addChild(root_0, VariableId275_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 71, variableMemberStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableMemberStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:1: staticAccessOrParent : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal276=null;
		Token string_literal277=null;
		Token string_literal279=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject278 =null;

		CommonTree string_literal276_tree=null;
		CommonTree string_literal277_tree=null;
		CommonTree string_literal279_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt87=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt87=1;
				}
				break;
			case Parent:
				{
				alt87=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:4: 'self::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal276=(Token)match(input,Self,FOLLOW_Self_in_staticAccessOrParent2737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal276_tree = 
					(CommonTree)adaptor.create(string_literal276)
					;
					adaptor.addChild(root_0, string_literal276_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: 'parent::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal277=(Token)match(input,Parent,FOLLOW_Parent_in_staticAccessOrParent2742); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal277_tree = 
					(CommonTree)adaptor.create(string_literal277)
					;
					adaptor.addChild(root_0, string_literal277_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:518:4: classInterfaceTypeWithoutObject '::'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2747);
					classInterfaceTypeWithoutObject278=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject278.getTree());

					string_literal279=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2748); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal279_tree = 
					(CommonTree)adaptor.create(string_literal279)
					;
					adaptor.addChild(root_0, string_literal279_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 72, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class memberAccessOrArrayAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccessOrArrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:1: memberAccessOrArrayAccess : ( memberAccess | arrayAccess );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccess280 =null;
		ParserRuleReturnScope arrayAccess281 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:2: ( memberAccess | arrayAccess )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==ObjectOperator) ) {
				alt88=1;
			}
			else if ( (LA88_0==LeftSquareBrace) ) {
				alt88=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: memberAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_memberAccessOrArrayAccess2759);
					memberAccess280=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess280.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:523:4: arrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2764);
					arrayAccess281=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess281.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, memberAccessOrArrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccessOrArrayAccess"


	public static class memberAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:1: memberAccess : '->' Identifier ;
	public final TSPHPParser.memberAccess_return memberAccess() throws RecognitionException {
		TSPHPParser.memberAccess_return retval = new TSPHPParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal282=null;
		Token Identifier283=null;

		CommonTree string_literal282_tree=null;
		CommonTree Identifier283_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:2: ( '->' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: '->' Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal282=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccess2774); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal282_tree = 
			(CommonTree)adaptor.create(string_literal282)
			;
			adaptor.addChild(root_0, string_literal282_tree);
			}

			Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccess2776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier283_tree = 
			(CommonTree)adaptor.create(Identifier283)
			;
			adaptor.addChild(root_0, Identifier283_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class arrayAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:1: arrayAccess : '[' expression ']' ;
	public final TSPHPParser.arrayAccess_return arrayAccess() throws RecognitionException {
		TSPHPParser.arrayAccess_return retval = new TSPHPParser.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal284=null;
		Token char_literal286=null;
		ParserRuleReturnScope expression285 =null;

		CommonTree char_literal284_tree=null;
		CommonTree char_literal286_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:529:2: ( '[' expression ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:529:4: '[' expression ']'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal284=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2786); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal284_tree = 
			(CommonTree)adaptor.create(char_literal284)
			;
			adaptor.addChild(root_0, char_literal284_tree);
			}

			pushFollow(FOLLOW_expression_in_arrayAccess2788);
			expression285=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression285.getTree());

			char_literal286=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2790); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal286_tree = 
			(CommonTree)adaptor.create(char_literal286)
			;
			adaptor.addChild(root_0, char_literal286_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, arrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class newObject_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:1: newObject : 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )? -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? ) ;
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal287=null;
		Token char_literal289=null;
		Token char_literal291=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject288 =null;
		ParserRuleReturnScope expressionList290 =null;

		CommonTree string_literal287_tree=null;
		CommonTree char_literal289_tree=null;
		CommonTree char_literal291_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:2: ( 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )? -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:4: 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )?
			{
			string_literal287=(Token)match(input,New,FOLLOW_New_in_newObject2803); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_New.add(string_literal287);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2805);
			classInterfaceTypeWithoutObject288=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject288.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:42: ( '(' ( expressionList )? ')' )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LeftParanthesis) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:43: '(' ( expressionList )? ')'
					{
					char_literal289=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2808); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal289);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:47: ( expressionList )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==At||LA89_0==Backslash||LA89_0==BitwiseNot||LA89_0==Bool||LA89_0==Clone||LA89_0==Float||LA89_0==Identifier||LA89_0==Int||(LA89_0 >= LeftParanthesis && LA89_0 <= LeftSquareBrace)||LA89_0==LogicNot||LA89_0==Minus||LA89_0==MinusMinus||LA89_0==New||LA89_0==Null||(LA89_0 >= Parent && LA89_0 <= Plus)||LA89_0==PlusPlus||LA89_0==Self||LA89_0==String||LA89_0==This||LA89_0==TypeArray||LA89_0==VariableId) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:47: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2810);
							expressionList290=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList290.getTree());
							}
							break;

					}

					char_literal291=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2813); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal291);

					}
					break;

			}

			// AST REWRITE
			// elements: expressionList, classInterfaceTypeWithoutObject, New
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 534:69: -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:72: ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_New.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:534:112: ( expressionList )?
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
			if ( state.backtracking>0 ) { memoize(input, 76, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary292 =null;
		ParserRuleReturnScope primary293 =null;
		ParserRuleReturnScope primary294 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary2841); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary2843);
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
					// 538:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary2861); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary2863);
					primary293=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary293.getTree());
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
					// 539:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary2877);
					primary294=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary294.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:1: primary : ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentInclAccessAtTheEnd295 =null;
		ParserRuleReturnScope methodCallFluentInclAccessAtTheEnd296 =null;
		ParserRuleReturnScope atom297 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:2: ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom )
			int alt92=3;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA92_1 = input.LA(2);
				if ( (synpred150_TSPHP()) ) {
					alt92=1;
				}
				else if ( (synpred151_TSPHP()) ) {
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
				if ( (synpred150_TSPHP()) ) {
					alt92=1;
				}
				else if ( (synpred151_TSPHP()) ) {
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
				if ( (synpred151_TSPHP()) ) {
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
				if ( (synpred151_TSPHP()) ) {
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
				if ( (synpred151_TSPHP()) ) {
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
				if ( (synpred151_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: functionCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2887);
					functionCallFluentInclAccessAtTheEnd295=functionCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentInclAccessAtTheEnd295.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: methodCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2892);
					methodCallFluentInclAccessAtTheEnd296=methodCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentInclAccessAtTheEnd296.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary2897);
					atom297=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom297.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


	public static class functionCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:1: functionCallFluentInclAccessAtTheEnd : functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.functionCallFluentInclAccessAtTheEnd_return functionCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd298 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess299 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:2: ( functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2909);
			functionCallFluentWithoutAccessAtTheEnd298=functionCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd298.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:44: ( memberAccessOrArrayAccess )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LeftSquareBrace||LA93_0==ObjectOperator) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:44: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2911);
					memberAccessOrArrayAccess299=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess299.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 79, functionCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentInclAccessAtTheEnd"


	public static class functionCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:1: functionCallFluentWithoutAccessAtTheEnd : ( functionCall ( callOrAccess )* call | functionCall ( call )* );
	public final TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return functionCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCall300 =null;
		ParserRuleReturnScope callOrAccess301 =null;
		ParserRuleReturnScope call302 =null;
		ParserRuleReturnScope functionCall303 =null;
		ParserRuleReturnScope call304 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:2: ( functionCall ( callOrAccess )* call | functionCall ( call )* )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==Backslash) ) {
				int LA96_1 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
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
				if ( (synpred154_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:4: functionCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2923);
					functionCall300=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall300.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: ( callOrAccess )*
					loop94:
					do {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==ObjectOperator) ) {
							int LA94_1 = input.LA(2);
							if ( (synpred153_TSPHP()) ) {
								alt94=1;
							}

						}
						else if ( (LA94_0==LeftSquareBrace) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2925);
							callOrAccess301=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess301.getTree());

							}
							break;

						default :
							break loop94;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2928);
					call302=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call302.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:4: functionCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2933);
					functionCall303=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall303.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:17: ( call )*
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:554:17: call
							{
							pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2935);
							call304=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call304.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 80, functionCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentWithoutAccessAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:1: functionCall : classInterfaceTypeWithoutObject '(' ( expressionList )? ')' ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal306=null;
		Token char_literal308=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject305 =null;
		ParserRuleReturnScope expressionList307 =null;

		CommonTree char_literal306_tree=null;
		CommonTree char_literal308_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:2: ( classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:4: classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2947);
			classInterfaceTypeWithoutObject305=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject305.getTree());

			char_literal306=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2949); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal306_tree = 
			(CommonTree)adaptor.create(char_literal306)
			;
			adaptor.addChild(root_0, char_literal306_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:40: ( expressionList )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==At||LA97_0==Backslash||LA97_0==BitwiseNot||LA97_0==Bool||LA97_0==Clone||LA97_0==Float||LA97_0==Identifier||LA97_0==Int||(LA97_0 >= LeftParanthesis && LA97_0 <= LeftSquareBrace)||LA97_0==LogicNot||LA97_0==Minus||LA97_0==MinusMinus||LA97_0==New||LA97_0==Null||(LA97_0 >= Parent && LA97_0 <= Plus)||LA97_0==PlusPlus||LA97_0==Self||LA97_0==String||LA97_0==This||LA97_0==TypeArray||LA97_0==VariableId) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:558:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2951);
					expressionList307=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList307.getTree());

					}
					break;

			}

			char_literal308=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2954); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal308_tree = 
			(CommonTree)adaptor.create(char_literal308)
			;
			adaptor.addChild(root_0, char_literal308_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


	public static class callOrAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callOrAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess309 =null;
		ParserRuleReturnScope call310 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:562:2: ( memberAccessOrArrayAccess | call )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==ObjectOperator) ) {
				int LA98_1 = input.LA(2);
				if ( (LA98_1==Identifier) ) {
					int LA98_3 = input.LA(3);
					if ( (LA98_3==LeftParanthesis) ) {
						alt98=2;
					}
					else if ( (LA98_3==EOF||LA98_3==LeftSquareBrace||LA98_3==ObjectOperator) ) {
						alt98=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 98, 3, input);
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
							new NoViableAltException("", 98, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA98_0==LeftSquareBrace) ) {
				alt98=1;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:562:4: memberAccessOrArrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2965);
					memberAccessOrArrayAccess309=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess309.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:4: call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess2970);
					call310=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call310.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, callOrAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callOrAccess"


	public static class call_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:1: call : ( '->' Identifier '(' ( expressionList )? ')' ) ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal311=null;
		Token Identifier312=null;
		Token char_literal313=null;
		Token char_literal315=null;
		ParserRuleReturnScope expressionList314 =null;

		CommonTree string_literal311_tree=null;
		CommonTree Identifier312_tree=null;
		CommonTree char_literal313_tree=null;
		CommonTree char_literal315_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:6: ( ( '->' Identifier '(' ( expressionList )? ')' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:8: ( '->' Identifier '(' ( expressionList )? ')' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:8: ( '->' Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:9: '->' Identifier '(' ( expressionList )? ')'
			{
			string_literal311=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call2983); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal311_tree = 
			(CommonTree)adaptor.create(string_literal311)
			;
			adaptor.addChild(root_0, string_literal311_tree);
			}

			Identifier312=(Token)match(input,Identifier,FOLLOW_Identifier_in_call2985); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier312_tree = 
			(CommonTree)adaptor.create(Identifier312)
			;
			adaptor.addChild(root_0, Identifier312_tree);
			}

			char_literal313=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call2987); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal313_tree = 
			(CommonTree)adaptor.create(char_literal313)
			;
			adaptor.addChild(root_0, char_literal313_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:29: ( expressionList )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==At||LA99_0==Backslash||LA99_0==BitwiseNot||LA99_0==Bool||LA99_0==Clone||LA99_0==Float||LA99_0==Identifier||LA99_0==Int||(LA99_0 >= LeftParanthesis && LA99_0 <= LeftSquareBrace)||LA99_0==LogicNot||LA99_0==Minus||LA99_0==MinusMinus||LA99_0==New||LA99_0==Null||(LA99_0 >= Parent && LA99_0 <= Plus)||LA99_0==PlusPlus||LA99_0==Self||LA99_0==String||LA99_0==This||LA99_0==TypeArray||LA99_0==VariableId) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:566:29: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_call2989);
					expressionList314=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList314.getTree());

					}
					break;

			}

			char_literal315=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call2991); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal315_tree = 
			(CommonTree)adaptor.create(char_literal315)
			;
			adaptor.addChild(root_0, char_literal315_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 83, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:1: methodCallFluentInclAccessAtTheEnd : methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.methodCallFluentInclAccessAtTheEnd_return methodCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd316 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess317 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:2: ( methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd3002);
			methodCallFluentWithoutAccessAtTheEnd316=methodCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd316.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:42: ( memberAccessOrArrayAccess )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LeftSquareBrace||LA100_0==ObjectOperator) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:42: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd3004);
					memberAccessOrArrayAccess317=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess317.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 84, methodCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentInclAccessAtTheEnd"


	public static class methodCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:1: methodCallFluentWithoutAccessAtTheEnd : ( methodCall ( callOrAccess )* call | methodCall ( call )* );
	public final TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return methodCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCall318 =null;
		ParserRuleReturnScope callOrAccess319 =null;
		ParserRuleReturnScope call320 =null;
		ParserRuleReturnScope methodCall321 =null;
		ParserRuleReturnScope call322 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:2: ( methodCall ( callOrAccess )* call | methodCall ( call )* )
			int alt103=2;
			switch ( input.LA(1) ) {
			case Self:
				{
				int LA103_1 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			case Parent:
				{
				int LA103_2 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			case Backslash:
				{
				int LA103_3 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			case Identifier:
				{
				int LA103_4 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			case This:
				{
				int LA103_5 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			case VariableId:
				{
				int LA103_6 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:5: methodCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3018);
					methodCall318=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall318.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: ( callOrAccess )*
					loop101:
					do {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==ObjectOperator) ) {
							int LA101_1 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt101=1;
							}

						}
						else if ( (LA101_0==LeftSquareBrace) ) {
							alt101=1;
						}

						switch (alt101) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd3020);
							callOrAccess319=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess319.getTree());

							}
							break;

						default :
							break loop101;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3023);
					call320=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call320.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:4: methodCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3028);
					methodCall321=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall321.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:15: ( call )*
					loop102:
					do {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==ObjectOperator) ) {
							int LA102_2 = input.LA(2);
							if ( (LA102_2==Identifier) ) {
								int LA102_3 = input.LA(3);
								if ( (LA102_3==LeftParanthesis) ) {
									alt102=1;
								}

							}

						}

						switch (alt102) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:574:15: call
							{
							pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3030);
							call322=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call322.getTree());

							}
							break;

						default :
							break loop102;
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
			if ( state.backtracking>0 ) { memoize(input, 85, methodCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentWithoutAccessAtTheEnd"


	public static class methodCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:1: methodCall : ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal324=null;
		Token Identifier326=null;
		Token char_literal327=null;
		Token char_literal329=null;
		ParserRuleReturnScope variableMemberStaticMember323 =null;
		ParserRuleReturnScope staticAccessOrParent325 =null;
		ParserRuleReturnScope expressionList328 =null;

		CommonTree string_literal324_tree=null;
		CommonTree Identifier326_tree=null;
		CommonTree char_literal327_tree=null;
		CommonTree char_literal329_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:2: ( ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )
			int alt104=2;
			alt104 = dfa104.predict(input);
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:6: ( variableMemberStaticMember '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:6: ( variableMemberStaticMember '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:7: variableMemberStaticMember '->'
					{
					pushFollow(FOLLOW_variableMemberStaticMember_in_methodCall3044);
					variableMemberStaticMember323=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember323.getTree());

					string_literal324=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall3046); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal324_tree = 
					(CommonTree)adaptor.create(string_literal324)
					;
					adaptor.addChild(root_0, string_literal324_tree);
					}

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:42: staticAccessOrParent
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_methodCall3051);
					staticAccessOrParent325=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent325.getTree());

					}
					break;

			}

			Identifier326=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier326_tree = 
			(CommonTree)adaptor.create(Identifier326)
			;
			adaptor.addChild(root_0, Identifier326_tree);
			}

			char_literal327=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall3056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal327_tree = 
			(CommonTree)adaptor.create(char_literal327)
			;
			adaptor.addChild(root_0, char_literal327_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:79: ( expressionList )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==At||LA105_0==Backslash||LA105_0==BitwiseNot||LA105_0==Bool||LA105_0==Clone||LA105_0==Float||LA105_0==Identifier||LA105_0==Int||(LA105_0 >= LeftParanthesis && LA105_0 <= LeftSquareBrace)||LA105_0==LogicNot||LA105_0==Minus||LA105_0==MinusMinus||LA105_0==New||LA105_0==Null||(LA105_0 >= Parent && LA105_0 <= Plus)||LA105_0==PlusPlus||LA105_0==Self||LA105_0==String||LA105_0==This||LA105_0==TypeArray||LA105_0==VariableId) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:79: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall3058);
					expressionList328=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList328.getTree());

					}
					break;

			}

			char_literal329=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall3060); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal329_tree = 
			(CommonTree)adaptor.create(char_literal329)
			;
			adaptor.addChild(root_0, char_literal329_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:1: atom : ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal330=null;
		Token char_literal332=null;
		ParserRuleReturnScope expression331 =null;
		ParserRuleReturnScope incrementDecrement333 =null;
		ParserRuleReturnScope variableMemberStaticMember334 =null;
		ParserRuleReturnScope classConstant335 =null;
		ParserRuleReturnScope globalConstant336 =null;
		ParserRuleReturnScope array337 =null;
		ParserRuleReturnScope primitiveAtom338 =null;

		CommonTree char_literal330_tree=null;
		CommonTree char_literal332_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:6: ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom )
			int alt106=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt106=1;
				}
				break;
			case Self:
				{
				int LA106_2 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt106=4;
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
			case Parent:
				{
				int LA106_3 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt106=4;
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
			case Backslash:
				{
				int LA106_4 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt106=4;
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
			case Identifier:
				{
				int LA106_5 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt106=4;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt106=5;
				}
				else if ( (true) ) {
					alt106=7;
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
			case This:
				{
				int LA106_6 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
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
			case VariableId:
				{
				int LA106_7 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt106=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt106=3;
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
			case MinusMinus:
			case PlusPlus:
				{
				alt106=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt106=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt106=7;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:8: '(' expression ')'
					{
					char_literal330=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3070); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal330);

					pushFollow(FOLLOW_expression_in_atom3072);
					expression331=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression331.getTree());
					char_literal332=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3074); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal332);

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
					// 580:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3083);
					incrementDecrement333=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement333.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableMemberStaticMember_in_atom3088);
					variableMemberStaticMember334=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember334.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3093);
					classConstant335=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant335.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3098);
					globalConstant336=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant336.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3103);
					array337=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array337.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3108);
					primitiveAtom338=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom338.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class globalConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:589:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier339=null;

		CommonTree Identifier339_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier339=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3120); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 88, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class classConstant_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier341=null;
		ParserRuleReturnScope staticAccessOrParent340 =null;

		CommonTree Identifier341_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:594:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:594:4: staticAccessOrParent Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3131);
			staticAccessOrParent340=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent340.getTree());

			Identifier341=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3133); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 89, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt107=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt107=1;
				}
				break;
			case Minus:
				{
				alt107=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt107=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: '+' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal342=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3145); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal342_tree = 
					(CommonTree)adaptor.create(char_literal342)
					;
					adaptor.addChild(root_0, char_literal342_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3147);
					primitiveAtom343=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom343.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:4: '-' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal344=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3152); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal344_tree = 
					(CommonTree)adaptor.create(char_literal344)
					;
					adaptor.addChild(root_0, char_literal344_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3154);
					primitiveAtom345=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom345.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:600:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3159);
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
			if ( state.backtracking>0 ) { memoize(input, 90, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set347=null;

		CommonTree set347_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:604:2: ( Bool | Int | Float | String | Null | Identifier )
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
			if ( state.backtracking>0 ) { memoize(input, 91, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==LeftSquareBrace) ) {
				alt110=1;
			}
			else if ( (LA110_0==TypeArray) ) {
				alt110=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:9: '[' ( array_content )? ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal348=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3657); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal348_tree = 
					(CommonTree)adaptor.create(char_literal348)
					;
					adaptor.addChild(root_0, char_literal348_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:13: ( array_content )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==At||LA108_0==Backslash||LA108_0==BitwiseNot||LA108_0==Bool||LA108_0==Clone||LA108_0==Float||LA108_0==Identifier||LA108_0==Int||(LA108_0 >= LeftParanthesis && LA108_0 <= LeftSquareBrace)||LA108_0==LogicNot||LA108_0==Minus||LA108_0==MinusMinus||LA108_0==New||LA108_0==Null||(LA108_0 >= Parent && LA108_0 <= Plus)||LA108_0==PlusPlus||LA108_0==Self||LA108_0==String||LA108_0==This||LA108_0==TypeArray||LA108_0==VariableId) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3659);
							array_content349=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content349.getTree());

							}
							break;

					}

					char_literal350=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal350_tree = 
					(CommonTree)adaptor.create(char_literal350)
					;
					adaptor.addChild(root_0, char_literal350_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray351=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array3668); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray351_tree = 
					(CommonTree)adaptor.create(TypeArray351)
					;
					adaptor.addChild(root_0, TypeArray351_tree);
					}

					char_literal352=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3670); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal352_tree = 
					(CommonTree)adaptor.create(char_literal352)
					;
					adaptor.addChild(root_0, char_literal352_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:18: ( array_content )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==At||LA109_0==Backslash||LA109_0==BitwiseNot||LA109_0==Bool||LA109_0==Clone||LA109_0==Float||LA109_0==Identifier||LA109_0==Int||(LA109_0 >= LeftParanthesis && LA109_0 <= LeftSquareBrace)||LA109_0==LogicNot||LA109_0==Minus||LA109_0==MinusMinus||LA109_0==New||LA109_0==Null||(LA109_0 >= Parent && LA109_0 <= Plus)||LA109_0==PlusPlus||LA109_0==Self||LA109_0==String||LA109_0==This||LA109_0==TypeArray||LA109_0==VariableId) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:667:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3672);
							array_content353=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content353.getTree());

							}
							break;

					}

					char_literal354=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3675); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 92, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class array_content_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_content"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
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
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( expression '=>' )?
			int alt111=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA111_1 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA111_2 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA111_3 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case At:
					{
					int LA111_4 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Clone:
					{
					int LA111_5 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case New:
					{
					int LA111_6 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Plus:
					{
					int LA111_7 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Minus:
					{
					int LA111_8 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Backslash:
					{
					int LA111_9 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Identifier:
					{
					int LA111_10 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Self:
					{
					int LA111_11 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Parent:
					{
					int LA111_12 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case This:
					{
					int LA111_13 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case VariableId:
					{
					int LA111_14 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case PlusPlus:
					{
					int LA111_15 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case MinusMinus:
					{
					int LA111_16 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA111_17 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA111_18 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case Null:
				case String:
					{
					int LA111_19 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt111=1;
					}
					}
					break;
			}
			switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3688);
					expression355=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression355.getTree());

					string_literal356=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3690); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal356_tree = 
					(CommonTree)adaptor.create(string_literal356)
					;
					adaptor.addChild(root_0, string_literal356_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3694);
			expression357=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression357.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:35: ( ',' ( expression '=>' )? expression )*
			loop113:
			do {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==Comma) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:36: ',' ( expression '=>' )? expression
					{
					char_literal358=(Token)match(input,Comma,FOLLOW_Comma_in_array_content3698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal358_tree = 
					(CommonTree)adaptor.create(char_literal358)
					;
					adaptor.addChild(root_0, char_literal358_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:40: ( expression '=>' )?
					int alt112=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA112_1 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA112_2 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA112_3 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case At:
							{
							int LA112_4 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Clone:
							{
							int LA112_5 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case New:
							{
							int LA112_6 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Plus:
							{
							int LA112_7 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Minus:
							{
							int LA112_8 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Backslash:
							{
							int LA112_9 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Identifier:
							{
							int LA112_10 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Self:
							{
							int LA112_11 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Parent:
							{
							int LA112_12 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case This:
							{
							int LA112_13 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case VariableId:
							{
							int LA112_14 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case PlusPlus:
							{
							int LA112_15 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case MinusMinus:
							{
							int LA112_16 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA112_17 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA112_18 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case Null:
						case String:
							{
							int LA112_19 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt112=1;
							}
							}
							break;
					}
					switch (alt112) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3701);
							expression359=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression359.getTree());

							string_literal360=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3703); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal360_tree = 
							(CommonTree)adaptor.create(string_literal360)
							;
							adaptor.addChild(root_0, string_literal360_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3707);
					expression361=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression361.getTree());

					}
					break;

				default :
					break loop113;
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
			if ( state.backtracking>0 ) { memoize(input, 93, array_content_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array_content"


	public static class ifCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:674:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal362=null;
		Token char_literal363=null;
		Token char_literal365=null;
		Token string_literal367=null;
		ParserRuleReturnScope expression364 =null;
		ParserRuleReturnScope instructionInclBreakContinue366 =null;
		ParserRuleReturnScope instructionInclBreakContinue368 =null;

		CommonTree string_literal362_tree=null;
		CommonTree char_literal363_tree=null;
		CommonTree char_literal365_tree=null;
		CommonTree string_literal367_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal362=(Token)match(input,If,FOLLOW_If_in_ifCondition3719); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal362_tree = 
			(CommonTree)adaptor.create(string_literal362)
			;
			adaptor.addChild(root_0, string_literal362_tree);
			}

			char_literal363=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3721); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal363_tree = 
			(CommonTree)adaptor.create(char_literal363)
			;
			adaptor.addChild(root_0, char_literal363_tree);
			}

			pushFollow(FOLLOW_expression_in_ifCondition3723);
			expression364=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression364.getTree());

			char_literal365=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3725); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal365_tree = 
			(CommonTree)adaptor.create(char_literal365)
			;
			adaptor.addChild(root_0, char_literal365_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3727);
			instructionInclBreakContinue366=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue366.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:3: ( 'else' instructionInclBreakContinue )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==Else) ) {
				int LA114_1 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt114=1;
				}
			}
			switch (alt114) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:5: 'else' instructionInclBreakContinue
					{
					string_literal367=(Token)match(input,Else,FOLLOW_Else_in_ifCondition3734); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal367_tree = 
					(CommonTree)adaptor.create(string_literal367)
					;
					adaptor.addChild(root_0, string_literal367_tree);
					}

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3736);
					instructionInclBreakContinue368=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue368.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal369=null;
		Token char_literal370=null;
		Token VariableId371=null;
		Token char_literal372=null;
		Token char_literal373=null;
		Token char_literal384=null;
		ParserRuleReturnScope caseLabel374 =null;
		ParserRuleReturnScope instructionInclBreakContinue375 =null;
		ParserRuleReturnScope defaultLabel376 =null;
		ParserRuleReturnScope instructionInclBreakContinue377 =null;
		ParserRuleReturnScope caseLabel378 =null;
		ParserRuleReturnScope instructionInclBreakContinue379 =null;
		ParserRuleReturnScope caseLabel380 =null;
		ParserRuleReturnScope instructionInclBreakContinue381 =null;
		ParserRuleReturnScope defaultLabel382 =null;
		ParserRuleReturnScope instructionInclBreakContinue383 =null;

		CommonTree string_literal369_tree=null;
		CommonTree char_literal370_tree=null;
		CommonTree VariableId371_tree=null;
		CommonTree char_literal372_tree=null;
		CommonTree char_literal373_tree=null;
		CommonTree char_literal384_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal369=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition3752); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal369_tree = 
			(CommonTree)adaptor.create(string_literal369)
			;
			adaptor.addChild(root_0, string_literal369_tree);
			}

			char_literal370=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3754); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal370_tree = 
			(CommonTree)adaptor.create(char_literal370)
			;
			adaptor.addChild(root_0, char_literal370_tree);
			}

			VariableId371=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition3756); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId371_tree = 
			(CommonTree)adaptor.create(VariableId371)
			;
			adaptor.addChild(root_0, VariableId371_tree);
			}

			char_literal372=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3758); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal372_tree = 
			(CommonTree)adaptor.create(char_literal372)
			;
			adaptor.addChild(root_0, char_literal372_tree);
			}

			char_literal373=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3760); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal373_tree = 
			(CommonTree)adaptor.create(char_literal373)
			;
			adaptor.addChild(root_0, char_literal373_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Case) ) {
				int LA127_1 = input.LA(2);
				if ( (synpred192_TSPHP()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3771);
									caseLabel374=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel374.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:16: ( instructionInclBreakContinue )+
							int cnt116=0;
							loop116:
							do {
								int alt116=2;
								int LA116_0 = input.LA(1);
								if ( (LA116_0==Backslash||LA116_0==Break||LA116_0==Continue||LA116_0==Do||LA116_0==Echo||LA116_0==Exit||(LA116_0 >= For && LA116_0 <= Foreach)||(LA116_0 >= Identifier && LA116_0 <= If)||LA116_0==LeftCurlyBrace||LA116_0==MinusMinus||LA116_0==Parent||LA116_0==PlusPlus||LA116_0==Return||LA116_0==Self||(LA116_0 >= Switch && LA116_0 <= TypeString)||LA116_0==VariableId||LA116_0==While) ) {
									alt116=1;
								}

								switch (alt116) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3774);
									instructionInclBreakContinue375=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue375.getTree());

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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3779);
					defaultLabel376=defaultLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel376.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:61: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3781);
							instructionInclBreakContinue377=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue377.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3785);
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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:103: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3788);
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

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3798);
									caseLabel380=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel380.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:17: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3801);
									instructionInclBreakContinue381=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue381.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==Default) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3807);
							defaultLabel382=defaultLabel();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel382.getTree());

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:63: ( instructionInclBreakContinue )+
							int cnt125=0;
							loop125:
							do {
								int alt125=2;
								int LA125_0 = input.LA(1);
								if ( (LA125_0==Backslash||LA125_0==Break||LA125_0==Continue||LA125_0==Do||LA125_0==Echo||LA125_0==Exit||(LA125_0 >= For && LA125_0 <= Foreach)||(LA125_0 >= Identifier && LA125_0 <= If)||LA125_0==LeftCurlyBrace||LA125_0==MinusMinus||LA125_0==Parent||LA125_0==PlusPlus||LA125_0==Return||LA125_0==Self||(LA125_0 >= Switch && LA125_0 <= TypeString)||LA125_0==VariableId||LA125_0==While) ) {
									alt125=1;
								}

								switch (alt125) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3809);
									instructionInclBreakContinue383=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue383.getTree());

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

							}
							break;

					}

					}
					break;

			}

			char_literal384=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal384_tree = 
			(CommonTree)adaptor.create(char_literal384)
			;
			adaptor.addChild(root_0, char_literal384_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


	public static class caseLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:689:1: caseLabel : 'case' expression ':' ;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal385=null;
		Token char_literal387=null;
		ParserRuleReturnScope expression386 =null;

		CommonTree string_literal385_tree=null;
		CommonTree char_literal387_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:4: 'case' expression ':'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal385=(Token)match(input,Case,FOLLOW_Case_in_caseLabel3832); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal385_tree = 
			(CommonTree)adaptor.create(string_literal385)
			;
			adaptor.addChild(root_0, string_literal385_tree);
			}

			pushFollow(FOLLOW_expression_in_caseLabel3834);
			expression386=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression386.getTree());

			char_literal387=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel3836); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal387_tree = 
			(CommonTree)adaptor.create(char_literal387)
			;
			adaptor.addChild(root_0, char_literal387_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:1: defaultLabel : 'default' ':' ;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal388=null;
		Token char_literal389=null;

		CommonTree string_literal388_tree=null;
		CommonTree char_literal389_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:4: 'default' ':'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal388=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel3845); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal388_tree = 
			(CommonTree)adaptor.create(string_literal388)
			;
			adaptor.addChild(root_0, string_literal388_tree);
			}

			char_literal389=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel3847); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal389_tree = 
			(CommonTree)adaptor.create(char_literal389)
			;
			adaptor.addChild(root_0, char_literal389_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal390=null;
		Token char_literal391=null;
		Token char_literal393=null;
		Token char_literal395=null;
		Token char_literal397=null;
		ParserRuleReturnScope forInit392 =null;
		ParserRuleReturnScope expressionList394 =null;
		ParserRuleReturnScope forUpdate396 =null;
		ParserRuleReturnScope instructionInclBreakContinue398 =null;

		CommonTree string_literal390_tree=null;
		CommonTree char_literal391_tree=null;
		CommonTree char_literal393_tree=null;
		CommonTree char_literal395_tree=null;
		CommonTree char_literal397_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal390=(Token)match(input,For,FOLLOW_For_in_forLoop3856); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal390_tree = 
			(CommonTree)adaptor.create(string_literal390)
			;
			adaptor.addChild(root_0, string_literal390_tree);
			}

			char_literal391=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3858); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal391_tree = 
			(CommonTree)adaptor.create(char_literal391)
			;
			adaptor.addChild(root_0, char_literal391_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:21: ( forInit )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==Backslash||LA128_0==Identifier||LA128_0==MinusMinus||LA128_0==Parent||LA128_0==PlusPlus||LA128_0==Self||LA128_0==This||(LA128_0 >= TypeArray && LA128_0 <= TypeString)||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3860);
					forInit392=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit392.getTree());

					}
					break;

			}

			char_literal393=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3863); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal393_tree = 
			(CommonTree)adaptor.create(char_literal393)
			;
			adaptor.addChild(root_0, char_literal393_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:34: ( expressionList )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==At||LA129_0==Backslash||LA129_0==BitwiseNot||LA129_0==Bool||LA129_0==Clone||LA129_0==Float||LA129_0==Identifier||LA129_0==Int||(LA129_0 >= LeftParanthesis && LA129_0 <= LeftSquareBrace)||LA129_0==LogicNot||LA129_0==Minus||LA129_0==MinusMinus||LA129_0==New||LA129_0==Null||(LA129_0 >= Parent && LA129_0 <= Plus)||LA129_0==PlusPlus||LA129_0==Self||LA129_0==String||LA129_0==This||LA129_0==TypeArray||LA129_0==VariableId) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3865);
					expressionList394=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList394.getTree());

					}
					break;

			}

			char_literal395=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3869); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal395_tree = 
			(CommonTree)adaptor.create(char_literal395)
			;
			adaptor.addChild(root_0, char_literal395_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:55: ( forUpdate )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==Backslash||LA130_0==Identifier||LA130_0==MinusMinus||LA130_0==Parent||LA130_0==PlusPlus||LA130_0==Self||LA130_0==This||LA130_0==VariableId) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3871);
					forUpdate396=forUpdate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate396.getTree());

					}
					break;

			}

			char_literal397=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3874); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal397_tree = 
			(CommonTree)adaptor.create(char_literal397)
			;
			adaptor.addChild(root_0, char_literal397_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3876);
			instructionInclBreakContinue398=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue398.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal401=null;
		ParserRuleReturnScope variableDeclaration399 =null;
		ParserRuleReturnScope variableAssignment400 =null;
		ParserRuleReturnScope variableAssignment402 =null;

		CommonTree char_literal401_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:11: ( variableDeclaration | variableAssignment )
			int alt131=2;
			alt131 = dfa131.predict(input);
			switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3885);
					variableDeclaration399=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration399.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3887);
					variableAssignment400=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment400.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:52: ( ',' variableAssignment )*
			loop132:
			do {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==Comma) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:53: ',' variableAssignment
					{
					char_literal401=(Token)match(input,Comma,FOLLOW_Comma_in_forInit3891); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal401_tree = 
					(CommonTree)adaptor.create(char_literal401)
					;
					adaptor.addChild(root_0, char_literal401_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forInit3893);
					variableAssignment402=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment402.getTree());

					}
					break;

				default :
					break loop132;
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
			if ( state.backtracking>0 ) { memoize(input, 99, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal404=null;
		ParserRuleReturnScope variableAssignment403 =null;
		ParserRuleReturnScope variableAssignment405 =null;

		CommonTree char_literal404_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:4: variableAssignment ( ',' variableAssignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableAssignment_in_forUpdate3903);
			variableAssignment403=variableAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment403.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:23: ( ',' variableAssignment )*
			loop133:
			do {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==Comma) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:24: ',' variableAssignment
					{
					char_literal404=(Token)match(input,Comma,FOLLOW_Comma_in_forUpdate3906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal404_tree = 
					(CommonTree)adaptor.create(char_literal404)
					;
					adaptor.addChild(root_0, char_literal404_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forUpdate3908);
					variableAssignment405=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment405.getTree());

					}
					break;

				default :
					break loop133;
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
			if ( state.backtracking>0 ) { memoize(input, 100, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal406=null;
		Token char_literal407=null;
		Token VariableId408=null;
		Token string_literal410=null;
		Token VariableId411=null;
		Token string_literal412=null;
		Token VariableId413=null;
		Token char_literal414=null;
		ParserRuleReturnScope array409 =null;
		ParserRuleReturnScope instructionInclBreakContinue415 =null;

		CommonTree string_literal406_tree=null;
		CommonTree char_literal407_tree=null;
		CommonTree VariableId408_tree=null;
		CommonTree string_literal410_tree=null;
		CommonTree VariableId411_tree=null;
		CommonTree string_literal412_tree=null;
		CommonTree VariableId413_tree=null;
		CommonTree char_literal414_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal406=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3919); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal406_tree = 
			(CommonTree)adaptor.create(string_literal406)
			;
			adaptor.addChild(root_0, string_literal406_tree);
			}

			char_literal407=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3921); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal407_tree = 
			(CommonTree)adaptor.create(char_literal407)
			;
			adaptor.addChild(root_0, char_literal407_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:18: ( VariableId | array )
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==VariableId) ) {
				alt134=1;
			}
			else if ( (LA134_0==LeftSquareBrace||LA134_0==TypeArray) ) {
				alt134=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}
			switch (alt134) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:19: VariableId
					{
					VariableId408=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3924); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId408_tree = 
					(CommonTree)adaptor.create(VariableId408)
					;
					adaptor.addChild(root_0, VariableId408_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3926);
					array409=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array409.getTree());

					}
					break;

			}

			string_literal410=(Token)match(input,As,FOLLOW_As_in_foreachLoop3929); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal410_tree = 
			(CommonTree)adaptor.create(string_literal410)
			;
			adaptor.addChild(root_0, string_literal410_tree);
			}

			VariableId411=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3931); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId411_tree = 
			(CommonTree)adaptor.create(VariableId411)
			;
			adaptor.addChild(root_0, VariableId411_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:53: ( '=>' VariableId )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==Arrow) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:702:54: '=>' VariableId
					{
					string_literal412=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal412_tree = 
					(CommonTree)adaptor.create(string_literal412)
					;
					adaptor.addChild(root_0, string_literal412_tree);
					}

					VariableId413=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3936); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId413_tree = 
					(CommonTree)adaptor.create(VariableId413)
					;
					adaptor.addChild(root_0, VariableId413_tree);
					}

					}
					break;

			}

			char_literal414=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3940); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal414_tree = 
			(CommonTree)adaptor.create(char_literal414)
			;
			adaptor.addChild(root_0, char_literal414_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3942);
			instructionInclBreakContinue415=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue415.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal416=null;
		Token char_literal417=null;
		Token char_literal419=null;
		ParserRuleReturnScope expression418 =null;
		ParserRuleReturnScope instructionInclBreakContinue420 =null;

		CommonTree string_literal416_tree=null;
		CommonTree char_literal417_tree=null;
		CommonTree char_literal419_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:705:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:705:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal416=(Token)match(input,While,FOLLOW_While_in_whileLoop3951); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal416_tree = 
			(CommonTree)adaptor.create(string_literal416)
			;
			adaptor.addChild(root_0, string_literal416_tree);
			}

			char_literal417=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3953); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal417_tree = 
			(CommonTree)adaptor.create(char_literal417)
			;
			adaptor.addChild(root_0, char_literal417_tree);
			}

			pushFollow(FOLLOW_expression_in_whileLoop3955);
			expression418=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression418.getTree());

			char_literal419=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3957); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal419_tree = 
			(CommonTree)adaptor.create(char_literal419)
			;
			adaptor.addChild(root_0, char_literal419_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3959);
			instructionInclBreakContinue420=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue420.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal421=null;
		Token string_literal423=null;
		Token char_literal424=null;
		Token char_literal426=null;
		Token char_literal427=null;
		ParserRuleReturnScope instructionInclBreakContinue422 =null;
		ParserRuleReturnScope expression425 =null;

		CommonTree string_literal421_tree=null;
		CommonTree string_literal423_tree=null;
		CommonTree char_literal424_tree=null;
		CommonTree char_literal426_tree=null;
		CommonTree char_literal427_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:708:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:708:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal421=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop3969); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal421_tree = 
			(CommonTree)adaptor.create(string_literal421)
			;
			adaptor.addChild(root_0, string_literal421_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3971);
			instructionInclBreakContinue422=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue422.getTree());

			string_literal423=(Token)match(input,While,FOLLOW_While_in_doWhileLoop3973); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal423_tree = 
			(CommonTree)adaptor.create(string_literal423)
			;
			adaptor.addChild(root_0, string_literal423_tree);
			}

			char_literal424=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3975); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal424_tree = 
			(CommonTree)adaptor.create(char_literal424)
			;
			adaptor.addChild(root_0, char_literal424_tree);
			}

			pushFollow(FOLLOW_expression_in_doWhileLoop3977);
			expression425=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression425.getTree());

			char_literal426=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3979); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal426_tree = 
			(CommonTree)adaptor.create(char_literal426)
			;
			adaptor.addChild(root_0, char_literal426_tree);
			}

			char_literal427=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3981); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal427_tree = 
			(CommonTree)adaptor.create(char_literal427)
			;
			adaptor.addChild(root_0, char_literal427_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal428=null;
		Token char_literal429=null;
		Token char_literal431=null;
		Token string_literal432=null;
		Token char_literal433=null;
		Token VariableId435=null;
		Token char_literal436=null;
		Token char_literal437=null;
		Token char_literal439=null;
		ParserRuleReturnScope instructionInclBreakContinue430 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject434 =null;
		ParserRuleReturnScope instructionInclBreakContinue438 =null;

		CommonTree string_literal428_tree=null;
		CommonTree char_literal429_tree=null;
		CommonTree char_literal431_tree=null;
		CommonTree string_literal432_tree=null;
		CommonTree char_literal433_tree=null;
		CommonTree VariableId435_tree=null;
		CommonTree char_literal436_tree=null;
		CommonTree char_literal437_tree=null;
		CommonTree char_literal439_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal428=(Token)match(input,Try,FOLLOW_Try_in_tryCatch3988); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal428_tree = 
			(CommonTree)adaptor.create(string_literal428)
			;
			adaptor.addChild(root_0, string_literal428_tree);
			}

			char_literal429=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3990); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal429_tree = 
			(CommonTree)adaptor.create(char_literal429)
			;
			adaptor.addChild(root_0, char_literal429_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:21: ( instructionInclBreakContinue )+
			int cnt136=0;
			loop136:
			do {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==Backslash||LA136_0==Break||LA136_0==Continue||LA136_0==Do||LA136_0==Echo||LA136_0==Exit||(LA136_0 >= For && LA136_0 <= Foreach)||(LA136_0 >= Identifier && LA136_0 <= If)||LA136_0==LeftCurlyBrace||LA136_0==MinusMinus||LA136_0==Parent||LA136_0==PlusPlus||LA136_0==Return||LA136_0==Self||(LA136_0 >= Switch && LA136_0 <= TypeString)||LA136_0==VariableId||LA136_0==While) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3992);
					instructionInclBreakContinue430=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue430.getTree());

					}
					break;

				default :
					if ( cnt136 >= 1 ) break loop136;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(136, input);
						throw eee;
				}
				cnt136++;
			} while (true);

			char_literal431=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3995); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal431_tree = 
			(CommonTree)adaptor.create(char_literal431)
			;
			adaptor.addChild(root_0, char_literal431_tree);
			}

			string_literal432=(Token)match(input,Catch,FOLLOW_Catch_in_tryCatch3997); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal432_tree = 
			(CommonTree)adaptor.create(string_literal432)
			;
			adaptor.addChild(root_0, string_literal432_tree);
			}

			char_literal433=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3999); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal433_tree = 
			(CommonTree)adaptor.create(char_literal433)
			;
			adaptor.addChild(root_0, char_literal433_tree);
			}

			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch4001);
			classInterfaceTypeInclObject434=classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject434.getTree());

			VariableId435=(Token)match(input,VariableId,FOLLOW_VariableId_in_tryCatch4003); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId435_tree = 
			(CommonTree)adaptor.create(VariableId435)
			;
			adaptor.addChild(root_0, VariableId435_tree);
			}

			char_literal436=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch4005); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal436_tree = 
			(CommonTree)adaptor.create(char_literal436)
			;
			adaptor.addChild(root_0, char_literal436_tree);
			}

			char_literal437=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch4006); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal437_tree = 
			(CommonTree)adaptor.create(char_literal437)
			;
			adaptor.addChild(root_0, char_literal437_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:114: ( instructionInclBreakContinue )*
			loop137:
			do {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==Backslash||LA137_0==Break||LA137_0==Continue||LA137_0==Do||LA137_0==Echo||LA137_0==Exit||(LA137_0 >= For && LA137_0 <= Foreach)||(LA137_0 >= Identifier && LA137_0 <= If)||LA137_0==LeftCurlyBrace||LA137_0==MinusMinus||LA137_0==Parent||LA137_0==PlusPlus||LA137_0==Return||LA137_0==Self||(LA137_0 >= Switch && LA137_0 <= TypeString)||LA137_0==VariableId||LA137_0==While) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch4008);
					instructionInclBreakContinue438=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue438.getTree());

					}
					break;

				default :
					break loop137;
				}
			} while (true);

			char_literal439=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch4011); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal439_tree = 
			(CommonTree)adaptor.create(char_literal439)
			;
			adaptor.addChild(root_0, char_literal439_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class throwException_return extends ParserRuleReturnScope {
		CommonTree tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:712:1: throwException : 'throw' newObject ';' ;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal440=null;
		Token char_literal442=null;
		ParserRuleReturnScope newObject441 =null;

		CommonTree string_literal440_tree=null;
		CommonTree char_literal442_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:713:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:713:4: 'throw' newObject ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal440=(Token)match(input,Throw,FOLLOW_Throw_in_throwException4020); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal440_tree = 
			(CommonTree)adaptor.create(string_literal440)
			;
			adaptor.addChild(root_0, string_literal440_tree);
			}

			pushFollow(FOLLOW_newObject_in_throwException4022);
			newObject441=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject441.getTree());

			char_literal442=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException4024); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal442_tree = 
			(CommonTree)adaptor.create(char_literal442)
			;
			adaptor.addChild(root_0, char_literal442_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, throwException_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "throwException"

	// $ANTLR start synpred69_TSPHP
	public final void synpred69_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred69_TSPHP1903);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP1905); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred70_TSPHP
	public final void synpred70_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred70_TSPHP1911);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred70_TSPHP1913); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred70_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: ( functionCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: functionCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1959);
		functionCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP1961); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred80_TSPHP
	public final void synpred80_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: ( methodCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: methodCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1967);
		methodCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred80_TSPHP1969); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred80_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred101_TSPHP2251); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred101_TSPHP2254);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:436:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred102_TSPHP2270); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred102_TSPHP2273);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:439:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred103_TSPHP2289); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred103_TSPHP2292);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:442:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred104_TSPHP2306);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred104_TSPHP2309);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred131_TSPHP
	public final void synpred131_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred131_TSPHP2619); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutResource_in_synpred131_TSPHP2621);
		allTypesWithoutResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred131_TSPHP2623); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2625);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred131_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: ( functionCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: functionCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2887);
		functionCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: ( methodCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: methodCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2892);
		methodCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred153_TSPHP
	public final void synpred153_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred153_TSPHP2925);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred153_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:4: ( functionCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:4: functionCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_functionCall_in_synpred154_TSPHP2923);
		functionCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: ( callOrAccess )*
		loop154:
		do {
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==ObjectOperator) ) {
				int LA154_1 = input.LA(2);
				if ( (synpred153_TSPHP()) ) {
					alt154=1;
				}

			}
			else if ( (LA154_0==LeftSquareBrace) ) {
				alt154=1;
			}

			switch (alt154) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred154_TSPHP2925);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop154;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred154_TSPHP2928);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred160_TSPHP3020);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred161_TSPHP
	public final void synpred161_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:5: ( methodCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:5: methodCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_methodCall_in_synpred161_TSPHP3018);
		methodCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: ( callOrAccess )*
		loop155:
		do {
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==ObjectOperator) ) {
				int LA155_1 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt155=1;
				}

			}
			else if ( (LA155_0==LeftSquareBrace) ) {
				alt155=1;
			}

			switch (alt155) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:16: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred161_TSPHP3020);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop155;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred161_TSPHP3023);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred161_TSPHP

	// $ANTLR start synpred166_TSPHP
	public final void synpred166_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred166_TSPHP3083);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred166_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: ( variableMemberStaticMember )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: variableMemberStaticMember
		{
		pushFollow(FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP3088);
		variableMemberStaticMember();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred168_TSPHP
	public final void synpred168_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred168_TSPHP3093);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred168_TSPHP

	// $ANTLR start synpred169_TSPHP
	public final void synpred169_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred169_TSPHP3098);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred169_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred181_TSPHP3688);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred181_TSPHP3690); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred182_TSPHP3701);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred182_TSPHP3703); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:676:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred184_TSPHP3734); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3736);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred184_TSPHP

	// $ANTLR start synpred192_TSPHP
	public final void synpred192_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt164=0;
		loop164:
		do {
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==Case) ) {
				alt164=1;
			}

			switch (alt164) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( caseLabel )+
				int cnt162=0;
				loop162:
				do {
					int alt162=2;
					int LA162_0 = input.LA(1);
					if ( (LA162_0==Case) ) {
						alt162=1;
					}

					switch (alt162) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3771);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:16: ( instructionInclBreakContinue )+
				int cnt163=0;
				loop163:
				do {
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==Backslash||LA163_0==Break||LA163_0==Continue||LA163_0==Do||LA163_0==Echo||LA163_0==Exit||(LA163_0 >= For && LA163_0 <= Foreach)||(LA163_0 >= Identifier && LA163_0 <= If)||LA163_0==LeftCurlyBrace||LA163_0==MinusMinus||LA163_0==Parent||LA163_0==PlusPlus||LA163_0==Return||LA163_0==Self||(LA163_0 >= Switch && LA163_0 <= TypeString)||LA163_0==VariableId||LA163_0==While) ) {
						alt163=1;
					}

					switch (alt163) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3774);
						instructionInclBreakContinue();
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

		pushFollow(FOLLOW_defaultLabel_in_synpred192_TSPHP3779);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:61: ( instructionInclBreakContinue )+
		int cnt165=0;
		loop165:
		do {
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==Backslash||LA165_0==Break||LA165_0==Continue||LA165_0==Do||LA165_0==Echo||LA165_0==Exit||(LA165_0 >= For && LA165_0 <= Foreach)||(LA165_0 >= Identifier && LA165_0 <= If)||LA165_0==LeftCurlyBrace||LA165_0==MinusMinus||LA165_0==Parent||LA165_0==PlusPlus||LA165_0==Return||LA165_0==Self||(LA165_0 >= Switch && LA165_0 <= TypeString)||LA165_0==VariableId||LA165_0==While) ) {
				alt165=1;
			}

			switch (alt165) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3781);
				instructionInclBreakContinue();
				state._fsp--;
				if (state.failed) return ;

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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt168=0;
		loop168:
		do {
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==Case) ) {
				alt168=1;
			}

			switch (alt168) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: ( caseLabel )+
				int cnt166=0;
				loop166:
				do {
					int alt166=2;
					int LA166_0 = input.LA(1);
					if ( (LA166_0==Case) ) {
						alt166=1;
					}

					switch (alt166) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3785);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;

						}
						break;

					default :
						if ( cnt166 >= 1 ) break loop166;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(166, input);
							throw eee;
					}
					cnt166++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:103: ( instructionInclBreakContinue )+
				int cnt167=0;
				loop167:
				do {
					int alt167=2;
					int LA167_0 = input.LA(1);
					if ( (LA167_0==Backslash||LA167_0==Break||LA167_0==Continue||LA167_0==Do||LA167_0==Echo||LA167_0==Exit||(LA167_0 >= For && LA167_0 <= Foreach)||(LA167_0 >= Identifier && LA167_0 <= If)||LA167_0==LeftCurlyBrace||LA167_0==MinusMinus||LA167_0==Parent||LA167_0==PlusPlus||LA167_0==Return||LA167_0==Self||(LA167_0 >= Switch && LA167_0 <= TypeString)||LA167_0==VariableId||LA167_0==While) ) {
						alt167=1;
					}

					switch (alt167) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3788);
						instructionInclBreakContinue();
						state._fsp--;
						if (state.failed) return ;

						}
						break;

					default :
						if ( cnt167 >= 1 ) break loop167;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(167, input);
							throw eee;
					}
					cnt167++;
				} while (true);

				}
				break;

			default :
				if ( cnt168 >= 1 ) break loop168;
				if (state.backtracking>0) {state.failed=true; return ;}
					EarlyExitException eee =
						new EarlyExitException(168, input);
					throw eee;
			}
			cnt168++;
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
	protected DFA49 dfa49 = new DFA49(this);
	protected DFA104 dfa104 = new DFA104(this);
	protected DFA131 dfa131 = new DFA131(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\66\1\uffff\1\12\1\uffff\1\66\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\u0083\1\74\1\uffff\1\152\1\uffff\1\66\1\uffff\1\152";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\14\uffff\1\2\4\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\4\uffff"+
			"\1\1\11\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\14\2\2"+
			"\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\61\uffff\1\4\55\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\61\uffff\1\4\55\uffff\1\6"
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
			return "184:1: prog : ( ( namespaceSemicolon )+ EOF !| ( namespaceBracket )+ EOF !| withoutNamespace EOF !);";
		}
	}

	static final String DFA49_eotS =
		"\37\uffff";
	static final String DFA49_eofS =
		"\13\uffff\1\17\20\uffff\1\17\2\uffff";
	static final String DFA49_minS =
		"\1\12\10\u0081\1\66\1\12\1\7\1\66\1\uffff\1\12\2\uffff\1\12\10\u0081\1"+
		"\66\1\12\1\7\1\66\1\12";
	static final String DFA49_maxS =
		"\1\174\10\u0081\1\66\1\u0081\1\174\1\66\1\uffff\1\174\2\uffff\11\u0081"+
		"\1\66\1\u0081\1\145\1\66\1\u0081";
	static final String DFA49_acceptS =
		"\15\uffff\1\1\1\uffff\1\2\1\3\16\uffff";
	static final String DFA49_specialS =
		"\37\uffff}>";
	static final String[] DFA49_transitionS = {
			"\1\11\53\uffff\1\12\76\uffff\1\6\1\1\1\2\1\4\1\3\1\10\1\7\1\5",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\13",
			"\1\12",
			"\1\14\166\uffff\1\13",
			"\1\15\2\uffff\1\20\17\uffff\1\16\33\uffff\1\20\56\uffff\1\17\17\uffff"+
			"\10\20",
			"\1\21",
			"",
			"\1\32\53\uffff\1\33\76\uffff\1\27\1\22\1\23\1\25\1\24\1\31\1\30\1\26",
			"",
			"",
			"\1\14\166\uffff\1\13",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\34",
			"\1\33",
			"\1\35\166\uffff\1\34",
			"\1\20\22\uffff\1\17\112\uffff\1\17",
			"\1\36",
			"\1\35\166\uffff\1\34"
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
			return "342:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA104_eotS =
		"\12\uffff";
	static final String DFA104_eofS =
		"\12\uffff";
	static final String DFA104_minS =
		"\1\12\3\66\1\12\2\uffff\2\66\1\12";
	static final String DFA104_maxS =
		"\3\u0081\1\66\1\46\2\uffff\1\66\1\u0081\1\46";
	static final String DFA104_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA104_specialS =
		"\12\uffff}>";
	static final String[] DFA104_transitionS = {
			"\1\3\53\uffff\1\4\41\uffff\1\2\20\uffff\1\1\10\uffff\1\5\16\uffff\1\5",
			"\1\6\112\uffff\1\5",
			"\1\6\112\uffff\1\5",
			"\1\4",
			"\1\7\33\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\112\uffff\1\5",
			"\1\7\33\uffff\1\10"
	};

	static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
	static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
	static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
	static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
	static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
	static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
	static final short[][] DFA104_transition;

	static {
		int numStates = DFA104_transitionS.length;
		DFA104_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
		}
	}

	class DFA104 extends DFA {

		public DFA104(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 104;
			this.eot = DFA104_eot;
			this.eof = DFA104_eof;
			this.min = DFA104_min;
			this.max = DFA104_max;
			this.accept = DFA104_accept;
			this.special = DFA104_special;
			this.transition = DFA104_transition;
		}
		@Override
		public String getDescription() {
			return "577:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )";
		}
	}

	static final String DFA131_eotS =
		"\7\uffff";
	static final String DFA131_eofS =
		"\7\uffff";
	static final String DFA131_minS =
		"\1\12\1\uffff\1\66\1\12\1\uffff\1\66\1\12";
	static final String DFA131_maxS =
		"\1\u0081\1\uffff\1\66\1\u0081\1\uffff\1\66\1\u0081";
	static final String DFA131_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA131_specialS =
		"\7\uffff}>";
	static final String[] DFA131_transitionS = {
			"\1\2\53\uffff\1\3\22\uffff\1\4\16\uffff\1\4\2\uffff\1\4\15\uffff\1\4"+
			"\10\uffff\1\4\2\uffff\10\1\4\uffff\1\4",
			"",
			"\1\3",
			"\1\5\33\uffff\1\4\132\uffff\1\1",
			"",
			"\1\6",
			"\1\5\33\uffff\1\4\132\uffff\1\1"
	};

	static final short[] DFA131_eot = DFA.unpackEncodedString(DFA131_eotS);
	static final short[] DFA131_eof = DFA.unpackEncodedString(DFA131_eofS);
	static final char[] DFA131_min = DFA.unpackEncodedStringToUnsignedChars(DFA131_minS);
	static final char[] DFA131_max = DFA.unpackEncodedStringToUnsignedChars(DFA131_maxS);
	static final short[] DFA131_accept = DFA.unpackEncodedString(DFA131_acceptS);
	static final short[] DFA131_special = DFA.unpackEncodedString(DFA131_specialS);
	static final short[][] DFA131_transition;

	static {
		int numStates = DFA131_transitionS.length;
		DFA131_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA131_transition[i] = DFA.unpackEncodedString(DFA131_transitionS[i]);
		}
	}

	class DFA131 extends DFA {

		public DFA131(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 131;
			this.eot = DFA131_eot;
			this.eof = DFA131_eof;
			this.min = DFA131_min;
			this.max = DFA131_max;
			this.accept = DFA131_accept;
			this.special = DFA131_special;
			this.transition = DFA131_transition;
		}
		@Override
		public String getDescription() {
			return "697:11: ( variableDeclaration | variableAssignment )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog963 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon979 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon981 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon983 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon985 = new BitSet(new long[]{0x18C3A90410800412L,0x9FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket998 = new BitSet(new long[]{0x1040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket1000 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket1003 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_statement_in_namespaceBracket1005 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1104 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1107 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1109 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1122 = new BitSet(new long[]{0x18C3A90410800412L,0x9FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1155 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1157 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1160 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1162 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1179 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1181 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1183 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1192 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1193 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1205 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1257 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1259 = new BitSet(new long[]{0x1100100000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1261 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1264 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1267 = new BitSet(new long[]{0x0002200010000010L,0x0000800310000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1269 = new BitSet(new long[]{0x0002200010000010L,0x0000801310000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1286 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1297 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1300 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1302 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1313 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1348 = new BitSet(new long[]{0x0000000000000000L,0x13C0000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1350 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1352 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1355 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1357 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1371 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1374 = new BitSet(new long[]{0x0440400000040000L,0x0001000002080080L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1389 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1391 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1428 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1431 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1434 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1436 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1453 = new BitSet(new long[]{0x0002000000000000L,0x0000000300000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1455 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1469 = new BitSet(new long[]{0x0002200000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1471 = new BitSet(new long[]{0x0002000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1479 = new BitSet(new long[]{0x0002000000000000L,0x0000800310000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1481 = new BitSet(new long[]{0x0002000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1495 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1512 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1514 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1516 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1519 = new BitSet(new long[]{0x0002000010000000L,0x0000001200000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1521 = new BitSet(new long[]{0x0002000010000000L,0x0000001200000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1549 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1552 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1570 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1572 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1574 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1587 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1589 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1591 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1593 = new BitSet(new long[]{0x0040000000000400L,0x1FE0002000000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1595 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBool_in_primitiveTypes1649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeBoolean_in_primitiveTypes1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeInt_in_primitiveTypes1663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeFloat_in_primitiveTypes1668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeString_in_primitiveTypes1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1721 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1755 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1758 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1760 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1767 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1770 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1772 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1779 = new BitSet(new long[]{0x0040000004000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1782 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1784 = new BitSet(new long[]{0x0040000004000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1789 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1791 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1817 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1820 = new BitSet(new long[]{0x0440400000040000L,0x0001000002080080L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1844 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1846 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1866 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1868 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1882 = new BitSet(new long[]{0x0400000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1888 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1903 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1911 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1959 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1967 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1976 = new BitSet(new long[]{0x6440400001042500L,0x002506000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction1978 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1987 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_instruction1989 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1997 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2012 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList2015 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList2018 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2029 = new BitSet(new long[]{0x0000002200029080L,0x0000500004002900L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2031 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_variableAssignment2038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000200L});
	public static final BitSet FOLLOW_PlusPlus_in_postIncrementDecrement2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MinusMinus_in_postIncrementDecrement2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PlusPlus_in_preIncrementDecrement2165 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_MinusMinus_in_preIncrementDecrement2167 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2196 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2199 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2236 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2251 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2270 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2289 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_ternary_in_assignment2303 = new BitSet(new long[]{0x0000002200029082L,0x0000500004002900L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2306 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2309 = new BitSet(new long[]{0x0000002200029082L,0x0000500004002900L});
	public static final BitSet FOLLOW_logicOr_in_ternary2319 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2322 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_ternary2325 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2327 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_ternary2330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2343 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2346 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2358 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2372 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2375 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2378 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2389 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2392 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2395 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2406 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2409 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2412 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2421 = new BitSet(new long[]{0x0020040000000002L,0x0000000000070000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2424 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_equality2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2469 = new BitSet(new long[]{0x800C000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2472 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2511 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2514 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2521 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2531 = new BitSet(new long[]{0x0000001000000002L,0x0000000002000080L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2534 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2543 = new BitSet(new long[]{0x0000001000000002L,0x0000000002000080L});
	public static final BitSet FOLLOW_logicNot_in_factor2553 = new BitSet(new long[]{0x0000000100000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_set_in_factor2556 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicNot_in_factor2565 = new BitSet(new long[]{0x0000000100000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2574 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2594 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2597 = new BitSet(new long[]{0x0040000000000400L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2619 = new BitSet(new long[]{0x0040000000000400L,0x17E0000000000000L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2621 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2623 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2641 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2649 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2669 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_newOrClone2672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_newOrClone2682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2697 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2699 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2705 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2707 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2713 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2715 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccessOrParent2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccessOrParent2742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2747 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_memberAccessOrArrayAccess2759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccess2774 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccess2776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2786 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2788 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2803 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2805 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2808 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_newObject2810 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary2841 = new BitSet(new long[]{0x6440400000040400L,0x0025020009080200L,0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary2861 = new BitSet(new long[]{0x6440400000040400L,0x0025020009080200L,0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2909 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2923 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2925 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2947 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2949 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2951 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess2970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call2983 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call2985 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call2987 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_call2989 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd3002 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd3004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3018 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd3020 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_methodCall3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall3046 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_methodCall3051 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3054 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall3056 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_methodCall3058 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3070 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_atom3072 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_atom3088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3131 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3145 = new BitSet(new long[]{0x0440400000040000L,0x0001000000080000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3152 = new BitSet(new long[]{0x0440400000040000L,0x0001000000080000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3657 = new BitSet(new long[]{0x6440400001042500L,0x002502400B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_array_content_in_array3659 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3668 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3670 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_array_content_in_array3672 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3688 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3690 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3694 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3698 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3701 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3703 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3707 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3719 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3721 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_ifCondition3723 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3725 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3727 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3734 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3752 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3756 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3758 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3760 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3771 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3774 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3779 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3781 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3785 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3788 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3798 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3801 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3807 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3809 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3832 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_caseLabel3834 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3845 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3856 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3858 = new BitSet(new long[]{0x0040000000000400L,0x1FE4060009000200L,0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forLoop3860 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3863 = new BitSet(new long[]{0x6440400001042500L,0x002506000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3865 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3869 = new BitSet(new long[]{0x0040000000000400L,0x0004022009000200L,0x0000000000000002L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3871 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3874 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3885 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3887 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3891 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3893 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3903 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3906 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3908 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3919 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3921 = new BitSet(new long[]{0x4000000000000000L,0x0020000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3924 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3926 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3931 = new BitSet(new long[]{0x0000000000000020L,0x0000002000000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3936 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3940 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3951 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3953 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_whileLoop3955 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3957 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3969 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3973 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3975 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3977 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3979 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3988 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3990 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3992 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3995 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3997 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3999 = new BitSet(new long[]{0x0040000000000400L,0x0400000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch4003 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch4005 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch4006 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch4008 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch4011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException4020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_newObject_in_throwException4022 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException4024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred69_TSPHP1903 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred70_TSPHP1911 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred70_TSPHP1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1959 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1967 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred80_TSPHP1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred101_TSPHP2251 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred101_TSPHP2254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred102_TSPHP2270 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred102_TSPHP2273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred103_TSPHP2289 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred103_TSPHP2292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred104_TSPHP2306 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_synpred104_TSPHP2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred131_TSPHP2619 = new BitSet(new long[]{0x0040000000000400L,0x17E0000000000000L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_synpred131_TSPHP2621 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred131_TSPHP2623 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred153_TSPHP2925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_synpred154_TSPHP2923 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred154_TSPHP2925 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred154_TSPHP2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred160_TSPHP3020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_synpred161_TSPHP3018 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred161_TSPHP3020 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred161_TSPHP3023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred166_TSPHP3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP3088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred168_TSPHP3093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred169_TSPHP3098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred181_TSPHP3688 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred181_TSPHP3690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred182_TSPHP3701 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred182_TSPHP3703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred184_TSPHP3734 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3771 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3774 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_defaultLabel_in_synpred192_TSPHP3779 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3781 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3785 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x000000000000000AL});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3788 = new BitSet(new long[]{0x10C1890420280402L,0x1FFE020809000200L,0x000000000000000AL});
}
