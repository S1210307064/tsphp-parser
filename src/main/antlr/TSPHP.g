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
grammar TSPHP;

options {
	backtrack = true; 
	memoize=true;
	output=AST;
	ASTLabelType=TSPHPAst;
}

tokens{
	Abstract = 'abstract';
	Arrow = '=>';
	As = 'as';
	Assign = '=';
	At = '@';
	Backslash = '\\';
	BitwiseAnd = '&';
	BitwiseAndAssign = '&=';
	BitwiseNot = '~';
	BitwiseOr = '|';
	BitwiseOrAssign = '|=';
	BitwiseXor = '^';
	BitwiseXorAssign = '^=';
	Break = 'break';
	Case = 'case';
	Cast = 'cast';
	Catch = 'catch';
	Class = 'class';
	Clone = 'clone';
	Colon = ':';
	Comma = ',';
	Const = 'const';
	Construct = '__construct';
	Continue = 'continue';
	Default = 'default';
	Deconstruct = '__deconstruct';
	Divide = '/';
	DivideAssign = '/=';
	Do = 'do';
	Dolar = '$';
	Dot = '.';
	DotAssign = '.=';
	DoubleColon = '::';
	Echo = 'echo';
	Else = 'else';
	Equal = '==';	
	Exit = 'exit';
	Extends = 'extends';
	Final = 'final';
	For = 'for';
	Foreach = 'foreach';
	Function = 'function';
	GreaterThan = '>';
	GreaterEqualThan = '>=';
	Identical = '===';
	If = 'if';
	Implements = 'implements';
	Instanceof = 'instanceof';
	Interface = 'interface';
	LeftCurlyBrace = '{';
	LeftParanthesis = '(';
	LeftSquareBrace = '[';
	LessThan = '<';
	LessEqualThan = '<=';
	LogicAnd = '&&';
	LogicAndWeak = 'and';
	LogicNot = '!';
	LogicOr = '||';
	LogicOrWeak = 'or';
	LogicXorWeak = 'xor';
	Minus = '-';
	MinusAssign = '-=';
	MinusMinus = '--';
	Modulo = '%';
	ModuloAssign = '%=';
	Multiply = '*';
	MultiplyAssign = '*=';
	Namespace = 'namespace';
	New = 'new';
	NotEqual = '!=';
	NotEqualAlternative = '<>';
	NotIdentical = '!==';
	Null = 'null';
	ObjectOperator = '->';
	Parent = 'parent';
	ParentColonColon = 'parent::';
	Plus = '+';
	PlusAssign = '+=';
	PlusPlus = '++';
	Private = 'private';
	Protected = 'protected';
	ProtectThis = 'this';
	Public = 'public';
	QuestionMark = '?';
	Return = 'return';
	RightCurlyBrace = '}';
	RightParanthesis =')';
	RightSquareBrace = ']';
	ShiftLeft = '<<';
	ShiftLeftAssign = '<<=';
	ShiftRight = '>>';
	ShiftRightAssign = '>>=';
	Static = 'static';
	This = '$this';
	Throw = 'throw';
	Try = 'try';
	TypeBool = 'bool';
	TypeAliasBool = 'boolean';
	TypeAliasFloat = 'double';
	TypeInt = 'int';
	TypeAliasInt = 'integer';
	TypeFloat = 'float';
	TypeString = 'string';
	TypeArray = 'array';
	TypeResource = 'resource';
	TypeObject = 'object';
	Self = 'self';
	SelfColonColon = 'self::';
	Semicolon = ';';
	Switch = 'switch';
	Use = 'use';
	Void = 'void';
	While = 'while';

	// Imaginary tokens
	ACTUAL_PARAMETERS;
	ARRAY_ACCESS;
	BLOCK;
	BLOCK_CONDITIONAL;
	CASTING;
	CASTING_ASSIGN;
	
	CLASS_BODY;
	CLASS_MODIFIER;
	
	CLASS_MEMBER;
	CLASS_MEMBER_MODIFIER;
	CLASS_MEMBER_ACCESS;
	CLASS_STATIC_ACCESS;
	
	CONSTANT;
	CONSTANT_DECLARATION;
	CONSTANT_DECLARATION_LIST;
	
	DEFAULT_NAMESPACE;
	EXCEPTION_LIST;
	
	EXPRESSION;
	EXPRESSION_LIST;
	
	FUNCTION_CALL;
	FUNCTION_MODIFIER;
	
	INTERFACE_BODY;
	INTERFACE_CONSTRUCT;	
	
	METHOD_CALL;
	METHOD_CALL_STATIC;
	METHOD_DECLARATION;
	METHOD_MODIFIER;
	
	NAMESPACE_BODY;
	
	PARAM_DECLARATION;
	PARAM_LIST;
	PARAM_TYPE;
	
	POST_INCREMENT;
	POST_DECREMENT;
	PRE_INCREMENT;
	PRE_DECREMENT;
	SWITCH_CASES;
	
	TYPE;
	TYPE_MODIFIER;
	TYPE_NAME;
	
	UNARY_MINUS;
	USE_DECLRATARION;
	
	VARIABLE_DECLARATION;
	VARIABLE_DECLARATION_LIST;	
}


