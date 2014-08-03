/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

grammar TSPHP;

options {
	backtrack = true; 
	memoize = true;
	output = AST;
	ASTLabelType = ITSPHPAst;
    tokenVocab = TSPHP;
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
	Dollar = '$';
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
	LeftParenthesis = '(';
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
	RightParenthesis =')';
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
	CAST;
	CAST_ASSIGN;
	
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
	UNARY_PLUS;
	USE_DECLARATION;
	
	VARIABLE_DECLARATION;
	VARIABLE_DECLARATION_LIST;	
}


@header{
/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.antlr;

import ch.tsphp.common.AstHelperRegistry;
import ch.tsphp.common.ITSPHPAst;

}

@members{
private ITSPHPAst classMemberModifiers;
private static final String BACKSLASH = "\\";
}

@lexer::header{
/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.antlr;
}

compilationUnit	
	:	namespaceSemicolon+ EOF!
	|	namespaceBracket+ EOF!
	|	withoutNamespace EOF!
	;
	
namespaceSemicolon
	:	'namespace' namespaceId namespaceBody=';' statement* 
		-> ^('namespace' 
			TYPE_NAME[$namespaceId.start,BACKSLASH + $namespaceId.text +BACKSLASH] 
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
	:	namespaceId -> TYPE_NAME[$namespaceId.start, BACKSLASH + $namespaceId.text + BACKSLASH] 
	|	/* empty */ -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start, BACKSLASH]
	;

//Must be before Identifier otherwise Identifier matches true and false
Bool	:	'true'|'false'
	;

namespaceId
	:	Identifier ('\\' Identifier)* -> Identifier+
	;

Identifier	
	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*
	;

withoutNamespace 
	:	(statement*) 
		-> ^(Namespace[$statement.start,"namespace"]
			DEFAULT_NAMESPACE[$statement.start, BACKSLASH] 
			^(NAMESPACE_BODY[$statement.start,"nBody"] statement*)
		) 
	;

statement	
	:	useDefinitionList
	|	definition
	|	instruction
	;
	
useDefinitionList
	:	'use' firstUseDeclaration=useDefinition (',' otherDeclaration=useDefinition)* ';' 
		-> ^('use' ^(USE_DECLARATION[$firstUseDeclaration.start,"uDecl"] useDefinition) (^(USE_DECLARATION[$otherDeclaration.start,"uDecl"] useDefinition))* )
	;
	
useDefinition
	:	usingType 'as' Identifier -> usingType Identifier
	|	type=Identifier 'as' alias=Identifier -> TYPE_NAME[$type,$type.text] $alias

	|	usingType
		-> usingType Identifier[$usingType.start, $usingType.text.substring($usingType.text.lastIndexOf(BACKSLASH)+1)]
	;
	
usingType
	:	Identifier '\\' namespaceId -> TYPE_NAME[$usingType.start, $usingType.text]
	|	'\\' namespaceId -> TYPE_NAME[$usingType.start, $usingType.text]		
	;
	
definition
	:	classDefinition
	|	interfaceDefinition
	|	functionDefinition
	|	constDefinitionList
	;

classDefinition
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
	:	constDefinitionList
	|	classMemberDefinition	
	|	abstractConstructDestructDefinition
	|	constructDestructDefinition
	|	abstractMethodDefinition
	|	methodDefinition
	;

constDefinitionList
	:	begin='const' scalarTypes constantAssignment (',' constantAssignment)* ';'
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
	:	id=Identifier '=' unaryPrimitiveAtom
		->^(Identifier[$id,$id.text+"#"] unaryPrimitiveAtom)
	;


unaryPrimitiveAtom
	:	uplus = '+' primitiveAtomWithConstant -> ^(UNARY_PLUS[$uplus, "uPlus"] primitiveAtomWithConstant)
	|	uminus = '-' primitiveAtomWithConstant -> ^(UNARY_MINUS[$uminus,"uMinus"] primitiveAtomWithConstant)
	|	primitiveAtomWithConstant
	;

