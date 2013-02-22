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
	ASTLabelType=ITSPHPAst;
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
	Destruct = '__destruct';
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
	CLASS_STATIC_ACCESS_VARIABLE_ID;
	
	CONSTANT;
	CONSTANT_DECLARATION;
	CONSTANT_DECLARATION_LIST;
	
	DEFAULT_NAMESPACE;
	
	EXPRESSION;
	EXPRESSION_LIST;
	
	FUNCTION_CALL;
	FUNCTION_MODIFIER;
	
	INTERFACE_BODY;
	
	METHOD_CALL;
	METHOD_CALL_POSTFIX;
	METHOD_CALL_STATIC;
	METHOD_DECLARATION;
	METHOD_MODIFIER;
	
	NAMESPACE_BODY;
	
	PARAMETER_DECLARATION;
	PARAMETER_LIST;
	PARAMETER_TYPE;
	
	POST_INCREMENT;
	POST_DECREMENT;
	PRE_INCREMENT;
	PRE_DECREMENT;
	SWITCH_CASES;
	
	TYPE;
	TYPE_MODIFIER;
	TYPE_NAME;
	
	UNARY_MINUS;
	USE_DECLARATION;
	
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
package ch.tutteli.tsphp.parser.antlr;


import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.ITSPHPAst;

}

@members{
private ITSPHPAst classMemberModifiers;

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
package ch.tutteli.tsphp.parser.antlr;
}

compilationUnit	
	:	namespaceSemicolon+ EOF!
	|	namespaceBracket+ EOF!
	|	withoutNamespace EOF!
	;
	
namespaceSemicolon
@init{ String backslash = "\\";}
	:	'namespace' namespaceId namespaceBody=';' statement* 
		-> ^('namespace' 
			TYPE_NAME[$namespaceId.start,backslash+$namespaceId.text+backslash] 
			^(NAMESPACE_BODY[$namespaceBody,"nBody"] statement*)
		)
	;

namespaceBracket
	:	'namespace' namespaceIdOrEmpty  namespaceBody='{' statement* '}' 
		-> ^('namespace' 
			namespaceIdOrEmpty
			^(NAMESPACE_BODY[$namespaceBody,"nBody"] statement*)
		)
	;
namespaceIdOrEmpty
@init{ String backslash = "\\";}
	:	namespaceId -> TYPE_NAME[$namespaceId.start,backslash+$namespaceId.text+backslash] 
	|	/* empty */ -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,backslash]
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
@init{ String backslash = "\\";}
	:	(statement*) 
		-> ^(Namespace[$statement.start,"namespace"]
			DEFAULT_NAMESPACE[$statement.start,backslash] 
			^(NAMESPACE_BODY[$statement.start,"nBody"] statement*)
		) 
	;

statement	
	:	useDeclarationList
	|	definition
	|	instructionWithoutBreakContinue
	;
	
useDeclarationList
	:	'use' firstUseDeclaration=useDeclaration (',' otherDeclaration=useDeclaration)* ';' 
		-> ^('use' ^(USE_DECLARATION[$firstUseDeclaration.start,"uDecl"] useDeclaration) (^(USE_DECLARATION[$otherDeclaration.start,"uDecl"] useDeclaration))* )
	;
	
useDeclaration
@init{ String backslash = "\\";}
	:	usingType 'as' Identifier -> usingType Identifier
	|	type=Identifier 'as' alias=Identifier -> TYPE_NAME[$type,$type.text] $alias

	|	usingType
		-> usingType Identifier[$usingType.start, $usingType.text.substring($usingType.text.lastIndexOf(backslash)+1)]
	;
	
