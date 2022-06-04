package programmeringsovelser_4.e12;

public class TestUser {
  
  public void run() {
    User user1 = new User("Name last", "abcz0129");
    User user2 = new User("Name last");
  
    boolean isValid = user1.validUserID();
    
    System.out.println(isValid);
    System.out.println(user1.getUserID());
    System.out.println(user2.getUserID());
  }
  
  
  public static void main(String[] args) {
    new TestUser().run();
  }
}
