package anki;

public class Compare implements Comparable<Compare> {
  private final int num;
  
  public Compare(int num) {
    this.num = num;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Compare other)
      return num == other.num;
    else
      return false;
  }
  
  public int getNum(){
    return num;
  }
  
  @Override
  public int compareTo(Compare other) {
    return num - other.num;
  }
  
  @Override
  public String toString() {
    return String.valueOf(num);
  }
}
