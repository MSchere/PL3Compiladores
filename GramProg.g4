grammar GramProg;
//Parser

prog: (include|funcion)* #progPrincipal;

include: INCLUDE ID FIN #incluir;

funcion: defineFuncion bloqueFuncion #func;

defineFuncion: FUNCION ID PI parametros? PD DPUNTO tipo #definirFunc;

parametros: declaracion (COMA declaracion)* #param;

bloqueFuncion: BEGIN bloqueCodigo END #bloqueFunc;


bucle: WHILE PI expr PD bloqueCodigoBucle #bucleWhile;


bloqueCodigoBucle: ((BEGIN bloqueCodigo END)|sentencia? )#bloqueBucleWhile;


ifex: IF PI expr PD bloqueCodigoIf #ifEex;


bloqueCodigoIf: THEN bloqueCodigo (ELSE bloqueCodigo)? ENDIF #bloqueBucleIf;

forEx: defineFor bloqueCodigoBucle #forEex;

defineFor: FOR PI (declararYasignar|asignacion) FIN expr FIN expr PD #definirFor;


bloqueCodigo: sentencia* #bloqueCod;


sentencia:  (declararYasignar FIN) 
            |(declaracion FIN) 
            |(asignacion FIN) 
            |bucle 
            |ifex
            |forEx
            |devolver
            |(expr FIN)
            |FIN;


declararYasignar: tipo ID ASIG expr #declararYasign;


declaracion: tipo ID #declarar;


asignacion: ID ASIG expr #asignar;

devolver: DEVOLVER expr FIN #devolv;


llamadaFuncion: ID PI (expr (COMA expr)*)? PD #llamadaFunc;

tipo: (TIPO_NUMERO|TIPO_CADENA|TIPO_BOOL|TIPO_VOID) (CORCHIZ CORCHD)? #tip;

expr:	llamadaFuncion #llamafuncion
    |	PI expr PD #parentesis
    |	NEG expr #neg
    |	expr (AND|OR) expr #and
    |   expr (MUL|DIV) expr #mul
    |   expr (INC| DEC) #inc
    |	expr (SUM|REST) expr #suma
    |   expr (MENQ|MAYQ|MENIG|MAYIG|IGUAL|DIF) expr #comp
    |   BOOL #bool
    |   CADENA #cadena
    |   numero #num
    |	ID #id
    ;


numero: INT|FLOAT #num;
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
BOOL: 'true'|'false';
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