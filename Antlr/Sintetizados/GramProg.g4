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

var: tipodatoid? VAR asignacion? FINSENTENCIA?;

asignacion:
	IGUAL (VAR | numero | llamadaFuncion | expr | cadena);
//Puntuación en los tokens:
llamadaFuncion:
	VAR PI (VAR | numero | llamadaFuncion | expr | cadena | var)? (
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
	nombreFuncion parametros tipoRetorno contenido;

nombreFuncion: FUNCTIONid VAR;

parametros:
	PI (var (COMA var)*)? PD;

tipoRetorno: DOSPUNTOS (STRINGid | INTid | VOIDid | BOOLid);

contenido: (BEGIN | THENid) (ifBloque | var | whileEx | forEx | llamadaFuncion)* returnEx? END?;

whileEx:
	WHILEid PI (TRUE | FALSE | expr) PD BEGIN? (
		ifBloque
		| llamadaFuncion
		| var
		| whileEx
		| forEx
	)* END?;

ifBloque: ifEx elseEx* ENDIFid;

ifEx: IFid condicion contenido;

elseEx: ELSEid contenido;

condicion: PI (bool | expr) (comparador (bool | expr))* PD;

forEx:
	FORid PI (var FINSENTENCIA expr FINSENTENCIA expr) PD FINSENTENCIA;

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
	expr (MULTIPLICADO | DIVIDIDO) expr
	| expr (MAS | MENOS) expr
	| expr (MENOR | DISTINTO | IGUALIGUAL | MAYOR) expr
	| VAR MAS MAS
	| numero
	| PI expr PD
	| OPERACION PI (expr? (COMA expr)*) PD
	| VAR
	| llamadaFuncion;

cadena:
	STRING
	| cadena MAS cadena
	| (VAR | INT | FLOAT | bool | llamadaFuncion);

returnEx: RETURNid (bool | VAR | expr | cadena) FINSENTENCIA;
//Tipos de datos
tipodatoid: STRINGid | INTid | VOIDid | BOOLid;

comparador: AND | OR | MAYOR | MENOR | IGUALIGUAL | DISTINTO;

numero: INT | FLOAT;