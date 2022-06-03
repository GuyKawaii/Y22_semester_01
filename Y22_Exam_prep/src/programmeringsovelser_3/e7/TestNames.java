package programmeringsovelser_3.e7;

public class TestNames {
  public void run() {
    Names names1 = new Names("Daniel Alexander Dam");
    Names names2 = new Names("Daniel Dam");
  
    System.out.println(names1);
    System.out.println(names2);
  }
  
  public static void main(String[] args) {
    new TestNames().run();
  }
}
