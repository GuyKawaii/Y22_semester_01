package programmeringsovelser_6.e13v2;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class JuleGaveTest {
  
  public void run() {
    JuleGave juleGave1 = new JuleGave();
    JuleGave juleGave2 = new JuleGave();
    JuleGave juleGave3 = new JuleGave();
    JuleGave juleGave4 = new JuleGave();
    ArrayList<JuleGave> gifts = new ArrayList<>();
    gifts.add(juleGave1);
    gifts.add(juleGave2);
    gifts.add(juleGave3);
    gifts.add(juleGave4);
    
    
//    writeGifts(gifts);
    readGifts();
  }
  
  public void writeGifts(ArrayList<JuleGave> gifts) {
    File file = new File("files\\gifts.txt");
    
    try {
      PrintStream fileOut = new PrintStream(file);
      
      for (JuleGave gift : gifts) {
        fileOut.printf("%s;%s;%s;\n", gift.isSoft(), gift.isRectangular(), gift.doesRattle());
      }
      
      fileOut.close();
      
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  
  public void readGifts() {
    File file = new File("files\\gifts.txt");
  
    try {
      Scanner fileScanner = new Scanner(file);
      while (fileScanner.hasNextLine()) {
        Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
        while (lineScanner.hasNext()){
          System.out.printf("%-5s ", lineScanner.next());
        }
        System.out.println();
        
      }
  
    } catch (IOException e) {
      System.out.println(e);
    }
    
  }
  
  
  public static void main(String[] args) {
    new JuleGaveTest().run();
  }
}
