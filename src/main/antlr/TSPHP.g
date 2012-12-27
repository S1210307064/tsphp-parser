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
}

tokens{
	Arrow = '=>';
	As = 'as';
	At = '@';
	Assign = '=';
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
	Colon = ':';
	Comma = ',';
	Continue = 'continue';
	Equal = '==';	
	Else = 'else';
	Default = 'default';
	Divide = '/';
	DivideEqual = '/=';
	Do = 'do';
	Dolar = '$';
	Dot = '.';
	DotEqual = '.=';
	GreaterThan = '>';
	GreaterEqualThan = '>=';
	Function = 'function';
	For = 'for';
	Foreach = 'foreach';
	Identical = '===';
	If = 'if';
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
	NotEqual = '!=';
	NotEqualAlternative = '<>';
	NotIdentical = '!==';
	QuestionMark = '?';
	Plus = '+';
	PlusEqual = '+=';
	PlusPlus = '++';
	Return = 'return';
	RightCurlyBrace = '}';
	RightParanthesis =')';
	RightSquareBrace = ']';
	ShiftLeft = '<<';
	ShiftLeftEqual = '<<=';
	ShiftRight = '>>';
	ShiftRightEqual = '>>=';
	TypeBool = 'bool';
	TypeBoolean = 'boolean';
	TypeInt = 'int';
	TypeFloat = 'float';
	TypeString = 'string';
	TypeArray = 'array';
	TypeResource = 'resource';
	TypeObject = 'object';
	Semicolon = ';';
	Switch = 'switch';
	Void = 'void';
	While = 'while';
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
package ch.tutteli.tsphp.grammar;
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
package ch.tutteli.tsphp.grammar;
}

	
prog	:	namespaceSemicolon+ EOF
	|	namespaceBracket+ EOF
	|	withoutNamespace EOF
	;
	
namespaceSemicolon
	:	('namespace' namespaceId ';' statement+ );

namespaceBracket
	:	('namespace' namespaceId? '{' statement+ '}');

//Must before Id otherwise Id match true and false
Bool	:	'true'|'false';

Identifier	
	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*;

namespaceId
	:	Identifier ('\\' Identifier)*;


withoutNamespace 
	:	statement+;

statement	
	:	definition
	|	instructionWithoutBreakContinue
	;

definition
	:	functionDeclaration	
	;
	
functionDeclaration	
	:	'function' returnType Identifier '(' paramList? ')' '{' instructionWithoutBreakContinue* '}';
	
returnType
	:	primitiveTypes | 'void';

primitiveTypesWithoutResource
	:	TypeBool
	|	TypeBoolean
	|	TypeInt
	|	TypeFloat
	|	TypeString
	|	TypeArray
	|	TypeObject
	;
	
primitiveTypes
	:	primitiveTypesWithoutResource
	|	TypeResource
	;
	
paramList
	:	 paramDeclaration (',' paramDeclaration)*;
	
paramDeclaration
	:	primitiveTypes VariableId ('=' expression)?;

VariableId	
	:	'$' Identifier;

instructionWithoutBreakContinue	
	:	'{' instructionWithoutBreakContinue+  '}'
	|	instruction
	;

instructionInclBreakContinue
	:	'{' instructionInclBreakContinue+  '}'
	|	instruction
	|	('break'|'continue') Int? ';'
	;	

instruction
	:	variableAssignment
	|	variableDeclaration
	|	ifCondition
	|	switchCondition
	|	forLoop
	|	foreachLoop
	|	whileLoop
	|	doWhileLoop
	|	'return' expression? ';'
	;

variableAssignment
	:	variableAssignmentWithoutSemicolon ';'
	;

variableAssignmentWithoutSemicolon
	:	VariableId assignmentOperator expression
	|	postIncrementDecrement
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
	;
	
postIncrementDecrement
	:	VariableId ('++'|'--');
	
preIncrementDecrement
	:	('++'|'--') VariableId;
	
	
variableDeclarationWithoutSemicolon
	:	primitiveTypes VariableId ('=' expression)? ;
	