usingType
	:	Identifier '\\' namespaceId -> TYPE_NAME[$usingType.start, $usingType.text]
	|	'\\' namespaceId -> TYPE_NAME[$usingType.start, $usingType.text]		
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
	:	classModifier? 'class' Identifier (ex='extends' exId=classInterfaceTypeWithoutObject)? (impl='implements' implIds=identifierList)? block='{' classBody* '}'	
		-> ^('class' 
			^(CLASS_MODIFIER[$classModifier.start,"cMod"] classModifier?)
			Identifier 
			^(Extends[$ex,"extends"] $exId?)
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
	|	abstractConstructDestructDeclaration
	|	constructDestructDeclaration
	|	abstractMethodDeclaration
	|	methodDeclaration
	;

constDeclarationList
	:	 begin='const' scalarTypes constantAssignment (',' constantAssignment)* ';'
		-> ^(CONSTANT_DECLARATION_LIST[$begin,"consts"] 
			^(TYPE[$scalarTypes.start,"type"] 
				^(TYPE_MODIFIER[$scalarTypes.start,"tMod"] 
					Public[$scalarTypes.start,"public"]
					Static[$scalarTypes.start,"static"] 
					Final[$scalarTypes.start,"final"] 
				) 
				scalarTypes
			)
			constantAssignment+
		)
	;
	
constantAssignment
	:	Identifier^ '='! unaryPrimitiveAtom
	;

classMemberDeclaration
@after{
	classMemberModifiers=null;
}
	:	classMemberModifier {classMemberModifiers = (ITSPHPAst) $classMemberModifier.tree;}
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
	|	/* etmpy */ -> Public[$classMemberModifier.start,"public"]
	;
	
accessModifier
	:	accessModifierWithoutPrivate
	|	'private'
	;
	
accessModifierWithoutPrivate
	:	'protected'
	|	'public'
	;
	
accessModifierWithoutPrivateOrPublic
	:	accessModifierWithoutPrivate 
	|	/* empty */ -> Public[$accessModifierWithoutPrivateOrPublic.start,"public"]
	;
	
accessModifierOrPublic
	:	accessModifier 
	|	/* empty */  -> Public[$accessModifierOrPublic.start,"public"]
	;


abstractMethodDeclaration
	:	abstractMethodModifier 'function' functionSignatureInclReturnType block=';'
		-> ^(METHOD_DECLARATION[$abstractMethodModifier.start,"mDecl"]  
			^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
			functionSignatureInclReturnType 
			BLOCK[$block,"block"]
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
	
	|	/* empty */ -> Public[$methodModifier.start,"public"]
	;
	
abstractConstructDestructDeclaration
	:	abstractMethodModifier 'function' 
		(	ctor='__construct' formalParameters block=';'
			-> ^('__construct' 
				^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
				^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
				formalParameters 
				BLOCK[$block,"block"]
			) 
		|	destr='__destruct' '('')'  block=';'
			-> ^(METHOD_DECLARATION[$destr,"mDecl"] 
				^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
				^(TYPE[$destr,"type"] TYPE_MODIFIER[$destr,"tMod"] Void[$destr,"void"])
				$destr
				PARAMETER_LIST[$destr,"params"]
				BLOCK[$block,"block"]
			)
		)
	;

constructDestructDeclaration
	:	constructDestructModifier 'function'
		(	ctor='__construct' formalParameters block='{' instructionWithoutBreakContinue* '}' 
			-> ^('__construct' 
				^(METHOD_MODIFIER[$constructDestructModifier.start,"mMod"] constructDestructModifier)
				^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
				formalParameters 
				^(BLOCK[$block,"block"] instructionWithoutBreakContinue*)
			)
		
		|	destr='__destruct' '('')' block='{' instructionWithoutBreakContinue* '}' 
			-> ^(METHOD_DECLARATION[$destr,"mDecl"]
				^(METHOD_MODIFIER[$constructDestructModifier.start,"mMod"] constructDestructModifier)
				^(TYPE[$destr,"type"] TYPE_MODIFIER[$destr,"tMod"] Void[$destr,"void"])
				$destr
				PARAMETER_LIST[$destr,"params"]
				^(BLOCK[$block,"block"] instructionWithoutBreakContinue*)
			)	
		)
		
	;

constructDestructModifier
	:	'final' accessModifier
	|	 fin='final' -> 'final' Public[$fin,"public"]
	|	accessModifier 'final'
	|	accessModifier
	|	/* empty */ -> Public[$constructDestructModifier.start,"public"]
	;

interfaceDeclaration
	:	inter='interface' Identifier (ext='extends' identifierList)? block='{' interfaceBody* '}'
		-> ^('interface' 
			^(CLASS_MODIFIER[$inter,"iMod"] Abstract[$inter,"abstract"])
			Identifier 
			^(Extends[$ext,"extends"] identifierList?) 
			^(INTERFACE_BODY[$block,"iBody"] interfaceBody*)
		)
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
			BLOCK[$block,"block"]
		) 
	;

interfaceConstruct
	:	'public'? 'function' ctor='__construct' formalParameters block=';' 
		-> ^('__construct'
			^(METHOD_MODIFIER[$interfaceConstruct.start,"mMod"] Public[$interfaceConstruct.start,"public"]  Abstract[$interfaceConstruct.start,"abstract"])
			^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
			formalParameters
			BLOCK[$block,"block"]
		)
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
	
allTypesWithoutObjectAndResourceWithModifier
	:	scalarTypeWithModifier
	|	classInterfaceTypeWithoutObjectInclArrayWithModifier
	;
	
allTypesWithModifier
	:	allTypesWithoutObjectAndResourceWithModifier
	|	objectOrResourceWithModifier
	;	

	
scalarTypeWithModifier
@after{
	ITSPHPAst ast = (ITSPHPAst) retval.tree.getChild(0);
	AstHelperRegistry.get().addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	Cast? scalarTypes '?'?			
		-> ^(TYPE[$scalarTypeWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$scalarTypeWithModifier.start,"tMod"] Cast? '?'? ) 
			scalarTypes
		)
	;

classInterfaceTypeWithoutObjectInclArrayWithModifier
@after{
	ITSPHPAst ast = (ITSPHPAst) retval.tree.getChild(0);
	AstHelperRegistry.get().addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	Cast? classInterfaceTypeWithoutObjectInclArray		
		-> ^(TYPE[$classInterfaceTypeWithoutObjectInclArrayWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$classInterfaceTypeWithoutObjectInclArrayWithModifier.start,"tMod"] Cast? ) 
			classInterfaceTypeWithoutObjectInclArray
		)
	;

objectOrResourceWithModifier
@after{
	ITSPHPAst ast = (ITSPHPAst) retval.tree.getChild(0);
	AstHelperRegistry.get().addChildrenFromTo(classMemberModifiers,ast,adaptor);	
}
	:	objectOrResource
		-> ^(TYPE[$objectOrResourceWithModifier.start,"type"] 
			TYPE_MODIFIER[$objectOrResourceWithModifier.start,"tMod"]
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
	:	params='(' paramList? ')' -> ^(PARAMETER_LIST[$params,"params"] paramList?)
	;

paramList
	:	paramDeclarationOptional (','! paramDeclarationOptional)*
	|	paramDeclarationNormal (','! paramDeclarationNormal)* (','! paramDeclarationOptional)*	
	;
	
paramDeclarationNormal
	:	allTypesInclModifierForParameter VariableId 
		-> ^(PARAMETER_DECLARATION[$paramDeclarationNormal.start,"pDecl"] allTypesInclModifierForParameter VariableId )
	;
	
paramDeclarationOptional
	:	allTypesInclModifierForParameter VariableId '=' unaryPrimitiveAtom 
		-> ^(PARAMETER_DECLARATION[$paramDeclarationOptional.start,"pDecl"] allTypesInclModifierForParameter ^(VariableId unaryPrimitiveAtom))
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
	:	block='{''}' -> EXPRESSION[$block,"expr"]
	|	'{'! instructionWithoutBreakContinue+ '}'!
	|	instruction
	;

instructionInclBreakContinue
	:	block='{''}' -> EXPRESSION[$block,"expr"]
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
	|	expression ';' -> ^(EXPRESSION[$expression.start,"expr"] expression)
	|	'return'^ expression? ';'!
	|	'throw'^ expression ';'!
	|	'echo'^ expressionList ';'!
	|	expr=';' -> EXPRESSION[$expr,"expr"]
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
	|	objectOrResourceWithModifier  assign (','! assign)*
	;
	
variableDeclarationScalarList
	:	scalarTypeWithModifier castAssignOrAssignList[$scalarTypeWithModifier.tree]
	;

	
castAssignOrAssignList[ITSPHPAst ast]
	:	(	castAssign[AstHelperRegistry.get().copyAst(ast)]
		|	assign
		)
		(','!	(	castAssign[AstHelperRegistry.get().copyAst(ast)]
			|	assign
			)
		)*			
	;
	
castAssign[ITSPHPAst ast]
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
	:	cast = '(' allTypesWithoutObjectAndResourceWithModifier ')' castOrBitwiseNotOrAt -> ^(CASTING[$cast,"casting"] allTypesWithoutObjectAndResourceWithModifier castOrBitwiseNotOrAt)
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
	:	staticAccess varId=VariableId -> ^(CLASS_STATIC_ACCESS[$staticAccess.start,"sMemAccess"] staticAccess CLASS_STATIC_ACCESS_VARIABLE_ID[$varId])
	|	'$this'
	|	VariableId 
	;

staticAccess
	:	selfOrParent
	|	staticClassAccess	
	;
	
selfOrParent
	:	s='self::' -> Self[$s,"self"]
	|	p='parent::' -> Parent[$p,"parent"]
	;
	
staticClassAccess
	:	classInterfaceTypeWithoutObject '::'!
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
		|	selfOrParentMethodCall -> selfOrParentMethodCall
		|	staticMethodCall -> staticMethodCall
		)
		(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixCall Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixCall expression)
		|	call -> ^(METHOD_CALL_POSTFIX[$call.start,"mpCall"] $postFixCall call)
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

selfOrParentMethodCall
	:	selfOrParent Identifier actualParameters
		-> ^(METHOD_CALL[$selfOrParent.start,"mCall"] selfOrParent Identifier actualParameters)	
	;	

	
staticMethodCall
	:	staticClassAccess Identifier actualParameters
		-> ^(METHOD_CALL_STATIC[$staticClassAccess.start,"smCall"] staticClassAccess Identifier actualParameters)
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
			(call* -> ^(METHOD_CALL_POSTFIX[$call.start,"mpCall"] $postFixVariableWithoutCallAtTheEnd call*) )
			
			(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixVariableWithoutCallAtTheEnd Identifier)
			|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixVariableWithoutCallAtTheEnd expression)
			)
			
		)*
	;
	
