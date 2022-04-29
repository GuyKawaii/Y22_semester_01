package day3;

public class A {
  B b = new B();
  
  public boolean start() {
    b.doThis(10);
    
    callMe(20);
    
    return true;
  }
  
  
  public void callMe(int num) {
  }
}
