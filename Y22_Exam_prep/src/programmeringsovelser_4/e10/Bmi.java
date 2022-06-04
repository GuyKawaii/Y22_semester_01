package programmeringsovelser_4.e10;

public class Bmi {
  private int height;
  private int weight;
  
  public Bmi(int height, int weight) {
    setHeight(height);
    setWeight(weight);
  }
  
  public double calculateBMI() {
    return (double) weight / Math.pow(height, 2);
  }
  
  public boolean isUnderWeight() {
    return calculateBMI() < 18.5;
  }
  
  public boolean isOverWeight() {
    return 25 < calculateBMI();
  }
  
  public boolean isNormalWeight() {
    return 18.5 <= calculateBMI() && calculateBMI() <= 25;
  }
  
  public WeightClass getWeightClass() {
    if (isUnderWeight()) {
      return WeightClass.UNDER_NORMAL;
      
    } else if (isNormalWeight()) {
      return WeightClass.NORMAL;
      
    } else if (isOverWeight()) {
      return WeightClass.ABOVE_NORMAL;
      
    } else {
      throw new InvalidWeightClassException("Not valid WeightClass assignment");
    }
  }
  
  // default getter setter
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  public int getWeight() {
    return weight;
  }
  
  public void setHeight(int height) {
    this.height = height;
  }
  
  public int getHeight() {
    return height;
  }
}
