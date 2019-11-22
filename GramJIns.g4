grammar GramJIns;

prog: (linea NEWLINE)*;

/*INIT: 0, PUSH: 1, POP: 2, MOVRR: 3, MOVRM: 4, MOVMR: 5 */
/* END: 6, ADD: 7, SUB: 8, MUL: 9, DIV: 10, EXP: 11, SQRT: 12 */
/* MENQ: 13, MAYQ: 14, IGUAL: 15, NOIGUAL: 16, DIFBIT: 17 */
/* ANDBIT: 15, ORBIT: 16, LSHIFT: 17, RSHIFT: 18, AND: 19, OR: 20 */
/* MREG: 69 *SOLO EJEMPLO* */

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