@header{
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
package ch.tutteli.tsphp.parser;

import ch.tutteli.tsphp.common.AstHelper;
import ch.tutteli.tsphp.common.IAstHelper;
import ch.tutteli.tsphp.common.IScope;
import ch.tutteli.tsphp.common.TSPHPAst;

}

@members{
private IAstHelper astHelper = new AstHelper();
private TSPHPAst classMemberModifiers;

public void setAstHelper(IAstHelper anAstHelper){
    astHelper = anAstHelper;
}

}

@lexer::header{
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
package ch.tutteli.tsphp.parser;
}

compilationUnit	
	:	namespaceSemicolon+ EOF!
	|	namespaceBracket+ EOF!
	|	withoutNamespace EOF!
	;
	
namespaceSemicolon
	:	'namespace' namespaceId namespaceBody=';' statement* 
		-> ^('namespace' TYPE_NAME[$namespaceId.start,$namespaceId.text] ^(NAMESPACE_BODY[$namespaceBody,"nBody"] statement*))
	;

namespaceBracket
	:	'namespace' namespaceIdOrEmpty  namespaceBody='{' statement* '}' 
		-> 	^('namespace' 
				namespaceIdOrEmpty
				^(NAMESPACE_BODY[$namespaceBody,"nBody"] statement*)
			)
	;
namespaceIdOrEmpty
	:	namespaceId -> TYPE_NAME[$namespaceId.start,$namespaceId.text] 
	|	/* empty */ -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,IScope.DEFAULT_NAMESPACE]
	;

//Must before Id otherwise Id match true and false
Bool	:	'true'|'false'
	;

namespaceId
	:	Identifier ('\\' Identifier)* -> Identifier+
	;

Identifier	
	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*
	;

withoutNamespace 
	:	(statement+) -> ^(Namespace[$statement.start,"namespace"]
					DEFAULT_NAMESPACE[$statement.start,IScope.DEFAULT_NAMESPACE] 
					^(NAMESPACE_BODY[$statement.start,"nBody"] statement+)
				) 
	;

statement	
	:	useDeclarationList
	|	definition
	|	instructionWithoutBreakContinue
	;
	
useDeclarationList
	:	'use' firstUseDeclaration=useDeclaration (',' otherDeclaration=useDeclaration)* ';' 
		-> ^('use' ^(USE_DECLRATARION[$firstUseDeclaration.start,"uDecl"] useDeclaration) (^(USE_DECLRATARION[$otherDeclaration.start,"uDecl"] useDeclaration))* )
	;
	
useDeclaration
	:	usingType ('as' Identifier)? -> TYPE_NAME[$usingType.start,$usingType.text] Identifier?
	;
	
usingType
	:	Identifier '\\' namespaceId 
	|	'\\' namespaceId
	;
definition
	:	classDeclaration
	|	interfaceDeclaration
	|	functionDeclaration
	|	constDeclarationList
	;

/************* OOP related  - many definitions rely on procedural definitions *********************/
//************************************************************************************************/

classDeclaration
	:	classModifier? 'class' Identifier (ex='extends' exIds=identifierList)? (impl='implements' implIds=identifierList)? block='{' classBody* '}'	
		-> ^('class' 
			^(CLASS_MODIFIER[$classModifier.start,"cMod"] classModifier?)
			Identifier 
			^(Extends[$ex,"extends"] $exIds?)
			^(Implements[$impl,"implements"] $implIds?)
			^(CLASS_BODY[$block,"cBody"] classBody*)
		)
	;
