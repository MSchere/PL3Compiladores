grammar GramJIns;

prog: (linea NEWLINE|endex)*;


linea: (initex|pushex|addex|movex);

initex: NUML INIT expr;
pushex: NUML PUSH expr;
addex: NUML ADD expr;
movex: NUML MOV expr;
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

//Elementos básicos.

NUML:INT;
INT:[0-9]+;
NEWLINE: [\r\n]+;
COMA:',';
ID: (ID_LETRA|DIGITO)+;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
