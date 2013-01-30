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
	ASTLabelType=CommonTree;
}

tokens{
	Abstract = 'abstract';
	Arrow = '=>';
	As = 'as';
	Assign = '=';
	At = '@';
	Backslash = '\\';
	BitwiseAnd = '&';
	BitwiseAndEqual = '&=';
	BitwiseNot = '~';
	BitwiseOr = '|';
	BitwiseOrEqual = '|=';
	BitwiseXor = '^';
	BitwiseXorEqual = '^=';
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
	DivideEqual = '/=';
	Do = 'do';
	Dolar = '$';
	Dot = '.';
	DotEqual = '.=';
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
	MinusEqual = '-=';
	MinusMinus = '--';
	Modulo = '%';
	ModuloEqual = '%=';
	Multiply = '*';
	MultiplyEqual = '*=';
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
	PlusEqual = '+=';
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
	ShiftLeftEqual = '<<=';
	ShiftRight = '>>';
	ShiftRightEqual = '>>=';
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
	ARRAY_ACCESS;
	BLOCK;
	CAST;
	CAST_ASSIGN;
	CLASS_BODY;
	CLASS_MEMBER;
	CONSTANT_DECLARATION;
	CONSTANT_DECLARATION_LIST;
	DEFAULT_NAMESPACE;
	EXCEPTION_LIST;
	EXPRESSION_LIST;
	FUNCTION_CALL;
	INTERFACE_BODY;	
	MEMBER_ACCESS;
	MEMBER_ACCESS_STATIC;
	METHOD_CALL;
	METHOD_DECLARATION;
	MODIFIER;
	PARAM_DECLARATION;
	PARAM_LIST;
	PARAM_TYPE;
	POST_INCREMENT_DECREMENT;
	PRE_INCREMENT_DECREMENT;
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
	:	'namespace' namespaceId block=';' statement* 
		-> ^('namespace' ^(TYPE[$namespaceId.start,"type"] namespaceId) ^(BLOCK[$block,"block"] statement*))
	;

namespaceBracket
	:	'namespace' namespaceIdOrEmpty  block='{' statement* '}' 
		-> 	^('namespace' 
				^(TYPE[$namespaceIdOrEmpty.start,"type"] namespaceIdOrEmpty) 
				^(BLOCK[$block,"block"] statement*)
			)
	;
namespaceIdOrEmpty
	:	namespaceId
	|	/* empty */ -> DEFAULT_NAMESPACE[$namespaceIdOrEmpty.start,"default"]
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
					^(TYPE[$statement.start,"type"] DEFAULT_NAMESPACE[$statement.start,"default"]) 
					^(BLOCK[$statement.start,"block"] statement+)
				) 
	;

statement	
	:	useDeclarationList
	|	definition
	|	instructionWithoutBreakContinue
	;
	
useDeclarationList
	:	'use' first=useDeclaration (',' other=useDeclaration)* ';' 
		-> ^('use' ^(USE_DECLRATARION[$first.start,"useDeclaration"] useDeclaration) (^(USE_DECLRATARION[$other.start,"useDeclaration"] useDeclaration))* )
	;
	
useDeclaration
	:	useDeclarationWithoutAs ('as'! Identifier)?
	;
	
useDeclarationWithoutAs
	:	root=Identifier '\\' namespaceId -> ^(TYPE[$root,"type"] $root namespaceId)
	|	root='\\' namespaceId ->  ^(TYPE[$root,"type"] $root namespaceId)
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
			^(MODIFIER[$classModifier.start,"classModifier"] classModifier?)
			Identifier 
			^(Extends[$ex,"extends"] $exIds?)
			^(Implements[$impl,"implements"] $implIds?)
			^(CLASS_BODY[$block,"classBody"] classBody*)
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
	|	memberDeclaration	
	|	constructDeconstruct
	|	abstractMethodDeclaration
	|	methodDeclaration
	;

constDeclarationList
	:	 begin='const' scalarTypes constantAssignment (',' constantAssignment)* ';'
		-> ^(CONSTANT_DECLARATION_LIST[$begin,"constants"] scalarTypes constantAssignment+)
	;
	
constantAssignment
	:	Identifier^ '='! unaryPrimitiveAtom
	;

memberDeclaration	
	:	st='static'? accessModifier variableDeclarationList ';' 
		-> ^(CLASS_MEMBER[$memberDeclaration.start,"classMember"] ^(MODIFIER[$memberDeclaration.start,"modifier"] $st?) accessModifier 
			^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"variables"] variableDeclarationList)
		)
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
	:	abstr='abstract' accessModifierWithoutPrivateOrPublic 'function' functionSignatureInclReturnType ';'
		-> ^(METHOD_DECLARATION[$abstractMethodDeclaration.start,"method"]  
			^(MODIFIER[$abstr,"modifier"] $abstr) accessModifierWithoutPrivateOrPublic
			functionSignatureInclReturnType 
		) 
	;

