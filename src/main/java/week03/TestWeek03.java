package week03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestWeek03 {


  public static String readFromFile(String filePath) throws IOException {
    File file = new File(filePath);
    byte[] encoded = Files.readAllBytes(file.toPath());
    return new String(encoded);
  }

  public static void main(String[] args) throws IOException {
    week03.Week03Lexer lexer = new week03.Week03Lexer(
        CharStreams.fromString(readFromFile("C:\\Users\\Abdelghany\\Documents\\in.txt")));
    week03.Week03Parser parser = new week03.Week03Parser(new CommonTokenStream(lexer));
    parser.stat();
  }
}
