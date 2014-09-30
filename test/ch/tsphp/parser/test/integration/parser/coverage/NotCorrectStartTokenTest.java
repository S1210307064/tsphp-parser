/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This class is based on the class NotCorrectStartTokenTest from the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.parser.test.integration.parser.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NotCorrectStartTokenTest extends AParserParserExceptionTest
{

    private String methodName;

    public NotCorrectStartTokenTest(String theMethodName, String testString, int aToken, int aPosition,
            Class<? extends RecognitionException> type) {
        super(testString + " - " + theMethodName, aToken, aPosition, type);
        methodName = theMethodName;
    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    protected void run() throws RecognitionException, NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Method method = TSPHPParser.class.getMethod(methodName);
        result = (org.antlr.runtime.ParserRuleReturnScope) method.invoke(parser);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {

        return Arrays.asList(new Object[][]{
                {"abstractConstructDestructDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"abstractMethodDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"abstractMethodModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"accessModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"accessModifierWithoutPrivate", "else", TSPHPParser.Else, 0, MismatchedSetException.class},
                {"actualParameters", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"allTypesInclModifierForParameter", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"allTypesWithModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"allTypesWithoutMixed", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"allTypesWithoutMixedWithModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"array", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"arrayContent", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"arrayKeyValue", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"assign", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"assignment", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"atom", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"bitwiseAnd", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"bitwiseOr", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"bitwiseShift", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"bitwiseXor", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"call", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"caseLabel", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                //expects parameters
                //{"castAssign", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                //{"castAssignOrAssignList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"catchBlock", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"classBody", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"classConstant", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"classDefinition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"classInterfaceTypeWithoutMixed", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"classModifier", "else", TSPHPParser.Else, 0, MismatchedSetException.class},
                {"cloneOrNew", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"comparison", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"compilationUnit", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"constDefinitionList", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"constantAssignment", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"constructDestructDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"constructDestructModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"defaultCaseInstructionMandatory", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"defaultCaseInstructionOptional", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"defaultLabel", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"definition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"doWhileLoop", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"definition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"equality", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"expression", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"expressionList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"factor", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"fieldDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"fieldModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"forCondition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"forInit", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"forLoop", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"forUpdate", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"foreachLoop", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"formalParameters", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"functionCall", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"functionDefinition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"functionIdentifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"functionSignatureInclReturnType", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"globalConstant", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"identifierList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"ifCondition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"instanceOf", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"instruction", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"interfaceBody", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"interfaceConstructDefinition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"interfaceDefinition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"interfaceMethodDefinition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"localVariableDeclarationList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"logicAnd", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"logicAndWeak", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"logicOr", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"logicOrWeak", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"logicXorWeak", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"methodCall", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"methodCallSelfOrParent", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"methodCallStatic", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"methodDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"methodIdentifier", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"methodModifier", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"mixedWithModifier", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"namespaceBracket", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"namespaceId", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"namespaceIdOrEmpty", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"namespaceSemicolon", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"newObject", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"normalCaseInstructionMandatory", "else", TSPHPParser.Else, 0, EarlyExitException.class},
                {"normalCaseInstructionOptional", "else", TSPHPParser.Else, 0, EarlyExitException.class},
                {"paramDeclarationNormal", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"paramDeclarationOptional", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"paramList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"postFixCall", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"postFixVariableInclCallAtTheEnd", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"postFixVariableWithoutCallAtTheEnd", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"postIncrementDecrement", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"primary", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"primitiveAtomWithConstant", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"returnType", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"scalarTypeWithModifier", "else", TSPHPParser.Else, 0, MismatchedSetException.class},
                {"scalarTypes", "else", TSPHPParser.Else, 0, MismatchedSetException.class},
                {"selfOrParent", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"statement", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"staticAccess", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"staticClassAccess", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"switchCondition", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"switchContent", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"termOrStringConcatenation", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"ternary", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"tryCatch", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"typesWithoutScalarAndMixed", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"unary", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"unaryPrimitiveAtom", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"useDefinition", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"useDefinitionList", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                {"usingType", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"variableDeclarationList", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"variableOrFieldOrStaticField", "else", TSPHPParser.Else, 0, NoViableAltException.class},
                {"whileLoop", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
                // withoutNamespace can be empty and since compilationUnit checks if next token is EOF,
                // this test does not fail
                //{"withoutNamespace", "else", TSPHPParser.Else, 0, MismatchedTokenException.class},
        });
    }
}