postFixVariableInclCallAtTheEnd
	:	(variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember)
		(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixVariableInclCallAtTheEnd Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixVariableInclCallAtTheEnd expression)
		|	call -> ^(METHOD_CALL_POSTFIX[$call.start,"mpCall"] $postFixVariableInclCallAtTheEnd call)
		)*
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
	|	classConstant
	|	globalConstant
	;

classConstant
	:	staticAccess identifier=Identifier 
		-> ^(CLASS_STATIC_ACCESS[$staticAccess.start,"sMemAccess"] staticAccess CONSTANT[$identifier,$identifier.text])
	;

globalConstant
	:	identifier=classInterfaceTypeWithoutObject -> CONSTANT[$identifier.start,$identifier.text]	
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
	|	value=expression
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
	:	'foreach' '(' expression 'as' (keyType=scalarTypes keyVarId=VariableId '=>')? valueType=allTypesWithModifier valueVarId=VariableId ')' instructionInclBreakContinue 
		-> ^('foreach' 
			expression
			
			//key 
			(	^(VARIABLE_DECLARATION_LIST[$keyType.start,"vars"] 
					^(TYPE[$keyType.start,"type"] TYPE_MODIFIER[$keyType.start,"tMod"] $keyType) 
					$keyVarId
				)
			)?
				
			^(VARIABLE_DECLARATION_LIST[$valueType.start,"vars"] $valueType $valueVarId) 
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
	:	catchBegin='catch' '(' classInterfaceTypeWithoutObject VariableId ')' block='{' instructionInclBreakContinue* '}'
		-> ^($catchBegin 
			^(VARIABLE_DECLARATION_LIST[$classInterfaceTypeWithoutObject.start,"vars"] 
				^(TYPE[$classInterfaceTypeWithoutObject.start,"type"] TYPE_MODIFIER[$classInterfaceTypeWithoutObject.start,"tMod"] classInterfaceTypeWithoutObject)
				VariableId
			)
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


	