variableDeclaration	
	:	variableDeclarationWithoutSemicolon ';' ;

expression
	:	logicOrWeak;

logicOrWeak
	:	logicXorWeak ('or' logicXorWeak)*; 
	
logicXorWeak
	:	logicAndWeak ('xor' logicAndWeak)*; 
	
logicAndWeak
	:	assignment ('and' assignment)*;

assignment
	:	ternary (assignmentOperator ternary)*;

ternary	:	logicOr ('?' expression ':' logicOr)?;

logicOr	:	logicAnd ('||' logicAnd)*;

logicAnd:	bitwiseOr ('&&' bitwiseOr)*;

bitwiseOr
	:	bitwiseXor ('|' bitwiseXor)*;

bitwiseXor
	:	bitwiseAnd ('^' bitwiseAnd)*;

bitwiseAnd
	:	equality ('&' equality)*;

equality:	comparison (equalityOperator comparison)*;

equalityOperator
	:	'=='
	|	'==='
	|	'!='
	|	'!=='
	|	'<>'
	;

comparison
	:	bitwiseShift (comparisonOperator bitwiseShift)*;

comparisonOperator
	:	'<'
	|	'<='
	|	'>'
	|	'>='
	;

bitwiseShift	:	termOrStringConcatenation (('<<'|'>>') termOrStringConcatenation)*;

termOrStringConcatenation	:	factor (('+'|'-'|'.') factor)*;

factor	:	logicNot (('*'|'/'|'%') logicNot)*;

logicNot:	'!' logicNot
	|	castOrBitwiseNotOrAt
	;

/*
instanceOf
	:	castOrBitwiseNotOrAt ('instanceof' castOrBitwiseNotOrAt)?;
*/
castOrBitwiseNotOrAt
	:	('(' primitiveTypesWithoutResource ')') castOrBitwiseNotOrAt
	|	'~' castOrBitwiseNotOrAt
	|	'@' castOrBitwiseNotOrAt
	|	incrementDecrement
	;
	
incrementDecrement
	:	postIncrementDecrement
	|	preIncrementDecrement
	|	unaryAtom
	;

unaryAtom
	:	'+' atom
	|	'-' atom
	|	atom
	;
	

atom	:	'(' expression ')'
	|	Bool
	|	Int
	|	Float
	|	String
	|	array
	|	VariableId
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
	:	'0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

fragment
OCTAL	:	'0' ('0'..'7')+;


fragment
BINARY	:	'0b'('0'|'1')+;


Float
    	:	('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|	'.' ('0'..'9')+ EXPONENT?
    	|	('0'..'9')+ EXPONENT
    	;
    
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
	
String	:	STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED ;



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
	
array	:	'[' array_content? ']' 
	|	TypeArray '(' array_content? ')'
	;
	
array_content
	:	(expression '=>')? expression  (',' (expression '=>')? expression)*;


ifCondition
	:	'if' '(' expression ')' instructionWithoutBreakContinue	
		( 'else' instructionWithoutBreakContinue )?
	;

	
forLoop	:	'for' '(' (variableDeclarationWithoutSemicolon|variableAssignmentWithoutSemicolon)? ';'  expression? ';' variableAssignmentWithoutSemicolon? ')' instructionInclBreakContinue;

foreachLoop
	:	'foreach' '(' (VariableId|array) 'as' VariableId ('=>' VariableId)? ')' instructionInclBreakContinue;

whileLoop
	:	'while' '(' expression ')' instructionInclBreakContinue;
	
doWhileLoop
	:	'do' instructionInclBreakContinue 'while' '(' expression ')' ';';

switchCondition	
	:	'switch' '(' VariableId ')' '{' 
		(
			(caseLabel+ instructionInclBreakContinue+)+ defaultLabel instructionInclBreakContinue+ (caseLabel+ instructionInclBreakContinue+)+
		|	(caseLabel+ instructionInclBreakContinue+)+ (defaultLabel instructionInclBreakContinue+)?
		)
		'}'
	;

caseLabel	
	:	'case' expression ':';

defaultLabel
	:	'default' ':';

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


	