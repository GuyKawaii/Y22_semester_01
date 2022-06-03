package programmeringsovelser_5.e3;

import java.util.ArrayList;

public class Users {
  private int maxId;
  private ArrayList<User> users;
  
  public Users() {
    users = new ArrayList<>();
    maxId = 0;
  }
  
  
  void addUser(String userName, Role role) {
    users.add(new User(userName, createId(), role));
  }
  
  ArrayList<User> getUsers() {
    return users;
  }
  
  int createId() {
    return maxId++;
  }
  
  ArrayList<User> getRole(Role role) {
    ArrayList<User> roleUsers = new ArrayList<>();
    
    for (User u: users) {
      if (u.getRole() == role) roleUsers.add(u);
    }
    
    return roleUsers;
  }
}
