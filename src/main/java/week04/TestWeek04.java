package week04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestWeek04 {

  public static String readFromFile(String filePath) throws IOException {
    File file = new File(filePath);
    byte[] encoded = Files.readAllBytes(file.toPath());
    return new String(encoded);
  }

  public static void main(String[] args) throws IOException {
    Week04Lexer lexer = new Week04Lexer(CharStreams.fromString(readFromFile("D:\\Projects\\0Test\\SCI\\CS407Fall2023\\src\\main\\java\\week04\\in_week04.txt")));

    Week04Parser parser = new Week04Parser(new CommonTokenStream(lexer));

    parser.start();

    System.out.println("total number of tags is " + parser.getCnt());
  }
}
