package programmeringsovelser_2.e5;

public class TestCard {
  void go() {
    Card c1 = new Card(2, Suit.HEARTS);
    Card c2 = new Card(2, Suit.DIAMONDS);
    Card c3 = new Card(2, Suit.CLUBS);
    Card c4 = new Card(2, Suit.SPADES);
  
  
    System.out.println(c1.beats(c2));
    
  }
  
  
  public static void main(String[] args) {
    new TestCard().go();
  }
}
