package comparable;

public class Bird implements Comparable<Bird> {
  private int num;
  
  public Bird(int num) {
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
  
  @Override
  public int compareTo(Bird other) {
    return this.num - other.num;
  }
}
