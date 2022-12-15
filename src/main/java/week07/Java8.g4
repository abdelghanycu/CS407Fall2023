grammar Java8;

compilationUnit: classDef;

classDef: 'class' Id '{' method* '}';
method: MethodIditifer? Static? returnType Id '(' params? ')' '{' returnStat? '}';


returnStat: 'return' (Id | value) Semicolon;
params: param (',' param)*;
param: Type Id;
MethodIditifer: 'public' | 'private' | 'protected';
returnType: Id | Type | 'void';
Type: 'int' | 'double' | 'long' | 'float' | 'String';
Static: 'static';
Id: ('a'..'z' | 'A'..'Z' | '_' | '$')+ ('a'..'z' | 'A'..'Z' | '_' | '$' | '0'..'9')*;//


value: number | StringType;
number: Integer | doubleType;
doubleType: Integer '.' Integer;
Integer: ('0'..'9')+;
StringType: '"' ~('"')* '"';
Semicolon: ';';
WS: ESC+ -> skip;
fragment ESC: [ \t\n\r];