classModifier
	:	('abstract'|'final')
	;

identifierList
	:	classInterfaceTypeWithoutObject (','! classInterfaceTypeWithoutObject)*
	;
	
classBody
	:	constDeclarationList
	|	classMemberDeclaration	
	|	constructDeconstruct
	|	abstractMethodDeclaration
	|	methodDeclaration
	;

constDeclarationList
	:	 begin='const' scalarTypes constantAssignment (',' constantAssignment)* ';'
		-> ^(CONSTANT_DECLARATION_LIST[$begin,"consts"] scalarTypes constantAssignment+)
	;
	
constantAssignment
	:	Identifier^ '='! unaryPrimitiveAtom
	;

classMemberDeclaration
@after{
	classMemberModifiers=null;
}
	:	classMemberModifier {classMemberModifiers = (TSPHPAst) $classMemberModifier.tree;}
		variableDeclarationList ';' 
		
		-> ^(CLASS_MEMBER[$classMemberDeclaration.start,"cMem"]
			^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"vars"] variableDeclarationList)
		)
	;
	
classMemberModifier
	:	'static' accessModifier 
	|	accessModifier 'static'
	|	accessModifier
	|	st='static' -> 'static' Public[$st,"public"]
	|	/* etmpy */ -> Public["public"]
	;
	
accessModifier
	:	accessModifierWithoutPrivate
	|	'private'
	;
	
accessModifierWithoutPrivate
	:	'protected'|'public'
	;
	
accessModifierWithoutPrivateOrPublic
	:	accessModifierWithoutPrivate 
	|	/* empty */ -> Public["public"]
	;
	
accessModifierOrPublic
	:	accessModifier 
	|	/* empty */ -> Public["public"]
	;


abstractMethodDeclaration
	:	abstractMethodModifier 'function' functionSignatureInclReturnType ';'
		-> ^(METHOD_DECLARATION[$abstractMethodModifier.start,"mDecl"]  
			^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
			functionSignatureInclReturnType 
		) 
	;
	
abstractMethodModifier
	:	abstr='abstract' accessModifierWithoutPrivate 
	|	accessModifierWithoutPrivate abstr='abstract'
	|	abstr='abstract' -> 'abstract' Public[$abstr,"public"]
	;

methodDeclaration	
	:	methodModifier 'function' functionSignatureInclReturnType block='{' instructionWithoutBreakContinue* '}' 
		-> ^(METHOD_DECLARATION[$methodDeclaration.start,"mDecl"]  
			^(METHOD_MODIFIER[$methodModifier.start,"mMod"] methodModifier)
			functionSignatureInclReturnType 
			^(BLOCK[$block,"block"] instructionWithoutBreakContinue*)
		) 
	;	
	

methodModifier
	:	'static' 'final' accessModifier
	|	'static' accessModifier 'final' 
	|	'static' accessModifier
	|	'static' fin='final' -> 'static' 'final' Public[$fin,"public"]
	|	st='static' -> 'static' Public[$st,"public"]
	
	|	'final' 'static' accessModifier
	|	'final' accessModifier 'static' 
	|	'final' accessModifier
	|	'final' st='static' -> 'final' 'static' Public[$st,"public"]
	|	 fin='final' -> 'final' Public[$fin,"public"]
	
	|	accessModifier 'final' 'static' 
	|	accessModifier 'static' 'final'
	|	accessModifier 'static'
	|	accessModifier 'final'
	|	accessModifier
	
	|	/* empty */ -> Public["public"]
	;
	

constructDeconstruct
	:	accessModifierOrPublic 'function'
		(	'__construct' formalParameters block='{' instructionWithoutBreakContinue* '}' 
			-> ^('__construct' accessModifierOrPublic formalParameters ^(BLOCK[$block,"block"] instructionWithoutBreakContinue*))
		
		|	'__deconstruct' '('')' block='{' instructionWithoutBreakContinue* '}' 
			-> ^('__deconstruct' accessModifierOrPublic ^(BLOCK[$block,"block"] instructionWithoutBreakContinue*))	
		)
		
	;

