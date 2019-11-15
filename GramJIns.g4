grammar GramJIns;

prog: (linea NEWLINE|endex)*;


linea: (initex|pushex|addex|movex);

/*INIT: 0, PUSH: 1, POP: 2, MOV: 3, ADD: 4*/

initex: INIT expr;
pushex: PUSH expr;
popex: POP expr;
movex: MOV expr;
addex: ADD expr;
endex: END;

expr: PI expr COMA expr PD
    | PI expr PD
    | ID
    | VALOR
    | TIPO
    ;

//Palabras reservadas.
INIT: '0';
PUSH: '1';
POP: '2';
MOV: '3';
ADD: '4';
END: 'END';
PI: '(';
PD: ')';

WS: [ \t]+ ->skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

//Elementos básicos.

TIPO: 't'[0-9]+;
VALOR: 'v'[0-9]+;
NEWLINE: [\r\n]+;
COMA:',';
ID: (ID_LETRA|DIGITO|SUM|RES)+;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment SUM: '+';
fragment RES: '-';