classMemberDefinition
@after{
	classMemberModifiers=null;
}
	:	classMemberModifier {classMemberModifiers = $classMemberModifier.tree;}
		variableDeclarationList ';' 
		
		-> ^(CLASS_MEMBER[$classMemberDefinition.start,"cMem"]
			^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"vars"] variableDeclarationList)
		)
	;
	
classMemberModifier
	:	'static' accessModifier 
	|	accessModifier 'static'
	|	accessModifier
	|	st='static' -> 'static' Public[$st,"public"]
	|	/* empty */ -> Public[$classMemberModifier.start,"public"]
	;
	
accessModifier
	:	accessModifierWithoutPrivate
	|	'private'
	;
	
accessModifierWithoutPrivate
	:	'protected'
	|	'public'
	;

abstractMethodDefinition
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

methodDefinition	
	:	methodModifier 'function' functionSignatureInclReturnType block='{' instruction* '}' 
		-> ^(METHOD_DECLARATION[$methodDefinition.start,"mDecl"]  
			^(METHOD_MODIFIER[$methodModifier.start,"mMod"] methodModifier)
			functionSignatureInclReturnType 
			^(BLOCK[$block,"block"] instruction*)
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
	
abstractConstructDestructDefinition
	:	abstractMethodModifier 'function' 
		(	ctor='__construct' formalParameters block=';'
			-> ^(Construct[$ctor, $ctor.text+"()"] 
				^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
				^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
				formalParameters 
				BLOCK[$block,"block"]
			) 
		|	destr='__destruct' '('')'  block=';'
			-> ^(METHOD_DECLARATION[$destr,"mDecl"] 
				^(METHOD_MODIFIER[$abstractMethodModifier.start,"mMod"] abstractMethodModifier)
				^(TYPE[$destr,"type"] TYPE_MODIFIER[$destr,"tMod"] Void[$destr,"void"])
				Identifier[$destr,$destr.text+"()"]
				PARAMETER_LIST[$destr,"params"]
				BLOCK[$block,"block"]
			)
		)
	;

constructDestructDefinition
	:	constructDestructModifier 'function'
		(	ctor='__construct' formalParameters block='{' instruction* '}' 
			-> ^(Construct[$ctor, $ctor.text+"()"] 
				^(METHOD_MODIFIER[$constructDestructModifier.start,"mMod"] constructDestructModifier)
				^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
				formalParameters 
				^(BLOCK[$block,"block"] instruction*)
			)
		
		|	destr='__destruct' '('')' block='{' instruction* '}' 
			-> ^(METHOD_DECLARATION[$destr,"mDecl"]
				^(METHOD_MODIFIER[$constructDestructModifier.start,"mMod"] constructDestructModifier)
				^(TYPE[$destr,"type"] TYPE_MODIFIER[$destr,"tMod"] Void[$destr,"void"])
				Identifier[$destr, $destr.text+"()"]
				PARAMETER_LIST[$destr,"params"]
				^(BLOCK[$block,"block"] instruction*)
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

interfaceDefinition
	:	inter='interface' Identifier (ext='extends' identifierList)? block='{' interfaceBody* '}'
		-> ^('interface' 
			^(CLASS_MODIFIER[$inter,"iMod"] Abstract[$inter,"abstract"])
			Identifier 
			^(Extends[$ext,"extends"] identifierList?) 
			^(INTERFACE_BODY[$block,"iBody"] interfaceBody*)
		)
	;

interfaceBody
	:	constDefinitionList
	|	interfaceMethodDefinition
	|	interfaceConstructDefinition
	;

interfaceMethodDefinition
	:	'public'? 'function' functionSignatureInclReturnType block=';'
		-> ^(METHOD_DECLARATION[$interfaceMethodDefinition.start,"mDecl"]   
			^(METHOD_MODIFIER[$interfaceMethodDefinition.start,"mMod"] Public[$interfaceMethodDefinition.start,"public"] Abstract[$interfaceMethodDefinition.start,"abstract"])
			functionSignatureInclReturnType 
			BLOCK[$block,"block"]
		) 
	;

interfaceConstructDefinition
	:	'public'? 'function' ctor='__construct' formalParameters block=';' 
		-> ^(Construct[$ctor, $ctor.text+"()"]
			^(METHOD_MODIFIER[$interfaceConstructDefinition.start,"mMod"] Public[$interfaceConstructDefinition.start,"public"]  Abstract[$interfaceConstructDefinition.start,"abstract"])
			^(TYPE[$ctor,"type"] TYPE_MODIFIER[$ctor,"tMod"] Void["void"])
			formalParameters
			BLOCK[$block,"block"]
		)
	;



/******* Procedural related - is also used by OOP ************/
//************************************************************/
functionDefinition	
	:	func='function' functionSignatureInclReturnType block='{' instruction* '}' 
		-> ^($func 
			FUNCTION_MODIFIER[$func,"fMod"] 
			functionSignatureInclReturnType
			^(BLOCK[$block,"block"] instruction*)
		)
	;
	
functionSignatureInclReturnType
	:	returnType methodIdentifier formalParameters
	;
	
returnType
	:	allTypesWithModifier 
	| 	v='void' -> ^(TYPE[$v,"type"] TYPE_MODIFIER[$v,"tMod"] $v)
	;
	
allTypesWithoutObjectWithModifier
	:	scalarTypeWithModifier
	|	typesWithoutScalarAndObjectWithModifier
	;
	
allTypesWithModifier
	:	allTypesWithoutObjectWithModifier
	|	objectWithModifier
	;	

	
scalarTypeWithModifier
@after{
	ITSPHPAst ast = retval.tree.getChild(0);
	AstHelperRegistry.get().addAstToTargetChildren(classMemberModifiers, ast);	
}
	:	Cast? scalarTypes '?'?			
		-> ^(TYPE[$scalarTypeWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$scalarTypeWithModifier.start,"tMod"] Cast? '?'? ) 
			scalarTypes
		)
	;

typesWithoutScalarAndObjectWithModifier
@after{
	ITSPHPAst ast = (ITSPHPAst) retval.tree.getChild(0);
	AstHelperRegistry.get().addAstToTargetChildren(classMemberModifiers,ast);	
}
	:	Cast? typesWithoutScalarAndObject		
		-> ^(TYPE[$typesWithoutScalarAndObjectWithModifier.start,"type"] 
			^(TYPE_MODIFIER[$typesWithoutScalarAndObjectWithModifier.start,"tMod"] Cast? ) 
			typesWithoutScalarAndObject
		)
	;

objectWithModifier
@after{
	ITSPHPAst ast = (ITSPHPAst) retval.tree.getChild(0);
	AstHelperRegistry.get().addAstToTargetChildren(classMemberModifiers,ast);	
}
	:	obj='object'
		-> ^(TYPE[$objectWithModifier.start,"type"] 
			TYPE_MODIFIER[$objectWithModifier.start,"tMod"]
			$obj
		)	
	;
	
allTypesWithoutObject
	:	scalarTypes
	|	'array'
	|	'resource'
	| 	classInterfaceTypeWithoutObject
	;

scalarTypes
	:	'bool'
	|	'int'
	|	'float'
	|	'string'
	;
	
	
classInterfaceTypeWithoutObject
	:	root='\\' namespaceId -> TYPE_NAME[$root, BACKSLASH + $namespaceId.text]
	|	namespaceId -> TYPE_NAME[$namespaceId.start, $namespaceId.text]
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
	:	Cast? allTypesWithoutObject '?'?
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			^(TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"tMod"] Cast? '?'?) 
			allTypesWithoutObject
		)
	|	obj='object' '?'?
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			^(TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"tMod"] '?'?)
			$obj
		)
	;

