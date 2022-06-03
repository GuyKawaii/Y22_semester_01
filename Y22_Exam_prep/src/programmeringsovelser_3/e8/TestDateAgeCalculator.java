package programmeringsovelser_3.e8;

public class TestDateAgeCalculator {
  public void run() {
    DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(30, 18);
    System.out.println(dateAgeCalculator.lowestDageAge());
    System.out.println(dateAgeCalculator.dateOldEnough());
  }
  
  public static void main(String[] args) {
    new TestDateAgeCalculator().run();
  }
}
