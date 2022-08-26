package programmeringsovelser_5.e3;

public class User {
  private String userName;
  private int userid;
  private Role role;
  
  public User(String userName, int userid, Role role) {
    setUserName(userName);
    setUserid(userid);
    setRole(role);
  }
  
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public void setUserid(int userid) {
    this.userid = userid;
  }
  
  public void setRole(Role role) {
    this.role = role;
  }
  
  public Role getRole() {
    return role;
  }
}
