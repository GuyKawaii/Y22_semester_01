import java.util.ArrayList;

public class BeerTest {
  public static void main(String[] args) {
    new BeerTest().go();
  }
  
  void go() {
    // create
    ArrayList<Beer> beers = new ArrayList<>();
    beers.add(new Beer("Green", 2147483647, 5));
    beers.add(new Beer("Nordic", 11, 20));
    beers.add(new Beer("Russian bear", 1, 45));
    
    Beer beer1 = new Beer("Green", 2147483647, 5);
    Beer beer2 = new Beer("Green", 2147483647, 5);
  
    System.out.println(beer1.equals(beer2));
    
    // print
    for (Beer b : beers) System.out.println(b);
  }
  
}
