package programmeringsovelser_5.e2;

public class Beer {
  
  private String name;
  private int alcoholPercentage;
  private int price;
  
  public Beer(String name, int price, int alcoholPercentage) {
    this.name = name;
    setPrice(price);
    setAlcoholPercentage(alcoholPercentage);
  }
  
  void setAlcoholPercentage(int alcoholPercentage) {
    if (alcoholPercentage < 0 || 100 < alcoholPercentage) throw new InvalidPercentage("percentage is negative or above 100");
    
    this.alcoholPercentage = alcoholPercentage;
  }
  
  void setPrice(int price) {
    if (price < 0) throw new IllegalArgumentException("only positive prices allowed");
    this.price = price;
  }
  
  int getPrice() {
    return price;
  }
  
  
}