interfaceDeclaration
	:	'interface' Identifier (ext='extends' identifierList)? block='{' interfaceBody* '}'
		-> ^('interface' Identifier ^(Extends[$ext,"extends"] identifierList?) ^(INTERFACE_BODY[$block,"iBody"] interfaceBody*))
	;

interfaceBody
	:	constDeclarationList
	|	interfaceMethodDeclaration
	|	interfaceConstruct
	;

interfaceMethodDeclaration
	:	'public'? 'function' functionSignatureInclReturnType block=';'
		-> ^(METHOD_DECLARATION[$interfaceMethodDeclaration.start,"mDecl"]   
			^(METHOD_MODIFIER[$interfaceMethodDeclaration.start,"mMod"] Public[$interfaceMethodDeclaration.start,"public"] Abstract[$interfaceMethodDeclaration.start,"abstract"])
			functionSignatureInclReturnType 
		) 
	;

interfaceConstruct
	:	 'public'? 'function' ctor='__construct' formalParameters ';' -> ^(INTERFACE_CONSTRUCT[$ctor,"iCtor"] formalParameters)
	;



/******* Procedural related - is also be used by OOP ************/
//***************************************************************/
functionDeclaration	
	:	func='function' functionSignatureInclReturnType block='{' instructionWithoutBreakContinue* '}' 
		-> ^($func 
			FUNCTION_MODIFIER[func,"fMod"] 
			functionSignatureInclReturnType
			^(BLOCK[$block,"block"] instructionWithoutBreakContinue*)
		)
	;
	
functionSignatureInclReturnType
	:	returnType Identifier formalParameters
	;
	
returnType
	:	allTypesWithModifier 
	| 	v='void' -> ^(TYPE[$v,"type"] TYPE_MODIFIER[$v,"tMod"] $v)
	;
	
allTypesWithModifier
	:	scalarTypeWithModifier
	|	classInterfaceTypeWithoutObjectInclArrayWithModifier
	|	objectOrResourceInclModifier
	;	

	
scalarTypeWithModifier
@after{
	TSPHPAst ast = (TSPHPAst) retval.tree.getChild(0);
	astHelper.addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	Cast? scalarTypes '?'?			
		-> ^(TYPE[$scalarTypeWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$scalarTypeWithModifier.start,"tMod"] Cast? '?'? ) 
			scalarTypes
		)
	;

classInterfaceTypeWithoutObjectInclArrayWithModifier
@after{
	TSPHPAst ast = (TSPHPAst) retval.tree.getChild(0);
	astHelper.addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	Cast? classInterfaceTypeWithoutObjectInclArray		
		-> ^(TYPE[$classInterfaceTypeWithoutObjectInclArrayWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$classInterfaceTypeWithoutObjectInclArrayWithModifier.start,"tMod"] Cast? ) 
			classInterfaceTypeWithoutObjectInclArray
		)
	;

objectOrResourceInclModifier
@after{
	TSPHPAst ast = (TSPHPAst) retval.tree.getChild(0);
	astHelper.addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	objectOrResource
		-> ^(TYPE[$objectOrResourceInclModifier.start,"type"] 
			^(TYPE_MODIFIER[$objectOrResourceInclModifier.start,"tMod"])
			objectOrResource
		)	
	;

objectOrResource
	:	'object'
	|	'resource'
	;

allTypes:	allTypesWithoutObjectAndResource
	|	objectOrResource
	;
	
allTypesWithoutObjectAndResource
	:	scalarTypes
	|	TypeArray
	| 	classInterfaceTypeWithoutObject
	;

scalarTypes
	:	TypeBool
	|	TypeInt
	|	TypeFloat
	|	TypeString
	;
	
	
classInterfaceTypeWithoutObject
	:	root='\\'? namespaceId -> TYPE_NAME[$classInterfaceTypeWithoutObject.start, $classInterfaceTypeWithoutObject.text]
	;

formalParameters
	:	params='(' paramList? ')' -> ^(PARAM_LIST[$params,"params"] paramList?)
	;

paramList
	:	paramDeclarationOptional (','! paramDeclarationOptional)*
	|	paramDeclarationNormal (','! paramDeclarationNormal)* (','! paramDeclarationOptional)*	
	;
	
paramDeclarationNormal
	:	allTypesInclModifierForParameter VariableId 
		-> ^(PARAM_DECLARATION[$paramDeclarationNormal.start,"pDecl"] allTypesInclModifierForParameter ^(VariableId) )
	;
	
paramDeclarationOptional
	:	allTypesInclModifierForParameter VariableId '=' unaryPrimitiveAtom 
		-> ^(PARAM_DECLARATION[$paramDeclarationOptional.start,"pDecl"] allTypesInclModifierForParameter ^(VariableId unaryPrimitiveAtom))
	;


allTypesInclModifierForParameter
	:	Cast? allTypesWithoutObjectAndResource '?'?
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			^(TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"tMod"] Cast? '?'?) 
			allTypesWithoutObjectAndResource
		)
	|	objectOrResource '?'?
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			^(TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"tMod"] '?'?)
			objectOrResource
		)	
	;