VariableId	
	:	'$' Identifier
	;

instruction
	:	localVariableDeclarationList ';'!
	|	ifCondition
	|	switchCondition
	|	forLoop
	|	foreachLoop
	|	whileLoop
	|	doWhileLoop
	|	tryCatch
	|	expression ';' -> ^(EXPRESSION[$expression.start,"expr"] expression)
	|	expr=';' -> EXPRESSION[$expr,"expr"]
	|	'return'^ expression? ';'!
	|	'throw'^ expression ';'!
	|	'echo'^ expressionList ';'!
	|	'break'^ Int? ';'!
	|	'continue'^ Int? ';'!
	|	block='{''}' -> EXPRESSION[$block,"expr"]
	|	'{'! instruction+ '}'!
	;
	
expressionList
	:	expression (','! expression)*
	;
		
localVariableDeclarationList
	:	variableDeclarationList -> ^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"vars"] variableDeclarationList)
	;
	
variableDeclarationList
	:	allTypesWithoutObjectWithModifier castAssignOrAssignList[$allTypesWithoutObjectWithModifier.tree]
	|	objectWithModifier  assign (','! assign)*
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
	
castAssign[ITSPHPAst typeAst]
	:	VariableId cast='=''('')' expression 
		-> ^(VariableId ^(CAST[$cast,"casting"] {$typeAst} expression))
	;

