grammar compiladores;
INT: 'int';
DOUBLE: 'double';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
PUNTOCOMA: ';';
COMA: ',';
IGUAL: '=';
PARENIZQ: '(';
PARENDER: ')';
LLAVEIZQ: '{';
LLAVEDER: '}';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMERO: [0-9]+ ('.' [0-9]+)?;
MAS: '+';
MENOS: '-';
MULT: '*';
DIV: '/';
WS: [ \t\r\n]+ -> skip;
COMPARACION: '<' | '>' | '==' | '!=' | '<=' | '>=';

programa: (instruccion)+;

instruccion: declaracion
    | asignacion
    | bucleWhile
    | estructuraIf
    | bucleFor
    | retorno
    | llamadaFuncion
    | declaracionFuncion;

declaracion: tipo listaDeclaradores PUNTOCOMA;

tipo: INT | DOUBLE;

listaDeclaradores: declarador (COMA declarador)*;

declarador: ID (IGUAL expresion)?;

asignacion: ID IGUAL expresion PUNTOCOMA;

expresion: expresionUnaria (operadorBinario expresionUnaria)*;

expresionUnaria: operadorUnario? termino;

operadorBinario: MAS | MENOS | MULT | DIV | COMPARACION;

operadorUnario: MENOS;

termino: ID
    | NUMERO
    | llamadaFuncion
    | PARENIZQ expresion PARENDER;

bucleWhile: WHILE PARENIZQ expresion PARENDER LLAVEIZQ programa LLAVEDER;

estructuraIf: IF PARENIZQ expresion PARENDER LLAVEIZQ programa LLAVEDER (ELSE LLAVEIZQ programa LLAVEDER)?;

bucleFor: FOR PARENIZQ forInit PUNTOCOMA expresion? PUNTOCOMA forUpdate? PARENDER LLAVEIZQ programa LLAVEDER;

forInit: declaracionSinPuntoComa | asignacionSinPuntoComa | ;

forUpdate: asignacionSinPuntoComa (COMA asignacionSinPuntoComa)*;

asignacionSinPuntoComa: ID IGUAL expresion;

declaracionSinPuntoComa: tipo listaDeclaradores;

retorno: RETURN expresion PUNTOCOMA;

llamadaFuncion: ID PARENIZQ listaArgumentos? PARENDER;

listaArgumentos: expresion (COMA expresion)*;

declaracionFuncion: tipo ID PARENIZQ listaParametros? PARENDER LLAVEIZQ programa LLAVEDER;

listaParametros: parametro (COMA parametro)*;

parametro: tipo ID;