VariableId	
	:	'$' Identifier
	;

instructionWithoutBreakContinue	
	:	block='{''}' -> ^(EXPRESSION[$block,"expr"])
	|	'{'! instructionWithoutBreakContinue+ '}'!
	|	instruction
	;

instructionInclBreakContinue
	:	block='{''}' -> ^(EXPRESSION[$block,"expr"])
	|	'{'! instructionInclBreakContinue*  '}'!
	|	instruction
	|	('break'|'continue')^ Int? ';'!
	;	

instruction
	:	localVariableDeclaration ';'!
	|	ifCondition
	|	switchCondition
	|	forLoop
	|	foreachLoop
	|	whileLoop
	|	doWhileLoop
	|	tryCatch
	|	expression ';'!
	|	'return'^ expression? ';'! 
	|	'throw'^ expression ';'!
	|	'echo'^ expressionList ';'!
	|	expr=';' -> ^(EXPRESSION[$expr,"expr"])
	;
	
expressionList
	:	expression (','! expression)*
	;
		
localVariableDeclaration
	:	variableDeclarationList -> ^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"vars"] variableDeclarationList)
	;
	
variableDeclarationList
	:	variableDeclarationScalarList
	|	variableDeclarationArrayOrClassInterfaceList		
	|	objectOrResourceInclModifier  assign (','! assign)*
	;
	
variableDeclarationScalarList
	:	scalarTypeWithModifier castAssignOrAssignList[$scalarTypeWithModifier.tree]
	;

	
castAssignOrAssignList[TSPHPAst ast]
	:	(	castAssign[astHelper.copyAst(ast)]
		|	assign
		)
		(','!	(	castAssign[astHelper.copyAst(ast)]
			|	assign
			)
		)*			
	;
	
castAssign[TSPHPAst ast]
	:	VariableId cast='=''('')' expression 
		-> ^(VariableId ^(CASTING[$cast,"casting"] {$ast} expression))
	;

assign	
	:	VariableId (expr='=' expression)? 
		-> ^(VariableId expression?)
	;
	
variableDeclarationArrayOrClassInterfaceList
	:	classInterfaceTypeWithoutObjectInclArrayWithModifier castAssignOrAssignList[$classInterfaceTypeWithoutObjectInclArrayWithModifier.tree]	
	;
	

	
classInterfaceTypeWithoutObjectInclArray
	:	'array'
	|	classInterfaceTypeWithoutObject
	;
	

expression
	:	logicOrWeak
	;
	

logicOrWeak
	:	logicXorWeak ('or'^ logicXorWeak)*
	; 
	
logicXorWeak
	:	logicAndWeak ('xor'^ logicAndWeak)*
	; 
	
logicAndWeak
	:	assignment ('and'^ assignment)*
	;

assignment
	:	ternary (assignmentOperator^ expression)*
	;

assignmentOperator
	:	'='
	|	'+='
	|	'-='
	|	'*='
	|	'/='
	|	'&='
	|	'|='
	|	'^='
	|	'%='
	|	'.='
	|	'<<='
	|	'>>='
	|	cast='=''('')' -> CASTING_ASSIGN[$cast,"cAssign"]
	;

ternary	
	:	logicOr ('?'^ expression ':'! expression)?
	;

logicOr	
	:	logicAnd ('||'^ logicAnd)*
	;