assign	
	:	VariableId (expr='=' expression)? 
		-> ^(VariableId expression?)
	;
	
typesWithoutScalarAndObject
	:	'array'
	|	'resource'
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
@init{
    ITSPHPAst annexeOperator=null;
}
	:	(ternary -> ternary)
		(	as='=' a=assignment -> ^($as ternary $a)
		|	cast='=''('')' a=assignment -> ^(CAST_ASSIGN[$cast,"cAssign"] ternary $a)
		|	(	op='+=' {annexeOperator = (ITSPHPAst)adaptor.create(Plus, op, "+");}
			|	op='-=' {annexeOperator = (ITSPHPAst)adaptor.create(Minus, op, "-");}
			|	op='*=' {annexeOperator = (ITSPHPAst)adaptor.create(Multiply, op, "*");}
			|	op='/=' {annexeOperator = (ITSPHPAst)adaptor.create(Divide, op, "/");}
			|	op='&=' {annexeOperator = (ITSPHPAst)adaptor.create(BitwiseAnd, op, "&");}
			|	op='|=' {annexeOperator = (ITSPHPAst)adaptor.create(BitwiseOr, op, "|");}
			|	op='^=' {annexeOperator = (ITSPHPAst)adaptor.create(BitwiseXor, op, "^");}
			|	op='%=' {annexeOperator = (ITSPHPAst)adaptor.create(Modulo, op, "\%");}
			|	op='.=' {annexeOperator = (ITSPHPAst)adaptor.create(Dot, op, ".");}
			|	op='<<=' {annexeOperator = (ITSPHPAst)adaptor.create(ShiftLeft, op, "<<");}
			|	op='>>=' {annexeOperator = (ITSPHPAst)adaptor.create(ShiftRight, op, ">>");}
			)
			a=assignment
			-> ^(Assign[$op,"="] ternary ^({annexeOperator} {AstHelperRegistry.get().copyAst((ITSPHPAst)root_1.getChild(0))} $a))
		)?
	;
	
ternary	
	:	logicOr ('?'^ expression ':'! ternary)?
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
	:	instanceOf (('*'|'/'|'%')^ instanceOf)*
	;

instanceOf
	:	unary ('instanceof'^ (classInterfaceTypeWithoutObject|VariableId))?;

unary
	:	cast = '(' allTypesWithoutObjectWithModifier ')' unary -> ^(CAST[$cast,"casting"] allTypesWithoutObjectWithModifier unary)
	|	plus='++' postFixVariableWithoutCallAtTheEnd  -> ^(PRE_INCREMENT[$plus,"preIncr"] postFixVariableWithoutCallAtTheEnd)
	|	minus='--' postFixVariableWithoutCallAtTheEnd -> ^(PRE_DECREMENT[$minus,"preDecr"] postFixVariableWithoutCallAtTheEnd)
	|	'@'^ unary
	|	'~'^ unary
	|	'!'^ unary
	|	uplus = '+' unary -> ^(UNARY_PLUS[uplus, "uPlus"] unary)
	|	uminus = '-' unary -> ^(UNARY_MINUS[$uminus,"uMinus"] unary)
	|	cloneOrNew
	;
	
