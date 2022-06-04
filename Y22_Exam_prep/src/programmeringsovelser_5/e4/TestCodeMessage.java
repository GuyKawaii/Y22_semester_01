package programmeringsovelser_5.e4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class TestCodeMessage {
  
  public void run() {
    CodeMessage message = new CodeMessage("ABC BCD ZAZA", 0);
    
    System.out.println(Arrays.toString(message.getCiphers()));
//    writeCodeMessageFile(message);
    readCodeMessage();
  }
  
  public void writeCodeMessageFile(CodeMessage message) {
    File file = new File("files\\message.txt");
    
    try {
      PrintStream fileOut = new PrintStream(file);
      
      for (int i = 0; i < message.getCiphers().length; i++) {
        fileOut.printf("%s;", message.getCiphers()[i]);
      }
      
      fileOut.close();
      
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    
    
  }
  
  public void readCodeMessage() {
    File file = new File("files\\message.txt");
    
    try {
      Scanner fileScanner = new Scanner(file);
      
      while (fileScanner.hasNextLine()) {
        Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
        while (lineScanner.hasNext()) {
          System.out.println("-> " + lineScanner.next());
        }
      }
      
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    
  }
  
  public static void main(String[] args) {
    new TestCodeMessage().run();
  }
}
