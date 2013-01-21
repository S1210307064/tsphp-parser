// $ANTLR 3.x D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2013-01-21 21:24:01

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

@SuppressWarnings("all")
public class TSPHPLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TSPHPLexer() {} 
	public TSPHPLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TSPHPLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }

	// $ANTLR start "Abstract"
	public final void mAbstract() throws RecognitionException {
		try {
			int _type = Abstract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:10: ( 'abstract' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:12: 'abstract'
			{
			match("abstract"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Abstract"

	// $ANTLR start "Arrow"
	public final void mArrow() throws RecognitionException {
		try {
			int _type = Arrow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:7: ( '=>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:9: '=>'
			{
			match("=>"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Arrow"

	// $ANTLR start "As"
	public final void mAs() throws RecognitionException {
		try {
			int _type = As;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:4: ( 'as' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:6: 'as'
			{
			match("as"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "As"

	// $ANTLR start "Assign"
	public final void mAssign() throws RecognitionException {
		try {
			int _type = Assign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:8: ( '=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:10: '='
			{
			match('='); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assign"

	// $ANTLR start "At"
	public final void mAt() throws RecognitionException {
		try {
			int _type = At;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:4: ( '@' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:6: '@'
			{
			match('@'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "At"

	// $ANTLR start "Backslash"
	public final void mBackslash() throws RecognitionException {
		try {
			int _type = Backslash;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:11: ( '\\\\' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:13: '\\\\'
			{
			match('\\'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Backslash"

	// $ANTLR start "BitwiseAnd"
	public final void mBitwiseAnd() throws RecognitionException {
		try {
			int _type = BitwiseAnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:12: ( '&' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:14: '&'
			{
			match('&'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseAnd"

	// $ANTLR start "BitwiseAndEqual"
	public final void mBitwiseAndEqual() throws RecognitionException {
		try {
			int _type = BitwiseAndEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:17: ( '&=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:19: '&='
			{
			match("&="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseAndEqual"

	// $ANTLR start "BitwiseNot"
	public final void mBitwiseNot() throws RecognitionException {
		try {
			int _type = BitwiseNot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:12: ( '~' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:14: '~'
			{
			match('~'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseNot"

	// $ANTLR start "BitwiseOr"
	public final void mBitwiseOr() throws RecognitionException {
		try {
			int _type = BitwiseOr;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:11: ( '|' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:13: '|'
			{
			match('|'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseOr"

	// $ANTLR start "BitwiseOrEqual"
	public final void mBitwiseOrEqual() throws RecognitionException {
		try {
			int _type = BitwiseOrEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:16: ( '|=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:18: '|='
			{
			match("|="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseOrEqual"

	// $ANTLR start "BitwiseXor"
	public final void mBitwiseXor() throws RecognitionException {
		try {
			int _type = BitwiseXor;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:12: ( '^' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:14: '^'
			{
			match('^'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseXor"

	// $ANTLR start "BitwiseXorEqual"
	public final void mBitwiseXorEqual() throws RecognitionException {
		try {
			int _type = BitwiseXorEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:17: ( '^=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:19: '^='
			{
			match("^="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BitwiseXorEqual"

	// $ANTLR start "Break"
	public final void mBreak() throws RecognitionException {
		try {
			int _type = Break;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:7: ( 'break' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:9: 'break'
			{
			match("break"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Break"

	// $ANTLR start "Case"
	public final void mCase() throws RecognitionException {
		try {
			int _type = Case;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:6: ( 'case' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:8: 'case'
			{
			match("case"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Case"

	// $ANTLR start "Catch"
	public final void mCatch() throws RecognitionException {
		try {
			int _type = Catch;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:7: ( 'catch' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:9: 'catch'
			{
			match("catch"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Catch"

	// $ANTLR start "Class"
	public final void mClass() throws RecognitionException {
		try {
			int _type = Class;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:7: ( 'class' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:9: 'class'
			{
			match("class"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Class"

	// $ANTLR start "Clone"
	public final void mClone() throws RecognitionException {
		try {
			int _type = Clone;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:7: ( 'clone' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:9: 'clone'
			{
			match("clone"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Clone"

	// $ANTLR start "Colon"
	public final void mColon() throws RecognitionException {
		try {
			int _type = Colon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:7: ( ':' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:9: ':'
			{
			match(':'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Colon"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:7: ( ',' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:9: ','
			{
			match(','); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "Const"
	public final void mConst() throws RecognitionException {
		try {
			int _type = Const;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:7: ( 'const' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:9: 'const'
			{
			match("const"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Const"

	// $ANTLR start "Continue"
	public final void mContinue() throws RecognitionException {
		try {
			int _type = Continue;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:10: ( 'continue' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:12: 'continue'
			{
			match("continue"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Continue"

	// $ANTLR start "Default"
	public final void mDefault() throws RecognitionException {
		try {
			int _type = Default;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:44:9: ( 'default' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:44:11: 'default'
			{
			match("default"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Default"

	// $ANTLR start "Divide"
	public final void mDivide() throws RecognitionException {
		try {
			int _type = Divide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:45:8: ( '/' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:45:10: '/'
			{
			match('/'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Divide"

	// $ANTLR start "DivideEqual"
	public final void mDivideEqual() throws RecognitionException {
		try {
			int _type = DivideEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:46:13: ( '/=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:46:15: '/='
			{
			match("/="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DivideEqual"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:47:4: ( 'do' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:47:6: 'do'
			{
			match("do"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "Dolar"
	public final void mDolar() throws RecognitionException {
		try {
			int _type = Dolar;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:48:7: ( '$' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:48:9: '$'
			{
			match('$'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dolar"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:49:5: ( '.' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:49:7: '.'
			{
			match('.'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "DotEqual"
	public final void mDotEqual() throws RecognitionException {
		try {
			int _type = DotEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:50:10: ( '.=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:50:12: '.='
			{
			match(".="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotEqual"

	// $ANTLR start "DoubleColon"
	public final void mDoubleColon() throws RecognitionException {
		try {
			int _type = DoubleColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:51:13: ( '::' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:51:15: '::'
			{
			match("::"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DoubleColon"

	// $ANTLR start "Echo"
	public final void mEcho() throws RecognitionException {
		try {
			int _type = Echo;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:52:6: ( 'echo' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:52:8: 'echo'
			{
			match("echo"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Echo"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:6: ( 'else' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:8: 'else'
			{
			match("else"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Else"

	// $ANTLR start "Equal"
	public final void mEqual() throws RecognitionException {
		try {
			int _type = Equal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:7: ( '==' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:9: '=='
			{
			match("=="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equal"

	// $ANTLR start "Exit"
	public final void mExit() throws RecognitionException {
		try {
			int _type = Exit;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:6: ( 'exit' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:8: 'exit'
			{
			match("exit"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exit"

	// $ANTLR start "Extends"
	public final void mExtends() throws RecognitionException {
		try {
			int _type = Extends;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:9: ( 'extends' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:11: 'extends'
			{
			match("extends"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Extends"

	// $ANTLR start "Final"
	public final void mFinal() throws RecognitionException {
		try {
			int _type = Final;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:7: ( 'final' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:9: 'final'
			{
			match("final"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Final"

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:5: ( 'for' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:7: 'for'
			{
			match("for"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "For"

	// $ANTLR start "Foreach"
	public final void mForeach() throws RecognitionException {
		try {
			int _type = Foreach;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:9: ( 'foreach' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:11: 'foreach'
			{
			match("foreach"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Foreach"

	// $ANTLR start "Function"
	public final void mFunction() throws RecognitionException {
		try {
			int _type = Function;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:10: ( 'function' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:12: 'function'
			{
			match("function"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Function"

	// $ANTLR start "GreaterEqualThan"
	public final void mGreaterEqualThan() throws RecognitionException {
		try {
			int _type = GreaterEqualThan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:18: ( '>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:20: '>='
			{
			match(">="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GreaterEqualThan"

	// $ANTLR start "GreaterThan"
	public final void mGreaterThan() throws RecognitionException {
		try {
			int _type = GreaterThan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:13: ( '>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:15: '>'
			{
			match('>'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GreaterThan"

	// $ANTLR start "Identical"
	public final void mIdentical() throws RecognitionException {
		try {
			int _type = Identical;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:11: ( '===' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:13: '==='
			{
			match("==="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identical"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:4: ( 'if' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:6: 'if'
			{
			match("if"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "If"

	// $ANTLR start "Implements"
	public final void mImplements() throws RecognitionException {
		try {
			int _type = Implements;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:12: ( 'implements' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:14: 'implements'
			{
			match("implements"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Implements"

	// $ANTLR start "Instanceof"
	public final void mInstanceof() throws RecognitionException {
		try {
			int _type = Instanceof;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:12: ( 'instanceof' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:14: 'instanceof'
			{
			match("instanceof"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Instanceof"

	// $ANTLR start "Interface"
	public final void mInterface() throws RecognitionException {
		try {
			int _type = Interface;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:11: ( 'interface' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:13: 'interface'
			{
			match("interface"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Interface"

	// $ANTLR start "LeftCurlyBrace"
	public final void mLeftCurlyBrace() throws RecognitionException {
		try {
			int _type = LeftCurlyBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:68:16: ( '{' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:68:18: '{'
			{
			match('{'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LeftCurlyBrace"

	// $ANTLR start "LeftParanthesis"
	public final void mLeftParanthesis() throws RecognitionException {
		try {
			int _type = LeftParanthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:69:17: ( '(' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:69:19: '('
			{
			match('('); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LeftParanthesis"

	// $ANTLR start "LeftSquareBrace"
	public final void mLeftSquareBrace() throws RecognitionException {
		try {
			int _type = LeftSquareBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:70:17: ( '[' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:70:19: '['
			{
			match('['); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LeftSquareBrace"

	// $ANTLR start "LessEqualThan"
	public final void mLessEqualThan() throws RecognitionException {
		try {
			int _type = LessEqualThan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:71:15: ( '<=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:71:17: '<='
			{
			match("<="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LessEqualThan"

	// $ANTLR start "LessThan"
	public final void mLessThan() throws RecognitionException {
		try {
			int _type = LessThan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:72:10: ( '<' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:72:12: '<'
			{
			match('<'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LessThan"

	// $ANTLR start "LogicAnd"
	public final void mLogicAnd() throws RecognitionException {
		try {
			int _type = LogicAnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:10: ( '&&' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:73:12: '&&'
			{
			match("&&"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicAnd"

	// $ANTLR start "LogicAndWeak"
	public final void mLogicAndWeak() throws RecognitionException {
		try {
			int _type = LogicAndWeak;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:74:14: ( 'and' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:74:16: 'and'
			{
			match("and"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicAndWeak"

	// $ANTLR start "LogicNot"
	public final void mLogicNot() throws RecognitionException {
		try {
			int _type = LogicNot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:75:10: ( '!' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:75:12: '!'
			{
			match('!'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicNot"

	// $ANTLR start "LogicOr"
	public final void mLogicOr() throws RecognitionException {
		try {
			int _type = LogicOr;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:76:9: ( '||' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:76:11: '||'
			{
			match("||"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicOr"

	// $ANTLR start "LogicOrWeak"
	public final void mLogicOrWeak() throws RecognitionException {
		try {
			int _type = LogicOrWeak;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:77:13: ( 'or' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:77:15: 'or'
			{
			match("or"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicOrWeak"

	// $ANTLR start "LogicXorWeak"
	public final void mLogicXorWeak() throws RecognitionException {
		try {
			int _type = LogicXorWeak;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:78:14: ( 'xor' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:78:16: 'xor'
			{
			match("xor"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicXorWeak"

	// $ANTLR start "Minus"
	public final void mMinus() throws RecognitionException {
		try {
			int _type = Minus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:79:7: ( '-' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:79:9: '-'
			{
			match('-'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Minus"

	// $ANTLR start "MinusEqual"
	public final void mMinusEqual() throws RecognitionException {
		try {
			int _type = MinusEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:80:12: ( '-=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:80:14: '-='
			{
			match("-="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MinusEqual"

	// $ANTLR start "MinusMinus"
	public final void mMinusMinus() throws RecognitionException {
		try {
			int _type = MinusMinus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:81:12: ( '--' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:81:14: '--'
			{
			match("--"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MinusMinus"

	// $ANTLR start "Modulo"
	public final void mModulo() throws RecognitionException {
		try {
			int _type = Modulo;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:82:8: ( '%' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:82:10: '%'
			{
			match('%'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Modulo"

	// $ANTLR start "ModuloEqual"
	public final void mModuloEqual() throws RecognitionException {
		try {
			int _type = ModuloEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:83:13: ( '%=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:83:15: '%='
			{
			match("%="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ModuloEqual"

	// $ANTLR start "Multiply"
	public final void mMultiply() throws RecognitionException {
		try {
			int _type = Multiply;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:84:10: ( '*' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:84:12: '*'
			{
			match('*'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Multiply"

	// $ANTLR start "MultiplyEqual"
	public final void mMultiplyEqual() throws RecognitionException {
		try {
			int _type = MultiplyEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:85:15: ( '*=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:85:17: '*='
			{
			match("*="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MultiplyEqual"

	// $ANTLR start "Namespace"
	public final void mNamespace() throws RecognitionException {
		try {
			int _type = Namespace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:86:11: ( 'namespace' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:86:13: 'namespace'
			{
			match("namespace"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Namespace"

	// $ANTLR start "New"
	public final void mNew() throws RecognitionException {
		try {
			int _type = New;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:87:5: ( 'new' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:87:7: 'new'
			{
			match("new"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "New"

	// $ANTLR start "NotEqual"
	public final void mNotEqual() throws RecognitionException {
		try {
			int _type = NotEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:88:10: ( '!=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:88:12: '!='
			{
			match("!="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NotEqual"

	// $ANTLR start "NotEqualAlternative"
	public final void mNotEqualAlternative() throws RecognitionException {
		try {
			int _type = NotEqualAlternative;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:21: ( '<>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:89:23: '<>'
			{
			match("<>"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NotEqualAlternative"

	// $ANTLR start "NotIdentical"
	public final void mNotIdentical() throws RecognitionException {
		try {
			int _type = NotIdentical;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:90:14: ( '!==' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:90:16: '!=='
			{
			match("!=="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NotIdentical"

	// $ANTLR start "Null"
	public final void mNull() throws RecognitionException {
		try {
			int _type = Null;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:91:6: ( 'null' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:91:8: 'null'
			{
			match("null"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Null"

	// $ANTLR start "ObjectOperator"
	public final void mObjectOperator() throws RecognitionException {
		try {
			int _type = ObjectOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:92:16: ( '->' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:92:18: '->'
			{
			match("->"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ObjectOperator"

	// $ANTLR start "Parent"
	public final void mParent() throws RecognitionException {
		try {
			int _type = Parent;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:93:8: ( 'parent' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:93:10: 'parent'
			{
			match("parent"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Parent"

	// $ANTLR start "ParentColonColon"
	public final void mParentColonColon() throws RecognitionException {
		try {
			int _type = ParentColonColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:94:18: ( 'parent::' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:94:20: 'parent::'
			{
			match("parent::"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ParentColonColon"

	// $ANTLR start "Plus"
	public final void mPlus() throws RecognitionException {
		try {
			int _type = Plus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:6: ( '+' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:95:8: '+'
			{
			match('+'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Plus"

	// $ANTLR start "PlusEqual"
	public final void mPlusEqual() throws RecognitionException {
		try {
			int _type = PlusEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:96:11: ( '+=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:96:13: '+='
			{
			match("+="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PlusEqual"

	// $ANTLR start "PlusPlus"
	public final void mPlusPlus() throws RecognitionException {
		try {
			int _type = PlusPlus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:97:10: ( '++' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:97:12: '++'
			{
			match("++"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PlusPlus"

	// $ANTLR start "Private"
	public final void mPrivate() throws RecognitionException {
		try {
			int _type = Private;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:9: ( 'private' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:98:11: 'private'
			{
			match("private"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Private"

	// $ANTLR start "ProtectThis"
	public final void mProtectThis() throws RecognitionException {
		try {
			int _type = ProtectThis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:99:13: ( 'this' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:99:15: 'this'
			{
			match("this"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ProtectThis"

	// $ANTLR start "Protected"
	public final void mProtected() throws RecognitionException {
		try {
			int _type = Protected;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:100:11: ( 'protected' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:100:13: 'protected'
			{
			match("protected"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Protected"

	// $ANTLR start "Public"
	public final void mPublic() throws RecognitionException {
		try {
			int _type = Public;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:8: ( 'public' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:101:10: 'public'
			{
			match("public"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Public"

	// $ANTLR start "QuestionMark"
	public final void mQuestionMark() throws RecognitionException {
		try {
			int _type = QuestionMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:102:14: ( '?' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:102:16: '?'
			{
			match('?'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuestionMark"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:103:8: ( 'return' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:103:10: 'return'
			{
			match("return"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Return"

	// $ANTLR start "RightCurlyBrace"
	public final void mRightCurlyBrace() throws RecognitionException {
		try {
			int _type = RightCurlyBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:17: ( '}' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:104:19: '}'
			{
			match('}'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RightCurlyBrace"

	// $ANTLR start "RightParanthesis"
	public final void mRightParanthesis() throws RecognitionException {
		try {
			int _type = RightParanthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:18: ( ')' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:105:20: ')'
			{
			match(')'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RightParanthesis"

	// $ANTLR start "RightSquareBrace"
	public final void mRightSquareBrace() throws RecognitionException {
		try {
			int _type = RightSquareBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:106:18: ( ']' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:106:20: ']'
			{
			match(']'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RightSquareBrace"

	// $ANTLR start "Self"
	public final void mSelf() throws RecognitionException {
		try {
			int _type = Self;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:107:6: ( 'self' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:107:8: 'self'
			{
			match("self"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Self"

	// $ANTLR start "SelfColonColon"
	public final void mSelfColonColon() throws RecognitionException {
		try {
			int _type = SelfColonColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:108:16: ( 'self::' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:108:18: 'self::'
			{
			match("self::"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SelfColonColon"

	// $ANTLR start "Semicolon"
	public final void mSemicolon() throws RecognitionException {
		try {
			int _type = Semicolon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:11: ( ';' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:109:13: ';'
			{
			match(';'); if (state.failed) return ;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Semicolon"

	// $ANTLR start "ShiftLeft"
	public final void mShiftLeft() throws RecognitionException {
		try {
			int _type = ShiftLeft;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:110:11: ( '<<' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:110:13: '<<'
			{
			match("<<"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShiftLeft"

	// $ANTLR start "ShiftLeftEqual"
	public final void mShiftLeftEqual() throws RecognitionException {
		try {
			int _type = ShiftLeftEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:16: ( '<<=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:111:18: '<<='
			{
			match("<<="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShiftLeftEqual"

	// $ANTLR start "ShiftRight"
	public final void mShiftRight() throws RecognitionException {
		try {
			int _type = ShiftRight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:112:12: ( '>>' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:112:14: '>>'
			{
			match(">>"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShiftRight"

	// $ANTLR start "ShiftRightEqual"
	public final void mShiftRightEqual() throws RecognitionException {
		try {
			int _type = ShiftRightEqual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:17: ( '>>=' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:113:19: '>>='
			{
			match(">>="); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShiftRightEqual"

	// $ANTLR start "Static"
	public final void mStatic() throws RecognitionException {
		try {
			int _type = Static;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:8: ( 'static' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:114:10: 'static'
			{
			match("static"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Static"

	// $ANTLR start "Switch"
	public final void mSwitch() throws RecognitionException {
		try {
			int _type = Switch;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:8: ( 'switch' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:115:10: 'switch'
			{
			match("switch"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Switch"

	// $ANTLR start "This"
	public final void mThis() throws RecognitionException {
		try {
			int _type = This;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:116:6: ( '$this' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:116:8: '$this'
			{
			match("$this"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "This"

	// $ANTLR start "Throw"
	public final void mThrow() throws RecognitionException {
		try {
			int _type = Throw;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:117:7: ( 'throw' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:117:9: 'throw'
			{
			match("throw"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Throw"

	// $ANTLR start "Try"
	public final void mTry() throws RecognitionException {
		try {
			int _type = Try;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:5: ( 'try' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:118:7: 'try'
			{
			match("try"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Try"

	// $ANTLR start "TypeArray"
	public final void mTypeArray() throws RecognitionException {
		try {
			int _type = TypeArray;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:11: ( 'array' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:119:13: 'array'
			{
			match("array"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeArray"

	// $ANTLR start "TypeBool"
	public final void mTypeBool() throws RecognitionException {
		try {
			int _type = TypeBool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:10: ( 'bool' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:120:12: 'bool'
			{
			match("bool"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeBool"

	// $ANTLR start "TypeBoolean"
	public final void mTypeBoolean() throws RecognitionException {
		try {
			int _type = TypeBoolean;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:13: ( 'boolean' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:121:15: 'boolean'
			{
			match("boolean"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeBoolean"

	// $ANTLR start "TypeFloat"
	public final void mTypeFloat() throws RecognitionException {
		try {
			int _type = TypeFloat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:11: ( 'float' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:122:13: 'float'
			{
			match("float"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeFloat"

	// $ANTLR start "TypeInt"
	public final void mTypeInt() throws RecognitionException {
		try {
			int _type = TypeInt;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:9: ( 'int' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:123:11: 'int'
			{
			match("int"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeInt"

	// $ANTLR start "TypeObject"
	public final void mTypeObject() throws RecognitionException {
		try {
			int _type = TypeObject;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:124:12: ( 'object' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:124:14: 'object'
			{
			match("object"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeObject"

	// $ANTLR start "TypeResource"
	public final void mTypeResource() throws RecognitionException {
		try {
			int _type = TypeResource;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:125:14: ( 'resource' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:125:16: 'resource'
			{
			match("resource"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeResource"

	// $ANTLR start "TypeString"
	public final void mTypeString() throws RecognitionException {
		try {
			int _type = TypeString;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:126:12: ( 'string' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:126:14: 'string'
			{
			match("string"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TypeString"

	// $ANTLR start "Use"
	public final void mUse() throws RecognitionException {
		try {
			int _type = Use;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:127:5: ( 'use' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:127:7: 'use'
			{
			match("use"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Use"

	// $ANTLR start "Void"
	public final void mVoid() throws RecognitionException {
		try {
			int _type = Void;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:6: ( 'void' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:8: 'void'
			{
			match("void"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Void"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:7: ( 'while' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:129:9: 'while'
			{
			match("while"); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "While"

	// $ANTLR start "Bool"
	public final void mBool() throws RecognitionException {
		try {
			int _type = Bool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:6: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:8: 'true'
					{
					match("true"); if (state.failed) return ;

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:214:15: 'false'
					{
					match("false"); if (state.failed) return ;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Bool"

	// $ANTLR start "NullVariations"
	public final void mNullVariations() throws RecognitionException {
		try {
			int _type = NullVariations;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:2: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:218:4: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NullVariations"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u00FF') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:222:47: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')||(LA2_0 >= '\u007F' && LA2_0 <= '\u00FF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u00FF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "VariableId"
	public final void mVariableId() throws RecognitionException {
		try {
			int _type = VariableId;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:2: ( '$' Identifier )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:400:4: '$' Identifier
			{
			match('$'); if (state.failed) return ;
			mIdentifier(); if (state.failed) return ;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VariableId"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			int _type = Int;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:9: ( DECIMAL | HEXADECIMAL | OCTAL | BINARY )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='0') ) {
				switch ( input.LA(2) ) {
				case 'X':
				case 'x':
					{
					alt3=2;
					}
					break;
				case 'b':
					{
					alt3=4;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					alt3=1;
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:684:12: DECIMAL
					{
					mDECIMAL(); if (state.failed) return ;

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:685:12: HEXADECIMAL
					{
					mHEXADECIMAL(); if (state.failed) return ;

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:686:12: OCTAL
					{
					mOCTAL(); if (state.failed) return ;

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:687:12: BINARY
					{
					mBINARY(); if (state.failed) return ;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			else if ( (LA5_0=='0') ) {
				alt5=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:4: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:693:15: ( '0' .. '9' )*
					loop4:
					do {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					} while (true);

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:694:12: '0'
					{
					match('0'); if (state.failed) return ;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "HEXADECIMAL"
	public final void mHEXADECIMAL() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
			{
			match('0'); if (state.failed) return ;
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:699:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'F')||(LA6_0 >= 'a' && LA6_0 <= 'f')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(6, input);
						throw eee;
				}
				cnt6++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEXADECIMAL"

	// $ANTLR start "OCTAL"
	public final void mOCTAL() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:2: ( '0' ( '0' .. '7' )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:4: '0' ( '0' .. '7' )+
			{
			match('0'); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:704:8: ( '0' .. '7' )+
			int cnt7=0;
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '7')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(7, input);
						throw eee;
				}
				cnt7++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL"

	// $ANTLR start "BINARY"
	public final void mBINARY() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:2: ( '0b' ( '0' | '1' )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:4: '0b' ( '0' | '1' )+
			{
			match("0b"); if (state.failed) return ;

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:710:8: ( '0' | '1' )+
			int cnt8=0;
			loop8:
			do {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '1')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(8, input);
						throw eee;
				}
				cnt8++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINARY"

	// $ANTLR start "Float"
	public final void mFloat() throws RecognitionException {
		try {
			int _type = Float;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:6: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt15=3;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:8: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:8: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					do {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(9, input);
								throw eee;
						}
						cnt9++;
					} while (true);

					match('.'); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:24: ( '0' .. '9' )*
					loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:36: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:714:36: EXPONENT
							{
							mEXPONENT(); if (state.failed) return ;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:8: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); if (state.failed) return ;
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:12: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					do {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(12, input);
								throw eee;
						}
						cnt12++;
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:24: ( EXPONENT )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:715:24: EXPONENT
							{
							mEXPONENT(); if (state.failed) return ;

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:716:8: ( '0' .. '9' )+ EXPONENT
					{
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:716:8: ( '0' .. '9' )+
					int cnt14=0;
					loop14:
					do {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return ;}
								EarlyExitException eee =
									new EarlyExitException(14, input);
								throw eee;
						}
						cnt14++;
					} while (true);

					mEXPONENT(); if (state.failed) return ;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Float"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:722:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:722:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:722:14: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:722:25: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return ;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
			} while (true);

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:725:2: ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\'') ) {
				alt18=1;
			}
			else if ( (LA18_0=='\"') ) {
				alt18=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:725:4: STRING_SINGLE_QUOTED
					{
					mSTRING_SINGLE_QUOTED(); if (state.failed) return ;

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:726:4: STRING_DOUBLE_QUOTED
					{
					mSTRING_DOUBLE_QUOTED(); if (state.failed) return ;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "STRING_SINGLE_QUOTED"
	public final void mSTRING_SINGLE_QUOTED() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:2: ( '\\'' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )* '\\'' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:4: '\\'' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )* '\\''
			{
			match('\''); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:732:9: ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )*
			loop19:
			do {
				int alt19=4;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\\') ) {
					int LA19_2 = input.LA(2);
					if ( (LA19_2=='\\') ) {
						int LA19_4 = input.LA(3);
						if ( (synpred1_TSPHP()) ) {
							alt19=1;
						}
						else if ( (true) ) {
							alt19=3;
						}

					}
					else if ( (LA19_2=='\'') ) {
						int LA19_5 = input.LA(3);
						if ( (LA19_5=='\'') && (synpred2_TSPHP())) {
							alt19=2;
						}
						else if ( (LA19_5=='\\') && (synpred2_TSPHP())) {
							alt19=2;
						}
						else if ( ((LA19_5 >= '\u0000' && LA19_5 <= '&')||(LA19_5 >= '(' && LA19_5 <= '[')||(LA19_5 >= ']' && LA19_5 <= '\uFFFF')) && (synpred2_TSPHP())) {
							alt19=2;
						}
						else {
							alt19=3;
						}

					}
					else if ( ((LA19_2 >= '\u0000' && LA19_2 <= '&')||(LA19_2 >= '(' && LA19_2 <= '[')||(LA19_2 >= ']' && LA19_2 <= '\uFFFF')) ) {
						alt19=3;
					}

				}
				else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '&')||(LA19_0 >= '(' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
					alt19=3;
				}

				switch (alt19) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:6: ( '\\\\\\\\' )=> '\\\\\\\\'
					{
					match("\\\\"); if (state.failed) return ;

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:734:7: ( '\\\\\\'' )=> '\\\\\\''
					{
					match("\\'"); if (state.failed) return ;

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:735:6: ~ ( '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop19;
				}
			} while (true);

			match('\''); if (state.failed) return ;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_SINGLE_QUOTED"

	// $ANTLR start "STRING_DOUBLE_QUOTED"
	public final void mSTRING_DOUBLE_QUOTED() throws RecognitionException {
		try {
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:740:6: ( '\"' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"' )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:740:8: '\"' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"'
			{
			match('\"'); if (state.failed) return ;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:740:12: ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )*
			loop20:
			do {
				int alt20=5;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\\') ) {
					int LA20_2 = input.LA(2);
					if ( (LA20_2=='\\') ) {
						int LA20_4 = input.LA(3);
						if ( (synpred3_TSPHP()) ) {
							alt20=1;
						}
						else if ( (true) ) {
							alt20=4;
						}

					}
					else if ( (LA20_2=='\"') ) {
						int LA20_5 = input.LA(3);
						if ( (LA20_5=='\"') && (synpred4_TSPHP())) {
							alt20=2;
						}
						else if ( (LA20_5=='\\') && (synpred4_TSPHP())) {
							alt20=2;
						}
						else if ( ((LA20_5 >= '\u0000' && LA20_5 <= '!')||LA20_5=='#'||(LA20_5 >= '%' && LA20_5 <= '[')||(LA20_5 >= ']' && LA20_5 <= '\uFFFF')) && (synpred4_TSPHP())) {
							alt20=2;
						}
						else {
							alt20=4;
						}

					}
					else if ( (LA20_2=='$') && (synpred5_TSPHP())) {
						alt20=3;
					}
					else if ( ((LA20_2 >= '\u0000' && LA20_2 <= '!')||LA20_2=='#'||(LA20_2 >= '%' && LA20_2 <= '[')||(LA20_2 >= ']' && LA20_2 <= '\uFFFF')) ) {
						alt20=4;
					}

				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||LA20_0=='#'||(LA20_0 >= '%' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
					alt20=4;
				}

				switch (alt20) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:6: ( '\\\\\\\\' )=> '\\\\\\\\'
					{
					match("\\\\"); if (state.failed) return ;

					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:742:7: ( '\\\\\"' )=> '\\\\\"'
					{
					match("\\\""); if (state.failed) return ;

					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:6: ( '\\\\$' )=> '\\\\$'
					{
					match("\\$"); if (state.failed) return ;

					}
					break;
				case 4 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:744:6: ~ ( '\"' | '$' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||input.LA(1)=='#'||(input.LA(1) >= '%' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return ;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			} while (true);

			match('\"'); if (state.failed) return ;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_DOUBLE_QUOTED"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:842:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt25=3;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:842:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); if (state.failed) return ;

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:842:9: (~ ( '\\n' | '\\r' ) )*
					loop21:
					do {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\t')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\uFFFF')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop21;
						}
					} while (true);

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:842:23: ( '\\r' )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0=='\r') ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:842:23: '\\r'
							{
							match('\r'); if (state.failed) return ;
							}
							break;

					}

					match('\n'); if (state.failed) return ;
					if ( state.backtracking==0 ) {_channel=HIDDEN;}
					}
					break;
				case 2 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:844:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); if (state.failed) return ;

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:844:11: (~ ( '\\n' | '\\r' ) )*
					loop23:
					do {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return ;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop23;
						}
					} while (true);

					if ( state.backtracking==0 ) {_channel=HIDDEN;}
					}
					break;
				case 3 :
					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:845:8: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); if (state.failed) return ;

					// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:845:13: ( options {greedy=false; } : . )*
					loop24:
					do {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0=='*') ) {
							int LA24_1 = input.LA(2);
							if ( (LA24_1=='/') ) {
								alt24=2;
							}
							else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '.')||(LA24_1 >= '0' && LA24_1 <= '\uFFFF')) ) {
								alt24=1;
							}

						}
						else if ( ((LA24_0 >= '\u0000' && LA24_0 <= ')')||(LA24_0 >= '+' && LA24_0 <= '\uFFFF')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:845:41: .
							{
							matchAny(); if (state.failed) return ;
							}
							break;

						default :
							break loop24;
						}
					} while (true);

					match("*/"); if (state.failed) return ;

					if ( state.backtracking==0 ) {_channel=HIDDEN;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "Whitespace"
	public final void mWhitespace() throws RecognitionException {
		try {
			int _type = Whitespace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:849:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:849:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return ;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Whitespace"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( Abstract | Arrow | As | Assign | At | Backslash | BitwiseAnd | BitwiseAndEqual | BitwiseNot | BitwiseOr | BitwiseOrEqual | BitwiseXor | BitwiseXorEqual | Break | Case | Catch | Class | Clone | Colon | Comma | Const | Continue | Default | Divide | DivideEqual | Do | Dolar | Dot | DotEqual | DoubleColon | Echo | Else | Equal | Exit | Extends | Final | For | Foreach | Function | GreaterEqualThan | GreaterThan | Identical | If | Implements | Instanceof | Interface | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LessEqualThan | LessThan | LogicAnd | LogicAndWeak | LogicNot | LogicOr | LogicOrWeak | LogicXorWeak | Minus | MinusEqual | MinusMinus | Modulo | ModuloEqual | Multiply | MultiplyEqual | Namespace | New | NotEqual | NotEqualAlternative | NotIdentical | Null | ObjectOperator | Parent | ParentColonColon | Plus | PlusEqual | PlusPlus | Private | ProtectThis | Protected | Public | QuestionMark | Return | RightCurlyBrace | RightParanthesis | RightSquareBrace | Self | SelfColonColon | Semicolon | ShiftLeft | ShiftLeftEqual | ShiftRight | ShiftRightEqual | Static | Switch | This | Throw | Try | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeObject | TypeResource | TypeString | Use | Void | While | Bool | NullVariations | Identifier | VariableId | Int | Float | String | Comment | Whitespace )
		int alt26=117;
		alt26 = dfa26.predict(input);
		switch (alt26) {
			case 1 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:10: Abstract
				{
				mAbstract(); if (state.failed) return ;

				}
				break;
			case 2 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:19: Arrow
				{
				mArrow(); if (state.failed) return ;

				}
				break;
			case 3 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:25: As
				{
				mAs(); if (state.failed) return ;

				}
				break;
			case 4 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:28: Assign
				{
				mAssign(); if (state.failed) return ;

				}
				break;
			case 5 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:35: At
				{
				mAt(); if (state.failed) return ;

				}
				break;
			case 6 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:38: Backslash
				{
				mBackslash(); if (state.failed) return ;

				}
				break;
			case 7 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:48: BitwiseAnd
				{
				mBitwiseAnd(); if (state.failed) return ;

				}
				break;
			case 8 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:59: BitwiseAndEqual
				{
				mBitwiseAndEqual(); if (state.failed) return ;

				}
				break;
			case 9 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:75: BitwiseNot
				{
				mBitwiseNot(); if (state.failed) return ;

				}
				break;
			case 10 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:86: BitwiseOr
				{
				mBitwiseOr(); if (state.failed) return ;

				}
				break;
			case 11 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:96: BitwiseOrEqual
				{
				mBitwiseOrEqual(); if (state.failed) return ;

				}
				break;
			case 12 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:111: BitwiseXor
				{
				mBitwiseXor(); if (state.failed) return ;

				}
				break;
			case 13 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:122: BitwiseXorEqual
				{
				mBitwiseXorEqual(); if (state.failed) return ;

				}
				break;
			case 14 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:138: Break
				{
				mBreak(); if (state.failed) return ;

				}
				break;
			case 15 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:144: Case
				{
				mCase(); if (state.failed) return ;

				}
				break;
			case 16 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:149: Catch
				{
				mCatch(); if (state.failed) return ;

				}
				break;
			case 17 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:155: Class
				{
				mClass(); if (state.failed) return ;

				}
				break;
			case 18 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:161: Clone
				{
				mClone(); if (state.failed) return ;

				}
				break;
			case 19 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:167: Colon
				{
				mColon(); if (state.failed) return ;

				}
				break;
			case 20 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:173: Comma
				{
				mComma(); if (state.failed) return ;

				}
				break;
			case 21 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:179: Const
				{
				mConst(); if (state.failed) return ;

				}
				break;
			case 22 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:185: Continue
				{
				mContinue(); if (state.failed) return ;

				}
				break;
			case 23 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:194: Default
				{
				mDefault(); if (state.failed) return ;

				}
				break;
			case 24 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:202: Divide
				{
				mDivide(); if (state.failed) return ;

				}
				break;
			case 25 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:209: DivideEqual
				{
				mDivideEqual(); if (state.failed) return ;

				}
				break;
			case 26 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:221: Do
				{
				mDo(); if (state.failed) return ;

				}
				break;
			case 27 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:224: Dolar
				{
				mDolar(); if (state.failed) return ;

				}
				break;
			case 28 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:230: Dot
				{
				mDot(); if (state.failed) return ;

				}
				break;
			case 29 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:234: DotEqual
				{
				mDotEqual(); if (state.failed) return ;

				}
				break;
			case 30 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:243: DoubleColon
				{
				mDoubleColon(); if (state.failed) return ;

				}
				break;
			case 31 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:255: Echo
				{
				mEcho(); if (state.failed) return ;

				}
				break;
			case 32 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:260: Else
				{
				mElse(); if (state.failed) return ;

				}
				break;
			case 33 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:265: Equal
				{
				mEqual(); if (state.failed) return ;

				}
				break;
			case 34 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:271: Exit
				{
				mExit(); if (state.failed) return ;

				}
				break;
			case 35 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:276: Extends
				{
				mExtends(); if (state.failed) return ;

				}
				break;
			case 36 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:284: Final
				{
				mFinal(); if (state.failed) return ;

				}
				break;
			case 37 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:290: For
				{
				mFor(); if (state.failed) return ;

				}
				break;
			case 38 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:294: Foreach
				{
				mForeach(); if (state.failed) return ;

				}
				break;
			case 39 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:302: Function
				{
				mFunction(); if (state.failed) return ;

				}
				break;
			case 40 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:311: GreaterEqualThan
				{
				mGreaterEqualThan(); if (state.failed) return ;

				}
				break;
			case 41 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:328: GreaterThan
				{
				mGreaterThan(); if (state.failed) return ;

				}
				break;
			case 42 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:340: Identical
				{
				mIdentical(); if (state.failed) return ;

				}
				break;
			case 43 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:350: If
				{
				mIf(); if (state.failed) return ;

				}
				break;
			case 44 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:353: Implements
				{
				mImplements(); if (state.failed) return ;

				}
				break;
			case 45 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:364: Instanceof
				{
				mInstanceof(); if (state.failed) return ;

				}
				break;
			case 46 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:375: Interface
				{
				mInterface(); if (state.failed) return ;

				}
				break;
			case 47 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:385: LeftCurlyBrace
				{
				mLeftCurlyBrace(); if (state.failed) return ;

				}
				break;
			case 48 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:400: LeftParanthesis
				{
				mLeftParanthesis(); if (state.failed) return ;

				}
				break;
			case 49 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:416: LeftSquareBrace
				{
				mLeftSquareBrace(); if (state.failed) return ;

				}
				break;
			case 50 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:432: LessEqualThan
				{
				mLessEqualThan(); if (state.failed) return ;

				}
				break;
			case 51 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:446: LessThan
				{
				mLessThan(); if (state.failed) return ;

				}
				break;
			case 52 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:455: LogicAnd
				{
				mLogicAnd(); if (state.failed) return ;

				}
				break;
			case 53 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:464: LogicAndWeak
				{
				mLogicAndWeak(); if (state.failed) return ;

				}
				break;
			case 54 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:477: LogicNot
				{
				mLogicNot(); if (state.failed) return ;

				}
				break;
			case 55 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:486: LogicOr
				{
				mLogicOr(); if (state.failed) return ;

				}
				break;
			case 56 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:494: LogicOrWeak
				{
				mLogicOrWeak(); if (state.failed) return ;

				}
				break;
			case 57 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:506: LogicXorWeak
				{
				mLogicXorWeak(); if (state.failed) return ;

				}
				break;
			case 58 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:519: Minus
				{
				mMinus(); if (state.failed) return ;

				}
				break;
			case 59 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:525: MinusEqual
				{
				mMinusEqual(); if (state.failed) return ;

				}
				break;
			case 60 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:536: MinusMinus
				{
				mMinusMinus(); if (state.failed) return ;

				}
				break;
			case 61 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:547: Modulo
				{
				mModulo(); if (state.failed) return ;

				}
				break;
			case 62 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:554: ModuloEqual
				{
				mModuloEqual(); if (state.failed) return ;

				}
				break;
			case 63 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:566: Multiply
				{
				mMultiply(); if (state.failed) return ;

				}
				break;
			case 64 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:575: MultiplyEqual
				{
				mMultiplyEqual(); if (state.failed) return ;

				}
				break;
			case 65 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:589: Namespace
				{
				mNamespace(); if (state.failed) return ;

				}
				break;
			case 66 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:599: New
				{
				mNew(); if (state.failed) return ;

				}
				break;
			case 67 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:603: NotEqual
				{
				mNotEqual(); if (state.failed) return ;

				}
				break;
			case 68 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:612: NotEqualAlternative
				{
				mNotEqualAlternative(); if (state.failed) return ;

				}
				break;
			case 69 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:632: NotIdentical
				{
				mNotIdentical(); if (state.failed) return ;

				}
				break;
			case 70 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:645: Null
				{
				mNull(); if (state.failed) return ;

				}
				break;
			case 71 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:650: ObjectOperator
				{
				mObjectOperator(); if (state.failed) return ;

				}
				break;
			case 72 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:665: Parent
				{
				mParent(); if (state.failed) return ;

				}
				break;
			case 73 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:672: ParentColonColon
				{
				mParentColonColon(); if (state.failed) return ;

				}
				break;
			case 74 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:689: Plus
				{
				mPlus(); if (state.failed) return ;

				}
				break;
			case 75 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:694: PlusEqual
				{
				mPlusEqual(); if (state.failed) return ;

				}
				break;
			case 76 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:704: PlusPlus
				{
				mPlusPlus(); if (state.failed) return ;

				}
				break;
			case 77 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:713: Private
				{
				mPrivate(); if (state.failed) return ;

				}
				break;
			case 78 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:721: ProtectThis
				{
				mProtectThis(); if (state.failed) return ;

				}
				break;
			case 79 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:733: Protected
				{
				mProtected(); if (state.failed) return ;

				}
				break;
			case 80 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:743: Public
				{
				mPublic(); if (state.failed) return ;

				}
				break;
			case 81 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:750: QuestionMark
				{
				mQuestionMark(); if (state.failed) return ;

				}
				break;
			case 82 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:763: Return
				{
				mReturn(); if (state.failed) return ;

				}
				break;
			case 83 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:770: RightCurlyBrace
				{
				mRightCurlyBrace(); if (state.failed) return ;

				}
				break;
			case 84 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:786: RightParanthesis
				{
				mRightParanthesis(); if (state.failed) return ;

				}
				break;
			case 85 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:803: RightSquareBrace
				{
				mRightSquareBrace(); if (state.failed) return ;

				}
				break;
			case 86 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:820: Self
				{
				mSelf(); if (state.failed) return ;

				}
				break;
			case 87 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:825: SelfColonColon
				{
				mSelfColonColon(); if (state.failed) return ;

				}
				break;
			case 88 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:840: Semicolon
				{
				mSemicolon(); if (state.failed) return ;

				}
				break;
			case 89 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:850: ShiftLeft
				{
				mShiftLeft(); if (state.failed) return ;

				}
				break;
			case 90 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:860: ShiftLeftEqual
				{
				mShiftLeftEqual(); if (state.failed) return ;

				}
				break;
			case 91 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:875: ShiftRight
				{
				mShiftRight(); if (state.failed) return ;

				}
				break;
			case 92 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:886: ShiftRightEqual
				{
				mShiftRightEqual(); if (state.failed) return ;

				}
				break;
			case 93 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:902: Static
				{
				mStatic(); if (state.failed) return ;

				}
				break;
			case 94 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:909: Switch
				{
				mSwitch(); if (state.failed) return ;

				}
				break;
			case 95 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:916: This
				{
				mThis(); if (state.failed) return ;

				}
				break;
			case 96 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:921: Throw
				{
				mThrow(); if (state.failed) return ;

				}
				break;
			case 97 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:927: Try
				{
				mTry(); if (state.failed) return ;

				}
				break;
			case 98 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:931: TypeArray
				{
				mTypeArray(); if (state.failed) return ;

				}
				break;
			case 99 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:941: TypeBool
				{
				mTypeBool(); if (state.failed) return ;

				}
				break;
			case 100 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:950: TypeBoolean
				{
				mTypeBoolean(); if (state.failed) return ;

				}
				break;
			case 101 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:962: TypeFloat
				{
				mTypeFloat(); if (state.failed) return ;

				}
				break;
			case 102 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:972: TypeInt
				{
				mTypeInt(); if (state.failed) return ;

				}
				break;
			case 103 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:980: TypeObject
				{
				mTypeObject(); if (state.failed) return ;

				}
				break;
			case 104 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:991: TypeResource
				{
				mTypeResource(); if (state.failed) return ;

				}
				break;
			case 105 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1004: TypeString
				{
				mTypeString(); if (state.failed) return ;

				}
				break;
			case 106 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1015: Use
				{
				mUse(); if (state.failed) return ;

				}
				break;
			case 107 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1019: Void
				{
				mVoid(); if (state.failed) return ;

				}
				break;
			case 108 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1024: While
				{
				mWhile(); if (state.failed) return ;

				}
				break;
			case 109 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1030: Bool
				{
				mBool(); if (state.failed) return ;

				}
				break;
			case 110 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1035: NullVariations
				{
				mNullVariations(); if (state.failed) return ;

				}
				break;
			case 111 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1050: Identifier
				{
				mIdentifier(); if (state.failed) return ;

				}
				break;
			case 112 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1061: VariableId
				{
				mVariableId(); if (state.failed) return ;

				}
				break;
			case 113 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1072: Int
				{
				mInt(); if (state.failed) return ;

				}
				break;
			case 114 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1076: Float
				{
				mFloat(); if (state.failed) return ;

				}
				break;
			case 115 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1082: String
				{
				mString(); if (state.failed) return ;

				}
				break;
			case 116 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1089: Comment
				{
				mComment(); if (state.failed) return ;

				}
				break;
			case 117 :
				// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:1097: Whitespace
				{
				mWhitespace(); if (state.failed) return ;

				}
				break;

		}
	}

	// $ANTLR start synpred1_TSPHP
	public final void synpred1_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:6: ( '\\\\\\\\' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:733:7: '\\\\\\\\'
		{
		match("\\\\"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred1_TSPHP

	// $ANTLR start synpred2_TSPHP
	public final void synpred2_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:734:7: ( '\\\\\\'' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:734:8: '\\\\\\''
		{
		match("\\'"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred2_TSPHP

	// $ANTLR start synpred3_TSPHP
	public final void synpred3_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:6: ( '\\\\\\\\' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:741:7: '\\\\\\\\'
		{
		match("\\\\"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred3_TSPHP

	// $ANTLR start synpred4_TSPHP
	public final void synpred4_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:742:7: ( '\\\\\"' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:742:8: '\\\\\"'
		{
		match("\\\""); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred4_TSPHP

	// $ANTLR start synpred5_TSPHP
	public final void synpred5_TSPHP_fragment() throws RecognitionException {
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:6: ( '\\\\$' )
		// D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:743:7: '\\\\$'
		{
		match("\\$"); if (state.failed) return ;

		}

	}
	// $ANTLR end synpred5_TSPHP

	public final boolean synpred1_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_TSPHP() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_TSPHP_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA15 dfa15 = new DFA15(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA26 dfa26 = new DFA26(this);
	static final String DFA15_eotS =
		"\5\uffff";
	static final String DFA15_eofS =
		"\5\uffff";
	static final String DFA15_minS =
		"\2\56\3\uffff";
	static final String DFA15_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA15_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA15_specialS =
		"\5\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "713:1: Float : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA25_eotS =
		"\2\uffff\1\6\1\uffff\1\6\2\uffff";
	static final String DFA25_eofS =
		"\7\uffff";
	static final String DFA25_minS =
		"\1\57\1\52\1\0\1\uffff\1\0\2\uffff";
	static final String DFA25_maxS =
		"\2\57\1\uffff\1\uffff\1\uffff\2\uffff";
	static final String DFA25_acceptS =
		"\3\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA25_specialS =
		"\2\uffff\1\1\1\uffff\1\0\2\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\3\4\uffff\1\2",
			"\12\4\1\5\2\4\1\5\ufff2\4",
			"",
			"\12\4\1\5\2\4\1\5\ufff2\4",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "841:1: Comment : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA25_4 = input.LA(1);
						s = -1;
						if ( (LA25_4=='\n'||LA25_4=='\r') ) {s = 5;}
						else if ( ((LA25_4 >= '\u0000' && LA25_4 <= '\t')||(LA25_4 >= '\u000B' && LA25_4 <= '\f')||(LA25_4 >= '\u000E' && LA25_4 <= '\uFFFF')) ) {s = 4;}
						else s = 6;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA25_2 = input.LA(1);
						s = -1;
						if ( ((LA25_2 >= '\u0000' && LA25_2 <= '\t')||(LA25_2 >= '\u000B' && LA25_2 <= '\f')||(LA25_2 >= '\u000E' && LA25_2 <= '\uFFFF')) ) {s = 4;}
						else if ( (LA25_2=='\n'||LA25_2=='\r') ) {s = 5;}
						else s = 6;
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 25, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA26_eotS =
		"\1\uffff\1\56\1\71\2\uffff\1\74\1\uffff\1\77\1\101\2\56\1\110\1\uffff"+
		"\1\56\1\115\1\117\1\122\2\56\1\136\1\56\3\uffff\1\145\1\147\2\56\1\156"+
		"\1\160\1\162\2\56\1\174\1\56\1\uffff\1\56\3\uffff\1\56\1\uffff\4\56\1"+
		"\uffff\2\u0087\2\uffff\1\56\1\u008a\2\56\1\uffff\1\u008e\11\uffff\5\56"+
		"\2\uffff\1\56\1\u0097\3\uffff\1\120\5\uffff\10\56\1\uffff\1\u00a3\1\uffff"+
		"\1\u00a4\2\56\2\uffff\1\u00a9\1\uffff\1\u00ab\1\uffff\1\u00ac\2\56\10"+
		"\uffff\7\56\3\uffff\11\56\1\u0087\1\uffff\1\u0087\1\56\1\uffff\1\u00c5"+
		"\1\56\2\uffff\10\56\1\uffff\1\120\5\56\1\u00d7\3\56\3\uffff\2\56\1\u00de"+
		"\5\uffff\1\56\1\u00e0\1\56\1\u00e2\10\56\1\u00eb\7\56\1\u00f3\3\56\1\uffff"+
		"\2\56\1\u00fa\1\u00fb\6\56\1\120\1\u0103\1\u0104\1\u0105\3\56\1\uffff"+
		"\6\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u0111\1\u0112\4\56\1\u0117\1"+
		"\56\1\uffff\1\u0119\2\56\1\u011d\3\56\1\uffff\1\u0121\2\56\1\u0124\1\u0125"+
		"\1\56\2\uffff\1\u0127\1\u0128\1\u0129\1\u012a\2\56\1\u012d\3\uffff\1\56"+
		"\1\u012f\2\56\1\u0132\1\u0119\5\56\2\uffff\4\56\1\uffff\1\u013c\1\uffff"+
		"\2\56\2\uffff\3\56\1\uffff\1\u0142\1\56\2\uffff\1\56\4\uffff\2\56\1\uffff"+
		"\1\56\1\uffff\2\56\1\uffff\3\56\1\u014d\1\56\1\u0150\2\56\1\u0153\1\uffff"+
		"\1\u0154\1\56\1\u0156\1\u0157\1\u0158\1\uffff\1\56\1\u015a\1\56\1\u015c"+
		"\1\u015d\1\u015e\4\56\1\uffff\1\56\2\uffff\1\u0164\1\56\2\uffff\1\56\3"+
		"\uffff\1\u0167\1\uffff\1\u0168\3\uffff\1\u0169\4\56\1\uffff\1\56\1\u016f"+
		"\3\uffff\2\56\1\u0172\1\u0173\1\u0174\1\uffff\1\u0175\1\u0176\5\uffff";
	static final String DFA26_eofS =
		"\u0177\uffff";
	static final String DFA26_minS =
		"\1\11\1\142\1\75\2\uffff\1\46\1\uffff\2\75\1\157\1\141\1\72\1\uffff\1"+
		"\145\1\52\1\101\1\60\1\143\1\141\1\75\1\146\3\uffff\1\74\1\75\1\142\1"+
		"\157\1\55\2\75\1\125\1\141\1\53\1\150\1\uffff\1\145\3\uffff\1\145\1\uffff"+
		"\1\163\1\157\1\150\1\125\1\uffff\2\56\2\uffff\1\163\1\60\1\144\1\162\1"+
		"\uffff\1\75\11\uffff\1\145\1\157\1\163\1\141\1\156\2\uffff\1\146\1\60"+
		"\3\uffff\1\150\5\uffff\1\150\1\163\1\151\1\156\1\162\1\156\1\157\1\154"+
		"\1\uffff\1\75\1\uffff\1\60\1\160\1\163\2\uffff\1\75\1\uffff\1\75\1\uffff"+
		"\1\60\1\152\1\162\10\uffff\1\155\1\167\2\114\1\162\1\151\1\142\3\uffff"+
		"\1\151\1\165\1\163\1\154\1\141\1\151\1\145\2\151\1\56\1\uffff\1\56\1\164"+
		"\1\uffff\1\60\1\141\2\uffff\1\141\1\154\1\145\1\143\1\163\1\156\1\163"+
		"\1\141\1\uffff\1\151\1\157\1\145\1\164\1\145\1\141\1\60\1\143\1\141\1"+
		"\163\3\uffff\1\154\1\164\1\60\5\uffff\1\145\1\60\1\145\1\60\2\114\1\145"+
		"\1\166\1\164\1\154\1\163\1\157\1\60\1\145\1\165\1\157\1\146\1\164\1\151"+
		"\1\164\1\60\1\144\1\154\1\162\1\uffff\1\171\1\153\2\60\1\150\1\163\1\145"+
		"\1\164\1\151\1\165\1\163\3\60\1\156\1\154\1\141\1\uffff\2\164\2\145\1"+
		"\141\1\162\1\uffff\1\143\1\uffff\1\163\1\uffff\2\60\1\156\1\141\1\145"+
		"\1\151\1\60\1\167\1\uffff\1\60\1\162\1\165\1\60\1\151\1\156\1\143\1\uffff"+
		"\1\60\1\145\1\141\2\60\1\141\2\uffff\4\60\1\156\1\154\1\60\3\uffff\1\144"+
		"\1\60\1\143\1\151\2\60\1\155\1\156\1\146\1\164\1\160\2\uffff\2\164\2\143"+
		"\1\uffff\1\60\1\uffff\1\156\1\162\2\uffff\1\143\1\147\1\150\1\uffff\1"+
		"\60\1\143\2\uffff\1\156\4\uffff\1\165\1\164\1\uffff\1\163\1\uffff\1\150"+
		"\1\157\1\uffff\1\145\1\143\1\141\1\60\1\141\1\60\1\145\1\164\1\60\1\uffff"+
		"\1\60\1\143\3\60\1\uffff\1\164\1\60\1\145\3\60\2\156\1\145\1\143\1\uffff"+
		"\1\143\2\uffff\1\60\1\145\2\uffff\1\145\3\uffff\1\60\1\uffff\1\60\3\uffff"+
		"\1\60\1\164\1\157\2\145\1\uffff\1\144\1\60\3\uffff\1\163\1\146\3\60\1"+
		"\uffff\2\60\5\uffff";
	static final String DFA26_maxS =
		"\1\u00ff\1\163\1\76\2\uffff\1\75\1\uffff\1\174\1\75\1\162\1\157\1\72\1"+
		"\uffff\1\157\1\75\1\u00ff\1\75\1\170\1\165\1\76\1\156\3\uffff\1\76\1\75"+
		"\1\162\1\157\1\76\2\75\2\165\1\75\1\162\1\uffff\1\145\3\uffff\1\167\1"+
		"\uffff\1\163\1\157\1\150\1\165\1\uffff\2\145\2\uffff\1\163\1\u00ff\1\144"+
		"\1\162\1\uffff\1\75\11\uffff\1\145\1\157\1\164\1\157\1\156\2\uffff\1\146"+
		"\1\u00ff\3\uffff\1\150\5\uffff\1\150\1\163\1\164\1\156\1\162\1\156\1\157"+
		"\1\154\1\uffff\1\75\1\uffff\1\u00ff\1\160\1\164\2\uffff\1\75\1\uffff\1"+
		"\75\1\uffff\1\u00ff\1\152\1\162\10\uffff\1\155\1\167\2\154\1\162\1\157"+
		"\1\142\3\uffff\1\162\1\171\1\164\1\154\1\162\1\151\1\145\2\151\1\145\1"+
		"\uffff\1\145\1\164\1\uffff\1\u00ff\1\141\2\uffff\1\141\1\154\1\145\1\143"+
		"\1\163\1\156\1\164\1\141\1\uffff\1\151\1\157\1\145\1\164\1\145\1\141\1"+
		"\u00ff\1\143\1\141\1\163\3\uffff\1\154\1\164\1\u00ff\5\uffff\1\145\1\u00ff"+
		"\1\145\1\u00ff\2\154\1\145\1\166\1\164\1\154\1\163\1\157\1\u00ff\1\145"+
		"\1\165\1\157\1\146\1\164\1\151\1\164\1\u00ff\1\144\1\154\1\162\1\uffff"+
		"\1\171\1\153\2\u00ff\1\150\1\163\1\145\1\164\1\151\1\165\1\163\3\u00ff"+
		"\1\156\1\154\1\141\1\uffff\2\164\2\145\1\141\1\162\1\uffff\1\143\1\uffff"+
		"\1\163\1\uffff\2\u00ff\1\156\1\141\1\145\1\151\1\u00ff\1\167\1\uffff\1"+
		"\u00ff\1\162\1\165\1\u00ff\1\151\1\156\1\143\1\uffff\1\u00ff\1\145\1\141"+
		"\2\u00ff\1\141\2\uffff\4\u00ff\1\156\1\154\1\u00ff\3\uffff\1\144\1\u00ff"+
		"\1\143\1\151\2\u00ff\1\155\1\156\1\146\1\164\1\160\2\uffff\2\164\2\143"+
		"\1\uffff\1\u00ff\1\uffff\1\156\1\162\2\uffff\1\143\1\147\1\150\1\uffff"+
		"\1\u00ff\1\143\2\uffff\1\156\4\uffff\1\165\1\164\1\uffff\1\163\1\uffff"+
		"\1\150\1\157\1\uffff\1\145\1\143\1\141\1\u00ff\1\141\1\u00ff\1\145\1\164"+
		"\1\u00ff\1\uffff\1\u00ff\1\143\3\u00ff\1\uffff\1\164\1\u00ff\1\145\3\u00ff"+
		"\2\156\1\145\1\143\1\uffff\1\143\2\uffff\1\u00ff\1\145\2\uffff\1\145\3"+
		"\uffff\1\u00ff\1\uffff\1\u00ff\3\uffff\1\u00ff\1\164\1\157\2\145\1\uffff"+
		"\1\144\1\u00ff\3\uffff\1\163\1\146\3\u00ff\1\uffff\2\u00ff\5\uffff";
	static final String DFA26_acceptS =
		"\3\uffff\1\5\1\6\1\uffff\1\11\5\uffff\1\24\10\uffff\1\57\1\60\1\61\13"+
		"\uffff\1\121\1\uffff\1\123\1\124\1\125\1\uffff\1\130\4\uffff\1\157\2\uffff"+
		"\1\163\1\165\4\uffff\1\2\1\uffff\1\4\1\10\1\64\1\7\1\13\1\67\1\12\1\15"+
		"\1\14\5\uffff\1\36\1\23\2\uffff\1\31\1\164\1\30\1\uffff\1\33\1\160\1\35"+
		"\1\34\1\162\10\uffff\1\50\1\uffff\1\51\3\uffff\1\62\1\104\1\uffff\1\63"+
		"\1\uffff\1\66\3\uffff\1\73\1\74\1\107\1\72\1\76\1\75\1\100\1\77\7\uffff"+
		"\1\113\1\114\1\112\12\uffff\1\161\2\uffff\1\3\2\uffff\1\52\1\41\10\uffff"+
		"\1\32\12\uffff\1\134\1\133\1\53\3\uffff\1\132\1\131\1\105\1\103\1\70\30"+
		"\uffff\1\65\21\uffff\1\45\6\uffff\1\146\1\uffff\1\71\1\uffff\1\102\10"+
		"\uffff\1\141\7\uffff\1\152\6\uffff\1\143\1\17\7\uffff\1\37\1\40\1\42\13"+
		"\uffff\1\106\1\156\4\uffff\1\116\1\uffff\1\155\2\uffff\1\127\1\126\3\uffff"+
		"\1\153\2\uffff\1\142\1\16\1\uffff\1\20\1\21\1\22\1\25\2\uffff\1\137\1"+
		"\uffff\1\44\2\uffff\1\145\11\uffff\1\140\5\uffff\1\154\12\uffff\1\147"+
		"\1\uffff\1\111\1\110\2\uffff\1\120\1\122\1\uffff\1\135\1\151\1\136\1\uffff"+
		"\1\144\1\uffff\1\27\1\43\1\46\5\uffff\1\115\2\uffff\1\1\1\26\1\47\5\uffff"+
		"\1\150\2\uffff\1\56\1\101\1\117\1\54\1\55";
	static final String DFA26_specialS =
		"\u0177\uffff}>";
	static final String[] DFA26_transitionS = {
			"\2\62\2\uffff\1\62\22\uffff\1\62\1\31\1\61\1\uffff\1\17\1\35\1\5\1\61"+
			"\1\26\1\46\1\36\1\41\1\14\1\34\1\20\1\16\1\60\11\57\1\13\1\51\1\30\1"+
			"\2\1\23\1\43\1\3\15\56\1\55\14\56\1\27\1\4\1\47\1\10\1\56\1\uffff\1\1"+
			"\1\11\1\12\1\15\1\21\1\22\2\56\1\24\4\56\1\37\1\32\1\40\1\56\1\44\1\50"+
			"\1\42\1\52\1\53\1\54\1\33\2\56\1\25\1\7\1\45\1\6\u0081\56",
			"\1\63\13\uffff\1\65\3\uffff\1\66\1\64",
			"\1\70\1\67",
			"",
			"",
			"\1\73\26\uffff\1\72",
			"",
			"\1\75\76\uffff\1\76",
			"\1\100",
			"\1\103\2\uffff\1\102",
			"\1\104\12\uffff\1\105\2\uffff\1\106",
			"\1\107",
			"",
			"\1\111\11\uffff\1\112",
			"\1\114\4\uffff\1\114\15\uffff\1\113",
			"\32\120\4\uffff\1\120\1\uffff\23\120\1\116\6\120\4\uffff\u0081\120",
			"\12\123\3\uffff\1\121",
			"\1\124\10\uffff\1\125\13\uffff\1\126",
			"\1\133\7\uffff\1\127\2\uffff\1\132\2\uffff\1\130\5\uffff\1\131",
			"\1\134\1\135",
			"\1\137\6\uffff\1\140\1\141",
			"",
			"",
			"",
			"\1\144\1\142\1\143",
			"\1\146",
			"\1\151\17\uffff\1\150",
			"\1\152",
			"\1\154\17\uffff\1\153\1\155",
			"\1\157",
			"\1\161",
			"\1\166\13\uffff\1\163\3\uffff\1\164\17\uffff\1\165",
			"\1\167\20\uffff\1\170\2\uffff\1\171",
			"\1\173\21\uffff\1\172",
			"\1\175\11\uffff\1\176",
			"",
			"\1\177",
			"",
			"",
			"",
			"\1\u0080\16\uffff\1\u0081\2\uffff\1\u0082",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\166\37\uffff\1\166",
			"",
			"\1\123\1\uffff\12\u0086\13\uffff\1\123\37\uffff\1\123",
			"\1\123\1\uffff\10\u0088\2\123\13\uffff\1\123\37\uffff\1\123",
			"",
			"",
			"\1\u0089",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u008b",
			"\1\u008c",
			"",
			"\1\u008d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091\1\u0092",
			"\1\u0093\15\uffff\1\u0094",
			"\1\u0095",
			"",
			"",
			"\1\u0096",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"",
			"",
			"\1\u0098",
			"",
			"",
			"",
			"",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b\12\uffff\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00a5",
			"\1\u00a6\1\u00a7",
			"",
			"",
			"\1\u00a8",
			"",
			"\1\u00aa",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00ad",
			"\1\u00ae",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b2\37\uffff\1\u00b1",
			"\1\u00b2\37\uffff\1\u00b2",
			"\1\u00b3",
			"\1\u00b4\5\uffff\1\u00b5",
			"\1\u00b6",
			"",
			"",
			"",
			"\1\u00b7\10\uffff\1\u00b8",
			"\1\u00ba\3\uffff\1\u00b9",
			"\1\u00bc\1\u00bb",
			"\1\u00bd",
			"\1\u00be\20\uffff\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\123\1\uffff\12\u0086\13\uffff\1\123\37\uffff\1\123",
			"",
			"\1\123\1\uffff\10\u0088\2\123\13\uffff\1\123\37\uffff\1\123",
			"\1\u00c4",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00c6",
			"",
			"",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd\1\u00ce",
			"\1\u00cf",
			"",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d6\25\56\4\uffff"+
			"\u0081\56",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"",
			"",
			"",
			"\1\u00db",
			"\1\u00dc",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00dd\25\56\4\uffff"+
			"\u0081\56",
			"",
			"",
			"",
			"",
			"",
			"\1\u00df",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00e1",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00e4\37\uffff\1\u00e3",
			"\1\u00e4\37\uffff\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"",
			"\1\u00f7",
			"\1\u00f8",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f9\25\56\4\uffff"+
			"\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"",
			"\1\u010f",
			"",
			"\1\u0110",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0118",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u011a",
			"\1\u011b",
			"\12\56\1\u011c\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081"+
			"\56",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0122",
			"\1\u0123",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0126",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u012b",
			"\1\u012c",
			"\12\120\7\uffff\32\120\4\uffff\1\120\1\uffff\32\120\4\uffff\u0081\120",
			"",
			"",
			"",
			"\1\u012e",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0130",
			"\1\u0131",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"",
			"",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"\1\u013d",
			"\1\u013e",
			"",
			"",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0143",
			"",
			"",
			"\1\u0144",
			"",
			"",
			"",
			"",
			"\1\u0145",
			"\1\u0146",
			"",
			"\1\u0147",
			"",
			"\1\u0148",
			"\1\u0149",
			"",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u014e",
			"\12\56\1\u014f\6\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081"+
			"\56",
			"\1\u0151",
			"\1\u0152",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0155",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"\1\u0159",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u015b",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"",
			"\1\u0163",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u0165",
			"",
			"",
			"\1\u0166",
			"",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"",
			"\1\u016e",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"",
			"",
			"\1\u0170",
			"\1\u0171",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\4\uffff\u0081\56",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( Abstract | Arrow | As | Assign | At | Backslash | BitwiseAnd | BitwiseAndEqual | BitwiseNot | BitwiseOr | BitwiseOrEqual | BitwiseXor | BitwiseXorEqual | Break | Case | Catch | Class | Clone | Colon | Comma | Const | Continue | Default | Divide | DivideEqual | Do | Dolar | Dot | DotEqual | DoubleColon | Echo | Else | Equal | Exit | Extends | Final | For | Foreach | Function | GreaterEqualThan | GreaterThan | Identical | If | Implements | Instanceof | Interface | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LessEqualThan | LessThan | LogicAnd | LogicAndWeak | LogicNot | LogicOr | LogicOrWeak | LogicXorWeak | Minus | MinusEqual | MinusMinus | Modulo | ModuloEqual | Multiply | MultiplyEqual | Namespace | New | NotEqual | NotEqualAlternative | NotIdentical | Null | ObjectOperator | Parent | ParentColonColon | Plus | PlusEqual | PlusPlus | Private | ProtectThis | Protected | Public | QuestionMark | Return | RightCurlyBrace | RightParanthesis | RightSquareBrace | Self | SelfColonColon | Semicolon | ShiftLeft | ShiftLeftEqual | ShiftRight | ShiftRightEqual | Static | Switch | This | Throw | Try | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeObject | TypeResource | TypeString | Use | Void | While | Bool | NullVariations | Identifier | VariableId | Int | Float | String | Comment | Whitespace );";
		}
	}

}
