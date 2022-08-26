package proveeksamen_19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
  
  public void run() {
    ArrayList<Dream> dreams = new ArrayList<>();
    dreams.add(new Dream(LocalDate.now(), 10,DreamType.DRY));
    dreams.add(new Dream(LocalDate.now().minusDays(2), 10,DreamType.DRY));
    dreams.add(new Dream(LocalDate.now().minusDays(1), 10,DreamType.DRY));
  
    Collections.sort(dreams);
  
    System.out.println(dreams);
    
    
  }
  
  public static void main(String[] args) {
    new Test().run();
  }
}
