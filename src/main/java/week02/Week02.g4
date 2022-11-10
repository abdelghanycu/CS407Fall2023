grammar Week02;

init: 'hello' ID | code;

code: stat | comment;

stat: TypeValue ID ('=' Num)? ';';

TypeValue: 'int' | 'double';

comment: '//' .*;

ID: [a-zA-Z]+;
Num: [0-9]+;