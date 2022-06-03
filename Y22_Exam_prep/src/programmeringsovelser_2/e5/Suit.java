package programmeringsovelser_2.e5;

public enum Suit {
  HEARTS(4),
  DIAMONDS(3),
  CLUBS(2),
  SPADES(1);
  
  private final int value;
  
  Suit(int value) {
   this.value = value;
  }
  
  public int getValue() {
    return value;
  }
}