methodDeclaration	
	:	methodModifier? accessModifierOrPublic 'function' functionSignatureInclReturnType block='{' instructionWithoutBreakContinue* '}' 
		-> ^(METHOD_DECLARATION[$methodDeclaration.start,"method"]  
			^(MODIFIER[$methodModifier.start,"modifier"] methodModifier?)
			accessModifierOrPublic
			functionSignatureInclReturnType 
			^(BLOCK[$block,"block"] instructionWithoutBreakContinue*)
		) 
	;	
	

methodModifier
	:	'static' 'final'?  
	|	'final' st='static'?
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
		-> ^('interface' Identifier ^(Extends[$ext,"extends"] identifierList?) ^(INTERFACE_BODY[$block,"interfaceBody"] interfaceBody*))
	;

interfaceBody
	:	constDeclarationList
	|	interfaceMethodDeclaration
	|	interfaceConstruct
	;

interfaceMethodDeclaration
	:	'public'? 'function' functionSignatureInclReturnType ';'
		-> ^(METHOD_DECLARATION[$interfaceMethodDeclaration.start,"method"]  functionSignatureInclReturnType 
		) 
	;

interfaceConstruct
	:	 'public'? 'function' '__construct' formalParameters ';' -> ^('__construct' formalParameters)
	;



/******* Procedural related - is also be used by OOP ************/
//***************************************************************/
functionDeclaration	
	:	'function' functionSignatureInclReturnType block='{' instructionWithoutBreakContinue* '}' 
		-> ^('function' functionSignatureInclReturnType ^(BLOCK[$block,"block"] instructionWithoutBreakContinue*))
	;
	
functionSignatureInclReturnType
	:	returnType Identifier formalParameters
	;
	
returnType
	:	allTypes | 'void'
	;

allTypes
	:	primitiveTypesInclResource | classInterfaceTypeInclObject
	;

allTypesWithoutObjectAndResource
	:	primitiveTypesWithoutResource
	| 	classInterfaceTypeWithoutObject
	;

scalarTypes
	:	TypeBool
	|	TypeInt
	|	TypeFloat
	|	TypeString
	;
	
primitiveTypesWithoutResource
	:	scalarTypes
	|	TypeArray
	;
	
primitiveTypesInclResource
	:	primitiveTypesWithoutResource
	|	TypeResource
	;

classInterfaceTypeWithoutObject
	:	root='\\'? namespaceId -> ^(TYPE_NAME[$classInterfaceTypeWithoutObject.start,"typeName"] $root? namespaceId)
	;
	
classInterfaceTypeInclObject
	:	classInterfaceTypeWithoutObject
	|	TypeObject
	;

formalParameters
	:	params='(' paramList? ')' -> ^(PARAM_LIST[$params,"parameters"] paramList?)
	;

paramList
	:	paramDeclarationOptional (','! paramDeclarationOptional)*
	|	paramDeclarationNormal (','! paramDeclarationNormal)* (','! paramDeclarationOptional)*	
	;
	
paramDeclarationNormal
	:	allTypesInclModifierForParameter VariableId 
		-> ^(PARAM_DECLARATION[$paramDeclarationNormal.start,"parameterDeclaration"] allTypesInclModifierForParameter ^(VariableId) )
	;
	
paramDeclarationOptional
	:	allTypesInclModifierForParameter VariableId '=' unaryPrimitiveAtom 
		-> ^(PARAM_DECLARATION[$paramDeclarationOptional.start,"parameterDeclaration"] allTypesInclModifierForParameter ^(VariableId unaryPrimitiveAtom))
	;


allTypesInclModifierForParameter
	:	Cast? allTypesWithoutObjectAndResource '?'?
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			^(TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"typeModifier"] Cast? '?'?) 
			allTypesWithoutObjectAndResource
		)
	|	objectOrResource
		-> ^(TYPE[$allTypesInclModifierForParameter.start,"type"] 
			TYPE_MODIFIER[$allTypesInclModifierForParameter.start,"typeModifier"] 
			objectOrResource
		)
	;

VariableId	
	:	'$' Identifier
	;

instructionWithoutBreakContinue	
	:	block = '{' instructionWithoutBreakContinue* '}' -> ^(BLOCK[$block,"block"]  instructionWithoutBreakContinue*)
	|	instruction
	;

instructionInclBreakContinue
	:	block =  '{' instructionInclBreakContinue*  '}' -> ^(BLOCK[$block,"block"] instructionInclBreakContinue*)
	|	instruction
	|	('break'|'continue')^ Int? ';'!
	;	

