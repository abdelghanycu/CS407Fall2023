package week01;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainTest {

  public static void main(String[] args) {
//    TestLexer lexer = new TestLexer(CharStreams.fromString("hello abdelghany"));
//    TestParser parser = new TestParser(new CommonTokenStream(lexer));
//    parser.start();

    TestLexer lexer2 = new TestLexer(CharStreams.fromString("hello hello hello"));
    TestParser parser2 = new TestParser(new CommonTokenStream(lexer2));
    parser2.init();
    System.out.println("from main method cnt = " + parser2.cnt);
  }
}
