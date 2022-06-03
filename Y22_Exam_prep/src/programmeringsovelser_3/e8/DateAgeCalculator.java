package programmeringsovelser_3.e8;

public class DateAgeCalculator {
  private int yourAge;
  private int dateAge;
  
  public DateAgeCalculator(int yourAge, int dateAge) {
    setYourAge(yourAge);
    setDateAge(dateAge);
  }
  
  public void setYourAge(int yourAge) {
    this.yourAge = yourAge;
  }
  
  public void setDateAge(int dateAge) {
    this.dateAge = dateAge;
  }
  
  public int lowestDageAge() {
    return (yourAge / 2) + 7;
  }
  
  public boolean dateOldEnough() {
    return lowestDageAge() <= dateAge;
  }
  
}
