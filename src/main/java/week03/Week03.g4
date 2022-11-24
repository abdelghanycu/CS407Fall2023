grammar Week03;

@members {
  int cnt = 0;
}


stat
@init {
System.out.println("start the rule stat");
}
@after {
System.out.println("cnt = " + cnt);
} :
('hello' {cnt++;})+;

expr : expr '*' expr // match subexpressions joined with '*' operator
| expr '+' expr // match subexpressions joined with '+' operator
| INT // matches simple integer atom
;

INT: [0-9]+;


WS: ESC -> skip;
fragment ESC: [ \t\n];