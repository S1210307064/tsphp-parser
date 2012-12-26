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
	RightCurlyBrace = '}';
	RightParanthesis =')';
	RightSquareBrace = ']';
	ShiftLeftEqual = '<<=';
	ShiftRightEqual = '>>=';
	TypeInt = 'int';
	TypeBool = 'bool';
	TypeBoolean = 'boolean';
	TypeFloat = 'float';
	TypeString = 'string';
	TypeResource = 'resource';
	TypeArray = 'array';
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
	:	('namespace' NamespaceId ';' command+ );

namespaceBracket
	:	('namespace' NamespaceId? '{' command+ '}');

//Must before NamespaceId otherwise NamespaceId match true and false
Bool	:	'true'|'false';

NamespaceId
	:	ID ('\\' ID)*;


fragment
ID	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*;

withoutNamespace 
	:	command+;

command	:	block
	//|	definition
	|	instruction
	;
	

block	:	'{' command+  '}';

/*definition
	:	functionDeclaration	
	;
	
functionDeclaration	
	:	'function' returnType ID '(' paramList ')' '{' '}';
	
returnType
	:	PRIMITIVE_TYPES | 'void';
	
paramList
	:	varDecl (',' varDecl)*;*/

instruction	
	:	varAssignment
	|	varDeclaration
	|	ifCondition
	|	forLoop
	|	foreachLoop
	|	whileLoop
	|	switchCondition
	|	doWhileLoop
	;
	
varAssignment
	:	varAssignmentWithoutSemicolon ';'
	;

varAssignmentWithoutSemicolon
	:	VariableId assignmentOperator (expressionOrArray | VariableId) 
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




expressionOrArray
	:	expression|array;
	
expression
	:	intExpression
	|	stringExpression
	|	boolExpression
	|	floatExpression
	;	


varDeclaration	
	:	arrayDeclaration
	|	boolDeclaration	
	|	intDeclaration 
	|	floatDeclaration
	|	stringDeclaration
	|	TypeResource VariableId ';'
	;

	
boolDeclaration
	:	(TypeBool|TypeBoolean) VariableId ( '=' (boolExpression|VariableId) )? ';';

VariableId	:	'$' ID;

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
			  ('\\' '\\')=>'\\' '\\' 
			|  ('\\' '\'')=>'\\' '\'' 
			| ~ ('\'' )
		)* '\'';
	
fragment
STRING_DOUBLE_QUOTED
    	:	'"' (
			  ('\\' '\\') => '\\\\'
			|  ('\\' '"') => '\\"'
			| ('\\' '$') => '\\$'
			| ~ ('"' | '$')
  		)* '"';

arrayDeclaration
	:	TypeArray VariableId ( '=' (array|VariableId) )? ';' ;

array	:	'[' array_content? ']' 
	|	TypeArray '(' array_content? ')'
	;
	
array_content
	:	(array_key '=>')? array_value  (',' (array_key '=>')? array_value)*;

array_key
	:	expression|VariableId;



array_value
options {
backtrack=true;
}
	:	expressionOrArray;
	
ifCondition
	:	'if' '(' (boolExpression | VariableId) ')' blockOrSingleCommand	
		( 'else' blockOrSingleCommand )?
	;

blockOrSingleCommand
	:	block
	| 	command
	;
	
forLoop	:	'for' '(' ((varDeclaration|varAssignment)?|';')  boolExpression? ';' varAssignmentWithoutSemicolon? ')' loopBlockOrSingleCommand;

loopBlockOrSingleCommand
	:	blockOrSingleCommand
	|	'break' BREAK_CONTINUE_NUMBER? ';'
	|	'continue' BREAK_CONTINUE_NUMBER? ';'
	;
	
fragment
BREAK_CONTINUE_NUMBER
	:	('1'..'9');

foreachLoop
	:	'foreach' '(' (VariableId|array) 'as' VariableId ('=>' VariableId)? ')' loopBlockOrSingleCommand;

whileLoop
	:	'while' '(' boolExpression ')' loopBlockOrSingleCommand;
	
doWhileLoop
	:	'do' loopBlockOrSingleCommand 'while' '(' boolExpression ')' ';';

switchCondition	
	:	'switch' '(' VariableId ')' '{' 
		(
			(caseLabel+ switchCommand)+ defaultLabel switchCommand (caseLabel+ switchCommand)+
		|	(caseLabel+ switchCommand)+ (defaultLabel switchCommand)?
		)
		'}'
	;

caseLabel	:	'case' expressionOrArray ':';

switchCommand
	:	block
	|	command+
	|	'break' BREAK_CONTINUE_NUMBER? ';'
	|	'continue' BREAK_CONTINUE_NUMBER? ';'
	;
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


	