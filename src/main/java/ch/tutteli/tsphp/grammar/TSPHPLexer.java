// $ANTLR 3.4 D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g 2012-12-26 13:29:51

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
    public static final int T__67=67;
    public static final int Arrow=4;
    public static final int As=5;
    public static final int BINARY=6;
    public static final int Bool=7;
    public static final int Break=8;
    public static final int Case=9;
    public static final int Colon=10;
    public static final int Comma=11;
    public static final int Comment=12;
    public static final int Continue=13;
    public static final int DECIMAL=14;
    public static final int Default=15;
    public static final int DivideEqual=16;
    public static final int Do=17;
    public static final int Dolar=18;
    public static final int DotEqual=19;
    public static final int EXPONENT=20;
    public static final int Else=21;
    public static final int Equal=22;
    public static final int Float=23;
    public static final int For=24;
    public static final int Foreach=25;
    public static final int Function=26;
    public static final int HEXADECIMAL=27;
    public static final int Identifier=28;
    public static final int If=29;
    public static final int Int=30;
    public static final int LeftCurlyBrace=31;
    public static final int LeftParanthesis=32;
    public static final int LeftSquareBrace=33;
    public static final int LogicAndEqual=34;
    public static final int LogicOrEqual=35;
    public static final int LogicXorEqual=36;
    public static final int MinusEqual=37;
    public static final int MinusMinus=38;
    public static final int ModuloEqual=39;
    public static final int MultiplyEqual=40;
    public static final int Namespace=41;
    public static final int NamespaceId=42;
    public static final int OCTAL=43;
    public static final int PlusEqual=44;
    public static final int PlusPlus=45;
    public static final int Return=46;
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

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:8: ( 'return' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:53:10: 'return'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:17: ( '}' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:54:19: '}'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:18: ( ')' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:55:20: ')'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:18: ( ']' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:56:20: ']'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:11: ( ';' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:57:13: ';'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:16: ( '<<=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:58:18: '<<='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:17: ( '>>=' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:59:19: '>>='
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:8: ( 'switch' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:60:10: 'switch'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:11: ( 'array' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:61:13: 'array'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:10: ( 'bool' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:62:12: 'bool'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:13: ( 'boolean' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:63:15: 'boolean'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:11: ( 'float' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:64:13: 'float'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:9: ( 'int' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:65:11: 'int'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:14: ( 'resource' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:66:16: 'resource'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:12: ( 'string' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:67:14: 'string'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:68:7: ( 'while' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:68:9: 'while'
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

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:69:7: ( 'void' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:69:9: 'void'
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
    // $ANTLR end "T__67"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:126:6: ( 'true' | 'false' )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:126:8: 'true'
                    {
                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:126:15: 'false'
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

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u007f' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:128:57: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\u007f' .. '\\u00ff' )*
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

    // $ANTLR start "NamespaceId"
    public final void mNamespaceId() throws RecognitionException {
        try {
            int _type = NamespaceId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:131:2: ( Identifier ( '\\\\' Identifier )* )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:131:4: Identifier ( '\\\\' Identifier )*
            {
            mIdentifier(); if (state.failed) return ;


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:131:15: ( '\\\\' Identifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:131:16: '\\\\' Identifier
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mIdentifier(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "VariableId"
    public final void mVariableId() throws RecognitionException {
        try {
            int _type = VariableId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:12: ( '$' Identifier )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:246:14: '$' Identifier
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:9: ( ( '+' | '-' )? DECIMAL | ( '+' | '-' )? HEXADECIMAL | ( '+' | '-' )? OCTAL | ( '+' | '-' )? BINARY )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:12: ( '+' | '-' )? DECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:261:12: ( '+' | '-' )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:12: ( '+' | '-' )? HEXADECIMAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:262:12: ( '+' | '-' )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:12: ( '+' | '-' )? OCTAL
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:263:12: ( '+' | '-' )?
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:12: ( '+' | '-' )? BINARY
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:264:12: ( '+' | '-' )?
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:2: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:4: ( '1' .. '9' ) ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:271:15: ( '0' .. '9' )*
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:272:12: '0'
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:277:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:7: ( '0' ( '0' .. '7' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:9: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:280:13: ( '0' .. '7' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:8: ( '0b' ( '0' | '1' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:10: '0b' ( '0' | '1' )+
            {
            match("0b"); if (state.failed) return ;



            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:284:14: ( '0' | '1' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:6: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:8: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:8: ( '+' | '-' )?
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:19: ( '0' .. '9' )+
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

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:35: ( '0' .. '9' )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:47: ( EXPONENT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:295:47: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:8: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:8: ( '+' | '-' )?
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

                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:23: ( '0' .. '9' )+
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:35: ( EXPONENT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:296:35: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:8: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:8: ( '+' | '-' )?
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:297:19: ( '0' .. '9' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:22: ( '+' | '-' )?
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


            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:302:33: ( '0' .. '9' )+
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:8: ( STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED )
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:10: STRING_SINGLE_QUOTED
                    {
                    mSTRING_SINGLE_QUOTED(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:310:33: STRING_DOUBLE_QUOTED
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:2: ( '\\'' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )* '\\'' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:4: '\\'' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:317:9: ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\\'' )=> '\\\\\\'' |~ ( '\\'' ) )*
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
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:6: ( '\\\\\\\\' )=> '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;



            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:7: ( '\\\\\\'' )=> '\\\\\\''
            	    {
            	    match("\\'"); if (state.failed) return ;



            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:320:6: ~ ( '\\'' )
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:6: ( '\"' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"' )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:8: '\"' ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:325:12: ( ( '\\\\\\\\' )=> '\\\\\\\\' | ( '\\\\\"' )=> '\\\\\"' | ( '\\\\$' )=> '\\\\$' |~ ( '\"' | '$' ) )*
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
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:6: ( '\\\\\\\\' )=> '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;



            	    }
            	    break;
            	case 2 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:7: ( '\\\\\"' )=> '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;



            	    }
            	    break;
            	case 3 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:6: ( '\\\\$' )=> '\\\\$'
            	    {
            	    match("\\$"); if (state.failed) return ;



            	    }
            	    break;
            	case 4 :
            	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:329:6: ~ ( '\"' | '$' )
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

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:9: (~ ( '\\n' | '\\r' ) )*
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


                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:23: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:389:23: '\\r'
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:6: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:391:11: (~ ( '\\n' | '\\r' ) )*
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
                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); if (state.failed) return ;



                    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:13: ( options {greedy=false; } : . )*
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
                    	    // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:392:41: .
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
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:12: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:395:14: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:8: ( Arrow | As | Break | Case | Colon | Comma | Continue | Default | DivideEqual | Do | Dolar | DotEqual | Else | Equal | For | Foreach | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LogicAndEqual | LogicOrEqual | LogicXorEqual | MinusEqual | MinusMinus | ModuloEqual | MultiplyEqual | Namespace | PlusEqual | PlusPlus | Return | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | ShiftLeftEqual | ShiftRightEqual | Switch | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | While | T__67 | Bool | Identifier | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace )
        int alt34=57;
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
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:289: Return
                {
                mReturn(); if (state.failed) return ;


                }
                break;
            case 33 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:296: RightCurlyBrace
                {
                mRightCurlyBrace(); if (state.failed) return ;


                }
                break;
            case 34 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:312: RightParanthesis
                {
                mRightParanthesis(); if (state.failed) return ;


                }
                break;
            case 35 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:329: RightSquareBrace
                {
                mRightSquareBrace(); if (state.failed) return ;


                }
                break;
            case 36 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:346: Semicolon
                {
                mSemicolon(); if (state.failed) return ;


                }
                break;
            case 37 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:356: ShiftLeftEqual
                {
                mShiftLeftEqual(); if (state.failed) return ;


                }
                break;
            case 38 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:371: ShiftRightEqual
                {
                mShiftRightEqual(); if (state.failed) return ;


                }
                break;
            case 39 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:387: Switch
                {
                mSwitch(); if (state.failed) return ;


                }
                break;
            case 40 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:394: TypeArray
                {
                mTypeArray(); if (state.failed) return ;


                }
                break;
            case 41 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:404: TypeBool
                {
                mTypeBool(); if (state.failed) return ;


                }
                break;
            case 42 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:413: TypeBoolean
                {
                mTypeBoolean(); if (state.failed) return ;


                }
                break;
            case 43 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:425: TypeFloat
                {
                mTypeFloat(); if (state.failed) return ;


                }
                break;
            case 44 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:435: TypeInt
                {
                mTypeInt(); if (state.failed) return ;


                }
                break;
            case 45 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:443: TypeResource
                {
                mTypeResource(); if (state.failed) return ;


                }
                break;
            case 46 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:456: TypeString
                {
                mTypeString(); if (state.failed) return ;


                }
                break;
            case 47 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:467: While
                {
                mWhile(); if (state.failed) return ;


                }
                break;
            case 48 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:473: T__67
                {
                mT__67(); if (state.failed) return ;


                }
                break;
            case 49 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:479: Bool
                {
                mBool(); if (state.failed) return ;


                }
                break;
            case 50 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:484: Identifier
                {
                mIdentifier(); if (state.failed) return ;


                }
                break;
            case 51 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:495: NamespaceId
                {
                mNamespaceId(); if (state.failed) return ;


                }
                break;
            case 52 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:507: VariableId
                {
                mVariableId(); if (state.failed) return ;


                }
                break;
            case 53 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:518: Int
                {
                mInt(); if (state.failed) return ;


                }
                break;
            case 54 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:522: Float
                {
                mFloat(); if (state.failed) return ;


                }
                break;
            case 55 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:528: String
                {
                mString(); if (state.failed) return ;


                }
                break;
            case 56 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:535: Comment
                {
                mComment(); if (state.failed) return ;


                }
                break;
            case 57 :
                // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:1:543: Whitespace
                {
                mWhitespace(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_TSPHP
    public final void synpred1_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:6: ( '\\\\\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:318:7: '\\\\\\\\'
        {
        match("\\\\"); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred1_TSPHP

    // $ANTLR start synpred2_TSPHP
    public final void synpred2_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:7: ( '\\\\\\'' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:319:8: '\\\\\\''
        {
        match("\\'"); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred2_TSPHP

    // $ANTLR start synpred3_TSPHP
    public final void synpred3_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:6: ( '\\\\\\\\' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:326:7: '\\\\\\\\'
        {
        match("\\\\"); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred3_TSPHP

    // $ANTLR start synpred4_TSPHP
    public final void synpred4_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:7: ( '\\\\\"' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:327:8: '\\\\\"'
        {
        match("\\\""); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred4_TSPHP

    // $ANTLR start synpred5_TSPHP
    public final void synpred5_TSPHP_fragment() throws RecognitionException {
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:6: ( '\\\\$' )
        // D:\\TSPHP-grammar\\src\\main\\antlr\\TSPHP.g:328:7: '\\\\$'
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
            return "294:1: Float : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
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
            return "388:1: Comment : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' );";
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
        "\1\uffff\1\52\3\56\2\uffff\1\56\1\uffff\1\70\1\uffff\3\56\11\uffff"+
        "\1\56\1\uffff\1\56\6\uffff\5\56\2\117\4\uffff\1\121\2\56\2\uffff"+
        "\5\56\1\130\6\uffff\5\56\1\136\1\56\2\uffff\1\56\2\uffff\6\56\1"+
        "\117\1\uffff\1\117\1\uffff\6\56\1\uffff\1\56\1\160\3\56\1\uffff"+
        "\1\164\12\56\1\u0080\1\u0081\2\56\1\u0084\1\56\1\uffff\3\56\1\uffff"+
        "\6\56\1\u008f\1\u0090\1\u0091\1\u0092\1\56\2\uffff\2\56\1\uffff"+
        "\2\56\1\u0098\1\u0090\5\56\1\u009e\4\uffff\5\56\1\uffff\1\56\1\u00a5"+
        "\1\56\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\56\1\u00ab\1\u00ac\2\56"+
        "\1\uffff\1\56\3\uffff\1\u00b0\2\uffff\1\u00b1\1\56\1\u00b3\2\uffff"+
        "\1\u00b4\2\uffff";
    static final String DFA34_eofS =
        "\u00b5\uffff";
    static final String DFA34_minS =
        "\1\11\1\76\3\60\2\uffff\1\60\1\52\1\101\4\60\6\uffff\1\55\2\uffff"+
        "\1\60\1\53\1\60\6\uffff\5\60\2\56\4\uffff\3\60\2\uffff\6\60\6\uffff"+
        "\7\60\2\uffff\1\60\2\uffff\6\60\1\56\1\uffff\1\56\1\uffff\6\60\1"+
        "\uffff\5\60\1\uffff\21\60\1\uffff\3\60\1\uffff\13\60\2\uffff\2\60"+
        "\1\uffff\12\60\4\uffff\5\60\1\uffff\5\60\1\uffff\6\60\1\uffff\1"+
        "\60\3\uffff\1\60\2\uffff\3\60\2\uffff\1\60\2\uffff";
    static final String DFA34_maxS =
        "\1\u00ff\1\76\3\u00ff\2\uffff\1\u00ff\1\75\1\u00ff\1\75\3\u00ff"+
        "\6\uffff\1\75\2\uffff\1\u00ff\1\75\1\u00ff\6\uffff\5\u00ff\2\145"+
        "\4\uffff\3\u00ff\2\uffff\6\u00ff\6\uffff\7\u00ff\2\uffff\1\u00ff"+
        "\2\uffff\6\u00ff\1\145\1\uffff\1\145\1\uffff\6\u00ff\1\uffff\5\u00ff"+
        "\1\uffff\21\u00ff\1\uffff\3\u00ff\1\uffff\13\u00ff\2\uffff\2\u00ff"+
        "\1\uffff\12\u00ff\4\uffff\5\u00ff\1\uffff\5\u00ff\1\uffff\6\u00ff"+
        "\1\uffff\1\u00ff\3\uffff\1\u00ff\2\uffff\3\u00ff\2\uffff\1\u00ff"+
        "\2\uffff";
    static final String DFA34_acceptS =
        "\5\uffff\1\5\1\6\7\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\uffff\1"+
        "\33\1\34\3\uffff\1\41\1\42\1\43\1\44\1\45\1\46\7\uffff\1\67\1\71"+
        "\1\1\1\16\3\uffff\1\62\1\63\6\uffff\1\11\1\70\1\13\1\64\1\14\1\66"+
        "\7\uffff\1\31\1\32\1\uffff\1\36\1\37\7\uffff\1\65\1\uffff\1\2\6"+
        "\uffff\1\12\5\uffff\1\22\21\uffff\1\17\3\uffff\1\54\13\uffff\1\51"+
        "\1\4\2\uffff\1\15\12\uffff\1\60\1\61\1\50\1\3\5\uffff\1\53\5\uffff"+
        "\1\57\6\uffff\1\40\1\uffff\1\47\1\56\1\52\1\uffff\1\10\1\20\3\uffff"+
        "\1\7\1\21\1\uffff\1\55\1\35";
    static final String DFA34_specialS =
        "\u00b5\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\uffff\1\47\1\uffff\1\11\1"+
            "\25\1\21\1\47\1\17\1\33\1\26\1\30\1\6\1\24\1\12\1\10\1\46\11"+
            "\45\1\5\1\35\1\36\1\1\1\37\2\uffff\32\44\1\20\1\uffff\1\34\1"+
            "\23\1\44\1\uffff\1\2\1\3\1\4\1\7\1\13\1\14\2\44\1\15\4\44\1"+
            "\27\3\44\1\31\1\40\1\43\1\44\1\42\1\41\3\44\1\16\1\22\1\32\1"+
            "\uffff\u0081\44",
            "\1\51",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\54\1\53\7\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\61\2\55\1\60\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\62"+
            "\15\55\1\63\13\55\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\64\11\55\1\65\13\55\4\uffff\u0081\55",
            "\1\67\4\uffff\1\67\15\uffff\1\66",
            "\32\71\4\uffff\1\71\1\uffff\32\71\4\uffff\u0081\71",
            "\12\73\3\uffff\1\72",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\13\55"+
            "\1\74\16\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\100"+
            "\12\55\1\77\2\55\1\75\5\55\1\76\5\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\5\55"+
            "\1\101\7\55\1\102\14\55\4\uffff\u0081\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104\1\73\1\uffff\1\46\11\45\3\uffff\1\103",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\105"+
            "\31\55\4\uffff\u0081\55",
            "\1\107\2\uffff\1\73\1\uffff\1\46\11\45\3\uffff\1\106",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\110\25\55\4\uffff\u0081\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\112\2\55\1\111\3\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\7\55"+
            "\1\113\22\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\114\13\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\115\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\1\73\1\uffff\12\116\13\uffff\1\73\37\uffff\1\73",
            "\1\73\1\uffff\10\120\2\73\13\uffff\1\73\37\uffff\1\73",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\122\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\123\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\124\13\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\22\55"+
            "\1\125\7\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\126\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\5\55"+
            "\1\127\24\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\22\55"+
            "\1\131\7\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\132\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\133\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\134\13\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\13\55"+
            "\1\135\16\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\137\6\55\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\14\55"+
            "\1\140\15\55\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\22\55"+
            "\1\142\1\141\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\143\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\144\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\145\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\146\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\24\55"+
            "\1\147\5\55\4\uffff\u0081\55",
            "\1\73\1\uffff\12\116\13\uffff\1\73\37\uffff\1\73",
            "",
            "\1\73\1\uffff\10\120\2\73\13\uffff\1\73\37\uffff\1\73",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\150"+
            "\31\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\151"+
            "\31\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\13\55"+
            "\1\152\16\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\153\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\154\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\155"+
            "\31\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\156\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\157\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\2\55"+
            "\1\161\27\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\162"+
            "\31\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\22\55"+
            "\1\163\7\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\165\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\24\55"+
            "\1\166\5\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\167\13\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\170\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\171\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\13\55"+
            "\1\172\16\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\3\55"+
            "\1\173\26\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\174\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\30\55"+
            "\1\175\1\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\12\55"+
            "\1\176\17\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\177\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\u0082\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\24\55"+
            "\1\u0083\5\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\u0085"+
            "\31\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\u0086\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\u0087\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\u0088\25\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\22\55"+
            "\1\u0089\7\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\u008a\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\24\55"+
            "\1\u008b\5\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\2\55"+
            "\1\u008c\27\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\u008d\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\u008e\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\u0093"+
            "\31\55\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\u0094\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\13\55"+
            "\1\u0095\16\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\2\55"+
            "\1\u0096\27\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\10\55"+
            "\1\u0097\21\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\17\55"+
            "\1\u0099\12\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\u009a\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\21\55"+
            "\1\u009b\10\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\7\55"+
            "\1\u009c\22\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\6\55"+
            "\1\u009d\23\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\u009f\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\24\55"+
            "\1\u00a0\5\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\23\55"+
            "\1\u00a1\6\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\7\55"+
            "\1\u00a2\22\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\16\55"+
            "\1\u00a3\13\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\1\u00a4"+
            "\31\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\2\55"+
            "\1\u00a6\27\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\u00aa\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\15\55"+
            "\1\u00ad\14\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\2\55"+
            "\1\u00ae\27\55\4\uffff\u0081\55",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\u00af\25\55\4\uffff\u0081\55",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\4\55"+
            "\1\u00b2\25\55\4\uffff\u0081\55",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
            "",
            "",
            "\12\55\7\uffff\32\55\1\uffff\1\57\2\uffff\1\55\1\uffff\32\55"+
            "\4\uffff\u0081\55",
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
            return "1:1: Tokens : ( Arrow | As | Break | Case | Colon | Comma | Continue | Default | DivideEqual | Do | Dolar | DotEqual | Else | Equal | For | Foreach | Function | If | LeftCurlyBrace | LeftParanthesis | LeftSquareBrace | LogicAndEqual | LogicOrEqual | LogicXorEqual | MinusEqual | MinusMinus | ModuloEqual | MultiplyEqual | Namespace | PlusEqual | PlusPlus | Return | RightCurlyBrace | RightParanthesis | RightSquareBrace | Semicolon | ShiftLeftEqual | ShiftRightEqual | Switch | TypeArray | TypeBool | TypeBoolean | TypeFloat | TypeInt | TypeResource | TypeString | While | T__67 | Bool | Identifier | NamespaceId | VariableId | Int | Float | String | Comment | Whitespace );";
        }
    }
 

}