instruction
	:	variableAssignment ';'!
	|	localVariableDeclaration ';'!
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
	|	semi=';' -> BLOCK[$semi,"block"]
	;
	
expressionList
	:	expression (','! expression)*
	;

variableAssignment
	:	VariableId assignmentOperator^ expression
	;
	
incrementDecrement
	:	postIncrementDecrement
	|	preIncrementDecrement
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
	|	cast='=''('')' -> CAST_ASSIGN[$cast,"castAssign"]
	;
	
postIncrementDecrement 
	:	postFixVariableWithoutCallAtTheEnd plusPlusOrMinusMinus 
		-> ^(POST_INCREMENT_DECREMENT[$postFixVariableWithoutCallAtTheEnd.start, "postIncrementDecrement"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd)
	;
	
plusPlusOrMinusMinus
	:	'++'
	|	'--'
	;
	
preIncrementDecrement
	:	plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd 
		-> ^(PRE_INCREMENT_DECREMENT[$plusPlusOrMinusMinus.start,"preIncrementDecrement"] plusPlusOrMinusMinus postFixVariableWithoutCallAtTheEnd)
	;
		
localVariableDeclaration
	:	variableDeclarationList -> ^(VARIABLE_DECLARATION_LIST[$variableDeclarationList.start,"variables"] variableDeclarationList)
	;
	
variableDeclarationList
	:	allTypesWithoutObjectAndResource 
		(	castAssign[$allTypesWithoutObjectAndResource.tree]
		|	assign
		)
		(','!	(	castAssign[$allTypesWithoutObjectAndResource.tree]
			|	assign
			)
		)*		
	|	objectOrResource assign (','! assign)*
	;
	
castAssign[Tree tree]
	:	VariableId cast='=''('')' expression -> ^(VariableId ^(CAST[$cast,"cast"] {$tree} expression))
	;

assign	
	:	VariableId^ ('='! expression)?
	;
objectOrResource
	:	'object'
	|	'resource'
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
	:	ternary (assignmentOperator^ ternary)*
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
	:	cast = '(' allTypesWithoutObjectAndResource ')' castOrBitwiseNotOrAt -> ^(CAST[$cast,"cast"] allTypesWithoutObjectAndResource castOrBitwiseNotOrAt)
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
	:	staticAccessOrParent VariableId -> ^(MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,"staticMemberAccess"] staticAccessOrParent VariableId)
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
	|	'new' classInterfaceTypeWithoutObject -> ^('new' classInterfaceTypeWithoutObject PARAM_LIST[$classInterfaceTypeWithoutObject.stop,"parameters"])
	;

actualParameters
	:	list='(' expressionList? ')' -> ^(EXPRESSION_LIST[$list,"parameters"] expressionList?)
	;

