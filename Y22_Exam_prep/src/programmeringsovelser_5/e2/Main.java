package programmeringsovelser_5.e2;

import java.util.ArrayList;

public class Main {
  
  void go() {
    ArrayList<Beer> averagePriceOfBeer = new ArrayList<Beer>();
    averagePriceOfBeer.add(new Beer("Green", 30, 5));
    averagePriceOfBeer.add(new Beer("Red", 20, 4));
    averagePriceOfBeer.add(new Beer("Blue", 10, 3));
    
    int sum = beerPriceSum(averagePriceOfBeer);
    System.out.println(sum);
  }
  
  int beerPriceSum(ArrayList<Beer> beers) {
    int sum = 0;
    
    for (Beer beer : beers) {
      sum = sum + beer.getPrice();
    }
    
    return sum;
  }
  
  public static void main(String[] args) {
    new Main().go();
    
  }
}
