package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class BirdSorting {
  public static void main(String[] args) {
    new BirdSorting().go();
  }
  
  public void go() {
    ArrayList<Bird> birds = new ArrayList<>();
    birds.add(new Bird(2));
    birds.add(new Bird(10));
    birds.add(new Bird(1));
    birds.add(new Bird(-1));
    birds.add(new Bird(6));
    birds.add(new Bird(4));
    birds.add(new Bird(3));
    
    Collections.sort(birds);
  
    System.out.println(birds);
    
  }
  
  
}
