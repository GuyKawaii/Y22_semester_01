package programmeringsovelser_1.e3;

import java.util.Random;

public class RaffleCup {
  private int numDice;
  private int[] dice;
  private Random random;
  
  public RaffleCup(int numDice) {
    setNumDice(numDice);
    
    dice = new int[numDice];
    random = new Random();
  }
  
  public void setNumDice(int numDice) {
    this.numDice = numDice;
  }
  
  public int Shake() {
    int total = 0;
    
    for (int i = 0; i < numDice; i++) {
      dice[i] = random.nextInt(6) + 1;
      total += dice[i];
    }
    
    return total;
  }
  
  public int see() {
    int total = 0;
    
    for (int die : dice) total += die;
    
    return total;
  }
  
}
