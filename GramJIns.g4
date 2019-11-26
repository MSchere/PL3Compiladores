grammar GramJIns;

prog: (linea NEWLINE)*;

/*  INIT: 0, PUSH: 1, POP: 2, MOVRR: 3, MOVRM: 4, MOVMR: 5
    END: 6, ADD: 7, SUB: 8, MUL: 9, DIV: 10, EXP: 11, SQRT: 12
    MENQ: 13, MAYQ: 14, IGUAL: 15, NOIGUAL: 16, DIFBIT: 17
    ANDBIT: 18, ORBIT: 19, LSHIFT: 20, RSHIFT: 21, AND: 22, OR: 23 
    JUMP: 24, COPIACADENA: 25, CONCAT: 26, EXTRAERCAD: 27
    GETCHARATPOS: 28, CAMBIACHAR: 29 MREG: 69 *SOLO EJEMPLO* */

linea: CI INT COMA expr (COMA expr)? CD;

expr: VAR
    | INT
    ;

//Palabras reservadas .
CI: '[';
CD: ']';

WS: [ \t]+ ->skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

//Elementos básicos.

INT: [0-9]+;
NEWLINE: [\r\n]+;
COMA:',';
VAR: (ID_LETRA|DIGITO|SUM|RES)+;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment SUM: '+';
fragment RES: '-';