logicAnd
	:	bitwiseOr ('&&'^ bitwiseOr)*
	;	

bitwiseOr
	:	bitwiseXor ('|'^ bitwiseXor)*
	;

bitwiseXor
	:	bitwiseAnd ('^'^ bitwiseAnd)*
	;

bitwiseAnd
	:	equality ('&'^ equality)*
	;

equality
	:	comparison (equalityOperator^ comparison)?
	;

equalityOperator
	:	'=='
	|	'==='
	|	'!='
	|	'!=='
	|	'<>'
	;

comparison
	:	bitwiseShift (comparisonOperator^ bitwiseShift)?
	;

comparisonOperator
	:	'<'
	|	'<='
	|	'>'
	|	'>='
	;

bitwiseShift	
	:	termOrStringConcatenation (('<<'|'>>')^ termOrStringConcatenation)*
	;

termOrStringConcatenation	
	:	factor (('+'|'-'|'.')^ factor)*
	;

factor	
	:	logicNot (('*'|'/'|'%')^ logicNot)*
	;

logicNot:	'!'^ logicNot
	|	instanceOf
	;

instanceOf
	:	castOrBitwiseNotOrAt ('instanceof'^ (classInterfaceTypeWithoutObject|VariableId))?;

castOrBitwiseNotOrAt
	:	cast = '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^(CASTING[$cast,"casting"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt)
	|	'~'^ castOrBitwiseNotOrAt
	|	'@'^ castOrBitwiseNotOrAt 
	|	cloneOrNew
	;

	
cloneOrNew
	:	'clone'^ cloneOrNew
	|	newObject
	|	unaryPrimary
	;

	
variableOrMemberOrStaticMember
	:	staticAccessOrParent VariableId -> ^(CLASS_STATIC_ACCESS[$staticAccessOrParent.start,"sMemAccess"] staticAccessOrParent VariableId)
	|	'$this'
	|	VariableId 
	;

staticAccessOrParent
	:	s='self::' -> Self[$s,"self"]
	|	p='parent::' -> Parent[$p,"parent"]
	|	classInterfaceTypeWithoutObject '::'!
	;

newObject 
	:	'new' classInterfaceTypeWithoutObject actualParameters -> ^('new' classInterfaceTypeWithoutObject actualParameters)
	|	'new' classInterfaceTypeWithoutObject -> ^('new' classInterfaceTypeWithoutObject ACTUAL_PARAMETERS[$classInterfaceTypeWithoutObject.stop,"args"])
	;

actualParameters
	:	list='(' expressionList? ')' -> ^(ACTUAL_PARAMETERS[$list,"args"] expressionList?)
	;

unaryPrimary
	:	uplus = '+' primary -> primary
	|	uminus = '-' primary -> ^(UNARY_MINUS[$uminus,"uMinus"] primary)
	|	primary
	;
	
primary
	:	postFixCall
	|	atom
	|	'exit' ('(' expression ')')? -> ^('exit' expression?)
	;	
	
postFixCall
	:	(	functionCall -> functionCall
		|	methodCall -> methodCall
		|	staticMethodCall -> staticMethodCall
		)
		(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixCall Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixCall expression)
		|	call -> ^(METHOD_CALL[$call.start,"mCall"] $postFixCall call)
		)*
	;

functionCall
	:	classInterfaceTypeWithoutObject actualParameters
		-> ^(FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,"fCall"] classInterfaceTypeWithoutObject actualParameters)
	;

	
methodCall
	:	(callee='$this'|callee=VariableId) '->' Identifier actualParameters
		 -> ^(METHOD_CALL[$callee,"mCall"] $callee Identifier actualParameters)	 
	;
	
staticMethodCall
	:	staticAccessOrParent Identifier actualParameters
		-> ^(METHOD_CALL_STATIC[$staticAccessOrParent.start,"smCall"] staticAccessOrParent Identifier actualParameters)
	;

call	:	'->'! Identifier actualParameters
	;


atom	:	'(' expression ')' -> expression
	|	incrementDecrement
	|	postFixVariableInclCallAtTheEnd
	|	array
	|	primitiveAtomWithConstant
	;

incrementDecrement
	:	postIncrementDecrement
	|	preIncrementDecrement
	;
	
