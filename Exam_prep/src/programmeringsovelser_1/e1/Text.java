package programmeringsovelser_1.e1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Text {
  private ArrayList<String> lines;
  
  public Text() {
    lines = new ArrayList<>();
  }
  
  public void addLine(String line) {
    lines.add(line);
  }
  
  public int numberOfUniqueLines() {
//    Set<String> uniqueLines = new HashSet<>(lines);
    ArrayList<String> uniqueLines = new ArrayList<>();
    
    for (String line :lines) {
      if (!uniqueLines.contains(line)) {
        uniqueLines.add(line);
      }
    }
    
    
    return uniqueLines.size();
  }
  
}
