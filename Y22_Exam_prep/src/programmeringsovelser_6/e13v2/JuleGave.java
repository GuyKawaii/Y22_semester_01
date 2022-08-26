package programmeringsovelser_6.e13v2;

import java.util.Random;

public class JuleGave {
  private boolean isSoft;
  private boolean isRectangular;
  private boolean doesRattle;
  private Random random;
  
  public JuleGave() {
    random = new Random();
    
    setSoft(random.nextBoolean());
    setRectangular(random.nextBoolean());
    setDoesRattle(random.nextBoolean());
  }
  
  public boolean couldBeLego() {
    return !isSoft && isRectangular && doesRattle;
  }
  
  // getter setter default
  public void setSoft(boolean isSoft) {
    this.isSoft = isSoft;
  }
  
  public boolean isSoft() {
    return isSoft;
  }
  
  public void setRectangular(boolean isRectangular) {
    this.isRectangular = isRectangular;
  }
  
  public boolean isRectangular() {
    return isRectangular;
  }
  
  public void setDoesRattle(boolean doesRattle) {
    this.doesRattle = doesRattle;
  }
  
  public boolean doesRattle() {
    return doesRattle;
  }
}