postIncrementDecrement 
	:	postFixVariableWithoutCallAtTheEnd '++' 
		-> ^(POST_INCREMENT[$postFixVariableWithoutCallAtTheEnd.start, "postIncr"] postFixVariableWithoutCallAtTheEnd)
		
	|	postFixVariableWithoutCallAtTheEnd '--'
		-> ^(POST_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, "postDecr"] postFixVariableWithoutCallAtTheEnd)
	;
	
preIncrementDecrement
	:	plus='++' postFixVariableWithoutCallAtTheEnd
		-> ^(PRE_INCREMENT[$plus,"preIncr"] postFixVariableWithoutCallAtTheEnd)

	|	minus='--' postFixVariableWithoutCallAtTheEnd
		-> ^(PRE_DECREMENT[$minus,"preDecr"] postFixVariableWithoutCallAtTheEnd)
	;

postFixVariableWithoutCallAtTheEnd
	:	(variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember)
		(
			(call* -> ^(METHOD_CALL[$call.start,"mCall"] $postFixVariableWithoutCallAtTheEnd call*) )
			
			(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixVariableWithoutCallAtTheEnd Identifier)
			|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixVariableWithoutCallAtTheEnd expression)
			)
			
		)*
	;
	
postFixVariableInclCallAtTheEnd
	:	(variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember)
		(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixVariableInclCallAtTheEnd Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixVariableInclCallAtTheEnd expression)
		|	call -> ^(METHOD_CALL[$call.start,"mCall"] $postFixVariableInclCallAtTheEnd call)
		)*
	;

classConstant
	:	staticAccessOrParent Identifier -> ^(CLASS_STATIC_ACCESS[$staticAccessOrParent.start,"sMemAccess"] staticAccessOrParent Identifier)
	;
	

	
unaryPrimitiveAtom
	:	uplus = '+' primitiveAtomWithConstant -> primitiveAtomWithConstant
	|	uminus = '-' primitiveAtomWithConstant -> ^(UNARY_MINUS[$uminus,"uMinus"] primitiveAtomWithConstant)
	|	primitiveAtomWithConstant
	;

primitiveAtomWithConstant
	:	Bool
	|	Int
	|	Float
	|	String
	|	Null
	//global constant
	|	classConstant
	|	id=Identifier -> CONSTANT[$id,$id.text]
	;
	
Int     : 	DECIMAL
        | 	HEXADECIMAL
        | 	OCTAL
        | 	BINARY
        ;

fragment
DECIMAL
	:	('1'..'9') ('0'..'9')*
        |	 '0'
        ;
        
fragment          
HEXADECIMAL 
	:	'0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+
	;

fragment
OCTAL	
	:	'0' ('0'..'7')+
	;


fragment
BINARY	
	:	'0b'('0'|'1')+
	;


Float
    	:	('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|	'.' ('0'..'9')+ EXPONENT?
    	|	('0'..'9')+ EXPONENT
    	;
    
fragment
EXPONENT 
	: ('e'|'E') ('+'|'-')? ('0'..'9')+ 
	;
	
String	
	:	STRING_SINGLE_QUOTED 
	|	STRING_DOUBLE_QUOTED 
	;

fragment
STRING_SINGLE_QUOTED
	:	'\'' (
			  ('\\\\')=>'\\\\' 
			|  ('\\\'')=>'\\\'' 
			| ~ ('\'' )
		)* '\'';
	
fragment
STRING_DOUBLE_QUOTED
    	:	'"' (
			  ('\\\\') => '\\\\'
			|  ('\\"') => '\\"'
			| ('\\$') => '\\$'
			| ~ ('"' | '$')
  		)* '"';
	
array	:	arr='[' arrayContent? ']'  -> ^(TypeArray[$arr,"array"] arrayContent?)
	|	TypeArray '(' arrayContent? ')' -> ^(TypeArray arrayContent?)
	;
	
arrayContent
	:	arrayKeyValue (','! arrayKeyValue)*
	;
arrayKeyValue
	:	key=expression '=>' value=expression -> ^('=>' $key $value)
	|	expression 
	;


ifCondition
	:	'if' '(' expression ')' instructionThen=instructionInclBreakContinue ( 'else' instructionElse =instructionInclBreakContinue )? 
		-> ^('if' 
			expression 
			^(BLOCK_CONDITIONAL[$instructionThen.start,"cBlock"] $instructionThen) 
			^(BLOCK_CONDITIONAL[$instructionElse.start,"cBlock"] $instructionElse)?
		)
	;


switchCondition	
	:	'switch' '(' VariableId ')' '{' switchContent? '}'  -> ^('switch' VariableId switchContent?)
	;
	
switchContent
	:	normalCaseInstructionMandatory* defaultCaseInstructionMandatory? normalCaseInstructionOptional*
	|	normalCaseInstructionMandatory* defaultCaseInstructionOptional?
	;
	
normalCaseInstructionMandatory
	:	caseLabel+ instructionInclBreakContinue+
		-> 	^(SWITCH_CASES[$normalCaseInstructionMandatory.start,"cases"] caseLabel+)
		 	^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue+)
	;
	