unaryPrimary
	:	uplus = '+' primary -> primary
	|	uminus = '-' primary -> ^(UNARY_MINUS[$uminus,"unaryMinus"] primary)
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
		)
		(	memberAccess = '->' Identifier -> ^(MEMBER_ACCESS[$memberAccess,"memberAccess"] $postFixCall Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrayAccess"] $postFixCall expression)
		|	call -> ^(METHOD_CALL[$call.start,"methodCall"] $postFixCall call)
		)*
	;

functionCall
	:	classInterfaceTypeWithoutObject actualParameters
		-> ^(FUNCTION_CALL[$classInterfaceTypeWithoutObject.start,"functionCall"] classInterfaceTypeWithoutObject actualParameters)
	;
	
call	:	'->'! Identifier actualParameters
	;
	
methodCall
	:	callee Identifier actualParameters
		-> ^(METHOD_CALL[$callee.start,"methodCall"] callee Identifier actualParameters)
	;
	
callee	:	variableOrMemberOrStaticMember '->'!
	|	staticAccessOrParent
	;

atom	:	'(' expression ')' -> expression
	|	incrementDecrement
	|	postFixVariableInclCallAtTheEnd
	|	array
	|	primitiveAtomWithConstant
	;

postFixVariableWithoutCallAtTheEnd
	:	(variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember)
		(
			(call* -> ^(METHOD_CALL[$call.start,"methodCall"] $postFixVariableWithoutCallAtTheEnd call*) )
			
			(	memberAccess = '->' Identifier -> ^(MEMBER_ACCESS[$memberAccess,"memberAccess"] $postFixVariableWithoutCallAtTheEnd Identifier)
			|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrayAccess"] $postFixVariableWithoutCallAtTheEnd expression)
			)
			
		)*
	;
	
postFixVariableInclCallAtTheEnd
	:	(variableOrMemberOrStaticMember -> variableOrMemberOrStaticMember)
		(	memberAccess = '->' Identifier -> ^(MEMBER_ACCESS[$memberAccess,"memberAccess"] $postFixVariableInclCallAtTheEnd Identifier)
		|	arrayAccess = '[' expression ']' -> ^(ARRAY_ACCESS[$arrayAccess,"arrayAccess"] $postFixVariableInclCallAtTheEnd expression)
		|	call -> ^(METHOD_CALL[$call.start,"methodCall"] $postFixVariableInclCallAtTheEnd call)
		)*
	;

classConstant
	:	staticAccessOrParent Identifier -> ^(MEMBER_ACCESS_STATIC[$staticAccessOrParent.start,"staticMemberAccess"] staticAccessOrParent Identifier)
	;
	

	
unaryPrimitiveAtom
	:	uplus = '+' primitiveAtomWithConstant -> primitiveAtomWithConstant
	|	uminus = '-' primitiveAtomWithConstant -> ^(UNARY_MINUS[$uminus,"unaryMinus"] primitiveAtomWithConstant)
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
	|	Identifier 
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
	:	'if' '(' expression ')' instructionThen =instructionInclBreakContinue	
		( 'else' instructionElse =instructionInclBreakContinue )? -> ^('if' expression $instructionThen $instructionElse?)
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
		-> 	^(SWITCH_CASES[$normalCaseInstructionMandatory.start,"switchCases"] caseLabel+)
		 	^(BLOCK[$instructionInclBreakContinue.start,"block"] instructionInclBreakContinue+)
	;
	
normalCaseInstructionOptional
	:	caseLabel+ instructionInclBreakContinue*
		-> 	^(SWITCH_CASES[$normalCaseInstructionOptional.start,"switchCases"] caseLabel+) 
			^(BLOCK[$instructionInclBreakContinue.start,"block"] instructionInclBreakContinue*)
		
	;	
defaultCaseInstructionMandatory
	:	caseLabel* defaultLabel caseLabel* instructionInclBreakContinue+
		-> 	^(SWITCH_CASES[$defaultCaseInstructionMandatory.start,"switchCases"] caseLabel* defaultLabel) 
			^(BLOCK[$instructionInclBreakContinue.start,"block"] instructionInclBreakContinue+)
	;
defaultCaseInstructionOptional
	:	caseLabel* defaultLabel caseLabel* instructionInclBreakContinue*
		-> 	^(SWITCH_CASES[$defaultCaseInstructionOptional.start,"switchCases"] caseLabel* defaultLabel) 
			^(BLOCK[$instructionInclBreakContinue.start,"block"] instructionInclBreakContinue*)
	;
	
caseLabel	
	:	'case'! expression ':'!
	;

defaultLabel
	:	'default' ':'!
	;
	
forLoop	
	:	'for'^ forInit forCondition forUpdate instructionInclBreakContinue
	;
	
forInit	
	:	init='(' 
		(	variableDeclarationList -> ^(VARIABLE_DECLARATION_LIST[$init,"variables"] variableDeclarationList)
		|	expressionList? -> ^(EXPRESSION_LIST[$init,"expressions"] expressionList?)
		)	
	;
	
forCondition
	:	condition=';' expressionList? -> ^(EXPRESSION_LIST[$condition,"expressions"] expressionList?)
	;	
	
forUpdate
	:	update=';' expressionList? ')' -> ^(EXPRESSION_LIST[$update,"expressions"] expressionList?)
	;

foreachLoop
	:	'foreach' '(' expression 'as' (keyType=scalarTypes keyVarId=VariableId '=>')? valueType=allTypesWithoutObjectAndResource valueVarId=VariableId ')' instructionInclBreakContinue 
		-> ^('foreach' expression $keyType? $keyVarId? $valueType $valueVarId instructionInclBreakContinue)
	;

whileLoop
	:	'while' '(' expression ')' instructionInclBreakContinue -> ^('while' expression instructionInclBreakContinue)
	;
	
doWhileLoop
	:	'do' instructionInclBreakContinue 'while' '(' expression ')' ';' -> ^('do' instructionInclBreakContinue expression)
	;

tryCatch
	:	'try' tryBegin='{' instructionInclBreakContinue* '}' catchBlock+
		-> ^('try' ^(BLOCK[$tryBegin,"block"] instructionInclBreakContinue*) catchBlock+)
	;
	
catchBlock
	:	catchBegin='catch' list='(' classInterfaceTypeWithoutObject VariableId ')' block='{' instructionInclBreakContinue* '}'
		-> ^($catchBegin 
			^(EXCEPTION_LIST[$list,"exceptions"] ^(VariableId classInterfaceTypeWithoutObject))
			^(BLOCK[$block,"block"] instructionInclBreakContinue*)
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


	