cloneOrNew
		//reference back to unary necessary, since clone unary $b; is valid e.g. clone @$b;
	:	'clone'^ unary
	|	newObject
	|	primary
	;

newObject 
	:	'new' classInterfaceTypeWithoutObject actualParameters -> ^('new' classInterfaceTypeWithoutObject actualParameters)
	|	'new' classInterfaceTypeWithoutObject -> ^('new' classInterfaceTypeWithoutObject ACTUAL_PARAMETERS[$classInterfaceTypeWithoutObject.stop,"args"])
	;

actualParameters
	:	list='(' expressionList? ')' -> ^(ACTUAL_PARAMETERS[$list,"args"] expressionList?)
	;
	
primary
	:	postFixCall
	|	postIncrementDecrement
	|	postFixVariableInclCallAtTheEnd
	|	atom
	|	'exit' ('(' expression ')')? -> ^('exit' expression?)
	;	
	
atom	:	'(' expression ')' -> expression
	|	primitiveAtomWithConstant
	;
	
postFixCall
	:	(	functionCall -> functionCall
		|	methodCall -> methodCall
		|	methodCallSelfOrParent -> methodCallSelfOrParent
		|	methodCallStatic -> methodCallStatic 
		)
		(	memberAccess = '->' Identifier -> ^(CLASS_MEMBER_ACCESS[$memberAccess,"memAccess"] $postFixCall Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrAccess"] $postFixCall expression)
		|	call -> ^(METHOD_CALL_POSTFIX[$call.start,"mpCall"] $postFixCall call)
		)*
	;

functionCall
	:	functionIdentifier actualParameters
		-> ^(FUNCTION_CALL[$functionIdentifier.start,"fCall"] functionIdentifier actualParameters)
	;

functionIdentifier
	:	classInterfaceTypeWithoutObject -> TYPE_NAME[$classInterfaceTypeWithoutObject.start,$classInterfaceTypeWithoutObject.text+"()"]
	;

methodCall
	:	(callee='$this'|callee=VariableId) '->' methodIdentifier actualParameters

		 -> ^(METHOD_CALL[$callee,"mCall"] $callee methodIdentifier actualParameters)	 
	;

methodIdentifier	
	:	id=Identifier -> Identifier[$id,$id.text+"()"]
	;

methodCallSelfOrParent
	:	selfOrParent methodIdentifier actualParameters
		-> ^(METHOD_CALL[$selfOrParent.start,"mCall"] selfOrParent methodIdentifier actualParameters)	
	;	
	
methodCallStatic
	:	staticClassAccess methodIdentifier actualParameters
		-> ^(METHOD_CALL_STATIC[$staticClassAccess.start,"smCall"] staticClassAccess methodIdentifier actualParameters)
	;

call	:	'->'! methodIdentifier actualParameters
	;


	
postIncrementDecrement 
	:	postFixVariableWithoutCallAtTheEnd '++' 
		-> ^(POST_INCREMENT[$postFixVariableWithoutCallAtTheEnd.start, "postIncr"] postFixVariableWithoutCallAtTheEnd)
		
	|	postFixVariableWithoutCallAtTheEnd '--'
		-> ^(POST_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, "postDecr"] postFixVariableWithoutCallAtTheEnd)
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

primitiveAtomWithConstant
	:	Bool
	|	Int
	|	Float
	|	String
	|	'null'
	|	array
	|	classConstant
	|	globalConstant
	;

classConstant
	:	staticAccess identifier=Identifier 
		-> ^(CLASS_STATIC_ACCESS[$staticAccess.start,"sMemAccess"] staticAccess CONSTANT[$identifier,$identifier.text+"#"])
	;

