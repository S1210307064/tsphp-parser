// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-19 22:49:25

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "CAST", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "POST_INCREMENT", "PRE_INCREMENT", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UMINUS", "UPLUS", "Use", "VariableId", "Void", "While", "Whitespace"
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
	public static final int POST_INCREMENT=86;
	public static final int PRE_INCREMENT=87;
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
	public static final int VariableId=128;
	public static final int Void=129;
	public static final int While=130;
	public static final int Whitespace=131;

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:8: ( namespaceSemicolon )+ EOF
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog941);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog944); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF2_tree = 
					(CommonTree)adaptor.create(EOF2)
					;
					adaptor.addChild(root_0, EOF2_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: ( namespaceBracket )+ EOF
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:184:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog949);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog952); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF4_tree = 
					(CommonTree)adaptor.create(EOF4)
					;
					adaptor.addChild(root_0, EOF4_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:4: withoutNamespace EOF
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog957);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog959); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF6_tree = 
					(CommonTree)adaptor.create(EOF6)
					;
					adaptor.addChild(root_0, EOF6_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:188:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon972); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(CommonTree)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon974);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon976); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(CommonTree)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==Parent||LA4_0==PlusPlus||LA4_0==Return||LA4_0==Self||(LA4_0 >= Switch && LA4_0 <= TypeString)||(LA4_0 >= Use && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:189:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon978);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:191:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket991); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(CommonTree)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket993);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket996); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(CommonTree)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==Parent||LA6_0==PlusPlus||LA6_0==Return||LA6_0==Self||(LA6_0 >= Switch && LA6_0 <= TypeString)||(LA6_0 >= Use && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:192:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket998);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket1001); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: Identifier ( '\\\\' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1097); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier16_tree = 
			(CommonTree)adaptor.create(Identifier16)
			;
			adaptor.addChild(root_0, Identifier16_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = 
					(CommonTree)adaptor.create(char_literal17)
					;
					adaptor.addChild(root_0, char_literal17_tree);
					}

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1102); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:206:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:4: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==Parent||LA8_0==PlusPlus||LA8_0==Return||LA8_0==Self||(LA8_0 >= Switch && LA8_0 <= TypeString)||(LA8_0 >= Use && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1115);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:209:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:4: useDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1126);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: definition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1131);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:4: instructionWithoutBreakContinue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1136);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:215:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1148); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(CommonTree)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1150);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1153); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(CommonTree)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1155);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1159); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1172); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(CommonTree)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1174); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(CommonTree)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1176);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:7: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(CommonTree)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1186);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(CommonTree)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1200); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:224:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:225:4: classDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1213);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:4: interfaceDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1218);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: functionDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1223);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:228:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1228);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:4: ( 'abstract' | 'final' )?
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1250); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(CommonTree)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1252); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(CommonTree)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1254);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1257);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1260); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(CommonTree)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:235:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1262);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1265); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:238:1: extendsDeclaration : 'extends' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:4: 'extends' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1279); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(CommonTree)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1281);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:1: identifierList : Identifier ( ',' Identifier )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: Identifier ( ',' Identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1290); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(CommonTree)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1293); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(CommonTree)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1295); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:1: implementsDeclaration : 'implements' identifierList ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:4: 'implements' identifierList
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1306); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(CommonTree)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1308);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:247:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1318);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: attributeDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1323);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:250:4: methodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1329);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:253:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1341); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(CommonTree)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1343);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1345);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(CommonTree)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1350);
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

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1354); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:256:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1364); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(CommonTree)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1367); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(CommonTree)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1369);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:259:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: ( 'static' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Static) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:4: 'static'
					{
					string_literal66=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1379); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal66_tree = 
					(CommonTree)adaptor.create(string_literal66)
					;
					adaptor.addChild(root_0, string_literal66_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1382);
			accessor67=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor67.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1384);
			variableDeclarationListInclVariableId68=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId68.getTree());

			char_literal69=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1386); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:1: accessor : ( accessorWithoutPrivate | 'private' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:9: ( accessorWithoutPrivate | 'private' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:11: accessorWithoutPrivate
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1393);
					accessorWithoutPrivate70=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate70.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:4: 'private'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal71=(Token)match(input,Private,FOLLOW_Private_in_accessor1398); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:266:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set72=null;

		CommonTree set72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:267:2: ( 'protected' | 'public' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1421);
			variableDeclaration73=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration73.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:24: ( ',' ( variableAssignment | VariableId ) )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Comma) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:25: ',' ( variableAssignment | VariableId )
					{
					char_literal74=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1424); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal74_tree = 
					(CommonTree)adaptor.create(char_literal74)
					;
					adaptor.addChild(root_0, char_literal74_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:29: ( variableAssignment | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1427);
							variableAssignment75=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment75.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:270:49: VariableId
							{
							VariableId76=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1429); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:273:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1446); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal77_tree = 
					(CommonTree)adaptor.create(string_literal77)
					;
					adaptor.addChild(root_0, string_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:17: ( accessorWithoutPrivate )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= Protected && LA25_0 <= Public)) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1448);
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:6: 'static' ( 'final' )?
							{
							string_literal79=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1462); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = 
							(CommonTree)adaptor.create(string_literal79)
							;
							adaptor.addChild(root_0, string_literal79_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:15: ( 'final' )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==Final) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:15: 'final'
									{
									string_literal80=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1464); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:6: 'final' ( 'static' )?
							{
							string_literal81=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1472); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal81_tree = 
							(CommonTree)adaptor.create(string_literal81)
							;
							adaptor.addChild(root_0, string_literal81_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:14: ( 'static' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Static) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:14: 'static'
									{
									string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1474); if (state.failed) return retval;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:6: ( accessor )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Private||(LA29_0 >= Protected && LA29_0 <= Public)) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:279:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1488);
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

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1495);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal85=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1505); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal85_tree = 
			(CommonTree)adaptor.create(string_literal85)
			;
			adaptor.addChild(root_0, string_literal85_tree);
			}

			Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1507); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier86_tree = 
			(CommonTree)adaptor.create(Identifier86)
			;
			adaptor.addChild(root_0, Identifier86_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:27: ( implementsDeclaration )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Implements) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1509);
					implementsDeclaration87=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration87.getTree());

					}
					break;

			}

			char_literal88=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1512); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal88_tree = 
			(CommonTree)adaptor.create(char_literal88)
			;
			adaptor.addChild(root_0, char_literal88_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:54: ( interfaceBody )*
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==Const||LA32_0==Function||LA32_0==Public) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:283:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1514);
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

			char_literal90=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1517); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope constDeclarationList91 =null;
		ParserRuleReturnScope interfaceMethodDeclaration92 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:2: ( constDeclarationList | interfaceMethodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: constDeclarationList
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1526);
					constDeclarationList91=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList91.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:287:4: interfaceMethodDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1531);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: ( 'public' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Public) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:291:4: 'public'
					{
					string_literal93=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = 
					(CommonTree)adaptor.create(string_literal93)
					;
					adaptor.addChild(root_0, string_literal93_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1545);
			functionDeclarationWithoutBody94=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody94.getTree());

			char_literal95=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1547); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1563);
			functionDeclarationWithoutBody96=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody96.getTree());

			char_literal97=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1565); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = 
			(CommonTree)adaptor.create(char_literal97)
			;
			adaptor.addChild(root_0, char_literal97_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:40: ( instructionWithoutBreakContinue )*
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Backslash||LA35_0==Do||LA35_0==Echo||LA35_0==Exit||(LA35_0 >= For && LA35_0 <= Foreach)||(LA35_0 >= Identifier && LA35_0 <= If)||LA35_0==LeftCurlyBrace||LA35_0==MinusMinus||LA35_0==Parent||LA35_0==PlusPlus||LA35_0==Return||LA35_0==Self||(LA35_0 >= Switch && LA35_0 <= TypeString)||LA35_0==VariableId||LA35_0==While) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1567);
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

			char_literal99=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1570); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal100=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1580); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal100_tree = 
			(CommonTree)adaptor.create(string_literal100)
			;
			adaptor.addChild(root_0, string_literal100_tree);
			}

			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1582);
			returnType101=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType101.getTree());

			Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1584); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier102_tree = 
			(CommonTree)adaptor.create(Identifier102)
			;
			adaptor.addChild(root_0, Identifier102_tree);
			}

			char_literal103=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1586); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal103_tree = 
			(CommonTree)adaptor.create(char_literal103)
			;
			adaptor.addChild(root_0, char_literal103_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:41: ( paramList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Backslash||LA36_0==Identifier||(LA36_0 >= TypeArray && LA36_0 <= TypeString)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1588);
					paramList104=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList104.getTree());

					}
					break;

			}

			char_literal105=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1591); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:1: returnType : ( allTypes | 'void' );
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

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:2: ( allTypes | 'void' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:4: allTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1601);
					allTypes106=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes106.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:15: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal107=(Token)match(input,Void,FOLLOW_Void_in_returnType1605); if (state.failed) return retval;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended108 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject109 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:11: primitiveTypesExtended
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1612);
					primitiveTypesExtended108=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended108.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:36: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1616);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:1: allTypesWithoutResource : ( primitiveTypesInclArray | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypesWithoutResource_return allTypesWithoutResource() throws RecognitionException {
		TSPHPParser.allTypesWithoutResource_return retval = new TSPHPParser.allTypesWithoutResource_return();
		retval.start = input.LT(1);
		int allTypesWithoutResource_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primitiveTypesInclArray110 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject111 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:2: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1625);
					primitiveTypesInclArray110=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray110.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:5: classInterfaceTypeInclObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1631);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set112=null;

		CommonTree set112_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:314:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set112=(Token)input.LT(1);
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set112)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:321:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeArray114=null;
		ParserRuleReturnScope primitiveTypes113 =null;

		CommonTree TypeArray114_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:322:4: primitiveTypes
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1674);
					primitiveTypes113=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes113.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: TypeArray
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray114=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1679); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray114_tree = 
					(CommonTree)adaptor.create(TypeArray114)
					;
					adaptor.addChild(root_0, TypeArray114_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeResource116=null;
		ParserRuleReturnScope primitiveTypesInclArray115 =null;

		CommonTree TypeResource116_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:4: primitiveTypesInclArray
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1691);
					primitiveTypesInclArray115=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray115.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: TypeResource
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeResource116=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1696); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource116_tree = 
					(CommonTree)adaptor.create(TypeResource116)
					;
					adaptor.addChild(root_0, TypeResource116_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal117=null;
		ParserRuleReturnScope namespaceId118 =null;

		CommonTree char_literal117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: ( '\\\\' )? namespaceId
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: ( '\\\\' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Backslash) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: '\\\\'
					{
					char_literal117=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1710); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal117_tree = 
					(CommonTree)adaptor.create(char_literal117)
					;
					adaptor.addChild(root_0, char_literal117_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1713);
			namespaceId118=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId118.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:336:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TypeObject119=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject120 =null;

		CommonTree TypeObject119_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:4: TypeObject
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeObject119=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1726); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject119_tree = 
					(CommonTree)adaptor.create(TypeObject119)
					;
					adaptor.addChild(root_0, TypeObject119_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: classInterfaceTypeWithoutObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1732);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal122=null;
		Token char_literal125=null;
		Token char_literal129=null;
		Token char_literal130=null;
		ParserRuleReturnScope paramDeclarationOptional121 =null;
		ParserRuleReturnScope paramDeclarationOptional123 =null;
		ParserRuleReturnScope paramDeclaration124 =null;
		ParserRuleReturnScope paramDeclaration126 =null;
		ParserRuleReturnScope paramDeclaration127 =null;
		ParserRuleReturnScope paramDeclaration128 =null;
		ParserRuleReturnScope paramDeclarationOptional131 =null;

		CommonTree char_literal122_tree=null;
		CommonTree char_literal125_tree=null;
		CommonTree char_literal129_tree=null;
		CommonTree char_literal130_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt48=3;
			alt48 = dfa48.predict(input);
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1744);
					paramDeclarationOptional121=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional121.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:29: ( ',' paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:342:30: ',' paramDeclarationOptional
							{
							char_literal122=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1747); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal122_tree = 
							(CommonTree)adaptor.create(char_literal122)
							;
							adaptor.addChild(root_0, char_literal122_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1749);
							paramDeclarationOptional123=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional123.getTree());

							}
							break;

						default :
							break loop44;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:4: paramDeclaration ( ',' paramDeclaration )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1756);
					paramDeclaration124=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration124.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:21: ( ',' paramDeclaration )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:343:22: ',' paramDeclaration
							{
							char_literal125=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1759); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal125_tree = 
							(CommonTree)adaptor.create(char_literal125)
							;
							adaptor.addChild(root_0, char_literal125_tree);
							}

							pushFollow(FOLLOW_paramDeclaration_in_paramList1761);
							paramDeclaration126=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration126.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1768);
					paramDeclaration127=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration127.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:21: ( paramDeclaration ',' )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Backslash||LA46_0==Identifier||(LA46_0 >= TypeArray && LA46_0 <= TypeString)) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1771);
							paramDeclaration128=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration128.getTree());

							char_literal129=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1773); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal129_tree = 
							(CommonTree)adaptor.create(char_literal129)
							;
							adaptor.addChild(root_0, char_literal129_tree);
							}

							}
							break;

						default :
							break loop46;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:45: ( ',' paramDeclarationOptional )+
					int cnt47=0;
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Comma) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:344:46: ',' paramDeclarationOptional
							{
							char_literal130=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1778); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal130_tree = 
							(CommonTree)adaptor.create(char_literal130)
							;
							adaptor.addChild(root_0, char_literal130_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1780);
							paramDeclarationOptional131=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional131.getTree());

							}
							break;

						default :
							if ( cnt47 >= 1 ) break loop47;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(47, input);
								throw eee;
						}
						cnt47++;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:1: paramDeclaration : allTypes VariableId ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId133=null;
		ParserRuleReturnScope allTypes132 =null;

		CommonTree VariableId133_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: allTypes VariableId
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_paramDeclaration1794);
			allTypes132=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes132.getTree());

			VariableId133=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1796); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId133_tree = 
			(CommonTree)adaptor.create(VariableId133)
			;
			adaptor.addChild(root_0, VariableId133_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:350:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal135=null;
		ParserRuleReturnScope paramDeclaration134 =null;
		ParserRuleReturnScope unaryPrimitiveAtom136 =null;

		CommonTree char_literal135_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1806);
			paramDeclaration134=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration134.getTree());

			char_literal135=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1809); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal135_tree = 
			(CommonTree)adaptor.create(char_literal135)
			;
			adaptor.addChild(root_0, char_literal135_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1811);
			unaryPrimitiveAtom136=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom136.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:356:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal137=null;
		Token char_literal139=null;
		ParserRuleReturnScope instructionWithoutBreakContinue138 =null;
		ParserRuleReturnScope instruction140 =null;

		CommonTree char_literal137_tree=null;
		CommonTree char_literal139_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LeftCurlyBrace) ) {
				alt50=1;
			}
			else if ( (LA50_0==Backslash||LA50_0==Do||LA50_0==Echo||LA50_0==Exit||(LA50_0 >= For && LA50_0 <= Foreach)||(LA50_0 >= Identifier && LA50_0 <= If)||LA50_0==MinusMinus||LA50_0==Parent||LA50_0==PlusPlus||LA50_0==Return||LA50_0==Self||(LA50_0 >= Switch && LA50_0 <= TypeString)||LA50_0==VariableId||LA50_0==While) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal137=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1833); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal137_tree = 
					(CommonTree)adaptor.create(char_literal137)
					;
					adaptor.addChild(root_0, char_literal137_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:8: ( instructionWithoutBreakContinue )+
					int cnt49=0;
					loop49:
					do {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==Backslash||LA49_0==Do||LA49_0==Echo||LA49_0==Exit||(LA49_0 >= For && LA49_0 <= Foreach)||(LA49_0 >= Identifier && LA49_0 <= If)||LA49_0==LeftCurlyBrace||LA49_0==MinusMinus||LA49_0==Parent||LA49_0==PlusPlus||LA49_0==Return||LA49_0==Self||(LA49_0 >= Switch && LA49_0 <= TypeString)||LA49_0==VariableId||LA49_0==While) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1835);
							instructionWithoutBreakContinue138=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue138.getTree());

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

					char_literal139=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1839); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal139_tree = 
					(CommonTree)adaptor.create(char_literal139)
					;
					adaptor.addChild(root_0, char_literal139_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1844);
					instruction140=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction140.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal141=null;
		Token char_literal143=null;
		Token set145=null;
		Token Int146=null;
		Token char_literal147=null;
		ParserRuleReturnScope instructionInclBreakContinue142 =null;
		ParserRuleReturnScope instruction144 =null;

		CommonTree char_literal141_tree=null;
		CommonTree char_literal143_tree=null;
		CommonTree set145_tree=null;
		CommonTree Int146_tree=null;
		CommonTree char_literal147_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal141=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1855); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal141_tree = 
					(CommonTree)adaptor.create(char_literal141)
					;
					adaptor.addChild(root_0, char_literal141_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:8: ( instructionInclBreakContinue )+
					int cnt51=0;
					loop51:
					do {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==Backslash||LA51_0==Break||LA51_0==Continue||LA51_0==Do||LA51_0==Echo||LA51_0==Exit||(LA51_0 >= For && LA51_0 <= Foreach)||(LA51_0 >= Identifier && LA51_0 <= If)||LA51_0==LeftCurlyBrace||LA51_0==MinusMinus||LA51_0==Parent||LA51_0==PlusPlus||LA51_0==Return||LA51_0==Self||(LA51_0 >= Switch && LA51_0 <= TypeString)||LA51_0==VariableId||LA51_0==While) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1857);
							instructionInclBreakContinue142=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue142.getTree());

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

					char_literal143=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1861); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal143_tree = 
					(CommonTree)adaptor.create(char_literal143)
					;
					adaptor.addChild(root_0, char_literal143_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1866);
					instruction144=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction144.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: ( 'break' | 'continue' ) ( Int )? ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					set145=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(CommonTree)adaptor.create(set145)
						);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:25: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:25: Int
							{
							Int146=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1877); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int146_tree = 
							(CommonTree)adaptor.create(Int146)
							;
							adaptor.addChild(root_0, Int146_tree);
							}

							}
							break;

					}

					char_literal147=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1880); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal147_tree = 
					(CommonTree)adaptor.create(char_literal147)
					;
					adaptor.addChild(root_0, char_literal147_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
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
		Token string_literal170=null;
		Token char_literal171=null;
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
		ParserRuleReturnScope expressionList168 =null;

		CommonTree char_literal149_tree=null;
		CommonTree char_literal151_tree=null;
		CommonTree char_literal161_tree=null;
		CommonTree char_literal163_tree=null;
		CommonTree string_literal164_tree=null;
		CommonTree char_literal166_tree=null;
		CommonTree string_literal167_tree=null;
		CommonTree char_literal169_tree=null;
		CommonTree string_literal170_tree=null;
		CommonTree char_literal171_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
			int alt55=15;
			switch ( input.LA(1) ) {
			case VariableId:
				{
				int LA55_1 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
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
			case Self:
				{
				int LA55_2 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA55_3 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
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
				int LA55_4 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred70_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=11;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA55_5 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred70_TSPHP()) ) {
					alt55=2;
				}
				else if ( (synpred79_TSPHP()) ) {
					alt55=11;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA55_6 = input.LA(2);
				if ( (synpred69_TSPHP()) ) {
					alt55=1;
				}
				else if ( (synpred80_TSPHP()) ) {
					alt55=12;
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
			case MinusMinus:
			case PlusPlus:
				{
				alt55=1;
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
			case Return:
				{
				alt55=13;
				}
				break;
			case Echo:
				{
				alt55=14;
				}
				break;
			case Exit:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: variableAssignment ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction1892);
					variableAssignment148=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment148.getTree());

					char_literal149=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1894); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal149_tree = 
					(CommonTree)adaptor.create(char_literal149)
					;
					adaptor.addChild(root_0, char_literal149_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: variableDeclaration ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction1899);
					variableDeclaration150=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration150.getTree());

					char_literal151=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1901); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal151_tree = 
					(CommonTree)adaptor.create(char_literal151)
					;
					adaptor.addChild(root_0, char_literal151_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: ifCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction1906);
					ifCondition152=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition152.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: switchCondition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction1911);
					switchCondition153=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition153.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: forLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction1916);
					forLoop154=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop154.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:373:4: foreachLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction1921);
					foreachLoop155=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop155.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:374:4: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction1926);
					whileLoop156=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop156.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:4: doWhileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction1931);
					doWhileLoop157=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop157.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: tryCatch
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction1936);
					tryCatch158=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch158.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:377:4: throwException
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction1941);
					throwException159=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException159.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: functionCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1946);
					functionCallFluentWithoutAccessAtTheEnd160=functionCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd160.getTree());

					char_literal161=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1948); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal161_tree = 
					(CommonTree)adaptor.create(char_literal161)
					;
					adaptor.addChild(root_0, char_literal161_tree);
					}

					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: methodCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1953);
					methodCallFluentWithoutAccessAtTheEnd162=methodCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd162.getTree());

					char_literal163=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1955); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal163_tree = 
					(CommonTree)adaptor.create(char_literal163)
					;
					adaptor.addChild(root_0, char_literal163_tree);
					}

					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: 'return' ( expression )? ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal164=(Token)match(input,Return,FOLLOW_Return_in_instruction1961); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal164_tree = 
					(CommonTree)adaptor.create(string_literal164)
					;
					adaptor.addChild(root_0, string_literal164_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:13: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==New||LA54_0==Null||(LA54_0 >= Parent && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==Self||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1963);
							expression165=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression165.getTree());

							}
							break;

					}

					char_literal166=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1966); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal166_tree = 
					(CommonTree)adaptor.create(char_literal166)
					;
					adaptor.addChild(root_0, char_literal166_tree);
					}

					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:381:4: 'echo' expressionList ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal167=(Token)match(input,Echo,FOLLOW_Echo_in_instruction1971); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal167_tree = 
					(CommonTree)adaptor.create(string_literal167)
					;
					adaptor.addChild(root_0, string_literal167_tree);
					}

					pushFollow(FOLLOW_expressionList_in_instruction1973);
					expressionList168=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList168.getTree());

					char_literal169=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1975); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal169_tree = 
					(CommonTree)adaptor.create(char_literal169)
					;
					adaptor.addChild(root_0, char_literal169_tree);
					}

					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:382:4: 'exit' ';'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal170=(Token)match(input,Exit,FOLLOW_Exit_in_instruction1980); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal170_tree = 
					(CommonTree)adaptor.create(string_literal170)
					;
					adaptor.addChild(root_0, string_literal170_tree);
					}

					char_literal171=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1982); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal171_tree = 
					(CommonTree)adaptor.create(char_literal171)
					;
					adaptor.addChild(root_0, char_literal171_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:1: expressionList : expression ( ',' ! expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal173=null;
		ParserRuleReturnScope expression172 =null;
		ParserRuleReturnScope expression174 =null;

		CommonTree char_literal173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:2: ( expression ( ',' ! expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:4: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList1994);
			expression172=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression172.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:15: ( ',' ! expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:16: ',' ! expression
					{
					char_literal173=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList1997); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expressionList2000);
					expression174=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression174.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:1: variableAssignment : ( VariableId assignmentOperator expression | incrementDecrement );
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId175=null;
		ParserRuleReturnScope assignmentOperator176 =null;
		ParserRuleReturnScope expression177 =null;
		ParserRuleReturnScope incrementDecrement178 =null;

		CommonTree VariableId175_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:2: ( VariableId assignmentOperator expression | incrementDecrement )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==VariableId) ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1==Assign||LA57_1==BitwiseAndEqual||LA57_1==BitwiseOrEqual||LA57_1==BitwiseXorEqual||LA57_1==DivideEqual||LA57_1==DotEqual||LA57_1==MinusEqual||LA57_1==ModuloEqual||LA57_1==MultiplyEqual||LA57_1==PlusEqual||LA57_1==ShiftLeftEqual||LA57_1==ShiftRightEqual) ) {
					alt57=1;
				}
				else if ( (LA57_1==LeftSquareBrace||LA57_1==MinusMinus||LA57_1==ObjectOperator||LA57_1==PlusPlus) ) {
					alt57=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA57_0==Backslash||LA57_0==Identifier||LA57_0==MinusMinus||LA57_0==Parent||LA57_0==PlusPlus||LA57_0==Self||LA57_0==This) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: VariableId assignmentOperator expression
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId175=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment2011); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId175_tree = 
					(CommonTree)adaptor.create(VariableId175)
					;
					adaptor.addChild(root_0, VariableId175_tree);
					}

					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment2013);
					assignmentOperator176=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator176.getTree());

					pushFollow(FOLLOW_expression_in_variableAssignment2015);
					expression177=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression177.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_variableAssignment2020);
					incrementDecrement178=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement178.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:393:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope postIncrementDecrement179 =null;
		ParserRuleReturnScope preIncrementDecrement180 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:2: ( postIncrementDecrement | preIncrementDecrement )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==Backslash||LA58_0==Identifier||LA58_0==Parent||LA58_0==Self||LA58_0==This||LA58_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:394:4: postIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement2032);
					postIncrementDecrement179=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement179.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:4: preIncrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement2037);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:398:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set181=null;

		CommonTree set181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:399:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:1: postIncrementDecrement : variableMemberStaticMember post= ( '++' | '--' ) -> ^( POST_INCREMENT[$post, \"post increment\"] variableMemberStaticMember ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token post=null;
		Token string_literal183=null;
		Token string_literal184=null;
		ParserRuleReturnScope variableMemberStaticMember182 =null;

		CommonTree post_tree=null;
		CommonTree string_literal183_tree=null;
		CommonTree string_literal184_tree=null;
		RewriteRuleTokenStream stream_MinusMinus=new RewriteRuleTokenStream(adaptor,"token MinusMinus");
		RewriteRuleTokenStream stream_PlusPlus=new RewriteRuleTokenStream(adaptor,"token PlusPlus");
		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:2: ( variableMemberStaticMember post= ( '++' | '--' ) -> ^( POST_INCREMENT[$post, \"post increment\"] variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: variableMemberStaticMember post= ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2115);
			variableMemberStaticMember182=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember182.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:38: ( '++' | '--' )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==PlusPlus) ) {
				alt59=1;
			}
			else if ( (LA59_0==MinusMinus) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:39: '++'
					{
					string_literal183=(Token)match(input,PlusPlus,FOLLOW_PlusPlus_in_postIncrementDecrement2122); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PlusPlus.add(string_literal183);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:44: '--'
					{
					string_literal184=(Token)match(input,MinusMinus,FOLLOW_MinusMinus_in_postIncrementDecrement2124); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MinusMinus.add(string_literal184);

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
			// 414:50: -> ^( POST_INCREMENT[$post, \"post increment\"] variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:53: ^( POST_INCREMENT[$post, \"post increment\"] variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(POST_INCREMENT, post, "post increment")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:1: preIncrementDecrement : pre= ( '++' | '--' ) variableMemberStaticMember -> ^( PRE_INCREMENT[$pre, \"pre increment\"] variableMemberStaticMember ) ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token pre=null;
		Token string_literal185=null;
		Token string_literal186=null;
		ParserRuleReturnScope variableMemberStaticMember187 =null;

		CommonTree pre_tree=null;
		CommonTree string_literal185_tree=null;
		CommonTree string_literal186_tree=null;
		RewriteRuleTokenStream stream_MinusMinus=new RewriteRuleTokenStream(adaptor,"token MinusMinus");
		RewriteRuleTokenStream stream_PlusPlus=new RewriteRuleTokenStream(adaptor,"token PlusPlus");
		RewriteRuleSubtreeStream stream_variableMemberStaticMember=new RewriteRuleSubtreeStream(adaptor,"rule variableMemberStaticMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:2: (pre= ( '++' | '--' ) variableMemberStaticMember -> ^( PRE_INCREMENT[$pre, \"pre increment\"] variableMemberStaticMember ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:4: pre= ( '++' | '--' ) variableMemberStaticMember
			{
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:10: ( '++' | '--' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:11: '++'
					{
					string_literal185=(Token)match(input,PlusPlus,FOLLOW_PlusPlus_in_preIncrementDecrement2151); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PlusPlus.add(string_literal185);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:16: '--'
					{
					string_literal186=(Token)match(input,MinusMinus,FOLLOW_MinusMinus_in_preIncrementDecrement2153); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MinusMinus.add(string_literal186);

					}
					break;

			}

			pushFollow(FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2156);
			variableMemberStaticMember187=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableMemberStaticMember.add(variableMemberStaticMember187.getTree());
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
			// 418:49: -> ^( PRE_INCREMENT[$pre, \"pre increment\"] variableMemberStaticMember )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:418:52: ^( PRE_INCREMENT[$pre, \"pre increment\"] variableMemberStaticMember )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				(CommonTree)adaptor.create(PRE_INCREMENT, pre, "pre increment")
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:1: variableDeclaration : allTypes VariableId ( '=' ^ expression )? ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId189=null;
		Token char_literal190=null;
		ParserRuleReturnScope allTypes188 =null;
		ParserRuleReturnScope expression191 =null;

		CommonTree VariableId189_tree=null;
		CommonTree char_literal190_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:2: ( allTypes VariableId ( '=' ^ expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:4: allTypes VariableId ( '=' ^ expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_variableDeclaration2179);
			allTypes188=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes188.getTree());

			VariableId189=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2181); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId189_tree = 
			(CommonTree)adaptor.create(VariableId189)
			;
			adaptor.addChild(root_0, VariableId189_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:24: ( '=' ^ expression )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==Assign) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:25: '=' ^ expression
					{
					char_literal190=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2184); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal190_tree = 
					(CommonTree)adaptor.create(char_literal190)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal190_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_variableDeclaration2187);
					expression191=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression191.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope logicOrWeak192 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: logicOrWeak
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2199);
			logicOrWeak192=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak192.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:1: expressionForTest : expression ';' !;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal194=null;
		ParserRuleReturnScope expression193 =null;

		CommonTree char_literal194_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:2: ( expression ';' !)
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:4: expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2208);
			expression193=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression193.getTree());

			char_literal194=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2210); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal196=null;
		ParserRuleReturnScope logicXorWeak195 =null;
		ParserRuleReturnScope logicXorWeak197 =null;

		CommonTree string_literal196_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2220);
			logicXorWeak195=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak195.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:17: ( 'or' ^ logicXorWeak )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicOrWeak) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:18: 'or' ^ logicXorWeak
					{
					string_literal196=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal196_tree = 
					(CommonTree)adaptor.create(string_literal196)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal196_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2226);
					logicXorWeak197=logicXorWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak197.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:434:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal199=null;
		ParserRuleReturnScope logicAndWeak198 =null;
		ParserRuleReturnScope logicAndWeak200 =null;

		CommonTree string_literal199_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2239);
			logicAndWeak198=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak198.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:17: ( 'xor' ^ logicAndWeak )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==LogicXorWeak) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:18: 'xor' ^ logicAndWeak
					{
					string_literal199=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2242); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal199_tree = 
					(CommonTree)adaptor.create(string_literal199)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal199_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2245);
					logicAndWeak200=logicAndWeak();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak200.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal202=null;
		ParserRuleReturnScope assignment201 =null;
		ParserRuleReturnScope assignment203 =null;

		CommonTree string_literal202_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2258);
			assignment201=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment201.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:15: ( 'and' ^ assignment )*
			loop64:
			do {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==LogicAndWeak) ) {
					int LA64_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt64=1;
					}

				}

				switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:16: 'and' ^ assignment
					{
					string_literal202=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2261); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal202_tree = 
					(CommonTree)adaptor.create(string_literal202)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal202_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2264);
					assignment203=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment203.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: assignment : ternary ( assignmentOperator ^ ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope ternary204 =null;
		ParserRuleReturnScope assignmentOperator205 =null;
		ParserRuleReturnScope ternary206 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:2: ( ternary ( assignmentOperator ^ ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:4: ternary ( assignmentOperator ^ ternary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2275);
			ternary204=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary204.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:12: ( assignmentOperator ^ ternary )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==Assign||LA65_0==BitwiseAndEqual||LA65_0==BitwiseOrEqual||LA65_0==BitwiseXorEqual||LA65_0==DivideEqual||LA65_0==DotEqual||LA65_0==MinusEqual||LA65_0==ModuloEqual||LA65_0==MultiplyEqual||LA65_0==PlusEqual||LA65_0==ShiftLeftEqual||LA65_0==ShiftRightEqual) ) {
					int LA65_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt65=1;
					}

				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:13: assignmentOperator ^ ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2278);
					assignmentOperator205=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator205.getTree(), root_0);
					pushFollow(FOLLOW_ternary_in_assignment2281);
					ternary206=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary206.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal208=null;
		Token char_literal210=null;
		ParserRuleReturnScope logicOr207 =null;
		ParserRuleReturnScope expression209 =null;
		ParserRuleReturnScope expression211 =null;

		CommonTree char_literal208_tree=null;
		CommonTree char_literal210_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2291);
			logicOr207=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr207.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:19: ( '?' ^ expression ':' ! expression )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==QuestionMark) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:20: '?' ^ expression ':' ! expression
					{
					char_literal208=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2294); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal208_tree = 
					(CommonTree)adaptor.create(char_literal208)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal208_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2297);
					expression209=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression209.getTree());

					char_literal210=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2299); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2302);
					expression211=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression211.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal213=null;
		ParserRuleReturnScope logicAnd212 =null;
		ParserRuleReturnScope logicAnd214 =null;

		CommonTree string_literal213_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2312);
			logicAnd212=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd212.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:20: ( '||' ^ logicAnd )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==LogicOr) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:445:21: '||' ^ logicAnd
					{
					string_literal213=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2315); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal213_tree = 
					(CommonTree)adaptor.create(string_literal213)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal213_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2318);
					logicAnd214=logicAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd214.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal216=null;
		ParserRuleReturnScope bitwiseOr215 =null;
		ParserRuleReturnScope bitwiseOr217 =null;

		CommonTree string_literal216_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2327);
			bitwiseOr215=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr215.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:21: ( '&&' ^ bitwiseOr )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==LogicAnd) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:447:22: '&&' ^ bitwiseOr
					{
					string_literal216=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2330); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal216_tree = 
					(CommonTree)adaptor.create(string_literal216)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal216_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2333);
					bitwiseOr217=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr217.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal219=null;
		ParserRuleReturnScope bitwiseXor218 =null;
		ParserRuleReturnScope bitwiseXor220 =null;

		CommonTree char_literal219_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2344);
			bitwiseXor218=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor218.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:15: ( '|' ^ bitwiseXor )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseOr) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:450:16: '|' ^ bitwiseXor
					{
					char_literal219=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2347); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal219_tree = 
					(CommonTree)adaptor.create(char_literal219)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal219_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2350);
					bitwiseXor220=bitwiseXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor220.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:452:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal222=null;
		ParserRuleReturnScope bitwiseAnd221 =null;
		ParserRuleReturnScope bitwiseAnd223 =null;

		CommonTree char_literal222_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2361);
			bitwiseAnd221=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd221.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:15: ( '^' ^ bitwiseAnd )*
			loop70:
			do {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==BitwiseXor) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:453:16: '^' ^ bitwiseAnd
					{
					char_literal222=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2364); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal222_tree = 
					(CommonTree)adaptor.create(char_literal222)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal222_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2367);
					bitwiseAnd223=bitwiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd223.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:455:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal225=null;
		ParserRuleReturnScope equality224 =null;
		ParserRuleReturnScope equality226 =null;

		CommonTree char_literal225_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:4: equality ( '&' ^ equality )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2378);
			equality224=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality224.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:13: ( '&' ^ equality )*
			loop71:
			do {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==BitwiseAnd) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:14: '&' ^ equality
					{
					char_literal225=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2381); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal225_tree = 
					(CommonTree)adaptor.create(char_literal225)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal225_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2384);
					equality226=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality226.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comparison227 =null;
		ParserRuleReturnScope equalityOperator228 =null;
		ParserRuleReturnScope comparison229 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2393);
			comparison227=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison227.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:22: ( equalityOperator ^ comparison )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==Equal||LA72_0==Identical||(LA72_0 >= NotEqual && LA72_0 <= NotIdentical)) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:458:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2396);
					equalityOperator228=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator228.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2399);
					comparison229=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison229.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set230=null;

		CommonTree set230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:461:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set230=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope bitwiseShift231 =null;
		ParserRuleReturnScope comparisonOperator232 =null;
		ParserRuleReturnScope bitwiseShift233 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2441);
			bitwiseShift231=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift231.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:17: ( comparisonOperator ^ bitwiseShift )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( ((LA73_0 >= GreaterEqualThan && LA73_0 <= GreaterThan)||(LA73_0 >= LessEqualThan && LA73_0 <= LessThan)) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:469:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2444);
					comparisonOperator232=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonOperator232.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2447);
					bitwiseShift233=bitwiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift233.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:471:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set234=null;

		CommonTree set234_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set234=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set236=null;
		ParserRuleReturnScope termOrStringConcatenation235 =null;
		ParserRuleReturnScope termOrStringConcatenation237 =null;

		CommonTree set236_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2483);
			termOrStringConcatenation235=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation235.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==ShiftLeft||LA74_0==ShiftRight) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set236=(Token)input.LT(1);
					set236=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set236)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2493);
					termOrStringConcatenation237=termOrStringConcatenation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation237.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set239=null;
		ParserRuleReturnScope factor238 =null;
		ParserRuleReturnScope factor240 =null;

		CommonTree set239_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2503);
			factor238=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor238.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop75:
			do {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==Dot||LA75_0==Minus||LA75_0==Plus) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:37: ( '+' | '-' | '.' ) ^ factor
					{
					set239=(Token)input.LT(1);
					set239=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set239)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2515);
					factor240=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor240.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set242=null;
		ParserRuleReturnScope logicNot241 =null;
		ParserRuleReturnScope logicNot243 =null;

		CommonTree set242_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2525);
			logicNot241=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot241.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop76:
			do {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==Divide||LA76_0==Modulo||LA76_0==Multiply) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set242=(Token)input.LT(1);
					set242=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
						(CommonTree)adaptor.create(set242)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2537);
					logicNot243=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot243.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:1: logicNot : ( '!' ^ logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal244=null;
		ParserRuleReturnScope logicNot245 =null;
		ParserRuleReturnScope instanceOf246 =null;

		CommonTree char_literal244_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:9: ( '!' ^ logicNot | instanceOf )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LogicNot) ) {
				alt77=1;
			}
			else if ( (LA77_0==At||LA77_0==Backslash||LA77_0==BitwiseNot||LA77_0==Bool||LA77_0==Clone||LA77_0==Float||LA77_0==Identifier||LA77_0==Int||(LA77_0 >= LeftParanthesis && LA77_0 <= LeftSquareBrace)||LA77_0==Minus||LA77_0==MinusMinus||LA77_0==New||LA77_0==Null||(LA77_0 >= Parent && LA77_0 <= Plus)||LA77_0==PlusPlus||LA77_0==Self||LA77_0==String||LA77_0==This||LA77_0==TypeArray||LA77_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:11: '!' ^ logicNot
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal244=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2546); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal244_tree = 
					(CommonTree)adaptor.create(char_literal244)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal244_tree, root_0);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2549);
					logicNot245=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot245.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:485:4: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2554);
					instanceOf246=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf246.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal248=null;
		Token VariableId250=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt247 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject249 =null;

		CommonTree string_literal248_tree=null;
		CommonTree VariableId250_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2566);
			castOrBitwiseNotOrAt247=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt247.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==Instanceof) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal248=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal248_tree = 
					(CommonTree)adaptor.create(string_literal248)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal248_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:40: ( classInterfaceTypeWithoutObject | VariableId )
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==Backslash||LA78_0==Identifier) ) {
						alt78=1;
					}
					else if ( (LA78_0==VariableId) ) {
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2573);
							classInterfaceTypeWithoutObject249=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject249.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:73: VariableId
							{
							VariableId250=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2575); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId250_tree = 
							(CommonTree)adaptor.create(VariableId250)
							;
							adaptor.addChild(root_0, VariableId250_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:492:1: castOrBitwiseNotOrAt : (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		CommonTree root_0 = null;

		Token cast=null;
		Token char_literal252=null;
		Token char_literal254=null;
		Token char_literal256=null;
		ParserRuleReturnScope allTypesWithoutResource251 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt253 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt255 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt257 =null;
		ParserRuleReturnScope newOrClone258 =null;

		CommonTree cast_tree=null;
		CommonTree char_literal252_tree=null;
		CommonTree char_literal254_tree=null;
		CommonTree char_literal256_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_castOrBitwiseNotOrAt=new RewriteRuleSubtreeStream(adaptor,"rule castOrBitwiseNotOrAt");
		RewriteRuleSubtreeStream stream_allTypesWithoutResource=new RewriteRuleSubtreeStream(adaptor,"rule allTypesWithoutResource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:2: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt ) | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone )
			int alt80=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA80_1 = input.LA(2);
				if ( (synpred131_TSPHP()) ) {
					alt80=1;
				}
				else if ( (true) ) {
					alt80=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BitwiseNot:
				{
				alt80=2;
				}
				break;
			case At:
				{
				alt80=3;
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
				alt80=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
					{
					cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2591); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(cast);

					pushFollow(FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2593);
					allTypesWithoutResource251=allTypesWithoutResource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_allTypesWithoutResource.add(allTypesWithoutResource251.getTree());
					char_literal252=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2595); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal252);

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2597);
					castOrBitwiseNotOrAt253=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_castOrBitwiseNotOrAt.add(castOrBitwiseNotOrAt253.getTree());
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
					// 493:64: -> ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:67: ^( CAST[$cast,\"cast\"] allTypesWithoutResource castOrBitwiseNotOrAt )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal254=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2613); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal254_tree = 
					(CommonTree)adaptor.create(char_literal254)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal254_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2616);
					castOrBitwiseNotOrAt255=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt255.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal256=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal256_tree = 
					(CommonTree)adaptor.create(char_literal256)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal256_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2624);
					castOrBitwiseNotOrAt257=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt257.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: newOrClone
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2630);
					newOrClone258=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone258.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:1: newOrClone : ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary );
	public final TSPHPParser.newOrClone_return newOrClone() throws RecognitionException {
		TSPHPParser.newOrClone_return retval = new TSPHPParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal259=null;
		ParserRuleReturnScope variableMemberStaticMember260 =null;
		ParserRuleReturnScope newObject261 =null;
		ParserRuleReturnScope unaryPrimary262 =null;

		CommonTree string_literal259_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:2: ( 'clone' ^ variableMemberStaticMember | newObject | unaryPrimary )
			int alt81=3;
			switch ( input.LA(1) ) {
			case Clone:
				{
				alt81=1;
				}
				break;
			case New:
				{
				alt81=2;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:500:4: 'clone' ^ variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal259=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone2641); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal259_tree = 
					(CommonTree)adaptor.create(string_literal259)
					;
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal259_tree, root_0);
					}

					pushFollow(FOLLOW_variableMemberStaticMember_in_newOrClone2644);
					variableMemberStaticMember260=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember260.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:501:4: newObject
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_newOrClone2649);
					newObject261=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject261.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:4: unaryPrimary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_newOrClone2654);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:506:1: variableMemberStaticMember : ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId );
	public final TSPHPParser.variableMemberStaticMember_return variableMemberStaticMember() throws RecognitionException {
		TSPHPParser.variableMemberStaticMember_return retval = new TSPHPParser.variableMemberStaticMember_return();
		retval.start = input.LT(1);
		int variableMemberStaticMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token VariableId264=null;
		Token string_literal266=null;
		Token VariableId268=null;
		Token string_literal270=null;
		Token VariableId271=null;
		ParserRuleReturnScope staticAccessOrParent263 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess265 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess267 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess269 =null;

		CommonTree VariableId264_tree=null;
		CommonTree string_literal266_tree=null;
		CommonTree VariableId268_tree=null;
		CommonTree string_literal270_tree=null;
		CommonTree VariableId271_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:2: ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId )
			int alt85=5;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt85=1;
				}
				break;
			case This:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA85_4 = input.LA(3);
					if ( (LA85_4==Identifier) ) {
						int LA85_10 = input.LA(4);
						if ( (LA85_10==LeftParanthesis) ) {
							alt85=4;
						}
						else if ( (LA85_10==EOF||LA85_10==Arrow||LA85_10==Assign||(LA85_10 >= BitwiseAnd && LA85_10 <= BitwiseAndEqual)||(LA85_10 >= BitwiseOr && LA85_10 <= BitwiseXorEqual)||(LA85_10 >= Colon && LA85_10 <= Comma)||(LA85_10 >= Divide && LA85_10 <= DivideEqual)||(LA85_10 >= Dot && LA85_10 <= DotEqual)||LA85_10==Equal||(LA85_10 >= GreaterEqualThan && LA85_10 <= GreaterThan)||LA85_10==Identical||LA85_10==Instanceof||(LA85_10 >= LeftSquareBrace && LA85_10 <= LogicAndWeak)||(LA85_10 >= LogicOr && LA85_10 <= MultiplyEqual)||(LA85_10 >= NotEqual && LA85_10 <= NotIdentical)||LA85_10==ObjectOperator||(LA85_10 >= Plus && LA85_10 <= PlusPlus)||LA85_10==QuestionMark||(LA85_10 >= RightParanthesis && LA85_10 <= RightSquareBrace)||(LA85_10 >= Semicolon && LA85_10 <= ShiftRightEqual)) ) {
							alt85=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 85, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA85_4==EOF) ) {
						alt85=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
				case LeftSquareBrace:
					{
					alt85=2;
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
					alt85=4;
					}
					break;
				default:
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
			case VariableId:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA85_7 = input.LA(3);
					if ( (LA85_7==Identifier) ) {
						int LA85_11 = input.LA(4);
						if ( (LA85_11==LeftParanthesis) ) {
							alt85=5;
						}
						else if ( (LA85_11==EOF||LA85_11==Arrow||LA85_11==Assign||(LA85_11 >= BitwiseAnd && LA85_11 <= BitwiseAndEqual)||(LA85_11 >= BitwiseOr && LA85_11 <= BitwiseXorEqual)||(LA85_11 >= Colon && LA85_11 <= Comma)||(LA85_11 >= Divide && LA85_11 <= DivideEqual)||(LA85_11 >= Dot && LA85_11 <= DotEqual)||LA85_11==Equal||(LA85_11 >= GreaterEqualThan && LA85_11 <= GreaterThan)||LA85_11==Identical||LA85_11==Instanceof||(LA85_11 >= LeftSquareBrace && LA85_11 <= LogicAndWeak)||(LA85_11 >= LogicOr && LA85_11 <= MultiplyEqual)||(LA85_11 >= NotEqual && LA85_11 <= NotIdentical)||LA85_11==ObjectOperator||(LA85_11 >= Plus && LA85_11 <= PlusPlus)||LA85_11==QuestionMark||(LA85_11 >= RightParanthesis && LA85_11 <= RightSquareBrace)||(LA85_11 >= Semicolon && LA85_11 <= ShiftRightEqual)) ) {
							alt85=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 85, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA85_7==EOF) ) {
						alt85=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 85, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt85=3;
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
					alt85=5;
					}
					break;
				default:
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:4: staticAccessOrParent VariableId ( memberAccessOrArrayAccess )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2667);
					staticAccessOrParent263=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent263.getTree());

					VariableId264=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId264_tree = 
					(CommonTree)adaptor.create(VariableId264)
					;
					adaptor.addChild(root_0, VariableId264_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:36: ( memberAccessOrArrayAccess )*
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:507:36: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2671);
							memberAccessOrArrayAccess265=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess265.getTree());

							}
							break;

						default :
							break loop82;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:4: '$this' ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal266=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal266_tree = 
					(CommonTree)adaptor.create(string_literal266)
					;
					adaptor.addChild(root_0, string_literal266_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:12: ( memberAccessOrArrayAccess )+
					int cnt83=0;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:12: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2679);
							memberAccessOrArrayAccess267=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess267.getTree());

							}
							break;

						default :
							if ( cnt83 >= 1 ) break loop83;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(83, input);
								throw eee;
						}
						cnt83++;
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: VariableId ( memberAccessOrArrayAccess )+
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId268=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2685); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId268_tree = 
					(CommonTree)adaptor.create(VariableId268)
					;
					adaptor.addChild(root_0, VariableId268_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:15: ( memberAccessOrArrayAccess )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:15: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2687);
							memberAccessOrArrayAccess269=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess269.getTree());

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
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:4: '$this'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal270=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2693); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal270_tree = 
					(CommonTree)adaptor.create(string_literal270)
					;
					adaptor.addChild(root_0, string_literal270_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:511:4: VariableId
					{
					root_0 = (CommonTree)adaptor.nil();


					VariableId271=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId271_tree = 
					(CommonTree)adaptor.create(VariableId271)
					;
					adaptor.addChild(root_0, VariableId271_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:514:1: staticAccessOrParent : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal272=null;
		Token string_literal273=null;
		Token string_literal275=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject274 =null;

		CommonTree string_literal272_tree=null;
		CommonTree string_literal273_tree=null;
		CommonTree string_literal275_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt86=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt86=1;
				}
				break;
			case Parent:
				{
				alt86=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:4: 'self::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal272=(Token)match(input,Self,FOLLOW_Self_in_staticAccessOrParent2709); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal272_tree = 
					(CommonTree)adaptor.create(string_literal272)
					;
					adaptor.addChild(root_0, string_literal272_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:4: 'parent::'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal273=(Token)match(input,Parent,FOLLOW_Parent_in_staticAccessOrParent2714); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal273_tree = 
					(CommonTree)adaptor.create(string_literal273)
					;
					adaptor.addChild(root_0, string_literal273_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:517:4: classInterfaceTypeWithoutObject '::'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2719);
					classInterfaceTypeWithoutObject274=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject274.getTree());

					string_literal275=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2720); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal275_tree = 
					(CommonTree)adaptor.create(string_literal275)
					;
					adaptor.addChild(root_0, string_literal275_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: memberAccessOrArrayAccess : ( memberAccess | arrayAccess );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccess276 =null;
		ParserRuleReturnScope arrayAccess277 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:2: ( memberAccess | arrayAccess )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==ObjectOperator) ) {
				alt87=1;
			}
			else if ( (LA87_0==LeftSquareBrace) ) {
				alt87=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: memberAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_memberAccessOrArrayAccess2731);
					memberAccess276=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess276.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: arrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2736);
					arrayAccess277=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess277.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:524:1: memberAccess : '->' Identifier ;
	public final TSPHPParser.memberAccess_return memberAccess() throws RecognitionException {
		TSPHPParser.memberAccess_return retval = new TSPHPParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal278=null;
		Token Identifier279=null;

		CommonTree string_literal278_tree=null;
		CommonTree Identifier279_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:2: ( '->' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: '->' Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal278=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccess2746); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal278_tree = 
			(CommonTree)adaptor.create(string_literal278)
			;
			adaptor.addChild(root_0, string_literal278_tree);
			}

			Identifier279=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccess2748); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier279_tree = 
			(CommonTree)adaptor.create(Identifier279)
			;
			adaptor.addChild(root_0, Identifier279_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:1: arrayAccess : '[' expression ']' ;
	public final TSPHPParser.arrayAccess_return arrayAccess() throws RecognitionException {
		TSPHPParser.arrayAccess_return retval = new TSPHPParser.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal280=null;
		Token char_literal282=null;
		ParserRuleReturnScope expression281 =null;

		CommonTree char_literal280_tree=null;
		CommonTree char_literal282_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:2: ( '[' expression ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:528:4: '[' expression ']'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal280=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2758); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal280_tree = 
			(CommonTree)adaptor.create(char_literal280)
			;
			adaptor.addChild(root_0, char_literal280_tree);
			}

			pushFollow(FOLLOW_expression_in_arrayAccess2760);
			expression281=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression281.getTree());

			char_literal282=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2762); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal282_tree = 
			(CommonTree)adaptor.create(char_literal282)
			;
			adaptor.addChild(root_0, char_literal282_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:1: newObject : 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )? -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? ) ;
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal283=null;
		Token char_literal285=null;
		Token char_literal287=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject284 =null;
		ParserRuleReturnScope expressionList286 =null;

		CommonTree string_literal283_tree=null;
		CommonTree char_literal285_tree=null;
		CommonTree char_literal287_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_classInterfaceTypeWithoutObject=new RewriteRuleSubtreeStream(adaptor,"rule classInterfaceTypeWithoutObject");
		RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:2: ( 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )? -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:4: 'new' classInterfaceTypeWithoutObject ( '(' ( expressionList )? ')' )?
			{
			string_literal283=(Token)match(input,New,FOLLOW_New_in_newObject2775); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_New.add(string_literal283);

			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2777);
			classInterfaceTypeWithoutObject284=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_classInterfaceTypeWithoutObject.add(classInterfaceTypeWithoutObject284.getTree());
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:42: ( '(' ( expressionList )? ')' )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==LeftParanthesis) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:43: '(' ( expressionList )? ')'
					{
					char_literal285=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2780); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal285);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:47: ( expressionList )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==At||LA88_0==Backslash||LA88_0==BitwiseNot||LA88_0==Bool||LA88_0==Clone||LA88_0==Float||LA88_0==Identifier||LA88_0==Int||(LA88_0 >= LeftParanthesis && LA88_0 <= LeftSquareBrace)||LA88_0==LogicNot||LA88_0==Minus||LA88_0==MinusMinus||LA88_0==New||LA88_0==Null||(LA88_0 >= Parent && LA88_0 <= Plus)||LA88_0==PlusPlus||LA88_0==Self||LA88_0==String||LA88_0==This||LA88_0==TypeArray||LA88_0==VariableId) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:47: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2782);
							expressionList286=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expressionList.add(expressionList286.getTree());
							}
							break;

					}

					char_literal287=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2785); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal287);

					}
					break;

			}

			// AST REWRITE
			// elements: classInterfaceTypeWithoutObject, New, expressionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {

			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 533:69: -> ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? )
			{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:72: ^( 'new' classInterfaceTypeWithoutObject ( expressionList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_New.nextNode()
				, root_1);

				adaptor.addChild(root_1, stream_classInterfaceTypeWithoutObject.nextTree());

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:533:112: ( expressionList )?
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:1: unaryPrimary : (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token uplus=null;
		Token uminus=null;
		ParserRuleReturnScope primary288 =null;
		ParserRuleReturnScope primary289 =null;
		ParserRuleReturnScope primary290 =null;

		CommonTree uplus_tree=null;
		CommonTree uminus_tree=null;
		RewriteRuleTokenStream stream_Plus=new RewriteRuleTokenStream(adaptor,"token Plus");
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:2: (uplus= '+' primary -> ^( UPLUS[$uplus,\"unary plus\"] primary ) |uminus= '-' primary -> ^( UMINUS[$uminus,\"unary minus\"] primary ) | primary )
			int alt90=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt90=1;
				}
				break;
			case Minus:
				{
				alt90=2;
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
				alt90=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:4: uplus= '+' primary
					{
					uplus=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary2813); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Plus.add(uplus);

					pushFollow(FOLLOW_primary_in_unaryPrimary2815);
					primary288=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary288.getTree());
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
					// 537:24: -> ^( UPLUS[$uplus,\"unary plus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:537:27: ^( UPLUS[$uplus,\"unary plus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:4: uminus= '-' primary
					{
					uminus=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary2833); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Minus.add(uminus);

					pushFollow(FOLLOW_primary_in_unaryPrimary2835);
					primary289=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary289.getTree());
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
					// 538:25: -> ^( UMINUS[$uminus,\"unary minus\"] primary )
					{
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:538:28: ^( UMINUS[$uminus,\"unary minus\"] primary )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:4: primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary2849);
					primary290=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary290.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:1: primary : ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentInclAccessAtTheEnd291 =null;
		ParserRuleReturnScope methodCallFluentInclAccessAtTheEnd292 =null;
		ParserRuleReturnScope atom293 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:2: ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom )
			int alt91=3;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA91_1 = input.LA(2);
				if ( (synpred150_TSPHP()) ) {
					alt91=1;
				}
				else if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
					alt91=3;
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
				break;
			case Identifier:
				{
				int LA91_2 = input.LA(2);
				if ( (synpred150_TSPHP()) ) {
					alt91=1;
				}
				else if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
					alt91=3;
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
			case Self:
				{
				int LA91_3 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
					alt91=3;
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
			case Parent:
				{
				int LA91_4 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
					alt91=3;
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
			case This:
				{
				int LA91_5 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
					alt91=3;
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
			case VariableId:
				{
				int LA91_6 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt91=2;
				}
				else if ( (true) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: functionCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2859);
					functionCallFluentInclAccessAtTheEnd291=functionCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentInclAccessAtTheEnd291.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: methodCallFluentInclAccessAtTheEnd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2864);
					methodCallFluentInclAccessAtTheEnd292=methodCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentInclAccessAtTheEnd292.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary2869);
					atom293=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom293.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:547:1: functionCallFluentInclAccessAtTheEnd : functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.functionCallFluentInclAccessAtTheEnd_return functionCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd294 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess295 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:2: ( functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:4: functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2881);
			functionCallFluentWithoutAccessAtTheEnd294=functionCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd294.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:44: ( memberAccessOrArrayAccess )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LeftSquareBrace||LA92_0==ObjectOperator) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:44: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2883);
					memberAccessOrArrayAccess295=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess295.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:551:1: functionCallFluentWithoutAccessAtTheEnd : ( functionCall ( callOrAccess )* call | functionCall ( call )* );
	public final TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return functionCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope functionCall296 =null;
		ParserRuleReturnScope callOrAccess297 =null;
		ParserRuleReturnScope call298 =null;
		ParserRuleReturnScope functionCall299 =null;
		ParserRuleReturnScope call300 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:2: ( functionCall ( callOrAccess )* call | functionCall ( call )* )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==Backslash) ) {
				int LA95_1 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=2;
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
			else if ( (LA95_0==Identifier) ) {
				int LA95_2 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt95=1;
				}
				else if ( (true) ) {
					alt95=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 95, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: functionCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2895);
					functionCall296=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall296.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: ( callOrAccess )*
					loop93:
					do {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==ObjectOperator) ) {
							int LA93_1 = input.LA(2);
							if ( (synpred153_TSPHP()) ) {
								alt93=1;
							}

						}
						else if ( (LA93_0==LeftSquareBrace) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2897);
							callOrAccess297=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess297.getTree());

							}
							break;

						default :
							break loop93;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2900);
					call298=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call298.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:4: functionCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2905);
					functionCall299=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall299.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: ( call )*
					loop94:
					do {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==ObjectOperator) ) {
							int LA94_2 = input.LA(2);
							if ( (LA94_2==Identifier) ) {
								int LA94_3 = input.LA(3);
								if ( (LA94_3==LeftParanthesis) ) {
									alt94=1;
								}

							}

						}

						switch (alt94) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:17: call
							{
							pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2907);
							call300=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call300.getTree());

							}
							break;

						default :
							break loop94;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:1: functionCall : classInterfaceTypeWithoutObject '(' ( expressionList )? ')' ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal302=null;
		Token char_literal304=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject301 =null;
		ParserRuleReturnScope expressionList303 =null;

		CommonTree char_literal302_tree=null;
		CommonTree char_literal304_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:2: ( classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:4: classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2919);
			classInterfaceTypeWithoutObject301=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject301.getTree());

			char_literal302=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2921); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal302_tree = 
			(CommonTree)adaptor.create(char_literal302)
			;
			adaptor.addChild(root_0, char_literal302_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:40: ( expressionList )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==At||LA96_0==Backslash||LA96_0==BitwiseNot||LA96_0==Bool||LA96_0==Clone||LA96_0==Float||LA96_0==Identifier||LA96_0==Int||(LA96_0 >= LeftParanthesis && LA96_0 <= LeftSquareBrace)||LA96_0==LogicNot||LA96_0==Minus||LA96_0==MinusMinus||LA96_0==New||LA96_0==Null||(LA96_0 >= Parent && LA96_0 <= Plus)||LA96_0==PlusPlus||LA96_0==Self||LA96_0==String||LA96_0==This||LA96_0==TypeArray||LA96_0==VariableId) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:557:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2923);
					expressionList303=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList303.getTree());

					}
					break;

			}

			char_literal304=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2926); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal304_tree = 
			(CommonTree)adaptor.create(char_literal304)
			;
			adaptor.addChild(root_0, char_literal304_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess305 =null;
		ParserRuleReturnScope call306 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:2: ( memberAccessOrArrayAccess | call )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:4: memberAccessOrArrayAccess
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2937);
					memberAccessOrArrayAccess305=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess305.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:562:4: call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess2942);
					call306=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call306.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:1: call : ( '->' Identifier '(' ( expressionList )? ')' ) ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal307=null;
		Token Identifier308=null;
		Token char_literal309=null;
		Token char_literal311=null;
		ParserRuleReturnScope expressionList310 =null;

		CommonTree string_literal307_tree=null;
		CommonTree Identifier308_tree=null;
		CommonTree char_literal309_tree=null;
		CommonTree char_literal311_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:6: ( ( '->' Identifier '(' ( expressionList )? ')' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:8: ( '->' Identifier '(' ( expressionList )? ')' )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:8: ( '->' Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:9: '->' Identifier '(' ( expressionList )? ')'
			{
			string_literal307=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call2955); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal307_tree = 
			(CommonTree)adaptor.create(string_literal307)
			;
			adaptor.addChild(root_0, string_literal307_tree);
			}

			Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_call2957); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier308_tree = 
			(CommonTree)adaptor.create(Identifier308)
			;
			adaptor.addChild(root_0, Identifier308_tree);
			}

			char_literal309=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call2959); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal309_tree = 
			(CommonTree)adaptor.create(char_literal309)
			;
			adaptor.addChild(root_0, char_literal309_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:29: ( expressionList )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==At||LA98_0==Backslash||LA98_0==BitwiseNot||LA98_0==Bool||LA98_0==Clone||LA98_0==Float||LA98_0==Identifier||LA98_0==Int||(LA98_0 >= LeftParanthesis && LA98_0 <= LeftSquareBrace)||LA98_0==LogicNot||LA98_0==Minus||LA98_0==MinusMinus||LA98_0==New||LA98_0==Null||(LA98_0 >= Parent && LA98_0 <= Plus)||LA98_0==PlusPlus||LA98_0==Self||LA98_0==String||LA98_0==This||LA98_0==TypeArray||LA98_0==VariableId) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:565:29: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_call2961);
					expressionList310=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList310.getTree());

					}
					break;

			}

			char_literal311=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call2963); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal311_tree = 
			(CommonTree)adaptor.create(char_literal311)
			;
			adaptor.addChild(root_0, char_literal311_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:1: methodCallFluentInclAccessAtTheEnd : methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.methodCallFluentInclAccessAtTheEnd_return methodCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd312 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess313 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:2: ( methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2974);
			methodCallFluentWithoutAccessAtTheEnd312=methodCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd312.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:42: ( memberAccessOrArrayAccess )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LeftSquareBrace||LA99_0==ObjectOperator) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:42: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2976);
					memberAccessOrArrayAccess313=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess313.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:1: methodCallFluentWithoutAccessAtTheEnd : ( methodCall ( callOrAccess )* call | methodCall ( call )* );
	public final TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return methodCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope methodCall314 =null;
		ParserRuleReturnScope callOrAccess315 =null;
		ParserRuleReturnScope call316 =null;
		ParserRuleReturnScope methodCall317 =null;
		ParserRuleReturnScope call318 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:2: ( methodCall ( callOrAccess )* call | methodCall ( call )* )
			int alt102=2;
			switch ( input.LA(1) ) {
			case Self:
				{
				int LA102_1 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA102_2 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA102_3 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA102_4 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA102_5 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA102_6 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 6, input);
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
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:5: methodCall ( callOrAccess )* call
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2990);
					methodCall314=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall314.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: ( callOrAccess )*
					loop100:
					do {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==ObjectOperator) ) {
							int LA100_1 = input.LA(2);
							if ( (synpred160_TSPHP()) ) {
								alt100=1;
							}

						}
						else if ( (LA100_0==LeftSquareBrace) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2992);
							callOrAccess315=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess315.getTree());

							}
							break;

						default :
							break loop100;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2995);
					call316=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call316.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:4: methodCall ( call )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3000);
					methodCall317=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall317.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:15: ( call )*
					loop101:
					do {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==ObjectOperator) ) {
							int LA101_2 = input.LA(2);
							if ( (LA101_2==Identifier) ) {
								int LA101_3 = input.LA(3);
								if ( (LA101_3==LeftParanthesis) ) {
									alt101=1;
								}

							}

						}

						switch (alt101) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:15: call
							{
							pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3002);
							call318=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call318.getTree());

							}
							break;

						default :
							break loop101;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:575:1: methodCall : ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal320=null;
		Token Identifier322=null;
		Token char_literal323=null;
		Token char_literal325=null;
		ParserRuleReturnScope variableMemberStaticMember319 =null;
		ParserRuleReturnScope staticAccessOrParent321 =null;
		ParserRuleReturnScope expressionList324 =null;

		CommonTree string_literal320_tree=null;
		CommonTree Identifier322_tree=null;
		CommonTree char_literal323_tree=null;
		CommonTree char_literal325_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:2: ( ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )
			int alt103=2;
			alt103 = dfa103.predict(input);
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:6: ( variableMemberStaticMember '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:6: ( variableMemberStaticMember '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:7: variableMemberStaticMember '->'
					{
					pushFollow(FOLLOW_variableMemberStaticMember_in_methodCall3016);
					variableMemberStaticMember319=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember319.getTree());

					string_literal320=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall3018); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal320_tree = 
					(CommonTree)adaptor.create(string_literal320)
					;
					adaptor.addChild(root_0, string_literal320_tree);
					}

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:42: staticAccessOrParent
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_methodCall3023);
					staticAccessOrParent321=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent321.getTree());

					}
					break;

			}

			Identifier322=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall3026); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier322_tree = 
			(CommonTree)adaptor.create(Identifier322)
			;
			adaptor.addChild(root_0, Identifier322_tree);
			}

			char_literal323=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall3028); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal323_tree = 
			(CommonTree)adaptor.create(char_literal323)
			;
			adaptor.addChild(root_0, char_literal323_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:79: ( expressionList )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==At||LA104_0==Backslash||LA104_0==BitwiseNot||LA104_0==Bool||LA104_0==Clone||LA104_0==Float||LA104_0==Identifier||LA104_0==Int||(LA104_0 >= LeftParanthesis && LA104_0 <= LeftSquareBrace)||LA104_0==LogicNot||LA104_0==Minus||LA104_0==MinusMinus||LA104_0==New||LA104_0==Null||(LA104_0 >= Parent && LA104_0 <= Plus)||LA104_0==PlusPlus||LA104_0==Self||LA104_0==String||LA104_0==This||LA104_0==TypeArray||LA104_0==VariableId) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:79: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall3030);
					expressionList324=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList324.getTree());

					}
					break;

			}

			char_literal325=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall3032); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal325_tree = 
			(CommonTree)adaptor.create(char_literal325)
			;
			adaptor.addChild(root_0, char_literal325_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:1: atom : ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal326=null;
		Token char_literal328=null;
		ParserRuleReturnScope expression327 =null;
		ParserRuleReturnScope incrementDecrement329 =null;
		ParserRuleReturnScope variableMemberStaticMember330 =null;
		ParserRuleReturnScope classConstant331 =null;
		ParserRuleReturnScope globalConstant332 =null;
		ParserRuleReturnScope array333 =null;
		ParserRuleReturnScope primitiveAtom334 =null;

		CommonTree char_literal326_tree=null;
		CommonTree char_literal328_tree=null;
		RewriteRuleTokenStream stream_LeftParanthesis=new RewriteRuleTokenStream(adaptor,"token LeftParanthesis");
		RewriteRuleTokenStream stream_RightParanthesis=new RewriteRuleTokenStream(adaptor,"token RightParanthesis");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:6: ( '(' expression ')' -> expression | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom )
			int alt105=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt105=1;
				}
				break;
			case Self:
				{
				int LA105_2 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt105=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA105_3 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt105=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA105_4 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt105=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA105_5 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt105=4;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt105=5;
				}
				else if ( (true) ) {
					alt105=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA105_6 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA105_7 = input.LA(2);
				if ( (synpred166_TSPHP()) ) {
					alt105=2;
				}
				else if ( (synpred167_TSPHP()) ) {
					alt105=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 7, input);
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
				alt105=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt105=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt105=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:579:8: '(' expression ')'
					{
					char_literal326=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom3042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LeftParanthesis.add(char_literal326);

					pushFollow(FOLLOW_expression_in_atom3044);
					expression327=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression327.getTree());
					char_literal328=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom3046); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RightParanthesis.add(char_literal328);

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
					// 579:27: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:4: incrementDecrement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom3055);
					incrementDecrement329=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement329.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: variableMemberStaticMember
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableMemberStaticMember_in_atom3060);
					variableMemberStaticMember330=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember330.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: classConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom3065);
					classConstant331=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant331.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: globalConstant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom3070);
					globalConstant332=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant332.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom3075);
					array333=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array333.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom3080);
					primitiveAtom334=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom334.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:588:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier335=null;

		CommonTree Identifier335_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:589:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:589:4: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier335=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant3092); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier335_tree = 
			(CommonTree)adaptor.create(Identifier335)
			;
			adaptor.addChild(root_0, Identifier335_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:592:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier337=null;
		ParserRuleReturnScope staticAccessOrParent336 =null;

		CommonTree Identifier337_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:593:4: staticAccessOrParent Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant3103);
			staticAccessOrParent336=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent336.getTree());

			Identifier337=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant3105); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier337_tree = 
			(CommonTree)adaptor.create(Identifier337)
			;
			adaptor.addChild(root_0, Identifier337_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:596:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal338=null;
		Token char_literal340=null;
		ParserRuleReturnScope primitiveAtom339 =null;
		ParserRuleReturnScope primitiveAtom341 =null;
		ParserRuleReturnScope primitiveAtom342 =null;

		CommonTree char_literal338_tree=null;
		CommonTree char_literal340_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt106=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt106=1;
				}
				break;
			case Minus:
				{
				alt106=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case Null:
			case String:
				{
				alt106=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:597:4: '+' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal338=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom3117); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal338_tree = 
					(CommonTree)adaptor.create(char_literal338)
					;
					adaptor.addChild(root_0, char_literal338_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3119);
					primitiveAtom339=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom339.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:598:4: '-' primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal340=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom3124); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal340_tree = 
					(CommonTree)adaptor.create(char_literal340)
					;
					adaptor.addChild(root_0, char_literal340_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3126);
					primitiveAtom341=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom341.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:599:4: primitiveAtom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3131);
					primitiveAtom342=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom342.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:602:1: primitiveAtom : ( Bool | Int | Float | String | Null | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set343=null;

		CommonTree set343_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:603:2: ( Bool | Int | Float | String | Null | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set343=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(CommonTree)adaptor.create(set343)
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal344=null;
		Token char_literal346=null;
		Token TypeArray347=null;
		Token char_literal348=null;
		Token char_literal350=null;
		ParserRuleReturnScope array_content345 =null;
		ParserRuleReturnScope array_content349 =null;

		CommonTree char_literal344_tree=null;
		CommonTree char_literal346_tree=null;
		CommonTree TypeArray347_tree=null;
		CommonTree char_literal348_tree=null;
		CommonTree char_literal350_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LeftSquareBrace) ) {
				alt109=1;
			}
			else if ( (LA109_0==TypeArray) ) {
				alt109=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:9: '[' ( array_content )? ']'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal344=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3629); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal344_tree = 
					(CommonTree)adaptor.create(char_literal344)
					;
					adaptor.addChild(root_0, char_literal344_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:13: ( array_content )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==At||LA107_0==Backslash||LA107_0==BitwiseNot||LA107_0==Bool||LA107_0==Clone||LA107_0==Float||LA107_0==Identifier||LA107_0==Int||(LA107_0 >= LeftParanthesis && LA107_0 <= LeftSquareBrace)||LA107_0==LogicNot||LA107_0==Minus||LA107_0==MinusMinus||LA107_0==New||LA107_0==Null||(LA107_0 >= Parent && LA107_0 <= Plus)||LA107_0==PlusPlus||LA107_0==Self||LA107_0==String||LA107_0==This||LA107_0==TypeArray||LA107_0==VariableId) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:665:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3631);
							array_content345=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content345.getTree());

							}
							break;

					}

					char_literal346=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3634); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal346_tree = 
					(CommonTree)adaptor.create(char_literal346)
					;
					adaptor.addChild(root_0, char_literal346_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					TypeArray347=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array3640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray347_tree = 
					(CommonTree)adaptor.create(TypeArray347)
					;
					adaptor.addChild(root_0, TypeArray347_tree);
					}

					char_literal348=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3642); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal348_tree = 
					(CommonTree)adaptor.create(char_literal348)
					;
					adaptor.addChild(root_0, char_literal348_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:18: ( array_content )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==At||LA108_0==Backslash||LA108_0==BitwiseNot||LA108_0==Bool||LA108_0==Clone||LA108_0==Float||LA108_0==Identifier||LA108_0==Int||(LA108_0 >= LeftParanthesis && LA108_0 <= LeftSquareBrace)||LA108_0==LogicNot||LA108_0==Minus||LA108_0==MinusMinus||LA108_0==New||LA108_0==Null||(LA108_0 >= Parent && LA108_0 <= Plus)||LA108_0==PlusPlus||LA108_0==Self||LA108_0==String||LA108_0==This||LA108_0==TypeArray||LA108_0==VariableId) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:666:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3644);
							array_content349=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content349.getTree());

							}
							break;

					}

					char_literal350=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3647); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal350_tree = 
					(CommonTree)adaptor.create(char_literal350)
					;
					adaptor.addChild(root_0, char_literal350_tree);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:669:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final TSPHPParser.array_content_return array_content() throws RecognitionException {
		TSPHPParser.array_content_return retval = new TSPHPParser.array_content_return();
		retval.start = input.LT(1);
		int array_content_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal352=null;
		Token char_literal354=null;
		Token string_literal356=null;
		ParserRuleReturnScope expression351 =null;
		ParserRuleReturnScope expression353 =null;
		ParserRuleReturnScope expression355 =null;
		ParserRuleReturnScope expression357 =null;

		CommonTree string_literal352_tree=null;
		CommonTree char_literal354_tree=null;
		CommonTree string_literal356_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:4: ( expression '=>' )?
			int alt110=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA110_1 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA110_2 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA110_3 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case At:
					{
					int LA110_4 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Clone:
					{
					int LA110_5 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case New:
					{
					int LA110_6 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Plus:
					{
					int LA110_7 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Minus:
					{
					int LA110_8 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Backslash:
					{
					int LA110_9 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Identifier:
					{
					int LA110_10 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Self:
					{
					int LA110_11 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Parent:
					{
					int LA110_12 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case This:
					{
					int LA110_13 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case VariableId:
					{
					int LA110_14 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case PlusPlus:
					{
					int LA110_15 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case MinusMinus:
					{
					int LA110_16 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA110_17 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA110_18 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case Null:
				case String:
					{
					int LA110_19 = input.LA(2);
					if ( (synpred181_TSPHP()) ) {
						alt110=1;
					}
					}
					break;
			}
			switch (alt110) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3660);
					expression351=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression351.getTree());

					string_literal352=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal352_tree = 
					(CommonTree)adaptor.create(string_literal352)
					;
					adaptor.addChild(root_0, string_literal352_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3666);
			expression353=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression353.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:35: ( ',' ( expression '=>' )? expression )*
			loop112:
			do {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==Comma) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:36: ',' ( expression '=>' )? expression
					{
					char_literal354=(Token)match(input,Comma,FOLLOW_Comma_in_array_content3670); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal354_tree = 
					(CommonTree)adaptor.create(char_literal354)
					;
					adaptor.addChild(root_0, char_literal354_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:40: ( expression '=>' )?
					int alt111=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA111_1 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA111_2 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA111_3 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case At:
							{
							int LA111_4 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Clone:
							{
							int LA111_5 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case New:
							{
							int LA111_6 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Plus:
							{
							int LA111_7 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Minus:
							{
							int LA111_8 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Backslash:
							{
							int LA111_9 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Identifier:
							{
							int LA111_10 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Self:
							{
							int LA111_11 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case Parent:
							{
							int LA111_12 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case This:
							{
							int LA111_13 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case VariableId:
							{
							int LA111_14 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case PlusPlus:
							{
							int LA111_15 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case MinusMinus:
							{
							int LA111_16 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA111_17 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA111_18 = input.LA(2);
							if ( (synpred182_TSPHP()) ) {
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
							if ( (synpred182_TSPHP()) ) {
								alt111=1;
							}
							}
							break;
					}
					switch (alt111) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3673);
							expression355=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression355.getTree());

							string_literal356=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3675); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal356_tree = 
							(CommonTree)adaptor.create(string_literal356)
							;
							adaptor.addChild(root_0, string_literal356_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3679);
					expression357=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression357.getTree());

					}
					break;

				default :
					break loop112;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:673:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal358=null;
		Token char_literal359=null;
		Token char_literal361=null;
		Token string_literal363=null;
		ParserRuleReturnScope expression360 =null;
		ParserRuleReturnScope instructionInclBreakContinue362 =null;
		ParserRuleReturnScope instructionInclBreakContinue364 =null;

		CommonTree string_literal358_tree=null;
		CommonTree char_literal359_tree=null;
		CommonTree char_literal361_tree=null;
		CommonTree string_literal363_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:674:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:674:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal358=(Token)match(input,If,FOLLOW_If_in_ifCondition3691); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal358_tree = 
			(CommonTree)adaptor.create(string_literal358)
			;
			adaptor.addChild(root_0, string_literal358_tree);
			}

			char_literal359=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3693); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal359_tree = 
			(CommonTree)adaptor.create(char_literal359)
			;
			adaptor.addChild(root_0, char_literal359_tree);
			}

			pushFollow(FOLLOW_expression_in_ifCondition3695);
			expression360=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression360.getTree());

			char_literal361=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3697); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal361_tree = 
			(CommonTree)adaptor.create(char_literal361)
			;
			adaptor.addChild(root_0, char_literal361_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3699);
			instructionInclBreakContinue362=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue362.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:3: ( 'else' instructionInclBreakContinue )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==Else) ) {
				int LA113_1 = input.LA(2);
				if ( (synpred184_TSPHP()) ) {
					alt113=1;
				}
			}
			switch (alt113) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:5: 'else' instructionInclBreakContinue
					{
					string_literal363=(Token)match(input,Else,FOLLOW_Else_in_ifCondition3706); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal363_tree = 
					(CommonTree)adaptor.create(string_literal363)
					;
					adaptor.addChild(root_0, string_literal363_tree);
					}

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3708);
					instructionInclBreakContinue364=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue364.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:679:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal365=null;
		Token char_literal366=null;
		Token VariableId367=null;
		Token char_literal368=null;
		Token char_literal369=null;
		Token char_literal380=null;
		ParserRuleReturnScope caseLabel370 =null;
		ParserRuleReturnScope instructionInclBreakContinue371 =null;
		ParserRuleReturnScope defaultLabel372 =null;
		ParserRuleReturnScope instructionInclBreakContinue373 =null;
		ParserRuleReturnScope caseLabel374 =null;
		ParserRuleReturnScope instructionInclBreakContinue375 =null;
		ParserRuleReturnScope caseLabel376 =null;
		ParserRuleReturnScope instructionInclBreakContinue377 =null;
		ParserRuleReturnScope defaultLabel378 =null;
		ParserRuleReturnScope instructionInclBreakContinue379 =null;

		CommonTree string_literal365_tree=null;
		CommonTree char_literal366_tree=null;
		CommonTree VariableId367_tree=null;
		CommonTree char_literal368_tree=null;
		CommonTree char_literal369_tree=null;
		CommonTree char_literal380_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal365=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition3724); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal365_tree = 
			(CommonTree)adaptor.create(string_literal365)
			;
			adaptor.addChild(root_0, string_literal365_tree);
			}

			char_literal366=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3726); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal366_tree = 
			(CommonTree)adaptor.create(char_literal366)
			;
			adaptor.addChild(root_0, char_literal366_tree);
			}

			VariableId367=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition3728); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId367_tree = 
			(CommonTree)adaptor.create(VariableId367)
			;
			adaptor.addChild(root_0, VariableId367_tree);
			}

			char_literal368=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3730); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal368_tree = 
			(CommonTree)adaptor.create(char_literal368)
			;
			adaptor.addChild(root_0, char_literal368_tree);
			}

			char_literal369=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3732); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal369_tree = 
			(CommonTree)adaptor.create(char_literal369)
			;
			adaptor.addChild(root_0, char_literal369_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==Case) ) {
				int LA126_1 = input.LA(2);
				if ( (synpred192_TSPHP()) ) {
					alt126=1;
				}
				else if ( (true) ) {
					alt126=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3743);
									caseLabel370=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel370.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:16: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3746);
									instructionInclBreakContinue371=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue371.getTree());

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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3751);
					defaultLabel372=defaultLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel372.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:61: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3753);
							instructionInclBreakContinue373=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue373.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt120=0;
					loop120:
					do {
						int alt120=2;
						int LA120_0 = input.LA(1);
						if ( (LA120_0==Case) ) {
							alt120=1;
						}

						switch (alt120) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3757);
									caseLabel374=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel374.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:103: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3760);
									instructionInclBreakContinue375=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue375.getTree());

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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					int cnt123=0;
					loop123:
					do {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==Case) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3770);
									caseLabel376=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel376.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:17: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3773);
									instructionInclBreakContinue377=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue377.getTree());

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

						default :
							if ( cnt123 >= 1 ) break loop123;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(123, input);
								throw eee;
						}
						cnt123++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==Default) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3779);
							defaultLabel378=defaultLabel();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel378.getTree());

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:63: ( instructionInclBreakContinue )+
							int cnt124=0;
							loop124:
							do {
								int alt124=2;
								int LA124_0 = input.LA(1);
								if ( (LA124_0==Backslash||LA124_0==Break||LA124_0==Continue||LA124_0==Do||LA124_0==Echo||LA124_0==Exit||(LA124_0 >= For && LA124_0 <= Foreach)||(LA124_0 >= Identifier && LA124_0 <= If)||LA124_0==LeftCurlyBrace||LA124_0==MinusMinus||LA124_0==Parent||LA124_0==PlusPlus||LA124_0==Return||LA124_0==Self||(LA124_0 >= Switch && LA124_0 <= TypeString)||LA124_0==VariableId||LA124_0==While) ) {
									alt124=1;
								}

								switch (alt124) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3781);
									instructionInclBreakContinue379=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue379.getTree());

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

							}
							break;

					}

					}
					break;

			}

			char_literal380=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3792); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal380_tree = 
			(CommonTree)adaptor.create(char_literal380)
			;
			adaptor.addChild(root_0, char_literal380_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:688:1: caseLabel : 'case' expression ':' ;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal381=null;
		Token char_literal383=null;
		ParserRuleReturnScope expression382 =null;

		CommonTree string_literal381_tree=null;
		CommonTree char_literal383_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:689:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:689:4: 'case' expression ':'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal381=(Token)match(input,Case,FOLLOW_Case_in_caseLabel3804); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal381_tree = 
			(CommonTree)adaptor.create(string_literal381)
			;
			adaptor.addChild(root_0, string_literal381_tree);
			}

			pushFollow(FOLLOW_expression_in_caseLabel3806);
			expression382=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression382.getTree());

			char_literal383=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel3808); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal383_tree = 
			(CommonTree)adaptor.create(char_literal383)
			;
			adaptor.addChild(root_0, char_literal383_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:691:1: defaultLabel : 'default' ':' ;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal384=null;
		Token char_literal385=null;

		CommonTree string_literal384_tree=null;
		CommonTree char_literal385_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:4: 'default' ':'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal384=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel3817); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal384_tree = 
			(CommonTree)adaptor.create(string_literal384)
			;
			adaptor.addChild(root_0, string_literal384_tree);
			}

			char_literal385=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel3819); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal385_tree = 
			(CommonTree)adaptor.create(char_literal385)
			;
			adaptor.addChild(root_0, char_literal385_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal386=null;
		Token char_literal387=null;
		Token char_literal389=null;
		Token char_literal391=null;
		Token char_literal393=null;
		ParserRuleReturnScope forInit388 =null;
		ParserRuleReturnScope expressionList390 =null;
		ParserRuleReturnScope forUpdate392 =null;
		ParserRuleReturnScope instructionInclBreakContinue394 =null;

		CommonTree string_literal386_tree=null;
		CommonTree char_literal387_tree=null;
		CommonTree char_literal389_tree=null;
		CommonTree char_literal391_tree=null;
		CommonTree char_literal393_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal386=(Token)match(input,For,FOLLOW_For_in_forLoop3828); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal386_tree = 
			(CommonTree)adaptor.create(string_literal386)
			;
			adaptor.addChild(root_0, string_literal386_tree);
			}

			char_literal387=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3830); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal387_tree = 
			(CommonTree)adaptor.create(char_literal387)
			;
			adaptor.addChild(root_0, char_literal387_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:21: ( forInit )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==Backslash||LA127_0==Identifier||LA127_0==MinusMinus||LA127_0==Parent||LA127_0==PlusPlus||LA127_0==Self||LA127_0==This||(LA127_0 >= TypeArray && LA127_0 <= TypeString)||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3832);
					forInit388=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit388.getTree());

					}
					break;

			}

			char_literal389=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal389_tree = 
			(CommonTree)adaptor.create(char_literal389)
			;
			adaptor.addChild(root_0, char_literal389_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:34: ( expressionList )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==At||LA128_0==Backslash||LA128_0==BitwiseNot||LA128_0==Bool||LA128_0==Clone||LA128_0==Float||LA128_0==Identifier||LA128_0==Int||(LA128_0 >= LeftParanthesis && LA128_0 <= LeftSquareBrace)||LA128_0==LogicNot||LA128_0==Minus||LA128_0==MinusMinus||LA128_0==New||LA128_0==Null||(LA128_0 >= Parent && LA128_0 <= Plus)||LA128_0==PlusPlus||LA128_0==Self||LA128_0==String||LA128_0==This||LA128_0==TypeArray||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3837);
					expressionList390=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList390.getTree());

					}
					break;

			}

			char_literal391=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3841); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal391_tree = 
			(CommonTree)adaptor.create(char_literal391)
			;
			adaptor.addChild(root_0, char_literal391_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:55: ( forUpdate )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==Backslash||LA129_0==Identifier||LA129_0==MinusMinus||LA129_0==Parent||LA129_0==PlusPlus||LA129_0==Self||LA129_0==This||LA129_0==VariableId) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3843);
					forUpdate392=forUpdate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate392.getTree());

					}
					break;

			}

			char_literal393=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3846); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal393_tree = 
			(CommonTree)adaptor.create(char_literal393)
			;
			adaptor.addChild(root_0, char_literal393_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3848);
			instructionInclBreakContinue394=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue394.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal397=null;
		ParserRuleReturnScope variableDeclaration395 =null;
		ParserRuleReturnScope variableAssignment396 =null;
		ParserRuleReturnScope variableAssignment398 =null;

		CommonTree char_literal397_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:11: ( variableDeclaration | variableAssignment )
			int alt130=2;
			alt130 = dfa130.predict(input);
			switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3857);
					variableDeclaration395=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration395.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3859);
					variableAssignment396=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment396.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:52: ( ',' variableAssignment )*
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Comma) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:53: ',' variableAssignment
					{
					char_literal397=(Token)match(input,Comma,FOLLOW_Comma_in_forInit3863); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal397_tree = 
					(CommonTree)adaptor.create(char_literal397)
					;
					adaptor.addChild(root_0, char_literal397_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forInit3865);
					variableAssignment398=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment398.getTree());

					}
					break;

				default :
					break loop131;
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:697:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal400=null;
		ParserRuleReturnScope variableAssignment399 =null;
		ParserRuleReturnScope variableAssignment401 =null;

		CommonTree char_literal400_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:4: variableAssignment ( ',' variableAssignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variableAssignment_in_forUpdate3875);
			variableAssignment399=variableAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment399.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:23: ( ',' variableAssignment )*
			loop132:
			do {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==Comma) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:24: ',' variableAssignment
					{
					char_literal400=(Token)match(input,Comma,FOLLOW_Comma_in_forUpdate3878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal400_tree = 
					(CommonTree)adaptor.create(char_literal400)
					;
					adaptor.addChild(root_0, char_literal400_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forUpdate3880);
					variableAssignment401=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment401.getTree());

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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:700:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal402=null;
		Token char_literal403=null;
		Token VariableId404=null;
		Token string_literal406=null;
		Token VariableId407=null;
		Token string_literal408=null;
		Token VariableId409=null;
		Token char_literal410=null;
		ParserRuleReturnScope array405 =null;
		ParserRuleReturnScope instructionInclBreakContinue411 =null;

		CommonTree string_literal402_tree=null;
		CommonTree char_literal403_tree=null;
		CommonTree VariableId404_tree=null;
		CommonTree string_literal406_tree=null;
		CommonTree VariableId407_tree=null;
		CommonTree string_literal408_tree=null;
		CommonTree VariableId409_tree=null;
		CommonTree char_literal410_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal402=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3891); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal402_tree = 
			(CommonTree)adaptor.create(string_literal402)
			;
			adaptor.addChild(root_0, string_literal402_tree);
			}

			char_literal403=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3893); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal403_tree = 
			(CommonTree)adaptor.create(char_literal403)
			;
			adaptor.addChild(root_0, char_literal403_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:18: ( VariableId | array )
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==VariableId) ) {
				alt133=1;
			}
			else if ( (LA133_0==LeftSquareBrace||LA133_0==TypeArray) ) {
				alt133=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}
			switch (alt133) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:19: VariableId
					{
					VariableId404=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3896); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId404_tree = 
					(CommonTree)adaptor.create(VariableId404)
					;
					adaptor.addChild(root_0, VariableId404_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3898);
					array405=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array405.getTree());

					}
					break;

			}

			string_literal406=(Token)match(input,As,FOLLOW_As_in_foreachLoop3901); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal406_tree = 
			(CommonTree)adaptor.create(string_literal406)
			;
			adaptor.addChild(root_0, string_literal406_tree);
			}

			VariableId407=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3903); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId407_tree = 
			(CommonTree)adaptor.create(VariableId407)
			;
			adaptor.addChild(root_0, VariableId407_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:53: ( '=>' VariableId )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==Arrow) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:54: '=>' VariableId
					{
					string_literal408=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3906); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal408_tree = 
					(CommonTree)adaptor.create(string_literal408)
					;
					adaptor.addChild(root_0, string_literal408_tree);
					}

					VariableId409=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId409_tree = 
					(CommonTree)adaptor.create(VariableId409)
					;
					adaptor.addChild(root_0, VariableId409_tree);
					}

					}
					break;

			}

			char_literal410=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3912); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal410_tree = 
			(CommonTree)adaptor.create(char_literal410)
			;
			adaptor.addChild(root_0, char_literal410_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3914);
			instructionInclBreakContinue411=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue411.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:703:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal412=null;
		Token char_literal413=null;
		Token char_literal415=null;
		ParserRuleReturnScope expression414 =null;
		ParserRuleReturnScope instructionInclBreakContinue416 =null;

		CommonTree string_literal412_tree=null;
		CommonTree char_literal413_tree=null;
		CommonTree char_literal415_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal412=(Token)match(input,While,FOLLOW_While_in_whileLoop3923); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal412_tree = 
			(CommonTree)adaptor.create(string_literal412)
			;
			adaptor.addChild(root_0, string_literal412_tree);
			}

			char_literal413=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3925); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal413_tree = 
			(CommonTree)adaptor.create(char_literal413)
			;
			adaptor.addChild(root_0, char_literal413_tree);
			}

			pushFollow(FOLLOW_expression_in_whileLoop3927);
			expression414=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression414.getTree());

			char_literal415=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3929); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal415_tree = 
			(CommonTree)adaptor.create(char_literal415)
			;
			adaptor.addChild(root_0, char_literal415_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3931);
			instructionInclBreakContinue416=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue416.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:706:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal417=null;
		Token string_literal419=null;
		Token char_literal420=null;
		Token char_literal422=null;
		Token char_literal423=null;
		ParserRuleReturnScope instructionInclBreakContinue418 =null;
		ParserRuleReturnScope expression421 =null;

		CommonTree string_literal417_tree=null;
		CommonTree string_literal419_tree=null;
		CommonTree char_literal420_tree=null;
		CommonTree char_literal422_tree=null;
		CommonTree char_literal423_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:707:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal417=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop3941); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal417_tree = 
			(CommonTree)adaptor.create(string_literal417)
			;
			adaptor.addChild(root_0, string_literal417_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3943);
			instructionInclBreakContinue418=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue418.getTree());

			string_literal419=(Token)match(input,While,FOLLOW_While_in_doWhileLoop3945); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal419_tree = 
			(CommonTree)adaptor.create(string_literal419)
			;
			adaptor.addChild(root_0, string_literal419_tree);
			}

			char_literal420=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3947); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal420_tree = 
			(CommonTree)adaptor.create(char_literal420)
			;
			adaptor.addChild(root_0, char_literal420_tree);
			}

			pushFollow(FOLLOW_expression_in_doWhileLoop3949);
			expression421=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression421.getTree());

			char_literal422=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3951); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal422_tree = 
			(CommonTree)adaptor.create(char_literal422)
			;
			adaptor.addChild(root_0, char_literal422_tree);
			}

			char_literal423=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3953); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal423_tree = 
			(CommonTree)adaptor.create(char_literal423)
			;
			adaptor.addChild(root_0, char_literal423_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal424=null;
		Token char_literal425=null;
		Token char_literal427=null;
		Token string_literal428=null;
		Token char_literal429=null;
		Token VariableId431=null;
		Token char_literal432=null;
		Token char_literal433=null;
		Token char_literal435=null;
		ParserRuleReturnScope instructionInclBreakContinue426 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject430 =null;
		ParserRuleReturnScope instructionInclBreakContinue434 =null;

		CommonTree string_literal424_tree=null;
		CommonTree char_literal425_tree=null;
		CommonTree char_literal427_tree=null;
		CommonTree string_literal428_tree=null;
		CommonTree char_literal429_tree=null;
		CommonTree VariableId431_tree=null;
		CommonTree char_literal432_tree=null;
		CommonTree char_literal433_tree=null;
		CommonTree char_literal435_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal424=(Token)match(input,Try,FOLLOW_Try_in_tryCatch3960); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal424_tree = 
			(CommonTree)adaptor.create(string_literal424)
			;
			adaptor.addChild(root_0, string_literal424_tree);
			}

			char_literal425=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3962); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal425_tree = 
			(CommonTree)adaptor.create(char_literal425)
			;
			adaptor.addChild(root_0, char_literal425_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:21: ( instructionInclBreakContinue )+
			int cnt135=0;
			loop135:
			do {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==Backslash||LA135_0==Break||LA135_0==Continue||LA135_0==Do||LA135_0==Echo||LA135_0==Exit||(LA135_0 >= For && LA135_0 <= Foreach)||(LA135_0 >= Identifier && LA135_0 <= If)||LA135_0==LeftCurlyBrace||LA135_0==MinusMinus||LA135_0==Parent||LA135_0==PlusPlus||LA135_0==Return||LA135_0==Self||(LA135_0 >= Switch && LA135_0 <= TypeString)||LA135_0==VariableId||LA135_0==While) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3964);
					instructionInclBreakContinue426=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue426.getTree());

					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(135, input);
						throw eee;
				}
				cnt135++;
			} while (true);

			char_literal427=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3967); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal427_tree = 
			(CommonTree)adaptor.create(char_literal427)
			;
			adaptor.addChild(root_0, char_literal427_tree);
			}

			string_literal428=(Token)match(input,Catch,FOLLOW_Catch_in_tryCatch3969); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal428_tree = 
			(CommonTree)adaptor.create(string_literal428)
			;
			adaptor.addChild(root_0, string_literal428_tree);
			}

			char_literal429=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3971); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal429_tree = 
			(CommonTree)adaptor.create(char_literal429)
			;
			adaptor.addChild(root_0, char_literal429_tree);
			}

			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3973);
			classInterfaceTypeInclObject430=classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject430.getTree());

			VariableId431=(Token)match(input,VariableId,FOLLOW_VariableId_in_tryCatch3975); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId431_tree = 
			(CommonTree)adaptor.create(VariableId431)
			;
			adaptor.addChild(root_0, VariableId431_tree);
			}

			char_literal432=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3977); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal432_tree = 
			(CommonTree)adaptor.create(char_literal432)
			;
			adaptor.addChild(root_0, char_literal432_tree);
			}

			char_literal433=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3978); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal433_tree = 
			(CommonTree)adaptor.create(char_literal433)
			;
			adaptor.addChild(root_0, char_literal433_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:114: ( instructionInclBreakContinue )*
			loop136:
			do {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==Backslash||LA136_0==Break||LA136_0==Continue||LA136_0==Do||LA136_0==Echo||LA136_0==Exit||(LA136_0 >= For && LA136_0 <= Foreach)||(LA136_0 >= Identifier && LA136_0 <= If)||LA136_0==LeftCurlyBrace||LA136_0==MinusMinus||LA136_0==Parent||LA136_0==PlusPlus||LA136_0==Return||LA136_0==Self||(LA136_0 >= Switch && LA136_0 <= TypeString)||LA136_0==VariableId||LA136_0==While) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:709:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3980);
					instructionInclBreakContinue434=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue434.getTree());

					}
					break;

				default :
					break loop136;
				}
			} while (true);

			char_literal435=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3983); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal435_tree = 
			(CommonTree)adaptor.create(char_literal435)
			;
			adaptor.addChild(root_0, char_literal435_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:711:1: throwException : 'throw' newObject ';' ;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal436=null;
		Token char_literal438=null;
		ParserRuleReturnScope newObject437 =null;

		CommonTree string_literal436_tree=null;
		CommonTree char_literal438_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:712:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:712:4: 'throw' newObject ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal436=(Token)match(input,Throw,FOLLOW_Throw_in_throwException3992); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal436_tree = 
			(CommonTree)adaptor.create(string_literal436)
			;
			adaptor.addChild(root_0, string_literal436_tree);
			}

			pushFollow(FOLLOW_newObject_in_throwException3994);
			newObject437=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject437.getTree());

			char_literal438=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException3996); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal438_tree = 
			(CommonTree)adaptor.create(char_literal438)
			;
			adaptor.addChild(root_0, char_literal438_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred69_TSPHP1892);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP1894); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred70_TSPHP
	public final void synpred70_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred70_TSPHP1899);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred70_TSPHP1901); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred70_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: ( functionCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:4: functionCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1946);
		functionCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP1948); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred80_TSPHP
	public final void synpred80_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: ( methodCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: methodCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1953);
		methodCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred80_TSPHP1955); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred80_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:432:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred101_TSPHP2223); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred101_TSPHP2226);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred102_TSPHP2242); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred102_TSPHP2245);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred103_TSPHP2261); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred103_TSPHP2264);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred104_TSPHP2278);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred104_TSPHP2281);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred131_TSPHP
	public final void synpred131_TSPHP_fragment() throws RecognitionException {
		Token cast=null;


		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: (cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:493:4: cast= '(' allTypesWithoutResource ')' castOrBitwiseNotOrAt
		{
		cast=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred131_TSPHP2591); if (state.failed) return ;

		pushFollow(FOLLOW_allTypesWithoutResource_in_synpred131_TSPHP2593);
		allTypesWithoutResource();
		state._fsp--;
		if (state.failed) return ;

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred131_TSPHP2595); if (state.failed) return ;

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2597);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred131_TSPHP

	// $ANTLR start synpred150_TSPHP
	public final void synpred150_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: ( functionCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:542:4: functionCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2859);
		functionCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred150_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: ( methodCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:543:4: methodCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2864);
		methodCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred153_TSPHP
	public final void synpred153_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred153_TSPHP2897);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred153_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: ( functionCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:4: functionCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_functionCall_in_synpred154_TSPHP2895);
		functionCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: ( callOrAccess )*
		loop153:
		do {
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==ObjectOperator) ) {
				int LA153_1 = input.LA(2);
				if ( (synpred153_TSPHP()) ) {
					alt153=1;
				}

			}
			else if ( (LA153_0==LeftSquareBrace) ) {
				alt153=1;
			}

			switch (alt153) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:552:17: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred154_TSPHP2897);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop153;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred154_TSPHP2900);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred160_TSPHP
	public final void synpred160_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred160_TSPHP2992);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred160_TSPHP

	// $ANTLR start synpred161_TSPHP
	public final void synpred161_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:5: ( methodCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:5: methodCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_methodCall_in_synpred161_TSPHP2990);
		methodCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: ( callOrAccess )*
		loop154:
		do {
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==ObjectOperator) ) {
				int LA154_1 = input.LA(2);
				if ( (synpred160_TSPHP()) ) {
					alt154=1;
				}

			}
			else if ( (LA154_0==LeftSquareBrace) ) {
				alt154=1;
			}

			switch (alt154) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:16: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred161_TSPHP2992);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop154;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred161_TSPHP2995);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred161_TSPHP

	// $ANTLR start synpred166_TSPHP
	public final void synpred166_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred166_TSPHP3055);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred166_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: ( variableMemberStaticMember )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: variableMemberStaticMember
		{
		pushFollow(FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP3060);
		variableMemberStaticMember();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred168_TSPHP
	public final void synpred168_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:582:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred168_TSPHP3065);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred168_TSPHP

	// $ANTLR start synpred169_TSPHP
	public final void synpred169_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:583:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred169_TSPHP3070);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred169_TSPHP

	// $ANTLR start synpred181_TSPHP
	public final void synpred181_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred181_TSPHP3660);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred181_TSPHP3662); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred181_TSPHP

	// $ANTLR start synpred182_TSPHP
	public final void synpred182_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred182_TSPHP3673);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred182_TSPHP3675); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred182_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:675:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred184_TSPHP3706); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3708);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred184_TSPHP

	// $ANTLR start synpred192_TSPHP
	public final void synpred192_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3743);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;

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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:16: ( instructionInclBreakContinue )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3746);
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

		pushFollow(FOLLOW_defaultLabel_in_synpred192_TSPHP3751);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:61: ( instructionInclBreakContinue )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3753);
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		int cnt167=0;
		loop167:
		do {
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==Case) ) {
				alt167=1;
			}

			switch (alt167) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred192_TSPHP3757);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:103: ( instructionInclBreakContinue )+
				int cnt166=0;
				loop166:
				do {
					int alt166=2;
					int LA166_0 = input.LA(1);
					if ( (LA166_0==Backslash||LA166_0==Break||LA166_0==Continue||LA166_0==Do||LA166_0==Echo||LA166_0==Exit||(LA166_0 >= For && LA166_0 <= Foreach)||(LA166_0 >= Identifier && LA166_0 <= If)||LA166_0==LeftCurlyBrace||LA166_0==MinusMinus||LA166_0==Parent||LA166_0==PlusPlus||LA166_0==Return||LA166_0==Self||(LA166_0 >= Switch && LA166_0 <= TypeString)||LA166_0==VariableId||LA166_0==While) ) {
						alt166=1;
					}

					switch (alt166) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:682:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3760);
						instructionInclBreakContinue();
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
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA103 dfa103 = new DFA103(this);
	protected DFA130 dfa130 = new DFA130(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\66\1\uffff\1\12\1\uffff\1\66\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\u0082\1\74\1\uffff\1\152\1\uffff\1\66\1\uffff\1\152";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\14\uffff\1\2\4\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\4\uffff"+
			"\1\1\11\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\14\2\2"+
			"\uffff\2\2\1\uffff\1\2",
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
			return "183:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA48_eotS =
		"\27\uffff";
	static final String DFA48_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA48_minS =
		"\1\12\4\u0080\1\66\1\12\1\7\1\66\1\uffff\1\12\2\uffff\1\12\4\u0080\1\66"+
		"\1\12\1\7\1\66\1\12";
	static final String DFA48_maxS =
		"\1\174\4\u0080\1\66\1\u0080\1\174\1\66\1\uffff\1\174\2\uffff\5\u0080\1"+
		"\66\1\u0080\1\145\1\66\1\u0080";
	static final String DFA48_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA48_specialS =
		"\27\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\5\53\uffff\1\6\76\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\165\uffff\1\7",
			"\1\11\2\uffff\1\14\17\uffff\1\12\33\uffff\1\14\56\uffff\1\13\17\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\53\uffff\1\23\76\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\165\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\165\uffff\1\24",
			"\1\14\22\uffff\1\13\112\uffff\1\13",
			"\1\26",
			"\1\25\165\uffff\1\24"
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
			return "341:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA103_eotS =
		"\12\uffff";
	static final String DFA103_eofS =
		"\12\uffff";
	static final String DFA103_minS =
		"\1\12\3\66\1\12\2\uffff\2\66\1\12";
	static final String DFA103_maxS =
		"\3\u0080\1\66\1\46\2\uffff\1\66\1\u0080\1\46";
	static final String DFA103_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA103_specialS =
		"\12\uffff}>";
	static final String[] DFA103_transitionS = {
			"\1\3\53\uffff\1\4\41\uffff\1\2\20\uffff\1\1\10\uffff\1\5\15\uffff\1\5",
			"\1\6\111\uffff\1\5",
			"\1\6\111\uffff\1\5",
			"\1\4",
			"\1\7\33\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\111\uffff\1\5",
			"\1\7\33\uffff\1\10"
	};

	static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
	static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
	static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
	static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
	static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
	static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
	static final short[][] DFA103_transition;

	static {
		int numStates = DFA103_transitionS.length;
		DFA103_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
		}
	}

	class DFA103 extends DFA {

		public DFA103(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 103;
			this.eot = DFA103_eot;
			this.eof = DFA103_eof;
			this.min = DFA103_min;
			this.max = DFA103_max;
			this.accept = DFA103_accept;
			this.special = DFA103_special;
			this.transition = DFA103_transition;
		}
		@Override
		public String getDescription() {
			return "576:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )";
		}
	}

	static final String DFA130_eotS =
		"\7\uffff";
	static final String DFA130_eofS =
		"\7\uffff";
	static final String DFA130_minS =
		"\1\12\1\uffff\1\66\1\12\1\uffff\1\66\1\12";
	static final String DFA130_maxS =
		"\1\u0080\1\uffff\1\66\1\u0080\1\uffff\1\66\1\u0080";
	static final String DFA130_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA130_specialS =
		"\7\uffff}>";
	static final String[] DFA130_transitionS = {
			"\1\2\53\uffff\1\3\22\uffff\1\4\16\uffff\1\4\2\uffff\1\4\15\uffff\1\4"+
			"\10\uffff\1\4\2\uffff\10\1\3\uffff\1\4",
			"",
			"\1\3",
			"\1\5\33\uffff\1\4\131\uffff\1\1",
			"",
			"\1\6",
			"\1\5\33\uffff\1\4\131\uffff\1\1"
	};

	static final short[] DFA130_eot = DFA.unpackEncodedString(DFA130_eotS);
	static final short[] DFA130_eof = DFA.unpackEncodedString(DFA130_eofS);
	static final char[] DFA130_min = DFA.unpackEncodedStringToUnsignedChars(DFA130_minS);
	static final char[] DFA130_max = DFA.unpackEncodedStringToUnsignedChars(DFA130_maxS);
	static final short[] DFA130_accept = DFA.unpackEncodedString(DFA130_acceptS);
	static final short[] DFA130_special = DFA.unpackEncodedString(DFA130_specialS);
	static final short[][] DFA130_transition;

	static {
		int numStates = DFA130_transitionS.length;
		DFA130_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA130_transition[i] = DFA.unpackEncodedString(DFA130_transitionS[i]);
		}
	}

	class DFA130 extends DFA {

		public DFA130(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 130;
			this.eot = DFA130_eot;
			this.eof = DFA130_eof;
			this.min = DFA130_min;
			this.max = DFA130_max;
			this.accept = DFA130_accept;
			this.special = DFA130_special;
			this.transition = DFA130_transition;
		}
		@Override
		public String getDescription() {
			return "696:11: ( variableDeclaration | variableAssignment )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog957 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon972 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon974 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon976 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon978 = new BitSet(new long[]{0x18C3A90410800412L,0x9FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket991 = new BitSet(new long[]{0x1040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket993 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket996 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket998 = new BitSet(new long[]{0x18C3A90410800410L,0x9FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1097 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1100 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1102 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1115 = new BitSet(new long[]{0x18C3A90410800412L,0x9FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1148 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1150 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1153 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1155 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1172 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1174 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1176 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1185 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1186 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1198 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1250 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1252 = new BitSet(new long[]{0x1100100000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1254 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1257 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1260 = new BitSet(new long[]{0x0002200010000010L,0x0000800310000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1262 = new BitSet(new long[]{0x0002200010000010L,0x0000801310000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1279 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1290 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1293 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1295 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1306 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1341 = new BitSet(new long[]{0x0000000000000000L,0x13C0000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1343 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1345 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1348 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1350 = new BitSet(new long[]{0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1364 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1367 = new BitSet(new long[]{0x0440400000040000L,0x0001000002080080L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1382 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1384 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1421 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1424 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1427 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1429 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1446 = new BitSet(new long[]{0x0002000000000000L,0x0000000300000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1448 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1462 = new BitSet(new long[]{0x0002200000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1464 = new BitSet(new long[]{0x0002000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1472 = new BitSet(new long[]{0x0002000000000000L,0x0000800310000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1474 = new BitSet(new long[]{0x0002000000000000L,0x0000000310000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1488 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1505 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1507 = new BitSet(new long[]{0x1100000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1509 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1512 = new BitSet(new long[]{0x0002000010000000L,0x0000001200000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1514 = new BitSet(new long[]{0x0002000010000000L,0x0000001200000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1542 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1545 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1563 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1565 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1567 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1580 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1582 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1584 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1586 = new BitSet(new long[]{0x0040000000000400L,0x1FE0002000000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1588 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_allTypesWithoutResource1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypesWithoutResource1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1710 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1744 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1747 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1749 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1756 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1759 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1761 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1768 = new BitSet(new long[]{0x0040000004000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1771 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1773 = new BitSet(new long[]{0x0040000004000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1778 = new BitSet(new long[]{0x0040000000000400L,0x1FE0000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1780 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1806 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1809 = new BitSet(new long[]{0x0440400000040000L,0x0001000002080080L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1833 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1835 = new BitSet(new long[]{0x10C1890400000400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1855 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1857 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1871 = new BitSet(new long[]{0x0400000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1877 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1892 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1899 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1946 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1953 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1961 = new BitSet(new long[]{0x6440400001042500L,0x002506000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_instruction1963 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1971 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_instruction1973 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1980 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1994 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1997 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expressionList2000 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment2011 = new BitSet(new long[]{0x0000002200029080L,0x0000500004002900L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment2013 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variableAssignment2015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_variableAssignment2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000200L});
	public static final BitSet FOLLOW_PlusPlus_in_postIncrementDecrement2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MinusMinus_in_postIncrementDecrement2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PlusPlus_in_preIncrementDecrement2151 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_MinusMinus_in_preIncrementDecrement2153 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2181 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2184 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2208 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2223 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2242 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2258 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2261 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_ternary_in_assignment2275 = new BitSet(new long[]{0x0000002200029082L,0x0000500004002900L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2278 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_ternary_in_assignment2281 = new BitSet(new long[]{0x0000002200029082L,0x0000500004002900L});
	public static final BitSet FOLLOW_logicOr_in_ternary2291 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2294 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_ternary2297 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2299 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_ternary2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2315 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2330 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2344 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2347 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2350 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2361 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2364 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2367 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2378 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2381 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2384 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2393 = new BitSet(new long[]{0x0020040000000002L,0x0000000000070000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2396 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_comparison_in_equality2399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2441 = new BitSet(new long[]{0x800C000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2444 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2483 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2486 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2493 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2503 = new BitSet(new long[]{0x0000001000000002L,0x0000000002000080L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2506 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2515 = new BitSet(new long[]{0x0000001000000002L,0x0000000002000080L});
	public static final BitSet FOLLOW_logicNot_in_factor2525 = new BitSet(new long[]{0x0000000100000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_set_in_factor2528 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicNot_in_factor2537 = new BitSet(new long[]{0x0000000100000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2546 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2566 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2569 = new BitSet(new long[]{0x0040000000000400L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2591 = new BitSet(new long[]{0x0040000000000400L,0x17E0000000000000L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_castOrBitwiseNotOrAt2593 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2595 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000001L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2613 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000001L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2621 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000001L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2641 = new BitSet(new long[]{0x0040000000000400L,0x0004020001000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_newOrClone2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_newOrClone2654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2669 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2671 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2677 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2679 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2685 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2687 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccessOrParent2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccessOrParent2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2719 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_memberAccessOrArrayAccess2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccess2746 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccess2748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2758 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2760 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2775 = new BitSet(new long[]{0x0040000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2777 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2780 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_newObject2782 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary2813 = new BitSet(new long[]{0x6440400000040400L,0x0025020009080200L,0x0000000000000001L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary2833 = new BitSet(new long[]{0x6440400000040400L,0x0025020009080200L,0x0000000000000001L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary2869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2881 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2895 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2897 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2919 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2921 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2923 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call2955 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call2957 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call2959 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_call2961 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call2963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2974 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2990 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2992 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd3000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd3002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_methodCall3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall3018 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_methodCall3023 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3026 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall3028 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_methodCall3030 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall3032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom3042 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_atom3044 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom3046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_atom3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom3065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom3070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom3075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant3103 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom3117 = new BitSet(new long[]{0x0440400000040000L,0x0001000000080000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom3124 = new BitSet(new long[]{0x0440400000040000L,0x0001000000080000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom3131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3629 = new BitSet(new long[]{0x6440400001042500L,0x002502400B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_array_content_in_array3631 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3640 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3642 = new BitSet(new long[]{0x6440400001042500L,0x002502200B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_array_content_in_array3644 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3660 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3662 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_array_content3666 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3670 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_array_content3673 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3675 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_array_content3679 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3691 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3693 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_ifCondition3695 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3697 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3699 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3706 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3724 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3728 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3730 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3732 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3743 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3746 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3751 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3753 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3757 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3760 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3770 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3773 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3779 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3781 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3804 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_caseLabel3806 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3817 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3828 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3830 = new BitSet(new long[]{0x0040000000000400L,0x1FE4060009000200L,0x0000000000000001L});
	public static final BitSet FOLLOW_forInit_in_forLoop3832 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3835 = new BitSet(new long[]{0x6440400001042500L,0x002506000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3837 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3841 = new BitSet(new long[]{0x0040000000000400L,0x0004022009000200L,0x0000000000000001L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3843 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3846 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3857 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3859 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3863 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3865 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3875 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3878 = new BitSet(new long[]{0x0040000000000400L,0x0004020009000200L,0x0000000000000001L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3880 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3891 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3893 = new BitSet(new long[]{0x4000000000000000L,0x0020000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3896 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3898 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3903 = new BitSet(new long[]{0x0000000000000020L,0x0000002000000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3908 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3912 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3923 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3925 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_whileLoop3927 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3929 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3941 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3945 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3947 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3949 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3951 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3960 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3962 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3964 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3967 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3969 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3971 = new BitSet(new long[]{0x0040000000000400L,0x0400000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3975 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3977 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3978 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3980 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE021809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_newObject_in_throwException3994 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred69_TSPHP1892 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred70_TSPHP1899 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred70_TSPHP1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1946 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1953 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred80_TSPHP1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred101_TSPHP2223 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred101_TSPHP2226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred102_TSPHP2242 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred102_TSPHP2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred103_TSPHP2261 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_assignment_in_synpred103_TSPHP2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred104_TSPHP2278 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088288L,0x0000000000000001L});
	public static final BitSet FOLLOW_ternary_in_synpred104_TSPHP2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred131_TSPHP2591 = new BitSet(new long[]{0x0040000000000400L,0x17E0000000000000L});
	public static final BitSet FOLLOW_allTypesWithoutResource_in_synpred131_TSPHP2593 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred131_TSPHP2595 = new BitSet(new long[]{0x6440400001042500L,0x002502000B088280L,0x0000000000000001L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred131_TSPHP2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred150_TSPHP2859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred153_TSPHP2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_synpred154_TSPHP2895 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred154_TSPHP2897 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred154_TSPHP2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred160_TSPHP2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_synpred161_TSPHP2990 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred161_TSPHP2992 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred161_TSPHP2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred166_TSPHP3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_synpred167_TSPHP3060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred168_TSPHP3065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred169_TSPHP3070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred181_TSPHP3660 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred181_TSPHP3662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred182_TSPHP3673 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred182_TSPHP3675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred184_TSPHP3706 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred184_TSPHP3708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3743 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3746 = new BitSet(new long[]{0x10C18904A0280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred192_TSPHP3751 = new BitSet(new long[]{0x10C1890420080400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3753 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_caseLabel_in_synpred192_TSPHP3757 = new BitSet(new long[]{0x10C1890420280400L,0x1FFE020809000200L,0x0000000000000005L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred192_TSPHP3760 = new BitSet(new long[]{0x10C1890420280402L,0x1FFE020809000200L,0x0000000000000005L});
}
