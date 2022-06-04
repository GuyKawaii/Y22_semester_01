package programmeringsovelser_5.e1;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
  private String firstName;
  private String lastName;
  private House house;
  
  public HogwartsStudent(String firstName, String lastName, House house) {
    setFirstName(firstName);
    setLastName(lastName);
    setHouse(house);
  }
  
  @Override
  public int compareTo(HogwartsStudent other) {
    return lastName.compareTo(other.lastName);
  }
  
  public void setHouse(House house) {
    if (house == null) throw new IlligalHouseException("must assign house");
    
    this.house = house;
  }
  
  // default getter setter
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public House getHouse() {
    return house;
  }
  
  @Override
  public String toString() {
    return String.format("%s", lastName);
  }
}