globalConstant
	:	identifier=classInterfaceTypeWithoutObject -> CONSTANT[$identifier.start,$identifier.text+"#"]	
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
	:	'if' '(' expression ')' instructionThen=instruction ( 'else' instructionElse =instruction )? 
		-> ^('if' 
			expression 
			^(BLOCK_CONDITIONAL[$instructionThen.start,"cBlock"] $instructionThen) 
			^(BLOCK_CONDITIONAL[$instructionElse.start,"cBlock"] $instructionElse)?
		)
	;

switchCondition	
	:	'switch' '(' expression ')' '{' switchContent '}'  -> ^('switch' expression switchContent?)
	;
	
switchContent
	:	normalCaseInstructionMandatory* 
		(	defaultCaseInstructionMandatory normalCaseInstructionOptional*
		|	defaultCaseInstructionOptional?
		|	normalCaseInstructionOptional*
		)
	;
	
normalCaseInstructionMandatory
	:	caseLabel+ instruction+
		-> 	^(SWITCH_CASES[$normalCaseInstructionMandatory.start,"cases"] caseLabel+)
		 	^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction+)
	;
	
normalCaseInstructionOptional
	:	caseLabel+ instruction*
		-> 	^(SWITCH_CASES[$normalCaseInstructionOptional.start,"cases"] caseLabel+) 
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction*)
		
	;
		
defaultCaseInstructionMandatory
	:	caseLabel* defaultLabel caseLabel* instruction+
		-> 	^(SWITCH_CASES[$defaultCaseInstructionMandatory.start,"cases"] caseLabel* defaultLabel) 
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction+)
	;
defaultCaseInstructionOptional
	:	caseLabel* defaultLabel caseLabel* instruction*
		-> 	^(SWITCH_CASES[$defaultCaseInstructionOptional.start,"cases"] caseLabel* defaultLabel) 
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction*)
	;
	
caseLabel	
	:	'case'! expression ':'!
	;

defaultLabel
	:	'default' ':'!
	;
	
forLoop	
	:	'for' forInit forCondition forUpdate instruction 
		-> ^('for' 
			forInit 
			forCondition 
			forUpdate 
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction)
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
	:	'foreach' '(' expression 'as' (keyType=scalarTypes keyVarId=VariableId '=>')? valueType=allTypesWithModifier valueVarId=VariableId ')' instruction 
		-> ^('foreach' 
			expression
			
			//key 
			(	^(VARIABLE_DECLARATION_LIST[$keyType.start,"vars"] 
					^(TYPE[$keyType.start,"type"] TYPE_MODIFIER[$keyType.start,"tMod"] $keyType) 
					$keyVarId
				)
			)?
				
			^(VARIABLE_DECLARATION_LIST[$valueType.start,"vars"] $valueType $valueVarId) 
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction)
		)
	;

whileLoop
	:	'while' '(' expression ')' instruction 
		-> ^('while' expression ^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction))
	;
	
doWhileLoop
	:	'do' instruction 'while' '(' expression ')' ';' 
		-> ^('do' ^(BLOCK[$instruction.start,"block"] instruction) expression)
	;

tryCatch
	:	'try' tryBegin='{' instruction* '}' catchBlock+
		-> ^('try' ^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction*) catchBlock+)
	;
	
catchBlock
	:	catchBegin='catch' '(' classInterfaceTypeWithoutObject VariableId ')' block='{' instruction* '}'
		-> ^($catchBegin 
			^(VARIABLE_DECLARATION_LIST[$classInterfaceTypeWithoutObject.start,"vars"] 
				^(TYPE[$classInterfaceTypeWithoutObject.start,"type"] TYPE_MODIFIER[$classInterfaceTypeWithoutObject.start,"tMod"] classInterfaceTypeWithoutObject)
				VariableId
			)
			^(BLOCK_CONDITIONAL[$instruction.start,"cBlock"] instruction*)
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
