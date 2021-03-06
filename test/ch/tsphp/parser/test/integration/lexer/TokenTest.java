/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.lexer;

import ch.tsphp.parser.test.integration.testutils.ALexerTest;
import ch.tsphp.parser.antlr.TSPHPLexer;
import ch.tsphp.parser.test.integration.testutils.IdentifierHelper;
import ch.tsphp.parser.test.integration.testutils.VariationHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mAbstract", "abstract", TSPHPLexer.Abstract},
                    {"mArrow", "=>", TSPHPLexer.Arrow},
                    {"mAs", "as", TSPHPLexer.As},
                    {"mAssign", "=", TSPHPLexer.Assign},
                    {"mAt", "@", TSPHPLexer.At},
                    {"mBackslash", "\\", TSPHPLexer.Backslash},
                    {"mBitwiseAnd", "&", TSPHPLexer.BitwiseAnd},
                    {"mBitwiseAndAssign", "&=", TSPHPLexer.BitwiseAndAssign},
                    {"mBitwiseNot", "~", TSPHPLexer.BitwiseNot},
                    {"mBitwiseOr", "|", TSPHPLexer.BitwiseOr},
                    {"mBitwiseOrAssign", "|=", TSPHPLexer.BitwiseOrAssign},
                    {"mBitwiseXor", "^", TSPHPLexer.BitwiseXor},
                    {"mBitwiseXorAssign", "^=", TSPHPLexer.BitwiseXorAssign},
                    {"mBool", "true", TSPHPLexer.Bool},
                    {"mBool", "false", TSPHPLexer.Bool},
                    {"mBreak", "break", TSPHPLexer.Break},
                    {"mCase", "case", TSPHPLexer.Case},
                    {"mCast", "cast", TSPHPLexer.Cast},
                    {"mCatch", "catch", TSPHPLexer.Catch},
                    {"mClass", "class", TSPHPLexer.Class},
                    {"mClone", "clone", TSPHPLexer.Clone},
                    {"mColon", ":", TSPHPLexer.Colon},
                    {"mComma", ",", TSPHPLexer.Comma},
                    {"mConst", "const", TSPHPLexer.Const},
                    {"mConstruct", "__construct", TSPHPLexer.Construct},
                    {"mContinue", "continue", TSPHPLexer.Continue},
                    {"mDefault", "default", TSPHPLexer.Default},
                    {"mDestruct", "__destruct", TSPHPLexer.Destruct},
                    {"mDivide", "/", TSPHPLexer.Divide},
                    {"mDivideAssign", "/=", TSPHPLexer.DivideAssign},
                    {"mDo", "do", TSPHPLexer.Do},
                    {"mDollar", "$", TSPHPLexer.Dollar},
                    {"mDotAssign", ".=", TSPHPLexer.DotAssign},
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
                    {"mLeftParenthesis", "(", TSPHPLexer.LeftParenthesis},
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
                    {"mMinusAssign", "-=", TSPHPLexer.MinusAssign},
                    {"mMinusMinus", "--", TSPHPLexer.MinusMinus},
                    {"mModulo", "%", TSPHPLexer.Modulo},
                    {"mModuloAssign", "%=", TSPHPLexer.ModuloAssign},
                    {"mMultiply", "*", TSPHPLexer.Multiply},
                    {"mMultiplyAssign", "*=", TSPHPLexer.MultiplyAssign},
                    {"mNamespace", "namespace", TSPHPLexer.Namespace},
                    {"mNew", "new", TSPHPLexer.New},
                    {"mNotEqual", "!=", TSPHPLexer.NotEqual},
                    {"mNotIdentical", "!==", TSPHPLexer.NotIdentical},
                    {"mNull","null",TSPHPLexer.Null},
                    {"mObjectOperator", "->", TSPHPLexer.ObjectOperator},
                    {"mParent", "parent", TSPHPLexer.Parent},
                    {"mParentColonColon", "parent::", TSPHPLexer.ParentColonColon},
                    {"mPlus", "+", TSPHPLexer.Plus},
                    {"mPlusAssign", "+=", TSPHPLexer.PlusAssign},
                    {"mPlusPlus", "++", TSPHPLexer.PlusPlus},
                    {"mPrivate", "private", TSPHPLexer.Private},
                    {"mProtected", "protected", TSPHPLexer.Protected},
                    {"mProtectThis", "this", TSPHPLexer.ProtectThis},
                    {"mPublic", "public", TSPHPLexer.Public},
                    {"mQuestionMark", "?", TSPHPLexer.QuestionMark},
                    {"mReturn", "return", TSPHPLexer.Return},
                    {"mRightCurlyBrace", "}", TSPHPLexer.RightCurlyBrace},
                    {"mRightParenthesis", ")", TSPHPLexer.RightParenthesis},
                    {"mRightSquareBrace", "]", TSPHPLexer.RightSquareBrace},
                    {"mSelf", "self", TSPHPLexer.Self},
                    {"mSelfColonColon", "self::", TSPHPLexer.SelfColonColon},
                    {"mSemicolon", ";", TSPHPLexer.Semicolon},
                    {"mShiftLeft", "<<", TSPHPLexer.ShiftLeft},
                    {"mShiftLeftAssign", "<<=", TSPHPLexer.ShiftLeftAssign},
                    {"mShiftRight", ">>", TSPHPLexer.ShiftRight},
                    {"mShiftRightAssign", ">>=", TSPHPLexer.ShiftRightAssign},
                    {"mStatic", "static", TSPHPLexer.Static},
                    {"mSwitch", "switch", TSPHPLexer.Switch},
                    {"mThis", "$this", TSPHPLexer.This},
                    {"mThrow", "throw", TSPHPLexer.Throw},
                    {"mTry", "try", TSPHPLexer.Try},
                    {"mTypeArray", "array", TSPHPLexer.TypeArray},
                    {"mTypeBool", "bool", TSPHPLexer.TypeBool},
                    {"mTypeAliasBool", "boolean", TSPHPLexer.TypeAliasBool},
                    {"mTypeAliasFloat", "double", TSPHPLexer.TypeAliasFloat},
                    {"mTypeFloat", "float", TSPHPLexer.TypeFloat},
                    {"mTypeInt", "int", TSPHPLexer.TypeInt},
                    {"mTypeAliasInt", "integer", TSPHPLexer.TypeAliasInt},
                    {"mTypeObject", "object", TSPHPLexer.TypeObject},
                    {"mTypeResource", "resource", TSPHPLexer.TypeResource},
                    {"mTypeString", "string", TSPHPLexer.TypeString},
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
            collection.add(new Object[]{obj[0], obj[1]+""+obj[1], TSPHPLexer.Identifier});
            collection.add(new Object[]{obj[0], obj[1]+""+obj[1]+""+obj[1], TSPHPLexer.Identifier});
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {"mIdentifier", IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_", TSPHPLexer.Identifier},
                    {"mIdentifier", IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + IdentifierHelper.getAllSpecialCharacters() + "_", TSPHPLexer.Identifier},
                    {"mIdentifier", IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits() + "_", TSPHPLexer.Identifier},
                    {"mIdentifier", "_" + IdentifierHelper.getAllSpecialCharacters() + IdentifierHelper.getAllUpperCaseCharacters() + IdentifierHelper.getAllLowerCaseCharacters() + IdentifierHelper.getAllDigits(), TSPHPLexer.Identifier}
                }));
        
        String[] nullCombinations = VariationHelper.getUppercaseCombinations("null");
        for (String combination : nullCombinations) {
            collection.add(new Object[]{"mNull", combination, TSPHPLexer.Null});
        }
        
        String[] trueCombinations = VariationHelper.getUppercaseCombinations("true");
        for (String combination : trueCombinations) {
            collection.add(new Object[]{"mBool", combination, TSPHPLexer.Bool});
        }
        
        String[] falseCombinations = VariationHelper.getUppercaseCombinations("false");
        for (String combination : falseCombinations) {
            collection.add(new Object[]{"mBool", combination, TSPHPLexer.Bool});
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
            collection.add(new Object[]{"mIdentifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        for (int i = 'A'; i < 'Z'; ++i) {
            collection.add(new Object[]{"mIdentifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        for (int i = 127; i <= 255; ++i) {
            collection.add(new Object[]{"mIdentifier", IdentifierHelper.asciiToString(i), TSPHPLexer.Identifier});
        }
        collection.add(new Object[]{"mIdentifier", "_", TSPHPLexer.Identifier});
        return collection;
    }
}
