package programmeringsovelser_4.e12;

import java.util.Random;

public class User {
  private String fullName;
  private String userID;
  private final Random random;
  
  public User(String fullName) {
    random = new Random();
    
    setFullName(fullName);
    createUserID();
  }
  
  public User(String fullName, String userID) {
    random = new Random();
    setFullName(fullName);
    setUserID(userID);
  }
  
  public void createUserID() {
    String[] names = fullName.split(" ", 2);
    StringBuilder buildUserID = new StringBuilder();
    
    // letters
    buildUserID.append(names[0].substring(0, 2));
    buildUserID.append(names[1].substring(0, 2));
    
    // numbers
    for (int i = 0; i < 4; i++) {
      buildUserID.append(random.nextInt(9));
    }
    
    userID = buildUserID.toString();
  }
  
  public boolean validUserID() {
    if (userID.length() != 8) return false;
    
    char[] charsNumbers = userID.substring(4).toCharArray();
    char[] charsLetters = userID.substring(0, 4).toCharArray();
    
    // letters
    for (Character c : charsLetters) {
      if ('a' > c || c > 'z') return false;
    }
    
    // numbers
    for (Character c : charsNumbers) {
      if ('0' > c || c > '9') return false;
    }
    
    return true;
  }
  
  // getter setter
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  
  public String getFullName() {
    return fullName;
  }
  
  public void setUserID(String userID) {
    this.userID = userID;
  }
  
  public String getUserID() {
    return userID;
  }
}
