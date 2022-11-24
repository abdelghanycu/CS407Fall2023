grammar Week04;

@members {
  private int cnt = 0;
  public void incrCnt() {
    cnt++;
  }
  public int getCnt() {
      return cnt;
  }
}

start: tags;

tags
@init {
  incrCnt();
  System.out.println("Start tag number " + getCnt());
}
@after {
  System.out.println("Finish tag number");
}
: '<' ID '>' tags* '</' ID '>';

ID: [0-9a-zA-Z]+;


WS: ESC -> skip;
fragment ESC: [ \t\n\r];