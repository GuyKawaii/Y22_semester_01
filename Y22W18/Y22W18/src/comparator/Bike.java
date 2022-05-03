package comparator;

public class Bike {
  private int num;
  
  public Bike(int num) {
    this.num = num;
  }
  
  public int getNum() {
    return num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
  
  @Override
  public String toString() {
    return String.format("%s", num);
  }
}
