package programmeringsovelser_5.e1;

import java.util.Scanner;

public class HouseTest {
  public static void main(String[] args) {
    HogwardsStudent student = new HogwardsStudent("A", "B");
    student.setHouse(House.GRIFFENDOR);
  
    Scanner scanner = new Scanner(System.in);
    House house = House.valueOf(scanner.nextLine().toUpperCase());
    
    
  }
}
