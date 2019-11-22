//antlr GramProg.g4 && javac *.java && grun GramProg prog -gui EjemploCodigo2.prog
grammar GramProg;
prog: (include | definicionFuncion)*;

//LEXER:

//Keywords del lenguaje. /Siempre van al principio de los símbolos terminales!
FUNCTIONid: 'function';
BEGIN: 'begin';
END: 'end';
STRINGid: 'cadena';
INTid: 'numero';
VOIDid: 'void';
INCLUDEid: 'include';
WHILEid: 'while';
BOOLid: 'booleano';
IFid: 'if';
ELSEid: 'else';
ENDIFid: 'endif';
RETURNid: 'return';
TRUE: 'true';
FALSE: 'false';
THENid: 'then';
FORid: 'for';

//Signos de puntuación varios
PI: '(';
PD: ')';
COMILLAS: '"';
COMA: ',';
FINSENTENCIA: ';';
DOSPUNTOS: ':';

//Operandos
IGUAL: ':=';
MAS: '+';
MENOS: '-';
MULTIPLICADO: '*';
DIVIDIDO: '/';
IGUALIGUAL: '==';
DISTINTO: '!=';
MAYOR: '>';
MENOR: '<';
AND: '&&';
OR: '||';

//Operaciones
OPERACION: 'cos' | 'sen' | 'tan';

//Cadenas de caracteres
VAR: [a-zA-Z]+ [a-zA-Z_0-9]*; //Nombre de variable
STRING: COMILLAS (ESC | ~('"'))*? COMILLAS;
fragment ESC: '\\' [btnr"\\]; // Carácteres de escape

//Números
INT: DIGITO+;
FLOAT:
	DIGITO+ '.' DIGITO* //1. 1.0 1.032434 2323.324424
	| '.' DIGITO+;

//Letras y dígitos
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

//Espacios en blanco, tabuladores...
WS: [ \t\n\r]+ -> skip;
NEWLINE: [\r\n]+;

//Comentarios
COMENTARIO: (
		'//' .*? '\n'
		| '/*' .*? '*/'
		| '/**' .? '**/'
		| '/***' .? '***/'
	) -> skip;

//PARSER:

//Puntuación en los tokens:
llamadaFuncion:
	VAR PI (
		VAR
		| numero
		| llamadaFuncion
		| expr
		| cadena
		| asignacion
	)? (
		COMA (
			VAR
			| numero
			| llamadaFuncion
			| expr
			| cadena
			| asignacion
		)
	)* PD FINSENTENCIA?;

definicionFuncion:
	FUNCTIONid VAR PI (
		asignacionEnFuncion (COMA asignacionEnFuncion)*
	)? PD DOSPUNTOS tipodatoid BEGIN (
		ifEx
		| llamadaFuncion
		| asignacion
		| whileEx
		| forEx
	)* returnEx? END;

whileEx:
	WHILEid PI (TRUE | FALSE | expr) PD BEGIN? (
		ifEx
		| llamadaFuncion
		| asignacion
		| whileEx
		| forEx
	)* END?;

ifEx:
	IFid PI (bool | expr) (comparador (bool | expr))* PD THENid (
		llamadaFuncion
		| asignacion
		| whileEx
		| ifEx
		| forEx
	)* returnEx? (
		ELSEid (
			llamadaFuncion
			| asignacion
			| whileEx
			| ifEx
			| forEx
		)* returnEx?
	)* ENDIFid;

forEx:
	FORid PI (asignacion FINSENTENCIA expr FINSENTENCIA expr) PD FINSENTENCIA;
asignacion:
	tipodatoid? VAR IGUAL? (
		VAR
		| numero
		| llamadaFuncion
		| expr
		| cadena
	)? FINSENTENCIA?;

asignacionEnFuncion:
	tipodatoid VAR (
		VAR
		| numero
		| llamadaFuncion
		| expr
		| cadena
	)?;

include: INCLUDEid VAR FINSENTENCIA;

bool: TRUE | FALSE;

expr:
	((VAR MAS MAS
	| numero
	| PI expr PD
	| OPERACION PI (expr? (COMA expr)*) PD
	| VAR
	| llamadaFuncion
	)expr2)#eexpr;

expr2:
	(((MULTIPLICADO | DIVIDIDO)
	| (MAS | MENOS)
	| (MENOR | DISTINTO | IGUALIGUAL | MAYOR))expr expr2)?;

cadena:
	((STRING
	| (VAR | INT | FLOAT | bool | llamadaFuncion)
	)cadena2)#caadena;

cadena2:
	(MAS cadena cadena2)?;

returnEx: RETURNid (bool | VAR | expr | cadena) FINSENTENCIA;
//Tipos de datos
tipodatoid: STRINGid | INTid | VOIDid | BOOLid;

comparador: AND | OR | MAYOR | MENOR | IGUALIGUAL | DISTINTO;

numero: INT | FLOAT;