package programmeringsovelser_3.e7;

public class Names {
  private String firstName;
  private String middleName;
  private String lastName;
  
  public Names(String fullName) {
    String[] names = fullName.split(" ");
    
    // assign names
    if (names.length == 3) {
      firstName = names[0];
      middleName = names[1];
      lastName = names[2];
      
    } else if (names.length == 2) {
      firstName = names[0];
      middleName = null;
      lastName = names[1];
      
    } else {
      firstName = names[0];
      middleName = null;
      lastName = null;
    }
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getMiddleName() {
    return middleName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  @Override
  public String toString() {
    if (middleName == null && lastName == null) {
      return String.format("%s", firstName);
      
    } else if (middleName == null) {
      return String.format("%s %s", firstName, lastName);
      
    } else {
      return String.format("%s %s %s", firstName, middleName, lastName);
    }
  }
}
