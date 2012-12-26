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
	Break = 'break';
	Case = 'case';
	Colon = ':';
	Comma = ',';
	Continue = 'continue';
	Equal = '=';	
	Else = 'else';
	Default = 'default';
	DivideEqual = '/=';
	Do = 'do';
	Dolar = '$';
	DotEqual = '.=';
	Function = 'function';
	For = 'for';
	Foreach = 'foreach';
	If = 'if';
	MinusEqual = '-=';
	MinusMinus = '--';
	ModuloEqual = '%=';
	MultiplyEqual = '*=';
	LeftCurlyBrace = '{';
	LeftParanthesis = '(';
	LeftSquareBrace = '[';
	LogicAndEqual = '&=';
	LogicOrEqual = '|=';
	LogicXorEqual = '^=';
	Namespace = 'namespace';
	PlusEqual = '+=';
	PlusPlus = '++';
	Return = 'return';
	RightCurlyBrace = '}';
	RightParanthesis =')';
	RightSquareBrace = ']';
	ShiftLeftEqual = '<<=';
	ShiftRightEqual = '>>=';
	TypeBool = 'bool';
	TypeBoolean = 'boolean';
	TypeInt = 'int';
	TypeFloat = 'float';
	TypeString = 'string';
	TypeArray = 'array';
	TypeResource = 'resource';
	Semicolon = ';';
	Switch = 'switch';
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
	:	('namespace' NamespaceId ';' statement+ );

namespaceBracket
	:	('namespace' NamespaceId? '{' statement+ '}');

//Must before Id otherwise Id match true and false
Bool	:	'true'|'false';

Identifier	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*;

NamespaceId
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

primitiveTypes
	:	TypeBool
	|	TypeBoolean
	|	TypeInt
	|	TypeFloat
	|	TypeString
	|	TypeArray
	|	TypeResource
	;
	
paramList
	:	 paramDeclaration (',' paramDeclaration)*;
	
paramDeclaration
	:	primitiveTypes VariableId ('=' expressionInclArrayExpression)?;


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
	|	'return' expressionInclArrayExpression? ';'
	;

variableAssignment
	:	varAssignmentWithoutSemicolon ';'
	;

varAssignmentWithoutSemicolon
	:	VariableId assignmentOperator (expressionInclArrayExpression | VariableId) 
	|	incrementDecrement VariableId
	|	VariableId incrementDecrement
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

incrementDecrement
	:	'++'
	| 	'--'
	;

expressionInclArrayExpression
	:	expressionWithoutArrayExpression|arrayExpression;
	
expressionWithoutArrayExpression
	:	intExpression
	|	stringExpression
	|	boolExpression
	|	floatExpression
	;	


variableDeclaration	
	:	arrayDeclaration
	|	boolDeclaration	
	|	intDeclaration 
	|	floatDeclaration
	|	stringDeclaration
	|	TypeResource VariableId ';'
	;

	
boolDeclaration
	:	(TypeBool|TypeBoolean) VariableId ( '=' (boolExpression|VariableId) )? ';';

VariableId	:	'$' Identifier;

boolExpression
	:	Bool;
	//TODO boolean arithmetic
	


intDeclaration
	:	TypeInt VariableId ( '=' (intExpression|VariableId) )? ';';

intExpression
	:	Int;
	//TODO int arithmetic

Int     : 	('+'|'-')? DECIMAL
        | 	('+'|'-')? HEXADECIMAL
        | 	('+'|'-')? OCTAL
        | 	('+'|'-')? BINARY
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



floatDeclaration
	:	TypeFloat VariableId ( '=' (floatExpression|VariableId) )? ';';

floatExpression
	:	Float;
	//TODO float expression

Float
    	:	('+'|'-')? ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|	('+'|'-')? '.' ('0'..'9')+ EXPONENT?
    	|	('+'|'-')? ('0'..'9')+ EXPONENT
    	;
    
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

stringDeclaration
	:	TypeString VariableId ('=' (stringExpression | VariableId) )? ';';

stringExpression
	:	String;
	//TODO string arithmetic
	
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

arrayDeclaration
	:	TypeArray VariableId ( '=' (arrayExpression|VariableId) )? ';' ;

arrayExpression
	:	array
	;
	//TODO array arithmetic
	
array	:	'[' array_content? ']' 
	|	TypeArray '(' array_content? ')'
	;
	
array_content
	:	(array_key '=>')? array_value  (',' (array_key '=>')? array_value)*;

array_key
	:	expressionWithoutArrayExpression|VariableId;



array_value
options {
backtrack=true;
}
	:	expressionInclArrayExpression;
	
ifCondition
	:	'if' '(' (boolExpression | VariableId) ')' instructionWithoutBreakContinue	
		( 'else' instructionWithoutBreakContinue )?
	;

	
forLoop	:	'for' '(' ((variableDeclaration|variableAssignment)|';')  boolExpression? ';' varAssignmentWithoutSemicolon? ')' instructionInclBreakContinue;

foreachLoop
	:	'foreach' '(' (VariableId|array) 'as' VariableId ('=>' VariableId)? ')' instructionInclBreakContinue;

whileLoop
	:	'while' '(' boolExpression ')' instructionInclBreakContinue;
	
doWhileLoop
	:	'do' instructionInclBreakContinue 'while' '(' boolExpression ')' ';';

switchCondition	
	:	'switch' '(' VariableId ')' '{' 
		(
			(caseLabel+ instructionInclBreakContinue+)+ defaultLabel instructionInclBreakContinue+ (caseLabel+ instructionInclBreakContinue+)+
		|	(caseLabel+ instructionInclBreakContinue+)+ (defaultLabel instructionInclBreakContinue+)?
		)
		'}'
	;

caseLabel	:	'case' expressionInclArrayExpression ':';

defaultLabel
	:	'default' ':';

Comment
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	//comment could be at the end of the file and thus no \n needed
	|  	'//' ~('\n'|'\r')* {$channel=HIDDEN;}
    	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

Whitespace	:	( ' '
        	| '\t'
	        | '\r'
        	| '\n'
	        ) {$channel=HIDDEN;}
	;


	