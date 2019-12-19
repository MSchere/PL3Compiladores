grammar GramJIns;

prog: (tripleta NEWLINE)*;

/*  INIT: 0, PUSH: 1, POP: 2, MOVRR: 3, MOVRM: 4, MOVMR: 5
    END: 6, ADD: 7, SUB: 8, MUL: 9, DIV: 10, EXP: 11, SQRT: 12
    MENQ: 13, MAYQ: 14, IGUAL: 15, NOIGUAL: 16, DIFBIT: 17
    ANDBIT: 18, ORBIT: 19, LSHIFT: 20, RSHIFT: 21, AND: 22, OR: 23 
    JUMP: 24, COPIACADENA: 25, CONCAT: 26, EXTRAERCAD: 27
    GETCHARATPOS: 28, CAMBIACHAR: 29 MREG: 69 *SOLO EJEMPLO* */

tripleta: CI INT (COMA INT)? (COMA (INT|BOOL|CADENA|ARRAY))? CD;

//Palabras reservadas .
CI: '[';
CD: ']';
COM: '"';
LVI: '{';
LVD: '}';
COMA:',';
PUNTO: '.';

WS: [ \t]+ ->skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

//Elementos básicos.

INT: [0-9]+;
NEWLINE: [\r\n]+;
CADENA: COM .*? COM ;
BOOL: 'true'|'false';
fragment ESC:'\\'[btnr"\\] ;//[a-zA-Z0-9_ ]+;
ARRAY: LVI (INT(PUNTO INT)?|CADENA)?  (COMA|INT(PUNTO INT)?|CADENA)* LVD;
