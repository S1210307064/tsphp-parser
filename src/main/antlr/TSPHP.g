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


INT     : 	('+'|'-')? DECIMAL
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


floatAssign
	:	T_FLOAT VARID '=' FLOAT ';';


FLOAT
    	:	('+'|'-')? ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|	('+'|'-')? '.' ('0'..'9')+ EXPONENT?
    	|	('+'|'-')? ('0'..'9')+ EXPONENT
    	;
    
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

stringAssign
	:	T_STRING VARID '=' (STRING_SINGLE_QUOTED | STRING_DOUBLE_QUOTED) ';';


STRING_SINGLE_QUOTED
	:	'\'' (
			  ('\\' '\\')=>'\\' '\\' 
			|  ('\\' '\'')=>'\\' '\'' 
			| ~ ('\'' )
		)* '\'';
	
	
STRING_DOUBLE_QUOTED
    	:	'"' (
			  ('\\' '\\') => '\\\\'
			|  ('\\' '"') => '\\"'
			| ('\\' '$') => '\\$'
			| ~ ('"' | '$')
  		)* '"';

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


	