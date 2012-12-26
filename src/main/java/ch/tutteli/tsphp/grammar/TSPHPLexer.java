// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-26 09:23:20

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

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TSPHPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Arrow=4;
    public static final int As=5;
    public static final int BINARY=6;
    public static final int BREAK_CONTINUE_NUMBER=7;
    public static final int Bool=8;
    public static final int Break=9;
    public static final int Case=10;
    public static final int Colon=11;
    public static final int Comma=12;
    public static final int Comment=13;
    public static final int Continue=14;
    public static final int DECIMAL=15;
    public static final int Default=16;
    public static final int DivideEqual=17;
    public static final int Do=18;
    public static final int Dolar=19;
    public static final int DotEqual=20;
    public static final int EXPONENT=21;
    public static final int Else=22;
    public static final int Equal=23;
    public static final int Float=24;
    public static final int For=25;
    public static final int Foreach=26;
    public static final int Function=27;
    public static final int HEXADECIMAL=28;
    public static final int ID=29;
    public static final int If=30;
    public static final int Int=31;
    public static final int LeftCurlyBrace=32;
    public static final int LeftParanthesis=33;
    public static final int LeftSquareBrace=34;
    public static final int LogicAndEqual=35;
    public static final int LogicOrEqual=36;
    public static final int LogicXorEqual=37;
    public static final int MinusEqual=38;
    public static final int MinusMinus=39;
    public static final int ModuloEqual=40;
    public static final int MultiplyEqual=41;
    public static final int Namespace=42;
    public static final int NamespaceId=43;
    public static final int OCTAL=44;
    public static final int PlusEqual=45;
    public static final int PlusPlus=46;
    public static final int RightCurlyBrace=47;
    public static final int RightParanthesis=48;
    public static final int RightSquareBrace=49;
    public static final int STRING_DOUBLE_QUOTED=50;
    public static final int STRING_SINGLE_QUOTED=51;
    public static final int Semicolon=52;
    public static final int ShiftLeftEqual=53;
    public static final int ShiftRightEqual=54;
    public static final int String=55;
    public static final int Switch=56;
    public static final int TypeArray=57;
    public static final int TypeBool=58;
    public static final int TypeBoolean=59;
    public static final int TypeFloat=60;
    public static final int TypeInt=61;
    public static final int TypeResource=62;
    public static final int TypeString=63;
    public static final int VariableId=64;
    public static final int While=65;
    public static final int Whitespace=66;

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
    public String getGrammarFileName() { return "D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g"; }

    // $ANTLR start "Arrow"
    public final void mArrow() throws RecognitionException {
        try {
            int _type = Arrow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:7: ( '=>' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:22:9: '=>'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:4: ( 'as' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:23:6: 'as'
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

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:7: ( 'break' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:24:9: 'break'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:6: ( 'case' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:25:8: 'case'
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:7: ( ':' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:26:9: ':'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:7: ( ',' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:27:9: ','
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

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:10: ( 'continue' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:28:12: 'continue'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:9: ( 'default' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:29:11: 'default'
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

    // $ANTLR start "DivideEqual"
    public final void mDivideEqual() throws RecognitionException {
        try {
            int _type = DivideEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:13: ( '/=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:30:15: '/='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:4: ( 'do' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:31:6: 'do'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:7: ( '$' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:32:9: '$'
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

    // $ANTLR start "DotEqual"
    public final void mDotEqual() throws RecognitionException {
        try {
            int _type = DotEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:10: ( '.=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:33:12: '.='
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

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:6: ( 'else' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:34:8: 'else'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:7: ( '=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:35:9: '='
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
    // $ANTLR end "Equal"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:5: ( 'for' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:36:7: 'for'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:9: ( 'foreach' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:37:11: 'foreach'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:10: ( 'function' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:38:12: 'function'
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:4: ( 'if' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:39:6: 'if'
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

    // $ANTLR start "LeftCurlyBrace"
    public final void mLeftCurlyBrace() throws RecognitionException {
        try {
            int _type = LeftCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:16: ( '{' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:40:18: '{'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:17: ( '(' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:41:19: '('
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:17: ( '[' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:42:19: '['
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

    // $ANTLR start "LogicAndEqual"
    public final void mLogicAndEqual() throws RecognitionException {
        try {
            int _type = LogicAndEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:15: ( '&=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:43:17: '&='
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
    // $ANTLR end "LogicAndEqual"

    // $ANTLR start "LogicOrEqual"
    public final void mLogicOrEqual() throws RecognitionException {
        try {
            int _type = LogicOrEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:44:14: ( '|=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:44:16: '|='
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
    // $ANTLR end "LogicOrEqual"

    // $ANTLR start "LogicXorEqual"
    public final void mLogicXorEqual() throws RecognitionException {
        try {
            int _type = LogicXorEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:45:15: ( '^=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:45:17: '^='
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
    // $ANTLR end "LogicXorEqual"

    // $ANTLR start "MinusEqual"
    public final void mMinusEqual() throws RecognitionException {
        try {
            int _type = MinusEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:46:12: ( '-=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:46:14: '-='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:47:12: ( '--' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:47:14: '--'
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

    // $ANTLR start "ModuloEqual"
    public final void mModuloEqual() throws RecognitionException {
        try {
            int _type = ModuloEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:48:13: ( '%=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:48:15: '%='
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

    // $ANTLR start "MultiplyEqual"
    public final void mMultiplyEqual() throws RecognitionException {
        try {
            int _type = MultiplyEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:49:15: ( '*=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:49:17: '*='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:50:11: ( 'namespace' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:50:13: 'namespace'
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

    // $ANTLR start "PlusEqual"
    public final void mPlusEqual() throws RecognitionException {
        try {
            int _type = PlusEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:51:11: ( '+=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:51:13: '+='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:52:10: ( '++' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:52:12: '++'
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

    // $ANTLR start "RightCurlyBrace"
    public final void mRightCurlyBrace() throws RecognitionException {
        try {
            int _type = RightCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:17: ( '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:19: '}'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:18: ( ')' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:20: ')'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:18: ( ']' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:20: ']'
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

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:13: ';'
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

    // $ANTLR start "ShiftLeftEqual"
    public final void mShiftLeftEqual() throws RecognitionException {
        try {
            int _type = ShiftLeftEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:16: ( '<<=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:18: '<<='
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

    // $ANTLR start "ShiftRightEqual"
    public final void mShiftRightEqual() throws RecognitionException {
        try {
            int _type = ShiftRightEqual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:17: ( '>>=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:19: '>>='
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

    // $ANTLR start "Switch"
    public final void mSwitch() throws RecognitionException {
        try {
            int _type = Switch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:8: ( 'switch' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:10: 'switch'
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

    // $ANTLR start "TypeArray"
    public final void mTypeArray() throws RecognitionException {
        try {
            int _type = TypeArray;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:11: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:13: 'array'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:10: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:12: 'bool'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:13: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:15: 'boolean'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:11: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:13: 'float'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:9: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:11: 'int'
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

    // $ANTLR start "TypeResource"
    public final void mTypeResource() throws RecognitionException {
        try {
            int _type = TypeResource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:14: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:16: 'resource'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:12: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:14: 'string'
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

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:7: ( 'while' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:9: 'while'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:125:6: ( 'true' | 'false' )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:125:8: 'true'
                    {
                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:125:15: 'false'
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

    // $ANTLR start "NamespaceId"
    public final void mNamespaceId() throws RecognitionException {
        try {
            int _type = NamespaceId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:2: ( ID ( '\\\\' ID )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:4: ID ( '\\\\' ID )*
            {
            mID(); if (state.failed) return ;


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:7: ( '\\\\' ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:8: '\\\\' ID
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mID(); if (state.failed) return ;


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
    // $ANTLR end "NamespaceId"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:133:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:133:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:133:49: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')||(LA3_0 >= '\u007F' && LA3_0 <= '\u00FF')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "VariableId"
    public final void mVariableId() throws RecognitionException {
        try {
            int _type = VariableId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:12: ( '$' ID )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:227:14: '$' ID
            {
            match('$'); if (state.failed) return ;

            mID(); if (state.failed) return ;


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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:9: ( ( '+' | '-' )? DECIMAL | ( '+' | '-' )? HEXADECIMAL | ( '+' | '-' )? OCTAL | ( '+' | '-' )? BINARY )
            int alt8=4;
            switch ( input.LA(1) ) {
            case '+':
            case '-':
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1 >= '1' && LA8_1 <= '9')) ) {
                    alt8=1;
                }
                else if ( (LA8_1=='0') ) {
                    switch ( input.LA(3) ) {
                    case 'X':
                    case 'x':
                        {
                        alt8=2;
                        }
                        break;
                    case 'b':
                        {
                        alt8=4;
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
                        alt8=3;
                        }
                        break;
                    default:
                        alt8=1;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt8=1;
                }
                break;
            case '0':
                {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt8=2;
                    }
                    break;
                case 'b':
                    {
                    alt8=4;
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
                    alt8=3;
                    }
                    break;
                default:
                    alt8=1;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:12: ( '+' | '-' )? DECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:242:12: ( '+' | '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
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


                    mDECIMAL(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:12: ( '+' | '-' )? HEXADECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:243:12: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
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


                    mHEXADECIMAL(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:12: ( '+' | '-' )? OCTAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:244:12: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
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


                    mOCTAL(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:12: ( '+' | '-' )? BINARY
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:245:12: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='0') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:4: ( '1' .. '9' ) ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:251:15: ( '0' .. '9' )*
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:252:12: '0'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:257:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'F')||(LA11_0 >= 'a' && LA11_0 <= 'f')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:7: ( '0' ( '0' .. '7' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:9: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:260:13: ( '0' .. '7' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '7')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:8: ( '0b' ( '0' | '1' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:10: '0b' ( '0' | '1' )+
            {
            match("0b"); if (state.failed) return ;



            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:14: ( '0' | '1' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '1')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:6: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:8: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:8: ( '+' | '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+'||LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:19: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
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
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    match('.'); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:35: ( '0' .. '9' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
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
                    	    break loop16;
                        }
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:47: ( EXPONENT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:275:47: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:8: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:8: ( '+' | '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='+'||LA18_0=='-') ) {
                        alt18=1;
                    }
                    switch (alt18) {
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


                    match('.'); if (state.failed) return ;

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:23: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
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
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:35: ( EXPONENT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:276:35: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:8: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:8: ( '+' | '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='+'||LA21_0=='-') ) {
                        alt21=1;
                    }
                    switch (alt21) {
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:19: ( '0' .. '9' )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
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
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:22: ( '+' | '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='+'||LA24_0=='-') ) {
                alt24=1;
            }
            switch (alt24) {
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:282:33: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:8: ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\'') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\"') ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:10: STRING_SINGLE_QUOTED
                    {
                    mSTRING_SINGLE_QUOTED(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:290:33: STRING_DOUBLE_QUOTED
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:2: ( '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:4: '\\'' ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:9: ( ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | ( '\\\\' '\\'' )=> '\\\\' '\\'' |~ ( '\\'' ) )*
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\\') ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2=='\\') ) {
                        int LA27_4 = input.LA(3);

                        if ( (synpred1_TSPHP()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=3;
                        }


                    }
                    else if ( (LA27_2=='\'') ) {
                        int LA27_5 = input.LA(3);

                        if ( (LA27_5=='\'') && (synpred2_TSPHP())) {
                            alt27=2;
                        }
                        else if ( (LA27_5=='\\') && (synpred2_TSPHP())) {
                            alt27=2;
                        }
                        else if ( ((LA27_5 >= '\u0000' && LA27_5 <= '&')||(LA27_5 >= '(' && LA27_5 <= '[')||(LA27_5 >= ']' && LA27_5 <= '\uFFFF')) && (synpred2_TSPHP())) {
                            alt27=2;
                        }

                        else {
                            alt27=3;
                        }


                    }
                    else if ( ((LA27_2 >= '\u0000' && LA27_2 <= '&')||(LA27_2 >= '(' && LA27_2 <= '[')||(LA27_2 >= ']' && LA27_2 <= '\uFFFF')) ) {
                        alt27=3;
                    }


                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '&')||(LA27_0 >= '(' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:6: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:7: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:300:6: ~ ( '\\'' )
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
            	    break loop27;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:6: ( '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:8: '\"' ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:305:12: ( ( '\\\\' '\\\\' )=> '\\\\\\\\' | ( '\\\\' '\"' )=> '\\\\\"' | ( '\\\\' '$' )=> '\\\\$' |~ ( '\"' | '$' ) )*
            loop28:
            do {
                int alt28=5;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\\') ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2=='\\') ) {
                        int LA28_4 = input.LA(3);

                        if ( (synpred3_TSPHP()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=4;
                        }


                    }
                    else if ( (LA28_2=='\"') ) {
                        int LA28_5 = input.LA(3);

                        if ( (LA28_5=='\"') && (synpred4_TSPHP())) {
                            alt28=2;
                        }
                        else if ( (LA28_5=='\\') && (synpred4_TSPHP())) {
                            alt28=2;
                        }
                        else if ( ((LA28_5 >= '\u0000' && LA28_5 <= '!')||LA28_5=='#'||(LA28_5 >= '%' && LA28_5 <= '[')||(LA28_5 >= ']' && LA28_5 <= '\uFFFF')) && (synpred4_TSPHP())) {
                            alt28=2;
                        }

                        else {
                            alt28=4;
                        }


                    }
                    else if ( (LA28_2=='$') && (synpred5_TSPHP())) {
                        alt28=3;
                    }
                    else if ( ((LA28_2 >= '\u0000' && LA28_2 <= '!')||LA28_2=='#'||(LA28_2 >= '%' && LA28_2 <= '[')||(LA28_2 >= ']' && LA28_2 <= '\uFFFF')) ) {
                        alt28=4;
                    }


                }
                else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '!')||LA28_0=='#'||(LA28_0 >= '%' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
                    alt28=4;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:6: ( '\\\\' '\\\\' )=> '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;



            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:7: ( '\\\\' '\"' )=> '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;



            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:6: ( '\\\\' '$' )=> '\\\\$'
            	    {
            	    match("\\$"); if (state.failed) return ;



            	    }
            	    break;
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:309:6: ~ ( '\"' | '$' )
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
            	    break loop28;
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

    // $ANTLR start "BREAK_CONTINUE_NUMBER"
    public final void mBREAK_CONTINUE_NUMBER() throws RecognitionException {
        try {
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:353:2: ( ( '1' .. '9' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:
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


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK_CONTINUE_NUMBER"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:9: (~ ( '\\n' | '\\r' ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0 >= '\u0000' && LA29_0 <= '\t')||(LA29_0 >= '\u000B' && LA29_0 <= '\f')||(LA29_0 >= '\u000E' && LA29_0 <= '\uFFFF')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
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
                    	    break loop29;
                        }
                    } while (true);


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:23: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:384:23: '\\r'
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:6: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:386:11: (~ ( '\\n' | '\\r' ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0 >= '\u0000' && LA31_0 <= '\t')||(LA31_0 >= '\u000B' && LA31_0 <= '\f')||(LA31_0 >= '\u000E' && LA31_0 <= '\uFFFF')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
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
                    	    break loop31;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:13: ( options {greedy=false; } : . )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='*') ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1=='/') ) {
                                alt32=2;
                            }
                            else if ( ((LA32_1 >= '\u0000' && LA32_1 <= '.')||(LA32_1 >= '0' && LA32_1 <= '\uFFFF')) ) {
                                alt32=1;
                            }


                        }
                        else if ( ((LA32_0 >= '\u0000' && LA32_0 <= ')')||(LA32_0 >= '+' && LA32_0 <= '\uFFFF')) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:387:41: .
                    	    {
                    	    matchAny(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:12: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:390:14: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    public void mTokens() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( Arrow | As | Break | Case | Colon | Comma | Continue | Default | DivideEqual | Do | Dolar | DotEqual | Else | Equal | For | Foreach | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LogicAndEqual | LogicOrEqual | LogicXorEqual | MinusEqual | MinusMinus | ModuloEqual | MultiplyEqual | Namespace | PlusEqual | PlusPlus | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | ShiftLeftEqual | ShiftRightEqual | Switch | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | While | Bool | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace )
        int alt34=54;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:10: Arrow
                {
                mArrow(); if (state.failed) return ;


                }
                break;
            case 2 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:16: As
                {
                mAs(); if (state.failed) return ;


                }
                break;
            case 3 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:19: Break
                {
                mBreak(); if (state.failed) return ;


                }
                break;
            case 4 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:25: Case
                {
                mCase(); if (state.failed) return ;


                }
                break;
            case 5 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:30: Colon
                {
                mColon(); if (state.failed) return ;


                }
                break;
            case 6 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:36: Comma
                {
                mComma(); if (state.failed) return ;


                }
                break;
            case 7 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:42: Continue
                {
                mContinue(); if (state.failed) return ;


                }
                break;
            case 8 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:51: Default
                {
                mDefault(); if (state.failed) return ;


                }
                break;
            case 9 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:59: DivideEqual
                {
                mDivideEqual(); if (state.failed) return ;


                }
                break;
            case 10 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:71: Do
                {
                mDo(); if (state.failed) return ;


                }
                break;
            case 11 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:74: Dolar
                {
                mDolar(); if (state.failed) return ;


                }
                break;
            case 12 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:80: DotEqual
                {
                mDotEqual(); if (state.failed) return ;


                }
                break;
            case 13 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:89: Else
                {
                mElse(); if (state.failed) return ;


                }
                break;
            case 14 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:94: Equal
                {
                mEqual(); if (state.failed) return ;


                }
                break;
            case 15 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:100: For
                {
                mFor(); if (state.failed) return ;


                }
                break;
            case 16 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:104: Foreach
                {
                mForeach(); if (state.failed) return ;


                }
                break;
            case 17 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:112: Function
                {
                mFunction(); if (state.failed) return ;


                }
                break;
            case 18 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:121: If
                {
                mIf(); if (state.failed) return ;


                }
                break;
            case 19 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:124: LeftCurlyBrace
                {
                mLeftCurlyBrace(); if (state.failed) return ;


                }
                break;
            case 20 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:139: LeftParanthesis
                {
                mLeftParanthesis(); if (state.failed) return ;


                }
                break;
            case 21 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:155: LeftSquareBrace
                {
                mLeftSquareBrace(); if (state.failed) return ;


                }
                break;
            case 22 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:171: LogicAndEqual
                {
                mLogicAndEqual(); if (state.failed) return ;


                }
                break;
            case 23 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:185: LogicOrEqual
                {
                mLogicOrEqual(); if (state.failed) return ;


                }
                break;
            case 24 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:198: LogicXorEqual
                {
                mLogicXorEqual(); if (state.failed) return ;


                }
                break;
            case 25 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:212: MinusEqual
                {
                mMinusEqual(); if (state.failed) return ;


                }
                break;
            case 26 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:223: MinusMinus
                {
                mMinusMinus(); if (state.failed) return ;


                }
                break;
            case 27 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:234: ModuloEqual
                {
                mModuloEqual(); if (state.failed) return ;


                }
                break;
            case 28 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:246: MultiplyEqual
                {
                mMultiplyEqual(); if (state.failed) return ;


                }
                break;
            case 29 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:260: Namespace
                {
                mNamespace(); if (state.failed) return ;


                }
                break;
            case 30 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:270: PlusEqual
                {
                mPlusEqual(); if (state.failed) return ;


                }
                break;
            case 31 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:280: PlusPlus
                {
                mPlusPlus(); if (state.failed) return ;


                }
                break;
            case 32 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:289: RightCurlyBrace
                {
                mRightCurlyBrace(); if (state.failed) return ;


                }
                break;
            case 33 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:305: RightParanthesis
                {
                mRightParanthesis(); if (state.failed) return ;


                }
                break;
            case 34 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:322: RightSquareBrace
                {
                mRightSquareBrace(); if (state.failed) return ;


                }
                break;
            case 35 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:339: Semicolon
                {
                mSemicolon(); if (state.failed) return ;


                }
                break;
            case 36 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:349: ShiftLeftEqual
                {
                mShiftLeftEqual(); if (state.failed) return ;


                }
                break;
            case 37 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:364: ShiftRightEqual
                {
                mShiftRightEqual(); if (state.failed) return ;


                }
                break;
            case 38 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:380: Switch
                {
                mSwitch(); if (state.failed) return ;


                }
                break;
            case 39 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:387: TypeArray
                {
                mTypeArray(); if (state.failed) return ;


                }
                break;
            case 40 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:397: TypeBool
                {
                mTypeBool(); if (state.failed) return ;


                }
                break;
            case 41 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:406: TypeBoolean
                {
                mTypeBoolean(); if (state.failed) return ;


                }
                break;
            case 42 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:418: TypeFloat
                {
                mTypeFloat(); if (state.failed) return ;


                }
                break;
            case 43 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:428: TypeInt
                {
                mTypeInt(); if (state.failed) return ;


                }
                break;
            case 44 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:436: TypeResource
                {
                mTypeResource(); if (state.failed) return ;


                }
                break;
            case 45 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:449: TypeString
                {
                mTypeString(); if (state.failed) return ;


                }
                break;
            case 46 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:460: While
                {
                mWhile(); if (state.failed) return ;


                }
                break;
            case 47 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:466: Bool
                {
                mBool(); if (state.failed) return ;


                }
                break;
            case 48 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:471: NamespaceId
                {
                mNamespaceId(); if (state.failed) return ;


                }
                break;
            case 49 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:483: VariableId
                {
                mVariableId(); if (state.failed) return ;


                }
                break;
            case 50 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:494: Int
                {
                mInt(); if (state.failed) return ;


                }
                break;
            case 51 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:498: Float
                {
                mFloat(); if (state.failed) return ;


                }
                break;
            case 52 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:504: String
                {
                mString(); if (state.failed) return ;


                }
                break;
            case 53 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:511: Comment
                {
                mComment(); if (state.failed) return ;


                }
                break;
            case 54 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:519: Whitespace
                {
                mWhitespace(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_TSPHP
    public final void synpred1_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:298:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_TSPHP

    // $ANTLR start synpred2_TSPHP
    public final void synpred2_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:7: ( '\\\\' '\\'' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:299:8: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;

        match('\''); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_TSPHP

    // $ANTLR start synpred3_TSPHP
    public final void synpred3_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:6: ( '\\\\' '\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:306:7: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TSPHP

    // $ANTLR start synpred4_TSPHP
    public final void synpred4_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:7: ( '\\\\' '\"' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:307:8: '\\\\' '\"'
        {
        match('\\'); if (state.failed) return ;

        match('\"'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_TSPHP

    // $ANTLR start synpred5_TSPHP
    public final void synpred5_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:6: ( '\\\\' '$' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:308:7: '\\\\' '$'
        {
        match('\\'); if (state.failed) return ;

        match('$'); if (state.failed) return ;

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


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA23_eotS =
        "\6\uffff";
    static final String DFA23_eofS =
        "\6\uffff";
    static final String DFA23_minS =
        "\1\53\2\56\3\uffff";
    static final String DFA23_maxS =
        "\2\71\1\145\3\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\1\1\1\3";
    static final String DFA23_specialS =
        "\6\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "274:1: Float : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA33_eotS =
        "\2\uffff\1\6\1\uffff\1\6\2\uffff";
    static final String DFA33_eofS =
        "\7\uffff";
    static final String DFA33_minS =
        "\1\57\1\52\1\0\1\uffff\1\0\2\uffff";
    static final String DFA33_maxS =
        "\2\57\1\uffff\1\uffff\1\uffff\2\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\2\uffff\1\0\1\uffff\1\1\2\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\2",
            "\12\4\1\5\2\4\1\5\ufff2\4",
            "",
            "\12\4\1\5\2\4\1\5\ufff2\4",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "383:1: Comment : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_2 = input.LA(1);

                        s = -1;
                        if ( ((LA33_2 >= '\u0000' && LA33_2 <= '\t')||(LA33_2 >= '\u000B' && LA33_2 <= '\f')||(LA33_2 >= '\u000E' && LA33_2 <= '\uFFFF')) ) {s = 4;}

                        else if ( (LA33_2=='\n'||LA33_2=='\r') ) {s = 5;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA33_4 = input.LA(1);

                        s = -1;
                        if ( (LA33_4=='\n'||LA33_4=='\r') ) {s = 5;}

                        else if ( ((LA33_4 >= '\u0000' && LA33_4 <= '\t')||(LA33_4 >= '\u000B' && LA33_4 <= '\f')||(LA33_4 >= '\u000E' && LA33_4 <= '\uFFFF')) ) {s = 4;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA34_eotS =
        "\1\uffff\1\51\3\43\2\uffff\1\43\1\uffff\1\64\1\uffff\3\43\11\uffff"+
        "\1\43\7\uffff\4\43\1\uffff\2\112\4\uffff\1\114\6\43\1\123\6\uffff"+
        "\5\43\1\131\1\43\2\uffff\1\43\2\uffff\5\43\1\112\1\uffff\1\112\1"+
        "\uffff\6\43\1\uffff\1\43\1\151\3\43\1\uffff\1\155\10\43\1\167\1"+
        "\170\2\43\1\173\1\43\1\uffff\3\43\1\uffff\5\43\1\u0085\1\u0086\1"+
        "\u0087\1\43\2\uffff\2\43\1\uffff\2\43\1\u008d\1\u0085\4\43\1\u0092"+
        "\3\uffff\5\43\1\uffff\1\43\1\u0099\1\u009a\1\43\1\uffff\1\u009c"+
        "\1\43\1\u009e\1\u009f\2\43\2\uffff\1\43\1\uffff\1\u00a3\2\uffff"+
        "\1\u00a4\1\43\1\u00a6\2\uffff\1\u00a7\2\uffff";
    static final String DFA34_eofS =
        "\u00a8\uffff";
    static final String DFA34_minS =
        "\1\11\1\76\1\162\1\157\1\141\2\uffff\1\145\1\52\1\101\1\60\1\154"+
        "\1\141\1\146\6\uffff\1\55\2\uffff\1\141\1\53\6\uffff\1\164\1\145"+
        "\1\150\1\162\1\uffff\2\56\4\uffff\1\60\1\162\1\145\1\157\1\163\1"+
        "\156\1\146\1\60\6\uffff\1\163\1\162\1\156\1\157\1\154\1\60\1\164"+
        "\2\uffff\1\155\2\uffff\1\151\1\162\1\163\1\151\1\165\1\56\1\uffff"+
        "\1\56\1\uffff\2\141\1\154\1\145\1\164\1\141\1\uffff\1\145\1\60\1"+
        "\143\1\141\1\163\1\uffff\1\60\1\145\1\164\1\151\1\157\1\154\1\145"+
        "\1\171\1\153\2\60\1\151\1\165\1\60\1\141\1\uffff\2\164\1\145\1\uffff"+
        "\1\163\1\143\1\156\1\165\1\145\3\60\1\141\2\uffff\1\156\1\154\1"+
        "\uffff\1\143\1\151\2\60\1\160\1\150\1\147\1\162\1\60\3\uffff\1\156"+
        "\1\165\1\164\1\150\1\157\1\uffff\1\141\2\60\1\143\1\uffff\1\60\1"+
        "\145\2\60\1\156\1\143\2\uffff\1\145\1\uffff\1\60\2\uffff\1\60\1"+
        "\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA34_maxS =
        "\1\u00ff\1\76\1\163\1\162\1\157\2\uffff\1\157\1\75\1\u00ff\1\75"+
        "\1\154\1\165\1\156\6\uffff\1\75\2\uffff\1\141\1\75\6\uffff\1\167"+
        "\1\145\1\150\1\162\1\uffff\2\145\4\uffff\1\u00ff\1\162\1\145\1\157"+
        "\1\163\1\156\1\146\1\u00ff\6\uffff\1\163\1\162\1\156\1\157\1\154"+
        "\1\u00ff\1\164\2\uffff\1\155\2\uffff\1\151\1\162\1\163\1\151\1\165"+
        "\1\145\1\uffff\1\145\1\uffff\2\141\1\154\1\145\1\164\1\141\1\uffff"+
        "\1\145\1\u00ff\1\143\1\141\1\163\1\uffff\1\u00ff\1\145\1\164\1\151"+
        "\1\157\1\154\1\145\1\171\1\153\2\u00ff\1\151\1\165\1\u00ff\1\141"+
        "\1\uffff\2\164\1\145\1\uffff\1\163\1\143\1\156\1\165\1\145\3\u00ff"+
        "\1\141\2\uffff\1\156\1\154\1\uffff\1\143\1\151\2\u00ff\1\160\1\150"+
        "\1\147\1\162\1\u00ff\3\uffff\1\156\1\165\1\164\1\150\1\157\1\uffff"+
        "\1\141\2\u00ff\1\143\1\uffff\1\u00ff\1\145\2\u00ff\1\156\1\143\2"+
        "\uffff\1\145\1\uffff\1\u00ff\2\uffff\1\u00ff\1\145\1\u00ff\2\uffff"+
        "\1\u00ff\2\uffff";
    static final String DFA34_acceptS =
        "\5\uffff\1\5\1\6\7\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\uffff\1"+
        "\33\1\34\2\uffff\1\40\1\41\1\42\1\43\1\44\1\45\4\uffff\1\60\2\uffff"+
        "\1\64\1\66\1\1\1\16\10\uffff\1\11\1\65\1\13\1\61\1\14\1\63\7\uffff"+
        "\1\31\1\32\1\uffff\1\36\1\37\6\uffff\1\62\1\uffff\1\2\6\uffff\1"+
        "\12\5\uffff\1\22\17\uffff\1\17\3\uffff\1\53\11\uffff\1\50\1\4\2"+
        "\uffff\1\15\11\uffff\1\57\1\47\1\3\5\uffff\1\52\4\uffff\1\56\6\uffff"+
        "\1\46\1\55\1\uffff\1\51\1\uffff\1\10\1\20\3\uffff\1\7\1\21\1\uffff"+
        "\1\54\1\35";
    static final String DFA34_specialS =
        "\u00a8\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\uffff\1\46\1\uffff\1\11\1"+
            "\25\1\21\1\46\1\17\1\32\1\26\1\30\1\6\1\24\1\12\1\10\1\45\11"+
            "\44\1\5\1\34\1\35\1\1\1\36\2\uffff\32\43\1\20\1\uffff\1\33\1"+
            "\23\1\43\1\uffff\1\2\1\3\1\4\1\7\1\13\1\14\2\43\1\15\4\43\1"+
            "\27\3\43\1\40\1\37\1\42\2\43\1\41\3\43\1\16\1\22\1\31\1\uffff"+
            "\u0081\43",
            "\1\50",
            "\1\53\1\52",
            "\1\55\2\uffff\1\54",
            "\1\56\15\uffff\1\57",
            "",
            "",
            "\1\60\11\uffff\1\61",
            "\1\63\4\uffff\1\63\15\uffff\1\62",
            "\32\65\4\uffff\1\65\1\uffff\32\65\4\uffff\u0081\65",
            "\12\67\3\uffff\1\66",
            "\1\70",
            "\1\74\12\uffff\1\73\2\uffff\1\71\5\uffff\1\72",
            "\1\75\7\uffff\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\1\67\1\uffff\1\45\11\44\3\uffff\1\77",
            "",
            "",
            "\1\101",
            "\1\103\2\uffff\1\67\1\uffff\1\45\11\44\3\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\2\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\67\1\uffff\12\111\13\uffff\1\67\37\uffff\1\67",
            "\1\67\1\uffff\10\113\2\67\13\uffff\1\67\37\uffff\1\67",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\132",
            "",
            "",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\67\1\uffff\12\111\13\uffff\1\67\37\uffff\1\67",
            "",
            "\1\67\1\uffff\10\113\2\67\13\uffff\1\67\37\uffff\1\67",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\4\43"+
            "\1\150\25\43\4\uffff\u0081\43",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\4\43"+
            "\1\166\25\43\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\171",
            "\1\172",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u009b",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u009d",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "\1\u00a5",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "",
            "",
            "\12\43\7\uffff\32\43\1\uffff\1\43\2\uffff\1\43\1\uffff\32\43"+
            "\4\uffff\u0081\43",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Arrow | As | Break | Case | Colon | Comma | Continue | Default | DivideEqual | Do | Dolar | DotEqual | Else | Equal | For | Foreach | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LogicAndEqual | LogicOrEqual | LogicXorEqual | MinusEqual | MinusMinus | ModuloEqual | MultiplyEqual | Namespace | PlusEqual | PlusPlus | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | ShiftLeftEqual | ShiftRightEqual | Switch | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | While | Bool | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace );";
        }
    }
 

}