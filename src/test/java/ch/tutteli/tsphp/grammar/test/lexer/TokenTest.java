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
package ch.tutteli.tsphp.grammar.test.lexer;

import ch.tutteli.tsphp.grammar.TSPHPLexer;
import ch.tutteli.tsphp.grammar.test.utils.ALexerTest;
import ch.tutteli.tsphp.grammar.test.utils.IdentifierHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class TokenTest extends ALexerTest
{

    public TokenTest(String methodName, String testString, int type) {
        super(methodName, testString, type);
    }

    @Test
    public void testTokens() throws Exception {
        analyseAndCheckForError();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mAbstract", "abstract", TSPHPLexer.Abstract},
                    {"mArrow", "=>", TSPHPLexer.Arrow},
                    {"mAs", "as", TSPHPLexer.As},
                    {"mAssign", "=", TSPHPLexer.Assign},
                    {"mAt", "@", TSPHPLexer.At},
                    {"mBackslash", "\\", TSPHPLexer.Backslash},
                    {"mBitwiseAnd", "&", TSPHPLexer.BitwiseAnd},
                    {"mBitwiseAndEqual", "&=", TSPHPLexer.BitwiseAndEqual},
                    {"mBitwiseNot", "~", TSPHPLexer.BitwiseNot},
                    {"mBitwiseOr", "|", TSPHPLexer.BitwiseOr},
                    {"mBitwiseOrEqual", "|=", TSPHPLexer.BitwiseOrEqual},
                    {"mBitwiseXor", "^", TSPHPLexer.BitwiseXor},
                    {"mBitwiseXorEqual", "^=", TSPHPLexer.BitwiseXorEqual},
                    {"mBool", "true", TSPHPLexer.Bool},
                    {"mBool", "false", TSPHPLexer.Bool},
                    {"mBreak", "break", TSPHPLexer.Break},
                    {"mCase", "case", TSPHPLexer.Case},
                    {"mCatch", "catch", TSPHPLexer.Catch},
                    {"mClass", "class", TSPHPLexer.Class},
                    {"mClone", "clone", TSPHPLexer.Clone},
                    {"mColon", ":", TSPHPLexer.Colon},
                    {"mComma", ",", TSPHPLexer.Comma},
                    {"mConst", "const", TSPHPLexer.Const},
                    {"mContinue", "continue", TSPHPLexer.Continue},
                    {"mDefault", "default", TSPHPLexer.Default},
                    {"mDivide", "/", TSPHPLexer.Divide},
                    {"mDivideEqual", "/=", TSPHPLexer.DivideEqual},
                    {"mDo", "do", TSPHPLexer.Do},
                    {"mDolar", "$", TSPHPLexer.Dolar},
                    {"mDotEqual", ".=", TSPHPLexer.DotEqual},
                    {"mDoubleColon", "::", TSPHPLexer.DoubleColon},
                    {"mEcho", "echo", TSPHPLexer.Echo},
                    {"mElse", "else", TSPHPLexer.Else},
                    {"mEqual", "==", TSPHPLexer.Equal},
                    {"mExtends", "extends", TSPHPLexer.Extends},
                    {"mExit", "exit", TSPHPLexer.Exit},
                    {"mFinal", "final", TSPHPLexer.Final},
                    {"mFunction", "function", TSPHPLexer.Function},
                    {"mFor", "for", TSPHPLexer.For},
                    {"mForeach", "foreach", TSPHPLexer.Foreach},
                    {"mGreaterThan", ">", TSPHPLexer.GreaterThan},
                    {"mGreaterEqualThan", ">=", TSPHPLexer.GreaterEqualThan},
                    {"mIdentical", "===", TSPHPLexer.Identical},
                    {"mIf", "if", TSPHPLexer.If},
                    {"mImplements", "implements", TSPHPLexer.Implements},
                    {"mInstanceof", "instanceof", TSPHPLexer.Instanceof},
                    {"mInterface", "interface", TSPHPLexer.Interface},
                    {"mLeftCurlyBrace", "{", TSPHPLexer.LeftCurlyBrace},
                    {"mLeftParanthesis", "(", TSPHPLexer.LeftParanthesis},
                    {"mLeftSquareBrace", "[", TSPHPLexer.LeftSquareBrace},
                    {"mLessThan", "<", TSPHPLexer.LessThan},
                    {"mLessEqualThan", "<=", TSPHPLexer.LessEqualThan},
                    {"mLogicAnd", "&&", TSPHPLexer.LogicAnd},
                    {"mLogicAndWeak", "and", TSPHPLexer.LogicAndWeak},
                    {"mLogicNot", "!", TSPHPLexer.LogicNot},
                    {"mLogicOr", "||", TSPHPLexer.LogicOr},
                    {"mLogicOrWeak", "or", TSPHPLexer.LogicOrWeak},
                    {"mLogicXorWeak", "xor", TSPHPLexer.LogicXorWeak},
                    {"mMinus", "-", TSPHPLexer.Minus},
                    {"mMinusEqual", "-=", TSPHPLexer.MinusEqual},
                    {"mMinusMinus", "--", TSPHPLexer.MinusMinus},
                    {"mModulo", "%", TSPHPLexer.Modulo},
                    {"mModuloEqual", "%=", TSPHPLexer.ModuloEqual},
                    {"mMultiply", "*", TSPHPLexer.Multiply},
                    {"mMultiplyEqual", "*=", TSPHPLexer.MultiplyEqual},
                    {"mNamespace", "namespace", TSPHPLexer.Namespace},
                    {"mNew", "new", TSPHPLexer.New},
                    {"mNotEqual", "!=", TSPHPLexer.NotEqual},
                    {"mNotEqualAlternative", "<>", TSPHPLexer.NotEqualAlternative},
                    {"mNotIdentical", "!==", TSPHPLexer.NotIdentical},
                    {"mObjectOperator", "->", TSPHPLexer.ObjectOperator},
                    {"mParent", "parent::", TSPHPLexer.Parent},
                    {"mPlus", "+", TSPHPLexer.Plus},
                    {"mPlusEqual", "+=", TSPHPLexer.PlusEqual},
                    {"mPlusPlus", "++", TSPHPLexer.PlusPlus},
                    {"mPrivate", "private", TSPHPLexer.Private},
                    {"mProtected", "protected", TSPHPLexer.Protected},
                    {"mProtectParent", "parent", TSPHPLexer.ProtectParent},
                    {"mProtectSelf", "self", TSPHPLexer.ProtectSelf},
                    {"mProtectThis", "this", TSPHPLexer.ProtectThis},
                    {"mPublic", "public", TSPHPLexer.Public},
                    {"mQuestionMark", "?", TSPHPLexer.QuestionMark},
                    {"mReturn", "return", TSPHPLexer.Return},
                    {"mRightCurlyBrace", "}", TSPHPLexer.RightCurlyBrace},
                    {"mRightParanthesis", ")", TSPHPLexer.RightParanthesis},
                    {"mRightSquareBrace", "]", TSPHPLexer.RightSquareBrace},
                    {"mSelf", "self::", TSPHPLexer.Self},
                    {"mShiftLeft", "<<", TSPHPLexer.ShiftLeft},
                    {"mShiftLeftEqual", "<<=", TSPHPLexer.ShiftLeftEqual},
                    {"mShiftRight", ">>", TSPHPLexer.ShiftRight},
                    {"mShiftRightEqual", ">>=", TSPHPLexer.ShiftRightEqual},
                    {"mStatic", "static", TSPHPLexer.Static},
                    {"mThis", "$this", TSPHPLexer.This},
                    {"mThrow", "throw", TSPHPLexer.Throw},
                    {"mTry", "try", TSPHPLexer.Try},
                    {"mTypeArray", "array", TSPHPLexer.TypeArray},
                    {"mTypeBool", "bool", TSPHPLexer.TypeBool},
                    {"mTypeBoolean", "boolean", TSPHPLexer.TypeBoolean},
                    {"mTypeFloat", "float", TSPHPLexer.TypeFloat},
                    {"mTypeInt", "int", TSPHPLexer.TypeInt},
                    {"mTypeObject", "object", TSPHPLexer.TypeObject},
                    {"mTypeResource", "resource", TSPHPLexer.TypeResource},
                    {"mTypeString", "string", TSPHPLexer.TypeString},
                    {"mSemicolon", ";", TSPHPLexer.Semicolon},
                    {"mSwitch", "switch", TSPHPLexer.Switch},
                    {"mUse", "use", TSPHPLexer.Use},
                    {"mVoid", "void", TSPHPLexer.Void},
                    {"mWhile", "while", TSPHPLexer.While}
                }));

        String[] floatStrings = getFloatTestStrings();
        for (String floatString : floatStrings) {
            collection.add(new Object[]{"mFloat", floatString, TSPHPLexer.Float});
        }

        Collection<Object[]> intCollection = FragmentsTest.getIntFragments();
        for (Object[] obj : intCollection) {
            collection.add(new Object[]{"mInt", obj[1], TSPHPLexer.Int});
        }

        Collection<Object[]> stringCollection = FragmentsTest.getStringFragments();
        for (Object[] obj : stringCollection) {
            collection.add(new Object[]{"mString", obj[1], TSPHPLexer.String});
        }

        Collection<Object[]> ids = getIDTestStrings();
        for (Object[] obj : ids) {
            collection.add(new Object[]{"mVariableId", "$" + obj[1], TSPHPLexer.VariableId});
        }

        return collection;
    }

    public static String[] getFloatTestStrings() {
        return new String[]{
                    "5867491023e7845120963",
                    "5867491023e+7538964120",
                    "5867491023e-9510236478",
                    "1234567890.19876543201",
                    "1234567890.19876543201e7845120963",
                    "1234567890.19876543201e+7538964120",
                    "1234567890.19876543201e-9510236478",
                    ".4567891203",
                    ".4567891203e7418520963",
                    ".4567891203e+0147258369",
                    ".4567891203e-1024578963",
                    ".0",
                    "0.0",
                    "0.0e0",
                    "0.0e+0",
                    "0.0e-0"
                };
    }

    public static Collection<Object[]> getIDTestStrings() {
        List<Object[]> collection = new ArrayList<>();
        for (int i = 'a'; i < 'z'; ++i) {
            collection.add(new Object[]{"mIdetifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        for (int i = 'A'; i < 'Z'; ++i) {
            collection.add(new Object[]{"mIdetifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        for (int i = 127; i <= 255; ++i) {
            collection.add(new Object[]{"mIdetifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        collection.add(new Object[]{"mIdetifier", "_", TSPHPLexer.Identifier});
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mIdetifier", IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_", TSPHPLexer.Identifier},
                    {"mIdetifier", IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_", TSPHPLexer.Identifier},
                    {"mIdetifier", IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + "_", TSPHPLexer.Identifier},
                    {"mIdetifier", "_" + IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits(), TSPHPLexer.Identifier}
                }));
        return collection;
    }
}
