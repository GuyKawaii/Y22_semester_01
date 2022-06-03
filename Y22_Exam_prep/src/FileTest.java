import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileTest {
  public static void main(String[] args) {
//   new FileTest().go();
   new FileTest().writeFile();
  
  }
  
  void go() {
    try {
      File file = new File("test.csv");
      Scanner fileScanner = new Scanner(file); // line by line

      while (fileScanner.hasNext()) {
        Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
        while (lineScanner.hasNext()) {
          String token = lineScanner.next();
          System.out.println(token);
        }

      }
      
      
      
    } catch (Exception e) {
      System.err.println(e);
    }
  }
  
  void writeFile() {
    File file = new File("test\\out.txt");
//    file.mkdirs();
  
    try{
      PrintStream outFile = new PrintStream(file);
      outFile.println("one");
      outFile.println("two");
      outFile.println("three");
      
      outFile.close();
  
    } catch (IOException e) {
      System.err.println(e);
    } finally {
    
    }
    
    
  }
}
