package programmeringsovelser_2.e5;

import extra.Cat;

public class Card {
  private int value;
  private Suit suit;
  
  
  public Card(int value, Suit suit) {
    setValue(value);
    setSuit(suit);
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  
  public void setSuit(Suit suit) {
    this.suit = suit;
  }
  
  public boolean beats(Card other) {
    int delta = this.value - other.value;
    
    // value only
    if (delta > 0) return true;
    else if (delta < 0) return false;

//    // suit and equal value
//    return this.suit.getValue() > other.suit.getValue();
    switch (suit) {
      case HEARTS -> {
        if (other.suit == Suit.HEARTS) return false;
        else return true;
      }
      case DIAMONDS -> {
        if (other.suit == Suit.DIAMONDS || other.suit == Suit.HEARTS) return false;
        else return true;
      }
      case CLUBS -> {
        if (other.suit == Suit.CLUBS || other.suit == Suit.DIAMONDS || other.suit == Suit.HEARTS) return false;
        else return true;
      }
      case SPADES -> {
        return false;
      }
    }
    
    return false;
  }
  
}