normalCaseInstructionOptional
	:	caseLabel+ instructionInclBreakContinue*
		-> 	^(SWITCH_CASES[$normalCaseInstructionOptional.start,"cases"] caseLabel+) 
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue*)
		
			;	
defaultCaseInstructionMandatory
	:	caseLabel* defaultLabel caseLabel* instructionInclBreakContinue+
		-> 	^(SWITCH_CASES[$defaultCaseInstructionMandatory.start,"cases"] caseLabel* defaultLabel) 
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue+)
	;
defaultCaseInstructionOptional
	:	caseLabel* defaultLabel caseLabel* instructionInclBreakContinue*
		-> 	^(SWITCH_CASES[$defaultCaseInstructionOptional.start,"cases"] caseLabel* defaultLabel) 
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue*)
	;
	
caseLabel	
	:	'case'! expression ':'!
	;

defaultLabel
	:	'default' ':'!
	;
	
forLoop	
	:	'for' forInit forCondition forUpdate instructionInclBreakContinue 
		-> ^('for' 
			forInit 
			forCondition 
			forUpdate 
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue)
		)
	;
	
forInit	
	:	init='(' 
		(	variableDeclarationList -> ^(VARIABLE_DECLARATION_LIST[$init,"vars"] variableDeclarationList)
		|	expressionList? -> ^(EXPRESSION_LIST[$init,"exprs"] expressionList?)
		)	
	;
	
forCondition
	:	condition=';' expressionList? -> ^(EXPRESSION_LIST[$condition,"exprs"] expressionList?)
	;	
	
forUpdate
	:	update=';' expressionList? ')' -> ^(EXPRESSION_LIST[$update,"exprs"] expressionList?)
	;

foreachLoop
	:	'foreach' '(' expression 'as' (keyType=scalarTypes keyVarId=VariableId '=>')? valueType=allTypes valueVarId=VariableId ')' instructionInclBreakContinue 
		-> ^('foreach' 
			expression $keyType? $keyVarId? $valueType $valueVarId 
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue)
		)
	;

whileLoop
	:	'while' '(' expression ')' instructionInclBreakContinue 
		-> ^('while' expression ^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue))
	;
	
doWhileLoop
	:	'do' instructionInclBreakContinue 'while' '(' expression ')' ';' 
		-> ^('do' ^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue) expression)
	;

tryCatch
	:	'try' tryBegin='{' instructionInclBreakContinue* '}' catchBlock+
		-> ^('try' ^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue*) catchBlock+)
	;
	
catchBlock
	:	catchBegin='catch' list='(' classInterfaceTypeWithoutObject VariableId ')' block='{' instructionInclBreakContinue* '}'
		-> ^($catchBegin 
			^(EXCEPTION_LIST[$list,"exceptions"] ^(VariableId classInterfaceTypeWithoutObject))
			^(BLOCK_CONDITIONAL[$instructionInclBreakContinue.start,"cBlock"] instructionInclBreakContinue*)
		)
	;

Comment
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	//comment could be at the end of the file and thus no \n needed
	|  	'//' ~('\n'|'\r')* {$channel=HIDDEN;}
    	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

Whitespace	
	:	( ' '
        	| '\t'
        		        | '\r'
        	| '\n'
	        ) {$channel=HIDDEN;}
	;


	