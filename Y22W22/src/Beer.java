public class Beer {
  private String name;
  private int price;
  private int percent;
  
  public Beer(String name, int price, int percent) {
    setName(name);
    setPrice(price);
    setPercent(percent);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
  
  public void setPercent(int percent) {
    if (percent < 0 || 100 < percent) throw new IllegalArgumentException();
    
    this.percent = percent;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    
    else if (obj instanceof Beer) {
      Beer other = (Beer) obj;
      return this.name.equals(other.name) &&
             this.price == other.price &&
             this.percent == other.percent;
    
    } else
      return false;
  }
  
  
  @Override
  public String toString() {
    return String.format("%s price:%d %d%%", name, price, percent);
  }
}
