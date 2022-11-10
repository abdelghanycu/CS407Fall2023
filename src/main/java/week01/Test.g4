grammar Test;

start : 'hello' Name | code;

code : stat | forloop | ifcon | while | comment;

stat : type2 Name ('=' Num)? ';';

type2 : 'int' | 'double' | 'float' | 'short';

forloop: 'for' '(' stat2? ';' con? ';' changevalue? ')' '{' code* '}';

stat2 : type2 Name ('=' Num)?;


ifcon : 'if' '(' con ')' '{' code* '}';

con : (Num | Name) op (Num | Name);

op : '<' | '>' |  '<=' | '>=' | '==' | '!=';

changevalue : Name ('++' | '--') | ('++' | '--') Name;
comment: '//'.*;
while: 'while' '(' con ')' '{' code* '}';

Name : [A-Za-z]+;
Num : [0-9]+ ('.' [0-9]+)?;

//WD: '\n\r\t ' -> skip;