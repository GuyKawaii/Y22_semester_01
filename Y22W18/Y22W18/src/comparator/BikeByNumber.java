package comparator;

import java.util.Comparator;

public class BikeByNumber implements Comparator<Bike> {
  
  @Override
  public int compare(Bike o1, Bike o2) {
    return o1.getNum() - o2.getNum();
  }
  
  public void test() {
    System.out.println("lala");
  }
  
}
