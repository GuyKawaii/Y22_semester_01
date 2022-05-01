package car_rental;

import java.util.ArrayList;

public class Garage {
  private ArrayList<Bil> biler;
  private String name;
  
  public Garage(String name) {
    this.name = name;
    this.biler = new ArrayList<>();
  }
  
  
  public void addCar(Bil bil) {
    biler.add(bil);
  }
  
  public double beregnGrønAfgiftForBilpark() {
    double total = 0.0;
    
    for (Bil bil : biler) {
      total += bil.beregnGrønEjerafgift();
    }
    
    return total;
  }
  
  @Override
  public String toString() {
    StringBuilder returnStr = new StringBuilder();
    
    returnStr.append(String.format("%s has: ", name));
    
    for (Bil bil : biler) {
      returnStr.append(bil.toString());
    }
    
    return returnStr.toString();
  }
}
