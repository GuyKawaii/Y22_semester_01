package car_rental;

public class BenzinBil extends Bil {
  private int oktantal;
  private double kmPrL;
  
  public BenzinBil(String regNr, String brand, String model, int year, int numDoors, int oktantal, double kmPrL) {
    super(regNr, brand, model, year, numDoors);
    this.oktantal = oktantal;
    this.kmPrL = kmPrL;
  }
  
  public int getOktantal() {
    return oktantal;
  }
  
  public void setOktantal(int oktantal) {
    this.oktantal = oktantal;
  }
  
  public double getKmPrL() {
    return kmPrL;
  }
  
  public void setKmPrL(double kmPrL) {
    this.kmPrL = kmPrL;
  }
  
  public double beregnGrønEjerafgift() {
    double afgift = 0.0;
  
    // base - afgift
    if (kmPrL < 5) afgift = 10470;
    else if (kmPrL <= 10) afgift = 5500;
    else if (kmPrL <= 15) afgift = 2340;
    else if (kmPrL <= 20) afgift = 1050;
    else if (kmPrL <= 50) afgift = 330;
    
    return afgift;
  }
  
  @Override
  public String toString() {
    return "BenzinBil{" +
           "oktantal=" + oktantal +
           ", kmPrL=" + kmPrL +
           '}';
  }
}
