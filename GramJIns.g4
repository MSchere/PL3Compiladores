grammar GramJIns;

prog: (linea NEWLINE|endex)*;


linea: (initex|pushex|addex|movex);

/*INIT: 0, PUSH: 1, POP: 2, MOV: 3, ADD: 4,  */

initex: '0' expr;
pushex: '1' expr;
popex: '2' expr;
movex: '3' expr;
addex: '4' expr;
endex: END;

expr: expr COMA expr
    | ID
    | INT
    ;

//Palabras reservadas.
INIT: 'INIT';
PUSH: 'PUSH';
ADD: 'ADD';
MOV: 'MOV';
END: 'END';

WS: [ \t]+ ->skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

//Elementos básicos.

INT:[0-9]+;
NEWLINE: [\r\n]+;
COMA:',';
ID: (ID_LETRA|DIGITO)+;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
