package programmeringsovelser_6.e13;

import java.util.Random;

public class JuleGave {
  private boolean isSoft;
  private boolean isRectangular;
  private boolean doesRattle;
  private Random random;
  
  public JuleGave() {
    random = new Random();
    // assign
    isSoft = random.nextBoolean();
    isRectangular = random.nextBoolean();
    doesRattle = random.nextBoolean();
  }
  
  boolean couldBeLego() {
    if (!isSoft && isRectangular && doesRattle) return true;
    else return false;
  }
  
}
