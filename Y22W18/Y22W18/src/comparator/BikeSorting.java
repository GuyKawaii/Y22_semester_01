package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class BikeSorting {
  public static void main(String[] args) {
    new BikeSorting().go();
  }
  
  public void go() {
    BikeByNumber bikeByNumber = new BikeByNumber();
    
    ArrayList<Bike> bikes = new ArrayList<>();
    bikes.add(new Bike(2));
    bikes.add(new Bike(10));
    bikes.add(new Bike(1));
    bikes.add(new Bike(-1));
    bikes.add(new Bike(6));
    bikes.add(new Bike(4));
    bikes.add(new Bike(3));
  
    bikes.sort(bikeByNumber);
  
    System.out.println(bikes);
    
  }
  
  
}
