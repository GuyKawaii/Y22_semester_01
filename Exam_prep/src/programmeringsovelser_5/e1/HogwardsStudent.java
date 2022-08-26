package programmeringsovelser_5.e1;

public class HogwardsStudent {
  private String firstName;
  private String lastName;
  private House house;
  
  public HogwardsStudent(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public void setHouse(House house) {
    if (house == null) throw new IllegalArgumentException("house must be set");
    
    this.house = house;
  }
  
}
