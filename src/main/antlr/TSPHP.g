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

tokens{

	Equal = '=';	
	Semicolon =';';
	T_INT = 'int';
	T_BOOL = 'bool';
	T_BOOLEAN = 'boolean';
	T_FLOAT = 'float';
	T_STRING = 'string';
	T_RESOURCE = 'resource';
	T_ARRAY = 'array';
	TRUE = 'true';
	FALSE = 'false';

}

@header{
package ch.tutteli.tsphp.grammar;
}
@lexer::header{
package ch.tutteli.tsphp.grammar;
}
prog	:	stat+;

stat	:	varDecl
	|	varAssign;


varDecl	: type VARID  ';';

type 	:	primitiveTypes;

primitiveTypes
	:	'bool'|'boolean'
	|	'int'
	|	'float'
	|	'string'
	|	'resource'
	|	'array'
	//TODO calable
	;


VARID	:	'$' ID;

fragment
ID	:	('a'..'z'|'A'..'Z'|'_'|'\u007f'..'\u00ff') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\u007f'..'\u00ff')*;



varAssign
	:	boolAssign	
	|	intAssign 
	|	floatAssign
	|	stringAssign
	;


	
boolAssign
	:	(T_BOOL|T_BOOLEAN) VARID '=' (TRUE|FALSE) ';';
	

intAssign
	:	T_INT VARID '=' INT ';';


INT     : 	PLUSMINUS? DECIMAL
        | 	PLUSMINUS? HEXADECIMAL
        | 	PLUSMINUS? OCTAL
        | 	PLUSMINUS? BINARY
        ;
        
fragment           
PLUSMINUS	
	:	('+'|'-');

fragment
DECIMAL     
	:	('1'..'9') ('0'..'9')*
        |	 '0'
        ;
        
fragment          
HEXADECIMAL 
	:	'0' HEX_BEGIN HEX_DIGIT+;

fragment
HEX_BEGIN
	:	('x'|'X');
fragment
HEX_DIGIT
	:	('0'..'9'|'a'..'f'|'A'..'F');
fragment
OCTAL	:	'0' OCTAL_DIGIT+;

fragment
OCTAL_DIGIT
	:	('0'..'7');

fragment
BINARY	:	'0b'('0'|'1')+;


floatAssign
	:	T_FLOAT VARID '=' FLOAT ';';


FLOAT
    	:	PLUSMINUS? ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|	PLUSMINUS? '.' ('0'..'9')+ EXPONENT?
    	|	PLUSMINUS? ('0'..'9')+ EXPONENT
    	;
    
fragment
EXPONENT : ('e'|'E') PLUSMINUS? ('0'..'9')+ ;

stringAssign
	:	T_STRING VARID '=' (STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED) ';';


STRING_SINGLE_QUOTED
	:	'\'' ( 
			('\\' ESC_SEQ_STRING_SINGLE_QUOTED) => '\\' ESC_SEQ_STRING_SINGLE_QUOTED
			| ('\u0000'..'\u0026') 
			| ('\u0028'..'\u005B') 
			| ('\u005D'..'\u00FF')
		)* '\'';
fragment
ESC_SEQ_STRING_SINGLE_QUOTED
	:	'\\' | '\'';
	
	
STRING_DOUBLE_QUOTED
    	:	'"' (
			( '\\' ESC_SEQ_STRING_SINGLE_QUOTED) => '\\' ESC_SEQ_STRING_SINGLE_QUOTED		
    		 	| ('\u0000'..'\u0021') 
    		 	| ('\u0023'..'\u005B') 
    		 	| ('\u005D'..'\u00FF')
  		)* '"';

fragment
ESC_SEQ_STRING_DOUBLE_QUOTED
	:	'n' | 'r' | 't' | 'v' | 'e' | 'f' | '\\' | '"'
    		| (HEX_BEGIN HEX_DIGIT HEX_DIGIT? )
    		| (OCTAL_DIGIT (OCTAL_DIGIT OCTAL_DIGIT?)? )
    		;


//COMMENT
//    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
//    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
//    ;

WS	:	( ' '
        	| '\t'
	        | '\r'
        	| '\n'
	        ) {$channel=HIDDEN;}
	;


	