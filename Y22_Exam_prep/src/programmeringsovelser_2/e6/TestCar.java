package programmeringsovelser_2.e6;

import programmeringsovelser_2.e5.TestCard;

public class TestCar {
  
  public void run() {
    Car car = new Car(1500);
    Trailer trailer = new Trailer(3000);
    
    try {
      car.setTrailer(trailer);
  
    } catch (LargeTrailerException e) {
      System.err.println(e);
    }
  }
  
  public static void main(String[] args) {
    new TestCar().run();
  }
}
