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
	Comma = ',';
	Equal = '=';	
	Else = 'else';
	Dolar = '$';
	Function = 'function';
	If = 'if';
	LeftCurlyBrace ='{';
	LeftParanthesis ='(';
	LeftSquareBrace = '[';
	Namespace ='namespace';
	RightCurlyBrace = '}';
	RightParanthesis =')';
	RightSquareBrace = ']';
	TypeInt = 'int';
	TypeBool = 'bool';
	TypeBoolean = 'boolean';
	TypeFloat = 'float';
	TypeString = 'string';
	TypeResource = 'resource';
	TypeArray = 'array';
	Semicolon =';';
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

	
prog	:	namespaceSemicolon+
	|	namespaceBracket+
	|	withoutNamespace
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

command	:	//definition
	//|	
	instruction
	;

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
	:	condition
	//|	forLoop
	|	varDeclaration
	;
	
condition
	:	'if' '(' (boolExpression | VariableId) ')'
		(
			blockOrSingleCommand	
		)
		( 'else' blockOrSingleCommand )?
	;
	
//forLoop	:	'for' '(' intAssign? boolExpression? ';' incrDecr? ')' blockOrSingleCommand;

/*incrDecr:	VariableId IncrementOperator
	|	IncrementOperator VariableId
	;

IncrementOperator
    : '--'|'++'
    ;
*/
blockOrSingleCommand
	:	('{' command*  '}')
	| 	command
	;

varDeclaration	
	:	arrayDeclaration
	|	boolDeclaration	
	|	intDeclaration 
	|	floatDeclaration
	|	stringDeclaration
	|	TypeResource VariableId ';'
	;

fragment
PRIMITIVE_TYPES
	:	TypeBool|TypeBoolean
	|	TypeInt
	|	TypeFloat
	|	TypeString
	|	TypeResource
	|	TypeArray
	//TODO  TypeCallable
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
	:	expressions|VariableId;

expressions
	:	intExpression
	|	stringExpression
	|	boolExpression
	|	floatExpression
	;

array_value
options {
backtrack=true;
}
	:	expressions|array;


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


	