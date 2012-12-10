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
	Semicolon =';';
	INT = 'int';
	BOOL = 'bool';
	BOOLEAN = 'boolean';
	FLOAT = 'float';
	STRING = 'string';
	RESOURCE = 'resource';
	ARRAY = 'array';
}

@header{
package ch.tutteli.tsphp.grammar;
}
@lexer::header{
package ch.tutteli.tsphp.grammar;
}
prog	:	statement+;

statement	:	var;


var	: type VARID  ';';

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

	



/*
integer     : PLMN? DECIMAL
            | PLMN? HEXADECIMAL
            | PLMN? OCTAL
            | PLMN? BINARY;
           




fragment
PLMN	:	('+'|'-');

fragment
DECIMAL     : ('1'..'9') ('0'..'9')*
            | '0'
            ;
fragment
HEXADECIMAL : '0'('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

fragment
OCTAL       : '0'('0'..'7')+;

fragment
BINARY      : '0b'('0'|'1')+;
/*
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    */

//COMMENT
//    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
//    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
//    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
/*
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;



fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
*/