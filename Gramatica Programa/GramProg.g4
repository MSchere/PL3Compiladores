grammar GramProg;

//Parser

prog: (include|funcion)*;

include: INCLUDE ID FIN;

funcion: defineFuncion bloqueFuncion;

defineFuncion: FUNCION ID PI parametros? PD DPUNTO tipo;

parametros: declaracion (COMA declaracion)*;

bloqueFuncion: BEGIN bloqueCodigo END;

bucle: WHILE PI expr PD bloqueCodigoBucle;

bloqueCodigoBucle: (BEGIN bloqueCodigo END)|sentencia?;

ifex: IF PI expr PD bloqueCodigoIf;

bloqueCodigoIf: THEN bloqueCodigo (ELSE bloqueCodigo)? ENDIF;

forEx: defineFor bloqueCodigoBucle;

defineFor: FOR PI (declararYasignar|asignacion) FIN expr FIN expr PD;

bloqueCodigo: sentencia*;

sentencia:  (declararYasignar FIN)
            |(declaracion FIN)
            |(asignacion FIN)
            |bucle
            |ifex
            |forEx
            |devolver
            |(expr FIN)
            |FIN;

declararYasignar: tipo ID ASIG expr;

declaracion: tipo ID;

asignacion: ID ASIG expr;

devolver: DEVOLVER expr FIN;

llamadaFuncion: ID PI (expr (COMA expr)*)? PD;

tipo: (TIPO_NUMERO|TIPO_CADENA|TIPO_BOOL|TIPO_VOID) (CORCHIZ CORCHD)?;

expr:	llamadaFuncion
    |   expr (MUL|DIV|MOD) expr
    |   expr (INC| DEC)
    |	expr (SUM|REST) expr
    |   expr (MENQ|MAYQ|MENIG|MAYIG|IGUAL|DIF) expr
    |	NEG expr
    |	expr (AND|OR) expr
    |	PI expr PD
    |   CADENA
    |   numero
    |	ID
    ;

numero: INT|FLOAT;

//Lexer

//Comentarios

COMENTARIO  :   ('//' .*? '\n'
            |   '/*' .*? '*/'
            |   '/**' .*? '**/'
            |   '/***' .*? '***/')-> skip
            ;
            
//Keywords

INCLUDE: 'include';
FUNCION: 'function';
BEGIN: 'begin';
END: 'end';
DEVOLVER: 'return';
TIPO_NUMERO: 'numero';
TIPO_CADENA: 'cadena';
TIPO_BOOL: 'booleano';
TIPO_VOID: 'void';
WHILE: 'while';
IF: 'if';
THEN: 'then';
ENDIF:'endif';
ELSE: 'else';
FOR: 'for';

//Numeros y palabras

FLOAT: [0-9]+'.'[0-9]+;
INT: [0-9]+;
ID: [a-zA-Z][a-zA-Z_0-9]*;
CADENA: DCOMILLAS .*? DCOMILLAS;

//Caracteres

ESC: '\\'[btnr"\\];
ESPECIAL: ('á'|'é'|'í'|'ó'|'ú'|'Á'|'É'|'Í'|'Ó'|'Ú'|'ñ'|'Ñ');
ASIG: ':=';
PI: '(';
PD: ')';
CORCHIZ: '[';
CORCHD: ']';
FIN: ';';
WS: [ \t\r\n]+ ->skip;
PUNTO: '.';
DPUNTO: ':';
COMA: ',';
BARRAINV: '\\';
DCOMILLAS: '"';
INTERG: '?';

//Operadores

DIF: '!=';
IGUAL: '==';
MENIG: '<=';
MAYIG: '>=';
MAYQ: '>';
MENQ: '<';
NEG: '!';
AND: '&&';
OR: '||';
INC: '++';
DEC: '--';
SUM: '+';
REST: '-';
MUL: '*';
DIV: '/';
MOD: '%';