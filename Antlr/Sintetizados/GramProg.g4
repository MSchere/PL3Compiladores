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
ARRAYid: 'array';
INCLUDEid: 'include';
WHILEid: 'while';
BOOLid: 'booleano';
IFid: 'if';
ELSEid: 'else';
ENDIFid: 'endif';
RETURNid: 'return';
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
ELEVADO: '^';
SQRT: 'sqrt';
IGUALIGUAL: '==';
DISTINTO: '!=';
MAYOR: '>';
MENOR: '<';
MENORMAYOR: '<>';
AND: '&';
OR: '|';
ANDAND: '&&';
OROR: '||';
MAYORMAYOR: '>>';
MENORMENOR: '<<';

//Operaciones
OPERACION: 'cos' | 'sen' | 'tan';

//Cadenas de caracteres
VARid: [a-zA-Z]+ [a-zA-Z_0-9]*; //Nombre de variable
STRING: COMILLAS (ESC | ~('"'))*? COMILLAS;
fragment ESC: '\\' [btnr"\\]; // Carácteres de escape

//Números
INT: DIGITO+;
FLOAT:
	DIGITO+ '.' DIGITO* //1. 1.0 1.032434 2323.324424
	| '.' DIGITO+;
BOOL: TRUE | FALSE;

//Letras, dígitos y estados
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment TRUE: 'true';
fragment FALSE: 'false';

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

//Variables
var: tipodatoid? VARid (asignacion|valor)? FINSENTENCIA?;

asignacion: IGUAL valor;

valor: VARid | BOOL | llamadaFuncion | expr | cadena;

//Funciones
llamadaFuncion: nombreFuncion parametros FINSENTENCIA?;

definicionFuncion: nombreFuncion parametros tipoRetorno contenido;

tipoRetorno: DOSPUNTOS (STRINGid | INTid | VOIDid | BOOLid);

parametros: PI (var (COMA var)*)? PD;

nombreFuncion: FUNCTIONid? VARid;

//Estructuras de control
whileEx: WHILEid condicion;

ifBloque: ifEx elseEx* ENDIFid;

ifEx: IFid condicion contenido;

elseEx: ELSEid contenido;

forEx: FORid PI var condicion expr PD FINSENTENCIA?;

condicion: PI? (BOOL | expr) (opBinario (BOOL | expr))* (PD|FINSENTENCIA)?;

contenido: (BEGIN | THENid)? (ifBloque | var | whileEx | forEx | llamadaFuncion)* returnEx? END?;

//Librerías
include: INCLUDEid VARid FINSENTENCIA;


//Expresiones
expr:
	(VARid MAS MAS
	| INT
	| FLOAT
	| PI expr PD
	| OPERACION PI (expr? (COMA expr)*) PD
	| VARid
	| llamadaFuncion
	)expr2;

expr2:
	(((MULTIPLICADO | DIVIDIDO)
	| (MAS | MENOS)
	| (MENOR | DISTINTO | IGUALIGUAL | MAYOR))expr expr2)?;


//Cadenas
cadena:
	(STRING
	| (VARid | INT | FLOAT | BOOL | llamadaFuncion)
	)cadena2;

cadena2:
	(MAS cadena cadena2)?;

returnEx: RETURNid valor FINSENTENCIA;

//Tipos de datos
tipodatoid: STRINGid | INTid | VOIDid | BOOLid | ARRAYid;

//Operadores lógicos
opLogico: AND | OR | MAYOR | MENOR | IGUALIGUAL | DISTINTO | MENORMAYOR;

//Operadores binarios
opBinario: MAYORMAYOR | MENORMAYOR | OROR | ANDAND;

//Operadores matemáticos
opMat: MAS MENOS MULTIPLICADO DIVIDIDO ELEVADO SQRT;