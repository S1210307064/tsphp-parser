// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-14 00:09:35

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "Backslash", "BitwiseAnd", "BitwiseAndEqual", "BitwiseNot", "BitwiseOr", "BitwiseOrEqual", "BitwiseXor", "BitwiseXorEqual", "Bool", "Break", "Case", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Continue", "DECIMAL", "Default", "Divide", "DivideEqual", "Do", "Dolar", "Dot", "DotEqual", "DoubleColon", "EXPONENT", "Echo", "Else", "Equal", "Exit", "Extends", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "Minus", "MinusEqual", "MinusMinus", "Modulo", "ModuloEqual", "Multiply", "MultiplyEqual", "NULL", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "Parent", "Plus", "PlusEqual", "PlusPlus", "Private", "ProtectParent", "ProtectSelf", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "Self", "Semicolon", "ShiftLeft", "ShiftLeftEqual", "ShiftRight", "ShiftRightEqual", "Static", "String", "Switch", "This", "Throw", "Try", "TypeArray", "TypeBool", "TypeBoolean", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "Use", "VariableId", "Void", "While", "Whitespace"
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
	public static final int Case=20;
	public static final int Catch=21;
	public static final int Class=22;
	public static final int Clone=23;
	public static final int Colon=24;
	public static final int Comma=25;
	public static final int Comment=26;
	public static final int Const=27;
	public static final int Continue=28;
	public static final int DECIMAL=29;
	public static final int Default=30;
	public static final int Divide=31;
	public static final int DivideEqual=32;
	public static final int Do=33;
	public static final int Dolar=34;
	public static final int Dot=35;
	public static final int DotEqual=36;
	public static final int DoubleColon=37;
	public static final int EXPONENT=38;
	public static final int Echo=39;
	public static final int Else=40;
	public static final int Equal=41;
	public static final int Exit=42;
	public static final int Extends=43;
	public static final int Final=44;
	public static final int Float=45;
	public static final int For=46;
	public static final int Foreach=47;
	public static final int Function=48;
	public static final int GreaterEqualThan=49;
	public static final int GreaterThan=50;
	public static final int HEXADECIMAL=51;
	public static final int Identical=52;
	public static final int Identifier=53;
	public static final int If=54;
	public static final int Implements=55;
	public static final int Instanceof=56;
	public static final int Int=57;
	public static final int Interface=58;
	public static final int LeftCurlyBrace=59;
	public static final int LeftParanthesis=60;
	public static final int LeftSquareBrace=61;
	public static final int LessEqualThan=62;
	public static final int LessThan=63;
	public static final int LogicAnd=64;
	public static final int LogicAndWeak=65;
	public static final int LogicNot=66;
	public static final int LogicOr=67;
	public static final int LogicOrWeak=68;
	public static final int LogicXorWeak=69;
	public static final int Minus=70;
	public static final int MinusEqual=71;
	public static final int MinusMinus=72;
	public static final int Modulo=73;
	public static final int ModuloEqual=74;
	public static final int Multiply=75;
	public static final int MultiplyEqual=76;
	public static final int NULL=77;
	public static final int Namespace=78;
	public static final int New=79;
	public static final int NotEqual=80;
	public static final int NotEqualAlternative=81;
	public static final int NotIdentical=82;
	public static final int Null=83;
	public static final int OCTAL=84;
	public static final int ObjectOperator=85;
	public static final int Parent=86;
	public static final int Plus=87;
	public static final int PlusEqual=88;
	public static final int PlusPlus=89;
	public static final int Private=90;
	public static final int ProtectParent=91;
	public static final int ProtectSelf=92;
	public static final int ProtectThis=93;
	public static final int Protected=94;
	public static final int Public=95;
	public static final int QuestionMark=96;
	public static final int Return=97;
	public static final int RightCurlyBrace=98;
	public static final int RightParanthesis=99;
	public static final int RightSquareBrace=100;
	public static final int STRING_DOUBLE_QUOTED=101;
	public static final int STRING_SINGLE_QUOTED=102;
	public static final int Self=103;
	public static final int Semicolon=104;
	public static final int ShiftLeft=105;
	public static final int ShiftLeftEqual=106;
	public static final int ShiftRight=107;
	public static final int ShiftRightEqual=108;
	public static final int Static=109;
	public static final int String=110;
	public static final int Switch=111;
	public static final int This=112;
	public static final int Throw=113;
	public static final int Try=114;
	public static final int TypeArray=115;
	public static final int TypeBool=116;
	public static final int TypeBoolean=117;
	public static final int TypeFloat=118;
	public static final int TypeInt=119;
	public static final int TypeObject=120;
	public static final int TypeResource=121;
	public static final int TypeString=122;
	public static final int Use=123;
	public static final int VariableId=124;
	public static final int Void=125;
	public static final int While=126;
	public static final int Whitespace=127;

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
		this.state.ruleMemo = new HashMap[314+1];
		 

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
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );
	public final TSPHPParser.prog_return prog() throws RecognitionException {
		TSPHPParser.prog_return retval = new TSPHPParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		Object root_0 = null;

		Token EOF2=null;
		Token EOF4=null;
		Token EOF6=null;
		ParserRuleReturnScope namespaceSemicolon1 =null;
		ParserRuleReturnScope namespaceBracket3 =null;
		ParserRuleReturnScope withoutNamespace5 =null;

		Object EOF2_tree=null;
		Object EOF4_tree=null;
		Object EOF6_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:6: ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF )
			int alt3=3;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: ( namespaceSemicolon )+ EOF
					{
					root_0 = (Object)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: ( namespaceSemicolon )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:177:8: namespaceSemicolon
							{
							pushFollow(FOLLOW_namespaceSemicolon_in_prog924);
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

					EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog927); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF2_tree = 
					(Object)adaptor.create(EOF2)
					;
					adaptor.addChild(root_0, EOF2_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( namespaceBracket )+ EOF
					{
					root_0 = (Object)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: ( namespaceBracket )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:178:4: namespaceBracket
							{
							pushFollow(FOLLOW_namespaceBracket_in_prog932);
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

					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF4_tree = 
					(Object)adaptor.create(EOF4)
					;
					adaptor.addChild(root_0, EOF4_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:179:4: withoutNamespace EOF
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_withoutNamespace_in_prog940);
					withoutNamespace5=withoutNamespace();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withoutNamespace5.getTree());

					EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_prog942); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF6_tree = 
					(Object)adaptor.create(EOF6)
					;
					adaptor.addChild(root_0, EOF6_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class namespaceSemicolon_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceSemicolon"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:182:1: namespaceSemicolon : ( 'namespace' namespaceId ';' ( statement )+ ) ;
	public final TSPHPParser.namespaceSemicolon_return namespaceSemicolon() throws RecognitionException {
		TSPHPParser.namespaceSemicolon_return retval = new TSPHPParser.namespaceSemicolon_return();
		retval.start = input.LT(1);
		int namespaceSemicolon_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		ParserRuleReturnScope namespaceId8 =null;
		ParserRuleReturnScope statement10 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:2: ( ( 'namespace' namespaceId ';' ( statement )+ ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' namespaceId ';' ( statement )+ )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:4: ( 'namespace' namespaceId ';' ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:5: 'namespace' namespaceId ';' ( statement )+
			{
			string_literal7=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceSemicolon955); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal7_tree = 
			(Object)adaptor.create(string_literal7)
			;
			adaptor.addChild(root_0, string_literal7_tree);
			}

			pushFollow(FOLLOW_namespaceId_in_namespaceSemicolon957);
			namespaceId8=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId8.getTree());

			char_literal9=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_namespaceSemicolon959); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal9_tree = 
			(Object)adaptor.create(char_literal9)
			;
			adaptor.addChild(root_0, char_literal9_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:33: ( statement )+
			int cnt4=0;
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Backslash||LA4_0==Class||LA4_0==Const||LA4_0==Do||LA4_0==Echo||LA4_0==Exit||LA4_0==Final||(LA4_0 >= For && LA4_0 <= Function)||(LA4_0 >= Identifier && LA4_0 <= If)||(LA4_0 >= Interface && LA4_0 <= LeftCurlyBrace)||LA4_0==MinusMinus||LA4_0==Parent||LA4_0==PlusPlus||LA4_0==Return||LA4_0==Self||(LA4_0 >= Switch && LA4_0 <= VariableId)||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:183:33: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceSemicolon961);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, namespaceSemicolon_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceSemicolon"


	public static class namespaceBracket_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceBracket"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:185:1: namespaceBracket : ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) ;
	public final TSPHPParser.namespaceBracket_return namespaceBracket() throws RecognitionException {
		TSPHPParser.namespaceBracket_return retval = new TSPHPParser.namespaceBracket_return();
		retval.start = input.LT(1);
		int namespaceBracket_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal11=null;
		Token char_literal13=null;
		Token char_literal15=null;
		ParserRuleReturnScope namespaceId12 =null;
		ParserRuleReturnScope statement14 =null;

		Object string_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:2: ( ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:4: ( 'namespace' ( namespaceId )? '{' ( statement )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:5: 'namespace' ( namespaceId )? '{' ( statement )+ '}'
			{
			string_literal11=(Token)match(input,Namespace,FOLLOW_Namespace_in_namespaceBracket974); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = 
			(Object)adaptor.create(string_literal11)
			;
			adaptor.addChild(root_0, string_literal11_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:17: ( namespaceId )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:17: namespaceId
					{
					pushFollow(FOLLOW_namespaceId_in_namespaceBracket976);
					namespaceId12=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_namespaceBracket979); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal13_tree = 
			(Object)adaptor.create(char_literal13)
			;
			adaptor.addChild(root_0, char_literal13_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:34: ( statement )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==Abstract||LA6_0==Backslash||LA6_0==Class||LA6_0==Const||LA6_0==Do||LA6_0==Echo||LA6_0==Exit||LA6_0==Final||(LA6_0 >= For && LA6_0 <= Function)||(LA6_0 >= Identifier && LA6_0 <= If)||(LA6_0 >= Interface && LA6_0 <= LeftCurlyBrace)||LA6_0==MinusMinus||LA6_0==Parent||LA6_0==PlusPlus||LA6_0==Return||LA6_0==Self||(LA6_0 >= Switch && LA6_0 <= VariableId)||LA6_0==While) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:186:34: statement
					{
					pushFollow(FOLLOW_statement_in_namespaceBracket981);
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

			char_literal15=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_namespaceBracket984); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal15_tree = 
			(Object)adaptor.create(char_literal15)
			;
			adaptor.addChild(root_0, char_literal15_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, namespaceBracket_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceBracket"


	public static class namespaceId_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespaceId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:194:1: namespaceId : Identifier ( '\\\\' Identifier )* ;
	public final TSPHPParser.namespaceId_return namespaceId() throws RecognitionException {
		TSPHPParser.namespaceId_return retval = new TSPHPParser.namespaceId_return();
		retval.start = input.LT(1);
		int namespaceId_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier16=null;
		Token char_literal17=null;
		Token Identifier18=null;

		Object Identifier16_tree=null;
		Object char_literal17_tree=null;
		Object Identifier18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:2: ( Identifier ( '\\\\' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:4: Identifier ( '\\\\' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1050); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier16_tree = 
			(Object)adaptor.create(Identifier16)
			;
			adaptor.addChild(root_0, Identifier16_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:15: ( '\\\\' Identifier )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Backslash) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:195:16: '\\\\' Identifier
					{
					char_literal17=(Token)match(input,Backslash,FOLLOW_Backslash_in_namespaceId1053); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal17_tree = 
					(Object)adaptor.create(char_literal17)
					;
					adaptor.addChild(root_0, char_literal17_tree);
					}

					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_namespaceId1055); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier18_tree = 
					(Object)adaptor.create(Identifier18)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, namespaceId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespaceId"


	public static class withoutNamespace_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withoutNamespace"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:198:1: withoutNamespace : ( statement )+ ;
	public final TSPHPParser.withoutNamespace_return withoutNamespace() throws RecognitionException {
		TSPHPParser.withoutNamespace_return retval = new TSPHPParser.withoutNamespace_return();
		retval.start = input.LT(1);
		int withoutNamespace_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope statement19 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:2: ( ( statement )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: ( statement )+
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: ( statement )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==Abstract||LA8_0==Backslash||LA8_0==Class||LA8_0==Const||LA8_0==Do||LA8_0==Echo||LA8_0==Exit||LA8_0==Final||(LA8_0 >= For && LA8_0 <= Function)||(LA8_0 >= Identifier && LA8_0 <= If)||(LA8_0 >= Interface && LA8_0 <= LeftCurlyBrace)||LA8_0==MinusMinus||LA8_0==Parent||LA8_0==PlusPlus||LA8_0==Return||LA8_0==Self||(LA8_0 >= Switch && LA8_0 <= VariableId)||LA8_0==While) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:199:4: statement
					{
					pushFollow(FOLLOW_statement_in_withoutNamespace1068);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, withoutNamespace_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "withoutNamespace"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:201:1: statement : ( useDeclarationList | definition | instructionWithoutBreakContinue );
	public final TSPHPParser.statement_return statement() throws RecognitionException {
		TSPHPParser.statement_return retval = new TSPHPParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope useDeclarationList20 =null;
		ParserRuleReturnScope definition21 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue22 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:2: ( useDeclarationList | definition | instructionWithoutBreakContinue )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:202:4: useDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_useDeclarationList_in_statement1079);
					useDeclarationList20=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclarationList20.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:203:4: definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_statement1084);
					definition21=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition21.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:204:4: instructionWithoutBreakContinue
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_statement1089);
					instructionWithoutBreakContinue22=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class useDeclarationList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:207:1: useDeclarationList : 'use' useDeclaration ( ',' useDeclaration )* ';' ;
	public final TSPHPParser.useDeclarationList_return useDeclarationList() throws RecognitionException {
		TSPHPParser.useDeclarationList_return retval = new TSPHPParser.useDeclarationList_return();
		retval.start = input.LT(1);
		int useDeclarationList_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal23=null;
		Token char_literal25=null;
		Token char_literal27=null;
		ParserRuleReturnScope useDeclaration24 =null;
		ParserRuleReturnScope useDeclaration26 =null;

		Object string_literal23_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:2: ( 'use' useDeclaration ( ',' useDeclaration )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:4: 'use' useDeclaration ( ',' useDeclaration )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(Token)match(input,Use,FOLLOW_Use_in_useDeclarationList1101); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = 
			(Object)adaptor.create(string_literal23)
			;
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1103);
			useDeclaration24=useDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, useDeclaration24.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:25: ( ',' useDeclaration )*
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:208:26: ',' useDeclaration
					{
					char_literal25=(Token)match(input,Comma,FOLLOW_Comma_in_useDeclarationList1106); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal25_tree = 
					(Object)adaptor.create(char_literal25)
					;
					adaptor.addChild(root_0, char_literal25_tree);
					}

					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList1108);
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

			char_literal27=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_useDeclarationList1112); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal27_tree = 
			(Object)adaptor.create(char_literal27)
			;
			adaptor.addChild(root_0, char_literal27_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, useDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclarationList"


	public static class useDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:210:1: useDeclaration : ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? ;
	public final TSPHPParser.useDeclaration_return useDeclaration() throws RecognitionException {
		TSPHPParser.useDeclaration_return retval = new TSPHPParser.useDeclaration_return();
		retval.start = input.LT(1);
		int useDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token string_literal33=null;
		Token Identifier34=null;
		ParserRuleReturnScope namespaceId30 =null;
		ParserRuleReturnScope namespaceId32 =null;

		Object Identifier28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object string_literal33_tree=null;
		Object Identifier34_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:2: ( ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) ) ( 'as' Identifier )?
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:4: ( ( Identifier '\\\\' namespaceId ) | ( '\\\\' namespaceId ) )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( Identifier '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:6: ( Identifier '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:211:7: Identifier '\\\\' namespaceId
					{
					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier28_tree = 
					(Object)adaptor.create(Identifier28)
					;
					adaptor.addChild(root_0, Identifier28_tree);
					}

					char_literal29=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1127); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = 
					(Object)adaptor.create(char_literal29)
					;
					adaptor.addChild(root_0, char_literal29_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1129);
					namespaceId30=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId30.getTree());

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:6: ( '\\\\' namespaceId )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:6: ( '\\\\' namespaceId )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:212:7: '\\\\' namespaceId
					{
					char_literal31=(Token)match(input,Backslash,FOLLOW_Backslash_in_useDeclaration1138); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = 
					(Object)adaptor.create(char_literal31)
					;
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_namespaceId_in_useDeclaration1139);
					namespaceId32=namespaceId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId32.getTree());

					}

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:3: ( 'as' Identifier )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==As) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:4: 'as' Identifier
					{
					string_literal33=(Token)match(input,As,FOLLOW_As_in_useDeclaration1151); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = 
					(Object)adaptor.create(string_literal33)
					;
					adaptor.addChild(root_0, string_literal33_tree);
					}

					Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration1153); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier34_tree = 
					(Object)adaptor.create(Identifier34)
					;
					adaptor.addChild(root_0, Identifier34_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, useDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "useDeclaration"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:216:1: definition : ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList );
	public final TSPHPParser.definition_return definition() throws RecognitionException {
		TSPHPParser.definition_return retval = new TSPHPParser.definition_return();
		retval.start = input.LT(1);
		int definition_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope classDeclaration35 =null;
		ParserRuleReturnScope interfaceDeclaration36 =null;
		ParserRuleReturnScope functionDeclaration37 =null;
		ParserRuleReturnScope constDeclarationList38 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:2: ( classDeclaration | interfaceDeclaration | functionDeclaration | constDeclarationList )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:217:4: classDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classDeclaration_in_definition1166);
					classDeclaration35=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration35.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: interfaceDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_definition1171);
					interfaceDeclaration36=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration36.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:219:4: functionDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionDeclaration_in_definition1176);
					functionDeclaration37=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration37.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:220:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_definition1181);
					constDeclarationList38=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList38.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, definition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:226:1: classDeclaration : ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' ;
	public final TSPHPParser.classDeclaration_return classDeclaration() throws RecognitionException {
		TSPHPParser.classDeclaration_return retval = new TSPHPParser.classDeclaration_return();
		retval.start = input.LT(1);
		int classDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token set39=null;
		Token string_literal40=null;
		Token Identifier41=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope extendsDeclaration42 =null;
		ParserRuleReturnScope implementsDeclaration43 =null;
		ParserRuleReturnScope classBody45 =null;

		Object set39_tree=null;
		Object string_literal40_tree=null;
		Object Identifier41_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:2: ( ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: ( 'abstract' | 'final' )? 'class' Identifier ( extendsDeclaration )? ( implementsDeclaration )? '{' ( classBody )+ '}'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:4: ( 'abstract' | 'final' )?
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
						(Object)adaptor.create(set39)
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

			string_literal40=(Token)match(input,Class,FOLLOW_Class_in_classDeclaration1203); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal40_tree = 
			(Object)adaptor.create(string_literal40)
			;
			adaptor.addChild(root_0, string_literal40_tree);
			}

			Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration1205); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier41_tree = 
			(Object)adaptor.create(Identifier41)
			;
			adaptor.addChild(root_0, Identifier41_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:45: ( extendsDeclaration )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Extends) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:45: extendsDeclaration
					{
					pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration1207);
					extendsDeclaration42=extendsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsDeclaration42.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:65: ( implementsDeclaration )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Implements) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:65: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration1210);
					implementsDeclaration43=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration43.getTree());

					}
					break;

			}

			char_literal44=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_classDeclaration1213); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = 
			(Object)adaptor.create(char_literal44)
			;
			adaptor.addChild(root_0, char_literal44_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:92: ( classBody )+
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:92: classBody
					{
					pushFollow(FOLLOW_classBody_in_classDeclaration1215);
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

			char_literal46=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_classDeclaration1218); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal46_tree = 
			(Object)adaptor.create(char_literal46)
			;
			adaptor.addChild(root_0, char_literal46_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, classDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class extendsDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:230:1: extendsDeclaration : 'extends' identifierList ;
	public final TSPHPParser.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		TSPHPParser.extendsDeclaration_return retval = new TSPHPParser.extendsDeclaration_return();
		retval.start = input.LT(1);
		int extendsDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal47=null;
		ParserRuleReturnScope identifierList48 =null;

		Object string_literal47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:2: ( 'extends' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:231:4: 'extends' identifierList
			{
			root_0 = (Object)adaptor.nil();


			string_literal47=(Token)match(input,Extends,FOLLOW_Extends_in_extendsDeclaration1232); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal47_tree = 
			(Object)adaptor.create(string_literal47)
			;
			adaptor.addChild(root_0, string_literal47_tree);
			}

			pushFollow(FOLLOW_identifierList_in_extendsDeclaration1234);
			identifierList48=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, extendsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class identifierList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifierList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:233:1: identifierList : Identifier ( ',' Identifier )* ;
	public final TSPHPParser.identifierList_return identifierList() throws RecognitionException {
		TSPHPParser.identifierList_return retval = new TSPHPParser.identifierList_return();
		retval.start = input.LT(1);
		int identifierList_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier49=null;
		Token char_literal50=null;
		Token Identifier51=null;

		Object Identifier49_tree=null;
		Object char_literal50_tree=null;
		Object Identifier51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:2: ( Identifier ( ',' Identifier )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:4: Identifier ( ',' Identifier )*
			{
			root_0 = (Object)adaptor.nil();


			Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1243); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier49_tree = 
			(Object)adaptor.create(Identifier49)
			;
			adaptor.addChild(root_0, Identifier49_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:15: ( ',' Identifier )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Comma) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:234:16: ',' Identifier
					{
					char_literal50=(Token)match(input,Comma,FOLLOW_Comma_in_identifierList1246); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = 
					(Object)adaptor.create(char_literal50)
					;
					adaptor.addChild(root_0, char_literal50_tree);
					}

					Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierList1248); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier51_tree = 
					(Object)adaptor.create(Identifier51)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, identifierList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "identifierList"


	public static class implementsDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:236:1: implementsDeclaration : 'implements' identifierList ;
	public final TSPHPParser.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		TSPHPParser.implementsDeclaration_return retval = new TSPHPParser.implementsDeclaration_return();
		retval.start = input.LT(1);
		int implementsDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal52=null;
		ParserRuleReturnScope identifierList53 =null;

		Object string_literal52_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:2: ( 'implements' identifierList )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:237:4: 'implements' identifierList
			{
			root_0 = (Object)adaptor.nil();


			string_literal52=(Token)match(input,Implements,FOLLOW_Implements_in_implementsDeclaration1259); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal52_tree = 
			(Object)adaptor.create(string_literal52)
			;
			adaptor.addChild(root_0, string_literal52_tree);
			}

			pushFollow(FOLLOW_identifierList_in_implementsDeclaration1261);
			identifierList53=identifierList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierList53.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, implementsDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "implementsDeclaration"


	public static class classBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:239:1: classBody : ( constDeclarationList | attributeDeclaration | methodDeclaration );
	public final TSPHPParser.classBody_return classBody() throws RecognitionException {
		TSPHPParser.classBody_return retval = new TSPHPParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope constDeclarationList54 =null;
		ParserRuleReturnScope attributeDeclaration55 =null;
		ParserRuleReturnScope methodDeclaration56 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:2: ( constDeclarationList | attributeDeclaration | methodDeclaration )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:240:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_classBody1271);
					constDeclarationList54=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList54.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:241:4: attributeDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attributeDeclaration_in_classBody1276);
					attributeDeclaration55=attributeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration55.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:4: methodDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodDeclaration_in_classBody1282);
					methodDeclaration56=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class constDeclarationList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:1: constDeclarationList : 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' ;
	public final TSPHPParser.constDeclarationList_return constDeclarationList() throws RecognitionException {
		TSPHPParser.constDeclarationList_return retval = new TSPHPParser.constDeclarationList_return();
		retval.start = input.LT(1);
		int constDeclarationList_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal57=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope primitiveTypes58 =null;
		ParserRuleReturnScope constantAssignment59 =null;
		ParserRuleReturnScope constantAssignment61 =null;

		Object string_literal57_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:2: ( 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:5: 'const' primitiveTypes constantAssignment ( ',' constantAssignment )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,Const,FOLLOW_Const_in_constDeclarationList1294); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = 
			(Object)adaptor.create(string_literal57)
			;
			adaptor.addChild(root_0, string_literal57_tree);
			}

			pushFollow(FOLLOW_primitiveTypes_in_constDeclarationList1296);
			primitiveTypes58=primitiveTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes58.getTree());

			pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1298);
			constantAssignment59=constantAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constantAssignment59.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:47: ( ',' constantAssignment )*
			loop20:
			do {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:48: ',' constantAssignment
					{
					char_literal60=(Token)match(input,Comma,FOLLOW_Comma_in_constDeclarationList1301); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = 
					(Object)adaptor.create(char_literal60)
					;
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList1303);
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

			char_literal62=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_constDeclarationList1307); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal62_tree = 
			(Object)adaptor.create(char_literal62)
			;
			adaptor.addChild(root_0, char_literal62_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, constDeclarationList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:248:1: constantAssignment : Identifier '=' unaryPrimitiveAtom ;
	public final TSPHPParser.constantAssignment_return constantAssignment() throws RecognitionException {
		TSPHPParser.constantAssignment_return retval = new TSPHPParser.constantAssignment_return();
		retval.start = input.LT(1);
		int constantAssignment_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier63=null;
		Token char_literal64=null;
		ParserRuleReturnScope unaryPrimitiveAtom65 =null;

		Object Identifier63_tree=null;
		Object char_literal64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:2: ( Identifier '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:249:4: Identifier '=' unaryPrimitiveAtom
			{
			root_0 = (Object)adaptor.nil();


			Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment1317); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier63_tree = 
			(Object)adaptor.create(Identifier63)
			;
			adaptor.addChild(root_0, Identifier63_tree);
			}

			char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_constantAssignment1320); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal64_tree = 
			(Object)adaptor.create(char_literal64)
			;
			adaptor.addChild(root_0, char_literal64_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment1322);
			unaryPrimitiveAtom65=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom65.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, constantAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class variableDeclarationListWithoutVariableId_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListWithoutVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:1: variableDeclarationListWithoutVariableId : variableDeclaration ( ',' variableAssignment )* ;
	public final TSPHPParser.variableDeclarationListWithoutVariableId_return variableDeclarationListWithoutVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListWithoutVariableId_return retval = new TSPHPParser.variableDeclarationListWithoutVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListWithoutVariableId_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal67=null;
		ParserRuleReturnScope variableDeclaration66 =null;
		ParserRuleReturnScope variableAssignment68 =null;

		Object char_literal67_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:2: ( variableDeclaration ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:4: variableDeclaration ( ',' variableAssignment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1331);
			variableDeclaration66=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration66.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:24: ( ',' variableAssignment )*
			loop21:
			do {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==Comma) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:25: ',' variableAssignment
					{
					char_literal67=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal67_tree = 
					(Object)adaptor.create(char_literal67)
					;
					adaptor.addChild(root_0, char_literal67_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1336);
					variableAssignment68=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment68.getTree());

					}
					break;

				default :
					break loop21;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarationListWithoutVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListWithoutVariableId"


	public static class attributeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:254:1: attributeDeclaration : ( 'static' )? accessor variableDeclarationListInclVariableId ';' ;
	public final TSPHPParser.attributeDeclaration_return attributeDeclaration() throws RecognitionException {
		TSPHPParser.attributeDeclaration_return retval = new TSPHPParser.attributeDeclaration_return();
		retval.start = input.LT(1);
		int attributeDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal69=null;
		Token char_literal72=null;
		ParserRuleReturnScope accessor70 =null;
		ParserRuleReturnScope variableDeclarationListInclVariableId71 =null;

		Object string_literal69_tree=null;
		Object char_literal72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:2: ( ( 'static' )? accessor variableDeclarationListInclVariableId ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: ( 'static' )? accessor variableDeclarationListInclVariableId ';'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: ( 'static' )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Static) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:255:4: 'static'
					{
					string_literal69=(Token)match(input,Static,FOLLOW_Static_in_attributeDeclaration1348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal69_tree = 
					(Object)adaptor.create(string_literal69)
					;
					adaptor.addChild(root_0, string_literal69_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_accessor_in_attributeDeclaration1351);
			accessor70=accessor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor70.getTree());

			pushFollow(FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1353);
			variableDeclarationListInclVariableId71=variableDeclarationListInclVariableId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListInclVariableId71.getTree());

			char_literal72=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_attributeDeclaration1355); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal72_tree = 
			(Object)adaptor.create(char_literal72)
			;
			adaptor.addChild(root_0, char_literal72_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, attributeDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "attributeDeclaration"


	public static class accessor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:1: accessor : ( accessorWithoutPrivate | 'private' );
	public final TSPHPParser.accessor_return accessor() throws RecognitionException {
		TSPHPParser.accessor_return retval = new TSPHPParser.accessor_return();
		retval.start = input.LT(1);
		int accessor_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal74=null;
		ParserRuleReturnScope accessorWithoutPrivate73 =null;

		Object string_literal74_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:9: ( accessorWithoutPrivate | 'private' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= Protected && LA23_0 <= Public)) ) {
				alt23=1;
			}
			else if ( (LA23_0==Private) ) {
				alt23=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:11: accessorWithoutPrivate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_accessorWithoutPrivate_in_accessor1362);
					accessorWithoutPrivate73=accessorWithoutPrivate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate73.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:258:4: 'private'
					{
					root_0 = (Object)adaptor.nil();


					string_literal74=(Token)match(input,Private,FOLLOW_Private_in_accessor1367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal74_tree = 
					(Object)adaptor.create(string_literal74)
					;
					adaptor.addChild(root_0, string_literal74_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, accessor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessor"


	public static class accessorWithoutPrivate_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "accessorWithoutPrivate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:1: accessorWithoutPrivate : ( 'protected' | 'public' );
	public final TSPHPParser.accessorWithoutPrivate_return accessorWithoutPrivate() throws RecognitionException {
		TSPHPParser.accessorWithoutPrivate_return retval = new TSPHPParser.accessorWithoutPrivate_return();
		retval.start = input.LT(1);
		int accessorWithoutPrivate_StartIndex = input.index();

		Object root_0 = null;

		Token set75=null;

		Object set75_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:2: ( 'protected' | 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set75=(Token)input.LT(1);
			if ( (input.LA(1) >= Protected && input.LA(1) <= Public) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set75)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, accessorWithoutPrivate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "accessorWithoutPrivate"


	public static class variableDeclarationListInclVariableId_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclarationListInclVariableId"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:1: variableDeclarationListInclVariableId : variableDeclaration ( ',' ( variableAssignment | VariableId ) )* ;
	public final TSPHPParser.variableDeclarationListInclVariableId_return variableDeclarationListInclVariableId() throws RecognitionException {
		TSPHPParser.variableDeclarationListInclVariableId_return retval = new TSPHPParser.variableDeclarationListInclVariableId_return();
		retval.start = input.LT(1);
		int variableDeclarationListInclVariableId_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal77=null;
		Token VariableId79=null;
		ParserRuleReturnScope variableDeclaration76 =null;
		ParserRuleReturnScope variableAssignment78 =null;

		Object char_literal77_tree=null;
		Object VariableId79_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:2: ( variableDeclaration ( ',' ( variableAssignment | VariableId ) )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:4: variableDeclaration ( ',' ( variableAssignment | VariableId ) )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1390);
			variableDeclaration76=variableDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration76.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:24: ( ',' ( variableAssignment | VariableId ) )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==Comma) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:25: ',' ( variableAssignment | VariableId )
					{
					char_literal77=(Token)match(input,Comma,FOLLOW_Comma_in_variableDeclarationListInclVariableId1393); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal77_tree = 
					(Object)adaptor.create(char_literal77)
					;
					adaptor.addChild(root_0, char_literal77_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:29: ( variableAssignment | VariableId )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==VariableId) ) {
						int LA24_1 = input.LA(2);
						if ( (LA24_1==Assign||LA24_1==BitwiseAndEqual||LA24_1==BitwiseOrEqual||LA24_1==BitwiseXorEqual||LA24_1==DivideEqual||LA24_1==DotEqual||LA24_1==LeftSquareBrace||(LA24_1 >= MinusEqual && LA24_1 <= MinusMinus)||LA24_1==ModuloEqual||LA24_1==MultiplyEqual||LA24_1==ObjectOperator||(LA24_1 >= PlusEqual && LA24_1 <= PlusPlus)||LA24_1==ShiftLeftEqual||LA24_1==ShiftRightEqual) ) {
							alt24=1;
						}
						else if ( (LA24_1==Comma||LA24_1==Semicolon) ) {
							alt24=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 24, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA24_0==Backslash||LA24_0==Identifier||LA24_0==MinusMinus||LA24_0==Parent||LA24_0==PlusPlus||LA24_0==Self||LA24_0==This) ) {
						alt24=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:30: variableAssignment
							{
							pushFollow(FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1396);
							variableAssignment78=variableAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment78.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:265:49: VariableId
							{
							VariableId79=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclarationListInclVariableId1398); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId79_tree = 
							(Object)adaptor.create(VariableId79)
							;
							adaptor.addChild(root_0, VariableId79_tree);
							}

							}
							break;

					}

					}
					break;

				default :
					break loop25;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, variableDeclarationListInclVariableId_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclarationListInclVariableId"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:268:1: methodDeclaration : ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration ;
	public final TSPHPParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		TSPHPParser.methodDeclaration_return retval = new TSPHPParser.methodDeclaration_return();
		retval.start = input.LT(1);
		int methodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal80=null;
		Token string_literal82=null;
		Token string_literal83=null;
		Token string_literal84=null;
		Token string_literal85=null;
		ParserRuleReturnScope accessorWithoutPrivate81 =null;
		ParserRuleReturnScope accessor86 =null;
		ParserRuleReturnScope functionDeclaration87 =null;

		Object string_literal80_tree=null;
		Object string_literal82_tree=null;
		Object string_literal83_tree=null;
		Object string_literal84_tree=null;
		Object string_literal85_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:2: ( ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? ) functionDeclaration
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:4: ( 'abstract' ( accessorWithoutPrivate )? | ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )? )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Abstract) ) {
				alt31=1;
			}
			else if ( (LA31_0==Final||LA31_0==Function||LA31_0==Private||(LA31_0 >= Protected && LA31_0 <= Public)||LA31_0==Static) ) {
				alt31=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:6: 'abstract' ( accessorWithoutPrivate )?
					{
					string_literal80=(Token)match(input,Abstract,FOLLOW_Abstract_in_methodDeclaration1415); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal80_tree = 
					(Object)adaptor.create(string_literal80)
					;
					adaptor.addChild(root_0, string_literal80_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:17: ( accessorWithoutPrivate )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( ((LA26_0 >= Protected && LA26_0 <= Public)) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:269:17: accessorWithoutPrivate
							{
							pushFollow(FOLLOW_accessorWithoutPrivate_in_methodDeclaration1417);
							accessorWithoutPrivate81=accessorWithoutPrivate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessorWithoutPrivate81.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |) ( accessor )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: ( 'static' ( 'final' )? | 'final' ( 'static' )? |)
					int alt29=3;
					switch ( input.LA(1) ) {
					case Static:
						{
						alt29=1;
						}
						break;
					case Final:
						{
						alt29=2;
						}
						break;
					case Function:
					case Private:
					case Protected:
					case Public:
						{
						alt29=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:6: 'static' ( 'final' )?
							{
							string_literal82=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1431); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal82_tree = 
							(Object)adaptor.create(string_literal82)
							;
							adaptor.addChild(root_0, string_literal82_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:15: ( 'final' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==Final) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:15: 'final'
									{
									string_literal83=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1433); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal83_tree = 
									(Object)adaptor.create(string_literal83)
									;
									adaptor.addChild(root_0, string_literal83_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:6: 'final' ( 'static' )?
							{
							string_literal84=(Token)match(input,Final,FOLLOW_Final_in_methodDeclaration1441); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal84_tree = 
							(Object)adaptor.create(string_literal84)
							;
							adaptor.addChild(root_0, string_literal84_tree);
							}

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:14: ( 'static' )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==Static) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:14: 'static'
									{
									string_literal85=(Token)match(input,Static,FOLLOW_Static_in_methodDeclaration1443); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									string_literal85_tree = 
									(Object)adaptor.create(string_literal85)
									;
									adaptor.addChild(root_0, string_literal85_tree);
									}

									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:4: 
							{
							}
							break;

					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:6: ( accessor )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==Private||(LA30_0 >= Protected && LA30_0 <= Public)) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:274:6: accessor
							{
							pushFollow(FOLLOW_accessor_in_methodDeclaration1457);
							accessor86=accessor();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, accessor86.getTree());

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclaration_in_methodDeclaration1464);
			functionDeclaration87=functionDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration87.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, methodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:1: interfaceDeclaration : 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' ;
	public final TSPHPParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		TSPHPParser.interfaceDeclaration_return retval = new TSPHPParser.interfaceDeclaration_return();
		retval.start = input.LT(1);
		int interfaceDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal88=null;
		Token Identifier89=null;
		Token char_literal91=null;
		Token char_literal93=null;
		ParserRuleReturnScope implementsDeclaration90 =null;
		ParserRuleReturnScope interfaceBody92 =null;

		Object string_literal88_tree=null;
		Object Identifier89_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:2: ( 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:4: 'interface' Identifier ( implementsDeclaration )? '{' ( interfaceBody )* '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal88=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration1474); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal88_tree = 
			(Object)adaptor.create(string_literal88)
			;
			adaptor.addChild(root_0, string_literal88_tree);
			}

			Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration1476); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier89_tree = 
			(Object)adaptor.create(Identifier89)
			;
			adaptor.addChild(root_0, Identifier89_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:27: ( implementsDeclaration )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Implements) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:27: implementsDeclaration
					{
					pushFollow(FOLLOW_implementsDeclaration_in_interfaceDeclaration1478);
					implementsDeclaration90=implementsDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsDeclaration90.getTree());

					}
					break;

			}

			char_literal91=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1481); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal91_tree = 
			(Object)adaptor.create(char_literal91)
			;
			adaptor.addChild(root_0, char_literal91_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:54: ( interfaceBody )*
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==Const||LA33_0==Function||LA33_0==Public) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:278:54: interfaceBody
					{
					pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration1483);
					interfaceBody92=interfaceBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody92.getTree());

					}
					break;

				default :
					break loop33;
				}
			} while (true);

			char_literal93=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_interfaceDeclaration1486); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal93_tree = 
			(Object)adaptor.create(char_literal93)
			;
			adaptor.addChild(root_0, char_literal93_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:1: interfaceBody : ( constDeclarationList | interfaceMethodDeclaration );
	public final TSPHPParser.interfaceBody_return interfaceBody() throws RecognitionException {
		TSPHPParser.interfaceBody_return retval = new TSPHPParser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope constDeclarationList94 =null;
		ParserRuleReturnScope interfaceMethodDeclaration95 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:2: ( constDeclarationList | interfaceMethodDeclaration )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Const) ) {
				alt34=1;
			}
			else if ( (LA34_0==Function||LA34_0==Public) ) {
				alt34=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:281:4: constDeclarationList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constDeclarationList_in_interfaceBody1495);
					constDeclarationList94=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclarationList94.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:4: interfaceMethodDeclaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBody1500);
					interfaceMethodDeclaration95=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDeclaration95.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, interfaceBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceBody"


	public static class interfaceMethodDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:285:1: interfaceMethodDeclaration : ( 'public' )? functionDeclarationWithoutBody ';' ;
	public final TSPHPParser.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		TSPHPParser.interfaceMethodDeclaration_return retval = new TSPHPParser.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);
		int interfaceMethodDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope functionDeclarationWithoutBody97 =null;

		Object string_literal96_tree=null;
		Object char_literal98_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:2: ( ( 'public' )? functionDeclarationWithoutBody ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: ( 'public' )? functionDeclarationWithoutBody ';'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: ( 'public' )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Public) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:286:4: 'public'
					{
					string_literal96=(Token)match(input,Public,FOLLOW_Public_in_interfaceMethodDeclaration1511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal96_tree = 
					(Object)adaptor.create(string_literal96)
					;
					adaptor.addChild(root_0, string_literal96_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1514);
			functionDeclarationWithoutBody97=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody97.getTree());

			char_literal98=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_interfaceMethodDeclaration1516); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal98_tree = 
			(Object)adaptor.create(char_literal98)
			;
			adaptor.addChild(root_0, char_literal98_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, interfaceMethodDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:292:1: functionDeclaration : functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' ;
	public final TSPHPParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
		TSPHPParser.functionDeclaration_return retval = new TSPHPParser.functionDeclaration_return();
		retval.start = input.LT(1);
		int functionDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope functionDeclarationWithoutBody99 =null;
		ParserRuleReturnScope instructionWithoutBreakContinue101 =null;

		Object char_literal100_tree=null;
		Object char_literal102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:2: ( functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:5: functionDeclarationWithoutBody '{' ( instructionWithoutBreakContinue )* '}'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1532);
			functionDeclarationWithoutBody99=functionDeclarationWithoutBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarationWithoutBody99.getTree());

			char_literal100=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_functionDeclaration1534); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal100_tree = 
			(Object)adaptor.create(char_literal100)
			;
			adaptor.addChild(root_0, char_literal100_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:40: ( instructionWithoutBreakContinue )*
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==Backslash||LA36_0==Do||LA36_0==Echo||LA36_0==Exit||(LA36_0 >= For && LA36_0 <= Foreach)||(LA36_0 >= Identifier && LA36_0 <= If)||LA36_0==LeftCurlyBrace||LA36_0==MinusMinus||LA36_0==Parent||LA36_0==PlusPlus||LA36_0==Return||LA36_0==Self||(LA36_0 >= Switch && LA36_0 <= TypeString)||LA36_0==VariableId||LA36_0==While) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:293:40: instructionWithoutBreakContinue
					{
					pushFollow(FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1536);
					instructionWithoutBreakContinue101=instructionWithoutBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue101.getTree());

					}
					break;

				default :
					break loop36;
				}
			} while (true);

			char_literal102=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_functionDeclaration1539); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal102_tree = 
			(Object)adaptor.create(char_literal102)
			;
			adaptor.addChild(root_0, char_literal102_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, functionDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclaration"


	public static class functionDeclarationWithoutBody_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDeclarationWithoutBody"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:1: functionDeclarationWithoutBody : 'function' returnType Identifier '(' ( paramList )? ')' ;
	public final TSPHPParser.functionDeclarationWithoutBody_return functionDeclarationWithoutBody() throws RecognitionException {
		TSPHPParser.functionDeclarationWithoutBody_return retval = new TSPHPParser.functionDeclarationWithoutBody_return();
		retval.start = input.LT(1);
		int functionDeclarationWithoutBody_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal103=null;
		Token Identifier105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		ParserRuleReturnScope returnType104 =null;
		ParserRuleReturnScope paramList107 =null;

		Object string_literal103_tree=null;
		Object Identifier105_tree=null;
		Object char_literal106_tree=null;
		Object char_literal108_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:2: ( 'function' returnType Identifier '(' ( paramList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:4: 'function' returnType Identifier '(' ( paramList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal103=(Token)match(input,Function,FOLLOW_Function_in_functionDeclarationWithoutBody1549); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal103_tree = 
			(Object)adaptor.create(string_literal103)
			;
			adaptor.addChild(root_0, string_literal103_tree);
			}

			pushFollow(FOLLOW_returnType_in_functionDeclarationWithoutBody1551);
			returnType104=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnType104.getTree());

			Identifier105=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclarationWithoutBody1553); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier105_tree = 
			(Object)adaptor.create(Identifier105)
			;
			adaptor.addChild(root_0, Identifier105_tree);
			}

			char_literal106=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1555); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal106_tree = 
			(Object)adaptor.create(char_literal106)
			;
			adaptor.addChild(root_0, char_literal106_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:41: ( paramList )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Backslash||LA37_0==Identifier||(LA37_0 >= TypeArray && LA37_0 <= TypeString)) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:41: paramList
					{
					pushFollow(FOLLOW_paramList_in_functionDeclarationWithoutBody1557);
					paramList107=paramList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList107.getTree());

					}
					break;

			}

			char_literal108=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1560); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal108_tree = 
			(Object)adaptor.create(char_literal108)
			;
			adaptor.addChild(root_0, char_literal108_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, functionDeclarationWithoutBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDeclarationWithoutBody"


	public static class returnType_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:1: returnType : ( allTypes | 'void' );
	public final TSPHPParser.returnType_return returnType() throws RecognitionException {
		TSPHPParser.returnType_return retval = new TSPHPParser.returnType_return();
		retval.start = input.LT(1);
		int returnType_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal110=null;
		ParserRuleReturnScope allTypes109 =null;

		Object string_literal110_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:2: ( allTypes | 'void' )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Backslash||LA38_0==Identifier||(LA38_0 >= TypeArray && LA38_0 <= TypeString)) ) {
				alt38=1;
			}
			else if ( (LA38_0==Void) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:4: allTypes
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_allTypes_in_returnType1570);
					allTypes109=allTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes109.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:15: 'void'
					{
					root_0 = (Object)adaptor.nil();


					string_literal110=(Token)match(input,Void,FOLLOW_Void_in_returnType1574); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal110_tree = 
					(Object)adaptor.create(string_literal110)
					;
					adaptor.addChild(root_0, string_literal110_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, returnType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class allTypes_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:1: allTypes : ( primitiveTypesExtended | classInterfaceTypeInclObject );
	public final TSPHPParser.allTypes_return allTypes() throws RecognitionException {
		TSPHPParser.allTypes_return retval = new TSPHPParser.allTypes_return();
		retval.start = input.LT(1);
		int allTypes_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope primitiveTypesExtended111 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject112 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:9: ( primitiveTypesExtended | classInterfaceTypeInclObject )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= TypeArray && LA39_0 <= TypeInt)||(LA39_0 >= TypeResource && LA39_0 <= TypeString)) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:11: primitiveTypesExtended
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesExtended_in_allTypes1581);
					primitiveTypesExtended111=primitiveTypesExtended();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesExtended111.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:301:36: classInterfaceTypeInclObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeInclObject_in_allTypes1585);
					classInterfaceTypeInclObject112=classInterfaceTypeInclObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject112.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, allTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class primitiveTypes_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:303:1: primitiveTypes : ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString );
	public final TSPHPParser.primitiveTypes_return primitiveTypes() throws RecognitionException {
		TSPHPParser.primitiveTypes_return retval = new TSPHPParser.primitiveTypes_return();
		retval.start = input.LT(1);
		int primitiveTypes_StartIndex = input.index();

		Object root_0 = null;

		Token set113=null;

		Object set113_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:304:2: ( TypeBool | TypeBoolean | TypeInt | TypeFloat | TypeString )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set113=(Token)input.LT(1);
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set113)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, primitiveTypes_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesInclArray_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesInclArray"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:311:1: primitiveTypesInclArray : ( primitiveTypes | TypeArray );
	public final TSPHPParser.primitiveTypesInclArray_return primitiveTypesInclArray() throws RecognitionException {
		TSPHPParser.primitiveTypesInclArray_return retval = new TSPHPParser.primitiveTypesInclArray_return();
		retval.start = input.LT(1);
		int primitiveTypesInclArray_StartIndex = input.index();

		Object root_0 = null;

		Token TypeArray115=null;
		ParserRuleReturnScope primitiveTypes114 =null;

		Object TypeArray115_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:2: ( primitiveTypes | TypeArray )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:312:4: primitiveTypes
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypes_in_primitiveTypesInclArray1626);
					primitiveTypes114=primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypes114.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:313:4: TypeArray
					{
					root_0 = (Object)adaptor.nil();


					TypeArray115=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypesInclArray1631); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray115_tree = 
					(Object)adaptor.create(TypeArray115)
					;
					adaptor.addChild(root_0, TypeArray115_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveTypesInclArray_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesInclArray"


	public static class primitiveTypesExtended_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveTypesExtended"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:316:1: primitiveTypesExtended : ( primitiveTypesInclArray | TypeResource );
	public final TSPHPParser.primitiveTypesExtended_return primitiveTypesExtended() throws RecognitionException {
		TSPHPParser.primitiveTypesExtended_return retval = new TSPHPParser.primitiveTypesExtended_return();
		retval.start = input.LT(1);
		int primitiveTypesExtended_StartIndex = input.index();

		Object root_0 = null;

		Token TypeResource117=null;
		ParserRuleReturnScope primitiveTypesInclArray116 =null;

		Object TypeResource117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:2: ( primitiveTypesInclArray | TypeResource )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: primitiveTypesInclArray
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1643);
					primitiveTypesInclArray116=primitiveTypesInclArray();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray116.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:4: TypeResource
					{
					root_0 = (Object)adaptor.nil();


					TypeResource117=(Token)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesExtended1648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeResource117_tree = 
					(Object)adaptor.create(TypeResource117)
					;
					adaptor.addChild(root_0, TypeResource117_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, primitiveTypesExtended_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveTypesExtended"


	public static class classInterfaceTypeWithoutObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeWithoutObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:321:1: classInterfaceTypeWithoutObject : ( '\\\\' )? namespaceId ;
	public final TSPHPParser.classInterfaceTypeWithoutObject_return classInterfaceTypeWithoutObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeWithoutObject_return retval = new TSPHPParser.classInterfaceTypeWithoutObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeWithoutObject_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope namespaceId119 =null;

		Object char_literal118_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:2: ( ( '\\\\' )? namespaceId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: ( '\\\\' )? namespaceId
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: ( '\\\\' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Backslash) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:323:4: '\\\\'
					{
					char_literal118=(Token)match(input,Backslash,FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal118_tree = 
					(Object)adaptor.create(char_literal118)
					;
					adaptor.addChild(root_0, char_literal118_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1665);
			namespaceId119=namespaceId();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, namespaceId119.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, classInterfaceTypeWithoutObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeWithoutObject"


	public static class classInterfaceTypeInclObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classInterfaceTypeInclObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:1: classInterfaceTypeInclObject : ( TypeObject | classInterfaceTypeWithoutObject );
	public final TSPHPParser.classInterfaceTypeInclObject_return classInterfaceTypeInclObject() throws RecognitionException {
		TSPHPParser.classInterfaceTypeInclObject_return retval = new TSPHPParser.classInterfaceTypeInclObject_return();
		retval.start = input.LT(1);
		int classInterfaceTypeInclObject_StartIndex = input.index();

		Object root_0 = null;

		Token TypeObject120=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject121 =null;

		Object TypeObject120_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:2: ( TypeObject | classInterfaceTypeWithoutObject )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:4: TypeObject
					{
					root_0 = (Object)adaptor.nil();


					TypeObject120=(Token)match(input,TypeObject,FOLLOW_TypeObject_in_classInterfaceTypeInclObject1678); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeObject120_tree = 
					(Object)adaptor.create(TypeObject120)
					;
					adaptor.addChild(root_0, TypeObject120_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:4: classInterfaceTypeWithoutObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1684);
					classInterfaceTypeWithoutObject121=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject121.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, classInterfaceTypeInclObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classInterfaceTypeInclObject"


	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:331:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );
	public final TSPHPParser.paramList_return paramList() throws RecognitionException {
		TSPHPParser.paramList_return retval = new TSPHPParser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal123=null;
		Token char_literal126=null;
		Token char_literal130=null;
		Token char_literal131=null;
		ParserRuleReturnScope paramDeclarationOptional122 =null;
		ParserRuleReturnScope paramDeclarationOptional124 =null;
		ParserRuleReturnScope paramDeclaration125 =null;
		ParserRuleReturnScope paramDeclaration127 =null;
		ParserRuleReturnScope paramDeclaration128 =null;
		ParserRuleReturnScope paramDeclaration129 =null;
		ParserRuleReturnScope paramDeclarationOptional132 =null;

		Object char_literal123_tree=null;
		Object char_literal126_tree=null;
		Object char_literal130_tree=null;
		Object char_literal131_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:2: ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ )
			int alt48=3;
			alt48 = dfa48.predict(input);
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:4: paramDeclarationOptional ( ',' paramDeclarationOptional )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1696);
					paramDeclarationOptional122=paramDeclarationOptional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional122.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:29: ( ',' paramDeclarationOptional )*
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==Comma) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:332:30: ',' paramDeclarationOptional
							{
							char_literal123=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1699); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal123_tree = 
							(Object)adaptor.create(char_literal123)
							;
							adaptor.addChild(root_0, char_literal123_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1701);
							paramDeclarationOptional124=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional124.getTree());

							}
							break;

						default :
							break loop44;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:4: paramDeclaration ( ',' paramDeclaration )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1708);
					paramDeclaration125=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration125.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:21: ( ',' paramDeclaration )*
					loop45:
					do {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Comma) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:333:22: ',' paramDeclaration
							{
							char_literal126=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1711); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal126_tree = 
							(Object)adaptor.create(char_literal126)
							;
							adaptor.addChild(root_0, char_literal126_tree);
							}

							pushFollow(FOLLOW_paramDeclaration_in_paramList1713);
							paramDeclaration127=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration127.getTree());

							}
							break;

						default :
							break loop45;
						}
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:4: paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_paramDeclaration_in_paramList1720);
					paramDeclaration128=paramDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration128.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:21: ( paramDeclaration ',' )*
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Backslash||LA46_0==Identifier||(LA46_0 >= TypeArray && LA46_0 <= TypeString)) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:22: paramDeclaration ','
							{
							pushFollow(FOLLOW_paramDeclaration_in_paramList1723);
							paramDeclaration129=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration129.getTree());

							char_literal130=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1725); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal130_tree = 
							(Object)adaptor.create(char_literal130)
							;
							adaptor.addChild(root_0, char_literal130_tree);
							}

							}
							break;

						default :
							break loop46;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:45: ( ',' paramDeclarationOptional )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:334:46: ',' paramDeclarationOptional
							{
							char_literal131=(Token)match(input,Comma,FOLLOW_Comma_in_paramList1730); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal131_tree = 
							(Object)adaptor.create(char_literal131)
							;
							adaptor.addChild(root_0, char_literal131_tree);
							}

							pushFollow(FOLLOW_paramDeclarationOptional_in_paramList1732);
							paramDeclarationOptional132=paramDeclarationOptional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclarationOptional132.getTree());

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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, paramList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class paramDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:337:1: paramDeclaration : allTypes VariableId ;
	public final TSPHPParser.paramDeclaration_return paramDeclaration() throws RecognitionException {
		TSPHPParser.paramDeclaration_return retval = new TSPHPParser.paramDeclaration_return();
		retval.start = input.LT(1);
		int paramDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId134=null;
		ParserRuleReturnScope allTypes133 =null;

		Object VariableId134_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:2: ( allTypes VariableId )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:338:4: allTypes VariableId
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_paramDeclaration1746);
			allTypes133=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes133.getTree());

			VariableId134=(Token)match(input,VariableId,FOLLOW_VariableId_in_paramDeclaration1748); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId134_tree = 
			(Object)adaptor.create(VariableId134)
			;
			adaptor.addChild(root_0, VariableId134_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, paramDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclaration"


	public static class paramDeclarationOptional_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramDeclarationOptional"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:340:1: paramDeclarationOptional : paramDeclaration '=' unaryPrimitiveAtom ;
	public final TSPHPParser.paramDeclarationOptional_return paramDeclarationOptional() throws RecognitionException {
		TSPHPParser.paramDeclarationOptional_return retval = new TSPHPParser.paramDeclarationOptional_return();
		retval.start = input.LT(1);
		int paramDeclarationOptional_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal136=null;
		ParserRuleReturnScope paramDeclaration135 =null;
		ParserRuleReturnScope unaryPrimitiveAtom137 =null;

		Object char_literal136_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:2: ( paramDeclaration '=' unaryPrimitiveAtom )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:341:4: paramDeclaration '=' unaryPrimitiveAtom
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_paramDeclaration_in_paramDeclarationOptional1758);
			paramDeclaration135=paramDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDeclaration135.getTree());

			char_literal136=(Token)match(input,Assign,FOLLOW_Assign_in_paramDeclarationOptional1761); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal136_tree = 
			(Object)adaptor.create(char_literal136)
			;
			adaptor.addChild(root_0, char_literal136_tree);
			}

			pushFollow(FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1763);
			unaryPrimitiveAtom137=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimitiveAtom137.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, paramDeclarationOptional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDeclarationOptional"


	public static class instructionWithoutBreakContinue_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionWithoutBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:346:1: instructionWithoutBreakContinue : ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction );
	public final TSPHPParser.instructionWithoutBreakContinue_return instructionWithoutBreakContinue() throws RecognitionException {
		TSPHPParser.instructionWithoutBreakContinue_return retval = new TSPHPParser.instructionWithoutBreakContinue_return();
		retval.start = input.LT(1);
		int instructionWithoutBreakContinue_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal138=null;
		Token char_literal140=null;
		ParserRuleReturnScope instructionWithoutBreakContinue139 =null;
		ParserRuleReturnScope instruction141 =null;

		Object char_literal138_tree=null;
		Object char_literal140_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:2: ( '{' ( instructionWithoutBreakContinue )+ '}' | instruction )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:4: '{' ( instructionWithoutBreakContinue )+ '}'
					{
					root_0 = (Object)adaptor.nil();


					char_literal138=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal138_tree = 
					(Object)adaptor.create(char_literal138)
					;
					adaptor.addChild(root_0, char_literal138_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:8: ( instructionWithoutBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:347:8: instructionWithoutBreakContinue
							{
							pushFollow(FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1787);
							instructionWithoutBreakContinue139=instructionWithoutBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionWithoutBreakContinue139.getTree());

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

					char_literal140=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1791); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal140_tree = 
					(Object)adaptor.create(char_literal140)
					;
					adaptor.addChild(root_0, char_literal140_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:348:4: instruction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionWithoutBreakContinue1796);
					instruction141=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction141.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, instructionWithoutBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionWithoutBreakContinue"


	public static class instructionInclBreakContinue_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionInclBreakContinue"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:351:1: instructionInclBreakContinue : ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' );
	public final TSPHPParser.instructionInclBreakContinue_return instructionInclBreakContinue() throws RecognitionException {
		TSPHPParser.instructionInclBreakContinue_return retval = new TSPHPParser.instructionInclBreakContinue_return();
		retval.start = input.LT(1);
		int instructionInclBreakContinue_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal142=null;
		Token char_literal144=null;
		Token set146=null;
		Token Int147=null;
		Token char_literal148=null;
		ParserRuleReturnScope instructionInclBreakContinue143 =null;
		ParserRuleReturnScope instruction145 =null;

		Object char_literal142_tree=null;
		Object char_literal144_tree=null;
		Object set146_tree=null;
		Object Int147_tree=null;
		Object char_literal148_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:2: ( '{' ( instructionInclBreakContinue )+ '}' | instruction | ( 'break' | 'continue' ) ( Int )? ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:4: '{' ( instructionInclBreakContinue )+ '}'
					{
					root_0 = (Object)adaptor.nil();


					char_literal142=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1807); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal142_tree = 
					(Object)adaptor.create(char_literal142)
					;
					adaptor.addChild(root_0, char_literal142_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:8: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:352:8: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1809);
							instructionInclBreakContinue143=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue143.getTree());

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

					char_literal144=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal144_tree = 
					(Object)adaptor.create(char_literal144)
					;
					adaptor.addChild(root_0, char_literal144_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:4: instruction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_instructionInclBreakContinue1818);
					instruction145=instruction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instruction145.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:4: ( 'break' | 'continue' ) ( Int )? ';'
					{
					root_0 = (Object)adaptor.nil();


					set146=(Token)input.LT(1);
					if ( input.LA(1)==Break||input.LA(1)==Continue ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, 
						(Object)adaptor.create(set146)
						);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:25: ( Int )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Int) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:354:25: Int
							{
							Int147=(Token)match(input,Int,FOLLOW_Int_in_instructionInclBreakContinue1829); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Int147_tree = 
							(Object)adaptor.create(Int147)
							;
							adaptor.addChild(root_0, Int147_tree);
							}

							}
							break;

					}

					char_literal148=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instructionInclBreakContinue1832); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal148_tree = 
					(Object)adaptor.create(char_literal148)
					;
					adaptor.addChild(root_0, char_literal148_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, instructionInclBreakContinue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instructionInclBreakContinue"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:357:1: instruction : ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' );
	public final TSPHPParser.instruction_return instruction() throws RecognitionException {
		TSPHPParser.instruction_return retval = new TSPHPParser.instruction_return();
		retval.start = input.LT(1);
		int instruction_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal150=null;
		Token char_literal152=null;
		Token char_literal162=null;
		Token char_literal164=null;
		Token string_literal165=null;
		Token char_literal167=null;
		Token string_literal168=null;
		Token char_literal170=null;
		Token string_literal171=null;
		Token char_literal172=null;
		ParserRuleReturnScope variableAssignment149 =null;
		ParserRuleReturnScope variableDeclaration151 =null;
		ParserRuleReturnScope ifCondition153 =null;
		ParserRuleReturnScope switchCondition154 =null;
		ParserRuleReturnScope forLoop155 =null;
		ParserRuleReturnScope foreachLoop156 =null;
		ParserRuleReturnScope whileLoop157 =null;
		ParserRuleReturnScope doWhileLoop158 =null;
		ParserRuleReturnScope tryCatch159 =null;
		ParserRuleReturnScope throwException160 =null;
		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd161 =null;
		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd163 =null;
		ParserRuleReturnScope expression166 =null;
		ParserRuleReturnScope expressionList169 =null;

		Object char_literal150_tree=null;
		Object char_literal152_tree=null;
		Object char_literal162_tree=null;
		Object char_literal164_tree=null;
		Object string_literal165_tree=null;
		Object char_literal167_tree=null;
		Object string_literal168_tree=null;
		Object char_literal170_tree=null;
		Object string_literal171_tree=null;
		Object char_literal172_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:2: ( variableAssignment ';' | variableDeclaration ';' | ifCondition | switchCondition | forLoop | foreachLoop | whileLoop | doWhileLoop | tryCatch | throwException | functionCallFluentWithoutAccessAtTheEnd ';' | methodCallFluentWithoutAccessAtTheEnd ';' | 'return' ( expression )? ';' | 'echo' expressionList ';' | 'exit' ';' )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: variableAssignment ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableAssignment_in_instruction1844);
					variableAssignment149=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment149.getTree());

					char_literal150=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal150_tree = 
					(Object)adaptor.create(char_literal150)
					;
					adaptor.addChild(root_0, char_literal150_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: variableDeclaration ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_instruction1851);
					variableDeclaration151=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration151.getTree());

					char_literal152=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1853); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal152_tree = 
					(Object)adaptor.create(char_literal152)
					;
					adaptor.addChild(root_0, char_literal152_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:360:4: ifCondition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifCondition_in_instruction1858);
					ifCondition153=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifCondition153.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:361:4: switchCondition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_switchCondition_in_instruction1863);
					switchCondition154=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, switchCondition154.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:362:4: forLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_instruction1868);
					forLoop155=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop155.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:363:4: foreachLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreachLoop_in_instruction1873);
					foreachLoop156=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, foreachLoop156.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:364:4: whileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_instruction1878);
					whileLoop157=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop157.getTree());

					}
					break;
				case 8 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:365:4: doWhileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_instruction1883);
					doWhileLoop158=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop158.getTree());

					}
					break;
				case 9 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:366:4: tryCatch
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tryCatch_in_instruction1888);
					tryCatch159=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatch159.getTree());

					}
					break;
				case 10 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:367:4: throwException
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_throwException_in_instruction1893);
					throwException160=throwException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, throwException160.getTree());

					}
					break;
				case 11 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: functionCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1898);
					functionCallFluentWithoutAccessAtTheEnd161=functionCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd161.getTree());

					char_literal162=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1900); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal162_tree = 
					(Object)adaptor.create(char_literal162)
					;
					adaptor.addChild(root_0, char_literal162_tree);
					}

					}
					break;
				case 12 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: methodCallFluentWithoutAccessAtTheEnd ';'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1905);
					methodCallFluentWithoutAccessAtTheEnd163=methodCallFluentWithoutAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd163.getTree());

					char_literal164=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1907); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal164_tree = 
					(Object)adaptor.create(char_literal164)
					;
					adaptor.addChild(root_0, char_literal164_tree);
					}

					}
					break;
				case 13 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:4: 'return' ( expression )? ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal165=(Token)match(input,Return,FOLLOW_Return_in_instruction1913); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal165_tree = 
					(Object)adaptor.create(string_literal165)
					;
					adaptor.addChild(root_0, string_literal165_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:13: ( expression )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==At||LA54_0==Backslash||LA54_0==BitwiseNot||LA54_0==Bool||LA54_0==Clone||LA54_0==Float||LA54_0==Identifier||LA54_0==Int||(LA54_0 >= LeftParanthesis && LA54_0 <= LeftSquareBrace)||LA54_0==LogicNot||LA54_0==Minus||LA54_0==MinusMinus||LA54_0==NULL||LA54_0==New||LA54_0==Null||(LA54_0 >= Parent && LA54_0 <= Plus)||LA54_0==PlusPlus||LA54_0==Self||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==VariableId) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:370:13: expression
							{
							pushFollow(FOLLOW_expression_in_instruction1915);
							expression166=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression166.getTree());

							}
							break;

					}

					char_literal167=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal167_tree = 
					(Object)adaptor.create(char_literal167)
					;
					adaptor.addChild(root_0, char_literal167_tree);
					}

					}
					break;
				case 14 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:371:4: 'echo' expressionList ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal168=(Token)match(input,Echo,FOLLOW_Echo_in_instruction1923); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal168_tree = 
					(Object)adaptor.create(string_literal168)
					;
					adaptor.addChild(root_0, string_literal168_tree);
					}

					pushFollow(FOLLOW_expressionList_in_instruction1925);
					expressionList169=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList169.getTree());

					char_literal170=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1927); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal170_tree = 
					(Object)adaptor.create(char_literal170)
					;
					adaptor.addChild(root_0, char_literal170_tree);
					}

					}
					break;
				case 15 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:372:4: 'exit' ';'
					{
					root_0 = (Object)adaptor.nil();


					string_literal171=(Token)match(input,Exit,FOLLOW_Exit_in_instruction1932); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal171_tree = 
					(Object)adaptor.create(string_literal171)
					;
					adaptor.addChild(root_0, string_literal171_tree);
					}

					char_literal172=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_instruction1934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal172_tree = 
					(Object)adaptor.create(char_literal172)
					;
					adaptor.addChild(root_0, char_literal172_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, instruction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expressionList_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:375:1: expressionList : expression ( ',' expression )* ;
	public final TSPHPParser.expressionList_return expressionList() throws RecognitionException {
		TSPHPParser.expressionList_return retval = new TSPHPParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal174=null;
		ParserRuleReturnScope expression173 =null;
		ParserRuleReturnScope expression175 =null;

		Object char_literal174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:2: ( expression ( ',' expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:4: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList1946);
			expression173=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression173.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:15: ( ',' expression )*
			loop56:
			do {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==Comma) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:376:16: ',' expression
					{
					char_literal174=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList1949); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal174_tree = 
					(Object)adaptor.create(char_literal174)
					;
					adaptor.addChild(root_0, char_literal174_tree);
					}

					pushFollow(FOLLOW_expression_in_expressionList1951);
					expression175=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression175.getTree());

					}
					break;

				default :
					break loop56;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, expressionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class variableAssignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableAssignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:378:1: variableAssignment : ( VariableId assignmentOperator expression | incrementDecrement );
	public final TSPHPParser.variableAssignment_return variableAssignment() throws RecognitionException {
		TSPHPParser.variableAssignment_return retval = new TSPHPParser.variableAssignment_return();
		retval.start = input.LT(1);
		int variableAssignment_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId176=null;
		ParserRuleReturnScope assignmentOperator177 =null;
		ParserRuleReturnScope expression178 =null;
		ParserRuleReturnScope incrementDecrement179 =null;

		Object VariableId176_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:2: ( VariableId assignmentOperator expression | incrementDecrement )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:379:4: VariableId assignmentOperator expression
					{
					root_0 = (Object)adaptor.nil();


					VariableId176=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableAssignment1962); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId176_tree = 
					(Object)adaptor.create(VariableId176)
					;
					adaptor.addChild(root_0, VariableId176_tree);
					}

					pushFollow(FOLLOW_assignmentOperator_in_variableAssignment1964);
					assignmentOperator177=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator177.getTree());

					pushFollow(FOLLOW_expression_in_variableAssignment1966);
					expression178=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:380:4: incrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_variableAssignment1971);
					incrementDecrement179=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement179.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableAssignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableAssignment"


	public static class incrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:383:1: incrementDecrement : ( postIncrementDecrement | preIncrementDecrement );
	public final TSPHPParser.incrementDecrement_return incrementDecrement() throws RecognitionException {
		TSPHPParser.incrementDecrement_return retval = new TSPHPParser.incrementDecrement_return();
		retval.start = input.LT(1);
		int incrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope postIncrementDecrement180 =null;
		ParserRuleReturnScope preIncrementDecrement181 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:2: ( postIncrementDecrement | preIncrementDecrement )
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:4: postIncrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_postIncrementDecrement_in_incrementDecrement1983);
					postIncrementDecrement180=postIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postIncrementDecrement180.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:385:4: preIncrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_preIncrementDecrement_in_incrementDecrement1988);
					preIncrementDecrement181=preIncrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementDecrement181.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, incrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "incrementDecrement"


	public static class assignmentOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:388:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' );
	public final TSPHPParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
		TSPHPParser.assignmentOperator_return retval = new TSPHPParser.assignmentOperator_return();
		retval.start = input.LT(1);
		int assignmentOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set182=null;

		Object set182_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:2: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set182=(Token)input.LT(1);
			if ( input.LA(1)==Assign||input.LA(1)==BitwiseAndEqual||input.LA(1)==BitwiseOrEqual||input.LA(1)==BitwiseXorEqual||input.LA(1)==DivideEqual||input.LA(1)==DotEqual||input.LA(1)==MinusEqual||input.LA(1)==ModuloEqual||input.LA(1)==MultiplyEqual||input.LA(1)==PlusEqual||input.LA(1)==ShiftLeftEqual||input.LA(1)==ShiftRightEqual ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set182)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, assignmentOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentOperator"


	public static class postIncrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:403:1: postIncrementDecrement : variableMemberStaticMember ( '++' | '--' ) ;
	public final TSPHPParser.postIncrementDecrement_return postIncrementDecrement() throws RecognitionException {
		TSPHPParser.postIncrementDecrement_return retval = new TSPHPParser.postIncrementDecrement_return();
		retval.start = input.LT(1);
		int postIncrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		Token set184=null;
		ParserRuleReturnScope variableMemberStaticMember183 =null;

		Object set184_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:2: ( variableMemberStaticMember ( '++' | '--' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:404:4: variableMemberStaticMember ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2066);
			variableMemberStaticMember183=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember183.getTree());

			set184=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set184)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, postIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postIncrementDecrement"


	public static class preIncrementDecrement_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preIncrementDecrement"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:406:1: preIncrementDecrement : ( '++' | '--' ) variableMemberStaticMember ;
	public final TSPHPParser.preIncrementDecrement_return preIncrementDecrement() throws RecognitionException {
		TSPHPParser.preIncrementDecrement_return retval = new TSPHPParser.preIncrementDecrement_return();
		retval.start = input.LT(1);
		int preIncrementDecrement_StartIndex = input.index();

		Object root_0 = null;

		Token set185=null;
		ParserRuleReturnScope variableMemberStaticMember186 =null;

		Object set185_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:2: ( ( '++' | '--' ) variableMemberStaticMember )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:407:4: ( '++' | '--' ) variableMemberStaticMember
			{
			root_0 = (Object)adaptor.nil();


			set185=(Token)input.LT(1);
			if ( input.LA(1)==MinusMinus||input.LA(1)==PlusPlus ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set185)
				);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2088);
			variableMemberStaticMember186=variableMemberStaticMember();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember186.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, preIncrementDecrement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preIncrementDecrement"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:410:1: variableDeclaration : allTypes VariableId ( '=' ^ expression )? ;
	public final TSPHPParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		TSPHPParser.variableDeclaration_return retval = new TSPHPParser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId188=null;
		Token char_literal189=null;
		ParserRuleReturnScope allTypes187 =null;
		ParserRuleReturnScope expression190 =null;

		Object VariableId188_tree=null;
		Object char_literal189_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:2: ( allTypes VariableId ( '=' ^ expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:4: allTypes VariableId ( '=' ^ expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_allTypes_in_variableDeclaration2100);
			allTypes187=allTypes();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, allTypes187.getTree());

			VariableId188=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration2102); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId188_tree = 
			(Object)adaptor.create(VariableId188)
			;
			adaptor.addChild(root_0, VariableId188_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:24: ( '=' ^ expression )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==Assign) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:411:25: '=' ^ expression
					{
					char_literal189=(Token)match(input,Assign,FOLLOW_Assign_in_variableDeclaration2105); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal189_tree = 
					(Object)adaptor.create(char_literal189)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal189_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_variableDeclaration2108);
					expression190=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression190.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:413:1: expression : logicOrWeak ;
	public final TSPHPParser.expression_return expression() throws RecognitionException {
		TSPHPParser.expression_return retval = new TSPHPParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope logicOrWeak191 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:2: ( logicOrWeak )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:414:4: logicOrWeak
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicOrWeak_in_expression2120);
			logicOrWeak191=logicOrWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrWeak191.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressionForTest_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionForTest"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:416:1: expressionForTest : expression ';' ;
	public final TSPHPParser.expressionForTest_return expressionForTest() throws RecognitionException {
		TSPHPParser.expressionForTest_return retval = new TSPHPParser.expressionForTest_return();
		retval.start = input.LT(1);
		int expressionForTest_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal193=null;
		ParserRuleReturnScope expression192 =null;

		Object char_literal193_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:2: ( expression ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:417:4: expression ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionForTest2129);
			expression192=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());

			char_literal193=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_expressionForTest2131); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal193_tree = 
			(Object)adaptor.create(char_literal193)
			;
			adaptor.addChild(root_0, char_literal193_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, expressionForTest_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressionForTest"


	public static class logicOrWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOrWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:419:1: logicOrWeak : logicXorWeak ( 'or' ^ logicXorWeak )* ;
	public final TSPHPParser.logicOrWeak_return logicOrWeak() throws RecognitionException {
		TSPHPParser.logicOrWeak_return retval = new TSPHPParser.logicOrWeak_return();
		retval.start = input.LT(1);
		int logicOrWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal195=null;
		ParserRuleReturnScope logicXorWeak194 =null;
		ParserRuleReturnScope logicXorWeak196 =null;

		Object string_literal195_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:2: ( logicXorWeak ( 'or' ^ logicXorWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:4: logicXorWeak ( 'or' ^ logicXorWeak )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2140);
			logicXorWeak194=logicXorWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicXorWeak194.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:17: ( 'or' ^ logicXorWeak )*
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==LogicOrWeak) ) {
					int LA60_2 = input.LA(2);
					if ( (synpred101_TSPHP()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:18: 'or' ^ logicXorWeak
					{
					string_literal195=(Token)match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_logicOrWeak2143); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal195_tree = 
					(Object)adaptor.create(string_literal195)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal195_tree, root_0);
					}

					pushFollow(FOLLOW_logicXorWeak_in_logicOrWeak2146);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, logicOrWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOrWeak"


	public static class logicXorWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicXorWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:422:1: logicXorWeak : logicAndWeak ( 'xor' ^ logicAndWeak )* ;
	public final TSPHPParser.logicXorWeak_return logicXorWeak() throws RecognitionException {
		TSPHPParser.logicXorWeak_return retval = new TSPHPParser.logicXorWeak_return();
		retval.start = input.LT(1);
		int logicXorWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal198=null;
		ParserRuleReturnScope logicAndWeak197 =null;
		ParserRuleReturnScope logicAndWeak199 =null;

		Object string_literal198_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:2: ( logicAndWeak ( 'xor' ^ logicAndWeak )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:4: logicAndWeak ( 'xor' ^ logicAndWeak )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2159);
			logicAndWeak197=logicAndWeak();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndWeak197.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:17: ( 'xor' ^ logicAndWeak )*
			loop61:
			do {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==LogicXorWeak) ) {
					int LA61_2 = input.LA(2);
					if ( (synpred102_TSPHP()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:18: 'xor' ^ logicAndWeak
					{
					string_literal198=(Token)match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_logicXorWeak2162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal198_tree = 
					(Object)adaptor.create(string_literal198)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal198_tree, root_0);
					}

					pushFollow(FOLLOW_logicAndWeak_in_logicXorWeak2165);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, logicXorWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicXorWeak"


	public static class logicAndWeak_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAndWeak"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:425:1: logicAndWeak : assignment ( 'and' ^ assignment )* ;
	public final TSPHPParser.logicAndWeak_return logicAndWeak() throws RecognitionException {
		TSPHPParser.logicAndWeak_return retval = new TSPHPParser.logicAndWeak_return();
		retval.start = input.LT(1);
		int logicAndWeak_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal201=null;
		ParserRuleReturnScope assignment200 =null;
		ParserRuleReturnScope assignment202 =null;

		Object string_literal201_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:2: ( assignment ( 'and' ^ assignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:4: assignment ( 'and' ^ assignment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_logicAndWeak2178);
			assignment200=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment200.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:15: ( 'and' ^ assignment )*
			loop62:
			do {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LogicAndWeak) ) {
					int LA62_2 = input.LA(2);
					if ( (synpred103_TSPHP()) ) {
						alt62=1;
					}

				}

				switch (alt62) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:16: 'and' ^ assignment
					{
					string_literal201=(Token)match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_logicAndWeak2181); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = 
					(Object)adaptor.create(string_literal201)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal201_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_logicAndWeak2184);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, logicAndWeak_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAndWeak"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:428:1: assignment : ternary ( assignmentOperator ternary )* ;
	public final TSPHPParser.assignment_return assignment() throws RecognitionException {
		TSPHPParser.assignment_return retval = new TSPHPParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope ternary203 =null;
		ParserRuleReturnScope assignmentOperator204 =null;
		ParserRuleReturnScope ternary205 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:2: ( ternary ( assignmentOperator ternary )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:4: ternary ( assignmentOperator ternary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_ternary_in_assignment2195);
			ternary203=ternary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary203.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:12: ( assignmentOperator ternary )*
			loop63:
			do {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==Assign||LA63_0==BitwiseAndEqual||LA63_0==BitwiseOrEqual||LA63_0==BitwiseXorEqual||LA63_0==DivideEqual||LA63_0==DotEqual||LA63_0==MinusEqual||LA63_0==ModuloEqual||LA63_0==MultiplyEqual||LA63_0==PlusEqual||LA63_0==ShiftLeftEqual||LA63_0==ShiftRightEqual) ) {
					int LA63_2 = input.LA(2);
					if ( (synpred104_TSPHP()) ) {
						alt63=1;
					}

				}

				switch (alt63) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:13: assignmentOperator ternary
					{
					pushFollow(FOLLOW_assignmentOperator_in_assignment2198);
					assignmentOperator204=assignmentOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator204.getTree());

					pushFollow(FOLLOW_ternary_in_assignment2200);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:1: ternary : logicOr ( '?' ^ expression ':' ! expression )? ;
	public final TSPHPParser.ternary_return ternary() throws RecognitionException {
		TSPHPParser.ternary_return retval = new TSPHPParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal207=null;
		Token char_literal209=null;
		ParserRuleReturnScope logicOr206 =null;
		ParserRuleReturnScope expression208 =null;
		ParserRuleReturnScope expression210 =null;

		Object char_literal207_tree=null;
		Object char_literal209_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:9: ( logicOr ( '?' ^ expression ':' ! expression )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:11: logicOr ( '?' ^ expression ':' ! expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicOr_in_ternary2210);
			logicOr206=logicOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOr206.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:19: ( '?' ^ expression ':' ! expression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==QuestionMark) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:431:20: '?' ^ expression ':' ! expression
					{
					char_literal207=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2213); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal207_tree = 
					(Object)adaptor.create(char_literal207)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal207_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_ternary2216);
					expression208=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());

					char_literal209=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2218); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ternary2221);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicOr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:1: logicOr : logicAnd ( '||' ^ logicAnd )* ;
	public final TSPHPParser.logicOr_return logicOr() throws RecognitionException {
		TSPHPParser.logicOr_return retval = new TSPHPParser.logicOr_return();
		retval.start = input.LT(1);
		int logicOr_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope logicAnd211 =null;
		ParserRuleReturnScope logicAnd213 =null;

		Object string_literal212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:9: ( logicAnd ( '||' ^ logicAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:11: logicAnd ( '||' ^ logicAnd )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicAnd_in_logicOr2231);
			logicAnd211=logicAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAnd211.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:20: ( '||' ^ logicAnd )*
			loop65:
			do {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==LogicOr) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:433:21: '||' ^ logicAnd
					{
					string_literal212=(Token)match(input,LogicOr,FOLLOW_LogicOr_in_logicOr2234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = 
					(Object)adaptor.create(string_literal212)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal212_tree, root_0);
					}

					pushFollow(FOLLOW_logicAnd_in_logicOr2237);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, logicOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicOr"


	public static class logicAnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:1: logicAnd : bitwiseOr ( '&&' ^ bitwiseOr )* ;
	public final TSPHPParser.logicAnd_return logicAnd() throws RecognitionException {
		TSPHPParser.logicAnd_return retval = new TSPHPParser.logicAnd_return();
		retval.start = input.LT(1);
		int logicAnd_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal215=null;
		ParserRuleReturnScope bitwiseOr214 =null;
		ParserRuleReturnScope bitwiseOr216 =null;

		Object string_literal215_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:9: ( bitwiseOr ( '&&' ^ bitwiseOr )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:11: bitwiseOr ( '&&' ^ bitwiseOr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicAnd2246);
			bitwiseOr214=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr214.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:21: ( '&&' ^ bitwiseOr )*
			loop66:
			do {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==LogicAnd) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:435:22: '&&' ^ bitwiseOr
					{
					string_literal215=(Token)match(input,LogicAnd,FOLLOW_LogicAnd_in_logicAnd2249); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal215_tree = 
					(Object)adaptor.create(string_literal215)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal215_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicAnd2252);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, logicAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:437:1: bitwiseOr : bitwiseXor ( '|' ^ bitwiseXor )* ;
	public final TSPHPParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		TSPHPParser.bitwiseOr_return retval = new TSPHPParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope bitwiseXor217 =null;
		ParserRuleReturnScope bitwiseXor219 =null;

		Object char_literal218_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:2: ( bitwiseXor ( '|' ^ bitwiseXor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:4: bitwiseXor ( '|' ^ bitwiseXor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2263);
			bitwiseXor217=bitwiseXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXor217.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:15: ( '|' ^ bitwiseXor )*
			loop67:
			do {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BitwiseOr) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:438:16: '|' ^ bitwiseXor
					{
					char_literal218=(Token)match(input,BitwiseOr,FOLLOW_BitwiseOr_in_bitwiseOr2266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal218_tree = 
					(Object)adaptor.create(char_literal218)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal218_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseXor_in_bitwiseOr2269);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitwiseXor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseXor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:440:1: bitwiseXor : bitwiseAnd ( '^' ^ bitwiseAnd )* ;
	public final TSPHPParser.bitwiseXor_return bitwiseXor() throws RecognitionException {
		TSPHPParser.bitwiseXor_return retval = new TSPHPParser.bitwiseXor_return();
		retval.start = input.LT(1);
		int bitwiseXor_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal221=null;
		ParserRuleReturnScope bitwiseAnd220 =null;
		ParserRuleReturnScope bitwiseAnd222 =null;

		Object char_literal221_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:2: ( bitwiseAnd ( '^' ^ bitwiseAnd )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:4: bitwiseAnd ( '^' ^ bitwiseAnd )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2280);
			bitwiseAnd220=bitwiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAnd220.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:15: ( '^' ^ bitwiseAnd )*
			loop68:
			do {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==BitwiseXor) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:441:16: '^' ^ bitwiseAnd
					{
					char_literal221=(Token)match(input,BitwiseXor,FOLLOW_BitwiseXor_in_bitwiseXor2283); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal221_tree = 
					(Object)adaptor.create(char_literal221)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal221_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseAnd_in_bitwiseXor2286);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, bitwiseXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseXor"


	public static class bitwiseAnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseAnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:443:1: bitwiseAnd : equality ( '&' ^ equality )* ;
	public final TSPHPParser.bitwiseAnd_return bitwiseAnd() throws RecognitionException {
		TSPHPParser.bitwiseAnd_return retval = new TSPHPParser.bitwiseAnd_return();
		retval.start = input.LT(1);
		int bitwiseAnd_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal224=null;
		ParserRuleReturnScope equality223 =null;
		ParserRuleReturnScope equality225 =null;

		Object char_literal224_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:2: ( equality ( '&' ^ equality )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:4: equality ( '&' ^ equality )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equality_in_bitwiseAnd2297);
			equality223=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality223.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:13: ( '&' ^ equality )*
			loop69:
			do {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==BitwiseAnd) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:444:14: '&' ^ equality
					{
					char_literal224=(Token)match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_bitwiseAnd2300); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal224_tree = 
					(Object)adaptor.create(char_literal224)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal224_tree, root_0);
					}

					pushFollow(FOLLOW_equality_in_bitwiseAnd2303);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, bitwiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseAnd"


	public static class equality_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:1: equality : comparison ( equalityOperator ^ comparison )? ;
	public final TSPHPParser.equality_return equality() throws RecognitionException {
		TSPHPParser.equality_return retval = new TSPHPParser.equality_return();
		retval.start = input.LT(1);
		int equality_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope comparison226 =null;
		ParserRuleReturnScope equalityOperator227 =null;
		ParserRuleReturnScope comparison228 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:9: ( comparison ( equalityOperator ^ comparison )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:11: comparison ( equalityOperator ^ comparison )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_comparison_in_equality2312);
			comparison226=comparison();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison226.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:22: ( equalityOperator ^ comparison )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==Equal||LA70_0==Identical||(LA70_0 >= NotEqual && LA70_0 <= NotIdentical)) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:446:23: equalityOperator ^ comparison
					{
					pushFollow(FOLLOW_equalityOperator_in_equality2315);
					equalityOperator227=equalityOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(equalityOperator227.getTree(), root_0);
					pushFollow(FOLLOW_comparison_in_equality2318);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, equality_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:448:1: equalityOperator : ( '==' | '===' | '!=' | '!==' | '<>' );
	public final TSPHPParser.equalityOperator_return equalityOperator() throws RecognitionException {
		TSPHPParser.equalityOperator_return retval = new TSPHPParser.equalityOperator_return();
		retval.start = input.LT(1);
		int equalityOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set229=null;

		Object set229_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:449:2: ( '==' | '===' | '!=' | '!==' | '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set229=(Token)input.LT(1);
			if ( input.LA(1)==Equal||input.LA(1)==Identical||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set229)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, equalityOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityOperator"


	public static class comparison_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:456:1: comparison : bitwiseShift ( comparisonOperator ^ bitwiseShift )? ;
	public final TSPHPParser.comparison_return comparison() throws RecognitionException {
		TSPHPParser.comparison_return retval = new TSPHPParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope bitwiseShift230 =null;
		ParserRuleReturnScope comparisonOperator231 =null;
		ParserRuleReturnScope bitwiseShift232 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:2: ( bitwiseShift ( comparisonOperator ^ bitwiseShift )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:4: bitwiseShift ( comparisonOperator ^ bitwiseShift )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bitwiseShift_in_comparison2360);
			bitwiseShift230=bitwiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseShift230.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:17: ( comparisonOperator ^ bitwiseShift )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( ((LA71_0 >= GreaterEqualThan && LA71_0 <= GreaterThan)||(LA71_0 >= LessEqualThan && LA71_0 <= LessThan)) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:457:18: comparisonOperator ^ bitwiseShift
					{
					pushFollow(FOLLOW_comparisonOperator_in_comparison2363);
					comparisonOperator231=comparisonOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(comparisonOperator231.getTree(), root_0);
					pushFollow(FOLLOW_bitwiseShift_in_comparison2366);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparisonOperator_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparisonOperator"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:459:1: comparisonOperator : ( '<' | '<=' | '>' | '>=' );
	public final TSPHPParser.comparisonOperator_return comparisonOperator() throws RecognitionException {
		TSPHPParser.comparisonOperator_return retval = new TSPHPParser.comparisonOperator_return();
		retval.start = input.LT(1);
		int comparisonOperator_StartIndex = input.index();

		Object root_0 = null;

		Token set233=null;

		Object set233_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:460:2: ( '<' | '<=' | '>' | '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set233=(Token)input.LT(1);
			if ( (input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||(input.LA(1) >= LessEqualThan && input.LA(1) <= LessThan) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set233)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, comparisonOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisonOperator"


	public static class bitwiseShift_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwiseShift"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:1: bitwiseShift : termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* ;
	public final TSPHPParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
		TSPHPParser.bitwiseShift_return retval = new TSPHPParser.bitwiseShift_return();
		retval.start = input.LT(1);
		int bitwiseShift_StartIndex = input.index();

		Object root_0 = null;

		Token set235=null;
		ParserRuleReturnScope termOrStringConcatenation234 =null;
		ParserRuleReturnScope termOrStringConcatenation236 =null;

		Object set235_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:14: ( termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:16: termOrStringConcatenation ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2402);
			termOrStringConcatenation234=termOrStringConcatenation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrStringConcatenation234.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:42: ( ( '<<' | '>>' ) ^ termOrStringConcatenation )*
			loop72:
			do {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ShiftLeft||LA72_0==ShiftRight) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:466:43: ( '<<' | '>>' ) ^ termOrStringConcatenation
					{
					set235=(Token)input.LT(1);
					set235=(Token)input.LT(1);
					if ( input.LA(1)==ShiftLeft||input.LA(1)==ShiftRight ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set235)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termOrStringConcatenation_in_bitwiseShift2412);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, bitwiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseShift"


	public static class termOrStringConcatenation_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "termOrStringConcatenation"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:1: termOrStringConcatenation : factor ( ( '+' | '-' | '.' ) ^ factor )* ;
	public final TSPHPParser.termOrStringConcatenation_return termOrStringConcatenation() throws RecognitionException {
		TSPHPParser.termOrStringConcatenation_return retval = new TSPHPParser.termOrStringConcatenation_return();
		retval.start = input.LT(1);
		int termOrStringConcatenation_StartIndex = input.index();

		Object root_0 = null;

		Token set238=null;
		ParserRuleReturnScope factor237 =null;
		ParserRuleReturnScope factor239 =null;

		Object set238_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:27: ( factor ( ( '+' | '-' | '.' ) ^ factor )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:29: factor ( ( '+' | '-' | '.' ) ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_termOrStringConcatenation2422);
			factor237=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor237.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:36: ( ( '+' | '-' | '.' ) ^ factor )*
			loop73:
			do {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==Dot||LA73_0==Minus||LA73_0==Plus) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:468:37: ( '+' | '-' | '.' ) ^ factor
					{
					set238=(Token)input.LT(1);
					set238=(Token)input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set238)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_termOrStringConcatenation2434);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, termOrStringConcatenation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termOrStringConcatenation"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:1: factor : logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* ;
	public final TSPHPParser.factor_return factor() throws RecognitionException {
		TSPHPParser.factor_return retval = new TSPHPParser.factor_return();
		retval.start = input.LT(1);
		int factor_StartIndex = input.index();

		Object root_0 = null;

		Token set241=null;
		ParserRuleReturnScope logicNot240 =null;
		ParserRuleReturnScope logicNot242 =null;

		Object set241_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:8: ( logicNot ( ( '*' | '/' | '%' ) ^ logicNot )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:10: logicNot ( ( '*' | '/' | '%' ) ^ logicNot )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicNot_in_factor2444);
			logicNot240=logicNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot240.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:19: ( ( '*' | '/' | '%' ) ^ logicNot )*
			loop74:
			do {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==Divide||LA74_0==Modulo||LA74_0==Multiply) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:470:20: ( '*' | '/' | '%' ) ^ logicNot
					{
					set241=(Token)input.LT(1);
					set241=(Token)input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulo||input.LA(1)==Multiply ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
						(Object)adaptor.create(set241)
						, root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicNot_in_factor2456);
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, factor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class logicNot_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicNot"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:1: logicNot : ( '!' logicNot | instanceOf );
	public final TSPHPParser.logicNot_return logicNot() throws RecognitionException {
		TSPHPParser.logicNot_return retval = new TSPHPParser.logicNot_return();
		retval.start = input.LT(1);
		int logicNot_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal243=null;
		ParserRuleReturnScope logicNot244 =null;
		ParserRuleReturnScope instanceOf245 =null;

		Object char_literal243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:9: ( '!' logicNot | instanceOf )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==LogicNot) ) {
				alt75=1;
			}
			else if ( (LA75_0==At||LA75_0==Backslash||LA75_0==BitwiseNot||LA75_0==Bool||LA75_0==Clone||LA75_0==Float||LA75_0==Identifier||LA75_0==Int||(LA75_0 >= LeftParanthesis && LA75_0 <= LeftSquareBrace)||LA75_0==Minus||LA75_0==MinusMinus||LA75_0==NULL||LA75_0==New||LA75_0==Null||(LA75_0 >= Parent && LA75_0 <= Plus)||LA75_0==PlusPlus||LA75_0==Self||LA75_0==String||LA75_0==This||LA75_0==TypeArray||LA75_0==VariableId) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:472:11: '!' logicNot
					{
					root_0 = (Object)adaptor.nil();


					char_literal243=(Token)match(input,LogicNot,FOLLOW_LogicNot_in_logicNot2465); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal243_tree = 
					(Object)adaptor.create(char_literal243)
					;
					adaptor.addChild(root_0, char_literal243_tree);
					}

					pushFollow(FOLLOW_logicNot_in_logicNot2467);
					logicNot244=logicNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicNot244.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:473:4: instanceOf
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicNot2472);
					instanceOf245=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf245.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, logicNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:477:1: instanceOf : castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? ;
	public final TSPHPParser.instanceOf_return instanceOf() throws RecognitionException {
		TSPHPParser.instanceOf_return retval = new TSPHPParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal247=null;
		Token VariableId249=null;
		ParserRuleReturnScope castOrBitwiseNotOrAt246 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject248 =null;

		Object string_literal247_tree=null;
		Object VariableId249_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:2: ( castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:4: castOrBitwiseNotOrAt ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2484);
			castOrBitwiseNotOrAt246=castOrBitwiseNotOrAt();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt246.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:25: ( 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId ) )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Instanceof) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:26: 'instanceof' ^ ( classInterfaceTypeWithoutObject | VariableId )
					{
					string_literal247=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal247_tree = 
					(Object)adaptor.create(string_literal247)
					;
					root_0 = (Object)adaptor.becomeRoot(string_literal247_tree, root_0);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:40: ( classInterfaceTypeWithoutObject | VariableId )
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:41: classInterfaceTypeWithoutObject
							{
							pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2491);
							classInterfaceTypeWithoutObject248=classInterfaceTypeWithoutObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject248.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:478:73: VariableId
							{
							VariableId249=(Token)match(input,VariableId,FOLLOW_VariableId_in_instanceOf2493); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VariableId249_tree = 
							(Object)adaptor.create(VariableId249)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class castOrBitwiseNotOrAt_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "castOrBitwiseNotOrAt"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:480:1: castOrBitwiseNotOrAt : ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone );
	public final TSPHPParser.castOrBitwiseNotOrAt_return castOrBitwiseNotOrAt() throws RecognitionException {
		TSPHPParser.castOrBitwiseNotOrAt_return retval = new TSPHPParser.castOrBitwiseNotOrAt_return();
		retval.start = input.LT(1);
		int castOrBitwiseNotOrAt_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal250=null;
		Token char_literal253=null;
		Token char_literal255=null;
		Token char_literal257=null;
		ParserRuleReturnScope primitiveTypesInclArray251 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject252 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt254 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt256 =null;
		ParserRuleReturnScope castOrBitwiseNotOrAt258 =null;
		ParserRuleReturnScope newOrClone259 =null;

		Object char_literal250_tree=null;
		Object char_literal253_tree=null;
		Object char_literal255_tree=null;
		Object char_literal257_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:2: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt | '~' ^ castOrBitwiseNotOrAt | '@' ^ castOrBitwiseNotOrAt | newOrClone )
			int alt79=4;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				int LA79_1 = input.LA(2);
				if ( (synpred132_TSPHP()) ) {
					alt79=1;
				}
				else if ( (true) ) {
					alt79=4;
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
			case BitwiseNot:
				{
				alt79=2;
				}
				break;
			case At:
				{
				alt79=3;
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
			case NULL:
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
				alt79=4;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
					{
					char_literal250=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2506); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal250_tree = 
					(Object)adaptor.create(char_literal250)
					;
					adaptor.addChild(root_0, char_literal250_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( ((LA78_0 >= TypeArray && LA78_0 <= TypeInt)||LA78_0==TypeString) ) {
						alt78=1;
					}
					else if ( (LA78_0==Backslash||LA78_0==Identifier||LA78_0==TypeObject) ) {
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:10: primitiveTypesInclArray
							{
							pushFollow(FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2509);
							primitiveTypesInclArray251=primitiveTypesInclArray();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypesInclArray251.getTree());

							}
							break;
						case 2 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:34: classInterfaceTypeInclObject
							{
							pushFollow(FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2511);
							classInterfaceTypeInclObject252=classInterfaceTypeInclObject();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject252.getTree());

							}
							break;

					}

					char_literal253=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal253_tree = 
					(Object)adaptor.create(char_literal253)
					;
					adaptor.addChild(root_0, char_literal253_tree);
					}

					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2517);
					castOrBitwiseNotOrAt254=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt254.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:482:4: '~' ^ castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					char_literal255=(Token)match(input,BitwiseNot,FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2522); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal255_tree = 
					(Object)adaptor.create(char_literal255)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal255_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2525);
					castOrBitwiseNotOrAt256=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt256.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:483:4: '@' ^ castOrBitwiseNotOrAt
					{
					root_0 = (Object)adaptor.nil();


					char_literal257=(Token)match(input,At,FOLLOW_At_in_castOrBitwiseNotOrAt2530); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal257_tree = 
					(Object)adaptor.create(char_literal257)
					;
					root_0 = (Object)adaptor.becomeRoot(char_literal257_tree, root_0);
					}

					pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2533);
					castOrBitwiseNotOrAt258=castOrBitwiseNotOrAt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castOrBitwiseNotOrAt258.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:484:4: newOrClone
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2538);
					newOrClone259=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone259.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, castOrBitwiseNotOrAt_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "castOrBitwiseNotOrAt"


	public static class newOrClone_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newOrClone"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:487:1: newOrClone : ( 'clone' variableMemberStaticMember | newObject | unaryPrimary );
	public final TSPHPParser.newOrClone_return newOrClone() throws RecognitionException {
		TSPHPParser.newOrClone_return retval = new TSPHPParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal260=null;
		ParserRuleReturnScope variableMemberStaticMember261 =null;
		ParserRuleReturnScope newObject262 =null;
		ParserRuleReturnScope unaryPrimary263 =null;

		Object string_literal260_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:2: ( 'clone' variableMemberStaticMember | newObject | unaryPrimary )
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
			case NULL:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:488:4: 'clone' variableMemberStaticMember
					{
					root_0 = (Object)adaptor.nil();


					string_literal260=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone2549); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal260_tree = 
					(Object)adaptor.create(string_literal260)
					;
					adaptor.addChild(root_0, string_literal260_tree);
					}

					pushFollow(FOLLOW_variableMemberStaticMember_in_newOrClone2551);
					variableMemberStaticMember261=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember261.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:489:4: newObject
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_newObject_in_newOrClone2556);
					newObject262=newObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject262.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:490:4: unaryPrimary
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unaryPrimary_in_newOrClone2561);
					unaryPrimary263=unaryPrimary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryPrimary263.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, newOrClone_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newOrClone"


	public static class variableMemberStaticMember_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableMemberStaticMember"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:494:1: variableMemberStaticMember : ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId );
	public final TSPHPParser.variableMemberStaticMember_return variableMemberStaticMember() throws RecognitionException {
		TSPHPParser.variableMemberStaticMember_return retval = new TSPHPParser.variableMemberStaticMember_return();
		retval.start = input.LT(1);
		int variableMemberStaticMember_StartIndex = input.index();

		Object root_0 = null;

		Token VariableId265=null;
		Token string_literal267=null;
		Token VariableId269=null;
		Token string_literal271=null;
		Token VariableId272=null;
		ParserRuleReturnScope staticAccessOrParent264 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess266 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess268 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess270 =null;

		Object VariableId265_tree=null;
		Object string_literal267_tree=null;
		Object VariableId269_tree=null;
		Object string_literal271_tree=null;
		Object VariableId272_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:2: ( staticAccessOrParent VariableId ( memberAccessOrArrayAccess )* | '$this' ( memberAccessOrArrayAccess )+ | VariableId ( memberAccessOrArrayAccess )+ | '$this' | VariableId )
			int alt84=5;
			switch ( input.LA(1) ) {
			case Backslash:
			case Identifier:
			case Parent:
			case Self:
				{
				alt84=1;
				}
				break;
			case This:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA84_4 = input.LA(3);
					if ( (LA84_4==Identifier) ) {
						int LA84_10 = input.LA(4);
						if ( (LA84_10==LeftParanthesis) ) {
							alt84=4;
						}
						else if ( (LA84_10==EOF||LA84_10==Arrow||LA84_10==Assign||(LA84_10 >= BitwiseAnd && LA84_10 <= BitwiseAndEqual)||(LA84_10 >= BitwiseOr && LA84_10 <= BitwiseXorEqual)||(LA84_10 >= Colon && LA84_10 <= Comma)||(LA84_10 >= Divide && LA84_10 <= DivideEqual)||(LA84_10 >= Dot && LA84_10 <= DotEqual)||LA84_10==Equal||(LA84_10 >= GreaterEqualThan && LA84_10 <= GreaterThan)||LA84_10==Identical||LA84_10==Instanceof||(LA84_10 >= LeftSquareBrace && LA84_10 <= LogicAndWeak)||(LA84_10 >= LogicOr && LA84_10 <= MultiplyEqual)||(LA84_10 >= NotEqual && LA84_10 <= NotIdentical)||LA84_10==ObjectOperator||(LA84_10 >= Plus && LA84_10 <= PlusPlus)||LA84_10==QuestionMark||(LA84_10 >= RightParanthesis && LA84_10 <= RightSquareBrace)||(LA84_10 >= Semicolon && LA84_10 <= ShiftRightEqual)) ) {
							alt84=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 84, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA84_4==EOF) ) {
						alt84=4;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
				case LeftSquareBrace:
					{
					alt84=2;
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
					alt84=4;
					}
					break;
				default:
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
			case VariableId:
				{
				switch ( input.LA(2) ) {
				case ObjectOperator:
					{
					int LA84_7 = input.LA(3);
					if ( (LA84_7==Identifier) ) {
						int LA84_11 = input.LA(4);
						if ( (LA84_11==LeftParanthesis) ) {
							alt84=5;
						}
						else if ( (LA84_11==EOF||LA84_11==Arrow||LA84_11==Assign||(LA84_11 >= BitwiseAnd && LA84_11 <= BitwiseAndEqual)||(LA84_11 >= BitwiseOr && LA84_11 <= BitwiseXorEqual)||(LA84_11 >= Colon && LA84_11 <= Comma)||(LA84_11 >= Divide && LA84_11 <= DivideEqual)||(LA84_11 >= Dot && LA84_11 <= DotEqual)||LA84_11==Equal||(LA84_11 >= GreaterEqualThan && LA84_11 <= GreaterThan)||LA84_11==Identical||LA84_11==Instanceof||(LA84_11 >= LeftSquareBrace && LA84_11 <= LogicAndWeak)||(LA84_11 >= LogicOr && LA84_11 <= MultiplyEqual)||(LA84_11 >= NotEqual && LA84_11 <= NotIdentical)||LA84_11==ObjectOperator||(LA84_11 >= Plus && LA84_11 <= PlusPlus)||LA84_11==QuestionMark||(LA84_11 >= RightParanthesis && LA84_11 <= RightSquareBrace)||(LA84_11 >= Semicolon && LA84_11 <= ShiftRightEqual)) ) {
							alt84=3;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 84, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA84_7==EOF) ) {
						alt84=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 84, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LeftSquareBrace:
					{
					alt84=3;
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
					alt84=5;
					}
					break;
				default:
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:4: staticAccessOrParent VariableId ( memberAccessOrArrayAccess )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2574);
					staticAccessOrParent264=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent264.getTree());

					VariableId265=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2576); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId265_tree = 
					(Object)adaptor.create(VariableId265)
					;
					adaptor.addChild(root_0, VariableId265_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:36: ( memberAccessOrArrayAccess )*
					loop81:
					do {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==ObjectOperator) ) {
							int LA81_2 = input.LA(2);
							if ( (LA81_2==Identifier) ) {
								int LA81_4 = input.LA(3);
								if ( (LA81_4==EOF||LA81_4==Arrow||LA81_4==Assign||(LA81_4 >= BitwiseAnd && LA81_4 <= BitwiseAndEqual)||(LA81_4 >= BitwiseOr && LA81_4 <= BitwiseXorEqual)||(LA81_4 >= Colon && LA81_4 <= Comma)||(LA81_4 >= Divide && LA81_4 <= DivideEqual)||(LA81_4 >= Dot && LA81_4 <= DotEqual)||LA81_4==Equal||(LA81_4 >= GreaterEqualThan && LA81_4 <= GreaterThan)||LA81_4==Identical||LA81_4==Instanceof||(LA81_4 >= LeftSquareBrace && LA81_4 <= LogicAndWeak)||(LA81_4 >= LogicOr && LA81_4 <= MultiplyEqual)||(LA81_4 >= NotEqual && LA81_4 <= NotIdentical)||LA81_4==ObjectOperator||(LA81_4 >= Plus && LA81_4 <= PlusPlus)||LA81_4==QuestionMark||(LA81_4 >= RightParanthesis && LA81_4 <= RightSquareBrace)||(LA81_4 >= Semicolon && LA81_4 <= ShiftRightEqual)) ) {
									alt81=1;
								}

							}

						}
						else if ( (LA81_0==LeftSquareBrace) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:495:36: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2578);
							memberAccessOrArrayAccess266=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess266.getTree());

							}
							break;

						default :
							break loop81;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:4: '$this' ( memberAccessOrArrayAccess )+
					{
					root_0 = (Object)adaptor.nil();


					string_literal267=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2584); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal267_tree = 
					(Object)adaptor.create(string_literal267)
					;
					adaptor.addChild(root_0, string_literal267_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:12: ( memberAccessOrArrayAccess )+
					int cnt82=0;
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:496:12: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2586);
							memberAccessOrArrayAccess268=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess268.getTree());

							}
							break;

						default :
							if ( cnt82 >= 1 ) break loop82;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(82, input);
								throw eee;
						}
						cnt82++;
					} while (true);

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:4: VariableId ( memberAccessOrArrayAccess )+
					{
					root_0 = (Object)adaptor.nil();


					VariableId269=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2592); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId269_tree = 
					(Object)adaptor.create(VariableId269)
					;
					adaptor.addChild(root_0, VariableId269_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:15: ( memberAccessOrArrayAccess )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:497:15: memberAccessOrArrayAccess
							{
							pushFollow(FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2594);
							memberAccessOrArrayAccess270=memberAccessOrArrayAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess270.getTree());

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
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:498:4: '$this'
					{
					root_0 = (Object)adaptor.nil();


					string_literal271=(Token)match(input,This,FOLLOW_This_in_variableMemberStaticMember2600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal271_tree = 
					(Object)adaptor.create(string_literal271)
					;
					adaptor.addChild(root_0, string_literal271_tree);
					}

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:499:4: VariableId
					{
					root_0 = (Object)adaptor.nil();


					VariableId272=(Token)match(input,VariableId,FOLLOW_VariableId_in_variableMemberStaticMember2605); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId272_tree = 
					(Object)adaptor.create(VariableId272)
					;
					adaptor.addChild(root_0, VariableId272_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, variableMemberStaticMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableMemberStaticMember"


	public static class staticAccessOrParent_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "staticAccessOrParent"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:502:1: staticAccessOrParent : ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' );
	public final TSPHPParser.staticAccessOrParent_return staticAccessOrParent() throws RecognitionException {
		TSPHPParser.staticAccessOrParent_return retval = new TSPHPParser.staticAccessOrParent_return();
		retval.start = input.LT(1);
		int staticAccessOrParent_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal273=null;
		Token string_literal274=null;
		Token string_literal276=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject275 =null;

		Object string_literal273_tree=null;
		Object string_literal274_tree=null;
		Object string_literal276_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:2: ( 'self::' | 'parent::' | classInterfaceTypeWithoutObject '::' )
			int alt85=3;
			switch ( input.LA(1) ) {
			case Self:
				{
				alt85=1;
				}
				break;
			case Parent:
				{
				alt85=2;
				}
				break;
			case Backslash:
			case Identifier:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:503:4: 'self::'
					{
					root_0 = (Object)adaptor.nil();


					string_literal273=(Token)match(input,Self,FOLLOW_Self_in_staticAccessOrParent2616); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal273_tree = 
					(Object)adaptor.create(string_literal273)
					;
					adaptor.addChild(root_0, string_literal273_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:504:4: 'parent::'
					{
					root_0 = (Object)adaptor.nil();


					string_literal274=(Token)match(input,Parent,FOLLOW_Parent_in_staticAccessOrParent2621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal274_tree = 
					(Object)adaptor.create(string_literal274)
					;
					adaptor.addChild(root_0, string_literal274_tree);
					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:505:4: classInterfaceTypeWithoutObject '::'
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2626);
					classInterfaceTypeWithoutObject275=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject275.getTree());

					string_literal276=(Token)match(input,DoubleColon,FOLLOW_DoubleColon_in_staticAccessOrParent2627); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal276_tree = 
					(Object)adaptor.create(string_literal276)
					;
					adaptor.addChild(root_0, string_literal276_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, staticAccessOrParent_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticAccessOrParent"


	public static class memberAccessOrArrayAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccessOrArrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:508:1: memberAccessOrArrayAccess : ( memberAccess | arrayAccess );
	public final TSPHPParser.memberAccessOrArrayAccess_return memberAccessOrArrayAccess() throws RecognitionException {
		TSPHPParser.memberAccessOrArrayAccess_return retval = new TSPHPParser.memberAccessOrArrayAccess_return();
		retval.start = input.LT(1);
		int memberAccessOrArrayAccess_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope memberAccess277 =null;
		ParserRuleReturnScope arrayAccess278 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:2: ( memberAccess | arrayAccess )
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==ObjectOperator) ) {
				alt86=1;
			}
			else if ( (LA86_0==LeftSquareBrace) ) {
				alt86=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:509:4: memberAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_memberAccessOrArrayAccess2638);
					memberAccess277=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess277.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:510:4: arrayAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2643);
					arrayAccess278=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess278.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, memberAccessOrArrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccessOrArrayAccess"


	public static class memberAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:512:1: memberAccess : '->' Identifier ;
	public final TSPHPParser.memberAccess_return memberAccess() throws RecognitionException {
		TSPHPParser.memberAccess_return retval = new TSPHPParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal279=null;
		Token Identifier280=null;

		Object string_literal279_tree=null;
		Object Identifier280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:2: ( '->' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:513:4: '->' Identifier
			{
			root_0 = (Object)adaptor.nil();


			string_literal279=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_memberAccess2653); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal279_tree = 
			(Object)adaptor.create(string_literal279)
			;
			adaptor.addChild(root_0, string_literal279_tree);
			}

			Identifier280=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberAccess2655); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier280_tree = 
			(Object)adaptor.create(Identifier280)
			;
			adaptor.addChild(root_0, Identifier280_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class arrayAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:515:1: arrayAccess : '[' expression ']' ;
	public final TSPHPParser.arrayAccess_return arrayAccess() throws RecognitionException {
		TSPHPParser.arrayAccess_return retval = new TSPHPParser.arrayAccess_return();
		retval.start = input.LT(1);
		int arrayAccess_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal281=null;
		Token char_literal283=null;
		ParserRuleReturnScope expression282 =null;

		Object char_literal281_tree=null;
		Object char_literal283_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:2: ( '[' expression ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:516:4: '[' expression ']'
			{
			root_0 = (Object)adaptor.nil();


			char_literal281=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_arrayAccess2665); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal281_tree = 
			(Object)adaptor.create(char_literal281)
			;
			adaptor.addChild(root_0, char_literal281_tree);
			}

			pushFollow(FOLLOW_expression_in_arrayAccess2667);
			expression282=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression282.getTree());

			char_literal283=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_arrayAccess2669); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal283_tree = 
			(Object)adaptor.create(char_literal283)
			;
			adaptor.addChild(root_0, char_literal283_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, arrayAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class newObject_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "newObject"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:520:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );
	public final TSPHPParser.newObject_return newObject() throws RecognitionException {
		TSPHPParser.newObject_return retval = new TSPHPParser.newObject_return();
		retval.start = input.LT(1);
		int newObject_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal284=null;
		Token string_literal286=null;
		Token char_literal288=null;
		Token char_literal290=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject285 =null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject287 =null;
		ParserRuleReturnScope expressionList289 =null;

		Object string_literal284_tree=null;
		Object string_literal286_tree=null;
		Object char_literal288_tree=null;
		Object char_literal290_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:2: ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			int alt88=2;
			alt88 = dfa88.predict(input);
			switch (alt88) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:521:4: 'new' classInterfaceTypeWithoutObject
					{
					root_0 = (Object)adaptor.nil();


					string_literal284=(Token)match(input,New,FOLLOW_New_in_newObject2682); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal284_tree = 
					(Object)adaptor.create(string_literal284)
					;
					adaptor.addChild(root_0, string_literal284_tree);
					}

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2684);
					classInterfaceTypeWithoutObject285=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject285.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:4: 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal286=(Token)match(input,New,FOLLOW_New_in_newObject2689); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal286_tree = 
					(Object)adaptor.create(string_literal286)
					;
					adaptor.addChild(root_0, string_literal286_tree);
					}

					pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_newObject2691);
					classInterfaceTypeWithoutObject287=classInterfaceTypeWithoutObject();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject287.getTree());

					char_literal288=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_newObject2693); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = 
					(Object)adaptor.create(char_literal288)
					;
					adaptor.addChild(root_0, char_literal288_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:46: ( expressionList )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==At||LA87_0==Backslash||LA87_0==BitwiseNot||LA87_0==Bool||LA87_0==Clone||LA87_0==Float||LA87_0==Identifier||LA87_0==Int||(LA87_0 >= LeftParanthesis && LA87_0 <= LeftSquareBrace)||LA87_0==LogicNot||LA87_0==Minus||LA87_0==MinusMinus||LA87_0==NULL||LA87_0==New||LA87_0==Null||(LA87_0 >= Parent && LA87_0 <= Plus)||LA87_0==PlusPlus||LA87_0==Self||LA87_0==String||LA87_0==This||LA87_0==TypeArray||LA87_0==VariableId) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:522:46: expressionList
							{
							pushFollow(FOLLOW_expressionList_in_newObject2695);
							expressionList289=expressionList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList289.getTree());

							}
							break;

					}

					char_literal290=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_newObject2698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = 
					(Object)adaptor.create(char_literal290)
					;
					adaptor.addChild(root_0, char_literal290_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, newObject_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newObject"


	public static class unaryPrimary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:524:1: unaryPrimary : ( '+' primary | '-' primary | primary );
	public final TSPHPParser.unaryPrimary_return unaryPrimary() throws RecognitionException {
		TSPHPParser.unaryPrimary_return retval = new TSPHPParser.unaryPrimary_return();
		retval.start = input.LT(1);
		int unaryPrimary_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal291=null;
		Token char_literal293=null;
		ParserRuleReturnScope primary292 =null;
		ParserRuleReturnScope primary294 =null;
		ParserRuleReturnScope primary295 =null;

		Object char_literal291_tree=null;
		Object char_literal293_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:2: ( '+' primary | '-' primary | primary )
			int alt89=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt89=1;
				}
				break;
			case Minus:
				{
				alt89=2;
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
			case NULL:
			case Null:
			case Parent:
			case PlusPlus:
			case Self:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt89=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:525:4: '+' primary
					{
					root_0 = (Object)adaptor.nil();


					char_literal291=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimary2707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal291_tree = 
					(Object)adaptor.create(char_literal291)
					;
					adaptor.addChild(root_0, char_literal291_tree);
					}

					pushFollow(FOLLOW_primary_in_unaryPrimary2709);
					primary292=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary292.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:526:4: '-' primary
					{
					root_0 = (Object)adaptor.nil();


					char_literal293=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimary2714); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal293_tree = 
					(Object)adaptor.create(char_literal293)
					;
					adaptor.addChild(root_0, char_literal293_tree);
					}

					pushFollow(FOLLOW_primary_in_unaryPrimary2716);
					primary294=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary294.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:527:4: primary
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unaryPrimary2721);
					primary295=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary295.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, unaryPrimary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimary"


	public static class primary_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:529:1: primary : ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom );
	public final TSPHPParser.primary_return primary() throws RecognitionException {
		TSPHPParser.primary_return retval = new TSPHPParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCallFluentInclAccessAtTheEnd296 =null;
		ParserRuleReturnScope methodCallFluentInclAccessAtTheEnd297 =null;
		ParserRuleReturnScope atom298 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:2: ( functionCallFluentInclAccessAtTheEnd | methodCallFluentInclAccessAtTheEnd | atom )
			int alt90=3;
			switch ( input.LA(1) ) {
			case Backslash:
				{
				int LA90_1 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt90=1;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA90_2 = input.LA(2);
				if ( (synpred151_TSPHP()) ) {
					alt90=1;
				}
				else if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Self:
				{
				int LA90_3 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA90_4 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA90_5 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA90_6 = input.LA(2);
				if ( (synpred152_TSPHP()) ) {
					alt90=2;
				}
				else if ( (true) ) {
					alt90=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 6, input);
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
			case NULL:
			case Null:
			case PlusPlus:
			case String:
			case TypeArray:
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: functionCallFluentInclAccessAtTheEnd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2731);
					functionCallFluentInclAccessAtTheEnd296=functionCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentInclAccessAtTheEnd296.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: methodCallFluentInclAccessAtTheEnd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2736);
					methodCallFluentInclAccessAtTheEnd297=methodCallFluentInclAccessAtTheEnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentInclAccessAtTheEnd297.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:532:4: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary2741);
					atom298=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom298.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class functionCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:535:1: functionCallFluentInclAccessAtTheEnd : functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.functionCallFluentInclAccessAtTheEnd_return functionCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCallFluentWithoutAccessAtTheEnd299 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess300 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:2: ( functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:4: functionCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2753);
			functionCallFluentWithoutAccessAtTheEnd299=functionCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallFluentWithoutAccessAtTheEnd299.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:44: ( memberAccessOrArrayAccess )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==LeftSquareBrace||LA91_0==ObjectOperator) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:536:44: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2755);
					memberAccessOrArrayAccess300=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess300.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, functionCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentInclAccessAtTheEnd"


	public static class functionCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:539:1: functionCallFluentWithoutAccessAtTheEnd : ( functionCall ( callOrAccess )* call | functionCall ( call )* );
	public final TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return functionCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.functionCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int functionCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope functionCall301 =null;
		ParserRuleReturnScope callOrAccess302 =null;
		ParserRuleReturnScope call303 =null;
		ParserRuleReturnScope functionCall304 =null;
		ParserRuleReturnScope call305 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:2: ( functionCall ( callOrAccess )* call | functionCall ( call )* )
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==Backslash) ) {
				int LA94_1 = input.LA(2);
				if ( (synpred155_TSPHP()) ) {
					alt94=1;
				}
				else if ( (true) ) {
					alt94=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA94_0==Identifier) ) {
				int LA94_2 = input.LA(2);
				if ( (synpred155_TSPHP()) ) {
					alt94=1;
				}
				else if ( (true) ) {
					alt94=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: functionCall ( callOrAccess )* call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2767);
					functionCall301=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall301.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: ( callOrAccess )*
					loop92:
					do {
						int alt92=2;
						int LA92_0 = input.LA(1);
						if ( (LA92_0==ObjectOperator) ) {
							int LA92_1 = input.LA(2);
							if ( (synpred154_TSPHP()) ) {
								alt92=1;
							}

						}
						else if ( (LA92_0==LeftSquareBrace) ) {
							alt92=1;
						}

						switch (alt92) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2769);
							callOrAccess302=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess302.getTree());

							}
							break;

						default :
							break loop92;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2772);
					call303=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call303.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:4: functionCall ( call )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2777);
					functionCall304=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall304.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:17: ( call )*
					loop93:
					do {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==ObjectOperator) ) {
							int LA93_2 = input.LA(2);
							if ( (LA93_2==Identifier) ) {
								int LA93_3 = input.LA(3);
								if ( (LA93_3==LeftParanthesis) ) {
									alt93=1;
								}

							}

						}

						switch (alt93) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:541:17: call
							{
							pushFollow(FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2779);
							call305=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call305.getTree());

							}
							break;

						default :
							break loop93;
						}
					} while (true);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, functionCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCallFluentWithoutAccessAtTheEnd"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:544:1: functionCall : classInterfaceTypeWithoutObject '(' ( expressionList )? ')' ;
	public final TSPHPParser.functionCall_return functionCall() throws RecognitionException {
		TSPHPParser.functionCall_return retval = new TSPHPParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal307=null;
		Token char_literal309=null;
		ParserRuleReturnScope classInterfaceTypeWithoutObject306 =null;
		ParserRuleReturnScope expressionList308 =null;

		Object char_literal307_tree=null;
		Object char_literal309_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:2: ( classInterfaceTypeWithoutObject '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:4: classInterfaceTypeWithoutObject '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2791);
			classInterfaceTypeWithoutObject306=classInterfaceTypeWithoutObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeWithoutObject306.getTree());

			char_literal307=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_functionCall2793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal307_tree = 
			(Object)adaptor.create(char_literal307)
			;
			adaptor.addChild(root_0, char_literal307_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:40: ( expressionList )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==At||LA95_0==Backslash||LA95_0==BitwiseNot||LA95_0==Bool||LA95_0==Clone||LA95_0==Float||LA95_0==Identifier||LA95_0==Int||(LA95_0 >= LeftParanthesis && LA95_0 <= LeftSquareBrace)||LA95_0==LogicNot||LA95_0==Minus||LA95_0==MinusMinus||LA95_0==NULL||LA95_0==New||LA95_0==Null||(LA95_0 >= Parent && LA95_0 <= Plus)||LA95_0==PlusPlus||LA95_0==Self||LA95_0==String||LA95_0==This||LA95_0==TypeArray||LA95_0==VariableId) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:545:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_functionCall2795);
					expressionList308=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList308.getTree());

					}
					break;

			}

			char_literal309=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_functionCall2798); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal309_tree = 
			(Object)adaptor.create(char_literal309)
			;
			adaptor.addChild(root_0, char_literal309_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class callOrAccess_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "callOrAccess"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:548:1: callOrAccess : ( memberAccessOrArrayAccess | call );
	public final TSPHPParser.callOrAccess_return callOrAccess() throws RecognitionException {
		TSPHPParser.callOrAccess_return retval = new TSPHPParser.callOrAccess_return();
		retval.start = input.LT(1);
		int callOrAccess_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope memberAccessOrArrayAccess310 =null;
		ParserRuleReturnScope call311 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:2: ( memberAccessOrArrayAccess | call )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==ObjectOperator) ) {
				int LA96_1 = input.LA(2);
				if ( (LA96_1==Identifier) ) {
					int LA96_3 = input.LA(3);
					if ( (LA96_3==LeftParanthesis) ) {
						alt96=2;
					}
					else if ( (LA96_3==EOF||LA96_3==LeftSquareBrace||LA96_3==ObjectOperator) ) {
						alt96=1;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 96, 3, input);
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
							new NoViableAltException("", 96, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA96_0==LeftSquareBrace) ) {
				alt96=1;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:549:4: memberAccessOrArrayAccess
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2809);
					memberAccessOrArrayAccess310=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess310.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:550:4: call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_call_in_callOrAccess2814);
					call311=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call311.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, callOrAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callOrAccess"


	public static class call_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "call"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:1: call : ( '->' Identifier '(' ( expressionList )? ')' ) ;
	public final TSPHPParser.call_return call() throws RecognitionException {
		TSPHPParser.call_return retval = new TSPHPParser.call_return();
		retval.start = input.LT(1);
		int call_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal312=null;
		Token Identifier313=null;
		Token char_literal314=null;
		Token char_literal316=null;
		ParserRuleReturnScope expressionList315 =null;

		Object string_literal312_tree=null;
		Object Identifier313_tree=null;
		Object char_literal314_tree=null;
		Object char_literal316_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:6: ( ( '->' Identifier '(' ( expressionList )? ')' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:8: ( '->' Identifier '(' ( expressionList )? ')' )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:8: ( '->' Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:9: '->' Identifier '(' ( expressionList )? ')'
			{
			string_literal312=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_call2827); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal312_tree = 
			(Object)adaptor.create(string_literal312)
			;
			adaptor.addChild(root_0, string_literal312_tree);
			}

			Identifier313=(Token)match(input,Identifier,FOLLOW_Identifier_in_call2829); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier313_tree = 
			(Object)adaptor.create(Identifier313)
			;
			adaptor.addChild(root_0, Identifier313_tree);
			}

			char_literal314=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_call2831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal314_tree = 
			(Object)adaptor.create(char_literal314)
			;
			adaptor.addChild(root_0, char_literal314_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:29: ( expressionList )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==At||LA97_0==Backslash||LA97_0==BitwiseNot||LA97_0==Bool||LA97_0==Clone||LA97_0==Float||LA97_0==Identifier||LA97_0==Int||(LA97_0 >= LeftParanthesis && LA97_0 <= LeftSquareBrace)||LA97_0==LogicNot||LA97_0==Minus||LA97_0==MinusMinus||LA97_0==NULL||LA97_0==New||LA97_0==Null||(LA97_0 >= Parent && LA97_0 <= Plus)||LA97_0==PlusPlus||LA97_0==Self||LA97_0==String||LA97_0==This||LA97_0==TypeArray||LA97_0==VariableId) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:553:29: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_call2833);
					expressionList315=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList315.getTree());

					}
					break;

			}

			char_literal316=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_call2835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal316_tree = 
			(Object)adaptor.create(char_literal316)
			;
			adaptor.addChild(root_0, char_literal316_tree);
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, call_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "call"


	public static class methodCallFluentInclAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentInclAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:555:1: methodCallFluentInclAccessAtTheEnd : methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? ;
	public final TSPHPParser.methodCallFluentInclAccessAtTheEnd_return methodCallFluentInclAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentInclAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentInclAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentInclAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope methodCallFluentWithoutAccessAtTheEnd317 =null;
		ParserRuleReturnScope memberAccessOrArrayAccess318 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:2: ( methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:4: methodCallFluentWithoutAccessAtTheEnd ( memberAccessOrArrayAccess )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2846);
			methodCallFluentWithoutAccessAtTheEnd317=methodCallFluentWithoutAccessAtTheEnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallFluentWithoutAccessAtTheEnd317.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:42: ( memberAccessOrArrayAccess )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LeftSquareBrace||LA98_0==ObjectOperator) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:556:42: memberAccessOrArrayAccess
					{
					pushFollow(FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2848);
					memberAccessOrArrayAccess318=memberAccessOrArrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccessOrArrayAccess318.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, methodCallFluentInclAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentInclAccessAtTheEnd"


	public static class methodCallFluentWithoutAccessAtTheEnd_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCallFluentWithoutAccessAtTheEnd"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:559:1: methodCallFluentWithoutAccessAtTheEnd : ( methodCall ( callOrAccess )* call | methodCall ( call )* );
	public final TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return methodCallFluentWithoutAccessAtTheEnd() throws RecognitionException {
		TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return retval = new TSPHPParser.methodCallFluentWithoutAccessAtTheEnd_return();
		retval.start = input.LT(1);
		int methodCallFluentWithoutAccessAtTheEnd_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope methodCall319 =null;
		ParserRuleReturnScope callOrAccess320 =null;
		ParserRuleReturnScope call321 =null;
		ParserRuleReturnScope methodCall322 =null;
		ParserRuleReturnScope call323 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:2: ( methodCall ( callOrAccess )* call | methodCall ( call )* )
			int alt101=2;
			switch ( input.LA(1) ) {
			case Self:
				{
				int LA101_1 = input.LA(2);
				if ( (synpred162_TSPHP()) ) {
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
				if ( (synpred162_TSPHP()) ) {
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
				if ( (synpred162_TSPHP()) ) {
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
				if ( (synpred162_TSPHP()) ) {
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
				if ( (synpred162_TSPHP()) ) {
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
				if ( (synpred162_TSPHP()) ) {
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:5: methodCall ( callOrAccess )* call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2862);
					methodCall319=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall319.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: ( callOrAccess )*
					loop99:
					do {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==ObjectOperator) ) {
							int LA99_1 = input.LA(2);
							if ( (synpred161_TSPHP()) ) {
								alt99=1;
							}

						}
						else if ( (LA99_0==LeftSquareBrace) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: callOrAccess
							{
							pushFollow(FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2864);
							callOrAccess320=callOrAccess();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, callOrAccess320.getTree());

							}
							break;

						default :
							break loop99;
						}
					} while (true);

					pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2867);
					call321=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, call321.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:4: methodCall ( call )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2872);
					methodCall322=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall322.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:15: ( call )*
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:561:15: call
							{
							pushFollow(FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2874);
							call323=call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, call323.getTree());

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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, methodCallFluentWithoutAccessAtTheEnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCallFluentWithoutAccessAtTheEnd"


	public static class methodCall_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:563:1: methodCall : ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' ;
	public final TSPHPParser.methodCall_return methodCall() throws RecognitionException {
		TSPHPParser.methodCall_return retval = new TSPHPParser.methodCall_return();
		retval.start = input.LT(1);
		int methodCall_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal325=null;
		Token Identifier327=null;
		Token char_literal328=null;
		Token char_literal330=null;
		ParserRuleReturnScope variableMemberStaticMember324 =null;
		ParserRuleReturnScope staticAccessOrParent326 =null;
		ParserRuleReturnScope expressionList329 =null;

		Object string_literal325_tree=null;
		Object Identifier327_tree=null;
		Object char_literal328_tree=null;
		Object char_literal330_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:2: ( ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent ) Identifier '(' ( expressionList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )
			int alt102=2;
			alt102 = dfa102.predict(input);
			switch (alt102) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:6: ( variableMemberStaticMember '->' )
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:6: ( variableMemberStaticMember '->' )
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:7: variableMemberStaticMember '->'
					{
					pushFollow(FOLLOW_variableMemberStaticMember_in_methodCall2888);
					variableMemberStaticMember324=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember324.getTree());

					string_literal325=(Token)match(input,ObjectOperator,FOLLOW_ObjectOperator_in_methodCall2890); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal325_tree = 
					(Object)adaptor.create(string_literal325)
					;
					adaptor.addChild(root_0, string_literal325_tree);
					}

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:42: staticAccessOrParent
					{
					pushFollow(FOLLOW_staticAccessOrParent_in_methodCall2895);
					staticAccessOrParent326=staticAccessOrParent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent326.getTree());

					}
					break;

			}

			Identifier327=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodCall2898); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier327_tree = 
			(Object)adaptor.create(Identifier327)
			;
			adaptor.addChild(root_0, Identifier327_tree);
			}

			char_literal328=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_methodCall2900); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal328_tree = 
			(Object)adaptor.create(char_literal328)
			;
			adaptor.addChild(root_0, char_literal328_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:79: ( expressionList )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==At||LA103_0==Backslash||LA103_0==BitwiseNot||LA103_0==Bool||LA103_0==Clone||LA103_0==Float||LA103_0==Identifier||LA103_0==Int||(LA103_0 >= LeftParanthesis && LA103_0 <= LeftSquareBrace)||LA103_0==LogicNot||LA103_0==Minus||LA103_0==MinusMinus||LA103_0==NULL||LA103_0==New||LA103_0==Null||(LA103_0 >= Parent && LA103_0 <= Plus)||LA103_0==PlusPlus||LA103_0==Self||LA103_0==String||LA103_0==This||LA103_0==TypeArray||LA103_0==VariableId) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:564:79: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_methodCall2902);
					expressionList329=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList329.getTree());

					}
					break;

			}

			char_literal330=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_methodCall2904); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal330_tree = 
			(Object)adaptor.create(char_literal330)
			;
			adaptor.addChild(root_0, char_literal330_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, methodCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:1: atom : ( '(' expression ')' | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom );
	public final TSPHPParser.atom_return atom() throws RecognitionException {
		TSPHPParser.atom_return retval = new TSPHPParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal331=null;
		Token char_literal333=null;
		ParserRuleReturnScope expression332 =null;
		ParserRuleReturnScope incrementDecrement334 =null;
		ParserRuleReturnScope variableMemberStaticMember335 =null;
		ParserRuleReturnScope classConstant336 =null;
		ParserRuleReturnScope globalConstant337 =null;
		ParserRuleReturnScope array338 =null;
		ParserRuleReturnScope primitiveAtom339 =null;

		Object char_literal331_tree=null;
		Object char_literal333_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:6: ( '(' expression ')' | incrementDecrement | variableMemberStaticMember | classConstant | globalConstant | array | primitiveAtom )
			int alt104=7;
			switch ( input.LA(1) ) {
			case LeftParanthesis:
				{
				alt104=1;
				}
				break;
			case Self:
				{
				int LA104_2 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt104=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Parent:
				{
				int LA104_3 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt104=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Backslash:
				{
				int LA104_4 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt104=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Identifier:
				{
				int LA104_5 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else if ( (synpred169_TSPHP()) ) {
					alt104=4;
				}
				else if ( (synpred170_TSPHP()) ) {
					alt104=5;
				}
				else if ( (true) ) {
					alt104=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case This:
				{
				int LA104_6 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case VariableId:
				{
				int LA104_7 = input.LA(2);
				if ( (synpred167_TSPHP()) ) {
					alt104=2;
				}
				else if ( (synpred168_TSPHP()) ) {
					alt104=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 7, input);
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
				alt104=2;
				}
				break;
			case LeftSquareBrace:
			case TypeArray:
				{
				alt104=6;
				}
				break;
			case Bool:
			case Float:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt104=7;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:567:8: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal331=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_atom2914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal331_tree = 
					(Object)adaptor.create(char_literal331)
					;
					adaptor.addChild(root_0, char_literal331_tree);
					}

					pushFollow(FOLLOW_expression_in_atom2916);
					expression332=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression332.getTree());

					char_literal333=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_atom2918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal333_tree = 
					(Object)adaptor.create(char_literal333)
					;
					adaptor.addChild(root_0, char_literal333_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: incrementDecrement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementDecrement_in_atom2923);
					incrementDecrement334=incrementDecrement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, incrementDecrement334.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: variableMemberStaticMember
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variableMemberStaticMember_in_atom2928);
					variableMemberStaticMember335=variableMemberStaticMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableMemberStaticMember335.getTree());

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: classConstant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_classConstant_in_atom2933);
					classConstant336=classConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classConstant336.getTree());

					}
					break;
				case 5 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: globalConstant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_globalConstant_in_atom2938);
					globalConstant337=globalConstant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, globalConstant337.getTree());

					}
					break;
				case 6 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:572:4: array
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_in_atom2943);
					array338=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array338.getTree());

					}
					break;
				case 7 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:573:4: primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_atom2948);
					primitiveAtom339=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom339.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class globalConstant_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "globalConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:576:1: globalConstant : Identifier ;
	public final TSPHPParser.globalConstant_return globalConstant() throws RecognitionException {
		TSPHPParser.globalConstant_return retval = new TSPHPParser.globalConstant_return();
		retval.start = input.LT(1);
		int globalConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier340=null;

		Object Identifier340_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:2: ( Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:577:4: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier340=(Token)match(input,Identifier,FOLLOW_Identifier_in_globalConstant2960); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier340_tree = 
			(Object)adaptor.create(Identifier340)
			;
			adaptor.addChild(root_0, Identifier340_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, globalConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "globalConstant"


	public static class classConstant_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classConstant"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:580:1: classConstant : staticAccessOrParent Identifier ;
	public final TSPHPParser.classConstant_return classConstant() throws RecognitionException {
		TSPHPParser.classConstant_return retval = new TSPHPParser.classConstant_return();
		retval.start = input.LT(1);
		int classConstant_StartIndex = input.index();

		Object root_0 = null;

		Token Identifier342=null;
		ParserRuleReturnScope staticAccessOrParent341 =null;

		Object Identifier342_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:2: ( staticAccessOrParent Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:581:4: staticAccessOrParent Identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_staticAccessOrParent_in_classConstant2971);
			staticAccessOrParent341=staticAccessOrParent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, staticAccessOrParent341.getTree());

			Identifier342=(Token)match(input,Identifier,FOLLOW_Identifier_in_classConstant2973); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier342_tree = 
			(Object)adaptor.create(Identifier342)
			;
			adaptor.addChild(root_0, Identifier342_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, classConstant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classConstant"


	public static class unaryPrimitiveAtom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:584:1: unaryPrimitiveAtom : ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom );
	public final TSPHPParser.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		TSPHPParser.unaryPrimitiveAtom_return retval = new TSPHPParser.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);
		int unaryPrimitiveAtom_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal343=null;
		Token char_literal345=null;
		ParserRuleReturnScope primitiveAtom344 =null;
		ParserRuleReturnScope primitiveAtom346 =null;
		ParserRuleReturnScope primitiveAtom347 =null;

		Object char_literal343_tree=null;
		Object char_literal345_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:2: ( '+' primitiveAtom | '-' primitiveAtom | primitiveAtom )
			int alt105=3;
			switch ( input.LA(1) ) {
			case Plus:
				{
				alt105=1;
				}
				break;
			case Minus:
				{
				alt105=2;
				}
				break;
			case Bool:
			case Float:
			case Identifier:
			case Int:
			case NULL:
			case Null:
			case String:
				{
				alt105=3;
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
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:585:4: '+' primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					char_literal343=(Token)match(input,Plus,FOLLOW_Plus_in_unaryPrimitiveAtom2985); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal343_tree = 
					(Object)adaptor.create(char_literal343)
					;
					adaptor.addChild(root_0, char_literal343_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2987);
					primitiveAtom344=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom344.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:586:4: '-' primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					char_literal345=(Token)match(input,Minus,FOLLOW_Minus_in_unaryPrimitiveAtom2992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal345_tree = 
					(Object)adaptor.create(char_literal345)
					;
					adaptor.addChild(root_0, char_literal345_tree);
					}

					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2994);
					primitiveAtom346=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom346.getTree());

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:587:4: primitiveAtom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2999);
					primitiveAtom347=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveAtom347.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, unaryPrimitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryPrimitiveAtom"


	public static class primitiveAtom_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:590:1: primitiveAtom : ( Bool | Int | Float | String | Null | NULL | Identifier );
	public final TSPHPParser.primitiveAtom_return primitiveAtom() throws RecognitionException {
		TSPHPParser.primitiveAtom_return retval = new TSPHPParser.primitiveAtom_return();
		retval.start = input.LT(1);
		int primitiveAtom_StartIndex = input.index();

		Object root_0 = null;

		Token set348=null;

		Object set348_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:591:2: ( Bool | Int | Float | String | Null | NULL | Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
			{
			root_0 = (Object)adaptor.nil();


			set348=(Token)input.LT(1);
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Identifier||input.LA(1)==Int||input.LA(1)==NULL||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, 
				(Object)adaptor.create(set348)
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, primitiveAtom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primitiveAtom"


	public static class array_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:1: array : ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' );
	public final TSPHPParser.array_return array() throws RecognitionException {
		TSPHPParser.array_return retval = new TSPHPParser.array_return();
		retval.start = input.LT(1);
		int array_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal349=null;
		Token char_literal351=null;
		Token TypeArray352=null;
		Token char_literal353=null;
		Token char_literal355=null;
		ParserRuleReturnScope array_content350 =null;
		ParserRuleReturnScope array_content354 =null;

		Object char_literal349_tree=null;
		Object char_literal351_tree=null;
		Object TypeArray352_tree=null;
		Object char_literal353_tree=null;
		Object char_literal355_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:7: ( '[' ( array_content )? ']' | TypeArray '(' ( array_content )? ')' )
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==LeftSquareBrace) ) {
				alt108=1;
			}
			else if ( (LA108_0==TypeArray) ) {
				alt108=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:9: '[' ( array_content )? ']'
					{
					root_0 = (Object)adaptor.nil();


					char_literal349=(Token)match(input,LeftSquareBrace,FOLLOW_LeftSquareBrace_in_array3502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal349_tree = 
					(Object)adaptor.create(char_literal349)
					;
					adaptor.addChild(root_0, char_literal349_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:13: ( array_content )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==At||LA106_0==Backslash||LA106_0==BitwiseNot||LA106_0==Bool||LA106_0==Clone||LA106_0==Float||LA106_0==Identifier||LA106_0==Int||(LA106_0 >= LeftParanthesis && LA106_0 <= LeftSquareBrace)||LA106_0==LogicNot||LA106_0==Minus||LA106_0==MinusMinus||LA106_0==NULL||LA106_0==New||LA106_0==Null||(LA106_0 >= Parent && LA106_0 <= Plus)||LA106_0==PlusPlus||LA106_0==Self||LA106_0==String||LA106_0==This||LA106_0==TypeArray||LA106_0==VariableId) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:654:13: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3504);
							array_content350=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content350.getTree());

							}
							break;

					}

					char_literal351=(Token)match(input,RightSquareBrace,FOLLOW_RightSquareBrace_in_array3507); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal351_tree = 
					(Object)adaptor.create(char_literal351)
					;
					adaptor.addChild(root_0, char_literal351_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:4: TypeArray '(' ( array_content )? ')'
					{
					root_0 = (Object)adaptor.nil();


					TypeArray352=(Token)match(input,TypeArray,FOLLOW_TypeArray_in_array3513); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TypeArray352_tree = 
					(Object)adaptor.create(TypeArray352)
					;
					adaptor.addChild(root_0, TypeArray352_tree);
					}

					char_literal353=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_array3515); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal353_tree = 
					(Object)adaptor.create(char_literal353)
					;
					adaptor.addChild(root_0, char_literal353_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:18: ( array_content )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==At||LA107_0==Backslash||LA107_0==BitwiseNot||LA107_0==Bool||LA107_0==Clone||LA107_0==Float||LA107_0==Identifier||LA107_0==Int||(LA107_0 >= LeftParanthesis && LA107_0 <= LeftSquareBrace)||LA107_0==LogicNot||LA107_0==Minus||LA107_0==MinusMinus||LA107_0==NULL||LA107_0==New||LA107_0==Null||(LA107_0 >= Parent && LA107_0 <= Plus)||LA107_0==PlusPlus||LA107_0==Self||LA107_0==String||LA107_0==This||LA107_0==TypeArray||LA107_0==VariableId) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:655:18: array_content
							{
							pushFollow(FOLLOW_array_content_in_array3517);
							array_content354=array_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_content354.getTree());

							}
							break;

					}

					char_literal355=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_array3520); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal355_tree = 
					(Object)adaptor.create(char_literal355)
					;
					adaptor.addChild(root_0, char_literal355_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, array_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array"


	public static class array_content_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_content"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:658:1: array_content : ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* ;
	public final TSPHPParser.array_content_return array_content() throws RecognitionException {
		TSPHPParser.array_content_return retval = new TSPHPParser.array_content_return();
		retval.start = input.LT(1);
		int array_content_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal357=null;
		Token char_literal359=null;
		Token string_literal361=null;
		ParserRuleReturnScope expression356 =null;
		ParserRuleReturnScope expression358 =null;
		ParserRuleReturnScope expression360 =null;
		ParserRuleReturnScope expression362 =null;

		Object string_literal357_tree=null;
		Object char_literal359_tree=null;
		Object string_literal361_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:2: ( ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:4: ( expression '=>' )? expression ( ',' ( expression '=>' )? expression )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:4: ( expression '=>' )?
			int alt109=2;
			switch ( input.LA(1) ) {
				case LogicNot:
					{
					int LA109_1 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case LeftParanthesis:
					{
					int LA109_2 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case BitwiseNot:
					{
					int LA109_3 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case At:
					{
					int LA109_4 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Clone:
					{
					int LA109_5 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case New:
					{
					int LA109_6 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Plus:
					{
					int LA109_7 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Minus:
					{
					int LA109_8 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Backslash:
					{
					int LA109_9 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Identifier:
					{
					int LA109_10 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Self:
					{
					int LA109_11 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Parent:
					{
					int LA109_12 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case This:
					{
					int LA109_13 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case VariableId:
					{
					int LA109_14 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case MinusMinus:
				case PlusPlus:
					{
					int LA109_15 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case LeftSquareBrace:
					{
					int LA109_16 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case TypeArray:
					{
					int LA109_17 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
				case Bool:
				case Float:
				case Int:
				case NULL:
				case Null:
				case String:
					{
					int LA109_18 = input.LA(2);
					if ( (synpred183_TSPHP()) ) {
						alt109=1;
					}
					}
					break;
			}
			switch (alt109) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: expression '=>'
					{
					pushFollow(FOLLOW_expression_in_array_content3533);
					expression356=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression356.getTree());

					string_literal357=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal357_tree = 
					(Object)adaptor.create(string_literal357)
					;
					adaptor.addChild(root_0, string_literal357_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_array_content3539);
			expression358=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression358.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:35: ( ',' ( expression '=>' )? expression )*
			loop111:
			do {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==Comma) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:36: ',' ( expression '=>' )? expression
					{
					char_literal359=(Token)match(input,Comma,FOLLOW_Comma_in_array_content3543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal359_tree = 
					(Object)adaptor.create(char_literal359)
					;
					adaptor.addChild(root_0, char_literal359_tree);
					}

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:40: ( expression '=>' )?
					int alt110=2;
					switch ( input.LA(1) ) {
						case LogicNot:
							{
							int LA110_1 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case LeftParanthesis:
							{
							int LA110_2 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case BitwiseNot:
							{
							int LA110_3 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case At:
							{
							int LA110_4 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Clone:
							{
							int LA110_5 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case New:
							{
							int LA110_6 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Plus:
							{
							int LA110_7 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Minus:
							{
							int LA110_8 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Backslash:
							{
							int LA110_9 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Identifier:
							{
							int LA110_10 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Self:
							{
							int LA110_11 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Parent:
							{
							int LA110_12 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case This:
							{
							int LA110_13 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case VariableId:
							{
							int LA110_14 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case MinusMinus:
						case PlusPlus:
							{
							int LA110_15 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case LeftSquareBrace:
							{
							int LA110_16 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case TypeArray:
							{
							int LA110_17 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
						case Bool:
						case Float:
						case Int:
						case NULL:
						case Null:
						case String:
							{
							int LA110_18 = input.LA(2);
							if ( (synpred184_TSPHP()) ) {
								alt110=1;
							}
							}
							break;
					}
					switch (alt110) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:41: expression '=>'
							{
							pushFollow(FOLLOW_expression_in_array_content3546);
							expression360=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression360.getTree());

							string_literal361=(Token)match(input,Arrow,FOLLOW_Arrow_in_array_content3548); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal361_tree = 
							(Object)adaptor.create(string_literal361)
							;
							adaptor.addChild(root_0, string_literal361_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_array_content3552);
					expression362=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression362.getTree());

					}
					break;

				default :
					break loop111;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, array_content_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "array_content"


	public static class ifCondition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:662:1: ifCondition : 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? ;
	public final TSPHPParser.ifCondition_return ifCondition() throws RecognitionException {
		TSPHPParser.ifCondition_return retval = new TSPHPParser.ifCondition_return();
		retval.start = input.LT(1);
		int ifCondition_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal363=null;
		Token char_literal364=null;
		Token char_literal366=null;
		Token string_literal368=null;
		ParserRuleReturnScope expression365 =null;
		ParserRuleReturnScope instructionInclBreakContinue367 =null;
		ParserRuleReturnScope instructionInclBreakContinue369 =null;

		Object string_literal363_tree=null;
		Object char_literal364_tree=null;
		Object char_literal366_tree=null;
		Object string_literal368_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:663:2: ( 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )? )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:663:4: 'if' '(' expression ')' instructionInclBreakContinue ( 'else' instructionInclBreakContinue )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal363=(Token)match(input,If,FOLLOW_If_in_ifCondition3564); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal363_tree = 
			(Object)adaptor.create(string_literal363)
			;
			adaptor.addChild(root_0, string_literal363_tree);
			}

			char_literal364=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_ifCondition3566); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal364_tree = 
			(Object)adaptor.create(char_literal364)
			;
			adaptor.addChild(root_0, char_literal364_tree);
			}

			pushFollow(FOLLOW_expression_in_ifCondition3568);
			expression365=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression365.getTree());

			char_literal366=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_ifCondition3570); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal366_tree = 
			(Object)adaptor.create(char_literal366)
			;
			adaptor.addChild(root_0, char_literal366_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3572);
			instructionInclBreakContinue367=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue367.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:3: ( 'else' instructionInclBreakContinue )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==Else) ) {
				int LA112_1 = input.LA(2);
				if ( (synpred186_TSPHP()) ) {
					alt112=1;
				}
			}
			switch (alt112) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:5: 'else' instructionInclBreakContinue
					{
					string_literal368=(Token)match(input,Else,FOLLOW_Else_in_ifCondition3579); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal368_tree = 
					(Object)adaptor.create(string_literal368)
					;
					adaptor.addChild(root_0, string_literal368_tree);
					}

					pushFollow(FOLLOW_instructionInclBreakContinue_in_ifCondition3581);
					instructionInclBreakContinue369=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue369.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, ifCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifCondition"


	public static class switchCondition_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:668:1: switchCondition : 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' ;
	public final TSPHPParser.switchCondition_return switchCondition() throws RecognitionException {
		TSPHPParser.switchCondition_return retval = new TSPHPParser.switchCondition_return();
		retval.start = input.LT(1);
		int switchCondition_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal370=null;
		Token char_literal371=null;
		Token VariableId372=null;
		Token char_literal373=null;
		Token char_literal374=null;
		Token char_literal385=null;
		ParserRuleReturnScope caseLabel375 =null;
		ParserRuleReturnScope instructionInclBreakContinue376 =null;
		ParserRuleReturnScope defaultLabel377 =null;
		ParserRuleReturnScope instructionInclBreakContinue378 =null;
		ParserRuleReturnScope caseLabel379 =null;
		ParserRuleReturnScope instructionInclBreakContinue380 =null;
		ParserRuleReturnScope caseLabel381 =null;
		ParserRuleReturnScope instructionInclBreakContinue382 =null;
		ParserRuleReturnScope defaultLabel383 =null;
		ParserRuleReturnScope instructionInclBreakContinue384 =null;

		Object string_literal370_tree=null;
		Object char_literal371_tree=null;
		Object VariableId372_tree=null;
		Object char_literal373_tree=null;
		Object char_literal374_tree=null;
		Object char_literal385_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:669:2: ( 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:669:4: 'switch' '(' VariableId ')' '{' ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? ) '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal370=(Token)match(input,Switch,FOLLOW_Switch_in_switchCondition3597); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal370_tree = 
			(Object)adaptor.create(string_literal370)
			;
			adaptor.addChild(root_0, string_literal370_tree);
			}

			char_literal371=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_switchCondition3599); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal371_tree = 
			(Object)adaptor.create(char_literal371)
			;
			adaptor.addChild(root_0, char_literal371_tree);
			}

			VariableId372=(Token)match(input,VariableId,FOLLOW_VariableId_in_switchCondition3601); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId372_tree = 
			(Object)adaptor.create(VariableId372)
			;
			adaptor.addChild(root_0, VariableId372_tree);
			}

			char_literal373=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_switchCondition3603); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal373_tree = 
			(Object)adaptor.create(char_literal373)
			;
			adaptor.addChild(root_0, char_literal373_tree);
			}

			char_literal374=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_switchCondition3605); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal374_tree = 
			(Object)adaptor.create(char_literal374)
			;
			adaptor.addChild(root_0, char_literal374_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:670:3: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ | ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )? )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==Case) ) {
				int LA125_1 = input.LA(2);
				if ( (synpred194_TSPHP()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3616);
									caseLabel375=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel375.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:16: ( instructionInclBreakContinue )+
							int cnt114=0;
							loop114:
							do {
								int alt114=2;
								int LA114_0 = input.LA(1);
								if ( (LA114_0==Backslash||LA114_0==Break||LA114_0==Continue||LA114_0==Do||LA114_0==Echo||LA114_0==Exit||(LA114_0 >= For && LA114_0 <= Foreach)||(LA114_0 >= Identifier && LA114_0 <= If)||LA114_0==LeftCurlyBrace||LA114_0==MinusMinus||LA114_0==Parent||LA114_0==PlusPlus||LA114_0==Return||LA114_0==Self||(LA114_0 >= Switch && LA114_0 <= TypeString)||LA114_0==VariableId||LA114_0==While) ) {
									alt114=1;
								}

								switch (alt114) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:16: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3619);
									instructionInclBreakContinue376=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue376.getTree());

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

					pushFollow(FOLLOW_defaultLabel_in_switchCondition3624);
					defaultLabel377=defaultLabel();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel377.getTree());

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:61: ( instructionInclBreakContinue )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:61: instructionInclBreakContinue
							{
							pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3626);
							instructionInclBreakContinue378=instructionInclBreakContinue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue378.getTree());

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

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3630);
									caseLabel379=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel379.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:103: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:103: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3633);
									instructionInclBreakContinue380=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue380.getTree());

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
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ ( defaultLabel ( instructionInclBreakContinue )+ )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:5: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:6: ( caseLabel )+ ( instructionInclBreakContinue )+
							{
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:6: ( caseLabel )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:6: caseLabel
									{
									pushFollow(FOLLOW_caseLabel_in_switchCondition3643);
									caseLabel381=caseLabel();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabel381.getTree());

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

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:17: ( instructionInclBreakContinue )+
							int cnt121=0;
							loop121:
							do {
								int alt121=2;
								int LA121_0 = input.LA(1);
								if ( (LA121_0==Backslash||LA121_0==Break||LA121_0==Continue||LA121_0==Do||LA121_0==Echo||LA121_0==Exit||(LA121_0 >= For && LA121_0 <= Foreach)||(LA121_0 >= Identifier && LA121_0 <= If)||LA121_0==LeftCurlyBrace||LA121_0==MinusMinus||LA121_0==Parent||LA121_0==PlusPlus||LA121_0==Return||LA121_0==Self||(LA121_0 >= Switch && LA121_0 <= TypeString)||LA121_0==VariableId||LA121_0==While) ) {
									alt121=1;
								}

								switch (alt121) {
								case 1 :
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:17: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3646);
									instructionInclBreakContinue382=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue382.getTree());

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

						default :
							if ( cnt122 >= 1 ) break loop122;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(122, input);
								throw eee;
						}
						cnt122++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:49: ( defaultLabel ( instructionInclBreakContinue )+ )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==Default) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:50: defaultLabel ( instructionInclBreakContinue )+
							{
							pushFollow(FOLLOW_defaultLabel_in_switchCondition3652);
							defaultLabel383=defaultLabel();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultLabel383.getTree());

							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:63: ( instructionInclBreakContinue )+
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
									// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:672:63: instructionInclBreakContinue
									{
									pushFollow(FOLLOW_instructionInclBreakContinue_in_switchCondition3654);
									instructionInclBreakContinue384=instructionInclBreakContinue();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue384.getTree());

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

					}

					}
					break;

			}

			char_literal385=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_switchCondition3665); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal385_tree = 
			(Object)adaptor.create(char_literal385)
			;
			adaptor.addChild(root_0, char_literal385_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, switchCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "switchCondition"


	public static class caseLabel_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:677:1: caseLabel : 'case' expression ':' ;
	public final TSPHPParser.caseLabel_return caseLabel() throws RecognitionException {
		TSPHPParser.caseLabel_return retval = new TSPHPParser.caseLabel_return();
		retval.start = input.LT(1);
		int caseLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal386=null;
		Token char_literal388=null;
		ParserRuleReturnScope expression387 =null;

		Object string_literal386_tree=null;
		Object char_literal388_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:2: ( 'case' expression ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:678:4: 'case' expression ':'
			{
			root_0 = (Object)adaptor.nil();


			string_literal386=(Token)match(input,Case,FOLLOW_Case_in_caseLabel3677); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal386_tree = 
			(Object)adaptor.create(string_literal386)
			;
			adaptor.addChild(root_0, string_literal386_tree);
			}

			pushFollow(FOLLOW_expression_in_caseLabel3679);
			expression387=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression387.getTree());

			char_literal388=(Token)match(input,Colon,FOLLOW_Colon_in_caseLabel3681); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal388_tree = 
			(Object)adaptor.create(char_literal388)
			;
			adaptor.addChild(root_0, char_literal388_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, caseLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "caseLabel"


	public static class defaultLabel_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defaultLabel"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:680:1: defaultLabel : 'default' ':' ;
	public final TSPHPParser.defaultLabel_return defaultLabel() throws RecognitionException {
		TSPHPParser.defaultLabel_return retval = new TSPHPParser.defaultLabel_return();
		retval.start = input.LT(1);
		int defaultLabel_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal389=null;
		Token char_literal390=null;

		Object string_literal389_tree=null;
		Object char_literal390_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:2: ( 'default' ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:681:4: 'default' ':'
			{
			root_0 = (Object)adaptor.nil();


			string_literal389=(Token)match(input,Default,FOLLOW_Default_in_defaultLabel3690); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal389_tree = 
			(Object)adaptor.create(string_literal389)
			;
			adaptor.addChild(root_0, string_literal389_tree);
			}

			char_literal390=(Token)match(input,Colon,FOLLOW_Colon_in_defaultLabel3692); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal390_tree = 
			(Object)adaptor.create(char_literal390)
			;
			adaptor.addChild(root_0, char_literal390_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, defaultLabel_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultLabel"


	public static class forLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:1: forLoop : 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.forLoop_return forLoop() throws RecognitionException {
		TSPHPParser.forLoop_return retval = new TSPHPParser.forLoop_return();
		retval.start = input.LT(1);
		int forLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal391=null;
		Token char_literal392=null;
		Token char_literal394=null;
		Token char_literal396=null;
		Token char_literal398=null;
		ParserRuleReturnScope forInit393 =null;
		ParserRuleReturnScope expressionList395 =null;
		ParserRuleReturnScope forUpdate397 =null;
		ParserRuleReturnScope instructionInclBreakContinue399 =null;

		Object string_literal391_tree=null;
		Object char_literal392_tree=null;
		Object char_literal394_tree=null;
		Object char_literal396_tree=null;
		Object char_literal398_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:9: ( 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:11: 'for' '(' ( forInit )? ';' ( expressionList )? ';' ( forUpdate )? ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal391=(Token)match(input,For,FOLLOW_For_in_forLoop3701); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal391_tree = 
			(Object)adaptor.create(string_literal391)
			;
			adaptor.addChild(root_0, string_literal391_tree);
			}

			char_literal392=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_forLoop3703); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal392_tree = 
			(Object)adaptor.create(char_literal392)
			;
			adaptor.addChild(root_0, char_literal392_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:21: ( forInit )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==Backslash||LA126_0==Identifier||LA126_0==MinusMinus||LA126_0==Parent||LA126_0==PlusPlus||LA126_0==Self||LA126_0==This||(LA126_0 >= TypeArray && LA126_0 <= TypeString)||LA126_0==VariableId) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:21: forInit
					{
					pushFollow(FOLLOW_forInit_in_forLoop3705);
					forInit393=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit393.getTree());

					}
					break;

			}

			char_literal394=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3708); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal394_tree = 
			(Object)adaptor.create(char_literal394)
			;
			adaptor.addChild(root_0, char_literal394_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:34: ( expressionList )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==At||LA127_0==Backslash||LA127_0==BitwiseNot||LA127_0==Bool||LA127_0==Clone||LA127_0==Float||LA127_0==Identifier||LA127_0==Int||(LA127_0 >= LeftParanthesis && LA127_0 <= LeftSquareBrace)||LA127_0==LogicNot||LA127_0==Minus||LA127_0==MinusMinus||LA127_0==NULL||LA127_0==New||LA127_0==Null||(LA127_0 >= Parent && LA127_0 <= Plus)||LA127_0==PlusPlus||LA127_0==Self||LA127_0==String||LA127_0==This||LA127_0==TypeArray||LA127_0==VariableId) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:34: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3710);
					expressionList395=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList395.getTree());

					}
					break;

			}

			char_literal396=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_forLoop3714); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal396_tree = 
			(Object)adaptor.create(char_literal396)
			;
			adaptor.addChild(root_0, char_literal396_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:55: ( forUpdate )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==Backslash||LA128_0==Identifier||LA128_0==MinusMinus||LA128_0==Parent||LA128_0==PlusPlus||LA128_0==Self||LA128_0==This||LA128_0==VariableId) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:683:55: forUpdate
					{
					pushFollow(FOLLOW_forUpdate_in_forLoop3716);
					forUpdate397=forUpdate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forUpdate397.getTree());

					}
					break;

			}

			char_literal398=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_forLoop3719); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal398_tree = 
			(Object)adaptor.create(char_literal398)
			;
			adaptor.addChild(root_0, char_literal398_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_forLoop3721);
			instructionInclBreakContinue399=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue399.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, forLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class forInit_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:1: forInit : ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* ;
	public final TSPHPParser.forInit_return forInit() throws RecognitionException {
		TSPHPParser.forInit_return retval = new TSPHPParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal402=null;
		ParserRuleReturnScope variableDeclaration400 =null;
		ParserRuleReturnScope variableAssignment401 =null;
		ParserRuleReturnScope variableAssignment403 =null;

		Object char_literal402_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:9: ( ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:11: ( variableDeclaration | variableAssignment ) ( ',' variableAssignment )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:11: ( variableDeclaration | variableAssignment )
			int alt129=2;
			alt129 = dfa129.predict(input);
			switch (alt129) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:12: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_forInit3730);
					variableDeclaration400=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration400.getTree());

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:32: variableAssignment
					{
					pushFollow(FOLLOW_variableAssignment_in_forInit3732);
					variableAssignment401=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment401.getTree());

					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:52: ( ',' variableAssignment )*
			loop130:
			do {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==Comma) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:53: ',' variableAssignment
					{
					char_literal402=(Token)match(input,Comma,FOLLOW_Comma_in_forInit3736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal402_tree = 
					(Object)adaptor.create(char_literal402)
					;
					adaptor.addChild(root_0, char_literal402_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forInit3738);
					variableAssignment403=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment403.getTree());

					}
					break;

				default :
					break loop130;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forUpdate_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:686:1: forUpdate : variableAssignment ( ',' variableAssignment )* ;
	public final TSPHPParser.forUpdate_return forUpdate() throws RecognitionException {
		TSPHPParser.forUpdate_return retval = new TSPHPParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal405=null;
		ParserRuleReturnScope variableAssignment404 =null;
		ParserRuleReturnScope variableAssignment406 =null;

		Object char_literal405_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:2: ( variableAssignment ( ',' variableAssignment )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:4: variableAssignment ( ',' variableAssignment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableAssignment_in_forUpdate3748);
			variableAssignment404=variableAssignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment404.getTree());

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:23: ( ',' variableAssignment )*
			loop131:
			do {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==Comma) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:24: ',' variableAssignment
					{
					char_literal405=(Token)match(input,Comma,FOLLOW_Comma_in_forUpdate3751); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal405_tree = 
					(Object)adaptor.create(char_literal405)
					;
					adaptor.addChild(root_0, char_literal405_tree);
					}

					pushFollow(FOLLOW_variableAssignment_in_forUpdate3753);
					variableAssignment406=variableAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableAssignment406.getTree());

					}
					break;

				default :
					break loop131;
				}
			} while (true);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class foreachLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:689:1: foreachLoop : 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue ;
	public final TSPHPParser.foreachLoop_return foreachLoop() throws RecognitionException {
		TSPHPParser.foreachLoop_return retval = new TSPHPParser.foreachLoop_return();
		retval.start = input.LT(1);
		int foreachLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal407=null;
		Token char_literal408=null;
		Token VariableId409=null;
		Token string_literal411=null;
		Token VariableId412=null;
		Token string_literal413=null;
		Token VariableId414=null;
		Token char_literal415=null;
		ParserRuleReturnScope array410 =null;
		ParserRuleReturnScope instructionInclBreakContinue416 =null;

		Object string_literal407_tree=null;
		Object char_literal408_tree=null;
		Object VariableId409_tree=null;
		Object string_literal411_tree=null;
		Object VariableId412_tree=null;
		Object string_literal413_tree=null;
		Object VariableId414_tree=null;
		Object char_literal415_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:2: ( 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:4: 'foreach' '(' ( VariableId | array ) 'as' VariableId ( '=>' VariableId )? ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal407=(Token)match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3764); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal407_tree = 
			(Object)adaptor.create(string_literal407)
			;
			adaptor.addChild(root_0, string_literal407_tree);
			}

			char_literal408=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_foreachLoop3766); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal408_tree = 
			(Object)adaptor.create(char_literal408)
			;
			adaptor.addChild(root_0, char_literal408_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:18: ( VariableId | array )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==VariableId) ) {
				alt132=1;
			}
			else if ( (LA132_0==LeftSquareBrace||LA132_0==TypeArray) ) {
				alt132=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}
			switch (alt132) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:19: VariableId
					{
					VariableId409=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3769); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId409_tree = 
					(Object)adaptor.create(VariableId409)
					;
					adaptor.addChild(root_0, VariableId409_tree);
					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:30: array
					{
					pushFollow(FOLLOW_array_in_foreachLoop3771);
					array410=array();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array410.getTree());

					}
					break;

			}

			string_literal411=(Token)match(input,As,FOLLOW_As_in_foreachLoop3774); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal411_tree = 
			(Object)adaptor.create(string_literal411)
			;
			adaptor.addChild(root_0, string_literal411_tree);
			}

			VariableId412=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId412_tree = 
			(Object)adaptor.create(VariableId412)
			;
			adaptor.addChild(root_0, VariableId412_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:53: ( '=>' VariableId )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==Arrow) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:690:54: '=>' VariableId
					{
					string_literal413=(Token)match(input,Arrow,FOLLOW_Arrow_in_foreachLoop3779); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal413_tree = 
					(Object)adaptor.create(string_literal413)
					;
					adaptor.addChild(root_0, string_literal413_tree);
					}

					VariableId414=(Token)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VariableId414_tree = 
					(Object)adaptor.create(VariableId414)
					;
					adaptor.addChild(root_0, VariableId414_tree);
					}

					}
					break;

			}

			char_literal415=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_foreachLoop3785); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal415_tree = 
			(Object)adaptor.create(char_literal415)
			;
			adaptor.addChild(root_0, char_literal415_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_foreachLoop3787);
			instructionInclBreakContinue416=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue416.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, foreachLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:692:1: whileLoop : 'while' '(' expression ')' instructionInclBreakContinue ;
	public final TSPHPParser.whileLoop_return whileLoop() throws RecognitionException {
		TSPHPParser.whileLoop_return retval = new TSPHPParser.whileLoop_return();
		retval.start = input.LT(1);
		int whileLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal417=null;
		Token char_literal418=null;
		Token char_literal420=null;
		ParserRuleReturnScope expression419 =null;
		ParserRuleReturnScope instructionInclBreakContinue421 =null;

		Object string_literal417_tree=null;
		Object char_literal418_tree=null;
		Object char_literal420_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:2: ( 'while' '(' expression ')' instructionInclBreakContinue )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:4: 'while' '(' expression ')' instructionInclBreakContinue
			{
			root_0 = (Object)adaptor.nil();


			string_literal417=(Token)match(input,While,FOLLOW_While_in_whileLoop3796); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal417_tree = 
			(Object)adaptor.create(string_literal417)
			;
			adaptor.addChild(root_0, string_literal417_tree);
			}

			char_literal418=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_whileLoop3798); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal418_tree = 
			(Object)adaptor.create(char_literal418)
			;
			adaptor.addChild(root_0, char_literal418_tree);
			}

			pushFollow(FOLLOW_expression_in_whileLoop3800);
			expression419=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression419.getTree());

			char_literal420=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_whileLoop3802); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal420_tree = 
			(Object)adaptor.create(char_literal420)
			;
			adaptor.addChild(root_0, char_literal420_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_whileLoop3804);
			instructionInclBreakContinue421=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue421.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, whileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:695:1: doWhileLoop : 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' ;
	public final TSPHPParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		TSPHPParser.doWhileLoop_return retval = new TSPHPParser.doWhileLoop_return();
		retval.start = input.LT(1);
		int doWhileLoop_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal422=null;
		Token string_literal424=null;
		Token char_literal425=null;
		Token char_literal427=null;
		Token char_literal428=null;
		ParserRuleReturnScope instructionInclBreakContinue423 =null;
		ParserRuleReturnScope expression426 =null;

		Object string_literal422_tree=null;
		Object string_literal424_tree=null;
		Object char_literal425_tree=null;
		Object char_literal427_tree=null;
		Object char_literal428_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:2: ( 'do' instructionInclBreakContinue 'while' '(' expression ')' ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:696:4: 'do' instructionInclBreakContinue 'while' '(' expression ')' ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal422=(Token)match(input,Do,FOLLOW_Do_in_doWhileLoop3814); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal422_tree = 
			(Object)adaptor.create(string_literal422)
			;
			adaptor.addChild(root_0, string_literal422_tree);
			}

			pushFollow(FOLLOW_instructionInclBreakContinue_in_doWhileLoop3816);
			instructionInclBreakContinue423=instructionInclBreakContinue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue423.getTree());

			string_literal424=(Token)match(input,While,FOLLOW_While_in_doWhileLoop3818); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal424_tree = 
			(Object)adaptor.create(string_literal424)
			;
			adaptor.addChild(root_0, string_literal424_tree);
			}

			char_literal425=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_doWhileLoop3820); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal425_tree = 
			(Object)adaptor.create(char_literal425)
			;
			adaptor.addChild(root_0, char_literal425_tree);
			}

			pushFollow(FOLLOW_expression_in_doWhileLoop3822);
			expression426=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression426.getTree());

			char_literal427=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_doWhileLoop3824); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal427_tree = 
			(Object)adaptor.create(char_literal427)
			;
			adaptor.addChild(root_0, char_literal427_tree);
			}

			char_literal428=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_doWhileLoop3826); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal428_tree = 
			(Object)adaptor.create(char_literal428)
			;
			adaptor.addChild(root_0, char_literal428_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, doWhileLoop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:1: tryCatch : 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' ;
	public final TSPHPParser.tryCatch_return tryCatch() throws RecognitionException {
		TSPHPParser.tryCatch_return retval = new TSPHPParser.tryCatch_return();
		retval.start = input.LT(1);
		int tryCatch_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal429=null;
		Token char_literal430=null;
		Token char_literal432=null;
		Token string_literal433=null;
		Token char_literal434=null;
		Token VariableId436=null;
		Token char_literal437=null;
		Token char_literal438=null;
		Token char_literal440=null;
		ParserRuleReturnScope instructionInclBreakContinue431 =null;
		ParserRuleReturnScope classInterfaceTypeInclObject435 =null;
		ParserRuleReturnScope instructionInclBreakContinue439 =null;

		Object string_literal429_tree=null;
		Object char_literal430_tree=null;
		Object char_literal432_tree=null;
		Object string_literal433_tree=null;
		Object char_literal434_tree=null;
		Object VariableId436_tree=null;
		Object char_literal437_tree=null;
		Object char_literal438_tree=null;
		Object char_literal440_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:9: ( 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:11: 'try' '{' ( instructionInclBreakContinue )+ '}' 'catch' '(' classInterfaceTypeInclObject VariableId ')' '{' ( instructionInclBreakContinue )* '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal429=(Token)match(input,Try,FOLLOW_Try_in_tryCatch3833); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal429_tree = 
			(Object)adaptor.create(string_literal429)
			;
			adaptor.addChild(root_0, string_literal429_tree);
			}

			char_literal430=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal430_tree = 
			(Object)adaptor.create(char_literal430)
			;
			adaptor.addChild(root_0, char_literal430_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:21: ( instructionInclBreakContinue )+
			int cnt134=0;
			loop134:
			do {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==Backslash||LA134_0==Break||LA134_0==Continue||LA134_0==Do||LA134_0==Echo||LA134_0==Exit||(LA134_0 >= For && LA134_0 <= Foreach)||(LA134_0 >= Identifier && LA134_0 <= If)||LA134_0==LeftCurlyBrace||LA134_0==MinusMinus||LA134_0==Parent||LA134_0==PlusPlus||LA134_0==Return||LA134_0==Self||(LA134_0 >= Switch && LA134_0 <= TypeString)||LA134_0==VariableId||LA134_0==While) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:21: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3837);
					instructionInclBreakContinue431=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue431.getTree());

					}
					break;

				default :
					if ( cnt134 >= 1 ) break loop134;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(134, input);
						throw eee;
				}
				cnt134++;
			} while (true);

			char_literal432=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3840); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal432_tree = 
			(Object)adaptor.create(char_literal432)
			;
			adaptor.addChild(root_0, char_literal432_tree);
			}

			string_literal433=(Token)match(input,Catch,FOLLOW_Catch_in_tryCatch3842); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal433_tree = 
			(Object)adaptor.create(string_literal433)
			;
			adaptor.addChild(root_0, string_literal433_tree);
			}

			char_literal434=(Token)match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_tryCatch3844); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal434_tree = 
			(Object)adaptor.create(char_literal434)
			;
			adaptor.addChild(root_0, char_literal434_tree);
			}

			pushFollow(FOLLOW_classInterfaceTypeInclObject_in_tryCatch3846);
			classInterfaceTypeInclObject435=classInterfaceTypeInclObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, classInterfaceTypeInclObject435.getTree());

			VariableId436=(Token)match(input,VariableId,FOLLOW_VariableId_in_tryCatch3848); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VariableId436_tree = 
			(Object)adaptor.create(VariableId436)
			;
			adaptor.addChild(root_0, VariableId436_tree);
			}

			char_literal437=(Token)match(input,RightParanthesis,FOLLOW_RightParanthesis_in_tryCatch3850); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal437_tree = 
			(Object)adaptor.create(char_literal437)
			;
			adaptor.addChild(root_0, char_literal437_tree);
			}

			char_literal438=(Token)match(input,LeftCurlyBrace,FOLLOW_LeftCurlyBrace_in_tryCatch3851); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal438_tree = 
			(Object)adaptor.create(char_literal438)
			;
			adaptor.addChild(root_0, char_literal438_tree);
			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:114: ( instructionInclBreakContinue )*
			loop135:
			do {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==Backslash||LA135_0==Break||LA135_0==Continue||LA135_0==Do||LA135_0==Echo||LA135_0==Exit||(LA135_0 >= For && LA135_0 <= Foreach)||(LA135_0 >= Identifier && LA135_0 <= If)||LA135_0==LeftCurlyBrace||LA135_0==MinusMinus||LA135_0==Parent||LA135_0==PlusPlus||LA135_0==Return||LA135_0==Self||(LA135_0 >= Switch && LA135_0 <= TypeString)||LA135_0==VariableId||LA135_0==While) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:698:114: instructionInclBreakContinue
					{
					pushFollow(FOLLOW_instructionInclBreakContinue_in_tryCatch3853);
					instructionInclBreakContinue439=instructionInclBreakContinue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instructionInclBreakContinue439.getTree());

					}
					break;

				default :
					break loop135;
				}
			} while (true);

			char_literal440=(Token)match(input,RightCurlyBrace,FOLLOW_RightCurlyBrace_in_tryCatch3856); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal440_tree = 
			(Object)adaptor.create(char_literal440)
			;
			adaptor.addChild(root_0, char_literal440_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, tryCatch_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tryCatch"


	public static class throwException_return extends ParserRuleReturnScope {
		Object tree;
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throwException"
	// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:700:1: throwException : 'throw' newObject ';' ;
	public final TSPHPParser.throwException_return throwException() throws RecognitionException {
		TSPHPParser.throwException_return retval = new TSPHPParser.throwException_return();
		retval.start = input.LT(1);
		int throwException_StartIndex = input.index();

		Object root_0 = null;

		Token string_literal441=null;
		Token char_literal443=null;
		ParserRuleReturnScope newObject442 =null;

		Object string_literal441_tree=null;
		Object char_literal443_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:2: ( 'throw' newObject ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:701:4: 'throw' newObject ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal441=(Token)match(input,Throw,FOLLOW_Throw_in_throwException3865); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal441_tree = 
			(Object)adaptor.create(string_literal441)
			;
			adaptor.addChild(root_0, string_literal441_tree);
			}

			pushFollow(FOLLOW_newObject_in_throwException3867);
			newObject442=newObject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, newObject442.getTree());

			char_literal443=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_throwException3869); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal443_tree = 
			(Object)adaptor.create(char_literal443)
			;
			adaptor.addChild(root_0, char_literal443_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: ( variableAssignment ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:358:4: variableAssignment ';'
		{
		pushFollow(FOLLOW_variableAssignment_in_synpred69_TSPHP1844);
		variableAssignment();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred69_TSPHP1846); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred69_TSPHP

	// $ANTLR start synpred70_TSPHP
	public final void synpred70_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: ( variableDeclaration ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:359:4: variableDeclaration ';'
		{
		pushFollow(FOLLOW_variableDeclaration_in_synpred70_TSPHP1851);
		variableDeclaration();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred70_TSPHP1853); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred70_TSPHP

	// $ANTLR start synpred79_TSPHP
	public final void synpred79_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: ( functionCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:368:4: functionCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1898);
		functionCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred79_TSPHP1900); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred79_TSPHP

	// $ANTLR start synpred80_TSPHP
	public final void synpred80_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: ( methodCallFluentWithoutAccessAtTheEnd ';' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:369:4: methodCallFluentWithoutAccessAtTheEnd ';'
		{
		pushFollow(FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1905);
		methodCallFluentWithoutAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		match(input,Semicolon,FOLLOW_Semicolon_in_synpred80_TSPHP1907); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred80_TSPHP

	// $ANTLR start synpred101_TSPHP
	public final void synpred101_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:18: ( 'or' logicXorWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:420:18: 'or' logicXorWeak
		{
		match(input,LogicOrWeak,FOLLOW_LogicOrWeak_in_synpred101_TSPHP2143); if (state.failed) return ;

		pushFollow(FOLLOW_logicXorWeak_in_synpred101_TSPHP2146);
		logicXorWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred101_TSPHP

	// $ANTLR start synpred102_TSPHP
	public final void synpred102_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:18: ( 'xor' logicAndWeak )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:423:18: 'xor' logicAndWeak
		{
		match(input,LogicXorWeak,FOLLOW_LogicXorWeak_in_synpred102_TSPHP2162); if (state.failed) return ;

		pushFollow(FOLLOW_logicAndWeak_in_synpred102_TSPHP2165);
		logicAndWeak();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred102_TSPHP

	// $ANTLR start synpred103_TSPHP
	public final void synpred103_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:16: ( 'and' assignment )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:426:16: 'and' assignment
		{
		match(input,LogicAndWeak,FOLLOW_LogicAndWeak_in_synpred103_TSPHP2181); if (state.failed) return ;

		pushFollow(FOLLOW_assignment_in_synpred103_TSPHP2184);
		assignment();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred103_TSPHP

	// $ANTLR start synpred104_TSPHP
	public final void synpred104_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:13: ( assignmentOperator ternary )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:429:13: assignmentOperator ternary
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred104_TSPHP2198);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return ;

		pushFollow(FOLLOW_ternary_in_synpred104_TSPHP2200);
		ternary();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred104_TSPHP

	// $ANTLR start synpred132_TSPHP
	public final void synpred132_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: ( ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' ) castOrBitwiseNotOrAt
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:4: ( '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:5: '(' ( primitiveTypesInclArray | classInterfaceTypeInclObject ) ')'
		{
		match(input,LeftParanthesis,FOLLOW_LeftParanthesis_in_synpred132_TSPHP2506); if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:9: ( primitiveTypesInclArray | classInterfaceTypeInclObject )
		int alt148=2;
		int LA148_0 = input.LA(1);
		if ( ((LA148_0 >= TypeArray && LA148_0 <= TypeInt)||LA148_0==TypeString) ) {
			alt148=1;
		}
		else if ( (LA148_0==Backslash||LA148_0==Identifier||LA148_0==TypeObject) ) {
			alt148=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 148, 0, input);
			throw nvae;
		}
		switch (alt148) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:10: primitiveTypesInclArray
				{
				pushFollow(FOLLOW_primitiveTypesInclArray_in_synpred132_TSPHP2509);
				primitiveTypesInclArray();
				state._fsp--;
				if (state.failed) return ;

				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:481:34: classInterfaceTypeInclObject
				{
				pushFollow(FOLLOW_classInterfaceTypeInclObject_in_synpred132_TSPHP2511);
				classInterfaceTypeInclObject();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

		}

		match(input,RightParanthesis,FOLLOW_RightParanthesis_in_synpred132_TSPHP2514); if (state.failed) return ;

		}

		pushFollow(FOLLOW_castOrBitwiseNotOrAt_in_synpred132_TSPHP2517);
		castOrBitwiseNotOrAt();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred132_TSPHP

	// $ANTLR start synpred151_TSPHP
	public final void synpred151_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: ( functionCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:530:4: functionCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2731);
		functionCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred151_TSPHP

	// $ANTLR start synpred152_TSPHP
	public final void synpred152_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: ( methodCallFluentInclAccessAtTheEnd )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:531:4: methodCallFluentInclAccessAtTheEnd
		{
		pushFollow(FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred152_TSPHP2736);
		methodCallFluentInclAccessAtTheEnd();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred152_TSPHP

	// $ANTLR start synpred154_TSPHP
	public final void synpred154_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred154_TSPHP2769);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred154_TSPHP

	// $ANTLR start synpred155_TSPHP
	public final void synpred155_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: ( functionCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:4: functionCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_functionCall_in_synpred155_TSPHP2767);
		functionCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: ( callOrAccess )*
		loop152:
		do {
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==ObjectOperator) ) {
				int LA152_1 = input.LA(2);
				if ( (synpred154_TSPHP()) ) {
					alt152=1;
				}

			}
			else if ( (LA152_0==LeftSquareBrace) ) {
				alt152=1;
			}

			switch (alt152) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:540:17: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred155_TSPHP2769);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop152;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred155_TSPHP2772);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred155_TSPHP

	// $ANTLR start synpred161_TSPHP
	public final void synpred161_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: ( callOrAccess )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: callOrAccess
		{
		pushFollow(FOLLOW_callOrAccess_in_synpred161_TSPHP2864);
		callOrAccess();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred161_TSPHP

	// $ANTLR start synpred162_TSPHP
	public final void synpred162_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:5: ( methodCall ( callOrAccess )* call )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:5: methodCall ( callOrAccess )* call
		{
		pushFollow(FOLLOW_methodCall_in_synpred162_TSPHP2862);
		methodCall();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: ( callOrAccess )*
		loop153:
		do {
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==ObjectOperator) ) {
				int LA153_1 = input.LA(2);
				if ( (synpred161_TSPHP()) ) {
					alt153=1;
				}

			}
			else if ( (LA153_0==LeftSquareBrace) ) {
				alt153=1;
			}

			switch (alt153) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:560:16: callOrAccess
				{
				pushFollow(FOLLOW_callOrAccess_in_synpred162_TSPHP2864);
				callOrAccess();
				state._fsp--;
				if (state.failed) return ;

				}
				break;

			default :
				break loop153;
			}
		} while (true);

		pushFollow(FOLLOW_call_in_synpred162_TSPHP2867);
		call();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred162_TSPHP

	// $ANTLR start synpred167_TSPHP
	public final void synpred167_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: ( incrementDecrement )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:568:4: incrementDecrement
		{
		pushFollow(FOLLOW_incrementDecrement_in_synpred167_TSPHP2923);
		incrementDecrement();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred167_TSPHP

	// $ANTLR start synpred168_TSPHP
	public final void synpred168_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: ( variableMemberStaticMember )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:569:4: variableMemberStaticMember
		{
		pushFollow(FOLLOW_variableMemberStaticMember_in_synpred168_TSPHP2928);
		variableMemberStaticMember();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred168_TSPHP

	// $ANTLR start synpred169_TSPHP
	public final void synpred169_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: ( classConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:570:4: classConstant
		{
		pushFollow(FOLLOW_classConstant_in_synpred169_TSPHP2933);
		classConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred169_TSPHP

	// $ANTLR start synpred170_TSPHP
	public final void synpred170_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: ( globalConstant )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:571:4: globalConstant
		{
		pushFollow(FOLLOW_globalConstant_in_synpred170_TSPHP2938);
		globalConstant();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred170_TSPHP

	// $ANTLR start synpred183_TSPHP
	public final void synpred183_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:5: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred183_TSPHP3533);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred183_TSPHP3535); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred183_TSPHP

	// $ANTLR start synpred184_TSPHP
	public final void synpred184_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:41: ( expression '=>' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:659:41: expression '=>'
		{
		pushFollow(FOLLOW_expression_in_synpred184_TSPHP3546);
		expression();
		state._fsp--;
		if (state.failed) return ;

		match(input,Arrow,FOLLOW_Arrow_in_synpred184_TSPHP3548); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred184_TSPHP

	// $ANTLR start synpred186_TSPHP
	public final void synpred186_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:5: ( 'else' instructionInclBreakContinue )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:664:5: 'else' instructionInclBreakContinue
		{
		match(input,Else,FOLLOW_Else_in_synpred186_TSPHP3579); if (state.failed) return ;

		pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3581);
		instructionInclBreakContinue();
		state._fsp--;
		if (state.failed) return ;

		}

	}
	// $ANTLR end synpred186_TSPHP

	// $ANTLR start synpred194_TSPHP
	public final void synpred194_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+ defaultLabel ( instructionInclBreakContinue )+ ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
		{
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:4: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: ( caseLabel )+
				int cnt160=0;
				loop160:
				do {
					int alt160=2;
					int LA160_0 = input.LA(1);
					if ( (LA160_0==Case) ) {
						alt160=1;
					}

					switch (alt160) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:5: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred194_TSPHP3616);
						caseLabel();
						state._fsp--;
						if (state.failed) return ;

						}
						break;

					default :
						if ( cnt160 >= 1 ) break loop160;
						if (state.backtracking>0) {state.failed=true; return ;}
							EarlyExitException eee =
								new EarlyExitException(160, input);
							throw eee;
					}
					cnt160++;
				} while (true);

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:16: ( instructionInclBreakContinue )+
				int cnt161=0;
				loop161:
				do {
					int alt161=2;
					int LA161_0 = input.LA(1);
					if ( (LA161_0==Backslash||LA161_0==Break||LA161_0==Continue||LA161_0==Do||LA161_0==Echo||LA161_0==Exit||(LA161_0 >= For && LA161_0 <= Foreach)||(LA161_0 >= Identifier && LA161_0 <= If)||LA161_0==LeftCurlyBrace||LA161_0==MinusMinus||LA161_0==Parent||LA161_0==PlusPlus||LA161_0==Return||LA161_0==Self||(LA161_0 >= Switch && LA161_0 <= TypeString)||LA161_0==VariableId||LA161_0==While) ) {
						alt161=1;
					}

					switch (alt161) {
					case 1 :
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:16: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3619);
						instructionInclBreakContinue();
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

		pushFollow(FOLLOW_defaultLabel_in_synpred194_TSPHP3624);
		defaultLabel();
		state._fsp--;
		if (state.failed) return ;

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:61: ( instructionInclBreakContinue )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:61: instructionInclBreakContinue
				{
				pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3626);
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

		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:91: ( ( caseLabel )+ ( instructionInclBreakContinue )+ )+
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
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: ( caseLabel )+ ( instructionInclBreakContinue )+
				{
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: ( caseLabel )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:92: caseLabel
						{
						pushFollow(FOLLOW_caseLabel_in_synpred194_TSPHP3630);
						caseLabel();
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

				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:103: ( instructionInclBreakContinue )+
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
						// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:671:103: instructionInclBreakContinue
						{
						pushFollow(FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3633);
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

	}
	// $ANTLR end synpred194_TSPHP

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
	public final boolean synpred162_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred162_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred132_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred132_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred194_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred194_TSPHP_fragment(); // can never throw exception
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
	public final boolean synpred186_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_TSPHP_fragment(); // can never throw exception
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


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA48 dfa48 = new DFA48(this);
	protected DFA88 dfa88 = new DFA88(this);
	protected DFA102 dfa102 = new DFA102(this);
	protected DFA129 dfa129 = new DFA129(this);
	static final String DFA3_eotS =
		"\10\uffff";
	static final String DFA3_eofS =
		"\10\uffff";
	static final String DFA3_minS =
		"\1\4\1\65\1\uffff\1\12\1\uffff\1\65\1\uffff\1\12";
	static final String DFA3_maxS =
		"\1\176\1\73\1\uffff\1\150\1\uffff\1\65\1\uffff\1\150";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA3_specialS =
		"\10\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\5\uffff\1\2\13\uffff\1\2\4\uffff\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\3\2\4\uffff\2\2\3\uffff\2\2\14\uffff\1\2\5\uffff"+
			"\1\1\7\uffff\1\2\2\uffff\1\2\7\uffff\1\2\5\uffff\1\2\7\uffff\16\2\1\uffff"+
			"\1\2",
			"\1\3\5\uffff\1\4",
			"",
			"\1\5\60\uffff\1\4\54\uffff\1\6",
			"",
			"\1\7",
			"",
			"\1\5\60\uffff\1\4\54\uffff\1\6"
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
			return "177:1: prog : ( ( namespaceSemicolon )+ EOF | ( namespaceBracket )+ EOF | withoutNamespace EOF );";
		}
	}

	static final String DFA48_eotS =
		"\27\uffff";
	static final String DFA48_eofS =
		"\7\uffff\1\13\14\uffff\1\13\2\uffff";
	static final String DFA48_minS =
		"\1\12\4\174\1\65\1\12\1\7\1\65\1\uffff\1\12\2\uffff\1\12\4\174\1\65\1"+
		"\12\1\7\1\65\1\12";
	static final String DFA48_maxS =
		"\1\172\4\174\1\65\1\174\1\172\1\65\1\uffff\1\172\2\uffff\5\174\1\65\1"+
		"\174\1\143\1\65\1\174";
	static final String DFA48_acceptS =
		"\11\uffff\1\1\1\uffff\1\2\1\3\12\uffff";
	static final String DFA48_specialS =
		"\27\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\5\52\uffff\1\6\75\uffff\1\2\4\1\1\4\1\3\1\1",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\7",
			"\1\6",
			"\1\10\161\uffff\1\7",
			"\1\11\2\uffff\1\14\16\uffff\1\12\33\uffff\1\14\55\uffff\1\13\17\uffff"+
			"\10\14",
			"\1\15",
			"",
			"\1\22\52\uffff\1\23\75\uffff\1\17\4\16\1\21\1\20\1\16",
			"",
			"",
			"\1\10\161\uffff\1\7",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\24",
			"\1\23",
			"\1\25\161\uffff\1\24",
			"\1\14\21\uffff\1\13\111\uffff\1\13",
			"\1\26",
			"\1\25\161\uffff\1\24"
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
			return "331:1: paramList : ( paramDeclarationOptional ( ',' paramDeclarationOptional )* | paramDeclaration ( ',' paramDeclaration )* | paramDeclaration ( paramDeclaration ',' )* ( ',' paramDeclarationOptional )+ );";
		}
	}

	static final String DFA88_eotS =
		"\10\uffff";
	static final String DFA88_eofS =
		"\3\uffff\1\5\3\uffff\1\5";
	static final String DFA88_minS =
		"\1\117\1\12\1\65\1\5\1\65\2\uffff\1\5";
	static final String DFA88_maxS =
		"\1\117\2\65\1\154\1\65\2\uffff\1\154";
	static final String DFA88_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA88_specialS =
		"\10\uffff}>";
	static final String[] DFA88_transitionS = {
			"\1\1",
			"\1\2\52\uffff\1\3",
			"\1\3",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5",
			"\1\7",
			"",
			"",
			"\1\5\1\uffff\1\5\2\uffff\1\4\2\5\1\uffff\4\5\6\uffff\2\5\5\uffff\2\5"+
			"\2\uffff\2\5\4\uffff\1\5\7\uffff\2\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\6\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\3\uffff\3\5\4\uffff\2\5\7\uffff"+
			"\1\5\2\uffff\2\5\3\uffff\5\5"
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
			return "520:1: newObject : ( 'new' classInterfaceTypeWithoutObject | 'new' classInterfaceTypeWithoutObject '(' ( expressionList )? ')' );";
		}
	}

	static final String DFA102_eotS =
		"\12\uffff";
	static final String DFA102_eofS =
		"\12\uffff";
	static final String DFA102_minS =
		"\1\12\3\65\1\12\2\uffff\2\65\1\12";
	static final String DFA102_maxS =
		"\3\174\1\65\1\45\2\uffff\1\65\1\174\1\45";
	static final String DFA102_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA102_specialS =
		"\12\uffff}>";
	static final String[] DFA102_transitionS = {
			"\1\3\52\uffff\1\4\40\uffff\1\2\20\uffff\1\1\10\uffff\1\5\13\uffff\1\5",
			"\1\6\106\uffff\1\5",
			"\1\6\106\uffff\1\5",
			"\1\4",
			"\1\7\32\uffff\1\10",
			"",
			"",
			"\1\11",
			"\1\6\106\uffff\1\5",
			"\1\7\32\uffff\1\10"
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
			return "564:4: ( ( variableMemberStaticMember '->' ) | staticAccessOrParent )";
		}
	}

	static final String DFA129_eotS =
		"\7\uffff";
	static final String DFA129_eofS =
		"\7\uffff";
	static final String DFA129_minS =
		"\1\12\1\uffff\1\65\1\12\1\uffff\1\65\1\12";
	static final String DFA129_maxS =
		"\1\174\1\uffff\1\65\1\174\1\uffff\1\65\1\174";
	static final String DFA129_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA129_specialS =
		"\7\uffff}>";
	static final String[] DFA129_transitionS = {
			"\1\2\52\uffff\1\3\22\uffff\1\4\15\uffff\1\4\2\uffff\1\4\15\uffff\1\4"+
			"\10\uffff\1\4\2\uffff\10\1\1\uffff\1\4",
			"",
			"\1\3",
			"\1\5\32\uffff\1\4\126\uffff\1\1",
			"",
			"\1\6",
			"\1\5\32\uffff\1\4\126\uffff\1\1"
	};

	static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
	static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
	static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
	static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
	static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
	static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
	static final short[][] DFA129_transition;

	static {
		int numStates = DFA129_transitionS.length;
		DFA129_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
		}
	}

	class DFA129 extends DFA {

		public DFA129(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 129;
			this.eot = DFA129_eot;
			this.eof = DFA129_eof;
			this.min = DFA129_min;
			this.max = DFA129_max;
			this.accept = DFA129_accept;
			this.special = DFA129_special;
			this.transition = DFA129_transition;
		}
		@Override
		public String getDescription() {
			return "685:11: ( variableDeclaration | variableAssignment )";
		}
	}

	public static final BitSet FOLLOW_namespaceSemicolon_in_prog924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespaceBracket_in_prog932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_EOF_in_prog935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withoutNamespace_in_prog940 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespaceSemicolon955 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceSemicolon957 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_namespaceSemicolon959 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_statement_in_namespaceSemicolon961 = new BitSet(new long[]{0x0C61D48208400412L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_Namespace_in_namespaceBracket974 = new BitSet(new long[]{0x0820000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_namespaceBracket976 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_namespaceBracket979 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_statement_in_namespaceBracket981 = new BitSet(new long[]{0x0C61D48208400410L,0x5FFF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_namespaceBracket984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1050 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Backslash_in_namespaceId1053 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_namespaceId1055 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_statement_in_withoutNamespace1068 = new BitSet(new long[]{0x0C61D48208400412L,0x5FFF808202400100L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_statement1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList1101 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1103 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Comma_in_useDeclarationList1106 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList1108 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_useDeclarationList1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1125 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1127 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1129 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Backslash_in_useDeclaration1138 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_useDeclaration1139 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_As_in_useDeclaration1151 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_definition1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration1203 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration1205 = new BitSet(new long[]{0x0880080000000000L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration1207 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration1210 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_classDeclaration1213 = new BitSet(new long[]{0x0001100008000010L,0x00002000C4000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration1215 = new BitSet(new long[]{0x0001100008000010L,0x00002004C4000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_classDeclaration1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration1232 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_extendsDeclaration1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1243 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_identifierList1246 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_identifierList1248 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration1259 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identifierList_in_implementsDeclaration1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBody1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeDeclaration_in_classBody1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBody1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_constDeclarationList1294 = new BitSet(new long[]{0x0000000000000000L,0x04F0000000000000L});
	public static final BitSet FOLLOW_primitiveTypes_in_constDeclarationList1296 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1298 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Comma_in_constDeclarationList1301 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList1303 = new BitSet(new long[]{0x0000000002000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_constDeclarationList1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment1317 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_constantAssignment1320 = new BitSet(new long[]{0x0220200000040000L,0x0000400000882040L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListWithoutVariableId1331 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListWithoutVariableId1334 = new BitSet(new long[]{0x0020000000000400L,0x1001008002400100L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListWithoutVariableId1336 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Static_in_attributeDeclaration1348 = new BitSet(new long[]{0x0000000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_accessor_in_attributeDeclaration1351 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_variableDeclarationListInclVariableId_in_attributeDeclaration1353 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_attributeDeclaration1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_accessor1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessor1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationListInclVariableId1390 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_variableDeclarationListInclVariableId1393 = new BitSet(new long[]{0x0020000000000400L,0x1001008002400100L});
	public static final BitSet FOLLOW_variableAssignment_in_variableDeclarationListInclVariableId1396 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclarationListInclVariableId1398 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Abstract_in_methodDeclaration1415 = new BitSet(new long[]{0x0001000000000000L,0x00000000C0000000L});
	public static final BitSet FOLLOW_accessorWithoutPrivate_in_methodDeclaration1417 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1431 = new BitSet(new long[]{0x0001100000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1433 = new BitSet(new long[]{0x0001000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_Final_in_methodDeclaration1441 = new BitSet(new long[]{0x0001000000000000L,0x00002000C4000000L});
	public static final BitSet FOLLOW_Static_in_methodDeclaration1443 = new BitSet(new long[]{0x0001000000000000L,0x00000000C4000000L});
	public static final BitSet FOLLOW_accessor_in_methodDeclaration1457 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclaration_in_methodDeclaration1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration1474 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration1476 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_interfaceDeclaration1478 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_interfaceDeclaration1481 = new BitSet(new long[]{0x0001000008000000L,0x0000000480000000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration1483 = new BitSet(new long[]{0x0001000008000000L,0x0000000480000000L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_interfaceDeclaration1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBody1495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBody1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_interfaceMethodDeclaration1511 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_interfaceMethodDeclaration1514 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_interfaceMethodDeclaration1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationWithoutBody_in_functionDeclaration1532 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_functionDeclaration1534 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_functionDeclaration1536 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_functionDeclaration1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Function_in_functionDeclarationWithoutBody1549 = new BitSet(new long[]{0x0020000000000400L,0x27F8000000000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclarationWithoutBody1551 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclarationWithoutBody1553 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionDeclarationWithoutBody1555 = new BitSet(new long[]{0x0020000000000400L,0x07F8000800000000L});
	public static final BitSet FOLLOW_paramList_in_functionDeclarationWithoutBody1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionDeclarationWithoutBody1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesExtended_in_allTypes1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_allTypes1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_primitiveTypesInclArray1626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypesInclArray1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_primitiveTypesExtended1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesExtended1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Backslash_in_classInterfaceTypeWithoutObject1662 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_namespaceId_in_classInterfaceTypeWithoutObject1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_classInterfaceTypeInclObject1678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_classInterfaceTypeInclObject1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1696 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1699 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1701 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1708 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_paramList1711 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1713 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1720 = new BitSet(new long[]{0x0020000002000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramList1723 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1725 = new BitSet(new long[]{0x0020000002000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_Comma_in_paramList1730 = new BitSet(new long[]{0x0020000000000400L,0x07F8000000000000L});
	public static final BitSet FOLLOW_paramDeclarationOptional_in_paramList1732 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_allTypes_in_paramDeclaration1746 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_paramDeclaration1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramDeclaration_in_paramDeclarationOptional1758 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Assign_in_paramDeclarationOptional1761 = new BitSet(new long[]{0x0220200000040000L,0x0000400000882040L});
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_paramDeclarationOptional1763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionWithoutBreakContinue1785 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionWithoutBreakContinue_in_instructionWithoutBreakContinue1787 = new BitSet(new long[]{0x0860C48200000400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionWithoutBreakContinue1791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionWithoutBreakContinue1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_instructionInclBreakContinue1807 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_instructionInclBreakContinue1809 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_instructionInclBreakContinue1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructionInclBreakContinue1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_instructionInclBreakContinue1823 = new BitSet(new long[]{0x0200000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Int_in_instructionInclBreakContinue1829 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instructionInclBreakContinue1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_instruction1844 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_instruction1851 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_throwException_in_instruction1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_instruction1898 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_instruction1905 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_instruction1913 = new BitSet(new long[]{0x3220200000842500L,0x1009418002C8A144L});
	public static final BitSet FOLLOW_expression_in_instruction1915 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_instruction1923 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expressionList_in_instruction1925 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Exit_in_instruction1932 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_instruction1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1946 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_expressionList1949 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_expressionList1951 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VariableId_in_variableAssignment1962 = new BitSet(new long[]{0x0000001100029080L,0x0000140001001480L});
	public static final BitSet FOLLOW_assignmentOperator_in_variableAssignment1964 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_variableAssignment1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_variableAssignment1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postIncrementDecrement_in_incrementDecrement1983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preIncrementDecrement_in_incrementDecrement1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_postIncrementDecrement2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000100L});
	public static final BitSet FOLLOW_set_in_postIncrementDecrement2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_preIncrementDecrement2082 = new BitSet(new long[]{0x0020000000000400L,0x1001008000400000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_preIncrementDecrement2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclaration2100 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration2102 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Assign_in_variableDeclaration2105 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicOrWeak_in_expression2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionForTest2129 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_expressionForTest2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LogicOrWeak_in_logicOrWeak2143 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicXorWeak_in_logicOrWeak2146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LogicXorWeak_in_logicXorWeak2162 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAndWeak_in_logicXorWeak2165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_logicAndWeak2181 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_assignment_in_logicAndWeak2184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2195 = new BitSet(new long[]{0x0000001100029082L,0x0000140001001480L});
	public static final BitSet FOLLOW_assignmentOperator_in_assignment2198 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_ternary_in_assignment2200 = new BitSet(new long[]{0x0000001100029082L,0x0000140001001480L});
	public static final BitSet FOLLOW_logicOr_in_ternary2210 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2213 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ternary2216 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2218 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ternary2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LogicOr_in_logicOr2234 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAnd_in_logicOr2237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_LogicAnd_in_logicAnd2249 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicAnd2252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2263 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BitwiseOr_in_bitwiseOr2266 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseXor_in_bitwiseOr2269 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2280 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BitwiseXor_in_bitwiseXor2283 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseAnd_in_bitwiseXor2286 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2297 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_BitwiseAnd_in_bitwiseAnd2300 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_equality_in_bitwiseAnd2303 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_comparison_in_equality2312 = new BitSet(new long[]{0x0010020000000002L,0x0000000000070000L});
	public static final BitSet FOLLOW_equalityOperator_in_equality2315 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_comparison_in_equality2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2360 = new BitSet(new long[]{0xC006000000000002L});
	public static final BitSet FOLLOW_comparisonOperator_in_comparison2363 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_bitwiseShift_in_comparison2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2402 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_set_in_bitwiseShift2405 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_termOrStringConcatenation_in_bitwiseShift2412 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2422 = new BitSet(new long[]{0x0000000800000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_set_in_termOrStringConcatenation2425 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_factor_in_termOrStringConcatenation2434 = new BitSet(new long[]{0x0000000800000002L,0x0000000000800040L});
	public static final BitSet FOLLOW_logicNot_in_factor2444 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_set_in_factor2447 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicNot_in_factor2456 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000A00L});
	public static final BitSet FOLLOW_LogicNot_in_logicNot2465 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicNot_in_logicNot2467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicNot2472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_instanceOf2484 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2487 = new BitSet(new long[]{0x0020000000000400L,0x1000000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_instanceOf2491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instanceOf2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_castOrBitwiseNotOrAt2506 = new BitSet(new long[]{0x0020000000000400L,0x05F8000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_castOrBitwiseNotOrAt2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_castOrBitwiseNotOrAt2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_castOrBitwiseNotOrAt2514 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_castOrBitwiseNotOrAt2522 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_castOrBitwiseNotOrAt2530 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_castOrBitwiseNotOrAt2533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_castOrBitwiseNotOrAt2538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone2549 = new BitSet(new long[]{0x0020000000000400L,0x1001008000400000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_newOrClone2551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newObject_in_newOrClone2556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPrimary_in_newOrClone2561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_variableMemberStaticMember2574 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2576 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2578 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2584 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2586 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2592 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_variableMemberStaticMember2594 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_This_in_variableMemberStaticMember2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableMemberStaticMember2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccessOrParent2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccessOrParent2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_staticAccessOrParent2626 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DoubleColon_in_staticAccessOrParent2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_memberAccessOrArrayAccess2638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_memberAccessOrArrayAccess2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_memberAccess2653 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_memberAccess2655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_arrayAccess2665 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_arrayAccess2667 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_arrayAccess2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2682 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newObject2689 = new BitSet(new long[]{0x0020000000000400L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_newObject2691 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_newObject2693 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_newObject2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_newObject2698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimary2707 = new BitSet(new long[]{0x3220200000040400L,0x1009408002482100L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimary2714 = new BitSet(new long[]{0x3220200000040400L,0x1009408002482100L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryPrimary2721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_primary2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_primary2736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary2741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_functionCallFluentInclAccessAtTheEnd2753 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_functionCallFluentInclAccessAtTheEnd2755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2767 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_functionCallFluentWithoutAccessAtTheEnd2769 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_functionCallFluentWithoutAccessAtTheEnd2777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_functionCallFluentWithoutAccessAtTheEnd2779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_classInterfaceTypeWithoutObject_in_functionCall2791 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_functionCall2793 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_functionCall2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_functionCall2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_callOrAccess2809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_callOrAccess2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectOperator_in_call2827 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_call2829 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_call2831 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_call2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_call2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_methodCallFluentInclAccessAtTheEnd2846 = new BitSet(new long[]{0x2000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_memberAccessOrArrayAccess_in_methodCallFluentInclAccessAtTheEnd2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2862 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_methodCallFluentWithoutAccessAtTheEnd2864 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_methodCallFluentWithoutAccessAtTheEnd2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_methodCallFluentWithoutAccessAtTheEnd2874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_methodCall2888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_ObjectOperator_in_methodCall2890 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_methodCall2895 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall2898 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_methodCall2900 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_expressionList_in_methodCall2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_methodCall2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_atom2914 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_atom2916 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_atom2918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_atom2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_atom2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_atom2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_atom2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_atom2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_globalConstant2960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticAccessOrParent_in_classConstant2971 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_Identifier_in_classConstant2973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Plus_in_unaryPrimitiveAtom2985 = new BitSet(new long[]{0x0220200000040000L,0x0000400000082000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unaryPrimitiveAtom2992 = new BitSet(new long[]{0x0220200000040000L,0x0000400000082000L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_unaryPrimitiveAtom2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftSquareBrace_in_array3502 = new BitSet(new long[]{0x3220200000842500L,0x1009409002C8A144L});
	public static final BitSet FOLLOW_array_content_in_array3504 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RightSquareBrace_in_array3507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_array3513 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_array3515 = new BitSet(new long[]{0x3220200000842500L,0x1009408802C8A144L});
	public static final BitSet FOLLOW_array_content_in_array3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_array3520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_content3533 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3535 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3539 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_array_content3543 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3546 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_array_content3548 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_array_content3552 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_If_in_ifCondition3564 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_ifCondition3566 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_ifCondition3568 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_ifCondition3570 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3572 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_Else_in_ifCondition3579 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_ifCondition3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_switchCondition3597 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_switchCondition3599 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_switchCondition3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_switchCondition3603 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_switchCondition3605 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3616 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3619 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3624 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3626 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3630 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3633 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_caseLabel_in_switchCondition3643 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3646 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_defaultLabel_in_switchCondition3652 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_switchCondition3654 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_switchCondition3665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_caseLabel3677 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_caseLabel3679 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_caseLabel3681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_defaultLabel3690 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Colon_in_defaultLabel3692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3701 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_forLoop3703 = new BitSet(new long[]{0x0020000000000400L,0x17F9018002400100L});
	public static final BitSet FOLLOW_forInit_in_forLoop3705 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3708 = new BitSet(new long[]{0x3220200000842500L,0x1009418002C8A144L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3710 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_forLoop3714 = new BitSet(new long[]{0x0020000000000400L,0x1001008802400100L});
	public static final BitSet FOLLOW_forUpdate_in_forLoop3716 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_forLoop3719 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_forLoop3721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_forInit3730 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3732 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forInit3736 = new BitSet(new long[]{0x0020000000000400L,0x1001008002400100L});
	public static final BitSet FOLLOW_variableAssignment_in_forInit3738 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3748 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Comma_in_forUpdate3751 = new BitSet(new long[]{0x0020000000000400L,0x1001008002400100L});
	public static final BitSet FOLLOW_variableAssignment_in_forUpdate3753 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3764 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_foreachLoop3766 = new BitSet(new long[]{0x2000000000000000L,0x1008000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3769 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_in_foreachLoop3771 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_As_in_foreachLoop3774 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3776 = new BitSet(new long[]{0x0000000000000020L,0x0000000800000000L});
	public static final BitSet FOLLOW_Arrow_in_foreachLoop3779 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_foreachLoop3785 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_foreachLoop3787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileLoop3796 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_whileLoop3798 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_whileLoop3800 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_whileLoop3802 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_whileLoop3804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3814 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_doWhileLoop3816 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_While_in_doWhileLoop3818 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_doWhileLoop3820 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_doWhileLoop3824 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_doWhileLoop3826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Try_in_tryCatch3833 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3835 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3837 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3840 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Catch_in_tryCatch3842 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LeftParanthesis_in_tryCatch3844 = new BitSet(new long[]{0x0020000000000400L,0x0100000000000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_tryCatch3846 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_VariableId_in_tryCatch3848 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_tryCatch3850 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LeftCurlyBrace_in_tryCatch3851 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_tryCatch3853 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808602400100L});
	public static final BitSet FOLLOW_RightCurlyBrace_in_tryCatch3856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_throwException3865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_newObject_in_throwException3867 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_throwException3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableAssignment_in_synpred69_TSPHP1844 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred69_TSPHP1846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_synpred70_TSPHP1851 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred70_TSPHP1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentWithoutAccessAtTheEnd_in_synpred79_TSPHP1898 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred79_TSPHP1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentWithoutAccessAtTheEnd_in_synpred80_TSPHP1905 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_Semicolon_in_synpred80_TSPHP1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicOrWeak_in_synpred101_TSPHP2143 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicXorWeak_in_synpred101_TSPHP2146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicXorWeak_in_synpred102_TSPHP2162 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_logicAndWeak_in_synpred102_TSPHP2165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicAndWeak_in_synpred103_TSPHP2181 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_assignment_in_synpred103_TSPHP2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred104_TSPHP2198 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A144L});
	public static final BitSet FOLLOW_ternary_in_synpred104_TSPHP2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParanthesis_in_synpred132_TSPHP2506 = new BitSet(new long[]{0x0020000000000400L,0x05F8000000000000L});
	public static final BitSet FOLLOW_primitiveTypesInclArray_in_synpred132_TSPHP2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_classInterfaceTypeInclObject_in_synpred132_TSPHP2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RightParanthesis_in_synpred132_TSPHP2514 = new BitSet(new long[]{0x3220200000842500L,0x1009408002C8A140L});
	public static final BitSet FOLLOW_castOrBitwiseNotOrAt_in_synpred132_TSPHP2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallFluentInclAccessAtTheEnd_in_synpred151_TSPHP2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallFluentInclAccessAtTheEnd_in_synpred152_TSPHP2736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred154_TSPHP2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_synpred155_TSPHP2767 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred155_TSPHP2769 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred155_TSPHP2772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred161_TSPHP2864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_synpred162_TSPHP2862 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_callOrAccess_in_synpred162_TSPHP2864 = new BitSet(new long[]{0x2000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_call_in_synpred162_TSPHP2867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementDecrement_in_synpred167_TSPHP2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableMemberStaticMember_in_synpred168_TSPHP2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classConstant_in_synpred169_TSPHP2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalConstant_in_synpred170_TSPHP2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred183_TSPHP3533 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred183_TSPHP3535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred184_TSPHP3546 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Arrow_in_synpred184_TSPHP3548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_synpred186_TSPHP3579 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred186_TSPHP3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabel_in_synpred194_TSPHP3616 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3619 = new BitSet(new long[]{0x0860C48250180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_defaultLabel_in_synpred194_TSPHP3624 = new BitSet(new long[]{0x0860C48210080400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3626 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_caseLabel_in_synpred194_TSPHP3630 = new BitSet(new long[]{0x0860C48210180400L,0x57FF808202400100L});
	public static final BitSet FOLLOW_instructionInclBreakContinue_in_synpred194_TSPHP3633 = new BitSet(new long[]{0x0860C48210180402L,0x57FF808202400100L});
}
